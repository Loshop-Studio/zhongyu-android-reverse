.class public final Landroidx/compose/material/icons/automirrored/rounded/ArrowRightAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _arrowRightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getArrowRightAlt(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/ArrowRightAltKt;->_arrowRightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "AutoMirrored.Rounded.ArrowRightAlt"

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
    const/4 v10, 0x1

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
    const v0, 0x4180147b    # 16.01f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40a00000    # 5.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v13, -0x40f33333    # -0.55f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const/high16 v15, -0x40800000    # -1.0f

    .line 92
    .line 93
    const v16, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3ee66666    # 0.45f

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x3f800000    # 1.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v4, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x413028f6    # 11.01f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x3fe51eb8    # 1.79f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3f59999a    # 0.85f

    .line 120
    .line 121
    .line 122
    const v18, 0x3eb33333    # 0.35f

    .line 123
    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const v14, 0x3ee66666    # 0.45f

    .line 127
    .line 128
    .line 129
    const v15, 0x3f0a3d71    # 0.54f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f2b851f    # 0.67f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x4031eb85    # 2.78f

    .line 139
    .line 140
    .line 141
    const v4, -0x3fcd70a4    # -2.79f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const v18, -0x40ca3d71    # -0.71f

    .line 150
    .line 151
    .line 152
    const v13, 0x3e428f5c    # 0.19f

    .line 153
    .line 154
    .line 155
    const v14, -0x41b33333    # -0.2f

    .line 156
    .line 157
    .line 158
    const v15, 0x3e428f5c    # 0.19f

    .line 159
    .line 160
    .line 161
    const v16, -0x40fd70a4    # -0.51f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x3fce147b    # -2.78f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, -0x40a66666    # -0.85f

    .line 174
    .line 175
    .line 176
    const v18, 0x3eb33333    # 0.35f

    .line 177
    .line 178
    .line 179
    const v13, -0x416147ae    # -0.31f

    .line 180
    .line 181
    .line 182
    const v14, -0x415c28f6    # -0.32f

    .line 183
    .line 184
    .line 185
    const v15, -0x40a66666    # -0.85f

    .line 186
    .line 187
    .line 188
    const v16, -0x4247ae14    # -0.09f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/16 v16, 0x3800

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const-string v4, ""

    .line 209
    .line 210
    const/high16 v6, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/high16 v8, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v9, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/high16 v12, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/ArrowRightAltKt;->_arrowRightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v0
.end method

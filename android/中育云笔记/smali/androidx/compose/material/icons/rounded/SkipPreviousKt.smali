.class public final Landroidx/compose/material/icons/rounded/SkipPreviousKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _skipPrevious:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSkipPrevious(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SkipPreviousKt;->_skipPrevious:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SkipPrevious"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x41200000    # 10.0f

    .line 94
    .line 95
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, -0x40800000    # -1.0f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x3f0ccccd    # 0.55f

    .line 102
    .line 103
    .line 104
    const v15, -0x4119999a    # -0.45f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x3f800000    # 1.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, -0x4119999a    # -0.45f

    .line 113
    .line 114
    .line 115
    const/high16 v6, -0x40800000    # -1.0f

    .line 116
    .line 117
    invoke-virtual {v12, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v17, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const/high16 v18, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v14, -0x40f33333    # -0.55f

    .line 128
    .line 129
    .line 130
    const v15, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v16, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x412a8f5c    # 10.66f

    .line 142
    .line 143
    .line 144
    const v2, 0x414d1eb8    # 12.82f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x40b8a3d7    # 5.77f

    .line 151
    .line 152
    .line 153
    const v2, 0x40823d71    # 4.07f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x3fca3d71    # 1.58f

    .line 160
    .line 161
    .line 162
    const v18, -0x40ae147b    # -0.82f

    .line 163
    .line 164
    .line 165
    const v13, 0x3f28f5c3    # 0.66f

    .line 166
    .line 167
    .line 168
    const v14, 0x3ef0a3d7    # 0.47f

    .line 169
    .line 170
    .line 171
    const v15, 0x3fca3d71    # 1.58f

    .line 172
    .line 173
    .line 174
    const v16, -0x43dc28f6    # -0.01f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x4190147b    # 18.01f

    .line 181
    .line 182
    .line 183
    const v4, 0x40fdc28f    # 7.93f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x4035c28f    # -1.58f

    .line 190
    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const v14, -0x40b0a3d7    # -0.81f

    .line 194
    .line 195
    .line 196
    const v15, -0x40970a3d    # -0.91f

    .line 197
    .line 198
    .line 199
    const v16, -0x405c28f6    # -1.28f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x3f475c29    # -5.77f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v18, 0x3fd1eb85    # 1.64f

    .line 214
    .line 215
    .line 216
    const v13, -0x40ee147b    # -0.57f

    .line 217
    .line 218
    .line 219
    const v14, 0x3ecccccd    # 0.4f

    .line 220
    .line 221
    .line 222
    const v15, -0x40ee147b    # -0.57f

    .line 223
    .line 224
    .line 225
    const v16, 0x3f9eb852    # 1.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    const/16 v16, 0x3800

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const-string v4, ""

    .line 243
    .line 244
    const/high16 v6, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v8, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v9, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v12, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    sput-object v0, Landroidx/compose/material/icons/rounded/SkipPreviousKt;->_skipPrevious:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 265
    .line 266
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-object v0
.end method

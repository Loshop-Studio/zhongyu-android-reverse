.class public final Landroidx/compose/material/icons/rounded/MusicNoteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _musicNote:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMusicNote(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MusicNoteKt;->_musicNote:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MusicNote"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x4108cccd    # 8.55f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3faae148    # -3.33f

    .line 84
    .line 85
    .line 86
    const v18, -0x415c28f6    # -0.32f

    .line 87
    .line 88
    .line 89
    const v13, -0x408f5c29    # -0.94f

    .line 90
    .line 91
    .line 92
    const v14, -0x40f5c28f    # -0.54f

    .line 93
    .line 94
    .line 95
    const v15, -0x3ff9999a    # -2.1f

    .line 96
    .line 97
    .line 98
    const/high16 v16, -0x40c00000    # -0.75f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, -0x3fd8f5c3    # -2.61f

    .line 104
    .line 105
    .line 106
    const v18, 0x40447ae1    # 3.07f

    .line 107
    .line 108
    .line 109
    const v13, -0x40547ae1    # -1.34f

    .line 110
    .line 111
    .line 112
    const v14, 0x3ef5c28f    # 0.48f

    .line 113
    .line 114
    .line 115
    const v15, -0x3fe851ec    # -2.37f

    .line 116
    .line 117
    .line 118
    const v16, 0x3fd5c28f    # 1.67f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, 0x4092e148    # 4.59f

    .line 125
    .line 126
    .line 127
    const v18, 0x4094cccd    # 4.65f

    .line 128
    .line 129
    .line 130
    const v13, -0x41147ae1    # -0.46f

    .line 131
    .line 132
    .line 133
    const v14, 0x402f5c29    # 2.74f

    .line 134
    .line 135
    .line 136
    const v15, 0x3fee147b    # 1.86f

    .line 137
    .line 138
    .line 139
    const v16, 0x40a28f5c    # 5.08f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x40566666    # 3.35f

    .line 146
    .line 147
    .line 148
    const v18, -0x3f7ccccd    # -4.1f

    .line 149
    .line 150
    .line 151
    const v13, 0x3ffae148    # 1.96f

    .line 152
    .line 153
    .line 154
    const v14, -0x416147ae    # -0.31f

    .line 155
    .line 156
    .line 157
    const v15, 0x40566666    # 3.35f

    .line 158
    .line 159
    .line 160
    const v16, -0x3ff8f5c3    # -2.11f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40e00000    # 7.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40000000    # 2.0f

    .line 177
    .line 178
    const/high16 v18, -0x40000000    # -2.0f

    .line 179
    .line 180
    const v13, 0x3f8ccccd    # 1.1f

    .line 181
    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/high16 v15, 0x40000000    # 2.0f

    .line 185
    .line 186
    const v16, -0x4099999a    # -0.9f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, -0x4099999a    # -0.9f

    .line 193
    .line 194
    .line 195
    const/high16 v2, -0x40000000    # -2.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v17, -0x40000000    # -2.0f

    .line 204
    .line 205
    const/high16 v18, 0x40000000    # 2.0f

    .line 206
    .line 207
    const v13, -0x40733333    # -1.1f

    .line 208
    .line 209
    .line 210
    const/high16 v15, -0x40000000    # -2.0f

    .line 211
    .line 212
    const v16, 0x3f666666    # 0.9f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v16, 0x3800

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const-string v4, ""

    .line 230
    .line 231
    const/high16 v6, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/high16 v8, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v9, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/high16 v12, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const/4 v15, 0x0

    .line 242
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sput-object v0, Landroidx/compose/material/icons/rounded/MusicNoteKt;->_musicNote:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 251
    .line 252
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    return-object v0
.end method

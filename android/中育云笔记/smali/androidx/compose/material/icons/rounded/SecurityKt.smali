.class public final Landroidx/compose/material/icons/rounded/SecurityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _security:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSecurity(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SecurityKt;->_security:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Security"

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
    const v0, 0x41330a3d    # 11.19f

    .line 71
    .line 72
    .line 73
    const v2, 0x3fae147b    # 1.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40470a3d    # 3.11f

    .line 80
    .line 81
    .line 82
    const/high16 v2, -0x3f200000    # -7.0f

    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x40400000    # 3.0f

    .line 88
    .line 89
    const v18, 0x40c9999a    # 6.3f

    .line 90
    .line 91
    .line 92
    const v13, 0x405e147b    # 3.47f

    .line 93
    .line 94
    .line 95
    const v14, 0x409947ae    # 4.79f

    .line 96
    .line 97
    .line 98
    const/high16 v15, 0x40400000    # 3.0f

    .line 99
    .line 100
    const v16, 0x40b051ec    # 5.51f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41300000    # 11.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x41100000    # 9.0f

    .line 112
    .line 113
    const/high16 v18, 0x41400000    # 12.0f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, 0x40b1999a    # 5.55f

    .line 117
    .line 118
    .line 119
    const v15, 0x4075c28f    # 3.84f

    .line 120
    .line 121
    .line 122
    const v16, 0x412bd70a    # 10.74f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v18, -0x3ec00000    # -12.0f

    .line 129
    .line 130
    const v13, 0x40a51eb8    # 5.16f

    .line 131
    .line 132
    .line 133
    const v14, -0x405eb852    # -1.26f

    .line 134
    .line 135
    .line 136
    const/high16 v15, 0x41100000    # 9.0f

    .line 137
    .line 138
    const v16, -0x3f31999a    # -6.45f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x40c9999a    # 6.3f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, -0x4067ae14    # -1.19f

    .line 151
    .line 152
    .line 153
    const v18, -0x4015c28f    # -1.83f

    .line 154
    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, -0x40b5c28f    # -0.79f

    .line 158
    .line 159
    .line 160
    const v15, -0x410f5c29    # -0.47f

    .line 161
    .line 162
    .line 163
    const v16, -0x403eb852    # -1.51f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, -0x3fb8f5c3    # -3.11f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x4030a3d7    # -1.62f

    .line 176
    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const v13, -0x40fd70a4    # -0.51f

    .line 181
    .line 182
    .line 183
    const v14, -0x41947ae1    # -0.23f

    .line 184
    .line 185
    .line 186
    const v15, -0x4071eb85    # -1.11f

    .line 187
    .line 188
    .line 189
    const v16, -0x41947ae1    # -0.23f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v2, 0x413fd70a    # 11.99f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x41400000    # 12.0f

    .line 202
    .line 203
    invoke-virtual {v12, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v2, 0x40e00000    # 7.0f

    .line 207
    .line 208
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x3f200000    # -7.0f

    .line 212
    .line 213
    const v18, 0x410f0a3d    # 8.94f

    .line 214
    .line 215
    .line 216
    const v13, -0x40f851ec    # -0.53f

    .line 217
    .line 218
    .line 219
    const v14, 0x4083d70a    # 4.12f

    .line 220
    .line 221
    .line 222
    const v15, -0x3fae147b    # -3.28f

    .line 223
    .line 224
    .line 225
    const v16, 0x40f947ae    # 7.79f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v6, 0x40a00000    # 5.0f

    .line 235
    .line 236
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x410ccccd    # 8.8f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const/16 v16, 0x3800

    .line 259
    .line 260
    const/16 v17, 0x0

    .line 261
    .line 262
    const-string v4, ""

    .line 263
    .line 264
    const/high16 v6, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/4 v7, 0x0

    .line 267
    const/high16 v8, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v9, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/high16 v12, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v14, 0x0

    .line 275
    const/4 v15, 0x0

    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    sput-object v0, Landroidx/compose/material/icons/rounded/SecurityKt;->_security:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 285
    .line 286
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-object v0
.end method

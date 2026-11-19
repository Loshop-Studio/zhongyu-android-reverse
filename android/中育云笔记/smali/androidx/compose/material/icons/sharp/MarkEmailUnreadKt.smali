.class public final Landroidx/compose/material/icons/sharp/MarkEmailUnreadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _markEmailUnread:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMarkEmailUnread(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MarkEmailUnreadKt;->_markEmailUnread:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.MarkEmailUnread"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const v2, 0x410fae14    # 8.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41a00000    # 20.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40000000    # 2.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v2, 0x40800000    # 4.0f

    .line 89
    .line 90
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x4141999a    # 12.1f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x41600000    # 14.0f

    .line 100
    .line 101
    const/high16 v18, 0x40a00000    # 5.0f

    .line 102
    .line 103
    const v13, 0x4160a3d7    # 14.04f

    .line 104
    .line 105
    .line 106
    const v14, 0x408a3d71    # 4.32f

    .line 107
    .line 108
    .line 109
    const/high16 v15, 0x41600000    # 14.0f

    .line 110
    .line 111
    const v16, 0x40951eb8    # 4.66f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3fd5c28f    # 1.67f

    .line 118
    .line 119
    .line 120
    const v18, 0x406d70a4    # 3.71f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, 0x3fbd70a4    # 1.48f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f266666    # 0.65f

    .line 128
    .line 129
    .line 130
    const v16, 0x40328f5c    # 2.79f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41400000    # 12.0f

    .line 137
    .line 138
    const/high16 v6, 0x41300000    # 11.0f

    .line 139
    .line 140
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x41000000    # 8.0f

    .line 152
    .line 153
    const/high16 v2, 0x40a00000    # 5.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x40a9999a    # 5.3f

    .line 159
    .line 160
    .line 161
    const v4, -0x3fab851f    # -3.32f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, 0x41980000    # 19.0f

    .line 168
    .line 169
    const/high16 v18, 0x41200000    # 10.0f

    .line 170
    .line 171
    const v13, 0x418eb852    # 17.84f

    .line 172
    .line 173
    .line 174
    const v14, 0x411e147b    # 9.88f

    .line 175
    .line 176
    .line 177
    const v15, 0x41933333    # 18.4f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x41200000    # 10.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, 0x41b00000    # 22.0f

    .line 186
    .line 187
    const v18, 0x410fae14    # 8.98f

    .line 188
    .line 189
    .line 190
    const v13, 0x41a10a3d    # 20.13f

    .line 191
    .line 192
    .line 193
    const/high16 v14, 0x41200000    # 10.0f

    .line 194
    .line 195
    const v15, 0x41a947ae    # 21.16f

    .line 196
    .line 197
    .line 198
    const v16, 0x4119c28f    # 9.61f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41800000    # 16.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x40400000    # 3.0f

    .line 213
    .line 214
    const/high16 v18, 0x40400000    # 3.0f

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    const v14, 0x3fd47ae1    # 1.66f

    .line 218
    .line 219
    .line 220
    const v15, 0x3fab851f    # 1.34f

    .line 221
    .line 222
    .line 223
    const/high16 v16, 0x40400000    # 3.0f

    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x40400000    # 3.0f

    .line 229
    .line 230
    const v6, -0x40547ae1    # -1.34f

    .line 231
    .line 232
    .line 233
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 234
    .line 235
    invoke-virtual {v12, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v6, v7, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x4055c28f    # 3.34f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const/16 v16, 0x3800

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const-string v4, ""

    .line 259
    .line 260
    const/high16 v6, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const/high16 v8, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/high16 v9, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/high16 v12, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const/4 v15, 0x0

    .line 271
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Landroidx/compose/material/icons/sharp/MarkEmailUnreadKt;->_markEmailUnread:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 280
    .line 281
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v0
.end method

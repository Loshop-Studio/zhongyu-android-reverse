.class public final Landroidx/compose/material/icons/rounded/TrendingUpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _trendingUp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTrendingUp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TrendingUpKt;->_trendingUp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TrendingUp"

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
    const v0, 0x4186cccd    # 16.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x40db3333    # 6.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fb851ec    # 1.44f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v2, -0x3f63d70a    # -4.88f

    .line 86
    .line 87
    .line 88
    const v4, 0x409c28f6    # 4.88f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v2, -0x3fad70a4    # -3.29f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x404b851f    # -1.41f

    .line 101
    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const v13, -0x413851ec    # -0.39f

    .line 106
    .line 107
    .line 108
    const v14, -0x413851ec    # -0.39f

    .line 109
    .line 110
    .line 111
    const v15, -0x407d70a4    # -1.02f

    .line 112
    .line 113
    .line 114
    const v16, -0x413851ec    # -0.39f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v2, -0x3f400000    # -6.0f

    .line 121
    .line 122
    const v4, 0x40c051ec    # 6.01f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const v18, 0x3fb47ae1    # 1.41f

    .line 131
    .line 132
    .line 133
    const v14, 0x3ec7ae14    # 0.39f

    .line 134
    .line 135
    .line 136
    const v15, -0x413851ec    # -0.39f

    .line 137
    .line 138
    .line 139
    const v16, 0x3f828f5c    # 1.02f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3fb47ae1    # 1.41f

    .line 146
    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const v13, 0x3ec7ae14    # 0.39f

    .line 151
    .line 152
    .line 153
    const v15, 0x3f828f5c    # 1.02f

    .line 154
    .line 155
    .line 156
    const v16, 0x3ec7ae14    # 0.39f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v2, 0x41168f5c    # 9.41f

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41400000    # 12.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v2, 0x40528f5c    # 3.29f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v2, 0x40b2e148    # 5.59f

    .line 180
    .line 181
    .line 182
    const v4, -0x3f4d70a4    # -5.58f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3f59999a    # 0.85f

    .line 192
    .line 193
    .line 194
    const v18, -0x414ccccd    # -0.35f

    .line 195
    .line 196
    .line 197
    const v13, 0x3e9eb852    # 0.31f

    .line 198
    .line 199
    .line 200
    const v14, 0x3e9eb852    # 0.31f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f59999a    # 0.85f

    .line 204
    .line 205
    .line 206
    const v16, 0x3db851ec    # 0.09f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40d00000    # 6.5f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, -0x41051eb8    # -0.49f

    .line 218
    .line 219
    .line 220
    const/high16 v18, -0x41000000    # -0.5f

    .line 221
    .line 222
    const v13, 0x3c23d70a    # 0.01f

    .line 223
    .line 224
    .line 225
    const v14, -0x4170a3d7    # -0.28f

    .line 226
    .line 227
    .line 228
    const v15, -0x41a8f5c3    # -0.21f

    .line 229
    .line 230
    .line 231
    const/high16 v16, -0x41000000    # -0.5f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x3f76b852    # -4.29f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, -0x4147ae14    # -0.36f

    .line 243
    .line 244
    .line 245
    const v18, 0x3f59999a    # 0.85f

    .line 246
    .line 247
    .line 248
    const v13, -0x4119999a    # -0.45f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const v15, -0x40d47ae1    # -0.67f

    .line 253
    .line 254
    .line 255
    const v16, 0x3f0a3d71    # 0.54f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/16 v16, 0x3800

    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const-string v4, ""

    .line 273
    .line 274
    const/high16 v6, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v8, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v9, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/high16 v12, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v15, 0x0

    .line 285
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    sput-object v0, Landroidx/compose/material/icons/rounded/TrendingUpKt;->_trendingUp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 294
    .line 295
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    return-object v0
.end method

.method public static synthetic getTrendingUp$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

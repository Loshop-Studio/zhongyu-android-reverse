.class public final Landroidx/compose/material/icons/filled/ShieldMoonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShieldMoon(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ShieldMoonKt;->_shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Filled.ShieldMoon"

    .line 33
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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v2, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, 0x40c2e148    # 6.09f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v17, 0x41000000    # 8.0f

    .line 91
    .line 92
    const v18, 0x412e8f5c    # 10.91f

    .line 93
    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, 0x40a1999a    # 5.05f

    .line 97
    .line 98
    .line 99
    const v15, 0x405a3d71    # 3.41f

    .line 100
    .line 101
    .line 102
    const v16, 0x411c28f6    # 9.76f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v18, -0x3ed170a4    # -10.91f

    .line 109
    .line 110
    .line 111
    const v13, 0x4092e148    # 4.59f

    .line 112
    .line 113
    .line 114
    const v14, -0x406ccccd    # -1.15f

    .line 115
    .line 116
    .line 117
    const/high16 v15, 0x41000000    # 8.0f

    .line 118
    .line 119
    const v16, -0x3f447ae1    # -5.86f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x40a00000    # 5.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x40000000    # 2.0f

    .line 131
    .line 132
    const/high16 v2, 0x41400000    # 12.0f

    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x417f851f    # 15.97f

    .line 141
    .line 142
    .line 143
    const v2, 0x41668f5c    # 14.41f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x3f2147ae    # -6.96f

    .line 150
    .line 151
    .line 152
    const v18, -0x4270a3d7    # -0.07f

    .line 153
    .line 154
    .line 155
    const v13, -0x40147ae1    # -1.84f

    .line 156
    .line 157
    .line 158
    const v14, 0x400ae148    # 2.17f

    .line 159
    .line 160
    .line 161
    const v15, -0x3f5947ae    # -5.21f

    .line 162
    .line 163
    .line 164
    const v16, 0x40066666    # 2.1f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x402c28f6    # 2.69f

    .line 171
    .line 172
    .line 173
    const v18, -0x3f1570a4    # -7.33f

    .line 174
    .line 175
    .line 176
    const v13, -0x3ff3d70a    # -2.19f

    .line 177
    .line 178
    .line 179
    const v14, -0x3fd1eb85    # -2.72f

    .line 180
    .line 181
    .line 182
    const v15, -0x40d9999a    # -0.65f

    .line 183
    .line 184
    .line 185
    const v16, -0x3f28f5c3    # -6.72f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3f028f5c    # 0.51f

    .line 192
    .line 193
    .line 194
    const v18, 0x3f19999a    # 0.6f

    .line 195
    .line 196
    .line 197
    const v13, 0x3eae147b    # 0.34f

    .line 198
    .line 199
    .line 200
    const v14, -0x428a3d71    # -0.06f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f2147ae    # 0.63f

    .line 204
    .line 205
    .line 206
    const v16, 0x3e8a3d71    # 0.27f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x3ea3d70a    # 0.32f

    .line 213
    .line 214
    .line 215
    const v18, 0x40770a3d    # 3.86f

    .line 216
    .line 217
    .line 218
    const v13, -0x41147ae1    # -0.46f

    .line 219
    .line 220
    .line 221
    const v14, 0x3f9d70a4    # 1.23f

    .line 222
    .line 223
    .line 224
    const v15, -0x413851ec    # -0.39f

    .line 225
    .line 226
    .line 227
    const v16, 0x4028f5c3    # 2.64f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x404b851f    # 3.18f

    .line 234
    .line 235
    .line 236
    const v18, 0x400ccccd    # 2.2f

    .line 237
    .line 238
    .line 239
    const v13, 0x3f35c28f    # 0.71f

    .line 240
    .line 241
    .line 242
    const v14, 0x3f9c28f6    # 1.22f

    .line 243
    .line 244
    .line 245
    const v15, 0x3ff1eb85    # 1.89f

    .line 246
    .line 247
    .line 248
    const v16, 0x3ffeb852    # 1.99f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x417f851f    # 15.97f

    .line 255
    .line 256
    .line 257
    const v18, 0x41668f5c    # 14.41f

    .line 258
    .line 259
    .line 260
    const v13, 0x41806666    # 16.05f

    .line 261
    .line 262
    .line 263
    const v14, 0x415b851f    # 13.72f

    .line 264
    .line 265
    .line 266
    const v15, 0x4181999a    # 16.2f

    .line 267
    .line 268
    .line 269
    const v16, 0x41623d71    # 14.14f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/16 v16, 0x3800

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/high16 v6, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v8, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    const/high16 v9, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v12, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const/4 v14, 0x0

    .line 297
    const/4 v15, 0x0

    .line 298
    const-string v4, ""

    .line 299
    .line 300
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    sput-object v0, Landroidx/compose/material/icons/filled/ShieldMoonKt;->_shieldMoon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 309
    .line 310
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    return-object v0
.end method

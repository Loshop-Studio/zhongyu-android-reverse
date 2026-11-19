.class public final Landroidx/compose/material/icons/rounded/RedoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _redo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRedo(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RedoKt;->_redo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Redo"

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
    const v0, 0x41933333    # 18.4f

    .line 71
    .line 72
    .line 73
    const v2, 0x4129999a    # 10.6f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41380000    # 11.5f

    .line 80
    .line 81
    const/high16 v18, 0x41000000    # 8.0f

    .line 82
    .line 83
    const v13, 0x41846666    # 16.55f

    .line 84
    .line 85
    .line 86
    const v14, 0x410fd70a    # 8.99f

    .line 87
    .line 88
    .line 89
    const v15, 0x41626666    # 14.15f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x41000000    # 8.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3ee8f5c3    # -9.44f

    .line 98
    .line 99
    .line 100
    const v18, 0x40bdc28f    # 5.93f

    .line 101
    .line 102
    .line 103
    const v13, -0x3f7ae148    # -4.16f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, -0x3f0851ec    # -7.74f

    .line 108
    .line 109
    .line 110
    const v16, 0x401ae148    # 2.42f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x3f400000    # 0.75f

    .line 117
    .line 118
    const v18, 0x3fdae148    # 1.71f

    .line 119
    .line 120
    .line 121
    const v13, -0x415c28f6    # -0.32f

    .line 122
    .line 123
    .line 124
    const v14, 0x3f2b851f    # 0.67f

    .line 125
    .line 126
    .line 127
    const v15, 0x3d23d70a    # 0.04f

    .line 128
    .line 129
    .line 130
    const v16, 0x3fbc28f6    # 1.47f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 137
    .line 138
    const v18, -0x40dc28f6    # -0.64f

    .line 139
    .line 140
    .line 141
    const v13, 0x3f170a3d    # 0.59f

    .line 142
    .line 143
    .line 144
    const v14, 0x3e4ccccd    # 0.2f

    .line 145
    .line 146
    .line 147
    const v15, 0x3f9d70a4    # 1.23f

    .line 148
    .line 149
    .line 150
    const v16, -0x425c28f6    # -0.08f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x40e6147b    # 7.19f

    .line 157
    .line 158
    .line 159
    const/high16 v18, -0x3f700000    # -4.5f

    .line 160
    .line 161
    const v13, 0x3fa66666    # 1.3f

    .line 162
    .line 163
    .line 164
    const v14, -0x3fd5c28f    # -2.66f

    .line 165
    .line 166
    .line 167
    const v15, 0x4080f5c3    # 4.03f

    .line 168
    .line 169
    .line 170
    const/high16 v16, -0x3f700000    # -4.5f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x40a3d70a    # 5.12f

    .line 176
    .line 177
    .line 178
    const v18, 0x3ff0a3d7    # 1.88f

    .line 179
    .line 180
    .line 181
    const v13, 0x3ff9999a    # 1.95f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const v15, 0x406eb852    # 3.73f

    .line 186
    .line 187
    .line 188
    const v16, 0x3f3851ec    # 0.72f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, -0x400b851f    # -1.91f

    .line 195
    .line 196
    .line 197
    const v2, 0x3ff47ae1    # 1.91f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, 0x3f333333    # 0.7f

    .line 204
    .line 205
    .line 206
    const v18, 0x3fdae148    # 1.71f

    .line 207
    .line 208
    .line 209
    const v13, -0x40deb852    # -0.63f

    .line 210
    .line 211
    .line 212
    const v14, 0x3f2147ae    # 0.63f

    .line 213
    .line 214
    .line 215
    const v15, -0x41bd70a4    # -0.19f

    .line 216
    .line 217
    .line 218
    const v16, 0x3fdae148    # 1.71f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41a80000    # 21.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v18, -0x40800000    # -1.0f

    .line 232
    .line 233
    const v13, 0x3f0ccccd    # 0.55f

    .line 234
    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    const/high16 v15, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const v16, -0x4119999a    # -0.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x41168f5c    # 9.41f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, -0x40251eb8    # -1.71f

    .line 252
    .line 253
    .line 254
    const v18, -0x40ca3d71    # -0.71f

    .line 255
    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, -0x409c28f6    # -0.89f

    .line 259
    .line 260
    .line 261
    const v15, -0x4075c28f    # -1.08f

    .line 262
    .line 263
    .line 264
    const v16, -0x40547ae1    # -1.34f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x400e147b    # -1.89f

    .line 271
    .line 272
    .line 273
    const v2, 0x3ff33333    # 1.9f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/16 v16, 0x3800

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const/high16 v6, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v8, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/high16 v9, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v12, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/4 v15, 0x0

    .line 301
    const-string v4, ""

    .line 302
    .line 303
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Landroidx/compose/material/icons/rounded/RedoKt;->_redo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 312
    .line 313
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object v0
.end method

.method public static synthetic getRedo$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

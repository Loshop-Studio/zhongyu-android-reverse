.class public final Landroidx/compose/material/icons/rounded/GetAppKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _getApp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGetApp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GetAppKt;->_getApp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GetApp"

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
    const v0, 0x4184b852    # 16.59f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41100000    # 9.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41700000    # 15.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40800000    # 4.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, -0x40800000    # -1.0f

    .line 89
    .line 90
    const/high16 v18, -0x40800000    # -1.0f

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const v14, -0x40f33333    # -0.55f

    .line 94
    .line 95
    .line 96
    const v15, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v16, -0x40800000    # -1.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, -0x3f800000    # -4.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v18, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v13, -0x40f33333    # -0.55f

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const/high16 v15, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v16, 0x3ee66666    # 0.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40a00000    # 5.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x40ed1eb8    # 7.41f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x40ca3d71    # -0.71f

    .line 135
    .line 136
    .line 137
    const v18, 0x3fdae148    # 1.71f

    .line 138
    .line 139
    .line 140
    const v13, -0x409c28f6    # -0.89f

    .line 141
    .line 142
    .line 143
    const v15, -0x40547ae1    # -1.34f

    .line 144
    .line 145
    .line 146
    const v16, 0x3f8a3d71    # 1.08f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x4092e148    # 4.59f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3fb47ae1    # 1.41f

    .line 159
    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const v13, 0x3ec7ae14    # 0.39f

    .line 164
    .line 165
    .line 166
    const v14, 0x3ec7ae14    # 0.39f

    .line 167
    .line 168
    .line 169
    const v15, 0x3f828f5c    # 1.02f

    .line 170
    .line 171
    .line 172
    const v16, 0x3ec7ae14    # 0.39f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x3f6d1eb8    # -4.59f

    .line 179
    .line 180
    .line 181
    const v2, 0x4092e148    # 4.59f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, -0x40cccccd    # -0.7f

    .line 188
    .line 189
    .line 190
    const v18, -0x40251eb8    # -1.71f

    .line 191
    .line 192
    .line 193
    const v13, 0x3f2147ae    # 0.63f

    .line 194
    .line 195
    .line 196
    const v14, -0x40deb852    # -0.63f

    .line 197
    .line 198
    .line 199
    const v15, 0x3e428f5c    # 0.19f

    .line 200
    .line 201
    .line 202
    const v16, -0x40251eb8    # -1.71f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41980000    # 19.0f

    .line 212
    .line 213
    const/high16 v2, 0x40a00000    # 5.0f

    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v18, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, 0x3f0ccccd    # 0.55f

    .line 224
    .line 225
    .line 226
    const v15, 0x3ee66666    # 0.45f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x3f800000    # 1.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41400000    # 12.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v18, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v13, 0x3f0ccccd    # 0.55f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const/high16 v15, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const v16, -0x4119999a    # -0.45f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x4119999a    # -0.45f

    .line 254
    .line 255
    .line 256
    const/high16 v2, -0x40800000    # -1.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40c00000    # 6.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, -0x40800000    # -1.0f

    .line 267
    .line 268
    const/high16 v18, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v13, -0x40f33333    # -0.55f

    .line 271
    .line 272
    .line 273
    const/high16 v15, -0x40800000    # -1.0f

    .line 274
    .line 275
    const v16, 0x3ee66666    # 0.45f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/16 v16, 0x3800

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/high16 v6, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/high16 v8, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const/high16 v9, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v12, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const-string v4, ""

    .line 304
    .line 305
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    sput-object v0, Landroidx/compose/material/icons/rounded/GetAppKt;->_getApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 314
    .line 315
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-object v0
.end method

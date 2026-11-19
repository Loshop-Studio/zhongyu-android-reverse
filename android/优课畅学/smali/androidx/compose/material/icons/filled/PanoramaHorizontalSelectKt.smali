.class public final Landroidx/compose/material/icons/filled/PanoramaHorizontalSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaHorizontalSelect(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaHorizontalSelectKt;->_panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaHorizontalSelect"

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
    const v0, 0x41ab70a4    # 21.43f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x416147ae    # -0.31f

    .line 79
    .line 80
    .line 81
    const v18, 0x3d75c28f    # 0.06f

    .line 82
    .line 83
    .line 84
    const v13, -0x42333333    # -0.1f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x41b33333    # -0.2f

    .line 89
    .line 90
    .line 91
    const v16, 0x3ca3d70a    # 0.02f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x41400000    # 12.0f

    .line 98
    .line 99
    const v18, 0x40b66666    # 5.7f

    .line 100
    .line 101
    .line 102
    const v13, 0x419170a4    # 18.18f

    .line 103
    .line 104
    .line 105
    const v14, 0x40a51eb8    # 5.16f

    .line 106
    .line 107
    .line 108
    const v15, 0x417170a4    # 15.09f

    .line 109
    .line 110
    .line 111
    const v16, 0x40b66666    # 5.7f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x3eee147b    # -9.12f

    .line 118
    .line 119
    .line 120
    const v2, -0x402e147b    # -1.64f

    .line 121
    .line 122
    .line 123
    const v4, -0x3f3a3d71    # -6.18f

    .line 124
    .line 125
    .line 126
    const v6, -0x40f33333    # -0.55f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, 0x40247ae1    # 2.57f

    .line 133
    .line 134
    .line 135
    const/high16 v18, 0x40800000    # 4.0f

    .line 136
    .line 137
    const v13, 0x403147ae    # 2.77f

    .line 138
    .line 139
    .line 140
    const v14, 0x4080a3d7    # 4.02f

    .line 141
    .line 142
    .line 143
    const v15, 0x402a3d71    # 2.66f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40800000    # 4.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, -0x40ee147b    # -0.57f

    .line 152
    .line 153
    .line 154
    const v18, 0x3f2147ae    # 0.63f

    .line 155
    .line 156
    .line 157
    const v13, -0x4151eb85    # -0.34f

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const v15, -0x40ee147b    # -0.57f

    .line 162
    .line 163
    .line 164
    const v16, 0x3e6b851f    # 0.23f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x416c0000    # 14.75f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x3f11eb85    # 0.57f

    .line 176
    .line 177
    .line 178
    const v18, 0x3f1eb852    # 0.62f

    .line 179
    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const v14, 0x3ec7ae14    # 0.39f

    .line 183
    .line 184
    .line 185
    const v15, 0x3e6b851f    # 0.23f

    .line 186
    .line 187
    .line 188
    const v16, 0x3f1eb852    # 0.62f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x3e9eb852    # 0.31f

    .line 195
    .line 196
    .line 197
    const v18, -0x428a3d71    # -0.06f

    .line 198
    .line 199
    .line 200
    const v13, 0x3dcccccd    # 0.1f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const v15, 0x3e4ccccd    # 0.2f

    .line 205
    .line 206
    .line 207
    const v16, -0x435c28f6    # -0.02f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x4111eb85    # 9.12f

    .line 214
    .line 215
    .line 216
    const v18, -0x402e147b    # -1.64f

    .line 217
    .line 218
    .line 219
    const v13, 0x403c28f6    # 2.94f

    .line 220
    .line 221
    .line 222
    const v14, -0x40733333    # -1.1f

    .line 223
    .line 224
    .line 225
    const v15, 0x40c0f5c3    # 6.03f

    .line 226
    .line 227
    .line 228
    const v16, -0x402e147b    # -1.64f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x4111eb85    # 9.12f

    .line 235
    .line 236
    .line 237
    const v2, 0x3fd1eb85    # 1.64f

    .line 238
    .line 239
    .line 240
    const v4, 0x40c5c28f    # 6.18f

    .line 241
    .line 242
    .line 243
    const v6, 0x3f0ccccd    # 0.55f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x3e9eb852    # 0.31f

    .line 250
    .line 251
    .line 252
    const v18, 0x3d75c28f    # 0.06f

    .line 253
    .line 254
    .line 255
    const v13, 0x3de147ae    # 0.11f

    .line 256
    .line 257
    .line 258
    const v14, 0x3d23d70a    # 0.04f

    .line 259
    .line 260
    .line 261
    const v15, 0x3e570a3d    # 0.21f

    .line 262
    .line 263
    .line 264
    const v16, 0x3d75c28f    # 0.06f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3f11eb85    # 0.57f

    .line 271
    .line 272
    .line 273
    const v18, -0x40deb852    # -0.63f

    .line 274
    .line 275
    .line 276
    const v13, 0x3ea8f5c3    # 0.33f

    .line 277
    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const v15, 0x3f11eb85    # 0.57f

    .line 281
    .line 282
    .line 283
    const v16, -0x41947ae1    # -0.23f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x409428f6    # 4.63f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x40ee147b    # -0.57f

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const v14, -0x41333333    # -0.4f

    .line 300
    .line 301
    .line 302
    const v15, -0x418a3d71    # -0.24f

    .line 303
    .line 304
    .line 305
    const v16, -0x40deb852    # -0.63f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    const/16 v16, 0x3800

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const/high16 v6, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v8, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    const/high16 v9, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/high16 v12, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    const-string v4, ""

    .line 334
    .line 335
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaHorizontalSelectKt;->_panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 344
    .line 345
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    return-object v0
.end method

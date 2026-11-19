.class public final Landroidx/compose/material/icons/filled/PanoramaVerticalSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaVerticalSelect(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaVerticalSelectKt;->_panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaVerticalSelect"

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
    const v0, 0x419f70a4    # 19.93f

    .line 71
    .line 72
    .line 73
    const v2, 0x41a8f5c3    # 21.12f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x402e147b    # -1.64f

    .line 80
    .line 81
    .line 82
    const v18, -0x3eee147b    # -9.12f

    .line 83
    .line 84
    .line 85
    const v13, -0x40733333    # -1.1f

    .line 86
    .line 87
    .line 88
    const v14, -0x3fc3d70a    # -2.94f

    .line 89
    .line 90
    .line 91
    const v15, -0x402e147b    # -1.64f

    .line 92
    .line 93
    .line 94
    const v16, -0x3f3f0a3d    # -6.03f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3fd1eb85    # 1.64f

    .line 101
    .line 102
    .line 103
    const v2, -0x3eee147b    # -9.12f

    .line 104
    .line 105
    .line 106
    const v4, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const v6, -0x3f3a3d71    # -6.18f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x3d8f5c29    # 0.07f

    .line 116
    .line 117
    .line 118
    const v18, -0x416147ae    # -0.31f

    .line 119
    .line 120
    .line 121
    const v13, 0x3d4ccccd    # 0.05f

    .line 122
    .line 123
    .line 124
    const v14, -0x421eb852    # -0.11f

    .line 125
    .line 126
    .line 127
    const v15, 0x3d8f5c29    # 0.07f

    .line 128
    .line 129
    .line 130
    const v16, -0x419eb852    # -0.22f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, -0x40dc28f6    # -0.64f

    .line 137
    .line 138
    .line 139
    const v18, -0x40ee147b    # -0.57f

    .line 140
    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, -0x4151eb85    # -0.34f

    .line 144
    .line 145
    .line 146
    const v15, -0x418a3d71    # -0.24f

    .line 147
    .line 148
    .line 149
    const v16, -0x40ee147b    # -0.57f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x4093d70a    # 4.62f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x40deb852    # -0.63f

    .line 162
    .line 163
    .line 164
    const v18, 0x3f11eb85    # 0.57f

    .line 165
    .line 166
    .line 167
    const v13, -0x41333333    # -0.4f

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const v15, -0x40deb852    # -0.63f

    .line 172
    .line 173
    .line 174
    const v16, 0x3e6b851f    # 0.23f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3d75c28f    # 0.06f

    .line 181
    .line 182
    .line 183
    const v18, 0x3e9eb852    # 0.31f

    .line 184
    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3dcccccd    # 0.1f

    .line 188
    .line 189
    .line 190
    const v15, 0x3ca3d70a    # 0.02f

    .line 191
    .line 192
    .line 193
    const v16, 0x3e4ccccd    # 0.2f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x40b66666    # 5.7f

    .line 200
    .line 201
    .line 202
    const/high16 v18, 0x41400000    # 12.0f

    .line 203
    .line 204
    const v13, 0x40a51eb8    # 5.16f

    .line 205
    .line 206
    .line 207
    const v14, 0x40ba3d71    # 5.82f

    .line 208
    .line 209
    .line 210
    const v15, 0x40b66666    # 5.7f

    .line 211
    .line 212
    .line 213
    const v16, 0x410e8f5c    # 8.91f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, -0x402e147b    # -1.64f

    .line 220
    .line 221
    .line 222
    const v2, 0x4111eb85    # 9.12f

    .line 223
    .line 224
    .line 225
    const v4, -0x40f33333    # -0.55f

    .line 226
    .line 227
    .line 228
    const v6, 0x40c5c28f    # 6.18f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x4270a3d7    # -0.07f

    .line 235
    .line 236
    .line 237
    const v18, 0x3e9eb852    # 0.31f

    .line 238
    .line 239
    .line 240
    const v13, -0x42b33333    # -0.05f

    .line 241
    .line 242
    .line 243
    const v14, 0x3de147ae    # 0.11f

    .line 244
    .line 245
    .line 246
    const v15, -0x4270a3d7    # -0.07f

    .line 247
    .line 248
    .line 249
    const v16, 0x3e6147ae    # 0.22f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x3f2147ae    # 0.63f

    .line 256
    .line 257
    .line 258
    const v18, 0x3f11eb85    # 0.57f

    .line 259
    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, 0x3ea8f5c3    # 0.33f

    .line 263
    .line 264
    .line 265
    const v15, 0x3e6b851f    # 0.23f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f11eb85    # 0.57f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x416c0000    # 14.75f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v18, -0x40ee147b    # -0.57f

    .line 280
    .line 281
    .line 282
    const v13, 0x3ec7ae14    # 0.39f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const v15, 0x3f2147ae    # 0.63f

    .line 287
    .line 288
    .line 289
    const v16, -0x418a3d71    # -0.24f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x4270a3d7    # -0.07f

    .line 296
    .line 297
    .line 298
    const v18, -0x416147ae    # -0.31f

    .line 299
    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, -0x42333333    # -0.1f

    .line 303
    .line 304
    .line 305
    const v15, -0x435c28f6    # -0.02f

    .line 306
    .line 307
    .line 308
    const v16, -0x41b33333    # -0.2f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/16 v16, 0x3800

    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    const/high16 v6, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v8, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const/high16 v9, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v12, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/4 v15, 0x0

    .line 336
    const-string v4, ""

    .line 337
    .line 338
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaVerticalSelectKt;->_panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 347
    .line 348
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object v0
.end method

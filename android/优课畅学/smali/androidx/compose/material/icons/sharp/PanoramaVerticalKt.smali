.class public final Landroidx/compose/material/icons/sharp/PanoramaVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaVertical(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PanoramaVertical"

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
    const v0, 0x418bae14    # 17.46f

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
    const v17, -0x406b851f    # -1.16f

    .line 79
    .line 80
    .line 81
    const/high16 v18, 0x41000000    # 8.0f

    .line 82
    .line 83
    const v13, -0x40bae148    # -0.77f

    .line 84
    .line 85
    .line 86
    const v14, 0x40266666    # 2.6f

    .line 87
    .line 88
    .line 89
    const v15, -0x406b851f    # -1.16f

    .line 90
    .line 91
    .line 92
    const v16, 0x40a8f5c3    # 5.28f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x3f947ae1    # 1.16f

    .line 99
    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const v14, 0x402e147b    # 2.72f

    .line 103
    .line 104
    .line 105
    const v15, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v16, 0x40ad1eb8    # 5.41f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x40d1999a    # 6.55f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x3f000000    # -8.0f

    .line 121
    .line 122
    const v13, 0x3f451eb8    # 0.77f

    .line 123
    .line 124
    .line 125
    const v14, -0x3fd9999a    # -2.6f

    .line 126
    .line 127
    .line 128
    const v15, 0x3f947ae1    # 1.16f

    .line 129
    .line 130
    .line 131
    const v16, -0x3f570a3d    # -5.28f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x406b851f    # -1.16f

    .line 138
    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, -0x3fd1eb85    # -2.72f

    .line 142
    .line 143
    .line 144
    const v15, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    const v16, -0x3f52e148    # -5.41f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x412e8f5c    # 10.91f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x4031eb85    # 2.78f

    .line 160
    .line 161
    .line 162
    const/high16 v2, -0x40000000    # -2.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x407147ae    # 3.77f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3e99999a    # 0.3f

    .line 174
    .line 175
    .line 176
    const v2, 0x3f6147ae    # 0.88f

    .line 177
    .line 178
    .line 179
    const v4, 0x3e851eb8    # 0.26f

    .line 180
    .line 181
    .line 182
    const v6, 0x3f451eb8    # 0.77f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x40b6b852    # 5.71f

    .line 189
    .line 190
    .line 191
    const/high16 v18, 0x41400000    # 12.0f

    .line 192
    .line 193
    const v13, 0x40a51eb8    # 5.16f

    .line 194
    .line 195
    .line 196
    const v14, 0x40ba3d71    # 5.82f

    .line 197
    .line 198
    .line 199
    const v15, 0x40b6b852    # 5.71f

    .line 200
    .line 201
    .line 202
    const v16, 0x410e8f5c    # 8.91f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, -0x402e147b    # -1.64f

    .line 209
    .line 210
    .line 211
    const v2, 0x4111eb85    # 9.12f

    .line 212
    .line 213
    .line 214
    const v4, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    const v6, 0x40c5c28f    # 6.18f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x41666666    # -0.3f

    .line 224
    .line 225
    .line 226
    const v18, 0x3f6147ae    # 0.88f

    .line 227
    .line 228
    .line 229
    const v13, -0x42dc28f6    # -0.04f

    .line 230
    .line 231
    .line 232
    const v14, 0x3de147ae    # 0.11f

    .line 233
    .line 234
    .line 235
    const v15, -0x41666666    # -0.3f

    .line 236
    .line 237
    .line 238
    const v16, 0x3f6147ae    # 0.88f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x4183c28f    # 16.47f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x41666666    # -0.3f

    .line 251
    .line 252
    .line 253
    const v2, -0x409eb852    # -0.88f

    .line 254
    .line 255
    .line 256
    const v4, -0x417ae148    # -0.26f

    .line 257
    .line 258
    .line 259
    const v6, -0x40bae148    # -0.77f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x402e147b    # -1.64f

    .line 266
    .line 267
    .line 268
    const v18, -0x3eee147b    # -9.12f

    .line 269
    .line 270
    .line 271
    const v13, -0x40747ae1    # -1.09f

    .line 272
    .line 273
    .line 274
    const v14, -0x3fc3d70a    # -2.94f

    .line 275
    .line 276
    .line 277
    const v15, -0x402e147b    # -1.64f

    .line 278
    .line 279
    .line 280
    const v16, -0x3f3f0a3d    # -6.03f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x3fd1eb85    # 1.64f

    .line 287
    .line 288
    .line 289
    const v2, -0x3eee147b    # -9.12f

    .line 290
    .line 291
    .line 292
    const v4, 0x3f0ccccd    # 0.55f

    .line 293
    .line 294
    .line 295
    const v6, -0x3f3a3d71    # -6.18f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const v18, -0x409eb852    # -0.88f

    .line 305
    .line 306
    .line 307
    const v13, 0x3d23d70a    # 0.04f

    .line 308
    .line 309
    .line 310
    const v14, -0x421eb852    # -0.11f

    .line 311
    .line 312
    .line 313
    const v15, 0x3e99999a    # 0.3f

    .line 314
    .line 315
    .line 316
    const v16, -0x409eb852    # -0.88f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/16 v16, 0x3800

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    const/high16 v6, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/high16 v8, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    const/high16 v9, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v12, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const/4 v14, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    const-string v4, ""

    .line 346
    .line 347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    sput-object v0, Landroidx/compose/material/icons/sharp/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/filled/LocalMallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localMall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalMall(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LocalMallKt;->_localMall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LocalMall"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3f600000    # -5.0f

    .line 83
    .line 84
    const/high16 v18, -0x3f600000    # -5.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x3fcf5c29    # -2.76f

    .line 88
    .line 89
    .line 90
    const v15, -0x3ff0a3d7    # -2.24f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x3f600000    # -5.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x404f5c29    # 3.24f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x40e00000    # 7.0f

    .line 102
    .line 103
    const/high16 v4, 0x40c00000    # 6.0f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40a00000    # 5.0f

    .line 109
    .line 110
    const/high16 v2, 0x40c00000    # 6.0f

    .line 111
    .line 112
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, -0x400147ae    # -1.99f

    .line 116
    .line 117
    .line 118
    const/high16 v18, 0x40000000    # 2.0f

    .line 119
    .line 120
    const v13, -0x40733333    # -1.1f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x400147ae    # -1.99f

    .line 125
    .line 126
    .line 127
    const v16, 0x3f666666    # 0.9f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x41a00000    # 20.0f

    .line 134
    .line 135
    const/high16 v2, 0x40400000    # 3.0f

    .line 136
    .line 137
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x40000000    # 2.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8ccccd    # 1.1f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41600000    # 14.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v18, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v13, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/high16 v15, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v16, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41a80000    # 21.0f

    .line 174
    .line 175
    const/high16 v2, 0x41000000    # 8.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, -0x40000000    # -2.0f

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const v14, -0x40733333    # -1.1f

    .line 184
    .line 185
    .line 186
    const v15, -0x4099999a    # -0.9f

    .line 187
    .line 188
    .line 189
    const/high16 v16, -0x40000000    # -2.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v2, 0x40400000    # 3.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x40400000    # 3.0f

    .line 205
    .line 206
    const/high16 v18, 0x40400000    # 3.0f

    .line 207
    .line 208
    const v13, 0x3fd47ae1    # 1.66f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const/high16 v15, 0x40400000    # 3.0f

    .line 213
    .line 214
    const v16, 0x3fab851f    # 1.34f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x41100000    # 9.0f

    .line 221
    .line 222
    const/high16 v2, 0x40c00000    # 6.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const v14, -0x402b851f    # -1.66f

    .line 231
    .line 232
    .line 233
    const v15, 0x3fab851f    # 1.34f

    .line 234
    .line 235
    .line 236
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41500000    # 13.0f

    .line 245
    .line 246
    const/high16 v2, 0x41400000    # 12.0f

    .line 247
    .line 248
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, -0x3f600000    # -5.0f

    .line 252
    .line 253
    const/high16 v18, -0x3f600000    # -5.0f

    .line 254
    .line 255
    const v13, -0x3fcf5c29    # -2.76f

    .line 256
    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/high16 v15, -0x3f600000    # -5.0f

    .line 260
    .line 261
    const v16, -0x3ff0a3d7    # -2.24f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x40000000    # 2.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x40400000    # 3.0f

    .line 273
    .line 274
    const/high16 v18, 0x40400000    # 3.0f

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const v14, 0x3fd47ae1    # 1.66f

    .line 278
    .line 279
    .line 280
    const v15, 0x3fab851f    # 1.34f

    .line 281
    .line 282
    .line 283
    const/high16 v16, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x40547ae1    # -1.34f

    .line 289
    .line 290
    .line 291
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 292
    .line 293
    const/high16 v4, 0x40400000    # 3.0f

    .line 294
    .line 295
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x40000000    # 2.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x3f600000    # -5.0f

    .line 304
    .line 305
    const/high16 v18, 0x40a00000    # 5.0f

    .line 306
    .line 307
    const v14, 0x4030a3d7    # 2.76f

    .line 308
    .line 309
    .line 310
    const v15, -0x3ff0a3d7    # -2.24f

    .line 311
    .line 312
    .line 313
    const/high16 v16, 0x40a00000    # 5.0f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    const/16 v16, 0x3800

    .line 326
    .line 327
    const/16 v17, 0x0

    .line 328
    .line 329
    const/high16 v6, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/high16 v8, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/4 v7, 0x0

    .line 334
    const/high16 v9, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/high16 v12, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const/4 v15, 0x0

    .line 340
    const-string v4, ""

    .line 341
    .line 342
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    sput-object v0, Landroidx/compose/material/icons/filled/LocalMallKt;->_localMall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 351
    .line 352
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-object v0
.end method

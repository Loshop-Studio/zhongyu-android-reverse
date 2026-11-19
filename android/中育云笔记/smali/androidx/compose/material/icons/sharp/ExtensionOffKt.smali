.class public final Landroidx/compose/material/icons/sharp/ExtensionOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExtensionOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ExtensionOff"

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
    const v0, 0x41b4e148    # 22.61f

    .line 71
    .line 72
    .line 73
    const v2, 0x419e3d71    # 19.78f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x402f5c29    # -1.63f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v17, 0x41900000    # 18.0f

    .line 86
    .line 87
    const/high16 v18, 0x41a80000    # 21.0f

    .line 88
    .line 89
    const v13, 0x4190cccd    # 18.1f

    .line 90
    .line 91
    .line 92
    const v14, 0x41a7d70a    # 20.98f

    .line 93
    .line 94
    .line 95
    const v15, 0x41906666    # 18.05f

    .line 96
    .line 97
    .line 98
    const/high16 v16, 0x41a80000    # 21.0f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, -0x3f8ccccd    # -3.8f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x3fd33333    # -2.7f

    .line 110
    .line 111
    .line 112
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const v14, -0x3fd28f5c    # -2.71f

    .line 116
    .line 117
    .line 118
    const v15, -0x3ff5c28f    # -2.16f

    .line 119
    .line 120
    .line 121
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3e947ae1    # 0.29f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v4, -0x3fd33333    # -2.7f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40400000    # 3.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, -0x3f466666    # -5.8f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x40400000    # 3.0f

    .line 149
    .line 150
    const v18, -0x3fd33333    # -2.7f

    .line 151
    .line 152
    .line 153
    const v13, 0x402d70a4    # 2.71f

    .line 154
    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const/high16 v15, 0x40400000    # 3.0f

    .line 158
    .line 159
    const v16, -0x3ff5c28f    # -2.16f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x3fc0a3d7    # -2.99f

    .line 166
    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const v14, -0x40f5c28f    # -0.54f

    .line 170
    .line 171
    .line 172
    const v15, -0x41666666    # -0.3f

    .line 173
    .line 174
    .line 175
    const v16, -0x3fd33333    # -2.7f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x40c00000    # 6.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3ca3d70a    # 0.02f

    .line 187
    .line 188
    .line 189
    const v18, -0x41f0a3d7    # -0.14f

    .line 190
    .line 191
    .line 192
    const v14, -0x42b33333    # -0.05f

    .line 193
    .line 194
    .line 195
    const v15, 0x3ca3d70a    # 0.02f

    .line 196
    .line 197
    .line 198
    const v16, -0x4247ae14    # -0.09f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x3fb1eb85    # 1.39f

    .line 205
    .line 206
    .line 207
    const v2, 0x40870a3d    # 4.22f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3fb47ae1    # 1.41f

    .line 214
    .line 215
    .line 216
    const v2, -0x404b851f    # -1.41f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x41930a3d    # 18.38f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x41b4e148    # 22.61f

    .line 229
    .line 230
    .line 231
    const v2, 0x419e3d71    # 19.78f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x41895c29    # 17.17f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x41a00000    # 20.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41700000    # 15.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x40200000    # 2.5f

    .line 254
    .line 255
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 256
    .line 257
    const v13, 0x3fb0a3d7    # 1.38f

    .line 258
    .line 259
    .line 260
    const/4 v14, 0x0

    .line 261
    const/high16 v15, 0x40200000    # 2.5f

    .line 262
    .line 263
    const v16, -0x4070a3d7    # -1.12f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x41ab0a3d    # 21.38f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x41200000    # 10.0f

    .line 273
    .line 274
    const/high16 v4, 0x41a00000    # 20.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, 0x40800000    # 4.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, -0x3f400000    # -6.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    const v14, -0x404f5c29    # -1.38f

    .line 293
    .line 294
    .line 295
    const v15, -0x4070a3d7    # -1.12f

    .line 296
    .line 297
    .line 298
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x4027ae14    # 2.62f

    .line 304
    .line 305
    .line 306
    const/high16 v2, 0x41100000    # 9.0f

    .line 307
    .line 308
    const/high16 v4, 0x40800000    # 4.0f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x40da8f5c    # 6.83f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x41895c29    # 17.17f

    .line 320
    .line 321
    .line 322
    const/high16 v2, 0x41a00000    # 20.0f

    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    const/16 v16, 0x3800

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const/high16 v6, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v8, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const/high16 v9, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v12, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const/4 v15, 0x0

    .line 349
    const-string v4, ""

    .line 350
    .line 351
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, Landroidx/compose/material/icons/sharp/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 360
    .line 361
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    return-object v0
.end method

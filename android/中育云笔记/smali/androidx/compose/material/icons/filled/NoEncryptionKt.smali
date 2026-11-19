.class public final Landroidx/compose/material/icons/filled/NoEncryptionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noEncryption:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoEncryption(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/NoEncryptionKt;->_noEncryption:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.NoEncryption"

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
    const v0, 0x41ae3d71    # 21.78f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a80000    # 21.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40870a3d    # 4.22f

    .line 79
    .line 80
    .line 81
    const/high16 v2, 0x40a00000    # 5.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40400000    # 3.0f

    .line 87
    .line 88
    const v2, 0x40c70a3d    # 6.22f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x40028f5c    # 2.04f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x40800000    # 4.0f

    .line 101
    .line 102
    const/high16 v18, 0x41200000    # 10.0f

    .line 103
    .line 104
    const v13, 0x408d70a4    # 4.42f

    .line 105
    .line 106
    .line 107
    const v14, 0x4109999a    # 8.6f

    .line 108
    .line 109
    .line 110
    const/high16 v15, 0x40800000    # 4.0f

    .line 111
    .line 112
    const/high16 v16, 0x41140000    # 9.25f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41200000    # 10.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, 0x40000000    # 2.0f

    .line 123
    .line 124
    const/high16 v18, 0x40000000    # 2.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const v14, 0x3f8ccccd    # 1.1f

    .line 128
    .line 129
    .line 130
    const v15, 0x3f666666    # 0.9f

    .line 131
    .line 132
    .line 133
    const/high16 v16, 0x40000000    # 2.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f28f5c3    # 0.66f

    .line 144
    .line 145
    .line 146
    const v18, -0x420a3d71    # -0.12f

    .line 147
    .line 148
    .line 149
    const v13, 0x3e6b851f    # 0.23f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const v15, 0x3ee66666    # 0.45f

    .line 154
    .line 155
    .line 156
    const v16, -0x42b33333    # -0.05f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x419e3d71    # 19.78f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41b80000    # 23.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x41ae3d71    # 21.78f

    .line 171
    .line 172
    .line 173
    const/high16 v2, 0x41a80000    # 21.0f

    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x410e6666    # 8.9f

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x40c00000    # 6.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x40466666    # 3.1f

    .line 190
    .line 191
    .line 192
    const v18, -0x3fb9999a    # -3.1f

    .line 193
    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, -0x40251eb8    # -1.71f

    .line 197
    .line 198
    .line 199
    const v15, 0x3fb1eb85    # 1.39f

    .line 200
    .line 201
    .line 202
    const v16, -0x3fb9999a    # -3.1f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3fb1eb85    # 1.39f

    .line 209
    .line 210
    .line 211
    const v2, 0x40466666    # 3.1f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x40000000    # 2.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x411a8f5c    # 9.66f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41a00000    # 20.0f

    .line 229
    .line 230
    const v2, 0x4192b852    # 18.34f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41200000    # 10.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, -0x40000000    # -2.0f

    .line 242
    .line 243
    const/high16 v18, -0x40000000    # -2.0f

    .line 244
    .line 245
    const v14, -0x40733333    # -1.1f

    .line 246
    .line 247
    .line 248
    const v15, -0x4099999a    # -0.9f

    .line 249
    .line 250
    .line 251
    const/high16 v16, -0x40000000    # -2.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, -0x40800000    # -1.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40c00000    # 6.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, -0x3f600000    # -5.0f

    .line 267
    .line 268
    const/high16 v18, -0x3f600000    # -5.0f

    .line 269
    .line 270
    const v14, -0x3fcf5c29    # -2.76f

    .line 271
    .line 272
    .line 273
    const v15, -0x3ff0a3d7    # -2.24f

    .line 274
    .line 275
    .line 276
    const/high16 v16, -0x3f600000    # -5.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x3f61eb85    # -4.94f

    .line 282
    .line 283
    .line 284
    const v18, 0x408ccccd    # 4.4f

    .line 285
    .line 286
    .line 287
    const v13, -0x3fdc28f6    # -2.56f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, -0x3f6b851f    # -4.64f

    .line 292
    .line 293
    .line 294
    const v16, 0x3ff70a3d    # 1.93f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40e7ae14    # 7.24f

    .line 301
    .line 302
    .line 303
    const v2, 0x410e6666    # 8.9f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40c00000    # 6.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/filled/NoEncryptionKt;->_noEncryption:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 347
    .line 348
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object v0
.end method

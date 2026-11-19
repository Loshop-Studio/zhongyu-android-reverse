.class public final Landroidx/compose/material/icons/rounded/AdfScannerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _adfScanner:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdfScanner(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AdfScannerKt;->_adfScanner:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AdfScanner"

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
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, -0x40000000    # -2.0f

    .line 88
    .line 89
    const/high16 v18, -0x40000000    # -2.0f

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const v14, -0x40733333    # -1.1f

    .line 93
    .line 94
    .line 95
    const v15, -0x4099999a    # -0.9f

    .line 96
    .line 97
    .line 98
    const/high16 v16, -0x40000000    # -2.0f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x41000000    # 8.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x40c00000    # 6.0f

    .line 109
    .line 110
    const/high16 v18, 0x40c00000    # 6.0f

    .line 111
    .line 112
    const v13, 0x40dccccd    # 6.9f

    .line 113
    .line 114
    .line 115
    const/high16 v14, 0x40800000    # 4.0f

    .line 116
    .line 117
    const/high16 v15, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const v16, 0x409ccccd    # 4.9f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x40c00000    # 6.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x40a00000    # 5.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 136
    .line 137
    const/high16 v18, 0x40400000    # 3.0f

    .line 138
    .line 139
    const v13, -0x402b851f    # -1.66f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 144
    .line 145
    const v16, 0x3fab851f    # 1.34f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x40400000    # 3.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x40000000    # 2.0f

    .line 157
    .line 158
    const/high16 v18, 0x40000000    # 2.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const v14, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const v15, 0x3f666666    # 0.9f

    .line 165
    .line 166
    .line 167
    const/high16 v16, 0x40000000    # 2.0f

    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41800000    # 16.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v18, -0x40000000    # -2.0f

    .line 178
    .line 179
    const v13, 0x3f8ccccd    # 1.1f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, 0x40000000    # 2.0f

    .line 184
    .line 185
    const v16, -0x4099999a    # -0.9f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41980000    # 19.0f

    .line 197
    .line 198
    const/high16 v18, 0x41400000    # 12.0f

    .line 199
    .line 200
    const/high16 v13, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const v14, 0x415570a4    # 13.34f

    .line 203
    .line 204
    .line 205
    const v15, 0x41a547ae    # 20.66f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x41400000    # 12.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41800000    # 16.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41000000    # 8.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40c00000    # 6.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41000000    # 8.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41400000    # 12.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41900000    # 18.0f

    .line 245
    .line 246
    const/high16 v2, 0x41880000    # 17.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, -0x40800000    # -1.0f

    .line 252
    .line 253
    const/high16 v18, -0x40800000    # -1.0f

    .line 254
    .line 255
    const v13, -0x40f33333    # -0.55f

    .line 256
    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/high16 v15, -0x40800000    # -1.0f

    .line 260
    .line 261
    const v16, -0x4119999a    # -0.45f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    const v14, -0x40f33333    # -0.55f

    .line 271
    .line 272
    .line 273
    const v15, 0x3ee66666    # 0.45f

    .line 274
    .line 275
    .line 276
    const/high16 v16, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x41900000    # 18.0f

    .line 290
    .line 291
    const/high16 v18, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v13, 0x41980000    # 19.0f

    .line 294
    .line 295
    const v14, 0x41846666    # 16.55f

    .line 296
    .line 297
    .line 298
    const v15, 0x41946666    # 18.55f

    .line 299
    .line 300
    .line 301
    const/high16 v16, 0x41880000    # 17.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/16 v16, 0x3800

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/high16 v8, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/high16 v9, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v12, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const/4 v14, 0x0

    .line 328
    const/4 v15, 0x0

    .line 329
    const-string v4, ""

    .line 330
    .line 331
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    sput-object v0, Landroidx/compose/material/icons/rounded/AdfScannerKt;->_adfScanner:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 340
    .line 341
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    return-object v0
.end method

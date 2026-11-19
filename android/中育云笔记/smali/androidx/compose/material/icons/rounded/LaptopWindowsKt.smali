.class public final Landroidx/compose/material/icons/rounded/LaptopWindowsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _laptopWindows:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLaptopWindows(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LaptopWindowsKt;->_laptopWindows:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LaptopWindows"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x3ffeb852    # 1.99f

    .line 83
    .line 84
    .line 85
    const/high16 v18, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v13, 0x3f8ccccd    # 1.1f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const v15, 0x3ffeb852    # 1.99f

    .line 92
    .line 93
    .line 94
    const v16, -0x4099999a    # -0.9f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41b00000    # 22.0f

    .line 101
    .line 102
    const/high16 v2, 0x40a00000    # 5.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, -0x40000000    # -2.0f

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const v14, -0x40733333    # -1.1f

    .line 111
    .line 112
    .line 113
    const v15, -0x4099999a    # -0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v16, -0x40000000    # -2.0f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v18, 0x40000000    # 2.0f

    .line 127
    .line 128
    const v13, -0x40733333    # -1.1f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/high16 v15, -0x40000000    # -2.0f

    .line 133
    .line 134
    const v16, 0x3f666666    # 0.9f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41200000    # 10.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x40000000    # 2.0f

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const v14, 0x3f8ccccd    # 1.1f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f666666    # 0.9f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40000000    # 2.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, -0x40800000    # -1.0f

    .line 168
    .line 169
    const/high16 v18, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v13, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    const/high16 v15, -0x40800000    # -1.0f

    .line 176
    .line 177
    const v16, 0x3ee66666    # 0.45f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    const/high16 v2, 0x3f800000    # 1.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x41b00000    # 22.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/high16 v18, -0x40800000    # -1.0f

    .line 199
    .line 200
    const v13, 0x3f0ccccd    # 0.55f

    .line 201
    .line 202
    .line 203
    const/high16 v15, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const v16, -0x4119999a    # -0.45f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x4119999a    # -0.45f

    .line 212
    .line 213
    .line 214
    const/high16 v2, -0x40800000    # -1.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x40a00000    # 5.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41600000    # 14.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v18, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const v16, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41000000    # 8.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x40800000    # -1.0f

    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const v14, 0x3f0ccccd    # 0.55f

    .line 254
    .line 255
    .line 256
    const v15, -0x4119999a    # -0.45f

    .line 257
    .line 258
    .line 259
    const/high16 v16, 0x3f800000    # 1.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40a00000    # 5.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v18, -0x40800000    # -1.0f

    .line 270
    .line 271
    const v13, -0x40f33333    # -0.55f

    .line 272
    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    const/high16 v15, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v16, -0x4119999a    # -0.45f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40c00000    # 6.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    const/16 v16, 0x3800

    .line 310
    .line 311
    const/16 v17, 0x0

    .line 312
    .line 313
    const/high16 v6, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/high16 v8, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const/high16 v9, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/high16 v12, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    const/4 v15, 0x0

    .line 324
    const-string v4, ""

    .line 325
    .line 326
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sput-object v0, Landroidx/compose/material/icons/rounded/LaptopWindowsKt;->_laptopWindows:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 335
    .line 336
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    return-object v0
.end method

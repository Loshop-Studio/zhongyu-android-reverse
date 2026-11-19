.class public final Landroidx/compose/material/icons/rounded/FormatUnderlinedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _formatUnderlined:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFormatUnderlined(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FormatUnderlinedKt;->_formatUnderlined:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FormatUnderlined"

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
    const v0, 0x414ca3d7    # 12.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x4187999a    # 16.95f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x40a6b852    # 5.21f

    .line 80
    .line 81
    .line 82
    const v18, -0x3f3ae148    # -6.16f

    .line 83
    .line 84
    .line 85
    const v13, 0x4041eb85    # 3.03f

    .line 86
    .line 87
    .line 88
    const v14, -0x413851ec    # -0.39f

    .line 89
    .line 90
    .line 91
    const v15, 0x40a6b852    # 5.21f

    .line 92
    .line 93
    .line 94
    const v16, -0x3fb8f5c3    # -3.11f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40880000    # 4.25f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41860000    # 16.75f

    .line 106
    .line 107
    const/high16 v18, 0x40400000    # 3.0f

    .line 108
    .line 109
    const/high16 v13, 0x41900000    # 18.0f

    .line 110
    .line 111
    const v14, 0x4063d70a    # 3.56f

    .line 112
    .line 113
    .line 114
    const v15, 0x418b851f    # 17.44f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x40400000    # 3.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x3f0f5c29    # 0.56f

    .line 123
    .line 124
    .line 125
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 126
    .line 127
    const/high16 v4, -0x40600000    # -1.25f

    .line 128
    .line 129
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40d4cccd    # 6.65f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x3fceb852    # -2.77f

    .line 139
    .line 140
    .line 141
    const v18, 0x406147ae    # 3.52f

    .line 142
    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const v14, 0x3fd5c28f    # 1.67f

    .line 146
    .line 147
    .line 148
    const v15, -0x406f5c29    # -1.13f

    .line 149
    .line 150
    .line 151
    const v16, 0x404c28f6    # 3.19f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x3f78a3d7    # -4.23f

    .line 158
    .line 159
    .line 160
    const v18, -0x3fa51eb8    # -3.42f

    .line 161
    .line 162
    .line 163
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 164
    .line 165
    const v14, 0x3ef0a3d7    # 0.47f

    .line 166
    .line 167
    .line 168
    const v15, -0x3f78a3d7    # -4.23f

    .line 169
    .line 170
    .line 171
    const/high16 v16, -0x40600000    # -1.25f

    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40880000    # 4.25f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x40e80000    # 7.25f

    .line 182
    .line 183
    const/high16 v18, 0x40400000    # 3.0f

    .line 184
    .line 185
    const/high16 v13, 0x41080000    # 8.5f

    .line 186
    .line 187
    const v14, 0x4063d70a    # 3.56f

    .line 188
    .line 189
    .line 190
    const v15, 0x40fe147b    # 7.94f

    .line 191
    .line 192
    .line 193
    const/high16 v16, 0x40400000    # 3.0f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x4063d70a    # 3.56f

    .line 199
    .line 200
    .line 201
    const/high16 v2, 0x40c00000    # 6.0f

    .line 202
    .line 203
    const/high16 v4, 0x40880000    # 4.25f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x41300000    # 11.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x40d947ae    # 6.79f

    .line 214
    .line 215
    .line 216
    const v18, 0x40be6666    # 5.95f

    .line 217
    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const v14, 0x40647ae1    # 3.57f

    .line 221
    .line 222
    .line 223
    const v15, 0x404851ec    # 3.13f

    .line 224
    .line 225
    .line 226
    const v16, 0x40cd70a4    # 6.42f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40a00000    # 5.0f

    .line 236
    .line 237
    const/high16 v2, 0x41a00000    # 20.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/high16 v18, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const v14, 0x3f0ccccd    # 0.55f

    .line 247
    .line 248
    .line 249
    const v15, 0x3ee66666    # 0.45f

    .line 250
    .line 251
    .line 252
    const/high16 v16, 0x3f800000    # 1.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41400000    # 12.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v18, -0x40800000    # -1.0f

    .line 263
    .line 264
    const v13, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const/high16 v15, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v16, -0x4119999a    # -0.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, -0x4119999a    # -0.45f

    .line 277
    .line 278
    .line 279
    const/high16 v2, -0x40800000    # -1.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x40c00000    # 6.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40800000    # -1.0f

    .line 290
    .line 291
    const/high16 v18, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const v13, -0x40f33333    # -0.55f

    .line 294
    .line 295
    .line 296
    const/high16 v15, -0x40800000    # -1.0f

    .line 297
    .line 298
    const v16, 0x3ee66666    # 0.45f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/16 v16, 0x3800

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/high16 v6, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v8, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const/high16 v9, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/high16 v12, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const/4 v15, 0x0

    .line 326
    const-string v4, ""

    .line 327
    .line 328
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    sput-object v0, Landroidx/compose/material/icons/rounded/FormatUnderlinedKt;->_formatUnderlined:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 337
    .line 338
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-object v0
.end method

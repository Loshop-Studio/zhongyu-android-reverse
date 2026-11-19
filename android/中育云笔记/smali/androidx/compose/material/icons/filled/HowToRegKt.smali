.class public final Landroidx/compose/material/icons/filled/HowToRegKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHowToReg(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/HowToRegKt;->_howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.HowToReg"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 53
    .line 54
    .line 55
    sget-object v19, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v20, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    const/high16 v7, 0x41880000    # 17.0f

    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v8, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v9, -0x3fc3d70a    # -2.94f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v26, -0x40800000    # -1.0f

    .line 88
    .line 89
    const v27, -0x428a3d71    # -0.06f

    .line 90
    .line 91
    .line 92
    const v22, -0x413851ec    # -0.39f

    .line 93
    .line 94
    .line 95
    const v23, -0x42dc28f6    # -0.04f

    .line 96
    .line 97
    .line 98
    const v24, -0x40d1eb85    # -0.68f

    .line 99
    .line 100
    .line 101
    const v25, -0x428a3d71    # -0.06f

    .line 102
    .line 103
    .line 104
    move-object/from16 v21, v4

    .line 105
    .line 106
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v26, -0x3f000000    # -8.0f

    .line 110
    .line 111
    const/high16 v27, 0x40800000    # 4.0f

    .line 112
    .line 113
    const v22, -0x3fd51eb8    # -2.67f

    .line 114
    .line 115
    .line 116
    const/16 v23, 0x0

    .line 117
    .line 118
    const/high16 v24, -0x3f000000    # -8.0f

    .line 119
    .line 120
    const v25, 0x3fab851f    # 1.34f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v8, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 135
    .line 136
    invoke-virtual {v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x41300000    # 11.0f

    .line 143
    .line 144
    const/high16 v8, 0x41400000    # 12.0f

    .line 145
    .line 146
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v26, 0x40800000    # 4.0f

    .line 150
    .line 151
    const/high16 v27, -0x3f800000    # -4.0f

    .line 152
    .line 153
    const v22, 0x400d70a4    # 2.21f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x40800000    # 4.0f

    .line 157
    .line 158
    const v25, -0x401ae148    # -1.79f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v6, -0x401ae148    # -1.79f

    .line 165
    .line 166
    .line 167
    const/high16 v9, -0x3f800000    # -4.0f

    .line 168
    .line 169
    invoke-virtual {v4, v6, v9, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v6, 0x3fe51eb8    # 1.79f

    .line 173
    .line 174
    .line 175
    const/high16 v12, 0x40800000    # 4.0f

    .line 176
    .line 177
    invoke-virtual {v4, v9, v6, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v6, v12, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const/16 v16, 0x3800

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    move-object v6, v2

    .line 192
    move-object v2, v4

    .line 193
    const-string v4, ""

    .line 194
    .line 195
    move-object v9, v6

    .line 196
    const/high16 v6, 0x3f800000    # 1.0f

    .line 197
    .line 198
    move v12, v7

    .line 199
    const/4 v7, 0x0

    .line 200
    move v13, v8

    .line 201
    const/high16 v8, 0x3f800000    # 1.0f

    .line 202
    .line 203
    move-object v14, v9

    .line 204
    const/high16 v9, 0x3f800000    # 1.0f

    .line 205
    .line 206
    move v15, v12

    .line 207
    const/high16 v12, 0x3f800000    # 1.0f

    .line 208
    .line 209
    move/from16 v21, v13

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    move-object/from16 v22, v14

    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    move/from16 v23, v15

    .line 216
    .line 217
    const/4 v15, 0x0

    .line 218
    move-object/from16 p0, v0

    .line 219
    .line 220
    move-object/from16 v0, v22

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const v2, 0x4177851f    # 15.47f

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41a40000    # 20.5f

    .line 255
    .line 256
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v13, 0x41400000    # 12.0f

    .line 260
    .line 261
    const/high16 v15, 0x41880000    # 17.0f

    .line 262
    .line 263
    invoke-virtual {v0, v13, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v2, -0x404b851f    # -1.41f

    .line 267
    .line 268
    .line 269
    const v4, 0x3fb33333    # 1.4f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v2, 0x40047ae1    # 2.07f

    .line 276
    .line 277
    .line 278
    const v6, 0x40051eb8    # 2.08f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v2, 0x40a428f6    # 5.13f

    .line 285
    .line 286
    .line 287
    const v6, -0x3f5a8f5c    # -5.17f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v2, 0x3fb47ae1    # 1.41f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    const/high16 v6, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v15, 0x0

    .line 313
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    sput-object v0, Landroidx/compose/material/icons/filled/HowToRegKt;->_howToReg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 322
    .line 323
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-object v0
.end method

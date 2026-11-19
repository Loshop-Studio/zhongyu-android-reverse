.class public final Landroidx/compose/material/icons/outlined/ReviewsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _reviews:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReviews(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ReviewsKt;->_reviews:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Reviews"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v7, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v6, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40800000    # 4.0f

    .line 85
    .line 86
    const v21, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/high16 v23, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v24, 0x4039999a    # 2.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v4

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v8, 0x41900000    # 18.0f

    .line 102
    .line 103
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v8, -0x3f800000    # -4.0f

    .line 107
    .line 108
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v8, 0x41600000    # 14.0f

    .line 112
    .line 113
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v26, -0x40000000    # -2.0f

    .line 117
    .line 118
    const v21, 0x3f8ccccd    # 1.1f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const v24, -0x4099999a    # -0.9f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x41a00000    # 20.0f

    .line 133
    .line 134
    const/high16 v26, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/high16 v21, 0x41b00000    # 22.0f

    .line 137
    .line 138
    const v22, 0x4039999a    # 2.9f

    .line 139
    .line 140
    .line 141
    const v23, 0x41a8cccd    # 21.1f

    .line 142
    .line 143
    .line 144
    const/high16 v24, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v8, 0x41800000    # 16.0f

    .line 153
    .line 154
    invoke-virtual {v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v7, 0x40a570a4    # 5.17f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v7, 0x41895c29    # 17.17f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    const/16 v16, 0x3800

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    move-object v6, v2

    .line 190
    move-object v2, v4

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    move-object v7, v6

    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    move-object v8, v7

    .line 197
    const/4 v7, 0x0

    .line 198
    move-object v9, v8

    .line 199
    const/high16 v8, 0x3f800000    # 1.0f

    .line 200
    .line 201
    move-object v12, v9

    .line 202
    const/high16 v9, 0x3f800000    # 1.0f

    .line 203
    .line 204
    move-object v13, v12

    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    move-object v14, v13

    .line 208
    const/4 v13, 0x0

    .line 209
    move-object v15, v14

    .line 210
    const/4 v14, 0x0

    .line 211
    move-object/from16 v20, v15

    .line 212
    .line 213
    const/4 v15, 0x0

    .line 214
    move-object/from16 p0, v0

    .line 215
    .line 216
    move-object/from16 v0, v20

    .line 217
    .line 218
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 226
    .line 227
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x41400000    # 12.0f

    .line 248
    .line 249
    const/high16 v4, 0x41700000    # 15.0f

    .line 250
    .line 251
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v2, 0x3fc8f5c3    # 1.57f

    .line 255
    .line 256
    .line 257
    const v4, -0x3fa47ae1    # -3.43f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v6, 0x405b851f    # 3.43f

    .line 264
    .line 265
    .line 266
    const v7, -0x40370a3d    # -1.57f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v4, ""

    .line 295
    .line 296
    const/high16 v6, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sput-object v0, Landroidx/compose/material/icons/outlined/ReviewsKt;->_reviews:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 308
    .line 309
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-object v0
.end method

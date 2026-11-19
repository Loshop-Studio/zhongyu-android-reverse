.class public final Landroidx/compose/material/icons/twotone/RssFeedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRssFeed(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RssFeedKt;->_rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RssFeed"

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x40c5c28f    # 6.18f

    .line 71
    .line 72
    .line 73
    const v6, 0x418e8f5c    # 17.82f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3ff47ae1    # -2.18f

    .line 80
    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v26, 0x408b851f    # 4.36f

    .line 87
    .line 88
    .line 89
    const/16 v27, 0x0

    .line 90
    .line 91
    const v21, 0x400b851f    # 2.18f

    .line 92
    .line 93
    .line 94
    const v22, 0x400b851f    # 2.18f

    .line 95
    .line 96
    .line 97
    const/16 v23, 0x0

    .line 98
    .line 99
    const/16 v24, 0x1

    .line 100
    .line 101
    const/16 v25, 0x1

    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v26, -0x3f747ae1    # -4.36f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/16 v16, 0x3800

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/high16 v6, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v8, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/high16 v9, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const-string v4, ""

    .line 135
    .line 136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 144
    .line 145
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    const/4 v0, 0x0

    .line 150
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const v0, 0x408e147b    # 4.44f

    .line 167
    .line 168
    .line 169
    const/high16 v2, 0x40800000    # 4.0f

    .line 170
    .line 171
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x40351eb8    # 2.83f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x414bae14    # 12.73f

    .line 181
    .line 182
    .line 183
    const v18, 0x414bae14    # 12.73f

    .line 184
    .line 185
    .line 186
    const v13, 0x40e0f5c3    # 7.03f

    .line 187
    .line 188
    .line 189
    const v15, 0x414bae14    # 12.73f

    .line 190
    .line 191
    .line 192
    const v16, 0x40b66666    # 5.7f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x3e870a3d    # -15.56f

    .line 202
    .line 203
    .line 204
    const v18, -0x3e870a3d    # -15.56f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x3ef68f5c    # -8.59f

    .line 209
    .line 210
    .line 211
    const v15, -0x3f20f5c3    # -6.97f

    .line 212
    .line 213
    .line 214
    const v16, -0x3e870a3d    # -15.56f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x4121999a    # 10.1f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x40351eb8    # 2.83f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x40e23d71    # 7.07f

    .line 236
    .line 237
    .line 238
    const v18, 0x40e23d71    # 7.07f

    .line 239
    .line 240
    .line 241
    const v13, 0x4079999a    # 3.9f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x40e23d71    # 7.07f

    .line 246
    .line 247
    .line 248
    const v16, 0x404ae148    # 3.17f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x3ee1999a    # -9.9f

    .line 258
    .line 259
    .line 260
    const v18, -0x3ee1999a    # -9.9f

    .line 261
    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, -0x3f50f5c3    # -5.47f

    .line 265
    .line 266
    .line 267
    const v15, -0x3f723d71    # -4.43f

    .line 268
    .line 269
    .line 270
    const v16, -0x3ee1999a    # -9.9f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const/16 v16, 0x3800

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const/high16 v6, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    const/high16 v12, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const/4 v15, 0x0

    .line 294
    const-string v4, ""

    .line 295
    .line 296
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sput-object v0, Landroidx/compose/material/icons/twotone/RssFeedKt;->_rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 305
    .line 306
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-object v0
.end method

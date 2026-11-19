.class public final Landroidx/compose/material/icons/outlined/CommentBankKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _commentBank:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCommentBank(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 23

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CommentBankKt;->_commentBank:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CommentBank"

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
    const/high16 v6, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v7, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v8, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    invoke-virtual {v4, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v8, -0x3f600000    # -5.0f

    .line 84
    .line 85
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v8, 0x41000000    # 8.0f

    .line 89
    .line 90
    invoke-virtual {v4, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v8, 0x40200000    # 2.5f

    .line 94
    .line 95
    const/high16 v9, -0x40400000    # -1.5f

    .line 96
    .line 97
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const/16 v16, 0x3800

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    move-object v8, v2

    .line 112
    move-object v2, v4

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    move v9, v6

    .line 116
    const/high16 v6, 0x3f800000    # 1.0f

    .line 117
    .line 118
    move v12, v7

    .line 119
    const/4 v7, 0x0

    .line 120
    move-object v13, v8

    .line 121
    const/high16 v8, 0x3f800000    # 1.0f

    .line 122
    .line 123
    move v14, v9

    .line 124
    const/high16 v9, 0x3f800000    # 1.0f

    .line 125
    .line 126
    move v15, v12

    .line 127
    const/high16 v12, 0x3f800000    # 1.0f

    .line 128
    .line 129
    move-object/from16 v20, v13

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    move/from16 v21, v14

    .line 133
    .line 134
    const/4 v14, 0x0

    .line 135
    move/from16 v22, v15

    .line 136
    .line 137
    const/4 v15, 0x0

    .line 138
    move-object/from16 p0, v0

    .line 139
    .line 140
    move-object/from16 v0, v20

    .line 141
    .line 142
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 143
    .line 144
    .line 145
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 150
    .line 151
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41a00000    # 20.0f

    .line 172
    .line 173
    const/high16 v2, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x40800000    # 4.0f

    .line 179
    .line 180
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x40000000    # 2.0f

    .line 184
    .line 185
    const/high16 v18, 0x40800000    # 4.0f

    .line 186
    .line 187
    const v13, 0x4039999a    # 2.9f

    .line 188
    .line 189
    .line 190
    const/high16 v14, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v15, 0x40000000    # 2.0f

    .line 193
    .line 194
    const v16, 0x4039999a    # 2.9f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v9, 0x41900000    # 18.0f

    .line 201
    .line 202
    invoke-virtual {v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v6, -0x3f800000    # -4.0f

    .line 206
    .line 207
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v15, 0x41600000    # 14.0f

    .line 211
    .line 212
    invoke-virtual {v12, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v18, -0x40000000    # -2.0f

    .line 216
    .line 217
    const v13, 0x3f8ccccd    # 1.1f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const/high16 v15, 0x40000000    # 2.0f

    .line 222
    .line 223
    const v16, -0x4099999a    # -0.9f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x41a00000    # 20.0f

    .line 233
    .line 234
    const/high16 v18, 0x40000000    # 2.0f

    .line 235
    .line 236
    const/high16 v13, 0x41b00000    # 22.0f

    .line 237
    .line 238
    const v14, 0x4039999a    # 2.9f

    .line 239
    .line 240
    .line 241
    const v15, 0x41a8cccd    # 21.1f

    .line 242
    .line 243
    .line 244
    const/high16 v16, 0x40000000    # 2.0f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v6, 0x41800000    # 16.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40c00000    # 6.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, -0x40000000    # -2.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const-string v4, ""

    .line 288
    .line 289
    const/high16 v6, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const/high16 v9, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/high16 v12, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/CommentBankKt;->_commentBank:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 308
    .line 309
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-object v0
.end method

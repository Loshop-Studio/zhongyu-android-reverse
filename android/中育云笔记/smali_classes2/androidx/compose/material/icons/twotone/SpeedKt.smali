.class public final Landroidx/compose/material/icons/twotone/SpeedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _speed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpeed(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SpeedKt;->_speed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Speed"

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
    const v4, 0x41a30a3d    # 20.38f

    .line 71
    .line 72
    .line 73
    const v6, 0x41091eb8    # 8.57f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3feccccd    # 1.85f

    .line 80
    .line 81
    .line 82
    const v6, -0x40628f5c    # -1.23f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v26, -0x419eb852    # -0.22f

    .line 89
    .line 90
    .line 91
    const v27, 0x40f28f5c    # 7.58f

    .line 92
    .line 93
    .line 94
    const/high16 v21, 0x41000000    # 8.0f

    .line 95
    .line 96
    const/high16 v22, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    const/16 v24, 0x0

    .line 101
    .line 102
    const/16 v25, 0x1

    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x40a23d71    # 5.07f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v26, 0x417947ae    # 15.58f

    .line 116
    .line 117
    .line 118
    const v27, 0x40db3333    # 6.85f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcTo(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x3feccccd    # 1.85f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v26, 0x40566666    # 3.35f

    .line 131
    .line 132
    .line 133
    const/high16 v27, 0x41980000    # 19.0f

    .line 134
    .line 135
    const/high16 v21, 0x41200000    # 10.0f

    .line 136
    .line 137
    const/high16 v22, 0x41200000    # 10.0f

    .line 138
    .line 139
    const/16 v25, 0x0

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcTo(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v26, 0x3fdc28f6    # 1.72f

    .line 145
    .line 146
    .line 147
    const/high16 v27, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/high16 v21, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/high16 v22, 0x40000000    # 2.0f

    .line 152
    .line 153
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x415d999a    # 13.85f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v26, 0x3fdeb852    # 1.74f

    .line 163
    .line 164
    .line 165
    const/high16 v27, -0x40800000    # -1.0f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v26, -0x4175c28f    # -0.27f

    .line 171
    .line 172
    .line 173
    const v27, -0x3ed8f5c3    # -10.44f

    .line 174
    .line 175
    .line 176
    const/high16 v21, 0x41200000    # 10.0f

    .line 177
    .line 178
    const/high16 v22, 0x41200000    # 10.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v8, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/high16 v9, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v12, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const-string v4, ""

    .line 207
    .line 208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const v0, 0x412970a4    # 10.59f

    .line 239
    .line 240
    .line 241
    const v2, 0x41768f5c    # 15.41f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v18, 0x40351eb8    # 2.83f

    .line 248
    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    .line 252
    const/high16 v13, 0x40000000    # 2.0f

    .line 253
    .line 254
    const/high16 v14, 0x40000000    # 2.0f

    .line 255
    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x3ef828f6    # -8.49f

    .line 264
    .line 265
    .line 266
    const v2, 0x40b51eb8    # 5.66f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    const v19, 0x40351eb8    # 2.83f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const/16 v16, 0x3800

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/high16 v6, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const/high16 v12, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const-string v4, ""

    .line 302
    .line 303
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Landroidx/compose/material/icons/twotone/SpeedKt;->_speed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 312
    .line 313
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object v0
.end method

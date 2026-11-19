.class public final Landroidx/compose/material/icons/sharp/FiberSmartRecordKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fiberSmartRecord:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFiberSmartRecord(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/FiberSmartRecordKt;->_fiberSmartRecord:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.FiberSmartRecord"

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
    const/high16 v6, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v7, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v6, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x41800000    # 16.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x41000000    # 8.0f

    .line 88
    .line 89
    const/high16 v22, 0x41000000    # 8.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v4

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3e800000    # -16.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    move-object v6, v2

    .line 116
    move-object v2, v4

    .line 117
    const-string v4, ""

    .line 118
    .line 119
    move-object v7, v6

    .line 120
    const/high16 v6, 0x3f800000    # 1.0f

    .line 121
    .line 122
    move-object v8, v7

    .line 123
    const/4 v7, 0x0

    .line 124
    move-object v9, v8

    .line 125
    const/high16 v8, 0x3f800000    # 1.0f

    .line 126
    .line 127
    move-object v12, v9

    .line 128
    const/high16 v9, 0x3f800000    # 1.0f

    .line 129
    .line 130
    move-object v13, v12

    .line 131
    const/high16 v12, 0x3f800000    # 1.0f

    .line 132
    .line 133
    move-object v14, v13

    .line 134
    const/4 v13, 0x0

    .line 135
    move-object v15, v14

    .line 136
    const/4 v14, 0x0

    .line 137
    move-object/from16 v20, v15

    .line 138
    .line 139
    const/4 v15, 0x0

    .line 140
    move-object/from16 p0, v0

    .line 141
    .line 142
    move-object/from16 v0, v20

    .line 143
    .line 144
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 145
    .line 146
    .line 147
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 152
    .line 153
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41880000    # 17.0f

    .line 174
    .line 175
    const v2, 0x408851ec    # 4.26f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x4005c28f    # 2.09f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40800000    # 4.0f

    .line 188
    .line 189
    const v18, 0x40b4cccd    # 5.65f

    .line 190
    .line 191
    .line 192
    const v13, 0x40151eb8    # 2.33f

    .line 193
    .line 194
    .line 195
    const v14, 0x3f51eb85    # 0.82f

    .line 196
    .line 197
    .line 198
    const/high16 v15, 0x40800000    # 4.0f

    .line 199
    .line 200
    const v16, 0x40428f5c    # 3.04f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v2, -0x3f800000    # -4.0f

    .line 207
    .line 208
    const v4, 0x40b4cccd    # 5.65f

    .line 209
    .line 210
    .line 211
    const v6, -0x402a3d71    # -1.67f

    .line 212
    .line 213
    .line 214
    const v7, 0x409a8f5c    # 4.83f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v6, v7, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x40c00000    # 6.0f

    .line 224
    .line 225
    const v18, -0x3f0851ec    # -7.74f

    .line 226
    .line 227
    .line 228
    const v13, 0x405ccccd    # 3.45f

    .line 229
    .line 230
    .line 231
    const v14, -0x409c28f6    # -0.89f

    .line 232
    .line 233
    .line 234
    const/high16 v15, 0x40c00000    # 6.0f

    .line 235
    .line 236
    const v16, -0x3f7fae14    # -4.01f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, -0x3f400000    # -6.0f

    .line 243
    .line 244
    const v2, -0x3f0851ec    # -7.74f

    .line 245
    .line 246
    .line 247
    const v4, -0x3fdccccd    # -2.55f

    .line 248
    .line 249
    .line 250
    const v6, -0x3f24cccd    # -6.85f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const/16 v16, 0x3800

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const-string v4, ""

    .line 268
    .line 269
    const/high16 v6, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const/high16 v12, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const/4 v14, 0x0

    .line 276
    const/4 v15, 0x0

    .line 277
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    sput-object v0, Landroidx/compose/material/icons/sharp/FiberSmartRecordKt;->_fiberSmartRecord:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 286
    .line 287
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/SubdirectoryArrowRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _subdirectoryArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSubdirectoryArrowRight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SubdirectoryArrowRightKt;->_subdirectoryArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SubdirectoryArrowRight"

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
    const v0, 0x419251ec    # 18.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x417b5c29    # 15.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f6d70a4    # -4.58f

    .line 80
    .line 81
    .line 82
    const v2, 0x40928f5c    # 4.58f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x404a3d71    # -1.42f

    .line 89
    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const v13, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v14, 0x3ec7ae14    # 0.39f

    .line 97
    .line 98
    .line 99
    const v15, -0x407c28f6    # -1.03f

    .line 100
    .line 101
    .line 102
    const v16, 0x3ec7ae14    # 0.39f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const v18, -0x404a3d71    # -1.42f

    .line 111
    .line 112
    .line 113
    const v14, -0x413851ec    # -0.39f

    .line 114
    .line 115
    .line 116
    const v15, -0x413851ec    # -0.39f

    .line 117
    .line 118
    .line 119
    const v16, -0x407c28f6    # -1.03f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x4172b852    # 15.17f

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x40a00000    # 5.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, -0x40800000    # -1.0f

    .line 139
    .line 140
    const/high16 v18, -0x40800000    # -1.0f

    .line 141
    .line 142
    const v13, -0x40f33333    # -0.55f

    .line 143
    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    const/high16 v15, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v16, -0x4119999a    # -0.45f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const v14, -0x40f33333    # -0.55f

    .line 161
    .line 162
    .line 163
    const v15, 0x3ee66666    # 0.45f

    .line 164
    .line 165
    .line 166
    const/high16 v16, -0x40800000    # -1.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x3ee66666    # 0.45f

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x3f800000    # 1.0f

    .line 175
    .line 176
    invoke-virtual {v12, v4, v0, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x41100000    # 9.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x4112b852    # 9.17f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, -0x3fc7ae14    # -2.88f

    .line 191
    .line 192
    .line 193
    const v4, -0x3fc851ec    # -2.87f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const v18, -0x404a3d71    # -1.42f

    .line 202
    .line 203
    .line 204
    const v13, -0x413851ec    # -0.39f

    .line 205
    .line 206
    .line 207
    const v14, -0x413851ec    # -0.39f

    .line 208
    .line 209
    .line 210
    const v15, -0x413851ec    # -0.39f

    .line 211
    .line 212
    .line 213
    const v16, -0x407c28f6    # -1.03f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3fb5c28f    # 1.42f

    .line 220
    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    const v13, 0x3ec7ae14    # 0.39f

    .line 225
    .line 226
    .line 227
    const v15, 0x3f83d70a    # 1.03f

    .line 228
    .line 229
    .line 230
    const v16, -0x413851ec    # -0.39f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const v18, 0x3fb5c28f    # 1.42f

    .line 242
    .line 243
    .line 244
    const v14, 0x3ec7ae14    # 0.39f

    .line 245
    .line 246
    .line 247
    const v15, 0x3ec7ae14    # 0.39f

    .line 248
    .line 249
    .line 250
    const v16, 0x3f83d70a    # 1.03f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v8, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/high16 v9, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v12, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    sput-object v0, Landroidx/compose/material/icons/rounded/SubdirectoryArrowRightKt;->_subdirectoryArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 290
    .line 291
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-object v0
.end method

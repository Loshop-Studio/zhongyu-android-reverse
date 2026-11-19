.class public final Landroidx/compose/material/icons/rounded/EastKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _east:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEast(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EastKt;->_east:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.East"

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
    const v0, 0x4164a3d7    # 14.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b6b852    # 5.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const v18, 0x3fb47ae1    # 1.41f

    .line 85
    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, 0x3ec7ae14    # 0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v16, 0x3f828f5c    # 1.02f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x41915c29    # 18.17f

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x41300000    # 11.0f

    .line 106
    .line 107
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x40400000    # 3.0f

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, -0x40800000    # -1.0f

    .line 116
    .line 117
    const/high16 v18, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, 0x3f0ccccd    # 0.55f

    .line 139
    .line 140
    .line 141
    const v15, 0x3ee66666    # 0.45f

    .line 142
    .line 143
    .line 144
    const/high16 v16, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x4172e148    # 15.18f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, -0x3f87ae14    # -3.88f

    .line 156
    .line 157
    .line 158
    const v6, 0x407851ec    # 3.88f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const v18, 0x3fb47ae1    # 1.41f

    .line 167
    .line 168
    .line 169
    const v13, -0x413851ec    # -0.39f

    .line 170
    .line 171
    .line 172
    const v14, 0x3ec7ae14    # 0.39f

    .line 173
    .line 174
    .line 175
    const v15, -0x413851ec    # -0.39f

    .line 176
    .line 177
    .line 178
    const v16, 0x3f828f5c    # 1.02f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x3fb47ae1    # 1.41f

    .line 188
    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const v13, 0x3ec7ae14    # 0.39f

    .line 193
    .line 194
    .line 195
    const v15, 0x3f828f5c    # 1.02f

    .line 196
    .line 197
    .line 198
    const v16, 0x3ec7ae14    # 0.39f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x40b2e148    # 5.59f

    .line 205
    .line 206
    .line 207
    const v4, -0x3f4d1eb8    # -5.59f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const v18, -0x404b851f    # -1.41f

    .line 216
    .line 217
    .line 218
    const v14, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    const v15, 0x3ec7ae14    # 0.39f

    .line 222
    .line 223
    .line 224
    const v16, -0x407d70a4    # -1.02f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x417b3333    # 15.7f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x4164a3d7    # 14.29f

    .line 237
    .line 238
    .line 239
    const v18, 0x40b6b852    # 5.71f

    .line 240
    .line 241
    .line 242
    const v13, 0x41751eb8    # 15.32f

    .line 243
    .line 244
    .line 245
    const v14, 0x40aa3d71    # 5.32f

    .line 246
    .line 247
    .line 248
    const v15, 0x416ae148    # 14.68f

    .line 249
    .line 250
    .line 251
    const v16, 0x40aa3d71    # 5.32f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const/16 v16, 0x3800

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    const-string v4, ""

    .line 269
    .line 270
    const/high16 v6, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const/high16 v8, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v9, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/high16 v12, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const/4 v14, 0x0

    .line 281
    const/4 v15, 0x0

    .line 282
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    sput-object v0, Landroidx/compose/material/icons/rounded/EastKt;->_east:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 291
    .line 292
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-object v0
.end method

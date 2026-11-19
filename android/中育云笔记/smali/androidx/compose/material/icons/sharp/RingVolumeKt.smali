.class public final Landroidx/compose/material/icons/sharp/RingVolumeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRingVolume(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.RingVolume"

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
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

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
    sget-object v2, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

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
    const v2, 0x41a947ae    # 21.16f

    .line 71
    .line 72
    .line 73
    const v4, 0x40c851ec    # 6.26f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v2, -0x404b851f    # -1.41f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v2, -0x3f9c28f6    # -3.56f

    .line 86
    .line 87
    .line 88
    const v6, 0x40633333    # 3.55f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v2, 0x3fb47ae1    # 1.41f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v2, 0x4063d70a    # 3.56f

    .line 101
    .line 102
    .line 103
    const v6, -0x3f9ccccd    # -3.55f

    .line 104
    .line 105
    .line 106
    const v7, 0x405ccccd    # 3.45f

    .line 107
    .line 108
    .line 109
    const v8, -0x3f9eb852    # -3.52f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v7, v8, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v2, 0x41300000    # 11.0f

    .line 119
    .line 120
    const/high16 v6, 0x40000000    # 2.0f

    .line 121
    .line 122
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v2, 0x40a00000    # 5.0f

    .line 129
    .line 130
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v2, -0x40000000    # -2.0f

    .line 134
    .line 135
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v2, 0x40cccccd    # 6.4f

    .line 142
    .line 143
    .line 144
    const v6, 0x411cf5c3    # 9.81f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v2, 0x40f9eb85    # 7.81f

    .line 151
    .line 152
    .line 153
    const v6, 0x41066666    # 8.4f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v2, 0x408851ec    # 4.26f

    .line 160
    .line 161
    .line 162
    const v6, 0x409ae148    # 4.84f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v2, 0x4035c28f    # 2.84f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x4063d70a    # 3.56f

    .line 175
    .line 176
    .line 177
    const v18, 0x40633333    # 3.55f

    .line 178
    .line 179
    .line 180
    const v13, 0x3de147ae    # 0.11f

    .line 181
    .line 182
    .line 183
    const v14, 0x3cf5c28f    # 0.03f

    .line 184
    .line 185
    .line 186
    const v15, 0x4063d70a    # 3.56f

    .line 187
    .line 188
    .line 189
    const v16, 0x40633333    # 3.55f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/4 v2, 0x0

    .line 199
    const v4, 0x418b1eb8    # 17.39f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v2, 0x406b851f    # 3.68f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v2, 0x407ae148    # 3.92f

    .line 212
    .line 213
    .line 214
    const v6, -0x3fb8f5c3    # -3.11f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v2, -0x3fa851ec    # -3.37f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x410ccccd    # 8.8f

    .line 227
    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const v13, 0x40366666    # 2.85f

    .line 232
    .line 233
    .line 234
    const v14, -0x4091eb85    # -0.93f

    .line 235
    .line 236
    .line 237
    const v15, 0x40be147b    # 5.94f

    .line 238
    .line 239
    .line 240
    const v16, -0x4091eb85    # -0.93f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v2, 0x405851ec    # 3.38f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v2, 0x407a3d71    # 3.91f

    .line 253
    .line 254
    .line 255
    const v6, 0x40466666    # 3.1f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, -0x3e400000    # -24.0f

    .line 265
    .line 266
    const v13, -0x3f32e148    # -6.41f

    .line 267
    .line 268
    .line 269
    const v14, -0x3f19eb85    # -7.19f

    .line 270
    .line 271
    .line 272
    const v15, -0x3e7347ae    # -17.59f

    .line 273
    .line 274
    .line 275
    const v16, -0x3f19eb85    # -7.19f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/16 v16, 0x3800

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const-string v4, ""

    .line 293
    .line 294
    const/high16 v6, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const/high16 v8, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v9, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/high16 v12, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    sput-object v0, Landroidx/compose/material/icons/sharp/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 315
    .line 316
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-object v0
.end method

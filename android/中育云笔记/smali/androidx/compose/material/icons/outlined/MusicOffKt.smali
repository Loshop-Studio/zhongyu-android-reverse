.class public final Landroidx/compose/material/icons/outlined/MusicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _musicOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMusicOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MusicOffKt;->_musicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.MusicOff"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41900000    # 18.0f

    .line 83
    .line 84
    const/high16 v2, 0x40400000    # 3.0f

    .line 85
    .line 86
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v0, -0x3f400000    # -6.0f

    .line 90
    .line 91
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x4093851f    # 4.61f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x41400000    # 12.0f

    .line 109
    .line 110
    const v6, 0x41270a3d    # 10.44f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v7, 0x408d1eb8    # 4.41f

    .line 117
    .line 118
    .line 119
    const v8, 0x40370a3d    # 2.86f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v7, 0x4088a3d7    # 4.27f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v2, 0x3e8f5c29    # 0.28f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, -0x3faae148    # -3.33f

    .line 143
    .line 144
    .line 145
    const v18, -0x415c28f6    # -0.32f

    .line 146
    .line 147
    .line 148
    const v13, -0x408f5c29    # -0.94f

    .line 149
    .line 150
    .line 151
    const v14, -0x40f5c28f    # -0.54f

    .line 152
    .line 153
    .line 154
    const v15, -0x3ff9999a    # -2.1f

    .line 155
    .line 156
    .line 157
    const/high16 v16, -0x40c00000    # -0.75f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x3fd8f5c3    # -2.61f

    .line 163
    .line 164
    .line 165
    const v18, 0x40447ae1    # 3.07f

    .line 166
    .line 167
    .line 168
    const v13, -0x40547ae1    # -1.34f

    .line 169
    .line 170
    .line 171
    const v14, 0x3ef5c28f    # 0.48f

    .line 172
    .line 173
    .line 174
    const v15, -0x3fe851ec    # -2.37f

    .line 175
    .line 176
    .line 177
    const v16, 0x3fd5c28f    # 1.67f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x4092e148    # 4.59f

    .line 184
    .line 185
    .line 186
    const v18, 0x4094cccd    # 4.65f

    .line 187
    .line 188
    .line 189
    const v13, -0x41147ae1    # -0.46f

    .line 190
    .line 191
    .line 192
    const v14, 0x402f5c29    # 2.74f

    .line 193
    .line 194
    .line 195
    const v15, 0x3fee147b    # 1.86f

    .line 196
    .line 197
    .line 198
    const v16, 0x40a28f5c    # 5.08f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x40566666    # 3.35f

    .line 205
    .line 206
    .line 207
    const v18, -0x3f7ccccd    # -4.1f

    .line 208
    .line 209
    .line 210
    const v13, 0x3ffae148    # 1.96f

    .line 211
    .line 212
    .line 213
    const v14, -0x416147ae    # -0.31f

    .line 214
    .line 215
    .line 216
    const v15, 0x40566666    # 3.35f

    .line 217
    .line 218
    .line 219
    const v16, -0x3ff8f5c3    # -2.11f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v2, -0x4035c28f    # -1.58f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v2, 0x419dd70a    # 19.73f

    .line 232
    .line 233
    .line 234
    const/high16 v7, 0x41a80000    # 21.0f

    .line 235
    .line 236
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v2, 0x3fb47ae1    # 1.41f

    .line 240
    .line 241
    .line 242
    const v7, -0x404b851f    # -1.41f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v2, 0x41200000    # 10.0f

    .line 255
    .line 256
    const/high16 v4, 0x41980000    # 19.0f

    .line 257
    .line 258
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, -0x40000000    # -2.0f

    .line 262
    .line 263
    const/high16 v18, -0x40000000    # -2.0f

    .line 264
    .line 265
    const v13, -0x40733333    # -1.1f

    .line 266
    .line 267
    .line 268
    const/4 v14, 0x0

    .line 269
    const/high16 v15, -0x40000000    # -2.0f

    .line 270
    .line 271
    const v16, -0x4099999a    # -0.9f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v2, 0x3f666666    # 0.9f

    .line 278
    .line 279
    .line 280
    const/high16 v4, -0x40000000    # -2.0f

    .line 281
    .line 282
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v2, -0x4099999a    # -0.9f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    const/16 v16, 0x3800

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    const-string v4, ""

    .line 306
    .line 307
    const/high16 v6, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/4 v7, 0x0

    .line 310
    const/high16 v8, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/high16 v9, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/high16 v12, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const/4 v15, 0x0

    .line 318
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sput-object v0, Landroidx/compose/material/icons/outlined/MusicOffKt;->_musicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 327
    .line 328
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-object v0
.end method

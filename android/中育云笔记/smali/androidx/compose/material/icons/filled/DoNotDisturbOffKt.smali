.class public final Landroidx/compose/material/icons/filled/DoNotDisturbOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotDisturbOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DoNotDisturbOffKt;->_doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DoNotDisturbOff"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v6, -0x40451eb8    # -1.46f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v6, 0x4095c28f    # 4.68f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41b00000    # 22.0f

    .line 95
    .line 96
    const/high16 v18, 0x41400000    # 12.0f

    .line 97
    .line 98
    const v13, 0x41aab852    # 21.34f

    .line 99
    .line 100
    .line 101
    const v14, 0x41808f5c    # 16.07f

    .line 102
    .line 103
    .line 104
    const/high16 v15, 0x41b00000    # 22.0f

    .line 105
    .line 106
    const v16, 0x4161c28f    # 14.11f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 113
    .line 114
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const v14, -0x3f4f5c29    # -5.52f

    .line 118
    .line 119
    .line 120
    const v15, -0x3f70a3d7    # -4.48f

    .line 121
    .line 122
    .line 123
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x3f4a3d71    # -5.68f

    .line 129
    .line 130
    .line 131
    const v18, 0x3fe3d70a    # 1.78f

    .line 132
    .line 133
    .line 134
    const v13, -0x3ff8f5c3    # -2.11f

    .line 135
    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const v15, -0x3f7dc28f    # -4.07f

    .line 139
    .line 140
    .line 141
    const v16, 0x3f28f5c3    # 0.66f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v6, 0x4158a3d7    # 13.54f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x401147ae    # 2.27f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const v7, 0x40628f5c    # 3.54f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v6, 0x4031eb85    # 2.78f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v18, 0x41400000    # 12.0f

    .line 182
    .line 183
    const v13, 0x402a3d71    # 2.66f

    .line 184
    .line 185
    .line 186
    const v14, 0x40fdc28f    # 7.93f

    .line 187
    .line 188
    .line 189
    const/high16 v15, 0x40000000    # 2.0f

    .line 190
    .line 191
    const v16, 0x411e3d71    # 9.89f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x41200000    # 10.0f

    .line 198
    .line 199
    const/high16 v18, 0x41200000    # 10.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, 0x40b0a3d7    # 5.52f

    .line 203
    .line 204
    .line 205
    const v15, 0x408f5c29    # 4.48f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x41200000    # 10.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x40b5c28f    # 5.68f

    .line 214
    .line 215
    .line 216
    const v18, -0x401c28f6    # -1.78f

    .line 217
    .line 218
    .line 219
    const v13, 0x40070a3d    # 2.11f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const v15, 0x40823d71    # 4.07f

    .line 224
    .line 225
    .line 226
    const v16, -0x40d70a3d    # -0.66f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v6, 0x41a3ae14    # 20.46f

    .line 233
    .line 234
    .line 235
    const/high16 v7, 0x41b80000    # 23.0f

    .line 236
    .line 237
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v6, 0x3fa28f5c    # 1.27f

    .line 241
    .line 242
    .line 243
    const v7, -0x405d70a4    # -1.27f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x41500000    # 13.0f

    .line 259
    .line 260
    const/high16 v2, 0x40e00000    # 7.0f

    .line 261
    .line 262
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, -0x40000000    # -2.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x3fbae148    # 1.46f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const/16 v16, 0x3800

    .line 290
    .line 291
    const/16 v17, 0x0

    .line 292
    .line 293
    const-string v4, ""

    .line 294
    .line 295
    const/high16 v6, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/high16 v8, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v9, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v12, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/filled/DoNotDisturbOffKt;->_doNotDisturbOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 315
    .line 316
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-object v0
.end method

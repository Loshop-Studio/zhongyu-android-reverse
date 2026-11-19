.class public final Landroidx/compose/material/icons/filled/PrintDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _printDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPrintDisabled(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PrintDisabledKt;->_printDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PrintDisabled"

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
    const v0, 0x4198cccd    # 19.1f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41b00000    # 22.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, -0x3f400000    # -6.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 89
    .line 90
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const v14, -0x40266666    # -1.7f

    .line 94
    .line 95
    .line 96
    const v15, -0x4059999a    # -1.3f

    .line 97
    .line 98
    .line 99
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x4111999a    # 9.1f

    .line 110
    .line 111
    .line 112
    const/high16 v2, 0x41100000    # 9.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41200000    # 10.0f

    .line 121
    .line 122
    const/high16 v4, 0x41980000    # 19.0f

    .line 123
    .line 124
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/high16 v18, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const v13, 0x3f0ccccd    # 0.55f

    .line 132
    .line 133
    .line 134
    const/4 v14, 0x0

    .line 135
    const/high16 v15, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const v16, 0x3ee66666    # 0.45f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, -0x4119999a    # -0.45f

    .line 144
    .line 145
    .line 146
    const/high16 v6, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/high16 v7, -0x40800000    # -1.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v7, v0, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x3ee66666    # 0.45f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41900000    # 18.0f

    .line 166
    .line 167
    const/high16 v6, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v7, 0x40400000    # 3.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x40c00000    # 6.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v8, 0x3f8ccccd    # 1.1f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v2, 0x3f99999a    # 1.2f

    .line 195
    .line 196
    .line 197
    const v6, 0x3fe66666    # 1.8f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v2, 0x409ccccd    # 4.9f

    .line 208
    .line 209
    .line 210
    const/high16 v6, 0x40a00000    # 5.0f

    .line 211
    .line 212
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/high16 v18, 0x41300000    # 11.0f

    .line 218
    .line 219
    const v13, 0x40533333    # 3.3f

    .line 220
    .line 221
    .line 222
    const v14, 0x4101999a    # 8.1f

    .line 223
    .line 224
    .line 225
    const/high16 v15, 0x40000000    # 2.0f

    .line 226
    .line 227
    const v16, 0x41166666    # 9.4f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x40800000    # 4.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x413e6666    # 11.9f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3fa66666    # 1.3f

    .line 254
    .line 255
    .line 256
    const v2, -0x4059999a    # -1.3f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, -0x3e580000    # -21.0f

    .line 263
    .line 264
    const v2, -0x3e58cccd    # -20.9f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41000000    # 8.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v2, -0x3f600000    # -5.0f

    .line 279
    .line 280
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v2, 0x4039999a    # 2.9f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/16 v16, 0x3800

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const-string v4, ""

    .line 307
    .line 308
    const/high16 v6, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/high16 v8, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v9, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/high16 v12, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const/4 v14, 0x0

    .line 319
    const/4 v15, 0x0

    .line 320
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    sput-object v0, Landroidx/compose/material/icons/filled/PrintDisabledKt;->_printDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 329
    .line 330
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    return-object v0
.end method

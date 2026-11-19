.class public final Landroidx/compose/material/icons/outlined/ThumbDownOffAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbDownOffAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ThumbDownOffAltKt;->_thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ThumbDownOffAlt"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x40851eb8    # 4.16f

    .line 83
    .line 84
    .line 85
    const v18, 0x40870a3d    # 4.22f

    .line 86
    .line 87
    .line 88
    const v13, 0x40a570a4    # 5.17f

    .line 89
    .line 90
    .line 91
    const/high16 v14, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v15, 0x408eb852    # 4.46f

    .line 94
    .line 95
    .line 96
    const/high16 v16, 0x40600000    # 3.5f

    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, -0x3fbeb852    # -3.02f

    .line 102
    .line 103
    .line 104
    const v6, 0x40e1999a    # 7.05f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/high16 v18, 0x41400000    # 12.0f

    .line 113
    .line 114
    const v13, 0x3f866666    # 1.05f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x41380000    # 11.5f

    .line 118
    .line 119
    const/high16 v15, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const v16, 0x413bd70a    # 11.74f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/high16 v18, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3f8ccccd    # 1.1f

    .line 138
    .line 139
    .line 140
    const v15, 0x3f666666    # 0.9f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x40c9eb85    # 6.31f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, -0x408ccccd    # -0.95f

    .line 155
    .line 156
    .line 157
    const v6, 0x40923d71    # 4.57f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, -0x430a3d71    # -0.03f

    .line 164
    .line 165
    .line 166
    const v6, 0x3ea3d70a    # 0.32f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x3ee147ae    # 0.44f

    .line 173
    .line 174
    .line 175
    const v18, 0x3f87ae14    # 1.06f

    .line 176
    .line 177
    .line 178
    const v14, 0x3ed1eb85    # 0.41f

    .line 179
    .line 180
    .line 181
    const v15, 0x3e2e147b    # 0.17f

    .line 182
    .line 183
    .line 184
    const v16, 0x3f4a3d71    # 0.79f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x411d47ae    # 9.83f

    .line 191
    .line 192
    .line 193
    const/high16 v6, 0x41b80000    # 23.0f

    .line 194
    .line 195
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x40d2e148    # 6.59f

    .line 199
    .line 200
    .line 201
    const v6, -0x3f2d1eb8    # -6.59f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x41880000    # 17.0f

    .line 208
    .line 209
    const/high16 v18, 0x41700000    # 15.0f

    .line 210
    .line 211
    const v13, 0x41863d71    # 16.78f

    .line 212
    .line 213
    .line 214
    const v14, 0x41806666    # 16.05f

    .line 215
    .line 216
    .line 217
    const/high16 v15, 0x41880000    # 17.0f

    .line 218
    .line 219
    const v16, 0x4178cccd    # 15.55f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x40a00000    # 5.0f

    .line 226
    .line 227
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x41700000    # 15.0f

    .line 231
    .line 232
    const/high16 v18, 0x40400000    # 3.0f

    .line 233
    .line 234
    const/high16 v13, 0x41880000    # 17.0f

    .line 235
    .line 236
    const v14, 0x4079999a    # 3.9f

    .line 237
    .line 238
    .line 239
    const v15, 0x4180cccd    # 16.1f

    .line 240
    .line 241
    .line 242
    const/high16 v16, 0x40400000    # 3.0f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, -0x3f751eb8    # -4.34f

    .line 254
    .line 255
    .line 256
    const v6, 0x408ae148    # 4.34f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x41600000    # 14.0f

    .line 263
    .line 264
    const/high16 v6, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, -0x40000000    # -2.0f

    .line 273
    .line 274
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, -0x3f200000    # -7.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x41100000    # 9.0f

    .line 283
    .line 284
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41980000    # 19.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x40800000    # 4.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, -0x3f800000    # -4.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/16 v16, 0x3800

    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    const-string v4, ""

    .line 326
    .line 327
    const/high16 v6, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const/high16 v8, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v9, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v12, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const/4 v14, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    sput-object v0, Landroidx/compose/material/icons/outlined/ThumbDownOffAltKt;->_thumbDownOffAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 348
    .line 349
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    return-object v0
.end method

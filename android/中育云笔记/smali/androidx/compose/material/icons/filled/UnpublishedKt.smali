.class public final Landroidx/compose/material/icons/filled/UnpublishedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUnpublished(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/UnpublishedKt;->_unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Unpublished"

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
    const v0, 0x41a9851f    # 21.19f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x4033d70a    # 2.81f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, 0x3fb1eb85    # 1.39f

    .line 83
    .line 84
    .line 85
    const v2, 0x40870a3d    # 4.22f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, 0x401147ae    # 2.27f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40000000    # 2.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v13, 0x40270a3d    # 2.61f

    .line 102
    .line 103
    .line 104
    const v14, 0x41011eb8    # 8.07f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v16, 0x411f5c29    # 9.96f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x41200000    # 10.0f

    .line 116
    .line 117
    const/high16 v18, 0x41200000    # 10.0f

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, 0x40b0a3d7    # 5.52f

    .line 121
    .line 122
    .line 123
    const v15, 0x408f5c29    # 4.48f

    .line 124
    .line 125
    .line 126
    const/high16 v16, 0x41200000    # 10.0f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x40b051ec    # 5.51f

    .line 132
    .line 133
    .line 134
    const v18, -0x402b851f    # -1.66f

    .line 135
    .line 136
    .line 137
    const v13, 0x40028f5c    # 2.04f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const v15, 0x407b851f    # 3.93f

    .line 142
    .line 143
    .line 144
    const v16, -0x40e3d70a    # -0.61f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x41a9851f    # 21.19f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x4184cccd    # 16.6f

    .line 163
    .line 164
    .line 165
    const v2, 0x412970a4    # 10.59f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3f7851ec    # -4.24f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, -0x404b851f    # -1.41f

    .line 178
    .line 179
    .line 180
    const v2, 0x3fb47ae1    # 1.41f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40351eb8    # 2.83f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3e3851ec    # 0.18f

    .line 193
    .line 194
    .line 195
    const v2, -0x41c7ae14    # -0.18f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x3fb47ae1    # 1.41f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x4184cccd    # 16.6f

    .line 208
    .line 209
    .line 210
    const v2, 0x412970a4    # 10.59f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x412c28f6    # 10.76f

    .line 220
    .line 221
    .line 222
    const v2, 0x415970a4    # 13.59f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3f1ccccd    # -7.1f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, 0x41400000    # 12.0f

    .line 235
    .line 236
    const/high16 v18, 0x40000000    # 2.0f

    .line 237
    .line 238
    const v13, 0x41011eb8    # 8.07f

    .line 239
    .line 240
    .line 241
    const v14, 0x40270a3d    # 2.61f

    .line 242
    .line 243
    .line 244
    const v15, 0x411f5c29    # 9.96f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x40000000    # 2.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x41200000    # 10.0f

    .line 253
    .line 254
    const/high16 v18, 0x41200000    # 10.0f

    .line 255
    .line 256
    const v13, 0x40b0a3d7    # 5.52f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/high16 v15, 0x41200000    # 10.0f

    .line 261
    .line 262
    const v16, 0x408f5c29    # 4.48f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x402b851f    # -1.66f

    .line 269
    .line 270
    .line 271
    const v18, 0x40b051ec    # 5.51f

    .line 272
    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const v14, 0x40028f5c    # 2.04f

    .line 276
    .line 277
    .line 278
    const v15, -0x40e3d70a    # -0.61f

    .line 279
    .line 280
    .line 281
    const v16, 0x407b851f    # 3.93f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x3f551eb8    # -5.34f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x4029999a    # 2.65f

    .line 294
    .line 295
    .line 296
    const v2, -0x3fd66666    # -2.65f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x404b851f    # -1.41f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x412c28f6    # 10.76f

    .line 309
    .line 310
    .line 311
    const v2, 0x415970a4    # 13.59f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const/16 v16, 0x3800

    .line 325
    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const/high16 v6, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/high16 v8, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v7, 0x0

    .line 333
    const/high16 v9, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/high16 v12, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/4 v14, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    const-string v4, ""

    .line 340
    .line 341
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    sput-object v0, Landroidx/compose/material/icons/filled/UnpublishedKt;->_unpublished:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 350
    .line 351
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    return-object v0
.end method

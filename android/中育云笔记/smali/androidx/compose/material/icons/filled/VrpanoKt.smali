.class public final Landroidx/compose/material/icons/filled/VrpanoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVrpano(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Vrpano"

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
    const v0, 0x41a5851f    # 20.69f

    .line 71
    .line 72
    .line 73
    const v2, 0x4081999a    # 4.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x40b00000    # 5.5f

    .line 82
    .line 83
    const v13, 0x419547ae    # 18.66f

    .line 84
    .line 85
    .line 86
    const v14, 0x40975c29    # 4.73f

    .line 87
    .line 88
    .line 89
    const v15, 0x417dc28f    # 15.86f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40b00000    # 5.5f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3ef4f5c3    # -8.69f

    .line 98
    .line 99
    .line 100
    const v18, -0x4048f5c3    # -1.43f

    .line 101
    .line 102
    .line 103
    const v13, -0x3f870a3d    # -3.89f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, -0x3f21999a    # -6.95f

    .line 108
    .line 109
    .line 110
    const v16, -0x40a8f5c3    # -0.84f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v18, 0x40a0a3d7    # 5.02f

    .line 119
    .line 120
    .line 121
    const v13, 0x402ae148    # 2.67f

    .line 122
    .line 123
    .line 124
    const v14, 0x40766666    # 3.85f

    .line 125
    .line 126
    .line 127
    const/high16 v15, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v16, 0x408a8f5c    # 4.33f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41980000    # 19.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3fa7ae14    # 1.31f

    .line 141
    .line 142
    .line 143
    const v18, 0x3f733333    # 0.95f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f2e147b    # 0.68f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f28f5c3    # 0.66f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f95c28f    # 1.17f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41400000    # 12.0f

    .line 160
    .line 161
    const/high16 v18, 0x41940000    # 18.5f

    .line 162
    .line 163
    const v13, 0x40ab851f    # 5.36f

    .line 164
    .line 165
    .line 166
    const v14, 0x419a147b    # 19.26f

    .line 167
    .line 168
    .line 169
    const v15, 0x4101999a    # 8.1f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x41940000    # 18.5f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x410b0a3d    # 8.69f

    .line 178
    .line 179
    .line 180
    const v18, 0x3fb9999a    # 1.45f

    .line 181
    .line 182
    .line 183
    const v13, 0x4077ae14    # 3.87f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const v15, 0x40d51eb8    # 6.66f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f428f5c    # 0.76f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41b00000    # 22.0f

    .line 197
    .line 198
    const/high16 v18, 0x41980000    # 19.0f

    .line 199
    .line 200
    const v13, 0x41aab852    # 21.34f

    .line 201
    .line 202
    .line 203
    const v14, 0x41a147ae    # 20.16f

    .line 204
    .line 205
    .line 206
    const/high16 v15, 0x41b00000    # 22.0f

    .line 207
    .line 208
    const v16, 0x419d70a4    # 19.68f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x40a00000    # 5.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x41a5851f    # 20.69f

    .line 220
    .line 221
    .line 222
    const v18, 0x4081999a    # 4.05f

    .line 223
    .line 224
    .line 225
    const/high16 v13, 0x41b00000    # 22.0f

    .line 226
    .line 227
    const v14, 0x408a3d71    # 4.32f

    .line 228
    .line 229
    .line 230
    const v15, 0x41aab852    # 21.34f

    .line 231
    .line 232
    .line 233
    const v16, 0x4075c28f    # 3.84f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41400000    # 12.0f

    .line 243
    .line 244
    const/high16 v2, 0x41700000    # 15.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x3f2f5c29    # -6.52f

    .line 250
    .line 251
    .line 252
    const v18, 0x3ed1eb85    # 0.41f

    .line 253
    .line 254
    .line 255
    const v13, -0x3fea3d71    # -2.34f

    .line 256
    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const v15, -0x3f6f5c29    # -4.52f

    .line 260
    .line 261
    .line 262
    const v16, 0x3e19999a    # 0.15f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x406c28f6    # 3.69f

    .line 269
    .line 270
    .line 271
    const v2, -0x3f728f5c    # -4.42f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40000000    # 2.0f

    .line 278
    .line 279
    const v2, 0x4019999a    # 2.4f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41600000    # 14.0f

    .line 286
    .line 287
    const/high16 v2, 0x41200000    # 10.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x409051ec    # 4.51f

    .line 293
    .line 294
    .line 295
    const v2, 0x40accccd    # 5.4f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41400000    # 12.0f

    .line 302
    .line 303
    const/high16 v18, 0x41700000    # 15.0f

    .line 304
    .line 305
    const v13, 0x418428f6    # 16.52f

    .line 306
    .line 307
    .line 308
    const v14, 0x41726666    # 15.15f

    .line 309
    .line 310
    .line 311
    const v15, 0x4164cccd    # 14.3f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x41700000    # 15.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    const/16 v16, 0x3800

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const/high16 v6, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v8, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const/high16 v9, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/high16 v12, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const/4 v14, 0x0

    .line 341
    const/4 v15, 0x0

    .line 342
    const-string v4, ""

    .line 343
    .line 344
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sput-object v0, Landroidx/compose/material/icons/filled/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 353
    .line 354
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    return-object v0
.end method

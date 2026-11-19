.class public final Landroidx/compose/material/icons/rounded/NearMeDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nearMeDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNearMeDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NearMeDisabledKt;->_nearMeDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NearMeDisabled"

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
    const v0, 0x40cae148    # 6.34f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40de6666    # 6.95f

    .line 79
    .line 80
    .line 81
    const v2, -0x3fdae148    # -2.58f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x3fa51eb8    # 1.29f

    .line 88
    .line 89
    .line 90
    const v18, 0x3fa51eb8    # 1.29f

    .line 91
    .line 92
    .line 93
    const v13, 0x3f4ccccd    # 0.8f

    .line 94
    .line 95
    .line 96
    const v14, -0x41666666    # -0.3f

    .line 97
    .line 98
    .line 99
    const v15, 0x3fca3d71    # 1.58f

    .line 100
    .line 101
    .line 102
    const v16, 0x3ef5c28f    # 0.48f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x418d47ae    # 17.66f

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x41400000    # 12.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40cae148    # 6.34f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x41af3333    # 21.9f

    .line 126
    .line 127
    .line 128
    const v2, 0x41988f5c    # 19.07f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x409dc28f    # 4.93f

    .line 135
    .line 136
    .line 137
    const v2, 0x40066666    # 2.1f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x404b851f    # -1.41f

    .line 144
    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const v13, -0x413851ec    # -0.39f

    .line 149
    .line 150
    .line 151
    const v14, -0x413851ec    # -0.39f

    .line 152
    .line 153
    .line 154
    const v15, -0x407d70a4    # -1.02f

    .line 155
    .line 156
    .line 157
    const v16, -0x413851ec    # -0.39f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v18, 0x3fb47ae1    # 1.41f

    .line 166
    .line 167
    .line 168
    const v14, 0x3ec7ae14    # 0.39f

    .line 169
    .line 170
    .line 171
    const v15, -0x413851ec    # -0.39f

    .line 172
    .line 173
    .line 174
    const v16, 0x3f828f5c    # 1.02f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x408b851f    # 4.36f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x3fc7ae14    # 1.56f

    .line 187
    .line 188
    .line 189
    const v2, -0x3f79999a    # -4.2f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x40400000    # 3.0f

    .line 196
    .line 197
    const v18, 0x41266666    # 10.4f

    .line 198
    .line 199
    .line 200
    const v13, 0x405147ae    # 3.27f

    .line 201
    .line 202
    .line 203
    const v14, 0x411970a4    # 9.59f

    .line 204
    .line 205
    .line 206
    const/high16 v15, 0x40400000    # 3.0f

    .line 207
    .line 208
    const v16, 0x411f851f    # 9.97f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x3f266666    # 0.65f

    .line 215
    .line 216
    .line 217
    const v18, 0x3f75c28f    # 0.96f

    .line 218
    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const v14, 0x3ed70a3d    # 0.42f

    .line 222
    .line 223
    .line 224
    const v15, 0x3e851eb8    # 0.26f

    .line 225
    .line 226
    .line 227
    const v16, 0x3f4ccccd    # 0.8f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40247ae1    # 2.57f

    .line 234
    .line 235
    .line 236
    const v2, 0x40cd70a4    # 6.42f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, 0x4159999a    # 13.6f

    .line 246
    .line 247
    .line 248
    const/high16 v18, 0x41a80000    # 21.0f

    .line 249
    .line 250
    const v13, 0x414ccccd    # 12.8f

    .line 251
    .line 252
    .line 253
    const v14, 0x41a5eb85    # 20.74f

    .line 254
    .line 255
    .line 256
    const v15, 0x4152e148    # 13.18f

    .line 257
    .line 258
    .line 259
    const/high16 v16, 0x41a80000    # 21.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x3f7851ec    # 0.97f

    .line 265
    .line 266
    .line 267
    const v18, -0x40d47ae1    # -0.67f

    .line 268
    .line 269
    .line 270
    const v13, 0x3edc28f6    # 0.43f

    .line 271
    .line 272
    .line 273
    const/4 v14, 0x0

    .line 274
    const v15, 0x3f51eb85    # 0.82f

    .line 275
    .line 276
    .line 277
    const v16, -0x4175c28f    # -0.27f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3fc7ae14    # 1.56f

    .line 284
    .line 285
    .line 286
    const v2, -0x3f79999a    # -4.2f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x408b851f    # 4.36f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x3fb47ae1    # 1.41f

    .line 299
    .line 300
    .line 301
    const/16 v18, 0x0

    .line 302
    .line 303
    const v13, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    const v14, 0x3ec7ae14    # 0.39f

    .line 307
    .line 308
    .line 309
    const v15, 0x3f828f5c    # 1.02f

    .line 310
    .line 311
    .line 312
    const v16, 0x3ec7ae14    # 0.39f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x41af3333    # 21.9f

    .line 319
    .line 320
    .line 321
    const v18, 0x41988f5c    # 19.07f

    .line 322
    .line 323
    .line 324
    const v13, 0x41b251ec    # 22.29f

    .line 325
    .line 326
    .line 327
    const v14, 0x41a0b852    # 20.09f

    .line 328
    .line 329
    .line 330
    const v15, 0x41b251ec    # 22.29f

    .line 331
    .line 332
    .line 333
    const v16, 0x419bae14    # 19.46f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v8, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sput-object v0, Landroidx/compose/material/icons/rounded/NearMeDisabledKt;->_nearMeDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 373
    .line 374
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    return-object v0
.end method

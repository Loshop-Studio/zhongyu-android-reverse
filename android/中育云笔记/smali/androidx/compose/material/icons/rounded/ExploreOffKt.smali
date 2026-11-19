.class public final Landroidx/compose/material/icons/rounded/ExploreOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExploreOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ExploreOff"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fc5c28f    # -2.91f

    .line 78
    .line 79
    .line 80
    const v2, 0x40c851ec    # 6.26f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40a80000    # 5.25f

    .line 87
    .line 88
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v17, 0x41b00000    # 22.0f

    .line 92
    .line 93
    const/high16 v18, 0x41400000    # 12.0f

    .line 94
    .line 95
    const v13, 0x41ab1eb8    # 21.39f

    .line 96
    .line 97
    .line 98
    const v14, 0x417ee148    # 15.93f

    .line 99
    .line 100
    .line 101
    const/high16 v15, 0x41b00000    # 22.0f

    .line 102
    .line 103
    const v16, 0x4160a3d7    # 14.04f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 110
    .line 111
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    const v14, -0x3f4f5c29    # -5.52f

    .line 115
    .line 116
    .line 117
    const v15, -0x3f70a3d7    # -4.48f

    .line 118
    .line 119
    .line 120
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, -0x3f4fae14    # -5.51f

    .line 126
    .line 127
    .line 128
    const v18, 0x3fd47ae1    # 1.66f

    .line 129
    .line 130
    .line 131
    const v13, -0x3ffd70a4    # -2.04f

    .line 132
    .line 133
    .line 134
    const/4 v14, 0x0

    .line 135
    const v15, -0x3f847ae1    # -3.93f

    .line 136
    .line 137
    .line 138
    const v16, 0x3f1c28f6    # 0.61f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x40c00000    # 6.0f

    .line 148
    .line 149
    const/high16 v2, 0x41900000    # 18.0f

    .line 150
    .line 151
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x4033d70a    # 2.81f

    .line 158
    .line 159
    .line 160
    const v2, 0x40b47ae1    # 5.64f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3f59999a    # 0.85f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40428f5c    # -1.48f

    .line 173
    .line 174
    .line 175
    const v18, 0x40ee6666    # 7.45f

    .line 176
    .line 177
    .line 178
    const v13, -0x4050a3d7    # -1.37f

    .line 179
    .line 180
    .line 181
    const v14, 0x40047ae1    # 2.07f

    .line 182
    .line 183
    .line 184
    const/high16 v15, -0x40000000    # -2.0f

    .line 185
    .line 186
    const v16, 0x4095c28f    # 4.68f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x40fc28f6    # 7.88f

    .line 193
    .line 194
    .line 195
    const v18, 0x40fc28f6    # 7.88f

    .line 196
    .line 197
    .line 198
    const/high16 v13, 0x3f400000    # 0.75f

    .line 199
    .line 200
    const v14, 0x407ccccd    # 3.95f

    .line 201
    .line 202
    .line 203
    const v15, 0x407ae148    # 3.92f

    .line 204
    .line 205
    .line 206
    const v16, 0x40e428f6    # 7.13f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x40ee6666    # 7.45f

    .line 213
    .line 214
    .line 215
    const v18, -0x40428f5c    # -1.48f

    .line 216
    .line 217
    .line 218
    const v13, 0x403147ae    # 2.77f

    .line 219
    .line 220
    .line 221
    const v14, 0x3f051eb8    # 0.52f

    .line 222
    .line 223
    .line 224
    const v15, 0x40ac28f6    # 5.38f

    .line 225
    .line 226
    .line 227
    const v16, -0x42333333    # -0.1f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3fb47ae1    # 1.41f

    .line 237
    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const v13, 0x3ec7ae14    # 0.39f

    .line 242
    .line 243
    .line 244
    const v14, 0x3ec7ae14    # 0.39f

    .line 245
    .line 246
    .line 247
    const v15, 0x3f828f5c    # 1.02f

    .line 248
    .line 249
    .line 250
    const v16, 0x3ec7ae14    # 0.39f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const v18, -0x404b851f    # -1.41f

    .line 259
    .line 260
    .line 261
    const v14, -0x413851ec    # -0.39f

    .line 262
    .line 263
    .line 264
    const v15, 0x3ec7ae14    # 0.39f

    .line 265
    .line 266
    .line 267
    const v16, -0x407d70a4    # -1.02f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x40870a3d    # 4.22f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x404b851f    # -1.41f

    .line 280
    .line 281
    .line 282
    const/16 v18, 0x0

    .line 283
    .line 284
    const v13, -0x413851ec    # -0.39f

    .line 285
    .line 286
    .line 287
    const v15, -0x407d70a4    # -1.02f

    .line 288
    .line 289
    .line 290
    const v16, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const v18, 0x3fb5c28f    # 1.42f

    .line 299
    .line 300
    .line 301
    const v14, 0x3ec7ae14    # 0.39f

    .line 302
    .line 303
    .line 304
    const v15, -0x413851ec    # -0.39f

    .line 305
    .line 306
    .line 307
    const v16, 0x3f83d70a    # 1.03f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x410e8f5c    # 8.91f

    .line 317
    .line 318
    .line 319
    const v2, 0x413bd70a    # 11.74f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x40566666    # 3.35f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40c00000    # 6.0f

    .line 332
    .line 333
    const/high16 v2, 0x41900000    # 18.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x403a3d71    # 2.91f

    .line 339
    .line 340
    .line 341
    const v2, -0x3f37ae14    # -6.26f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const/16 v16, 0x3800

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v8, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const/high16 v9, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v12, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const-string v4, ""

    .line 371
    .line 372
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    sput-object v0, Landroidx/compose/material/icons/rounded/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 381
    .line 382
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    return-object v0
.end method

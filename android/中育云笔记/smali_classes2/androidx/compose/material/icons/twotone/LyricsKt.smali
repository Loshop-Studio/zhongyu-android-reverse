.class public final Landroidx/compose/material/icons/twotone/LyricsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lyrics:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLyrics(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LyricsKt;->_lyrics:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Lyrics"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x41600000    # 14.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v4, -0x40000000    # -2.0f

    .line 81
    .line 82
    const/high16 v6, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41100000    # 9.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v4, -0x3f7f0a3d    # -4.03f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, -0x40800000    # -1.0f

    .line 99
    .line 100
    const v26, -0x3fc1eb85    # -2.97f

    .line 101
    .line 102
    .line 103
    const v21, -0x40e147ae    # -0.62f

    .line 104
    .line 105
    .line 106
    const v22, -0x40ab851f    # -0.83f

    .line 107
    .line 108
    .line 109
    const/high16 v23, -0x40800000    # -1.0f

    .line 110
    .line 111
    const v24, -0x40133333    # -1.85f

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    const v22, -0x4070a3d7    # -1.12f

    .line 124
    .line 125
    .line 126
    const v23, 0x3ec28f5c    # 0.38f

    .line 127
    .line 128
    .line 129
    const v24, -0x3ff70a3d    # -2.14f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x40800000    # 4.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41200000    # 10.0f

    .line 147
    .line 148
    const/high16 v6, 0x41600000    # 14.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x40c00000    # 6.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x40800000    # 4.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x41600000    # 14.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41500000    # 13.0f

    .line 177
    .line 178
    const/high16 v6, 0x41300000    # 11.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x40c00000    # 6.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41100000    # 9.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x40e00000    # 7.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x41300000    # 11.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41000000    # 8.0f

    .line 207
    .line 208
    const/high16 v6, 0x41500000    # 13.0f

    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x40c00000    # 6.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40e00000    # 7.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41000000    # 8.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    const/16 v16, 0x3800

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const v6, 0x3e99999a    # 0.3f

    .line 243
    .line 244
    .line 245
    const v8, 0x3e99999a    # 0.3f

    .line 246
    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    const/high16 v9, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v12, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    const-string v4, ""

    .line 257
    .line 258
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 259
    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 266
    .line 267
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 268
    .line 269
    .line 270
    move-result-wide v6

    .line 271
    const/4 v2, 0x0

    .line 272
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x41400000    # 12.0f

    .line 289
    .line 290
    const/high16 v6, 0x40c00000    # 6.0f

    .line 291
    .line 292
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40800000    # 4.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x40000000    # 2.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, -0x3f800000    # -4.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/high16 v8, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const-string v4, ""

    .line 323
    .line 324
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 325
    .line 326
    .line 327
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    const/4 v2, 0x0

    .line 338
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 342
    .line 343
    .line 344
    move-result v10

    .line 345
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x40c00000    # 6.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, 0x40e00000    # 7.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x40000000    # 2.0f

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, -0x3f200000    # -7.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    const-string v4, ""

    .line 385
    .line 386
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 394
    .line 395
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    const/4 v2, 0x0

    .line 400
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 404
    .line 405
    .line 406
    move-result v10

    .line 407
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x41700000    # 15.0f

    .line 417
    .line 418
    const v6, 0x413f851f    # 11.97f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v4, 0x41800000    # 16.0f

    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v4, 0x40c00000    # 6.0f

    .line 430
    .line 431
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, -0x40000000    # -2.0f

    .line 435
    .line 436
    const/high16 v6, 0x40000000    # 2.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x40800000    # 4.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x41300000    # 11.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x4001eb85    # 2.03f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v25, 0x40000000    # 2.0f

    .line 458
    .line 459
    const v26, -0x40333333    # -1.6f

    .line 460
    .line 461
    .line 462
    const v21, 0x3f051eb8    # 0.52f

    .line 463
    .line 464
    .line 465
    const v22, -0x40cf5c29    # -0.69f

    .line 466
    .line 467
    .line 468
    const v23, 0x3f99999a    # 1.2f

    .line 469
    .line 470
    .line 471
    const/high16 v24, -0x40600000    # -1.25f

    .line 472
    .line 473
    move-object/from16 v20, v2

    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x40800000    # 4.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v25, -0x40000000    # -2.0f

    .line 484
    .line 485
    const/high16 v26, -0x40000000    # -2.0f

    .line 486
    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    const v22, -0x40733333    # -1.1f

    .line 490
    .line 491
    .line 492
    const v23, -0x4099999a    # -0.9f

    .line 493
    .line 494
    .line 495
    const/high16 v24, -0x40000000    # -2.0f

    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v25, 0x4000a3d7    # 2.01f

    .line 504
    .line 505
    .line 506
    const/high16 v26, 0x40800000    # 4.0f

    .line 507
    .line 508
    const v21, 0x4039999a    # 2.9f

    .line 509
    .line 510
    .line 511
    const/high16 v22, 0x40000000    # 2.0f

    .line 512
    .line 513
    const v23, 0x4000a3d7    # 2.01f

    .line 514
    .line 515
    .line 516
    const v24, 0x4039999a    # 2.9f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x41b00000    # 22.0f

    .line 523
    .line 524
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v4, -0x3f800000    # -4.0f

    .line 528
    .line 529
    const/high16 v6, 0x40800000    # 4.0f

    .line 530
    .line 531
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, 0x41100000    # 9.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v25, 0x40000000    # 2.0f

    .line 540
    .line 541
    const/high16 v26, -0x40000000    # -2.0f

    .line 542
    .line 543
    const v21, 0x3f8ccccd    # 1.1f

    .line 544
    .line 545
    .line 546
    const/16 v22, 0x0

    .line 547
    .line 548
    const/high16 v23, 0x40000000    # 2.0f

    .line 549
    .line 550
    const v24, -0x4099999a    # -0.9f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v4, -0x3fe51eb8    # -2.42f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v25, 0x41700000    # 15.0f

    .line 563
    .line 564
    const v26, 0x413f851f    # 11.97f

    .line 565
    .line 566
    .line 567
    const v21, 0x4181999a    # 16.2f

    .line 568
    .line 569
    .line 570
    const v22, 0x4153851f    # 13.22f

    .line 571
    .line 572
    .line 573
    const v23, 0x417851ec    # 15.52f

    .line 574
    .line 575
    .line 576
    const v24, 0x414a8f5c    # 12.66f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const-string v4, ""

    .line 593
    .line 594
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 595
    .line 596
    .line 597
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 602
    .line 603
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 604
    .line 605
    .line 606
    move-result-wide v6

    .line 607
    const/4 v2, 0x0

    .line 608
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 612
    .line 613
    .line 614
    move-result v10

    .line 615
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    const/high16 v4, 0x41100000    # 9.0f

    .line 625
    .line 626
    const/high16 v6, 0x40c00000    # 6.0f

    .line 627
    .line 628
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v4, 0x40e00000    # 7.0f

    .line 632
    .line 633
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v4, 0x40000000    # 2.0f

    .line 637
    .line 638
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v4, -0x3f200000    # -7.0f

    .line 642
    .line 643
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/high16 v6, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    const-string v4, ""

    .line 657
    .line 658
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 659
    .line 660
    .line 661
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 666
    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 668
    .line 669
    .line 670
    move-result-wide v6

    .line 671
    const/4 v0, 0x0

    .line 672
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 680
    .line 681
    .line 682
    move-result v11

    .line 683
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x41a00000    # 20.0f

    .line 689
    .line 690
    const v2, 0x40c5c28f    # 6.18f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v17, 0x41980000    # 19.0f

    .line 697
    .line 698
    const/high16 v18, 0x40c00000    # 6.0f

    .line 699
    .line 700
    const v13, 0x419d851f    # 19.69f

    .line 701
    .line 702
    .line 703
    const v14, 0x40c23d71    # 6.07f

    .line 704
    .line 705
    .line 706
    const v15, 0x419acccd    # 19.35f

    .line 707
    .line 708
    .line 709
    const/high16 v16, 0x40c00000    # 6.0f

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 715
    .line 716
    const/high16 v18, 0x40400000    # 3.0f

    .line 717
    .line 718
    const v13, -0x402b851f    # -1.66f

    .line 719
    .line 720
    .line 721
    const/4 v14, 0x0

    .line 722
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 723
    .line 724
    const v16, 0x3fab851f    # 1.34f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x40400000    # 3.0f

    .line 731
    .line 732
    const/4 v13, 0x0

    .line 733
    const v14, 0x3fd47ae1    # 1.66f

    .line 734
    .line 735
    .line 736
    const v15, 0x3fab851f    # 1.34f

    .line 737
    .line 738
    .line 739
    const/high16 v16, 0x40400000    # 3.0f

    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, -0x40547ae1    # -1.34f

    .line 745
    .line 746
    .line 747
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 748
    .line 749
    const/high16 v4, 0x40400000    # 3.0f

    .line 750
    .line 751
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v0, 0x40400000    # 3.0f

    .line 755
    .line 756
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x40000000    # 2.0f

    .line 760
    .line 761
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v0, 0x3f800000    # 1.0f

    .line 765
    .line 766
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v0, -0x3f800000    # -4.0f

    .line 770
    .line 771
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x40c5c28f    # 6.18f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    const/16 v16, 0x3800

    .line 788
    .line 789
    const/16 v17, 0x0

    .line 790
    .line 791
    const/high16 v6, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/4 v7, 0x0

    .line 794
    const/high16 v12, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    const/4 v15, 0x0

    .line 798
    const-string v4, ""

    .line 799
    .line 800
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    sput-object v0, Landroidx/compose/material/icons/twotone/LyricsKt;->_lyrics:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 809
    .line 810
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    return-object v0
.end method

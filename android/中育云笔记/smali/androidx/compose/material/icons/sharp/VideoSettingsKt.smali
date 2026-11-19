.class public final Landroidx/compose/material/icons/sharp/VideoSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoSettings(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.VideoSettings"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41900000    # 18.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40a00000    # 5.0f

    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, -0x3f200000    # -7.0f

    .line 94
    .line 95
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, -0x3e500000    # -22.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x41800000    # 16.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x41300000    # 11.0f

    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, -0x40000000    # -2.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const/16 v16, 0x3800

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v8, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/high16 v9, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-string v4, ""

    .line 147
    .line 148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    const/4 v2, 0x0

    .line 162
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41400000    # 12.0f

    .line 179
    .line 180
    const/high16 v6, 0x41700000    # 15.0f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, -0x3f400000    # -6.0f

    .line 186
    .line 187
    const/high16 v6, -0x3f800000    # -4.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41000000    # 8.0f

    .line 193
    .line 194
    const/4 v6, 0x0

    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const/high16 v6, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v7, 0x0

    .line 208
    const-string v4, ""

    .line 209
    .line 210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    const/4 v0, 0x0

    .line 224
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const v0, 0x41b5c28f    # 22.72f

    .line 241
    .line 242
    .line 243
    const v2, 0x418c8f5c    # 17.57f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x3f9d70a4    # 1.23f

    .line 250
    .line 251
    .line 252
    const v2, -0x40851eb8    # -0.98f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, -0x3ff51eb8    # -2.17f

    .line 259
    .line 260
    .line 261
    const/high16 v2, -0x40600000    # -1.25f

    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x41a9d70a    # 21.23f

    .line 267
    .line 268
    .line 269
    const/high16 v2, 0x41700000    # 15.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40c00000    # -0.75f

    .line 275
    .line 276
    const v18, -0x4128f5c3    # -0.42f

    .line 277
    .line 278
    .line 279
    const v13, -0x41947ae1    # -0.23f

    .line 280
    .line 281
    .line 282
    const v14, -0x41d1eb85    # -0.17f

    .line 283
    .line 284
    .line 285
    const v15, -0x410a3d71    # -0.48f

    .line 286
    .line 287
    .line 288
    const v16, -0x416147ae    # -0.31f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41a20000    # 20.25f

    .line 295
    .line 296
    const/high16 v2, 0x41500000    # 13.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, -0x418a3d71    # -0.24f

    .line 307
    .line 308
    .line 309
    const v2, 0x3fca3d71    # 1.58f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x40c28f5c    # -0.74f

    .line 316
    .line 317
    .line 318
    const v18, 0x3ed70a3d    # 0.42f

    .line 319
    .line 320
    .line 321
    const v13, -0x417ae148    # -0.26f

    .line 322
    .line 323
    .line 324
    const v14, 0x3de147ae    # 0.11f

    .line 325
    .line 326
    .line 327
    const v15, -0x40fd70a4    # -0.51f

    .line 328
    .line 329
    .line 330
    const v16, 0x3e851eb8    # 0.26f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, -0x40428f5c    # -1.48f

    .line 337
    .line 338
    .line 339
    const v2, -0x40eb851f    # -0.58f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x400ae148    # 2.17f

    .line 346
    .line 347
    .line 348
    const/high16 v2, -0x40600000    # -1.25f

    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3f9eb852    # 1.24f

    .line 354
    .line 355
    .line 356
    const v2, 0x3f7d70a4    # 0.99f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, -0x43dc28f6    # -0.01f

    .line 363
    .line 364
    .line 365
    const v18, 0x3f5c28f6    # 0.86f

    .line 366
    .line 367
    .line 368
    const v13, -0x430a3d71    # -0.03f

    .line 369
    .line 370
    .line 371
    const v14, 0x3e947ae1    # 0.29f

    .line 372
    .line 373
    .line 374
    const v15, -0x42dc28f6    # -0.04f

    .line 375
    .line 376
    .line 377
    const v16, 0x3f147ae1    # 0.58f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x40628f5c    # -1.23f

    .line 384
    .line 385
    .line 386
    const v2, 0x3f7ae148    # 0.98f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 393
    .line 394
    const v2, 0x400ae148    # 2.17f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x418628f6    # 16.77f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41a80000    # 21.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x3f400000    # 0.75f

    .line 409
    .line 410
    const v18, 0x3ed70a3d    # 0.42f

    .line 411
    .line 412
    .line 413
    const v13, 0x3e6b851f    # 0.23f

    .line 414
    .line 415
    .line 416
    const v14, 0x3e2e147b    # 0.17f

    .line 417
    .line 418
    .line 419
    const v15, 0x3ef5c28f    # 0.48f

    .line 420
    .line 421
    .line 422
    const v16, 0x3e9eb852    # 0.31f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x418e0000    # 17.75f

    .line 429
    .line 430
    const/high16 v2, 0x41b80000    # 23.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40200000    # 2.5f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x3e75c28f    # 0.24f

    .line 441
    .line 442
    .line 443
    const v2, -0x4035c28f    # -1.58f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x3f3d70a4    # 0.74f

    .line 450
    .line 451
    .line 452
    const v18, -0x4128f5c3    # -0.42f

    .line 453
    .line 454
    .line 455
    const v13, 0x3e851eb8    # 0.26f

    .line 456
    .line 457
    .line 458
    const v14, -0x421eb852    # -0.11f

    .line 459
    .line 460
    .line 461
    const v15, 0x3f028f5c    # 0.51f

    .line 462
    .line 463
    .line 464
    const v16, -0x417ae148    # -0.26f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3fbd70a4    # 1.48f

    .line 471
    .line 472
    .line 473
    const v2, 0x3f147ae1    # 0.58f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 480
    .line 481
    const v2, -0x3ff51eb8    # -2.17f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x406147ae    # -1.24f

    .line 488
    .line 489
    .line 490
    const v2, -0x40828f5c    # -0.99f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x41b5c28f    # 22.72f

    .line 497
    .line 498
    .line 499
    const v18, 0x418c8f5c    # 17.57f

    .line 500
    .line 501
    .line 502
    const/high16 v13, 0x41b60000    # 22.75f

    .line 503
    .line 504
    const v14, 0x41911eb8    # 18.14f

    .line 505
    .line 506
    .line 507
    const/high16 v15, 0x41b60000    # 22.75f

    .line 508
    .line 509
    const v16, 0x418ecccd    # 17.85f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41980000    # 19.0f

    .line 519
    .line 520
    const/high16 v2, 0x419c0000    # 19.5f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x40400000    # -1.5f

    .line 526
    .line 527
    const/high16 v18, -0x40400000    # -1.5f

    .line 528
    .line 529
    const v13, -0x40ab851f    # -0.83f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, -0x40400000    # -1.5f

    .line 534
    .line 535
    const v16, -0x40d47ae1    # -0.67f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, -0x40400000    # -1.5f

    .line 542
    .line 543
    const v2, 0x3f2b851f    # 0.67f

    .line 544
    .line 545
    .line 546
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3f2b851f    # 0.67f

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x419ea3d7    # 19.83f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x41980000    # 19.0f

    .line 563
    .line 564
    const/high16 v4, 0x419c0000    # 19.5f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    const/16 v16, 0x3800

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const/high16 v6, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v7, 0x0

    .line 583
    const/high16 v12, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const/4 v15, 0x0

    .line 587
    const-string v4, ""

    .line 588
    .line 589
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    sput-object v0, Landroidx/compose/material/icons/sharp/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    return-object v0
.end method

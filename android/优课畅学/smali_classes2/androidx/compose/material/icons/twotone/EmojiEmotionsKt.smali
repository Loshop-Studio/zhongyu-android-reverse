.class public final Landroidx/compose/material/icons/twotone/EmojiEmotionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emojiEmotions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmojiEmotions(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EmojiEmotionsKt;->_emojiEmotions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EmojiEmotions"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f000000    # -8.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x3f728f5c    # -4.42f

    .line 84
    .line 85
    .line 86
    const v23, -0x3f9ae148    # -3.58f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x3f000000    # -8.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, -0x3f000000    # -8.0f

    .line 97
    .line 98
    const v6, 0x40651eb8    # 3.58f

    .line 99
    .line 100
    .line 101
    const/high16 v7, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x40651eb8    # 3.58f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x41835c29    # 16.42f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41a00000    # 20.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41080000    # 8.5f

    .line 128
    .line 129
    const/high16 v6, 0x41000000    # 8.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x41200000    # 10.0f

    .line 135
    .line 136
    const/high16 v26, 0x41180000    # 9.5f

    .line 137
    .line 138
    const v21, 0x411547ae    # 9.33f

    .line 139
    .line 140
    .line 141
    const/high16 v22, 0x41000000    # 8.0f

    .line 142
    .line 143
    const/high16 v23, 0x41200000    # 10.0f

    .line 144
    .line 145
    const v24, 0x410ab852    # 8.67f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x411547ae    # 9.33f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41080000    # 8.5f

    .line 155
    .line 156
    const/high16 v7, 0x41300000    # 11.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x412547ae    # 10.33f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x40e00000    # 7.0f

    .line 165
    .line 166
    const/high16 v7, 0x41180000    # 9.5f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x40f570a4    # 7.67f

    .line 172
    .line 173
    .line 174
    const/high16 v6, 0x41080000    # 8.5f

    .line 175
    .line 176
    const/high16 v7, 0x41000000    # 8.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x41900000    # 18.0f

    .line 185
    .line 186
    const/high16 v6, 0x41400000    # 12.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, -0x3f600000    # -5.0f

    .line 192
    .line 193
    const/high16 v26, -0x3f800000    # -4.0f

    .line 194
    .line 195
    const v21, -0x3fee147b    # -2.28f

    .line 196
    .line 197
    .line 198
    const/16 v22, 0x0

    .line 199
    .line 200
    const v23, -0x3f78f5c3    # -4.22f

    .line 201
    .line 202
    .line 203
    const v24, -0x402b851f    # -1.66f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x41200000    # 10.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v25, 0x41400000    # 12.0f

    .line 215
    .line 216
    const/high16 v26, 0x41900000    # 18.0f

    .line 217
    .line 218
    const v21, 0x4181c28f    # 16.22f

    .line 219
    .line 220
    .line 221
    const v22, 0x4182b852    # 16.34f

    .line 222
    .line 223
    .line 224
    const v23, 0x41647ae1    # 14.28f

    .line 225
    .line 226
    .line 227
    const/high16 v24, 0x41900000    # 18.0f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41780000    # 15.5f

    .line 236
    .line 237
    const/high16 v6, 0x41300000    # 11.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, -0x40400000    # -1.5f

    .line 243
    .line 244
    const/high16 v26, -0x40400000    # -1.5f

    .line 245
    .line 246
    const v21, -0x40ab851f    # -0.83f

    .line 247
    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    const/high16 v23, -0x40400000    # -1.5f

    .line 252
    .line 253
    const v24, -0x40d47ae1    # -0.67f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, 0x416ab852    # 14.67f

    .line 260
    .line 261
    .line 262
    const/high16 v6, 0x41780000    # 15.5f

    .line 263
    .line 264
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, 0x410ab852    # 8.67f

    .line 268
    .line 269
    .line 270
    const/high16 v6, 0x41880000    # 17.0f

    .line 271
    .line 272
    const/high16 v7, 0x41180000    # 9.5f

    .line 273
    .line 274
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, 0x4182a3d7    # 16.33f

    .line 278
    .line 279
    .line 280
    const/high16 v6, 0x41780000    # 15.5f

    .line 281
    .line 282
    const/high16 v7, 0x41300000    # 11.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/16 v16, 0x3800

    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const v6, 0x3e99999a    # 0.3f

    .line 299
    .line 300
    .line 301
    const v8, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const/high16 v9, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v12, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const/4 v14, 0x0

    .line 311
    const/4 v15, 0x0

    .line 312
    const-string v4, ""

    .line 313
    .line 314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 322
    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 324
    .line 325
    .line 326
    move-result-wide v6

    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x41780000    # 15.5f

    .line 345
    .line 346
    const/high16 v6, 0x41180000    # 9.5f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/4 v4, 0x0

    .line 352
    const/high16 v6, -0x40400000    # -1.5f

    .line 353
    .line 354
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v26, 0x40400000    # 3.0f

    .line 358
    .line 359
    const/16 v27, 0x0

    .line 360
    .line 361
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 364
    .line 365
    const/16 v23, 0x0

    .line 366
    .line 367
    const/16 v24, 0x1

    .line 368
    .line 369
    const/16 v25, 0x1

    .line 370
    .line 371
    move-object/from16 v20, v2

    .line 372
    .line 373
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 377
    .line 378
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const/high16 v6, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v8, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const-string v4, ""

    .line 391
    .line 392
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 393
    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 400
    .line 401
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v6

    .line 405
    const/4 v2, 0x0

    .line 406
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const/high16 v4, 0x41180000    # 9.5f

    .line 423
    .line 424
    const/high16 v6, 0x41080000    # 8.5f

    .line 425
    .line 426
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    const/high16 v6, -0x40400000    # -1.5f

    .line 431
    .line 432
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v26, 0x40400000    # 3.0f

    .line 436
    .line 437
    move-object/from16 v20, v2

    .line 438
    .line 439
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const/high16 v6, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const-string v4, ""

    .line 455
    .line 456
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 464
    .line 465
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 466
    .line 467
    .line 468
    move-result-wide v6

    .line 469
    const/4 v2, 0x0

    .line 470
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    const v4, 0x413fd70a    # 11.99f

    .line 487
    .line 488
    .line 489
    const/high16 v6, 0x40000000    # 2.0f

    .line 490
    .line 491
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v25, 0x40000000    # 2.0f

    .line 495
    .line 496
    const/high16 v26, 0x41400000    # 12.0f

    .line 497
    .line 498
    const v21, 0x40cf0a3d    # 6.47f

    .line 499
    .line 500
    .line 501
    const/high16 v22, 0x40000000    # 2.0f

    .line 502
    .line 503
    const/high16 v23, 0x40000000    # 2.0f

    .line 504
    .line 505
    const v24, 0x40cf5c29    # 6.48f

    .line 506
    .line 507
    .line 508
    move-object/from16 v20, v2

    .line 509
    .line 510
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v25, 0x411fd70a    # 9.99f

    .line 514
    .line 515
    .line 516
    const/high16 v26, 0x41200000    # 10.0f

    .line 517
    .line 518
    const/16 v21, 0x0

    .line 519
    .line 520
    const v22, 0x40b0a3d7    # 5.52f

    .line 521
    .line 522
    .line 523
    const v23, 0x408f0a3d    # 4.47f

    .line 524
    .line 525
    .line 526
    const/high16 v24, 0x41200000    # 10.0f

    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v25, 0x41b00000    # 22.0f

    .line 532
    .line 533
    const/high16 v26, 0x41400000    # 12.0f

    .line 534
    .line 535
    const v21, 0x418c28f6    # 17.52f

    .line 536
    .line 537
    .line 538
    const/high16 v22, 0x41b00000    # 22.0f

    .line 539
    .line 540
    const/high16 v23, 0x41b00000    # 22.0f

    .line 541
    .line 542
    const v24, 0x418c28f6    # 17.52f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v25, 0x413fd70a    # 11.99f

    .line 549
    .line 550
    .line 551
    const/high16 v26, 0x40000000    # 2.0f

    .line 552
    .line 553
    const/high16 v21, 0x41b00000    # 22.0f

    .line 554
    .line 555
    const v22, 0x40cf5c29    # 6.48f

    .line 556
    .line 557
    .line 558
    const v23, 0x418c28f6    # 17.52f

    .line 559
    .line 560
    .line 561
    const/high16 v24, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x41a00000    # 20.0f

    .line 570
    .line 571
    const/high16 v6, 0x41400000    # 12.0f

    .line 572
    .line 573
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v25, -0x3f000000    # -8.0f

    .line 577
    .line 578
    const/high16 v26, -0x3f000000    # -8.0f

    .line 579
    .line 580
    const v21, -0x3f728f5c    # -4.42f

    .line 581
    .line 582
    .line 583
    const/16 v22, 0x0

    .line 584
    .line 585
    const/high16 v23, -0x3f000000    # -8.0f

    .line 586
    .line 587
    const v24, -0x3f9ae148    # -3.58f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v25, 0x41000000    # 8.0f

    .line 594
    .line 595
    const/16 v21, 0x0

    .line 596
    .line 597
    const v22, -0x3f728f5c    # -4.42f

    .line 598
    .line 599
    .line 600
    const v23, 0x40651eb8    # 3.58f

    .line 601
    .line 602
    .line 603
    const/high16 v24, -0x3f000000    # -8.0f

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v4, 0x40651eb8    # 3.58f

    .line 609
    .line 610
    .line 611
    const/high16 v6, 0x41000000    # 8.0f

    .line 612
    .line 613
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v25, 0x41400000    # 12.0f

    .line 617
    .line 618
    const/high16 v26, 0x41a00000    # 20.0f

    .line 619
    .line 620
    const/high16 v21, 0x41a00000    # 20.0f

    .line 621
    .line 622
    const v22, 0x41835c29    # 16.42f

    .line 623
    .line 624
    .line 625
    const v23, 0x41835c29    # 16.42f

    .line 626
    .line 627
    .line 628
    const/high16 v24, 0x41a00000    # 20.0f

    .line 629
    .line 630
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const/high16 v6, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/4 v7, 0x0

    .line 643
    const-string v4, ""

    .line 644
    .line 645
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 646
    .line 647
    .line 648
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 653
    .line 654
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 655
    .line 656
    .line 657
    move-result-wide v6

    .line 658
    const/4 v0, 0x0

    .line 659
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 663
    .line 664
    .line 665
    move-result v10

    .line 666
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 667
    .line 668
    .line 669
    move-result v11

    .line 670
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 673
    .line 674
    .line 675
    const/high16 v0, 0x41900000    # 18.0f

    .line 676
    .line 677
    const/high16 v2, 0x41400000    # 12.0f

    .line 678
    .line 679
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v17, 0x40a00000    # 5.0f

    .line 683
    .line 684
    const/high16 v18, -0x3f800000    # -4.0f

    .line 685
    .line 686
    const v13, 0x4011eb85    # 2.28f

    .line 687
    .line 688
    .line 689
    const v15, 0x40870a3d    # 4.22f

    .line 690
    .line 691
    .line 692
    const v16, -0x402b851f    # -1.66f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x40e00000    # 7.0f

    .line 699
    .line 700
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v17, 0x41400000    # 12.0f

    .line 704
    .line 705
    const/high16 v18, 0x41900000    # 18.0f

    .line 706
    .line 707
    const v13, 0x40f8f5c3    # 7.78f

    .line 708
    .line 709
    .line 710
    const v14, 0x4182b852    # 16.34f

    .line 711
    .line 712
    .line 713
    const v15, 0x411b851f    # 9.72f

    .line 714
    .line 715
    .line 716
    const/high16 v16, 0x41900000    # 18.0f

    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    const/16 v16, 0x3800

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/high16 v6, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/4 v7, 0x0

    .line 735
    const/high16 v12, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v13, 0x0

    .line 738
    const/4 v14, 0x0

    .line 739
    const/4 v15, 0x0

    .line 740
    const-string v4, ""

    .line 741
    .line 742
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sput-object v0, Landroidx/compose/material/icons/twotone/EmojiEmotionsKt;->_emojiEmotions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 751
    .line 752
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    return-object v0
.end method

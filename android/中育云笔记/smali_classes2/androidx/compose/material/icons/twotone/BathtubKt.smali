.class public final Landroidx/compose/material/icons/twotone/BathtubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bathtub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBathtub(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BathtubKt;->_bathtub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Bathtub"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3e800000    # -16.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const v6, 0x3e99999a    # 0.3f

    .line 104
    .line 105
    .line 106
    const v8, 0x3e99999a    # 0.3f

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    const/high16 v9, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/high16 v12, 0x3f800000    # 1.0f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const-string v4, ""

    .line 118
    .line 119
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x40e00000    # 7.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, -0x40000000    # -2.0f

    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v26, 0x40800000    # 4.0f

    .line 161
    .line 162
    const/16 v27, 0x0

    .line 163
    .line 164
    const/high16 v21, 0x40000000    # 2.0f

    .line 165
    .line 166
    const/high16 v22, 0x40000000    # 2.0f

    .line 167
    .line 168
    const/16 v23, 0x0

    .line 169
    .line 170
    const/16 v24, 0x1

    .line 171
    .line 172
    const/16 v25, 0x1

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3f800000    # -4.0f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v8, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const-string v4, ""

    .line 194
    .line 195
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const/4 v0, 0x0

    .line 209
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41500000    # 13.0f

    .line 226
    .line 227
    const/high16 v2, 0x41a00000    # 20.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x409a8f5c    # 4.83f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x41895c29    # 17.17f

    .line 239
    .line 240
    .line 241
    const/high16 v18, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/high16 v13, 0x41a00000    # 20.0f

    .line 244
    .line 245
    const v14, 0x405147ae    # 3.27f

    .line 246
    .line 247
    .line 248
    const v15, 0x4195d70a    # 18.73f

    .line 249
    .line 250
    .line 251
    const/high16 v16, 0x40000000    # 2.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, -0x40000000    # -2.0f

    .line 257
    .line 258
    const v18, 0x3f547ae1    # 0.83f

    .line 259
    .line 260
    .line 261
    const/high16 v13, -0x40c00000    # -0.75f

    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, -0x4043d70a    # -1.47f

    .line 265
    .line 266
    .line 267
    const v16, 0x3e99999a    # 0.3f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 274
    .line 275
    const/high16 v2, -0x40600000    # -1.25f

    .line 276
    .line 277
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x41568f5c    # 13.41f

    .line 281
    .line 282
    .line 283
    const/high16 v18, 0x40800000    # 4.0f

    .line 284
    .line 285
    const v13, 0x415c28f6    # 13.76f

    .line 286
    .line 287
    .line 288
    const v14, 0x4080f5c3    # 4.03f

    .line 289
    .line 290
    .line 291
    const v15, 0x415970a4    # 13.59f

    .line 292
    .line 293
    .line 294
    const/high16 v16, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x4075c28f    # -1.08f

    .line 300
    .line 301
    .line 302
    const v18, 0x3ea3d70a    # 0.32f

    .line 303
    .line 304
    .line 305
    const v13, -0x41333333    # -0.4f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, -0x40bae148    # -0.77f

    .line 310
    .line 311
    .line 312
    const v16, 0x3df5c28f    # 0.12f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x4030a3d7    # 2.76f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3ea3d70a    # 0.32f

    .line 325
    .line 326
    .line 327
    const v18, -0x4075c28f    # -1.08f

    .line 328
    .line 329
    .line 330
    const v13, 0x3e4ccccd    # 0.2f

    .line 331
    .line 332
    .line 333
    const v14, -0x416147ae    # -0.31f

    .line 334
    .line 335
    .line 336
    const v15, 0x3ea3d70a    # 0.32f

    .line 337
    .line 338
    .line 339
    const v16, -0x40d1eb85    # -0.68f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, -0x4270a3d7    # -0.07f

    .line 346
    .line 347
    .line 348
    const v18, -0x40fd70a4    # -0.51f

    .line 349
    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const v14, -0x41c7ae14    # -0.18f

    .line 353
    .line 354
    .line 355
    const v15, -0x430a3d71    # -0.03f

    .line 356
    .line 357
    .line 358
    const v16, -0x4151eb85    # -0.34f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x41895c29    # 17.17f

    .line 370
    .line 371
    .line 372
    const/high16 v18, 0x40800000    # 4.0f

    .line 373
    .line 374
    const v13, 0x4185eb85    # 16.74f

    .line 375
    .line 376
    .line 377
    const v14, 0x4082e148    # 4.09f

    .line 378
    .line 379
    .line 380
    const v15, 0x4187999a    # 16.95f

    .line 381
    .line 382
    .line 383
    const/high16 v16, 0x40800000    # 4.0f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x41900000    # 18.0f

    .line 389
    .line 390
    const v18, 0x409a8f5c    # 4.83f

    .line 391
    .line 392
    .line 393
    const v13, 0x418d0a3d    # 17.63f

    .line 394
    .line 395
    .line 396
    const/high16 v14, 0x40800000    # 4.0f

    .line 397
    .line 398
    const/high16 v15, 0x41900000    # 18.0f

    .line 399
    .line 400
    const v16, 0x408bd70a    # 4.37f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41500000    # 13.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x3f24cccd    # -6.85f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x40ae147b    # -0.82f

    .line 418
    .line 419
    .line 420
    const v18, -0x40c7ae14    # -0.72f

    .line 421
    .line 422
    .line 423
    const v13, -0x41666666    # -0.3f

    .line 424
    .line 425
    .line 426
    const v14, -0x41a8f5c3    # -0.21f

    .line 427
    .line 428
    .line 429
    const v15, -0x40ee147b    # -0.57f

    .line 430
    .line 431
    .line 432
    const v16, -0x4119999a    # -0.45f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x404ccccd    # -1.4f

    .line 439
    .line 440
    .line 441
    const v2, -0x4039999a    # -1.55f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x40cf5c29    # -0.69f

    .line 448
    .line 449
    .line 450
    const/high16 v18, -0x41000000    # -0.5f

    .line 451
    .line 452
    const v13, -0x41bd70a4    # -0.19f

    .line 453
    .line 454
    .line 455
    const v15, -0x4123d70a    # -0.43f

    .line 456
    .line 457
    .line 458
    const v16, -0x413d70a4    # -0.38f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x40e7ae14    # 7.24f

    .line 465
    .line 466
    .line 467
    const/high16 v18, 0x41200000    # 10.0f

    .line 468
    .line 469
    const v13, 0x40fdc28f    # 7.93f

    .line 470
    .line 471
    .line 472
    const v14, 0x412147ae    # 10.08f

    .line 473
    .line 474
    .line 475
    const v15, 0x40f2e148    # 7.59f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x41200000    # 10.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x40a00000    # 5.0f

    .line 484
    .line 485
    const/high16 v18, 0x41440000    # 12.25f

    .line 486
    .line 487
    const/high16 v13, 0x40c00000    # 6.0f

    .line 488
    .line 489
    const v14, 0x412028f6    # 10.01f

    .line 490
    .line 491
    .line 492
    const/high16 v15, 0x40a00000    # 5.0f

    .line 493
    .line 494
    const v16, 0x413028f6    # 11.01f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41500000    # 13.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40c00000    # 6.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x40000000    # 2.0f

    .line 516
    .line 517
    const/high16 v18, 0x40000000    # 2.0f

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const v14, 0x3f8ccccd    # 1.1f

    .line 521
    .line 522
    .line 523
    const v15, 0x3f666666    # 0.9f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v18, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const v14, 0x3f0ccccd    # 0.55f

    .line 536
    .line 537
    .line 538
    const v15, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    const/high16 v16, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41600000    # 14.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v18, -0x40800000    # -1.0f

    .line 552
    .line 553
    const v13, 0x3f0ccccd    # 0.55f

    .line 554
    .line 555
    .line 556
    const/4 v14, 0x0

    .line 557
    const/high16 v15, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const v16, -0x4119999a    # -0.45f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x40000000    # 2.0f

    .line 566
    .line 567
    const/high16 v18, -0x40000000    # -2.0f

    .line 568
    .line 569
    const v13, 0x3f8ccccd    # 1.1f

    .line 570
    .line 571
    .line 572
    const/high16 v15, 0x40000000    # 2.0f

    .line 573
    .line 574
    const v16, -0x4099999a    # -0.9f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, -0x3f400000    # -6.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x41a00000    # 20.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41980000    # 19.0f

    .line 594
    .line 595
    const/high16 v2, 0x41a00000    # 20.0f

    .line 596
    .line 597
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x40800000    # 4.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, -0x3f800000    # -4.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41800000    # 16.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41980000    # 19.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    const/16 v16, 0x3800

    .line 628
    .line 629
    const/16 v17, 0x0

    .line 630
    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    const/high16 v12, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const/4 v15, 0x0

    .line 638
    const-string v4, ""

    .line 639
    .line 640
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    sput-object v0, Landroidx/compose/material/icons/twotone/BathtubKt;->_bathtub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    return-object v0
.end method

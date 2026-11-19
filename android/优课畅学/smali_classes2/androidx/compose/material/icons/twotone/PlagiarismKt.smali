.class public final Landroidx/compose/material/icons/twotone/PlagiarismKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlagiarism(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PlagiarismKt;->_plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Plagiarism"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41800000    # 16.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x41100000    # 9.0f

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, -0x3f600000    # -5.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x415f851f    # 13.97f

    .line 112
    .line 113
    .line 114
    const v6, 0x41307ae1    # 11.03f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x3f170a3d    # 0.59f

    .line 121
    .line 122
    .line 123
    const v26, 0x408428f6    # 4.13f

    .line 124
    .line 125
    .line 126
    const v21, 0x3f8f5c29    # 1.12f

    .line 127
    .line 128
    .line 129
    const v22, 0x3f8f5c29    # 1.12f

    .line 130
    .line 131
    .line 132
    const v23, 0x3fa7ae14    # 1.31f

    .line 133
    .line 134
    .line 135
    const v24, 0x40333333    # 2.8f

    .line 136
    .line 137
    .line 138
    move-object/from16 v20, v2

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x3ff0a3d7    # 1.88f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x3fb47ae1    # 1.41f

    .line 150
    .line 151
    .line 152
    const v6, -0x404b851f    # -1.41f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x400f5c29    # -1.88f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, -0x3f7bd70a    # -4.13f

    .line 165
    .line 166
    .line 167
    const v26, -0x40e8f5c3    # -0.59f

    .line 168
    .line 169
    .line 170
    const v21, -0x4055c28f    # -1.33f

    .line 171
    .line 172
    .line 173
    const v22, 0x3f35c28f    # 0.71f

    .line 174
    .line 175
    .line 176
    const v23, -0x3fbf5c29    # -3.01f

    .line 177
    .line 178
    .line 179
    const v24, 0x3f07ae14    # 0.53f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/16 v25, 0x0

    .line 186
    .line 187
    const v26, -0x3f61999a    # -4.95f

    .line 188
    .line 189
    .line 190
    const v21, -0x4050a3d7    # -1.37f

    .line 191
    .line 192
    .line 193
    const v22, -0x4050a3d7    # -1.37f

    .line 194
    .line 195
    .line 196
    const v23, -0x4050a3d7    # -1.37f

    .line 197
    .line 198
    .line 199
    const v24, -0x3f9ae148    # -3.58f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, 0x415f851f    # 13.97f

    .line 206
    .line 207
    .line 208
    const v26, 0x41307ae1    # 11.03f

    .line 209
    .line 210
    .line 211
    const v21, 0x41263d71    # 10.39f

    .line 212
    .line 213
    .line 214
    const v22, 0x411a8f5c    # 9.66f

    .line 215
    .line 216
    .line 217
    const v23, 0x4149c28f    # 12.61f

    .line 218
    .line 219
    .line 220
    const v24, 0x411a8f5c    # 9.66f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const/16 v16, 0x3800

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const v6, 0x3e99999a    # 0.3f

    .line 238
    .line 239
    .line 240
    const v8, 0x3e99999a    # 0.3f

    .line 241
    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const/high16 v9, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v12, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    const-string v4, ""

    .line 252
    .line 253
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    const/4 v2, 0x0

    .line 267
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41380000    # 11.5f

    .line 284
    .line 285
    const/high16 v6, 0x41580000    # 13.5f

    .line 286
    .line 287
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, -0x40400000    # -1.5f

    .line 291
    .line 292
    const/4 v6, 0x0

    .line 293
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v26, 0x40400000    # 3.0f

    .line 297
    .line 298
    const/16 v27, 0x0

    .line 299
    .line 300
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 301
    .line 302
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 303
    .line 304
    const/16 v23, 0x0

    .line 305
    .line 306
    const/16 v24, 0x1

    .line 307
    .line 308
    const/16 v25, 0x1

    .line 309
    .line 310
    move-object/from16 v20, v2

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 316
    .line 317
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const v6, 0x3e99999a    # 0.3f

    .line 325
    .line 326
    .line 327
    const/4 v7, 0x0

    .line 328
    const-string v4, ""

    .line 329
    .line 330
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 331
    .line 332
    .line 333
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 338
    .line 339
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 340
    .line 341
    .line 342
    move-result-wide v6

    .line 343
    const/4 v2, 0x0

    .line 344
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    const/high16 v4, 0x40000000    # 2.0f

    .line 361
    .line 362
    const/high16 v6, 0x41600000    # 14.0f

    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v4, 0x40c00000    # 6.0f

    .line 368
    .line 369
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v25, 0x40800000    # 4.0f

    .line 373
    .line 374
    const/high16 v26, 0x40800000    # 4.0f

    .line 375
    .line 376
    const v21, 0x409ccccd    # 4.9f

    .line 377
    .line 378
    .line 379
    const/high16 v22, 0x40000000    # 2.0f

    .line 380
    .line 381
    const/high16 v23, 0x40800000    # 4.0f

    .line 382
    .line 383
    const v24, 0x4039999a    # 2.9f

    .line 384
    .line 385
    .line 386
    move-object/from16 v20, v2

    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x41800000    # 16.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v25, 0x3ffeb852    # 1.99f

    .line 397
    .line 398
    .line 399
    const/high16 v26, 0x40000000    # 2.0f

    .line 400
    .line 401
    const/16 v21, 0x0

    .line 402
    .line 403
    const v22, 0x3f8ccccd    # 1.1f

    .line 404
    .line 405
    .line 406
    const v23, 0x3f63d70a    # 0.89f

    .line 407
    .line 408
    .line 409
    const/high16 v24, 0x40000000    # 2.0f

    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x41900000    # 18.0f

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x40000000    # 2.0f

    .line 420
    .line 421
    const/high16 v26, -0x40000000    # -2.0f

    .line 422
    .line 423
    const v21, 0x3f8ccccd    # 1.1f

    .line 424
    .line 425
    .line 426
    const/16 v22, 0x0

    .line 427
    .line 428
    const/high16 v23, 0x40000000    # 2.0f

    .line 429
    .line 430
    const v24, -0x4099999a    # -0.9f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x41000000    # 8.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x40000000    # 2.0f

    .line 442
    .line 443
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x41900000    # 18.0f

    .line 450
    .line 451
    const/high16 v6, 0x41a00000    # 20.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x41a00000    # 20.0f

    .line 457
    .line 458
    const/high16 v6, 0x40c00000    # 6.0f

    .line 459
    .line 460
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x40800000    # 4.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40e00000    # 7.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40a00000    # 5.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x41a00000    # 20.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v8, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v7, 0x0

    .line 498
    const-string v4, ""

    .line 499
    .line 500
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 501
    .line 502
    .line 503
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 508
    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 510
    .line 511
    .line 512
    move-result-wide v6

    .line 513
    const/4 v0, 0x0

    .line 514
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 528
    .line 529
    .line 530
    const v0, 0x41107ae1    # 9.03f

    .line 531
    .line 532
    .line 533
    const v2, 0x41307ae1    # 11.03f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const v18, 0x409e6666    # 4.95f

    .line 542
    .line 543
    .line 544
    const v13, -0x4050a3d7    # -1.37f

    .line 545
    .line 546
    .line 547
    const v14, 0x3faf5c29    # 1.37f

    .line 548
    .line 549
    .line 550
    const v15, -0x4050a3d7    # -1.37f

    .line 551
    .line 552
    .line 553
    const v16, 0x40651eb8    # 3.58f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x408428f6    # 4.13f

    .line 560
    .line 561
    .line 562
    const v18, 0x3f170a3d    # 0.59f

    .line 563
    .line 564
    .line 565
    const v13, 0x3f8f5c29    # 1.12f

    .line 566
    .line 567
    .line 568
    const v14, 0x3f8f5c29    # 1.12f

    .line 569
    .line 570
    .line 571
    const v15, 0x40333333    # 2.8f

    .line 572
    .line 573
    .line 574
    const v16, 0x3fa7ae14    # 1.31f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x3ff0a3d7    # 1.88f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x3fb47ae1    # 1.41f

    .line 587
    .line 588
    .line 589
    const v2, -0x404b851f    # -1.41f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, -0x400f5c29    # -1.88f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, -0x40e8f5c3    # -0.59f

    .line 602
    .line 603
    .line 604
    const v18, -0x3f7bd70a    # -4.13f

    .line 605
    .line 606
    .line 607
    const v13, 0x3f35c28f    # 0.71f

    .line 608
    .line 609
    .line 610
    const v14, -0x4055c28f    # -1.33f

    .line 611
    .line 612
    .line 613
    const v15, 0x3f07ae14    # 0.53f

    .line 614
    .line 615
    .line 616
    const v16, -0x3fbf5c29    # -3.01f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x41107ae1    # 9.03f

    .line 623
    .line 624
    .line 625
    const v18, 0x41307ae1    # 11.03f

    .line 626
    .line 627
    .line 628
    const v13, 0x4149c28f    # 12.61f

    .line 629
    .line 630
    .line 631
    const v14, 0x411a8f5c    # 9.66f

    .line 632
    .line 633
    .line 634
    const v15, 0x41263d71    # 10.39f

    .line 635
    .line 636
    .line 637
    const v16, 0x411a8f5c    # 9.66f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x4148f5c3    # 12.56f

    .line 647
    .line 648
    .line 649
    const v2, 0x4168f5c3    # 14.56f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, -0x3ff851ec    # -2.12f

    .line 656
    .line 657
    .line 658
    const/16 v18, 0x0

    .line 659
    .line 660
    const v13, -0x40e8f5c3    # -0.59f

    .line 661
    .line 662
    .line 663
    const v14, 0x3f170a3d    # 0.59f

    .line 664
    .line 665
    .line 666
    const v15, -0x403ae148    # -1.54f

    .line 667
    .line 668
    .line 669
    const v16, 0x3f170a3d    # 0.59f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/16 v17, 0x0

    .line 676
    .line 677
    const v18, -0x3ff851ec    # -2.12f

    .line 678
    .line 679
    .line 680
    const v14, -0x40e8f5c3    # -0.59f

    .line 681
    .line 682
    .line 683
    const v15, -0x40e8f5c3    # -0.59f

    .line 684
    .line 685
    .line 686
    const v16, -0x403ae148    # -1.54f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v17, 0x4007ae14    # 2.12f

    .line 693
    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    const v13, 0x3f170a3d    # 0.59f

    .line 698
    .line 699
    .line 700
    const v15, 0x3fc51eb8    # 1.54f

    .line 701
    .line 702
    .line 703
    const v16, -0x40e8f5c3    # -0.59f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x4148f5c3    # 12.56f

    .line 710
    .line 711
    .line 712
    const v18, 0x4168f5c3    # 14.56f

    .line 713
    .line 714
    .line 715
    const v13, 0x41526666    # 13.15f

    .line 716
    .line 717
    .line 718
    const v14, 0x41507ae1    # 13.03f

    .line 719
    .line 720
    .line 721
    const v15, 0x41526666    # 13.15f

    .line 722
    .line 723
    .line 724
    const v16, 0x415f851f    # 13.97f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    const/16 v16, 0x3800

    .line 738
    .line 739
    const/16 v17, 0x0

    .line 740
    .line 741
    const/high16 v6, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v7, 0x0

    .line 744
    const/high16 v12, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    const/4 v14, 0x0

    .line 748
    const/4 v15, 0x0

    .line 749
    const-string v4, ""

    .line 750
    .line 751
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    sput-object v0, Landroidx/compose/material/icons/twotone/PlagiarismKt;->_plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 760
    .line 761
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    return-object v0
.end method

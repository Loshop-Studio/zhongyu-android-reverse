.class public final Landroidx/compose/material/icons/twotone/ImageSearchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImageSearch(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ImageSearchKt;->_imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ImageSearch"

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
    const v4, 0x418d999a    # 17.7f

    .line 71
    .line 72
    .line 73
    const v6, 0x41387ae1    # 11.53f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3ff28f5c    # -2.21f

    .line 80
    .line 81
    .line 82
    const v26, 0x3ef0a3d7    # 0.47f

    .line 83
    .line 84
    .line 85
    const v21, -0x40cccccd    # -0.7f

    .line 86
    .line 87
    .line 88
    const v22, 0x3e9eb852    # 0.31f

    .line 89
    .line 90
    .line 91
    const v23, -0x40466666    # -1.45f

    .line 92
    .line 93
    .line 94
    const v24, 0x3ef0a3d7    # 0.47f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41200000    # 10.0f

    .line 103
    .line 104
    const/high16 v26, 0x40d00000    # 6.5f

    .line 105
    .line 106
    const v21, 0x41475c29    # 12.46f

    .line 107
    .line 108
    .line 109
    const/high16 v22, 0x41400000    # 12.0f

    .line 110
    .line 111
    const/high16 v23, 0x41200000    # 10.0f

    .line 112
    .line 113
    const v24, 0x41187ae1    # 9.53f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, 0x3cf5c28f    # 0.03f

    .line 120
    .line 121
    .line 122
    const/high16 v26, -0x41000000    # -0.5f

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const v22, -0x41d1eb85    # -0.17f

    .line 127
    .line 128
    .line 129
    const v23, 0x3c23d70a    # 0.01f

    .line 130
    .line 131
    .line 132
    const v24, -0x4151eb85    # -0.34f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40800000    # 4.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41600000    # 14.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, -0x3efd47ae    # -8.17f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, -0x41666666    # -0.3f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40b00000    # 5.5f

    .line 167
    .line 168
    const/high16 v6, 0x41900000    # 18.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, -0x3f9e147b    # -3.53f

    .line 174
    .line 175
    .line 176
    const/high16 v6, 0x40300000    # 2.75f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, 0x3ffae148    # 1.96f

    .line 182
    .line 183
    .line 184
    const v6, 0x40170a3d    # 2.36f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, -0x3f9d70a4    # -3.54f

    .line 191
    .line 192
    .line 193
    const/high16 v6, 0x40300000    # 2.75f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x41840000    # 16.5f

    .line 199
    .line 200
    const/high16 v6, 0x41900000    # 18.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const/16 v16, 0x3800

    .line 218
    .line 219
    const/16 v17, 0x0

    .line 220
    .line 221
    const v6, 0x3e99999a    # 0.3f

    .line 222
    .line 223
    .line 224
    const v8, 0x3e99999a    # 0.3f

    .line 225
    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    const/high16 v9, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v12, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const-string v4, ""

    .line 236
    .line 237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 245
    .line 246
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    const/4 v0, 0x0

    .line 251
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const v0, 0x41235c29    # 10.21f

    .line 268
    .line 269
    .line 270
    const v2, 0x4186a3d7    # 16.83f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, -0x40051eb8    # -1.96f

    .line 277
    .line 278
    .line 279
    const v2, -0x3fe8f5c3    # -2.36f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40b00000    # 5.5f

    .line 286
    .line 287
    const/high16 v2, 0x41900000    # 18.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41300000    # 11.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3f6947ae    # -4.71f

    .line 298
    .line 299
    .line 300
    const v2, -0x3f9d70a4    # -3.54f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40d00000    # 6.5f

    .line 310
    .line 311
    const/high16 v2, 0x41a00000    # 20.0f

    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x41780000    # 15.5f

    .line 317
    .line 318
    const/high16 v18, 0x40000000    # 2.0f

    .line 319
    .line 320
    const/high16 v13, 0x41a00000    # 20.0f

    .line 321
    .line 322
    const v14, 0x408051ec    # 4.01f

    .line 323
    .line 324
    .line 325
    const v15, 0x418feb85    # 17.99f

    .line 326
    .line 327
    .line 328
    const/high16 v16, 0x40000000    # 2.0f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x408051ec    # 4.01f

    .line 334
    .line 335
    .line 336
    const/high16 v2, 0x40d00000    # 6.5f

    .line 337
    .line 338
    const/high16 v4, 0x41300000    # 11.0f

    .line 339
    .line 340
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x4000a3d7    # 2.01f

    .line 344
    .line 345
    .line 346
    const v2, 0x408fae14    # 4.49f

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x40900000    # 4.5f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4018f5c3    # 2.39f

    .line 355
    .line 356
    .line 357
    const v18, -0x40cccccd    # -0.7f

    .line 358
    .line 359
    .line 360
    const v13, 0x3f6147ae    # 0.88f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const v15, 0x3fd9999a    # 1.7f

    .line 365
    .line 366
    .line 367
    const v16, -0x417ae148    # -0.26f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41a80000    # 21.0f

    .line 374
    .line 375
    const v2, 0x4156b852    # 13.42f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x41b35c29    # 22.42f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x419a6666    # 19.3f

    .line 390
    .line 391
    .line 392
    const v2, 0x410e3d71    # 8.89f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3f333333    # 0.7f

    .line 399
    .line 400
    .line 401
    const v18, -0x3fe70a3d    # -2.39f

    .line 402
    .line 403
    .line 404
    const v13, 0x3ee147ae    # 0.44f

    .line 405
    .line 406
    .line 407
    const v14, -0x40cccccd    # -0.7f

    .line 408
    .line 409
    .line 410
    const v15, 0x3f333333    # 0.7f

    .line 411
    .line 412
    .line 413
    const v16, -0x403eb852    # -1.51f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41100000    # 9.0f

    .line 423
    .line 424
    const/high16 v2, 0x41780000    # 15.5f

    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41500000    # 13.0f

    .line 430
    .line 431
    const/high16 v18, 0x40d00000    # 6.5f

    .line 432
    .line 433
    const v13, 0x4161eb85    # 14.12f

    .line 434
    .line 435
    .line 436
    const/high16 v14, 0x41100000    # 9.0f

    .line 437
    .line 438
    const/high16 v15, 0x41500000    # 13.0f

    .line 439
    .line 440
    const v16, 0x40fc28f6    # 7.88f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x4161eb85    # 14.12f

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x40800000    # 4.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x40a3d70a    # 5.12f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x40d00000    # 6.5f

    .line 458
    .line 459
    const/high16 v4, 0x41900000    # 18.0f

    .line 460
    .line 461
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x41870a3d    # 16.88f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x41100000    # 9.0f

    .line 468
    .line 469
    const/high16 v4, 0x41780000    # 15.5f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41a00000    # 20.0f

    .line 478
    .line 479
    const/high16 v2, 0x41900000    # 18.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40800000    # 4.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40c00000    # 6.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x40c0f5c3    # 6.03f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3f147ae1    # 0.58f

    .line 501
    .line 502
    .line 503
    const/high16 v18, -0x40000000    # -2.0f

    .line 504
    .line 505
    const v13, 0x3d75c28f    # 0.06f

    .line 506
    .line 507
    .line 508
    const v14, -0x40c7ae14    # -0.72f

    .line 509
    .line 510
    .line 511
    const v15, 0x3e8a3d71    # 0.27f

    .line 512
    .line 513
    .line 514
    const v16, -0x404e147b    # -1.39f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40800000    # 4.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x40000000    # -2.0f

    .line 526
    .line 527
    const/high16 v18, 0x40000000    # 2.0f

    .line 528
    .line 529
    const v13, -0x40733333    # -1.1f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, -0x40000000    # -2.0f

    .line 534
    .line 535
    const v16, 0x3f666666    # 0.9f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41600000    # 14.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x40000000    # 2.0f

    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const v14, 0x3f8ccccd    # 1.1f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f666666    # 0.9f

    .line 553
    .line 554
    .line 555
    const/high16 v16, 0x40000000    # 2.0f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v18, -0x40000000    # -2.0f

    .line 564
    .line 565
    const v13, 0x3f8ccccd    # 1.1f

    .line 566
    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/high16 v15, 0x40000000    # 2.0f

    .line 570
    .line 571
    const v16, -0x4099999a    # -0.9f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x3f3a8f5c    # -6.17f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, -0x40000000    # -2.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41a00000    # 20.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const/16 v16, 0x3800

    .line 601
    .line 602
    const/16 v17, 0x0

    .line 603
    .line 604
    const/high16 v6, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v8, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    const/high16 v12, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    const/4 v15, 0x0

    .line 613
    const-string v4, ""

    .line 614
    .line 615
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    sput-object v0, Landroidx/compose/material/icons/twotone/ImageSearchKt;->_imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 624
    .line 625
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    return-object v0
.end method

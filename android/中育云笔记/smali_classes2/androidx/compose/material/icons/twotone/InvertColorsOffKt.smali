.class public final Landroidx/compose/material/icons/twotone/InvertColorsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInvertColorsOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/InvertColorsOffKt;->_invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.InvertColorsOff"

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
    const v4, 0x416d47ae    # 14.83f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41980000    # 19.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, -0x3f400000    # -6.0f

    .line 84
    .line 85
    const v26, -0x3f4428f6    # -5.87f

    .line 86
    .line 87
    .line 88
    const v21, -0x3fac28f6    # -3.31f

    .line 89
    .line 90
    .line 91
    const/16 v22, 0x0

    .line 92
    .line 93
    const/high16 v23, -0x3f400000    # -6.0f

    .line 94
    .line 95
    const v24, -0x3fd7ae14    # -2.63f

    .line 96
    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v25, 0x3f828f5c    # 1.02f

    .line 104
    .line 105
    .line 106
    const v26, -0x3fae147b    # -3.28f

    .line 107
    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const v22, -0x4067ae14    # -1.19f

    .line 112
    .line 113
    .line 114
    const v23, 0x3eb851ec    # 0.36f

    .line 115
    .line 116
    .line 117
    const v24, -0x3feb851f    # -2.32f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x416d47ae    # 14.83f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x4099eb85    # 4.81f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, 0x408bd70a    # 4.37f

    .line 139
    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, -0x3ff33333    # -2.2f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x4099eb85    # 4.81f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/16 v16, 0x3800

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const v6, 0x3e99999a    # 0.3f

    .line 168
    .line 169
    .line 170
    const v8, 0x3e99999a    # 0.3f

    .line 171
    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    const/high16 v9, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v12, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const-string v4, ""

    .line 182
    .line 183
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 184
    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 193
    .line 194
    .line 195
    move-result-wide v6

    .line 196
    const/4 v0, 0x0

    .line 197
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const v0, 0x41a9851f    # 21.19f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x4033d70a    # 2.81f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3fb1eb85    # 1.39f

    .line 226
    .line 227
    .line 228
    const v2, 0x40870a3d    # 4.22f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x40866666    # 4.2f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x40333333    # -1.6f

    .line 241
    .line 242
    .line 243
    const v18, 0x40966666    # 4.7f

    .line 244
    .line 245
    .line 246
    const/high16 v13, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v14, 0x3fa7ae14    # 1.31f

    .line 249
    .line 250
    .line 251
    const v15, -0x40333333    # -1.6f

    .line 252
    .line 253
    .line 254
    const v16, 0x403c28f6    # 2.94f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v18, 0x41a80000    # 21.0f

    .line 263
    .line 264
    const/high16 v13, 0x40800000    # 4.0f

    .line 265
    .line 266
    const v14, 0x418bd70a    # 17.48f

    .line 267
    .line 268
    .line 269
    const v15, 0x40f28f5c    # 7.58f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x41a80000    # 21.0f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x409570a4    # 4.67f

    .line 278
    .line 279
    .line 280
    const/high16 v18, -0x40400000    # -1.5f

    .line 281
    .line 282
    const/high16 v13, 0x3fe00000    # 1.75f

    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x40570a3d    # 3.36f

    .line 286
    .line 287
    .line 288
    const v16, -0x40f0a3d7    # -0.56f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x40466666    # 3.1f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x41a9851f    # 21.19f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x41980000    # 19.0f

    .line 310
    .line 311
    const/high16 v2, 0x41400000    # 12.0f

    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, -0x3f400000    # -6.0f

    .line 317
    .line 318
    const v18, -0x3f4428f6    # -5.87f

    .line 319
    .line 320
    .line 321
    const v13, -0x3fac28f6    # -3.31f

    .line 322
    .line 323
    .line 324
    const/high16 v15, -0x3f400000    # -6.0f

    .line 325
    .line 326
    const v16, -0x3fd7ae14    # -2.63f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3f828f5c    # 1.02f

    .line 333
    .line 334
    .line 335
    const v18, -0x3fae147b    # -3.28f

    .line 336
    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, -0x4067ae14    # -1.19f

    .line 340
    .line 341
    .line 342
    const v15, 0x3eb851ec    # 0.36f

    .line 343
    .line 344
    .line 345
    const v16, -0x3feb851f    # -2.32f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x416d47ae    # 14.83f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41980000    # 19.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x4106147b    # 8.38f

    .line 366
    .line 367
    .line 368
    const v2, 0x40b1eb85    # 5.56f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40000000    # 2.0f

    .line 375
    .line 376
    const/high16 v2, 0x41400000    # 12.0f

    .line 377
    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x40b4cccd    # 5.65f

    .line 382
    .line 383
    .line 384
    const v2, 0x40b1eb85    # 5.56f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/4 v0, 0x0

    .line 391
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41a00000    # 20.0f

    .line 395
    .line 396
    const v18, 0x4152147b    # 13.13f

    .line 397
    .line 398
    .line 399
    const v13, 0x4198cccd    # 19.1f

    .line 400
    .line 401
    .line 402
    const v14, 0x410fd70a    # 8.99f

    .line 403
    .line 404
    .line 405
    const/high16 v15, 0x41a00000    # 20.0f

    .line 406
    .line 407
    const v16, 0x412f5c29    # 10.96f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x40c28f5c    # -0.74f

    .line 414
    .line 415
    .line 416
    const v18, 0x40533333    # 3.3f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3f970a3d    # 1.18f

    .line 421
    .line 422
    .line 423
    const v15, -0x4175c28f    # -0.27f

    .line 424
    .line 425
    .line 426
    const v16, 0x40128f5c    # 2.29f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x4112b852    # 9.17f

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x41400000    # 12.0f

    .line 436
    .line 437
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x4099eb85    # 4.81f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x411ccccd    # 9.8f

    .line 447
    .line 448
    .line 449
    const v2, 0x40df0a3d    # 6.97f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x4106147b    # 8.38f

    .line 456
    .line 457
    .line 458
    const v2, 0x40b1eb85    # 5.56f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/16 v16, 0x3800

    .line 472
    .line 473
    const/16 v17, 0x0

    .line 474
    .line 475
    const/high16 v6, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v8, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const/4 v15, 0x0

    .line 484
    const-string v4, ""

    .line 485
    .line 486
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    sput-object v0, Landroidx/compose/material/icons/twotone/InvertColorsOffKt;->_invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    return-object v0
.end method

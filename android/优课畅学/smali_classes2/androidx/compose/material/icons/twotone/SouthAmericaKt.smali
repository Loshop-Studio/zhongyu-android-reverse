.class public final Landroidx/compose/material/icons/twotone/SouthAmericaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSouthAmerica(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SouthAmericaKt;->_southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SouthAmerica"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3fef5c29    # 1.87f

    .line 78
    .line 79
    .line 80
    const v26, -0x3f5bd70a    # -5.13f

    .line 81
    .line 82
    .line 83
    const/16 v21, 0x0

    .line 84
    .line 85
    const v22, -0x40066666    # -1.95f

    .line 86
    .line 87
    .line 88
    const v23, 0x3f333333    # 0.7f

    .line 89
    .line 90
    .line 91
    const v24, -0x3f90a3d7    # -3.74f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41100000    # 9.0f

    .line 100
    .line 101
    const/high16 v6, 0x41200000    # 10.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v26, 0x40000000    # 2.0f

    .line 114
    .line 115
    const v22, 0x3f8ccccd    # 1.1f

    .line 116
    .line 117
    .line 118
    const v23, 0x3f666666    # 0.9f

    .line 119
    .line 120
    .line 121
    const/high16 v24, 0x40000000    # 2.0f

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, 0x40b2e148    # 5.59f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, 0x3e947ae1    # 0.29f

    .line 133
    .line 134
    .line 135
    const v26, 0x3f35c28f    # 0.71f

    .line 136
    .line 137
    .line 138
    const v22, 0x3e8a3d71    # 0.27f

    .line 139
    .line 140
    .line 141
    const v23, 0x3de147ae    # 0.11f

    .line 142
    .line 143
    .line 144
    const v24, 0x3f051eb8    # 0.52f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41a00000    # 20.0f

    .line 151
    .line 152
    const/high16 v6, 0x41400000    # 12.0f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v25, 0x40800000    # 4.0f

    .line 158
    .line 159
    const/high16 v26, 0x41400000    # 12.0f

    .line 160
    .line 161
    const v21, 0x40f28f5c    # 7.58f

    .line 162
    .line 163
    .line 164
    const/high16 v22, 0x41a00000    # 20.0f

    .line 165
    .line 166
    const/high16 v23, 0x40800000    # 4.0f

    .line 167
    .line 168
    const v24, 0x41835c29    # 16.42f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x419f851f    # 19.94f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x41500000    # 13.0f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x41900000    # 18.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, -0x3f4c28f6    # -5.62f

    .line 191
    .line 192
    .line 193
    const/high16 v6, 0x40700000    # 3.75f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x3e800000    # 0.25f

    .line 199
    .line 200
    const v26, -0x40ab851f    # -0.83f

    .line 201
    .line 202
    .line 203
    const v21, 0x3e23d70a    # 0.16f

    .line 204
    .line 205
    .line 206
    const/high16 v22, -0x41800000    # -0.25f

    .line 207
    .line 208
    const/high16 v23, 0x3e800000    # 0.25f

    .line 209
    .line 210
    const v24, -0x40f5c28f    # -0.54f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41280000    # 10.5f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v25, -0x40800000    # -1.0f

    .line 222
    .line 223
    const/high16 v26, -0x40800000    # -1.0f

    .line 224
    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    const v22, -0x40f33333    # -0.55f

    .line 228
    .line 229
    .line 230
    const v23, -0x4119999a    # -0.45f

    .line 231
    .line 232
    .line 233
    const/high16 v24, -0x40800000    # -1.0f

    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, -0x40400000    # -1.5f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, -0x40200000    # -1.75f

    .line 244
    .line 245
    const v6, -0x404ccccd    # -1.4f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, 0x4138a3d7    # 11.54f

    .line 252
    .line 253
    .line 254
    const/high16 v26, 0x40e00000    # 7.0f

    .line 255
    .line 256
    const v21, 0x414b851f    # 12.72f

    .line 257
    .line 258
    .line 259
    const v22, 0x40e8f5c3    # 7.28f

    .line 260
    .line 261
    .line 262
    const v23, 0x41426666    # 12.15f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x40e00000    # 7.0f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41000000    # 8.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, 0x40a23d71    # 5.07f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, 0x41400000    # 12.0f

    .line 282
    .line 283
    const/high16 v26, 0x40800000    # 4.0f

    .line 284
    .line 285
    const v21, 0x4112e148    # 9.18f

    .line 286
    .line 287
    .line 288
    const v22, 0x408c7ae1    # 4.39f

    .line 289
    .line 290
    .line 291
    const v23, 0x4128a3d7    # 10.54f

    .line 292
    .line 293
    .line 294
    const/high16 v24, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x41000000    # 8.0f

    .line 300
    .line 301
    const/high16 v26, 0x41000000    # 8.0f

    .line 302
    .line 303
    const v21, 0x408d1eb8    # 4.41f

    .line 304
    .line 305
    .line 306
    const/16 v22, 0x0

    .line 307
    .line 308
    const/high16 v23, 0x41000000    # 8.0f

    .line 309
    .line 310
    const v24, 0x4065c28f    # 3.59f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v25, 0x41500000    # 13.0f

    .line 317
    .line 318
    const v26, 0x419f851f    # 19.94f

    .line 319
    .line 320
    .line 321
    const/high16 v21, 0x41a00000    # 20.0f

    .line 322
    .line 323
    const v22, 0x41808f5c    # 16.07f

    .line 324
    .line 325
    .line 326
    const v23, 0x4187851f    # 16.94f

    .line 327
    .line 328
    .line 329
    const v24, 0x419b851f    # 19.44f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    const/16 v16, 0x3800

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    const v6, 0x3e99999a    # 0.3f

    .line 347
    .line 348
    .line 349
    const v8, 0x3e99999a    # 0.3f

    .line 350
    .line 351
    .line 352
    const/4 v7, 0x0

    .line 353
    const/high16 v9, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/high16 v12, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    const/4 v15, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v6

    .line 375
    const/4 v0, 0x0

    .line 376
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v2, 0x41400000    # 12.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40000000    # 2.0f

    .line 400
    .line 401
    const/high16 v18, 0x41400000    # 12.0f

    .line 402
    .line 403
    const v13, 0x40cf5c29    # 6.48f

    .line 404
    .line 405
    .line 406
    const/high16 v14, 0x40000000    # 2.0f

    .line 407
    .line 408
    const/high16 v15, 0x40000000    # 2.0f

    .line 409
    .line 410
    const v16, 0x40cf5c29    # 6.48f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41200000    # 10.0f

    .line 417
    .line 418
    const/high16 v18, 0x41200000    # 10.0f

    .line 419
    .line 420
    const/4 v13, 0x0

    .line 421
    const v14, 0x40b0a3d7    # 5.52f

    .line 422
    .line 423
    .line 424
    const v15, 0x408f5c29    # 4.48f

    .line 425
    .line 426
    .line 427
    const/high16 v16, 0x41200000    # 10.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x3f70a3d7    # -4.48f

    .line 433
    .line 434
    .line 435
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 436
    .line 437
    const/high16 v4, 0x41200000    # 10.0f

    .line 438
    .line 439
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, 0x41400000    # 12.0f

    .line 443
    .line 444
    const/high16 v18, 0x40000000    # 2.0f

    .line 445
    .line 446
    const/high16 v13, 0x41b00000    # 22.0f

    .line 447
    .line 448
    const v14, 0x40cf5c29    # 6.48f

    .line 449
    .line 450
    .line 451
    const v15, 0x418c28f6    # 17.52f

    .line 452
    .line 453
    .line 454
    const/high16 v16, 0x40000000    # 2.0f

    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40800000    # 4.0f

    .line 463
    .line 464
    const/high16 v2, 0x41400000    # 12.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x3fef5c29    # 1.87f

    .line 470
    .line 471
    .line 472
    const v18, -0x3f5bd70a    # -5.13f

    .line 473
    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, -0x40066666    # -1.95f

    .line 477
    .line 478
    .line 479
    const v15, 0x3f333333    # 0.7f

    .line 480
    .line 481
    .line 482
    const v16, -0x3f90a3d7    # -3.74f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x41100000    # 9.0f

    .line 489
    .line 490
    const/high16 v2, 0x41200000    # 10.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x3f800000    # 1.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x40000000    # 2.0f

    .line 501
    .line 502
    const/high16 v18, 0x40000000    # 2.0f

    .line 503
    .line 504
    const v14, 0x3f8ccccd    # 1.1f

    .line 505
    .line 506
    .line 507
    const v15, 0x3f666666    # 0.9f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x40000000    # 2.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x40b2e148    # 5.59f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3e947ae1    # 0.29f

    .line 522
    .line 523
    .line 524
    const v18, 0x3f35c28f    # 0.71f

    .line 525
    .line 526
    .line 527
    const v14, 0x3e8a3d71    # 0.27f

    .line 528
    .line 529
    .line 530
    const v15, 0x3de147ae    # 0.11f

    .line 531
    .line 532
    .line 533
    const v16, 0x3f051eb8    # 0.52f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41a00000    # 20.0f

    .line 540
    .line 541
    const/high16 v2, 0x41400000    # 12.0f

    .line 542
    .line 543
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x40800000    # 4.0f

    .line 547
    .line 548
    const/high16 v18, 0x41400000    # 12.0f

    .line 549
    .line 550
    const v13, 0x40f28f5c    # 7.58f

    .line 551
    .line 552
    .line 553
    const/high16 v14, 0x41a00000    # 20.0f

    .line 554
    .line 555
    const/high16 v15, 0x40800000    # 4.0f

    .line 556
    .line 557
    const v16, 0x41835c29    # 16.42f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x419f851f    # 19.94f

    .line 567
    .line 568
    .line 569
    const/high16 v2, 0x41500000    # 13.0f

    .line 570
    .line 571
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41900000    # 18.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x3f4c28f6    # -5.62f

    .line 580
    .line 581
    .line 582
    const/high16 v2, 0x40700000    # 3.75f

    .line 583
    .line 584
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v17, 0x3e800000    # 0.25f

    .line 588
    .line 589
    const v18, -0x40ab851f    # -0.83f

    .line 590
    .line 591
    .line 592
    const v13, 0x3e23d70a    # 0.16f

    .line 593
    .line 594
    .line 595
    const/high16 v14, -0x41800000    # -0.25f

    .line 596
    .line 597
    const/high16 v15, 0x3e800000    # 0.25f

    .line 598
    .line 599
    const v16, -0x40f5c28f    # -0.54f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x41280000    # 10.5f

    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, -0x40800000    # -1.0f

    .line 611
    .line 612
    const/high16 v18, -0x40800000    # -1.0f

    .line 613
    .line 614
    const/4 v13, 0x0

    .line 615
    const v14, -0x40f33333    # -0.55f

    .line 616
    .line 617
    .line 618
    const v15, -0x4119999a    # -0.45f

    .line 619
    .line 620
    .line 621
    const/high16 v16, -0x40800000    # -1.0f

    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, -0x40400000    # -1.5f

    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, -0x40200000    # -1.75f

    .line 632
    .line 633
    const v2, -0x404ccccd    # -1.4f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x4138a3d7    # 11.54f

    .line 640
    .line 641
    .line 642
    const/high16 v18, 0x40e00000    # 7.0f

    .line 643
    .line 644
    const v13, 0x414b851f    # 12.72f

    .line 645
    .line 646
    .line 647
    const v14, 0x40e8f5c3    # 7.28f

    .line 648
    .line 649
    .line 650
    const v15, 0x41426666    # 12.15f

    .line 651
    .line 652
    .line 653
    const/high16 v16, 0x40e00000    # 7.0f

    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41000000    # 8.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x40a23d71    # 5.07f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v17, 0x41400000    # 12.0f

    .line 670
    .line 671
    const/high16 v18, 0x40800000    # 4.0f

    .line 672
    .line 673
    const v13, 0x4112e148    # 9.18f

    .line 674
    .line 675
    .line 676
    const v14, 0x408c7ae1    # 4.39f

    .line 677
    .line 678
    .line 679
    const v15, 0x4128a3d7    # 10.54f

    .line 680
    .line 681
    .line 682
    const/high16 v16, 0x40800000    # 4.0f

    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v17, 0x41000000    # 8.0f

    .line 688
    .line 689
    const/high16 v18, 0x41000000    # 8.0f

    .line 690
    .line 691
    const v13, 0x408d1eb8    # 4.41f

    .line 692
    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    const/high16 v15, 0x41000000    # 8.0f

    .line 696
    .line 697
    const v16, 0x4065c28f    # 3.59f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v17, 0x41500000    # 13.0f

    .line 704
    .line 705
    const v18, 0x419f851f    # 19.94f

    .line 706
    .line 707
    .line 708
    const/high16 v13, 0x41a00000    # 20.0f

    .line 709
    .line 710
    const v14, 0x41808f5c    # 16.07f

    .line 711
    .line 712
    .line 713
    const v15, 0x4187851f    # 16.94f

    .line 714
    .line 715
    .line 716
    const v16, 0x419b851f    # 19.44f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    const/16 v16, 0x3800

    .line 730
    .line 731
    const/16 v17, 0x0

    .line 732
    .line 733
    const/high16 v6, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/high16 v8, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v7, 0x0

    .line 738
    const/high16 v12, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/4 v13, 0x0

    .line 741
    const/4 v14, 0x0

    .line 742
    const/4 v15, 0x0

    .line 743
    const-string v4, ""

    .line 744
    .line 745
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    sput-object v0, Landroidx/compose/material/icons/twotone/SouthAmericaKt;->_southAmerica:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-object v0
.end method

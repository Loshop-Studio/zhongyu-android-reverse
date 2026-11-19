.class public final Landroidx/compose/material/icons/outlined/PsychologyAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychologyAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PsychologyAlt"

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
    const v4, 0x419f851f    # 19.94f

    .line 71
    .line 72
    .line 73
    const v6, 0x4110f5c3    # 9.06f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41500000    # 13.0f

    .line 80
    .line 81
    const/high16 v26, 0x40400000    # 3.0f

    .line 82
    .line 83
    const/high16 v21, 0x419c0000    # 19.5f

    .line 84
    .line 85
    const v22, 0x40b75c29    # 5.73f

    .line 86
    .line 87
    .line 88
    const v23, 0x41848f5c    # 16.57f

    .line 89
    .line 90
    .line 91
    const/high16 v24, 0x40400000    # 3.0f

    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x40c28f5c    # 6.08f

    .line 99
    .line 100
    .line 101
    const/high16 v26, 0x41100000    # 9.0f

    .line 102
    .line 103
    const v21, 0x4117851f    # 9.47f

    .line 104
    .line 105
    .line 106
    const/high16 v22, 0x40400000    # 3.0f

    .line 107
    .line 108
    const v23, 0x40d23d71    # 6.57f

    .line 109
    .line 110
    .line 111
    const v24, 0x40b3851f    # 5.61f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, -0x4008f5c3    # -1.93f

    .line 118
    .line 119
    .line 120
    const v6, 0x405eb852    # 3.48f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x40a00000    # 5.0f

    .line 127
    .line 128
    const/high16 v26, 0x41600000    # 14.0f

    .line 129
    .line 130
    const v21, 0x406f5c29    # 3.74f

    .line 131
    .line 132
    .line 133
    const v22, 0x41523d71    # 13.14f

    .line 134
    .line 135
    .line 136
    const v23, 0x40870a3d    # 4.22f

    .line 137
    .line 138
    .line 139
    const/high16 v24, 0x41600000    # 14.0f

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v25, 0x40000000    # 2.0f

    .line 156
    .line 157
    const/high16 v26, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const v22, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const v23, 0x3f666666    # 0.9f

    .line 165
    .line 166
    .line 167
    const/high16 v24, 0x40000000    # 2.0f

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x3f800000    # 1.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x40400000    # 3.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x40e00000    # 7.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x3f6a3d71    # -4.68f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v25, 0x419f851f    # 19.94f

    .line 194
    .line 195
    .line 196
    const v26, 0x4110f5c3    # 9.06f

    .line 197
    .line 198
    .line 199
    const v21, 0x4194f5c3    # 18.62f

    .line 200
    .line 201
    .line 202
    const v22, 0x41711eb8    # 15.07f

    .line 203
    .line 204
    .line 205
    const v23, 0x41a2cccd    # 20.35f

    .line 206
    .line 207
    .line 208
    const v24, 0x4143d70a    # 12.24f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x416e3d71    # 14.89f

    .line 218
    .line 219
    .line 220
    const v6, 0x416a147b    # 14.63f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41600000    # 14.0f

    .line 227
    .line 228
    const v6, 0x4170cccd    # 15.05f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x41980000    # 19.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x41000000    # 8.0f

    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, -0x3f800000    # -4.0f

    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x40d66666    # 6.7f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x3faa3d71    # 1.33f

    .line 264
    .line 265
    .line 266
    const v6, -0x3feae148    # -2.33f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x41500000    # 13.0f

    .line 273
    .line 274
    const/high16 v26, 0x40a00000    # 5.0f

    .line 275
    .line 276
    const v21, 0x41035c29    # 8.21f

    .line 277
    .line 278
    .line 279
    const v22, 0x40e1eb85    # 7.06f

    .line 280
    .line 281
    .line 282
    const v23, 0x4125999a    # 10.35f

    .line 283
    .line 284
    .line 285
    const/high16 v24, 0x40a00000    # 5.0f

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40a00000    # 5.0f

    .line 291
    .line 292
    const v21, 0x4030a3d7    # 2.76f

    .line 293
    .line 294
    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const/high16 v23, 0x40a00000    # 5.0f

    .line 298
    .line 299
    const v24, 0x400f5c29    # 2.24f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v25, 0x416e3d71    # 14.89f

    .line 306
    .line 307
    .line 308
    const v26, 0x416a147b    # 14.63f

    .line 309
    .line 310
    .line 311
    const/high16 v21, 0x41900000    # 18.0f

    .line 312
    .line 313
    const v22, 0x414170a4    # 12.09f

    .line 314
    .line 315
    .line 316
    const v23, 0x4185ae14    # 16.71f

    .line 317
    .line 318
    .line 319
    const v24, 0x415e147b    # 13.88f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    const/16 v16, 0x3800

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const/high16 v6, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v8, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const/high16 v9, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/high16 v12, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const/4 v14, 0x0

    .line 347
    const/4 v15, 0x0

    .line 348
    const-string v4, ""

    .line 349
    .line 350
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 351
    .line 352
    .line 353
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 358
    .line 359
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 360
    .line 361
    .line 362
    move-result-wide v6

    .line 363
    const/4 v2, 0x0

    .line 364
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    const v4, 0x4148a3d7    # 12.54f

    .line 381
    .line 382
    .line 383
    const/high16 v6, 0x41480000    # 12.5f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, -0x40c28f5c    # -0.74f

    .line 389
    .line 390
    .line 391
    const v26, 0x3f3ae148    # 0.73f

    .line 392
    .line 393
    .line 394
    const v21, -0x412e147b    # -0.41f

    .line 395
    .line 396
    .line 397
    const/16 v22, 0x0

    .line 398
    .line 399
    const v23, -0x40c28f5c    # -0.74f

    .line 400
    .line 401
    .line 402
    const v24, 0x3e9eb852    # 0.31f

    .line 403
    .line 404
    .line 405
    move-object/from16 v20, v2

    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, 0x3f3d70a4    # 0.74f

    .line 411
    .line 412
    .line 413
    const v26, 0x3f3d70a4    # 0.74f

    .line 414
    .line 415
    .line 416
    const/16 v21, 0x0

    .line 417
    .line 418
    const v22, 0x3ed1eb85    # 0.41f

    .line 419
    .line 420
    .line 421
    const v23, 0x3ea8f5c3    # 0.33f

    .line 422
    .line 423
    .line 424
    const v24, 0x3f3d70a4    # 0.74f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v25, 0x3f3ae148    # 0.73f

    .line 431
    .line 432
    .line 433
    const v26, -0x40c28f5c    # -0.74f

    .line 434
    .line 435
    .line 436
    const v21, 0x3ed70a3d    # 0.42f

    .line 437
    .line 438
    .line 439
    const/16 v22, 0x0

    .line 440
    .line 441
    const v23, 0x3f3ae148    # 0.73f

    .line 442
    .line 443
    .line 444
    const v24, -0x41570a3d    # -0.33f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v25, 0x41480000    # 12.5f

    .line 451
    .line 452
    const v26, 0x4148a3d7    # 12.54f

    .line 453
    .line 454
    .line 455
    const v21, 0x4153ae14    # 13.23f

    .line 456
    .line 457
    .line 458
    const v22, 0x414d999a    # 12.85f

    .line 459
    .line 460
    .line 461
    const v23, 0x414eb852    # 12.92f

    .line 462
    .line 463
    .line 464
    const v24, 0x4148a3d7    # 12.54f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/high16 v6, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    const/4 v0, 0x0

    .line 496
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x41480000    # 12.5f

    .line 513
    .line 514
    const/high16 v2, 0x40e00000    # 7.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, -0x40000000    # -2.0f

    .line 520
    .line 521
    const v18, 0x3fb9999a    # 1.45f

    .line 522
    .line 523
    .line 524
    const v13, -0x407c28f6    # -1.03f

    .line 525
    .line 526
    .line 527
    const v15, -0x402147ae    # -1.74f

    .line 528
    .line 529
    .line 530
    const v16, 0x3f2b851f    # 0.67f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3f75c28f    # 0.96f

    .line 537
    .line 538
    .line 539
    const v2, 0x3ecccccd    # 0.4f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x3f866666    # 1.05f

    .line 546
    .line 547
    .line 548
    const v18, -0x40a3d70a    # -0.86f

    .line 549
    .line 550
    .line 551
    const v13, 0x3e051eb8    # 0.13f

    .line 552
    .line 553
    .line 554
    const v14, -0x413851ec    # -0.39f

    .line 555
    .line 556
    .line 557
    const v15, 0x3edc28f6    # 0.43f

    .line 558
    .line 559
    .line 560
    const v16, -0x40a3d70a    # -0.86f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, 0x3f4ccccd    # 0.8f

    .line 567
    .line 568
    .line 569
    const v18, 0x3fae147b    # 1.36f

    .line 570
    .line 571
    .line 572
    const v13, 0x3f733333    # 0.95f

    .line 573
    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const v15, 0x3f90a3d7    # 1.13f

    .line 577
    .line 578
    .line 579
    const v16, 0x3f63d70a    # 0.89f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, -0x406e147b    # -1.14f

    .line 586
    .line 587
    .line 588
    const v18, 0x3fa147ae    # 1.26f

    .line 589
    .line 590
    .line 591
    const v13, -0x415c28f6    # -0.32f

    .line 592
    .line 593
    .line 594
    const v14, 0x3ee66666    # 0.45f

    .line 595
    .line 596
    .line 597
    const v15, -0x40a3d70a    # -0.86f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x3f400000    # 0.75f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x41c7ae14    # -0.18f

    .line 606
    .line 607
    .line 608
    const v18, 0x3f947ae1    # 1.16f

    .line 609
    .line 610
    .line 611
    const v13, -0x41947ae1    # -0.23f

    .line 612
    .line 613
    .line 614
    const v14, 0x3ecccccd    # 0.4f

    .line 615
    .line 616
    .line 617
    const v15, -0x41c7ae14    # -0.18f

    .line 618
    .line 619
    .line 620
    const v16, 0x3f5eb852    # 0.87f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x3f87ae14    # 1.06f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x3e051eb8    # 0.13f

    .line 633
    .line 634
    .line 635
    const v18, -0x40ae147b    # -0.82f

    .line 636
    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const v14, -0x40f33333    # -0.55f

    .line 640
    .line 641
    .line 642
    const v15, 0x3d23d70a    # 0.04f

    .line 643
    .line 644
    .line 645
    const v16, -0x40d9999a    # -0.65f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, 0x3f8b851f    # 1.09f

    .line 652
    .line 653
    .line 654
    const v18, -0x405d70a4    # -1.27f

    .line 655
    .line 656
    .line 657
    const v13, 0x3e6b851f    # 0.23f

    .line 658
    .line 659
    .line 660
    const v14, -0x4128f5c3    # -0.42f

    .line 661
    .line 662
    .line 663
    const v15, 0x3f266666    # 0.65f

    .line 664
    .line 665
    .line 666
    const v16, -0x40e147ae    # -0.62f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, -0x43dc28f6    # -0.01f

    .line 673
    .line 674
    .line 675
    const v18, -0x4019999a    # -1.8f

    .line 676
    .line 677
    .line 678
    const v13, 0x3ecccccd    # 0.4f

    .line 679
    .line 680
    .line 681
    const v14, -0x40e8f5c3    # -0.59f

    .line 682
    .line 683
    .line 684
    const/high16 v15, 0x3e800000    # 0.25f

    .line 685
    .line 686
    const v16, -0x404f5c29    # -1.38f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x41480000    # 12.5f

    .line 693
    .line 694
    const/high16 v18, 0x40e00000    # 7.0f

    .line 695
    .line 696
    const v13, 0x415f3333    # 13.95f

    .line 697
    .line 698
    .line 699
    const v14, 0x40ec7ae1    # 7.39f

    .line 700
    .line 701
    .line 702
    const v15, 0x4155c28f    # 13.36f

    .line 703
    .line 704
    .line 705
    const/high16 v16, 0x40e00000    # 7.0f

    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v16, 0x3800

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/4 v7, 0x0

    .line 724
    const/high16 v12, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v13, 0x0

    .line 727
    const/4 v14, 0x0

    .line 728
    const/4 v15, 0x0

    .line 729
    const-string v4, ""

    .line 730
    .line 731
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    sput-object v0, Landroidx/compose/material/icons/outlined/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    return-object v0
.end method

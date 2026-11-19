.class public final Landroidx/compose/material/icons/twotone/Person2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _person2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Person2Kt;->_person2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Person2"

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
    const v4, 0x415e6666    # 13.9f

    .line 71
    .line 72
    .line 73
    const v6, 0x40f2e148    # 7.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x40c00000    # 6.0f

    .line 82
    .line 83
    const v21, 0x415bd70a    # 13.74f

    .line 84
    .line 85
    .line 86
    const v22, 0x40d570a4    # 6.67f

    .line 87
    .line 88
    .line 89
    const v23, 0x414f0a3d    # 12.94f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40c00000    # 6.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x402147ae    # -1.74f

    .line 100
    .line 101
    .line 102
    const v6, -0x400ccccd    # -1.9f

    .line 103
    .line 104
    .line 105
    const v7, 0x3fcb851f    # 1.59f

    .line 106
    .line 107
    .line 108
    const v8, 0x3f2b851f    # 0.67f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x41200000    # 10.0f

    .line 115
    .line 116
    const v6, 0x411c7ae1    # 9.78f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x408e147b    # 4.44f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x415e6666    # 13.9f

    .line 129
    .line 130
    .line 131
    const v6, 0x40f2e148    # 7.59f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/16 v16, 0x3800

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const v6, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const v8, 0x3e99999a    # 0.3f

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const v4, 0x418bd70a    # 17.48f

    .line 195
    .line 196
    .line 197
    const v6, 0x4182b852    # 16.34f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v26, 0x41700000    # 15.0f

    .line 204
    .line 205
    const v21, 0x418251ec    # 16.29f

    .line 206
    .line 207
    .line 208
    const v22, 0x417bae14    # 15.73f

    .line 209
    .line 210
    .line 211
    const v23, 0x4165eb85    # 14.37f

    .line 212
    .line 213
    .line 214
    const/high16 v24, 0x41700000    # 15.0f

    .line 215
    .line 216
    move-object/from16 v20, v2

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x3f50a3d7    # -5.48f

    .line 222
    .line 223
    .line 224
    const v26, 0x3fab851f    # 1.34f

    .line 225
    .line 226
    .line 227
    const v21, -0x3fe851ec    # -2.37f

    .line 228
    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    const v23, -0x3f76b852    # -4.29f

    .line 233
    .line 234
    .line 235
    const v24, 0x3f3ae148    # 0.73f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x40c00000    # 6.0f

    .line 242
    .line 243
    const v26, 0x4189c28f    # 17.22f

    .line 244
    .line 245
    .line 246
    const v21, 0x40c66666    # 6.2f

    .line 247
    .line 248
    .line 249
    const/high16 v22, 0x41840000    # 16.5f

    .line 250
    .line 251
    const/high16 v23, 0x40c00000    # 6.0f

    .line 252
    .line 253
    const v24, 0x4186b852    # 16.84f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41900000    # 18.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, -0x40b851ec    # -0.78f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x418bd70a    # 17.48f

    .line 276
    .line 277
    .line 278
    const v26, 0x4182b852    # 16.34f

    .line 279
    .line 280
    .line 281
    const/high16 v21, 0x41900000    # 18.0f

    .line 282
    .line 283
    const v22, 0x4186b852    # 16.84f

    .line 284
    .line 285
    .line 286
    const v23, 0x418e6666    # 17.8f

    .line 287
    .line 288
    .line 289
    const/high16 v24, 0x41840000    # 16.5f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    const v6, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const v4, 0x41931eb8    # 18.39f

    .line 338
    .line 339
    .line 340
    const v6, 0x4168f5c3    # 14.56f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x41400000    # 12.0f

    .line 347
    .line 348
    const/high16 v26, 0x41500000    # 13.0f

    .line 349
    .line 350
    const v21, 0x4185ae14    # 16.71f

    .line 351
    .line 352
    .line 353
    const v22, 0x415b3333    # 13.7f

    .line 354
    .line 355
    .line 356
    const v23, 0x41687ae1    # 14.53f

    .line 357
    .line 358
    .line 359
    const/high16 v24, 0x41500000    # 13.0f

    .line 360
    .line 361
    move-object/from16 v20, v2

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v25, -0x3f33851f    # -6.39f

    .line 367
    .line 368
    .line 369
    const v26, 0x3fc7ae14    # 1.56f

    .line 370
    .line 371
    .line 372
    const v21, -0x3fde147b    # -2.53f

    .line 373
    .line 374
    .line 375
    const/16 v22, 0x0

    .line 376
    .line 377
    const v23, -0x3f6947ae    # -4.71f

    .line 378
    .line 379
    .line 380
    const v24, 0x3f333333    # 0.7f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v25, 0x40800000    # 4.0f

    .line 387
    .line 388
    const v26, 0x4189c28f    # 17.22f

    .line 389
    .line 390
    .line 391
    const v21, 0x4093851f    # 4.61f

    .line 392
    .line 393
    .line 394
    const v22, 0x41711eb8    # 15.07f

    .line 395
    .line 396
    .line 397
    const/high16 v23, 0x40800000    # 4.0f

    .line 398
    .line 399
    const v24, 0x4180cccd    # 16.1f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41a00000    # 20.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41800000    # 16.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v4, -0x3fce147b    # -2.78f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v25, 0x41931eb8    # 18.39f

    .line 422
    .line 423
    .line 424
    const v26, 0x4168f5c3    # 14.56f

    .line 425
    .line 426
    .line 427
    const/high16 v21, 0x41a00000    # 20.0f

    .line 428
    .line 429
    const v22, 0x4180cccd    # 16.1f

    .line 430
    .line 431
    .line 432
    const v23, 0x419b1eb8    # 19.39f

    .line 433
    .line 434
    .line 435
    const v24, 0x41711eb8    # 15.07f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v4, 0x41900000    # 18.0f

    .line 445
    .line 446
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x40c00000    # 6.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, -0x40b851ec    # -0.78f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x3f051eb8    # 0.52f

    .line 461
    .line 462
    .line 463
    const v26, -0x409eb852    # -0.88f

    .line 464
    .line 465
    .line 466
    const/16 v21, 0x0

    .line 467
    .line 468
    const v22, -0x413d70a4    # -0.38f

    .line 469
    .line 470
    .line 471
    const v23, 0x3e4ccccd    # 0.2f

    .line 472
    .line 473
    .line 474
    const v24, -0x40c7ae14    # -0.72f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v25, 0x41400000    # 12.0f

    .line 481
    .line 482
    const/high16 v26, 0x41700000    # 15.0f

    .line 483
    .line 484
    const v21, 0x40f6b852    # 7.71f

    .line 485
    .line 486
    .line 487
    const v22, 0x417bae14    # 15.73f

    .line 488
    .line 489
    .line 490
    const v23, 0x411a147b    # 9.63f

    .line 491
    .line 492
    .line 493
    const/high16 v24, 0x41700000    # 15.0f

    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v25, 0x40af5c29    # 5.48f

    .line 499
    .line 500
    .line 501
    const v26, 0x3fab851f    # 1.34f

    .line 502
    .line 503
    .line 504
    const v21, 0x4017ae14    # 2.37f

    .line 505
    .line 506
    .line 507
    const/16 v22, 0x0

    .line 508
    .line 509
    const v23, 0x408947ae    # 4.29f

    .line 510
    .line 511
    .line 512
    const v24, 0x3f3ae148    # 0.73f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v25, 0x41900000    # 18.0f

    .line 519
    .line 520
    const v26, 0x4189c28f    # 17.22f

    .line 521
    .line 522
    .line 523
    const v21, 0x418e6666    # 17.8f

    .line 524
    .line 525
    .line 526
    const/high16 v22, 0x41840000    # 16.5f

    .line 527
    .line 528
    const/high16 v23, 0x41900000    # 18.0f

    .line 529
    .line 530
    const v24, 0x4186b852    # 16.84f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41900000    # 18.0f

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/high16 v6, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v8, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 563
    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 565
    .line 566
    .line 567
    move-result-wide v6

    .line 568
    const/4 v0, 0x0

    .line 569
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x41400000    # 12.0f

    .line 586
    .line 587
    const v2, 0x411c7ae1    # 9.78f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x408e147b    # 4.44f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, 0x3ffd70a4    # 1.98f

    .line 600
    .line 601
    .line 602
    const v18, -0x3fef5c29    # -2.26f

    .line 603
    .line 604
    .line 605
    const v13, 0x3f9ae148    # 1.21f

    .line 606
    .line 607
    .line 608
    const v15, 0x4008f5c3    # 2.14f

    .line 609
    .line 610
    .line 611
    const v16, -0x407851ec    # -1.06f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, -0x415c28f6    # -0.32f

    .line 618
    .line 619
    .line 620
    const v2, -0x3fe33333    # -2.45f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x41400000    # 12.0f

    .line 627
    .line 628
    const/high16 v18, 0x40800000    # 4.0f

    .line 629
    .line 630
    const v13, 0x41791eb8    # 15.57f

    .line 631
    .line 632
    .line 633
    const v14, 0x40ac7ae1    # 5.39f

    .line 634
    .line 635
    .line 636
    const v15, 0x415eb852    # 13.92f

    .line 637
    .line 638
    .line 639
    const/high16 v16, 0x40800000    # 4.0f

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x4101eb85    # 8.12f

    .line 645
    .line 646
    .line 647
    const v2, 0x40e947ae    # 7.29f

    .line 648
    .line 649
    .line 650
    const v4, 0x4106e148    # 8.43f

    .line 651
    .line 652
    .line 653
    const v6, 0x40ac7ae1    # 5.39f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x40f9999a    # 7.8f

    .line 660
    .line 661
    .line 662
    const v2, 0x411bd70a    # 9.74f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, 0x411c7ae1    # 9.78f

    .line 669
    .line 670
    .line 671
    const/high16 v18, 0x41400000    # 12.0f

    .line 672
    .line 673
    const v13, 0x40f47ae1    # 7.64f

    .line 674
    .line 675
    .line 676
    const v14, 0x412f0a3d    # 10.94f

    .line 677
    .line 678
    .line 679
    const v15, 0x41091eb8    # 8.57f

    .line 680
    .line 681
    .line 682
    const/high16 v16, 0x41400000    # 12.0f

    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x4121999a    # 10.1f

    .line 691
    .line 692
    .line 693
    const v2, 0x40f2e148    # 7.59f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v17, 0x41400000    # 12.0f

    .line 700
    .line 701
    const/high16 v18, 0x40c00000    # 6.0f

    .line 702
    .line 703
    const v13, 0x412428f6    # 10.26f

    .line 704
    .line 705
    .line 706
    const v14, 0x40d570a4    # 6.67f

    .line 707
    .line 708
    .line 709
    const v15, 0x4130f5c3    # 11.06f

    .line 710
    .line 711
    .line 712
    const/high16 v16, 0x40c00000    # 6.0f

    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3fdeb852    # 1.74f

    .line 718
    .line 719
    .line 720
    const v2, 0x3ff33333    # 1.9f

    .line 721
    .line 722
    .line 723
    const v4, 0x3fcb851f    # 1.59f

    .line 724
    .line 725
    .line 726
    const v6, 0x3f2b851f    # 0.67f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x4163851f    # 14.22f

    .line 733
    .line 734
    .line 735
    const/high16 v2, 0x41200000    # 10.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, 0x411c7ae1    # 9.78f

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x4121999a    # 10.1f

    .line 747
    .line 748
    .line 749
    const v2, 0x40f2e148    # 7.59f

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const/16 v16, 0x3800

    .line 763
    .line 764
    const/16 v17, 0x0

    .line 765
    .line 766
    const/high16 v6, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/4 v7, 0x0

    .line 769
    const/high16 v12, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/4 v13, 0x0

    .line 772
    const/4 v14, 0x0

    .line 773
    const/4 v15, 0x0

    .line 774
    const-string v4, ""

    .line 775
    .line 776
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    sput-object v0, Landroidx/compose/material/icons/twotone/Person2Kt;->_person2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 785
    .line 786
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    return-object v0
.end method

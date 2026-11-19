.class public final Landroidx/compose/material/icons/outlined/ShareLocationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shareLocation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShareLocation(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ShareLocationKt;->_shareLocation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ShareLocation"

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
    const v4, 0x415051ec    # 13.02f

    .line 71
    .line 72
    .line 73
    const v6, 0x419f70a4    # 19.93f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x400147ae    # 2.02f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, 0x40aa3d71    # 5.32f

    .line 86
    .line 87
    .line 88
    const v26, -0x3ff28f5c    # -2.21f

    .line 89
    .line 90
    .line 91
    const v21, 0x4000a3d7    # 2.01f

    .line 92
    .line 93
    .line 94
    const v22, -0x41b33333    # -0.2f

    .line 95
    .line 96
    .line 97
    const v23, 0x4075c28f    # 3.84f

    .line 98
    .line 99
    .line 100
    const/high16 v24, -0x40800000    # -1.0f

    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, -0x404a3d71    # -1.42f

    .line 108
    .line 109
    .line 110
    const v6, -0x4048f5c3    # -1.43f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x415051ec    # 13.02f

    .line 117
    .line 118
    .line 119
    const v26, 0x419f70a4    # 19.93f

    .line 120
    .line 121
    .line 122
    const v21, 0x417cf5c3    # 15.81f

    .line 123
    .line 124
    .line 125
    const v22, 0x41995c29    # 19.17f

    .line 126
    .line 127
    .line 128
    const v23, 0x4167ae14    # 14.48f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x419e0000    # 19.75f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/16 v16, 0x3800

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/high16 v6, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/high16 v8, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    const/high16 v9, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/high16 v12, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    const/4 v15, 0x0

    .line 159
    const-string v4, ""

    .line 160
    .line 161
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    const v4, 0x4080f5c3    # 4.03f

    .line 192
    .line 193
    .line 194
    const/high16 v6, 0x41400000    # 12.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x40de6666    # 6.95f

    .line 200
    .line 201
    .line 202
    const v26, -0x3f023d71    # -7.93f

    .line 203
    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, -0x3f7e6666    # -4.05f

    .line 208
    .line 209
    .line 210
    const v23, 0x4041eb85    # 3.03f

    .line 211
    .line 212
    .line 213
    const v24, -0x3f12e148    # -7.41f

    .line 214
    .line 215
    .line 216
    move-object/from16 v20, v2

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x40033333    # 2.05f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x4001eb85    # 2.03f

    .line 228
    .line 229
    .line 230
    const/high16 v26, 0x41400000    # 12.0f

    .line 231
    .line 232
    const v21, 0x40be6666    # 5.95f

    .line 233
    .line 234
    .line 235
    const v22, 0x40251eb8    # 2.58f

    .line 236
    .line 237
    .line 238
    const v23, 0x4001eb85    # 2.03f

    .line 239
    .line 240
    .line 241
    const v24, 0x40dae148    # 6.84f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, 0x410f3333    # 8.95f

    .line 248
    .line 249
    .line 250
    const v26, 0x411f3333    # 9.95f

    .line 251
    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const v22, 0x40a51eb8    # 5.16f

    .line 256
    .line 257
    .line 258
    const v23, 0x407ae148    # 3.92f

    .line 259
    .line 260
    .line 261
    const v24, 0x4116b852    # 9.42f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, -0x3ffeb852    # -2.02f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, 0x4080f5c3    # 4.03f

    .line 274
    .line 275
    .line 276
    const/high16 v26, 0x41400000    # 12.0f

    .line 277
    .line 278
    const v21, 0x40e1eb85    # 7.06f

    .line 279
    .line 280
    .line 281
    const v22, 0x419b47ae    # 19.41f

    .line 282
    .line 283
    .line 284
    const v23, 0x4080f5c3    # 4.03f

    .line 285
    .line 286
    .line 287
    const v24, 0x41806666    # 16.05f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const/high16 v6, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const-string v4, ""

    .line 304
    .line 305
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 306
    .line 307
    .line 308
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    const/4 v2, 0x0

    .line 319
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const v4, 0x419f999a    # 19.95f

    .line 336
    .line 337
    .line 338
    const/high16 v6, 0x41300000    # 11.0f

    .line 339
    .line 340
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v4, 0x400147ae    # 2.02f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v25, -0x3ff28f5c    # -2.21f

    .line 350
    .line 351
    .line 352
    const v26, -0x3f55c28f    # -5.32f

    .line 353
    .line 354
    .line 355
    const v21, -0x41b33333    # -0.2f

    .line 356
    .line 357
    .line 358
    const v22, -0x3fff5c29    # -2.01f

    .line 359
    .line 360
    .line 361
    const/high16 v23, -0x40800000    # -1.0f

    .line 362
    .line 363
    const v24, -0x3f8a3d71    # -3.84f

    .line 364
    .line 365
    .line 366
    move-object/from16 v20, v2

    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x3fb70a3d    # 1.43f

    .line 372
    .line 373
    .line 374
    const v6, -0x4048f5c3    # -1.43f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v25, 0x419f999a    # 19.95f

    .line 381
    .line 382
    .line 383
    const/high16 v26, 0x41300000    # 11.0f

    .line 384
    .line 385
    const v21, 0x4199851f    # 19.19f

    .line 386
    .line 387
    .line 388
    const v22, 0x41035c29    # 8.21f

    .line 389
    .line 390
    .line 391
    const v23, 0x419e28f6    # 19.77f

    .line 392
    .line 393
    .line 394
    const v24, 0x4118a3d7    # 9.54f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const/high16 v6, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/4 v7, 0x0

    .line 410
    const-string v4, ""

    .line 411
    .line 412
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v6

    .line 425
    const/4 v2, 0x0

    .line 426
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    const v4, 0x408851ec    # 4.26f

    .line 443
    .line 444
    .line 445
    const v6, 0x4192b852    # 18.34f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, -0x3f55c28f    # -5.32f

    .line 452
    .line 453
    .line 454
    const v26, -0x3ff28f5c    # -2.21f

    .line 455
    .line 456
    .line 457
    const v21, -0x40428f5c    # -1.48f

    .line 458
    .line 459
    .line 460
    const v22, -0x40651eb8    # -1.21f

    .line 461
    .line 462
    .line 463
    const v23, -0x3fab851f    # -3.32f

    .line 464
    .line 465
    .line 466
    const v24, -0x3fff5c29    # -2.01f

    .line 467
    .line 468
    .line 469
    move-object/from16 v20, v2

    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v4, 0x400147ae    # 2.02f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v25, 0x4079999a    # 3.9f

    .line 481
    .line 482
    .line 483
    const v26, 0x3fcf5c29    # 1.62f

    .line 484
    .line 485
    .line 486
    const v21, 0x3fbae148    # 1.46f

    .line 487
    .line 488
    .line 489
    const v22, 0x3e3851ec    # 0.18f

    .line 490
    .line 491
    .line 492
    const v23, 0x40328f5c    # 2.79f

    .line 493
    .line 494
    .line 495
    const v24, 0x3f428f5c    # 0.76f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, 0x408851ec    # 4.26f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    const/high16 v6, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const-string v4, ""

    .line 518
    .line 519
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 520
    .line 521
    .line 522
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 527
    .line 528
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 529
    .line 530
    .line 531
    move-result-wide v6

    .line 532
    const/4 v2, 0x0

    .line 533
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 537
    .line 538
    .line 539
    move-result v10

    .line 540
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 541
    .line 542
    .line 543
    move-result v11

    .line 544
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 547
    .line 548
    .line 549
    const v4, 0x4192a3d7    # 18.33f

    .line 550
    .line 551
    .line 552
    const v6, 0x41873333    # 16.9f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v4, 0x3fb5c28f    # 1.42f

    .line 559
    .line 560
    .line 561
    const v6, 0x3fb70a3d    # 1.43f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v25, 0x400d70a4    # 2.21f

    .line 568
    .line 569
    .line 570
    const v26, -0x3f55c28f    # -5.32f

    .line 571
    .line 572
    .line 573
    const v21, 0x3f9ae148    # 1.21f

    .line 574
    .line 575
    .line 576
    const v22, -0x40428f5c    # -1.48f

    .line 577
    .line 578
    .line 579
    const v23, 0x4000a3d7    # 2.01f

    .line 580
    .line 581
    .line 582
    const v24, -0x3fac28f6    # -3.31f

    .line 583
    .line 584
    .line 585
    move-object/from16 v20, v2

    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v4, -0x3ffeb852    # -2.02f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v25, 0x4192a3d7    # 18.33f

    .line 597
    .line 598
    .line 599
    const v26, 0x41873333    # 16.9f

    .line 600
    .line 601
    .line 602
    const v21, 0x419e28f6    # 19.77f

    .line 603
    .line 604
    .line 605
    const v22, 0x41675c29    # 14.46f

    .line 606
    .line 607
    .line 608
    const v23, 0x4199851f    # 19.19f

    .line 609
    .line 610
    .line 611
    const v24, 0x417ca3d7    # 15.79f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    const-string v4, ""

    .line 628
    .line 629
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 630
    .line 631
    .line 632
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 637
    .line 638
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 639
    .line 640
    .line 641
    move-result-wide v6

    .line 642
    const/4 v0, 0x0

    .line 643
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 647
    .line 648
    .line 649
    move-result v10

    .line 650
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 651
    .line 652
    .line 653
    move-result v11

    .line 654
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41800000    # 16.0f

    .line 660
    .line 661
    const v2, 0x4131999a    # 11.1f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v17, 0x41400000    # 12.0f

    .line 668
    .line 669
    const/high16 v18, 0x40e00000    # 7.0f

    .line 670
    .line 671
    const/high16 v13, 0x41800000    # 16.0f

    .line 672
    .line 673
    const v14, 0x4109c28f    # 8.61f

    .line 674
    .line 675
    .line 676
    const v15, 0x4161999a    # 14.1f

    .line 677
    .line 678
    .line 679
    const/high16 v16, 0x40e00000    # 7.0f

    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x3fce147b    # 1.61f

    .line 685
    .line 686
    .line 687
    const v2, 0x40833333    # 4.1f

    .line 688
    .line 689
    .line 690
    const/high16 v4, -0x3f800000    # -4.0f

    .line 691
    .line 692
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v17, 0x40800000    # 4.0f

    .line 696
    .line 697
    const v18, 0x40bccccd    # 5.9f

    .line 698
    .line 699
    .line 700
    const/4 v13, 0x0

    .line 701
    const v14, 0x3fd47ae1    # 1.66f

    .line 702
    .line 703
    .line 704
    const v15, 0x3faa3d71    # 1.33f

    .line 705
    .line 706
    .line 707
    const v16, 0x406851ec    # 3.63f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v17, 0x41800000    # 16.0f

    .line 714
    .line 715
    const v18, 0x4131999a    # 11.1f

    .line 716
    .line 717
    .line 718
    const v13, 0x416ab852    # 14.67f

    .line 719
    .line 720
    .line 721
    const v14, 0x416bae14    # 14.73f

    .line 722
    .line 723
    .line 724
    const/high16 v15, 0x41800000    # 16.0f

    .line 725
    .line 726
    const v16, 0x414c28f6    # 12.76f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x41400000    # 12.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v17, -0x40770a3d    # -1.07f

    .line 741
    .line 742
    .line 743
    const v18, -0x40770a3d    # -1.07f

    .line 744
    .line 745
    .line 746
    const v13, -0x40e8f5c3    # -0.59f

    .line 747
    .line 748
    .line 749
    const/4 v14, 0x0

    .line 750
    const v15, -0x40770a3d    # -1.07f

    .line 751
    .line 752
    .line 753
    const v16, -0x410a3d71    # -0.48f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, 0x3f88f5c3    # 1.07f

    .line 760
    .line 761
    .line 762
    const/4 v13, 0x0

    .line 763
    const v14, -0x40e8f5c3    # -0.59f

    .line 764
    .line 765
    .line 766
    const v15, 0x3ef5c28f    # 0.48f

    .line 767
    .line 768
    .line 769
    const v16, -0x40770a3d    # -1.07f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x3ef5c28f    # 0.48f

    .line 776
    .line 777
    .line 778
    const v2, 0x3f88f5c3    # 1.07f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x41400000    # 12.0f

    .line 785
    .line 786
    const/high16 v18, 0x41400000    # 12.0f

    .line 787
    .line 788
    const v13, 0x41511eb8    # 13.07f

    .line 789
    .line 790
    .line 791
    const v14, 0x413851ec    # 11.52f

    .line 792
    .line 793
    .line 794
    const v15, 0x414970a4    # 12.59f

    .line 795
    .line 796
    .line 797
    const/high16 v16, 0x41400000    # 12.0f

    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    const/16 v16, 0x3800

    .line 810
    .line 811
    const/16 v17, 0x0

    .line 812
    .line 813
    const/high16 v6, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/4 v7, 0x0

    .line 816
    const/high16 v12, 0x3f800000    # 1.0f

    .line 817
    .line 818
    const/4 v13, 0x0

    .line 819
    const/4 v14, 0x0

    .line 820
    const/4 v15, 0x0

    .line 821
    const-string v4, ""

    .line 822
    .line 823
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    sput-object v0, Landroidx/compose/material/icons/outlined/ShareLocationKt;->_shareLocation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 832
    .line 833
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    return-object v0
.end method

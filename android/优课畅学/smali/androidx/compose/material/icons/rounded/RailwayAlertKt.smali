.class public final Landroidx/compose/material/icons/rounded/RailwayAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRailwayAlert(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RailwayAlertKt;->_railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RailwayAlert"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, 0x40e947ae    # 7.29f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v26, -0x3f60f5c3    # -4.97f

    .line 92
    .line 93
    .line 94
    const v21, -0x40bae148    # -0.77f

    .line 95
    .line 96
    .line 97
    const v22, -0x3fd9999a    # -2.6f

    .line 98
    .line 99
    .line 100
    const v23, 0x3e570a3d    # 0.21f

    .line 101
    .line 102
    .line 103
    const v24, -0x3f6c7ae1    # -4.61f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v26, 0x40e00000    # 7.0f

    .line 114
    .line 115
    const v21, 0x403e147b    # 2.97f

    .line 116
    .line 117
    .line 118
    const v22, 0x402ae148    # 2.67f

    .line 119
    .line 120
    .line 121
    const/high16 v23, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v24, 0x40a0a3d7    # 5.02f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41180000    # 9.5f

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x40b00000    # 5.5f

    .line 135
    .line 136
    const/high16 v26, 0x41a00000    # 20.0f

    .line 137
    .line 138
    const/high16 v21, 0x40000000    # 2.0f

    .line 139
    .line 140
    const v22, 0x419370a4    # 18.43f

    .line 141
    .line 142
    .line 143
    const v23, 0x40647ae1    # 3.57f

    .line 144
    .line 145
    .line 146
    const/high16 v24, 0x41a00000    # 20.0f

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, -0x40651eb8    # -1.21f

    .line 152
    .line 153
    .line 154
    const v6, 0x3f4f5c29    # 0.81f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v25, 0x40800000    # 4.0f

    .line 161
    .line 162
    const v26, 0x41aacccd    # 21.35f

    .line 163
    .line 164
    .line 165
    const v21, 0x4083851f    # 4.11f

    .line 166
    .line 167
    .line 168
    const v22, 0x41a770a4    # 20.93f

    .line 169
    .line 170
    .line 171
    const/high16 v23, 0x40800000    # 4.0f

    .line 172
    .line 173
    const v24, 0x41a90a3d    # 21.13f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, 0x4094cccd    # 4.65f

    .line 184
    .line 185
    .line 186
    const/high16 v26, 0x41b00000    # 22.0f

    .line 187
    .line 188
    const/high16 v21, 0x40800000    # 4.0f

    .line 189
    .line 190
    const v22, 0x41adae14    # 21.71f

    .line 191
    .line 192
    .line 193
    const v23, 0x408947ae    # 4.29f

    .line 194
    .line 195
    .line 196
    const/high16 v24, 0x41b00000    # 22.0f

    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x412b3333    # 10.7f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f266666    # 0.65f

    .line 208
    .line 209
    .line 210
    const v26, -0x40d9999a    # -0.65f

    .line 211
    .line 212
    .line 213
    const v21, 0x3eb851ec    # 0.36f

    .line 214
    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    const v23, 0x3f266666    # 0.65f

    .line 219
    .line 220
    .line 221
    const v24, -0x416b851f    # -0.29f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, -0x416b851f    # -0.29f

    .line 232
    .line 233
    .line 234
    const v26, -0x40f5c28f    # -0.54f

    .line 235
    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const v22, -0x419eb852    # -0.22f

    .line 240
    .line 241
    .line 242
    const v23, -0x421eb852    # -0.11f

    .line 243
    .line 244
    .line 245
    const v24, -0x4128f5c3    # -0.42f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x41680000    # 14.5f

    .line 252
    .line 253
    const/high16 v6, 0x41a00000    # 20.0f

    .line 254
    .line 255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x40600000    # 3.5f

    .line 259
    .line 260
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 261
    .line 262
    const v21, 0x3ff70a3d    # 1.93f

    .line 263
    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const/high16 v23, 0x40600000    # 3.5f

    .line 268
    .line 269
    const v24, -0x40370a3d    # -1.57f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x41500000    # 13.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, -0x3f63851f    # -4.89f

    .line 281
    .line 282
    .line 283
    const/high16 v26, -0x40000000    # -2.0f

    .line 284
    .line 285
    const v21, -0x400b851f    # -1.91f

    .line 286
    .line 287
    .line 288
    const v23, -0x3f97ae14    # -3.63f

    .line 289
    .line 290
    .line 291
    const v24, -0x40bd70a4    # -0.76f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, 0x40800000    # 4.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x41200000    # 10.0f

    .line 306
    .line 307
    const/high16 v6, 0x41880000    # 17.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, -0x40400000    # -1.5f

    .line 313
    .line 314
    const/high16 v26, -0x40400000    # -1.5f

    .line 315
    .line 316
    const v21, -0x40ab851f    # -0.83f

    .line 317
    .line 318
    .line 319
    const/high16 v23, -0x40400000    # -1.5f

    .line 320
    .line 321
    const v24, -0x40d47ae1    # -0.67f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 328
    .line 329
    const/16 v21, 0x0

    .line 330
    .line 331
    const v22, -0x40ab851f    # -0.83f

    .line 332
    .line 333
    .line 334
    const v23, 0x3f2b851f    # 0.67f

    .line 335
    .line 336
    .line 337
    const/high16 v24, -0x40400000    # -1.5f

    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v4, 0x3f2b851f    # 0.67f

    .line 343
    .line 344
    .line 345
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 346
    .line 347
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v25, 0x41200000    # 10.0f

    .line 351
    .line 352
    const/high16 v26, 0x41880000    # 17.0f

    .line 353
    .line 354
    const/high16 v21, 0x41380000    # 11.5f

    .line 355
    .line 356
    const v22, 0x4182a3d7    # 16.33f

    .line 357
    .line 358
    .line 359
    const v23, 0x412d47ae    # 10.83f

    .line 360
    .line 361
    .line 362
    const/high16 v24, 0x41880000    # 17.0f

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const/16 v16, 0x3800

    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    const/high16 v6, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v8, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v7, 0x0

    .line 383
    const/high16 v9, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/high16 v12, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    const/4 v14, 0x0

    .line 389
    const/4 v15, 0x0

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
    const/4 v0, 0x0

    .line 406
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v2, 0x41900000    # 18.0f

    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, -0x3f600000    # -5.0f

    .line 430
    .line 431
    const/high16 v18, 0x40a00000    # 5.0f

    .line 432
    .line 433
    const v13, -0x3fcf5c29    # -2.76f

    .line 434
    .line 435
    .line 436
    const/high16 v15, -0x3f600000    # -5.0f

    .line 437
    .line 438
    const v16, 0x400f5c29    # 2.24f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x400f5c29    # 2.24f

    .line 445
    .line 446
    .line 447
    const/high16 v2, 0x40a00000    # 5.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, -0x3ff0a3d7    # -2.24f

    .line 453
    .line 454
    .line 455
    const/high16 v2, -0x3f600000    # -5.0f

    .line 456
    .line 457
    const/high16 v4, 0x40a00000    # 5.0f

    .line 458
    .line 459
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x41a6147b    # 20.76f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v4, 0x41900000    # 18.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41100000    # 9.0f

    .line 476
    .line 477
    const/high16 v2, 0x41900000    # 18.0f

    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, -0x41000000    # -0.5f

    .line 483
    .line 484
    const/high16 v18, -0x41000000    # -0.5f

    .line 485
    .line 486
    const v13, -0x4170a3d7    # -0.28f

    .line 487
    .line 488
    .line 489
    const/high16 v15, -0x41000000    # -0.5f

    .line 490
    .line 491
    const v16, -0x419eb852    # -0.22f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x41900000    # 18.0f

    .line 498
    .line 499
    const/high16 v18, 0x41000000    # 8.0f

    .line 500
    .line 501
    const/high16 v13, 0x418c0000    # 17.5f

    .line 502
    .line 503
    const v14, 0x4103851f    # 8.22f

    .line 504
    .line 505
    .line 506
    const v15, 0x418dc28f    # 17.72f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x41000000    # 8.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3e6147ae    # 0.22f

    .line 515
    .line 516
    .line 517
    const/high16 v2, 0x3f000000    # 0.5f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v18, 0x41100000    # 9.0f

    .line 523
    .line 524
    const/high16 v13, 0x41940000    # 18.5f

    .line 525
    .line 526
    const v14, 0x410c7ae1    # 8.78f

    .line 527
    .line 528
    .line 529
    const v15, 0x41923d71    # 18.28f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x41100000    # 9.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41940000    # 18.5f

    .line 541
    .line 542
    const/high16 v2, 0x40d00000    # 6.5f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v18, 0x40e00000    # 7.0f

    .line 548
    .line 549
    const v14, 0x40d8f5c3    # 6.78f

    .line 550
    .line 551
    .line 552
    const/high16 v16, 0x40e00000    # 7.0f

    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x419eb852    # -0.22f

    .line 558
    .line 559
    .line 560
    const/high16 v2, -0x41000000    # -0.5f

    .line 561
    .line 562
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v18, 0x40400000    # 3.0f

    .line 571
    .line 572
    const/high16 v13, 0x418c0000    # 17.5f

    .line 573
    .line 574
    const v14, 0x404e147b    # 3.22f

    .line 575
    .line 576
    .line 577
    const v15, 0x418dc28f    # 17.72f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x40400000    # 3.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x3e6147ae    # 0.22f

    .line 586
    .line 587
    .line 588
    const/high16 v2, 0x3f000000    # 0.5f

    .line 589
    .line 590
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x40d00000    # 6.5f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const/16 v16, 0x3800

    .line 606
    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    const/high16 v6, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const/high16 v12, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v13, 0x0

    .line 615
    const/4 v14, 0x0

    .line 616
    const/4 v15, 0x0

    .line 617
    const-string v4, ""

    .line 618
    .line 619
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    sput-object v0, Landroidx/compose/material/icons/rounded/RailwayAlertKt;->_railwayAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 628
    .line 629
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    return-object v0
.end method

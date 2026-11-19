.class public final Landroidx/compose/material/icons/rounded/TakeoutDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _takeoutDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTakeoutDining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TakeoutDiningKt;->_takeoutDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TakeoutDining"

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
    const v4, 0x41aa51ec    # 21.29f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40d80000    # 6.75f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x404ccccd    # -1.4f

    .line 79
    .line 80
    .line 81
    const/16 v26, 0x0

    .line 82
    .line 83
    const v21, -0x413851ec    # -0.39f

    .line 84
    .line 85
    .line 86
    const v22, -0x413851ec    # -0.39f

    .line 87
    .line 88
    .line 89
    const v23, -0x407eb852    # -1.01f

    .line 90
    .line 91
    .line 92
    const v24, -0x413851ec    # -0.39f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41980000    # 19.0f

    .line 101
    .line 102
    const v6, 0x40f428f6    # 7.63f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, 0x3cf5c28f    # 0.03f

    .line 109
    .line 110
    .line 111
    const v6, -0x40f0a3d7    # -0.56f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, -0x3fa28f5c    # -3.46f

    .line 118
    .line 119
    .line 120
    const v6, -0x3fa147ae    # -3.48f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, 0x41626666    # 14.15f

    .line 127
    .line 128
    .line 129
    const/high16 v26, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v21, 0x41730a3d    # 15.19f

    .line 132
    .line 133
    .line 134
    const v22, 0x404d70a4    # 3.21f

    .line 135
    .line 136
    .line 137
    const v23, 0x416ae148    # 14.68f

    .line 138
    .line 139
    .line 140
    const/high16 v24, 0x40400000    # 3.0f

    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, -0x3f766666    # -4.3f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, 0x4106e148    # 8.43f

    .line 152
    .line 153
    .line 154
    const v26, 0x4065c28f    # 3.59f

    .line 155
    .line 156
    .line 157
    const v21, 0x41151eb8    # 9.32f

    .line 158
    .line 159
    .line 160
    const/high16 v22, 0x40400000    # 3.0f

    .line 161
    .line 162
    const v23, 0x410cf5c3    # 8.81f

    .line 163
    .line 164
    .line 165
    const v24, 0x404d70a4    # 3.21f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x409f0a3d    # 4.97f

    .line 172
    .line 173
    .line 174
    const v6, 0x40e23d71    # 7.07f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x40a00000    # 5.0f

    .line 181
    .line 182
    const v6, 0x40f23d71    # 7.57f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x4083851f    # 4.11f

    .line 189
    .line 190
    .line 191
    const v6, 0x40d66666    # 6.7f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, 0x402e147b    # 2.72f

    .line 198
    .line 199
    .line 200
    const v26, 0x40d6b852    # 6.71f

    .line 201
    .line 202
    .line 203
    const v21, 0x406e147b    # 3.72f

    .line 204
    .line 205
    .line 206
    const v22, 0x40ca3d71    # 6.32f

    .line 207
    .line 208
    .line 209
    const v23, 0x40466666    # 3.1f

    .line 210
    .line 211
    .line 212
    const v24, 0x40ca3d71    # 6.32f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x402ccccd    # 2.7f

    .line 219
    .line 220
    .line 221
    const v6, 0x40d75c29    # 6.73f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v26, 0x4102147b    # 8.13f

    .line 228
    .line 229
    .line 230
    const v21, 0x40147ae1    # 2.32f

    .line 231
    .line 232
    .line 233
    const v22, 0x40e3d70a    # 7.12f

    .line 234
    .line 235
    .line 236
    const v23, 0x40147ae1    # 2.32f

    .line 237
    .line 238
    .line 239
    const/high16 v24, 0x40f80000    # 7.75f

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x40951eb8    # 4.66f

    .line 245
    .line 246
    .line 247
    const/high16 v6, 0x41200000    # 10.0f

    .line 248
    .line 249
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, 0x416b0a3d    # 14.69f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x3ff5c28f    # 1.92f

    .line 259
    .line 260
    .line 261
    const v6, -0x40147ae1    # -1.84f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, 0x41aa51ec    # 21.29f

    .line 268
    .line 269
    .line 270
    const/high16 v26, 0x40d80000    # 6.75f

    .line 271
    .line 272
    const v21, 0x41ad5c29    # 21.67f

    .line 273
    .line 274
    .line 275
    const v22, 0x40f8f5c3    # 7.78f

    .line 276
    .line 277
    .line 278
    const v23, 0x41ad70a4    # 21.68f

    .line 279
    .line 280
    .line 281
    const v24, 0x40e47ae1    # 7.14f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v8, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const/high16 v9, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v12, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    const/4 v15, 0x0

    .line 310
    const-string v4, ""

    .line 311
    .line 312
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 313
    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 320
    .line 321
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 322
    .line 323
    .line 324
    move-result-wide v6

    .line 325
    const/4 v0, 0x0

    .line 326
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const v0, 0x41913333    # 18.15f

    .line 343
    .line 344
    .line 345
    const v2, 0x40b947ae    # 5.79f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x40f947ae    # 7.79f

    .line 352
    .line 353
    .line 354
    const/high16 v18, 0x41a00000    # 20.0f

    .line 355
    .line 356
    const v13, 0x40bbd70a    # 5.87f

    .line 357
    .line 358
    .line 359
    const v14, 0x4199851f    # 19.19f

    .line 360
    .line 361
    .line 362
    const v15, 0x40d7ae14    # 6.74f

    .line 363
    .line 364
    .line 365
    const/high16 v16, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4106e148    # 8.43f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3ffeb852    # 1.99f

    .line 377
    .line 378
    .line 379
    const v18, -0x40133333    # -1.85f

    .line 380
    .line 381
    .line 382
    const v13, 0x3f866666    # 1.05f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const v15, 0x3ff5c28f    # 1.92f

    .line 387
    .line 388
    .line 389
    const v16, -0x40b0a3d7    # -0.81f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x3efae148    # 0.49f

    .line 396
    .line 397
    .line 398
    const v2, -0x3f2ccccd    # -6.6f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x40a9999a    # 5.3f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x41913333    # 18.15f

    .line 411
    .line 412
    .line 413
    const v2, 0x40b947ae    # 5.79f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/16 v16, 0x3800

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v7, 0x0

    .line 433
    const/high16 v12, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const/4 v15, 0x0

    .line 437
    const-string v4, ""

    .line 438
    .line 439
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sput-object v0, Landroidx/compose/material/icons/rounded/TakeoutDiningKt;->_takeoutDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 448
    .line 449
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/DoubleArrowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doubleArrow:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoubleArrow(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DoubleArrowKt;->_doubleArrow:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DoubleArrow"

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
    const v4, 0x41a0a3d7    # 20.08f

    .line 71
    .line 72
    .line 73
    const v6, 0x4136b852    # 11.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f7eb852    # -4.04f

    .line 80
    .line 81
    .line 82
    const v6, -0x3f4b3333    # -5.65f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x4168f5c3    # 14.56f

    .line 89
    .line 90
    .line 91
    const/high16 v26, 0x40a00000    # 5.0f

    .line 92
    .line 93
    const v21, 0x417b3333    # 15.7f

    .line 94
    .line 95
    .line 96
    const v22, 0x40a947ae    # 5.29f

    .line 97
    .line 98
    .line 99
    const v23, 0x41726666    # 15.15f

    .line 100
    .line 101
    .line 102
    const/high16 v24, 0x40a00000    # 5.0f

    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v25, -0x404147ae    # -1.49f

    .line 114
    .line 115
    .line 116
    const v26, 0x4038f5c3    # 2.89f

    .line 117
    .line 118
    .line 119
    const v21, -0x404147ae    # -1.49f

    .line 120
    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const v23, -0x3fe9999a    # -2.35f

    .line 125
    .line 126
    .line 127
    const v24, 0x3fd70a3d    # 1.68f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41800000    # 16.0f

    .line 134
    .line 135
    const/high16 v6, 0x41400000    # 12.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x4083851f    # 4.11f

    .line 141
    .line 142
    .line 143
    const v6, -0x3fc47ae1    # -2.93f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v25, 0x3fbeb852    # 1.49f

    .line 150
    .line 151
    .line 152
    const v21, -0x40a147ae    # -0.87f

    .line 153
    .line 154
    .line 155
    const v22, 0x3f9ae148    # 1.21f

    .line 156
    .line 157
    .line 158
    const/16 v23, 0x0

    .line 159
    .line 160
    const v24, 0x4038f5c3    # 2.89f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v26, -0x40bae148    # -0.77f

    .line 171
    .line 172
    .line 173
    const v21, 0x3f170a3d    # 0.59f

    .line 174
    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const v23, 0x3f933333    # 1.15f

    .line 179
    .line 180
    .line 181
    const v24, -0x416b851f    # -0.29f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, 0x408147ae    # 4.04f

    .line 188
    .line 189
    .line 190
    const v6, -0x3f4b3333    # -5.65f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x41a0a3d7    # 20.08f

    .line 197
    .line 198
    .line 199
    const v26, 0x4136b852    # 11.42f

    .line 200
    .line 201
    .line 202
    const v21, 0x41a2a3d7    # 20.33f

    .line 203
    .line 204
    .line 205
    const v22, 0x4143ae14    # 12.23f

    .line 206
    .line 207
    .line 208
    const v23, 0x41a2a3d7    # 20.33f

    .line 209
    .line 210
    .line 211
    const v24, 0x413c51ec    # 11.77f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    const/16 v16, 0x3800

    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const/high16 v6, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v8, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const/high16 v9, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v12, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    const/4 v15, 0x0

    .line 240
    const-string v4, ""

    .line 241
    .line 242
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 243
    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v6

    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const v0, 0x415147ae    # 13.08f

    .line 273
    .line 274
    .line 275
    const v2, 0x4136b852    # 11.42f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x4110cccd    # 9.05f

    .line 282
    .line 283
    .line 284
    const v2, 0x40b8a3d7    # 5.77f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x40f1eb85    # 7.56f

    .line 291
    .line 292
    .line 293
    const/high16 v18, 0x40a00000    # 5.0f

    .line 294
    .line 295
    const v13, 0x410b3333    # 8.7f

    .line 296
    .line 297
    .line 298
    const v14, 0x40a947ae    # 5.29f

    .line 299
    .line 300
    .line 301
    const v15, 0x41026666    # 8.15f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x40a00000    # 5.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, 0x40c23d71    # 6.07f

    .line 314
    .line 315
    .line 316
    const v18, 0x40fc7ae1    # 7.89f

    .line 317
    .line 318
    .line 319
    const v13, 0x40c23d71    # 6.07f

    .line 320
    .line 321
    .line 322
    const/high16 v14, 0x40a00000    # 5.0f

    .line 323
    .line 324
    const v15, 0x40a66666    # 5.2f

    .line 325
    .line 326
    .line 327
    const v16, 0x40d5c28f    # 6.68f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41100000    # 9.0f

    .line 334
    .line 335
    const/high16 v2, 0x41400000    # 12.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x4083851f    # 4.11f

    .line 341
    .line 342
    .line 343
    const v2, -0x3fc47ae1    # -2.93f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x40f1eb85    # 7.56f

    .line 350
    .line 351
    .line 352
    const/high16 v18, 0x41980000    # 19.0f

    .line 353
    .line 354
    const v13, 0x40a66666    # 5.2f

    .line 355
    .line 356
    .line 357
    const v14, 0x418a8f5c    # 17.32f

    .line 358
    .line 359
    .line 360
    const v15, 0x40c23d71    # 6.07f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x41980000    # 19.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/4 v0, 0x0

    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3fbeb852    # 1.49f

    .line 373
    .line 374
    .line 375
    const v18, -0x40bae148    # -0.77f

    .line 376
    .line 377
    .line 378
    const v13, 0x3f170a3d    # 0.59f

    .line 379
    .line 380
    .line 381
    const/4 v14, 0x0

    .line 382
    const v15, 0x3f933333    # 1.15f

    .line 383
    .line 384
    .line 385
    const v16, -0x416b851f    # -0.29f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x408147ae    # 4.04f

    .line 392
    .line 393
    .line 394
    const v2, -0x3f4b3333    # -5.65f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x415147ae    # 13.08f

    .line 401
    .line 402
    .line 403
    const v18, 0x4136b852    # 11.42f

    .line 404
    .line 405
    .line 406
    const v13, 0x415547ae    # 13.33f

    .line 407
    .line 408
    .line 409
    const v14, 0x4143ae14    # 12.23f

    .line 410
    .line 411
    .line 412
    const v15, 0x415547ae    # 13.33f

    .line 413
    .line 414
    .line 415
    const v16, 0x413c51ec    # 11.77f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    const/16 v16, 0x3800

    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const/high16 v6, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const/high16 v12, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const/4 v14, 0x0

    .line 439
    const/4 v15, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    sput-object v0, Landroidx/compose/material/icons/rounded/DoubleArrowKt;->_doubleArrow:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 451
    .line 452
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-object v0
.end method

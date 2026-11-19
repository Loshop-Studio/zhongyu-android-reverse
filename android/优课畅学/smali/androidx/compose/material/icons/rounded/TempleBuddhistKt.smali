.class public final Landroidx/compose/material/icons/rounded/TempleBuddhistKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTempleBuddhist(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TempleBuddhistKt;->_templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TempleBuddhist"

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
    const v4, 0x411028f6    # 9.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x41aecccd    # 21.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x408ccccd    # -0.95f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f2147ae    # 0.63f

    .line 83
    .line 84
    .line 85
    const v21, -0x412e147b    # -0.41f

    .line 86
    .line 87
    .line 88
    const/16 v22, 0x0

    .line 89
    .line 90
    const v23, -0x40ae147b    # -0.82f

    .line 91
    .line 92
    .line 93
    const v24, 0x3e75c28f    # 0.24f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x419828f6    # 19.02f

    .line 102
    .line 103
    .line 104
    const/high16 v26, 0x41300000    # 11.0f

    .line 105
    .line 106
    const v21, 0x41a51eb8    # 20.64f

    .line 107
    .line 108
    .line 109
    const v22, 0x4126e148    # 10.43f

    .line 110
    .line 111
    .line 112
    const v23, 0x419f1eb8    # 19.89f

    .line 113
    .line 114
    .line 115
    const/high16 v24, 0x41300000    # 11.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x409f5c29    # 4.98f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, -0x400f5c29    # -1.88f

    .line 127
    .line 128
    .line 129
    const v26, -0x4051eb85    # -1.36f

    .line 130
    .line 131
    .line 132
    const v21, -0x40a147ae    # -0.87f

    .line 133
    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    const v23, -0x4030a3d7    # -1.62f

    .line 138
    .line 139
    .line 140
    const v24, -0x40ee147b    # -0.57f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, 0x400a3d71    # 2.16f

    .line 147
    .line 148
    .line 149
    const v26, 0x411051ec    # 9.02f

    .line 150
    .line 151
    .line 152
    const v21, 0x403e147b    # 2.97f

    .line 153
    .line 154
    .line 155
    const/high16 v22, 0x41140000    # 9.25f

    .line 156
    .line 157
    const v23, 0x40247ae1    # 2.57f

    .line 158
    .line 159
    .line 160
    const v24, 0x411051ec    # 9.02f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, 0x3f9ae148    # 1.21f

    .line 171
    .line 172
    .line 173
    const v26, 0x41247ae1    # 10.28f

    .line 174
    .line 175
    .line 176
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 177
    .line 178
    const v22, 0x411051ec    # 9.02f

    .line 179
    .line 180
    .line 181
    const/high16 v23, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const v24, 0x411a8f5c    # 9.66f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, 0x40328f5c    # 2.79f

    .line 190
    .line 191
    .line 192
    const v26, 0x40251eb8    # 2.58f

    .line 193
    .line 194
    .line 195
    const v21, 0x3edc28f6    # 0.43f

    .line 196
    .line 197
    .line 198
    const v22, 0x3fa28f5c    # 1.27f

    .line 199
    .line 200
    .line 201
    const v23, 0x3fbd70a4    # 1.48f

    .line 202
    .line 203
    .line 204
    const v24, 0x400f5c29    # 2.24f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41a00000    # 20.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/high16 v26, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/16 v21, 0x0

    .line 220
    .line 221
    const v22, 0x3f8ccccd    # 1.1f

    .line 222
    .line 223
    .line 224
    const v23, 0x3f666666    # 0.9f

    .line 225
    .line 226
    .line 227
    const/high16 v24, 0x40000000    # 2.0f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x40800000    # 4.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, -0x3fc70a3d    # -2.89f

    .line 238
    .line 239
    .line 240
    const/4 v6, 0x0

    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, 0x3fd47ae1    # 1.66f

    .line 245
    .line 246
    .line 247
    const v26, -0x3ffae148    # -2.08f

    .line 248
    .line 249
    .line 250
    const/high16 v22, -0x40800000    # -1.0f

    .line 251
    .line 252
    const v23, 0x3f2e147b    # 0.68f

    .line 253
    .line 254
    .line 255
    const v24, -0x400a3d71    # -1.92f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v25, 0x41600000    # 14.0f

    .line 262
    .line 263
    const/high16 v26, 0x41980000    # 19.0f

    .line 264
    .line 265
    const v21, 0x414eb852    # 12.92f

    .line 266
    .line 267
    .line 268
    const v22, 0x41868f5c    # 16.82f

    .line 269
    .line 270
    .line 271
    const/high16 v23, 0x41600000    # 14.0f

    .line 272
    .line 273
    const v24, 0x418e51ec    # 17.79f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x40400000    # 3.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40800000    # 4.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x40000000    # 2.0f

    .line 290
    .line 291
    const/high16 v26, -0x40000000    # -2.0f

    .line 292
    .line 293
    const v21, 0x3f8ccccd    # 1.1f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/high16 v23, 0x40000000    # 2.0f

    .line 299
    .line 300
    const v24, -0x4099999a    # -0.9f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, -0x3f1b851f    # -7.14f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, 0x4033d70a    # 2.81f

    .line 313
    .line 314
    .line 315
    const v26, -0x3fdae148    # -2.58f

    .line 316
    .line 317
    .line 318
    const v21, 0x3eeb851f    # 0.46f

    .line 319
    .line 320
    .line 321
    const v22, -0x420a3d71    # -0.12f

    .line 322
    .line 323
    .line 324
    const v23, 0x400e147b    # 2.22f

    .line 325
    .line 326
    .line 327
    const v24, -0x40bd70a4    # -0.76f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, 0x41aecccd    # 21.85f

    .line 334
    .line 335
    .line 336
    const v26, 0x411028f6    # 9.01f

    .line 337
    .line 338
    .line 339
    const v21, 0x41b8147b    # 23.01f

    .line 340
    .line 341
    .line 342
    const v22, 0x411a6666    # 9.65f

    .line 343
    .line 344
    .line 345
    const v23, 0x41b4147b    # 22.51f

    .line 346
    .line 347
    .line 348
    const/high16 v24, 0x41100000    # 9.0f

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, 0x411028f6    # 9.01f

    .line 354
    .line 355
    .line 356
    const v6, 0x41aecccd    # 21.85f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v16, 0x3800

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/high16 v6, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v8, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const/high16 v9, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v12, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    const/4 v15, 0x0

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    const/4 v2, 0x0

    .line 401
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const v4, 0x410dc28f    # 8.86f

    .line 418
    .line 419
    .line 420
    const/high16 v6, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v4, 0x41200000    # 10.0f

    .line 426
    .line 427
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x41400000    # 12.0f

    .line 431
    .line 432
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, 0x410dc28f    # 8.86f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v25, 0x4033d70a    # 2.81f

    .line 442
    .line 443
    .line 444
    const v26, -0x3fdae148    # -2.58f

    .line 445
    .line 446
    .line 447
    const v21, 0x3eeb851f    # 0.46f

    .line 448
    .line 449
    .line 450
    const v22, -0x420a3d71    # -0.12f

    .line 451
    .line 452
    .line 453
    const v23, 0x400e147b    # 2.22f

    .line 454
    .line 455
    .line 456
    const v24, -0x40bd70a4    # -0.76f

    .line 457
    .line 458
    .line 459
    move-object/from16 v20, v2

    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v25, -0x408a3d71    # -0.96f

    .line 465
    .line 466
    .line 467
    const v26, -0x405d70a4    # -1.27f

    .line 468
    .line 469
    .line 470
    const v21, 0x3e4ccccd    # 0.2f

    .line 471
    .line 472
    .line 473
    const v22, -0x40deb852    # -0.63f

    .line 474
    .line 475
    .line 476
    const v23, -0x41666666    # -0.3f

    .line 477
    .line 478
    .line 479
    const v24, -0x405d70a4    # -1.27f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/4 v4, 0x0

    .line 486
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, -0x408ccccd    # -0.95f

    .line 490
    .line 491
    .line 492
    const v26, 0x3f2147ae    # 0.63f

    .line 493
    .line 494
    .line 495
    const v21, -0x412e147b    # -0.41f

    .line 496
    .line 497
    .line 498
    const/16 v22, 0x0

    .line 499
    .line 500
    const v23, -0x40ae147b    # -0.82f

    .line 501
    .line 502
    .line 503
    const v24, 0x3e75c28f    # 0.24f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v25, 0x418828f6    # 17.02f

    .line 510
    .line 511
    .line 512
    const/high16 v26, 0x40e00000    # 7.0f

    .line 513
    .line 514
    const v21, 0x41951eb8    # 18.64f

    .line 515
    .line 516
    .line 517
    const v22, 0x40cdc28f    # 6.43f

    .line 518
    .line 519
    .line 520
    const v23, 0x418f1eb8    # 17.89f

    .line 521
    .line 522
    .line 523
    const/high16 v24, 0x40e00000    # 7.0f

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v4, 0x40df5c29    # 6.98f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v25, 0x40a33333    # 5.1f

    .line 535
    .line 536
    .line 537
    const v26, 0x40b47ae1    # 5.64f

    .line 538
    .line 539
    .line 540
    const v21, 0x40c3851f    # 6.11f

    .line 541
    .line 542
    .line 543
    const/high16 v22, 0x40e00000    # 7.0f

    .line 544
    .line 545
    const v23, 0x40ab851f    # 5.36f

    .line 546
    .line 547
    .line 548
    const v24, 0x40cdc28f    # 6.43f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v25, 0x40851eb8    # 4.16f

    .line 555
    .line 556
    .line 557
    const v26, 0x40a0a3d7    # 5.02f

    .line 558
    .line 559
    .line 560
    const v21, 0x409f0a3d    # 4.97f

    .line 561
    .line 562
    .line 563
    const/high16 v22, 0x40a80000    # 5.25f

    .line 564
    .line 565
    const v23, 0x40923d71    # 4.57f

    .line 566
    .line 567
    .line 568
    const v24, 0x40a0a3d7    # 5.02f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/4 v4, 0x0

    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v25, 0x404d70a4    # 3.21f

    .line 579
    .line 580
    .line 581
    const v26, 0x40c8f5c3    # 6.28f

    .line 582
    .line 583
    .line 584
    const/high16 v21, 0x40600000    # 3.5f

    .line 585
    .line 586
    const v22, 0x40a0a3d7    # 5.02f

    .line 587
    .line 588
    .line 589
    const/high16 v23, 0x40400000    # 3.0f

    .line 590
    .line 591
    const v24, 0x40b51eb8    # 5.66f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v25, 0x40c00000    # 6.0f

    .line 598
    .line 599
    const v26, 0x410dc28f    # 8.86f

    .line 600
    .line 601
    .line 602
    const v21, 0x4068f5c3    # 3.64f

    .line 603
    .line 604
    .line 605
    const v22, 0x40f1999a    # 7.55f

    .line 606
    .line 607
    .line 608
    const v23, 0x4096147b    # 4.69f

    .line 609
    .line 610
    .line 611
    const v24, 0x41087ae1    # 8.53f

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
    const v0, 0x41333333    # 11.2f

    .line 660
    .line 661
    .line 662
    const v2, 0x40047ae1    # 2.07f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x41040000    # 8.25f

    .line 669
    .line 670
    const/high16 v2, 0x40c00000    # 6.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v0, 0x40f00000    # 7.5f

    .line 676
    .line 677
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, 0x414ccccd    # 12.8f

    .line 681
    .line 682
    .line 683
    const v2, 0x40047ae1    # 2.07f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x41333333    # 11.2f

    .line 690
    .line 691
    .line 692
    const v18, 0x40047ae1    # 2.07f

    .line 693
    .line 694
    .line 695
    const v13, 0x41466666    # 12.4f

    .line 696
    .line 697
    .line 698
    const v14, 0x3fc3d70a    # 1.53f

    .line 699
    .line 700
    .line 701
    const v15, 0x4139999a    # 11.6f

    .line 702
    .line 703
    .line 704
    const v16, 0x3fc3d70a    # 1.53f

    .line 705
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
    sput-object v0, Landroidx/compose/material/icons/rounded/TempleBuddhistKt;->_templeBuddhist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/NightsStayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightsStay(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NightsStay"

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
    const v4, 0x4131999a    # 11.1f

    .line 71
    .line 72
    .line 73
    const v6, 0x414147ae    # 12.08f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3d8f5c29    # 0.07f

    .line 80
    .line 81
    .line 82
    const v26, -0x3eebae14    # -9.27f

    .line 83
    .line 84
    .line 85
    const/high16 v21, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v22, -0x3f87ae14    # -3.88f

    .line 88
    .line 89
    .line 90
    const v23, -0x40947ae1    # -0.92f

    .line 91
    .line 92
    .line 93
    const v24, -0x3f147ae1    # -7.36f

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
    const v25, -0x40f851ec    # -0.53f

    .line 102
    .line 103
    .line 104
    const v26, -0x40c7ae14    # -0.72f

    .line 105
    .line 106
    .line 107
    const v21, 0x3e428f5c    # 0.19f

    .line 108
    .line 109
    .line 110
    const v22, -0x4147ae14    # -0.36f

    .line 111
    .line 112
    .line 113
    const v23, -0x420a3d71    # -0.12f

    .line 114
    .line 115
    .line 116
    const v24, -0x40bae148    # -0.77f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x3ffeb852    # 1.99f

    .line 123
    .line 124
    .line 125
    const v26, 0x41468f5c    # 12.41f

    .line 126
    .line 127
    .line 128
    const v21, 0x40b3d70a    # 5.62f

    .line 129
    .line 130
    .line 131
    const v22, 0x403147ae    # 2.77f

    .line 132
    .line 133
    .line 134
    const v23, 0x3fe3d70a    # 1.78f

    .line 135
    .line 136
    .line 137
    const v24, 0x40e51eb8    # 7.16f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x3c23d70a    # 0.01f

    .line 144
    .line 145
    .line 146
    const v26, 0x3c23d70a    # 0.01f

    .line 147
    .line 148
    .line 149
    const v21, 0x3c23d70a    # 0.01f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const v23, 0x3c23d70a    # 0.01f

    .line 155
    .line 156
    .line 157
    const/16 v24, 0x0

    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v25, 0x40800000    # 4.0f

    .line 163
    .line 164
    const/high16 v26, 0x41400000    # 12.0f

    .line 165
    .line 166
    const v21, 0x4027ae14    # 2.62f

    .line 167
    .line 168
    .line 169
    const v22, 0x41426666    # 12.15f

    .line 170
    .line 171
    .line 172
    const v23, 0x40528f5c    # 3.29f

    .line 173
    .line 174
    .line 175
    const/high16 v24, 0x41400000    # 12.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x40833333    # 4.1f

    .line 181
    .line 182
    .line 183
    const v26, 0x4009999a    # 2.15f

    .line 184
    .line 185
    .line 186
    const v21, 0x3fd47ae1    # 1.66f

    .line 187
    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const v23, 0x404b851f    # 3.18f

    .line 192
    .line 193
    .line 194
    const v24, 0x3f547ae1    # 0.83f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, 0x41300000    # 11.0f

    .line 201
    .line 202
    const/high16 v26, 0x41900000    # 18.0f

    .line 203
    .line 204
    const v21, 0x411c51ec    # 9.77f

    .line 205
    .line 206
    .line 207
    const v22, 0x416a147b    # 14.63f

    .line 208
    .line 209
    .line 210
    const/high16 v23, 0x41300000    # 11.0f

    .line 211
    .line 212
    const v24, 0x41815c29    # 16.17f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3ff851ec    # -2.12f

    .line 219
    .line 220
    .line 221
    const v26, 0x4060a3d7    # 3.51f

    .line 222
    .line 223
    .line 224
    const/16 v21, 0x0

    .line 225
    .line 226
    const v22, 0x3fc28f5c    # 1.52f

    .line 227
    .line 228
    .line 229
    const v23, -0x40a147ae    # -0.87f

    .line 230
    .line 231
    .line 232
    const v24, 0x40351eb8    # 2.83f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x40470a3d    # 3.11f

    .line 239
    .line 240
    .line 241
    const/high16 v26, 0x3f000000    # 0.5f

    .line 242
    .line 243
    const v21, 0x3f7ae148    # 0.98f

    .line 244
    .line 245
    .line 246
    const v22, 0x3ea3d70a    # 0.32f

    .line 247
    .line 248
    .line 249
    const v23, 0x4001eb85    # 2.03f

    .line 250
    .line 251
    .line 252
    const/high16 v24, 0x3f000000    # 0.5f

    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, 0x40f851ec    # 7.76f

    .line 258
    .line 259
    .line 260
    const v26, -0x3f93d70a    # -3.69f

    .line 261
    .line 262
    .line 263
    const v21, 0x404851ec    # 3.13f

    .line 264
    .line 265
    .line 266
    const/16 v22, 0x0

    .line 267
    .line 268
    const v23, 0x40bd70a4    # 5.92f

    .line 269
    .line 270
    .line 271
    const v24, -0x4047ae14    # -1.44f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v25, -0x41428f5c    # -0.37f

    .line 278
    .line 279
    .line 280
    const v26, -0x40ae147b    # -0.82f

    .line 281
    .line 282
    .line 283
    const v21, 0x3e851eb8    # 0.26f

    .line 284
    .line 285
    .line 286
    const v22, -0x415c28f6    # -0.32f

    .line 287
    .line 288
    .line 289
    const v23, 0x3d23d70a    # 0.04f

    .line 290
    .line 291
    .line 292
    const v24, -0x40b5c28f    # -0.79f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, 0x4131999a    # 11.1f

    .line 299
    .line 300
    .line 301
    const v26, 0x414147ae    # 12.08f

    .line 302
    .line 303
    .line 304
    const v21, 0x41871eb8    # 16.89f

    .line 305
    .line 306
    .line 307
    const v22, 0x418af5c3    # 17.37f

    .line 308
    .line 309
    .line 310
    const v23, 0x4151999a    # 13.1f

    .line 311
    .line 312
    .line 313
    const v24, 0x417f851f    # 15.97f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    const/16 v16, 0x3800

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const/high16 v6, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v8, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const/high16 v9, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/high16 v12, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const/4 v14, 0x0

    .line 341
    const/4 v15, 0x0

    .line 342
    const-string v4, ""

    .line 343
    .line 344
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 345
    .line 346
    .line 347
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    const/4 v0, 0x0

    .line 358
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40e00000    # 7.0f

    .line 375
    .line 376
    const/high16 v2, 0x41800000    # 16.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x41c7ae14    # -0.18f

    .line 382
    .line 383
    .line 384
    const/4 v2, 0x0

    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x40800000    # 4.0f

    .line 389
    .line 390
    const/high16 v18, 0x41600000    # 14.0f

    .line 391
    .line 392
    const v13, 0x40cccccd    # 6.4f

    .line 393
    .line 394
    .line 395
    const v14, 0x416d70a4    # 14.84f

    .line 396
    .line 397
    .line 398
    const v15, 0x40a9999a    # 5.3f

    .line 399
    .line 400
    .line 401
    const/high16 v16, 0x41600000    # 14.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 407
    .line 408
    const/high16 v18, 0x40400000    # 3.0f

    .line 409
    .line 410
    const v13, -0x402b851f    # -1.66f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 415
    .line 416
    const v16, 0x3fab851f    # 1.34f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3fab851f    # 1.34f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40400000    # 3.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40400000    # 3.0f

    .line 431
    .line 432
    const/16 v18, 0x0

    .line 433
    .line 434
    const v13, 0x3f1eb852    # 0.62f

    .line 435
    .line 436
    .line 437
    const v15, 0x401f5c29    # 2.49f

    .line 438
    .line 439
    .line 440
    const/16 v16, 0x0

    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x40000000    # 2.0f

    .line 446
    .line 447
    const/high16 v18, -0x40000000    # -2.0f

    .line 448
    .line 449
    const v13, 0x3f8ccccd    # 1.1f

    .line 450
    .line 451
    .line 452
    const/high16 v15, 0x40000000    # 2.0f

    .line 453
    .line 454
    const v16, -0x4099999a    # -0.9f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x40e00000    # 7.0f

    .line 461
    .line 462
    const/high16 v18, 0x41800000    # 16.0f

    .line 463
    .line 464
    const/high16 v13, 0x41100000    # 9.0f

    .line 465
    .line 466
    const v14, 0x41873333    # 16.9f

    .line 467
    .line 468
    .line 469
    const v15, 0x4101999a    # 8.1f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x41800000    # 16.0f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v7, 0x0

    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const/4 v14, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Landroidx/compose/material/icons/rounded/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v0
.end method

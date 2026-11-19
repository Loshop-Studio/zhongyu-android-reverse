.class public final Landroidx/compose/material/icons/sharp/StorefrontKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _storefront:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStorefront(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Storefront"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x41af3333    # 21.9f

    .line 71
    .line 72
    .line 73
    const v2, 0x410e3d71    # 8.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x41a3eb85    # 20.49f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x3f900000    # -3.75f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v0, -0x3fff5c29    # -2.01f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41500000    # 13.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x40000000    # -2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x41147ae1    # 9.28f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x40e851ec    # 7.26f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x4060a3d7    # 3.51f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x40066666    # 2.1f

    .line 127
    .line 128
    .line 129
    const v2, 0x410e3d71    # 8.89f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3f1eb852    # 0.62f

    .line 136
    .line 137
    .line 138
    const v18, 0x403851ec    # 2.88f

    .line 139
    .line 140
    .line 141
    const v13, -0x418a3d71    # -0.24f

    .line 142
    .line 143
    .line 144
    const v14, 0x3f828f5c    # 1.02f

    .line 145
    .line 146
    .line 147
    const v15, -0x435c28f6    # -0.02f

    .line 148
    .line 149
    .line 150
    const v16, 0x4003d70a    # 2.06f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x40400000    # 3.0f

    .line 157
    .line 158
    const v18, 0x4140f5c3    # 12.06f

    .line 159
    .line 160
    .line 161
    const v13, 0x40333333    # 2.8f

    .line 162
    .line 163
    .line 164
    const v14, 0x413e147b    # 11.88f

    .line 165
    .line 166
    .line 167
    const v15, 0x403a3d71    # 2.91f

    .line 168
    .line 169
    .line 170
    const v16, 0x413f5c29    # 11.96f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x41a80000    # 21.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41900000    # 18.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, -0x3ef0f5c3    # -8.94f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x3e8f5c29    # 0.28f

    .line 193
    .line 194
    .line 195
    const v18, -0x4170a3d7    # -0.28f

    .line 196
    .line 197
    .line 198
    const v13, 0x3db851ec    # 0.09f

    .line 199
    .line 200
    .line 201
    const v14, -0x4247ae14    # -0.09f

    .line 202
    .line 203
    .line 204
    const v15, 0x3e4ccccd    # 0.2f

    .line 205
    .line 206
    .line 207
    const v16, -0x41c7ae14    # -0.18f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x41af3333    # 21.9f

    .line 214
    .line 215
    .line 216
    const v18, 0x410e3d71    # 8.89f

    .line 217
    .line 218
    .line 219
    const v13, 0x41af5c29    # 21.92f

    .line 220
    .line 221
    .line 222
    const v14, 0x412f5c29    # 10.96f

    .line 223
    .line 224
    .line 225
    const v15, 0x41b13333    # 22.15f

    .line 226
    .line 227
    .line 228
    const v16, 0x411e8f5c    # 9.91f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x40e0a3d7    # 7.02f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x40a00000    # 5.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x40ce147b    # 6.44f

    .line 246
    .line 247
    .line 248
    const v2, 0x411dc28f    # 9.86f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x40a75c29    # 5.23f

    .line 255
    .line 256
    .line 257
    const/high16 v18, 0x41300000    # 11.0f

    .line 258
    .line 259
    const v13, 0x40cb851f    # 6.36f

    .line 260
    .line 261
    .line 262
    const v14, 0x412828f6    # 10.51f

    .line 263
    .line 264
    .line 265
    const v15, 0x40bae148    # 5.84f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x41300000    # 11.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x4091eb85    # -0.93f

    .line 274
    .line 275
    .line 276
    const v18, -0x410f5c29    # -0.47f

    .line 277
    .line 278
    .line 279
    const v13, -0x41051eb8    # -0.49f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v15, -0x40b33333    # -0.8f

    .line 284
    .line 285
    .line 286
    const v16, -0x416b851f    # -0.29f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, -0x41800000    # -0.25f

    .line 293
    .line 294
    const v18, -0x406a3d71    # -1.17f

    .line 295
    .line 296
    .line 297
    const v13, -0x417ae148    # -0.26f

    .line 298
    .line 299
    .line 300
    const v14, -0x41570a3d    # -0.33f

    .line 301
    .line 302
    .line 303
    const v15, -0x414ccccd    # -0.35f

    .line 304
    .line 305
    .line 306
    const v16, -0x40bd70a4    # -0.76f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40a2e148    # 5.09f

    .line 313
    .line 314
    .line 315
    const/high16 v2, 0x40a00000    # 5.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x40e0a3d7    # 7.02f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x419747ae    # 18.91f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3f866666    # 1.05f

    .line 336
    .line 337
    .line 338
    const v2, 0x408b851f    # 4.36f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v18, 0x3f95c28f    # 1.17f

    .line 345
    .line 346
    .line 347
    const v13, 0x3dcccccd    # 0.1f

    .line 348
    .line 349
    .line 350
    const v14, 0x3ed70a3d    # 0.42f

    .line 351
    .line 352
    .line 353
    const v15, 0x3c23d70a    # 0.01f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f570a3d    # 0.84f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x419628f6    # 18.77f

    .line 363
    .line 364
    .line 365
    const/high16 v18, 0x41300000    # 11.0f

    .line 366
    .line 367
    const v13, 0x419c8f5c    # 19.57f

    .line 368
    .line 369
    .line 370
    const v14, 0x412b5c29    # 10.71f

    .line 371
    .line 372
    .line 373
    const v15, 0x419a28f6    # 19.27f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x41300000    # 11.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x40651eb8    # -1.21f

    .line 382
    .line 383
    .line 384
    const v18, -0x406e147b    # -1.14f

    .line 385
    .line 386
    .line 387
    const v13, -0x40e3d70a    # -0.61f

    .line 388
    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    const v15, -0x406e147b    # -1.14f

    .line 392
    .line 393
    .line 394
    const v16, -0x41051eb8    # -0.49f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4187d70a    # 16.98f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x40a00000    # 5.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x419747ae    # 18.91f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x411851ec    # 9.52f

    .line 418
    .line 419
    .line 420
    const v2, 0x417828f6    # 15.51f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, -0x41570a3d    # -0.33f

    .line 427
    .line 428
    .line 429
    const v18, 0x3f88f5c3    # 1.07f

    .line 430
    .line 431
    .line 432
    const v13, 0x3d4ccccd    # 0.05f

    .line 433
    .line 434
    .line 435
    const v14, 0x3ec7ae14    # 0.39f

    .line 436
    .line 437
    .line 438
    const v15, -0x4270a3d7    # -0.07f

    .line 439
    .line 440
    .line 441
    const v16, 0x3f47ae14    # 0.78f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x4163851f    # 14.22f

    .line 448
    .line 449
    .line 450
    const/high16 v18, 0x41300000    # 11.0f

    .line 451
    .line 452
    const v13, 0x416f3333    # 14.95f

    .line 453
    .line 454
    .line 455
    const v14, 0x412d999a    # 10.85f

    .line 456
    .line 457
    .line 458
    const v15, 0x416a147b    # 14.63f

    .line 459
    .line 460
    .line 461
    const/high16 v16, 0x41300000    # 11.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x41500000    # 13.0f

    .line 467
    .line 468
    const v18, 0x411b0a3d    # 9.69f

    .line 469
    .line 470
    .line 471
    const v13, 0x4158cccd    # 13.55f

    .line 472
    .line 473
    .line 474
    const/high16 v14, 0x41300000    # 11.0f

    .line 475
    .line 476
    const/high16 v15, 0x41500000    # 13.0f

    .line 477
    .line 478
    const v16, 0x41268f5c    # 10.41f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40a00000    # 5.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x3ffae148    # 1.96f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x411851ec    # 9.52f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x411b0a3d    # 9.69f

    .line 505
    .line 506
    .line 507
    const/high16 v2, 0x41300000    # 11.0f

    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x411b5c29    # 9.71f

    .line 513
    .line 514
    .line 515
    const/high16 v18, 0x41300000    # 11.0f

    .line 516
    .line 517
    const/high16 v13, 0x41300000    # 11.0f

    .line 518
    .line 519
    const v14, 0x41268f5c    # 10.41f

    .line 520
    .line 521
    .line 522
    const v15, 0x41273333    # 10.45f

    .line 523
    .line 524
    .line 525
    const/high16 v16, 0x41300000    # 11.0f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x409c28f6    # -0.89f

    .line 531
    .line 532
    .line 533
    const v18, -0x412e147b    # -0.41f

    .line 534
    .line 535
    .line 536
    const v13, -0x4151eb85    # -0.34f

    .line 537
    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const v15, -0x40d9999a    # -0.65f

    .line 541
    .line 542
    .line 543
    const v16, -0x41e66666    # -0.15f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x4107d70a    # 8.49f

    .line 550
    .line 551
    .line 552
    const v18, 0x411851ec    # 9.52f

    .line 553
    .line 554
    .line 555
    const v13, 0x41091eb8    # 8.57f

    .line 556
    .line 557
    .line 558
    const v14, 0x4124cccd    # 10.3f

    .line 559
    .line 560
    .line 561
    const v15, 0x41073333    # 8.45f

    .line 562
    .line 563
    .line 564
    const v16, 0x411e8f5c    # 9.91f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x4110a3d7    # 9.04f

    .line 571
    .line 572
    .line 573
    const/high16 v2, 0x40a00000    # 5.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41300000    # 11.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x411b0a3d    # 9.69f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41980000    # 19.0f

    .line 593
    .line 594
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, -0x3f3f0a3d    # -6.03f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, 0x40a75c29    # 5.23f

    .line 604
    .line 605
    .line 606
    const/high16 v18, 0x41500000    # 13.0f

    .line 607
    .line 608
    const v13, 0x40a28f5c    # 5.08f

    .line 609
    .line 610
    .line 611
    const v14, 0x414fae14    # 12.98f

    .line 612
    .line 613
    .line 614
    const v15, 0x40a4cccd    # 5.15f

    .line 615
    .line 616
    .line 617
    const/high16 v16, 0x41500000    # 13.0f

    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x400f5c29    # 2.24f

    .line 623
    .line 624
    .line 625
    const v18, -0x408ccccd    # -0.95f

    .line 626
    .line 627
    .line 628
    const v13, 0x3f5eb852    # 0.87f

    .line 629
    .line 630
    .line 631
    const/4 v14, 0x0

    .line 632
    const v15, 0x3fd47ae1    # 1.66f

    .line 633
    .line 634
    .line 635
    const v16, -0x4147ae14    # -0.36f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x4013d70a    # 2.31f

    .line 642
    .line 643
    .line 644
    const v18, 0x3f733333    # 0.95f

    .line 645
    .line 646
    .line 647
    const v13, 0x3f19999a    # 0.6f

    .line 648
    .line 649
    .line 650
    const v14, 0x3f19999a    # 0.6f

    .line 651
    .line 652
    .line 653
    const v15, 0x3fb33333    # 1.4f

    .line 654
    .line 655
    .line 656
    const v16, 0x3f733333    # 0.95f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, 0x400eb852    # 2.23f

    .line 663
    .line 664
    .line 665
    const v18, -0x4091eb85    # -0.93f

    .line 666
    .line 667
    .line 668
    const v13, 0x3f5eb852    # 0.87f

    .line 669
    .line 670
    .line 671
    const/4 v14, 0x0

    .line 672
    const v15, 0x3fd33333    # 1.65f

    .line 673
    .line 674
    .line 675
    const v16, -0x4147ae14    # -0.36f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x40128f5c    # 2.29f

    .line 682
    .line 683
    .line 684
    const v18, 0x3f6e147b    # 0.93f

    .line 685
    .line 686
    .line 687
    const v13, 0x3f170a3d    # 0.59f

    .line 688
    .line 689
    .line 690
    const v14, 0x3f11eb85    # 0.57f

    .line 691
    .line 692
    .line 693
    const v15, 0x3fb1eb85    # 1.39f

    .line 694
    .line 695
    .line 696
    const v16, 0x3f6e147b    # 0.93f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x400f5c29    # 2.24f

    .line 703
    .line 704
    .line 705
    const v18, -0x408ccccd    # -0.95f

    .line 706
    .line 707
    .line 708
    const v13, 0x3f570a3d    # 0.84f

    .line 709
    .line 710
    .line 711
    const/4 v14, 0x0

    .line 712
    const v15, 0x3fd1eb85    # 1.64f

    .line 713
    .line 714
    .line 715
    const v16, -0x414ccccd    # -0.35f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v18, 0x3f733333    # 0.95f

    .line 722
    .line 723
    .line 724
    const v13, 0x3f147ae1    # 0.58f

    .line 725
    .line 726
    .line 727
    const v14, 0x3f170a3d    # 0.59f

    .line 728
    .line 729
    .line 730
    const v15, 0x3faf5c29    # 1.37f

    .line 731
    .line 732
    .line 733
    const v16, 0x3f733333    # 0.95f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v17, 0x3e6b851f    # 0.23f

    .line 740
    .line 741
    .line 742
    const v18, -0x430a3d71    # -0.03f

    .line 743
    .line 744
    .line 745
    const v13, 0x3da3d70a    # 0.08f

    .line 746
    .line 747
    .line 748
    const/4 v14, 0x0

    .line 749
    const v15, 0x3e19999a    # 0.15f

    .line 750
    .line 751
    .line 752
    const v16, -0x435c28f6    # -0.02f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v0, 0x41980000    # 19.0f

    .line 759
    .line 760
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x40a00000    # 5.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const/16 v16, 0x3800

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const/high16 v6, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/high16 v8, 0x3f800000    # 1.0f

    .line 782
    .line 783
    const/4 v7, 0x0

    .line 784
    const/high16 v9, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/high16 v12, 0x3f800000    # 1.0f

    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const/4 v15, 0x0

    .line 790
    const-string v4, ""

    .line 791
    .line 792
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    sput-object v0, Landroidx/compose/material/icons/sharp/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 801
    .line 802
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    return-object v0
.end method

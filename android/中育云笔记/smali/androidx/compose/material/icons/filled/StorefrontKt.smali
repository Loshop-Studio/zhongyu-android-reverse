.class public final Landroidx/compose/material/icons/filled/StorefrontKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _storefront:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStorefront(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Storefront"

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
    const v0, -0x4079999a    # -1.05f

    .line 80
    .line 81
    .line 82
    const v2, -0x3f7428f6    # -4.37f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x400b851f    # -1.91f

    .line 89
    .line 90
    .line 91
    const v18, -0x403d70a4    # -1.52f

    .line 92
    .line 93
    .line 94
    const v13, -0x419eb852    # -0.22f

    .line 95
    .line 96
    .line 97
    const v14, -0x4099999a    # -0.9f

    .line 98
    .line 99
    .line 100
    const/high16 v15, -0x40800000    # -1.0f

    .line 101
    .line 102
    const v16, -0x403d70a4    # -1.52f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x40a1999a    # 5.05f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x4049999a    # 3.15f

    .line 115
    .line 116
    .line 117
    const v18, 0x4090a3d7    # 4.52f

    .line 118
    .line 119
    .line 120
    const v13, 0x4084cccd    # 4.15f

    .line 121
    .line 122
    .line 123
    const/high16 v14, 0x40400000    # 3.0f

    .line 124
    .line 125
    const v15, 0x40570a3d    # 3.36f

    .line 126
    .line 127
    .line 128
    const v16, 0x406851ec    # 3.63f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40066666    # 2.1f

    .line 135
    .line 136
    .line 137
    const v2, 0x410e3d71    # 8.89f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f1eb852    # 0.62f

    .line 144
    .line 145
    .line 146
    const v18, 0x403851ec    # 2.88f

    .line 147
    .line 148
    .line 149
    const v13, -0x418a3d71    # -0.24f

    .line 150
    .line 151
    .line 152
    const v14, 0x3f828f5c    # 1.02f

    .line 153
    .line 154
    .line 155
    const v15, -0x435c28f6    # -0.02f

    .line 156
    .line 157
    .line 158
    const v16, 0x4003d70a    # 2.06f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x40400000    # 3.0f

    .line 165
    .line 166
    const v18, 0x4140f5c3    # 12.06f

    .line 167
    .line 168
    .line 169
    const v13, 0x40333333    # 2.8f

    .line 170
    .line 171
    .line 172
    const v14, 0x413e147b    # 11.88f

    .line 173
    .line 174
    .line 175
    const v15, 0x403a3d71    # 2.91f

    .line 176
    .line 177
    .line 178
    const v16, 0x413f5c29    # 11.96f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, 0x41980000    # 19.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x40000000    # 2.0f

    .line 190
    .line 191
    const/high16 v18, 0x40000000    # 2.0f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, 0x3f8ccccd    # 1.1f

    .line 195
    .line 196
    .line 197
    const v15, 0x3f666666    # 0.9f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41600000    # 14.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v18, -0x40000000    # -2.0f

    .line 211
    .line 212
    const v13, 0x3f8ccccd    # 1.1f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/high16 v15, 0x40000000    # 2.0f

    .line 217
    .line 218
    const v16, -0x4099999a    # -0.9f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x3f21eb85    # -6.94f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3e8f5c29    # 0.28f

    .line 231
    .line 232
    .line 233
    const v18, -0x4170a3d7    # -0.28f

    .line 234
    .line 235
    .line 236
    const v13, 0x3db851ec    # 0.09f

    .line 237
    .line 238
    .line 239
    const v14, -0x4247ae14    # -0.09f

    .line 240
    .line 241
    .line 242
    const v15, 0x3e4ccccd    # 0.2f

    .line 243
    .line 244
    .line 245
    const v16, -0x41c7ae14    # -0.18f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x41af3333    # 21.9f

    .line 252
    .line 253
    .line 254
    const v18, 0x410e3d71    # 8.89f

    .line 255
    .line 256
    .line 257
    const v13, 0x41af5c29    # 21.92f

    .line 258
    .line 259
    .line 260
    const v14, 0x412f5c29    # 10.96f

    .line 261
    .line 262
    .line 263
    const v15, 0x41b13333    # 22.15f

    .line 264
    .line 265
    .line 266
    const v16, 0x411e8f5c    # 9.91f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x409fae14    # 4.99f

    .line 276
    .line 277
    .line 278
    const v2, 0x419747ae    # 18.91f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x3f866666    # 1.05f

    .line 285
    .line 286
    .line 287
    const v2, 0x408bd70a    # 4.37f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, -0x41800000    # -0.25f

    .line 294
    .line 295
    const v18, 0x3f95c28f    # 1.17f

    .line 296
    .line 297
    .line 298
    const v13, 0x3dcccccd    # 0.1f

    .line 299
    .line 300
    .line 301
    const v14, 0x3ed70a3d    # 0.42f

    .line 302
    .line 303
    .line 304
    const v15, 0x3c23d70a    # 0.01f

    .line 305
    .line 306
    .line 307
    const v16, 0x3f570a3d    # 0.84f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, 0x419628f6    # 18.77f

    .line 314
    .line 315
    .line 316
    const/high16 v18, 0x41300000    # 11.0f

    .line 317
    .line 318
    const v13, 0x419c8f5c    # 19.57f

    .line 319
    .line 320
    .line 321
    const v14, 0x412b5c29    # 10.71f

    .line 322
    .line 323
    .line 324
    const v15, 0x419a28f6    # 19.27f

    .line 325
    .line 326
    .line 327
    const/high16 v16, 0x41300000    # 11.0f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x40651eb8    # -1.21f

    .line 333
    .line 334
    .line 335
    const v18, -0x406e147b    # -1.14f

    .line 336
    .line 337
    .line 338
    const v13, -0x40e3d70a    # -0.61f

    .line 339
    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const v15, -0x406e147b    # -1.14f

    .line 343
    .line 344
    .line 345
    const v16, -0x41051eb8    # -0.49f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x4187d70a    # 16.98f

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x40a00000    # 5.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x409fae14    # 4.99f

    .line 360
    .line 361
    .line 362
    const v2, 0x419747ae    # 18.91f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41500000    # 13.0f

    .line 372
    .line 373
    const/high16 v2, 0x40a00000    # 5.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x3ffae148    # 1.96f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x3f0a3d71    # 0.54f

    .line 385
    .line 386
    .line 387
    const v2, 0x4090a3d7    # 4.52f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x41570a3d    # -0.33f

    .line 394
    .line 395
    .line 396
    const v18, 0x3f88f5c3    # 1.07f

    .line 397
    .line 398
    .line 399
    const v13, 0x3d4ccccd    # 0.05f

    .line 400
    .line 401
    .line 402
    const v14, 0x3ec7ae14    # 0.39f

    .line 403
    .line 404
    .line 405
    const v15, -0x4270a3d7    # -0.07f

    .line 406
    .line 407
    .line 408
    const v16, 0x3f47ae14    # 0.78f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, 0x4163851f    # 14.22f

    .line 415
    .line 416
    .line 417
    const/high16 v18, 0x41300000    # 11.0f

    .line 418
    .line 419
    const v13, 0x416f3333    # 14.95f

    .line 420
    .line 421
    .line 422
    const v14, 0x412d999a    # 10.85f

    .line 423
    .line 424
    .line 425
    const v15, 0x416a147b    # 14.63f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x41300000    # 11.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x41500000    # 13.0f

    .line 434
    .line 435
    const v18, 0x411b0a3d    # 9.69f

    .line 436
    .line 437
    .line 438
    const v13, 0x4158cccd    # 13.55f

    .line 439
    .line 440
    .line 441
    const/high16 v14, 0x41300000    # 11.0f

    .line 442
    .line 443
    const/high16 v15, 0x41500000    # 13.0f

    .line 444
    .line 445
    const v16, 0x41268f5c    # 10.41f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x40a00000    # 5.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x4107d70a    # 8.49f

    .line 460
    .line 461
    .line 462
    const v2, 0x411851ec    # 9.52f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x4110a3d7    # 9.04f

    .line 469
    .line 470
    .line 471
    const/high16 v2, 0x40a00000    # 5.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41300000    # 11.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x4096147b    # 4.69f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x411b5c29    # 9.71f

    .line 488
    .line 489
    .line 490
    const/high16 v18, 0x41300000    # 11.0f

    .line 491
    .line 492
    const/high16 v13, 0x41300000    # 11.0f

    .line 493
    .line 494
    const v14, 0x41268f5c    # 10.41f

    .line 495
    .line 496
    .line 497
    const v15, 0x41273333    # 10.45f

    .line 498
    .line 499
    .line 500
    const/high16 v16, 0x41300000    # 11.0f

    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, -0x409c28f6    # -0.89f

    .line 506
    .line 507
    .line 508
    const v18, -0x412e147b    # -0.41f

    .line 509
    .line 510
    .line 511
    const v13, -0x4151eb85    # -0.34f

    .line 512
    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const v15, -0x40d9999a    # -0.65f

    .line 516
    .line 517
    .line 518
    const v16, -0x41e66666    # -0.15f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, 0x4107d70a    # 8.49f

    .line 525
    .line 526
    .line 527
    const v18, 0x411851ec    # 9.52f

    .line 528
    .line 529
    .line 530
    const v13, 0x41091eb8    # 8.57f

    .line 531
    .line 532
    .line 533
    const v14, 0x4124cccd    # 10.3f

    .line 534
    .line 535
    .line 536
    const v15, 0x41073333    # 8.45f

    .line 537
    .line 538
    .line 539
    const v16, 0x411e8f5c    # 9.91f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x408147ae    # 4.04f

    .line 549
    .line 550
    .line 551
    const v2, 0x4115c28f    # 9.36f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x40a1999a    # 5.05f

    .line 558
    .line 559
    .line 560
    const/high16 v2, 0x40a00000    # 5.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x3ffc28f6    # 1.97f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x40ce147b    # 6.44f

    .line 572
    .line 573
    .line 574
    const v2, 0x411dc28f    # 9.86f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x40a75c29    # 5.23f

    .line 581
    .line 582
    .line 583
    const/high16 v18, 0x41300000    # 11.0f

    .line 584
    .line 585
    const v13, 0x40cb851f    # 6.36f

    .line 586
    .line 587
    .line 588
    const v14, 0x412828f6    # 10.51f

    .line 589
    .line 590
    .line 591
    const v15, 0x40bae148    # 5.84f

    .line 592
    .line 593
    .line 594
    const/high16 v16, 0x41300000    # 11.0f

    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, -0x4091eb85    # -0.93f

    .line 600
    .line 601
    .line 602
    const v18, -0x410f5c29    # -0.47f

    .line 603
    .line 604
    .line 605
    const v13, -0x41051eb8    # -0.49f

    .line 606
    .line 607
    .line 608
    const/4 v14, 0x0

    .line 609
    const v15, -0x40b33333    # -0.8f

    .line 610
    .line 611
    .line 612
    const v16, -0x416b851f    # -0.29f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x408147ae    # 4.04f

    .line 619
    .line 620
    .line 621
    const v18, 0x4115c28f    # 9.36f

    .line 622
    .line 623
    .line 624
    const v13, 0x4080f5c3    # 4.03f

    .line 625
    .line 626
    .line 627
    const v14, 0x41235c29    # 10.21f

    .line 628
    .line 629
    .line 630
    const v15, 0x407c28f6    # 3.94f

    .line 631
    .line 632
    .line 633
    const v16, 0x411c7ae1    # 9.78f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x41980000    # 19.0f

    .line 643
    .line 644
    const/high16 v2, 0x40a00000    # 5.0f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, -0x3f3f0a3d    # -6.03f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x40a75c29    # 5.23f

    .line 656
    .line 657
    .line 658
    const/high16 v18, 0x41500000    # 13.0f

    .line 659
    .line 660
    const v13, 0x40a28f5c    # 5.08f

    .line 661
    .line 662
    .line 663
    const v14, 0x414fae14    # 12.98f

    .line 664
    .line 665
    .line 666
    const v15, 0x40a4cccd    # 5.15f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x41500000    # 13.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, 0x400f5c29    # 2.24f

    .line 675
    .line 676
    .line 677
    const v18, -0x408ccccd    # -0.95f

    .line 678
    .line 679
    .line 680
    const v13, 0x3f5eb852    # 0.87f

    .line 681
    .line 682
    .line 683
    const/4 v14, 0x0

    .line 684
    const v15, 0x3fd47ae1    # 1.66f

    .line 685
    .line 686
    .line 687
    const v16, -0x4147ae14    # -0.36f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, 0x4013d70a    # 2.31f

    .line 694
    .line 695
    .line 696
    const v18, 0x3f733333    # 0.95f

    .line 697
    .line 698
    .line 699
    const v13, 0x3f19999a    # 0.6f

    .line 700
    .line 701
    .line 702
    const v14, 0x3f19999a    # 0.6f

    .line 703
    .line 704
    .line 705
    const v15, 0x3fb33333    # 1.4f

    .line 706
    .line 707
    .line 708
    const v16, 0x3f733333    # 0.95f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x400eb852    # 2.23f

    .line 715
    .line 716
    .line 717
    const v18, -0x4091eb85    # -0.93f

    .line 718
    .line 719
    .line 720
    const v13, 0x3f5eb852    # 0.87f

    .line 721
    .line 722
    .line 723
    const/4 v14, 0x0

    .line 724
    const v15, 0x3fd33333    # 1.65f

    .line 725
    .line 726
    .line 727
    const v16, -0x4147ae14    # -0.36f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, 0x40128f5c    # 2.29f

    .line 734
    .line 735
    .line 736
    const v18, 0x3f6e147b    # 0.93f

    .line 737
    .line 738
    .line 739
    const v13, 0x3f170a3d    # 0.59f

    .line 740
    .line 741
    .line 742
    const v14, 0x3f11eb85    # 0.57f

    .line 743
    .line 744
    .line 745
    const v15, 0x3fb1eb85    # 1.39f

    .line 746
    .line 747
    .line 748
    const v16, 0x3f6e147b    # 0.93f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, 0x400f5c29    # 2.24f

    .line 755
    .line 756
    .line 757
    const v18, -0x408ccccd    # -0.95f

    .line 758
    .line 759
    .line 760
    const v13, 0x3f570a3d    # 0.84f

    .line 761
    .line 762
    .line 763
    const/4 v14, 0x0

    .line 764
    const v15, 0x3fd1eb85    # 1.64f

    .line 765
    .line 766
    .line 767
    const v16, -0x414ccccd    # -0.35f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v18, 0x3f733333    # 0.95f

    .line 774
    .line 775
    .line 776
    const v13, 0x3f147ae1    # 0.58f

    .line 777
    .line 778
    .line 779
    const v14, 0x3f170a3d    # 0.59f

    .line 780
    .line 781
    .line 782
    const v15, 0x3faf5c29    # 1.37f

    .line 783
    .line 784
    .line 785
    const v16, 0x3f733333    # 0.95f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, 0x3e6b851f    # 0.23f

    .line 792
    .line 793
    .line 794
    const v18, -0x430a3d71    # -0.03f

    .line 795
    .line 796
    .line 797
    const v13, 0x3da3d70a    # 0.08f

    .line 798
    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const v15, 0x3e19999a    # 0.15f

    .line 802
    .line 803
    .line 804
    const v16, -0x435c28f6    # -0.02f

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v0, 0x41980000    # 19.0f

    .line 811
    .line 812
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x40a00000    # 5.0f

    .line 816
    .line 817
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const/16 v16, 0x3800

    .line 828
    .line 829
    const/16 v17, 0x0

    .line 830
    .line 831
    const/high16 v6, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/high16 v8, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const/4 v7, 0x0

    .line 836
    const/high16 v9, 0x3f800000    # 1.0f

    .line 837
    .line 838
    const/high16 v12, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/4 v13, 0x0

    .line 841
    const/4 v15, 0x0

    .line 842
    const-string v4, ""

    .line 843
    .line 844
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    sput-object v0, Landroidx/compose/material/icons/filled/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 853
    .line 854
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    return-object v0
.end method

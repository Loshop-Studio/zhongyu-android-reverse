.class public final Landroidx/compose/material/icons/rounded/EuroKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _euro:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEuro(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EuroKt;->_euro:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Euro"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f47ae14    # -5.76f

    .line 78
    .line 79
    .line 80
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 81
    .line 82
    const v13, -0x3fdf5c29    # -2.51f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3f6a3d71    # -4.68f

    .line 87
    .line 88
    .line 89
    const v16, -0x404a3d71    # -1.42f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x40a47ae1    # 5.14f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v17, 0x3f63d70a    # 0.89f

    .line 102
    .line 103
    .line 104
    const v18, -0x40f33333    # -0.55f

    .line 105
    .line 106
    .line 107
    const v13, 0x3ec28f5c    # 0.38f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f3ae148    # 0.73f

    .line 111
    .line 112
    .line 113
    const v16, -0x41a8f5c3    # -0.21f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, -0x409c28f6    # -0.89f

    .line 124
    .line 125
    .line 126
    const v18, -0x40466666    # -1.45f

    .line 127
    .line 128
    .line 129
    const v13, 0x3ea8f5c3    # 0.33f

    .line 130
    .line 131
    .line 132
    const v14, -0x40d70a3d    # -0.66f

    .line 133
    .line 134
    .line 135
    const v15, -0x41e66666    # -0.15f

    .line 136
    .line 137
    .line 138
    const v16, -0x40466666    # -1.45f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, -0x3f466666    # -5.8f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, -0x425c28f6    # -0.08f

    .line 151
    .line 152
    .line 153
    const/high16 v18, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v13, -0x42b33333    # -0.05f

    .line 156
    .line 157
    .line 158
    const v14, -0x41570a3d    # -0.33f

    .line 159
    .line 160
    .line 161
    const v15, -0x425c28f6    # -0.08f

    .line 162
    .line 163
    .line 164
    const v16, -0x40d70a3d    # -0.66f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x3da3d70a    # 0.08f

    .line 171
    .line 172
    .line 173
    const/high16 v2, -0x40800000    # -1.0f

    .line 174
    .line 175
    const v4, 0x3cf5c28f    # 0.03f

    .line 176
    .line 177
    .line 178
    const v6, -0x40d47ae1    # -0.67f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x40b9999a    # 5.8f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3f63d70a    # 0.89f

    .line 191
    .line 192
    .line 193
    const v18, -0x40f33333    # -0.55f

    .line 194
    .line 195
    .line 196
    const v13, 0x3ec28f5c    # 0.38f

    .line 197
    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const v15, 0x3f3ae148    # 0.73f

    .line 201
    .line 202
    .line 203
    const v16, -0x41a8f5c3    # -0.21f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x4166147b    # 14.38f

    .line 214
    .line 215
    .line 216
    const/high16 v18, 0x41100000    # 9.0f

    .line 217
    .line 218
    const v13, 0x4179c28f    # 15.61f

    .line 219
    .line 220
    .line 221
    const v14, 0x411c7ae1    # 9.78f

    .line 222
    .line 223
    .line 224
    const v15, 0x4172147b    # 15.13f

    .line 225
    .line 226
    .line 227
    const/high16 v16, 0x41100000    # 9.0f

    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x4113d70a    # 9.24f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41700000    # 15.0f

    .line 239
    .line 240
    const/high16 v18, 0x40b00000    # 5.5f

    .line 241
    .line 242
    const v13, 0x41251eb8    # 10.32f

    .line 243
    .line 244
    .line 245
    const v14, 0x40dd70a4    # 6.92f

    .line 246
    .line 247
    .line 248
    const/high16 v15, 0x41480000    # 12.5f

    .line 249
    .line 250
    const/high16 v16, 0x40b00000    # 5.5f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x405ae148    # 3.42f

    .line 256
    .line 257
    .line 258
    const v18, 0x3f7851ec    # 0.97f

    .line 259
    .line 260
    .line 261
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x401ae148    # 2.42f

    .line 265
    .line 266
    .line 267
    const v16, 0x3eb851ec    # 0.36f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3fc8f5c3    # 1.57f

    .line 274
    .line 275
    .line 276
    const v18, -0x41dc28f6    # -0.16f

    .line 277
    .line 278
    .line 279
    const/high16 v13, 0x3f000000    # 0.5f

    .line 280
    .line 281
    const v14, 0x3e9eb852    # 0.31f

    .line 282
    .line 283
    .line 284
    const v15, 0x3f933333    # 1.15f

    .line 285
    .line 286
    .line 287
    const v16, 0x3e851eb8    # 0.26f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/4 v0, 0x0

    .line 294
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, -0x41800000    # -0.25f

    .line 298
    .line 299
    const v18, -0x40051eb8    # -1.96f

    .line 300
    .line 301
    .line 302
    const v13, 0x3f147ae1    # 0.58f

    .line 303
    .line 304
    .line 305
    const v14, -0x40eb851f    # -0.58f

    .line 306
    .line 307
    .line 308
    const v15, 0x3ee66666    # 0.45f

    .line 309
    .line 310
    .line 311
    const v16, -0x403c28f6    # -1.53f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x41700000    # 15.0f

    .line 318
    .line 319
    const/high16 v18, 0x40400000    # 3.0f

    .line 320
    .line 321
    const v13, 0x4192e148    # 18.36f

    .line 322
    .line 323
    .line 324
    const/high16 v14, 0x40600000    # 3.5f

    .line 325
    .line 326
    const v15, 0x4185d70a    # 16.73f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x40400000    # 3.0f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x3ef851ec    # -8.48f

    .line 335
    .line 336
    .line 337
    const/high16 v18, 0x40c00000    # 6.0f

    .line 338
    .line 339
    const v13, -0x3f851eb8    # -3.92f

    .line 340
    .line 341
    .line 342
    const/4 v14, 0x0

    .line 343
    const v15, -0x3f1851ec    # -7.24f

    .line 344
    .line 345
    .line 346
    const v16, 0x4020a3d7    # 2.51f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x3fc66666    # -2.9f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x402e147b    # 2.72f

    .line 359
    .line 360
    .line 361
    const v18, 0x4118cccd    # 9.55f

    .line 362
    .line 363
    .line 364
    const v13, 0x404f5c29    # 3.24f

    .line 365
    .line 366
    .line 367
    const/high16 v14, 0x41100000    # 9.0f

    .line 368
    .line 369
    const v15, 0x4038f5c3    # 2.89f

    .line 370
    .line 371
    .line 372
    const v16, 0x41135c29    # 9.21f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/4 v0, 0x0

    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x4067ae14    # 3.62f

    .line 383
    .line 384
    .line 385
    const/high16 v18, 0x41300000    # 11.0f

    .line 386
    .line 387
    const v13, 0x4018f5c3    # 2.39f

    .line 388
    .line 389
    .line 390
    const v14, 0x4123851f    # 10.22f

    .line 391
    .line 392
    .line 393
    const v15, 0x4037ae14    # 2.87f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x41300000    # 11.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x401c28f6    # 2.44f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x40c00000    # 6.0f

    .line 408
    .line 409
    const/high16 v18, 0x41400000    # 12.0f

    .line 410
    .line 411
    const v13, 0x40c0a3d7    # 6.02f

    .line 412
    .line 413
    .line 414
    const v14, 0x413547ae    # 11.33f

    .line 415
    .line 416
    .line 417
    const/high16 v15, 0x40c00000    # 6.0f

    .line 418
    .line 419
    const v16, 0x413a8f5c    # 11.66f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3d75c28f    # 0.06f

    .line 426
    .line 427
    .line 428
    const/high16 v2, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const v4, 0x3ca3d70a    # 0.02f

    .line 431
    .line 432
    .line 433
    const v6, 0x3f2b851f    # 0.67f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x4067ae14    # 3.62f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x409c28f6    # -0.89f

    .line 446
    .line 447
    .line 448
    const v18, 0x3f0ccccd    # 0.55f

    .line 449
    .line 450
    .line 451
    const v13, -0x413d70a4    # -0.38f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const v15, -0x40c51eb8    # -0.73f

    .line 456
    .line 457
    .line 458
    const v16, 0x3e570a3d    # 0.21f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x4067ae14    # 3.62f

    .line 469
    .line 470
    .line 471
    const/high16 v18, 0x41700000    # 15.0f

    .line 472
    .line 473
    const v13, 0x4018f5c3    # 2.39f

    .line 474
    .line 475
    .line 476
    const v14, 0x4163851f    # 14.22f

    .line 477
    .line 478
    .line 479
    const v15, 0x4037ae14    # 2.87f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x41700000    # 15.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x4039999a    # 2.9f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x4107ae14    # 8.48f

    .line 494
    .line 495
    .line 496
    const/high16 v18, 0x40c00000    # 6.0f

    .line 497
    .line 498
    const v13, 0x3f9eb852    # 1.24f

    .line 499
    .line 500
    .line 501
    const v14, 0x405f5c29    # 3.49f

    .line 502
    .line 503
    .line 504
    const v15, 0x4091eb85    # 4.56f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x40c00000    # 6.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x4097ae14    # 4.74f

    .line 513
    .line 514
    .line 515
    const v18, -0x40533333    # -1.35f

    .line 516
    .line 517
    .line 518
    const v13, 0x3fdeb852    # 1.74f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const v15, 0x40570a3d    # 3.36f

    .line 523
    .line 524
    .line 525
    const v16, -0x41051eb8    # -0.49f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3e75c28f    # 0.24f

    .line 532
    .line 533
    .line 534
    const v18, -0x4003d70a    # -1.97f

    .line 535
    .line 536
    .line 537
    const v13, 0x3f30a3d7    # 0.69f

    .line 538
    .line 539
    .line 540
    const v14, -0x4123d70a    # -0.43f

    .line 541
    .line 542
    .line 543
    const v15, 0x3f51eb85    # 0.82f

    .line 544
    .line 545
    .line 546
    const v16, -0x404e147b    # -1.39f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/4 v0, 0x0

    .line 553
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x40370a3d    # -1.57f

    .line 557
    .line 558
    .line 559
    const v18, -0x41e66666    # -0.15f

    .line 560
    .line 561
    .line 562
    const v13, -0x4128f5c3    # -0.42f

    .line 563
    .line 564
    .line 565
    const v14, -0x4128f5c3    # -0.42f

    .line 566
    .line 567
    .line 568
    const v15, -0x40770a3d    # -1.07f

    .line 569
    .line 570
    .line 571
    const v16, -0x410f5c29    # -0.47f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v17, 0x41700000    # 15.0f

    .line 578
    .line 579
    const/high16 v18, 0x41940000    # 18.5f

    .line 580
    .line 581
    const v13, 0x418b5c29    # 17.42f

    .line 582
    .line 583
    .line 584
    const v14, 0x41913333    # 18.15f

    .line 585
    .line 586
    .line 587
    const v15, 0x4182147b    # 16.26f

    .line 588
    .line 589
    .line 590
    const/high16 v16, 0x41940000    # 18.5f

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/16 v16, 0x3800

    .line 603
    .line 604
    const/16 v17, 0x0

    .line 605
    .line 606
    const/high16 v6, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/high16 v8, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    const/high16 v9, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sput-object v0, Landroidx/compose/material/icons/rounded/EuroKt;->_euro:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method

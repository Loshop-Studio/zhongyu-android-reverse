.class public final Landroidx/compose/material/icons/filled/SatelliteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatelliteAlt(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SatelliteAlt"

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
    const v0, 0x41770a3d    # 15.44f

    .line 71
    .line 72
    .line 73
    const v2, 0x3f170a3d    # 0.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x404b851f    # 3.18f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fb47ae1    # -3.18f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, 0x40351eb8    # 2.83f

    .line 91
    .line 92
    .line 93
    const v13, -0x40b851ec    # -0.78f

    .line 94
    .line 95
    .line 96
    const v14, 0x3f47ae14    # 0.78f

    .line 97
    .line 98
    .line 99
    const v15, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    const v16, 0x40033333    # 2.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x3f9eb852    # 1.24f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x3f35c28f    # 0.71f

    .line 115
    .line 116
    .line 117
    const v2, -0x40ca3d71    # -0.71f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x4138cccd    # 11.55f

    .line 124
    .line 125
    .line 126
    const v2, 0x40e9999a    # 7.3f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x3fcae148    # -2.83f

    .line 133
    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    const v14, -0x40b851ec    # -0.78f

    .line 138
    .line 139
    .line 140
    const v15, -0x3ffccccd    # -2.05f

    .line 141
    .line 142
    .line 143
    const v16, -0x40b851ec    # -0.78f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x40e9999a    # 7.3f

    .line 150
    .line 151
    .line 152
    const v2, 0x410b851f    # 8.72f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v18, 0x40351eb8    # 2.83f

    .line 161
    .line 162
    .line 163
    const v14, 0x3f47ae14    # 0.78f

    .line 164
    .line 165
    .line 166
    const v15, -0x40b851ec    # -0.78f

    .line 167
    .line 168
    .line 169
    const v16, 0x40033333    # 2.05f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3f9eb852    # 1.24f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3f35c28f    # 0.71f

    .line 182
    .line 183
    .line 184
    const v2, -0x40ca3d71    # -0.71f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41440000    # 12.25f

    .line 191
    .line 192
    const v2, 0x40d33333    # 6.6f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3fcae148    # -2.83f

    .line 199
    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    const v14, -0x40b851ec    # -0.78f

    .line 204
    .line 205
    .line 206
    const v15, -0x3ffccccd    # -2.05f

    .line 207
    .line 208
    .line 209
    const v16, -0x40b851ec    # -0.78f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x404b851f    # 3.18f

    .line 216
    .line 217
    .line 218
    const v2, -0x3fb47ae1    # -3.18f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v18, 0x40351eb8    # 2.83f

    .line 227
    .line 228
    .line 229
    const v14, 0x3f47ae14    # 0.78f

    .line 230
    .line 231
    .line 232
    const v15, -0x40b851ec    # -0.78f

    .line 233
    .line 234
    .line 235
    const v16, 0x40033333    # 2.05f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x40628f5c    # 3.54f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x40351eb8    # 2.83f

    .line 248
    .line 249
    .line 250
    const/16 v18, 0x0

    .line 251
    .line 252
    const v13, 0x3f47ae14    # 0.78f

    .line 253
    .line 254
    .line 255
    const v15, 0x40033333    # 2.05f

    .line 256
    .line 257
    .line 258
    const v16, 0x3f47ae14    # 0.78f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x404b851f    # 3.18f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const v18, -0x3fcae148    # -2.83f

    .line 273
    .line 274
    .line 275
    const v14, -0x40b851ec    # -0.78f

    .line 276
    .line 277
    .line 278
    const v15, 0x3f47ae14    # 0.78f

    .line 279
    .line 280
    .line 281
    const v16, -0x3ffccccd    # -2.05f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x406147ae    # -1.24f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x3f35c28f    # 0.71f

    .line 294
    .line 295
    .line 296
    const v2, -0x40ca3d71    # -0.71f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3f9eb852    # 1.24f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x40351eb8    # 2.83f

    .line 309
    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const v14, 0x3f47ae14    # 0.78f

    .line 314
    .line 315
    .line 316
    const v15, 0x40033333    # 2.05f

    .line 317
    .line 318
    .line 319
    const v16, 0x3f47ae14    # 0.78f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x3fb47ae1    # 1.41f

    .line 326
    .line 327
    .line 328
    const v2, -0x404b851f    # -1.41f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const v18, -0x3fcae148    # -2.83f

    .line 337
    .line 338
    .line 339
    const v14, -0x40b851ec    # -0.78f

    .line 340
    .line 341
    .line 342
    const v15, 0x3f47ae14    # 0.78f

    .line 343
    .line 344
    .line 345
    const v16, -0x3ffccccd    # -2.05f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x415d70a4    # 13.84f

    .line 352
    .line 353
    .line 354
    const v2, 0x4119999a    # 9.6f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x3f35c28f    # 0.71f

    .line 361
    .line 362
    .line 363
    const v2, -0x40ca3d71    # -0.71f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3f9eb852    # 1.24f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x40351eb8    # 2.83f

    .line 376
    .line 377
    .line 378
    const/16 v18, 0x0

    .line 379
    .line 380
    const v14, 0x3f47ae14    # 0.78f

    .line 381
    .line 382
    .line 383
    const v15, 0x40033333    # 2.05f

    .line 384
    .line 385
    .line 386
    const v16, 0x3f47ae14    # 0.78f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x404b851f    # 3.18f

    .line 393
    .line 394
    .line 395
    const v2, -0x3fb47ae1    # -3.18f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const v18, -0x3fcae148    # -2.83f

    .line 404
    .line 405
    .line 406
    const v14, -0x40b851ec    # -0.78f

    .line 407
    .line 408
    .line 409
    const v15, 0x3f47ae14    # 0.78f

    .line 410
    .line 411
    .line 412
    const v16, -0x3ffccccd    # -2.05f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x3f9d70a4    # -3.54f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x41770a3d    # 15.44f

    .line 425
    .line 426
    .line 427
    const v18, 0x3f170a3d    # 0.59f

    .line 428
    .line 429
    .line 430
    const v13, 0x418bd70a    # 17.48f

    .line 431
    .line 432
    .line 433
    const v14, -0x41b33333    # -0.2f

    .line 434
    .line 435
    .line 436
    const v15, 0x4181c28f    # 16.22f

    .line 437
    .line 438
    .line 439
    const v16, -0x41b33333    # -0.2f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x419a8f5c    # 19.32f

    .line 449
    .line 450
    .line 451
    const v2, 0x40d33333    # 6.6f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3f87ae14    # 1.06f

    .line 458
    .line 459
    .line 460
    const v2, -0x407851ec    # -1.06f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x4186cccd    # 16.85f

    .line 467
    .line 468
    .line 469
    const/high16 v2, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3f87ae14    # 1.06f

    .line 475
    .line 476
    .line 477
    const v2, -0x407851ec    # -1.06f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x419a8f5c    # 19.32f

    .line 484
    .line 485
    .line 486
    const v2, 0x40d33333    # 6.6f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x4189999a    # 17.2f

    .line 496
    .line 497
    .line 498
    const v2, 0x410b851f    # 8.72f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3f87ae14    # 1.06f

    .line 505
    .line 506
    .line 507
    const v2, -0x407851ec    # -1.06f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x3f9d70a4    # -3.54f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x3f87ae14    # 1.06f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x4189999a    # 17.2f

    .line 526
    .line 527
    .line 528
    const v2, 0x410b851f    # 8.72f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x40f51eb8    # 7.66f

    .line 538
    .line 539
    .line 540
    const v2, 0x4192147b    # 18.26f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x4189999a    # 17.2f

    .line 547
    .line 548
    .line 549
    const v2, 0x410b851f    # 8.72f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, -0x3f9d70a4    # -3.54f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3f87ae14    # 1.06f

    .line 562
    .line 563
    .line 564
    const v2, -0x407851ec    # -1.06f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x40f51eb8    # 7.66f

    .line 571
    .line 572
    .line 573
    const v2, 0x4192147b    # 18.26f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x40b147ae    # 5.54f

    .line 583
    .line 584
    .line 585
    const v2, 0x41a30a3d    # 20.38f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x419a8f5c    # 19.32f

    .line 592
    .line 593
    .line 594
    const v2, 0x40d33333    # 6.6f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, -0x3f9d70a4    # -3.54f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x4186cccd    # 16.85f

    .line 607
    .line 608
    .line 609
    const/high16 v2, 0x40000000    # 2.0f

    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x40b147ae    # 5.54f

    .line 615
    .line 616
    .line 617
    const v2, 0x41a30a3d    # 20.38f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x41600000    # 14.0f

    .line 627
    .line 628
    const/high16 v2, 0x41a80000    # 21.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/4 v0, 0x0

    .line 634
    const/high16 v2, 0x40000000    # 2.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41100000    # 9.0f

    .line 640
    .line 641
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 642
    .line 643
    const v13, 0x409f0a3d    # 4.97f

    .line 644
    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const/high16 v15, 0x41100000    # 9.0f

    .line 648
    .line 649
    const v16, -0x3f7f0a3d    # -4.03f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, -0x40000000    # -2.0f

    .line 656
    .line 657
    const/4 v2, 0x0

    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x41600000    # 14.0f

    .line 662
    .line 663
    const/high16 v18, 0x41a80000    # 21.0f

    .line 664
    .line 665
    const/high16 v13, 0x41a80000    # 21.0f

    .line 666
    .line 667
    const v14, 0x418ef5c3    # 17.87f

    .line 668
    .line 669
    .line 670
    const v15, 0x418ef5c3    # 17.87f

    .line 671
    .line 672
    .line 673
    const/high16 v16, 0x41a80000    # 21.0f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x41600000    # 14.0f

    .line 682
    .line 683
    const/high16 v2, 0x41880000    # 17.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/4 v0, 0x0

    .line 689
    const/high16 v2, 0x40000000    # 2.0f

    .line 690
    .line 691
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v17, 0x40a00000    # 5.0f

    .line 695
    .line 696
    const/high16 v18, -0x3f600000    # -5.0f

    .line 697
    .line 698
    const v13, 0x4030a3d7    # 2.76f

    .line 699
    .line 700
    .line 701
    const/4 v14, 0x0

    .line 702
    const/high16 v15, 0x40a00000    # 5.0f

    .line 703
    .line 704
    const v16, -0x3ff0a3d7    # -2.24f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, -0x40000000    # -2.0f

    .line 711
    .line 712
    const/4 v2, 0x0

    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v17, 0x41600000    # 14.0f

    .line 717
    .line 718
    const/high16 v18, 0x41880000    # 17.0f

    .line 719
    .line 720
    const/high16 v13, 0x41880000    # 17.0f

    .line 721
    .line 722
    const v14, 0x417a8f5c    # 15.66f

    .line 723
    .line 724
    .line 725
    const v15, 0x417a8f5c    # 15.66f

    .line 726
    .line 727
    .line 728
    const/high16 v16, 0x41880000    # 17.0f

    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    const/16 v16, 0x3800

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const/high16 v6, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/high16 v8, 0x3f800000    # 1.0f

    .line 747
    .line 748
    const/4 v7, 0x0

    .line 749
    const/high16 v9, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const/high16 v12, 0x3f800000    # 1.0f

    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const/4 v14, 0x0

    .line 755
    const/4 v15, 0x0

    .line 756
    const-string v4, ""

    .line 757
    .line 758
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    sput-object v0, Landroidx/compose/material/icons/filled/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 767
    .line 768
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    return-object v0
.end method

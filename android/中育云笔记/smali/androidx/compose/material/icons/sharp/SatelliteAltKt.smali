.class public final Landroidx/compose/material/icons/sharp/SatelliteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatelliteAlt(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SatelliteAlt"

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
    const v0, -0x3fd66666    # -2.65f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x4087ae14    # 4.24f

    .line 130
    .line 131
    .line 132
    const v2, -0x3f7851ec    # -4.24f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x4029999a    # 2.65f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x3f35c28f    # 0.71f

    .line 145
    .line 146
    .line 147
    const v2, -0x40ca3d71    # -0.71f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41440000    # 12.25f

    .line 154
    .line 155
    const v2, 0x40d33333    # 6.6f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x3fcae148    # -2.83f

    .line 162
    .line 163
    .line 164
    const/16 v18, 0x0

    .line 165
    .line 166
    const v14, -0x40b851ec    # -0.78f

    .line 167
    .line 168
    .line 169
    const v15, -0x3ffccccd    # -2.05f

    .line 170
    .line 171
    .line 172
    const v16, -0x40b851ec    # -0.78f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x404b851f    # 3.18f

    .line 179
    .line 180
    .line 181
    const v2, -0x3fb47ae1    # -3.18f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const v18, 0x40351eb8    # 2.83f

    .line 190
    .line 191
    .line 192
    const v14, 0x3f47ae14    # 0.78f

    .line 193
    .line 194
    .line 195
    const v15, -0x40b851ec    # -0.78f

    .line 196
    .line 197
    .line 198
    const v16, 0x40033333    # 2.05f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x40628f5c    # 3.54f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x40351eb8    # 2.83f

    .line 211
    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const v13, 0x3f47ae14    # 0.78f

    .line 216
    .line 217
    .line 218
    const v15, 0x40033333    # 2.05f

    .line 219
    .line 220
    .line 221
    const v16, 0x3f47ae14    # 0.78f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x404b851f    # 3.18f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const v18, -0x3fcae148    # -2.83f

    .line 236
    .line 237
    .line 238
    const v14, -0x40b851ec    # -0.78f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f47ae14    # 0.78f

    .line 242
    .line 243
    .line 244
    const v16, -0x3ffccccd    # -2.05f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x406147ae    # -1.24f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x3f35c28f    # 0.71f

    .line 257
    .line 258
    .line 259
    const v2, -0x40ca3d71    # -0.71f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x4029999a    # 2.65f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x4087ae14    # 4.24f

    .line 272
    .line 273
    .line 274
    const v2, -0x3f7851ec    # -4.24f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x415d70a4    # 13.84f

    .line 281
    .line 282
    .line 283
    const v2, 0x4119999a    # 9.6f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x3f35c28f    # 0.71f

    .line 290
    .line 291
    .line 292
    const v2, -0x40ca3d71    # -0.71f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3f9eb852    # 1.24f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x40351eb8    # 2.83f

    .line 305
    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    const v14, 0x3f47ae14    # 0.78f

    .line 310
    .line 311
    .line 312
    const v15, 0x40033333    # 2.05f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f47ae14    # 0.78f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x404b851f    # 3.18f

    .line 322
    .line 323
    .line 324
    const v2, -0x3fb47ae1    # -3.18f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v18, -0x3fcae148    # -2.83f

    .line 333
    .line 334
    .line 335
    const v14, -0x40b851ec    # -0.78f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f47ae14    # 0.78f

    .line 339
    .line 340
    .line 341
    const v16, -0x3ffccccd    # -2.05f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x3f9d70a4    # -3.54f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x41770a3d    # 15.44f

    .line 354
    .line 355
    .line 356
    const v18, 0x3f170a3d    # 0.59f

    .line 357
    .line 358
    .line 359
    const v13, 0x418bd70a    # 17.48f

    .line 360
    .line 361
    .line 362
    const v14, -0x41b33333    # -0.2f

    .line 363
    .line 364
    .line 365
    const v15, 0x4181c28f    # 16.22f

    .line 366
    .line 367
    .line 368
    const v16, -0x41b33333    # -0.2f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x419a8f5c    # 19.32f

    .line 378
    .line 379
    .line 380
    const v2, 0x40d33333    # 6.6f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3f87ae14    # 1.06f

    .line 387
    .line 388
    .line 389
    const v2, -0x407851ec    # -1.06f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x4186cccd    # 16.85f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x3f87ae14    # 1.06f

    .line 404
    .line 405
    .line 406
    const v2, -0x407851ec    # -1.06f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x419a8f5c    # 19.32f

    .line 413
    .line 414
    .line 415
    const v2, 0x40d33333    # 6.6f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4189999a    # 17.2f

    .line 425
    .line 426
    .line 427
    const v2, 0x410b851f    # 8.72f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x3f87ae14    # 1.06f

    .line 434
    .line 435
    .line 436
    const v2, -0x407851ec    # -1.06f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, -0x3f9d70a4    # -3.54f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3f87ae14    # 1.06f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x4189999a    # 17.2f

    .line 455
    .line 456
    .line 457
    const v2, 0x410b851f    # 8.72f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x4192147b    # 18.26f

    .line 467
    .line 468
    .line 469
    const v2, 0x40f51eb8    # 7.66f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x4189999a    # 17.2f

    .line 476
    .line 477
    .line 478
    const v2, 0x410b851f    # 8.72f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x3f9d70a4    # -3.54f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3f87ae14    # 1.06f

    .line 491
    .line 492
    .line 493
    const v2, -0x407851ec    # -1.06f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x4192147b    # 18.26f

    .line 500
    .line 501
    .line 502
    const v2, 0x40f51eb8    # 7.66f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x41a30a3d    # 20.38f

    .line 512
    .line 513
    .line 514
    const v2, 0x40b147ae    # 5.54f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, 0x419a8f5c    # 19.32f

    .line 521
    .line 522
    .line 523
    const v2, 0x40d33333    # 6.6f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, -0x3f9d70a4    # -3.54f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x4186cccd    # 16.85f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x40000000    # 2.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x41a30a3d    # 20.38f

    .line 544
    .line 545
    .line 546
    const v2, 0x40b147ae    # 5.54f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41a80000    # 21.0f

    .line 556
    .line 557
    const/high16 v2, 0x41600000    # 14.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/4 v0, 0x0

    .line 563
    const/high16 v2, 0x40000000    # 2.0f

    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 569
    .line 570
    const/high16 v18, 0x41100000    # 9.0f

    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const v14, 0x409f0a3d    # 4.97f

    .line 574
    .line 575
    .line 576
    const v15, -0x3f7f0a3d    # -4.03f

    .line 577
    .line 578
    .line 579
    const/high16 v16, 0x41100000    # 9.0f

    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, -0x40000000    # -2.0f

    .line 585
    .line 586
    const/4 v2, 0x0

    .line 587
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x41a80000    # 21.0f

    .line 591
    .line 592
    const/high16 v18, 0x41600000    # 14.0f

    .line 593
    .line 594
    const v13, 0x418ef5c3    # 17.87f

    .line 595
    .line 596
    .line 597
    const/high16 v14, 0x41a80000    # 21.0f

    .line 598
    .line 599
    const/high16 v15, 0x41a80000    # 21.0f

    .line 600
    .line 601
    const v16, 0x418ef5c3    # 17.87f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41880000    # 17.0f

    .line 611
    .line 612
    const/high16 v2, 0x41600000    # 14.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/4 v0, 0x0

    .line 618
    const/high16 v2, 0x40000000    # 2.0f

    .line 619
    .line 620
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, -0x3f600000    # -5.0f

    .line 624
    .line 625
    const/high16 v18, 0x40a00000    # 5.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const v14, 0x4030a3d7    # 2.76f

    .line 629
    .line 630
    .line 631
    const v15, -0x3ff0a3d7    # -2.24f

    .line 632
    .line 633
    .line 634
    const/high16 v16, 0x40a00000    # 5.0f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, -0x40000000    # -2.0f

    .line 640
    .line 641
    const/4 v2, 0x0

    .line 642
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x41880000    # 17.0f

    .line 646
    .line 647
    const/high16 v18, 0x41600000    # 14.0f

    .line 648
    .line 649
    const v13, 0x417a8f5c    # 15.66f

    .line 650
    .line 651
    .line 652
    const/high16 v14, 0x41880000    # 17.0f

    .line 653
    .line 654
    const/high16 v15, 0x41880000    # 17.0f

    .line 655
    .line 656
    const v16, 0x417a8f5c    # 15.66f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/16 v16, 0x3800

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const/high16 v6, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/high16 v8, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    const/high16 v9, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/high16 v12, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const/4 v14, 0x0

    .line 684
    const/4 v15, 0x0

    .line 685
    const-string v4, ""

    .line 686
    .line 687
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    sput-object v0, Landroidx/compose/material/icons/sharp/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 696
    .line 697
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    return-object v0
.end method

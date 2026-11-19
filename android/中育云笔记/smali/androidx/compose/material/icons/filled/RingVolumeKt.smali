.class public final Landroidx/compose/material/icons/filled/RingVolumeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRingVolume(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.RingVolume"

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
    const v0, 0x41bdae14    # 23.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x41855c29    # 16.67f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x41a547ae    # 20.66f

    .line 84
    .line 85
    .line 86
    const v14, 0x415c7ae1    # 13.78f

    .line 87
    .line 88
    .line 89
    const v15, 0x418451ec    # 16.54f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x41400000    # 12.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x3e947ae1    # 0.29f

    .line 98
    .line 99
    .line 100
    const v18, 0x41855c29    # 16.67f

    .line 101
    .line 102
    .line 103
    const v13, 0x40eeb852    # 7.46f

    .line 104
    .line 105
    .line 106
    const/high16 v14, 0x41400000    # 12.0f

    .line 107
    .line 108
    const v15, 0x4055c28f    # 3.34f

    .line 109
    .line 110
    .line 111
    const v16, 0x415c7ae1    # 13.78f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x416b851f    # -0.29f

    .line 118
    .line 119
    .line 120
    const v18, 0x3f35c28f    # 0.71f

    .line 121
    .line 122
    .line 123
    const v13, -0x41c7ae14    # -0.18f

    .line 124
    .line 125
    .line 126
    const v14, 0x3e3851ec    # 0.18f

    .line 127
    .line 128
    .line 129
    const v15, -0x416b851f    # -0.29f

    .line 130
    .line 131
    .line 132
    const v16, 0x3edc28f6    # 0.43f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3e947ae1    # 0.29f

    .line 139
    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const v14, 0x3e8f5c29    # 0.28f

    .line 143
    .line 144
    .line 145
    const v15, 0x3de147ae    # 0.11f

    .line 146
    .line 147
    .line 148
    const v16, 0x3f07ae14    # 0.53f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x401eb852    # 2.48f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x3f35c28f    # 0.71f

    .line 161
    .line 162
    .line 163
    const v18, 0x3e947ae1    # 0.29f

    .line 164
    .line 165
    .line 166
    const v13, 0x3e3851ec    # 0.18f

    .line 167
    .line 168
    .line 169
    const v14, 0x3e3851ec    # 0.18f

    .line 170
    .line 171
    .line 172
    const v15, 0x3edc28f6    # 0.43f

    .line 173
    .line 174
    .line 175
    const v16, 0x3e947ae1    # 0.29f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x3f333333    # 0.7f

    .line 182
    .line 183
    .line 184
    const v18, -0x4170a3d7    # -0.28f

    .line 185
    .line 186
    .line 187
    const v13, 0x3e8a3d71    # 0.27f

    .line 188
    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    const v15, 0x3f051eb8    # 0.52f

    .line 192
    .line 193
    .line 194
    const v16, -0x421eb852    # -0.11f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x402a3d71    # 2.66f

    .line 201
    .line 202
    .line 203
    const v18, -0x40133333    # -1.85f

    .line 204
    .line 205
    .line 206
    const v13, 0x3f4a3d71    # 0.79f

    .line 207
    .line 208
    .line 209
    const v14, -0x40c28f5c    # -0.74f

    .line 210
    .line 211
    .line 212
    const v15, 0x3fd851ec    # 1.69f

    .line 213
    .line 214
    .line 215
    const v16, -0x4051eb85    # -1.36f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x3f0f5c29    # 0.56f

    .line 222
    .line 223
    .line 224
    const v18, -0x4099999a    # -0.9f

    .line 225
    .line 226
    .line 227
    const v13, 0x3ea8f5c3    # 0.33f

    .line 228
    .line 229
    .line 230
    const v14, -0x41dc28f6    # -0.16f

    .line 231
    .line 232
    .line 233
    const v15, 0x3f0f5c29    # 0.56f

    .line 234
    .line 235
    .line 236
    const/high16 v16, -0x41000000    # -0.5f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x3fb9999a    # -3.1f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x40933333    # 4.6f

    .line 248
    .line 249
    .line 250
    const v18, -0x40c51eb8    # -0.73f

    .line 251
    .line 252
    .line 253
    const v13, 0x3fb9999a    # 1.45f

    .line 254
    .line 255
    .line 256
    const v14, -0x410a3d71    # -0.48f

    .line 257
    .line 258
    .line 259
    const/high16 v15, 0x40400000    # 3.0f

    .line 260
    .line 261
    const v16, -0x40c51eb8    # -0.73f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x40933333    # 4.6f

    .line 268
    .line 269
    .line 270
    const v2, 0x3f3851ec    # 0.72f

    .line 271
    .line 272
    .line 273
    const v4, 0x4049999a    # 3.15f

    .line 274
    .line 275
    .line 276
    const/high16 v6, 0x3e800000    # 0.25f

    .line 277
    .line 278
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x40466666    # 3.1f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3f0f5c29    # 0.56f

    .line 288
    .line 289
    .line 290
    const v18, 0x3f666666    # 0.9f

    .line 291
    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const v14, 0x3ec7ae14    # 0.39f

    .line 295
    .line 296
    .line 297
    const v15, 0x3e6b851f    # 0.23f

    .line 298
    .line 299
    .line 300
    const v16, 0x3f3d70a4    # 0.74f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x402a3d71    # 2.66f

    .line 307
    .line 308
    .line 309
    const v18, 0x3feccccd    # 1.85f

    .line 310
    .line 311
    .line 312
    const v13, 0x3f7ae148    # 0.98f

    .line 313
    .line 314
    .line 315
    const v14, 0x3efae148    # 0.49f

    .line 316
    .line 317
    .line 318
    const v15, 0x3fef5c29    # 1.87f

    .line 319
    .line 320
    .line 321
    const v16, 0x3f8f5c29    # 1.12f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3f333333    # 0.7f

    .line 328
    .line 329
    .line 330
    const v18, 0x3e8f5c29    # 0.28f

    .line 331
    .line 332
    .line 333
    const v13, 0x3e3851ec    # 0.18f

    .line 334
    .line 335
    .line 336
    const v14, 0x3e3851ec    # 0.18f

    .line 337
    .line 338
    .line 339
    const v15, 0x3edc28f6    # 0.43f

    .line 340
    .line 341
    .line 342
    const v16, 0x3e8f5c29    # 0.28f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f35c28f    # 0.71f

    .line 349
    .line 350
    .line 351
    const v18, -0x416b851f    # -0.29f

    .line 352
    .line 353
    .line 354
    const v13, 0x3e8f5c29    # 0.28f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const v15, 0x3f07ae14    # 0.53f

    .line 359
    .line 360
    .line 361
    const v16, -0x421eb852    # -0.11f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3fe147ae    # -2.48f

    .line 368
    .line 369
    .line 370
    const v2, 0x401eb852    # 2.48f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3e947ae1    # 0.29f

    .line 377
    .line 378
    .line 379
    const v18, -0x40ca3d71    # -0.71f

    .line 380
    .line 381
    .line 382
    const v13, 0x3e3851ec    # 0.18f

    .line 383
    .line 384
    .line 385
    const v14, -0x41c7ae14    # -0.18f

    .line 386
    .line 387
    .line 388
    const v15, 0x3e947ae1    # 0.29f

    .line 389
    .line 390
    .line 391
    const v16, -0x4123d70a    # -0.43f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x416b851f    # -0.29f

    .line 398
    .line 399
    .line 400
    const v18, -0x40cccccd    # -0.7f

    .line 401
    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x4175c28f    # -0.27f

    .line 405
    .line 406
    .line 407
    const v15, -0x421eb852    # -0.11f

    .line 408
    .line 409
    .line 410
    const v16, -0x40fae148    # -0.52f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x41a947ae    # 21.16f

    .line 420
    .line 421
    .line 422
    const v2, 0x40c851ec    # 6.26f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, -0x404b851f    # -1.41f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, -0x3f9c28f6    # -3.56f

    .line 435
    .line 436
    .line 437
    const v2, 0x40633333    # 3.55f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3fb47ae1    # 1.41f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x4063d70a    # 3.56f

    .line 450
    .line 451
    .line 452
    const v2, -0x3f9ccccd    # -3.55f

    .line 453
    .line 454
    .line 455
    const v4, 0x405ccccd    # 3.45f

    .line 456
    .line 457
    .line 458
    const v6, -0x3f9eb852    # -3.52f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41500000    # 13.0f

    .line 468
    .line 469
    const/high16 v2, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, -0x40000000    # -2.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40a00000    # 5.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40000000    # 2.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x40cccccd    # 6.4f

    .line 496
    .line 497
    .line 498
    const v2, 0x411cf5c3    # 9.81f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x40f9eb85    # 7.81f

    .line 505
    .line 506
    .line 507
    const v2, 0x41066666    # 8.4f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x408851ec    # 4.26f

    .line 514
    .line 515
    .line 516
    const v2, 0x409ae148    # 4.84f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x4035c28f    # 2.84f

    .line 523
    .line 524
    .line 525
    const v2, 0x40c851ec    # 6.26f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x4063d70a    # 3.56f

    .line 532
    .line 533
    .line 534
    const v18, 0x40633333    # 3.55f

    .line 535
    .line 536
    .line 537
    const v13, 0x3de147ae    # 0.11f

    .line 538
    .line 539
    .line 540
    const v14, 0x3cf5c28f    # 0.03f

    .line 541
    .line 542
    .line 543
    const v15, 0x4063d70a    # 3.56f

    .line 544
    .line 545
    .line 546
    const v16, 0x40633333    # 3.55f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/16 v16, 0x3800

    .line 560
    .line 561
    const/16 v17, 0x0

    .line 562
    .line 563
    const/high16 v6, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/high16 v8, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v7, 0x0

    .line 568
    const/high16 v9, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v12, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const/4 v14, 0x0

    .line 574
    const/4 v15, 0x0

    .line 575
    const-string v4, ""

    .line 576
    .line 577
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sput-object v0, Landroidx/compose/material/icons/filled/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 586
    .line 587
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-object v0
.end method

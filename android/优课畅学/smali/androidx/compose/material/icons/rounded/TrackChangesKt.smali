.class public final Landroidx/compose/material/icons/rounded/TrackChangesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTrackChanges(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TrackChangesKt;->_trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TrackChanges"

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
    const v0, 0x41928f5c    # 18.32f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b5c28f    # 5.68f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4270a3d7    # -0.07f

    .line 80
    .line 81
    .line 82
    const v18, 0x3fa8f5c3    # 1.32f

    .line 83
    .line 84
    .line 85
    const v13, -0x4147ae14    # -0.36f

    .line 86
    .line 87
    .line 88
    const v14, 0x3eb851ec    # 0.36f

    .line 89
    .line 90
    .line 91
    const v15, -0x413851ec    # -0.39f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f6b851f    # 0.92f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3fc3d70a    # 1.53f

    .line 101
    .line 102
    .line 103
    const v18, 0x40dd70a4    # 6.92f

    .line 104
    .line 105
    .line 106
    const v13, 0x3fb9999a    # 1.45f

    .line 107
    .line 108
    .line 109
    const v14, 0x3fe8f5c3    # 1.82f

    .line 110
    .line 111
    .line 112
    const v15, 0x400d70a4    # 2.21f

    .line 113
    .line 114
    .line 115
    const v16, 0x4089eb85    # 4.31f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x3f3947ae    # -6.21f

    .line 122
    .line 123
    .line 124
    const v18, 0x40be147b    # 5.94f

    .line 125
    .line 126
    .line 127
    const v13, -0x40b5c28f    # -0.79f

    .line 128
    .line 129
    .line 130
    const v14, 0x40433333    # 3.05f

    .line 131
    .line 132
    .line 133
    const v15, -0x3fb47ae1    # -3.18f

    .line 134
    .line 135
    .line 136
    const v16, 0x40aa8f5c    # 5.33f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x40800000    # 4.0f

    .line 143
    .line 144
    const/high16 v18, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v13, 0x4107851f    # 8.47f

    .line 147
    .line 148
    .line 149
    const v14, 0x41a6f5c3    # 20.87f

    .line 150
    .line 151
    .line 152
    const/high16 v15, 0x40800000    # 4.0f

    .line 153
    .line 154
    const v16, 0x418770a4    # 16.93f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v17, 0x40e00000    # 7.0f

    .line 161
    .line 162
    const v18, -0x3f023d71    # -7.93f

    .line 163
    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, -0x3f7d70a4    # -4.08f

    .line 167
    .line 168
    .line 169
    const v15, 0x40433333    # 3.05f

    .line 170
    .line 171
    .line 172
    const v16, -0x3f11eb85    # -7.44f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x400147ae    # 2.02f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x3f623d71    # -4.93f

    .line 185
    .line 186
    .line 187
    const v18, 0x40da8f5c    # 6.83f

    .line 188
    .line 189
    .line 190
    const v13, -0x3fb7ae14    # -3.13f

    .line 191
    .line 192
    .line 193
    const v14, 0x3f07ae14    # 0.53f

    .line 194
    .line 195
    .line 196
    const v15, -0x3f523d71    # -5.43f

    .line 197
    .line 198
    .line 199
    const v16, 0x405d70a4    # 3.46f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x40a5c28f    # 5.18f

    .line 206
    .line 207
    .line 208
    const v18, 0x40a0f5c3    # 5.03f

    .line 209
    .line 210
    .line 211
    const v13, 0x3ec7ae14    # 0.39f

    .line 212
    .line 213
    .line 214
    const v14, 0x40270a3d    # 2.61f

    .line 215
    .line 216
    .line 217
    const v15, 0x4023d70a    # 2.56f

    .line 218
    .line 219
    .line 220
    const v16, 0x4096b852    # 4.71f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x41900000    # 18.0f

    .line 227
    .line 228
    const/high16 v18, 0x41400000    # 12.0f

    .line 229
    .line 230
    const v13, 0x416e3d71    # 14.89f

    .line 231
    .line 232
    .line 233
    const v14, 0x41933333    # 18.4f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x41900000    # 18.0f

    .line 237
    .line 238
    const v16, 0x4178f5c3    # 15.56f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x407c28f6    # -1.03f

    .line 245
    .line 246
    .line 247
    const v18, -0x3fa8f5c3    # -3.36f

    .line 248
    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const/high16 v14, -0x40600000    # -1.25f

    .line 252
    .line 253
    const v15, -0x413d70a4    # -0.38f

    .line 254
    .line 255
    .line 256
    const v16, -0x3fe66666    # -2.4f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x40400000    # -1.5f

    .line 263
    .line 264
    const v18, -0x421eb852    # -0.11f

    .line 265
    .line 266
    .line 267
    const v13, -0x4151eb85    # -0.34f

    .line 268
    .line 269
    .line 270
    const/high16 v14, -0x41000000    # -0.5f

    .line 271
    .line 272
    const v15, -0x40770a3d    # -1.07f

    .line 273
    .line 274
    .line 275
    const v16, -0x40f851ec    # -0.53f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, -0x43dc28f6    # -0.01f

    .line 282
    .line 283
    .line 284
    const v2, 0x3c23d70a    # 0.01f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x421eb852    # -0.11f

    .line 291
    .line 292
    .line 293
    const v18, 0x3fa28f5c    # 1.27f

    .line 294
    .line 295
    .line 296
    const v14, 0x3eae147b    # 0.34f

    .line 297
    .line 298
    .line 299
    const v15, -0x41428f5c    # -0.37f

    .line 300
    .line 301
    .line 302
    const v16, 0x3f5eb852    # 0.87f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3efae148    # 0.49f

    .line 309
    .line 310
    .line 311
    const v18, 0x40547ae1    # 3.32f

    .line 312
    .line 313
    .line 314
    const v13, 0x3f19999a    # 0.6f

    .line 315
    .line 316
    .line 317
    const v14, 0x3f6b851f    # 0.92f

    .line 318
    .line 319
    .line 320
    const v15, 0x3f570a3d    # 0.84f

    .line 321
    .line 322
    .line 323
    const v16, 0x40066666    # 2.1f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x3fc3d70a    # -2.94f

    .line 330
    .line 331
    .line 332
    const v18, 0x403147ae    # 2.77f

    .line 333
    .line 334
    .line 335
    const v13, -0x413851ec    # -0.39f

    .line 336
    .line 337
    .line 338
    const v14, 0x3faf5c29    # 1.37f

    .line 339
    .line 340
    .line 341
    const v15, -0x403ae148    # -1.54f

    .line 342
    .line 343
    .line 344
    const v16, 0x401d70a4    # 2.46f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x3f633333    # -4.9f

    .line 351
    .line 352
    .line 353
    const v18, -0x3f866666    # -3.9f

    .line 354
    .line 355
    .line 356
    const v13, -0x3fd9999a    # -2.6f

    .line 357
    .line 358
    .line 359
    const v14, 0x3f11eb85    # 0.57f

    .line 360
    .line 361
    .line 362
    const v15, -0x3f633333    # -4.9f

    .line 363
    .line 364
    .line 365
    const v16, -0x404e147b    # -1.39f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x40400000    # 3.0f

    .line 372
    .line 373
    const v18, -0x3f88f5c3    # -3.86f

    .line 374
    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, -0x4011eb85    # -1.86f

    .line 378
    .line 379
    .line 380
    const v15, 0x3fa3d70a    # 1.28f

    .line 381
    .line 382
    .line 383
    const v16, -0x3fa5c28f    # -3.41f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4008f5c3    # 2.14f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, -0x40800000    # -1.0f

    .line 396
    .line 397
    const v18, 0x3fdc28f6    # 1.72f

    .line 398
    .line 399
    .line 400
    const v13, -0x40e66666    # -0.6f

    .line 401
    .line 402
    .line 403
    const v14, 0x3eb33333    # 0.35f

    .line 404
    .line 405
    .line 406
    const/high16 v15, -0x40800000    # -1.0f

    .line 407
    .line 408
    const v16, 0x3f7ae148    # 0.98f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/high16 v18, 0x40000000    # 2.0f

    .line 417
    .line 418
    const/4 v13, 0x0

    .line 419
    const v14, 0x3f8ccccd    # 1.1f

    .line 420
    .line 421
    .line 422
    const v15, 0x3f666666    # 0.9f

    .line 423
    .line 424
    .line 425
    const/high16 v16, 0x40000000    # 2.0f

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, -0x4099999a    # -0.9f

    .line 431
    .line 432
    .line 433
    const/high16 v2, -0x40000000    # -2.0f

    .line 434
    .line 435
    const/high16 v4, 0x40000000    # 2.0f

    .line 436
    .line 437
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, -0x40800000    # -1.0f

    .line 441
    .line 442
    const v18, -0x4023d70a    # -1.72f

    .line 443
    .line 444
    .line 445
    const v14, -0x40c28f5c    # -0.74f

    .line 446
    .line 447
    .line 448
    const v15, -0x41333333    # -0.4f

    .line 449
    .line 450
    .line 451
    const v16, -0x404f5c29    # -1.38f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x402d70a4    # 2.71f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x40ca3d71    # -0.71f

    .line 464
    .line 465
    .line 466
    const v18, -0x40ca3d71    # -0.71f

    .line 467
    .line 468
    .line 469
    const v14, -0x413851ec    # -0.39f

    .line 470
    .line 471
    .line 472
    const v15, -0x415c28f6    # -0.32f

    .line 473
    .line 474
    .line 475
    const v16, -0x40ca3d71    # -0.71f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, -0x3edbae14    # -10.27f

    .line 482
    .line 483
    .line 484
    const v18, 0x41166666    # 9.4f

    .line 485
    .line 486
    .line 487
    const v13, -0x3f547ae1    # -5.36f

    .line 488
    .line 489
    .line 490
    const v14, -0x41b33333    # -0.2f

    .line 491
    .line 492
    .line 493
    const v15, -0x3ee051ec    # -9.98f

    .line 494
    .line 495
    .line 496
    const v16, 0x4081eb85    # 4.06f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x414028f6    # 12.01f

    .line 503
    .line 504
    .line 505
    const v18, 0x41266666    # 10.4f

    .line 506
    .line 507
    .line 508
    const v13, -0x4147ae14    # -0.36f

    .line 509
    .line 510
    .line 511
    const v14, 0x40d1999a    # 6.55f

    .line 512
    .line 513
    .line 514
    const v15, 0x40ad1eb8    # 5.41f

    .line 515
    .line 516
    .line 517
    const v16, 0x413d1eb8    # 11.82f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x40f80000    # 7.75f

    .line 524
    .line 525
    const v18, -0x3f0a8f5c    # -7.67f

    .line 526
    .line 527
    .line 528
    const v13, 0x407851ec    # 3.88f

    .line 529
    .line 530
    .line 531
    const v14, -0x40ab851f    # -0.83f

    .line 532
    .line 533
    .line 534
    const v15, 0x40dc28f6    # 6.88f

    .line 535
    .line 536
    .line 537
    const v16, -0x3f8ccccd    # -3.8f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, -0x4003d70a    # -1.97f

    .line 544
    .line 545
    .line 546
    const v18, -0x3efa147b    # -8.37f

    .line 547
    .line 548
    .line 549
    const v13, 0x3f35c28f    # 0.71f

    .line 550
    .line 551
    .line 552
    const v14, -0x3fb5c28f    # -3.16f

    .line 553
    .line 554
    .line 555
    const v15, -0x41b33333    # -0.2f

    .line 556
    .line 557
    .line 558
    const v16, -0x3f3ae148    # -6.16f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x404147ae    # -1.49f

    .line 565
    .line 566
    .line 567
    const v18, -0x425c28f6    # -0.08f

    .line 568
    .line 569
    .line 570
    const v13, -0x41428f5c    # -0.37f

    .line 571
    .line 572
    .line 573
    const v14, -0x410f5c29    # -0.47f

    .line 574
    .line 575
    .line 576
    const v15, -0x40770a3d    # -1.07f

    .line 577
    .line 578
    .line 579
    const/high16 v16, -0x41000000    # -0.5f

    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const/high16 v9, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sput-object v0, Landroidx/compose/material/icons/rounded/TrackChangesKt;->_trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/BluetoothSearchingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bluetoothSearching:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBluetoothSearching(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BluetoothSearchingKt;->_bluetoothSearching:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BluetoothSearching"

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
    const v0, 0x417fae14    # 15.98f

    .line 71
    .line 72
    .line 73
    const v2, 0x41247ae1    # 10.28f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x404f5c29    # -1.38f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fb0a3d7    # 1.38f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, 0x3f35c28f    # 0.71f

    .line 91
    .line 92
    .line 93
    const v13, -0x41b33333    # -0.2f

    .line 94
    .line 95
    .line 96
    const v14, 0x3e4ccccd    # 0.2f

    .line 97
    .line 98
    .line 99
    const v15, -0x41b33333    # -0.2f

    .line 100
    .line 101
    .line 102
    const v16, 0x3f028f5c    # 0.51f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x3fb0a3d7    # 1.38f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3f59999a    # 0.85f

    .line 115
    .line 116
    .line 117
    const v18, -0x41947ae1    # -0.23f

    .line 118
    .line 119
    .line 120
    const v13, 0x3e8f5c29    # 0.28f

    .line 121
    .line 122
    .line 123
    const v14, 0x3e8f5c29    # 0.28f

    .line 124
    .line 125
    .line 126
    const/high16 v15, 0x3f400000    # 0.75f

    .line 127
    .line 128
    const v16, 0x3e19999a    # 0.15f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, 0x3e2e147b    # 0.17f

    .line 135
    .line 136
    .line 137
    const v18, -0x403d70a4    # -1.52f

    .line 138
    .line 139
    .line 140
    const v13, 0x3de147ae    # 0.11f

    .line 141
    .line 142
    .line 143
    const/high16 v14, -0x41000000    # -0.5f

    .line 144
    .line 145
    const v15, 0x3e2e147b    # 0.17f

    .line 146
    .line 147
    .line 148
    const/high16 v16, -0x40800000    # -1.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x41c7ae14    # -0.18f

    .line 154
    .line 155
    .line 156
    const v18, -0x40428f5c    # -1.48f

    .line 157
    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const v14, -0x40fd70a4    # -0.51f

    .line 161
    .line 162
    .line 163
    const v15, -0x428a3d71    # -0.06f

    .line 164
    .line 165
    .line 166
    const v16, -0x407eb852    # -1.01f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40a8f5c3    # -0.84f

    .line 173
    .line 174
    .line 175
    const v18, -0x418a3d71    # -0.24f

    .line 176
    .line 177
    .line 178
    const v13, -0x4247ae14    # -0.09f

    .line 179
    .line 180
    .line 181
    const v14, -0x413d70a4    # -0.38f

    .line 182
    .line 183
    .line 184
    const v15, -0x40f0a3d7    # -0.56f

    .line 185
    .line 186
    .line 187
    const v16, -0x40fae148    # -0.52f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x41a0cccd    # 20.1f

    .line 197
    .line 198
    .line 199
    const v2, 0x40f8f5c3    # 7.78f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x404ccccd    # -1.4f

    .line 206
    .line 207
    .line 208
    const/high16 v13, -0x41800000    # -0.25f

    .line 209
    .line 210
    const v14, -0x40f33333    # -0.55f

    .line 211
    .line 212
    .line 213
    const v15, -0x40851eb8    # -0.98f

    .line 214
    .line 215
    .line 216
    const v16, -0x40d47ae1    # -0.67f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x41d1eb85    # -0.17f

    .line 223
    .line 224
    .line 225
    const v18, 0x3f7ae148    # 0.98f

    .line 226
    .line 227
    .line 228
    const v13, -0x417ae148    # -0.26f

    .line 229
    .line 230
    .line 231
    const v14, 0x3e851eb8    # 0.26f

    .line 232
    .line 233
    .line 234
    const v15, -0x416147ae    # -0.31f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f23d70a    # 0.64f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x3f3851ec    # 0.72f

    .line 244
    .line 245
    .line 246
    const v18, 0x405e147b    # 3.47f

    .line 247
    .line 248
    .line 249
    const v13, 0x3eeb851f    # 0.46f

    .line 250
    .line 251
    .line 252
    const v14, 0x3f88f5c3    # 1.07f

    .line 253
    .line 254
    .line 255
    const v15, 0x3f3851ec    # 0.72f

    .line 256
    .line 257
    .line 258
    const v16, 0x400f5c29    # 2.24f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, -0x40c51eb8    # -0.73f

    .line 265
    .line 266
    .line 267
    const v18, 0x405f5c29    # 3.49f

    .line 268
    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const v14, 0x3f9eb852    # 1.24f

    .line 272
    .line 273
    .line 274
    const v15, -0x417ae148    # -0.26f

    .line 275
    .line 276
    .line 277
    const v16, 0x401ae148    # 2.42f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3e23d70a    # 0.16f

    .line 284
    .line 285
    .line 286
    const v18, 0x3f70a3d7    # 0.94f

    .line 287
    .line 288
    .line 289
    const v13, -0x41f0a3d7    # -0.14f

    .line 290
    .line 291
    .line 292
    const v14, 0x3ea3d70a    # 0.32f

    .line 293
    .line 294
    .line 295
    const v15, -0x4247ae14    # -0.09f

    .line 296
    .line 297
    .line 298
    const v16, 0x3f30a3d7    # 0.69f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x3faccccd    # 1.35f

    .line 305
    .line 306
    .line 307
    const v18, -0x41947ae1    # -0.23f

    .line 308
    .line 309
    .line 310
    const v13, 0x3ed1eb85    # 0.41f

    .line 311
    .line 312
    .line 313
    const v14, 0x3ed1eb85    # 0.41f

    .line 314
    .line 315
    .line 316
    const v15, 0x3f8ccccd    # 1.1f

    .line 317
    .line 318
    .line 319
    const v16, 0x3e947ae1    # 0.29f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3f7ae148    # 0.98f

    .line 326
    .line 327
    .line 328
    const v18, -0x3f766666    # -4.3f

    .line 329
    .line 330
    .line 331
    const v13, 0x3f2147ae    # 0.63f

    .line 332
    .line 333
    .line 334
    const v14, -0x4059999a    # -1.3f

    .line 335
    .line 336
    .line 337
    const v15, 0x3f7ae148    # 0.98f

    .line 338
    .line 339
    .line 340
    const v16, -0x3fcf5c29    # -2.76f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x40970a3d    # -0.91f

    .line 347
    .line 348
    .line 349
    const v18, -0x3f7c7ae1    # -4.11f

    .line 350
    .line 351
    .line 352
    const v13, -0x43dc28f6    # -0.01f

    .line 353
    .line 354
    .line 355
    const v14, -0x40466666    # -1.45f

    .line 356
    .line 357
    .line 358
    const v15, -0x41570a3d    # -0.33f

    .line 359
    .line 360
    .line 361
    const v16, -0x3fc9999a    # -2.85f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x41368f5c    # 11.41f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x41400000    # 12.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x4106b852    # 8.42f

    .line 379
    .line 380
    .line 381
    const/high16 v2, 0x41700000    # 15.0f

    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const v18, -0x404a3d71    # -1.42f

    .line 389
    .line 390
    .line 391
    const v13, 0x3ec7ae14    # 0.39f

    .line 392
    .line 393
    .line 394
    const v14, -0x413851ec    # -0.39f

    .line 395
    .line 396
    .line 397
    const v15, 0x3ec7ae14    # 0.39f

    .line 398
    .line 399
    .line 400
    const v16, -0x407d70a4    # -1.02f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, -0x3f76b852    # -4.29f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x40251eb8    # -1.71f

    .line 413
    .line 414
    .line 415
    const v18, 0x3f333333    # 0.7f

    .line 416
    .line 417
    .line 418
    const v13, -0x40deb852    # -0.63f

    .line 419
    .line 420
    .line 421
    const v14, -0x40deb852    # -0.63f

    .line 422
    .line 423
    .line 424
    const v15, -0x40251eb8    # -1.71f

    .line 425
    .line 426
    .line 427
    const v16, -0x41bd70a4    # -0.19f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40c5c28f    # 6.18f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40a3851f    # 5.11f

    .line 440
    .line 441
    .line 442
    const v2, 0x40b66666    # 5.7f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, -0x404b851f    # -1.41f

    .line 449
    .line 450
    .line 451
    const/16 v18, 0x0

    .line 452
    .line 453
    const v13, -0x413851ec    # -0.39f

    .line 454
    .line 455
    .line 456
    const v14, -0x413851ec    # -0.39f

    .line 457
    .line 458
    .line 459
    const v15, -0x407d70a4    # -1.02f

    .line 460
    .line 461
    .line 462
    const v16, -0x413851ec    # -0.39f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const v18, 0x3fb47ae1    # 1.41f

    .line 471
    .line 472
    .line 473
    const v14, 0x3ec7ae14    # 0.39f

    .line 474
    .line 475
    .line 476
    const v15, -0x413851ec    # -0.39f

    .line 477
    .line 478
    .line 479
    const v16, 0x3f828f5c    # 1.02f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x410970a4    # 8.59f

    .line 486
    .line 487
    .line 488
    const/high16 v2, 0x41400000    # 12.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x406ccccd    # 3.7f

    .line 494
    .line 495
    .line 496
    const v2, 0x41871eb8    # 16.89f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3fb47ae1    # 1.41f

    .line 506
    .line 507
    .line 508
    const/16 v18, 0x0

    .line 509
    .line 510
    const v13, 0x3ec7ae14    # 0.39f

    .line 511
    .line 512
    .line 513
    const v15, 0x3f828f5c    # 1.02f

    .line 514
    .line 515
    .line 516
    const v16, 0x3ec7ae14    # 0.39f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41100000    # 9.0f

    .line 523
    .line 524
    const v2, 0x41668f5c    # 14.41f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x40c5c28f    # 6.18f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x3fdae148    # 1.71f

    .line 537
    .line 538
    .line 539
    const v18, 0x3f35c28f    # 0.71f

    .line 540
    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f63d70a    # 0.89f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f8a3d71    # 1.08f

    .line 547
    .line 548
    .line 549
    const v16, 0x3fab851f    # 1.34f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41880000    # 17.0f

    .line 556
    .line 557
    const/high16 v2, 0x41700000    # 15.0f

    .line 558
    .line 559
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/16 v17, 0x0

    .line 563
    .line 564
    const v18, -0x404a3d71    # -1.42f

    .line 565
    .line 566
    .line 567
    const v13, 0x3ec7ae14    # 0.39f

    .line 568
    .line 569
    .line 570
    const v14, -0x413851ec    # -0.39f

    .line 571
    .line 572
    .line 573
    const v15, 0x3ec7ae14    # 0.39f

    .line 574
    .line 575
    .line 576
    const v16, -0x407d70a4    # -1.02f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x41368f5c    # 11.41f

    .line 583
    .line 584
    .line 585
    const/high16 v2, 0x41400000    # 12.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x40ba8f5c    # 5.83f

    .line 594
    .line 595
    .line 596
    const/high16 v2, 0x41300000    # 11.0f

    .line 597
    .line 598
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x3ff0a3d7    # 1.88f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x411970a4    # 9.59f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x40ba8f5c    # 5.83f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x41915c29    # 18.17f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, -0x3f8f5c29    # -3.76f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x3ff0a3d7    # 1.88f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x41915c29    # 18.17f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/high16 v8, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    sput-object v0, Landroidx/compose/material/icons/rounded/BluetoothSearchingKt;->_bluetoothSearching:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 680
    .line 681
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    return-object v0
.end method

.method public static synthetic getBluetoothSearching$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method

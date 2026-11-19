.class public final Landroidx/compose/material/icons/rounded/TaskAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _taskAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTaskAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TaskAltKt;->_taskAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TaskAlt"

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
    const v0, 0x41aa51ec    # 21.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bc7ae1    # 5.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, -0x3ee00000    # -10.0f

    .line 80
    .line 81
    const/high16 v2, 0x41200000    # 10.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v17, -0x404b851f    # -1.41f

    .line 87
    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    .line 91
    const v13, -0x413851ec    # -0.39f

    .line 92
    .line 93
    .line 94
    const v14, 0x3ec7ae14    # 0.39f

    .line 95
    .line 96
    .line 97
    const v15, -0x407d70a4    # -1.02f

    .line 98
    .line 99
    .line 100
    const v16, 0x3ec7ae14    # 0.39f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, -0x3fcae148    # -2.83f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const v18, -0x404b851f    # -1.41f

    .line 115
    .line 116
    .line 117
    const v14, -0x413851ec    # -0.39f

    .line 118
    .line 119
    .line 120
    const v15, -0x413851ec    # -0.39f

    .line 121
    .line 122
    .line 123
    const v16, -0x407d70a4    # -1.02f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x3fb47ae1    # 1.41f

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const v13, 0x3ec7ae14    # 0.39f

    .line 139
    .line 140
    .line 141
    const v15, 0x3f828f5c    # 1.02f

    .line 142
    .line 143
    .line 144
    const v16, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x4007ae14    # 2.12f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x4114a3d7    # 9.29f

    .line 157
    .line 158
    .line 159
    const v2, -0x3eeb5c29    # -9.29f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x41aa51ec    # 21.29f

    .line 173
    .line 174
    .line 175
    const v18, 0x40bc7ae1    # 5.89f

    .line 176
    .line 177
    .line 178
    const v13, 0x41ad70a4    # 21.68f

    .line 179
    .line 180
    .line 181
    const v14, 0x409bd70a    # 4.87f

    .line 182
    .line 183
    .line 184
    const v15, 0x41ad70a4    # 21.68f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x40b00000    # 5.5f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x417c51ec    # 15.77f

    .line 196
    .line 197
    .line 198
    const v2, 0x402f5c29    # 2.74f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, -0x3f4c7ae1    # -5.61f

    .line 205
    .line 206
    .line 207
    const v18, -0x40ee147b    # -0.57f

    .line 208
    .line 209
    .line 210
    const v13, -0x4027ae14    # -1.69f

    .line 211
    .line 212
    .line 213
    const v14, -0x40cf5c29    # -0.69f

    .line 214
    .line 215
    .line 216
    const v15, -0x3f98f5c3    # -3.61f

    .line 217
    .line 218
    .line 219
    const v16, -0x4091eb85    # -0.93f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x4009999a    # 2.15f

    .line 226
    .line 227
    .line 228
    const/high16 v18, 0x41240000    # 10.25f

    .line 229
    .line 230
    const v13, 0x40c2e148    # 6.09f

    .line 231
    .line 232
    .line 233
    const v14, 0x4039999a    # 2.9f

    .line 234
    .line 235
    .line 236
    const v15, 0x4035c28f    # 2.84f

    .line 237
    .line 238
    .line 239
    const v16, 0x40c5c28f    # 6.18f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, 0x415570a4    # 13.34f

    .line 246
    .line 247
    .line 248
    const v18, 0x41af47ae    # 21.91f

    .line 249
    .line 250
    .line 251
    const v13, 0x3f8147ae    # 1.01f

    .line 252
    .line 253
    .line 254
    const/high16 v14, 0x41880000    # 17.0f

    .line 255
    .line 256
    const v15, 0x40d428f6    # 6.63f

    .line 257
    .line 258
    .line 259
    const v16, 0x41b63d71    # 22.78f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x41051eb8    # 8.32f

    .line 266
    .line 267
    .line 268
    const v18, -0x3f16147b    # -7.31f

    .line 269
    .line 270
    .line 271
    const v13, 0x407d70a4    # 3.96f

    .line 272
    .line 273
    .line 274
    const v14, -0x40fd70a4    # -0.51f

    .line 275
    .line 276
    .line 277
    const v15, 0x40e8f5c3    # 7.28f

    .line 278
    .line 279
    .line 280
    const v16, -0x3fa28f5c    # -3.46f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x3e570a3d    # 0.21f

    .line 287
    .line 288
    .line 289
    const v18, -0x3f78f5c3    # -4.22f

    .line 290
    .line 291
    .line 292
    const v13, 0x3ecccccd    # 0.4f

    .line 293
    .line 294
    .line 295
    const v14, -0x4043d70a    # -1.47f

    .line 296
    .line 297
    .line 298
    const v15, 0x3ee147ae    # 0.44f

    .line 299
    .line 300
    .line 301
    const v16, -0x3fc70a3d    # -2.89f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x40266666    # -1.7f

    .line 308
    .line 309
    .line 310
    const v18, -0x40f5c28f    # -0.54f

    .line 311
    .line 312
    .line 313
    const v13, -0x41fae148    # -0.13f

    .line 314
    .line 315
    .line 316
    const v14, -0x40b33333    # -0.8f

    .line 317
    .line 318
    .line 319
    const v15, -0x4070a3d7    # -1.12f

    .line 320
    .line 321
    .line 322
    const v16, -0x4071eb85    # -1.11f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/4 v0, 0x0

    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x4175c28f    # -0.27f

    .line 333
    .line 334
    .line 335
    const v18, 0x3f63d70a    # 0.89f

    .line 336
    .line 337
    .line 338
    const v13, -0x41947ae1    # -0.23f

    .line 339
    .line 340
    .line 341
    const v14, 0x3e6b851f    # 0.23f

    .line 342
    .line 343
    .line 344
    const v15, -0x41570a3d    # -0.33f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f11eb85    # 0.57f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, -0x40fae148    # -0.52f

    .line 354
    .line 355
    .line 356
    const v18, 0x408851ec    # 4.26f

    .line 357
    .line 358
    .line 359
    const v13, 0x3e6147ae    # 0.22f

    .line 360
    .line 361
    .line 362
    const v14, 0x3faa3d71    # 1.33f

    .line 363
    .line 364
    .line 365
    const v15, 0x3df5c28f    # 0.12f

    .line 366
    .line 367
    .line 368
    const/high16 v16, 0x40300000    # 2.75f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x3f2c7ae1    # -6.61f

    .line 374
    .line 375
    .line 376
    const v18, 0x409f0a3d    # 4.97f

    .line 377
    .line 378
    .line 379
    const v13, -0x406b851f    # -1.16f

    .line 380
    .line 381
    .line 382
    const v14, 0x402d70a4    # 2.71f

    .line 383
    .line 384
    .line 385
    const v15, -0x3f947ae1    # -3.68f

    .line 386
    .line 387
    .line 388
    const v16, 0x40966666    # 4.7f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x3ef4cccd    # -8.7f

    .line 395
    .line 396
    .line 397
    const v18, -0x3ef051ec    # -8.98f

    .line 398
    .line 399
    .line 400
    const v13, -0x3f5ccccd    # -5.1f

    .line 401
    .line 402
    .line 403
    const v14, 0x3ef0a3d7    # 0.47f

    .line 404
    .line 405
    .line 406
    const v15, -0x3eeab852    # -9.33f

    .line 407
    .line 408
    .line 409
    const v16, -0x3f89999a    # -3.85f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x40d9eb85    # 6.81f

    .line 416
    .line 417
    .line 418
    const v18, -0x3f22e148    # -6.91f

    .line 419
    .line 420
    .line 421
    const v13, 0x3edc28f6    # 0.43f

    .line 422
    .line 423
    .line 424
    const v14, -0x3f9d70a4    # -3.54f

    .line 425
    .line 426
    .line 427
    const v15, 0x4051eb85    # 3.28f

    .line 428
    .line 429
    .line 430
    const v16, -0x3f328f5c    # -6.42f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, 0x4098a3d7    # 4.77f

    .line 437
    .line 438
    .line 439
    const v18, 0x3f4f5c29    # 0.81f

    .line 440
    .line 441
    .line 442
    const v13, 0x3fdd70a4    # 1.73f

    .line 443
    .line 444
    .line 445
    const v14, -0x418a3d71    # -0.24f

    .line 446
    .line 447
    .line 448
    const v15, 0x4057ae14    # 3.37f

    .line 449
    .line 450
    .line 451
    const v16, 0x3db851ec    # 0.09f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3f95c28f    # 1.17f

    .line 458
    .line 459
    .line 460
    const v18, -0x41c7ae14    # -0.18f

    .line 461
    .line 462
    .line 463
    const v13, 0x3ec7ae14    # 0.39f

    .line 464
    .line 465
    .line 466
    const v14, 0x3e4ccccd    # 0.2f

    .line 467
    .line 468
    .line 469
    const v15, 0x3f5c28f6    # 0.86f

    .line 470
    .line 471
    .line 472
    const v16, 0x3e051eb8    # 0.13f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, -0x418a3d71    # -0.24f

    .line 482
    .line 483
    .line 484
    const v18, -0x40333333    # -1.6f

    .line 485
    .line 486
    .line 487
    const v13, 0x3ef5c28f    # 0.48f

    .line 488
    .line 489
    .line 490
    const v14, -0x410a3d71    # -0.48f

    .line 491
    .line 492
    .line 493
    const v15, 0x3eb851ec    # 0.36f

    .line 494
    .line 495
    .line 496
    const v16, -0x405ae148    # -1.29f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x417c51ec    # 15.77f

    .line 503
    .line 504
    .line 505
    const v18, 0x402f5c29    # 2.74f

    .line 506
    .line 507
    .line 508
    const v13, 0x41827ae1    # 16.31f

    .line 509
    .line 510
    .line 511
    const v14, 0x403eb852    # 2.98f

    .line 512
    .line 513
    .line 514
    const v15, 0x418051ec    # 16.04f

    .line 515
    .line 516
    .line 517
    const v16, 0x40366666    # 2.85f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/16 v16, 0x3800

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const/high16 v6, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/high16 v8, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v7, 0x0

    .line 539
    const/high16 v9, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v12, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    const/4 v14, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sput-object v0, Landroidx/compose/material/icons/rounded/TaskAltKt;->_taskAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-object v0
.end method

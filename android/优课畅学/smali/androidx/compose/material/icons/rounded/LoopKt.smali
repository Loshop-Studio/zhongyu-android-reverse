.class public final Landroidx/compose/material/icons/rounded/LoopKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _loop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLoop(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LoopKt;->_loop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Loop"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x400d70a4    # 2.21f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40a66666    # -0.85f

    .line 84
    .line 85
    .line 86
    const v18, -0x414ccccd    # -0.35f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    const v15, -0x40f5c28f    # -0.54f

    .line 94
    .line 95
    .line 96
    const v16, -0x40d47ae1    # -0.67f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3fcccccd    # -2.8f

    .line 103
    .line 104
    .line 105
    const v2, 0x40328f5c    # 2.79f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v18, 0x3f35c28f    # 0.71f

    .line 114
    .line 115
    .line 116
    const v13, -0x41b33333    # -0.2f

    .line 117
    .line 118
    .line 119
    const v14, 0x3e4ccccd    # 0.2f

    .line 120
    .line 121
    .line 122
    const v15, -0x41b33333    # -0.2f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f028f5c    # 0.51f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x40328f5c    # 2.79f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3f5c28f6    # 0.86f

    .line 138
    .line 139
    .line 140
    const v18, -0x4147ae14    # -0.36f

    .line 141
    .line 142
    .line 143
    const v13, 0x3ea3d70a    # 0.32f

    .line 144
    .line 145
    .line 146
    const v14, 0x3e9eb852    # 0.31f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f5c28f6    # 0.86f

    .line 150
    .line 151
    .line 152
    const v16, 0x3db851ec    # 0.09f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v2, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40c00000    # 6.0f

    .line 166
    .line 167
    const/high16 v18, 0x40c00000    # 6.0f

    .line 168
    .line 169
    const v13, 0x4053d70a    # 3.31f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const/high16 v15, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const v16, 0x402c28f6    # 2.69f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x411eb852    # -0.44f

    .line 182
    .line 183
    .line 184
    const/high16 v18, 0x40100000    # 2.25f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3f4a3d71    # 0.79f

    .line 188
    .line 189
    .line 190
    const v15, -0x41e66666    # -0.15f

    .line 191
    .line 192
    .line 193
    const v16, 0x3fc7ae14    # 1.56f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3e6b851f    # 0.23f

    .line 200
    .line 201
    .line 202
    const v18, 0x3f851eb8    # 1.04f

    .line 203
    .line 204
    .line 205
    const v13, -0x41e66666    # -0.15f

    .line 206
    .line 207
    .line 208
    const v14, 0x3eb851ec    # 0.36f

    .line 209
    .line 210
    .line 211
    const v15, -0x42dc28f6    # -0.04f

    .line 212
    .line 213
    .line 214
    const v16, 0x3f451eb8    # 0.77f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3fd1eb85    # 1.64f

    .line 221
    .line 222
    .line 223
    const v18, -0x4151eb85    # -0.34f

    .line 224
    .line 225
    .line 226
    const v13, 0x3f028f5c    # 0.51f

    .line 227
    .line 228
    .line 229
    const v14, 0x3f028f5c    # 0.51f

    .line 230
    .line 231
    .line 232
    const v15, 0x3faf5c29    # 1.37f

    .line 233
    .line 234
    .line 235
    const v16, 0x3ea8f5c3    # 0.33f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3f11eb85    # 0.57f

    .line 242
    .line 243
    .line 244
    const v18, -0x3fc33333    # -2.95f

    .line 245
    .line 246
    .line 247
    const v13, 0x3ebd70a4    # 0.37f

    .line 248
    .line 249
    .line 250
    const v14, -0x40970a3d    # -0.91f

    .line 251
    .line 252
    .line 253
    const v15, 0x3f11eb85    # 0.57f

    .line 254
    .line 255
    .line 256
    const v16, -0x400b851f    # -1.91f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x3f000000    # -8.0f

    .line 263
    .line 264
    const/high16 v18, -0x3f000000    # -8.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, -0x3f728f5c    # -4.42f

    .line 268
    .line 269
    .line 270
    const v15, -0x3f9ae148    # -3.58f

    .line 271
    .line 272
    .line 273
    const/high16 v16, -0x3f000000    # -8.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41900000    # 18.0f

    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, -0x3f400000    # -6.0f

    .line 287
    .line 288
    const/high16 v18, -0x3f400000    # -6.0f

    .line 289
    .line 290
    const v13, -0x3fac28f6    # -3.31f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const/high16 v15, -0x3f400000    # -6.0f

    .line 295
    .line 296
    const v16, -0x3fd3d70a    # -2.69f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3ee147ae    # 0.44f

    .line 303
    .line 304
    .line 305
    const/high16 v18, -0x3ff00000    # -2.25f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const v14, -0x40b5c28f    # -0.79f

    .line 309
    .line 310
    .line 311
    const v15, 0x3e19999a    # 0.15f

    .line 312
    .line 313
    .line 314
    const v16, -0x403851ec    # -1.56f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x41947ae1    # -0.23f

    .line 321
    .line 322
    .line 323
    const v18, -0x407ae148    # -1.04f

    .line 324
    .line 325
    .line 326
    const v13, 0x3e19999a    # 0.15f

    .line 327
    .line 328
    .line 329
    const v14, -0x4147ae14    # -0.36f

    .line 330
    .line 331
    .line 332
    const v15, 0x3d23d70a    # 0.04f

    .line 333
    .line 334
    .line 335
    const v16, -0x40bae148    # -0.77f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x402e147b    # -1.64f

    .line 342
    .line 343
    .line 344
    const v18, 0x3eae147b    # 0.34f

    .line 345
    .line 346
    .line 347
    const v13, -0x40fd70a4    # -0.51f

    .line 348
    .line 349
    .line 350
    const v14, -0x40fd70a4    # -0.51f

    .line 351
    .line 352
    .line 353
    const v15, -0x4050a3d7    # -1.37f

    .line 354
    .line 355
    .line 356
    const v16, -0x41570a3d    # -0.33f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x40800000    # 4.0f

    .line 363
    .line 364
    const/high16 v18, 0x41400000    # 12.0f

    .line 365
    .line 366
    const v13, 0x40866666    # 4.2f

    .line 367
    .line 368
    .line 369
    const v14, 0x411f5c29    # 9.96f

    .line 370
    .line 371
    .line 372
    const/high16 v15, 0x40800000    # 4.0f

    .line 373
    .line 374
    const v16, 0x412f5c29    # 10.96f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x41000000    # 8.0f

    .line 381
    .line 382
    const/high16 v18, 0x41000000    # 8.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, 0x408d70a4    # 4.42f

    .line 386
    .line 387
    .line 388
    const v15, 0x40651eb8    # 3.58f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x41000000    # 8.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3fe51eb8    # 1.79f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3f59999a    # 0.85f

    .line 403
    .line 404
    .line 405
    const v18, 0x3eb33333    # 0.35f

    .line 406
    .line 407
    .line 408
    const v14, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    const v15, 0x3f0a3d71    # 0.54f

    .line 412
    .line 413
    .line 414
    const v16, 0x3f2b851f    # 0.67f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x3fcd70a4    # -2.79f

    .line 421
    .line 422
    .line 423
    const v2, 0x40328f5c    # 2.79f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/16 v17, 0x0

    .line 430
    .line 431
    const v18, -0x40ca3d71    # -0.71f

    .line 432
    .line 433
    .line 434
    const v13, 0x3e4ccccd    # 0.2f

    .line 435
    .line 436
    .line 437
    const v14, -0x41b33333    # -0.2f

    .line 438
    .line 439
    .line 440
    const v15, 0x3e4ccccd    # 0.2f

    .line 441
    .line 442
    .line 443
    const v16, -0x40fd70a4    # -0.51f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x40a66666    # -0.85f

    .line 453
    .line 454
    .line 455
    const v18, 0x3eb851ec    # 0.36f

    .line 456
    .line 457
    .line 458
    const v13, -0x416147ae    # -0.31f

    .line 459
    .line 460
    .line 461
    const v14, -0x416147ae    # -0.31f

    .line 462
    .line 463
    .line 464
    const v15, -0x40a66666    # -0.85f

    .line 465
    .line 466
    .line 467
    const v16, -0x4247ae14    # -0.09f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41900000    # 18.0f

    .line 474
    .line 475
    const/high16 v2, 0x41400000    # 12.0f

    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/rounded/LoopKt;->_loop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/TranslateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _translate:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTranslate(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TranslateKt;->_translate:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Translate"

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
    const v0, 0x414a6666    # 12.65f

    .line 71
    .line 72
    .line 73
    const v2, 0x417ab852    # 15.67f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41947ae1    # -0.23f

    .line 80
    .line 81
    .line 82
    const v18, -0x4079999a    # -1.05f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e0f5c29    # 0.14f

    .line 86
    .line 87
    .line 88
    const v14, -0x4147ae14    # -0.36f

    .line 89
    .line 90
    .line 91
    const v15, 0x3d4ccccd    # 0.05f

    .line 92
    .line 93
    .line 94
    const v16, -0x40bae148    # -0.77f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, -0x3ffa3d71    # -2.09f

    .line 101
    .line 102
    .line 103
    const v2, -0x3ffc28f6    # -2.06f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x3cf5c28f    # 0.03f

    .line 110
    .line 111
    .line 112
    const v2, -0x430a3d71    # -0.03f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x406d70a4    # 3.71f

    .line 119
    .line 120
    .line 121
    const v18, -0x3f2f0a3d    # -6.53f

    .line 122
    .line 123
    .line 124
    const v13, 0x3fdeb852    # 1.74f

    .line 125
    .line 126
    .line 127
    const v14, -0x4007ae14    # -1.94f

    .line 128
    .line 129
    .line 130
    const v15, 0x403eb852    # 2.98f

    .line 131
    .line 132
    .line 133
    const v16, -0x3f7a8f5c    # -4.17f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x3ff851ec    # 1.94f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3f7d70a4    # 0.99f

    .line 146
    .line 147
    .line 148
    const v18, -0x40828f5c    # -0.99f

    .line 149
    .line 150
    .line 151
    const v13, 0x3f0a3d71    # 0.54f

    .line 152
    .line 153
    .line 154
    const/4 v14, 0x0

    .line 155
    const v15, 0x3f7d70a4    # 0.99f

    .line 156
    .line 157
    .line 158
    const v16, -0x4119999a    # -0.45f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x435c28f6    # -0.02f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x40828f5c    # -0.99f

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, -0x40f5c28f    # -0.54f

    .line 175
    .line 176
    .line 177
    const v15, -0x4119999a    # -0.45f

    .line 178
    .line 179
    .line 180
    const v16, -0x40828f5c    # -0.99f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x40800000    # 4.0f

    .line 187
    .line 188
    const/high16 v2, 0x41200000    # 10.0f

    .line 189
    .line 190
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x40400000    # 3.0f

    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, -0x40800000    # -1.0f

    .line 199
    .line 200
    const/high16 v18, -0x40800000    # -1.0f

    .line 201
    .line 202
    const v14, -0x40f33333    # -0.55f

    .line 203
    .line 204
    .line 205
    const/high16 v16, -0x40800000    # -1.0f

    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x3ee66666    # 0.45f

    .line 211
    .line 212
    .line 213
    const/high16 v2, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v4, -0x40800000    # -1.0f

    .line 216
    .line 217
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x3f800000    # 1.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3ffeb852    # 1.99f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x40828f5c    # -0.99f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f7d70a4    # 0.99f

    .line 237
    .line 238
    .line 239
    const v13, -0x40f5c28f    # -0.54f

    .line 240
    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const v15, -0x40828f5c    # -0.99f

    .line 244
    .line 245
    .line 246
    const v16, 0x3ee66666    # 0.45f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x3f7d70a4    # 0.99f

    .line 253
    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const v15, 0x3ee66666    # 0.45f

    .line 260
    .line 261
    .line 262
    const v16, 0x3f7d70a4    # 0.99f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x4122e148    # 10.18f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x41100000    # 9.0f

    .line 275
    .line 276
    const v18, 0x4135999a    # 11.35f

    .line 277
    .line 278
    .line 279
    const/high16 v13, 0x41380000    # 11.5f

    .line 280
    .line 281
    const v14, 0x40fd70a4    # 7.92f

    .line 282
    .line 283
    .line 284
    const v15, 0x41270a3d    # 10.44f

    .line 285
    .line 286
    .line 287
    const/high16 v16, 0x411c0000    # 9.75f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x3ffc28f6    # -2.06f

    .line 293
    .line 294
    .line 295
    const v18, -0x3fc7ae14    # -2.88f

    .line 296
    .line 297
    .line 298
    const v13, -0x40b0a3d7    # -0.81f

    .line 299
    .line 300
    .line 301
    const v14, -0x409c28f6    # -0.89f

    .line 302
    .line 303
    .line 304
    const v15, -0x404147ae    # -1.49f

    .line 305
    .line 306
    .line 307
    const v16, -0x4011eb85    # -1.86f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x40b851ec    # -0.78f

    .line 314
    .line 315
    .line 316
    const v18, -0x410f5c29    # -0.47f

    .line 317
    .line 318
    .line 319
    const v13, -0x41dc28f6    # -0.16f

    .line 320
    .line 321
    .line 322
    const v14, -0x416b851f    # -0.29f

    .line 323
    .line 324
    .line 325
    const v15, -0x4119999a    # -0.45f

    .line 326
    .line 327
    .line 328
    const v16, -0x410f5c29    # -0.47f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x40b5c28f    # -0.79f

    .line 335
    .line 336
    .line 337
    const v18, 0x3faccccd    # 1.35f

    .line 338
    .line 339
    .line 340
    const v13, -0x40cf5c29    # -0.69f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const v15, -0x406f5c29    # -1.13f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x3f400000    # 0.75f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, 0x40133333    # 2.3f

    .line 353
    .line 354
    .line 355
    const v18, 0x404d70a4    # 3.21f

    .line 356
    .line 357
    .line 358
    const v13, 0x3f2147ae    # 0.63f

    .line 359
    .line 360
    .line 361
    const v14, 0x3f90a3d7    # 1.13f

    .line 362
    .line 363
    .line 364
    const v15, 0x3fb33333    # 1.4f

    .line 365
    .line 366
    .line 367
    const v16, 0x400d70a4    # 2.21f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x40533333    # 3.3f

    .line 374
    .line 375
    .line 376
    const v2, 0x4186f5c3    # 16.87f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/16 v17, 0x0

    .line 383
    .line 384
    const v18, 0x3fb5c28f    # 1.42f

    .line 385
    .line 386
    .line 387
    const v13, -0x41333333    # -0.4f

    .line 388
    .line 389
    .line 390
    const v14, 0x3ec7ae14    # 0.39f

    .line 391
    .line 392
    .line 393
    const v15, -0x41333333    # -0.4f

    .line 394
    .line 395
    .line 396
    const v16, 0x3f83d70a    # 1.03f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3fb5c28f    # 1.42f

    .line 403
    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    const v13, 0x3ec7ae14    # 0.39f

    .line 408
    .line 409
    .line 410
    const v15, 0x3f828f5c    # 1.02f

    .line 411
    .line 412
    .line 413
    const v16, 0x3ec7ae14    # 0.39f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41100000    # 9.0f

    .line 420
    .line 421
    const/high16 v2, 0x41600000    # 14.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x400147ae    # 2.02f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x3fd0a3d7    # 1.63f

    .line 433
    .line 434
    .line 435
    const v18, -0x414ccccd    # -0.35f

    .line 436
    .line 437
    .line 438
    const v13, 0x3f028f5c    # 0.51f

    .line 439
    .line 440
    .line 441
    const v14, 0x3f028f5c    # 0.51f

    .line 442
    .line 443
    .line 444
    const v15, 0x3fb0a3d7    # 1.38f

    .line 445
    .line 446
    .line 447
    const v16, 0x3ea3d70a    # 0.32f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x418c0000    # 17.5f

    .line 457
    .line 458
    const/high16 v2, 0x41200000    # 10.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x40533333    # -1.35f

    .line 464
    .line 465
    .line 466
    const v18, 0x3f70a3d7    # 0.94f

    .line 467
    .line 468
    .line 469
    const v13, -0x40e66666    # -0.6f

    .line 470
    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const v15, -0x406e147b    # -1.14f

    .line 474
    .line 475
    .line 476
    const v16, 0x3ebd70a4    # 0.37f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x411ccccd    # 9.8f

    .line 483
    .line 484
    .line 485
    const v2, -0x3f951eb8    # -3.67f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3f5eb852    # 0.87f

    .line 492
    .line 493
    .line 494
    const v18, 0x3fa147ae    # 1.26f

    .line 495
    .line 496
    .line 497
    const v13, -0x418a3d71    # -0.24f

    .line 498
    .line 499
    .line 500
    const v14, 0x3f1c28f6    # 0.61f

    .line 501
    .line 502
    .line 503
    const v15, 0x3e6147ae    # 0.22f

    .line 504
    .line 505
    .line 506
    const v16, 0x3fa147ae    # 1.26f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x3f6147ae    # 0.88f

    .line 513
    .line 514
    .line 515
    const v18, -0x40e3d70a    # -0.61f

    .line 516
    .line 517
    .line 518
    const v13, 0x3ec7ae14    # 0.39f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const v15, 0x3f3d70a4    # 0.74f

    .line 523
    .line 524
    .line 525
    const v16, -0x418a3d71    # -0.24f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3f63d70a    # 0.89f

    .line 532
    .line 533
    .line 534
    const v2, -0x3fe70a3d    # -2.39f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x40980000    # 4.75f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x3f666666    # 0.9f

    .line 546
    .line 547
    .line 548
    const v2, 0x4018f5c3    # 2.39f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v18, 0x3f1c28f6    # 0.61f

    .line 555
    .line 556
    .line 557
    const v13, 0x3e0f5c29    # 0.14f

    .line 558
    .line 559
    .line 560
    const v14, 0x3eb851ec    # 0.36f

    .line 561
    .line 562
    .line 563
    const v15, 0x3efae148    # 0.49f

    .line 564
    .line 565
    .line 566
    const v16, 0x3f1c28f6    # 0.61f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v18, -0x405eb852    # -1.26f

    .line 573
    .line 574
    .line 575
    const v13, 0x3f266666    # 0.65f

    .line 576
    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const v15, 0x3f8e147b    # 1.11f

    .line 580
    .line 581
    .line 582
    const v16, -0x40d9999a    # -0.65f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, -0x3ee33333    # -9.8f

    .line 589
    .line 590
    .line 591
    const v2, -0x3f951eb8    # -3.67f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, -0x4051eb85    # -1.36f

    .line 598
    .line 599
    .line 600
    const v18, -0x408f5c29    # -0.94f

    .line 601
    .line 602
    .line 603
    const v13, -0x419eb852    # -0.22f

    .line 604
    .line 605
    .line 606
    const v14, -0x40ee147b    # -0.57f

    .line 607
    .line 608
    .line 609
    const v15, -0x40bd70a4    # -0.76f

    .line 610
    .line 611
    .line 612
    const v16, -0x408f5c29    # -0.94f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x417e147b    # 15.88f

    .line 622
    .line 623
    .line 624
    const/high16 v2, 0x41880000    # 17.0f

    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x3fcf5c29    # 1.62f

    .line 630
    .line 631
    .line 632
    const v2, -0x3f7570a4    # -4.33f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x4198f5c3    # 19.12f

    .line 639
    .line 640
    .line 641
    const/high16 v2, 0x41880000    # 17.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, -0x3fb0a3d7    # -3.24f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const/16 v16, 0x3800

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/high16 v6, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/high16 v8, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/4 v7, 0x0

    .line 668
    const/high16 v9, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/high16 v12, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v13, 0x0

    .line 673
    const/4 v14, 0x0

    .line 674
    const/4 v15, 0x0

    .line 675
    const-string v4, ""

    .line 676
    .line 677
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    sput-object v0, Landroidx/compose/material/icons/rounded/TranslateKt;->_translate:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    return-object v0
.end method

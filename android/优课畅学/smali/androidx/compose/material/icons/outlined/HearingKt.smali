.class public final Landroidx/compose/material/icons/outlined/HearingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hearing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHearing(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Hearing"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x40bd70a4    # -0.76f

    .line 78
    .line 79
    .line 80
    const v18, -0x41e66666    # -0.15f

    .line 81
    .line 82
    .line 83
    const v13, -0x416b851f    # -0.29f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x40f0a3d7    # -0.56f

    .line 88
    .line 89
    .line 90
    const v16, -0x428a3d71    # -0.06f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x40251eb8    # -1.71f

    .line 97
    .line 98
    .line 99
    const v18, -0x3fe7ae14    # -2.38f

    .line 100
    .line 101
    .line 102
    const v13, -0x40ca3d71    # -0.71f

    .line 103
    .line 104
    .line 105
    const v14, -0x41428f5c    # -0.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x40651eb8    # -1.21f

    .line 109
    .line 110
    .line 111
    const v16, -0x409eb852    # -0.88f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3fe70a3d    # -2.39f

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 121
    .line 122
    const v13, -0x40fd70a4    # -0.51f

    .line 123
    .line 124
    .line 125
    const v14, -0x403851ec    # -1.56f

    .line 126
    .line 127
    .line 128
    const v15, -0x4043d70a    # -1.47f

    .line 129
    .line 130
    .line 131
    const v16, -0x3fed70a4    # -2.29f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x3feb851f    # -2.32f

    .line 138
    .line 139
    .line 140
    const v18, -0x3fde147b    # -2.53f

    .line 141
    .line 142
    .line 143
    const v13, -0x40b5c28f    # -0.79f

    .line 144
    .line 145
    .line 146
    const v14, -0x40e3d70a    # -0.61f

    .line 147
    .line 148
    .line 149
    const v15, -0x4031eb85    # -1.61f

    .line 150
    .line 151
    .line 152
    const v16, -0x406147ae    # -1.24f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x41100000    # 9.0f

    .line 159
    .line 160
    const/high16 v18, 0x41100000    # 9.0f

    .line 161
    .line 162
    const v13, 0x4114a3d7    # 9.29f

    .line 163
    .line 164
    .line 165
    const v14, 0x412fae14    # 10.98f

    .line 166
    .line 167
    .line 168
    const/high16 v15, 0x41100000    # 9.0f

    .line 169
    .line 170
    const v16, 0x411ee148    # 9.93f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40a00000    # 5.0f

    .line 177
    .line 178
    const/high16 v18, -0x3f600000    # -5.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x3fcccccd    # -2.8f

    .line 182
    .line 183
    .line 184
    const v15, 0x400ccccd    # 2.2f

    .line 185
    .line 186
    .line 187
    const/high16 v16, -0x3f600000    # -5.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x400ccccd    # 2.2f

    .line 193
    .line 194
    .line 195
    const/high16 v2, 0x40a00000    # 5.0f

    .line 196
    .line 197
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, -0x3f200000    # -7.0f

    .line 206
    .line 207
    const/high16 v18, -0x3f200000    # -7.0f

    .line 208
    .line 209
    const v14, -0x3f847ae1    # -3.93f

    .line 210
    .line 211
    .line 212
    const v15, -0x3fbb851f    # -3.07f

    .line 213
    .line 214
    .line 215
    const/high16 v16, -0x3f200000    # -7.0f

    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x40a23d71    # 5.07f

    .line 221
    .line 222
    .line 223
    const/high16 v2, 0x41100000    # 9.0f

    .line 224
    .line 225
    const/high16 v4, 0x40e00000    # 7.0f

    .line 226
    .line 227
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f88f5c3    # 1.07f

    .line 231
    .line 232
    .line 233
    const v18, 0x4079999a    # 3.9f

    .line 234
    .line 235
    .line 236
    const v14, 0x3fa147ae    # 1.26f

    .line 237
    .line 238
    .line 239
    const v15, 0x3ec28f5c    # 0.38f

    .line 240
    .line 241
    .line 242
    const v16, 0x4029999a    # 2.65f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x40366666    # 2.85f

    .line 249
    .line 250
    .line 251
    const v18, 0x4049999a    # 3.15f

    .line 252
    .line 253
    .line 254
    const v13, 0x3f68f5c3    # 0.91f

    .line 255
    .line 256
    .line 257
    const v14, 0x3fd33333    # 1.65f

    .line 258
    .line 259
    .line 260
    const v15, 0x3ffd70a4    # 1.98f

    .line 261
    .line 262
    .line 263
    const v16, 0x401eb852    # 2.48f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3fdae148    # 1.71f

    .line 270
    .line 271
    .line 272
    const v18, 0x40033333    # 2.05f

    .line 273
    .line 274
    .line 275
    const v13, 0x3f4f5c29    # 0.81f

    .line 276
    .line 277
    .line 278
    const v14, 0x3f1eb852    # 0.62f

    .line 279
    .line 280
    .line 281
    const v15, 0x3fb1eb85    # 1.39f

    .line 282
    .line 283
    .line 284
    const v16, 0x3f88f5c3    # 1.07f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x402eb852    # 2.73f

    .line 291
    .line 292
    .line 293
    const v18, 0x40633333    # 3.55f

    .line 294
    .line 295
    .line 296
    const v13, 0x3f19999a    # 0.6f

    .line 297
    .line 298
    .line 299
    const v14, 0x3fe8f5c3    # 1.82f

    .line 300
    .line 301
    .line 302
    const v15, 0x3faf5c29    # 1.37f

    .line 303
    .line 304
    .line 305
    const v16, 0x4035c28f    # 2.84f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3fd1eb85    # 1.64f

    .line 312
    .line 313
    .line 314
    const v18, 0x3eb33333    # 0.35f

    .line 315
    .line 316
    .line 317
    const v13, 0x3f028f5c    # 0.51f

    .line 318
    .line 319
    .line 320
    const v14, 0x3e6b851f    # 0.23f

    .line 321
    .line 322
    .line 323
    const v15, 0x3f88f5c3    # 1.07f

    .line 324
    .line 325
    .line 326
    const v16, 0x3eb33333    # 0.35f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x40800000    # 4.0f

    .line 333
    .line 334
    const/high16 v18, -0x3f800000    # -4.0f

    .line 335
    .line 336
    const v13, 0x400d70a4    # 2.21f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const/high16 v15, 0x40800000    # 4.0f

    .line 341
    .line 342
    const v16, -0x401ae148    # -1.79f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x40000000    # -2.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, -0x40000000    # -2.0f

    .line 354
    .line 355
    const/high16 v18, 0x40000000    # 2.0f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const v14, 0x3f8ccccd    # 1.1f

    .line 359
    .line 360
    .line 361
    const v15, -0x4099999a    # -0.9f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x40000000    # 2.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40f47ae1    # 7.64f

    .line 373
    .line 374
    .line 375
    const v2, 0x4028f5c3    # 2.64f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x40c70a3d    # 6.22f

    .line 382
    .line 383
    .line 384
    const v2, 0x3f9c28f6    # 1.22f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x40400000    # 3.0f

    .line 391
    .line 392
    const/high16 v18, 0x41100000    # 9.0f

    .line 393
    .line 394
    const v13, 0x40875c29    # 4.23f

    .line 395
    .line 396
    .line 397
    const v14, 0x404d70a4    # 3.21f

    .line 398
    .line 399
    .line 400
    const/high16 v15, 0x40400000    # 3.0f

    .line 401
    .line 402
    const v16, 0x40beb852    # 5.96f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x404e147b    # 3.22f

    .line 409
    .line 410
    .line 411
    const v2, 0x40f8f5c3    # 7.78f

    .line 412
    .line 413
    .line 414
    const v4, 0x3f9d70a4    # 1.23f

    .line 415
    .line 416
    .line 417
    const v6, 0x40b947ae    # 5.79f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3fb47ae1    # 1.41f

    .line 424
    .line 425
    .line 426
    const v2, -0x404b851f    # -1.41f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x40a00000    # 5.0f

    .line 433
    .line 434
    const v13, 0x40c051ec    # 6.01f

    .line 435
    .line 436
    .line 437
    const v14, 0x415bd70a    # 13.74f

    .line 438
    .line 439
    .line 440
    const/high16 v15, 0x40a00000    # 5.0f

    .line 441
    .line 442
    const v16, 0x4137d70a    # 11.49f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x3f6851ec    # -4.74f

    .line 449
    .line 450
    .line 451
    const v2, -0x3f347ae1    # -6.36f

    .line 452
    .line 453
    .line 454
    const v4, 0x4028f5c3    # 2.64f

    .line 455
    .line 456
    .line 457
    const v6, 0x3f8147ae    # 1.01f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41380000    # 11.5f

    .line 467
    .line 468
    const/high16 v2, 0x41100000    # 9.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x40200000    # 2.5f

    .line 474
    .line 475
    const/high16 v18, 0x40200000    # 2.5f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, 0x3fb0a3d7    # 1.38f

    .line 479
    .line 480
    .line 481
    const v15, 0x3f8f5c29    # 1.12f

    .line 482
    .line 483
    .line 484
    const/high16 v16, 0x40200000    # 2.5f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x4070a3d7    # -1.12f

    .line 490
    .line 491
    .line 492
    const/high16 v2, 0x40200000    # 2.5f

    .line 493
    .line 494
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 500
    .line 501
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3f8f5c29    # 1.12f

    .line 505
    .line 506
    .line 507
    const/high16 v2, 0x40200000    # 2.5f

    .line 508
    .line 509
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/16 v16, 0x3800

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v8, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/high16 v9, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v12, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/4 v15, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sput-object v0, Landroidx/compose/material/icons/outlined/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    return-object v0
.end method

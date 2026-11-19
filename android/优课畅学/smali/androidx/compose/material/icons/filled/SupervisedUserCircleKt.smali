.class public final Landroidx/compose/material/icons/filled/SupervisedUserCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupervisedUserCircle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SupervisedUserCircle"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const v2, 0x413fd70a    # 11.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 79
    .line 80
    const/high16 v18, 0x41200000    # 10.0f

    .line 81
    .line 82
    const v13, -0x3f4f5c29    # -5.52f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3ee00000    # -10.0f

    .line 87
    .line 88
    const v16, 0x408f5c29    # 4.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4179999a    # 15.6f

    .line 119
    .line 120
    .line 121
    const v2, 0x410570a4    # 8.34f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3ff70a3d    # 1.93f

    .line 128
    .line 129
    .line 130
    const v18, 0x3ff70a3d    # 1.93f

    .line 131
    .line 132
    .line 133
    const v13, 0x3f88f5c3    # 1.07f

    .line 134
    .line 135
    .line 136
    const v15, 0x3ff70a3d    # 1.93f

    .line 137
    .line 138
    .line 139
    const v16, 0x3f5c28f6    # 0.86f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x4008f5c3    # -1.93f

    .line 146
    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const v14, 0x3f88f5c3    # 1.07f

    .line 150
    .line 151
    .line 152
    const v15, -0x40a3d70a    # -0.86f

    .line 153
    .line 154
    .line 155
    const v16, 0x3ff70a3d    # 1.93f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v18, -0x4008f5c3    # -1.93f

    .line 162
    .line 163
    .line 164
    const v13, -0x40770a3d    # -1.07f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const v15, -0x4008f5c3    # -1.93f

    .line 169
    .line 170
    .line 171
    const v16, -0x40a3d70a    # -0.86f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3ff70a3d    # 1.93f

    .line 178
    .line 179
    .line 180
    const v13, -0x43dc28f6    # -0.01f

    .line 181
    .line 182
    .line 183
    const v14, -0x40770a3d    # -1.07f

    .line 184
    .line 185
    .line 186
    const v15, 0x3f5c28f6    # 0.86f

    .line 187
    .line 188
    .line 189
    const v16, -0x4008f5c3    # -1.93f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x40d851ec    # 6.76f

    .line 199
    .line 200
    .line 201
    const v2, 0x4119999a    # 9.6f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x40170a3d    # 2.36f

    .line 208
    .line 209
    .line 210
    const v18, 0x40170a3d    # 2.36f

    .line 211
    .line 212
    .line 213
    const v13, 0x3fa66666    # 1.3f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, 0x40170a3d    # 2.36f

    .line 218
    .line 219
    .line 220
    const v16, 0x3f87ae14    # 1.06f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, -0x3fe8f5c3    # -2.36f

    .line 227
    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const v14, 0x3fa66666    # 1.3f

    .line 231
    .line 232
    .line 233
    const v15, -0x407851ec    # -1.06f

    .line 234
    .line 235
    .line 236
    const v16, 0x40170a3d    # 2.36f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, -0x407851ec    # -1.06f

    .line 243
    .line 244
    .line 245
    const v2, -0x3fe8f5c3    # -2.36f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x40170a3d    # 2.36f

    .line 252
    .line 253
    .line 254
    const v18, -0x3fe8f5c3    # -2.36f

    .line 255
    .line 256
    .line 257
    const v14, -0x405851ec    # -1.31f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f866666    # 1.05f

    .line 261
    .line 262
    .line 263
    const v16, -0x3fe8f5c3    # -2.36f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x417e3d71    # 15.89f

    .line 273
    .line 274
    .line 275
    const v2, 0x4119999a    # 9.6f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40700000    # 3.75f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x3f5b851f    # -5.14f

    .line 287
    .line 288
    .line 289
    const v18, -0x3f6147ae    # -4.96f

    .line 290
    .line 291
    .line 292
    const v13, -0x3fe66666    # -2.4f

    .line 293
    .line 294
    .line 295
    const/high16 v14, -0x40c00000    # -0.75f

    .line 296
    .line 297
    const v15, -0x3f766666    # -4.3f

    .line 298
    .line 299
    .line 300
    const v16, -0x3fd9999a    # -2.6f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x40a47ae1    # 5.14f

    .line 307
    .line 308
    .line 309
    const v18, -0x4027ae14    # -1.69f

    .line 310
    .line 311
    .line 312
    const v13, 0x3f866666    # 1.05f

    .line 313
    .line 314
    .line 315
    const v14, -0x4070a3d7    # -1.12f

    .line 316
    .line 317
    .line 318
    const v15, 0x406ae148    # 3.67f

    .line 319
    .line 320
    .line 321
    const v16, -0x4027ae14    # -1.69f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3ff33333    # 1.9f

    .line 328
    .line 329
    .line 330
    const v18, 0x3e6147ae    # 0.22f

    .line 331
    .line 332
    .line 333
    const v13, 0x3f07ae14    # 0.53f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const v15, 0x3f99999a    # 1.2f

    .line 338
    .line 339
    .line 340
    const v16, 0x3da3d70a    # 0.08f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x400ccccd    # -1.9f

    .line 347
    .line 348
    .line 349
    const v18, 0x402b851f    # 2.68f

    .line 350
    .line 351
    .line 352
    const v13, -0x402e147b    # -1.64f

    .line 353
    .line 354
    .line 355
    const v14, 0x3f5eb852    # 0.87f

    .line 356
    .line 357
    .line 358
    const v15, -0x400ccccd    # -1.9f

    .line 359
    .line 360
    .line 361
    const v16, 0x400147ae    # 2.02f

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 371
    .line 372
    const v2, 0x413fd70a    # 11.99f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x40b5c28f    # -0.79f

    .line 379
    .line 380
    .line 381
    const v18, -0x42dc28f6    # -0.04f

    .line 382
    .line 383
    .line 384
    const v13, -0x4175c28f    # -0.27f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const v15, -0x40f851ec    # -0.53f

    .line 389
    .line 390
    .line 391
    const v16, -0x43dc28f6    # -0.01f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x3f7dc28f    # -4.07f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x408ccccd    # 4.4f

    .line 404
    .line 405
    .line 406
    const v18, -0x3ff7ae14    # -2.13f

    .line 407
    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, -0x404a3d71    # -1.42f

    .line 411
    .line 412
    .line 413
    const v15, 0x403c28f6    # 2.94f

    .line 414
    .line 415
    .line 416
    const v16, -0x3ff7ae14    # -2.13f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x4075c28f    # 3.84f

    .line 423
    .line 424
    .line 425
    const v18, 0x3f933333    # 1.15f

    .line 426
    .line 427
    .line 428
    const v13, 0x3f88f5c3    # 1.07f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const v15, 0x403ae148    # 2.92f

    .line 433
    .line 434
    .line 435
    const v16, 0x3ec7ae14    # 0.39f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x3f11999a    # -7.45f

    .line 442
    .line 443
    .line 444
    const v18, 0x40a2e148    # 5.09f

    .line 445
    .line 446
    .line 447
    const v13, -0x406a3d71    # -1.17f

    .line 448
    .line 449
    .line 450
    const v14, 0x403e147b    # 2.97f

    .line 451
    .line 452
    .line 453
    const v15, -0x3f7e147b    # -4.06f

    .line 454
    .line 455
    .line 456
    const v16, 0x40a2e148    # 5.09f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const/high16 v9, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, Landroidx/compose/material/icons/filled/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/outlined/SwipeUpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeUp(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SwipeUpKt;->_swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SwipeUp"

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
    const v0, 0x41a1c28f    # 20.22f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41200000    # 10.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3f7b3333    # -4.15f

    .line 79
    .line 80
    .line 81
    const v2, 0x3c23d70a    # 0.01f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    const v18, 0x3da3d70a    # 0.08f

    .line 91
    .line 92
    .line 93
    const v13, -0x41dc28f6    # -0.16f

    .line 94
    .line 95
    .line 96
    const v14, -0x43dc28f6    # -0.01f

    .line 97
    .line 98
    .line 99
    const v15, -0x416147ae    # -0.31f

    .line 100
    .line 101
    .line 102
    const v16, 0x3ca3d70a    # 0.02f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x40e8f5c3    # -0.59f

    .line 109
    .line 110
    .line 111
    const v2, 0x3e851eb8    # 0.26f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x41533333    # 13.2f

    .line 118
    .line 119
    .line 120
    const/high16 v2, 0x40c80000    # 6.25f

    .line 121
    .line 122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, -0x3faccccd    # -3.3f

    .line 126
    .line 127
    .line 128
    const v18, -0x405d70a4    # -1.27f

    .line 129
    .line 130
    .line 131
    const v13, -0x40f0a3d7    # -0.56f

    .line 132
    .line 133
    .line 134
    const v14, -0x405eb852    # -1.26f

    .line 135
    .line 136
    .line 137
    const v15, -0x3ffd70a4    # -2.04f

    .line 138
    .line 139
    .line 140
    const v16, -0x4015c28f    # -1.83f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40028f5c    # 2.04f

    .line 147
    .line 148
    .line 149
    const v2, -0x405d70a4    # -1.27f

    .line 150
    .line 151
    .line 152
    const v4, 0x40533333    # 3.3f

    .line 153
    .line 154
    .line 155
    const v6, -0x4015c28f    # -1.83f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x40ee6666    # 7.45f

    .line 162
    .line 163
    .line 164
    const v2, 0x40533333    # 3.3f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x4010a3d7    # -1.87f

    .line 171
    .line 172
    .line 173
    const v2, 0x3ec7ae14    # 0.39f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x4051eb85    # -1.36f

    .line 180
    .line 181
    .line 182
    const v18, 0x3f9ae148    # 1.21f

    .line 183
    .line 184
    .line 185
    const v13, -0x41bd70a4    # -0.19f

    .line 186
    .line 187
    .line 188
    const v14, 0x3d4ccccd    # 0.05f

    .line 189
    .line 190
    .line 191
    const v15, -0x40828f5c    # -0.99f

    .line 192
    .line 193
    .line 194
    const v16, 0x3e8a3d71    # 0.27f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x4199851f    # 19.19f

    .line 201
    .line 202
    .line 203
    const/high16 v2, 0x41000000    # 8.0f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x40d8f5c3    # 6.78f

    .line 209
    .line 210
    .line 211
    const v2, 0x402ae148    # 2.67f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x3fc3d70a    # 1.53f

    .line 218
    .line 219
    .line 220
    const v18, -0x42dc28f6    # -0.04f

    .line 221
    .line 222
    .line 223
    const v13, 0x3efae148    # 0.49f

    .line 224
    .line 225
    .line 226
    const v14, 0x3e428f5c    # 0.19f

    .line 227
    .line 228
    .line 229
    const v15, 0x3f866666    # 1.05f

    .line 230
    .line 231
    .line 232
    const v16, 0x3e3851ec    # 0.18f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x40bfae14    # 5.99f

    .line 239
    .line 240
    .line 241
    const v2, -0x3fd66666    # -2.65f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x3f90a3d7    # 1.13f

    .line 248
    .line 249
    .line 250
    const v18, -0x3feb851f    # -2.32f

    .line 251
    .line 252
    .line 253
    const v13, 0x3f63d70a    # 0.89f

    .line 254
    .line 255
    .line 256
    const v14, -0x41333333    # -0.4f

    .line 257
    .line 258
    .line 259
    const v15, 0x3faf5c29    # 1.37f

    .line 260
    .line 261
    .line 262
    const v16, -0x404f5c29    # -1.38f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x4051eb85    # -1.36f

    .line 269
    .line 270
    .line 271
    const v2, -0x3f551eb8    # -5.34f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x41a1c28f    # 20.22f

    .line 278
    .line 279
    .line 280
    const/high16 v18, 0x41200000    # 10.0f

    .line 281
    .line 282
    const v13, 0x41aecccd    # 21.85f

    .line 283
    .line 284
    .line 285
    const v14, 0x412a6666    # 10.65f

    .line 286
    .line 287
    .line 288
    const v15, 0x41a8cccd    # 21.1f

    .line 289
    .line 290
    .line 291
    const v16, 0x4120a3d7    # 10.04f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x418ab852    # 17.34f

    .line 301
    .line 302
    .line 303
    const v2, 0x41abeb85    # 21.49f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x41780000    # 15.5f

    .line 310
    .line 311
    const/high16 v2, 0x41a00000    # 20.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x3f628f5c    # -4.92f

    .line 317
    .line 318
    .line 319
    const v2, -0x40051eb8    # -1.96f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x4085c28f    # 4.18f

    .line 326
    .line 327
    .line 328
    const v2, -0x409eb852    # -0.88f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x3f766666    # -4.3f

    .line 335
    .line 336
    .line 337
    const v2, -0x3ee4cccd    # -9.7f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x3e800000    # 0.25f

    .line 344
    .line 345
    const v18, -0x40d70a3d    # -0.66f

    .line 346
    .line 347
    .line 348
    const v13, -0x421eb852    # -0.11f

    .line 349
    .line 350
    .line 351
    const/high16 v14, -0x41800000    # -0.25f

    .line 352
    .line 353
    const/4 v15, 0x0

    .line 354
    const v16, -0x40f33333    # -0.55f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3f28f5c3    # 0.66f

    .line 361
    .line 362
    .line 363
    const/high16 v18, 0x3e800000    # 0.25f

    .line 364
    .line 365
    const/high16 v13, 0x3e800000    # 0.25f

    .line 366
    .line 367
    const v14, -0x421eb852    # -0.11f

    .line 368
    .line 369
    .line 370
    const v15, 0x3f0ccccd    # 0.55f

    .line 371
    .line 372
    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x40200000    # 2.5f

    .line 379
    .line 380
    const v2, 0x40b4cccd    # 5.65f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3fce147b    # 1.61f

    .line 387
    .line 388
    .line 389
    const v2, -0x40ca3d71    # -0.71f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x41a10a3d    # 20.13f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x41400000    # 12.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x418ab852    # 17.34f

    .line 404
    .line 405
    .line 406
    const v2, 0x41abeb85    # 21.49f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x4003d70a    # 2.06f

    .line 416
    .line 417
    .line 418
    const v2, 0x40b1eb85    # 5.56f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v2, 0x40900000    # 4.5f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x41000000    # 8.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40de147b    # 6.94f

    .line 440
    .line 441
    .line 442
    const v2, 0x40b1eb85    # 5.56f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x40aa3d71    # 5.32f

    .line 449
    .line 450
    .line 451
    const v2, 0x407c28f6    # 3.94f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40a00000    # 5.0f

    .line 458
    .line 459
    const/high16 v18, 0x40d00000    # 6.5f

    .line 460
    .line 461
    const v13, 0x40a3851f    # 5.11f

    .line 462
    .line 463
    .line 464
    const v14, 0x409851ec    # 4.76f

    .line 465
    .line 466
    .line 467
    const/high16 v15, 0x40a00000    # 5.0f

    .line 468
    .line 469
    const v16, 0x40b3d70a    # 5.62f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x400ccccd    # 2.2f

    .line 476
    .line 477
    .line 478
    const v18, 0x40cdc28f    # 6.43f

    .line 479
    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const v14, 0x401ae148    # 2.42f

    .line 483
    .line 484
    .line 485
    const v15, 0x3f51eb85    # 0.82f

    .line 486
    .line 487
    .line 488
    const v16, 0x4094cccd    # 4.65f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x40c428f6    # 6.13f

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x41600000    # 14.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x40600000    # 3.5f

    .line 503
    .line 504
    const/high16 v18, 0x40d00000    # 6.5f

    .line 505
    .line 506
    const v13, 0x408fae14    # 4.49f

    .line 507
    .line 508
    .line 509
    const v14, 0x413f3333    # 11.95f

    .line 510
    .line 511
    .line 512
    const/high16 v15, 0x40600000    # 3.5f

    .line 513
    .line 514
    const v16, 0x411570a4    # 9.34f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3e99999a    # 0.3f

    .line 521
    .line 522
    .line 523
    const v18, -0x3fd47ae1    # -2.68f

    .line 524
    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const v14, -0x40947ae1    # -0.92f

    .line 528
    .line 529
    .line 530
    const v15, 0x3dcccccd    # 0.1f

    .line 531
    .line 532
    .line 533
    const v16, -0x40170a3d    # -1.82f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x4003d70a    # 2.06f

    .line 540
    .line 541
    .line 542
    const v2, 0x40b1eb85    # 5.56f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/outlined/SwipeUpKt;->_swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method

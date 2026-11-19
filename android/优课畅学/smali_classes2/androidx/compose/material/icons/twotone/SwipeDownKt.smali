.class public final Landroidx/compose/material/icons/twotone/SwipeDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeDown(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SwipeDownKt;->_swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SwipeDown"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x418ab852    # 17.34f

    .line 71
    .line 72
    .line 73
    const v6, 0x41abeb85    # 21.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x41a00000    # 20.0f

    .line 80
    .line 81
    const/high16 v6, 0x41780000    # 15.5f

    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, -0x40051eb8    # -1.96f

    .line 87
    .line 88
    .line 89
    const v6, -0x3f628f5c    # -4.92f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, -0x409eb852    # -0.88f

    .line 96
    .line 97
    .line 98
    const v6, 0x4085c28f    # 4.18f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3ee4cccd    # -9.7f

    .line 105
    .line 106
    .line 107
    const v6, -0x3f766666    # -4.3f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, 0x3e800000    # 0.25f

    .line 114
    .line 115
    const v26, -0x40d70a3d    # -0.66f

    .line 116
    .line 117
    .line 118
    const v21, -0x421eb852    # -0.11f

    .line 119
    .line 120
    .line 121
    const/high16 v22, -0x41800000    # -0.25f

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    const v24, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    move-object/from16 v20, v2

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x3f28f5c3    # 0.66f

    .line 134
    .line 135
    .line 136
    const/high16 v26, 0x3e800000    # 0.25f

    .line 137
    .line 138
    const/high16 v21, 0x3e800000    # 0.25f

    .line 139
    .line 140
    const v22, -0x421eb852    # -0.11f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f0ccccd    # 0.55f

    .line 144
    .line 145
    .line 146
    const/16 v24, 0x0

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40b4cccd    # 5.65f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x40200000    # 2.5f

    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x40ca3d71    # -0.71f

    .line 160
    .line 161
    .line 162
    const v6, 0x3fce147b    # 1.61f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x41400000    # 12.0f

    .line 169
    .line 170
    const v6, 0x41a10a3d    # 20.13f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x418ab852    # 17.34f

    .line 177
    .line 178
    .line 179
    const v6, 0x41abeb85    # 21.49f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/16 v16, 0x3800

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const v6, 0x3e99999a    # 0.3f

    .line 197
    .line 198
    .line 199
    const v8, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const/high16 v9, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const-string v4, ""

    .line 211
    .line 212
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    const/4 v0, 0x0

    .line 226
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const v0, 0x41a1c28f    # 20.22f

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x41200000    # 10.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x3f7b3333    # -4.15f

    .line 251
    .line 252
    .line 253
    const v2, 0x3c23d70a    # 0.01f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x4119999a    # -0.45f

    .line 260
    .line 261
    .line 262
    const v18, 0x3da3d70a    # 0.08f

    .line 263
    .line 264
    .line 265
    const v13, -0x41dc28f6    # -0.16f

    .line 266
    .line 267
    .line 268
    const v14, -0x43dc28f6    # -0.01f

    .line 269
    .line 270
    .line 271
    const v15, -0x416147ae    # -0.31f

    .line 272
    .line 273
    .line 274
    const v16, 0x3ca3d70a    # 0.02f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x40e8f5c3    # -0.59f

    .line 281
    .line 282
    .line 283
    const v2, 0x3e851eb8    # 0.26f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x41533333    # 13.2f

    .line 290
    .line 291
    .line 292
    const/high16 v2, 0x40c80000    # 6.25f

    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x3faccccd    # -3.3f

    .line 298
    .line 299
    .line 300
    const v18, -0x405d70a4    # -1.27f

    .line 301
    .line 302
    .line 303
    const v13, -0x40f0a3d7    # -0.56f

    .line 304
    .line 305
    .line 306
    const v14, -0x405eb852    # -1.26f

    .line 307
    .line 308
    .line 309
    const v15, -0x3ffd70a4    # -2.04f

    .line 310
    .line 311
    .line 312
    const v16, -0x4015c28f    # -1.83f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40028f5c    # 2.04f

    .line 319
    .line 320
    .line 321
    const v2, -0x405d70a4    # -1.27f

    .line 322
    .line 323
    .line 324
    const v4, 0x40533333    # 3.3f

    .line 325
    .line 326
    .line 327
    const v6, -0x4015c28f    # -1.83f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x40ee6666    # 7.45f

    .line 334
    .line 335
    .line 336
    const v2, 0x40533333    # 3.3f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x4010a3d7    # -1.87f

    .line 343
    .line 344
    .line 345
    const v2, 0x3ec7ae14    # 0.39f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x4051eb85    # -1.36f

    .line 352
    .line 353
    .line 354
    const v18, 0x3f9ae148    # 1.21f

    .line 355
    .line 356
    .line 357
    const v13, -0x41bd70a4    # -0.19f

    .line 358
    .line 359
    .line 360
    const v14, 0x3d4ccccd    # 0.05f

    .line 361
    .line 362
    .line 363
    const v15, -0x40828f5c    # -0.99f

    .line 364
    .line 365
    .line 366
    const v16, 0x3e8a3d71    # 0.27f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x4199851f    # 19.19f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x41000000    # 8.0f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40d8f5c3    # 6.78f

    .line 381
    .line 382
    .line 383
    const v2, 0x402ae148    # 2.67f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x3fc3d70a    # 1.53f

    .line 390
    .line 391
    .line 392
    const v18, -0x42dc28f6    # -0.04f

    .line 393
    .line 394
    .line 395
    const v13, 0x3efae148    # 0.49f

    .line 396
    .line 397
    .line 398
    const v14, 0x3e428f5c    # 0.19f

    .line 399
    .line 400
    .line 401
    const v15, 0x3f866666    # 1.05f

    .line 402
    .line 403
    .line 404
    const v16, 0x3e3851ec    # 0.18f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x40bfae14    # 5.99f

    .line 411
    .line 412
    .line 413
    const v2, -0x3fd66666    # -2.65f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3f90a3d7    # 1.13f

    .line 420
    .line 421
    .line 422
    const v18, -0x3feb851f    # -2.32f

    .line 423
    .line 424
    .line 425
    const v13, 0x3f63d70a    # 0.89f

    .line 426
    .line 427
    .line 428
    const v14, -0x41333333    # -0.4f

    .line 429
    .line 430
    .line 431
    const v15, 0x3faf5c29    # 1.37f

    .line 432
    .line 433
    .line 434
    const v16, -0x404f5c29    # -1.38f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x4051eb85    # -1.36f

    .line 441
    .line 442
    .line 443
    const v2, -0x3f551eb8    # -5.34f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x41a1c28f    # 20.22f

    .line 450
    .line 451
    .line 452
    const/high16 v18, 0x41200000    # 10.0f

    .line 453
    .line 454
    const v13, 0x41aecccd    # 21.85f

    .line 455
    .line 456
    .line 457
    const v14, 0x412a6666    # 10.65f

    .line 458
    .line 459
    .line 460
    const v15, 0x41a8cccd    # 21.1f

    .line 461
    .line 462
    .line 463
    const v16, 0x4120a3d7    # 10.04f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x418ab852    # 17.34f

    .line 473
    .line 474
    .line 475
    const v2, 0x41abeb85    # 21.49f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41a00000    # 20.0f

    .line 482
    .line 483
    const/high16 v2, 0x41780000    # 15.5f

    .line 484
    .line 485
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x40051eb8    # -1.96f

    .line 489
    .line 490
    .line 491
    const v2, -0x3f628f5c    # -4.92f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, -0x409eb852    # -0.88f

    .line 498
    .line 499
    .line 500
    const v2, 0x4085c28f    # 4.18f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x3ee4cccd    # -9.7f

    .line 507
    .line 508
    .line 509
    const v2, -0x3f766666    # -4.3f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x3e800000    # 0.25f

    .line 516
    .line 517
    const v18, -0x40d70a3d    # -0.66f

    .line 518
    .line 519
    .line 520
    const v13, -0x421eb852    # -0.11f

    .line 521
    .line 522
    .line 523
    const/high16 v14, -0x41800000    # -0.25f

    .line 524
    .line 525
    const/4 v15, 0x0

    .line 526
    const v16, -0x40f33333    # -0.55f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x3f28f5c3    # 0.66f

    .line 533
    .line 534
    .line 535
    const/high16 v18, 0x3e800000    # 0.25f

    .line 536
    .line 537
    const/high16 v13, 0x3e800000    # 0.25f

    .line 538
    .line 539
    const v14, -0x421eb852    # -0.11f

    .line 540
    .line 541
    .line 542
    const v15, 0x3f0ccccd    # 0.55f

    .line 543
    .line 544
    .line 545
    const/16 v16, 0x0

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x40b4cccd    # 5.65f

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x40200000    # 2.5f

    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, -0x40ca3d71    # -0.71f

    .line 559
    .line 560
    .line 561
    const v2, 0x3fce147b    # 1.61f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41400000    # 12.0f

    .line 568
    .line 569
    const v2, 0x41a10a3d    # 20.13f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x418ab852    # 17.34f

    .line 576
    .line 577
    .line 578
    const v2, 0x41abeb85    # 21.49f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x4142e148    # 12.18f

    .line 588
    .line 589
    .line 590
    const v2, 0x40733333    # 3.8f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, -0x41666666    # -0.3f

    .line 597
    .line 598
    .line 599
    const v18, -0x3fd47ae1    # -2.68f

    .line 600
    .line 601
    .line 602
    const v13, -0x41b33333    # -0.2f

    .line 603
    .line 604
    .line 605
    const v14, -0x40a3d70a    # -0.86f

    .line 606
    .line 607
    .line 608
    const v15, -0x41666666    # -0.3f

    .line 609
    .line 610
    .line 611
    const v16, -0x401eb852    # -1.76f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x402851ec    # 2.63f

    .line 618
    .line 619
    .line 620
    const/high16 v18, -0x3f100000    # -7.5f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const v14, -0x3fca3d71    # -2.84f

    .line 624
    .line 625
    .line 626
    const v15, 0x3f7d70a4    # 0.99f

    .line 627
    .line 628
    .line 629
    const v16, -0x3f51999a    # -5.45f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x40e66666    # 7.2f

    .line 636
    .line 637
    .line 638
    const v2, 0x40447ae1    # 3.07f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v17, 0x40a00000    # 5.0f

    .line 645
    .line 646
    const/high16 v18, 0x41180000    # 9.5f

    .line 647
    .line 648
    const v13, 0x40ba3d71    # 5.82f

    .line 649
    .line 650
    .line 651
    const v14, 0x409b3333    # 4.85f

    .line 652
    .line 653
    .line 654
    const/high16 v15, 0x40a00000    # 5.0f

    .line 655
    .line 656
    const v16, 0x40e28f5c    # 7.08f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, 0x3ea3d70a    # 0.32f

    .line 663
    .line 664
    .line 665
    const v18, 0x4023d70a    # 2.56f

    .line 666
    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const v14, 0x3f6147ae    # 0.88f

    .line 670
    .line 671
    .line 672
    const v15, 0x3de147ae    # 0.11f

    .line 673
    .line 674
    .line 675
    const v16, 0x3fdeb852    # 1.74f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x3fcf5c29    # 1.62f

    .line 682
    .line 683
    .line 684
    const v2, -0x4030a3d7    # -1.62f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, 0x41380000    # 11.5f

    .line 691
    .line 692
    const/high16 v2, 0x41000000    # 8.0f

    .line 693
    .line 694
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x40900000    # 4.5f

    .line 698
    .line 699
    const/high16 v2, 0x41700000    # 15.0f

    .line 700
    .line 701
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v2, 0x41380000    # 11.5f

    .line 707
    .line 708
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x3f87ae14    # 1.06f

    .line 712
    .line 713
    .line 714
    const v2, -0x407851ec    # -1.06f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, 0x4142e148    # 12.18f

    .line 721
    .line 722
    .line 723
    const v2, 0x40733333    # 3.8f

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const/16 v16, 0x3800

    .line 737
    .line 738
    const/16 v17, 0x0

    .line 739
    .line 740
    const/high16 v6, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const/high16 v8, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v12, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v14, 0x0

    .line 748
    const/4 v15, 0x0

    .line 749
    const-string v4, ""

    .line 750
    .line 751
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    sput-object v0, Landroidx/compose/material/icons/twotone/SwipeDownKt;->_swipeDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 760
    .line 761
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    return-object v0
.end method

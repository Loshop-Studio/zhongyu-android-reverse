.class public final Landroidx/compose/material/icons/twotone/HandshakeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _handshake:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHandshake(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HandshakeKt;->_handshake:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Handshake"

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
    const v4, 0x419ecccd    # 19.85f

    .line 71
    .line 72
    .line 73
    const v6, 0x4143851f    # 12.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x40ca3d71    # -0.71f

    .line 80
    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const v21, -0x41c7ae14    # -0.18f

    .line 85
    .line 86
    .line 87
    const v22, 0x3e3851ec    # 0.18f

    .line 88
    .line 89
    .line 90
    const/high16 v23, -0x41000000    # -0.5f

    .line 91
    .line 92
    const v24, 0x3e570a3d    # 0.21f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/16 v25, 0x0

    .line 101
    .line 102
    const v26, -0x40ca3d71    # -0.71f

    .line 103
    .line 104
    .line 105
    const v22, -0x41c7ae14    # -0.18f

    .line 106
    .line 107
    .line 108
    const v23, -0x41a8f5c3    # -0.21f

    .line 109
    .line 110
    .line 111
    const/high16 v24, -0x41000000    # -0.5f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x3fa70a3d    # -3.39f

    .line 117
    .line 118
    .line 119
    const v6, 0x4058f5c3    # 3.39f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, -0x404b851f    # -1.41f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, -0x3fa70a3d    # -3.39f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, -0x40ca3d71    # -0.71f

    .line 138
    .line 139
    .line 140
    const/16 v26, 0x0

    .line 141
    .line 142
    const v21, -0x41bd70a4    # -0.19f

    .line 143
    .line 144
    .line 145
    const v22, 0x3e4ccccd    # 0.2f

    .line 146
    .line 147
    .line 148
    const v23, -0x40fd70a4    # -0.51f

    .line 149
    .line 150
    .line 151
    const v24, 0x3e428f5c    # 0.19f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/16 v25, 0x0

    .line 158
    .line 159
    const v26, -0x40ca3d71    # -0.71f

    .line 160
    .line 161
    .line 162
    const v21, -0x41a8f5c3    # -0.21f

    .line 163
    .line 164
    .line 165
    const v22, -0x41a8f5c3    # -0.21f

    .line 166
    .line 167
    .line 168
    const v23, -0x41c7ae14    # -0.18f

    .line 169
    .line 170
    .line 171
    const v24, -0x40f851ec    # -0.53f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, -0x404b851f    # -1.41f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, -0x3fa70a3d    # -3.39f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, -0x40ca3d71    # -0.71f

    .line 193
    .line 194
    .line 195
    const/16 v26, 0x0

    .line 196
    .line 197
    const v21, -0x41c7ae14    # -0.18f

    .line 198
    .line 199
    .line 200
    const v22, 0x3e3851ec    # 0.18f

    .line 201
    .line 202
    .line 203
    const/high16 v23, -0x41000000    # -0.5f

    .line 204
    .line 205
    const v24, 0x3e570a3d    # 0.21f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/16 v25, 0x0

    .line 212
    .line 213
    const v26, -0x40ca3d71    # -0.71f

    .line 214
    .line 215
    .line 216
    const v21, -0x41bd70a4    # -0.19f

    .line 217
    .line 218
    .line 219
    const v22, -0x41bd70a4    # -0.19f

    .line 220
    .line 221
    .line 222
    const v23, -0x41bd70a4    # -0.19f

    .line 223
    .line 224
    .line 225
    const v24, -0x40fd70a4    # -0.51f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x4121999a    # 10.1f

    .line 235
    .line 236
    .line 237
    const v6, 0x4113d70a    # 9.24f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, -0x3fa70a3d    # -3.39f

    .line 244
    .line 245
    .line 246
    const v6, 0x4058f5c3    # 3.39f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, -0x40ca3d71    # -0.71f

    .line 253
    .line 254
    .line 255
    const/16 v26, 0x0

    .line 256
    .line 257
    const v21, -0x41c7ae14    # -0.18f

    .line 258
    .line 259
    .line 260
    const v22, 0x3e3851ec    # 0.18f

    .line 261
    .line 262
    .line 263
    const/high16 v23, -0x41000000    # -0.5f

    .line 264
    .line 265
    const v24, 0x3e570a3d    # 0.21f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/16 v25, 0x0

    .line 272
    .line 273
    const v26, -0x40ca3d71    # -0.71f

    .line 274
    .line 275
    .line 276
    const v21, -0x41bd70a4    # -0.19f

    .line 277
    .line 278
    .line 279
    const v22, -0x41b33333    # -0.2f

    .line 280
    .line 281
    .line 282
    const v23, -0x41bd70a4    # -0.19f

    .line 283
    .line 284
    .line 285
    const v24, -0x40fd70a4    # -0.51f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x41066666    # 8.4f

    .line 292
    .line 293
    .line 294
    const v6, 0x411851ec    # 9.52f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x3fee147b    # 1.86f

    .line 301
    .line 302
    .line 303
    const v6, 0x3fef5c29    # 1.87f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x40628f5c    # 3.54f

    .line 310
    .line 311
    .line 312
    const/16 v26, 0x0

    .line 313
    .line 314
    const v21, 0x3f733333    # 0.95f

    .line 315
    .line 316
    .line 317
    const v22, 0x3f733333    # 0.95f

    .line 318
    .line 319
    .line 320
    const v23, 0x4025c28f    # 2.59f

    .line 321
    .line 322
    .line 323
    const v24, 0x3f70a3d7    # 0.94f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/16 v25, 0x0

    .line 330
    .line 331
    const v26, -0x3f9d70a4    # -3.54f

    .line 332
    .line 333
    .line 334
    const v21, 0x3f7ae148    # 0.98f

    .line 335
    .line 336
    .line 337
    const v22, -0x40851eb8    # -0.98f

    .line 338
    .line 339
    .line 340
    const v23, 0x3f7ae148    # 0.98f

    .line 341
    .line 342
    .line 343
    const v24, -0x3fdc28f6    # -2.56f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, -0x4011eb85    # -1.86f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v4, 0x3e8f5c29    # 0.28f

    .line 356
    .line 357
    .line 358
    const v6, -0x4170a3d7    # -0.28f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v25, 0x40351eb8    # 2.83f

    .line 365
    .line 366
    .line 367
    const/16 v26, 0x0

    .line 368
    .line 369
    const v21, 0x3f47ae14    # 0.78f

    .line 370
    .line 371
    .line 372
    const v22, -0x40b851ec    # -0.78f

    .line 373
    .line 374
    .line 375
    const v23, 0x40033333    # 2.05f

    .line 376
    .line 377
    .line 378
    const v24, -0x40b851ec    # -0.78f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v4, 0x4087ae14    # 4.24f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/16 v25, 0x0

    .line 391
    .line 392
    const v26, 0x40351eb8    # 2.83f

    .line 393
    .line 394
    .line 395
    const v22, 0x3f47ae14    # 0.78f

    .line 396
    .line 397
    .line 398
    const v23, 0x3f47ae14    # 0.78f

    .line 399
    .line 400
    .line 401
    const v24, 0x40033333    # 2.05f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x419ecccd    # 19.85f

    .line 408
    .line 409
    .line 410
    const v6, 0x4143851f    # 12.22f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/16 v16, 0x3800

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const v6, 0x3e99999a    # 0.3f

    .line 428
    .line 429
    .line 430
    const v8, 0x3e99999a    # 0.3f

    .line 431
    .line 432
    .line 433
    const/4 v7, 0x0

    .line 434
    const/high16 v9, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v12, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const/4 v14, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    const-string v4, ""

    .line 442
    .line 443
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 451
    .line 452
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 453
    .line 454
    .line 455
    move-result-wide v6

    .line 456
    const/4 v0, 0x0

    .line 457
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    const v0, 0x419ecccd    # 19.85f

    .line 474
    .line 475
    .line 476
    const v2, 0x4143851f    # 12.22f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x40ca3d71    # -0.71f

    .line 483
    .line 484
    .line 485
    const/16 v18, 0x0

    .line 486
    .line 487
    const v13, -0x41c7ae14    # -0.18f

    .line 488
    .line 489
    .line 490
    const v14, 0x3e3851ec    # 0.18f

    .line 491
    .line 492
    .line 493
    const/high16 v15, -0x41000000    # -0.5f

    .line 494
    .line 495
    const v16, 0x3e570a3d    # 0.21f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/16 v17, 0x0

    .line 502
    .line 503
    const v18, -0x40ca3d71    # -0.71f

    .line 504
    .line 505
    .line 506
    const v14, -0x41c7ae14    # -0.18f

    .line 507
    .line 508
    .line 509
    const v15, -0x41a8f5c3    # -0.21f

    .line 510
    .line 511
    .line 512
    const/high16 v16, -0x41000000    # -0.5f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x3fa70a3d    # -3.39f

    .line 518
    .line 519
    .line 520
    const v2, 0x4058f5c3    # 3.39f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x404b851f    # -1.41f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, -0x3fa70a3d    # -3.39f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, -0x40ca3d71    # -0.71f

    .line 539
    .line 540
    .line 541
    const/16 v18, 0x0

    .line 542
    .line 543
    const v13, -0x41bd70a4    # -0.19f

    .line 544
    .line 545
    .line 546
    const v14, 0x3e4ccccd    # 0.2f

    .line 547
    .line 548
    .line 549
    const v15, -0x40fd70a4    # -0.51f

    .line 550
    .line 551
    .line 552
    const v16, 0x3e428f5c    # 0.19f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const v18, -0x40ca3d71    # -0.71f

    .line 561
    .line 562
    .line 563
    const v13, -0x41a8f5c3    # -0.21f

    .line 564
    .line 565
    .line 566
    const v14, -0x41a8f5c3    # -0.21f

    .line 567
    .line 568
    .line 569
    const v15, -0x41c7ae14    # -0.18f

    .line 570
    .line 571
    .line 572
    const v16, -0x40f851ec    # -0.53f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, -0x404b851f    # -1.41f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, -0x3fa70a3d    # -3.39f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x40ca3d71    # -0.71f

    .line 594
    .line 595
    .line 596
    const/16 v18, 0x0

    .line 597
    .line 598
    const v13, -0x41c7ae14    # -0.18f

    .line 599
    .line 600
    .line 601
    const v14, 0x3e3851ec    # 0.18f

    .line 602
    .line 603
    .line 604
    const/high16 v15, -0x41000000    # -0.5f

    .line 605
    .line 606
    const v16, 0x3e570a3d    # 0.21f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/16 v17, 0x0

    .line 613
    .line 614
    const v18, -0x40ca3d71    # -0.71f

    .line 615
    .line 616
    .line 617
    const v13, -0x41bd70a4    # -0.19f

    .line 618
    .line 619
    .line 620
    const v14, -0x41bd70a4    # -0.19f

    .line 621
    .line 622
    .line 623
    const v15, -0x41bd70a4    # -0.19f

    .line 624
    .line 625
    .line 626
    const v16, -0x40fd70a4    # -0.51f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x4121999a    # 10.1f

    .line 636
    .line 637
    .line 638
    const v2, 0x4113d70a    # 9.24f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, -0x3fa70a3d    # -3.39f

    .line 645
    .line 646
    .line 647
    const v2, 0x4058f5c3    # 3.39f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, -0x40ca3d71    # -0.71f

    .line 654
    .line 655
    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    const v13, -0x41c7ae14    # -0.18f

    .line 659
    .line 660
    .line 661
    const v14, 0x3e3851ec    # 0.18f

    .line 662
    .line 663
    .line 664
    const/high16 v15, -0x41000000    # -0.5f

    .line 665
    .line 666
    const v16, 0x3e570a3d    # 0.21f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const v18, -0x40ca3d71    # -0.71f

    .line 675
    .line 676
    .line 677
    const v13, -0x41bd70a4    # -0.19f

    .line 678
    .line 679
    .line 680
    const v14, -0x41b33333    # -0.2f

    .line 681
    .line 682
    .line 683
    const v15, -0x41bd70a4    # -0.19f

    .line 684
    .line 685
    .line 686
    const v16, -0x40fd70a4    # -0.51f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v0, 0x41066666    # 8.4f

    .line 693
    .line 694
    .line 695
    const v2, 0x411851ec    # 9.52f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x3fee147b    # 1.86f

    .line 702
    .line 703
    .line 704
    const v2, 0x3fef5c29    # 1.87f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x40628f5c    # 3.54f

    .line 711
    .line 712
    .line 713
    const/16 v18, 0x0

    .line 714
    .line 715
    const v13, 0x3f733333    # 0.95f

    .line 716
    .line 717
    .line 718
    const v14, 0x3f733333    # 0.95f

    .line 719
    .line 720
    .line 721
    const v15, 0x4025c28f    # 2.59f

    .line 722
    .line 723
    .line 724
    const v16, 0x3f70a3d7    # 0.94f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const v18, -0x3f9d70a4    # -3.54f

    .line 733
    .line 734
    .line 735
    const v13, 0x3f7ae148    # 0.98f

    .line 736
    .line 737
    .line 738
    const v14, -0x40851eb8    # -0.98f

    .line 739
    .line 740
    .line 741
    const v15, 0x3f7ae148    # 0.98f

    .line 742
    .line 743
    .line 744
    const v16, -0x3fdc28f6    # -2.56f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, -0x4011eb85    # -1.86f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, 0x3e8f5c29    # 0.28f

    .line 757
    .line 758
    .line 759
    const v2, -0x4170a3d7    # -0.28f

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v17, 0x40351eb8    # 2.83f

    .line 766
    .line 767
    .line 768
    const/16 v18, 0x0

    .line 769
    .line 770
    const v13, 0x3f47ae14    # 0.78f

    .line 771
    .line 772
    .line 773
    const v14, -0x40b851ec    # -0.78f

    .line 774
    .line 775
    .line 776
    const v15, 0x40033333    # 2.05f

    .line 777
    .line 778
    .line 779
    const v16, -0x40b851ec    # -0.78f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x4087ae14    # 4.24f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/16 v17, 0x0

    .line 792
    .line 793
    const v18, 0x40351eb8    # 2.83f

    .line 794
    .line 795
    .line 796
    const v14, 0x3f47ae14    # 0.78f

    .line 797
    .line 798
    .line 799
    const v15, 0x3f47ae14    # 0.78f

    .line 800
    .line 801
    .line 802
    const v16, 0x40033333    # 2.05f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v0, 0x419ecccd    # 19.85f

    .line 809
    .line 810
    .line 811
    const v2, 0x4143851f    # 12.22f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v0, 0x41511eb8    # 13.07f

    .line 821
    .line 822
    .line 823
    const v2, 0x41aea3d7    # 21.83f

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v18, -0x3f4ae148    # -5.66f

    .line 830
    .line 831
    .line 832
    const v13, 0x3fc7ae14    # 1.56f

    .line 833
    .line 834
    .line 835
    const v14, -0x403851ec    # -1.56f

    .line 836
    .line 837
    .line 838
    const v15, 0x3fc7ae14    # 1.56f

    .line 839
    .line 840
    .line 841
    const v16, -0x3f7d1eb8    # -4.09f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v0, -0x3f7851ec    # -4.24f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v17, -0x3f4ae148    # -5.66f

    .line 854
    .line 855
    .line 856
    const/16 v18, 0x0

    .line 857
    .line 858
    const v13, -0x403851ec    # -1.56f

    .line 859
    .line 860
    .line 861
    const v15, -0x3f7d1eb8    # -4.09f

    .line 862
    .line 863
    .line 864
    const v16, -0x403851ec    # -1.56f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, 0x3e8f5c29    # 0.28f

    .line 871
    .line 872
    .line 873
    const v2, -0x4170a3d7    # -0.28f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v0, -0x4170a3d7    # -0.28f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, 0x400ae148    # 2.17f

    .line 889
    .line 890
    .line 891
    const v2, 0x40d6b852    # 6.71f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v17, -0x41333333    # -0.4f

    .line 898
    .line 899
    .line 900
    const v18, 0x40a6147b    # 5.19f

    .line 901
    .line 902
    .line 903
    const v13, -0x404a3d71    # -1.42f

    .line 904
    .line 905
    .line 906
    const v14, 0x3fb5c28f    # 1.42f

    .line 907
    .line 908
    .line 909
    const v15, -0x4039999a    # -1.55f

    .line 910
    .line 911
    .line 912
    const v16, 0x406851ec    # 3.63f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const v0, 0x3fb9999a    # 1.45f

    .line 919
    .line 920
    .line 921
    const v2, -0x40466666    # -1.45f

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v17, 0x4065c28f    # 3.59f

    .line 928
    .line 929
    .line 930
    const v18, 0x4101eb85    # 8.12f

    .line 931
    .line 932
    .line 933
    const v13, 0x40351eb8    # 2.83f

    .line 934
    .line 935
    .line 936
    const v14, 0x411b3333    # 9.7f

    .line 937
    .line 938
    .line 939
    const v15, 0x403d70a4    # 2.96f

    .line 940
    .line 941
    .line 942
    const/high16 v16, 0x410c0000    # 8.75f

    .line 943
    .line 944
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v0, 0x40628f5c    # 3.54f

    .line 948
    .line 949
    .line 950
    const v2, -0x3f9d70a4    # -3.54f

    .line 951
    .line 952
    .line 953
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v17, 0x40351eb8    # 2.83f

    .line 957
    .line 958
    .line 959
    const/16 v18, 0x0

    .line 960
    .line 961
    const v13, 0x3f47ae14    # 0.78f

    .line 962
    .line 963
    .line 964
    const v14, -0x40b851ec    # -0.78f

    .line 965
    .line 966
    .line 967
    const v15, 0x40033333    # 2.05f

    .line 968
    .line 969
    .line 970
    const v16, -0x40b851ec    # -0.78f

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v0, 0x4063d70a    # 3.56f

    .line 977
    .line 978
    .line 979
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/16 v17, 0x0

    .line 983
    .line 984
    const v18, 0x3f35c28f    # 0.71f

    .line 985
    .line 986
    .line 987
    const v13, 0x3e3851ec    # 0.18f

    .line 988
    .line 989
    .line 990
    const v14, 0x3e3851ec    # 0.18f

    .line 991
    .line 992
    .line 993
    const v15, 0x3e570a3d    # 0.21f

    .line 994
    .line 995
    .line 996
    const/high16 v16, 0x3f000000    # 0.5f

    .line 997
    .line 998
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const v17, -0x40ca3d71    # -0.71f

    .line 1002
    .line 1003
    .line 1004
    const/16 v18, 0x0

    .line 1005
    .line 1006
    const v13, -0x41a8f5c3    # -0.21f

    .line 1007
    .line 1008
    .line 1009
    const v14, 0x3e570a3d    # 0.21f

    .line 1010
    .line 1011
    .line 1012
    const v15, -0x40f851ec    # -0.53f

    .line 1013
    .line 1014
    .line 1015
    const v16, 0x3e3851ec    # 0.18f

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, 0x40b23d71    # 5.57f

    .line 1022
    .line 1023
    .line 1024
    const v2, 0x411851ec    # 9.52f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v0, -0x3f466666    # -5.8f

    .line 1031
    .line 1032
    .line 1033
    const v2, 0x40b947ae    # 5.79f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const/16 v17, 0x0

    .line 1040
    .line 1041
    const v18, 0x40628f5c    # 3.54f

    .line 1042
    .line 1043
    .line 1044
    const v13, -0x40851eb8    # -0.98f

    .line 1045
    .line 1046
    .line 1047
    const v14, 0x3f7851ec    # 0.97f

    .line 1048
    .line 1049
    .line 1050
    const v15, -0x40851eb8    # -0.98f

    .line 1051
    .line 1052
    .line 1053
    const v16, 0x4023d70a    # 2.56f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v17, 0x3fb5c28f    # 1.42f

    .line 1060
    .line 1061
    .line 1062
    const v18, 0x3f333333    # 0.7f

    .line 1063
    .line 1064
    .line 1065
    const v13, 0x3ec7ae14    # 0.39f

    .line 1066
    .line 1067
    .line 1068
    const v14, 0x3ec7ae14    # 0.39f

    .line 1069
    .line 1070
    .line 1071
    const v15, 0x3f63d70a    # 0.89f

    .line 1072
    .line 1073
    .line 1074
    const v16, 0x3f2147ae    # 0.63f

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const v17, 0x3f333333    # 0.7f

    .line 1081
    .line 1082
    .line 1083
    const v18, 0x3fb5c28f    # 1.42f

    .line 1084
    .line 1085
    .line 1086
    const v13, 0x3d8f5c29    # 0.07f

    .line 1087
    .line 1088
    .line 1089
    const v14, 0x3f051eb8    # 0.52f

    .line 1090
    .line 1091
    .line 1092
    const v15, 0x3e99999a    # 0.3f

    .line 1093
    .line 1094
    .line 1095
    const v16, 0x3f828f5c    # 1.02f

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const v17, 0x3fb5c28f    # 1.42f

    .line 1102
    .line 1103
    .line 1104
    const v18, 0x3f333333    # 0.7f

    .line 1105
    .line 1106
    .line 1107
    const v13, 0x3ecccccd    # 0.4f

    .line 1108
    .line 1109
    .line 1110
    const v14, 0x3ecccccd    # 0.4f

    .line 1111
    .line 1112
    .line 1113
    const v15, 0x3f666666    # 0.9f

    .line 1114
    .line 1115
    .line 1116
    const v16, 0x3f2147ae    # 0.63f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const v17, 0x3f333333    # 0.7f

    .line 1123
    .line 1124
    .line 1125
    const v18, 0x3fb5c28f    # 1.42f

    .line 1126
    .line 1127
    .line 1128
    const v13, 0x3d8f5c29    # 0.07f

    .line 1129
    .line 1130
    .line 1131
    const v14, 0x3f051eb8    # 0.52f

    .line 1132
    .line 1133
    .line 1134
    const v15, 0x3e99999a    # 0.3f

    .line 1135
    .line 1136
    .line 1137
    const v16, 0x3f828f5c    # 1.02f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const v17, 0x3fb5c28f    # 1.42f

    .line 1144
    .line 1145
    .line 1146
    const v18, 0x3f333333    # 0.7f

    .line 1147
    .line 1148
    .line 1149
    const v13, 0x3ecccccd    # 0.4f

    .line 1150
    .line 1151
    .line 1152
    const v14, 0x3ecccccd    # 0.4f

    .line 1153
    .line 1154
    .line 1155
    const v15, 0x3f666666    # 0.9f

    .line 1156
    .line 1157
    .line 1158
    const v16, 0x3f2147ae    # 0.63f

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const v17, 0x3f333333    # 0.7f

    .line 1165
    .line 1166
    .line 1167
    const v18, 0x3fb5c28f    # 1.42f

    .line 1168
    .line 1169
    .line 1170
    const v13, 0x3d8f5c29    # 0.07f

    .line 1171
    .line 1172
    .line 1173
    const v14, 0x3f0a3d71    # 0.54f

    .line 1174
    .line 1175
    .line 1176
    const v15, 0x3e9eb852    # 0.31f

    .line 1177
    .line 1178
    .line 1179
    const v16, 0x3f83d70a    # 1.03f

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const v17, 0x3fe28f5c    # 1.77f

    .line 1186
    .line 1187
    .line 1188
    const v18, 0x3f3ae148    # 0.73f

    .line 1189
    .line 1190
    .line 1191
    const v13, 0x3ef0a3d7    # 0.47f

    .line 1192
    .line 1193
    .line 1194
    const v14, 0x3ef0a3d7    # 0.47f

    .line 1195
    .line 1196
    .line 1197
    const v15, 0x3f8ccccd    # 1.1f

    .line 1198
    .line 1199
    .line 1200
    const v16, 0x3f3ae148    # 0.73f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v18, -0x40c51eb8    # -0.73f

    .line 1207
    .line 1208
    .line 1209
    const v13, 0x3f2b851f    # 0.67f

    .line 1210
    .line 1211
    .line 1212
    const/4 v14, 0x0

    .line 1213
    const v15, 0x3fa66666    # 1.3f

    .line 1214
    .line 1215
    .line 1216
    const v16, -0x417ae148    # -0.26f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v0, 0x41511eb8    # 13.07f

    .line 1223
    .line 1224
    .line 1225
    const v2, 0x41aea3d7    # 21.83f

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v2

    .line 1238
    const/16 v16, 0x3800

    .line 1239
    .line 1240
    const/16 v17, 0x0

    .line 1241
    .line 1242
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1243
    .line 1244
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1245
    .line 1246
    const/4 v7, 0x0

    .line 1247
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1248
    .line 1249
    const/4 v13, 0x0

    .line 1250
    const/4 v15, 0x0

    .line 1251
    const-string v4, ""

    .line 1252
    .line 1253
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    sput-object v0, Landroidx/compose/material/icons/twotone/HandshakeKt;->_handshake:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1262
    .line 1263
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1264
    .line 1265
    .line 1266
    return-object v0
.end method

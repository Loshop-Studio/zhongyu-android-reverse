.class public final Landroidx/compose/material/icons/sharp/YardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _yard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getYard(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/YardKt;->_yard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Yard"

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
    const/high16 v4, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41a00000    # 20.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x40000000    # 2.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41000000    # 8.0f

    .line 99
    .line 100
    const v6, 0x4103851f    # 8.22f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x3fc7ae14    # 1.56f

    .line 107
    .line 108
    .line 109
    const v26, -0x403851ec    # -1.56f

    .line 110
    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    const v22, -0x40a3d70a    # -0.86f

    .line 115
    .line 116
    .line 117
    const v23, 0x3f333333    # 0.7f

    .line 118
    .line 119
    .line 120
    const v24, -0x403851ec    # -1.56f

    .line 121
    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, 0x3f63d70a    # 0.89f

    .line 129
    .line 130
    .line 131
    const v26, 0x3e8f5c29    # 0.28f

    .line 132
    .line 133
    .line 134
    const v21, 0x3ea8f5c3    # 0.33f

    .line 135
    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    const v23, 0x3f23d70a    # 0.64f

    .line 140
    .line 141
    .line 142
    const v24, 0x3dcccccd    # 0.1f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, -0x420a3d71    # -0.12f

    .line 149
    .line 150
    .line 151
    const v6, -0x43dc28f6    # -0.01f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v25, 0x3fc7ae14    # 1.56f

    .line 158
    .line 159
    .line 160
    const v26, -0x403851ec    # -1.56f

    .line 161
    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const v22, -0x40a3d70a    # -0.86f

    .line 166
    .line 167
    .line 168
    const v23, 0x3f333333    # 0.7f

    .line 169
    .line 170
    .line 171
    const v24, -0x403851ec    # -1.56f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x3f333333    # 0.7f

    .line 178
    .line 179
    .line 180
    const v6, 0x3fc7ae14    # 1.56f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x3df5c28f    # 0.12f

    .line 187
    .line 188
    .line 189
    const v6, -0x43dc28f6    # -0.01f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, 0x3f63d70a    # 0.89f

    .line 196
    .line 197
    .line 198
    const v26, -0x4170a3d7    # -0.28f

    .line 199
    .line 200
    .line 201
    const v21, 0x3e851eb8    # 0.26f

    .line 202
    .line 203
    .line 204
    const v22, -0x41c7ae14    # -0.18f

    .line 205
    .line 206
    .line 207
    const v23, 0x3f0f5c29    # 0.56f

    .line 208
    .line 209
    .line 210
    const v24, -0x4170a3d7    # -0.28f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x3fc7ae14    # 1.56f

    .line 217
    .line 218
    .line 219
    const v26, 0x3fc7ae14    # 1.56f

    .line 220
    .line 221
    .line 222
    const v21, 0x3f5c28f6    # 0.86f

    .line 223
    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const v23, 0x3fc7ae14    # 1.56f

    .line 228
    .line 229
    .line 230
    const v24, 0x3f333333    # 0.7f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v25, -0x409c28f6    # -0.89f

    .line 237
    .line 238
    .line 239
    const v26, 0x3fb33333    # 1.4f

    .line 240
    .line 241
    .line 242
    const/16 v21, 0x0

    .line 243
    .line 244
    const v22, 0x3f1eb852    # 0.62f

    .line 245
    .line 246
    .line 247
    const v23, -0x41428f5c    # -0.37f

    .line 248
    .line 249
    .line 250
    const v24, 0x3f947ae1    # 1.16f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, 0x41800000    # 16.0f

    .line 257
    .line 258
    const v26, 0x41307ae1    # 11.03f

    .line 259
    .line 260
    .line 261
    const v21, 0x417a147b    # 15.63f

    .line 262
    .line 263
    .line 264
    const v22, 0x411deb85    # 9.87f

    .line 265
    .line 266
    .line 267
    const/high16 v23, 0x41800000    # 16.0f

    .line 268
    .line 269
    const v24, 0x41268f5c    # 10.41f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, -0x403851ec    # -1.56f

    .line 276
    .line 277
    .line 278
    const v26, 0x3fc7ae14    # 1.56f

    .line 279
    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const v22, 0x3f5c28f6    # 0.86f

    .line 284
    .line 285
    .line 286
    const v23, -0x40cccccd    # -0.7f

    .line 287
    .line 288
    .line 289
    const v24, 0x3fc7ae14    # 1.56f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, -0x409c28f6    # -0.89f

    .line 296
    .line 297
    .line 298
    const v26, -0x4170a3d7    # -0.28f

    .line 299
    .line 300
    .line 301
    const v21, -0x41570a3d    # -0.33f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const v23, -0x40dc28f6    # -0.64f

    .line 307
    .line 308
    .line 309
    const v24, -0x421eb852    # -0.11f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x3c23d70a    # 0.01f

    .line 316
    .line 317
    .line 318
    const v6, 0x3df5c28f    # 0.12f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v25, -0x403851ec    # -1.56f

    .line 325
    .line 326
    .line 327
    const v26, 0x3fc7ae14    # 1.56f

    .line 328
    .line 329
    .line 330
    const/16 v21, 0x0

    .line 331
    .line 332
    const v22, 0x3f5c28f6    # 0.86f

    .line 333
    .line 334
    .line 335
    const v23, -0x40cccccd    # -0.7f

    .line 336
    .line 337
    .line 338
    const v24, 0x3fc7ae14    # 1.56f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, -0x40cccccd    # -0.7f

    .line 345
    .line 346
    .line 347
    const v6, -0x403851ec    # -1.56f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, 0x3c23d70a    # 0.01f

    .line 354
    .line 355
    .line 356
    const v6, -0x420a3d71    # -0.12f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, -0x409c28f6    # -0.89f

    .line 363
    .line 364
    .line 365
    const v26, 0x3e8f5c29    # 0.28f

    .line 366
    .line 367
    .line 368
    const v21, -0x417ae148    # -0.26f

    .line 369
    .line 370
    .line 371
    const v22, 0x3e3851ec    # 0.18f

    .line 372
    .line 373
    .line 374
    const v23, -0x40f0a3d7    # -0.56f

    .line 375
    .line 376
    .line 377
    const v24, 0x3e8f5c29    # 0.28f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v25, 0x41000000    # 8.0f

    .line 384
    .line 385
    const v26, 0x41307ae1    # 11.03f

    .line 386
    .line 387
    .line 388
    const v21, 0x410b3333    # 8.7f

    .line 389
    .line 390
    .line 391
    const v22, 0x414970a4    # 12.59f

    .line 392
    .line 393
    .line 394
    const/high16 v23, 0x41000000    # 8.0f

    .line 395
    .line 396
    const v24, 0x413e3d71    # 11.89f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v25, 0x3f63d70a    # 0.89f

    .line 403
    .line 404
    .line 405
    const v26, -0x404ccccd    # -1.4f

    .line 406
    .line 407
    .line 408
    const/16 v21, 0x0

    .line 409
    .line 410
    const v22, -0x40e147ae    # -0.62f

    .line 411
    .line 412
    .line 413
    const v23, 0x3ebd70a4    # 0.37f

    .line 414
    .line 415
    .line 416
    const v24, -0x406b851f    # -1.16f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v25, 0x41000000    # 8.0f

    .line 423
    .line 424
    const v26, 0x4103851f    # 8.22f

    .line 425
    .line 426
    .line 427
    const v21, 0x4105eb85    # 8.37f

    .line 428
    .line 429
    .line 430
    const v22, 0x4116147b    # 9.38f

    .line 431
    .line 432
    .line 433
    const/high16 v23, 0x41000000    # 8.0f

    .line 434
    .line 435
    const v24, 0x410d70a4    # 8.84f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v4, 0x41980000    # 19.0f

    .line 445
    .line 446
    const/high16 v6, 0x41400000    # 12.0f

    .line 447
    .line 448
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v25, -0x3f400000    # -6.0f

    .line 452
    .line 453
    const/high16 v26, -0x3f400000    # -6.0f

    .line 454
    .line 455
    const v21, -0x3fac28f6    # -3.31f

    .line 456
    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    const/high16 v23, -0x3f400000    # -6.0f

    .line 461
    .line 462
    const v24, -0x3fd3d70a    # -2.69f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v25, 0x41400000    # 12.0f

    .line 469
    .line 470
    const/high16 v26, 0x41980000    # 19.0f

    .line 471
    .line 472
    const v21, 0x4114f5c3    # 9.31f

    .line 473
    .line 474
    .line 475
    const/high16 v22, 0x41500000    # 13.0f

    .line 476
    .line 477
    const/high16 v23, 0x41400000    # 12.0f

    .line 478
    .line 479
    const v24, 0x417b0a3d    # 15.69f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v25, 0x40c00000    # 6.0f

    .line 486
    .line 487
    const/high16 v26, -0x3f400000    # -6.0f

    .line 488
    .line 489
    const/16 v21, 0x0

    .line 490
    .line 491
    const v22, -0x3fac28f6    # -3.31f

    .line 492
    .line 493
    .line 494
    const v23, 0x402c28f6    # 2.69f

    .line 495
    .line 496
    .line 497
    const/high16 v24, -0x3f400000    # -6.0f

    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v25, 0x41400000    # 12.0f

    .line 503
    .line 504
    const/high16 v26, 0x41980000    # 19.0f

    .line 505
    .line 506
    const/high16 v21, 0x41900000    # 18.0f

    .line 507
    .line 508
    const v22, 0x41827ae1    # 16.31f

    .line 509
    .line 510
    .line 511
    const v23, 0x4174f5c3    # 15.31f

    .line 512
    .line 513
    .line 514
    const/high16 v24, 0x41980000    # 19.0f

    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    const/16 v16, 0x3800

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const/high16 v6, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/high16 v8, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const/high16 v9, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/high16 v12, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/4 v14, 0x0

    .line 541
    const/4 v15, 0x0

    .line 542
    const-string v4, ""

    .line 543
    .line 544
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 545
    .line 546
    .line 547
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 552
    .line 553
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 554
    .line 555
    .line 556
    move-result-wide v6

    .line 557
    const/4 v0, 0x0

    .line 558
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 562
    .line 563
    .line 564
    move-result v10

    .line 565
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 566
    .line 567
    .line 568
    move-result v11

    .line 569
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 572
    .line 573
    .line 574
    const v0, 0x4119eb85    # 9.62f

    .line 575
    .line 576
    .line 577
    const/high16 v2, 0x41400000    # 12.0f

    .line 578
    .line 579
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/4 v0, 0x0

    .line 583
    const v2, -0x403851ec    # -1.56f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v18, 0x4047ae14    # 3.12f

    .line 590
    .line 591
    .line 592
    const/16 v19, 0x0

    .line 593
    .line 594
    const v13, 0x3fc7ae14    # 1.56f

    .line 595
    .line 596
    .line 597
    const v14, 0x3fc7ae14    # 1.56f

    .line 598
    .line 599
    .line 600
    const/16 v16, 0x1

    .line 601
    .line 602
    const/16 v17, 0x1

    .line 603
    .line 604
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v18, -0x3fb851ec    # -3.12f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/16 v16, 0x3800

    .line 618
    .line 619
    const/16 v17, 0x0

    .line 620
    .line 621
    const/high16 v6, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v7, 0x0

    .line 624
    const/high16 v12, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const/4 v14, 0x0

    .line 628
    const-string v4, ""

    .line 629
    .line 630
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    sput-object v0, Landroidx/compose/material/icons/sharp/YardKt;->_yard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    return-object v0
.end method

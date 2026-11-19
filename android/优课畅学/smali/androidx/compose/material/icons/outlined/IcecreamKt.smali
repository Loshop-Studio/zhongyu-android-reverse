.class public final Landroidx/compose/material/icons/outlined/IcecreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _icecream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIcecream(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Icecream"

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
    const v0, 0x41930a3d    # 18.38f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c7ae14    # 6.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v13, 0x418e51ec    # 17.79f

    .line 84
    .line 85
    .line 86
    const v14, 0x404f5c29    # 3.24f

    .line 87
    .line 88
    .line 89
    const v15, 0x41723d71    # 15.14f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x404f5c29    # 3.24f

    .line 98
    .line 99
    .line 100
    const v2, 0x40b3d70a    # 5.62f

    .line 101
    .line 102
    .line 103
    const v4, 0x40c7ae14    # 6.24f

    .line 104
    .line 105
    .line 106
    const v6, 0x40c6b852    # 6.21f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, 0x40400000    # 3.0f

    .line 113
    .line 114
    const/high16 v18, 0x41200000    # 10.0f

    .line 115
    .line 116
    const v13, 0x40828f5c    # 4.08f

    .line 117
    .line 118
    .line 119
    const v14, 0x40d9eb85    # 6.81f

    .line 120
    .line 121
    .line 122
    const/high16 v15, 0x40400000    # 3.0f

    .line 123
    .line 124
    const v16, 0x4104a3d7    # 8.29f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40800000    # 4.0f

    .line 131
    .line 132
    const/high16 v18, 0x40800000    # 4.0f

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, 0x400d70a4    # 2.21f

    .line 136
    .line 137
    .line 138
    const v15, 0x3fe51eb8    # 1.79f

    .line 139
    .line 140
    .line 141
    const/high16 v16, 0x40800000    # 4.0f

    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3eae147b    # 0.34f

    .line 147
    .line 148
    .line 149
    const v18, -0x435c28f6    # -0.02f

    .line 150
    .line 151
    .line 152
    const v13, 0x3df5c28f    # 0.12f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x3e6b851f    # 0.23f

    .line 157
    .line 158
    .line 159
    const v16, -0x435c28f6    # -0.02f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x41411eb8    # 12.07f

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x41b80000    # 23.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x4093851f    # 4.61f

    .line 174
    .line 175
    .line 176
    const v2, -0x3eef851f    # -9.03f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x41880000    # 17.0f

    .line 183
    .line 184
    const/high16 v18, 0x41600000    # 14.0f

    .line 185
    .line 186
    const v13, 0x418651ec    # 16.79f

    .line 187
    .line 188
    .line 189
    const v14, 0x415fae14    # 13.98f

    .line 190
    .line 191
    .line 192
    const v15, 0x41871eb8    # 16.89f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x41600000    # 14.0f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x40800000    # 4.0f

    .line 201
    .line 202
    const/high16 v18, -0x3f800000    # -4.0f

    .line 203
    .line 204
    const v13, 0x400d70a4    # 2.21f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/high16 v15, 0x40800000    # 4.0f

    .line 209
    .line 210
    const v16, -0x401ae148    # -1.79f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x41930a3d    # 18.38f

    .line 217
    .line 218
    .line 219
    const v18, 0x40c7ae14    # 6.24f

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x41a80000    # 21.0f

    .line 223
    .line 224
    const v14, 0x4104a3d7    # 8.29f

    .line 225
    .line 226
    .line 227
    const v15, 0x419f5c29    # 19.92f

    .line 228
    .line 229
    .line 230
    const v16, 0x40d9eb85    # 6.81f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x41950a3d    # 18.63f

    .line 240
    .line 241
    .line 242
    const v2, 0x4140cccd    # 12.05f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, -0x3fd147ae    # -2.73f

    .line 249
    .line 250
    .line 251
    const v2, -0x3f5947ae    # -5.21f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41400000    # 12.0f

    .line 258
    .line 259
    const/high16 v18, 0x41600000    # 14.0f

    .line 260
    .line 261
    const v13, 0x41226666    # 10.15f

    .line 262
    .line 263
    .line 264
    const v14, 0x415ca3d7    # 13.79f

    .line 265
    .line 266
    .line 267
    const v15, 0x4130f5c3    # 11.06f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x41600000    # 14.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x402e147b    # 2.72f

    .line 276
    .line 277
    .line 278
    const v18, -0x40e66666    # -0.6f

    .line 279
    .line 280
    .line 281
    const v13, 0x3f733333    # 0.95f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x3ff0a3d7    # 1.88f

    .line 286
    .line 287
    .line 288
    const v16, -0x41a8f5c3    # -0.21f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x41950a3d    # 18.63f

    .line 295
    .line 296
    .line 297
    const v2, 0x4140cccd    # 12.05f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41880000    # 17.0f

    .line 307
    .line 308
    const/high16 v2, 0x41400000    # 12.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x404e147b    # -1.39f

    .line 314
    .line 315
    .line 316
    const v18, -0x40f0a3d7    # -0.56f

    .line 317
    .line 318
    .line 319
    const v13, -0x40fae148    # -0.52f

    .line 320
    .line 321
    .line 322
    const v15, -0x407eb852    # -1.01f

    .line 323
    .line 324
    .line 325
    const v16, -0x41b33333    # -0.2f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x40f5c28f    # -0.54f

    .line 332
    .line 333
    .line 334
    const v2, -0x40f0a3d7    # -0.56f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x40d70a3d    # -0.66f

    .line 341
    .line 342
    .line 343
    const v2, 0x3ed70a3d    # 0.42f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41400000    # 12.0f

    .line 350
    .line 351
    const/high16 v18, 0x41400000    # 12.0f

    .line 352
    .line 353
    const v13, 0x415ae148    # 13.68f

    .line 354
    .line 355
    .line 356
    const v14, 0x413c28f6    # 11.76f

    .line 357
    .line 358
    .line 359
    const v15, 0x414dc28f    # 12.86f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x41400000    # 12.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3fe70a3d    # -2.39f

    .line 368
    .line 369
    .line 370
    const v2, -0x40cf5c29    # -0.69f

    .line 371
    .line 372
    .line 373
    const v4, -0x4028f5c3    # -1.68f

    .line 374
    .line 375
    .line 376
    const v6, -0x418a3d71    # -0.24f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x410f3333    # 8.95f

    .line 383
    .line 384
    .line 385
    const v2, 0x412e6666    # 10.9f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3f0a3d71    # 0.54f

    .line 392
    .line 393
    .line 394
    const v2, -0x40f0a3d7    # -0.56f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x40e00000    # 7.0f

    .line 401
    .line 402
    const v13, 0x410028f6    # 8.01f

    .line 403
    .line 404
    .line 405
    const v14, 0x413ca3d7    # 11.79f

    .line 406
    .line 407
    .line 408
    const v15, 0x40f0a3d7    # 7.52f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, -0x40000000    # -2.0f

    .line 415
    .line 416
    const/high16 v18, -0x40000000    # -2.0f

    .line 417
    .line 418
    const v13, -0x40733333    # -1.1f

    .line 419
    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const/high16 v15, -0x40000000    # -2.0f

    .line 423
    .line 424
    const v16, -0x409c28f6    # -0.89f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3fd70a3d    # 1.68f

    .line 431
    .line 432
    .line 433
    const v18, -0x4003d70a    # -1.97f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x40851eb8    # -0.98f

    .line 438
    .line 439
    .line 440
    const v15, 0x3f3851ec    # 0.72f

    .line 441
    .line 442
    .line 443
    const v16, -0x40170a3d    # -1.82f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x40ee6666    # 7.45f

    .line 450
    .line 451
    .line 452
    const v2, 0x40fccccd    # 7.9f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x40b851ec    # -0.78f

    .line 459
    .line 460
    .line 461
    const v2, 0x3d75c28f    # 0.06f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41400000    # 12.0f

    .line 468
    .line 469
    const/high16 v18, 0x40400000    # 3.0f

    .line 470
    .line 471
    const v13, 0x40f6b852    # 7.71f

    .line 472
    .line 473
    .line 474
    const v14, 0x4099999a    # 4.8f

    .line 475
    .line 476
    .line 477
    const v15, 0x411a8f5c    # 9.66f

    .line 478
    .line 479
    .line 480
    const/high16 v16, 0x40400000    # 3.0f

    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x408f5c29    # 4.48f

    .line 486
    .line 487
    .line 488
    const v2, 0x4083d70a    # 4.12f

    .line 489
    .line 490
    .line 491
    const v4, 0x408947ae    # 4.29f

    .line 492
    .line 493
    .line 494
    const v6, 0x3fe66666    # 1.8f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x3f47ae14    # 0.78f

    .line 501
    .line 502
    .line 503
    const v2, 0x3d75c28f    # 0.06f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x3f451eb8    # 0.77f

    .line 510
    .line 511
    .line 512
    const v2, 0x3df5c28f    # 0.12f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x41980000    # 19.0f

    .line 519
    .line 520
    const/high16 v18, 0x41200000    # 10.0f

    .line 521
    .line 522
    const v13, 0x41923d71    # 18.28f

    .line 523
    .line 524
    .line 525
    const v14, 0x4102e148    # 8.18f

    .line 526
    .line 527
    .line 528
    const/high16 v15, 0x41980000    # 19.0f

    .line 529
    .line 530
    const v16, 0x411028f6    # 9.01f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41880000    # 17.0f

    .line 537
    .line 538
    const/high16 v18, 0x41400000    # 12.0f

    .line 539
    .line 540
    const/high16 v13, 0x41980000    # 19.0f

    .line 541
    .line 542
    const v14, 0x4131999a    # 11.1f

    .line 543
    .line 544
    .line 545
    const v15, 0x4190cccd    # 18.1f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x41400000    # 12.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/16 v16, 0x3800

    .line 561
    .line 562
    const/16 v17, 0x0

    .line 563
    .line 564
    const/high16 v6, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v8, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v7, 0x0

    .line 569
    const/high16 v9, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v12, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const-string v4, ""

    .line 577
    .line 578
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    sput-object v0, Landroidx/compose/material/icons/outlined/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/MapsUgcKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMapsUgc(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MapsUgcKt;->_mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MapsUgc"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, 0x408d1eb8    # 4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x41000000    # 8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, -0x3f000000    # -8.0f

    .line 97
    .line 98
    const v6, -0x3f9a3d71    # -3.59f

    .line 99
    .line 100
    .line 101
    const/high16 v7, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, -0x3fa47ae1    # -3.43f

    .line 107
    .line 108
    .line 109
    const v26, -0x40b851ec    # -0.78f

    .line 110
    .line 111
    .line 112
    const v21, -0x4068f5c3    # -1.18f

    .line 113
    .line 114
    .line 115
    const v23, -0x3fea3d71    # -2.34f

    .line 116
    .line 117
    .line 118
    const v24, -0x417ae148    # -0.26f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v25, -0x40a3d70a    # -0.86f

    .line 125
    .line 126
    .line 127
    const v26, -0x41bd70a4    # -0.19f

    .line 128
    .line 129
    .line 130
    const v21, -0x4175c28f    # -0.27f

    .line 131
    .line 132
    .line 133
    const v22, -0x41fae148    # -0.13f

    .line 134
    .line 135
    .line 136
    const v23, -0x40f0a3d7    # -0.56f

    .line 137
    .line 138
    .line 139
    const v24, -0x41bd70a4    # -0.19f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v25, -0x40f0a3d7    # -0.56f

    .line 146
    .line 147
    .line 148
    const v26, 0x3da3d70a    # 0.08f

    .line 149
    .line 150
    .line 151
    const v21, -0x41bd70a4    # -0.19f

    .line 152
    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const v23, -0x413d70a4    # -0.38f

    .line 157
    .line 158
    .line 159
    const v24, 0x3cf5c28f    # 0.03f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, 0x3f70a3d7    # 0.94f

    .line 166
    .line 167
    .line 168
    const v6, -0x3fb33333    # -3.2f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, -0x421eb852    # -0.11f

    .line 178
    .line 179
    .line 180
    const v26, -0x404a3d71    # -1.42f

    .line 181
    .line 182
    .line 183
    const v21, 0x3e0f5c29    # 0.14f

    .line 184
    .line 185
    .line 186
    const v22, -0x410f5c29    # -0.47f

    .line 187
    .line 188
    .line 189
    const v23, 0x3dcccccd    # 0.1f

    .line 190
    .line 191
    .line 192
    const v24, -0x40851eb8    # -0.98f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x40800000    # 4.0f

    .line 199
    .line 200
    const/high16 v26, 0x41400000    # 12.0f

    .line 201
    .line 202
    const v21, 0x408851ec    # 4.26f

    .line 203
    .line 204
    .line 205
    const v22, 0x416570a4    # 14.34f

    .line 206
    .line 207
    .line 208
    const/high16 v23, 0x40800000    # 4.0f

    .line 209
    .line 210
    const v24, 0x4152e148    # 13.18f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x41400000    # 12.0f

    .line 217
    .line 218
    const/high16 v26, 0x40800000    # 4.0f

    .line 219
    .line 220
    const/high16 v21, 0x40800000    # 4.0f

    .line 221
    .line 222
    const v22, 0x40f2e148    # 7.59f

    .line 223
    .line 224
    .line 225
    const v23, 0x40f2e148    # 7.59f

    .line 226
    .line 227
    .line 228
    const/high16 v24, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const/16 v16, 0x3800

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const v6, 0x3e99999a    # 0.3f

    .line 242
    .line 243
    .line 244
    const/high16 v8, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const-string v4, ""

    .line 255
    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x40800000    # 4.0f

    .line 287
    .line 288
    const/high16 v6, 0x41400000    # 12.0f

    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v25, 0x41000000    # 8.0f

    .line 294
    .line 295
    const/high16 v26, 0x41000000    # 8.0f

    .line 296
    .line 297
    const v21, 0x408d1eb8    # 4.41f

    .line 298
    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    const/high16 v23, 0x41000000    # 8.0f

    .line 303
    .line 304
    const v24, 0x4065c28f    # 3.59f

    .line 305
    .line 306
    .line 307
    move-object/from16 v20, v2

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, -0x3f000000    # -8.0f

    .line 313
    .line 314
    const v6, -0x3f9a3d71    # -3.59f

    .line 315
    .line 316
    .line 317
    const/high16 v7, 0x41000000    # 8.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v25, -0x3fa47ae1    # -3.43f

    .line 323
    .line 324
    .line 325
    const v26, -0x40b851ec    # -0.78f

    .line 326
    .line 327
    .line 328
    const v21, -0x4068f5c3    # -1.18f

    .line 329
    .line 330
    .line 331
    const v23, -0x3fea3d71    # -2.34f

    .line 332
    .line 333
    .line 334
    const v24, -0x417ae148    # -0.26f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v25, -0x40a3d70a    # -0.86f

    .line 341
    .line 342
    .line 343
    const v26, -0x41bd70a4    # -0.19f

    .line 344
    .line 345
    .line 346
    const v21, -0x4175c28f    # -0.27f

    .line 347
    .line 348
    .line 349
    const v22, -0x41fae148    # -0.13f

    .line 350
    .line 351
    .line 352
    const v23, -0x40f0a3d7    # -0.56f

    .line 353
    .line 354
    .line 355
    const v24, -0x41bd70a4    # -0.19f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v25, -0x40f0a3d7    # -0.56f

    .line 362
    .line 363
    .line 364
    const v26, 0x3da3d70a    # 0.08f

    .line 365
    .line 366
    .line 367
    const v21, -0x41bd70a4    # -0.19f

    .line 368
    .line 369
    .line 370
    const/16 v22, 0x0

    .line 371
    .line 372
    const v23, -0x413d70a4    # -0.38f

    .line 373
    .line 374
    .line 375
    const v24, 0x3cf5c28f    # 0.03f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x3f70a3d7    # 0.94f

    .line 382
    .line 383
    .line 384
    const v6, -0x3fb33333    # -3.2f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, -0x421eb852    # -0.11f

    .line 394
    .line 395
    .line 396
    const v26, -0x404a3d71    # -1.42f

    .line 397
    .line 398
    .line 399
    const v21, 0x3e0f5c29    # 0.14f

    .line 400
    .line 401
    .line 402
    const v22, -0x410f5c29    # -0.47f

    .line 403
    .line 404
    .line 405
    const v23, 0x3dcccccd    # 0.1f

    .line 406
    .line 407
    .line 408
    const v24, -0x40851eb8    # -0.98f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v25, 0x40800000    # 4.0f

    .line 415
    .line 416
    const/high16 v26, 0x41400000    # 12.0f

    .line 417
    .line 418
    const v21, 0x408851ec    # 4.26f

    .line 419
    .line 420
    .line 421
    const v22, 0x416570a4    # 14.34f

    .line 422
    .line 423
    .line 424
    const/high16 v23, 0x40800000    # 4.0f

    .line 425
    .line 426
    const v24, 0x4152e148    # 13.18f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v25, 0x41400000    # 12.0f

    .line 433
    .line 434
    const/high16 v26, 0x40800000    # 4.0f

    .line 435
    .line 436
    const/high16 v21, 0x40800000    # 4.0f

    .line 437
    .line 438
    const v22, 0x40f2e148    # 7.59f

    .line 439
    .line 440
    .line 441
    const v23, 0x40f2e148    # 7.59f

    .line 442
    .line 443
    .line 444
    const/high16 v24, 0x40800000    # 4.0f

    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x40000000    # 2.0f

    .line 450
    .line 451
    const/high16 v6, 0x41400000    # 12.0f

    .line 452
    .line 453
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, 0x40000000    # 2.0f

    .line 457
    .line 458
    const/high16 v26, 0x41400000    # 12.0f

    .line 459
    .line 460
    const v21, 0x40cf5c29    # 6.48f

    .line 461
    .line 462
    .line 463
    const/high16 v22, 0x40000000    # 2.0f

    .line 464
    .line 465
    const/high16 v23, 0x40000000    # 2.0f

    .line 466
    .line 467
    const v24, 0x40cf5c29    # 6.48f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v25, 0x3f7851ec    # 0.97f

    .line 474
    .line 475
    .line 476
    const v26, 0x408947ae    # 4.29f

    .line 477
    .line 478
    .line 479
    const/16 v21, 0x0

    .line 480
    .line 481
    const v22, 0x3fc51eb8    # 1.54f

    .line 482
    .line 483
    .line 484
    const v23, 0x3eb851ec    # 0.36f

    .line 485
    .line 486
    .line 487
    const v24, 0x403eb852    # 2.98f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v6, 0x41b80000    # 23.0f

    .line 496
    .line 497
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v4, 0x40d6b852    # 6.71f

    .line 501
    .line 502
    .line 503
    const v6, -0x4003d70a    # -1.97f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, 0x41400000    # 12.0f

    .line 510
    .line 511
    const/high16 v26, 0x41b00000    # 22.0f

    .line 512
    .line 513
    const v21, 0x411051ec    # 9.02f

    .line 514
    .line 515
    .line 516
    const v22, 0x41ad1eb8    # 21.64f

    .line 517
    .line 518
    .line 519
    const v23, 0x41275c29    # 10.46f

    .line 520
    .line 521
    .line 522
    const/high16 v24, 0x41b00000    # 22.0f

    .line 523
    .line 524
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v25, 0x41200000    # 10.0f

    .line 528
    .line 529
    const/high16 v26, -0x3ee00000    # -10.0f

    .line 530
    .line 531
    const v21, 0x40b0a3d7    # 5.52f

    .line 532
    .line 533
    .line 534
    const/16 v22, 0x0

    .line 535
    .line 536
    const/high16 v23, 0x41200000    # 10.0f

    .line 537
    .line 538
    const v24, -0x3f70a3d7    # -4.48f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v25, 0x41400000    # 12.0f

    .line 545
    .line 546
    const/high16 v26, 0x40000000    # 2.0f

    .line 547
    .line 548
    const/high16 v21, 0x41b00000    # 22.0f

    .line 549
    .line 550
    const v22, 0x40cf5c29    # 6.48f

    .line 551
    .line 552
    .line 553
    const v23, 0x418c28f6    # 17.52f

    .line 554
    .line 555
    .line 556
    const/high16 v24, 0x40000000    # 2.0f

    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x40000000    # 2.0f

    .line 562
    .line 563
    const/high16 v6, 0x41400000    # 12.0f

    .line 564
    .line 565
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const/high16 v6, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    const-string v4, ""

    .line 579
    .line 580
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 581
    .line 582
    .line 583
    sget-object v2, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 590
    .line 591
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 592
    .line 593
    .line 594
    move-result-wide v6

    .line 595
    const/4 v0, 0x0

    .line 596
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 600
    .line 601
    .line 602
    move-result v10

    .line 603
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 604
    .line 605
    .line 606
    move-result v11

    .line 607
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 610
    .line 611
    .line 612
    const/high16 v2, 0x41500000    # 13.0f

    .line 613
    .line 614
    const/high16 v4, 0x41000000    # 8.0f

    .line 615
    .line 616
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v2, -0x40000000    # -2.0f

    .line 620
    .line 621
    const/4 v4, 0x0

    .line 622
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v2, 0x40400000    # 3.0f

    .line 626
    .line 627
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 631
    .line 632
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v2, 0x40000000    # 2.0f

    .line 636
    .line 637
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v2, 0x40400000    # 3.0f

    .line 641
    .line 642
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v2, 0x40000000    # 2.0f

    .line 649
    .line 650
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 654
    .line 655
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v2, 0x40400000    # 3.0f

    .line 659
    .line 660
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v2, -0x40000000    # -2.0f

    .line 664
    .line 665
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 669
    .line 670
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    const/high16 v6, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v7, 0x0

    .line 683
    const-string v4, ""

    .line 684
    .line 685
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    sput-object v0, Landroidx/compose/material/icons/twotone/MapsUgcKt;->_mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/PixKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pix:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPix(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PixKt;->_pix:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Pix"

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
    const v4, 0x41773333    # 15.45f

    .line 71
    .line 72
    .line 73
    const v6, 0x418428f6    # 16.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fbf5c29    # -3.01f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, -0x416147ae    # -0.31f

    .line 86
    .line 87
    .line 88
    const v26, -0x41fae148    # -0.13f

    .line 89
    .line 90
    .line 91
    const v21, -0x421eb852    # -0.11f

    .line 92
    .line 93
    .line 94
    const v22, -0x421eb852    # -0.11f

    .line 95
    .line 96
    .line 97
    const v23, -0x418a3d71    # -0.24f

    .line 98
    .line 99
    .line 100
    const v24, -0x41fae148    # -0.13f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, -0x416147ae    # -0.31f

    .line 109
    .line 110
    .line 111
    const v6, 0x3e051eb8    # 0.13f

    .line 112
    .line 113
    .line 114
    const v7, -0x41b33333    # -0.2f

    .line 115
    .line 116
    .line 117
    const v8, 0x3ca3d70a    # 0.02f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x41843d71    # 16.53f

    .line 124
    .line 125
    .line 126
    const v6, 0x410ccccd    # 8.8f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, -0x3fd70a3d    # -2.64f

    .line 133
    .line 134
    .line 135
    const v26, 0x3f63d70a    # 0.89f

    .line 136
    .line 137
    .line 138
    const v21, -0x4151eb85    # -0.34f

    .line 139
    .line 140
    .line 141
    const v22, 0x3eae147b    # 0.34f

    .line 142
    .line 143
    .line 144
    const v23, -0x40a147ae    # -0.87f

    .line 145
    .line 146
    .line 147
    const v24, 0x3f63d70a    # 0.89f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x406d70a4    # 3.71f

    .line 154
    .line 155
    .line 156
    const v6, 0x406ccccd    # 3.7f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v25, 0x4087ae14    # 4.24f

    .line 163
    .line 164
    .line 165
    const/16 v26, 0x0

    .line 166
    .line 167
    const v21, 0x3f95c28f    # 1.17f

    .line 168
    .line 169
    .line 170
    const v22, 0x3f95c28f    # 1.17f

    .line 171
    .line 172
    .line 173
    const v23, 0x40447ae1    # 3.07f

    .line 174
    .line 175
    .line 176
    const v24, 0x3f95c28f    # 1.17f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x406e147b    # 3.72f

    .line 183
    .line 184
    .line 185
    const v6, -0x3f928f5c    # -3.71f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x41773333    # 15.45f

    .line 192
    .line 193
    .line 194
    const v26, 0x418428f6    # 16.52f

    .line 195
    .line 196
    .line 197
    const v21, 0x41875c29    # 16.92f

    .line 198
    .line 199
    .line 200
    const v22, 0x418b47ae    # 17.41f

    .line 201
    .line 202
    .line 203
    const v23, 0x418147ae    # 16.16f

    .line 204
    .line 205
    .line 206
    const v24, 0x4189d70a    # 17.23f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const/16 v16, 0x3800

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/high16 v6, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v8, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    const/high16 v9, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v12, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const-string v4, ""

    .line 236
    .line 237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 245
    .line 246
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    const/4 v2, 0x0

    .line 251
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const v4, 0x40ef0a3d    # 7.47f

    .line 268
    .line 269
    .line 270
    const v6, 0x410ccccd    # 8.8f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x404147ae    # 3.02f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v25, 0x3e9eb852    # 0.31f

    .line 283
    .line 284
    .line 285
    const v26, 0x3e051eb8    # 0.13f

    .line 286
    .line 287
    .line 288
    const v21, 0x3da3d70a    # 0.08f

    .line 289
    .line 290
    .line 291
    const v22, 0x3da3d70a    # 0.08f

    .line 292
    .line 293
    .line 294
    const v23, 0x3e4ccccd    # 0.2f

    .line 295
    .line 296
    .line 297
    const v24, 0x3e051eb8    # 0.13f

    .line 298
    .line 299
    .line 300
    move-object/from16 v20, v2

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, 0x3e9eb852    # 0.31f

    .line 306
    .line 307
    .line 308
    const v6, -0x41fae148    # -0.13f

    .line 309
    .line 310
    .line 311
    const v7, 0x3e6b851f    # 0.23f

    .line 312
    .line 313
    .line 314
    const v8, -0x42b33333    # -0.05f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x403f5c29    # 2.99f

    .line 321
    .line 322
    .line 323
    const v6, -0x3fc0a3d7    # -2.99f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v25, 0x401b851f    # 2.43f

    .line 330
    .line 331
    .line 332
    const v26, -0x40970a3d    # -0.91f

    .line 333
    .line 334
    .line 335
    const v21, 0x3f35c28f    # 0.71f

    .line 336
    .line 337
    .line 338
    const v22, -0x40c28f5c    # -0.74f

    .line 339
    .line 340
    .line 341
    const v23, 0x3fc28f5c    # 1.52f

    .line 342
    .line 343
    .line 344
    const v24, -0x40970a3d    # -0.91f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, -0x3f91eb85    # -3.72f

    .line 351
    .line 352
    .line 353
    const v6, -0x3f928f5c    # -3.71f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v25, -0x3f7851ec    # -4.24f

    .line 360
    .line 361
    .line 362
    const/16 v26, 0x0

    .line 363
    .line 364
    const v21, -0x406a3d71    # -1.17f

    .line 365
    .line 366
    .line 367
    const v22, -0x406a3d71    # -1.17f

    .line 368
    .line 369
    .line 370
    const v23, -0x3fbb851f    # -3.07f

    .line 371
    .line 372
    .line 373
    const v24, -0x406a3d71    # -1.17f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, 0x406ccccd    # 3.7f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v25, 0x410ccccd    # 8.8f

    .line 386
    .line 387
    .line 388
    const v26, 0x40ef0a3d    # 7.47f

    .line 389
    .line 390
    .line 391
    const v21, 0x40fe6666    # 7.95f

    .line 392
    .line 393
    .line 394
    const v22, 0x40d28f5c    # 6.58f

    .line 395
    .line 396
    .line 397
    const v23, 0x4107d70a    # 8.49f

    .line 398
    .line 399
    .line 400
    const v24, 0x40e51eb8    # 7.16f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/high16 v6, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v8, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v7, 0x0

    .line 418
    const-string v4, ""

    .line 419
    .line 420
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 421
    .line 422
    .line 423
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 428
    .line 429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 430
    .line 431
    .line 432
    move-result-wide v6

    .line 433
    const/4 v0, 0x0

    .line 434
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 442
    .line 443
    .line 444
    move-result v11

    .line 445
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 448
    .line 449
    .line 450
    const v0, 0x41a8e148    # 21.11f

    .line 451
    .line 452
    .line 453
    const v2, 0x411d999a    # 9.85f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 460
    .line 461
    const v2, -0x3fef5c29    # -2.26f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x418ccccd    # 17.6f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, -0x40466666    # -1.45f

    .line 474
    .line 475
    .line 476
    const v18, 0x3f1c28f6    # 0.61f

    .line 477
    .line 478
    .line 479
    const v13, -0x40f5c28f    # -0.54f

    .line 480
    .line 481
    .line 482
    const v15, -0x4075c28f    # -1.08f

    .line 483
    .line 484
    .line 485
    const v16, 0x3e6147ae    # 0.22f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 492
    .line 493
    const/high16 v2, 0x40400000    # 3.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x407d70a4    # -1.02f

    .line 499
    .line 500
    .line 501
    const v18, 0x3ed70a3d    # 0.42f

    .line 502
    .line 503
    .line 504
    const v13, -0x4170a3d7    # -0.28f

    .line 505
    .line 506
    .line 507
    const v14, 0x3e8f5c29    # 0.28f

    .line 508
    .line 509
    .line 510
    const v15, -0x40d9999a    # -0.65f

    .line 511
    .line 512
    .line 513
    const v16, 0x3ed70a3d    # 0.42f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v18, -0x4128f5c3    # -0.42f

    .line 520
    .line 521
    .line 522
    const v13, -0x4147ae14    # -0.36f

    .line 523
    .line 524
    .line 525
    const/4 v14, 0x0

    .line 526
    const v15, -0x40c28f5c    # -0.74f

    .line 527
    .line 528
    .line 529
    const v16, -0x41e66666    # -0.15f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x410170a4    # 8.09f

    .line 536
    .line 537
    .line 538
    const v2, 0x4102b852    # 8.17f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, -0x40466666    # -1.45f

    .line 545
    .line 546
    .line 547
    const v18, -0x40e66666    # -0.6f

    .line 548
    .line 549
    .line 550
    const v13, -0x413d70a4    # -0.38f

    .line 551
    .line 552
    .line 553
    const v14, -0x413d70a4    # -0.38f

    .line 554
    .line 555
    .line 556
    const v15, -0x4099999a    # -0.9f

    .line 557
    .line 558
    .line 559
    const v16, -0x40e66666    # -0.6f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40a570a4    # 5.17f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x3fed70a4    # -2.29f

    .line 572
    .line 573
    .line 574
    const v2, 0x40133333    # 2.3f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const v18, 0x4087ae14    # 4.24f

    .line 583
    .line 584
    .line 585
    const v13, -0x406a3d71    # -1.17f

    .line 586
    .line 587
    .line 588
    const v14, 0x3f95c28f    # 1.17f

    .line 589
    .line 590
    .line 591
    const v15, -0x406a3d71    # -1.17f

    .line 592
    .line 593
    .line 594
    const v16, 0x40447ae1    # 3.07f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x40128f5c    # 2.29f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x3fbd70a4    # 1.48f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x3fb9999a    # 1.45f

    .line 613
    .line 614
    .line 615
    const v18, -0x40e66666    # -0.6f

    .line 616
    .line 617
    .line 618
    const v13, 0x3f0a3d71    # 0.54f

    .line 619
    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const v15, 0x3f87ae14    # 1.06f

    .line 623
    .line 624
    .line 625
    const v16, -0x419eb852    # -0.22f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, -0x3fbeb852    # -3.02f

    .line 632
    .line 633
    .line 634
    const v2, 0x404147ae    # 3.02f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, 0x3f828f5c    # 1.02f

    .line 641
    .line 642
    .line 643
    const v18, -0x4128f5c3    # -0.42f

    .line 644
    .line 645
    .line 646
    const v13, 0x3e8f5c29    # 0.28f

    .line 647
    .line 648
    .line 649
    const v14, -0x4170a3d7    # -0.28f

    .line 650
    .line 651
    .line 652
    const v15, 0x3f266666    # 0.65f

    .line 653
    .line 654
    .line 655
    const v16, -0x4128f5c3    # -0.42f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v18, 0x3ed70a3d    # 0.42f

    .line 662
    .line 663
    .line 664
    const v13, 0x3ebd70a4    # 0.37f

    .line 665
    .line 666
    .line 667
    const/4 v14, 0x0

    .line 668
    const v15, 0x3f3d70a4    # 0.74f

    .line 669
    .line 670
    .line 671
    const v16, 0x3e0f5c29    # 0.14f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x4040a3d7    # 3.01f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, 0x3fb9999a    # 1.45f

    .line 684
    .line 685
    .line 686
    const v18, 0x3f19999a    # 0.6f

    .line 687
    .line 688
    .line 689
    const v13, 0x3ec28f5c    # 0.38f

    .line 690
    .line 691
    .line 692
    const v14, 0x3ec28f5c    # 0.38f

    .line 693
    .line 694
    .line 695
    const v15, 0x3f666666    # 0.9f

    .line 696
    .line 697
    .line 698
    const v16, 0x3f19999a    # 0.6f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, 0x3fa147ae    # 1.26f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x40100000    # 2.25f

    .line 711
    .line 712
    const v2, -0x3fef5c29    # -2.26f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v17, 0x41a8e148    # 21.11f

    .line 719
    .line 720
    .line 721
    const v18, 0x411d999a    # 9.85f

    .line 722
    .line 723
    .line 724
    const v13, 0x41b26666    # 22.3f

    .line 725
    .line 726
    .line 727
    const v14, 0x414f5c29    # 12.96f

    .line 728
    .line 729
    .line 730
    const v15, 0x41b26666    # 22.3f

    .line 731
    .line 732
    .line 733
    const v16, 0x4130a3d7    # 11.04f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/16 v16, 0x3800

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const/high16 v6, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/4 v7, 0x0

    .line 753
    const/high16 v12, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/4 v13, 0x0

    .line 756
    const/4 v14, 0x0

    .line 757
    const/4 v15, 0x0

    .line 758
    const-string v4, ""

    .line 759
    .line 760
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    sput-object v0, Landroidx/compose/material/icons/twotone/PixKt;->_pix:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 769
    .line 770
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    return-object v0
.end method

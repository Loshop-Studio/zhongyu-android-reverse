.class public final Landroidx/compose/material/icons/sharp/PanoramaWideAngleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaWideAngle(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PanoramaWideAngle"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x40e947ae    # 7.29f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f23d70a    # 0.64f

    .line 81
    .line 82
    .line 83
    const v13, 0x401ccccd    # 2.45f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x4096b852    # 4.71f

    .line 88
    .line 89
    .line 90
    const v16, 0x3e4ccccd    # 0.2f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3f35c28f    # 0.71f

    .line 97
    .line 98
    .line 99
    const v18, 0x40ab851f    # 5.36f

    .line 100
    .line 101
    .line 102
    const v13, 0x3ef0a3d7    # 0.47f

    .line 103
    .line 104
    .line 105
    const v14, 0x3fe3d70a    # 1.78f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f35c28f    # 0.71f

    .line 109
    .line 110
    .line 111
    const v16, 0x40651eb8    # 3.58f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x40ca3d71    # -0.71f

    .line 118
    .line 119
    .line 120
    const v2, 0x40ab851f    # 5.36f

    .line 121
    .line 122
    .line 123
    const v4, -0x418a3d71    # -0.24f

    .line 124
    .line 125
    .line 126
    const v6, 0x40651eb8    # 3.58f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x3f16b852    # -7.29f

    .line 133
    .line 134
    .line 135
    const v18, 0x3f23d70a    # 0.64f

    .line 136
    .line 137
    .line 138
    const v13, -0x3fdae148    # -2.58f

    .line 139
    .line 140
    .line 141
    const v14, 0x3ee147ae    # 0.44f

    .line 142
    .line 143
    .line 144
    const v15, -0x3f651eb8    # -4.84f

    .line 145
    .line 146
    .line 147
    const v16, 0x3f23d70a    # 0.64f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x3f16b852    # -7.29f

    .line 154
    .line 155
    .line 156
    const v2, -0x40dc28f6    # -0.64f

    .line 157
    .line 158
    .line 159
    const v4, -0x3f6947ae    # -4.71f

    .line 160
    .line 161
    .line 162
    const v6, -0x41b33333    # -0.2f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x40800000    # 4.0f

    .line 169
    .line 170
    const/high16 v18, 0x41400000    # 12.0f

    .line 171
    .line 172
    const v13, 0x4087ae14    # 4.24f

    .line 173
    .line 174
    .line 175
    const v14, 0x417947ae    # 15.58f

    .line 176
    .line 177
    .line 178
    const/high16 v15, 0x40800000    # 4.0f

    .line 179
    .line 180
    const v16, 0x415c7ae1    # 13.78f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x3f35c28f    # 0.71f

    .line 187
    .line 188
    .line 189
    const v2, -0x3f547ae1    # -5.36f

    .line 190
    .line 191
    .line 192
    const v4, 0x3e75c28f    # 0.24f

    .line 193
    .line 194
    .line 195
    const v6, -0x3f9ae148    # -3.58f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x41400000    # 12.0f

    .line 202
    .line 203
    const/high16 v18, 0x40c00000    # 6.0f

    .line 204
    .line 205
    const v13, 0x40e947ae    # 7.29f

    .line 206
    .line 207
    .line 208
    const v14, 0x40c66666    # 6.2f

    .line 209
    .line 210
    .line 211
    const v15, 0x4118cccd    # 9.55f

    .line 212
    .line 213
    .line 214
    const/high16 v16, 0x40c00000    # 6.0f

    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/4 v0, 0x0

    .line 220
    const/high16 v2, -0x40000000    # -2.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, -0x3f01999a    # -7.95f

    .line 226
    .line 227
    .line 228
    const v18, 0x3f3851ec    # 0.72f

    .line 229
    .line 230
    .line 231
    const v13, -0x3fd147ae    # -2.73f

    .line 232
    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const v15, -0x3f58f5c3    # -5.22f

    .line 236
    .line 237
    .line 238
    const v16, 0x3e75c28f    # 0.24f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3e23d70a    # 0.16f

    .line 245
    .line 246
    .line 247
    const v2, -0x4091eb85    # -0.93f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3f666666    # 0.9f

    .line 254
    .line 255
    .line 256
    const/high16 v2, -0x41800000    # -0.25f

    .line 257
    .line 258
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x40000000    # 2.0f

    .line 262
    .line 263
    const/high16 v18, 0x41400000    # 12.0f

    .line 264
    .line 265
    const v13, 0x40128f5c    # 2.29f

    .line 266
    .line 267
    .line 268
    const v14, 0x40fb3333    # 7.85f

    .line 269
    .line 270
    .line 271
    const/high16 v15, 0x40000000    # 2.0f

    .line 272
    .line 273
    const v16, 0x411ee148    # 9.93f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3f5eb852    # 0.87f

    .line 280
    .line 281
    .line 282
    const v2, 0x40c70a3d    # 6.22f

    .line 283
    .line 284
    .line 285
    const v4, 0x3e947ae1    # 0.29f

    .line 286
    .line 287
    .line 288
    const v6, 0x4084cccd    # 4.15f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3f63d70a    # 0.89f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x3e800000    # 0.25f

    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3f6e147b    # 0.93f

    .line 303
    .line 304
    .line 305
    const v2, 0x3e23d70a    # 0.16f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x40fe6666    # 7.95f

    .line 312
    .line 313
    .line 314
    const v18, 0x3f3ae148    # 0.73f

    .line 315
    .line 316
    .line 317
    const v13, 0x402eb852    # 2.73f

    .line 318
    .line 319
    .line 320
    const v14, 0x3efae148    # 0.49f

    .line 321
    .line 322
    .line 323
    const v15, 0x40a70a3d    # 5.22f

    .line 324
    .line 325
    .line 326
    const v16, 0x3f3ae148    # 0.73f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x40fe6666    # 7.95f

    .line 333
    .line 334
    .line 335
    const v2, -0x40c7ae14    # -0.72f

    .line 336
    .line 337
    .line 338
    const v4, -0x418a3d71    # -0.24f

    .line 339
    .line 340
    .line 341
    const v6, 0x40a70a3d    # 5.22f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x41dc28f6    # -0.16f

    .line 348
    .line 349
    .line 350
    const v2, 0x3f6e147b    # 0.93f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, -0x409c28f6    # -0.89f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x3e800000    # 0.25f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x3f5eb852    # 0.87f

    .line 365
    .line 366
    .line 367
    const v18, -0x3f38a3d7    # -6.23f

    .line 368
    .line 369
    .line 370
    const v13, 0x3f147ae1    # 0.58f

    .line 371
    .line 372
    .line 373
    const v14, -0x3ffae148    # -2.08f

    .line 374
    .line 375
    .line 376
    const v15, 0x3f5eb852    # 0.87f

    .line 377
    .line 378
    .line 379
    const v16, -0x3f7ae148    # -4.16f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x40a147ae    # -0.87f

    .line 386
    .line 387
    .line 388
    const v2, -0x3f38f5c3    # -6.22f

    .line 389
    .line 390
    .line 391
    const v4, -0x416b851f    # -0.29f

    .line 392
    .line 393
    .line 394
    const v6, -0x3f7b3333    # -4.15f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x409c28f6    # -0.89f

    .line 401
    .line 402
    .line 403
    const/high16 v2, -0x41800000    # -0.25f

    .line 404
    .line 405
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x41dc28f6    # -0.16f

    .line 409
    .line 410
    .line 411
    const v2, -0x4091eb85    # -0.93f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x41400000    # 12.0f

    .line 418
    .line 419
    const/high16 v18, 0x40800000    # 4.0f

    .line 420
    .line 421
    const v13, 0x4189c28f    # 17.22f

    .line 422
    .line 423
    .line 424
    const v14, 0x4087ae14    # 4.24f

    .line 425
    .line 426
    .line 427
    const v15, 0x416bae14    # 14.73f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x40800000    # 4.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const/16 v16, 0x3800

    .line 443
    .line 444
    const/16 v17, 0x0

    .line 445
    .line 446
    const/high16 v6, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/high16 v8, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    const/high16 v9, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/high16 v12, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const/4 v14, 0x0

    .line 457
    const/4 v15, 0x0

    .line 458
    const-string v4, ""

    .line 459
    .line 460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    sput-object v0, Landroidx/compose/material/icons/sharp/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 469
    .line 470
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    return-object v0
.end method

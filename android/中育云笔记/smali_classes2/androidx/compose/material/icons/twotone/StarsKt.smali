.class public final Landroidx/compose/material/icons/twotone/StarsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stars:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStars(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StarsKt;->_stars:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Stars"

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
    const v4, 0x41128f5c    # 9.16f

    .line 71
    .line 72
    .line 73
    const v6, 0x419bc28f    # 19.47f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f1fae14    # -7.01f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f5b851f    # -5.14f

    .line 83
    .line 84
    .line 85
    const v21, -0x40733333    # -1.1f

    .line 86
    .line 87
    .line 88
    const v22, -0x3fc851ec    # -2.87f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f8ccccd    # -3.8f

    .line 92
    .line 93
    .line 94
    const v24, -0x3f61999a    # -4.95f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x4096b852    # 4.71f

    .line 103
    .line 104
    .line 105
    const/high16 v6, 0x40000000    # 2.0f

    .line 106
    .line 107
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, 0x40a051ec    # 5.01f

    .line 111
    .line 112
    .line 113
    const v6, 0x3edc28f6    # 0.43f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x4080a3d7    # 4.02f

    .line 123
    .line 124
    .line 125
    const v6, 0x4138a3d7    # 11.54f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, -0x3f1f5c29    # -7.02f

    .line 132
    .line 133
    .line 134
    const v26, 0x40a4cccd    # 5.15f

    .line 135
    .line 136
    .line 137
    const v21, -0x3fb1eb85    # -3.22f

    .line 138
    .line 139
    .line 140
    const v22, 0x3e3851ec    # 0.18f

    .line 141
    .line 142
    .line 143
    const v23, -0x3f428f5c    # -5.92f

    .line 144
    .line 145
    .line 146
    const v24, 0x401147ae    # 2.27f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x40a0a3d7    # 5.02f

    .line 153
    .line 154
    .line 155
    const v6, -0x4123d70a    # -0.43f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, -0x3f68f5c3    # -4.72f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x40000000    # 2.0f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x40875c29    # 4.23f

    .line 173
    .line 174
    .line 175
    const v6, 0x41223d71    # 10.14f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v25, 0x40800000    # 4.0f

    .line 182
    .line 183
    const/high16 v26, 0x41400000    # 12.0f

    .line 184
    .line 185
    const v21, 0x40828f5c    # 4.08f

    .line 186
    .line 187
    .line 188
    const v22, 0x412bd70a    # 10.74f

    .line 189
    .line 190
    .line 191
    const/high16 v23, 0x40800000    # 4.0f

    .line 192
    .line 193
    const v24, 0x4135c28f    # 11.36f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x403a3d71    # 2.91f

    .line 200
    .line 201
    .line 202
    const v26, 0x40c570a4    # 6.17f

    .line 203
    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, 0x401eb852    # 2.48f

    .line 208
    .line 209
    .line 210
    const v23, 0x3f91eb85    # 1.14f

    .line 211
    .line 212
    .line 213
    const v24, 0x40966666    # 4.7f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x3f8e147b    # 1.11f

    .line 220
    .line 221
    .line 222
    const/high16 v6, -0x3f680000    # -4.75f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v4, -0x3fae147b    # -3.28f

    .line 228
    .line 229
    .line 230
    const v6, -0x3f8d70a4    # -3.79f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x419e28f6    # 19.77f

    .line 240
    .line 241
    .line 242
    const v6, 0x4122147b    # 10.13f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x4051eb85    # 3.28f

    .line 249
    .line 250
    .line 251
    const v6, -0x3f8d70a4    # -3.79f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x3f8ccccd    # 1.1f

    .line 258
    .line 259
    .line 260
    const v6, 0x409851ec    # 4.76f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x41a00000    # 20.0f

    .line 267
    .line 268
    const/high16 v26, 0x41400000    # 12.0f

    .line 269
    .line 270
    const v21, 0x4196e148    # 18.86f

    .line 271
    .line 272
    .line 273
    const v22, 0x4185999a    # 16.7f

    .line 274
    .line 275
    .line 276
    const/high16 v23, 0x41a00000    # 20.0f

    .line 277
    .line 278
    const v24, 0x4167ae14    # 14.48f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, -0x41947ae1    # -0.23f

    .line 285
    .line 286
    .line 287
    const v26, -0x4010a3d7    # -1.87f

    .line 288
    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const v22, -0x40dc28f6    # -0.64f

    .line 293
    .line 294
    .line 295
    const v23, -0x4247ae14    # -0.09f

    .line 296
    .line 297
    .line 298
    const v24, -0x405d70a4    # -1.27f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, 0x40fae148    # 7.84f

    .line 308
    .line 309
    .line 310
    const v6, 0x41968f5c    # 18.82f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, 0x4084cccd    # 4.15f

    .line 317
    .line 318
    .line 319
    const v26, 0x3f970a3d    # 1.18f

    .line 320
    .line 321
    .line 322
    const v21, 0x3f9ae148    # 1.21f

    .line 323
    .line 324
    .line 325
    const v22, 0x3f3d70a4    # 0.74f

    .line 326
    .line 327
    .line 328
    const v23, 0x402851ec    # 2.63f

    .line 329
    .line 330
    .line 331
    const v24, 0x3f970a3d    # 1.18f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, 0x408570a4    # 4.17f

    .line 338
    .line 339
    .line 340
    const v26, -0x4068f5c3    # -1.18f

    .line 341
    .line 342
    .line 343
    const v21, 0x3fc3d70a    # 1.53f

    .line 344
    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    const v23, 0x403ccccd    # 2.95f

    .line 349
    .line 350
    .line 351
    const v24, -0x411eb852    # -0.44f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v4, 0x41827ae1    # 16.31f

    .line 358
    .line 359
    .line 360
    const/high16 v6, 0x41400000    # 12.0f

    .line 361
    .line 362
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, -0x3f7ae148    # -4.16f

    .line 366
    .line 367
    .line 368
    const v6, 0x4020a3d7    # 2.51f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/16 v16, 0x3800

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v6, 0x3e99999a    # 0.3f

    .line 386
    .line 387
    .line 388
    const v8, 0x3e99999a    # 0.3f

    .line 389
    .line 390
    .line 391
    const/4 v7, 0x0

    .line 392
    const/high16 v9, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const/4 v14, 0x0

    .line 398
    const/4 v15, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 409
    .line 410
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 411
    .line 412
    .line 413
    move-result-wide v6

    .line 414
    const/4 v0, 0x0

    .line 415
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 429
    .line 430
    .line 431
    const v0, 0x413fd70a    # 11.99f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x40000000    # 2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x40000000    # 2.0f

    .line 440
    .line 441
    const/high16 v18, 0x41400000    # 12.0f

    .line 442
    .line 443
    const v13, 0x40cf0a3d    # 6.47f

    .line 444
    .line 445
    .line 446
    const/high16 v14, 0x40000000    # 2.0f

    .line 447
    .line 448
    const/high16 v15, 0x40000000    # 2.0f

    .line 449
    .line 450
    const v16, 0x40cf5c29    # 6.48f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x408f0a3d    # 4.47f

    .line 457
    .line 458
    .line 459
    const v2, 0x411fd70a    # 9.99f

    .line 460
    .line 461
    .line 462
    const/high16 v4, 0x41200000    # 10.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41b00000    # 22.0f

    .line 468
    .line 469
    const v13, 0x418c28f6    # 17.52f

    .line 470
    .line 471
    .line 472
    const/high16 v14, 0x41b00000    # 22.0f

    .line 473
    .line 474
    const/high16 v15, 0x41b00000    # 22.0f

    .line 475
    .line 476
    const v16, 0x418c28f6    # 17.52f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x418c28f6    # 17.52f

    .line 483
    .line 484
    .line 485
    const v2, 0x413fd70a    # 11.99f

    .line 486
    .line 487
    .line 488
    const/high16 v4, 0x40000000    # 2.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x41128f5c    # 9.16f

    .line 497
    .line 498
    .line 499
    const v2, 0x419bc28f    # 19.47f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, -0x3f5fae14    # -5.01f

    .line 506
    .line 507
    .line 508
    const v2, -0x4123d70a    # -0.43f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, -0x3f6947ae    # -4.71f

    .line 515
    .line 516
    .line 517
    const/high16 v2, -0x40000000    # -2.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x40e051ec    # 7.01f

    .line 523
    .line 524
    .line 525
    const v18, 0x40a47ae1    # 5.14f

    .line 526
    .line 527
    .line 528
    const v13, 0x404d70a4    # 3.21f

    .line 529
    .line 530
    .line 531
    const v14, 0x3e428f5c    # 0.19f

    .line 532
    .line 533
    .line 534
    const v15, 0x40bd1eb8    # 5.91f

    .line 535
    .line 536
    .line 537
    const v16, 0x401147ae    # 2.27f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x4100f5c3    # 8.06f

    .line 547
    .line 548
    .line 549
    const/high16 v2, 0x41400000    # 12.0f

    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x3f8b851f    # 1.09f

    .line 555
    .line 556
    .line 557
    const v2, 0x4023d70a    # 2.56f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x3e75c28f    # 0.24f

    .line 564
    .line 565
    .line 566
    const v2, 0x4031eb85    # 2.78f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x3fea3d71    # 1.83f

    .line 573
    .line 574
    .line 575
    const v2, -0x3ff8f5c3    # -2.11f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x402eb852    # 2.73f

    .line 582
    .line 583
    .line 584
    const v2, 0x3f2147ae    # 0.63f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x415fae14    # 13.98f

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x41400000    # 12.0f

    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, -0x3fe70a3d    # -2.39f

    .line 599
    .line 600
    .line 601
    const v2, 0x3fb851ec    # 1.44f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, -0x3fd1eb85    # -2.72f

    .line 608
    .line 609
    .line 610
    const v2, 0x3f2147ae    # 0.63f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, -0x4015c28f    # -1.83f

    .line 617
    .line 618
    .line 619
    const v2, -0x3ff8f5c3    # -2.11f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, -0x418a3d71    # -0.24f

    .line 626
    .line 627
    .line 628
    const v2, 0x4031eb85    # 2.78f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x4100f5c3    # 8.06f

    .line 635
    .line 636
    .line 637
    const/high16 v2, 0x41400000    # 12.0f

    .line 638
    .line 639
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x4080a3d7    # 4.02f

    .line 646
    .line 647
    .line 648
    const v2, 0x4138a3d7    # 11.54f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x40970a3d    # 4.72f

    .line 655
    .line 656
    .line 657
    const/high16 v2, -0x40000000    # -2.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x3f5f5c29    # -5.02f

    .line 663
    .line 664
    .line 665
    const v2, 0x3edc28f6    # 0.43f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x40e0a3d7    # 7.02f

    .line 672
    .line 673
    .line 674
    const v18, -0x3f5b3333    # -5.15f

    .line 675
    .line 676
    .line 677
    const v13, 0x3f8ccccd    # 1.1f

    .line 678
    .line 679
    .line 680
    const v14, -0x3fc7ae14    # -2.88f

    .line 681
    .line 682
    .line 683
    const v15, 0x40733333    # 3.8f

    .line 684
    .line 685
    .line 686
    const v16, -0x3f60f5c3    # -4.97f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x40800000    # 4.0f

    .line 696
    .line 697
    const/high16 v2, 0x41400000    # 12.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x3e6b851f    # 0.23f

    .line 703
    .line 704
    .line 705
    const v18, -0x4011eb85    # -1.86f

    .line 706
    .line 707
    .line 708
    const/4 v13, 0x0

    .line 709
    const v14, -0x40dc28f6    # -0.64f

    .line 710
    .line 711
    .line 712
    const v15, 0x3da3d70a    # 0.08f

    .line 713
    .line 714
    .line 715
    const v16, -0x405eb852    # -1.26f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x40728f5c    # 3.79f

    .line 722
    .line 723
    .line 724
    const v2, 0x4051eb85    # 3.28f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, -0x4071eb85    # -1.11f

    .line 731
    .line 732
    .line 733
    const/high16 v2, 0x40980000    # 4.75f

    .line 734
    .line 735
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v17, 0x40800000    # 4.0f

    .line 739
    .line 740
    const/high16 v18, 0x41400000    # 12.0f

    .line 741
    .line 742
    const v13, 0x40a47ae1    # 5.14f

    .line 743
    .line 744
    .line 745
    const v14, 0x4185999a    # 16.7f

    .line 746
    .line 747
    .line 748
    const/high16 v15, 0x40800000    # 4.0f

    .line 749
    .line 750
    const v16, 0x4167ae14    # 14.48f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x41a00000    # 20.0f

    .line 760
    .line 761
    const v2, 0x413fd70a    # 11.99f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, -0x3f7b3333    # -4.15f

    .line 768
    .line 769
    .line 770
    const v18, -0x4068f5c3    # -1.18f

    .line 771
    .line 772
    .line 773
    const v13, -0x403d70a4    # -1.52f

    .line 774
    .line 775
    .line 776
    const/4 v14, 0x0

    .line 777
    const v15, -0x3fc3d70a    # -2.94f

    .line 778
    .line 779
    .line 780
    const v16, -0x411eb852    # -0.44f

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v0, 0x41827ae1    # 16.31f

    .line 787
    .line 788
    .line 789
    const/high16 v2, 0x41400000    # 12.0f

    .line 790
    .line 791
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, 0x40851eb8    # 4.16f

    .line 795
    .line 796
    .line 797
    const v2, 0x4020a3d7    # 2.51f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, -0x3f7a8f5c    # -4.17f

    .line 804
    .line 805
    .line 806
    const v18, 0x3f970a3d    # 1.18f

    .line 807
    .line 808
    .line 809
    const v13, -0x4063d70a    # -1.22f

    .line 810
    .line 811
    .line 812
    const v14, 0x3f3d70a4    # 0.74f

    .line 813
    .line 814
    .line 815
    const v15, -0x3fd70a3d    # -2.64f

    .line 816
    .line 817
    .line 818
    const v16, 0x3f970a3d    # 1.18f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v0, 0x4188b852    # 17.09f

    .line 828
    .line 829
    .line 830
    const v2, 0x41915c29    # 18.17f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, -0x40733333    # -1.1f

    .line 837
    .line 838
    .line 839
    const v2, -0x3f67ae14    # -4.76f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, 0x40728f5c    # 3.79f

    .line 846
    .line 847
    .line 848
    const v2, -0x3fae147b    # -3.28f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v17, 0x3e6147ae    # 0.22f

    .line 855
    .line 856
    .line 857
    const v18, 0x3fef5c29    # 1.87f

    .line 858
    .line 859
    .line 860
    const v13, 0x3e051eb8    # 0.13f

    .line 861
    .line 862
    .line 863
    const v14, 0x3f19999a    # 0.6f

    .line 864
    .line 865
    .line 866
    const v15, 0x3e6147ae    # 0.22f

    .line 867
    .line 868
    .line 869
    const v16, 0x3f9d70a4    # 1.23f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v17, -0x3fc5c28f    # -2.91f

    .line 876
    .line 877
    .line 878
    const v18, 0x40c570a4    # 6.17f

    .line 879
    .line 880
    .line 881
    const/4 v13, 0x0

    .line 882
    const v14, 0x401eb852    # 2.48f

    .line 883
    .line 884
    .line 885
    const v15, -0x406e147b    # -1.14f

    .line 886
    .line 887
    .line 888
    const v16, 0x40966666    # 4.7f

    .line 889
    .line 890
    .line 891
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    const/16 v16, 0x3800

    .line 902
    .line 903
    const/16 v17, 0x0

    .line 904
    .line 905
    const/high16 v6, 0x3f800000    # 1.0f

    .line 906
    .line 907
    const/high16 v8, 0x3f800000    # 1.0f

    .line 908
    .line 909
    const/4 v7, 0x0

    .line 910
    const/high16 v12, 0x3f800000    # 1.0f

    .line 911
    .line 912
    const/4 v14, 0x0

    .line 913
    const/4 v15, 0x0

    .line 914
    const-string v4, ""

    .line 915
    .line 916
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    sput-object v0, Landroidx/compose/material/icons/twotone/StarsKt;->_stars:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 925
    .line 926
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    return-object v0
.end method

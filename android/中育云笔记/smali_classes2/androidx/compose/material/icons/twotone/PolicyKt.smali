.class public final Landroidx/compose/material/icons/twotone/PolicyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _policy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPolicy(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Policy"

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
    const v4, 0x40c9999a    # 6.3f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41300000    # 11.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x40e00000    # 7.0f

    .line 84
    .line 85
    const v26, 0x411ee148    # 9.93f

    .line 86
    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const v22, 0x4090a3d7    # 4.52f

    .line 91
    .line 92
    .line 93
    const v23, 0x403eb852    # 2.98f

    .line 94
    .line 95
    .line 96
    const v24, 0x410b0a3d    # 8.69f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, 0x408f0a3d    # 4.47f

    .line 105
    .line 106
    .line 107
    const v26, -0x3fbd70a4    # -3.04f

    .line 108
    .line 109
    .line 110
    const v21, 0x3fdeb852    # 1.74f

    .line 111
    .line 112
    .line 113
    const v22, -0x40f851ec    # -0.53f

    .line 114
    .line 115
    .line 116
    const v23, 0x4051eb85    # 3.28f

    .line 117
    .line 118
    .line 119
    const v24, -0x4030a3d7    # -1.62f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, -0x4023d70a    # -1.72f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, -0x3f36b852    # -6.29f

    .line 132
    .line 133
    .line 134
    const v26, -0x40dc28f6    # -0.64f

    .line 135
    .line 136
    .line 137
    const v21, -0x4007ae14    # -1.94f

    .line 138
    .line 139
    .line 140
    const v22, 0x3fa51eb8    # 1.29f

    .line 141
    .line 142
    .line 143
    const v23, -0x3f6d70a4    # -4.58f

    .line 144
    .line 145
    .line 146
    const v24, 0x3f88f5c3    # 1.07f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const v26, -0x3f1dc28f    # -7.07f

    .line 155
    .line 156
    .line 157
    const v21, -0x40066666    # -1.95f

    .line 158
    .line 159
    .line 160
    const v22, -0x40066666    # -1.95f

    .line 161
    .line 162
    .line 163
    const v23, -0x40066666    # -1.95f

    .line 164
    .line 165
    .line 166
    const v24, -0x3f5c28f6    # -5.12f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, 0x40e23d71    # 7.07f

    .line 173
    .line 174
    .line 175
    const/16 v26, 0x0

    .line 176
    .line 177
    const v21, 0x3ff9999a    # 1.95f

    .line 178
    .line 179
    .line 180
    const v23, 0x40a3d70a    # 5.12f

    .line 181
    .line 182
    .line 183
    const v24, -0x40066666    # -1.95f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v25, 0x3f23d70a    # 0.64f

    .line 190
    .line 191
    .line 192
    const v26, 0x40c947ae    # 6.29f

    .line 193
    .line 194
    .line 195
    const v21, 0x3fdae148    # 1.71f

    .line 196
    .line 197
    .line 198
    const v22, 0x3fdae148    # 1.71f

    .line 199
    .line 200
    .line 201
    const v23, 0x3ff5c28f    # 1.92f

    .line 202
    .line 203
    .line 204
    const v24, 0x408b3333    # 4.35f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, 0x3fb9999a    # 1.45f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x41980000    # 19.0f

    .line 217
    .line 218
    const/high16 v26, 0x41300000    # 11.0f

    .line 219
    .line 220
    const v21, 0x4193eb85    # 18.49f

    .line 221
    .line 222
    .line 223
    const v22, 0x416a6666    # 14.65f

    .line 224
    .line 225
    .line 226
    const/high16 v23, 0x41980000    # 19.0f

    .line 227
    .line 228
    const v24, 0x414d999a    # 12.85f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x40c9999a    # 6.3f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, -0x3f200000    # -7.0f

    .line 241
    .line 242
    const v6, -0x3fb8f5c3    # -3.11f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x40c9999a    # 6.3f

    .line 249
    .line 250
    .line 251
    const/high16 v6, 0x40a00000    # 5.0f

    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const/16 v16, 0x3800

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const v6, 0x3e99999a    # 0.3f

    .line 268
    .line 269
    .line 270
    const v8, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const/high16 v9, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v12, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    const-string v4, ""

    .line 282
    .line 283
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    const/4 v0, 0x0

    .line 297
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/high16 v2, 0x41400000    # 12.0f

    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x40400000    # 3.0f

    .line 321
    .line 322
    const/high16 v2, 0x40a00000    # 5.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x40c00000    # 6.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41100000    # 9.0f

    .line 333
    .line 334
    const/high16 v18, 0x41400000    # 12.0f

    .line 335
    .line 336
    const v14, 0x40b1999a    # 5.55f

    .line 337
    .line 338
    .line 339
    const v15, 0x4075c28f    # 3.84f

    .line 340
    .line 341
    .line 342
    const v16, 0x412bd70a    # 10.74f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3fef5c29    # 1.87f

    .line 349
    .line 350
    .line 351
    const v18, -0x40d9999a    # -0.65f

    .line 352
    .line 353
    .line 354
    const v13, 0x3f266666    # 0.65f

    .line 355
    .line 356
    .line 357
    const v14, -0x41dc28f6    # -0.16f

    .line 358
    .line 359
    .line 360
    const v15, 0x3fa28f5c    # 1.27f

    .line 361
    .line 362
    .line 363
    const v16, -0x413d70a4    # -0.38f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x40923d71    # 4.57f

    .line 370
    .line 371
    .line 372
    const v18, -0x3f90a3d7    # -3.74f

    .line 373
    .line 374
    .line 375
    const v13, 0x3fe66666    # 1.8f

    .line 376
    .line 377
    .line 378
    const v14, -0x40ae147b    # -0.82f

    .line 379
    .line 380
    .line 381
    const v15, 0x40570a3d    # 3.36f

    .line 382
    .line 383
    .line 384
    const v16, -0x3ff7ae14    # -2.13f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x41a80000    # 21.0f

    .line 391
    .line 392
    const/high16 v18, 0x41300000    # 11.0f

    .line 393
    .line 394
    const v13, 0x41a051ec    # 20.04f

    .line 395
    .line 396
    .line 397
    const v14, 0x4183ae14    # 16.46f

    .line 398
    .line 399
    .line 400
    const/high16 v15, 0x41a80000    # 21.0f

    .line 401
    .line 402
    const v16, 0x415c51ec    # 13.77f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40a00000    # 5.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v2, 0x41400000    # 12.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41980000    # 19.0f

    .line 424
    .line 425
    const/high16 v2, 0x41300000    # 11.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x404f5c29    # -1.38f

    .line 431
    .line 432
    .line 433
    const v18, 0x40a6b852    # 5.21f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, 0x3feccccd    # 1.85f

    .line 438
    .line 439
    .line 440
    const v15, -0x40fd70a4    # -0.51f

    .line 441
    .line 442
    .line 443
    const v16, 0x4069999a    # 3.65f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x40466666    # -1.45f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, -0x40dc28f6    # -0.64f

    .line 456
    .line 457
    .line 458
    const v18, -0x3f36b852    # -6.29f

    .line 459
    .line 460
    .line 461
    const v13, 0x3fa51eb8    # 1.29f

    .line 462
    .line 463
    .line 464
    const v14, -0x4007ae14    # -1.94f

    .line 465
    .line 466
    .line 467
    const v15, 0x3f88f5c3    # 1.07f

    .line 468
    .line 469
    .line 470
    const v16, -0x3f6d70a4    # -4.58f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, -0x3f1dc28f    # -7.07f

    .line 477
    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    const v13, -0x40066666    # -1.95f

    .line 482
    .line 483
    .line 484
    const v14, -0x40066666    # -1.95f

    .line 485
    .line 486
    .line 487
    const v15, -0x3f5c28f6    # -5.12f

    .line 488
    .line 489
    .line 490
    const v16, -0x40066666    # -1.95f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const v18, 0x40e23d71    # 7.07f

    .line 499
    .line 500
    .line 501
    const v14, 0x3ff9999a    # 1.95f

    .line 502
    .line 503
    .line 504
    const v15, -0x40066666    # -1.95f

    .line 505
    .line 506
    .line 507
    const v16, 0x40a3d70a    # 5.12f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x40c947ae    # 6.29f

    .line 514
    .line 515
    .line 516
    const v18, 0x3f23d70a    # 0.64f

    .line 517
    .line 518
    .line 519
    const v13, 0x3fdae148    # 1.71f

    .line 520
    .line 521
    .line 522
    const v14, 0x3fdae148    # 1.71f

    .line 523
    .line 524
    .line 525
    const v15, 0x408b3333    # 4.35f

    .line 526
    .line 527
    .line 528
    const v16, 0x3ff5c28f    # 1.92f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x3fdc28f6    # 1.72f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, -0x3f70f5c3    # -4.47f

    .line 541
    .line 542
    .line 543
    const v18, 0x40428f5c    # 3.04f

    .line 544
    .line 545
    .line 546
    const v13, -0x4067ae14    # -1.19f

    .line 547
    .line 548
    .line 549
    const v14, 0x3fb5c28f    # 1.42f

    .line 550
    .line 551
    .line 552
    const v15, -0x3fd147ae    # -2.73f

    .line 553
    .line 554
    .line 555
    const v16, 0x4020a3d7    # 2.51f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x40a00000    # 5.0f

    .line 562
    .line 563
    const/high16 v18, 0x41300000    # 11.0f

    .line 564
    .line 565
    const v13, 0x40ff5c29    # 7.98f

    .line 566
    .line 567
    .line 568
    const v14, 0x419d851f    # 19.69f

    .line 569
    .line 570
    .line 571
    const/high16 v15, 0x40a00000    # 5.0f

    .line 572
    .line 573
    const v16, 0x417851ec    # 15.52f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x40c9999a    # 6.3f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40e00000    # 7.0f

    .line 586
    .line 587
    const v2, -0x3fb8f5c3    # -3.11f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x40470a3d    # 3.11f

    .line 594
    .line 595
    .line 596
    const/high16 v2, 0x40e00000    # 7.0f

    .line 597
    .line 598
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, 0x41300000    # 11.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v0, 0x41700000    # 15.0f

    .line 610
    .line 611
    const/high16 v2, 0x41400000    # 12.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 617
    .line 618
    const/high16 v18, 0x40400000    # 3.0f

    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const v14, 0x3fd47ae1    # 1.66f

    .line 622
    .line 623
    .line 624
    const v15, -0x40547ae1    # -1.34f

    .line 625
    .line 626
    .line 627
    const/high16 v16, 0x40400000    # 3.0f

    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, -0x40547ae1    # -1.34f

    .line 633
    .line 634
    .line 635
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 636
    .line 637
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x3fab851f    # 1.34f

    .line 641
    .line 642
    .line 643
    const/high16 v2, 0x40400000    # 3.0f

    .line 644
    .line 645
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x412570a4    # 10.34f

    .line 651
    .line 652
    .line 653
    const/high16 v2, 0x41700000    # 15.0f

    .line 654
    .line 655
    const/high16 v4, 0x41400000    # 12.0f

    .line 656
    .line 657
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/16 v16, 0x3800

    .line 668
    .line 669
    const/16 v17, 0x0

    .line 670
    .line 671
    const/high16 v6, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/high16 v8, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/4 v7, 0x0

    .line 676
    const/high16 v12, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v14, 0x0

    .line 679
    const/4 v15, 0x0

    .line 680
    const-string v4, ""

    .line 681
    .line 682
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    sput-object v0, Landroidx/compose/material/icons/twotone/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 691
    .line 692
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    return-object v0
.end method

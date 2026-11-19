.class public final Landroidx/compose/material/icons/twotone/SportsFootballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsFootball(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsFootballKt;->_sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsFootball"

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
    const v4, 0x4182147b    # 16.26f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x4055c28f    # -1.33f

    .line 79
    .line 80
    .line 81
    const v26, 0x3d75c28f    # 0.06f

    .line 82
    .line 83
    .line 84
    const v21, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x40b33333    # -0.8f

    .line 90
    .line 91
    .line 92
    const v24, 0x3c23d70a    # 0.01f

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
    const v4, 0x4080f5c3    # 4.03f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, -0x41d1eb85    # -0.17f

    .line 107
    .line 108
    .line 109
    const v26, -0x3f88f5c3    # -3.86f

    .line 110
    .line 111
    .line 112
    const v21, 0x3e0f5c29    # 0.14f

    .line 113
    .line 114
    .line 115
    const v22, -0x402f5c29    # -1.63f

    .line 116
    .line 117
    .line 118
    const v23, 0x3c23d70a    # 0.01f

    .line 119
    .line 120
    .line 121
    const v24, -0x3fbb851f    # -3.07f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x4182147b    # 16.26f

    .line 128
    .line 129
    .line 130
    const/high16 v26, 0x40a00000    # 5.0f

    .line 131
    .line 132
    const v21, 0x41923d71    # 18.28f

    .line 133
    .line 134
    .line 135
    const v22, 0x40a3d70a    # 5.12f

    .line 136
    .line 137
    .line 138
    const v23, 0x418b3333    # 17.4f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const/16 v16, 0x3800

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v6, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    const v8, 0x3e99999a    # 0.3f

    .line 161
    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const/high16 v9, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v12, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const-string v4, ""

    .line 172
    .line 173
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 174
    .line 175
    .line 176
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 181
    .line 182
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    const/4 v2, 0x0

    .line 187
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const v4, 0x40a6b852    # 5.21f

    .line 204
    .line 205
    .line 206
    const v6, 0x419628f6    # 18.77f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, 0x40f7ae14    # 7.74f

    .line 213
    .line 214
    .line 215
    const/high16 v26, 0x41980000    # 19.0f

    .line 216
    .line 217
    const v21, 0x40b70a3d    # 5.72f

    .line 218
    .line 219
    .line 220
    const v22, 0x41970a3d    # 18.88f

    .line 221
    .line 222
    .line 223
    const v23, 0x40d33333    # 6.6f

    .line 224
    .line 225
    .line 226
    const/high16 v24, 0x41980000    # 19.0f

    .line 227
    .line 228
    move-object/from16 v20, v2

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x3fa66666    # 1.3f

    .line 234
    .line 235
    .line 236
    const v26, -0x42b33333    # -0.05f

    .line 237
    .line 238
    .line 239
    const v21, 0x3eae147b    # 0.34f

    .line 240
    .line 241
    .line 242
    const/16 v22, 0x0

    .line 243
    .line 244
    const v23, 0x3f4a3d71    # 0.79f

    .line 245
    .line 246
    .line 247
    const v24, -0x43dc28f6    # -0.01f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, -0x3f7fae14    # -4.01f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x40a6b852    # 5.21f

    .line 260
    .line 261
    .line 262
    const v26, 0x419628f6    # 18.77f

    .line 263
    .line 264
    .line 265
    const v21, 0x409d1eb8    # 4.91f

    .line 266
    .line 267
    .line 268
    const v22, 0x41847ae1    # 16.56f

    .line 269
    .line 270
    .line 271
    const v23, 0x40a0f5c3    # 5.03f

    .line 272
    .line 273
    .line 274
    const v24, 0x418fd70a    # 17.98f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const v6, 0x3e99999a    # 0.3f

    .line 288
    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    const-string v4, ""

    .line 292
    .line 293
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 301
    .line 302
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 303
    .line 304
    .line 305
    move-result-wide v6

    .line 306
    const/4 v2, 0x0

    .line 307
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const v4, 0x40fbd70a    # 7.87f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v25, -0x3fe33333    # -2.45f

    .line 330
    .line 331
    .line 332
    const v26, 0x4094cccd    # 4.65f

    .line 333
    .line 334
    .line 335
    const v21, -0x405c28f6    # -1.28f

    .line 336
    .line 337
    .line 338
    const v22, 0x3fa3d70a    # 1.28f

    .line 339
    .line 340
    .line 341
    const v23, -0x3ffe147b    # -2.03f

    .line 342
    .line 343
    .line 344
    const v24, 0x403e147b    # 2.97f

    .line 345
    .line 346
    .line 347
    move-object/from16 v20, v2

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x40c147ae    # 6.04f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v25, 0x40951eb8    # 4.66f

    .line 359
    .line 360
    .line 361
    const v26, -0x3fe3d70a    # -2.44f

    .line 362
    .line 363
    .line 364
    const v21, 0x3fcccccd    # 1.6f

    .line 365
    .line 366
    .line 367
    const v22, -0x413851ec    # -0.39f

    .line 368
    .line 369
    .line 370
    const v23, 0x40551eb8    # 3.33f

    .line 371
    .line 372
    .line 373
    const v24, -0x4071eb85    # -1.11f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x401c28f6    # 2.44f

    .line 380
    .line 381
    .line 382
    const v26, -0x3f6bd70a    # -4.63f

    .line 383
    .line 384
    .line 385
    const v21, 0x3fa3d70a    # 1.28f

    .line 386
    .line 387
    .line 388
    const v22, -0x405c28f6    # -1.28f

    .line 389
    .line 390
    .line 391
    const v23, 0x4001eb85    # 2.03f

    .line 392
    .line 393
    .line 394
    const v24, -0x3fc33333    # -2.95f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, -0x3f3e6666    # -6.05f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v25, 0x40fbd70a    # 7.87f

    .line 407
    .line 408
    .line 409
    const v26, 0x40fbd70a    # 7.87f

    .line 410
    .line 411
    .line 412
    const v21, 0x412eb852    # 10.92f

    .line 413
    .line 414
    .line 415
    const v22, 0x40ba8f5c    # 5.83f

    .line 416
    .line 417
    .line 418
    const v23, 0x41133333    # 9.2f

    .line 419
    .line 420
    .line 421
    const v24, 0x40d1999a    # 6.55f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x411e6666    # 9.9f

    .line 431
    .line 432
    .line 433
    const/high16 v6, 0x41780000    # 15.5f

    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x40b33333    # 5.6f

    .line 439
    .line 440
    .line 441
    const v6, -0x3f4ccccd    # -5.6f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, -0x404ccccd    # -1.4f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, 0x40b33333    # 5.6f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x411e6666    # 9.9f

    .line 460
    .line 461
    .line 462
    const/high16 v6, 0x41780000    # 15.5f

    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    const v6, 0x3e99999a    # 0.3f

    .line 475
    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 488
    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    const/4 v2, 0x0

    .line 494
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    const v4, 0x41a27ae1    # 20.31f

    .line 511
    .line 512
    .line 513
    const v6, 0x406c28f6    # 3.69f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v25, 0x4182147b    # 16.26f

    .line 520
    .line 521
    .line 522
    const/high16 v26, 0x40400000    # 3.0f

    .line 523
    .line 524
    const v21, 0x419feb85    # 19.99f

    .line 525
    .line 526
    .line 527
    const v22, 0x40570a3d    # 3.36f

    .line 528
    .line 529
    .line 530
    const v23, 0x4192f5c3    # 18.37f

    .line 531
    .line 532
    .line 533
    const/high16 v24, 0x40400000    # 3.0f

    .line 534
    .line 535
    move-object/from16 v20, v2

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, -0x3ee33333    # -9.8f

    .line 541
    .line 542
    .line 543
    const v26, 0x405d70a4    # 3.46f

    .line 544
    .line 545
    .line 546
    const v21, -0x3fbe147b    # -3.03f

    .line 547
    .line 548
    .line 549
    const/16 v22, 0x0

    .line 550
    .line 551
    const v23, -0x3f1d1eb8    # -7.09f

    .line 552
    .line 553
    .line 554
    const/high16 v24, 0x3f400000    # 0.75f

    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v25, 0x406c28f6    # 3.69f

    .line 560
    .line 561
    .line 562
    const v26, 0x41a27ae1    # 20.31f

    .line 563
    .line 564
    .line 565
    const v21, 0x3fef5c29    # 1.87f

    .line 566
    .line 567
    .line 568
    const v22, 0x4130cccd    # 11.05f

    .line 569
    .line 570
    .line 571
    const v23, 0x4039999a    # 2.9f

    .line 572
    .line 573
    .line 574
    const v24, 0x419c28f6    # 19.52f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v25, 0x40f7ae14    # 7.74f

    .line 581
    .line 582
    .line 583
    const/high16 v26, 0x41a80000    # 21.0f

    .line 584
    .line 585
    const v21, 0x408051ec    # 4.01f

    .line 586
    .line 587
    .line 588
    const v22, 0x41a51eb8    # 20.64f

    .line 589
    .line 590
    .line 591
    const v23, 0x40b428f6    # 5.63f

    .line 592
    .line 593
    .line 594
    const/high16 v24, 0x41a80000    # 21.0f

    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v25, 0x411ccccd    # 9.8f

    .line 600
    .line 601
    .line 602
    const v26, -0x3fa28f5c    # -3.46f

    .line 603
    .line 604
    .line 605
    const v21, 0x4041eb85    # 3.03f

    .line 606
    .line 607
    .line 608
    const/16 v22, 0x0

    .line 609
    .line 610
    const v23, 0x40e2e148    # 7.09f

    .line 611
    .line 612
    .line 613
    const/high16 v24, -0x40c00000    # -0.75f

    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v25, 0x41a27ae1    # 20.31f

    .line 619
    .line 620
    .line 621
    const v26, 0x406c28f6    # 3.69f

    .line 622
    .line 623
    .line 624
    const v21, 0x41b10a3d    # 22.13f

    .line 625
    .line 626
    .line 627
    const v22, 0x414f3333    # 12.95f

    .line 628
    .line 629
    .line 630
    const v23, 0x41a8cccd    # 21.1f

    .line 631
    .line 632
    .line 633
    const v24, 0x408f5c29    # 4.48f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v4, 0x40f7ae14    # 7.74f

    .line 643
    .line 644
    .line 645
    const/high16 v6, 0x41980000    # 19.0f

    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v25, -0x3fde147b    # -2.53f

    .line 651
    .line 652
    .line 653
    const v26, -0x41947ae1    # -0.23f

    .line 654
    .line 655
    .line 656
    const v21, -0x406e147b    # -1.14f

    .line 657
    .line 658
    .line 659
    const/16 v22, 0x0

    .line 660
    .line 661
    const v23, -0x3ffeb852    # -2.02f

    .line 662
    .line 663
    .line 664
    const v24, -0x420a3d71    # -0.12f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v25, -0x41d1eb85    # -0.17f

    .line 671
    .line 672
    .line 673
    const v26, -0x3f8ae148    # -3.83f

    .line 674
    .line 675
    .line 676
    const v21, -0x41c7ae14    # -0.18f

    .line 677
    .line 678
    .line 679
    const v22, -0x40b5c28f    # -0.79f

    .line 680
    .line 681
    .line 682
    const v23, -0x41666666    # -0.3f

    .line 683
    .line 684
    .line 685
    const v24, -0x3ff28f5c    # -2.21f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v4, 0x408051ec    # 4.01f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v25, 0x40f7ae14    # 7.74f

    .line 698
    .line 699
    .line 700
    const/high16 v26, 0x41980000    # 19.0f

    .line 701
    .line 702
    const v21, 0x41087ae1    # 8.53f

    .line 703
    .line 704
    .line 705
    const v22, 0x4197eb85    # 18.99f

    .line 706
    .line 707
    .line 708
    const v23, 0x410147ae    # 8.08f

    .line 709
    .line 710
    .line 711
    const/high16 v24, 0x41980000    # 19.0f

    .line 712
    .line 713
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v4, 0x41810a3d    # 16.13f

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v25, -0x3f6ae148    # -4.66f

    .line 726
    .line 727
    .line 728
    const v26, 0x401c28f6    # 2.44f

    .line 729
    .line 730
    .line 731
    const v21, -0x4055c28f    # -1.33f

    .line 732
    .line 733
    .line 734
    const v22, 0x3faa3d71    # 1.33f

    .line 735
    .line 736
    .line 737
    const v23, -0x3fbc28f6    # -3.06f

    .line 738
    .line 739
    .line 740
    const v24, 0x40033333    # 2.05f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v4, -0x3f3eb852    # -6.04f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v25, 0x401ccccd    # 2.45f

    .line 753
    .line 754
    .line 755
    const v26, -0x3f6b3333    # -4.65f

    .line 756
    .line 757
    .line 758
    const v21, 0x3ed70a3d    # 0.42f

    .line 759
    .line 760
    .line 761
    const v22, -0x4028f5c3    # -1.68f

    .line 762
    .line 763
    .line 764
    const v23, 0x3f947ae1    # 1.16f

    .line 765
    .line 766
    .line 767
    const v24, -0x3fa851ec    # -3.37f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v25, 0x40947ae1    # 4.64f

    .line 774
    .line 775
    .line 776
    const v26, -0x3fe47ae1    # -2.43f

    .line 777
    .line 778
    .line 779
    const v21, 0x3fa8f5c3    # 1.32f

    .line 780
    .line 781
    .line 782
    const v22, -0x40570a3d    # -1.32f

    .line 783
    .line 784
    .line 785
    const v23, 0x40433333    # 3.05f

    .line 786
    .line 787
    .line 788
    const v24, -0x3ffd70a4    # -2.04f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v4, 0x40c1999a    # 6.05f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v25, 0x41810a3d    # 16.13f

    .line 801
    .line 802
    .line 803
    const v26, 0x41810a3d    # 16.13f

    .line 804
    .line 805
    .line 806
    const v21, 0x41913333    # 18.15f

    .line 807
    .line 808
    .line 809
    const v22, 0x4152b852    # 13.17f

    .line 810
    .line 811
    .line 812
    const v23, 0x418b3333    # 17.4f

    .line 813
    .line 814
    .line 815
    const v24, 0x416d999a    # 14.85f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v4, 0x4197ae14    # 18.96f

    .line 825
    .line 826
    .line 827
    const v6, 0x411170a4    # 9.09f

    .line 828
    .line 829
    .line 830
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v4, -0x3f7f0a3d    # -4.03f

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v25, 0x4182147b    # 16.26f

    .line 840
    .line 841
    .line 842
    const/high16 v26, 0x40a00000    # 5.0f

    .line 843
    .line 844
    const v21, 0x41773333    # 15.45f

    .line 845
    .line 846
    .line 847
    const v22, 0x40a051ec    # 5.01f

    .line 848
    .line 849
    .line 850
    const v23, 0x417e8f5c    # 15.91f

    .line 851
    .line 852
    .line 853
    const/high16 v24, 0x40a00000    # 5.0f

    .line 854
    .line 855
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v25, 0x4021eb85    # 2.53f

    .line 859
    .line 860
    .line 861
    const v26, 0x3e6b851f    # 0.23f

    .line 862
    .line 863
    .line 864
    const v21, 0x3f91eb85    # 1.14f

    .line 865
    .line 866
    .line 867
    const/16 v22, 0x0

    .line 868
    .line 869
    const v23, 0x400147ae    # 2.02f

    .line 870
    .line 871
    .line 872
    const v24, 0x3df5c28f    # 0.12f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v25, 0x4197ae14    # 18.96f

    .line 879
    .line 880
    .line 881
    const v26, 0x411170a4    # 9.09f

    .line 882
    .line 883
    .line 884
    const v21, 0x4197c28f    # 18.97f

    .line 885
    .line 886
    .line 887
    const v22, 0x40c0a3d7    # 6.02f

    .line 888
    .line 889
    .line 890
    const v23, 0x4198b852    # 19.09f

    .line 891
    .line 892
    .line 893
    const v24, 0x40ee6666    # 7.45f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    const/high16 v6, 0x3f800000    # 1.0f

    .line 907
    .line 908
    const/high16 v8, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/4 v7, 0x0

    .line 911
    const-string v4, ""

    .line 912
    .line 913
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 914
    .line 915
    .line 916
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 921
    .line 922
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 923
    .line 924
    .line 925
    move-result-wide v6

    .line 926
    const/4 v0, 0x0

    .line 927
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 931
    .line 932
    .line 933
    move-result v10

    .line 934
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 935
    .line 936
    .line 937
    move-result v11

    .line 938
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 941
    .line 942
    .line 943
    const/high16 v2, 0x41080000    # 8.5f

    .line 944
    .line 945
    const v4, 0x4161999a    # 14.1f

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v2, 0x40b33333    # 5.6f

    .line 952
    .line 953
    .line 954
    const v4, -0x3f4ccccd    # -5.6f

    .line 955
    .line 956
    .line 957
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v2, 0x3fb33333    # 1.4f

    .line 961
    .line 962
    .line 963
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const v2, 0x40b33333    # 5.6f

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    const/high16 v6, 0x3f800000    # 1.0f

    .line 980
    .line 981
    const/4 v7, 0x0

    .line 982
    const-string v4, ""

    .line 983
    .line 984
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsFootballKt;->_sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 993
    .line 994
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 995
    .line 996
    .line 997
    return-object v0
.end method

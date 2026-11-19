.class public final Landroidx/compose/material/icons/rounded/NoAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoAccounts(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoAccountsKt;->_noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoAccounts"

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
    const v4, 0x412f0a3d    # 10.94f

    .line 71
    .line 72
    .line 73
    const v6, 0x4172e148    # 15.18f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3ea3d70a    # 0.32f

    .line 80
    .line 81
    .line 82
    const v26, -0x4047ae14    # -1.44f

    .line 83
    .line 84
    .line 85
    const v21, 0x3e4ccccd    # 0.2f

    .line 86
    .line 87
    .line 88
    const v22, -0x411eb852    # -0.44f

    .line 89
    .line 90
    .line 91
    const v23, 0x3ea3d70a    # 0.32f

    .line 92
    .line 93
    .line 94
    const v24, -0x40947ae1    # -0.92f

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
    const/high16 v25, 0x41400000    # 12.0f

    .line 103
    .line 104
    const/high16 v26, 0x40c00000    # 6.0f

    .line 105
    .line 106
    const/high16 v21, 0x41780000    # 15.5f

    .line 107
    .line 108
    const v22, 0x40f23d71    # 7.57f

    .line 109
    .line 110
    .line 111
    const v23, 0x415ee148    # 13.93f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x40c00000    # 6.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x4047ae14    # -1.44f

    .line 120
    .line 121
    .line 122
    const v26, 0x3ea3d70a    # 0.32f

    .line 123
    .line 124
    .line 125
    const v21, -0x40fae148    # -0.52f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v24, 0x3df5c28f    # 0.12f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/16 v16, 0x3800

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/high16 v6, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/high16 v8, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v7, 0x0

    .line 157
    const/high16 v9, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/high16 v12, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    const/4 v15, 0x0

    .line 164
    const-string v4, ""

    .line 165
    .line 166
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    const/4 v0, 0x0

    .line 180
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x40000000    # 2.0f

    .line 197
    .line 198
    const/high16 v2, 0x41400000    # 12.0f

    .line 199
    .line 200
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v17, 0x40000000    # 2.0f

    .line 204
    .line 205
    const/high16 v18, 0x41400000    # 12.0f

    .line 206
    .line 207
    const v13, 0x40cf5c29    # 6.48f

    .line 208
    .line 209
    .line 210
    const/high16 v14, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/high16 v15, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v16, 0x40cf5c29    # 6.48f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x408f5c29    # 4.48f

    .line 221
    .line 222
    .line 223
    const/high16 v2, 0x41200000    # 10.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3f70a3d7    # -4.48f

    .line 229
    .line 230
    .line 231
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 232
    .line 233
    const/high16 v4, 0x41200000    # 10.0f

    .line 234
    .line 235
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x418c28f6    # 17.52f

    .line 239
    .line 240
    .line 241
    const/high16 v2, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/high16 v4, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41700000    # 15.0f

    .line 252
    .line 253
    const/high16 v2, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x3f3b851f    # -6.14f

    .line 259
    .line 260
    .line 261
    const v18, 0x4007ae14    # 2.12f

    .line 262
    .line 263
    .line 264
    const v13, -0x3feb851f    # -2.32f

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const v15, -0x3f71999a    # -4.45f

    .line 269
    .line 270
    .line 271
    const v16, 0x3f4ccccd    # 0.8f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x40800000    # 4.0f

    .line 278
    .line 279
    const/high16 v18, 0x41400000    # 12.0f

    .line 280
    .line 281
    const v13, 0x40966666    # 4.7f

    .line 282
    .line 283
    .line 284
    const v14, 0x417bae14    # 15.73f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x40800000    # 4.0f

    .line 288
    .line 289
    const v16, 0x415f3333    # 13.95f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x3fd851ec    # 1.69f

    .line 296
    .line 297
    .line 298
    const v18, -0x3f633333    # -4.9f

    .line 299
    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, -0x40133333    # -1.85f

    .line 303
    .line 304
    .line 305
    const v15, 0x3f2147ae    # 0.63f

    .line 306
    .line 307
    .line 308
    const v16, -0x3f9ccccd    # -3.55f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x40370a3d    # 2.86f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x403f5c29    # 2.99f

    .line 321
    .line 322
    .line 323
    const v18, 0x403f5c29    # 2.99f

    .line 324
    .line 325
    .line 326
    const v13, 0x3e570a3d    # 0.21f

    .line 327
    .line 328
    .line 329
    const v14, 0x3fc7ae14    # 1.56f

    .line 330
    .line 331
    .line 332
    const v15, 0x3fb70a3d    # 1.43f

    .line 333
    .line 334
    .line 335
    const v16, 0x40328f5c    # 2.79f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x400ccccd    # 2.2f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41400000    # 12.0f

    .line 348
    .line 349
    const/high16 v18, 0x41700000    # 15.0f

    .line 350
    .line 351
    const v13, 0x4152b852    # 13.17f

    .line 352
    .line 353
    .line 354
    const v14, 0x4170cccd    # 15.05f

    .line 355
    .line 356
    .line 357
    const v15, 0x414970a4    # 12.59f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x41700000    # 15.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x41927ae1    # 18.31f

    .line 369
    .line 370
    .line 371
    const v2, 0x41873333    # 16.9f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40e33333    # 7.1f

    .line 378
    .line 379
    .line 380
    const v2, 0x40b6147b    # 5.69f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v18, 0x40800000    # 4.0f

    .line 387
    .line 388
    const v13, 0x41073333    # 8.45f

    .line 389
    .line 390
    .line 391
    const v14, 0x409428f6    # 4.63f

    .line 392
    .line 393
    .line 394
    const v15, 0x41226666    # 10.15f

    .line 395
    .line 396
    .line 397
    const/high16 v16, 0x40800000    # 4.0f

    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x41000000    # 8.0f

    .line 403
    .line 404
    const/high16 v18, 0x41000000    # 8.0f

    .line 405
    .line 406
    const v13, 0x408d70a4    # 4.42f

    .line 407
    .line 408
    .line 409
    const/4 v14, 0x0

    .line 410
    const/high16 v15, 0x41000000    # 8.0f

    .line 411
    .line 412
    const v16, 0x40651eb8    # 3.58f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x41927ae1    # 18.31f

    .line 419
    .line 420
    .line 421
    const v18, 0x41873333    # 16.9f

    .line 422
    .line 423
    .line 424
    const/high16 v13, 0x41a00000    # 20.0f

    .line 425
    .line 426
    const v14, 0x415d999a    # 13.85f

    .line 427
    .line 428
    .line 429
    const v15, 0x419af5c3    # 19.37f

    .line 430
    .line 431
    .line 432
    const v16, 0x4178a3d7    # 15.54f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/16 v16, 0x3800

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v7, 0x0

    .line 452
    const/high16 v12, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Landroidx/compose/material/icons/rounded/NoAccountsKt;->_noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v0
.end method

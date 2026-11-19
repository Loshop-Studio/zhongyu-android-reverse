.class public final Landroidx/compose/material/icons/twotone/NoAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoAccounts(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoAccountsKt;->_noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoAccounts"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x4047ae14    # -1.44f

    .line 78
    .line 79
    .line 80
    const v26, 0x3ea3d70a    # 0.32f

    .line 81
    .line 82
    .line 83
    const v21, -0x40fae148    # -0.52f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const/high16 v23, -0x40800000    # -1.0f

    .line 89
    .line 90
    const v24, 0x3df5c28f    # 0.12f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x4093d70a    # 4.62f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, 0x3ea3d70a    # 0.32f

    .line 105
    .line 106
    .line 107
    const v26, -0x4047ae14    # -1.44f

    .line 108
    .line 109
    .line 110
    const v21, 0x3e4ccccd    # 0.2f

    .line 111
    .line 112
    .line 113
    const v22, -0x411eb852    # -0.44f

    .line 114
    .line 115
    .line 116
    const v23, 0x3ea3d70a    # 0.32f

    .line 117
    .line 118
    .line 119
    const v24, -0x40947ae1    # -0.92f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x41400000    # 12.0f

    .line 126
    .line 127
    const/high16 v26, 0x40c00000    # 6.0f

    .line 128
    .line 129
    const/high16 v21, 0x41780000    # 15.5f

    .line 130
    .line 131
    const v22, 0x40f23d71    # 7.57f

    .line 132
    .line 133
    .line 134
    const v23, 0x415ee148    # 13.93f

    .line 135
    .line 136
    .line 137
    const/high16 v24, 0x40c00000    # 6.0f

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x40000000    # 2.0f

    .line 151
    .line 152
    const/high16 v26, 0x41400000    # 12.0f

    .line 153
    .line 154
    const v21, 0x40cf5c29    # 6.48f

    .line 155
    .line 156
    .line 157
    const/high16 v22, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/high16 v23, 0x40000000    # 2.0f

    .line 160
    .line 161
    const v24, 0x40cf5c29    # 6.48f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x408f5c29    # 4.48f

    .line 168
    .line 169
    .line 170
    const/high16 v6, 0x41200000    # 10.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, -0x3f70a3d7    # -4.48f

    .line 176
    .line 177
    .line 178
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 179
    .line 180
    const/high16 v7, 0x41200000    # 10.0f

    .line 181
    .line 182
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x418c28f6    # 17.52f

    .line 186
    .line 187
    .line 188
    const/high16 v6, 0x40000000    # 2.0f

    .line 189
    .line 190
    const/high16 v7, 0x41400000    # 12.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x40800000    # 4.0f

    .line 199
    .line 200
    const/high16 v6, 0x41400000    # 12.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, 0x3fd851ec    # 1.69f

    .line 206
    .line 207
    .line 208
    const v26, -0x3f633333    # -4.9f

    .line 209
    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const v22, -0x40133333    # -1.85f

    .line 214
    .line 215
    .line 216
    const v23, 0x3f2147ae    # 0.63f

    .line 217
    .line 218
    .line 219
    const v24, -0x3f9ccccd    # -3.55f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x40370a3d    # 2.86f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x403f5c29    # 2.99f

    .line 232
    .line 233
    .line 234
    const v26, 0x403f5c29    # 2.99f

    .line 235
    .line 236
    .line 237
    const v21, 0x3e570a3d    # 0.21f

    .line 238
    .line 239
    .line 240
    const v22, 0x3fc7ae14    # 1.56f

    .line 241
    .line 242
    .line 243
    const v23, 0x3fb70a3d    # 1.43f

    .line 244
    .line 245
    .line 246
    const v24, 0x40328f5c    # 2.79f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, 0x400ccccd    # 2.2f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41400000    # 12.0f

    .line 259
    .line 260
    const/high16 v26, 0x41700000    # 15.0f

    .line 261
    .line 262
    const v21, 0x4152b852    # 13.17f

    .line 263
    .line 264
    .line 265
    const v22, 0x4170cccd    # 15.05f

    .line 266
    .line 267
    .line 268
    const v23, 0x414970a4    # 12.59f

    .line 269
    .line 270
    .line 271
    const/high16 v24, 0x41700000    # 15.0f

    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, -0x3f3b851f    # -6.14f

    .line 277
    .line 278
    .line 279
    const v26, 0x4007ae14    # 2.12f

    .line 280
    .line 281
    .line 282
    const v21, -0x3feb851f    # -2.32f

    .line 283
    .line 284
    .line 285
    const/16 v22, 0x0

    .line 286
    .line 287
    const v23, -0x3f71999a    # -4.45f

    .line 288
    .line 289
    .line 290
    const v24, 0x3f4ccccd    # 0.8f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v25, 0x40800000    # 4.0f

    .line 297
    .line 298
    const/high16 v26, 0x41400000    # 12.0f

    .line 299
    .line 300
    const v21, 0x40966666    # 4.7f

    .line 301
    .line 302
    .line 303
    const v22, 0x417bae14    # 15.73f

    .line 304
    .line 305
    .line 306
    const/high16 v23, 0x40800000    # 4.0f

    .line 307
    .line 308
    const v24, 0x415f3333    # 13.95f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41a00000    # 20.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v25, -0x3f6b3333    # -4.65f

    .line 323
    .line 324
    .line 325
    const/high16 v26, -0x40400000    # -1.5f

    .line 326
    .line 327
    const v21, -0x402147ae    # -1.74f

    .line 328
    .line 329
    .line 330
    const/16 v22, 0x0

    .line 331
    .line 332
    const v23, -0x3faa3d71    # -3.34f

    .line 333
    .line 334
    .line 335
    const v24, -0x40f0a3d7    # -0.56f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v25, 0x41400000    # 12.0f

    .line 342
    .line 343
    const/high16 v26, 0x41880000    # 17.0f

    .line 344
    .line 345
    const v21, 0x410a8f5c    # 8.66f

    .line 346
    .line 347
    .line 348
    const v22, 0x418c7ae1    # 17.56f

    .line 349
    .line 350
    .line 351
    const v23, 0x412428f6    # 10.26f

    .line 352
    .line 353
    .line 354
    const/high16 v24, 0x41880000    # 17.0f

    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, 0x3f0f5c29    # 0.56f

    .line 360
    .line 361
    .line 362
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 363
    .line 364
    const v7, 0x4094cccd    # 4.65f

    .line 365
    .line 366
    .line 367
    const v8, 0x4055c28f    # 3.34f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v26, 0x41a00000    # 20.0f

    .line 374
    .line 375
    const v21, 0x417570a4    # 15.34f

    .line 376
    .line 377
    .line 378
    const v22, 0x419b851f    # 19.44f

    .line 379
    .line 380
    .line 381
    const v23, 0x415bd70a    # 13.74f

    .line 382
    .line 383
    .line 384
    const/high16 v24, 0x41a00000    # 20.0f

    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, 0x41927ae1    # 18.31f

    .line 393
    .line 394
    .line 395
    const v6, 0x41873333    # 16.9f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x40e33333    # 7.1f

    .line 402
    .line 403
    .line 404
    const v6, 0x40b6147b    # 5.69f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v26, 0x40800000    # 4.0f

    .line 411
    .line 412
    const v21, 0x41073333    # 8.45f

    .line 413
    .line 414
    .line 415
    const v22, 0x409428f6    # 4.63f

    .line 416
    .line 417
    .line 418
    const v23, 0x41226666    # 10.15f

    .line 419
    .line 420
    .line 421
    const/high16 v24, 0x40800000    # 4.0f

    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x41000000    # 8.0f

    .line 427
    .line 428
    const/high16 v26, 0x41000000    # 8.0f

    .line 429
    .line 430
    const v21, 0x408d70a4    # 4.42f

    .line 431
    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    const/high16 v23, 0x41000000    # 8.0f

    .line 436
    .line 437
    const v24, 0x40651eb8    # 3.58f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, 0x41927ae1    # 18.31f

    .line 444
    .line 445
    .line 446
    const v26, 0x41873333    # 16.9f

    .line 447
    .line 448
    .line 449
    const/high16 v21, 0x41a00000    # 20.0f

    .line 450
    .line 451
    const v22, 0x415d999a    # 13.85f

    .line 452
    .line 453
    .line 454
    const v23, 0x419af5c3    # 19.37f

    .line 455
    .line 456
    .line 457
    const v24, 0x4178a3d7    # 15.54f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    const/16 v16, 0x3800

    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const/high16 v6, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v8, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v7, 0x0

    .line 479
    const/high16 v9, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v12, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const/4 v14, 0x0

    .line 485
    const/4 v15, 0x0

    .line 486
    const-string v4, ""

    .line 487
    .line 488
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 489
    .line 490
    .line 491
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 496
    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 498
    .line 499
    .line 500
    move-result-wide v6

    .line 501
    const/4 v0, 0x0

    .line 502
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 506
    .line 507
    .line 508
    move-result v10

    .line 509
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 510
    .line 511
    .line 512
    move-result v11

    .line 513
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41940000    # 18.5f

    .line 519
    .line 520
    const v2, 0x40eb3333    # 7.35f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x41400000    # 12.0f

    .line 527
    .line 528
    const/high16 v18, 0x41a00000    # 20.0f

    .line 529
    .line 530
    const v13, 0x410a8f5c    # 8.66f

    .line 531
    .line 532
    .line 533
    const v14, 0x419b851f    # 19.44f

    .line 534
    .line 535
    .line 536
    const v15, 0x412428f6    # 10.26f

    .line 537
    .line 538
    .line 539
    const/high16 v16, 0x41a00000    # 20.0f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x40f0a3d7    # -0.56f

    .line 545
    .line 546
    .line 547
    const/high16 v2, -0x40400000    # -1.5f

    .line 548
    .line 549
    const v4, 0x4094cccd    # 4.65f

    .line 550
    .line 551
    .line 552
    const v6, 0x4055c28f    # 3.34f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v18, 0x41880000    # 17.0f

    .line 559
    .line 560
    const v13, 0x417570a4    # 15.34f

    .line 561
    .line 562
    .line 563
    const v14, 0x418c7ae1    # 17.56f

    .line 564
    .line 565
    .line 566
    const v15, 0x415bd70a    # 13.74f

    .line 567
    .line 568
    .line 569
    const/high16 v16, 0x41880000    # 17.0f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x410a8f5c    # 8.66f

    .line 575
    .line 576
    .line 577
    const v2, 0x418c7ae1    # 17.56f

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x41940000    # 18.5f

    .line 581
    .line 582
    const v6, 0x40eb3333    # 7.35f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x4172e148    # 15.18f

    .line 592
    .line 593
    .line 594
    const v2, 0x412f0a3d    # 10.94f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, -0x3f6c28f6    # -4.62f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v18, 0x40c00000    # 6.0f

    .line 607
    .line 608
    const/high16 v13, 0x41300000    # 11.0f

    .line 609
    .line 610
    const v14, 0x40c3d70a    # 6.12f

    .line 611
    .line 612
    .line 613
    const v15, 0x4137ae14    # 11.48f

    .line 614
    .line 615
    .line 616
    const/high16 v16, 0x40c00000    # 6.0f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, 0x40600000    # 3.5f

    .line 622
    .line 623
    const/high16 v18, 0x40600000    # 3.5f

    .line 624
    .line 625
    const v13, 0x3ff70a3d    # 1.93f

    .line 626
    .line 627
    .line 628
    const/4 v14, 0x0

    .line 629
    const/high16 v15, 0x40600000    # 3.5f

    .line 630
    .line 631
    const v16, 0x3fc8f5c3    # 1.57f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x4172e148    # 15.18f

    .line 638
    .line 639
    .line 640
    const v18, 0x412f0a3d    # 10.94f

    .line 641
    .line 642
    .line 643
    const/high16 v13, 0x41780000    # 15.5f

    .line 644
    .line 645
    const v14, 0x412051ec    # 10.02f

    .line 646
    .line 647
    .line 648
    const v15, 0x4176147b    # 15.38f

    .line 649
    .line 650
    .line 651
    const/high16 v16, 0x41280000    # 10.5f

    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    const/16 v16, 0x3800

    .line 664
    .line 665
    const/16 v17, 0x0

    .line 666
    .line 667
    const v6, 0x3e99999a    # 0.3f

    .line 668
    .line 669
    .line 670
    const v8, 0x3e99999a    # 0.3f

    .line 671
    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    const/high16 v12, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const/4 v14, 0x0

    .line 678
    const/4 v15, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, Landroidx/compose/material/icons/twotone/NoAccountsKt;->_noAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    return-object v0
.end method

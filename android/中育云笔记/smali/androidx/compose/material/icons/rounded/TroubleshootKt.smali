.class public final Landroidx/compose/material/icons/rounded/TroubleshootKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTroubleshoot(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TroubleshootKt;->_troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Troubleshoot"

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
    const v4, 0x41aa51ec    # 21.29f

    .line 71
    .line 72
    .line 73
    const v6, 0x419f0a3d    # 19.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f8147ae    # -3.98f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, 0x3fca3d71    # 1.58f

    .line 86
    .line 87
    .line 88
    const v26, -0x3f39999a    # -6.2f

    .line 89
    .line 90
    .line 91
    const v21, 0x3fa66666    # 1.3f

    .line 92
    .line 93
    .line 94
    const v22, -0x402a3d71    # -1.67f

    .line 95
    .line 96
    .line 97
    const v23, 0x3ffae148    # 1.96f

    .line 98
    .line 99
    .line 100
    const v24, -0x3f89999a    # -3.85f

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
    const/high16 v25, -0x3f280000    # -6.75f

    .line 109
    .line 110
    const v26, -0x3f2c28f6    # -6.62f

    .line 111
    .line 112
    .line 113
    const v21, -0x40f5c28f    # -0.54f

    .line 114
    .line 115
    .line 116
    const v22, -0x3fa5c28f    # -3.41f

    .line 117
    .line 118
    .line 119
    const v23, -0x3faae148    # -3.33f

    .line 120
    .line 121
    .line 122
    const v24, -0x3f3b851f    # -6.14f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, 0x40447ae1    # 3.07f

    .line 129
    .line 130
    .line 131
    const/high16 v26, 0x41200000    # 10.0f

    .line 132
    .line 133
    const v21, 0x40f23d71    # 7.57f

    .line 134
    .line 135
    .line 136
    const v22, 0x401c28f6    # 2.44f

    .line 137
    .line 138
    .line 139
    const v23, 0x40670a3d    # 3.61f

    .line 140
    .line 141
    .line 142
    const v24, 0x40b6147b    # 5.69f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x400147ae    # 2.02f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x40db3333    # 6.85f

    .line 155
    .line 156
    .line 157
    const v26, -0x3f623d71    # -4.93f

    .line 158
    .line 159
    .line 160
    const v21, 0x3f07ae14    # 0.53f

    .line 161
    .line 162
    .line 163
    const v22, -0x3fb7ae14    # -3.13f

    .line 164
    .line 165
    .line 166
    const v23, 0x405eb852    # 3.48f

    .line 167
    .line 168
    .line 169
    const v24, -0x3f51eb85    # -5.44f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x40a0a3d7    # 5.02f

    .line 176
    .line 177
    .line 178
    const v26, 0x40a66666    # 5.2f

    .line 179
    .line 180
    .line 181
    const v21, 0x40270a3d    # 2.61f

    .line 182
    .line 183
    .line 184
    const v22, 0x3ecccccd    # 0.4f

    .line 185
    .line 186
    .line 187
    const v23, 0x40966666    # 4.7f

    .line 188
    .line 189
    .line 190
    const v24, 0x40247ae1    # 2.57f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x41300000    # 11.0f

    .line 197
    .line 198
    const/high16 v26, 0x41880000    # 17.0f

    .line 199
    .line 200
    const v21, 0x418b1eb8    # 17.39f

    .line 201
    .line 202
    .line 203
    const v22, 0x415e6666    # 13.9f

    .line 204
    .line 205
    .line 206
    const v23, 0x4168cccd    # 14.55f

    .line 207
    .line 208
    .line 209
    const/high16 v24, 0x41880000    # 17.0f

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, -0x3f51999a    # -5.45f

    .line 215
    .line 216
    .line 217
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 218
    .line 219
    const v21, -0x3fe51eb8    # -2.42f

    .line 220
    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const/high16 v23, -0x3f700000    # -4.5f

    .line 225
    .line 226
    const v24, -0x4047ae14    # -1.44f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, 0x4059999a    # 3.4f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, 0x41300000    # 11.0f

    .line 239
    .line 240
    const/high16 v26, 0x41980000    # 19.0f

    .line 241
    .line 242
    const v21, 0x408e6666    # 4.45f

    .line 243
    .line 244
    .line 245
    const v22, 0x4185851f    # 16.69f

    .line 246
    .line 247
    .line 248
    const v23, 0x40eeb852    # 7.46f

    .line 249
    .line 250
    .line 251
    const/high16 v24, 0x41980000    # 19.0f

    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x409ccccd    # 4.9f

    .line 257
    .line 258
    .line 259
    const v26, -0x4027ae14    # -1.69f

    .line 260
    .line 261
    .line 262
    const v21, 0x3feccccd    # 1.85f

    .line 263
    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const v23, 0x40633333    # 3.55f

    .line 268
    .line 269
    .line 270
    const v24, -0x40deb852    # -0.63f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x407eb852    # 3.98f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v25, 0x3fb47ae1    # 1.41f

    .line 283
    .line 284
    .line 285
    const/16 v26, 0x0

    .line 286
    .line 287
    const v21, 0x3ec7ae14    # 0.39f

    .line 288
    .line 289
    .line 290
    const v22, 0x3ec7ae14    # 0.39f

    .line 291
    .line 292
    .line 293
    const v23, 0x3f828f5c    # 1.02f

    .line 294
    .line 295
    .line 296
    const v24, 0x3ec7ae14    # 0.39f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v25, 0x41aa51ec    # 21.29f

    .line 307
    .line 308
    .line 309
    const v26, 0x419f0a3d    # 19.88f

    .line 310
    .line 311
    .line 312
    const v21, 0x41ad70a4    # 21.68f

    .line 313
    .line 314
    .line 315
    const v22, 0x41a73333    # 20.9f

    .line 316
    .line 317
    .line 318
    const v23, 0x41ad70a4    # 21.68f

    .line 319
    .line 320
    .line 321
    const v24, 0x41a228f6    # 20.27f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    const/16 v16, 0x3800

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const/high16 v6, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v8, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const/high16 v9, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v12, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const/4 v14, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    const-string v4, ""

    .line 351
    .line 352
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 353
    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 360
    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    const/4 v0, 0x0

    .line 366
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    const v0, 0x411b0a3d    # 9.69f

    .line 383
    .line 384
    .line 385
    const v2, 0x4106e148    # 8.43f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3f83d70a    # 1.03f

    .line 392
    .line 393
    .line 394
    const v2, 0x408f0a3d    # 4.47f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x412828f6    # 10.51f

    .line 401
    .line 402
    .line 403
    const/high16 v18, 0x41700000    # 15.0f

    .line 404
    .line 405
    const v13, 0x41191eb8    # 9.57f

    .line 406
    .line 407
    .line 408
    const v14, 0x416a6666    # 14.65f

    .line 409
    .line 410
    .line 411
    const v15, 0x412028f6    # 10.01f

    .line 412
    .line 413
    .line 414
    const/high16 v16, 0x41700000    # 15.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/4 v0, 0x0

    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, 0x3f828f5c    # 1.02f

    .line 424
    .line 425
    .line 426
    const v18, -0x40c28f5c    # -0.74f

    .line 427
    .line 428
    .line 429
    const v13, 0x3eeb851f    # 0.46f

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const v15, 0x3f5eb852    # 0.87f

    .line 434
    .line 435
    .line 436
    const v16, -0x41666666    # -0.3f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f8147ae    # 1.01f

    .line 443
    .line 444
    .line 445
    const v2, -0x3fbd70a4    # -3.04f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x3f30a3d7    # 0.69f

    .line 452
    .line 453
    .line 454
    const v2, 0x3fd47ae1    # 1.66f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3f6b851f    # 0.92f

    .line 461
    .line 462
    .line 463
    const v18, 0x3f1eb852    # 0.62f

    .line 464
    .line 465
    .line 466
    const v13, 0x3e23d70a    # 0.16f

    .line 467
    .line 468
    .line 469
    const v14, 0x3ebd70a4    # 0.37f

    .line 470
    .line 471
    .line 472
    const v15, 0x3f051eb8    # 0.52f

    .line 473
    .line 474
    .line 475
    const v16, 0x3f1eb852    # 0.62f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3f147ae1    # 0.58f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, 0x3f400000    # 0.75f

    .line 488
    .line 489
    const/high16 v18, -0x40c00000    # -0.75f

    .line 490
    .line 491
    const v13, 0x3ed1eb85    # 0.41f

    .line 492
    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const/high16 v15, 0x3f400000    # 0.75f

    .line 496
    .line 497
    const v16, -0x4151eb85    # -0.34f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/4 v0, 0x0

    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, -0x40c00000    # -0.75f

    .line 508
    .line 509
    const/4 v13, 0x0

    .line 510
    const v14, -0x412e147b    # -0.41f

    .line 511
    .line 512
    .line 513
    const v15, -0x4151eb85    # -0.34f

    .line 514
    .line 515
    .line 516
    const/high16 v16, -0x40c00000    # -0.75f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x41680000    # 14.5f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x4087ae14    # -0.97f

    .line 527
    .line 528
    .line 529
    const v2, -0x3fea3d71    # -2.34f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x41487ae1    # 12.53f

    .line 536
    .line 537
    .line 538
    const/high16 v18, 0x41100000    # 9.0f

    .line 539
    .line 540
    const v13, 0x4155c28f    # 13.36f

    .line 541
    .line 542
    .line 543
    const v14, 0x411428f6    # 9.26f

    .line 544
    .line 545
    .line 546
    const v15, 0x414f851f    # 12.97f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x41100000    # 9.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x42b33333    # -0.05f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x407d70a4    # -1.02f

    .line 561
    .line 562
    .line 563
    const v18, 0x3f3d70a4    # 0.74f

    .line 564
    .line 565
    .line 566
    const v13, -0x41147ae1    # -0.46f

    .line 567
    .line 568
    .line 569
    const/4 v14, 0x0

    .line 570
    const v15, -0x40a147ae    # -0.87f

    .line 571
    .line 572
    .line 573
    const v16, 0x3e99999a    # 0.3f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x409eb852    # -0.88f

    .line 580
    .line 581
    .line 582
    const v2, 0x402851ec    # 2.63f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x4118a3d7    # 9.54f

    .line 589
    .line 590
    .line 591
    const v2, 0x40fa8f5c    # 7.83f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x4107d70a    # 8.49f

    .line 598
    .line 599
    .line 600
    const/high16 v18, 0x40e00000    # 7.0f

    .line 601
    .line 602
    const v13, 0x4116e148    # 9.43f

    .line 603
    .line 604
    .line 605
    const v14, 0x40eb3333    # 7.35f

    .line 606
    .line 607
    .line 608
    const v15, 0x410fd70a    # 8.99f

    .line 609
    .line 610
    .line 611
    const/high16 v16, 0x40e00000    # 7.0f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/4 v0, 0x0

    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, 0x40eeb852    # 7.46f

    .line 621
    .line 622
    .line 623
    const v18, 0x40f851ec    # 7.76f

    .line 624
    .line 625
    .line 626
    const v13, 0x410051ec    # 8.02f

    .line 627
    .line 628
    .line 629
    const/high16 v14, 0x40e00000    # 7.0f

    .line 630
    .line 631
    const v15, 0x40f33333    # 7.6f

    .line 632
    .line 633
    .line 634
    const v16, 0x40e9eb85    # 7.31f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x40ce6666    # 6.45f

    .line 641
    .line 642
    .line 643
    const/high16 v2, 0x41300000    # 11.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, -0x3f69999a    # -4.7f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v17, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v18, 0x413c0000    # 11.75f

    .line 657
    .line 658
    const v13, 0x3fab851f    # 1.34f

    .line 659
    .line 660
    .line 661
    const/high16 v14, 0x41300000    # 11.0f

    .line 662
    .line 663
    const/high16 v15, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const v16, 0x413570a4    # 11.34f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/4 v0, 0x0

    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v17, 0x3f400000    # 0.75f

    .line 676
    .line 677
    const/high16 v18, 0x3f400000    # 0.75f

    .line 678
    .line 679
    const/4 v13, 0x0

    .line 680
    const v14, 0x3ed1eb85    # 0.41f

    .line 681
    .line 682
    .line 683
    const v15, 0x3eae147b    # 0.34f

    .line 684
    .line 685
    .line 686
    const/high16 v16, 0x3f400000    # 0.75f

    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x40a23d71    # 5.07f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v17, 0x3f733333    # 0.95f

    .line 698
    .line 699
    .line 700
    const v18, -0x40cccccd    # -0.7f

    .line 701
    .line 702
    .line 703
    const v13, 0x3ee147ae    # 0.44f

    .line 704
    .line 705
    .line 706
    const/4 v14, 0x0

    .line 707
    const v15, 0x3f51eb85    # 0.82f

    .line 708
    .line 709
    .line 710
    const v16, -0x4170a3d7    # -0.28f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v0, 0x411b0a3d    # 9.69f

    .line 717
    .line 718
    .line 719
    const v2, 0x4106e148    # 8.43f

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    const/16 v16, 0x3800

    .line 733
    .line 734
    const/16 v17, 0x0

    .line 735
    .line 736
    const/high16 v6, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/4 v7, 0x0

    .line 739
    const/high16 v12, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/4 v13, 0x0

    .line 742
    const/4 v15, 0x0

    .line 743
    const-string v4, ""

    .line 744
    .line 745
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    sput-object v0, Landroidx/compose/material/icons/rounded/TroubleshootKt;->_troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/RocketLaunchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRocketLaunch(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RocketLaunch"

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
    const v4, 0x4195ae14    # 18.71f

    .line 71
    .line 72
    .line 73
    const v6, 0x40d6b852    # 6.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3ff51eb8    # -2.17f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f428f5c    # 0.76f

    .line 83
    .line 84
    .line 85
    const v21, -0x4170a3d7    # -0.28f

    .line 86
    .line 87
    .line 88
    const v22, 0x3e8f5c29    # 0.28f

    .line 89
    .line 90
    .line 91
    const v23, -0x3ff51eb8    # -2.17f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f428f5c    # 0.76f

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
    const v4, -0x3ff51eb8    # -2.17f

    .line 103
    .line 104
    .line 105
    const v6, 0x3f428f5c    # 0.76f

    .line 106
    .line 107
    .line 108
    const v7, 0x3ef0a3d7    # 0.47f

    .line 109
    .line 110
    .line 111
    const v8, -0x400f5c29    # -1.88f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v7, v8, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const/high16 v26, 0x41880000    # 17.0f

    .line 120
    .line 121
    const v21, 0x40af0a3d    # 5.47f

    .line 122
    .line 123
    .line 124
    const v22, 0x4188e148    # 17.11f

    .line 125
    .line 126
    .line 127
    const v23, 0x40b70a3d    # 5.72f

    .line 128
    .line 129
    .line 130
    const/high16 v24, 0x41880000    # 17.0f

    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v26, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const v21, 0x3f0ccccd    # 0.55f

    .line 140
    .line 141
    .line 142
    const/16 v22, 0x0

    .line 143
    .line 144
    const/high16 v23, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const v24, 0x3ee66666    # 0.45f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v25, 0x40d6b852    # 6.71f

    .line 153
    .line 154
    .line 155
    const v26, 0x4195ae14    # 18.71f

    .line 156
    .line 157
    .line 158
    const/high16 v21, 0x40e00000    # 7.0f

    .line 159
    .line 160
    const v22, 0x41923d71    # 18.28f

    .line 161
    .line 162
    .line 163
    const v23, 0x40dc7ae1    # 6.89f

    .line 164
    .line 165
    .line 166
    const v24, 0x41943d71    # 18.53f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, 0x412d47ae    # 10.83f

    .line 176
    .line 177
    .line 178
    const v6, 0x40ed1eb8    # 7.41f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x412028f6    # 10.01f

    .line 185
    .line 186
    .line 187
    const/high16 v6, 0x40b00000    # 5.5f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x3ffc28f6    # 1.97f

    .line 193
    .line 194
    .line 195
    const v6, -0x4003d70a    # -1.97f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x3e947ae1    # 0.29f

    .line 202
    .line 203
    .line 204
    const v6, 0x3fb851ec    # 1.44f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, 0x40ed1eb8    # 7.41f

    .line 211
    .line 212
    .line 213
    const v26, 0x412d47ae    # 10.83f

    .line 214
    .line 215
    .line 216
    const v21, 0x410570a4    # 8.34f

    .line 217
    .line 218
    .line 219
    const v22, 0x41128f5c    # 9.16f

    .line 220
    .line 221
    .line 222
    const v23, 0x40fa8f5c    # 7.83f

    .line 223
    .line 224
    .line 225
    const v24, 0x41207ae1    # 10.03f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x41940000    # 18.5f

    .line 235
    .line 236
    const v6, 0x415fd70a    # 13.99f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, -0x40ae147b    # -0.82f

    .line 243
    .line 244
    .line 245
    const v6, -0x400b851f    # -1.91f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, 0x401f5c29    # 2.49f

    .line 252
    .line 253
    .line 254
    const/high16 v26, -0x40400000    # -1.5f

    .line 255
    .line 256
    const v21, 0x3f4ccccd    # 0.8f

    .line 257
    .line 258
    .line 259
    const v22, -0x4128f5c3    # -0.42f

    .line 260
    .line 261
    .line 262
    const v23, 0x3fd5c28f    # 1.67f

    .line 263
    .line 264
    .line 265
    const v24, -0x4091eb85    # -0.93f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x3e947ae1    # 0.29f

    .line 272
    .line 273
    .line 274
    const v6, 0x3fb851ec    # 1.44f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x41940000    # 18.5f

    .line 281
    .line 282
    const v6, 0x415fd70a    # 13.99f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x419feb85    # 19.99f

    .line 292
    .line 293
    .line 294
    const v6, 0x408051ec    # 4.01f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v25, -0x3efc51ec    # -8.23f

    .line 301
    .line 302
    .line 303
    const v26, 0x407f5c29    # 3.99f

    .line 304
    .line 305
    .line 306
    const/16 v21, 0x0

    .line 307
    .line 308
    const/16 v22, 0x0

    .line 309
    .line 310
    const v23, -0x3f9ccccd    # -3.55f

    .line 311
    .line 312
    .line 313
    const v24, -0x40cf5c29    # -0.69f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, -0x3fd147ae    # -2.73f

    .line 320
    .line 321
    .line 322
    const v26, 0x408147ae    # 4.04f

    .line 323
    .line 324
    .line 325
    const v21, -0x40570a3d    # -1.32f

    .line 326
    .line 327
    .line 328
    const v22, 0x3fa8f5c3    # 1.32f

    .line 329
    .line 330
    .line 331
    const v23, -0x3fe66666    # -2.4f

    .line 332
    .line 333
    .line 334
    const v24, 0x405851ec    # 3.38f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, 0x403b851f    # 2.93f

    .line 341
    .line 342
    .line 343
    const v6, 0x403b851f    # 2.93f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v25, 0x408147ae    # 4.04f

    .line 350
    .line 351
    .line 352
    const v26, -0x3fd147ae    # -2.73f

    .line 353
    .line 354
    .line 355
    const v21, 0x3f266666    # 0.65f

    .line 356
    .line 357
    .line 358
    const v22, -0x415c28f6    # -0.32f

    .line 359
    .line 360
    .line 361
    const v23, 0x402d70a4    # 2.71f

    .line 362
    .line 363
    .line 364
    const v24, -0x404ccccd    # -1.4f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, 0x419feb85    # 19.99f

    .line 371
    .line 372
    .line 373
    const v26, 0x408051ec    # 4.01f

    .line 374
    .line 375
    .line 376
    const v21, 0x41a570a4    # 20.68f

    .line 377
    .line 378
    .line 379
    const v22, 0x40f1eb85    # 7.56f

    .line 380
    .line 381
    .line 382
    const v23, 0x419feb85    # 19.99f

    .line 383
    .line 384
    .line 385
    const v24, 0x408051ec    # 4.01f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41300000    # 11.0f

    .line 395
    .line 396
    const/high16 v6, 0x41700000    # 15.0f

    .line 397
    .line 398
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, -0x40000000    # -2.0f

    .line 402
    .line 403
    const/high16 v26, -0x40000000    # -2.0f

    .line 404
    .line 405
    const v21, -0x40733333    # -1.1f

    .line 406
    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/high16 v23, -0x40000000    # -2.0f

    .line 411
    .line 412
    const v24, -0x4099999a    # -0.9f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, 0x40000000    # 2.0f

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const v22, -0x40733333    # -1.1f

    .line 423
    .line 424
    .line 425
    const v23, 0x3f666666    # 0.9f

    .line 426
    .line 427
    .line 428
    const/high16 v24, -0x40000000    # -2.0f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x3f666666    # 0.9f

    .line 434
    .line 435
    .line 436
    const/high16 v6, 0x40000000    # 2.0f

    .line 437
    .line 438
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x41700000    # 15.0f

    .line 442
    .line 443
    const/high16 v26, 0x41300000    # 11.0f

    .line 444
    .line 445
    const/high16 v21, 0x41880000    # 17.0f

    .line 446
    .line 447
    const v22, 0x4121999a    # 10.1f

    .line 448
    .line 449
    .line 450
    const v23, 0x4180cccd    # 16.1f

    .line 451
    .line 452
    .line 453
    const/high16 v24, 0x41300000    # 11.0f

    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/16 v16, 0x3800

    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const v6, 0x3e99999a    # 0.3f

    .line 470
    .line 471
    .line 472
    const v8, 0x3e99999a    # 0.3f

    .line 473
    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const/high16 v9, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v12, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const/4 v14, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    const-string v4, ""

    .line 484
    .line 485
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 486
    .line 487
    .line 488
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 493
    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 495
    .line 496
    .line 497
    move-result-wide v6

    .line 498
    const/4 v0, 0x0

    .line 499
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 507
    .line 508
    .line 509
    move-result v11

    .line 510
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40c00000    # 6.0f

    .line 516
    .line 517
    const/high16 v2, 0x41700000    # 15.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, -0x3ff851ec    # -2.12f

    .line 523
    .line 524
    .line 525
    const v18, 0x3f6147ae    # 0.88f

    .line 526
    .line 527
    .line 528
    const v13, -0x40ab851f    # -0.83f

    .line 529
    .line 530
    .line 531
    const v15, -0x4035c28f    # -1.58f

    .line 532
    .line 533
    .line 534
    const v16, 0x3eae147b    # 0.34f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x40000000    # 2.0f

    .line 541
    .line 542
    const/high16 v18, 0x41b00000    # 22.0f

    .line 543
    .line 544
    const v13, 0x402ccccd    # 2.7f

    .line 545
    .line 546
    .line 547
    const v14, 0x41887ae1    # 17.06f

    .line 548
    .line 549
    .line 550
    const/high16 v15, 0x40000000    # 2.0f

    .line 551
    .line 552
    const/high16 v16, 0x41b00000    # 22.0f

    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x40cccccd    # -0.7f

    .line 558
    .line 559
    .line 560
    const v2, 0x40c3d70a    # 6.12f

    .line 561
    .line 562
    .line 563
    const v4, -0x400f5c29    # -1.88f

    .line 564
    .line 565
    .line 566
    const v6, 0x409e147b    # 4.94f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, 0x41100000    # 9.0f

    .line 573
    .line 574
    const/high16 v18, 0x41900000    # 18.0f

    .line 575
    .line 576
    const v13, 0x410a8f5c    # 8.66f

    .line 577
    .line 578
    .line 579
    const v14, 0x419ca3d7    # 19.58f

    .line 580
    .line 581
    .line 582
    const/high16 v15, 0x41100000    # 9.0f

    .line 583
    .line 584
    const v16, 0x4196a3d7    # 18.83f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x40c00000    # 6.0f

    .line 591
    .line 592
    const/high16 v18, 0x41700000    # 15.0f

    .line 593
    .line 594
    const/high16 v13, 0x41100000    # 9.0f

    .line 595
    .line 596
    const v14, 0x4182b852    # 16.34f

    .line 597
    .line 598
    .line 599
    const v15, 0x40f51eb8    # 7.66f

    .line 600
    .line 601
    .line 602
    const/high16 v16, 0x41700000    # 15.0f

    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x4195ae14    # 18.71f

    .line 611
    .line 612
    .line 613
    const v2, 0x40d6b852    # 6.71f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, -0x3ff51eb8    # -2.17f

    .line 620
    .line 621
    .line 622
    const v18, 0x3f428f5c    # 0.76f

    .line 623
    .line 624
    .line 625
    const v13, -0x4170a3d7    # -0.28f

    .line 626
    .line 627
    .line 628
    const v14, 0x3e8f5c29    # 0.28f

    .line 629
    .line 630
    .line 631
    const v15, -0x3ff51eb8    # -2.17f

    .line 632
    .line 633
    .line 634
    const v16, 0x3f428f5c    # 0.76f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, -0x3ff51eb8    # -2.17f

    .line 641
    .line 642
    .line 643
    const v2, 0x3f428f5c    # 0.76f

    .line 644
    .line 645
    .line 646
    const v4, 0x3ef0a3d7    # 0.47f

    .line 647
    .line 648
    .line 649
    const v6, -0x400f5c29    # -1.88f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v4, v6, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x40c00000    # 6.0f

    .line 656
    .line 657
    const/high16 v18, 0x41880000    # 17.0f

    .line 658
    .line 659
    const v13, 0x40af0a3d    # 5.47f

    .line 660
    .line 661
    .line 662
    const v14, 0x4188e148    # 17.11f

    .line 663
    .line 664
    .line 665
    const v15, 0x40b70a3d    # 5.72f

    .line 666
    .line 667
    .line 668
    const/high16 v16, 0x41880000    # 17.0f

    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v17, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/high16 v18, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const v13, 0x3f0ccccd    # 0.55f

    .line 678
    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    const/high16 v15, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const v16, 0x3ee66666    # 0.45f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x40d6b852    # 6.71f

    .line 690
    .line 691
    .line 692
    const v18, 0x4195ae14    # 18.71f

    .line 693
    .line 694
    .line 695
    const/high16 v13, 0x40e00000    # 7.0f

    .line 696
    .line 697
    const v14, 0x41923d71    # 18.28f

    .line 698
    .line 699
    .line 700
    const v15, 0x40dc7ae1    # 6.89f

    .line 701
    .line 702
    .line 703
    const v16, 0x41943d71    # 18.53f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x415a6666    # 13.65f

    .line 713
    .line 714
    .line 715
    const v2, 0x418b5c29    # 17.42f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x4087ae14    # 4.24f

    .line 725
    .line 726
    .line 727
    const v18, -0x3ecb0a3d    # -11.31f

    .line 728
    .line 729
    .line 730
    const v13, 0x40cb851f    # 6.36f

    .line 731
    .line 732
    .line 733
    const v14, -0x3f347ae1    # -6.36f

    .line 734
    .line 735
    .line 736
    const v15, 0x4087ae14    # 4.24f

    .line 737
    .line 738
    .line 739
    const v16, -0x3ecb0a3d    # -11.31f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, -0x3ecb0a3d    # -11.31f

    .line 746
    .line 747
    .line 748
    const v2, 0x4087ae14    # 4.24f

    .line 749
    .line 750
    .line 751
    const v4, -0x3f61999a    # -4.95f

    .line 752
    .line 753
    .line 754
    const v6, -0x3ff851ec    # -2.12f

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, -0x3fe0a3d7    # -2.49f

    .line 761
    .line 762
    .line 763
    const/high16 v2, -0x41000000    # -0.5f

    .line 764
    .line 765
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x40c1999a    # 6.05f

    .line 769
    .line 770
    .line 771
    const v18, 0x40d428f6    # 6.63f

    .line 772
    .line 773
    .line 774
    const v13, 0x40e6b852    # 7.21f

    .line 775
    .line 776
    .line 777
    const v14, 0x40be6666    # 5.95f

    .line 778
    .line 779
    .line 780
    const v15, 0x40d0f5c3    # 6.53f

    .line 781
    .line 782
    .line 783
    const v16, 0x40c51eb8    # 6.16f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x412b0a3d    # 10.69f

    .line 790
    .line 791
    .line 792
    const/high16 v2, 0x40000000    # 2.0f

    .line 793
    .line 794
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v0, 0x40a00000    # 5.0f

    .line 798
    .line 799
    const v2, 0x4008f5c3    # 2.14f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, 0x4132b852    # 11.17f

    .line 806
    .line 807
    .line 808
    const/high16 v2, 0x41880000    # 17.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x4008f5c3    # 2.14f

    .line 814
    .line 815
    .line 816
    const/high16 v2, 0x40a00000    # 5.0f

    .line 817
    .line 818
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v0, 0x4081999a    # 4.05f

    .line 822
    .line 823
    .line 824
    const v2, -0x3f7e6666    # -4.05f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v17, 0x3f0ccccd    # 0.55f

    .line 831
    .line 832
    .line 833
    const v18, -0x401851ec    # -1.81f

    .line 834
    .line 835
    .line 836
    const v13, 0x3ef0a3d7    # 0.47f

    .line 837
    .line 838
    .line 839
    const v14, -0x410f5c29    # -0.47f

    .line 840
    .line 841
    .line 842
    const v15, 0x3f2e147b    # 0.68f

    .line 843
    .line 844
    .line 845
    const v16, -0x406ccccd    # -1.15f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, 0x415a6666    # 13.65f

    .line 852
    .line 853
    .line 854
    const v2, 0x418b5c29    # 17.42f

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v0, 0x412d47ae    # 10.83f

    .line 864
    .line 865
    .line 866
    const v2, 0x40ed1eb8    # 7.41f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x412028f6    # 10.01f

    .line 873
    .line 874
    .line 875
    const/high16 v2, 0x40b00000    # 5.5f

    .line 876
    .line 877
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v0, 0x3ffc28f6    # 1.97f

    .line 881
    .line 882
    .line 883
    const v2, -0x4003d70a    # -1.97f

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v0, 0x3e947ae1    # 0.29f

    .line 890
    .line 891
    .line 892
    const v2, 0x3fb851ec    # 1.44f

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v17, 0x40ed1eb8    # 7.41f

    .line 899
    .line 900
    .line 901
    const v18, 0x412d47ae    # 10.83f

    .line 902
    .line 903
    .line 904
    const v13, 0x410570a4    # 8.34f

    .line 905
    .line 906
    .line 907
    const v14, 0x41128f5c    # 9.16f

    .line 908
    .line 909
    .line 910
    const v15, 0x40fa8f5c    # 7.83f

    .line 911
    .line 912
    .line 913
    const v16, 0x41207ae1    # 10.03f

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v0, 0x41940000    # 18.5f

    .line 923
    .line 924
    const v2, 0x415fd70a    # 13.99f

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, -0x40ae147b    # -0.82f

    .line 931
    .line 932
    .line 933
    const v2, -0x400b851f    # -1.91f

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v17, 0x401f5c29    # 2.49f

    .line 940
    .line 941
    .line 942
    const/high16 v18, -0x40400000    # -1.5f

    .line 943
    .line 944
    const v13, 0x3f4ccccd    # 0.8f

    .line 945
    .line 946
    .line 947
    const v14, -0x4128f5c3    # -0.42f

    .line 948
    .line 949
    .line 950
    const v15, 0x3fd5c28f    # 1.67f

    .line 951
    .line 952
    .line 953
    const v16, -0x4091eb85    # -0.93f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v0, 0x3e947ae1    # 0.29f

    .line 960
    .line 961
    .line 962
    const v2, 0x3fb851ec    # 1.44f

    .line 963
    .line 964
    .line 965
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const/high16 v0, 0x41940000    # 18.5f

    .line 969
    .line 970
    const v2, 0x415fd70a    # 13.99f

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const/high16 v0, 0x41800000    # 16.0f

    .line 980
    .line 981
    const v2, 0x4143d70a    # 12.24f

    .line 982
    .line 983
    .line 984
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const v17, -0x3f7eb852    # -4.04f

    .line 988
    .line 989
    .line 990
    const v18, 0x402eb852    # 2.73f

    .line 991
    .line 992
    .line 993
    const v13, -0x40570a3d    # -1.32f

    .line 994
    .line 995
    .line 996
    const v14, 0x3fa8f5c3    # 1.32f

    .line 997
    .line 998
    .line 999
    const v15, -0x3fa7ae14    # -3.38f

    .line 1000
    .line 1001
    .line 1002
    const v16, 0x4019999a    # 2.4f

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, -0x3fc47ae1    # -2.93f

    .line 1009
    .line 1010
    .line 1011
    const v2, -0x3fc47ae1    # -2.93f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v17, 0x402eb852    # 2.73f

    .line 1018
    .line 1019
    .line 1020
    const v18, -0x3f7eb852    # -4.04f

    .line 1021
    .line 1022
    .line 1023
    const v13, 0x3ea3d70a    # 0.32f

    .line 1024
    .line 1025
    .line 1026
    const v14, -0x40d9999a    # -0.65f

    .line 1027
    .line 1028
    .line 1029
    const v15, 0x3fb33333    # 1.4f

    .line 1030
    .line 1031
    .line 1032
    const v16, -0x3fd28f5c    # -2.71f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const v17, 0x4103ae14    # 8.23f

    .line 1039
    .line 1040
    .line 1041
    const v18, -0x3f80a3d7    # -3.99f

    .line 1042
    .line 1043
    .line 1044
    const v13, 0x4095c28f    # 4.68f

    .line 1045
    .line 1046
    .line 1047
    const v14, -0x3f6a3d71    # -4.68f

    .line 1048
    .line 1049
    .line 1050
    const v15, 0x4103ae14    # 8.23f

    .line 1051
    .line 1052
    .line 1053
    const v16, -0x3f80a3d7    # -3.99f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const/high16 v0, 0x41800000    # 16.0f

    .line 1060
    .line 1061
    const v2, 0x4143d70a    # 12.24f

    .line 1062
    .line 1063
    .line 1064
    const v4, 0x41a570a4    # 20.68f

    .line 1065
    .line 1066
    .line 1067
    const v6, 0x40f1eb85    # 7.56f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const/high16 v0, 0x41300000    # 11.0f

    .line 1077
    .line 1078
    const/high16 v2, 0x41700000    # 15.0f

    .line 1079
    .line 1080
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const/high16 v17, 0x40000000    # 2.0f

    .line 1084
    .line 1085
    const/high16 v18, -0x40000000    # -2.0f

    .line 1086
    .line 1087
    const v13, 0x3f8ccccd    # 1.1f

    .line 1088
    .line 1089
    .line 1090
    const/4 v14, 0x0

    .line 1091
    const/high16 v15, 0x40000000    # 2.0f

    .line 1092
    .line 1093
    const v16, -0x4099999a    # -0.9f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const v0, -0x4099999a    # -0.9f

    .line 1100
    .line 1101
    .line 1102
    const/high16 v2, -0x40000000    # -2.0f

    .line 1103
    .line 1104
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v0, 0x3f666666    # 0.9f

    .line 1108
    .line 1109
    .line 1110
    const/high16 v4, 0x40000000    # 2.0f

    .line 1111
    .line 1112
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const v0, 0x415e6666    # 13.9f

    .line 1116
    .line 1117
    .line 1118
    const/high16 v2, 0x41300000    # 11.0f

    .line 1119
    .line 1120
    const/high16 v4, 0x41700000    # 15.0f

    .line 1121
    .line 1122
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    const/16 v16, 0x3800

    .line 1133
    .line 1134
    const/16 v17, 0x0

    .line 1135
    .line 1136
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1137
    .line 1138
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1139
    .line 1140
    const/4 v7, 0x0

    .line 1141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1142
    .line 1143
    const/4 v13, 0x0

    .line 1144
    const/4 v15, 0x0

    .line 1145
    const-string v4, ""

    .line 1146
    .line 1147
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    sput-object v0, Landroidx/compose/material/icons/twotone/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1156
    .line 1157
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1158
    .line 1159
    .line 1160
    return-object v0
.end method

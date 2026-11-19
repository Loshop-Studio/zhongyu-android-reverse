.class public final Landroidx/compose/material/icons/twotone/LocalFloristKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFlorist(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalFlorist"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3f91eb85    # 1.14f

    .line 78
    .line 79
    .line 80
    const v26, -0x40733333    # -1.1f

    .line 81
    .line 82
    .line 83
    const v21, 0x3f1eb852    # 0.62f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3f8f5c29    # 1.12f

    .line 89
    .line 90
    .line 91
    const v24, -0x41051eb8    # -0.49f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x421eb852    # -0.11f

    .line 100
    .line 101
    .line 102
    const v6, -0x40747ae1    # -1.09f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x407c28f6    # -1.03f

    .line 109
    .line 110
    .line 111
    const v26, 0x3e428f5c    # 0.19f

    .line 112
    .line 113
    .line 114
    const v21, -0x415c28f6    # -0.32f

    .line 115
    .line 116
    .line 117
    const v22, 0x3df5c28f    # 0.12f

    .line 118
    .line 119
    .line 120
    const v23, -0x40d47ae1    # -0.67f

    .line 121
    .line 122
    .line 123
    const v24, 0x3e428f5c    # 0.19f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x41bd70a4    # -0.19f

    .line 130
    .line 131
    .line 132
    const v6, -0x407d70a4    # -1.02f

    .line 133
    .line 134
    .line 135
    const v7, -0x4270a3d7    # -0.07f

    .line 136
    .line 137
    .line 138
    const v8, -0x40cccccd    # -0.7f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, -0x420a3d71    # -0.12f

    .line 145
    .line 146
    .line 147
    const v6, 0x3f8b851f    # 1.09f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, 0x3f91eb85    # 1.14f

    .line 154
    .line 155
    .line 156
    const v26, 0x3f8ccccd    # 1.1f

    .line 157
    .line 158
    .line 159
    const v21, 0x3ca3d70a    # 0.02f

    .line 160
    .line 161
    .line 162
    const v22, 0x3f1c28f6    # 0.61f

    .line 163
    .line 164
    .line 165
    const v23, 0x3f051eb8    # 0.52f

    .line 166
    .line 167
    .line 168
    const v24, 0x3f8ccccd    # 1.1f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x4102b852    # 8.17f

    .line 178
    .line 179
    .line 180
    const v6, 0x40e33333    # 7.1f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x3ed70a3d    # 0.42f

    .line 187
    .line 188
    .line 189
    const v6, 0x3f6147ae    # 0.88f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, 0x3f87ae14    # 1.06f

    .line 196
    .line 197
    .line 198
    const v26, -0x4015c28f    # -1.83f

    .line 199
    .line 200
    .line 201
    const v21, 0x3df5c28f    # 0.12f

    .line 202
    .line 203
    .line 204
    const v22, -0x40c51eb8    # -0.73f

    .line 205
    .line 206
    .line 207
    const v23, 0x3f028f5c    # 0.51f

    .line 208
    .line 209
    .line 210
    const v24, -0x4050a3d7    # -1.37f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, -0x40f0a3d7    # -0.56f

    .line 217
    .line 218
    .line 219
    const v6, -0x40b0a3d7    # -0.81f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, -0x40dc28f6    # -0.64f

    .line 226
    .line 227
    .line 228
    const v26, -0x41b33333    # -0.2f

    .line 229
    .line 230
    .line 231
    const v21, -0x41c7ae14    # -0.18f

    .line 232
    .line 233
    .line 234
    const v22, -0x41fae148    # -0.13f

    .line 235
    .line 236
    .line 237
    const v23, -0x412e147b    # -0.41f

    .line 238
    .line 239
    .line 240
    const v24, -0x41b33333    # -0.2f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, -0x406e147b    # -1.14f

    .line 247
    .line 248
    .line 249
    const v26, 0x3f91eb85    # 1.14f

    .line 250
    .line 251
    .line 252
    const v21, -0x40deb852    # -0.63f

    .line 253
    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    const v23, -0x406e147b    # -1.14f

    .line 258
    .line 259
    .line 260
    const v24, 0x3f028f5c    # 0.51f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x3f266666    # 0.65f

    .line 267
    .line 268
    .line 269
    const v26, 0x3f83d70a    # 1.03f

    .line 270
    .line 271
    .line 272
    const v21, -0x43dc28f6    # -0.01f

    .line 273
    .line 274
    .line 275
    const v22, 0x3ee147ae    # 0.44f

    .line 276
    .line 277
    .line 278
    const/high16 v23, 0x3e800000    # 0.25f

    .line 279
    .line 280
    const v24, 0x3f547ae1    # 0.83f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x417d47ae    # 15.83f

    .line 290
    .line 291
    .line 292
    const v6, 0x410e6666    # 8.9f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, -0x4128f5c3    # -0.42f

    .line 299
    .line 300
    .line 301
    const v6, -0x409eb852    # -0.88f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, -0x407851ec    # -1.06f

    .line 308
    .line 309
    .line 310
    const v26, 0x3fea3d71    # 1.83f

    .line 311
    .line 312
    .line 313
    const v21, -0x420a3d71    # -0.12f

    .line 314
    .line 315
    .line 316
    const v22, 0x3f3ae148    # 0.73f

    .line 317
    .line 318
    .line 319
    const v23, -0x40fd70a4    # -0.51f

    .line 320
    .line 321
    .line 322
    const v24, 0x3faf5c29    # 1.37f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x3f11eb85    # 0.57f

    .line 329
    .line 330
    .line 331
    const v6, 0x3f4f5c29    # 0.81f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, 0x3f23d70a    # 0.64f

    .line 338
    .line 339
    .line 340
    const v26, 0x3e4ccccd    # 0.2f

    .line 341
    .line 342
    .line 343
    const v21, 0x3e3851ec    # 0.18f

    .line 344
    .line 345
    .line 346
    const v22, 0x3e051eb8    # 0.13f

    .line 347
    .line 348
    .line 349
    const v23, 0x3ed1eb85    # 0.41f

    .line 350
    .line 351
    .line 352
    const v24, 0x3e4ccccd    # 0.2f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v25, 0x3f91eb85    # 1.14f

    .line 359
    .line 360
    .line 361
    const v26, -0x406e147b    # -1.14f

    .line 362
    .line 363
    .line 364
    const v21, 0x3f2147ae    # 0.63f

    .line 365
    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const v23, 0x3f91eb85    # 1.14f

    .line 370
    .line 371
    .line 372
    const v24, -0x40fd70a4    # -0.51f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v25, -0x40d9999a    # -0.65f

    .line 379
    .line 380
    .line 381
    const v26, -0x407ae148    # -1.04f

    .line 382
    .line 383
    .line 384
    const v21, 0x3c23d70a    # 0.01f

    .line 385
    .line 386
    .line 387
    const v22, -0x4119999a    # -0.45f

    .line 388
    .line 389
    .line 390
    const/high16 v23, -0x41800000    # -0.25f

    .line 391
    .line 392
    const v24, -0x40a8f5c3    # -0.84f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x416f3333    # 14.95f

    .line 402
    .line 403
    .line 404
    const v6, 0x40f0a3d7    # 7.52f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, -0x4128f5c3    # -0.42f

    .line 411
    .line 412
    .line 413
    const v6, 0x3f6147ae    # 0.88f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v25, 0x3f28f5c3    # 0.66f

    .line 420
    .line 421
    .line 422
    const v26, -0x407c28f6    # -1.03f

    .line 423
    .line 424
    .line 425
    const v21, 0x3ecccccd    # 0.4f

    .line 426
    .line 427
    .line 428
    const v22, -0x41bd70a4    # -0.19f

    .line 429
    .line 430
    .line 431
    const v23, 0x3f28f5c3    # 0.66f

    .line 432
    .line 433
    .line 434
    const v24, -0x40e8f5c3    # -0.59f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v25, -0x406e147b    # -1.14f

    .line 441
    .line 442
    .line 443
    const v26, -0x406e147b    # -1.14f

    .line 444
    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    const v22, -0x40deb852    # -0.63f

    .line 449
    .line 450
    .line 451
    const v23, -0x40fd70a4    # -0.51f

    .line 452
    .line 453
    .line 454
    const v24, -0x406e147b    # -1.14f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, -0x40d9999a    # -0.65f

    .line 461
    .line 462
    .line 463
    const v26, 0x3e4ccccd    # 0.2f

    .line 464
    .line 465
    .line 466
    const v21, -0x418a3d71    # -0.24f

    .line 467
    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    const v23, -0x41147ae1    # -0.46f

    .line 472
    .line 473
    .line 474
    const v24, 0x3d8f5c29    # 0.07f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v4, 0x3f0ccccd    # 0.55f

    .line 481
    .line 482
    .line 483
    const v6, -0x40b0a3d7    # -0.81f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, 0x3f87ae14    # 1.06f

    .line 490
    .line 491
    .line 492
    const v26, 0x3feb851f    # 1.84f

    .line 493
    .line 494
    .line 495
    const v21, 0x3f0ccccd    # 0.55f

    .line 496
    .line 497
    .line 498
    const v22, 0x3eeb851f    # 0.46f

    .line 499
    .line 500
    .line 501
    const v23, 0x3f70a3d7    # 0.94f

    .line 502
    .line 503
    .line 504
    const v24, 0x3f8ccccd    # 1.1f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x40a00000    # 5.0f

    .line 514
    .line 515
    const/high16 v6, 0x41400000    # 12.0f

    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v25, 0x3f83d70a    # 1.03f

    .line 521
    .line 522
    .line 523
    const v26, 0x3e428f5c    # 0.19f

    .line 524
    .line 525
    .line 526
    const v21, 0x3eb851ec    # 0.36f

    .line 527
    .line 528
    .line 529
    const/16 v22, 0x0

    .line 530
    .line 531
    const v23, 0x3f35c28f    # 0.71f

    .line 532
    .line 533
    .line 534
    const v24, 0x3d8f5c29    # 0.07f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x3de147ae    # 0.11f

    .line 541
    .line 542
    .line 543
    const v6, -0x40747ae1    # -1.09f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v25, 0x41400000    # 12.0f

    .line 550
    .line 551
    const/high16 v26, 0x40400000    # 3.0f

    .line 552
    .line 553
    const v21, 0x4151eb85    # 13.12f

    .line 554
    .line 555
    .line 556
    const v22, 0x405f5c29    # 3.49f

    .line 557
    .line 558
    .line 559
    const v23, 0x4149eb85    # 12.62f

    .line 560
    .line 561
    .line 562
    const/high16 v24, 0x40400000    # 3.0f

    .line 563
    .line 564
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v4, -0x406e147b    # -1.14f

    .line 568
    .line 569
    .line 570
    const v6, 0x3f8ccccd    # 1.1f

    .line 571
    .line 572
    .line 573
    const v7, -0x4070a3d7    # -1.12f

    .line 574
    .line 575
    .line 576
    const v8, 0x3efae148    # 0.49f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, 0x3df5c28f    # 0.12f

    .line 583
    .line 584
    .line 585
    const v6, 0x3f8b851f    # 1.09f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v26, 0x40a00000    # 5.0f

    .line 592
    .line 593
    const v21, 0x4134cccd    # 11.3f

    .line 594
    .line 595
    .line 596
    const v22, 0x40a23d71    # 5.07f

    .line 597
    .line 598
    .line 599
    const v23, 0x413a3d71    # 11.64f

    .line 600
    .line 601
    .line 602
    const/high16 v24, 0x40a00000    # 5.0f

    .line 603
    .line 604
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v4, 0x41311eb8    # 11.07f

    .line 611
    .line 612
    .line 613
    const v6, 0x410a8f5c    # 8.66f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v25, 0x3f266666    # 0.65f

    .line 620
    .line 621
    .line 622
    const v26, -0x41b33333    # -0.2f

    .line 623
    .line 624
    .line 625
    const v21, 0x3e75c28f    # 0.24f

    .line 626
    .line 627
    .line 628
    const/16 v22, 0x0

    .line 629
    .line 630
    const v23, 0x3eeb851f    # 0.46f

    .line 631
    .line 632
    .line 633
    const v24, -0x4270a3d7    # -0.07f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, -0x40f33333    # -0.55f

    .line 640
    .line 641
    .line 642
    const v6, 0x3f4f5c29    # 0.81f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v25, -0x40770a3d    # -1.07f

    .line 649
    .line 650
    .line 651
    const v26, -0x40147ae1    # -1.84f

    .line 652
    .line 653
    .line 654
    const v21, -0x40f0a3d7    # -0.56f

    .line 655
    .line 656
    .line 657
    const v22, -0x41147ae1    # -0.46f

    .line 658
    .line 659
    .line 660
    const v23, -0x408ccccd    # -0.95f

    .line 661
    .line 662
    .line 663
    const v24, -0x40733333    # -1.1f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v4, -0x409eb852    # -0.88f

    .line 670
    .line 671
    .line 672
    const v6, 0x3ed70a3d    # 0.42f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v25, -0x40d70a3d    # -0.66f

    .line 679
    .line 680
    .line 681
    const v26, 0x3f83d70a    # 1.03f

    .line 682
    .line 683
    .line 684
    const v21, -0x41333333    # -0.4f

    .line 685
    .line 686
    .line 687
    const v22, 0x3e4ccccd    # 0.2f

    .line 688
    .line 689
    .line 690
    const v23, -0x40d70a3d    # -0.66f

    .line 691
    .line 692
    .line 693
    const v24, 0x3f170a3d    # 0.59f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v25, 0x3f933333    # 1.15f

    .line 700
    .line 701
    .line 702
    const v26, 0x3f91eb85    # 1.14f

    .line 703
    .line 704
    .line 705
    const/16 v21, 0x0

    .line 706
    .line 707
    const v22, 0x3f2147ae    # 0.63f

    .line 708
    .line 709
    .line 710
    const v23, 0x3f051eb8    # 0.52f

    .line 711
    .line 712
    .line 713
    const v24, 0x3f91eb85    # 1.14f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v4, 0x41947ae1    # 18.56f

    .line 723
    .line 724
    .line 725
    const v6, 0x41770a3d    # 15.44f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v25, -0x3f7c28f6    # -4.12f

    .line 732
    .line 733
    .line 734
    const v26, 0x4083d70a    # 4.12f

    .line 735
    .line 736
    .line 737
    const v21, -0x400ccccd    # -1.9f

    .line 738
    .line 739
    .line 740
    const v22, 0x3f35c28f    # 0.71f

    .line 741
    .line 742
    .line 743
    const v23, -0x3fa51eb8    # -3.42f

    .line 744
    .line 745
    .line 746
    const v24, 0x400e147b    # 2.22f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v25, 0x4083d70a    # 4.12f

    .line 753
    .line 754
    .line 755
    const v26, -0x3f7c28f6    # -4.12f

    .line 756
    .line 757
    .line 758
    const v21, 0x3ff33333    # 1.9f

    .line 759
    .line 760
    .line 761
    const v22, -0x40ca3d71    # -0.71f

    .line 762
    .line 763
    .line 764
    const v23, 0x405a3d71    # 3.41f

    .line 765
    .line 766
    .line 767
    const v24, -0x3ff1eb85    # -2.22f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v4, 0x40ae147b    # 5.44f

    .line 777
    .line 778
    .line 779
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v26, 0x4083d70a    # 4.12f

    .line 783
    .line 784
    .line 785
    const v21, 0x3f35c28f    # 0.71f

    .line 786
    .line 787
    .line 788
    const v22, 0x3ff33333    # 1.9f

    .line 789
    .line 790
    .line 791
    const v23, 0x400e147b    # 2.22f

    .line 792
    .line 793
    .line 794
    const v24, 0x405ae148    # 3.42f

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v25, -0x3f7c28f6    # -4.12f

    .line 801
    .line 802
    .line 803
    const v26, -0x3f7c28f6    # -4.12f

    .line 804
    .line 805
    .line 806
    const v21, -0x40ca3d71    # -0.71f

    .line 807
    .line 808
    .line 809
    const v22, -0x400ccccd    # -1.9f

    .line 810
    .line 811
    .line 812
    const v23, -0x3ff1eb85    # -2.22f

    .line 813
    .line 814
    .line 815
    const v24, -0x3fa5c28f    # -3.41f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    const/16 v16, 0x3800

    .line 829
    .line 830
    const/16 v17, 0x0

    .line 831
    .line 832
    const v6, 0x3e99999a    # 0.3f

    .line 833
    .line 834
    .line 835
    const v8, 0x3e99999a    # 0.3f

    .line 836
    .line 837
    .line 838
    const/4 v7, 0x0

    .line 839
    const/high16 v9, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/high16 v12, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v13, 0x0

    .line 844
    const/4 v14, 0x0

    .line 845
    const/4 v15, 0x0

    .line 846
    const-string v4, ""

    .line 847
    .line 848
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 849
    .line 850
    .line 851
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 856
    .line 857
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 858
    .line 859
    .line 860
    move-result-wide v6

    .line 861
    const/4 v0, 0x0

    .line 862
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 866
    .line 867
    .line 868
    move-result v10

    .line 869
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 870
    .line 871
    .line 872
    move-result v11

    .line 873
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 876
    .line 877
    .line 878
    const v0, 0x41511eb8    # 13.07f

    .line 879
    .line 880
    .line 881
    const v2, 0x410a8f5c    # 8.66f

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v17, 0x3edc28f6    # 0.43f

    .line 888
    .line 889
    .line 890
    const v18, -0x430a3d71    # -0.03f

    .line 891
    .line 892
    .line 893
    const v13, 0x3e19999a    # 0.15f

    .line 894
    .line 895
    .line 896
    const v15, 0x3e947ae1    # 0.29f

    .line 897
    .line 898
    .line 899
    const v16, -0x43dc28f6    # -0.01f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v17, 0x41400000    # 12.0f

    .line 906
    .line 907
    const/high16 v18, 0x41700000    # 15.0f

    .line 908
    .line 909
    const v13, 0x4118f5c3    # 9.56f

    .line 910
    .line 911
    .line 912
    const v14, 0x41630a3d    # 14.19f

    .line 913
    .line 914
    .line 915
    const v15, 0x412b0a3d    # 10.69f

    .line 916
    .line 917
    .line 918
    const/high16 v16, 0x41700000    # 15.0f

    .line 919
    .line 920
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v0, 0x403a3d71    # 2.91f

    .line 924
    .line 925
    .line 926
    const v2, -0x40051eb8    # -1.96f

    .line 927
    .line 928
    .line 929
    const v4, -0x40b0a3d7    # -0.81f

    .line 930
    .line 931
    .line 932
    const v6, 0x401c28f6    # 2.44f

    .line 933
    .line 934
    .line 935
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v17, 0x3edc28f6    # 0.43f

    .line 939
    .line 940
    .line 941
    const v18, 0x3cf5c28f    # 0.03f

    .line 942
    .line 943
    .line 944
    const v13, 0x3e0f5c29    # 0.14f

    .line 945
    .line 946
    .line 947
    const v14, 0x3ca3d70a    # 0.02f

    .line 948
    .line 949
    .line 950
    const v15, 0x3e947ae1    # 0.29f

    .line 951
    .line 952
    .line 953
    const v16, 0x3cf5c28f    # 0.03f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v17, 0x4048f5c3    # 3.14f

    .line 960
    .line 961
    .line 962
    const v18, -0x3fb70a3d    # -3.14f

    .line 963
    .line 964
    .line 965
    const v13, 0x3fdd70a4    # 1.73f

    .line 966
    .line 967
    .line 968
    const/4 v14, 0x0

    .line 969
    const v15, 0x4048f5c3    # 3.14f

    .line 970
    .line 971
    .line 972
    const v16, -0x404b851f    # -1.41f

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, -0x40d47ae1    # -0.67f

    .line 979
    .line 980
    .line 981
    const v18, -0x4008f5c3    # -1.93f

    .line 982
    .line 983
    .line 984
    const/4 v13, 0x0

    .line 985
    const v14, -0x40ca3d71    # -0.71f

    .line 986
    .line 987
    .line 988
    const/high16 v15, -0x41800000    # -0.25f

    .line 989
    .line 990
    const v16, -0x404e147b    # -1.39f

    .line 991
    .line 992
    .line 993
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, 0x3f2b851f    # 0.67f

    .line 997
    .line 998
    .line 999
    const v13, 0x3edc28f6    # 0.43f

    .line 1000
    .line 1001
    .line 1002
    const v14, -0x40f5c28f    # -0.54f

    .line 1003
    .line 1004
    .line 1005
    const v15, 0x3f2b851f    # 0.67f

    .line 1006
    .line 1007
    .line 1008
    const v16, -0x4063d70a    # -1.22f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v17, -0x3fb70a3d    # -3.14f

    .line 1015
    .line 1016
    .line 1017
    const v18, -0x3fb70a3d    # -3.14f

    .line 1018
    .line 1019
    .line 1020
    const/4 v13, 0x0

    .line 1021
    const v14, -0x40228f5c    # -1.73f

    .line 1022
    .line 1023
    .line 1024
    const v15, -0x404b851f    # -1.41f

    .line 1025
    .line 1026
    .line 1027
    const v16, -0x3fb70a3d    # -3.14f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const v17, -0x4123d70a    # -0.43f

    .line 1034
    .line 1035
    .line 1036
    const v18, 0x3cf5c28f    # 0.03f

    .line 1037
    .line 1038
    .line 1039
    const v13, -0x41e66666    # -0.15f

    .line 1040
    .line 1041
    .line 1042
    const/4 v14, 0x0

    .line 1043
    const v15, -0x416b851f    # -0.29f

    .line 1044
    .line 1045
    .line 1046
    const v16, 0x3c23d70a    # 0.01f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const/high16 v17, 0x41400000    # 12.0f

    .line 1053
    .line 1054
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1055
    .line 1056
    const v13, 0x41670a3d    # 14.44f

    .line 1057
    .line 1058
    .line 1059
    const v14, 0x3fe7ae14    # 1.81f

    .line 1060
    .line 1061
    .line 1062
    const v15, 0x4154f5c3    # 13.31f

    .line 1063
    .line 1064
    .line 1065
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1066
    .line 1067
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v0, -0x3fc5c28f    # -2.91f

    .line 1071
    .line 1072
    .line 1073
    const v2, 0x3ffae148    # 1.96f

    .line 1074
    .line 1075
    .line 1076
    const v4, 0x3f4f5c29    # 0.81f

    .line 1077
    .line 1078
    .line 1079
    const v6, -0x3fe3d70a    # -2.44f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v17, -0x4123d70a    # -0.43f

    .line 1086
    .line 1087
    .line 1088
    const v18, -0x430a3d71    # -0.03f

    .line 1089
    .line 1090
    .line 1091
    const v13, -0x41f0a3d7    # -0.14f

    .line 1092
    .line 1093
    .line 1094
    const v14, -0x435c28f6    # -0.02f

    .line 1095
    .line 1096
    .line 1097
    const v15, -0x416b851f    # -0.29f

    .line 1098
    .line 1099
    .line 1100
    const v16, -0x430a3d71    # -0.03f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v17, -0x3fb70a3d    # -3.14f

    .line 1107
    .line 1108
    .line 1109
    const v18, 0x4048f5c3    # 3.14f

    .line 1110
    .line 1111
    .line 1112
    const v13, -0x40228f5c    # -1.73f

    .line 1113
    .line 1114
    .line 1115
    const/4 v14, 0x0

    .line 1116
    const v15, -0x3fb70a3d    # -3.14f

    .line 1117
    .line 1118
    .line 1119
    const v16, 0x3fb47ae1    # 1.41f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v17, 0x3f2b851f    # 0.67f

    .line 1126
    .line 1127
    .line 1128
    const v18, 0x3ff70a3d    # 1.93f

    .line 1129
    .line 1130
    .line 1131
    const/4 v13, 0x0

    .line 1132
    const v14, 0x3f35c28f    # 0.71f

    .line 1133
    .line 1134
    .line 1135
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1136
    .line 1137
    const v16, 0x3fb1eb85    # 1.39f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const v17, -0x40d1eb85    # -0.68f

    .line 1144
    .line 1145
    .line 1146
    const v13, -0x4123d70a    # -0.43f

    .line 1147
    .line 1148
    .line 1149
    const v14, 0x3f0a3d71    # 0.54f

    .line 1150
    .line 1151
    .line 1152
    const v15, -0x40d1eb85    # -0.68f

    .line 1153
    .line 1154
    .line 1155
    const v16, 0x3f9c28f6    # 1.22f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const v17, 0x4049999a    # 3.15f

    .line 1162
    .line 1163
    .line 1164
    const v18, 0x4048f5c3    # 3.14f

    .line 1165
    .line 1166
    .line 1167
    const/4 v13, 0x0

    .line 1168
    const v14, 0x3fdd70a4    # 1.73f

    .line 1169
    .line 1170
    .line 1171
    const v15, 0x3fb47ae1    # 1.41f

    .line 1172
    .line 1173
    .line 1174
    const v16, 0x4048f5c3    # 3.14f

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v0, 0x417570a4    # 15.34f

    .line 1184
    .line 1185
    .line 1186
    const v2, 0x41311eb8    # 11.07f

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1190
    .line 1191
    .line 1192
    const v17, -0x40dc28f6    # -0.64f

    .line 1193
    .line 1194
    .line 1195
    const v18, -0x41b33333    # -0.2f

    .line 1196
    .line 1197
    .line 1198
    const v13, -0x418a3d71    # -0.24f

    .line 1199
    .line 1200
    .line 1201
    const/4 v14, 0x0

    .line 1202
    const v15, -0x41147ae1    # -0.46f

    .line 1203
    .line 1204
    .line 1205
    const v16, -0x4270a3d7    # -0.07f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v0, -0x40ee147b    # -0.57f

    .line 1212
    .line 1213
    .line 1214
    const v2, -0x40b0a3d7    # -0.81f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v17, 0x3f87ae14    # 1.06f

    .line 1221
    .line 1222
    .line 1223
    const v18, -0x4015c28f    # -1.83f

    .line 1224
    .line 1225
    .line 1226
    const v13, 0x3f0ccccd    # 0.55f

    .line 1227
    .line 1228
    .line 1229
    const v14, -0x4119999a    # -0.45f

    .line 1230
    .line 1231
    .line 1232
    const v15, 0x3f70a3d7    # 0.94f

    .line 1233
    .line 1234
    .line 1235
    const v16, -0x40747ae1    # -1.09f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const v0, 0x3ed70a3d    # 0.42f

    .line 1242
    .line 1243
    .line 1244
    const v2, 0x3f6147ae    # 0.88f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v17, 0x3f28f5c3    # 0.66f

    .line 1251
    .line 1252
    .line 1253
    const v18, 0x3f83d70a    # 1.03f

    .line 1254
    .line 1255
    .line 1256
    const v13, 0x3ecccccd    # 0.4f

    .line 1257
    .line 1258
    .line 1259
    const v14, 0x3e428f5c    # 0.19f

    .line 1260
    .line 1261
    .line 1262
    const v15, 0x3f28f5c3    # 0.66f

    .line 1263
    .line 1264
    .line 1265
    const v16, 0x3f170a3d    # 0.59f

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    const v17, -0x406ccccd    # -1.15f

    .line 1272
    .line 1273
    .line 1274
    const v18, 0x3f933333    # 1.15f

    .line 1275
    .line 1276
    .line 1277
    const/4 v13, 0x0

    .line 1278
    const v14, 0x3f23d70a    # 0.64f

    .line 1279
    .line 1280
    .line 1281
    const v15, -0x40fae148    # -0.52f

    .line 1282
    .line 1283
    .line 1284
    const v16, 0x3f933333    # 1.15f

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v0, 0x416b0a3d    # 14.69f

    .line 1294
    .line 1295
    .line 1296
    const v2, 0x40a428f6    # 5.13f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    const v17, 0x3f266666    # 0.65f

    .line 1303
    .line 1304
    .line 1305
    const v18, -0x41b33333    # -0.2f

    .line 1306
    .line 1307
    .line 1308
    const v13, 0x3e4ccccd    # 0.2f

    .line 1309
    .line 1310
    .line 1311
    const v14, -0x41fae148    # -0.13f

    .line 1312
    .line 1313
    .line 1314
    const v15, 0x3ed70a3d    # 0.42f

    .line 1315
    .line 1316
    .line 1317
    const v16, -0x41b33333    # -0.2f

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1321
    .line 1322
    .line 1323
    const v17, 0x3f91eb85    # 1.14f

    .line 1324
    .line 1325
    .line 1326
    const v18, 0x3f91eb85    # 1.14f

    .line 1327
    .line 1328
    .line 1329
    const v13, 0x3f2147ae    # 0.63f

    .line 1330
    .line 1331
    .line 1332
    const/4 v14, 0x0

    .line 1333
    const v15, 0x3f91eb85    # 1.14f

    .line 1334
    .line 1335
    .line 1336
    const v16, 0x3f028f5c    # 0.51f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    .line 1342
    const v17, -0x40d70a3d    # -0.66f

    .line 1343
    .line 1344
    .line 1345
    const v18, 0x3f83d70a    # 1.03f

    .line 1346
    .line 1347
    .line 1348
    const/4 v13, 0x0

    .line 1349
    const v14, 0x3ee147ae    # 0.44f

    .line 1350
    .line 1351
    .line 1352
    const/high16 v15, -0x41800000    # -0.25f

    .line 1353
    .line 1354
    const v16, 0x3f547ae1    # 0.83f

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1358
    .line 1359
    .line 1360
    const v0, -0x409eb852    # -0.88f

    .line 1361
    .line 1362
    .line 1363
    const v2, 0x3ed70a3d    # 0.42f

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    const v17, -0x40770a3d    # -1.07f

    .line 1370
    .line 1371
    .line 1372
    const v18, -0x4015c28f    # -1.83f

    .line 1373
    .line 1374
    .line 1375
    const v13, -0x420a3d71    # -0.12f

    .line 1376
    .line 1377
    .line 1378
    const v14, -0x40c28f5c    # -0.74f

    .line 1379
    .line 1380
    .line 1381
    const v15, -0x40fd70a4    # -0.51f

    .line 1382
    .line 1383
    .line 1384
    const v16, -0x404f5c29    # -1.38f

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1388
    .line 1389
    .line 1390
    const v0, 0x3f51eb85    # 0.82f

    .line 1391
    .line 1392
    .line 1393
    const v2, -0x40f0a3d7    # -0.56f

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1400
    .line 1401
    .line 1402
    const/high16 v0, 0x40400000    # 3.0f

    .line 1403
    .line 1404
    const/high16 v2, 0x41400000    # 12.0f

    .line 1405
    .line 1406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1407
    .line 1408
    .line 1409
    const v17, 0x3f91eb85    # 1.14f

    .line 1410
    .line 1411
    .line 1412
    const v18, 0x3f8ccccd    # 1.1f

    .line 1413
    .line 1414
    .line 1415
    const v13, 0x3f1eb852    # 0.62f

    .line 1416
    .line 1417
    .line 1418
    const/4 v14, 0x0

    .line 1419
    const v15, 0x3f8f5c29    # 1.12f

    .line 1420
    .line 1421
    .line 1422
    const v16, 0x3efae148    # 0.49f

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    const v0, -0x421eb852    # -0.11f

    .line 1429
    .line 1430
    .line 1431
    const v2, 0x3f8b851f    # 1.09f

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    const/high16 v17, 0x41400000    # 12.0f

    .line 1438
    .line 1439
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1440
    .line 1441
    const v13, 0x414b5c29    # 12.71f

    .line 1442
    .line 1443
    .line 1444
    const v14, 0x40a23d71    # 5.07f

    .line 1445
    .line 1446
    .line 1447
    const v15, 0x4145c28f    # 12.36f

    .line 1448
    .line 1449
    .line 1450
    const/high16 v16, 0x40a00000    # 5.0f

    .line 1451
    .line 1452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1453
    .line 1454
    .line 1455
    const v0, 0x3d8f5c29    # 0.07f

    .line 1456
    .line 1457
    .line 1458
    const v2, 0x3e428f5c    # 0.19f

    .line 1459
    .line 1460
    .line 1461
    const v4, -0x407d70a4    # -1.02f

    .line 1462
    .line 1463
    .line 1464
    const v6, -0x40cccccd    # -0.7f

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    .line 1470
    const v0, -0x420a3d71    # -0.12f

    .line 1471
    .line 1472
    .line 1473
    const v2, -0x40747ae1    # -1.09f

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1477
    .line 1478
    .line 1479
    const v17, 0x3f91eb85    # 1.14f

    .line 1480
    .line 1481
    .line 1482
    const v18, -0x40733333    # -1.1f

    .line 1483
    .line 1484
    .line 1485
    const v13, 0x3ca3d70a    # 0.02f

    .line 1486
    .line 1487
    .line 1488
    const v14, -0x40e3d70a    # -0.61f

    .line 1489
    .line 1490
    .line 1491
    const v15, 0x3f051eb8    # 0.52f

    .line 1492
    .line 1493
    .line 1494
    const v16, -0x40733333    # -1.1f

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1501
    .line 1502
    .line 1503
    const/high16 v0, 0x41000000    # 8.0f

    .line 1504
    .line 1505
    const/high16 v2, 0x41500000    # 13.0f

    .line 1506
    .line 1507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1508
    .line 1509
    .line 1510
    const/high16 v17, -0x40800000    # -1.0f

    .line 1511
    .line 1512
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1513
    .line 1514
    const/4 v13, 0x0

    .line 1515
    const v14, 0x3f0ccccd    # 0.55f

    .line 1516
    .line 1517
    .line 1518
    const v15, -0x4119999a    # -0.45f

    .line 1519
    .line 1520
    .line 1521
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1522
    .line 1523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1524
    .line 1525
    .line 1526
    const v0, -0x4119999a    # -0.45f

    .line 1527
    .line 1528
    .line 1529
    const/high16 v2, -0x40800000    # -1.0f

    .line 1530
    .line 1531
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const v0, 0x3ee66666    # 0.45f

    .line 1535
    .line 1536
    .line 1537
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1538
    .line 1539
    const/high16 v4, -0x40800000    # -1.0f

    .line 1540
    .line 1541
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1548
    .line 1549
    .line 1550
    const v0, 0x412fae14    # 10.98f

    .line 1551
    .line 1552
    .line 1553
    const v2, 0x412cf5c3    # 10.81f

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1557
    .line 1558
    .line 1559
    const v17, 0x3f828f5c    # 1.02f

    .line 1560
    .line 1561
    .line 1562
    const v18, 0x3e428f5c    # 0.19f

    .line 1563
    .line 1564
    .line 1565
    const v13, 0x3ea3d70a    # 0.32f

    .line 1566
    .line 1567
    .line 1568
    const v14, 0x3df5c28f    # 0.12f

    .line 1569
    .line 1570
    .line 1571
    const v15, 0x3f28f5c3    # 0.66f

    .line 1572
    .line 1573
    .line 1574
    const v16, 0x3e428f5c    # 0.19f

    .line 1575
    .line 1576
    .line 1577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1578
    .line 1579
    .line 1580
    const v0, 0x3f35c28f    # 0.71f

    .line 1581
    .line 1582
    .line 1583
    const v2, 0x3f83d70a    # 1.03f

    .line 1584
    .line 1585
    .line 1586
    const v4, -0x41bd70a4    # -0.19f

    .line 1587
    .line 1588
    .line 1589
    const v6, -0x4270a3d7    # -0.07f

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1593
    .line 1594
    .line 1595
    const v0, 0x3de147ae    # 0.11f

    .line 1596
    .line 1597
    .line 1598
    const v2, 0x3f8b851f    # 1.09f

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1602
    .line 1603
    .line 1604
    const v17, -0x406e147b    # -1.14f

    .line 1605
    .line 1606
    .line 1607
    const v18, 0x3f8ccccd    # 1.1f

    .line 1608
    .line 1609
    .line 1610
    const v13, -0x435c28f6    # -0.02f

    .line 1611
    .line 1612
    .line 1613
    const v14, 0x3f1c28f6    # 0.61f

    .line 1614
    .line 1615
    .line 1616
    const v15, -0x40fae148    # -0.52f

    .line 1617
    .line 1618
    .line 1619
    const v16, 0x3f8ccccd    # 1.1f

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1623
    .line 1624
    .line 1625
    const v0, -0x406e147b    # -1.14f

    .line 1626
    .line 1627
    .line 1628
    const v2, -0x40733333    # -1.1f

    .line 1629
    .line 1630
    .line 1631
    const v4, -0x4070a3d7    # -1.12f

    .line 1632
    .line 1633
    .line 1634
    const v6, -0x41051eb8    # -0.49f

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1638
    .line 1639
    .line 1640
    const v0, 0x3df5c28f    # 0.12f

    .line 1641
    .line 1642
    .line 1643
    const v2, -0x40747ae1    # -1.09f

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1650
    .line 1651
    .line 1652
    const v0, 0x409dc28f    # 4.93f

    .line 1653
    .line 1654
    .line 1655
    const v2, 0x410a8f5c    # 8.66f

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1659
    .line 1660
    .line 1661
    const v17, 0x3f23d70a    # 0.64f

    .line 1662
    .line 1663
    .line 1664
    const v18, 0x3e4ccccd    # 0.2f

    .line 1665
    .line 1666
    .line 1667
    const v13, 0x3e75c28f    # 0.24f

    .line 1668
    .line 1669
    .line 1670
    const/4 v14, 0x0

    .line 1671
    const v15, 0x3eeb851f    # 0.46f

    .line 1672
    .line 1673
    .line 1674
    const v16, 0x3d8f5c29    # 0.07f

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1678
    .line 1679
    .line 1680
    const v0, 0x3f0f5c29    # 0.56f

    .line 1681
    .line 1682
    .line 1683
    const v2, 0x3f4f5c29    # 0.81f

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1687
    .line 1688
    .line 1689
    const v17, -0x407851ec    # -1.06f

    .line 1690
    .line 1691
    .line 1692
    const v18, 0x3fea3d71    # 1.83f

    .line 1693
    .line 1694
    .line 1695
    const v13, -0x40f33333    # -0.55f

    .line 1696
    .line 1697
    .line 1698
    const v14, 0x3ee66666    # 0.45f

    .line 1699
    .line 1700
    .line 1701
    const v15, -0x408f5c29    # -0.94f

    .line 1702
    .line 1703
    .line 1704
    const v16, 0x3f8b851f    # 1.09f

    .line 1705
    .line 1706
    .line 1707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1708
    .line 1709
    .line 1710
    const v0, -0x4128f5c3    # -0.42f

    .line 1711
    .line 1712
    .line 1713
    const v2, -0x409eb852    # -0.88f

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1717
    .line 1718
    .line 1719
    const v17, -0x40d70a3d    # -0.66f

    .line 1720
    .line 1721
    .line 1722
    const v18, -0x407c28f6    # -1.03f

    .line 1723
    .line 1724
    .line 1725
    const v13, -0x41333333    # -0.4f

    .line 1726
    .line 1727
    .line 1728
    const v14, -0x41b33333    # -0.2f

    .line 1729
    .line 1730
    .line 1731
    const v15, -0x40d70a3d    # -0.66f

    .line 1732
    .line 1733
    .line 1734
    const v16, -0x40e8f5c3    # -0.59f

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1738
    .line 1739
    .line 1740
    const v17, 0x3f933333    # 1.15f

    .line 1741
    .line 1742
    .line 1743
    const v18, -0x406e147b    # -1.14f

    .line 1744
    .line 1745
    .line 1746
    const/4 v13, 0x0

    .line 1747
    const v14, -0x40deb852    # -0.63f

    .line 1748
    .line 1749
    .line 1750
    const v15, 0x3f051eb8    # 0.52f

    .line 1751
    .line 1752
    .line 1753
    const v16, -0x406e147b    # -1.14f

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1760
    .line 1761
    .line 1762
    const v0, 0x4102b852    # 8.17f

    .line 1763
    .line 1764
    .line 1765
    const v2, 0x410e6666    # 8.9f

    .line 1766
    .line 1767
    .line 1768
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1769
    .line 1770
    .line 1771
    const v0, -0x4128f5c3    # -0.42f

    .line 1772
    .line 1773
    .line 1774
    const v2, 0x3f6147ae    # 0.88f

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1778
    .line 1779
    .line 1780
    const v17, 0x3f88f5c3    # 1.07f

    .line 1781
    .line 1782
    .line 1783
    const v18, 0x3fea3d71    # 1.83f

    .line 1784
    .line 1785
    .line 1786
    const v13, 0x3df5c28f    # 0.12f

    .line 1787
    .line 1788
    .line 1789
    const v14, 0x3f3d70a4    # 0.74f

    .line 1790
    .line 1791
    .line 1792
    const v15, 0x3f028f5c    # 0.51f

    .line 1793
    .line 1794
    .line 1795
    const v16, 0x3fb0a3d7    # 1.38f

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1799
    .line 1800
    .line 1801
    const v0, 0x3f0ccccd    # 0.55f

    .line 1802
    .line 1803
    .line 1804
    const v2, -0x40b0a3d7    # -0.81f

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1808
    .line 1809
    .line 1810
    const v17, -0x40d9999a    # -0.65f

    .line 1811
    .line 1812
    .line 1813
    const v18, 0x3e4ccccd    # 0.2f

    .line 1814
    .line 1815
    .line 1816
    const v13, -0x41b33333    # -0.2f

    .line 1817
    .line 1818
    .line 1819
    const v14, 0x3e051eb8    # 0.13f

    .line 1820
    .line 1821
    .line 1822
    const v15, -0x4128f5c3    # -0.42f

    .line 1823
    .line 1824
    .line 1825
    const v16, 0x3e4ccccd    # 0.2f

    .line 1826
    .line 1827
    .line 1828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1829
    .line 1830
    .line 1831
    const v17, -0x406e147b    # -1.14f

    .line 1832
    .line 1833
    .line 1834
    const v18, -0x406e147b    # -1.14f

    .line 1835
    .line 1836
    .line 1837
    const v13, -0x40deb852    # -0.63f

    .line 1838
    .line 1839
    .line 1840
    const/4 v14, 0x0

    .line 1841
    const v15, -0x406e147b    # -1.14f

    .line 1842
    .line 1843
    .line 1844
    const v16, -0x40fd70a4    # -0.51f

    .line 1845
    .line 1846
    .line 1847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1848
    .line 1849
    .line 1850
    const v17, 0x3f266666    # 0.65f

    .line 1851
    .line 1852
    .line 1853
    const v18, -0x407d70a4    # -1.02f

    .line 1854
    .line 1855
    .line 1856
    const v13, -0x43dc28f6    # -0.01f

    .line 1857
    .line 1858
    .line 1859
    const v14, -0x4123d70a    # -0.43f

    .line 1860
    .line 1861
    .line 1862
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1863
    .line 1864
    const v16, -0x40ae147b    # -0.82f

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1871
    .line 1872
    .line 1873
    const/high16 v0, 0x41b00000    # 22.0f

    .line 1874
    .line 1875
    const/high16 v2, 0x41400000    # 12.0f

    .line 1876
    .line 1877
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1878
    .line 1879
    .line 1880
    const/high16 v17, 0x41100000    # 9.0f

    .line 1881
    .line 1882
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 1883
    .line 1884
    const v13, 0x409f0a3d    # 4.97f

    .line 1885
    .line 1886
    .line 1887
    const/4 v14, 0x0

    .line 1888
    const/high16 v15, 0x41100000    # 9.0f

    .line 1889
    .line 1890
    const v16, -0x3f7f0a3d    # -4.03f

    .line 1891
    .line 1892
    .line 1893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1894
    .line 1895
    .line 1896
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 1897
    .line 1898
    const/high16 v18, 0x41100000    # 9.0f

    .line 1899
    .line 1900
    const v13, -0x3f60f5c3    # -4.97f

    .line 1901
    .line 1902
    .line 1903
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 1904
    .line 1905
    const v16, 0x4080f5c3    # 4.03f

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1912
    .line 1913
    .line 1914
    const v0, 0x41947ae1    # 18.56f

    .line 1915
    .line 1916
    .line 1917
    const v2, 0x41770a3d    # 15.44f

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1921
    .line 1922
    .line 1923
    const v17, -0x3f7c28f6    # -4.12f

    .line 1924
    .line 1925
    .line 1926
    const v18, 0x4083d70a    # 4.12f

    .line 1927
    .line 1928
    .line 1929
    const v13, -0x40ca3d71    # -0.71f

    .line 1930
    .line 1931
    .line 1932
    const v14, 0x3ff33333    # 1.9f

    .line 1933
    .line 1934
    .line 1935
    const v15, -0x3ff1eb85    # -2.22f

    .line 1936
    .line 1937
    .line 1938
    const v16, 0x405ae148    # 3.42f

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1942
    .line 1943
    .line 1944
    const v17, 0x4083d70a    # 4.12f

    .line 1945
    .line 1946
    .line 1947
    const v18, -0x3f7c28f6    # -4.12f

    .line 1948
    .line 1949
    .line 1950
    const v13, 0x3f35c28f    # 0.71f

    .line 1951
    .line 1952
    .line 1953
    const v14, -0x400ccccd    # -1.9f

    .line 1954
    .line 1955
    .line 1956
    const v15, 0x400e147b    # 2.22f

    .line 1957
    .line 1958
    .line 1959
    const v16, -0x3fa5c28f    # -3.41f

    .line 1960
    .line 1961
    .line 1962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1966
    .line 1967
    .line 1968
    const/high16 v0, 0x40400000    # 3.0f

    .line 1969
    .line 1970
    const/high16 v2, 0x41500000    # 13.0f

    .line 1971
    .line 1972
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1973
    .line 1974
    .line 1975
    const/high16 v17, 0x41100000    # 9.0f

    .line 1976
    .line 1977
    const/high16 v18, 0x41100000    # 9.0f

    .line 1978
    .line 1979
    const/4 v13, 0x0

    .line 1980
    const v14, 0x409f0a3d    # 4.97f

    .line 1981
    .line 1982
    .line 1983
    const v15, 0x4080f5c3    # 4.03f

    .line 1984
    .line 1985
    .line 1986
    const/high16 v16, 0x41100000    # 9.0f

    .line 1987
    .line 1988
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1989
    .line 1990
    .line 1991
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 1992
    .line 1993
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 1994
    .line 1995
    const v14, -0x3f60f5c3    # -4.97f

    .line 1996
    .line 1997
    .line 1998
    const v15, -0x3f7f0a3d    # -4.03f

    .line 1999
    .line 2000
    .line 2001
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 2002
    .line 2003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2007
    .line 2008
    .line 2009
    const v0, 0x40ae147b    # 5.44f

    .line 2010
    .line 2011
    .line 2012
    const v2, 0x41770a3d    # 15.44f

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2016
    .line 2017
    .line 2018
    const v17, 0x4083d70a    # 4.12f

    .line 2019
    .line 2020
    .line 2021
    const v18, 0x4083d70a    # 4.12f

    .line 2022
    .line 2023
    .line 2024
    const v13, 0x3ff33333    # 1.9f

    .line 2025
    .line 2026
    .line 2027
    const v14, 0x3f35c28f    # 0.71f

    .line 2028
    .line 2029
    .line 2030
    const v15, 0x405ae148    # 3.42f

    .line 2031
    .line 2032
    .line 2033
    const v16, 0x400e147b    # 2.22f

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2037
    .line 2038
    .line 2039
    const v17, -0x3f7c28f6    # -4.12f

    .line 2040
    .line 2041
    .line 2042
    const v18, -0x3f7c28f6    # -4.12f

    .line 2043
    .line 2044
    .line 2045
    const v13, -0x400ccccd    # -1.9f

    .line 2046
    .line 2047
    .line 2048
    const v14, -0x40ca3d71    # -0.71f

    .line 2049
    .line 2050
    .line 2051
    const v15, -0x3fa5c28f    # -3.41f

    .line 2052
    .line 2053
    .line 2054
    const v16, -0x3ff1eb85    # -2.22f

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2058
    .line 2059
    .line 2060
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2061
    .line 2062
    .line 2063
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v2

    .line 2067
    const/16 v16, 0x3800

    .line 2068
    .line 2069
    const/16 v17, 0x0

    .line 2070
    .line 2071
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2072
    .line 2073
    const/high16 v8, 0x3f800000    # 1.0f

    .line 2074
    .line 2075
    const/4 v7, 0x0

    .line 2076
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2077
    .line 2078
    const/4 v13, 0x0

    .line 2079
    const/4 v14, 0x0

    .line 2080
    const/4 v15, 0x0

    .line 2081
    const-string v4, ""

    .line 2082
    .line 2083
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v0

    .line 2087
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v0

    .line 2091
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2092
    .line 2093
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2094
    .line 2095
    .line 2096
    return-object v0
.end method

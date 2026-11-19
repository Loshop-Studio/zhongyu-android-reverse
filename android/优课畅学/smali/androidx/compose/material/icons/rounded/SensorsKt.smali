.class public final Landroidx/compose/material/icons/rounded/SensorsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sensors:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSensors(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SensorsKt;->_sensors:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sensors"

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
    const v0, 0x4108a3d7    # 8.54f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v17, 0x3dcccccd    # 0.1f

    .line 77
    .line 78
    .line 79
    const v18, 0x3fa51eb8    # 1.29f

    .line 80
    .line 81
    .line 82
    const v13, 0x3eb33333    # 0.35f

    .line 83
    .line 84
    .line 85
    const v14, 0x3eb33333    # 0.35f

    .line 86
    .line 87
    .line 88
    const v15, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v16, 0x3f6147ae    # 0.88f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x41000000    # 8.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v13, 0x4103d70a    # 8.24f

    .line 102
    .line 103
    .line 104
    const v14, 0x41273333    # 10.45f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x41000000    # 8.0f

    .line 108
    .line 109
    const v16, 0x41333333    # 11.2f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x3f23d70a    # 0.64f

    .line 116
    .line 117
    .line 118
    const v18, 0x400ae148    # 2.17f

    .line 119
    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const v14, 0x3f4ccccd    # 0.8f

    .line 123
    .line 124
    .line 125
    const v15, 0x3e75c28f    # 0.24f

    .line 126
    .line 127
    .line 128
    const v16, 0x3fc66666    # 1.55f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x421eb852    # -0.11f

    .line 135
    .line 136
    .line 137
    const v18, 0x3fa51eb8    # 1.29f

    .line 138
    .line 139
    .line 140
    const v13, 0x3e8a3d71    # 0.27f

    .line 141
    .line 142
    .line 143
    const v14, 0x3ed1eb85    # 0.41f

    .line 144
    .line 145
    .line 146
    const v16, 0x3f733333    # 0.95f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x403eb852    # -1.51f

    .line 153
    .line 154
    .line 155
    const v18, -0x421eb852    # -0.11f

    .line 156
    .line 157
    .line 158
    const v13, -0x4123d70a    # -0.43f

    .line 159
    .line 160
    .line 161
    const v14, 0x3edc28f6    # 0.43f

    .line 162
    .line 163
    .line 164
    const v15, -0x406a3d71    # -1.17f

    .line 165
    .line 166
    .line 167
    const v16, 0x3ecccccd    # 0.4f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const/high16 v18, 0x41400000    # 12.0f

    .line 176
    .line 177
    const v13, 0x40cc28f6    # 6.38f

    .line 178
    .line 179
    .line 180
    const v14, 0x41666666    # 14.4f

    .line 181
    .line 182
    .line 183
    const/high16 v15, 0x40c00000    # 6.0f

    .line 184
    .line 185
    const v16, 0x4153d70a    # 13.24f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3f7851ec    # 0.97f

    .line 192
    .line 193
    .line 194
    const v18, -0x3fae147b    # -3.28f

    .line 195
    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, -0x40651eb8    # -1.21f

    .line 199
    .line 200
    .line 201
    const v15, 0x3eb851ec    # 0.36f

    .line 202
    .line 203
    .line 204
    const v16, -0x3feae148    # -2.33f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x4108a3d7    # 8.54f

    .line 211
    .line 212
    .line 213
    const v18, 0x4108a3d7    # 8.54f

    .line 214
    .line 215
    .line 216
    const v13, 0x40ea8f5c    # 7.33f

    .line 217
    .line 218
    .line 219
    const v14, 0x4102e148    # 8.18f

    .line 220
    .line 221
    .line 222
    const v15, 0x410147ae    # 8.08f

    .line 223
    .line 224
    .line 225
    const v16, 0x410147ae    # 8.08f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x41775c29    # 15.46f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3fc147ae    # 1.51f

    .line 241
    .line 242
    .line 243
    const v18, -0x421eb852    # -0.11f

    .line 244
    .line 245
    .line 246
    const v13, 0x3edc28f6    # 0.43f

    .line 247
    .line 248
    .line 249
    const v14, 0x3edc28f6    # 0.43f

    .line 250
    .line 251
    .line 252
    const v15, 0x3f95c28f    # 1.17f

    .line 253
    .line 254
    .line 255
    const v16, 0x3ecccccd    # 0.4f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x41900000    # 18.0f

    .line 262
    .line 263
    const/high16 v18, 0x41400000    # 12.0f

    .line 264
    .line 265
    const v13, 0x418cf5c3    # 17.62f

    .line 266
    .line 267
    .line 268
    const v14, 0x41666666    # 14.4f

    .line 269
    .line 270
    .line 271
    const/high16 v15, 0x41900000    # 18.0f

    .line 272
    .line 273
    const v16, 0x4153d70a    # 13.24f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x407c28f6    # -1.03f

    .line 280
    .line 281
    .line 282
    const v18, -0x3fa8f5c3    # -3.36f

    .line 283
    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, -0x406147ae    # -1.24f

    .line 287
    .line 288
    .line 289
    const v15, -0x413d70a4    # -0.38f

    .line 290
    .line 291
    .line 292
    const v16, -0x3fe66666    # -2.4f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x403eb852    # -1.51f

    .line 299
    .line 300
    .line 301
    const v18, -0x421eb852    # -0.11f

    .line 302
    .line 303
    .line 304
    const v13, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const/high16 v14, -0x41000000    # -0.5f

    .line 308
    .line 309
    const v15, -0x4075c28f    # -1.08f

    .line 310
    .line 311
    .line 312
    const v16, -0x40f5c28f    # -0.54f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x421eb852    # -0.11f

    .line 319
    .line 320
    .line 321
    const v18, 0x3fa51eb8    # 1.29f

    .line 322
    .line 323
    .line 324
    const v13, -0x414ccccd    # -0.35f

    .line 325
    .line 326
    .line 327
    const v14, 0x3eb33333    # 0.35f

    .line 328
    .line 329
    .line 330
    const v15, -0x41428f5c    # -0.37f

    .line 331
    .line 332
    .line 333
    const v16, 0x3f6147ae    # 0.88f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x41800000    # 16.0f

    .line 340
    .line 341
    const/high16 v18, 0x41400000    # 12.0f

    .line 342
    .line 343
    const v13, 0x417c28f6    # 15.76f

    .line 344
    .line 345
    .line 346
    const v14, 0x41273333    # 10.45f

    .line 347
    .line 348
    .line 349
    const/high16 v15, 0x41800000    # 16.0f

    .line 350
    .line 351
    const v16, 0x41333333    # 11.2f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x40dc28f6    # -0.64f

    .line 358
    .line 359
    .line 360
    const v18, 0x400ae148    # 2.17f

    .line 361
    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3f4ccccd    # 0.8f

    .line 365
    .line 366
    .line 367
    const v15, -0x418a3d71    # -0.24f

    .line 368
    .line 369
    .line 370
    const v16, 0x3fc66666    # 1.55f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x41775c29    # 15.46f

    .line 377
    .line 378
    .line 379
    const v18, 0x41775c29    # 15.46f

    .line 380
    .line 381
    .line 382
    const v13, 0x417170a4    # 15.09f

    .line 383
    .line 384
    .line 385
    const v14, 0x416947ae    # 14.58f

    .line 386
    .line 387
    .line 388
    const v15, 0x4171eb85    # 15.12f

    .line 389
    .line 390
    .line 391
    const v16, 0x4171eb85    # 15.12f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41400000    # 12.0f

    .line 401
    .line 402
    const/high16 v2, 0x41200000    # 10.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, -0x40000000    # -2.0f

    .line 408
    .line 409
    const/high16 v18, 0x40000000    # 2.0f

    .line 410
    .line 411
    const v13, -0x40733333    # -1.1f

    .line 412
    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const/high16 v15, -0x40000000    # -2.0f

    .line 416
    .line 417
    const v16, 0x3f666666    # 0.9f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3f666666    # 0.9f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x40000000    # 2.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, -0x4099999a    # -0.9f

    .line 432
    .line 433
    .line 434
    const/high16 v2, -0x40000000    # -2.0f

    .line 435
    .line 436
    const/high16 v4, 0x40000000    # 2.0f

    .line 437
    .line 438
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x4151999a    # 13.1f

    .line 442
    .line 443
    .line 444
    const/high16 v2, 0x41400000    # 12.0f

    .line 445
    .line 446
    const/high16 v4, 0x41200000    # 10.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x41928f5c    # 18.32f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 461
    .line 462
    const v18, -0x425c28f6    # -0.08f

    .line 463
    .line 464
    .line 465
    const v13, 0x3ed70a3d    # 0.42f

    .line 466
    .line 467
    .line 468
    const v14, 0x3ed70a3d    # 0.42f

    .line 469
    .line 470
    .line 471
    const v15, 0x3f8f5c29    # 1.12f

    .line 472
    .line 473
    .line 474
    const v16, 0x3ec7ae14    # 0.39f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41b00000    # 22.0f

    .line 481
    .line 482
    const/high16 v18, 0x41400000    # 12.0f

    .line 483
    .line 484
    const v13, 0x41a970a4    # 21.18f

    .line 485
    .line 486
    .line 487
    const v14, 0x41843d71    # 16.53f

    .line 488
    .line 489
    .line 490
    const/high16 v15, 0x41b00000    # 22.0f

    .line 491
    .line 492
    const v16, 0x4165c28f    # 14.36f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x3ff47ae1    # -2.18f

    .line 499
    .line 500
    .line 501
    const v2, -0x3f3851ec    # -6.24f

    .line 502
    .line 503
    .line 504
    const v4, -0x40ae147b    # -0.82f

    .line 505
    .line 506
    .line 507
    const v6, -0x3f6f0a3d    # -4.53f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, -0x40400000    # -1.5f

    .line 514
    .line 515
    const v18, -0x425c28f6    # -0.08f

    .line 516
    .line 517
    .line 518
    const v13, -0x41428f5c    # -0.37f

    .line 519
    .line 520
    .line 521
    const v14, -0x410f5c29    # -0.47f

    .line 522
    .line 523
    .line 524
    const v15, -0x40770a3d    # -1.07f

    .line 525
    .line 526
    .line 527
    const/high16 v16, -0x41000000    # -0.5f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, -0x425c28f6    # -0.08f

    .line 533
    .line 534
    .line 535
    const v18, 0x3fa8f5c3    # 1.32f

    .line 536
    .line 537
    .line 538
    const v13, -0x4147ae14    # -0.36f

    .line 539
    .line 540
    .line 541
    const v14, 0x3eb851ec    # 0.36f

    .line 542
    .line 543
    .line 544
    const v15, -0x41333333    # -0.4f

    .line 545
    .line 546
    .line 547
    const v16, 0x3f6b851f    # 0.92f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, 0x3fe147ae    # 1.76f

    .line 554
    .line 555
    .line 556
    const/high16 v18, 0x40a00000    # 5.0f

    .line 557
    .line 558
    const v13, 0x3f8ccccd    # 1.1f

    .line 559
    .line 560
    .line 561
    const v14, 0x3faf5c29    # 1.37f

    .line 562
    .line 563
    .line 564
    const v15, 0x3fe147ae    # 1.76f

    .line 565
    .line 566
    .line 567
    const v16, 0x40470a3d    # 3.11f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x401eb852    # -1.76f

    .line 574
    .line 575
    .line 576
    const/high16 v2, 0x40a00000    # 5.0f

    .line 577
    .line 578
    const v4, -0x40d70a3d    # -0.66f

    .line 579
    .line 580
    .line 581
    const v6, 0x406851ec    # 3.63f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x41928f5c    # 18.32f

    .line 588
    .line 589
    .line 590
    const v18, 0x41928f5c    # 18.32f

    .line 591
    .line 592
    .line 593
    const v13, 0x418f5c29    # 17.92f

    .line 594
    .line 595
    .line 596
    const v14, 0x418b1eb8    # 17.39f

    .line 597
    .line 598
    .line 599
    const v15, 0x418fae14    # 17.96f

    .line 600
    .line 601
    .line 602
    const v16, 0x418fae14    # 17.96f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x40b5c28f    # 5.68f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, -0x40400000    # -1.5f

    .line 618
    .line 619
    const v18, 0x3da3d70a    # 0.08f

    .line 620
    .line 621
    .line 622
    const v13, -0x4128f5c3    # -0.42f

    .line 623
    .line 624
    .line 625
    const v14, -0x4128f5c3    # -0.42f

    .line 626
    .line 627
    .line 628
    const v15, -0x4070a3d7    # -1.12f

    .line 629
    .line 630
    .line 631
    const v16, -0x413851ec    # -0.39f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v17, 0x40000000    # 2.0f

    .line 638
    .line 639
    const/high16 v18, 0x41400000    # 12.0f

    .line 640
    .line 641
    const v13, 0x40347ae1    # 2.82f

    .line 642
    .line 643
    .line 644
    const v14, 0x40ef0a3d    # 7.47f

    .line 645
    .line 646
    .line 647
    const/high16 v15, 0x40000000    # 2.0f

    .line 648
    .line 649
    const v16, 0x411a3d71    # 9.64f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x400b851f    # 2.18f

    .line 656
    .line 657
    .line 658
    const v2, 0x40c7ae14    # 6.24f

    .line 659
    .line 660
    .line 661
    const v4, 0x3f51eb85    # 0.82f

    .line 662
    .line 663
    .line 664
    const v6, 0x4090f5c3    # 4.53f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 671
    .line 672
    const v18, 0x3da3d70a    # 0.08f

    .line 673
    .line 674
    .line 675
    const v13, 0x3ebd70a4    # 0.37f

    .line 676
    .line 677
    .line 678
    const v14, 0x3ef0a3d7    # 0.47f

    .line 679
    .line 680
    .line 681
    const v15, 0x3f88f5c3    # 1.07f

    .line 682
    .line 683
    .line 684
    const/high16 v16, 0x3f000000    # 0.5f

    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x3da3d70a    # 0.08f

    .line 690
    .line 691
    .line 692
    const v18, -0x40570a3d    # -1.32f

    .line 693
    .line 694
    .line 695
    const v13, 0x3eb851ec    # 0.36f

    .line 696
    .line 697
    .line 698
    const v14, -0x4147ae14    # -0.36f

    .line 699
    .line 700
    .line 701
    const v15, 0x3ecccccd    # 0.4f

    .line 702
    .line 703
    .line 704
    const v16, -0x40947ae1    # -0.92f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, 0x40800000    # 4.0f

    .line 711
    .line 712
    const/high16 v18, 0x41400000    # 12.0f

    .line 713
    .line 714
    const v13, 0x40951eb8    # 4.66f

    .line 715
    .line 716
    .line 717
    const v14, 0x417a147b    # 15.63f

    .line 718
    .line 719
    .line 720
    const/high16 v15, 0x40800000    # 4.0f

    .line 721
    .line 722
    const v16, 0x415e3d71    # 13.89f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v0, 0x3fe147ae    # 1.76f

    .line 729
    .line 730
    .line 731
    const/high16 v2, -0x3f600000    # -5.0f

    .line 732
    .line 733
    const v4, 0x3f28f5c3    # 0.66f

    .line 734
    .line 735
    .line 736
    const v6, -0x3f97ae14    # -3.63f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x40b5c28f    # 5.68f

    .line 743
    .line 744
    .line 745
    const v18, 0x40b5c28f    # 5.68f

    .line 746
    .line 747
    .line 748
    const v13, 0x40c28f5c    # 6.08f

    .line 749
    .line 750
    .line 751
    const v14, 0x40d3851f    # 6.61f

    .line 752
    .line 753
    .line 754
    const v15, 0x40c147ae    # 6.04f

    .line 755
    .line 756
    .line 757
    const v16, 0x40c147ae    # 6.04f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    const/16 v16, 0x3800

    .line 771
    .line 772
    const/16 v17, 0x0

    .line 773
    .line 774
    const/high16 v6, 0x3f800000    # 1.0f

    .line 775
    .line 776
    const/high16 v8, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/4 v7, 0x0

    .line 779
    const/high16 v9, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/high16 v12, 0x3f800000    # 1.0f

    .line 782
    .line 783
    const/4 v13, 0x0

    .line 784
    const/4 v14, 0x0

    .line 785
    const/4 v15, 0x0

    .line 786
    const-string v4, ""

    .line 787
    .line 788
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    sput-object v0, Landroidx/compose/material/icons/rounded/SensorsKt;->_sensors:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 797
    .line 798
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    return-object v0
.end method

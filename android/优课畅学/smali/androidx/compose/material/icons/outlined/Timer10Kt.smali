.class public final Landroidx/compose/material/icons/outlined/Timer10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timer10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimer10(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Timer10Kt;->_timer10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Timer10"

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
    const v0, 0x40f70a3d    # 7.72f

    .line 71
    .line 72
    .line 73
    const v2, -0x43dc28f6    # -0.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x41166666    # 9.4f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x40400000    # 3.0f

    .line 86
    .line 87
    const/high16 v2, -0x40800000    # -1.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v0, 0x403f5c29    # 2.99f

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x41900000    # 18.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x409fae14    # 4.99f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x40c00000    # 6.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, -0x41800000    # -0.25f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x40f70a3d    # 7.72f

    .line 119
    .line 120
    .line 121
    const v2, -0x43dc28f6    # -0.01f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x41be28f6    # 23.77f

    .line 131
    .line 132
    .line 133
    const v2, 0x4165eb85    # 14.37f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x40deb852    # -0.63f

    .line 140
    .line 141
    .line 142
    const v18, -0x40c28f5c    # -0.74f

    .line 143
    .line 144
    .line 145
    const v13, -0x41f0a3d7    # -0.14f

    .line 146
    .line 147
    .line 148
    const v14, -0x4170a3d7    # -0.28f

    .line 149
    .line 150
    .line 151
    const v15, -0x414ccccd    # -0.35f

    .line 152
    .line 153
    .line 154
    const v16, -0x40f851ec    # -0.53f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x407eb852    # -1.01f

    .line 161
    .line 162
    .line 163
    const v18, -0x40f851ec    # -0.53f

    .line 164
    .line 165
    .line 166
    const v13, -0x4170a3d7    # -0.28f

    .line 167
    .line 168
    .line 169
    const v14, -0x41a8f5c3    # -0.21f

    .line 170
    .line 171
    .line 172
    const v15, -0x40e3d70a    # -0.61f

    .line 173
    .line 174
    .line 175
    const v16, -0x413851ec    # -0.39f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x40533333    # -1.35f

    .line 182
    .line 183
    .line 184
    const v2, -0x413d70a4    # -0.38f

    .line 185
    .line 186
    .line 187
    const v4, -0x40a66666    # -0.85f

    .line 188
    .line 189
    .line 190
    const v6, -0x4175c28f    # -0.27f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, -0x40a147ae    # -0.87f

    .line 197
    .line 198
    .line 199
    const v18, -0x41947ae1    # -0.23f

    .line 200
    .line 201
    .line 202
    const v13, -0x414ccccd    # -0.35f

    .line 203
    .line 204
    .line 205
    const v14, -0x4270a3d7    # -0.07f

    .line 206
    .line 207
    .line 208
    const v15, -0x40dc28f6    # -0.64f

    .line 209
    .line 210
    .line 211
    const v16, -0x41e66666    # -0.15f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, -0x40f33333    # -0.55f

    .line 218
    .line 219
    .line 220
    const/high16 v18, -0x41800000    # -0.25f

    .line 221
    .line 222
    const v13, -0x41947ae1    # -0.23f

    .line 223
    .line 224
    .line 225
    const v14, -0x425c28f6    # -0.08f

    .line 226
    .line 227
    .line 228
    const v15, -0x412e147b    # -0.41f

    .line 229
    .line 230
    .line 231
    const v16, -0x41dc28f6    # -0.16f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x4170a3d7    # -0.28f

    .line 238
    .line 239
    .line 240
    const v2, -0x41666666    # -0.3f

    .line 241
    .line 242
    .line 243
    const v4, -0x41947ae1    # -0.23f

    .line 244
    .line 245
    .line 246
    const v6, -0x41bd70a4    # -0.19f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x425c28f6    # -0.08f

    .line 253
    .line 254
    .line 255
    const v18, -0x413851ec    # -0.39f

    .line 256
    .line 257
    .line 258
    const v13, -0x42b33333    # -0.05f

    .line 259
    .line 260
    .line 261
    const v14, -0x421eb852    # -0.11f

    .line 262
    .line 263
    .line 264
    const v15, -0x425c28f6    # -0.08f

    .line 265
    .line 266
    .line 267
    const v16, -0x418a3d71    # -0.24f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3db851ec    # 0.09f

    .line 274
    .line 275
    .line 276
    const v18, -0x412e147b    # -0.41f

    .line 277
    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, -0x41f0a3d7    # -0.14f

    .line 281
    .line 282
    .line 283
    const v15, 0x3cf5c28f    # 0.03f

    .line 284
    .line 285
    .line 286
    const v16, -0x4170a3d7    # -0.28f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3e19999a    # 0.15f

    .line 293
    .line 294
    .line 295
    const v2, -0x4151eb85    # -0.34f

    .line 296
    .line 297
    .line 298
    const v4, 0x3e8a3d71    # 0.27f

    .line 299
    .line 300
    .line 301
    const/high16 v6, -0x41800000    # -0.25f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3ee66666    # 0.45f

    .line 307
    .line 308
    .line 309
    const v18, -0x418a3d71    # -0.24f

    .line 310
    .line 311
    .line 312
    const v13, 0x3df5c28f    # 0.12f

    .line 313
    .line 314
    .line 315
    const v14, -0x42333333    # -0.1f

    .line 316
    .line 317
    .line 318
    const v15, 0x3e8a3d71    # 0.27f

    .line 319
    .line 320
    .line 321
    const v16, -0x41c7ae14    # -0.18f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x3ecccccd    # 0.4f

    .line 328
    .line 329
    .line 330
    const v2, 0x3f23d70a    # 0.64f

    .line 331
    .line 332
    .line 333
    const v4, -0x4247ae14    # -0.09f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f28f5c3    # 0.66f

    .line 340
    .line 341
    .line 342
    const v18, 0x3de147ae    # 0.11f

    .line 343
    .line 344
    .line 345
    const/high16 v13, 0x3e800000    # 0.25f

    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const v15, 0x3ef0a3d7    # 0.47f

    .line 349
    .line 350
    .line 351
    const v16, 0x3d23d70a    # 0.04f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3e2e147b    # 0.17f

    .line 358
    .line 359
    .line 360
    const v2, 0x3ef5c28f    # 0.48f

    .line 361
    .line 362
    .line 363
    const v4, 0x3e947ae1    # 0.29f

    .line 364
    .line 365
    .line 366
    const v6, 0x3eb33333    # 0.35f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3e851eb8    # 0.26f

    .line 373
    .line 374
    .line 375
    const v2, 0x3ed70a3d    # 0.42f

    .line 376
    .line 377
    .line 378
    const v6, 0x3e6147ae    # 0.22f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x3dcccccd    # 0.1f

    .line 385
    .line 386
    .line 387
    const v18, 0x3efae148    # 0.49f

    .line 388
    .line 389
    .line 390
    const v13, 0x3d75c28f    # 0.06f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e23d70a    # 0.16f

    .line 394
    .line 395
    .line 396
    const v15, 0x3dcccccd    # 0.1f

    .line 397
    .line 398
    .line 399
    const v16, 0x3ea3d70a    # 0.32f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3ff9999a    # 1.95f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x418a3d71    # -0.24f

    .line 412
    .line 413
    .line 414
    const v18, -0x40747ae1    # -1.09f

    .line 415
    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, -0x413851ec    # -0.39f

    .line 419
    .line 420
    .line 421
    const v15, -0x425c28f6    # -0.08f

    .line 422
    .line 423
    .line 424
    const/high16 v16, -0x40c00000    # -0.75f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x40cf5c29    # -0.69f

    .line 430
    .line 431
    .line 432
    const v2, -0x409eb852    # -0.88f

    .line 433
    .line 434
    .line 435
    const v4, -0x413851ec    # -0.39f

    .line 436
    .line 437
    .line 438
    const v6, -0x40deb852    # -0.63f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x40747ae1    # -1.09f

    .line 445
    .line 446
    .line 447
    const v18, -0x40e8f5c3    # -0.59f

    .line 448
    .line 449
    .line 450
    const v13, -0x41666666    # -0.3f

    .line 451
    .line 452
    .line 453
    const/high16 v14, -0x41800000    # -0.25f

    .line 454
    .line 455
    const v15, -0x40d70a3d    # -0.66f

    .line 456
    .line 457
    .line 458
    const v16, -0x411eb852    # -0.44f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, -0x40451eb8    # -1.46f

    .line 465
    .line 466
    .line 467
    const v18, -0x419eb852    # -0.22f

    .line 468
    .line 469
    .line 470
    const v13, -0x4123d70a    # -0.43f

    .line 471
    .line 472
    .line 473
    const v14, -0x41e66666    # -0.15f

    .line 474
    .line 475
    .line 476
    const v15, -0x40947ae1    # -0.92f

    .line 477
    .line 478
    .line 479
    const v16, -0x419eb852    # -0.22f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, -0x404e147b    # -1.39f

    .line 486
    .line 487
    .line 488
    const v18, 0x3e570a3d    # 0.21f

    .line 489
    .line 490
    .line 491
    const v13, -0x40fd70a4    # -0.51f

    .line 492
    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const v15, -0x40851eb8    # -0.98f

    .line 496
    .line 497
    .line 498
    const v16, 0x3d8f5c29    # 0.07f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3ea8f5c3    # 0.33f

    .line 505
    .line 506
    .line 507
    const v2, -0x407851ec    # -1.06f

    .line 508
    .line 509
    .line 510
    const v4, 0x3f11eb85    # 0.57f

    .line 511
    .line 512
    .line 513
    const v6, -0x40bae148    # -0.77f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, -0x40d47ae1    # -0.67f

    .line 520
    .line 521
    .line 522
    const v18, 0x3f570a3d    # 0.84f

    .line 523
    .line 524
    .line 525
    const v13, -0x416b851f    # -0.29f

    .line 526
    .line 527
    .line 528
    const v14, 0x3e75c28f    # 0.24f

    .line 529
    .line 530
    .line 531
    const v15, -0x40fd70a4    # -0.51f

    .line 532
    .line 533
    .line 534
    const v16, 0x3f051eb8    # 0.52f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, -0x41947ae1    # -0.23f

    .line 541
    .line 542
    .line 543
    const v18, 0x3f8147ae    # 1.01f

    .line 544
    .line 545
    .line 546
    const v13, -0x41dc28f6    # -0.16f

    .line 547
    .line 548
    .line 549
    const v14, 0x3ea3d70a    # 0.32f

    .line 550
    .line 551
    .line 552
    const v15, -0x41947ae1    # -0.23f

    .line 553
    .line 554
    .line 555
    const v16, 0x3f266666    # 0.65f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3e6b851f    # 0.23f

    .line 562
    .line 563
    .line 564
    const v2, 0x3f75c28f    # 0.96f

    .line 565
    .line 566
    .line 567
    const v4, 0x3da3d70a    # 0.08f

    .line 568
    .line 569
    .line 570
    const v6, 0x3f30a3d7    # 0.69f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, 0x3f23d70a    # 0.64f

    .line 577
    .line 578
    .line 579
    const v18, 0x3f3ae148    # 0.73f

    .line 580
    .line 581
    .line 582
    const v13, 0x3e19999a    # 0.15f

    .line 583
    .line 584
    .line 585
    const v14, 0x3e8f5c29    # 0.28f

    .line 586
    .line 587
    .line 588
    const v15, 0x3eb851ec    # 0.36f

    .line 589
    .line 590
    .line 591
    const v16, 0x3f051eb8    # 0.52f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x3f7ae148    # 0.98f

    .line 598
    .line 599
    .line 600
    const v18, 0x3f07ae14    # 0.53f

    .line 601
    .line 602
    .line 603
    const v13, 0x3e8a3d71    # 0.27f

    .line 604
    .line 605
    .line 606
    const v14, 0x3e570a3d    # 0.21f

    .line 607
    .line 608
    .line 609
    const v15, 0x3f19999a    # 0.6f

    .line 610
    .line 611
    .line 612
    const v16, 0x3ec28f5c    # 0.38f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x3fa28f5c    # 1.27f

    .line 619
    .line 620
    .line 621
    const v18, 0x3eb851ec    # 0.36f

    .line 622
    .line 623
    .line 624
    const v13, 0x3ec28f5c    # 0.38f

    .line 625
    .line 626
    .line 627
    const v14, 0x3e0f5c29    # 0.14f

    .line 628
    .line 629
    .line 630
    const v15, 0x3f4f5c29    # 0.81f

    .line 631
    .line 632
    .line 633
    const v16, 0x3e851eb8    # 0.26f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3f733333    # 0.95f

    .line 640
    .line 641
    .line 642
    const v18, 0x3e851eb8    # 0.26f

    .line 643
    .line 644
    .line 645
    const v13, 0x3ec7ae14    # 0.39f

    .line 646
    .line 647
    .line 648
    const v14, 0x3da3d70a    # 0.08f

    .line 649
    .line 650
    .line 651
    const v15, 0x3f35c28f    # 0.71f

    .line 652
    .line 653
    .line 654
    const v16, 0x3e2e147b    # 0.17f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x3edc28f6    # 0.43f

    .line 661
    .line 662
    .line 663
    const v2, 0x3e428f5c    # 0.19f

    .line 664
    .line 665
    .line 666
    const v4, 0x3f11eb85    # 0.57f

    .line 667
    .line 668
    .line 669
    const v6, 0x3e947ae1    # 0.29f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v17, 0x3e8a3d71    # 0.27f

    .line 676
    .line 677
    .line 678
    const v18, 0x3eae147b    # 0.34f

    .line 679
    .line 680
    .line 681
    const v13, 0x3e051eb8    # 0.13f

    .line 682
    .line 683
    .line 684
    const v14, 0x3dcccccd    # 0.1f

    .line 685
    .line 686
    .line 687
    const v15, 0x3e6147ae    # 0.22f

    .line 688
    .line 689
    .line 690
    const v16, 0x3e6147ae    # 0.22f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v17, 0x3d8f5c29    # 0.07f

    .line 697
    .line 698
    .line 699
    const v18, 0x3ec7ae14    # 0.39f

    .line 700
    .line 701
    .line 702
    const v13, 0x3d4ccccd    # 0.05f

    .line 703
    .line 704
    .line 705
    const v14, 0x3df5c28f    # 0.12f

    .line 706
    .line 707
    .line 708
    const v15, 0x3d8f5c29    # 0.07f

    .line 709
    .line 710
    .line 711
    const/high16 v16, 0x3e800000    # 0.25f

    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, -0x41333333    # -0.4f

    .line 717
    .line 718
    .line 719
    const v18, 0x3f451eb8    # 0.77f

    .line 720
    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const v14, 0x3ea3d70a    # 0.32f

    .line 724
    .line 725
    .line 726
    const v15, -0x41fae148    # -0.13f

    .line 727
    .line 728
    .line 729
    const v16, 0x3f11eb85    # 0.57f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, -0x40d70a3d    # -0.66f

    .line 736
    .line 737
    .line 738
    const v2, -0x406a3d71    # -1.17f

    .line 739
    .line 740
    .line 741
    const v4, 0x3e947ae1    # 0.29f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, -0x40dc28f6    # -0.64f

    .line 748
    .line 749
    .line 750
    const v18, -0x425c28f6    # -0.08f

    .line 751
    .line 752
    .line 753
    const v13, -0x419eb852    # -0.22f

    .line 754
    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    const v15, -0x4123d70a    # -0.43f

    .line 758
    .line 759
    .line 760
    const v16, -0x435c28f6    # -0.02f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v17, -0x40f0a3d7    # -0.56f

    .line 767
    .line 768
    .line 769
    const v18, -0x418a3d71    # -0.24f

    .line 770
    .line 771
    .line 772
    const v13, -0x41a8f5c3    # -0.21f

    .line 773
    .line 774
    .line 775
    const v14, -0x42b33333    # -0.05f

    .line 776
    .line 777
    .line 778
    const v15, -0x41333333    # -0.4f

    .line 779
    .line 780
    .line 781
    const v16, -0x41fae148    # -0.13f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, -0x412e147b    # -0.41f

    .line 788
    .line 789
    .line 790
    const v18, -0x411eb852    # -0.44f

    .line 791
    .line 792
    .line 793
    const v13, -0x41d1eb85    # -0.17f

    .line 794
    .line 795
    .line 796
    const v14, -0x421eb852    # -0.11f

    .line 797
    .line 798
    .line 799
    const v15, -0x41666666    # -0.3f

    .line 800
    .line 801
    .line 802
    const v16, -0x417ae148    # -0.26f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v17, -0x41c7ae14    # -0.18f

    .line 809
    .line 810
    .line 811
    const v18, -0x40d47ae1    # -0.67f

    .line 812
    .line 813
    .line 814
    const v13, -0x421eb852    # -0.11f

    .line 815
    .line 816
    .line 817
    const v14, -0x41c7ae14    # -0.18f

    .line 818
    .line 819
    .line 820
    const v15, -0x41d1eb85    # -0.17f

    .line 821
    .line 822
    .line 823
    const v16, -0x412e147b    # -0.41f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, -0x400e147b    # -1.89f

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v17, 0x3e75c28f    # 0.24f

    .line 836
    .line 837
    .line 838
    const v18, 0x3f866666    # 1.05f

    .line 839
    .line 840
    .line 841
    const/4 v13, 0x0

    .line 842
    const v14, 0x3eb851ec    # 0.36f

    .line 843
    .line 844
    .line 845
    const v15, 0x3da3d70a    # 0.08f

    .line 846
    .line 847
    .line 848
    const v16, 0x3f35c28f    # 0.71f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, 0x3f333333    # 0.7f

    .line 855
    .line 856
    .line 857
    const v2, 0x3f6e147b    # 0.93f

    .line 858
    .line 859
    .line 860
    const v4, 0x3ec7ae14    # 0.39f

    .line 861
    .line 862
    .line 863
    const v6, 0x3f266666    # 0.65f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, 0x3f933333    # 1.15f

    .line 870
    .line 871
    .line 872
    const v18, 0x3f28f5c3    # 0.66f

    .line 873
    .line 874
    .line 875
    const v13, 0x3e9eb852    # 0.31f

    .line 876
    .line 877
    .line 878
    const v14, 0x3e8a3d71    # 0.27f

    .line 879
    .line 880
    .line 881
    const v15, 0x3f30a3d7    # 0.69f

    .line 882
    .line 883
    .line 884
    const v16, 0x3efae148    # 0.49f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v0, 0x3f7ae148    # 0.98f

    .line 891
    .line 892
    .line 893
    const v2, 0x3fca3d71    # 1.58f

    .line 894
    .line 895
    .line 896
    const/high16 v4, 0x3e800000    # 0.25f

    .line 897
    .line 898
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const v17, 0x3fb851ec    # 1.44f

    .line 902
    .line 903
    .line 904
    const v18, -0x41bd70a4    # -0.19f

    .line 905
    .line 906
    .line 907
    const v13, 0x3f07ae14    # 0.53f

    .line 908
    .line 909
    .line 910
    const/4 v14, 0x0

    .line 911
    const v15, 0x3f8147ae    # 1.01f

    .line 912
    .line 913
    .line 914
    const v16, -0x428a3d71    # -0.06f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const v17, 0x3f8e147b    # 1.11f

    .line 921
    .line 922
    .line 923
    const v18, -0x40f5c28f    # -0.54f

    .line 924
    .line 925
    .line 926
    const v13, 0x3edc28f6    # 0.43f

    .line 927
    .line 928
    .line 929
    const v14, -0x41fae148    # -0.13f

    .line 930
    .line 931
    .line 932
    const v15, 0x3f4ccccd    # 0.8f

    .line 933
    .line 934
    .line 935
    const v16, -0x416147ae    # -0.31f

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, 0x3f35c28f    # 0.71f

    .line 942
    .line 943
    .line 944
    const v18, -0x40ab851f    # -0.83f

    .line 945
    .line 946
    .line 947
    const v13, 0x3e9eb852    # 0.31f

    .line 948
    .line 949
    .line 950
    const v14, -0x41947ae1    # -0.23f

    .line 951
    .line 952
    .line 953
    const v15, 0x3f0a3d71    # 0.54f

    .line 954
    .line 955
    .line 956
    const v16, -0x40fd70a4    # -0.51f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v17, 0x3e800000    # 0.25f

    .line 963
    .line 964
    const v18, -0x407851ec    # -1.06f

    .line 965
    .line 966
    .line 967
    const v13, 0x3e2e147b    # 0.17f

    .line 968
    .line 969
    .line 970
    const v14, -0x415c28f6    # -0.32f

    .line 971
    .line 972
    .line 973
    const/high16 v15, 0x3e800000    # 0.25f

    .line 974
    .line 975
    const v16, -0x40d47ae1    # -0.67f

    .line 976
    .line 977
    .line 978
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const v17, -0x418a3d71    # -0.24f

    .line 982
    .line 983
    .line 984
    const v18, -0x407d70a4    # -1.02f

    .line 985
    .line 986
    .line 987
    const v13, -0x435c28f6    # -0.02f

    .line 988
    .line 989
    .line 990
    const v14, -0x41333333    # -0.4f

    .line 991
    .line 992
    .line 993
    const v15, -0x4247ae14    # -0.09f

    .line 994
    .line 995
    .line 996
    const v16, -0x40c28f5c    # -0.74f

    .line 997
    .line 998
    .line 999
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v0, 0x415cf5c3    # 13.81f

    .line 1006
    .line 1007
    .line 1008
    const v2, 0x40e1999a    # 7.05f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v17, -0x40628f5c    # -1.23f

    .line 1015
    .line 1016
    .line 1017
    const v18, -0x409eb852    # -0.88f

    .line 1018
    .line 1019
    .line 1020
    const v13, -0x4151eb85    # -0.34f

    .line 1021
    .line 1022
    .line 1023
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1024
    .line 1025
    const v16, -0x40cccccd    # -0.7f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, -0x40347ae1    # -1.59f

    .line 1032
    .line 1033
    .line 1034
    const v18, -0x4175c28f    # -0.27f

    .line 1035
    .line 1036
    .line 1037
    const v13, -0x410f5c29    # -0.47f

    .line 1038
    .line 1039
    .line 1040
    const v14, -0x41c7ae14    # -0.18f

    .line 1041
    .line 1042
    .line 1043
    const v15, -0x407eb852    # -1.01f

    .line 1044
    .line 1045
    .line 1046
    const v16, -0x4175c28f    # -0.27f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v0, 0x3db851ec    # 0.09f

    .line 1053
    .line 1054
    .line 1055
    const v2, -0x40347ae1    # -1.59f

    .line 1056
    .line 1057
    .line 1058
    const v4, 0x3e8a3d71    # 0.27f

    .line 1059
    .line 1060
    .line 1061
    const v6, -0x4071eb85    # -1.11f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v17, -0x40628f5c    # -1.23f

    .line 1068
    .line 1069
    .line 1070
    const v18, 0x3f6147ae    # 0.88f

    .line 1071
    .line 1072
    .line 1073
    const v13, -0x410a3d71    # -0.48f

    .line 1074
    .line 1075
    .line 1076
    const v14, 0x3e3851ec    # 0.18f

    .line 1077
    .line 1078
    .line 1079
    const v15, -0x409c28f6    # -0.89f

    .line 1080
    .line 1081
    .line 1082
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v17, -0x40b5c28f    # -0.79f

    .line 1089
    .line 1090
    .line 1091
    const v18, 0x3fcb851f    # 1.59f

    .line 1092
    .line 1093
    .line 1094
    const v13, -0x4151eb85    # -0.34f

    .line 1095
    .line 1096
    .line 1097
    const v14, 0x3ed1eb85    # 0.41f

    .line 1098
    .line 1099
    .line 1100
    const v15, -0x40e66666    # -0.6f

    .line 1101
    .line 1102
    .line 1103
    const v16, 0x3f6e147b    # 0.93f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const v17, -0x4170a3d7    # -0.28f

    .line 1110
    .line 1111
    .line 1112
    const v18, 0x4018f5c3    # 2.39f

    .line 1113
    .line 1114
    .line 1115
    const v13, -0x41c7ae14    # -0.18f

    .line 1116
    .line 1117
    .line 1118
    const v14, 0x3f266666    # 0.65f

    .line 1119
    .line 1120
    .line 1121
    const v15, -0x4170a3d7    # -0.28f

    .line 1122
    .line 1123
    .line 1124
    const v16, 0x3fb9999a    # 1.45f

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const v0, 0x3ff5c28f    # 1.92f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v17, 0x3e8f5c29    # 0.28f

    .line 1137
    .line 1138
    .line 1139
    const/4 v13, 0x0

    .line 1140
    const v14, 0x3f70a3d7    # 0.94f

    .line 1141
    .line 1142
    .line 1143
    const v15, 0x3db851ec    # 0.09f

    .line 1144
    .line 1145
    .line 1146
    const v16, 0x3fdeb852    # 1.74f

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1150
    .line 1151
    .line 1152
    const v17, 0x3f4ccccd    # 0.8f

    .line 1153
    .line 1154
    .line 1155
    const v18, 0x3fcccccd    # 1.6f

    .line 1156
    .line 1157
    .line 1158
    const v13, 0x3e428f5c    # 0.19f

    .line 1159
    .line 1160
    .line 1161
    const v14, 0x3f28f5c3    # 0.66f

    .line 1162
    .line 1163
    .line 1164
    const v15, 0x3ee66666    # 0.45f

    .line 1165
    .line 1166
    .line 1167
    const v16, 0x3f9851ec    # 1.19f

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1171
    .line 1172
    .line 1173
    const v17, 0x3f9d70a4    # 1.23f

    .line 1174
    .line 1175
    .line 1176
    const v18, 0x3f63d70a    # 0.89f

    .line 1177
    .line 1178
    .line 1179
    const v13, 0x3eae147b    # 0.34f

    .line 1180
    .line 1181
    .line 1182
    const v14, 0x3ed1eb85    # 0.41f

    .line 1183
    .line 1184
    .line 1185
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1186
    .line 1187
    const v16, 0x3f35c28f    # 0.71f

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const v0, 0x3f8147ae    # 1.01f

    .line 1194
    .line 1195
    .line 1196
    const v2, 0x3fcb851f    # 1.59f

    .line 1197
    .line 1198
    .line 1199
    const v4, 0x3e8f5c29    # 0.28f

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const v17, 0x3fcb851f    # 1.59f

    .line 1206
    .line 1207
    .line 1208
    const v18, -0x4170a3d7    # -0.28f

    .line 1209
    .line 1210
    .line 1211
    const v13, 0x3f170a3d    # 0.59f

    .line 1212
    .line 1213
    .line 1214
    const/4 v14, 0x0

    .line 1215
    const v15, 0x3f8f5c29    # 1.12f

    .line 1216
    .line 1217
    .line 1218
    const v16, -0x4247ae14    # -0.09f

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1222
    .line 1223
    .line 1224
    const v17, 0x3f9c28f6    # 1.22f

    .line 1225
    .line 1226
    .line 1227
    const v18, -0x409c28f6    # -0.89f

    .line 1228
    .line 1229
    .line 1230
    const v13, 0x3ef5c28f    # 0.48f

    .line 1231
    .line 1232
    .line 1233
    const v14, -0x41c7ae14    # -0.18f

    .line 1234
    .line 1235
    .line 1236
    const v15, 0x3f6147ae    # 0.88f

    .line 1237
    .line 1238
    .line 1239
    const v16, -0x410a3d71    # -0.48f

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const v0, 0x3f47ae14    # 0.78f

    .line 1246
    .line 1247
    .line 1248
    const v2, -0x40333333    # -1.6f

    .line 1249
    .line 1250
    .line 1251
    const v4, 0x3f19999a    # 0.6f

    .line 1252
    .line 1253
    .line 1254
    const v6, -0x408f5c29    # -0.94f

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    .line 1260
    const v17, 0x3e8f5c29    # 0.28f

    .line 1261
    .line 1262
    .line 1263
    const v18, -0x3fe70a3d    # -2.39f

    .line 1264
    .line 1265
    .line 1266
    const v13, 0x3e3851ec    # 0.18f

    .line 1267
    .line 1268
    .line 1269
    const v14, -0x40d9999a    # -0.65f

    .line 1270
    .line 1271
    .line 1272
    const v15, 0x3e8f5c29    # 0.28f

    .line 1273
    .line 1274
    .line 1275
    const v16, -0x40466666    # -1.45f

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1279
    .line 1280
    .line 1281
    const v0, -0x400a3d71    # -1.92f

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const v17, -0x4170a3d7    # -0.28f

    .line 1288
    .line 1289
    .line 1290
    const/4 v13, 0x0

    .line 1291
    const v14, -0x408f5c29    # -0.94f

    .line 1292
    .line 1293
    .line 1294
    const v15, -0x4247ae14    # -0.09f

    .line 1295
    .line 1296
    .line 1297
    const v16, -0x402147ae    # -1.74f

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v17, -0x40b851ec    # -0.78f

    .line 1304
    .line 1305
    .line 1306
    const v18, -0x40347ae1    # -1.59f

    .line 1307
    .line 1308
    .line 1309
    const v13, -0x41c7ae14    # -0.18f

    .line 1310
    .line 1311
    .line 1312
    const v14, -0x40d70a3d    # -0.66f

    .line 1313
    .line 1314
    .line 1315
    const v15, -0x411eb852    # -0.44f

    .line 1316
    .line 1317
    .line 1318
    const v16, -0x4067ae14    # -1.19f

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v0, 0x414e3d71    # 12.89f

    .line 1328
    .line 1329
    .line 1330
    const v2, 0x4153851f    # 13.22f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    const v17, -0x420a3d71    # -0.12f

    .line 1337
    .line 1338
    .line 1339
    const v18, 0x3fc3d70a    # 1.53f

    .line 1340
    .line 1341
    .line 1342
    const/4 v13, 0x0

    .line 1343
    const v14, 0x3f19999a    # 0.6f

    .line 1344
    .line 1345
    .line 1346
    const v15, -0x42dc28f6    # -0.04f

    .line 1347
    .line 1348
    .line 1349
    const v16, 0x3f8e147b    # 1.11f

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    const v0, -0x4147ae14    # -0.36f

    .line 1356
    .line 1357
    .line 1358
    const v2, 0x3f828f5c    # 1.02f

    .line 1359
    .line 1360
    .line 1361
    const v4, -0x41b33333    # -0.2f

    .line 1362
    .line 1363
    .line 1364
    const v6, 0x3f428f5c    # 0.76f

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1368
    .line 1369
    .line 1370
    const v17, -0x40e8f5c3    # -0.59f

    .line 1371
    .line 1372
    .line 1373
    const v18, 0x3f11eb85    # 0.57f

    .line 1374
    .line 1375
    .line 1376
    const v13, -0x41dc28f6    # -0.16f

    .line 1377
    .line 1378
    .line 1379
    const v14, 0x3e851eb8    # 0.26f

    .line 1380
    .line 1381
    .line 1382
    const v15, -0x4147ae14    # -0.36f

    .line 1383
    .line 1384
    .line 1385
    const v16, 0x3ee66666    # 0.45f

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1389
    .line 1390
    .line 1391
    const v17, -0x40ae147b    # -0.82f

    .line 1392
    .line 1393
    .line 1394
    const v18, 0x3e3851ec    # 0.18f

    .line 1395
    .line 1396
    .line 1397
    const v13, -0x41947ae1    # -0.23f

    .line 1398
    .line 1399
    .line 1400
    const v14, 0x3df5c28f    # 0.12f

    .line 1401
    .line 1402
    .line 1403
    const v15, -0x40fd70a4    # -0.51f

    .line 1404
    .line 1405
    .line 1406
    const v16, 0x3e3851ec    # 0.18f

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    const v18, -0x41c7ae14    # -0.18f

    .line 1413
    .line 1414
    .line 1415
    const v13, -0x41666666    # -0.3f

    .line 1416
    .line 1417
    .line 1418
    const/4 v14, 0x0

    .line 1419
    const v15, -0x40eb851f    # -0.58f

    .line 1420
    .line 1421
    .line 1422
    const v16, -0x428a3d71    # -0.06f

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    const v0, -0x40e66666    # -0.6f

    .line 1429
    .line 1430
    .line 1431
    const v2, -0x40ee147b    # -0.57f

    .line 1432
    .line 1433
    .line 1434
    const v4, -0x411eb852    # -0.44f

    .line 1435
    .line 1436
    .line 1437
    const v6, -0x416147ae    # -0.31f

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1441
    .line 1442
    .line 1443
    const v17, -0x413d70a4    # -0.38f

    .line 1444
    .line 1445
    .line 1446
    const v18, -0x407d70a4    # -1.02f

    .line 1447
    .line 1448
    .line 1449
    const v13, -0x41dc28f6    # -0.16f

    .line 1450
    .line 1451
    .line 1452
    const v14, -0x417ae148    # -0.26f

    .line 1453
    .line 1454
    .line 1455
    const v15, -0x416b851f    # -0.29f

    .line 1456
    .line 1457
    .line 1458
    const v16, -0x40e66666    # -0.6f

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    const v0, -0x4091eb85    # -0.93f

    .line 1465
    .line 1466
    .line 1467
    const v2, -0x403c28f6    # -1.53f

    .line 1468
    .line 1469
    .line 1470
    const v4, -0x41fae148    # -0.13f

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1474
    .line 1475
    .line 1476
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1477
    .line 1478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1479
    .line 1480
    .line 1481
    const v17, 0x3e051eb8    # 0.13f

    .line 1482
    .line 1483
    .line 1484
    const v18, -0x403d70a4    # -1.52f

    .line 1485
    .line 1486
    .line 1487
    const/4 v13, 0x0

    .line 1488
    const v14, -0x40e66666    # -0.6f

    .line 1489
    .line 1490
    .line 1491
    const v15, 0x3d23d70a    # 0.04f

    .line 1492
    .line 1493
    .line 1494
    const v16, -0x4071eb85    # -1.11f

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1498
    .line 1499
    .line 1500
    const v0, -0x40c28f5c    # -0.74f

    .line 1501
    .line 1502
    .line 1503
    const v2, 0x3ec28f5c    # 0.38f

    .line 1504
    .line 1505
    .line 1506
    const/high16 v4, -0x40800000    # -1.0f

    .line 1507
    .line 1508
    const v6, 0x3e570a3d    # 0.21f

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1512
    .line 1513
    .line 1514
    const v17, 0x3f19999a    # 0.6f

    .line 1515
    .line 1516
    .line 1517
    const v18, -0x40f33333    # -0.55f

    .line 1518
    .line 1519
    .line 1520
    const v13, 0x3e23d70a    # 0.16f

    .line 1521
    .line 1522
    .line 1523
    const/high16 v14, -0x41800000    # -0.25f

    .line 1524
    .line 1525
    const v15, 0x3eb851ec    # 0.36f

    .line 1526
    .line 1527
    .line 1528
    const v16, -0x4123d70a    # -0.43f

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const v17, 0x3f4f5c29    # 0.81f

    .line 1535
    .line 1536
    .line 1537
    const v18, -0x41d1eb85    # -0.17f

    .line 1538
    .line 1539
    .line 1540
    const v13, 0x3e75c28f    # 0.24f

    .line 1541
    .line 1542
    .line 1543
    const v14, -0x421eb852    # -0.11f

    .line 1544
    .line 1545
    .line 1546
    const v15, 0x3f028f5c    # 0.51f

    .line 1547
    .line 1548
    .line 1549
    const v16, -0x41d1eb85    # -0.17f

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1553
    .line 1554
    .line 1555
    const v18, 0x3e2e147b    # 0.17f

    .line 1556
    .line 1557
    .line 1558
    const v13, 0x3e9eb852    # 0.31f

    .line 1559
    .line 1560
    .line 1561
    const/4 v14, 0x0

    .line 1562
    const v15, 0x3f147ae1    # 0.58f

    .line 1563
    .line 1564
    .line 1565
    const v16, 0x3d75c28f    # 0.06f

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1569
    .line 1570
    .line 1571
    const v17, 0x3f19999a    # 0.6f

    .line 1572
    .line 1573
    .line 1574
    const v18, 0x3f0ccccd    # 0.55f

    .line 1575
    .line 1576
    .line 1577
    const v13, 0x3e75c28f    # 0.24f

    .line 1578
    .line 1579
    .line 1580
    const v14, 0x3de147ae    # 0.11f

    .line 1581
    .line 1582
    .line 1583
    const v15, 0x3ee147ae    # 0.44f

    .line 1584
    .line 1585
    .line 1586
    const v16, 0x3e947ae1    # 0.29f

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1590
    .line 1591
    .line 1592
    const v17, 0x3ebd70a4    # 0.37f

    .line 1593
    .line 1594
    .line 1595
    const v18, 0x3f7d70a4    # 0.99f

    .line 1596
    .line 1597
    .line 1598
    const v13, 0x3e23d70a    # 0.16f

    .line 1599
    .line 1600
    .line 1601
    const/high16 v14, 0x3e800000    # 0.25f

    .line 1602
    .line 1603
    const v15, 0x3e947ae1    # 0.29f

    .line 1604
    .line 1605
    .line 1606
    const v16, 0x3f147ae1    # 0.58f

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1610
    .line 1611
    .line 1612
    const v0, 0x3f6b851f    # 0.92f

    .line 1613
    .line 1614
    .line 1615
    const v2, 0x3fc28f5c    # 1.52f

    .line 1616
    .line 1617
    .line 1618
    const v4, 0x3e051eb8    # 0.13f

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1622
    .line 1623
    .line 1624
    const v0, 0x4020a3d7    # 2.51f

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1628
    .line 1629
    .line 1630
    const v0, -0x43dc28f6    # -0.01f

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1637
    .line 1638
    .line 1639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    const/16 v16, 0x3800

    .line 1644
    .line 1645
    const/16 v17, 0x0

    .line 1646
    .line 1647
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1648
    .line 1649
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1650
    .line 1651
    const/4 v7, 0x0

    .line 1652
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1653
    .line 1654
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1655
    .line 1656
    const/4 v13, 0x0

    .line 1657
    const/4 v14, 0x0

    .line 1658
    const/4 v15, 0x0

    .line 1659
    const-string v4, ""

    .line 1660
    .line 1661
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    sput-object v0, Landroidx/compose/material/icons/outlined/Timer10Kt;->_timer10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1670
    .line 1671
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1672
    .line 1673
    .line 1674
    return-object v0
.end method

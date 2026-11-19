.class public final Landroidx/compose/material/icons/rounded/Forward30Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _forward30:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward30(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Forward30"

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
    const v0, 0x41975c29    # 18.92f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40851eb8    # -0.98f

    .line 79
    .line 80
    .line 81
    const v18, 0x3f5c28f6    # 0.86f

    .line 82
    .line 83
    .line 84
    const/high16 v13, -0x41000000    # -0.5f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x40970a3d    # -0.91f

    .line 88
    .line 89
    .line 90
    const v16, 0x3ebd70a4    # 0.37f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x3f128f5c    # -7.42f

    .line 97
    .line 98
    .line 99
    const v18, 0x409eb852    # 4.96f

    .line 100
    .line 101
    .line 102
    const v13, -0x410a3d71    # -0.48f

    .line 103
    .line 104
    .line 105
    const v14, 0x4057ae14    # 3.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x3f8eb852    # -3.77f

    .line 109
    .line 110
    .line 111
    const v16, 0x40bae148    # 5.84f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3f73851f    # -4.39f

    .line 118
    .line 119
    .line 120
    const v18, -0x3f6f0a3d    # -4.53f

    .line 121
    .line 122
    .line 123
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 124
    .line 125
    const v14, -0x40f5c28f    # -0.54f

    .line 126
    .line 127
    .line 128
    const v15, -0x3f85c28f    # -3.91f

    .line 129
    .line 130
    .line 131
    const v16, -0x3feeb852    # -2.27f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x41400000    # 12.0f

    .line 138
    .line 139
    const/high16 v18, 0x40e00000    # 7.0f

    .line 140
    .line 141
    const v13, 0x40aa3d71    # 5.32f

    .line 142
    .line 143
    .line 144
    const v14, 0x4126b852    # 10.42f

    .line 145
    .line 146
    .line 147
    const v15, 0x410451ec    # 8.27f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x40e00000    # 7.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x40328f5c    # 2.79f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x3f59999a    # 0.85f

    .line 162
    .line 163
    .line 164
    const v18, 0x3eb33333    # 0.35f

    .line 165
    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const v14, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    const v15, 0x3f0a3d71    # 0.54f

    .line 172
    .line 173
    .line 174
    const v16, 0x3f2b851f    # 0.67f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x40728f5c    # 3.79f

    .line 181
    .line 182
    .line 183
    const v2, -0x3f8d70a4    # -3.79f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const v18, -0x40ca3d71    # -0.71f

    .line 192
    .line 193
    .line 194
    const v13, 0x3e4ccccd    # 0.2f

    .line 195
    .line 196
    .line 197
    const v14, -0x41b33333    # -0.2f

    .line 198
    .line 199
    .line 200
    const v15, 0x3e4ccccd    # 0.2f

    .line 201
    .line 202
    .line 203
    const v16, -0x40fd70a4    # -0.51f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, -0x3f8d70a4    # -3.79f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x40a66666    # -0.85f

    .line 216
    .line 217
    .line 218
    const v18, 0x3eb851ec    # 0.36f

    .line 219
    .line 220
    .line 221
    const v13, -0x416147ae    # -0.31f

    .line 222
    .line 223
    .line 224
    const v14, -0x416147ae    # -0.31f

    .line 225
    .line 226
    .line 227
    const v15, -0x40a66666    # -0.85f

    .line 228
    .line 229
    .line 230
    const v16, -0x4247ae14    # -0.09f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41400000    # 12.0f

    .line 237
    .line 238
    const/high16 v2, 0x40a00000    # 5.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x3f051eb8    # -7.84f

    .line 244
    .line 245
    .line 246
    const v18, 0x4119999a    # 9.6f

    .line 247
    .line 248
    .line 249
    const v13, -0x3f61eb85    # -4.94f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const v15, -0x3ef28f5c    # -8.84f

    .line 254
    .line 255
    .line 256
    const v16, 0x408f5c29    # 4.48f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x40bfae14    # 5.99f

    .line 263
    .line 264
    .line 265
    const v18, 0x40c6147b    # 6.19f

    .line 266
    .line 267
    .line 268
    const v13, 0x3f19999a    # 0.6f

    .line 269
    .line 270
    .line 271
    const v14, 0x40470a3d    # 3.11f

    .line 272
    .line 273
    .line 274
    const v15, 0x4039999a    # 2.9f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x40b00000    # 5.5f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x411c51ec    # 9.77f

    .line 283
    .line 284
    .line 285
    const v18, -0x3f2a8f5c    # -6.67f

    .line 286
    .line 287
    .line 288
    const v13, 0x409a8f5c    # 4.83f

    .line 289
    .line 290
    .line 291
    const v14, 0x3f8a3d71    # 1.08f

    .line 292
    .line 293
    .line 294
    const v15, 0x41126666    # 9.15f

    .line 295
    .line 296
    .line 297
    const v16, -0x3ff33333    # -2.2f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x40800000    # -1.0f

    .line 304
    .line 305
    const v18, -0x4070a3d7    # -1.12f

    .line 306
    .line 307
    .line 308
    const v13, 0x3db851ec    # 0.09f

    .line 309
    .line 310
    .line 311
    const v14, -0x40e8f5c3    # -0.59f

    .line 312
    .line 313
    .line 314
    const v15, -0x41333333    # -0.4f

    .line 315
    .line 316
    .line 317
    const v16, -0x4070a3d7    # -1.12f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x4128a3d7    # 10.54f

    .line 327
    .line 328
    .line 329
    const v2, 0x4173851f    # 15.22f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, -0x41b33333    # -0.2f

    .line 336
    .line 337
    .line 338
    const v18, 0x3df5c28f    # 0.12f

    .line 339
    .line 340
    .line 341
    const v13, -0x428a3d71    # -0.06f

    .line 342
    .line 343
    .line 344
    const v14, 0x3d4ccccd    # 0.05f

    .line 345
    .line 346
    .line 347
    const v15, -0x420a3d71    # -0.12f

    .line 348
    .line 349
    .line 350
    const v16, 0x3db851ec    # 0.09f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, -0x4175c28f    # -0.27f

    .line 357
    .line 358
    .line 359
    const v2, -0x41d1eb85    # -0.17f

    .line 360
    .line 361
    .line 362
    const v4, 0x3d23d70a    # 0.04f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, -0x41800000    # -0.25f

    .line 369
    .line 370
    const v18, -0x42dc28f6    # -0.04f

    .line 371
    .line 372
    .line 373
    const v13, -0x4247ae14    # -0.09f

    .line 374
    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const v15, -0x41d1eb85    # -0.17f

    .line 378
    .line 379
    .line 380
    const v16, -0x43dc28f6    # -0.01f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x428a3d71    # -0.06f

    .line 387
    .line 388
    .line 389
    const v2, -0x41b33333    # -0.2f

    .line 390
    .line 391
    .line 392
    const v4, -0x421eb852    # -0.11f

    .line 393
    .line 394
    .line 395
    const v6, -0x41f0a3d7    # -0.14f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x41fae148    # -0.13f

    .line 402
    .line 403
    .line 404
    const v2, -0x42333333    # -0.1f

    .line 405
    .line 406
    .line 407
    const v4, -0x41d1eb85    # -0.17f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v2, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, -0x419eb852    # -0.22f

    .line 414
    .line 415
    .line 416
    const v2, -0x42b33333    # -0.05f

    .line 417
    .line 418
    .line 419
    const v4, -0x41f0a3d7    # -0.14f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v2, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x40a66666    # -0.85f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3df5c28f    # 0.12f

    .line 432
    .line 433
    .line 434
    const v18, 0x3f0ccccd    # 0.55f

    .line 435
    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const v14, 0x3e570a3d    # 0.21f

    .line 439
    .line 440
    .line 441
    const v15, 0x3d23d70a    # 0.04f

    .line 442
    .line 443
    .line 444
    const v16, 0x3ec7ae14    # 0.39f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x3e8f5c29    # 0.28f

    .line 451
    .line 452
    .line 453
    const v2, 0x3ec28f5c    # 0.38f

    .line 454
    .line 455
    .line 456
    const v4, 0x3ea8f5c3    # 0.33f

    .line 457
    .line 458
    .line 459
    const v6, 0x3e428f5c    # 0.19f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x3eeb851f    # 0.46f

    .line 466
    .line 467
    .line 468
    const v2, 0x3e6b851f    # 0.23f

    .line 469
    .line 470
    .line 471
    const v4, 0x3e947ae1    # 0.29f

    .line 472
    .line 473
    .line 474
    const v6, 0x3e3851ec    # 0.18f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x3f07ae14    # 0.53f

    .line 481
    .line 482
    .line 483
    const v2, 0x3d8f5c29    # 0.07f

    .line 484
    .line 485
    .line 486
    const v4, 0x3eb33333    # 0.35f

    .line 487
    .line 488
    .line 489
    const v6, 0x3d8f5c29    # 0.07f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x3f19999a    # 0.6f

    .line 496
    .line 497
    .line 498
    const v18, -0x425c28f6    # -0.08f

    .line 499
    .line 500
    .line 501
    const v13, 0x3e570a3d    # 0.21f

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const v15, 0x3ed1eb85    # 0.41f

    .line 506
    .line 507
    .line 508
    const v16, -0x430a3d71    # -0.03f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3ef5c28f    # 0.48f

    .line 515
    .line 516
    .line 517
    const v2, -0x418a3d71    # -0.24f

    .line 518
    .line 519
    .line 520
    const v4, -0x41f0a3d7    # -0.14f

    .line 521
    .line 522
    .line 523
    const v6, 0x3eae147b    # 0.34f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3ea3d70a    # 0.32f

    .line 530
    .line 531
    .line 532
    const v2, -0x413851ec    # -0.39f

    .line 533
    .line 534
    .line 535
    const v4, 0x3e75c28f    # 0.24f

    .line 536
    .line 537
    .line 538
    const v6, -0x418a3d71    # -0.24f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x40f851ec    # -0.53f

    .line 545
    .line 546
    .line 547
    const v2, -0x41570a3d    # -0.33f

    .line 548
    .line 549
    .line 550
    const v4, 0x3df5c28f    # 0.12f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x41c7ae14    # -0.18f

    .line 557
    .line 558
    .line 559
    const v18, -0x40e3d70a    # -0.61f

    .line 560
    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const v14, -0x41947ae1    # -0.23f

    .line 564
    .line 565
    .line 566
    const v15, -0x428a3d71    # -0.06f

    .line 567
    .line 568
    .line 569
    const v16, -0x411eb852    # -0.44f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, -0x40f5c28f    # -0.54f

    .line 576
    .line 577
    .line 578
    const v2, -0x413851ec    # -0.39f

    .line 579
    .line 580
    .line 581
    const v4, -0x41666666    # -0.3f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x3e8f5c29    # 0.28f

    .line 588
    .line 589
    .line 590
    const v18, -0x41d1eb85    # -0.17f

    .line 591
    .line 592
    .line 593
    const v13, 0x3dcccccd    # 0.1f

    .line 594
    .line 595
    .line 596
    const v14, -0x42b33333    # -0.05f

    .line 597
    .line 598
    .line 599
    const v15, 0x3e4ccccd    # 0.2f

    .line 600
    .line 601
    .line 602
    const v16, -0x42333333    # -0.1f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x3e4ccccd    # 0.2f

    .line 609
    .line 610
    .line 611
    const v2, -0x419eb852    # -0.22f

    .line 612
    .line 613
    .line 614
    const v4, -0x41f0a3d7    # -0.14f

    .line 615
    .line 616
    .line 617
    const v6, 0x3e19999a    # 0.15f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x3e051eb8    # 0.13f

    .line 624
    .line 625
    .line 626
    const/high16 v2, -0x41800000    # -0.25f

    .line 627
    .line 628
    const v4, 0x3dcccccd    # 0.1f

    .line 629
    .line 630
    .line 631
    const v6, -0x41dc28f6    # -0.16f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, -0x4175c28f    # -0.27f

    .line 638
    .line 639
    .line 640
    const v2, -0x41c7ae14    # -0.18f

    .line 641
    .line 642
    .line 643
    const v4, 0x3d23d70a    # 0.04f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, -0x421eb852    # -0.11f

    .line 650
    .line 651
    .line 652
    const v18, -0x40f851ec    # -0.53f

    .line 653
    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    const v14, -0x41b33333    # -0.2f

    .line 657
    .line 658
    .line 659
    const v15, -0x42dc28f6    # -0.04f

    .line 660
    .line 661
    .line 662
    const v16, -0x41428f5c    # -0.37f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, -0x4170a3d7    # -0.28f

    .line 669
    .line 670
    .line 671
    const v2, -0x413d70a4    # -0.38f

    .line 672
    .line 673
    .line 674
    const v4, -0x41666666    # -0.3f

    .line 675
    .line 676
    .line 677
    const v6, -0x41d1eb85    # -0.17f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v2, -0x41147ae1    # -0.46f

    .line 684
    .line 685
    .line 686
    const v4, -0x41947ae1    # -0.23f

    .line 687
    .line 688
    .line 689
    const v6, -0x41c7ae14    # -0.18f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, -0x40e8f5c3    # -0.59f

    .line 696
    .line 697
    .line 698
    const v2, -0x425c28f6    # -0.08f

    .line 699
    .line 700
    .line 701
    const v4, -0x41428f5c    # -0.37f

    .line 702
    .line 703
    .line 704
    const v6, -0x425c28f6    # -0.08f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, -0x40f5c28f    # -0.54f

    .line 711
    .line 712
    .line 713
    const v18, 0x3da3d70a    # 0.08f

    .line 714
    .line 715
    .line 716
    const v13, -0x41bd70a4    # -0.19f

    .line 717
    .line 718
    .line 719
    const/4 v14, 0x0

    .line 720
    const v15, -0x413d70a4    # -0.38f

    .line 721
    .line 722
    .line 723
    const v16, 0x3cf5c28f    # 0.03f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, -0x411eb852    # -0.44f

    .line 730
    .line 731
    .line 732
    const v2, 0x3e6b851f    # 0.23f

    .line 733
    .line 734
    .line 735
    const v4, -0x415c28f6    # -0.32f

    .line 736
    .line 737
    .line 738
    const v6, 0x3e051eb8    # 0.13f

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, 0x3ebd70a4    # 0.37f

    .line 745
    .line 746
    .line 747
    const v2, -0x41947ae1    # -0.23f

    .line 748
    .line 749
    .line 750
    const v4, 0x3e6147ae    # 0.22f

    .line 751
    .line 752
    .line 753
    const v6, -0x41666666    # -0.3f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, 0x3e99999a    # 0.3f

    .line 760
    .line 761
    .line 762
    const v2, 0x3ef5c28f    # 0.48f

    .line 763
    .line 764
    .line 765
    const v4, -0x421eb852    # -0.11f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, 0x3f59999a    # 0.85f

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v17, 0x3d4ccccd    # 0.05f

    .line 778
    .line 779
    .line 780
    const v18, -0x41b33333    # -0.2f

    .line 781
    .line 782
    .line 783
    const/4 v13, 0x0

    .line 784
    const v14, -0x4270a3d7    # -0.07f

    .line 785
    .line 786
    .line 787
    const v15, 0x3ca3d70a    # 0.02f

    .line 788
    .line 789
    .line 790
    const v16, -0x41f0a3d7    # -0.14f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x3d8f5c29    # 0.07f

    .line 797
    .line 798
    .line 799
    const v2, -0x41e66666    # -0.15f

    .line 800
    .line 801
    .line 802
    const v4, 0x3df5c28f    # 0.12f

    .line 803
    .line 804
    .line 805
    const v6, -0x421eb852    # -0.11f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v0, -0x4270a3d7    # -0.07f

    .line 812
    .line 813
    .line 814
    const v2, -0x42333333    # -0.1f

    .line 815
    .line 816
    .line 817
    const v4, 0x3e3851ec    # 0.18f

    .line 818
    .line 819
    .line 820
    const v6, 0x3de147ae    # 0.11f

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v0, -0x430a3d71    # -0.03f

    .line 827
    .line 828
    .line 829
    const v2, -0x430a3d71    # -0.03f

    .line 830
    .line 831
    .line 832
    const v4, 0x3e0f5c29    # 0.14f

    .line 833
    .line 834
    .line 835
    const v6, 0x3e6147ae    # 0.22f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v17, 0x3e800000    # 0.25f

    .line 842
    .line 843
    const v18, 0x3d23d70a    # 0.04f

    .line 844
    .line 845
    .line 846
    const v13, 0x3dcccccd    # 0.1f

    .line 847
    .line 848
    .line 849
    const/4 v14, 0x0

    .line 850
    const v15, 0x3e3851ec    # 0.18f

    .line 851
    .line 852
    .line 853
    const v16, 0x3c23d70a    # 0.01f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v0, 0x3e051eb8    # 0.13f

    .line 860
    .line 861
    .line 862
    const v2, 0x3d75c28f    # 0.06f

    .line 863
    .line 864
    .line 865
    const v4, 0x3e3851ec    # 0.18f

    .line 866
    .line 867
    .line 868
    const v6, 0x3de147ae    # 0.11f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v0, 0x3da3d70a    # 0.08f

    .line 875
    .line 876
    .line 877
    const v2, 0x3e2e147b    # 0.17f

    .line 878
    .line 879
    .line 880
    const v4, 0x3de147ae    # 0.11f

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12, v0, v4, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v0, 0x3e0f5c29    # 0.14f

    .line 887
    .line 888
    .line 889
    const v2, 0x3e6147ae    # 0.22f

    .line 890
    .line 891
    .line 892
    const v4, 0x3d23d70a    # 0.04f

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v17, -0x41dc28f6    # -0.16f

    .line 899
    .line 900
    .line 901
    const v18, 0x3edc28f6    # 0.43f

    .line 902
    .line 903
    .line 904
    const/4 v13, 0x0

    .line 905
    const v14, 0x3e3851ec    # 0.18f

    .line 906
    .line 907
    .line 908
    const v15, -0x42b33333    # -0.05f

    .line 909
    .line 910
    .line 911
    const v16, 0x3ea3d70a    # 0.32f

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v0, -0x417ae148    # -0.26f

    .line 918
    .line 919
    .line 920
    const v2, -0x410a3d71    # -0.48f

    .line 921
    .line 922
    .line 923
    const v4, 0x3e23d70a    # 0.16f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, -0x4123d70a    # -0.43f

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, 0x3f28f5c3    # 0.66f

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, 0x3ee66666    # 0.45f

    .line 942
    .line 943
    .line 944
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v17, 0x3e947ae1    # 0.29f

    .line 948
    .line 949
    .line 950
    const v18, 0x3d23d70a    # 0.04f

    .line 951
    .line 952
    .line 953
    const v13, 0x3de147ae    # 0.11f

    .line 954
    .line 955
    .line 956
    const/4 v14, 0x0

    .line 957
    const v15, 0x3e4ccccd    # 0.2f

    .line 958
    .line 959
    .line 960
    const v16, 0x3c23d70a    # 0.01f

    .line 961
    .line 962
    .line 963
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const v0, 0x3d75c28f    # 0.06f

    .line 967
    .line 968
    .line 969
    const v2, 0x3e23d70a    # 0.16f

    .line 970
    .line 971
    .line 972
    const v4, 0x3e6147ae    # 0.22f

    .line 973
    .line 974
    .line 975
    invoke-virtual {v12, v2, v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v0, 0x3e4ccccd    # 0.2f

    .line 979
    .line 980
    .line 981
    const v2, 0x3e0f5c29    # 0.14f

    .line 982
    .line 983
    .line 984
    const v4, 0x3df5c28f    # 0.12f

    .line 985
    .line 986
    .line 987
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    const v0, 0x3e947ae1    # 0.29f

    .line 991
    .line 992
    .line 993
    const v2, 0x3d4ccccd    # 0.05f

    .line 994
    .line 995
    .line 996
    const v4, 0x3e3851ec    # 0.18f

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12, v2, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v17, -0x42dc28f6    # -0.04f

    .line 1003
    .line 1004
    .line 1005
    const v18, 0x3e75c28f    # 0.24f

    .line 1006
    .line 1007
    .line 1008
    const/4 v13, 0x0

    .line 1009
    const v14, 0x3db851ec    # 0.09f

    .line 1010
    .line 1011
    .line 1012
    const v15, -0x43dc28f6    # -0.01f

    .line 1013
    .line 1014
    .line 1015
    const v16, 0x3e2e147b    # 0.17f

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, -0x425c28f6    # -0.08f

    .line 1022
    .line 1023
    .line 1024
    const v2, -0x41fae148    # -0.13f

    .line 1025
    .line 1026
    .line 1027
    const v4, 0x3e2e147b    # 0.17f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v0, 0x41670a3d    # 14.44f

    .line 1037
    .line 1038
    .line 1039
    const v2, 0x413c7ae1    # 11.78f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v17, -0x40e8f5c3    # -0.59f

    .line 1046
    .line 1047
    .line 1048
    const v18, -0x42333333    # -0.1f

    .line 1049
    .line 1050
    .line 1051
    const v13, -0x41c7ae14    # -0.18f

    .line 1052
    .line 1053
    .line 1054
    const v14, -0x4270a3d7    # -0.07f

    .line 1055
    .line 1056
    .line 1057
    const v15, -0x41428f5c    # -0.37f

    .line 1058
    .line 1059
    .line 1060
    const v16, -0x42333333    # -0.1f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v0, 0x3cf5c28f    # 0.03f

    .line 1067
    .line 1068
    .line 1069
    const v2, -0x40e8f5c3    # -0.59f

    .line 1070
    .line 1071
    .line 1072
    const v4, 0x3dcccccd    # 0.1f

    .line 1073
    .line 1074
    .line 1075
    const v6, -0x412e147b    # -0.41f

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v0, -0x4119999a    # -0.45f

    .line 1082
    .line 1083
    .line 1084
    const v2, -0x41570a3d    # -0.33f

    .line 1085
    .line 1086
    .line 1087
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1088
    .line 1089
    .line 1090
    const v6, 0x3e3851ec    # 0.18f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v0, -0x416b851f    # -0.29f

    .line 1097
    .line 1098
    .line 1099
    const v2, 0x3f11eb85    # 0.57f

    .line 1100
    .line 1101
    .line 1102
    const v4, -0x41947ae1    # -0.23f

    .line 1103
    .line 1104
    .line 1105
    const v6, 0x3eae147b    # 0.34f

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const/high16 v0, 0x3f000000    # 0.5f

    .line 1112
    .line 1113
    const v2, 0x3f51eb85    # 0.82f

    .line 1114
    .line 1115
    .line 1116
    const v4, -0x42333333    # -0.1f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const v0, 0x3f3d70a4    # 0.74f

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const v17, 0x3de147ae    # 0.11f

    .line 1129
    .line 1130
    .line 1131
    const v18, 0x3f51eb85    # 0.82f

    .line 1132
    .line 1133
    .line 1134
    const/4 v13, 0x0

    .line 1135
    const v14, 0x3ea3d70a    # 0.32f

    .line 1136
    .line 1137
    .line 1138
    const v15, 0x3d23d70a    # 0.04f

    .line 1139
    .line 1140
    .line 1141
    const v16, 0x3f19999a    # 0.6f

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    const v0, 0x3e99999a    # 0.3f

    .line 1148
    .line 1149
    .line 1150
    const v2, 0x3f11eb85    # 0.57f

    .line 1151
    .line 1152
    .line 1153
    const v4, 0x3e2e147b    # 0.17f

    .line 1154
    .line 1155
    .line 1156
    const v6, 0x3ed70a3d    # 0.42f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const v0, 0x3e851eb8    # 0.26f

    .line 1163
    .line 1164
    .line 1165
    const v2, 0x3eeb851f    # 0.46f

    .line 1166
    .line 1167
    .line 1168
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1169
    .line 1170
    .line 1171
    const v6, 0x3e8f5c29    # 0.28f

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    const v0, 0x3ebd70a4    # 0.37f

    .line 1178
    .line 1179
    .line 1180
    const v2, 0x3f170a3d    # 0.59f

    .line 1181
    .line 1182
    .line 1183
    const v4, 0x3dcccccd    # 0.1f

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1187
    .line 1188
    .line 1189
    const v0, -0x430a3d71    # -0.03f

    .line 1190
    .line 1191
    .line 1192
    const v4, -0x42333333    # -0.1f

    .line 1193
    .line 1194
    .line 1195
    const v6, 0x3ed1eb85    # 0.41f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    const v0, 0x3ee66666    # 0.45f

    .line 1202
    .line 1203
    .line 1204
    const v2, -0x41c7ae14    # -0.18f

    .line 1205
    .line 1206
    .line 1207
    const v4, -0x41570a3d    # -0.33f

    .line 1208
    .line 1209
    .line 1210
    const v6, 0x3ea8f5c3    # 0.33f

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v12, v6, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    const v0, -0x4151eb85    # -0.34f

    .line 1217
    .line 1218
    .line 1219
    const v2, -0x40ee147b    # -0.57f

    .line 1220
    .line 1221
    .line 1222
    const v4, 0x3e947ae1    # 0.29f

    .line 1223
    .line 1224
    .line 1225
    const v6, 0x3e6147ae    # 0.22f

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1229
    .line 1230
    .line 1231
    const/high16 v0, -0x41000000    # -0.5f

    .line 1232
    .line 1233
    const v2, -0x40ae147b    # -0.82f

    .line 1234
    .line 1235
    .line 1236
    const v4, 0x3dcccccd    # 0.1f

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1240
    .line 1241
    .line 1242
    const v0, -0x40c28f5c    # -0.74f

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v17, -0x421eb852    # -0.11f

    .line 1249
    .line 1250
    .line 1251
    const v18, -0x40ae147b    # -0.82f

    .line 1252
    .line 1253
    .line 1254
    const v14, -0x415c28f6    # -0.32f

    .line 1255
    .line 1256
    .line 1257
    const v15, -0x42dc28f6    # -0.04f

    .line 1258
    .line 1259
    .line 1260
    const v16, -0x40e66666    # -0.6f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const v0, -0x4128f5c3    # -0.42f

    .line 1267
    .line 1268
    .line 1269
    const v2, -0x40ee147b    # -0.57f

    .line 1270
    .line 1271
    .line 1272
    const v4, -0x41666666    # -0.3f

    .line 1273
    .line 1274
    .line 1275
    const v6, -0x41d1eb85    # -0.17f

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1279
    .line 1280
    .line 1281
    const v0, -0x417ae148    # -0.26f

    .line 1282
    .line 1283
    .line 1284
    const v2, -0x41147ae1    # -0.46f

    .line 1285
    .line 1286
    .line 1287
    const v4, -0x41570a3d    # -0.33f

    .line 1288
    .line 1289
    .line 1290
    const v6, -0x4170a3d7    # -0.28f

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1297
    .line 1298
    .line 1299
    const v0, 0x41673333    # 14.45f

    .line 1300
    .line 1301
    .line 1302
    const v2, 0x4165999a    # 14.35f

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1306
    .line 1307
    .line 1308
    const v17, -0x42dc28f6    # -0.04f

    .line 1309
    .line 1310
    .line 1311
    const v18, 0x3ef5c28f    # 0.48f

    .line 1312
    .line 1313
    .line 1314
    const v14, 0x3e428f5c    # 0.19f

    .line 1315
    .line 1316
    .line 1317
    const v15, -0x43dc28f6    # -0.01f

    .line 1318
    .line 1319
    .line 1320
    const v16, 0x3eb33333    # 0.35f

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1324
    .line 1325
    .line 1326
    const v0, 0x3e75c28f    # 0.24f

    .line 1327
    .line 1328
    .line 1329
    const v2, 0x3ea3d70a    # 0.32f

    .line 1330
    .line 1331
    .line 1332
    const v4, -0x421eb852    # -0.11f

    .line 1333
    .line 1334
    .line 1335
    const v6, -0x428a3d71    # -0.06f

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    const v0, -0x41bd70a4    # -0.19f

    .line 1342
    .line 1343
    .line 1344
    const v2, 0x3e2e147b    # 0.17f

    .line 1345
    .line 1346
    .line 1347
    const v4, 0x3e0f5c29    # 0.14f

    .line 1348
    .line 1349
    .line 1350
    const v6, -0x421eb852    # -0.11f

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v0, -0x41dc28f6    # -0.16f

    .line 1357
    .line 1358
    .line 1359
    const/high16 v2, -0x41800000    # -0.25f

    .line 1360
    .line 1361
    const v4, 0x3d4ccccd    # 0.05f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const v0, -0x435c28f6    # -0.02f

    .line 1368
    .line 1369
    .line 1370
    const v4, -0x41c7ae14    # -0.18f

    .line 1371
    .line 1372
    .line 1373
    const v6, -0x42b33333    # -0.05f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const v0, -0x4247ae14    # -0.09f

    .line 1380
    .line 1381
    .line 1382
    const v2, -0x41bd70a4    # -0.19f

    .line 1383
    .line 1384
    .line 1385
    const v4, -0x41f0a3d7    # -0.14f

    .line 1386
    .line 1387
    .line 1388
    const v6, -0x41d1eb85    # -0.17f

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1392
    .line 1393
    .line 1394
    const v0, -0x420a3d71    # -0.12f

    .line 1395
    .line 1396
    .line 1397
    const v2, -0x415c28f6    # -0.32f

    .line 1398
    .line 1399
    .line 1400
    const v4, -0x4247ae14    # -0.09f

    .line 1401
    .line 1402
    .line 1403
    const v6, -0x41bd70a4    # -0.19f

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1407
    .line 1408
    .line 1409
    const v0, -0x42dc28f6    # -0.04f

    .line 1410
    .line 1411
    .line 1412
    const v2, -0x410a3d71    # -0.48f

    .line 1413
    .line 1414
    .line 1415
    const v4, -0x42dc28f6    # -0.04f

    .line 1416
    .line 1417
    .line 1418
    const v6, -0x416b851f    # -0.29f

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1422
    .line 1423
    .line 1424
    const v0, -0x4087ae14    # -0.97f

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1428
    .line 1429
    .line 1430
    const v17, 0x3d23d70a    # 0.04f

    .line 1431
    .line 1432
    .line 1433
    const v18, -0x410a3d71    # -0.48f

    .line 1434
    .line 1435
    .line 1436
    const v14, -0x41bd70a4    # -0.19f

    .line 1437
    .line 1438
    .line 1439
    const v15, 0x3c23d70a    # 0.01f

    .line 1440
    .line 1441
    .line 1442
    const v16, -0x414ccccd    # -0.35f

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1446
    .line 1447
    .line 1448
    const v0, 0x3d75c28f    # 0.06f

    .line 1449
    .line 1450
    .line 1451
    const v2, -0x416147ae    # -0.31f

    .line 1452
    .line 1453
    .line 1454
    const v4, -0x41947ae1    # -0.23f

    .line 1455
    .line 1456
    .line 1457
    const v6, 0x3df5c28f    # 0.12f

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1461
    .line 1462
    .line 1463
    const v0, 0x3e428f5c    # 0.19f

    .line 1464
    .line 1465
    .line 1466
    const v2, -0x41f0a3d7    # -0.14f

    .line 1467
    .line 1468
    .line 1469
    const v4, -0x41d1eb85    # -0.17f

    .line 1470
    .line 1471
    .line 1472
    const v6, 0x3de147ae    # 0.11f

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v12, v6, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const/high16 v0, 0x3e800000    # 0.25f

    .line 1479
    .line 1480
    const v2, 0x3e23d70a    # 0.16f

    .line 1481
    .line 1482
    .line 1483
    const v4, -0x42b33333    # -0.05f

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1487
    .line 1488
    .line 1489
    const v0, 0x3ca3d70a    # 0.02f

    .line 1490
    .line 1491
    .line 1492
    const/high16 v2, 0x3e800000    # 0.25f

    .line 1493
    .line 1494
    const v4, 0x3d4ccccd    # 0.05f

    .line 1495
    .line 1496
    .line 1497
    const v6, 0x3e3851ec    # 0.18f

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1501
    .line 1502
    .line 1503
    const v0, 0x3db851ec    # 0.09f

    .line 1504
    .line 1505
    .line 1506
    const v2, 0x3e428f5c    # 0.19f

    .line 1507
    .line 1508
    .line 1509
    const v4, 0x3e2e147b    # 0.17f

    .line 1510
    .line 1511
    .line 1512
    const v6, 0x3e0f5c29    # 0.14f

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1516
    .line 1517
    .line 1518
    const v2, 0x3e9eb852    # 0.31f

    .line 1519
    .line 1520
    .line 1521
    const v4, 0x3df5c28f    # 0.12f

    .line 1522
    .line 1523
    .line 1524
    const v6, 0x3e3851ec    # 0.18f

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1528
    .line 1529
    .line 1530
    const v0, 0x3ef5c28f    # 0.48f

    .line 1531
    .line 1532
    .line 1533
    const v2, 0x3e947ae1    # 0.29f

    .line 1534
    .line 1535
    .line 1536
    const v4, 0x3d23d70a    # 0.04f

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1540
    .line 1541
    .line 1542
    const v0, 0x3f7851ec    # 0.97f

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v2

    .line 1555
    const/16 v16, 0x3800

    .line 1556
    .line 1557
    const/16 v17, 0x0

    .line 1558
    .line 1559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1560
    .line 1561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1562
    .line 1563
    const/4 v7, 0x0

    .line 1564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1565
    .line 1566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1567
    .line 1568
    const/4 v14, 0x0

    .line 1569
    const/4 v15, 0x0

    .line 1570
    const-string v4, ""

    .line 1571
    .line 1572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v0

    .line 1580
    sput-object v0, Landroidx/compose/material/icons/rounded/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1581
    .line 1582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1583
    .line 1584
    .line 1585
    return-object v0
.end method

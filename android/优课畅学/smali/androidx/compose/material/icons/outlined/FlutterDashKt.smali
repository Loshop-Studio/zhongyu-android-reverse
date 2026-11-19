.class public final Landroidx/compose/material/icons/outlined/FlutterDashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlutterDash(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FlutterDashKt;->_flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FlutterDash"

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
    const v0, 0x413b3333    # 11.7f

    .line 71
    .line 72
    .line 73
    const v2, 0x41311eb8    # 11.07f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fa28f5c    # 1.27f

    .line 80
    .line 81
    .line 82
    const v18, -0x41428f5c    # -0.37f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e947ae1    # 0.29f

    .line 86
    .line 87
    .line 88
    const v14, -0x413851ec    # -0.39f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f4f5c29    # 0.81f

    .line 92
    .line 93
    .line 94
    const v16, -0x40f0a3d7    # -0.56f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3edc28f6    # 0.43f

    .line 101
    .line 102
    .line 103
    const v18, 0x3ea8f5c3    # 0.33f

    .line 104
    .line 105
    .line 106
    const v13, 0x3e2e147b    # 0.17f

    .line 107
    .line 108
    .line 109
    const v14, 0x3d8f5c29    # 0.07f

    .line 110
    .line 111
    .line 112
    const v15, 0x3ea3d70a    # 0.32f

    .line 113
    .line 114
    .line 115
    const v16, 0x3e3851ec    # 0.18f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3e6147ae    # 0.22f

    .line 122
    .line 123
    .line 124
    const v18, 0x3f59999a    # 0.85f

    .line 125
    .line 126
    .line 127
    const v13, 0x3e6147ae    # 0.22f

    .line 128
    .line 129
    .line 130
    const v14, 0x3e8f5c29    # 0.28f

    .line 131
    .line 132
    .line 133
    const/high16 v15, 0x3e800000    # 0.25f

    .line 134
    .line 135
    const v16, 0x3f170a3d    # 0.59f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x40f5c28f    # -0.54f

    .line 142
    .line 143
    .line 144
    const v18, 0x3f4a3d71    # 0.79f

    .line 145
    .line 146
    .line 147
    const v13, -0x42b33333    # -0.05f

    .line 148
    .line 149
    .line 150
    const v14, 0x3ea8f5c3    # 0.33f

    .line 151
    .line 152
    .line 153
    const/high16 v15, -0x41800000    # -0.25f

    .line 154
    .line 155
    const v16, 0x3f2147ae    # 0.63f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x3f5dc28f    # -5.07f

    .line 162
    .line 163
    .line 164
    const v18, 0x402c28f6    # 2.69f

    .line 165
    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const v15, -0x3f6428f6    # -4.87f

    .line 170
    .line 171
    .line 172
    const v16, 0x403ccccd    # 2.95f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v2, v0, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, 0x41b00000    # 22.0f

    .line 185
    .line 186
    const/high16 v2, 0x41200000    # 10.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, -0x40400000    # -1.5f

    .line 192
    .line 193
    const/high16 v18, 0x40400000    # 3.0f

    .line 194
    .line 195
    const/high16 v14, 0x40200000    # 2.5f

    .line 196
    .line 197
    const/high16 v15, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/high16 v16, 0x40400000    # 3.0f

    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, -0x40e147ae    # -0.62f

    .line 205
    .line 206
    .line 207
    const v18, -0x417ae148    # -0.26f

    .line 208
    .line 209
    .line 210
    const v13, -0x41947ae1    # -0.23f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const v15, -0x411eb852    # -0.44f

    .line 215
    .line 216
    .line 217
    const v16, -0x42333333    # -0.1f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x3f5570a4    # -5.33f

    .line 224
    .line 225
    .line 226
    const v18, 0x40bfae14    # 5.99f

    .line 227
    .line 228
    .line 229
    const v13, -0x410a3d71    # -0.48f

    .line 230
    .line 231
    .line 232
    const v14, 0x40547ae1    # 3.32f

    .line 233
    .line 234
    .line 235
    const v15, -0x3fe8f5c3    # -2.36f

    .line 236
    .line 237
    .line 238
    const v16, 0x40a9eb85    # 5.31f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x3f733333    # 0.95f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f451eb8    # 0.77f

    .line 248
    .line 249
    .line 250
    const v13, 0x3de147ae    # 0.11f

    .line 251
    .line 252
    .line 253
    const v14, 0x3ee147ae    # 0.44f

    .line 254
    .line 255
    .line 256
    const v15, 0x3ef5c28f    # 0.48f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f451eb8    # 0.77f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x3f147ae1    # 0.58f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x3ef5c28f    # 0.48f

    .line 276
    .line 277
    .line 278
    const v18, 0x3eb851ec    # 0.36f

    .line 279
    .line 280
    .line 281
    const v13, 0x3e6147ae    # 0.22f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x3ed1eb85    # 0.41f

    .line 286
    .line 287
    .line 288
    const v16, 0x3e19999a    # 0.15f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x3f828f5c    # 1.02f

    .line 295
    .line 296
    .line 297
    const v18, 0x3fa8f5c3    # 1.32f

    .line 298
    .line 299
    .line 300
    const v13, 0x3e2e147b    # 0.17f

    .line 301
    .line 302
    .line 303
    const v14, 0x3f051eb8    # 0.52f

    .line 304
    .line 305
    .line 306
    const v15, 0x3f28f5c3    # 0.66f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f828f5c    # 1.02f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x430a3d71    # -0.03f

    .line 316
    .line 317
    .line 318
    const v18, 0x3f47ae14    # 0.78f

    .line 319
    .line 320
    .line 321
    const/high16 v13, 0x3e800000    # 0.25f

    .line 322
    .line 323
    const v14, 0x3e570a3d    # 0.21f

    .line 324
    .line 325
    .line 326
    const v15, 0x3e75c28f    # 0.24f

    .line 327
    .line 328
    .line 329
    const v16, 0x3f170a3d    # 0.59f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, -0x401ae148    # -1.79f

    .line 336
    .line 337
    .line 338
    const v18, 0x3f07ae14    # 0.53f

    .line 339
    .line 340
    .line 341
    const v13, -0x4151eb85    # -0.34f

    .line 342
    .line 343
    .line 344
    const v14, 0x3e75c28f    # 0.24f

    .line 345
    .line 346
    .line 347
    const v15, -0x4099999a    # -0.9f

    .line 348
    .line 349
    .line 350
    const v16, 0x3efae148    # 0.49f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x4119999a    # -0.45f

    .line 357
    .line 358
    .line 359
    const v18, -0x419eb852    # -0.22f

    .line 360
    .line 361
    .line 362
    const v13, -0x41c7ae14    # -0.18f

    .line 363
    .line 364
    .line 365
    const v14, 0x3c23d70a    # 0.01f

    .line 366
    .line 367
    .line 368
    const v15, -0x414ccccd    # -0.35f

    .line 369
    .line 370
    .line 371
    const v16, -0x4270a3d7    # -0.07f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x41700000    # 15.0f

    .line 378
    .line 379
    const v18, 0x41aa147b    # 21.26f

    .line 380
    .line 381
    .line 382
    const v13, 0x4172e148    # 15.18f

    .line 383
    .line 384
    .line 385
    const v14, 0x41b08f5c    # 22.07f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x41700000    # 15.0f

    .line 389
    .line 390
    const v16, 0x41adae14    # 21.71f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3db851ec    # 0.09f

    .line 397
    .line 398
    .line 399
    const v18, -0x40b33333    # -0.8f

    .line 400
    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const v14, -0x41666666    # -0.3f

    .line 404
    .line 405
    .line 406
    const v15, 0x3d23d70a    # 0.04f

    .line 407
    .line 408
    .line 409
    const v16, -0x40ee147b    # -0.57f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x4039999a    # -1.55f

    .line 416
    .line 417
    .line 418
    const v18, -0x403851ec    # -1.56f

    .line 419
    .line 420
    .line 421
    const v13, -0x40b851ec    # -0.78f

    .line 422
    .line 423
    .line 424
    const v14, -0x41dc28f6    # -0.16f

    .line 425
    .line 426
    .line 427
    const v15, -0x404e147b    # -1.39f

    .line 428
    .line 429
    .line 430
    const v16, -0x40b851ec    # -0.78f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, -0x403ae148    # -1.54f

    .line 437
    .line 438
    .line 439
    const v18, 0x3dcccccd    # 0.1f

    .line 440
    .line 441
    .line 442
    const v13, -0x41051eb8    # -0.49f

    .line 443
    .line 444
    .line 445
    const v14, 0x3d75c28f    # 0.06f

    .line 446
    .line 447
    .line 448
    const/high16 v15, -0x40800000    # -1.0f

    .line 449
    .line 450
    const v16, 0x3dcccccd    # 0.1f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, -0x3fe33333    # -2.45f

    .line 457
    .line 458
    .line 459
    const/high16 v18, -0x41800000    # -0.25f

    .line 460
    .line 461
    const v13, -0x409eb852    # -0.88f

    .line 462
    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    const v15, -0x40266666    # -1.7f

    .line 466
    .line 467
    .line 468
    const v16, -0x4247ae14    # -0.09f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41180000    # 9.5f

    .line 475
    .line 476
    const/high16 v18, 0x41980000    # 19.0f

    .line 477
    .line 478
    const v13, 0x41187ae1    # 9.53f

    .line 479
    .line 480
    .line 481
    const v14, 0x4196a3d7    # 18.83f

    .line 482
    .line 483
    .line 484
    const/high16 v15, 0x41180000    # 9.5f

    .line 485
    .line 486
    const v16, 0x419747ae    # 18.91f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/high16 v18, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const v14, 0x3f0ccccd    # 0.55f

    .line 498
    .line 499
    .line 500
    const v15, 0x3ee66666    # 0.45f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x3f800000    # 1.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/4 v0, 0x0

    .line 509
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3f147ae1    # 0.58f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x3ef5c28f    # 0.48f

    .line 519
    .line 520
    .line 521
    const v18, 0x3eb851ec    # 0.36f

    .line 522
    .line 523
    .line 524
    const v13, 0x3e6147ae    # 0.22f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const v15, 0x3ed1eb85    # 0.41f

    .line 529
    .line 530
    .line 531
    const v16, 0x3e19999a    # 0.15f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x3f828f5c    # 1.02f

    .line 538
    .line 539
    .line 540
    const v18, 0x3fa8f5c3    # 1.32f

    .line 541
    .line 542
    .line 543
    const v13, 0x3e2e147b    # 0.17f

    .line 544
    .line 545
    .line 546
    const v14, 0x3f051eb8    # 0.52f

    .line 547
    .line 548
    .line 549
    const v15, 0x3f28f5c3    # 0.66f

    .line 550
    .line 551
    .line 552
    const v16, 0x3f828f5c    # 1.02f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x430a3d71    # -0.03f

    .line 559
    .line 560
    .line 561
    const v18, 0x3f47ae14    # 0.78f

    .line 562
    .line 563
    .line 564
    const/high16 v13, 0x3e800000    # 0.25f

    .line 565
    .line 566
    const v14, 0x3e570a3d    # 0.21f

    .line 567
    .line 568
    .line 569
    const v15, 0x3e75c28f    # 0.24f

    .line 570
    .line 571
    .line 572
    const v16, 0x3f170a3d    # 0.59f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x401ae148    # -1.79f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f07ae14    # 0.53f

    .line 582
    .line 583
    .line 584
    const v13, -0x4151eb85    # -0.34f

    .line 585
    .line 586
    .line 587
    const v14, 0x3e75c28f    # 0.24f

    .line 588
    .line 589
    .line 590
    const v15, -0x4099999a    # -0.9f

    .line 591
    .line 592
    .line 593
    const v16, 0x3efae148    # 0.49f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, -0x4119999a    # -0.45f

    .line 600
    .line 601
    .line 602
    const v18, -0x419eb852    # -0.22f

    .line 603
    .line 604
    .line 605
    const v13, -0x41c7ae14    # -0.18f

    .line 606
    .line 607
    .line 608
    const v14, 0x3c23d70a    # 0.01f

    .line 609
    .line 610
    .line 611
    const v15, -0x414ccccd    # -0.35f

    .line 612
    .line 613
    .line 614
    const v16, -0x4270a3d7    # -0.07f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x41200000    # 10.0f

    .line 621
    .line 622
    const v18, 0x41ae147b    # 21.76f

    .line 623
    .line 624
    .line 625
    const v13, 0x4122e148    # 10.18f

    .line 626
    .line 627
    .line 628
    const v14, 0x41b48f5c    # 22.57f

    .line 629
    .line 630
    .line 631
    const/high16 v15, 0x41200000    # 10.0f

    .line 632
    .line 633
    const v16, 0x41b1ae14    # 22.21f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3db851ec    # 0.09f

    .line 640
    .line 641
    .line 642
    const v18, -0x40b33333    # -0.8f

    .line 643
    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, -0x41666666    # -0.3f

    .line 647
    .line 648
    .line 649
    const v15, 0x3d23d70a    # 0.04f

    .line 650
    .line 651
    .line 652
    const v16, -0x40ee147b    # -0.57f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v17, 0x41080000    # 8.5f

    .line 659
    .line 660
    const/high16 v18, 0x41980000    # 19.0f

    .line 661
    .line 662
    const v13, 0x41130a3d    # 9.19f

    .line 663
    .line 664
    .line 665
    const v14, 0x41a628f6    # 20.77f

    .line 666
    .line 667
    .line 668
    const/high16 v15, 0x41080000    # 8.5f

    .line 669
    .line 670
    const v16, 0x419fae14    # 19.96f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, 0x3da3d70a    # 0.08f

    .line 677
    .line 678
    .line 679
    const v18, -0x40f851ec    # -0.53f

    .line 680
    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const v14, -0x41c7ae14    # -0.18f

    .line 684
    .line 685
    .line 686
    const v15, 0x3cf5c28f    # 0.03f

    .line 687
    .line 688
    .line 689
    const v16, -0x4147ae14    # -0.36f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, -0x3f7147ae    # -4.46f

    .line 696
    .line 697
    .line 698
    const v18, -0x3f4851ec    # -5.74f

    .line 699
    .line 700
    .line 701
    const v13, -0x3fe28f5c    # -2.46f

    .line 702
    .line 703
    .line 704
    const v14, -0x40a3d70a    # -0.86f

    .line 705
    .line 706
    .line 707
    const v15, -0x3f7f0a3d    # -4.03f

    .line 708
    .line 709
    .line 710
    const v16, -0x3fce147b    # -2.78f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v17, 0x40600000    # 3.5f

    .line 717
    .line 718
    const/high16 v18, 0x41500000    # 13.0f

    .line 719
    .line 720
    const v13, 0x407c28f6    # 3.94f

    .line 721
    .line 722
    .line 723
    const v14, 0x414e6666    # 12.9f

    .line 724
    .line 725
    .line 726
    const v15, 0x406f5c29    # 3.74f

    .line 727
    .line 728
    .line 729
    const/high16 v16, 0x41500000    # 13.0f

    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v17, 0x40000000    # 2.0f

    .line 735
    .line 736
    const/high16 v18, 0x41200000    # 10.0f

    .line 737
    .line 738
    const/high16 v13, 0x40400000    # 3.0f

    .line 739
    .line 740
    const/high16 v14, 0x41500000    # 13.0f

    .line 741
    .line 742
    const/high16 v15, 0x40000000    # 2.0f

    .line 743
    .line 744
    const/high16 v16, 0x41480000    # 12.5f

    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v17, 0x40400000    # 3.0f

    .line 750
    .line 751
    const/high16 v18, -0x3f700000    # -4.5f

    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const v14, -0x3feeb852    # -2.27f

    .line 755
    .line 756
    .line 757
    const v15, 0x3fd9999a    # 1.7f

    .line 758
    .line 759
    .line 760
    const/high16 v16, -0x3f700000    # -4.5f

    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, 0x3f000000    # 0.5f

    .line 766
    .line 767
    const v18, 0x3f59999a    # 0.85f

    .line 768
    .line 769
    .line 770
    const v13, 0x3edc28f6    # 0.43f

    .line 771
    .line 772
    .line 773
    const/4 v14, 0x0

    .line 774
    const v15, 0x3efae148    # 0.49f

    .line 775
    .line 776
    .line 777
    const v16, 0x3efae148    # 0.49f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v17, 0x40b1999a    # 5.55f

    .line 784
    .line 785
    .line 786
    const v18, -0x3fad70a4    # -3.29f

    .line 787
    .line 788
    .line 789
    const v13, 0x3fa3d70a    # 1.28f

    .line 790
    .line 791
    .line 792
    const v14, -0x401c28f6    # -1.78f

    .line 793
    .line 794
    .line 795
    const v15, 0x4050a3d7    # 3.26f

    .line 796
    .line 797
    .line 798
    const v16, -0x3fbeb852    # -3.02f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v17, 0x41500000    # 13.0f

    .line 805
    .line 806
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 807
    .line 808
    const/high16 v13, 0x41340000    # 11.25f

    .line 809
    .line 810
    const v14, 0x40066666    # 2.1f

    .line 811
    .line 812
    .line 813
    const v15, 0x4142147b    # 12.13f

    .line 814
    .line 815
    .line 816
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 817
    .line 818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v0, 0x3f800000    # 1.0f

    .line 822
    .line 823
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v17, 0x3f800000    # 1.0f

    .line 827
    .line 828
    const/high16 v18, -0x41000000    # -0.5f

    .line 829
    .line 830
    const/4 v13, 0x0

    .line 831
    const/4 v14, 0x0

    .line 832
    const v15, 0x3ea8f5c3    # 0.33f

    .line 833
    .line 834
    .line 835
    const/high16 v16, -0x41000000    # -0.5f

    .line 836
    .line 837
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v18, 0x3f000000    # 0.5f

    .line 841
    .line 842
    const v13, 0x3f2b851f    # 0.67f

    .line 843
    .line 844
    .line 845
    const/high16 v15, 0x3f800000    # 1.0f

    .line 846
    .line 847
    const/high16 v16, 0x3f000000    # 0.5f

    .line 848
    .line 849
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v17, -0x408a3d71    # -0.96f

    .line 853
    .line 854
    .line 855
    const v18, 0x3f451eb8    # 0.77f

    .line 856
    .line 857
    .line 858
    const v13, -0x41051eb8    # -0.49f

    .line 859
    .line 860
    .line 861
    const v15, -0x40a66666    # -0.85f

    .line 862
    .line 863
    .line 864
    const v16, 0x3eb33333    # 0.35f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v17, 0x408eb852    # 4.46f

    .line 871
    .line 872
    .line 873
    const v18, 0x40451eb8    # 3.08f

    .line 874
    .line 875
    .line 876
    const v13, 0x3fe8f5c3    # 1.82f

    .line 877
    .line 878
    .line 879
    const v14, 0x3ef5c28f    # 0.48f

    .line 880
    .line 881
    .line 882
    const v15, 0x4058f5c3    # 3.39f

    .line 883
    .line 884
    .line 885
    const v16, 0x3fcb851f    # 1.59f

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const/high16 v17, 0x41980000    # 19.0f

    .line 892
    .line 893
    const/high16 v18, 0x40b00000    # 5.5f

    .line 894
    .line 895
    const v13, 0x4194147b    # 18.51f

    .line 896
    .line 897
    .line 898
    const v14, 0x40bfae14    # 5.99f

    .line 899
    .line 900
    .line 901
    const v15, 0x41948f5c    # 18.57f

    .line 902
    .line 903
    .line 904
    const/high16 v16, 0x40b00000    # 5.5f

    .line 905
    .line 906
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v17, 0x41b00000    # 22.0f

    .line 910
    .line 911
    const/high16 v18, 0x41200000    # 10.0f

    .line 912
    .line 913
    const v13, 0x41a26666    # 20.3f

    .line 914
    .line 915
    .line 916
    const/high16 v14, 0x40b00000    # 5.5f

    .line 917
    .line 918
    const/high16 v15, 0x41b00000    # 22.0f

    .line 919
    .line 920
    const v16, 0x40f75c29    # 7.73f

    .line 921
    .line 922
    .line 923
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v0, 0x40a00000    # 5.0f

    .line 930
    .line 931
    const/high16 v2, 0x41300000    # 11.0f

    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v17, 0x3e800000    # 0.25f

    .line 937
    .line 938
    const v18, 0x400d70a4    # 2.21f

    .line 939
    .line 940
    .line 941
    const/4 v13, 0x0

    .line 942
    const v14, 0x3f4f5c29    # 0.81f

    .line 943
    .line 944
    .line 945
    const v15, 0x3dcccccd    # 0.1f

    .line 946
    .line 947
    .line 948
    const v16, 0x3fc3d70a    # 1.53f

    .line 949
    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v17, 0x3f547ae1    # 0.83f

    .line 955
    .line 956
    .line 957
    const v18, -0x400a3d71    # -1.92f

    .line 958
    .line 959
    .line 960
    const v13, 0x3e3851ec    # 0.18f

    .line 961
    .line 962
    .line 963
    const v14, -0x40cf5c29    # -0.69f

    .line 964
    .line 965
    .line 966
    const v15, 0x3eeb851f    # 0.46f

    .line 967
    .line 968
    .line 969
    const v16, -0x4055c28f    # -1.33f

    .line 970
    .line 971
    .line 972
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v17, -0x4151eb85    # -0.34f

    .line 976
    .line 977
    .line 978
    const v18, -0x403ae148    # -1.54f

    .line 979
    .line 980
    .line 981
    const v13, -0x41a8f5c3    # -0.21f

    .line 982
    .line 983
    .line 984
    const v14, -0x410f5c29    # -0.47f

    .line 985
    .line 986
    .line 987
    const v15, -0x4151eb85    # -0.34f

    .line 988
    .line 989
    .line 990
    const v16, -0x40828f5c    # -0.99f

    .line 991
    .line 992
    .line 993
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const/high16 v17, 0x41180000    # 9.5f

    .line 997
    .line 998
    const/high16 v18, 0x40c00000    # 6.0f

    .line 999
    .line 1000
    const/high16 v13, 0x40b80000    # 5.75f

    .line 1001
    .line 1002
    const v14, 0x40f5c28f    # 7.68f

    .line 1003
    .line 1004
    .line 1005
    const v15, 0x40edc28f    # 7.43f

    .line 1006
    .line 1007
    .line 1008
    const/high16 v16, 0x40c00000    # 6.0f

    .line 1009
    .line 1010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const/high16 v17, 0x40200000    # 2.5f

    .line 1014
    .line 1015
    const v18, 0x3f7851ec    # 0.97f

    .line 1016
    .line 1017
    .line 1018
    const v13, 0x3f75c28f    # 0.96f

    .line 1019
    .line 1020
    .line 1021
    const/4 v14, 0x0

    .line 1022
    const v15, 0x3feb851f    # 1.84f

    .line 1023
    .line 1024
    .line 1025
    const v16, 0x3ebd70a4    # 0.37f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const/high16 v17, 0x41680000    # 14.5f

    .line 1032
    .line 1033
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1034
    .line 1035
    const v13, 0x414a8f5c    # 12.66f

    .line 1036
    .line 1037
    .line 1038
    const v14, 0x40cbd70a    # 6.37f

    .line 1039
    .line 1040
    .line 1041
    const v15, 0x4158a3d7    # 13.54f

    .line 1042
    .line 1043
    .line 1044
    const/high16 v16, 0x40c00000    # 6.0f

    .line 1045
    .line 1046
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const/high16 v17, 0x40700000    # 3.75f

    .line 1050
    .line 1051
    const/high16 v18, 0x40700000    # 3.75f

    .line 1052
    .line 1053
    const v13, 0x40047ae1    # 2.07f

    .line 1054
    .line 1055
    .line 1056
    const/4 v14, 0x0

    .line 1057
    const/high16 v15, 0x40700000    # 3.75f

    .line 1058
    .line 1059
    const v16, 0x3fd70a3d    # 1.68f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, -0x4151eb85    # -0.34f

    .line 1066
    .line 1067
    .line 1068
    const v18, 0x3fc51eb8    # 1.54f

    .line 1069
    .line 1070
    .line 1071
    const/4 v13, 0x0

    .line 1072
    const v14, 0x3f0ccccd    # 0.55f

    .line 1073
    .line 1074
    .line 1075
    const v15, -0x420a3d71    # -0.12f

    .line 1076
    .line 1077
    .line 1078
    const v16, 0x3f88f5c3    # 1.07f

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v17, 0x3f570a3d    # 0.84f

    .line 1085
    .line 1086
    .line 1087
    const v18, 0x3ff851ec    # 1.94f

    .line 1088
    .line 1089
    .line 1090
    const v13, 0x3ebd70a4    # 0.37f

    .line 1091
    .line 1092
    .line 1093
    const v14, 0x3f170a3d    # 0.59f

    .line 1094
    .line 1095
    .line 1096
    const v15, 0x3f28f5c3    # 0.66f

    .line 1097
    .line 1098
    .line 1099
    const v16, 0x3f9eb852    # 1.24f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v17, 0x41980000    # 19.0f

    .line 1106
    .line 1107
    const/high16 v18, 0x41300000    # 11.0f

    .line 1108
    .line 1109
    const v13, 0x41973333    # 18.9f

    .line 1110
    .line 1111
    .line 1112
    const v14, 0x4148cccd    # 12.55f

    .line 1113
    .line 1114
    .line 1115
    const/high16 v15, 0x41980000    # 19.0f

    .line 1116
    .line 1117
    const v16, 0x413d1eb8    # 11.82f

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/high16 v17, -0x3f200000    # -7.0f

    .line 1124
    .line 1125
    const/high16 v18, -0x3f200000    # -7.0f

    .line 1126
    .line 1127
    const/4 v13, 0x0

    .line 1128
    const v14, -0x3f88f5c3    # -3.86f

    .line 1129
    .line 1130
    .line 1131
    const v15, -0x3fb70a3d    # -3.14f

    .line 1132
    .line 1133
    .line 1134
    const/high16 v16, -0x3f200000    # -7.0f

    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1140
    .line 1141
    const/high16 v18, 0x41300000    # 11.0f

    .line 1142
    .line 1143
    const v13, 0x41023d71    # 8.14f

    .line 1144
    .line 1145
    .line 1146
    const/high16 v14, 0x40800000    # 4.0f

    .line 1147
    .line 1148
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1149
    .line 1150
    const v16, 0x40e47ae1    # 7.14f

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    const v0, 0x418fd70a    # 17.98f

    .line 1160
    .line 1161
    .line 1162
    const v2, 0x4174a3d7    # 15.29f

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    const v17, 0x3ca3d70a    # 0.02f

    .line 1169
    .line 1170
    .line 1171
    const v18, -0x416b851f    # -0.29f

    .line 1172
    .line 1173
    .line 1174
    const/4 v13, 0x0

    .line 1175
    const v14, -0x42333333    # -0.1f

    .line 1176
    .line 1177
    .line 1178
    const v15, 0x3ca3d70a    # 0.02f

    .line 1179
    .line 1180
    .line 1181
    const v16, -0x41bd70a4    # -0.19f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v17, -0x40cccccd    # -0.7f

    .line 1188
    .line 1189
    .line 1190
    const v18, -0x3fce147b    # -2.78f

    .line 1191
    .line 1192
    .line 1193
    const v14, -0x407eb852    # -1.01f

    .line 1194
    .line 1195
    .line 1196
    const v15, -0x417ae148    # -0.26f

    .line 1197
    .line 1198
    .line 1199
    const v16, -0x40066666    # -1.95f

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const v17, -0x3fcccccd    # -2.8f

    .line 1206
    .line 1207
    .line 1208
    const v18, 0x3fa3d70a    # 1.28f

    .line 1209
    .line 1210
    .line 1211
    const v13, -0x40cf5c29    # -0.69f

    .line 1212
    .line 1213
    .line 1214
    const v14, 0x3f47ae14    # 0.78f

    .line 1215
    .line 1216
    .line 1217
    const v15, -0x4028f5c3    # -1.68f

    .line 1218
    .line 1219
    .line 1220
    const v16, 0x3fa3d70a    # 1.28f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const v17, -0x40b5c28f    # -0.79f

    .line 1227
    .line 1228
    .line 1229
    const v18, -0x4247ae14    # -0.09f

    .line 1230
    .line 1231
    .line 1232
    const v13, -0x4175c28f    # -0.27f

    .line 1233
    .line 1234
    .line 1235
    const/4 v14, 0x0

    .line 1236
    const v15, -0x40f5c28f    # -0.54f

    .line 1237
    .line 1238
    .line 1239
    const v16, -0x430a3d71    # -0.03f

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const v17, 0x3e8a3d71    # 0.27f

    .line 1246
    .line 1247
    .line 1248
    const v18, -0x40bae148    # -0.77f

    .line 1249
    .line 1250
    .line 1251
    const v13, 0x3e0f5c29    # 0.14f

    .line 1252
    .line 1253
    .line 1254
    const v14, -0x41947ae1    # -0.23f

    .line 1255
    .line 1256
    .line 1257
    const v15, 0x3e6b851f    # 0.23f

    .line 1258
    .line 1259
    .line 1260
    const v16, -0x41051eb8    # -0.49f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const v17, 0x3ca3d70a    # 0.02f

    .line 1267
    .line 1268
    .line 1269
    const v18, -0x41bd70a4    # -0.19f

    .line 1270
    .line 1271
    .line 1272
    const v13, 0x3c23d70a    # 0.01f

    .line 1273
    .line 1274
    .line 1275
    const v14, -0x4270a3d7    # -0.07f

    .line 1276
    .line 1277
    .line 1278
    const v15, 0x3c23d70a    # 0.01f

    .line 1279
    .line 1280
    .line 1281
    const v16, -0x41fae148    # -0.13f

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1288
    .line 1289
    const v18, 0x3d4ccccd    # 0.05f

    .line 1290
    .line 1291
    .line 1292
    const v13, 0x3e2e147b    # 0.17f

    .line 1293
    .line 1294
    .line 1295
    const v14, 0x3cf5c28f    # 0.03f

    .line 1296
    .line 1297
    .line 1298
    const v15, 0x3ea8f5c3    # 0.33f

    .line 1299
    .line 1300
    .line 1301
    const v16, 0x3d4ccccd    # 0.05f

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    const/high16 v17, 0x40300000    # 2.75f

    .line 1308
    .line 1309
    const/high16 v18, -0x3fd00000    # -2.75f

    .line 1310
    .line 1311
    const v13, 0x3fc28f5c    # 1.52f

    .line 1312
    .line 1313
    .line 1314
    const/4 v14, 0x0

    .line 1315
    const/high16 v15, 0x40300000    # 2.75f

    .line 1316
    .line 1317
    const v16, -0x40628f5c    # -1.23f

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1321
    .line 1322
    .line 1323
    const v0, 0x418028f6    # 16.02f

    .line 1324
    .line 1325
    .line 1326
    const/high16 v2, 0x40e00000    # 7.0f

    .line 1327
    .line 1328
    const/high16 v4, 0x41680000    # 14.5f

    .line 1329
    .line 1330
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const v17, -0x4015c28f    # -1.83f

    .line 1334
    .line 1335
    .line 1336
    const v18, 0x3f3851ec    # 0.72f

    .line 1337
    .line 1338
    .line 1339
    const v13, -0x40d47ae1    # -0.67f

    .line 1340
    .line 1341
    .line 1342
    const v15, -0x40570a3d    # -1.32f

    .line 1343
    .line 1344
    .line 1345
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1346
    .line 1347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1348
    .line 1349
    .line 1350
    const/high16 v0, 0x41400000    # 12.0f

    .line 1351
    .line 1352
    const v2, 0x41051eb8    # 8.32f

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    const v0, -0x40d47ae1    # -0.67f

    .line 1359
    .line 1360
    .line 1361
    const v2, -0x40e66666    # -0.6f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const/high16 v17, 0x41180000    # 9.5f

    .line 1368
    .line 1369
    const/high16 v18, 0x40e00000    # 7.0f

    .line 1370
    .line 1371
    const v13, 0x412d1eb8    # 10.82f

    .line 1372
    .line 1373
    .line 1374
    const/high16 v14, 0x40e80000    # 7.25f

    .line 1375
    .line 1376
    const v15, 0x4122b852    # 10.17f

    .line 1377
    .line 1378
    .line 1379
    const/high16 v16, 0x40e00000    # 7.0f

    .line 1380
    .line 1381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1382
    .line 1383
    .line 1384
    const/high16 v17, 0x40d80000    # 6.75f

    .line 1385
    .line 1386
    const/high16 v18, 0x411c0000    # 9.75f

    .line 1387
    .line 1388
    const v13, 0x40ff5c29    # 7.98f

    .line 1389
    .line 1390
    .line 1391
    const/high16 v14, 0x40e00000    # 7.0f

    .line 1392
    .line 1393
    const/high16 v15, 0x40d80000    # 6.75f

    .line 1394
    .line 1395
    const v16, 0x4103ae14    # 8.23f

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1399
    .line 1400
    .line 1401
    const v17, 0x400eb852    # 2.23f

    .line 1402
    .line 1403
    .line 1404
    const v18, 0x402ccccd    # 2.7f

    .line 1405
    .line 1406
    .line 1407
    const/4 v13, 0x0

    .line 1408
    const v14, 0x3fab851f    # 1.34f

    .line 1409
    .line 1410
    .line 1411
    const v15, 0x3f75c28f    # 0.96f

    .line 1412
    .line 1413
    .line 1414
    const v16, 0x401d70a4    # 2.46f

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    const v0, -0x40bd70a4    # -0.76f

    .line 1421
    .line 1422
    .line 1423
    const v2, 0x3f547ae1    # 0.83f

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1427
    .line 1428
    .line 1429
    const v17, -0x403c28f6    # -1.53f

    .line 1430
    .line 1431
    .line 1432
    const v18, -0x4079999a    # -1.05f

    .line 1433
    .line 1434
    .line 1435
    const v13, -0x40e66666    # -0.6f

    .line 1436
    .line 1437
    .line 1438
    const v14, -0x419eb852    # -0.22f

    .line 1439
    .line 1440
    .line 1441
    const v15, -0x4070a3d7    # -1.12f

    .line 1442
    .line 1443
    .line 1444
    const v16, -0x40e8f5c3    # -0.59f

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1448
    .line 1449
    .line 1450
    const/high16 v17, 0x40c00000    # 6.0f

    .line 1451
    .line 1452
    const/high16 v18, 0x41700000    # 15.0f

    .line 1453
    .line 1454
    const v13, 0x40c851ec    # 6.26f

    .line 1455
    .line 1456
    .line 1457
    const v14, 0x4150f5c3    # 13.06f

    .line 1458
    .line 1459
    .line 1460
    const/high16 v15, 0x40c00000    # 6.0f

    .line 1461
    .line 1462
    const/high16 v16, 0x41600000    # 14.0f

    .line 1463
    .line 1464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1465
    .line 1466
    .line 1467
    const v17, 0x3c23d70a    # 0.01f

    .line 1468
    .line 1469
    .line 1470
    const v18, 0x3e75c28f    # 0.24f

    .line 1471
    .line 1472
    .line 1473
    const/4 v13, 0x0

    .line 1474
    const v14, 0x3da3d70a    # 0.08f

    .line 1475
    .line 1476
    .line 1477
    const v15, 0x3c23d70a    # 0.01f

    .line 1478
    .line 1479
    .line 1480
    const v16, 0x3e19999a    # 0.15f

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1484
    .line 1485
    .line 1486
    const/high16 v17, 0x41400000    # 12.0f

    .line 1487
    .line 1488
    const/high16 v18, 0x41900000    # 18.0f

    .line 1489
    .line 1490
    const v13, 0x40e428f6    # 7.13f

    .line 1491
    .line 1492
    .line 1493
    const v14, 0x41887ae1    # 17.06f

    .line 1494
    .line 1495
    .line 1496
    const v15, 0x41123d71    # 9.14f

    .line 1497
    .line 1498
    .line 1499
    const/high16 v16, 0x41900000    # 18.0f

    .line 1500
    .line 1501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1502
    .line 1503
    .line 1504
    const v17, 0x418fd70a    # 17.98f

    .line 1505
    .line 1506
    .line 1507
    const v18, 0x4174a3d7    # 15.29f

    .line 1508
    .line 1509
    .line 1510
    const v13, 0x416e147b    # 14.88f

    .line 1511
    .line 1512
    .line 1513
    const/high16 v14, 0x41900000    # 18.0f

    .line 1514
    .line 1515
    const v15, 0x41870a3d    # 16.88f

    .line 1516
    .line 1517
    .line 1518
    const v16, 0x4188b852    # 17.09f

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1525
    .line 1526
    .line 1527
    const/high16 v0, 0x41800000    # 16.0f

    .line 1528
    .line 1529
    const/high16 v2, 0x411c0000    # 9.75f

    .line 1530
    .line 1531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const/high16 v17, -0x40400000    # -1.5f

    .line 1535
    .line 1536
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 1537
    .line 1538
    const/4 v13, 0x0

    .line 1539
    const v14, 0x3f7851ec    # 0.97f

    .line 1540
    .line 1541
    .line 1542
    const v15, -0x40d47ae1    # -0.67f

    .line 1543
    .line 1544
    .line 1545
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 1546
    .line 1547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1548
    .line 1549
    .line 1550
    const v0, 0x412b851f    # 10.72f

    .line 1551
    .line 1552
    .line 1553
    const/high16 v2, 0x41500000    # 13.0f

    .line 1554
    .line 1555
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1556
    .line 1557
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1558
    .line 1559
    .line 1560
    const v0, 0x415ab852    # 13.67f

    .line 1561
    .line 1562
    .line 1563
    const/high16 v2, 0x41680000    # 14.5f

    .line 1564
    .line 1565
    const/high16 v4, 0x41000000    # 8.0f

    .line 1566
    .line 1567
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1568
    .line 1569
    .line 1570
    const v0, 0x410c7ae1    # 8.78f

    .line 1571
    .line 1572
    .line 1573
    const/high16 v2, 0x41800000    # 16.0f

    .line 1574
    .line 1575
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1576
    .line 1577
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1581
    .line 1582
    .line 1583
    const/high16 v0, 0x41740000    # 15.25f

    .line 1584
    .line 1585
    const v2, 0x410e147b    # 8.88f

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1589
    .line 1590
    .line 1591
    const v17, -0x413d70a4    # -0.38f

    .line 1592
    .line 1593
    .line 1594
    const v18, -0x413d70a4    # -0.38f

    .line 1595
    .line 1596
    .line 1597
    const v14, -0x41a8f5c3    # -0.21f

    .line 1598
    .line 1599
    .line 1600
    const v15, -0x41d1eb85    # -0.17f

    .line 1601
    .line 1602
    .line 1603
    const v16, -0x413d70a4    # -0.38f

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1607
    .line 1608
    .line 1609
    const v0, 0x410ab852    # 8.67f

    .line 1610
    .line 1611
    .line 1612
    const/high16 v2, 0x41680000    # 14.5f

    .line 1613
    .line 1614
    const v4, 0x410e147b    # 8.88f

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1618
    .line 1619
    .line 1620
    const v0, 0x3e2e147b    # 0.17f

    .line 1621
    .line 1622
    .line 1623
    const v2, 0x3ec28f5c    # 0.38f

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1627
    .line 1628
    .line 1629
    const v0, 0x411147ae    # 9.08f

    .line 1630
    .line 1631
    .line 1632
    const/high16 v2, 0x41740000    # 15.25f

    .line 1633
    .line 1634
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1638
    .line 1639
    .line 1640
    const/high16 v0, 0x41300000    # 11.0f

    .line 1641
    .line 1642
    const/high16 v2, 0x411c0000    # 9.75f

    .line 1643
    .line 1644
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1645
    .line 1646
    .line 1647
    const/high16 v17, -0x40400000    # -1.5f

    .line 1648
    .line 1649
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 1650
    .line 1651
    const v14, 0x3f7851ec    # 0.97f

    .line 1652
    .line 1653
    .line 1654
    const v15, -0x40d47ae1    # -0.67f

    .line 1655
    .line 1656
    .line 1657
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 1658
    .line 1659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1660
    .line 1661
    .line 1662
    const v0, 0x412b851f    # 10.72f

    .line 1663
    .line 1664
    .line 1665
    const/high16 v2, 0x41000000    # 8.0f

    .line 1666
    .line 1667
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1668
    .line 1669
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1670
    .line 1671
    .line 1672
    const/high16 v0, 0x41180000    # 9.5f

    .line 1673
    .line 1674
    const v2, 0x410ab852    # 8.67f

    .line 1675
    .line 1676
    .line 1677
    const/high16 v4, 0x41000000    # 8.0f

    .line 1678
    .line 1679
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1680
    .line 1681
    .line 1682
    const v0, 0x410c7ae1    # 8.78f

    .line 1683
    .line 1684
    .line 1685
    const/high16 v2, 0x41300000    # 11.0f

    .line 1686
    .line 1687
    const/high16 v4, 0x411c0000    # 9.75f

    .line 1688
    .line 1689
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1693
    .line 1694
    .line 1695
    const/high16 v0, 0x41240000    # 10.25f

    .line 1696
    .line 1697
    const v2, 0x410e147b    # 8.88f

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1701
    .line 1702
    .line 1703
    const v17, -0x413d70a4    # -0.38f

    .line 1704
    .line 1705
    .line 1706
    const v18, -0x413d70a4    # -0.38f

    .line 1707
    .line 1708
    .line 1709
    const v14, -0x41a8f5c3    # -0.21f

    .line 1710
    .line 1711
    .line 1712
    const v15, -0x41d1eb85    # -0.17f

    .line 1713
    .line 1714
    .line 1715
    const v16, -0x413d70a4    # -0.38f

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1719
    .line 1720
    .line 1721
    const/high16 v0, 0x41180000    # 9.5f

    .line 1722
    .line 1723
    const v2, 0x410ab852    # 8.67f

    .line 1724
    .line 1725
    .line 1726
    const v4, 0x410e147b    # 8.88f

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1730
    .line 1731
    .line 1732
    const v0, 0x3e2e147b    # 0.17f

    .line 1733
    .line 1734
    .line 1735
    const v2, 0x3ec28f5c    # 0.38f

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1739
    .line 1740
    .line 1741
    const v0, 0x411147ae    # 9.08f

    .line 1742
    .line 1743
    .line 1744
    const/high16 v2, 0x41240000    # 10.25f

    .line 1745
    .line 1746
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1747
    .line 1748
    .line 1749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v2

    .line 1756
    const/16 v16, 0x3800

    .line 1757
    .line 1758
    const/16 v17, 0x0

    .line 1759
    .line 1760
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1761
    .line 1762
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1763
    .line 1764
    const/4 v7, 0x0

    .line 1765
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1766
    .line 1767
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1768
    .line 1769
    const/4 v14, 0x0

    .line 1770
    const/4 v15, 0x0

    .line 1771
    const-string v4, ""

    .line 1772
    .line 1773
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    sput-object v0, Landroidx/compose/material/icons/outlined/FlutterDashKt;->_flutterDash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1782
    .line 1783
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1784
    .line 1785
    .line 1786
    return-object v0
.end method

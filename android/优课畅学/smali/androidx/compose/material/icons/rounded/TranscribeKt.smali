.class public final Landroidx/compose/material/icons/rounded/TranscribeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTranscribe(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Transcribe"

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
    const v0, 0x41b451ec    # 22.54f

    .line 71
    .line 72
    .line 73
    const v2, 0x41247ae1    # 10.28f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x3fdd70a4    # -2.54f

    .line 82
    .line 83
    .line 84
    const v13, -0x4151eb85    # -0.34f

    .line 85
    .line 86
    .line 87
    const v14, -0x40ae147b    # -0.82f

    .line 88
    .line 89
    .line 90
    const v15, -0x4151eb85    # -0.34f

    .line 91
    .line 92
    .line 93
    const v16, -0x4023d70a    # -1.72f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x418a3d71    # -0.24f

    .line 100
    .line 101
    .line 102
    const v18, -0x4059999a    # -1.3f

    .line 103
    .line 104
    .line 105
    const v13, 0x3e428f5c    # 0.19f

    .line 106
    .line 107
    .line 108
    const v14, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const v15, 0x3dcccccd    # 0.1f

    .line 112
    .line 113
    .line 114
    const v16, -0x408a3d71    # -0.96f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, -0x42333333    # -0.1f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, -0x400f5c29    # -1.88f

    .line 127
    .line 128
    .line 129
    const v18, 0x3e851eb8    # 0.26f

    .line 130
    .line 131
    .line 132
    const v13, -0x40f0a3d7    # -0.56f

    .line 133
    .line 134
    .line 135
    const v14, -0x40f0a3d7    # -0.56f

    .line 136
    .line 137
    .line 138
    const v15, -0x403eb852    # -1.51f

    .line 139
    .line 140
    .line 141
    const v16, -0x411eb852    # -0.44f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x3cf5c28f    # 0.03f

    .line 148
    .line 149
    .line 150
    const v18, 0x409947ae    # 4.79f

    .line 151
    .line 152
    .line 153
    const v13, -0x40b33333    # -0.8f

    .line 154
    .line 155
    .line 156
    const v14, 0x3fbd70a4    # 1.48f

    .line 157
    .line 158
    .line 159
    const v15, -0x40b5c28f    # -0.79f

    .line 160
    .line 161
    .line 162
    const v16, 0x404f5c29    # 3.24f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3fee147b    # 1.86f

    .line 169
    .line 170
    .line 171
    const v18, 0x3e8a3d71    # 0.27f

    .line 172
    .line 173
    .line 174
    const v13, 0x3ebd70a4    # 0.37f

    .line 175
    .line 176
    .line 177
    const v14, 0x3f30a3d7    # 0.69f

    .line 178
    .line 179
    .line 180
    const v15, 0x3fa7ae14    # 1.31f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f547ae1    # 0.83f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x3dcccccd    # 0.1f

    .line 190
    .line 191
    .line 192
    const v2, -0x42333333    # -0.1f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x41b451ec    # 22.54f

    .line 199
    .line 200
    .line 201
    const v18, 0x41247ae1    # 10.28f

    .line 202
    .line 203
    .line 204
    const v13, 0x41b53333    # 22.65f

    .line 205
    .line 206
    .line 207
    const v14, 0x4133ae14    # 11.23f

    .line 208
    .line 209
    .line 210
    const v15, 0x41b5d70a    # 22.73f

    .line 211
    .line 212
    .line 213
    const v16, 0x412b851f    # 10.72f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x4171c28f    # 15.11f

    .line 223
    .line 224
    .line 225
    const v2, 0x41968f5c    # 18.82f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, 0x3e051eb8    # 0.13f

    .line 235
    .line 236
    .line 237
    const v18, -0x40428f5c    # -1.48f

    .line 238
    .line 239
    .line 240
    const v13, 0x3ecccccd    # 0.4f

    .line 241
    .line 242
    .line 243
    const v14, -0x41333333    # -0.4f

    .line 244
    .line 245
    .line 246
    const v15, 0x3eeb851f    # 0.46f

    .line 247
    .line 248
    .line 249
    const v16, -0x407d70a4    # -1.02f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x3c23d70a    # 0.01f

    .line 256
    .line 257
    .line 258
    const v18, -0x3eec51ec    # -9.23f

    .line 259
    .line 260
    .line 261
    const v13, -0x4003d70a    # -1.97f

    .line 262
    .line 263
    .line 264
    const v14, -0x3fd147ae    # -2.73f

    .line 265
    .line 266
    .line 267
    const v15, -0x40051eb8    # -1.96f

    .line 268
    .line 269
    .line 270
    const v16, -0x3f33851f    # -6.39f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x41f0a3d7    # -0.14f

    .line 277
    .line 278
    .line 279
    const/high16 v18, -0x40400000    # -1.5f

    .line 280
    .line 281
    const v13, 0x3ea3d70a    # 0.32f

    .line 282
    .line 283
    .line 284
    const v14, -0x410f5c29    # -0.47f

    .line 285
    .line 286
    .line 287
    const v15, 0x3e851eb8    # 0.26f

    .line 288
    .line 289
    .line 290
    const v16, -0x40733333    # -1.1f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/4 v0, 0x0

    .line 297
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x401c28f6    # -1.78f

    .line 301
    .line 302
    .line 303
    const v18, 0x3dcccccd    # 0.1f

    .line 304
    .line 305
    .line 306
    const/high16 v13, -0x41000000    # -0.5f

    .line 307
    .line 308
    const/high16 v14, -0x41000000    # -0.5f

    .line 309
    .line 310
    const v15, -0x40547ae1    # -1.34f

    .line 311
    .line 312
    .line 313
    const v16, -0x41147ae1    # -0.46f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3ca3d70a    # 0.02f

    .line 320
    .line 321
    .line 322
    const/high16 v18, 0x41400000    # 12.0f

    .line 323
    .line 324
    const v13, -0x3fd147ae    # -2.73f

    .line 325
    .line 326
    .line 327
    const v14, 0x40628f5c    # 3.54f

    .line 328
    .line 329
    .line 330
    const v15, -0x3fd147ae    # -2.73f

    .line 331
    .line 332
    .line 333
    const v16, 0x4105c28f    # 8.36f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x41968f5c    # 18.82f

    .line 340
    .line 341
    .line 342
    const v18, 0x4171c28f    # 15.11f

    .line 343
    .line 344
    .line 345
    const v13, 0x418beb85    # 17.49f

    .line 346
    .line 347
    .line 348
    const v14, 0x4178f5c3    # 15.56f

    .line 349
    .line 350
    .line 351
    const v15, 0x4192a3d7    # 18.33f

    .line 352
    .line 353
    .line 354
    const v16, 0x4179c28f    # 15.61f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41500000    # 13.0f

    .line 364
    .line 365
    const/high16 v2, 0x41100000    # 9.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40800000    # 4.0f

    .line 371
    .line 372
    const/high16 v18, -0x3f800000    # -4.0f

    .line 373
    .line 374
    const v13, 0x400d70a4    # 2.21f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, 0x40800000    # 4.0f

    .line 379
    .line 380
    const v16, -0x401ae148    # -1.79f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, -0x3f800000    # -4.0f

    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const v14, -0x3ff28f5c    # -2.21f

    .line 390
    .line 391
    .line 392
    const v15, -0x401ae148    # -1.79f

    .line 393
    .line 394
    .line 395
    const/high16 v16, -0x3f800000    # -4.0f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x40d947ae    # 6.79f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x40a00000    # 5.0f

    .line 404
    .line 405
    const/high16 v4, 0x41100000    # 9.0f

    .line 406
    .line 407
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x41100000    # 9.0f

    .line 411
    .line 412
    const/high16 v18, 0x41500000    # 13.0f

    .line 413
    .line 414
    const/high16 v13, 0x40a00000    # 5.0f

    .line 415
    .line 416
    const v14, 0x41335c29    # 11.21f

    .line 417
    .line 418
    .line 419
    const v15, 0x40d947ae    # 6.79f

    .line 420
    .line 421
    .line 422
    const/high16 v16, 0x41500000    # 13.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x41763d71    # 15.39f

    .line 431
    .line 432
    .line 433
    const v2, 0x4178f5c3    # 15.56f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v18, 0x41600000    # 14.0f

    .line 440
    .line 441
    const v13, 0x415b5c29    # 13.71f

    .line 442
    .line 443
    .line 444
    const v14, 0x416b3333    # 14.7f

    .line 445
    .line 446
    .line 447
    const v15, 0x41387ae1    # 11.53f

    .line 448
    .line 449
    .line 450
    const/high16 v16, 0x41600000    # 14.0f

    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, -0x3f33851f    # -6.39f

    .line 456
    .line 457
    .line 458
    const v18, 0x3fc7ae14    # 1.56f

    .line 459
    .line 460
    .line 461
    const v13, -0x3fde147b    # -2.53f

    .line 462
    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    const v15, -0x3f6947ae    # -4.71f

    .line 466
    .line 467
    .line 468
    const v16, 0x3f333333    # 0.7f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const v18, 0x4191c28f    # 18.22f

    .line 477
    .line 478
    .line 479
    const v13, 0x3fce147b    # 1.61f

    .line 480
    .line 481
    .line 482
    const v14, 0x41808f5c    # 16.07f

    .line 483
    .line 484
    .line 485
    const/high16 v15, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const v16, 0x4188cccd    # 17.1f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v2, 0x41a00000    # 20.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v18, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const v14, 0x3f0ccccd    # 0.55f

    .line 504
    .line 505
    .line 506
    const v15, 0x3ee66666    # 0.45f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x3f800000    # 1.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41600000    # 14.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v18, -0x40800000    # -1.0f

    .line 520
    .line 521
    const v13, 0x3f0ccccd    # 0.55f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const v16, -0x4119999a    # -0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, -0x401c28f6    # -1.78f

    .line 534
    .line 535
    .line 536
    const/4 v2, 0x0

    .line 537
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x41763d71    # 15.39f

    .line 541
    .line 542
    .line 543
    const v18, 0x4178f5c3    # 15.56f

    .line 544
    .line 545
    .line 546
    const/high16 v13, 0x41880000    # 17.0f

    .line 547
    .line 548
    const v14, 0x4188cccd    # 17.1f

    .line 549
    .line 550
    .line 551
    const v15, 0x41831eb8    # 16.39f

    .line 552
    .line 553
    .line 554
    const v16, 0x41808f5c    # 16.07f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v16, 0x3800

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v8, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v7, 0x0

    .line 576
    const/high16 v9, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/high16 v12, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const/4 v14, 0x0

    .line 582
    const/4 v15, 0x0

    .line 583
    const-string v4, ""

    .line 584
    .line 585
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    sput-object v0, Landroidx/compose/material/icons/rounded/TranscribeKt;->_transcribe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 594
    .line 595
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    return-object v0
.end method

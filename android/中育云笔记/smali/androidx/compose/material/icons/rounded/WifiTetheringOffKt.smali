.class public final Landroidx/compose/material/icons/rounded/WifiTetheringOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiTetheringOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringOffKt;->_wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiTetheringOff"

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
    const v0, 0x40070a3d    # 2.11f

    .line 71
    .line 72
    .line 73
    const v2, 0x4060a3d7    # 3.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x40066666    # 2.1f

    .line 83
    .line 84
    .line 85
    const v18, 0x409dc28f    # 4.93f

    .line 86
    .line 87
    .line 88
    const v13, 0x3fdae148    # 1.71f

    .line 89
    .line 90
    .line 91
    const v14, 0x4079999a    # 3.9f

    .line 92
    .line 93
    .line 94
    const v15, 0x3fdae148    # 1.71f

    .line 95
    .line 96
    .line 97
    const v16, 0x409147ae    # 4.54f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x3ffd70a4    # 1.98f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x40000000    # 2.0f

    .line 110
    .line 111
    const/high16 v18, 0x41500000    # 13.0f

    .line 112
    .line 113
    const v13, 0x4031eb85    # 2.78f

    .line 114
    .line 115
    .line 116
    const v14, 0x4109999a    # 8.6f

    .line 117
    .line 118
    .line 119
    const/high16 v15, 0x40000000    # 2.0f

    .line 120
    .line 121
    const v16, 0x412b5c29    # 10.71f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x400c28f6    # 2.19f

    .line 128
    .line 129
    .line 130
    const v18, 0x40c7ae14    # 6.24f

    .line 131
    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x40170a3d    # 2.36f

    .line 135
    .line 136
    .line 137
    const v15, 0x3f51eb85    # 0.82f

    .line 138
    .line 139
    .line 140
    const v16, 0x4090f5c3    # 4.53f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 147
    .line 148
    const v18, 0x3da3d70a    # 0.08f

    .line 149
    .line 150
    .line 151
    const v13, 0x3ebd70a4    # 0.37f

    .line 152
    .line 153
    .line 154
    const v14, 0x3ef0a3d7    # 0.47f

    .line 155
    .line 156
    .line 157
    const v15, 0x3f88f5c3    # 1.07f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x3f000000    # 0.5f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x3da3d70a    # 0.08f

    .line 170
    .line 171
    .line 172
    const v18, -0x40570a3d    # -1.32f

    .line 173
    .line 174
    .line 175
    const v13, 0x3eb851ec    # 0.36f

    .line 176
    .line 177
    .line 178
    const v14, -0x4147ae14    # -0.36f

    .line 179
    .line 180
    .line 181
    const v15, 0x3ec7ae14    # 0.39f

    .line 182
    .line 183
    .line 184
    const v16, -0x40947ae1    # -0.92f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40800000    # 4.0f

    .line 191
    .line 192
    const/high16 v18, 0x41500000    # 13.0f

    .line 193
    .line 194
    const v13, 0x40951eb8    # 4.66f

    .line 195
    .line 196
    .line 197
    const v14, 0x41850a3d    # 16.63f

    .line 198
    .line 199
    .line 200
    const/high16 v15, 0x40800000    # 4.0f

    .line 201
    .line 202
    const v16, 0x416e3d71    # 14.89f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x3fc147ae    # 1.51f

    .line 209
    .line 210
    .line 211
    const v18, -0x3f6ae148    # -4.66f

    .line 212
    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const/high16 v14, -0x40200000    # -1.75f

    .line 216
    .line 217
    const v15, 0x3f11eb85    # 0.57f

    .line 218
    .line 219
    .line 220
    const v16, -0x3fa9999a    # -3.35f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3fb70a3d    # 1.43f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const/high16 v18, 0x41500000    # 13.0f

    .line 235
    .line 236
    const v13, 0x40cb3333    # 6.35f

    .line 237
    .line 238
    .line 239
    const v14, 0x412b3333    # 10.7f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x40c00000    # 6.0f

    .line 243
    .line 244
    const v16, 0x413cf5c3    # 11.81f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x3f83d70a    # 1.03f

    .line 251
    .line 252
    .line 253
    const v18, 0x40566666    # 3.35f

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 258
    .line 259
    const v15, 0x3ec28f5c    # 0.38f

    .line 260
    .line 261
    .line 262
    const v16, 0x4019999a    # 2.4f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3fc147ae    # 1.51f

    .line 269
    .line 270
    .line 271
    const v18, 0x3de147ae    # 0.11f

    .line 272
    .line 273
    .line 274
    const v13, 0x3eae147b    # 0.34f

    .line 275
    .line 276
    .line 277
    const/high16 v14, 0x3f000000    # 0.5f

    .line 278
    .line 279
    const v15, 0x3f8a3d71    # 1.08f

    .line 280
    .line 281
    .line 282
    const v16, 0x3f0a3d71    # 0.54f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/4 v0, 0x0

    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3dcccccd    # 0.1f

    .line 293
    .line 294
    .line 295
    const v18, -0x405ae148    # -1.29f

    .line 296
    .line 297
    .line 298
    const v13, 0x3eb33333    # 0.35f

    .line 299
    .line 300
    .line 301
    const v14, -0x414ccccd    # -0.35f

    .line 302
    .line 303
    .line 304
    const v15, 0x3ebd70a4    # 0.37f

    .line 305
    .line 306
    .line 307
    const v16, -0x409eb852    # -0.88f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41000000    # 8.0f

    .line 314
    .line 315
    const/high16 v18, 0x41500000    # 13.0f

    .line 316
    .line 317
    const v13, 0x4103d70a    # 8.24f

    .line 318
    .line 319
    .line 320
    const v14, 0x4168a3d7    # 14.54f

    .line 321
    .line 322
    .line 323
    const/high16 v15, 0x41000000    # 8.0f

    .line 324
    .line 325
    const v16, 0x415ccccd    # 13.8f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3ed1eb85    # 0.41f

    .line 332
    .line 333
    .line 334
    const v18, -0x401eb852    # -1.76f

    .line 335
    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, -0x40deb852    # -0.63f

    .line 339
    .line 340
    .line 341
    const v15, 0x3e19999a    # 0.15f

    .line 342
    .line 343
    .line 344
    const v16, -0x40628f5c    # -1.23f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x3fce147b    # 1.61f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x435c28f6    # -0.02f

    .line 357
    .line 358
    .line 359
    const v18, 0x3e19999a    # 0.15f

    .line 360
    .line 361
    .line 362
    const v14, 0x3d4ccccd    # 0.05f

    .line 363
    .line 364
    .line 365
    const v15, -0x435c28f6    # -0.02f

    .line 366
    .line 367
    .line 368
    const v16, 0x3dcccccd    # 0.1f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x3f170a3d    # 0.59f

    .line 375
    .line 376
    .line 377
    const v18, 0x3fb47ae1    # 1.41f

    .line 378
    .line 379
    .line 380
    const v14, 0x3f0ccccd    # 0.55f

    .line 381
    .line 382
    .line 383
    const v15, 0x3e6b851f    # 0.23f

    .line 384
    .line 385
    .line 386
    const v16, 0x3f866666    # 1.05f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x41400000    # 12.0f

    .line 393
    .line 394
    const/high16 v18, 0x41700000    # 15.0f

    .line 395
    .line 396
    const v13, 0x412f3333    # 10.95f

    .line 397
    .line 398
    .line 399
    const v14, 0x416c51ec    # 14.77f

    .line 400
    .line 401
    .line 402
    const v15, 0x41373333    # 11.45f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x41700000    # 15.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3e23d70a    # 0.16f

    .line 411
    .line 412
    .line 413
    const v18, -0x435c28f6    # -0.02f

    .line 414
    .line 415
    .line 416
    const v13, 0x3d4ccccd    # 0.05f

    .line 417
    .line 418
    .line 419
    const/4 v14, 0x0

    .line 420
    const v15, 0x3dcccccd    # 0.1f

    .line 421
    .line 422
    .line 423
    const v16, -0x43dc28f6    # -0.01f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x40dd1eb8    # 6.91f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3fb47ae1    # 1.41f

    .line 436
    .line 437
    .line 438
    const/16 v18, 0x0

    .line 439
    .line 440
    const v13, 0x3ec7ae14    # 0.39f

    .line 441
    .line 442
    .line 443
    const v14, 0x3ec7ae14    # 0.39f

    .line 444
    .line 445
    .line 446
    const v15, 0x3f828f5c    # 1.02f

    .line 447
    .line 448
    .line 449
    const v16, 0x3ec7ae14    # 0.39f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/4 v0, 0x0

    .line 456
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const v18, -0x404b851f    # -1.41f

    .line 462
    .line 463
    .line 464
    const v14, -0x413851ec    # -0.39f

    .line 465
    .line 466
    .line 467
    const v15, 0x3ec7ae14    # 0.39f

    .line 468
    .line 469
    .line 470
    const v16, -0x407d70a4    # -1.02f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x4060a3d7    # 3.51f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x40070a3d    # 2.11f

    .line 483
    .line 484
    .line 485
    const v18, 0x4060a3d7    # 3.51f

    .line 486
    .line 487
    .line 488
    const v13, 0x4047ae14    # 3.12f

    .line 489
    .line 490
    .line 491
    const v14, 0x4047ae14    # 3.12f

    .line 492
    .line 493
    .line 494
    const v15, 0x401f5c29    # 2.49f

    .line 495
    .line 496
    .line 497
    const v16, 0x4047ae14    # 3.12f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x416deb85    # 14.87f

    .line 507
    .line 508
    .line 509
    const v2, 0x418d999a    # 17.7f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41900000    # 18.0f

    .line 516
    .line 517
    const/high16 v18, 0x41500000    # 13.0f

    .line 518
    .line 519
    const v13, 0x418f1eb8    # 17.89f

    .line 520
    .line 521
    .line 522
    const v14, 0x41647ae1    # 14.28f

    .line 523
    .line 524
    .line 525
    const/high16 v15, 0x41900000    # 18.0f

    .line 526
    .line 527
    const v16, 0x415a6666    # 13.65f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, -0x3f400000    # -6.0f

    .line 534
    .line 535
    const/high16 v18, -0x3f400000    # -6.0f

    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const v14, -0x3fac28f6    # -3.31f

    .line 539
    .line 540
    .line 541
    const v15, -0x3fd3d70a    # -2.69f

    .line 542
    .line 543
    .line 544
    const/high16 v16, -0x3f400000    # -6.0f

    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, -0x4010a3d7    # -1.87f

    .line 550
    .line 551
    .line 552
    const v18, 0x3e99999a    # 0.3f

    .line 553
    .line 554
    .line 555
    const v13, -0x40d9999a    # -0.65f

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const v15, -0x405c28f6    # -1.28f

    .line 560
    .line 561
    .line 562
    const v16, 0x3dcccccd    # 0.1f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x3fdae148    # 1.71f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, 0x41400000    # 12.0f

    .line 575
    .line 576
    const/high16 v18, 0x41100000    # 9.0f

    .line 577
    .line 578
    const v13, 0x413e3d71    # 11.89f

    .line 579
    .line 580
    .line 581
    const/high16 v14, 0x41100000    # 9.0f

    .line 582
    .line 583
    const v15, 0x413f3333    # 11.95f

    .line 584
    .line 585
    .line 586
    const/high16 v16, 0x41100000    # 9.0f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v17, 0x40800000    # 4.0f

    .line 592
    .line 593
    const/high16 v18, 0x40800000    # 4.0f

    .line 594
    .line 595
    const v13, 0x400d70a4    # 2.21f

    .line 596
    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    const/high16 v15, 0x40800000    # 4.0f

    .line 600
    .line 601
    const v16, 0x3fe51eb8    # 1.79f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x43dc28f6    # -0.01f

    .line 608
    .line 609
    .line 610
    const v18, 0x3e23d70a    # 0.16f

    .line 611
    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const v14, 0x3d4ccccd    # 0.05f

    .line 615
    .line 616
    .line 617
    const/4 v15, 0x0

    .line 618
    const v16, 0x3de147ae    # 0.11f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, 0x416deb85    # 14.87f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x41400000    # 12.0f

    .line 634
    .line 635
    const/high16 v2, 0x40a00000    # 5.0f

    .line 636
    .line 637
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v17, 0x41000000    # 8.0f

    .line 641
    .line 642
    const/high16 v18, 0x41000000    # 8.0f

    .line 643
    .line 644
    const v13, 0x408d70a4    # 4.42f

    .line 645
    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const/high16 v15, 0x41000000    # 8.0f

    .line 649
    .line 650
    const v16, 0x40651eb8    # 3.58f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x40bae148    # -0.77f

    .line 657
    .line 658
    .line 659
    const v18, 0x4059999a    # 3.4f

    .line 660
    .line 661
    .line 662
    const/4 v13, 0x0

    .line 663
    const v14, 0x3f9c28f6    # 1.22f

    .line 664
    .line 665
    .line 666
    const v15, -0x4175c28f    # -0.27f

    .line 667
    .line 668
    .line 669
    const v16, 0x4017ae14    # 2.37f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x3fbeb852    # 1.49f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v17, 0x41b00000    # 22.0f

    .line 682
    .line 683
    const/high16 v18, 0x41500000    # 13.0f

    .line 684
    .line 685
    const v13, 0x41ac3d71    # 21.53f

    .line 686
    .line 687
    .line 688
    const v14, 0x4183999a    # 16.45f

    .line 689
    .line 690
    .line 691
    const/high16 v15, 0x41b00000    # 22.0f

    .line 692
    .line 693
    const v16, 0x416c7ae1    # 14.78f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 700
    .line 701
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const v14, -0x3f4f5c29    # -5.52f

    .line 705
    .line 706
    .line 707
    const v15, -0x3f70a3d7    # -4.48f

    .line 708
    .line 709
    .line 710
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v17, -0x3f63851f    # -4.89f

    .line 716
    .line 717
    .line 718
    const v18, 0x3fa3d70a    # 1.28f

    .line 719
    .line 720
    .line 721
    const v13, -0x401c28f6    # -1.78f

    .line 722
    .line 723
    .line 724
    const/4 v14, 0x0

    .line 725
    const v15, -0x3fa3d70a    # -3.44f

    .line 726
    .line 727
    .line 728
    const v16, 0x3eeb851f    # 0.46f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x3fbd70a4    # 1.48f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v17, 0x41400000    # 12.0f

    .line 741
    .line 742
    const/high16 v18, 0x40a00000    # 5.0f

    .line 743
    .line 744
    const v13, 0x411a147b    # 9.63f

    .line 745
    .line 746
    .line 747
    const v14, 0x40a8a3d7    # 5.27f

    .line 748
    .line 749
    .line 750
    const v15, 0x412c7ae1    # 10.78f

    .line 751
    .line 752
    .line 753
    const/high16 v16, 0x40a00000    # 5.0f

    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/16 v16, 0x3800

    .line 766
    .line 767
    const/16 v17, 0x0

    .line 768
    .line 769
    const/high16 v6, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/high16 v8, 0x3f800000    # 1.0f

    .line 772
    .line 773
    const/4 v7, 0x0

    .line 774
    const/high16 v9, 0x3f800000    # 1.0f

    .line 775
    .line 776
    const/high16 v12, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/4 v13, 0x0

    .line 779
    const/4 v14, 0x0

    .line 780
    const/4 v15, 0x0

    .line 781
    const-string v4, ""

    .line 782
    .line 783
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringOffKt;->_wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 792
    .line 793
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    return-object v0
.end method

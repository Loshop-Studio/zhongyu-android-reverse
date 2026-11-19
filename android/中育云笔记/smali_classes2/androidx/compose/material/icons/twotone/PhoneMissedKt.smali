.class public final Landroidx/compose/material/icons/twotone/PhoneMissedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneMissed(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhoneMissed"

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
    const v4, 0x4194cccd    # 18.6f

    .line 71
    .line 72
    .line 73
    const v6, 0x4189c28f    # 17.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3ff0a3d7    # 1.88f

    .line 80
    .line 81
    .line 82
    const v26, 0x3fa28f5c    # 1.27f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f28f5c3    # 0.66f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fa3d70a    # 1.28f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f4a3d71    # 0.79f

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
    const v4, 0x3f88f5c3    # 1.07f

    .line 103
    .line 104
    .line 105
    const v6, -0x40770a3d    # -1.07f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, -0x3fc33333    # -2.95f

    .line 112
    .line 113
    .line 114
    const v26, -0x400ccccd    # -1.9f

    .line 115
    .line 116
    .line 117
    const v21, -0x40970a3d    # -0.91f

    .line 118
    .line 119
    .line 120
    const/high16 v22, -0x40c00000    # -0.75f

    .line 121
    .line 122
    const v23, -0x400ccccd    # -1.9f

    .line 123
    .line 124
    .line 125
    const v24, -0x404e147b    # -1.39f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x3fd9999a    # 1.7f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x4061eb85    # 3.53f

    .line 141
    .line 142
    .line 143
    const/high16 v6, 0x41940000    # 18.5f

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, 0x3fef5c29    # 1.87f

    .line 149
    .line 150
    .line 151
    const v26, -0x405d70a4    # -1.27f

    .line 152
    .line 153
    .line 154
    const v21, 0x3f147ae1    # 0.58f

    .line 155
    .line 156
    .line 157
    const v22, -0x410f5c29    # -0.47f

    .line 158
    .line 159
    .line 160
    const v23, 0x3f9ae148    # 1.21f

    .line 161
    .line 162
    .line 163
    const v24, -0x409c28f6    # -0.89f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, -0x40251eb8    # -1.71f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, -0x3fc33333    # -2.95f

    .line 176
    .line 177
    .line 178
    const v26, 0x3ff33333    # 1.9f

    .line 179
    .line 180
    .line 181
    const v21, -0x4079999a    # -1.05f

    .line 182
    .line 183
    .line 184
    const v22, 0x3f028f5c    # 0.51f

    .line 185
    .line 186
    .line 187
    const v23, -0x3ffe147b    # -2.03f

    .line 188
    .line 189
    .line 190
    const v24, 0x3f933333    # 1.15f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3f8a3d71    # 1.08f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const v0, 0x41bdae14    # 23.71f

    .line 260
    .line 261
    .line 262
    const v2, 0x41855c29    # 16.67f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, 0x41400000    # 12.0f

    .line 269
    .line 270
    const/high16 v18, 0x41400000    # 12.0f

    .line 271
    .line 272
    const v13, 0x41a547ae    # 20.66f

    .line 273
    .line 274
    .line 275
    const v14, 0x415c7ae1    # 13.78f

    .line 276
    .line 277
    .line 278
    const v15, 0x418451ec    # 16.54f

    .line 279
    .line 280
    .line 281
    const/high16 v16, 0x41400000    # 12.0f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x415c7ae1    # 13.78f

    .line 287
    .line 288
    .line 289
    const v2, 0x3e947ae1    # 0.29f

    .line 290
    .line 291
    .line 292
    const v4, 0x41855c29    # 16.67f

    .line 293
    .line 294
    .line 295
    const v6, 0x4055c28f    # 3.34f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, -0x416b851f    # -0.29f

    .line 302
    .line 303
    .line 304
    const v18, 0x3f35c28f    # 0.71f

    .line 305
    .line 306
    .line 307
    const v13, -0x41c7ae14    # -0.18f

    .line 308
    .line 309
    .line 310
    const v14, 0x3e3851ec    # 0.18f

    .line 311
    .line 312
    .line 313
    const v15, -0x416b851f    # -0.29f

    .line 314
    .line 315
    .line 316
    const v16, 0x3edc28f6    # 0.43f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3e947ae1    # 0.29f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, 0x3e8f5c29    # 0.28f

    .line 327
    .line 328
    .line 329
    const v15, 0x3de147ae    # 0.11f

    .line 330
    .line 331
    .line 332
    const v16, 0x3f07ae14    # 0.53f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x401eb852    # 2.48f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3f35c28f    # 0.71f

    .line 345
    .line 346
    .line 347
    const v18, 0x3e947ae1    # 0.29f

    .line 348
    .line 349
    .line 350
    const v13, 0x3e3851ec    # 0.18f

    .line 351
    .line 352
    .line 353
    const v14, 0x3e3851ec    # 0.18f

    .line 354
    .line 355
    .line 356
    const v15, 0x3edc28f6    # 0.43f

    .line 357
    .line 358
    .line 359
    const v16, 0x3e947ae1    # 0.29f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x3f333333    # 0.7f

    .line 366
    .line 367
    .line 368
    const v18, -0x4170a3d7    # -0.28f

    .line 369
    .line 370
    .line 371
    const v13, 0x3e8a3d71    # 0.27f

    .line 372
    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const v15, 0x3f051eb8    # 0.52f

    .line 376
    .line 377
    .line 378
    const v16, -0x421eb852    # -0.11f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x402a3d71    # 2.66f

    .line 385
    .line 386
    .line 387
    const v18, -0x40133333    # -1.85f

    .line 388
    .line 389
    .line 390
    const v13, 0x3f4a3d71    # 0.79f

    .line 391
    .line 392
    .line 393
    const v14, -0x40c28f5c    # -0.74f

    .line 394
    .line 395
    .line 396
    const v15, 0x3fd851ec    # 1.69f

    .line 397
    .line 398
    .line 399
    const v16, -0x4051eb85    # -1.36f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x3f0f5c29    # 0.56f

    .line 406
    .line 407
    .line 408
    const v18, -0x4099999a    # -0.9f

    .line 409
    .line 410
    .line 411
    const v13, 0x3ea8f5c3    # 0.33f

    .line 412
    .line 413
    .line 414
    const v14, -0x41dc28f6    # -0.16f

    .line 415
    .line 416
    .line 417
    const v15, 0x3f0f5c29    # 0.56f

    .line 418
    .line 419
    .line 420
    const/high16 v16, -0x41000000    # -0.5f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x3fb9999a    # -3.1f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x40933333    # 4.6f

    .line 432
    .line 433
    .line 434
    const v18, -0x40c51eb8    # -0.73f

    .line 435
    .line 436
    .line 437
    const v13, 0x3fb9999a    # 1.45f

    .line 438
    .line 439
    .line 440
    const v14, -0x410a3d71    # -0.48f

    .line 441
    .line 442
    .line 443
    const/high16 v15, 0x40400000    # 3.0f

    .line 444
    .line 445
    const v16, -0x40c51eb8    # -0.73f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40933333    # 4.6f

    .line 452
    .line 453
    .line 454
    const v2, 0x3f3851ec    # 0.72f

    .line 455
    .line 456
    .line 457
    const v4, 0x4049999a    # 3.15f

    .line 458
    .line 459
    .line 460
    const/high16 v6, 0x3e800000    # 0.25f

    .line 461
    .line 462
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x40466666    # 3.1f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3f0f5c29    # 0.56f

    .line 472
    .line 473
    .line 474
    const v18, 0x3f666666    # 0.9f

    .line 475
    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    const v15, 0x3e6b851f    # 0.23f

    .line 482
    .line 483
    .line 484
    const v16, 0x3f3d70a4    # 0.74f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, 0x402ae148    # 2.67f

    .line 491
    .line 492
    .line 493
    const v18, 0x3feccccd    # 1.85f

    .line 494
    .line 495
    .line 496
    const v13, 0x3f7ae148    # 0.98f

    .line 497
    .line 498
    .line 499
    const v14, 0x3efae148    # 0.49f

    .line 500
    .line 501
    .line 502
    const v15, 0x3fef5c29    # 1.87f

    .line 503
    .line 504
    .line 505
    const v16, 0x3f8f5c29    # 1.12f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x3f333333    # 0.7f

    .line 512
    .line 513
    .line 514
    const v18, 0x3e8f5c29    # 0.28f

    .line 515
    .line 516
    .line 517
    const v13, 0x3e3851ec    # 0.18f

    .line 518
    .line 519
    .line 520
    const v14, 0x3e3851ec    # 0.18f

    .line 521
    .line 522
    .line 523
    const v15, 0x3edc28f6    # 0.43f

    .line 524
    .line 525
    .line 526
    const v16, 0x3e8f5c29    # 0.28f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x3f35c28f    # 0.71f

    .line 533
    .line 534
    .line 535
    const v18, -0x416b851f    # -0.29f

    .line 536
    .line 537
    .line 538
    const v13, 0x3e8f5c29    # 0.28f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const v15, 0x3f07ae14    # 0.53f

    .line 543
    .line 544
    .line 545
    const v16, -0x421eb852    # -0.11f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x3fe147ae    # -2.48f

    .line 552
    .line 553
    .line 554
    const v2, 0x401eb852    # 2.48f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x3e947ae1    # 0.29f

    .line 561
    .line 562
    .line 563
    const v18, -0x40ca3d71    # -0.71f

    .line 564
    .line 565
    .line 566
    const v13, 0x3e3851ec    # 0.18f

    .line 567
    .line 568
    .line 569
    const v14, -0x41c7ae14    # -0.18f

    .line 570
    .line 571
    .line 572
    const v15, 0x3e947ae1    # 0.29f

    .line 573
    .line 574
    .line 575
    const v16, -0x4123d70a    # -0.43f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, -0x41666666    # -0.3f

    .line 582
    .line 583
    .line 584
    const v18, -0x40cccccd    # -0.7f

    .line 585
    .line 586
    .line 587
    const/4 v13, 0x0

    .line 588
    const v14, -0x4170a3d7    # -0.28f

    .line 589
    .line 590
    .line 591
    const v15, -0x420a3d71    # -0.12f

    .line 592
    .line 593
    .line 594
    const v16, -0x40fae148    # -0.52f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x40accccd    # 5.4f

    .line 604
    .line 605
    .line 606
    const v2, 0x4189d70a    # 17.23f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x4010a3d7    # -1.87f

    .line 613
    .line 614
    .line 615
    const v18, 0x3fa28f5c    # 1.27f

    .line 616
    .line 617
    .line 618
    const v13, -0x40d70a3d    # -0.66f

    .line 619
    .line 620
    .line 621
    const v14, 0x3ebd70a4    # 0.37f

    .line 622
    .line 623
    .line 624
    const v15, -0x405ae148    # -1.29f

    .line 625
    .line 626
    .line 627
    const v16, 0x3f4ccccd    # 0.8f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, -0x40770a3d    # -1.07f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x403ccccd    # 2.95f

    .line 640
    .line 641
    .line 642
    const v18, -0x400ccccd    # -1.9f

    .line 643
    .line 644
    .line 645
    const v13, 0x3f68f5c3    # 0.91f

    .line 646
    .line 647
    .line 648
    const/high16 v14, -0x40c00000    # -0.75f

    .line 649
    .line 650
    const v15, 0x3ff33333    # 1.9f

    .line 651
    .line 652
    .line 653
    const v16, -0x404e147b    # -1.39f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x3fd9999a    # 1.7f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x41a3d70a    # 20.48f

    .line 669
    .line 670
    .line 671
    const v2, 0x4193eb85    # 18.49f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, -0x400f5c29    # -1.88f

    .line 678
    .line 679
    .line 680
    const v18, -0x405d70a4    # -1.27f

    .line 681
    .line 682
    .line 683
    const v13, -0x40e66666    # -0.6f

    .line 684
    .line 685
    .line 686
    const v14, -0x410a3d71    # -0.48f

    .line 687
    .line 688
    .line 689
    const v15, -0x4063d70a    # -1.22f

    .line 690
    .line 691
    .line 692
    const v16, -0x4099999a    # -0.9f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, -0x40266666    # -1.7f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v17, 0x403ccccd    # 2.95f

    .line 705
    .line 706
    .line 707
    const v18, 0x3ff33333    # 1.9f

    .line 708
    .line 709
    .line 710
    const v13, 0x3f866666    # 1.05f

    .line 711
    .line 712
    .line 713
    const v14, 0x3f028f5c    # 0.51f

    .line 714
    .line 715
    .line 716
    const v15, 0x4001eb85    # 2.03f

    .line 717
    .line 718
    .line 719
    const v16, 0x3f933333    # 1.15f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x3f88f5c3    # 1.07f

    .line 726
    .line 727
    .line 728
    const v2, -0x40770a3d    # -1.07f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x40e00000    # 7.0f

    .line 738
    .line 739
    const v2, 0x40cdc28f    # 6.43f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x409e147b    # 4.94f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x40e23d71    # 7.07f

    .line 752
    .line 753
    .line 754
    const v2, -0x3f1dc28f    # -7.07f

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, -0x404b851f    # -1.41f

    .line 761
    .line 762
    .line 763
    const v2, -0x404a3d71    # -1.42f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, -0x3f4ae148    # -5.66f

    .line 770
    .line 771
    .line 772
    const v2, 0x40b51eb8    # 5.66f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, 0x41066666    # 8.4f

    .line 779
    .line 780
    .line 781
    const/high16 v2, 0x40a00000    # 5.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v0, 0x41300000    # 11.0f

    .line 787
    .line 788
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v0, 0x40400000    # 3.0f

    .line 792
    .line 793
    const/high16 v2, 0x41300000    # 11.0f

    .line 794
    .line 795
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v2, 0x40a00000    # 5.0f

    .line 799
    .line 800
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v0, 0x40c00000    # 6.0f

    .line 804
    .line 805
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const/high16 v0, 0x40000000    # 2.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    const/16 v16, 0x3800

    .line 821
    .line 822
    const/16 v17, 0x0

    .line 823
    .line 824
    const/high16 v6, 0x3f800000    # 1.0f

    .line 825
    .line 826
    const/high16 v8, 0x3f800000    # 1.0f

    .line 827
    .line 828
    const/4 v7, 0x0

    .line 829
    const/high16 v12, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/4 v13, 0x0

    .line 832
    const/4 v14, 0x0

    .line 833
    const/4 v15, 0x0

    .line 834
    const-string v4, ""

    .line 835
    .line 836
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    sput-object v0, Landroidx/compose/material/icons/twotone/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 845
    .line 846
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    return-object v0
.end method

.method public static synthetic getPhoneMissed$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

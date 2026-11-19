.class public final Landroidx/compose/material/icons/twotone/CallEndKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCallEnd(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CallEnd"

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
    const v4, 0x4194b852    # 18.59f

    .line 71
    .line 72
    .line 73
    const v6, 0x4143ae14    # 12.23f

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
    const v21, 0x3f2b851f    # 0.67f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ec28f5c    # 0.38f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fa66666    # 1.3f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f4ccccd    # 0.8f

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
    const v4, -0x40770a3d    # -1.07f

    .line 103
    .line 104
    .line 105
    const v6, 0x3f88f5c3    # 1.07f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, -0x3fc28f5c    # -2.96f

    .line 112
    .line 113
    .line 114
    const v26, -0x400b851f    # -1.91f

    .line 115
    .line 116
    .line 117
    const v21, -0x40947ae1    # -0.92f

    .line 118
    .line 119
    .line 120
    const/high16 v22, -0x40c00000    # -0.75f

    .line 121
    .line 122
    const v23, -0x400b851f    # -1.91f

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
    const v4, 0x3fdae148    # 1.71f

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
    const v6, 0x4157d70a    # 13.49f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v25, 0x3fef5c29    # 1.87f

    .line 150
    .line 151
    .line 152
    const v26, -0x405d70a4    # -1.27f

    .line 153
    .line 154
    .line 155
    const v21, 0x3f170a3d    # 0.59f

    .line 156
    .line 157
    .line 158
    const v22, -0x410a3d71    # -0.48f

    .line 159
    .line 160
    .line 161
    const v23, 0x3f9c28f6    # 1.22f

    .line 162
    .line 163
    .line 164
    const v24, -0x4099999a    # -0.9f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, -0x40266666    # -1.7f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, -0x3fc3d70a    # -2.94f

    .line 177
    .line 178
    .line 179
    const v26, 0x3ff33333    # 1.9f

    .line 180
    .line 181
    .line 182
    const v21, -0x407ae148    # -1.04f

    .line 183
    .line 184
    .line 185
    const v22, 0x3f028f5c    # 0.51f

    .line 186
    .line 187
    .line 188
    const v23, -0x3ffe147b    # -2.03f

    .line 189
    .line 190
    .line 191
    const v24, 0x3f933333    # 1.15f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x3f88f5c3    # 1.07f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const v6, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const v8, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v0, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v2, 0x40e00000    # 7.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x3e947ae1    # 0.29f

    .line 268
    .line 269
    .line 270
    const v18, 0x413ab852    # 11.67f

    .line 271
    .line 272
    .line 273
    const v13, 0x40eeb852    # 7.46f

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x40e00000    # 7.0f

    .line 277
    .line 278
    const v15, 0x4055c28f    # 3.34f

    .line 279
    .line 280
    .line 281
    const v16, 0x410c7ae1    # 8.78f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, -0x416b851f    # -0.29f

    .line 288
    .line 289
    .line 290
    const v18, 0x3f35c28f    # 0.71f

    .line 291
    .line 292
    .line 293
    const v13, -0x41c7ae14    # -0.18f

    .line 294
    .line 295
    .line 296
    const v14, 0x3e3851ec    # 0.18f

    .line 297
    .line 298
    .line 299
    const v15, -0x416b851f    # -0.29f

    .line 300
    .line 301
    .line 302
    const v16, 0x3edc28f6    # 0.43f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3e947ae1    # 0.29f

    .line 309
    .line 310
    .line 311
    const v18, 0x3f333333    # 0.7f

    .line 312
    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, 0x3e8f5c29    # 0.28f

    .line 316
    .line 317
    .line 318
    const v15, 0x3de147ae    # 0.11f

    .line 319
    .line 320
    .line 321
    const v16, 0x3f07ae14    # 0.53f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x401eb852    # 2.48f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3f35c28f    # 0.71f

    .line 334
    .line 335
    .line 336
    const v18, 0x3e947ae1    # 0.29f

    .line 337
    .line 338
    .line 339
    const v13, 0x3e3851ec    # 0.18f

    .line 340
    .line 341
    .line 342
    const v14, 0x3e3851ec    # 0.18f

    .line 343
    .line 344
    .line 345
    const v15, 0x3edc28f6    # 0.43f

    .line 346
    .line 347
    .line 348
    const v16, 0x3e947ae1    # 0.29f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x3f333333    # 0.7f

    .line 355
    .line 356
    .line 357
    const v18, -0x4170a3d7    # -0.28f

    .line 358
    .line 359
    .line 360
    const v13, 0x3e8a3d71    # 0.27f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const v15, 0x3f051eb8    # 0.52f

    .line 365
    .line 366
    .line 367
    const v16, -0x42333333    # -0.1f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, 0x402a3d71    # 2.66f

    .line 374
    .line 375
    .line 376
    const v18, -0x40133333    # -1.85f

    .line 377
    .line 378
    .line 379
    const v13, 0x3f4a3d71    # 0.79f

    .line 380
    .line 381
    .line 382
    const v14, -0x40c51eb8    # -0.73f

    .line 383
    .line 384
    .line 385
    const v15, 0x3fd70a3d    # 1.68f

    .line 386
    .line 387
    .line 388
    const v16, -0x4051eb85    # -1.36f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x3f0f5c29    # 0.56f

    .line 395
    .line 396
    .line 397
    const v18, -0x4099999a    # -0.9f

    .line 398
    .line 399
    .line 400
    const v13, 0x3ea8f5c3    # 0.33f

    .line 401
    .line 402
    .line 403
    const v14, -0x41dc28f6    # -0.16f

    .line 404
    .line 405
    .line 406
    const v15, 0x3f0f5c29    # 0.56f

    .line 407
    .line 408
    .line 409
    const v16, -0x40fd70a4    # -0.51f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, -0x3fb9999a    # -3.1f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41400000    # 12.0f

    .line 422
    .line 423
    const/high16 v18, 0x41100000    # 9.0f

    .line 424
    .line 425
    const v13, 0x410d999a    # 8.85f

    .line 426
    .line 427
    .line 428
    const/high16 v14, 0x41140000    # 9.25f

    .line 429
    .line 430
    const v15, 0x41266666    # 10.4f

    .line 431
    .line 432
    .line 433
    const/high16 v16, 0x41100000    # 9.0f

    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x4092e148    # 4.59f

    .line 439
    .line 440
    .line 441
    const v18, 0x3f3ae148    # 0.73f

    .line 442
    .line 443
    .line 444
    const v13, 0x3fcccccd    # 1.6f

    .line 445
    .line 446
    .line 447
    const/4 v14, 0x0

    .line 448
    const v15, 0x4049999a    # 3.15f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x3e800000    # 0.25f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x40466666    # 3.1f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3f0f5c29    # 0.56f

    .line 463
    .line 464
    .line 465
    const v18, 0x3f666666    # 0.9f

    .line 466
    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const v14, 0x3ecccccd    # 0.4f

    .line 470
    .line 471
    .line 472
    const v15, 0x3e6b851f    # 0.23f

    .line 473
    .line 474
    .line 475
    const v16, 0x3f3d70a4    # 0.74f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x402ae148    # 2.67f

    .line 482
    .line 483
    .line 484
    const v18, 0x3feccccd    # 1.85f

    .line 485
    .line 486
    .line 487
    const v13, 0x3f7ae148    # 0.98f

    .line 488
    .line 489
    .line 490
    const v14, 0x3efae148    # 0.49f

    .line 491
    .line 492
    .line 493
    const v15, 0x3ff0a3d7    # 1.88f

    .line 494
    .line 495
    .line 496
    const v16, 0x3f8e147b    # 1.11f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x3f333333    # 0.7f

    .line 503
    .line 504
    .line 505
    const v18, 0x3e8f5c29    # 0.28f

    .line 506
    .line 507
    .line 508
    const v13, 0x3e3851ec    # 0.18f

    .line 509
    .line 510
    .line 511
    const v14, 0x3e2e147b    # 0.17f

    .line 512
    .line 513
    .line 514
    const v15, 0x3edc28f6    # 0.43f

    .line 515
    .line 516
    .line 517
    const v16, 0x3e8f5c29    # 0.28f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3f35c28f    # 0.71f

    .line 524
    .line 525
    .line 526
    const v18, -0x416b851f    # -0.29f

    .line 527
    .line 528
    .line 529
    const v13, 0x3e8f5c29    # 0.28f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const v15, 0x3f07ae14    # 0.53f

    .line 534
    .line 535
    .line 536
    const v16, -0x421eb852    # -0.11f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x3fe147ae    # -2.48f

    .line 543
    .line 544
    .line 545
    const v2, 0x401eb852    # 2.48f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x3e947ae1    # 0.29f

    .line 552
    .line 553
    .line 554
    const v18, -0x40ca3d71    # -0.71f

    .line 555
    .line 556
    .line 557
    const v13, 0x3e3851ec    # 0.18f

    .line 558
    .line 559
    .line 560
    const v14, -0x41c7ae14    # -0.18f

    .line 561
    .line 562
    .line 563
    const v15, 0x3e947ae1    # 0.29f

    .line 564
    .line 565
    .line 566
    const v16, -0x4123d70a    # -0.43f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, -0x416b851f    # -0.29f

    .line 573
    .line 574
    .line 575
    const/4 v13, 0x0

    .line 576
    const v14, -0x4170a3d7    # -0.28f

    .line 577
    .line 578
    .line 579
    const v15, -0x421eb852    # -0.11f

    .line 580
    .line 581
    .line 582
    const v16, -0x40f851ec    # -0.53f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v17, 0x41400000    # 12.0f

    .line 589
    .line 590
    const/high16 v18, 0x40e00000    # 7.0f

    .line 591
    .line 592
    const v13, 0x41a547ae    # 20.66f

    .line 593
    .line 594
    .line 595
    const v14, 0x410c7ae1    # 8.78f

    .line 596
    .line 597
    .line 598
    const v15, 0x418451ec    # 16.54f

    .line 599
    .line 600
    .line 601
    const/high16 v16, 0x40e00000    # 7.0f

    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x40accccd    # 5.4f

    .line 610
    .line 611
    .line 612
    const v2, 0x4143851f    # 12.22f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, -0x4010a3d7    # -1.87f

    .line 619
    .line 620
    .line 621
    const v18, 0x3fa28f5c    # 1.27f

    .line 622
    .line 623
    .line 624
    const v13, -0x40d9999a    # -0.65f

    .line 625
    .line 626
    .line 627
    const v14, 0x3ebd70a4    # 0.37f

    .line 628
    .line 629
    .line 630
    const v15, -0x405c28f6    # -1.28f

    .line 631
    .line 632
    .line 633
    const v16, 0x3f4a3d71    # 0.79f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, -0x40770a3d    # -1.07f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, 0x403c28f6    # 2.94f

    .line 646
    .line 647
    .line 648
    const v18, -0x400ccccd    # -1.9f

    .line 649
    .line 650
    .line 651
    const v13, 0x3f68f5c3    # 0.91f

    .line 652
    .line 653
    .line 654
    const/high16 v14, -0x40c00000    # -0.75f

    .line 655
    .line 656
    const v15, 0x3ff33333    # 1.9f

    .line 657
    .line 658
    .line 659
    const v16, -0x404f5c29    # -1.38f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x3fd9999a    # 1.7f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, 0x41a3c28f    # 20.47f

    .line 675
    .line 676
    .line 677
    const/high16 v2, 0x41580000    # 13.5f

    .line 678
    .line 679
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, -0x400f5c29    # -1.88f

    .line 683
    .line 684
    .line 685
    const v18, -0x405d70a4    # -1.27f

    .line 686
    .line 687
    .line 688
    const v13, -0x40eb851f    # -0.58f

    .line 689
    .line 690
    .line 691
    const v14, -0x410f5c29    # -0.47f

    .line 692
    .line 693
    .line 694
    const v15, -0x40651eb8    # -1.21f

    .line 695
    .line 696
    .line 697
    const v16, -0x409c28f6    # -0.89f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, -0x40251eb8    # -1.71f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x403d70a4    # 2.96f

    .line 710
    .line 711
    .line 712
    const v18, 0x3ff47ae1    # 1.91f

    .line 713
    .line 714
    .line 715
    const v13, 0x3f866666    # 1.05f

    .line 716
    .line 717
    .line 718
    const v14, 0x3f028f5c    # 0.51f

    .line 719
    .line 720
    .line 721
    const v15, 0x40028f5c    # 2.04f

    .line 722
    .line 723
    .line 724
    const v16, 0x3f933333    # 1.15f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, -0x4075c28f    # -1.08f

    .line 731
    .line 732
    .line 733
    const v2, 0x3f88f5c3    # 1.07f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/16 v16, 0x3800

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const/high16 v6, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/high16 v8, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/4 v7, 0x0

    .line 755
    const/high16 v12, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const/4 v13, 0x0

    .line 758
    const/4 v14, 0x0

    .line 759
    const/4 v15, 0x0

    .line 760
    const-string v4, ""

    .line 761
    .line 762
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    sput-object v0, Landroidx/compose/material/icons/twotone/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 771
    .line 772
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    return-object v0
.end method

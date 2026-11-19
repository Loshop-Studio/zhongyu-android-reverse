.class public final Landroidx/compose/material/icons/filled/StrikethroughSKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStrikethroughS(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.StrikethroughS"

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
    const v0, 0x40db3333    # 6.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x40e28f5c    # 7.08f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4143d70a    # 12.24f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x40400000    # 3.0f

    .line 83
    .line 84
    const v13, 0x40db3333    # 6.85f

    .line 85
    .line 86
    .line 87
    const v14, 0x408bd70a    # 4.37f

    .line 88
    .line 89
    .line 90
    const v15, 0x41173333    # 9.45f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x40400000    # 3.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x4079999a    # 3.9f

    .line 99
    .line 100
    .line 101
    const v18, 0x3fa3d70a    # 1.28f

    .line 102
    .line 103
    .line 104
    const v13, 0x3fd1eb85    # 1.64f

    .line 105
    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    const/high16 v15, 0x40400000    # 3.0f

    .line 109
    .line 110
    const v16, 0x3efae148    # 0.49f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3fbae148    # 1.46f

    .line 117
    .line 118
    .line 119
    const v18, 0x404f5c29    # 3.24f

    .line 120
    .line 121
    .line 122
    const v13, 0x3f451eb8    # 0.77f

    .line 123
    .line 124
    .line 125
    const v14, 0x3f266666    # 0.65f

    .line 126
    .line 127
    .line 128
    const v15, 0x3fbae148    # 1.46f

    .line 129
    .line 130
    .line 131
    const v16, 0x3fdd70a4    # 1.73f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, -0x3fbf5c29    # -3.01f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x41e66666    # -0.15f

    .line 144
    .line 145
    .line 146
    const v18, -0x40a66666    # -0.85f

    .line 147
    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, -0x416147ae    # -0.31f

    .line 151
    .line 152
    .line 153
    const v15, -0x42b33333    # -0.05f

    .line 154
    .line 155
    .line 156
    const v16, -0x40e8f5c3    # -0.59f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 163
    .line 164
    const v18, -0x405c28f6    # -1.28f

    .line 165
    .line 166
    .line 167
    const v13, -0x416b851f    # -0.29f

    .line 168
    .line 169
    .line 170
    const v14, -0x40a3d70a    # -0.86f

    .line 171
    .line 172
    .line 173
    const v15, -0x40666666    # -1.2f

    .line 174
    .line 175
    .line 176
    const v16, -0x405c28f6    # -1.28f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x3fea3d71    # -2.34f

    .line 183
    .line 184
    .line 185
    const v18, 0x3fd9999a    # 1.7f

    .line 186
    .line 187
    .line 188
    const v13, -0x4011eb85    # -1.86f

    .line 189
    .line 190
    .line 191
    const/4 v14, 0x0

    .line 192
    const v15, -0x3fea3d71    # -2.34f

    .line 193
    .line 194
    .line 195
    const v16, 0x3f828f5c    # 1.02f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x3f3d70a4    # 0.74f

    .line 202
    .line 203
    .line 204
    const v18, 0x3f9ae148    # 1.21f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, 0x3ef5c28f    # 0.48f

    .line 209
    .line 210
    .line 211
    const/high16 v15, 0x3e800000    # 0.25f

    .line 212
    .line 213
    const v16, 0x3f6147ae    # 0.88f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x41400000    # 12.0f

    .line 220
    .line 221
    const/high16 v18, 0x41100000    # 9.0f

    .line 222
    .line 223
    const v13, 0x412f851f    # 10.97f

    .line 224
    .line 225
    .line 226
    const v14, 0x4108cccd    # 8.55f

    .line 227
    .line 228
    .line 229
    const v15, 0x4135c28f    # 11.36f

    .line 230
    .line 231
    .line 232
    const v16, 0x410c7ae1    # 8.78f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x40ec7ae1    # 7.39f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x40db3333    # 6.85f

    .line 245
    .line 246
    .line 247
    const v18, 0x40e28f5c    # 7.08f

    .line 248
    .line 249
    .line 250
    const v13, 0x40e5c28f    # 7.18f

    .line 251
    .line 252
    .line 253
    const v14, 0x410a8f5c    # 8.66f

    .line 254
    .line 255
    .line 256
    const v15, 0x40db3333    # 6.85f

    .line 257
    .line 258
    .line 259
    const v16, 0x4101c28f    # 8.11f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41400000    # 12.0f

    .line 269
    .line 270
    const/high16 v2, 0x41a80000    # 21.0f

    .line 271
    .line 272
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x40000000    # -2.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x40400000    # 3.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x4119eb85    # 9.62f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3ffae148    # 1.96f

    .line 297
    .line 298
    .line 299
    const v18, 0x3ffc28f6    # 1.97f

    .line 300
    .line 301
    .line 302
    const v13, 0x3f933333    # 1.15f

    .line 303
    .line 304
    .line 305
    const v14, 0x3ee66666    # 0.45f

    .line 306
    .line 307
    .line 308
    const v15, 0x3ffae148    # 1.96f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x3f400000    # 0.75f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x3fee147b    # -2.28f

    .line 317
    .line 318
    .line 319
    const v18, 0x3fd5c28f    # 1.67f

    .line 320
    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const/high16 v14, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const v15, -0x40b0a3d7    # -0.81f

    .line 326
    .line 327
    .line 328
    const v16, 0x3fd5c28f    # 1.67f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x3fc47ae1    # -2.93f

    .line 335
    .line 336
    .line 337
    const v18, -0x3fdf5c29    # -2.51f

    .line 338
    .line 339
    .line 340
    const v13, -0x403ae148    # -1.54f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const v15, -0x3fc47ae1    # -2.93f

    .line 345
    .line 346
    .line 347
    const v16, -0x40f5c28f    # -0.54f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x40cccccd    # 6.4f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x3e75c28f    # 0.24f

    .line 360
    .line 361
    .line 362
    const v18, 0x3fca3d71    # 1.58f

    .line 363
    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, 0x3f0ccccd    # 0.55f

    .line 367
    .line 368
    .line 369
    const v15, 0x3da3d70a    # 0.08f

    .line 370
    .line 371
    .line 372
    const v16, 0x3f90a3d7    # 1.13f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x40b570a4    # 5.67f

    .line 379
    .line 380
    .line 381
    const v18, 0x40533333    # 3.3f

    .line 382
    .line 383
    .line 384
    const v13, 0x3f4f5c29    # 0.81f

    .line 385
    .line 386
    .line 387
    const v14, 0x40128f5c    # 2.29f

    .line 388
    .line 389
    .line 390
    const v15, 0x40528f5c    # 3.29f

    .line 391
    .line 392
    .line 393
    const v16, 0x40533333    # 3.3f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x40a9999a    # 5.3f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f7e6666    # -4.05f

    .line 403
    .line 404
    .line 405
    const v13, 0x401147ae    # 2.27f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, 0x40a9999a    # 5.3f

    .line 410
    .line 411
    .line 412
    const v16, -0x409c28f6    # -0.89f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x410a3d71    # -0.48f

    .line 419
    .line 420
    .line 421
    const v18, -0x4007ae14    # -1.94f

    .line 422
    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const v14, -0x41666666    # -0.3f

    .line 426
    .line 427
    .line 428
    const v15, -0x43dc28f6    # -0.01f

    .line 429
    .line 430
    .line 431
    const v16, -0x406b851f    # -1.16f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41a80000    # 21.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41400000    # 12.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/16 v16, 0x3800

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const/high16 v6, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v8, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v7, 0x0

    .line 463
    const/high16 v9, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/high16 v12, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/4 v15, 0x0

    .line 469
    const-string v4, ""

    .line 470
    .line 471
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sput-object v0, Landroidx/compose/material/icons/filled/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 480
    .line 481
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    return-object v0
.end method

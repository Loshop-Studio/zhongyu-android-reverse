.class public final Landroidx/compose/material/icons/rounded/ModeFanOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getModeFanOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ModeFanOff"

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
    const v4, 0x4182b852    # 16.34f

    .line 71
    .line 72
    .line 73
    const v6, 0x4105c28f    # 8.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fed70a4    # -2.29f

    .line 80
    .line 81
    .line 82
    const v6, 0x3f51eb85    # 0.82f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x40eb851f    # -0.58f

    .line 89
    .line 90
    .line 91
    const v26, -0x4151eb85    # -0.34f

    .line 92
    .line 93
    .line 94
    const v21, -0x41c7ae14    # -0.18f

    .line 95
    .line 96
    .line 97
    const v22, -0x41fae148    # -0.13f

    .line 98
    .line 99
    .line 100
    const v23, -0x413d70a4    # -0.38f

    .line 101
    .line 102
    .line 103
    const/high16 v24, -0x41800000    # -0.25f

    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v25, 0x3fae147b    # 1.36f

    .line 111
    .line 112
    .line 113
    const v26, -0x3ffc28f6    # -2.06f

    .line 114
    .line 115
    .line 116
    const v21, 0x3e2e147b    # 0.17f

    .line 117
    .line 118
    .line 119
    const v22, -0x40ab851f    # -0.83f

    .line 120
    .line 121
    .line 122
    const v23, 0x3f2147ae    # 0.63f

    .line 123
    .line 124
    .line 125
    const v24, -0x4035c28f    # -1.58f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, 0x41563d71    # 13.39f

    .line 132
    .line 133
    .line 134
    const/high16 v26, 0x40000000    # 2.0f

    .line 135
    .line 136
    const v21, 0x4186cccd    # 16.85f

    .line 137
    .line 138
    .line 139
    const v22, 0x40ae147b    # 5.44f

    .line 140
    .line 141
    .line 142
    const v23, 0x418170a4    # 16.18f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, -0x3f566666    # -5.3f

    .line 151
    .line 152
    .line 153
    const v26, 0x4050a3d7    # 3.26f

    .line 154
    .line 155
    .line 156
    const v21, -0x3fbae148    # -3.08f

    .line 157
    .line 158
    .line 159
    const/16 v22, 0x0

    .line 160
    .line 161
    const v23, -0x3f633333    # -4.9f

    .line 162
    .line 163
    .line 164
    const v24, 0x3fbc28f6    # 1.47f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x4195d70a    # 18.73f

    .line 171
    .line 172
    .line 173
    const v6, 0x417e6666    # 15.9f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x405147ae    # 3.27f

    .line 180
    .line 181
    .line 182
    const v26, -0x3fdf5c29    # -2.51f

    .line 183
    .line 184
    .line 185
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 186
    .line 187
    const v22, 0x3ec7ae14    # 0.39f

    .line 188
    .line 189
    .line 190
    const v23, 0x405147ae    # 3.27f

    .line 191
    .line 192
    .line 193
    const v24, -0x40fd70a4    # -0.51f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x4182b852    # 16.34f

    .line 200
    .line 201
    .line 202
    const v26, 0x4105c28f    # 8.36f

    .line 203
    .line 204
    .line 205
    const/high16 v21, 0x41b00000    # 22.0f

    .line 206
    .line 207
    const/high16 v22, 0x41100000    # 9.0f

    .line 208
    .line 209
    const v23, 0x4197eb85    # 18.99f

    .line 210
    .line 211
    .line 212
    const v24, 0x40e51eb8    # 7.16f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v16, 0x3800

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/high16 v6, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v8, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/high16 v9, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v12, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    const/4 v15, 0x0

    .line 241
    const-string v4, ""

    .line 242
    .line 243
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    const/4 v0, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const v0, 0x40066666    # 2.1f

    .line 274
    .line 275
    .line 276
    const v2, 0x4060a3d7    # 3.51f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const v18, 0x3fb47ae1    # 1.41f

    .line 288
    .line 289
    .line 290
    const v13, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    const v14, 0x3ec7ae14    # 0.39f

    .line 294
    .line 295
    .line 296
    const v15, -0x413851ec    # -0.39f

    .line 297
    .line 298
    .line 299
    const v16, 0x3f828f5c    # 1.02f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x40a8a3d7    # 5.27f

    .line 306
    .line 307
    .line 308
    const v2, 0x4101999a    # 8.1f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x40000000    # 2.0f

    .line 315
    .line 316
    const v18, 0x4129c28f    # 10.61f

    .line 317
    .line 318
    .line 319
    const v13, 0x407147ae    # 3.77f

    .line 320
    .line 321
    .line 322
    const v14, 0x40f66666    # 7.7f

    .line 323
    .line 324
    .line 325
    const/high16 v15, 0x40000000    # 2.0f

    .line 326
    .line 327
    const v16, 0x4109c28f    # 8.61f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x40b51eb8    # 5.66f

    .line 334
    .line 335
    .line 336
    const v18, 0x40a0f5c3    # 5.03f

    .line 337
    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, 0x408ccccd    # 4.4f

    .line 341
    .line 342
    .line 343
    const v15, 0x4040a3d7    # 3.01f

    .line 344
    .line 345
    .line 346
    const v16, 0x40c7ae14    # 6.24f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x40128f5c    # 2.29f

    .line 353
    .line 354
    .line 355
    const v2, -0x40ae147b    # -0.82f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3f147ae1    # 0.58f

    .line 362
    .line 363
    .line 364
    const v18, 0x3eae147b    # 0.34f

    .line 365
    .line 366
    .line 367
    const v13, 0x3e3851ec    # 0.18f

    .line 368
    .line 369
    .line 370
    const v14, 0x3e051eb8    # 0.13f

    .line 371
    .line 372
    .line 373
    const v15, 0x3ec28f5c    # 0.38f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x3e800000    # 0.25f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x4051eb85    # -1.36f

    .line 382
    .line 383
    .line 384
    const v18, 0x4003d70a    # 2.06f

    .line 385
    .line 386
    .line 387
    const v13, -0x41d1eb85    # -0.17f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f547ae1    # 0.83f

    .line 391
    .line 392
    .line 393
    const v15, -0x40deb852    # -0.63f

    .line 394
    .line 395
    .line 396
    const v16, 0x3fca3d71    # 1.58f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x4129c28f    # 10.61f

    .line 403
    .line 404
    .line 405
    const/high16 v18, 0x41b00000    # 22.0f

    .line 406
    .line 407
    const v13, 0x40e4cccd    # 7.15f

    .line 408
    .line 409
    .line 410
    const v14, 0x41947ae1    # 18.56f

    .line 411
    .line 412
    .line 413
    const v15, 0x40fa3d71    # 7.82f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41b00000    # 22.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x40a9999a    # 5.3f

    .line 422
    .line 423
    .line 424
    const v18, -0x3faf5c29    # -3.26f

    .line 425
    .line 426
    .line 427
    const v13, 0x40451eb8    # 3.08f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const v15, 0x409ccccd    # 4.9f

    .line 432
    .line 433
    .line 434
    const v16, -0x4043d70a    # -1.47f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x404a3d71    # 3.16f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, 0x3fb47ae1    # 1.41f

    .line 447
    .line 448
    .line 449
    const/16 v18, 0x0

    .line 450
    .line 451
    const v13, 0x3ec7ae14    # 0.39f

    .line 452
    .line 453
    .line 454
    const v14, 0x3ec7ae14    # 0.39f

    .line 455
    .line 456
    .line 457
    const v15, 0x3f828f5c    # 1.02f

    .line 458
    .line 459
    .line 460
    const v16, 0x3ec7ae14    # 0.39f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/4 v0, 0x0

    .line 467
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const v18, -0x404b851f    # -1.41f

    .line 473
    .line 474
    .line 475
    const v14, -0x413851ec    # -0.39f

    .line 476
    .line 477
    .line 478
    const v15, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    const v16, -0x407d70a4    # -1.02f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x4060a3d7    # 3.51f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x40066666    # 2.1f

    .line 494
    .line 495
    .line 496
    const v18, 0x4060a3d7    # 3.51f

    .line 497
    .line 498
    .line 499
    const v13, 0x4047ae14    # 3.12f

    .line 500
    .line 501
    .line 502
    const v14, 0x4047ae14    # 3.12f

    .line 503
    .line 504
    .line 505
    const v15, 0x401f5c29    # 2.49f

    .line 506
    .line 507
    .line 508
    const v16, 0x4047ae14    # 3.12f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const/16 v16, 0x3800

    .line 522
    .line 523
    const/16 v17, 0x0

    .line 524
    .line 525
    const/high16 v6, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/high16 v12, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const/4 v14, 0x0

    .line 532
    const/4 v15, 0x0

    .line 533
    const-string v4, ""

    .line 534
    .line 535
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sput-object v0, Landroidx/compose/material/icons/rounded/ModeFanOffKt;->_modeFanOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 544
    .line 545
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    return-object v0
.end method

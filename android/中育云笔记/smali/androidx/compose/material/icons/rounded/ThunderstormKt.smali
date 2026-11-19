.class public final Landroidx/compose/material/icons/rounded/ThunderstormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThunderstorm(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Thunderstorm"

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
    const v4, 0x418f5c29    # 17.92f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e0a3d7    # 7.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v21, 0x418b999a    # 17.45f

    .line 84
    .line 85
    .line 86
    const v22, 0x4085c28f    # 4.18f

    .line 87
    .line 88
    .line 89
    const v23, 0x416f851f    # 14.97f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40000000    # 2.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, 0x40d8f5c3    # 6.78f

    .line 100
    .line 101
    .line 102
    const v26, 0x40a1eb85    # 5.06f

    .line 103
    .line 104
    .line 105
    const v21, 0x411d1eb8    # 9.82f

    .line 106
    .line 107
    .line 108
    const/high16 v22, 0x40000000    # 2.0f

    .line 109
    .line 110
    const v23, 0x40fa8f5c    # 7.83f

    .line 111
    .line 112
    .line 113
    const v24, 0x404b851f    # 3.18f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40000000    # 2.0f

    .line 120
    .line 121
    const/high16 v26, 0x41280000    # 10.5f

    .line 122
    .line 123
    const v21, 0x4082e148    # 4.09f

    .line 124
    .line 125
    .line 126
    const v22, 0x40ad1eb8    # 5.41f

    .line 127
    .line 128
    .line 129
    const/high16 v23, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v24, 0x40f7ae14    # 7.74f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x40f00000    # 7.5f

    .line 138
    .line 139
    const/high16 v26, 0x41800000    # 16.0f

    .line 140
    .line 141
    const/high16 v21, 0x40000000    # 2.0f

    .line 142
    .line 143
    const v22, 0x41587ae1    # 13.53f

    .line 144
    .line 145
    .line 146
    const v23, 0x408f0a3d    # 4.47f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x41800000    # 16.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41200000    # 10.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x40900000    # 4.5f

    .line 160
    .line 161
    const/high16 v26, -0x3f700000    # -4.5f

    .line 162
    .line 163
    const v21, 0x401eb852    # 2.48f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/high16 v23, 0x40900000    # 4.5f

    .line 169
    .line 170
    const v24, -0x3ffeb852    # -2.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x418f5c29    # 17.92f

    .line 177
    .line 178
    .line 179
    const v26, 0x40e0a3d7    # 7.02f

    .line 180
    .line 181
    .line 182
    const/high16 v21, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const v22, 0x41128f5c    # 9.16f

    .line 185
    .line 186
    .line 187
    const v23, 0x41a1ae14    # 20.21f

    .line 188
    .line 189
    .line 190
    const v24, 0x40e75c29    # 7.23f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const/high16 v6, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/high16 v8, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/high16 v9, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v12, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const-string v4, ""

    .line 220
    .line 221
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const v4, 0x417f3333    # 15.95f

    .line 252
    .line 253
    .line 254
    const v6, 0x41a0e148    # 20.11f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, -0x40a8f5c3    # -0.84f

    .line 261
    .line 262
    .line 263
    const v6, -0x4128f5c3    # -0.42f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, -0x407c28f6    # -1.03f

    .line 270
    .line 271
    .line 272
    const v6, 0x3f666666    # 0.9f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x4247ae14    # -0.09f

    .line 279
    .line 280
    .line 281
    const v26, -0x404b851f    # -1.41f

    .line 282
    .line 283
    .line 284
    const v21, 0x3eb851ec    # 0.36f

    .line 285
    .line 286
    .line 287
    const v22, -0x4128f5c3    # -0.42f

    .line 288
    .line 289
    .line 290
    const v23, 0x3ea3d70a    # 0.32f

    .line 291
    .line 292
    .line 293
    const v24, -0x4079999a    # -1.05f

    .line 294
    .line 295
    .line 296
    move-object/from16 v20, v2

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v25, -0x404b851f    # -1.41f

    .line 302
    .line 303
    .line 304
    const v26, 0x3db851ec    # 0.09f

    .line 305
    .line 306
    .line 307
    const v21, -0x4128f5c3    # -0.42f

    .line 308
    .line 309
    .line 310
    const v22, -0x4147ae14    # -0.36f

    .line 311
    .line 312
    .line 313
    const v23, -0x4079999a    # -1.05f

    .line 314
    .line 315
    .line 316
    const v24, -0x415c28f6    # -0.32f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x40000000    # 2.0f

    .line 323
    .line 324
    const/high16 v6, -0x40200000    # -1.75f

    .line 325
    .line 326
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v25, -0x41947ae1    # -0.23f

    .line 330
    .line 331
    .line 332
    const v26, 0x3f59999a    # 0.85f

    .line 333
    .line 334
    .line 335
    const v21, -0x41b33333    # -0.2f

    .line 336
    .line 337
    .line 338
    const v22, 0x3e6b851f    # 0.23f

    .line 339
    .line 340
    .line 341
    const v23, -0x416b851f    # -0.29f

    .line 342
    .line 343
    .line 344
    const v24, 0x3f0ccccd    # 0.55f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x3f07ae14    # 0.53f

    .line 351
    .line 352
    .line 353
    const v26, 0x3f333333    # 0.7f

    .line 354
    .line 355
    .line 356
    const v21, 0x3d75c28f    # 0.06f

    .line 357
    .line 358
    .line 359
    const v22, 0x3e99999a    # 0.3f

    .line 360
    .line 361
    .line 362
    const v23, 0x3e851eb8    # 0.26f

    .line 363
    .line 364
    .line 365
    const v24, 0x3f0f5c29    # 0.56f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x3ed70a3d    # 0.42f

    .line 372
    .line 373
    .line 374
    const v6, 0x3f570a3d    # 0.84f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41500000    # 13.0f

    .line 381
    .line 382
    const v6, 0x41b2b852    # 22.34f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x3db851ec    # 0.09f

    .line 389
    .line 390
    .line 391
    const v26, 0x3fb47ae1    # 1.41f

    .line 392
    .line 393
    .line 394
    const v21, -0x4147ae14    # -0.36f

    .line 395
    .line 396
    .line 397
    const v22, 0x3ed70a3d    # 0.42f

    .line 398
    .line 399
    .line 400
    const v23, -0x415c28f6    # -0.32f

    .line 401
    .line 402
    .line 403
    const v24, 0x3f866666    # 1.05f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, 0x3f28f5c3    # 0.66f

    .line 410
    .line 411
    .line 412
    const/high16 v26, 0x3e800000    # 0.25f

    .line 413
    .line 414
    const v21, 0x3e428f5c    # 0.19f

    .line 415
    .line 416
    .line 417
    const v22, 0x3e2e147b    # 0.17f

    .line 418
    .line 419
    .line 420
    const v23, 0x3ed70a3d    # 0.42f

    .line 421
    .line 422
    .line 423
    const/high16 v24, 0x3e800000    # 0.25f

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v25, 0x3f400000    # 0.75f

    .line 429
    .line 430
    const v26, -0x4151eb85    # -0.34f

    .line 431
    .line 432
    .line 433
    const v21, 0x3e8f5c29    # 0.28f

    .line 434
    .line 435
    .line 436
    const/16 v22, 0x0

    .line 437
    .line 438
    const v23, 0x3f0ccccd    # 0.55f

    .line 439
    .line 440
    .line 441
    const v24, -0x420a3d71    # -0.12f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, -0x40000000    # -2.0f

    .line 448
    .line 449
    const/high16 v6, 0x3fe00000    # 1.75f

    .line 450
    .line 451
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v25, 0x3e6b851f    # 0.23f

    .line 455
    .line 456
    .line 457
    const v26, -0x40a66666    # -0.85f

    .line 458
    .line 459
    .line 460
    const v21, 0x3e4ccccd    # 0.2f

    .line 461
    .line 462
    .line 463
    const v22, -0x41947ae1    # -0.23f

    .line 464
    .line 465
    .line 466
    const v23, 0x3e947ae1    # 0.29f

    .line 467
    .line 468
    .line 469
    const v24, -0x40f33333    # -0.55f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v25, 0x417f3333    # 15.95f

    .line 476
    .line 477
    .line 478
    const v26, 0x41a0e148    # 20.11f

    .line 479
    .line 480
    .line 481
    const v21, 0x41835c29    # 16.42f

    .line 482
    .line 483
    .line 484
    const/high16 v22, 0x41a40000    # 20.5f

    .line 485
    .line 486
    const v23, 0x4181c28f    # 16.22f

    .line 487
    .line 488
    .line 489
    const v24, 0x41a1eb85    # 20.24f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const/high16 v6, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    const-string v4, ""

    .line 506
    .line 507
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 508
    .line 509
    .line 510
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 515
    .line 516
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 517
    .line 518
    .line 519
    move-result-wide v6

    .line 520
    const/4 v0, 0x0

    .line 521
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 529
    .line 530
    .line 531
    move-result v11

    .line 532
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 535
    .line 536
    .line 537
    const v0, 0x411f3333    # 9.95f

    .line 538
    .line 539
    .line 540
    const v2, 0x41a0e148    # 20.11f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x4111999a    # 9.1f

    .line 547
    .line 548
    .line 549
    const v2, 0x419d70a4    # 19.68f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, -0x407c28f6    # -1.03f

    .line 556
    .line 557
    .line 558
    const v2, 0x3f666666    # 0.9f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x4247ae14    # -0.09f

    .line 565
    .line 566
    .line 567
    const v18, -0x404b851f    # -1.41f

    .line 568
    .line 569
    .line 570
    const v13, 0x3eb851ec    # 0.36f

    .line 571
    .line 572
    .line 573
    const v14, -0x4128f5c3    # -0.42f

    .line 574
    .line 575
    .line 576
    const v15, 0x3ea3d70a    # 0.32f

    .line 577
    .line 578
    .line 579
    const v16, -0x4079999a    # -1.05f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, -0x404b851f    # -1.41f

    .line 586
    .line 587
    .line 588
    const v18, 0x3db851ec    # 0.09f

    .line 589
    .line 590
    .line 591
    const v13, -0x4128f5c3    # -0.42f

    .line 592
    .line 593
    .line 594
    const v14, -0x4147ae14    # -0.36f

    .line 595
    .line 596
    .line 597
    const v15, -0x4079999a    # -1.05f

    .line 598
    .line 599
    .line 600
    const v16, -0x415c28f6    # -0.32f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x40000000    # 2.0f

    .line 607
    .line 608
    const/high16 v2, -0x40200000    # -1.75f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x41947ae1    # -0.23f

    .line 614
    .line 615
    .line 616
    const v18, 0x3f59999a    # 0.85f

    .line 617
    .line 618
    .line 619
    const v13, -0x41b33333    # -0.2f

    .line 620
    .line 621
    .line 622
    const v14, 0x3e6b851f    # 0.23f

    .line 623
    .line 624
    .line 625
    const v15, -0x416b851f    # -0.29f

    .line 626
    .line 627
    .line 628
    const v16, 0x3f0ccccd    # 0.55f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x3f07ae14    # 0.53f

    .line 635
    .line 636
    .line 637
    const v18, 0x3f333333    # 0.7f

    .line 638
    .line 639
    .line 640
    const v13, 0x3d75c28f    # 0.06f

    .line 641
    .line 642
    .line 643
    const v14, 0x3e99999a    # 0.3f

    .line 644
    .line 645
    .line 646
    const v15, 0x3e851eb8    # 0.26f

    .line 647
    .line 648
    .line 649
    const v16, 0x3f0f5c29    # 0.56f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x3ed70a3d    # 0.42f

    .line 656
    .line 657
    .line 658
    const v2, 0x3f570a3d    # 0.84f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x40e00000    # 7.0f

    .line 665
    .line 666
    const v2, 0x41b2b852    # 22.34f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x3db851ec    # 0.09f

    .line 673
    .line 674
    .line 675
    const v18, 0x3fb47ae1    # 1.41f

    .line 676
    .line 677
    .line 678
    const v13, -0x4147ae14    # -0.36f

    .line 679
    .line 680
    .line 681
    const v14, 0x3ed70a3d    # 0.42f

    .line 682
    .line 683
    .line 684
    const v15, -0x415c28f6    # -0.32f

    .line 685
    .line 686
    .line 687
    const v16, 0x3f866666    # 1.05f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x40f80000    # 7.75f

    .line 694
    .line 695
    const/high16 v18, 0x41c00000    # 24.0f

    .line 696
    .line 697
    const v13, 0x40e8f5c3    # 7.28f

    .line 698
    .line 699
    .line 700
    const v14, 0x41bf5c29    # 23.92f

    .line 701
    .line 702
    .line 703
    const v15, 0x40f0a3d7    # 7.52f

    .line 704
    .line 705
    .line 706
    const/high16 v16, 0x41c00000    # 24.0f

    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, 0x3f400000    # 0.75f

    .line 712
    .line 713
    const v18, -0x4151eb85    # -0.34f

    .line 714
    .line 715
    .line 716
    const v13, 0x3e8f5c29    # 0.28f

    .line 717
    .line 718
    .line 719
    const/4 v14, 0x0

    .line 720
    const v15, 0x3f0ccccd    # 0.55f

    .line 721
    .line 722
    .line 723
    const v16, -0x420a3d71    # -0.12f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, -0x40000000    # -2.0f

    .line 730
    .line 731
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 732
    .line 733
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v17, 0x3e6b851f    # 0.23f

    .line 737
    .line 738
    .line 739
    const v18, -0x40a66666    # -0.85f

    .line 740
    .line 741
    .line 742
    const v13, 0x3e4ccccd    # 0.2f

    .line 743
    .line 744
    .line 745
    const v14, -0x41947ae1    # -0.23f

    .line 746
    .line 747
    .line 748
    const v15, 0x3e947ae1    # 0.29f

    .line 749
    .line 750
    .line 751
    const v16, -0x40f33333    # -0.55f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, 0x411f3333    # 9.95f

    .line 758
    .line 759
    .line 760
    const v18, 0x41a0e148    # 20.11f

    .line 761
    .line 762
    .line 763
    const v13, 0x4126b852    # 10.42f

    .line 764
    .line 765
    .line 766
    const/high16 v14, 0x41a40000    # 20.5f

    .line 767
    .line 768
    const v15, 0x4123851f    # 10.22f

    .line 769
    .line 770
    .line 771
    const v16, 0x41a1eb85    # 20.24f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    const/16 v16, 0x3800

    .line 785
    .line 786
    const/16 v17, 0x0

    .line 787
    .line 788
    const/high16 v6, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v7, 0x0

    .line 791
    const/high16 v12, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/4 v13, 0x0

    .line 794
    const/4 v14, 0x0

    .line 795
    const/4 v15, 0x0

    .line 796
    const-string v4, ""

    .line 797
    .line 798
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sput-object v0, Landroidx/compose/material/icons/rounded/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 807
    .line 808
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    return-object v0
.end method

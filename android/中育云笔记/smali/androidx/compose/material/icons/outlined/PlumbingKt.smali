.class public final Landroidx/compose/material/icons/outlined/PlumbingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _plumbing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlumbing(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PlumbingKt;->_plumbing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Plumbing"

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
    const v4, 0x419a3d71    # 19.28f

    .line 71
    .line 72
    .line 73
    const v6, 0x409dc28f    # 4.93f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3ff851ec    # -2.12f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, -0x3fcae148    # -2.83f

    .line 86
    .line 87
    .line 88
    const/16 v26, 0x0

    .line 89
    .line 90
    const v21, -0x40b851ec    # -0.78f

    .line 91
    .line 92
    .line 93
    const v22, -0x40b851ec    # -0.78f

    .line 94
    .line 95
    .line 96
    const v23, -0x3ffccccd    # -2.05f

    .line 97
    .line 98
    .line 99
    const v24, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41380000    # 11.5f

    .line 108
    .line 109
    const v6, 0x40b47ae1    # 5.64f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x4007ae14    # 2.12f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v6, -0x3ff851ec    # -2.12f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x40628f5c    # 3.54f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x419a3d71    # 19.28f

    .line 134
    .line 135
    .line 136
    const v26, 0x409dc28f    # 4.93f

    .line 137
    .line 138
    .line 139
    const v21, 0x41a3999a    # 20.45f

    .line 140
    .line 141
    .line 142
    const/high16 v22, 0x41000000    # 8.0f

    .line 143
    .line 144
    const v23, 0x41a3999a    # 20.45f

    .line 145
    .line 146
    .line 147
    const v24, 0x40c33333    # 6.1f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v16, 0x3800

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/high16 v6, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v8, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    const/high16 v9, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/high16 v12, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    const-string v4, ""

    .line 177
    .line 178
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const v4, 0x415c51ec    # 13.77f

    .line 209
    .line 210
    .line 211
    const v6, 0x40afae14    # 5.49f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x4007ae14    # 2.12f

    .line 218
    .line 219
    .line 220
    const/16 v26, 0x0

    .line 221
    .line 222
    const v21, 0x3f170a3d    # 0.59f

    .line 223
    .line 224
    .line 225
    const v22, 0x3f170a3d    # 0.59f

    .line 226
    .line 227
    .line 228
    const v23, 0x3fc51eb8    # 1.54f

    .line 229
    .line 230
    .line 231
    const v24, 0x3f170a3d    # 0.59f

    .line 232
    .line 233
    .line 234
    move-object/from16 v20, v2

    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, -0x3fe1eb85    # -2.47f

    .line 240
    .line 241
    .line 242
    const v6, 0x401e147b    # 2.47f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x40feb852    # 7.96f

    .line 249
    .line 250
    .line 251
    const v6, 0x4112b852    # 9.17f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, -0x3fe1eb85    # -2.47f

    .line 258
    .line 259
    .line 260
    const v6, 0x401e147b    # 2.47f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x40afae14    # 5.49f

    .line 267
    .line 268
    .line 269
    const v26, 0x415c51ec    # 13.77f

    .line 270
    .line 271
    .line 272
    const v21, 0x409ccccd    # 4.9f

    .line 273
    .line 274
    .line 275
    const v22, 0x4143ae14    # 12.23f

    .line 276
    .line 277
    .line 278
    const v23, 0x409ccccd    # 4.9f

    .line 279
    .line 280
    .line 281
    const v24, 0x4152e148    # 13.18f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v4, 0x415c51ec    # 13.77f

    .line 288
    .line 289
    .line 290
    const v6, 0x40afae14    # 5.49f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/4 v7, 0x0

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const v0, 0x40f851ec    # 7.76f

    .line 339
    .line 340
    .line 341
    const v2, 0x4170a3d7    # 15.04f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x3f35c28f    # 0.71f

    .line 348
    .line 349
    .line 350
    const v2, -0x40ca3d71    # -0.71f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x3fb47ae1    # -3.18f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x41051eb8    # 8.32f

    .line 366
    .line 367
    .line 368
    const v18, 0x40bfae14    # 5.99f

    .line 369
    .line 370
    .line 371
    const v13, 0x411d999a    # 9.85f

    .line 372
    .line 373
    .line 374
    const v14, 0x40accccd    # 5.4f

    .line 375
    .line 376
    .line 377
    const v15, 0x410e6666    # 8.9f

    .line 378
    .line 379
    .line 380
    const v16, 0x40accccd    # 5.4f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const v18, 0x4007ae14    # 2.12f

    .line 389
    .line 390
    .line 391
    const v13, -0x40e8f5c3    # -0.59f

    .line 392
    .line 393
    .line 394
    const v14, 0x3f170a3d    # 0.59f

    .line 395
    .line 396
    .line 397
    const v15, -0x40e8f5c3    # -0.59f

    .line 398
    .line 399
    .line 400
    const v16, 0x3fc51eb8    # 1.54f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x404b851f    # 3.18f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x412ca3d7    # 10.79f

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x41400000    # 12.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x3f347ae1    # -6.36f

    .line 421
    .line 422
    .line 423
    const v2, 0x40cb851f    # 6.36f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v18, 0x40351eb8    # 2.83f

    .line 430
    .line 431
    .line 432
    const v13, -0x40b851ec    # -0.78f

    .line 433
    .line 434
    .line 435
    const v14, 0x3f47ae14    # 0.78f

    .line 436
    .line 437
    .line 438
    const v15, -0x40b851ec    # -0.78f

    .line 439
    .line 440
    .line 441
    const v16, 0x40033333    # 2.05f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x40351eb8    # 2.83f

    .line 448
    .line 449
    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    const v13, 0x3f47ae14    # 0.78f

    .line 453
    .line 454
    .line 455
    const v15, 0x40033333    # 2.05f

    .line 456
    .line 457
    .line 458
    const v16, 0x3f47ae14    # 0.78f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x4183999a    # 16.45f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x41400000    # 12.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3fb47ae1    # 1.41f

    .line 473
    .line 474
    .line 475
    const v13, 0x3ec7ae14    # 0.39f

    .line 476
    .line 477
    .line 478
    const v14, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    const v15, 0x3f828f5c    # 1.02f

    .line 482
    .line 483
    .line 484
    const v16, 0x3ec7ae14    # 0.39f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/16 v17, 0x0

    .line 491
    .line 492
    const v18, -0x404b851f    # -1.41f

    .line 493
    .line 494
    .line 495
    const v14, -0x413851ec    # -0.39f

    .line 496
    .line 497
    .line 498
    const v15, 0x3ec7ae14    # 0.39f

    .line 499
    .line 500
    .line 501
    const v16, -0x407d70a4    # -1.02f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x40f851ec    # 7.76f

    .line 508
    .line 509
    .line 510
    const v2, 0x4170a3d7    # 15.04f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/16 v16, 0x3800

    .line 524
    .line 525
    const/16 v17, 0x0

    .line 526
    .line 527
    const/high16 v6, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v7, 0x0

    .line 530
    const/high16 v12, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const/4 v14, 0x0

    .line 534
    const/4 v15, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    sput-object v0, Landroidx/compose/material/icons/outlined/PlumbingKt;->_plumbing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 546
    .line 547
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    return-object v0
.end method

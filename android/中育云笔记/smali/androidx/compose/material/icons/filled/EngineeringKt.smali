.class public final Landroidx/compose/material/icons/filled/EngineeringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _engineering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEngineering(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Engineering"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3fd51eb8    # -2.67f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x3fab851f    # 1.34f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41800000    # 16.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41100000    # 9.0f

    .line 112
    .line 113
    const/high16 v26, 0x41700000    # 15.0f

    .line 114
    .line 115
    const/high16 v21, 0x41880000    # 17.0f

    .line 116
    .line 117
    const v22, 0x4182b852    # 16.34f

    .line 118
    .line 119
    .line 120
    const v23, 0x413ab852    # 11.67f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41700000    # 15.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/16 v16, 0x3800

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/high16 v6, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v8, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/high16 v9, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/high16 v12, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    const/4 v15, 0x0

    .line 151
    const-string v4, ""

    .line 152
    .line 153
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 163
    .line 164
    .line 165
    move-result-wide v6

    .line 166
    const/4 v2, 0x0

    .line 167
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const v4, 0x40dae148    # 6.84f

    .line 184
    .line 185
    .line 186
    const v6, 0x41b0cccd    # 22.1f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, 0x3ca3d70a    # 0.02f

    .line 193
    .line 194
    .line 195
    const v26, -0x4151eb85    # -0.34f

    .line 196
    .line 197
    .line 198
    const v21, 0x3c23d70a    # 0.01f

    .line 199
    .line 200
    .line 201
    const v22, -0x421eb852    # -0.11f

    .line 202
    .line 203
    .line 204
    const v23, 0x3ca3d70a    # 0.02f

    .line 205
    .line 206
    .line 207
    const v24, -0x419eb852    # -0.22f

    .line 208
    .line 209
    .line 210
    move-object/from16 v20, v2

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v25, -0x430a3d71    # -0.03f

    .line 216
    .line 217
    .line 218
    const/16 v21, 0x0

    .line 219
    .line 220
    const v22, -0x420a3d71    # -0.12f

    .line 221
    .line 222
    .line 223
    const v23, -0x43dc28f6    # -0.01f

    .line 224
    .line 225
    .line 226
    const v24, -0x41947ae1    # -0.23f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, -0x40eb851f    # -0.58f

    .line 233
    .line 234
    .line 235
    const v6, 0x3f3d70a4    # 0.74f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x3d23d70a    # 0.04f

    .line 242
    .line 243
    .line 244
    const v26, -0x419eb852    # -0.22f

    .line 245
    .line 246
    .line 247
    const v21, 0x3d8f5c29    # 0.07f

    .line 248
    .line 249
    .line 250
    const v22, -0x42b33333    # -0.05f

    .line 251
    .line 252
    .line 253
    const v23, 0x3da3d70a    # 0.08f

    .line 254
    .line 255
    .line 256
    const v24, -0x41e66666    # -0.15f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x40651eb8    # -1.21f

    .line 263
    .line 264
    .line 265
    const v6, -0x40cccccd    # -0.7f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, -0x41a8f5c3    # -0.21f

    .line 272
    .line 273
    .line 274
    const v26, -0x425c28f6    # -0.08f

    .line 275
    .line 276
    .line 277
    const v21, -0x42dc28f6    # -0.04f

    .line 278
    .line 279
    .line 280
    const v22, -0x425c28f6    # -0.08f

    .line 281
    .line 282
    .line 283
    const v23, -0x41f0a3d7    # -0.14f

    .line 284
    .line 285
    .line 286
    const v24, -0x42333333    # -0.1f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x41a8cccd    # 21.1f

    .line 293
    .line 294
    .line 295
    const v6, 0x408d70a4    # 4.42f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v25, -0x40e8f5c3    # -0.59f

    .line 302
    .line 303
    .line 304
    const v26, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const v21, -0x41c7ae14    # -0.18f

    .line 308
    .line 309
    .line 310
    const v22, -0x41f0a3d7    # -0.14f

    .line 311
    .line 312
    .line 313
    const v23, -0x413d70a4    # -0.38f

    .line 314
    .line 315
    .line 316
    const/high16 v24, -0x41800000    # -0.25f

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, -0x41fae148    # -0.13f

    .line 322
    .line 323
    .line 324
    const v6, -0x4091eb85    # -0.93f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, 0x41a1999a    # 20.2f

    .line 331
    .line 332
    .line 333
    const/high16 v26, 0x40400000    # 3.0f

    .line 334
    .line 335
    const v21, 0x41a2e148    # 20.36f

    .line 336
    .line 337
    .line 338
    const v22, 0x4043d70a    # 3.06f

    .line 339
    .line 340
    .line 341
    const v23, 0x41a251ec    # 20.29f

    .line 342
    .line 343
    .line 344
    const/high16 v24, 0x40400000    # 3.0f

    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, -0x404ccccd    # -1.4f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, -0x41d1eb85    # -0.17f

    .line 356
    .line 357
    .line 358
    const v26, 0x3e19999a    # 0.15f

    .line 359
    .line 360
    .line 361
    const v21, -0x4247ae14    # -0.09f

    .line 362
    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    const v23, -0x41dc28f6    # -0.16f

    .line 367
    .line 368
    .line 369
    const v24, 0x3d75c28f    # 0.06f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41940000    # 18.5f

    .line 376
    .line 377
    const v6, 0x40828f5c    # 4.08f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, -0x40e8f5c3    # -0.59f

    .line 384
    .line 385
    .line 386
    const v26, 0x3eae147b    # 0.34f

    .line 387
    .line 388
    .line 389
    const v21, -0x41a8f5c3    # -0.21f

    .line 390
    .line 391
    .line 392
    const v22, 0x3db851ec    # 0.09f

    .line 393
    .line 394
    .line 395
    const v23, -0x412e147b    # -0.41f

    .line 396
    .line 397
    .line 398
    const v24, 0x3e570a3d    # 0.21f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, -0x414ccccd    # -0.35f

    .line 405
    .line 406
    .line 407
    const v6, -0x40a147ae    # -0.87f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v25, -0x41a8f5c3    # -0.21f

    .line 414
    .line 415
    .line 416
    const v26, 0x3da3d70a    # 0.08f

    .line 417
    .line 418
    .line 419
    const v21, -0x425c28f6    # -0.08f

    .line 420
    .line 421
    .line 422
    const v22, -0x430a3d71    # -0.03f

    .line 423
    .line 424
    .line 425
    const v23, -0x41d1eb85    # -0.17f

    .line 426
    .line 427
    .line 428
    const/16 v24, 0x0

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x3f9ae148    # 1.21f

    .line 434
    .line 435
    .line 436
    const v6, -0x40cccccd    # -0.7f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v25, 0x3d23d70a    # 0.04f

    .line 443
    .line 444
    .line 445
    const v26, 0x3e6147ae    # 0.22f

    .line 446
    .line 447
    .line 448
    const v21, -0x42dc28f6    # -0.04f

    .line 449
    .line 450
    .line 451
    const v22, 0x3da3d70a    # 0.08f

    .line 452
    .line 453
    .line 454
    const v23, -0x430a3d71    # -0.03f

    .line 455
    .line 456
    .line 457
    const v24, 0x3e2e147b    # 0.17f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v4, 0x3f147ae1    # 0.58f

    .line 464
    .line 465
    .line 466
    const v6, 0x3f3d70a4    # 0.74f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v25, -0x430a3d71    # -0.03f

    .line 473
    .line 474
    .line 475
    const v26, 0x3eae147b    # 0.34f

    .line 476
    .line 477
    .line 478
    const v21, -0x435c28f6    # -0.02f

    .line 479
    .line 480
    .line 481
    const v22, 0x3de147ae    # 0.11f

    .line 482
    .line 483
    .line 484
    const v24, 0x3e6b851f    # 0.23f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, 0x3cf5c28f    # 0.03f

    .line 491
    .line 492
    .line 493
    const/16 v21, 0x0

    .line 494
    .line 495
    const v23, 0x3c23d70a    # 0.01f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, -0x40c28f5c    # -0.74f

    .line 502
    .line 503
    .line 504
    const v6, 0x3f147ae1    # 0.58f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v25, -0x42dc28f6    # -0.04f

    .line 511
    .line 512
    .line 513
    const v26, 0x3e6147ae    # 0.22f

    .line 514
    .line 515
    .line 516
    const v21, -0x4270a3d7    # -0.07f

    .line 517
    .line 518
    .line 519
    const v22, 0x3d4ccccd    # 0.05f

    .line 520
    .line 521
    .line 522
    const v23, -0x425c28f6    # -0.08f

    .line 523
    .line 524
    .line 525
    const v24, 0x3e19999a    # 0.15f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x3f333333    # 0.7f

    .line 532
    .line 533
    .line 534
    const v6, 0x3f9ae148    # 1.21f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, 0x3e570a3d    # 0.21f

    .line 541
    .line 542
    .line 543
    const v26, 0x3da3d70a    # 0.08f

    .line 544
    .line 545
    .line 546
    const v21, 0x3d23d70a    # 0.04f

    .line 547
    .line 548
    .line 549
    const v22, 0x3da3d70a    # 0.08f

    .line 550
    .line 551
    .line 552
    const v23, 0x3e0f5c29    # 0.14f

    .line 553
    .line 554
    .line 555
    const v24, 0x3dcccccd    # 0.1f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v4, -0x414ccccd    # -0.35f

    .line 562
    .line 563
    .line 564
    const v6, 0x3f5eb852    # 0.87f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v25, 0x3f170a3d    # 0.59f

    .line 571
    .line 572
    .line 573
    const v26, 0x3eae147b    # 0.34f

    .line 574
    .line 575
    .line 576
    const v21, 0x3e3851ec    # 0.18f

    .line 577
    .line 578
    .line 579
    const v22, 0x3e0f5c29    # 0.14f

    .line 580
    .line 581
    .line 582
    const v23, 0x3ec28f5c    # 0.38f

    .line 583
    .line 584
    .line 585
    const/high16 v24, 0x3e800000    # 0.25f

    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v4, 0x3f6e147b    # 0.93f

    .line 591
    .line 592
    .line 593
    const v6, 0x3e051eb8    # 0.13f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v25, 0x41966666    # 18.8f

    .line 600
    .line 601
    .line 602
    const/high16 v26, 0x41200000    # 10.0f

    .line 603
    .line 604
    const v21, 0x41951eb8    # 18.64f

    .line 605
    .line 606
    .line 607
    const v22, 0x411f0a3d    # 9.94f

    .line 608
    .line 609
    .line 610
    const v23, 0x4195ae14    # 18.71f

    .line 611
    .line 612
    .line 613
    const/high16 v24, 0x41200000    # 10.0f

    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v4, 0x3fb33333    # 1.4f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v25, 0x3e2e147b    # 0.17f

    .line 625
    .line 626
    .line 627
    const v26, -0x41e66666    # -0.15f

    .line 628
    .line 629
    .line 630
    const v21, 0x3db851ec    # 0.09f

    .line 631
    .line 632
    .line 633
    const/16 v22, 0x0

    .line 634
    .line 635
    const v23, 0x3e23d70a    # 0.16f

    .line 636
    .line 637
    .line 638
    const v24, -0x428a3d71    # -0.06f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v4, 0x3e051eb8    # 0.13f

    .line 645
    .line 646
    .line 647
    const v6, -0x4091eb85    # -0.93f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v25, 0x3f170a3d    # 0.59f

    .line 654
    .line 655
    .line 656
    const v26, -0x4151eb85    # -0.34f

    .line 657
    .line 658
    .line 659
    const v21, 0x3e570a3d    # 0.21f

    .line 660
    .line 661
    .line 662
    const v22, -0x4247ae14    # -0.09f

    .line 663
    .line 664
    .line 665
    const v23, 0x3ed1eb85    # 0.41f

    .line 666
    .line 667
    .line 668
    const v24, -0x41a8f5c3    # -0.21f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v4, 0x3eb33333    # 0.35f

    .line 675
    .line 676
    .line 677
    const v6, 0x3f5eb852    # 0.87f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v25, 0x3e570a3d    # 0.21f

    .line 684
    .line 685
    .line 686
    const v26, -0x425c28f6    # -0.08f

    .line 687
    .line 688
    .line 689
    const v21, 0x3da3d70a    # 0.08f

    .line 690
    .line 691
    .line 692
    const v22, 0x3cf5c28f    # 0.03f

    .line 693
    .line 694
    .line 695
    const v23, 0x3e2e147b    # 0.17f

    .line 696
    .line 697
    .line 698
    const/16 v24, 0x0

    .line 699
    .line 700
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v4, 0x3f333333    # 0.7f

    .line 704
    .line 705
    .line 706
    const v6, -0x40651eb8    # -1.21f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v25, -0x42dc28f6    # -0.04f

    .line 713
    .line 714
    .line 715
    const v26, -0x419eb852    # -0.22f

    .line 716
    .line 717
    .line 718
    const v21, 0x3d23d70a    # 0.04f

    .line 719
    .line 720
    .line 721
    const v22, -0x425c28f6    # -0.08f

    .line 722
    .line 723
    .line 724
    const v23, 0x3cf5c28f    # 0.03f

    .line 725
    .line 726
    .line 727
    const v24, -0x41d1eb85    # -0.17f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v4, 0x40dae148    # 6.84f

    .line 734
    .line 735
    .line 736
    const v6, 0x41b0cccd    # 22.1f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v4, 0x419c0000    # 19.5f

    .line 746
    .line 747
    const/high16 v6, 0x40f80000    # 7.75f

    .line 748
    .line 749
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v25, -0x40600000    # -1.25f

    .line 753
    .line 754
    const/high16 v26, -0x40600000    # -1.25f

    .line 755
    .line 756
    const v21, -0x40cf5c29    # -0.69f

    .line 757
    .line 758
    .line 759
    const/16 v22, 0x0

    .line 760
    .line 761
    const/high16 v23, -0x40600000    # -1.25f

    .line 762
    .line 763
    const v24, -0x40f0a3d7    # -0.56f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v4, -0x40600000    # -1.25f

    .line 770
    .line 771
    const/high16 v6, -0x40600000    # -1.25f

    .line 772
    .line 773
    const v7, 0x3f0f5c29    # 0.56f

    .line 774
    .line 775
    .line 776
    const/high16 v8, 0x3fa00000    # 1.25f

    .line 777
    .line 778
    invoke-virtual {v2, v7, v4, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v4, 0x3f0f5c29    # 0.56f

    .line 782
    .line 783
    .line 784
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 785
    .line 786
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v4, 0x41a1851f    # 20.19f

    .line 790
    .line 791
    .line 792
    const/high16 v6, 0x419c0000    # 19.5f

    .line 793
    .line 794
    const/high16 v7, 0x40f80000    # 7.75f

    .line 795
    .line 796
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    const/high16 v6, 0x3f800000    # 1.0f

    .line 807
    .line 808
    const/high16 v8, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v7, 0x0

    .line 811
    const-string v4, ""

    .line 812
    .line 813
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 814
    .line 815
    .line 816
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 821
    .line 822
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 823
    .line 824
    .line 825
    move-result-wide v6

    .line 826
    const/4 v2, 0x0

    .line 827
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 831
    .line 832
    .line 833
    move-result v10

    .line 834
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 841
    .line 842
    .line 843
    const v4, 0x419f5c29    # 19.92f

    .line 844
    .line 845
    .line 846
    const v6, 0x413ae148    # 11.68f

    .line 847
    .line 848
    .line 849
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v4, -0x41000000    # -0.5f

    .line 853
    .line 854
    const v6, -0x40a147ae    # -0.87f

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v25, -0x41e66666    # -0.15f

    .line 861
    .line 862
    .line 863
    const v26, -0x428a3d71    # -0.06f

    .line 864
    .line 865
    .line 866
    const v21, -0x430a3d71    # -0.03f

    .line 867
    .line 868
    .line 869
    const v22, -0x428a3d71    # -0.06f

    .line 870
    .line 871
    .line 872
    const v23, -0x42333333    # -0.1f

    .line 873
    .line 874
    .line 875
    const v24, -0x425c28f6    # -0.08f

    .line 876
    .line 877
    .line 878
    move-object/from16 v20, v2

    .line 879
    .line 880
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v4, -0x40e147ae    # -0.62f

    .line 884
    .line 885
    .line 886
    const/high16 v6, 0x3e800000    # 0.25f

    .line 887
    .line 888
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v25, -0x4128f5c3    # -0.42f

    .line 892
    .line 893
    .line 894
    const v26, -0x418a3d71    # -0.24f

    .line 895
    .line 896
    .line 897
    const v21, -0x41fae148    # -0.13f

    .line 898
    .line 899
    .line 900
    const v22, -0x42333333    # -0.1f

    .line 901
    .line 902
    .line 903
    const v23, -0x4175c28f    # -0.27f

    .line 904
    .line 905
    .line 906
    const v24, -0x41c7ae14    # -0.18f

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v4, -0x4247ae14    # -0.09f

    .line 913
    .line 914
    .line 915
    const v6, -0x40d70a3d    # -0.66f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v25, 0x41900000    # 18.0f

    .line 922
    .line 923
    const/high16 v26, 0x41200000    # 10.0f

    .line 924
    .line 925
    const v21, 0x4190f5c3    # 18.12f

    .line 926
    .line 927
    .line 928
    const v22, 0x4120a3d7    # 10.04f

    .line 929
    .line 930
    .line 931
    const v23, 0x41907ae1    # 18.06f

    .line 932
    .line 933
    .line 934
    const/high16 v24, 0x41200000    # 10.0f

    .line 935
    .line 936
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const/high16 v4, -0x40800000    # -1.0f

    .line 940
    .line 941
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v25, -0x420a3d71    # -0.12f

    .line 945
    .line 946
    .line 947
    const v26, 0x3de147ae    # 0.11f

    .line 948
    .line 949
    .line 950
    const v21, -0x428a3d71    # -0.06f

    .line 951
    .line 952
    .line 953
    const/16 v22, 0x0

    .line 954
    .line 955
    const v23, -0x421eb852    # -0.11f

    .line 956
    .line 957
    .line 958
    const v24, 0x3d23d70a    # 0.04f

    .line 959
    .line 960
    .line 961
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v4, -0x4247ae14    # -0.09f

    .line 965
    .line 966
    .line 967
    const v6, 0x3f28f5c3    # 0.66f

    .line 968
    .line 969
    .line 970
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v25, -0x4128f5c3    # -0.42f

    .line 974
    .line 975
    .line 976
    const v26, 0x3e75c28f    # 0.24f

    .line 977
    .line 978
    .line 979
    const v21, -0x41e66666    # -0.15f

    .line 980
    .line 981
    .line 982
    const v22, 0x3d75c28f    # 0.06f

    .line 983
    .line 984
    .line 985
    const v23, -0x416b851f    # -0.29f

    .line 986
    .line 987
    .line 988
    const v24, 0x3e19999a    # 0.15f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v4, -0x40e147ae    # -0.62f

    .line 995
    .line 996
    .line 997
    const/high16 v6, -0x41800000    # -0.25f

    .line 998
    .line 999
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v25, -0x41e66666    # -0.15f

    .line 1003
    .line 1004
    .line 1005
    const v26, 0x3d75c28f    # 0.06f

    .line 1006
    .line 1007
    .line 1008
    const v21, -0x428a3d71    # -0.06f

    .line 1009
    .line 1010
    .line 1011
    const v22, -0x435c28f6    # -0.02f

    .line 1012
    .line 1013
    .line 1014
    const v23, -0x420a3d71    # -0.12f

    .line 1015
    .line 1016
    .line 1017
    const/16 v24, 0x0

    .line 1018
    .line 1019
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const/high16 v4, -0x41000000    # -0.5f

    .line 1023
    .line 1024
    const v6, 0x3f5eb852    # 0.87f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v25, 0x3cf5c28f    # 0.03f

    .line 1031
    .line 1032
    .line 1033
    const v26, 0x3e23d70a    # 0.16f

    .line 1034
    .line 1035
    .line 1036
    const v21, -0x430a3d71    # -0.03f

    .line 1037
    .line 1038
    .line 1039
    const v22, 0x3d75c28f    # 0.06f

    .line 1040
    .line 1041
    .line 1042
    const v23, -0x435c28f6    # -0.02f

    .line 1043
    .line 1044
    .line 1045
    const v24, 0x3df5c28f    # 0.12f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v4, 0x3f07ae14    # 0.53f

    .line 1052
    .line 1053
    .line 1054
    const v6, 0x3ed1eb85    # 0.41f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v25, -0x435c28f6    # -0.02f

    .line 1061
    .line 1062
    .line 1063
    const v26, 0x3e75c28f    # 0.24f

    .line 1064
    .line 1065
    .line 1066
    const v21, -0x43dc28f6    # -0.01f

    .line 1067
    .line 1068
    .line 1069
    const v22, 0x3da3d70a    # 0.08f

    .line 1070
    .line 1071
    .line 1072
    const v24, 0x3e23d70a    # 0.16f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v25, 0x3ca3d70a    # 0.02f

    .line 1079
    .line 1080
    .line 1081
    const/16 v21, 0x0

    .line 1082
    .line 1083
    const v23, 0x3c23d70a    # 0.01f

    .line 1084
    .line 1085
    .line 1086
    const v24, 0x3e2e147b    # 0.17f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v4, -0x40f851ec    # -0.53f

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v25, -0x430a3d71    # -0.03f

    .line 1099
    .line 1100
    .line 1101
    const v26, 0x3e23d70a    # 0.16f

    .line 1102
    .line 1103
    .line 1104
    const v21, -0x42b33333    # -0.05f

    .line 1105
    .line 1106
    .line 1107
    const v22, 0x3d23d70a    # 0.04f

    .line 1108
    .line 1109
    .line 1110
    const v23, -0x428a3d71    # -0.06f

    .line 1111
    .line 1112
    .line 1113
    const v24, 0x3de147ae    # 0.11f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1120
    .line 1121
    const v6, 0x3f5eb852    # 0.87f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const v25, 0x3e19999a    # 0.15f

    .line 1128
    .line 1129
    .line 1130
    const v26, 0x3d75c28f    # 0.06f

    .line 1131
    .line 1132
    .line 1133
    const v21, 0x3cf5c28f    # 0.03f

    .line 1134
    .line 1135
    .line 1136
    const v22, 0x3d75c28f    # 0.06f

    .line 1137
    .line 1138
    .line 1139
    const v23, 0x3dcccccd    # 0.1f

    .line 1140
    .line 1141
    .line 1142
    const v24, 0x3da3d70a    # 0.08f

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    const v4, 0x3f1eb852    # 0.62f

    .line 1149
    .line 1150
    .line 1151
    const/high16 v6, -0x41800000    # -0.25f

    .line 1152
    .line 1153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    const v25, 0x3ed70a3d    # 0.42f

    .line 1157
    .line 1158
    .line 1159
    const v26, 0x3e75c28f    # 0.24f

    .line 1160
    .line 1161
    .line 1162
    const v21, 0x3e051eb8    # 0.13f

    .line 1163
    .line 1164
    .line 1165
    const v22, 0x3dcccccd    # 0.1f

    .line 1166
    .line 1167
    .line 1168
    const v23, 0x3e8a3d71    # 0.27f

    .line 1169
    .line 1170
    .line 1171
    const v24, 0x3e3851ec    # 0.18f

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    const v4, 0x3db851ec    # 0.09f

    .line 1178
    .line 1179
    .line 1180
    const v6, 0x3f28f5c3    # 0.66f

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const/high16 v25, 0x41880000    # 17.0f

    .line 1187
    .line 1188
    const/high16 v26, 0x41700000    # 15.0f

    .line 1189
    .line 1190
    const v21, 0x41871eb8    # 16.89f

    .line 1191
    .line 1192
    .line 1193
    const v22, 0x416f5c29    # 14.96f

    .line 1194
    .line 1195
    .line 1196
    const v23, 0x4187851f    # 16.94f

    .line 1197
    .line 1198
    .line 1199
    const/high16 v24, 0x41700000    # 15.0f

    .line 1200
    .line 1201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1205
    .line 1206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1207
    .line 1208
    .line 1209
    const v25, 0x3df5c28f    # 0.12f

    .line 1210
    .line 1211
    .line 1212
    const v26, -0x421eb852    # -0.11f

    .line 1213
    .line 1214
    .line 1215
    const v21, 0x3d75c28f    # 0.06f

    .line 1216
    .line 1217
    .line 1218
    const/16 v22, 0x0

    .line 1219
    .line 1220
    const v23, 0x3df5c28f    # 0.12f

    .line 1221
    .line 1222
    .line 1223
    const v24, -0x42dc28f6    # -0.04f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v4, 0x3db851ec    # 0.09f

    .line 1230
    .line 1231
    .line 1232
    const v6, -0x40d70a3d    # -0.66f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    const v25, 0x3ed70a3d    # 0.42f

    .line 1239
    .line 1240
    .line 1241
    const v26, -0x418a3d71    # -0.24f

    .line 1242
    .line 1243
    .line 1244
    const v21, 0x3e19999a    # 0.15f

    .line 1245
    .line 1246
    .line 1247
    const v22, -0x428a3d71    # -0.06f

    .line 1248
    .line 1249
    .line 1250
    const v23, 0x3e947ae1    # 0.29f

    .line 1251
    .line 1252
    .line 1253
    const v24, -0x41e66666    # -0.15f

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1257
    .line 1258
    .line 1259
    const v4, 0x3f1eb852    # 0.62f

    .line 1260
    .line 1261
    .line 1262
    const/high16 v6, 0x3e800000    # 0.25f

    .line 1263
    .line 1264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const v25, 0x3e19999a    # 0.15f

    .line 1268
    .line 1269
    .line 1270
    const v26, -0x428a3d71    # -0.06f

    .line 1271
    .line 1272
    .line 1273
    const v21, 0x3d75c28f    # 0.06f

    .line 1274
    .line 1275
    .line 1276
    const v22, 0x3ca3d70a    # 0.02f

    .line 1277
    .line 1278
    .line 1279
    const v23, 0x3df5c28f    # 0.12f

    .line 1280
    .line 1281
    .line 1282
    const/16 v24, 0x0

    .line 1283
    .line 1284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1288
    .line 1289
    const v6, -0x40a147ae    # -0.87f

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1293
    .line 1294
    .line 1295
    const v25, -0x430a3d71    # -0.03f

    .line 1296
    .line 1297
    .line 1298
    const v26, -0x41dc28f6    # -0.16f

    .line 1299
    .line 1300
    .line 1301
    const v21, 0x3cf5c28f    # 0.03f

    .line 1302
    .line 1303
    .line 1304
    const v22, -0x428a3d71    # -0.06f

    .line 1305
    .line 1306
    .line 1307
    const v23, 0x3ca3d70a    # 0.02f

    .line 1308
    .line 1309
    .line 1310
    const v24, -0x420a3d71    # -0.12f

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const v4, -0x40fae148    # -0.52f

    .line 1317
    .line 1318
    .line 1319
    const v6, -0x412e147b    # -0.41f

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1323
    .line 1324
    .line 1325
    const v25, 0x3ca3d70a    # 0.02f

    .line 1326
    .line 1327
    .line 1328
    const v26, -0x418a3d71    # -0.24f

    .line 1329
    .line 1330
    .line 1331
    const v21, 0x3c23d70a    # 0.01f

    .line 1332
    .line 1333
    .line 1334
    const v22, -0x425c28f6    # -0.08f

    .line 1335
    .line 1336
    .line 1337
    const v24, -0x41dc28f6    # -0.16f

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    const v25, -0x435c28f6    # -0.02f

    .line 1344
    .line 1345
    .line 1346
    const/16 v21, 0x0

    .line 1347
    .line 1348
    const v23, -0x43dc28f6    # -0.01f

    .line 1349
    .line 1350
    .line 1351
    const v24, -0x41d1eb85    # -0.17f

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1355
    .line 1356
    .line 1357
    const v4, 0x3f07ae14    # 0.53f

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1361
    .line 1362
    .line 1363
    const v25, 0x419f5c29    # 19.92f

    .line 1364
    .line 1365
    .line 1366
    const v26, 0x413ae148    # 11.68f

    .line 1367
    .line 1368
    .line 1369
    const v21, 0x419f70a4    # 19.93f

    .line 1370
    .line 1371
    .line 1372
    const v22, 0x413cf5c3    # 11.81f

    .line 1373
    .line 1374
    .line 1375
    const v23, 0x419f851f    # 19.94f

    .line 1376
    .line 1377
    .line 1378
    const v24, 0x413bd70a    # 11.74f

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1385
    .line 1386
    .line 1387
    const/high16 v4, 0x418c0000    # 17.5f

    .line 1388
    .line 1389
    const v6, 0x415547ae    # 13.33f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v25, -0x40ab851f    # -0.83f

    .line 1396
    .line 1397
    .line 1398
    const v26, -0x40ab851f    # -0.83f

    .line 1399
    .line 1400
    .line 1401
    const v21, -0x41147ae1    # -0.46f

    .line 1402
    .line 1403
    .line 1404
    const/16 v22, 0x0

    .line 1405
    .line 1406
    const v23, -0x40ab851f    # -0.83f

    .line 1407
    .line 1408
    .line 1409
    const v24, -0x413d70a4    # -0.38f

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const v25, 0x3f547ae1    # 0.83f

    .line 1416
    .line 1417
    .line 1418
    const/16 v21, 0x0

    .line 1419
    .line 1420
    const v22, -0x41147ae1    # -0.46f

    .line 1421
    .line 1422
    .line 1423
    const v23, 0x3ec28f5c    # 0.38f

    .line 1424
    .line 1425
    .line 1426
    const v24, -0x40ab851f    # -0.83f

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1430
    .line 1431
    .line 1432
    const v4, 0x3ec28f5c    # 0.38f

    .line 1433
    .line 1434
    .line 1435
    const v6, 0x3f547ae1    # 0.83f

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1439
    .line 1440
    .line 1441
    const/high16 v25, 0x418c0000    # 17.5f

    .line 1442
    .line 1443
    const v26, 0x415547ae    # 13.33f

    .line 1444
    .line 1445
    .line 1446
    const v21, 0x4192a3d7    # 18.33f

    .line 1447
    .line 1448
    .line 1449
    const v22, 0x414f5c29    # 12.96f

    .line 1450
    .line 1451
    .line 1452
    const v23, 0x418fae14    # 17.96f

    .line 1453
    .line 1454
    .line 1455
    const v24, 0x415547ae    # 13.33f

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1469
    .line 1470
    const/4 v7, 0x0

    .line 1471
    const-string v4, ""

    .line 1472
    .line 1473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1474
    .line 1475
    .line 1476
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1477
    .line 1478
    .line 1479
    move-result v3

    .line 1480
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1481
    .line 1482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1483
    .line 1484
    .line 1485
    move-result-wide v6

    .line 1486
    const/4 v2, 0x0

    .line 1487
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1491
    .line 1492
    .line 1493
    move-result v10

    .line 1494
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1495
    .line 1496
    .line 1497
    move-result v11

    .line 1498
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1499
    .line 1500
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1501
    .line 1502
    .line 1503
    const v4, 0x4097ae14    # 4.74f

    .line 1504
    .line 1505
    .line 1506
    const/high16 v6, 0x41100000    # 9.0f

    .line 1507
    .line 1508
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1509
    .line 1510
    .line 1511
    const v4, 0x41087ae1    # 8.53f

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1515
    .line 1516
    .line 1517
    const v25, 0x3efae148    # 0.49f

    .line 1518
    .line 1519
    .line 1520
    const v26, -0x41051eb8    # -0.49f

    .line 1521
    .line 1522
    .line 1523
    const v21, 0x3e8a3d71    # 0.27f

    .line 1524
    .line 1525
    .line 1526
    const/16 v22, 0x0

    .line 1527
    .line 1528
    const v23, 0x3efae148    # 0.49f

    .line 1529
    .line 1530
    .line 1531
    const v24, -0x419eb852    # -0.22f

    .line 1532
    .line 1533
    .line 1534
    move-object/from16 v20, v2

    .line 1535
    .line 1536
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1537
    .line 1538
    .line 1539
    const v4, 0x4107d70a    # 8.49f

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1543
    .line 1544
    .line 1545
    const v25, -0x41051eb8    # -0.49f

    .line 1546
    .line 1547
    .line 1548
    const/16 v21, 0x0

    .line 1549
    .line 1550
    const v22, -0x4175c28f    # -0.27f

    .line 1551
    .line 1552
    .line 1553
    const v23, -0x419eb852    # -0.22f

    .line 1554
    .line 1555
    .line 1556
    const v24, -0x41051eb8    # -0.49f

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1560
    .line 1561
    .line 1562
    const/high16 v4, 0x41500000    # 13.0f

    .line 1563
    .line 1564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1565
    .line 1566
    .line 1567
    const/high16 v25, -0x40000000    # -2.0f

    .line 1568
    .line 1569
    const v26, -0x3fa33333    # -3.45f

    .line 1570
    .line 1571
    .line 1572
    const v22, -0x40428f5c    # -1.48f

    .line 1573
    .line 1574
    .line 1575
    const v23, -0x40b0a3d7    # -0.81f

    .line 1576
    .line 1577
    .line 1578
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 1579
    .line 1580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1581
    .line 1582
    .line 1583
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1584
    .line 1585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1586
    .line 1587
    .line 1588
    const/high16 v25, 0x41280000    # 10.5f

    .line 1589
    .line 1590
    const/high16 v26, 0x40c00000    # 6.0f

    .line 1591
    .line 1592
    const/high16 v21, 0x41300000    # 11.0f

    .line 1593
    .line 1594
    const v22, 0x40b8f5c3    # 5.78f

    .line 1595
    .line 1596
    .line 1597
    const v23, 0x412c7ae1    # 10.78f

    .line 1598
    .line 1599
    .line 1600
    const/high16 v24, 0x40c00000    # 6.0f

    .line 1601
    .line 1602
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1603
    .line 1604
    .line 1605
    const v4, 0x40b8f5c3    # 5.78f

    .line 1606
    .line 1607
    .line 1608
    const/high16 v6, 0x41200000    # 10.0f

    .line 1609
    .line 1610
    const/high16 v7, 0x40b00000    # 5.5f

    .line 1611
    .line 1612
    const/high16 v8, 0x41200000    # 10.0f

    .line 1613
    .line 1614
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1615
    .line 1616
    .line 1617
    const v4, 0x40847ae1    # 4.14f

    .line 1618
    .line 1619
    .line 1620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1621
    .line 1622
    .line 1623
    const/high16 v25, 0x41100000    # 9.0f

    .line 1624
    .line 1625
    const/high16 v26, 0x40800000    # 4.0f

    .line 1626
    .line 1627
    const v21, 0x411ae148    # 9.68f

    .line 1628
    .line 1629
    .line 1630
    const v22, 0x4081eb85    # 4.06f

    .line 1631
    .line 1632
    .line 1633
    const v23, 0x4115999a    # 9.35f

    .line 1634
    .line 1635
    .line 1636
    const/high16 v24, 0x40800000    # 4.0f

    .line 1637
    .line 1638
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1639
    .line 1640
    .line 1641
    const/high16 v4, 0x41000000    # 8.0f

    .line 1642
    .line 1643
    const v6, 0x40847ae1    # 4.14f

    .line 1644
    .line 1645
    .line 1646
    const v7, 0x41051eb8    # 8.32f

    .line 1647
    .line 1648
    .line 1649
    const v8, 0x4081eb85    # 4.06f

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1653
    .line 1654
    .line 1655
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1656
    .line 1657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1658
    .line 1659
    .line 1660
    const/high16 v25, 0x40f00000    # 7.5f

    .line 1661
    .line 1662
    const/high16 v26, 0x40c00000    # 6.0f

    .line 1663
    .line 1664
    const/high16 v21, 0x41000000    # 8.0f

    .line 1665
    .line 1666
    const v22, 0x40b8f5c3    # 5.78f

    .line 1667
    .line 1668
    .line 1669
    const v23, 0x40f8f5c3    # 7.78f

    .line 1670
    .line 1671
    .line 1672
    const/high16 v24, 0x40c00000    # 6.0f

    .line 1673
    .line 1674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1675
    .line 1676
    .line 1677
    const v4, 0x40b8f5c3    # 5.78f

    .line 1678
    .line 1679
    .line 1680
    const/high16 v6, 0x40e00000    # 7.0f

    .line 1681
    .line 1682
    const/high16 v7, 0x40b00000    # 5.5f

    .line 1683
    .line 1684
    const/high16 v8, 0x40e00000    # 7.0f

    .line 1685
    .line 1686
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1687
    .line 1688
    .line 1689
    const v4, 0x4091999a    # 4.55f

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1693
    .line 1694
    .line 1695
    const/high16 v25, 0x40a00000    # 5.0f

    .line 1696
    .line 1697
    const/high16 v26, 0x41000000    # 8.0f

    .line 1698
    .line 1699
    const v21, 0x40b9eb85    # 5.81f

    .line 1700
    .line 1701
    .line 1702
    const/high16 v22, 0x40a80000    # 5.25f

    .line 1703
    .line 1704
    const/high16 v23, 0x40a00000    # 5.0f

    .line 1705
    .line 1706
    const v24, 0x40d0a3d7    # 6.52f

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1710
    .line 1711
    .line 1712
    const v4, 0x4097ae14    # 4.74f

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1716
    .line 1717
    .line 1718
    const/high16 v25, 0x40880000    # 4.25f

    .line 1719
    .line 1720
    const v26, 0x4107d70a    # 8.49f

    .line 1721
    .line 1722
    .line 1723
    const v21, 0x408f0a3d    # 4.47f

    .line 1724
    .line 1725
    .line 1726
    const/high16 v22, 0x41000000    # 8.0f

    .line 1727
    .line 1728
    const/high16 v23, 0x40880000    # 4.25f

    .line 1729
    .line 1730
    const v24, 0x4103851f    # 8.22f

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1734
    .line 1735
    .line 1736
    const v4, 0x3cf5c28f    # 0.03f

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1740
    .line 1741
    .line 1742
    const v25, 0x4097ae14    # 4.74f

    .line 1743
    .line 1744
    .line 1745
    const/high16 v26, 0x41100000    # 9.0f

    .line 1746
    .line 1747
    const/high16 v21, 0x40880000    # 4.25f

    .line 1748
    .line 1749
    const v22, 0x410c7ae1    # 8.78f

    .line 1750
    .line 1751
    .line 1752
    const v23, 0x408f0a3d    # 4.47f

    .line 1753
    .line 1754
    .line 1755
    const/high16 v24, 0x41100000    # 9.0f

    .line 1756
    .line 1757
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v2

    .line 1767
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1768
    .line 1769
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1770
    .line 1771
    const/4 v7, 0x0

    .line 1772
    const-string v4, ""

    .line 1773
    .line 1774
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1775
    .line 1776
    .line 1777
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1778
    .line 1779
    .line 1780
    move-result v3

    .line 1781
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1782
    .line 1783
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1784
    .line 1785
    .line 1786
    move-result-wide v6

    .line 1787
    const/4 v0, 0x0

    .line 1788
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1789
    .line 1790
    .line 1791
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1792
    .line 1793
    .line 1794
    move-result v10

    .line 1795
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1796
    .line 1797
    .line 1798
    move-result v11

    .line 1799
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1800
    .line 1801
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1802
    .line 1803
    .line 1804
    const/high16 v0, 0x41500000    # 13.0f

    .line 1805
    .line 1806
    const/high16 v2, 0x41100000    # 9.0f

    .line 1807
    .line 1808
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1809
    .line 1810
    .line 1811
    const v17, 0x40770a3d    # 3.86f

    .line 1812
    .line 1813
    .line 1814
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 1815
    .line 1816
    const v13, 0x3fee147b    # 1.86f

    .line 1817
    .line 1818
    .line 1819
    const v15, 0x405a3d71    # 3.41f

    .line 1820
    .line 1821
    .line 1822
    const v16, -0x405c28f6    # -1.28f

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1826
    .line 1827
    .line 1828
    const v0, 0x40a47ae1    # 5.14f

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1832
    .line 1833
    .line 1834
    const/high16 v17, 0x41100000    # 9.0f

    .line 1835
    .line 1836
    const/high16 v18, 0x41500000    # 13.0f

    .line 1837
    .line 1838
    const v13, 0x40b2e148    # 5.59f

    .line 1839
    .line 1840
    .line 1841
    const v14, 0x413b851f    # 11.72f

    .line 1842
    .line 1843
    .line 1844
    const v15, 0x40e47ae1    # 7.14f

    .line 1845
    .line 1846
    .line 1847
    const/high16 v16, 0x41500000    # 13.0f

    .line 1848
    .line 1849
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    const/16 v16, 0x3800

    .line 1860
    .line 1861
    const/16 v17, 0x0

    .line 1862
    .line 1863
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1864
    .line 1865
    const/4 v7, 0x0

    .line 1866
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1867
    .line 1868
    const/4 v13, 0x0

    .line 1869
    const/4 v14, 0x0

    .line 1870
    const/4 v15, 0x0

    .line 1871
    const-string v4, ""

    .line 1872
    .line 1873
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v0

    .line 1877
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v0

    .line 1881
    sput-object v0, Landroidx/compose/material/icons/filled/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1882
    .line 1883
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1884
    .line 1885
    .line 1886
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/BedroomBabyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedroomBaby(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BedroomBabyKt;->_bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BedroomBaby"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40800000    # 4.0f

    .line 85
    .line 86
    const v21, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/high16 v23, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v24, 0x4039999a    # 2.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41800000    # 16.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v26, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v26, -0x40000000    # -2.0f

    .line 125
    .line 126
    const v21, 0x3f8ccccd    # 1.1f

    .line 127
    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const/high16 v23, 0x40000000    # 2.0f

    .line 132
    .line 133
    const v24, -0x4099999a    # -0.9f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, 0x41a00000    # 20.0f

    .line 145
    .line 146
    const/high16 v26, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/high16 v21, 0x41b00000    # 22.0f

    .line 149
    .line 150
    const v22, 0x4039999a    # 2.9f

    .line 151
    .line 152
    .line 153
    const v23, 0x41a8cccd    # 21.1f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x40000000    # 2.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x41400000    # 12.0f

    .line 165
    .line 166
    const v6, 0x418feb85    # 17.99f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x3f333333    # -6.4f

    .line 173
    .line 174
    .line 175
    const v26, -0x3fe9999a    # -2.35f

    .line 176
    .line 177
    .line 178
    const v21, -0x3fe851ec    # -2.37f

    .line 179
    .line 180
    .line 181
    const/16 v22, 0x0

    .line 182
    .line 183
    const v23, -0x3f6c7ae1    # -4.61f

    .line 184
    .line 185
    .line 186
    const v24, -0x40ab851f    # -0.83f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, -0x42dc28f6    # -0.04f

    .line 193
    .line 194
    .line 195
    const v26, -0x4071eb85    # -1.11f

    .line 196
    .line 197
    .line 198
    const v21, -0x41570a3d    # -0.33f

    .line 199
    .line 200
    .line 201
    const v22, -0x4170a3d7    # -0.28f

    .line 202
    .line 203
    .line 204
    const v23, -0x414ccccd    # -0.35f

    .line 205
    .line 206
    .line 207
    const v24, -0x40b33333    # -0.8f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3f8147ae    # 1.01f

    .line 218
    .line 219
    .line 220
    const v26, -0x42dc28f6    # -0.04f

    .line 221
    .line 222
    .line 223
    const v21, 0x3e8a3d71    # 0.27f

    .line 224
    .line 225
    .line 226
    const v22, -0x4175c28f    # -0.27f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f35c28f    # 0.71f

    .line 230
    .line 231
    .line 232
    const v24, -0x416b851f    # -0.29f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3f19999a    # 0.6f

    .line 239
    .line 240
    .line 241
    const v26, 0x3eeb851f    # 0.46f

    .line 242
    .line 243
    .line 244
    const v21, 0x3e428f5c    # 0.19f

    .line 245
    .line 246
    .line 247
    const v22, 0x3e23d70a    # 0.16f

    .line 248
    .line 249
    .line 250
    const v23, 0x3ec7ae14    # 0.39f

    .line 251
    .line 252
    .line 253
    const v24, 0x3e9eb852    # 0.31f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41000000    # 8.0f

    .line 260
    .line 261
    const v6, 0x4157d70a    # 13.49f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41180000    # 9.5f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, -0x40800000    # -1.0f

    .line 273
    .line 274
    const v6, 0x3f266666    # 0.65f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, -0x40828f5c    # -0.99f

    .line 281
    .line 282
    .line 283
    const v26, -0x420a3d71    # -0.12f

    .line 284
    .line 285
    .line 286
    const v21, -0x415c28f6    # -0.32f

    .line 287
    .line 288
    .line 289
    const v22, 0x3e570a3d    # 0.21f

    .line 290
    .line 291
    .line 292
    const v23, -0x40c51eb8    # -0.73f

    .line 293
    .line 294
    .line 295
    const v24, 0x3e23d70a    # 0.16f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x40c00000    # 6.0f

    .line 302
    .line 303
    const v6, 0x412028f6    # 10.01f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, -0x430a3d71    # -0.03f

    .line 310
    .line 311
    .line 312
    const v26, -0x4075c28f    # -1.08f

    .line 313
    .line 314
    .line 315
    const v21, -0x416b851f    # -0.29f

    .line 316
    .line 317
    .line 318
    const v22, -0x41666666    # -0.3f

    .line 319
    .line 320
    .line 321
    const v23, -0x41666666    # -0.3f

    .line 322
    .line 323
    .line 324
    const v24, -0x40bae148    # -0.77f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, 0x40da8f5c    # 6.83f

    .line 331
    .line 332
    .line 333
    const v26, 0x40fe6666    # 7.95f

    .line 334
    .line 335
    .line 336
    const v21, 0x40c8a3d7    # 6.27f

    .line 337
    .line 338
    .line 339
    const v22, 0x4109999a    # 8.6f

    .line 340
    .line 341
    .line 342
    const v23, 0x40d3d70a    # 6.62f

    .line 343
    .line 344
    .line 345
    const v24, 0x41030a3d    # 8.19f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v25, 0x40d947ae    # 6.79f

    .line 352
    .line 353
    .line 354
    const v26, 0x40f2e148    # 7.59f

    .line 355
    .line 356
    .line 357
    const v21, 0x40dd70a4    # 6.92f

    .line 358
    .line 359
    .line 360
    const v22, 0x40fae148    # 7.84f

    .line 361
    .line 362
    .line 363
    const v23, 0x40dccccd    # 6.9f

    .line 364
    .line 365
    .line 366
    const v24, 0x40f570a4    # 7.67f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, -0x40b5c28f    # -0.79f

    .line 373
    .line 374
    .line 375
    const v26, -0x40ee147b    # -0.57f

    .line 376
    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    const v23, -0x40b0a3d7    # -0.81f

    .line 383
    .line 384
    .line 385
    const v24, -0x416147ae    # -0.31f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v25, 0x4115c28f    # 9.36f

    .line 392
    .line 393
    .line 394
    const v26, 0x40dfae14    # 6.99f

    .line 395
    .line 396
    .line 397
    const/high16 v21, 0x40c00000    # 6.0f

    .line 398
    .line 399
    const v22, 0x40dd1eb8    # 6.91f

    .line 400
    .line 401
    .line 402
    const v23, 0x4115c28f    # 9.36f

    .line 403
    .line 404
    .line 405
    const v24, 0x40dfae14    # 6.99f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, 0x3edc28f6    # 0.43f

    .line 412
    .line 413
    .line 414
    const/high16 v26, 0x3e800000    # 0.25f

    .line 415
    .line 416
    const v21, 0x3e3851ec    # 0.18f

    .line 417
    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const v23, 0x3eae147b    # 0.34f

    .line 422
    .line 423
    .line 424
    const v24, 0x3dcccccd    # 0.1f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x3fb851ec    # 1.44f

    .line 431
    .line 432
    .line 433
    const/high16 v6, 0x40200000    # 2.5f

    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v21, 0x3db851ec    # 0.09f

    .line 439
    .line 440
    .line 441
    const v22, 0x3e19999a    # 0.15f

    .line 442
    .line 443
    .line 444
    const/high16 v23, 0x3e800000    # 0.25f

    .line 445
    .line 446
    const/high16 v24, 0x3e800000    # 0.25f

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x409a8f5c    # 4.83f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v25, 0x3f000000    # 0.5f

    .line 458
    .line 459
    const/high16 v26, 0x3f000000    # 0.5f

    .line 460
    .line 461
    const v21, 0x3e8f5c29    # 0.28f

    .line 462
    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/high16 v23, 0x3f000000    # 0.5f

    .line 467
    .line 468
    const v24, 0x3e6147ae    # 0.22f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/4 v4, 0x0

    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v25, -0x41000000    # -0.5f

    .line 479
    .line 480
    const/16 v21, 0x0

    .line 481
    .line 482
    const v22, 0x3e8f5c29    # 0.28f

    .line 483
    .line 484
    .line 485
    const v23, -0x419eb852    # -0.22f

    .line 486
    .line 487
    .line 488
    const/high16 v24, 0x3f000000    # 0.5f

    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x41800000    # 16.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x40200000    # 2.5f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v4, 0x3f570a3d    # 0.84f

    .line 504
    .line 505
    .line 506
    const v6, 0x3fbae148    # 1.46f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v25, 0x3f19999a    # 0.6f

    .line 513
    .line 514
    .line 515
    const v26, -0x41147ae1    # -0.46f

    .line 516
    .line 517
    .line 518
    const v21, 0x3e4ccccd    # 0.2f

    .line 519
    .line 520
    .line 521
    const v22, -0x41e66666    # -0.15f

    .line 522
    .line 523
    .line 524
    const v23, 0x3ecccccd    # 0.4f

    .line 525
    .line 526
    .line 527
    const v24, -0x41666666    # -0.3f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v25, 0x3f8147ae    # 1.01f

    .line 534
    .line 535
    .line 536
    const v26, 0x3d23d70a    # 0.04f

    .line 537
    .line 538
    .line 539
    const v21, 0x3e99999a    # 0.3f

    .line 540
    .line 541
    .line 542
    const/high16 v22, -0x41800000    # -0.25f

    .line 543
    .line 544
    const v23, 0x3f3ae148    # 0.73f

    .line 545
    .line 546
    .line 547
    const v24, -0x41947ae1    # -0.23f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/4 v4, 0x0

    .line 554
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v25, -0x42dc28f6    # -0.04f

    .line 558
    .line 559
    .line 560
    const v26, 0x3f8e147b    # 1.11f

    .line 561
    .line 562
    .line 563
    const v21, 0x3e9eb852    # 0.31f

    .line 564
    .line 565
    .line 566
    const v22, 0x3e9eb852    # 0.31f

    .line 567
    .line 568
    .line 569
    const v23, 0x3e947ae1    # 0.29f

    .line 570
    .line 571
    .line 572
    const v24, 0x3f51eb85    # 0.82f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v25, 0x41400000    # 12.0f

    .line 579
    .line 580
    const v26, 0x418feb85    # 17.99f

    .line 581
    .line 582
    .line 583
    const v21, 0x4184e148    # 16.61f

    .line 584
    .line 585
    .line 586
    const v22, 0x418947ae    # 17.16f

    .line 587
    .line 588
    .line 589
    const v23, 0x4165eb85    # 14.37f

    .line 590
    .line 591
    .line 592
    const v24, 0x418feb85    # 17.99f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const/16 v16, 0x3800

    .line 606
    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    const/high16 v6, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/high16 v8, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/4 v7, 0x0

    .line 614
    const/high16 v9, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/high16 v12, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v13, 0x0

    .line 619
    const/4 v14, 0x0

    .line 620
    const/4 v15, 0x0

    .line 621
    const-string v4, ""

    .line 622
    .line 623
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 624
    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 633
    .line 634
    .line 635
    move-result-wide v6

    .line 636
    const/4 v0, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const v0, 0x4163d70a    # 14.24f

    .line 654
    .line 655
    .line 656
    const v2, 0x416b0a3d    # 14.69f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, -0x3f533333    # -5.4f

    .line 663
    .line 664
    .line 665
    const/16 v18, 0x0

    .line 666
    .line 667
    const v13, -0x402147ae    # -1.74f

    .line 668
    .line 669
    .line 670
    const v14, 0x3f266666    # 0.65f

    .line 671
    .line 672
    .line 673
    const v15, -0x3f95c28f    # -3.66f

    .line 674
    .line 675
    .line 676
    const v16, 0x3f266666    # 0.65f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x40b0a3d7    # -0.81f

    .line 683
    .line 684
    .line 685
    const v2, 0x3fb47ae1    # 1.41f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3d75c28f    # 0.06f

    .line 692
    .line 693
    .line 694
    const v2, -0x430a3d71    # -0.03f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, 0x4061eb85    # 3.53f

    .line 701
    .line 702
    .line 703
    const v18, 0x3f4a3d71    # 0.79f

    .line 704
    .line 705
    .line 706
    const v13, 0x3f8ccccd    # 1.1f

    .line 707
    .line 708
    .line 709
    const v14, 0x3f051eb8    # 0.52f

    .line 710
    .line 711
    .line 712
    const v15, 0x4011eb85    # 2.28f

    .line 713
    .line 714
    .line 715
    const v16, 0x3f4a3d71    # 0.79f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x40633333    # 3.55f

    .line 722
    .line 723
    .line 724
    const v2, -0x40b5c28f    # -0.79f

    .line 725
    .line 726
    .line 727
    const v4, 0x401ccccd    # 2.45f

    .line 728
    .line 729
    .line 730
    const v6, -0x4170a3d7    # -0.28f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, -0x428a3d71    # -0.06f

    .line 737
    .line 738
    .line 739
    const v2, -0x430a3d71    # -0.03f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, 0x4163d70a    # 14.24f

    .line 746
    .line 747
    .line 748
    const v2, 0x416b0a3d    # 14.69f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/16 v16, 0x3800

    .line 762
    .line 763
    const/16 v17, 0x0

    .line 764
    .line 765
    const/high16 v6, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v7, 0x0

    .line 768
    const/high16 v12, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/4 v13, 0x0

    .line 771
    const/4 v14, 0x0

    .line 772
    const/4 v15, 0x0

    .line 773
    const-string v4, ""

    .line 774
    .line 775
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    sput-object v0, Landroidx/compose/material/icons/rounded/BedroomBabyKt;->_bedroomBaby:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 784
    .line 785
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    return-object v0
.end method

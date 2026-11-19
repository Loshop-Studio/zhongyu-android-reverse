.class public final Landroidx/compose/material/icons/rounded/NoPhotographyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoPhotography(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoPhotography"

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
    const v0, 0x412f0a3d    # 10.94f

    .line 71
    .line 72
    .line 73
    const v2, 0x4101eb85    # 8.12f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40ef5c29    # 7.48f

    .line 80
    .line 81
    .line 82
    const v2, 0x40951eb8    # 4.66f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, 0x41066666    # 8.4f

    .line 89
    .line 90
    .line 91
    const v2, 0x4069999a    # 3.65f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x411e147b    # 9.88f

    .line 98
    .line 99
    .line 100
    const/high16 v18, 0x40400000    # 3.0f

    .line 101
    .line 102
    const v13, 0x410c7ae1    # 8.78f

    .line 103
    .line 104
    .line 105
    const v14, 0x404f5c29    # 3.24f

    .line 106
    .line 107
    .line 108
    const v15, 0x41151eb8    # 9.32f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40400000    # 3.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x4087ae14    # 4.24f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x3fbc28f6    # 1.47f

    .line 123
    .line 124
    .line 125
    const v18, 0x3f266666    # 0.65f

    .line 126
    .line 127
    .line 128
    const v13, 0x3f0f5c29    # 0.56f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const v15, 0x3f8ccccd    # 1.1f

    .line 133
    .line 134
    .line 135
    const v16, 0x3e75c28f    # 0.24f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x4186a3d7    # 16.83f

    .line 142
    .line 143
    .line 144
    const/high16 v2, 0x40a00000    # 5.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41a00000    # 20.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x40000000    # 2.0f

    .line 155
    .line 156
    const/high16 v18, 0x40000000    # 2.0f

    .line 157
    .line 158
    const v13, 0x3f8ccccd    # 1.1f

    .line 159
    .line 160
    .line 161
    const/high16 v15, 0x40000000    # 2.0f

    .line 162
    .line 163
    const v16, 0x3f666666    # 0.9f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, -0x435c28f6    # -0.02f

    .line 175
    .line 176
    .line 177
    const v18, 0x3e23d70a    # 0.16f

    .line 178
    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, 0x3d4ccccd    # 0.05f

    .line 182
    .line 183
    .line 184
    const v15, -0x43dc28f6    # -0.01f

    .line 185
    .line 186
    .line 187
    const v16, 0x3dcccccd    # 0.1f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x3f5ccccd    # -5.1f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x41880000    # 17.0f

    .line 200
    .line 201
    const/high16 v18, 0x41500000    # 13.0f

    .line 202
    .line 203
    const v13, 0x4187ae14    # 16.96f

    .line 204
    .line 205
    .line 206
    const v14, 0x415b5c29    # 13.71f

    .line 207
    .line 208
    .line 209
    const/high16 v15, 0x41880000    # 17.0f

    .line 210
    .line 211
    const v16, 0x4155c28f    # 13.36f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x3f600000    # -5.0f

    .line 218
    .line 219
    const/high16 v18, -0x3f600000    # -5.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const v14, -0x3fcf5c29    # -2.76f

    .line 223
    .line 224
    .line 225
    const v15, -0x3ff0a3d7    # -2.24f

    .line 226
    .line 227
    .line 228
    const/high16 v16, -0x3f600000    # -5.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x412f0a3d    # 10.94f

    .line 234
    .line 235
    .line 236
    const v18, 0x4101eb85    # 8.12f

    .line 237
    .line 238
    .line 239
    const v13, 0x413a3d71    # 11.64f

    .line 240
    .line 241
    .line 242
    const/high16 v14, 0x41000000    # 8.0f

    .line 243
    .line 244
    const v15, 0x4134a3d7    # 11.29f

    .line 245
    .line 246
    .line 247
    const v16, 0x4100a3d7    # 8.04f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x419e3d71    # 19.78f

    .line 257
    .line 258
    .line 259
    const v2, 0x41b4e148    # 22.61f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x41915c29    # 18.17f

    .line 266
    .line 267
    .line 268
    const/high16 v2, 0x41a80000    # 21.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x40800000    # 4.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40000000    # -2.0f

    .line 279
    .line 280
    const/high16 v18, -0x40000000    # -2.0f

    .line 281
    .line 282
    const v13, -0x40733333    # -1.1f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40000000    # -2.0f

    .line 287
    .line 288
    const v16, -0x4099999a    # -0.9f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40e00000    # 7.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3f2e147b    # 0.68f

    .line 300
    .line 301
    .line 302
    const v18, -0x404147ae    # -1.49f

    .line 303
    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const v14, -0x40e8f5c3    # -0.59f

    .line 307
    .line 308
    .line 309
    const v15, 0x3e8a3d71    # 0.27f

    .line 310
    .line 311
    .line 312
    const v16, -0x4070a3d7    # -1.12f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x3fb1eb85    # 1.39f

    .line 319
    .line 320
    .line 321
    const v2, 0x40870a3d    # 4.22f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3fb1eb85    # 1.39f

    .line 328
    .line 329
    .line 330
    const v18, 0x4033d70a    # 2.81f

    .line 331
    .line 332
    .line 333
    const/high16 v13, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const v14, 0x40751eb8    # 3.83f

    .line 336
    .line 337
    .line 338
    const/high16 v15, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const v16, 0x404ccccd    # 3.2f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/4 v0, 0x0

    .line 347
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3fb47ae1    # 1.41f

    .line 351
    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    const v13, 0x3ec7ae14    # 0.39f

    .line 356
    .line 357
    .line 358
    const v14, -0x413851ec    # -0.39f

    .line 359
    .line 360
    .line 361
    const v15, 0x3f828f5c    # 1.02f

    .line 362
    .line 363
    .line 364
    const v16, -0x413851ec    # -0.39f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x41930a3d    # 18.38f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    const v18, 0x3fb47ae1    # 1.41f

    .line 379
    .line 380
    .line 381
    const v14, 0x3ec7ae14    # 0.39f

    .line 382
    .line 383
    .line 384
    const v15, 0x3ec7ae14    # 0.39f

    .line 385
    .line 386
    .line 387
    const v16, 0x3f828f5c    # 1.02f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/4 v0, 0x0

    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x419e3d71    # 19.78f

    .line 398
    .line 399
    .line 400
    const v18, 0x41b4e148    # 22.61f

    .line 401
    .line 402
    .line 403
    const v13, 0x41a66666    # 20.8f

    .line 404
    .line 405
    .line 406
    const/high16 v14, 0x41b80000    # 23.0f

    .line 407
    .line 408
    const v15, 0x41a15c29    # 20.17f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x41b80000    # 23.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x4167d70a    # 14.49f

    .line 420
    .line 421
    .line 422
    const v2, 0x418a8f5c    # 17.32f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, -0x40400000    # -1.5f

    .line 429
    .line 430
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x41400000    # 12.0f

    .line 434
    .line 435
    const/high16 v18, 0x41800000    # 16.0f

    .line 436
    .line 437
    const v13, 0x414ab852    # 12.67f

    .line 438
    .line 439
    .line 440
    const v14, 0x417eb852    # 15.92f

    .line 441
    .line 442
    .line 443
    const v15, 0x4145999a    # 12.35f

    .line 444
    .line 445
    .line 446
    const/high16 v16, 0x41800000    # 16.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 452
    .line 453
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 454
    .line 455
    const v13, -0x402b851f    # -1.66f

    .line 456
    .line 457
    .line 458
    const/4 v14, 0x0

    .line 459
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 460
    .line 461
    const v16, -0x40547ae1    # -1.34f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, 0x3e428f5c    # 0.19f

    .line 468
    .line 469
    .line 470
    const v18, -0x40851eb8    # -0.98f

    .line 471
    .line 472
    .line 473
    const/4 v13, 0x0

    .line 474
    const v14, -0x414ccccd    # -0.35f

    .line 475
    .line 476
    .line 477
    const v15, 0x3da3d70a    # 0.08f

    .line 478
    .line 479
    .line 480
    const v16, -0x40d47ae1    # -0.67f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40e00000    # 7.0f

    .line 490
    .line 491
    const/high16 v18, 0x41500000    # 13.0f

    .line 492
    .line 493
    const/high16 v13, 0x40e80000    # 7.25f

    .line 494
    .line 495
    const v14, 0x4133d70a    # 11.24f

    .line 496
    .line 497
    .line 498
    const/high16 v15, 0x40e00000    # 7.0f

    .line 499
    .line 500
    const v16, 0x414170a4    # 12.09f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x40a00000    # 5.0f

    .line 507
    .line 508
    const/high16 v18, 0x40a00000    # 5.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, 0x4030a3d7    # 2.76f

    .line 512
    .line 513
    .line 514
    const v15, 0x400f5c29    # 2.24f

    .line 515
    .line 516
    .line 517
    const/high16 v16, 0x40a00000    # 5.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x4167d70a    # 14.49f

    .line 523
    .line 524
    .line 525
    const v18, 0x418a8f5c    # 17.32f

    .line 526
    .line 527
    .line 528
    const v13, 0x414e8f5c    # 12.91f

    .line 529
    .line 530
    .line 531
    const/high16 v14, 0x41900000    # 18.0f

    .line 532
    .line 533
    const v15, 0x415c28f6    # 13.76f

    .line 534
    .line 535
    .line 536
    const/high16 v16, 0x418e0000    # 17.75f

    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v8, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    sput-object v0, Landroidx/compose/material/icons/rounded/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0
.end method

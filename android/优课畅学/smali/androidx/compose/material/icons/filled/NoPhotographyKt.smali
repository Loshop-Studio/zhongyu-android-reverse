.class public final Landroidx/compose/material/icons/filled/NoPhotographyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoPhotography(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.NoPhotography"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 89
    .line 90
    const/high16 v2, 0x40400000    # 3.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40c00000    # 6.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3fea3d71    # 1.83f

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41a00000    # 20.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x40000000    # 2.0f

    .line 114
    .line 115
    const/high16 v18, 0x40000000    # 2.0f

    .line 116
    .line 117
    const v13, 0x3f8ccccd    # 1.1f

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const/high16 v15, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v16, 0x3f666666    # 0.9f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x435c28f6    # -0.02f

    .line 135
    .line 136
    .line 137
    const v18, 0x3e23d70a    # 0.16f

    .line 138
    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, 0x3d4ccccd    # 0.05f

    .line 142
    .line 143
    .line 144
    const v15, -0x43dc28f6    # -0.01f

    .line 145
    .line 146
    .line 147
    const v16, 0x3dcccccd    # 0.1f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x3f5ccccd    # -5.1f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41880000    # 17.0f

    .line 160
    .line 161
    const/high16 v18, 0x41500000    # 13.0f

    .line 162
    .line 163
    const v13, 0x4187ae14    # 16.96f

    .line 164
    .line 165
    .line 166
    const v14, 0x415b5c29    # 13.71f

    .line 167
    .line 168
    .line 169
    const/high16 v15, 0x41880000    # 17.0f

    .line 170
    .line 171
    const v16, 0x4155c28f    # 13.36f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x3f600000    # -5.0f

    .line 178
    .line 179
    const/high16 v18, -0x3f600000    # -5.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const v14, -0x3fcf5c29    # -2.76f

    .line 183
    .line 184
    .line 185
    const v15, -0x3ff0a3d7    # -2.24f

    .line 186
    .line 187
    .line 188
    const/high16 v16, -0x3f600000    # -5.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, 0x412f0a3d    # 10.94f

    .line 194
    .line 195
    .line 196
    const v18, 0x4101eb85    # 8.12f

    .line 197
    .line 198
    .line 199
    const v13, 0x413a3d71    # 11.64f

    .line 200
    .line 201
    .line 202
    const/high16 v14, 0x41000000    # 8.0f

    .line 203
    .line 204
    const v15, 0x4134a3d7    # 11.29f

    .line 205
    .line 206
    .line 207
    const v16, 0x4100a3d7    # 8.04f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x41ba7ae1    # 23.31f

    .line 217
    .line 218
    .line 219
    const v2, 0x41a3eb85    # 20.49f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x41915c29    # 18.17f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x41a80000    # 21.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x40800000    # 4.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/high16 v18, -0x40000000    # -2.0f

    .line 241
    .line 242
    const v13, -0x40733333    # -1.1f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, -0x40000000    # -2.0f

    .line 247
    .line 248
    const v16, -0x4099999a    # -0.9f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40e00000    # 7.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x3f2e147b    # 0.68f

    .line 260
    .line 261
    .line 262
    const v18, -0x404147ae    # -1.49f

    .line 263
    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const v14, -0x40e8f5c3    # -0.59f

    .line 267
    .line 268
    .line 269
    const v15, 0x3e8a3d71    # 0.27f

    .line 270
    .line 271
    .line 272
    const v16, -0x4070a3d7    # -1.12f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, -0x40000000    # -2.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x40066666    # 2.1f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x419e6666    # 19.8f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x41ba7ae1    # 23.31f

    .line 296
    .line 297
    .line 298
    const v2, 0x41a3eb85    # 20.49f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x4167d70a    # 14.49f

    .line 308
    .line 309
    .line 310
    const v2, 0x418a8f5c    # 17.32f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, -0x40400000    # -1.5f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41400000    # 12.0f

    .line 322
    .line 323
    const/high16 v18, 0x41800000    # 16.0f

    .line 324
    .line 325
    const v13, 0x414ab852    # 12.67f

    .line 326
    .line 327
    .line 328
    const v14, 0x417eb852    # 15.92f

    .line 329
    .line 330
    .line 331
    const v15, 0x4145999a    # 12.35f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x41800000    # 16.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 340
    .line 341
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 342
    .line 343
    const v13, -0x402b851f    # -1.66f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 348
    .line 349
    const v16, -0x40547ae1    # -1.34f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x3e428f5c    # 0.19f

    .line 356
    .line 357
    .line 358
    const v18, -0x40851eb8    # -0.98f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, -0x414ccccd    # -0.35f

    .line 363
    .line 364
    .line 365
    const v15, 0x3da3d70a    # 0.08f

    .line 366
    .line 367
    .line 368
    const v16, -0x40d47ae1    # -0.67f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x40e00000    # 7.0f

    .line 378
    .line 379
    const/high16 v18, 0x41500000    # 13.0f

    .line 380
    .line 381
    const/high16 v13, 0x40e80000    # 7.25f

    .line 382
    .line 383
    const v14, 0x4133d70a    # 11.24f

    .line 384
    .line 385
    .line 386
    const/high16 v15, 0x40e00000    # 7.0f

    .line 387
    .line 388
    const v16, 0x414170a4    # 12.09f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x40a00000    # 5.0f

    .line 395
    .line 396
    const/high16 v18, 0x40a00000    # 5.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, 0x4030a3d7    # 2.76f

    .line 400
    .line 401
    .line 402
    const v15, 0x400f5c29    # 2.24f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x40a00000    # 5.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x4167d70a    # 14.49f

    .line 411
    .line 412
    .line 413
    const v18, 0x418a8f5c    # 17.32f

    .line 414
    .line 415
    .line 416
    const v13, 0x414e8f5c    # 12.91f

    .line 417
    .line 418
    .line 419
    const/high16 v14, 0x41900000    # 18.0f

    .line 420
    .line 421
    const v15, 0x415c28f6    # 13.76f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x418e0000    # 17.75f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/16 v16, 0x3800

    .line 437
    .line 438
    const/16 v17, 0x0

    .line 439
    .line 440
    const/high16 v6, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/high16 v8, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const/high16 v9, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v12, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    sput-object v0, Landroidx/compose/material/icons/filled/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 463
    .line 464
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/outlined/NoPhotographyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoPhotography(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.NoPhotography"

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
    const v0, 0x40c23d71    # 6.07f

    .line 71
    .line 72
    .line 73
    const v2, 0x410e6666    # 8.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v0, 0x41895c29    # 17.17f

    .line 154
    .line 155
    .line 156
    const/high16 v2, 0x41a00000    # 20.0f

    .line 157
    .line 158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40e00000    # 7.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x3f7e6666    # -4.05f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, -0x4015c28f    # -1.83f

    .line 173
    .line 174
    .line 175
    const/high16 v2, -0x40000000    # -2.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x411e147b    # 9.88f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40c23d71    # 6.07f

    .line 187
    .line 188
    .line 189
    const v2, 0x410e6666    # 8.9f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x41ba7ae1    # 23.31f

    .line 199
    .line 200
    .line 201
    const v2, 0x41a3eb85    # 20.49f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x41915c29    # 18.17f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x41a80000    # 21.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x40800000    # 4.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, -0x40000000    # -2.0f

    .line 221
    .line 222
    const/high16 v18, -0x40000000    # -2.0f

    .line 223
    .line 224
    const v13, -0x40733333    # -1.1f

    .line 225
    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const/high16 v15, -0x40000000    # -2.0f

    .line 229
    .line 230
    const v16, -0x4099999a    # -0.9f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x40e00000    # 7.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3f2e147b    # 0.68f

    .line 242
    .line 243
    .line 244
    const v18, -0x404147ae    # -1.49f

    .line 245
    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const v14, -0x40e8f5c3    # -0.59f

    .line 249
    .line 250
    .line 251
    const v15, 0x3e8a3d71    # 0.27f

    .line 252
    .line 253
    .line 254
    const v16, -0x4070a3d7    # -1.12f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, -0x40000000    # -2.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x40066666    # 2.1f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x419e6666    # 19.8f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x41ba7ae1    # 23.31f

    .line 278
    .line 279
    .line 280
    const v2, 0x41a3eb85    # 20.49f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x414051ec    # 12.02f

    .line 290
    .line 291
    .line 292
    const v2, 0x41130a3d    # 9.19f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41100000    # 9.0f

    .line 299
    .line 300
    const/high16 v18, 0x41500000    # 13.0f

    .line 301
    .line 302
    const v13, 0x411147ae    # 9.08f

    .line 303
    .line 304
    .line 305
    const v14, 0x414547ae    # 12.33f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x41100000    # 9.0f

    .line 309
    .line 310
    const v16, 0x414a6666    # 12.65f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x40400000    # 3.0f

    .line 317
    .line 318
    const/high16 v18, 0x40400000    # 3.0f

    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x3fd47ae1    # 1.66f

    .line 322
    .line 323
    .line 324
    const v15, 0x3fab851f    # 1.34f

    .line 325
    .line 326
    .line 327
    const/high16 v16, 0x40400000    # 3.0f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3f7ae148    # 0.98f

    .line 333
    .line 334
    .line 335
    const v18, -0x41bd70a4    # -0.19f

    .line 336
    .line 337
    .line 338
    const v13, 0x3eb33333    # 0.35f

    .line 339
    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const v15, 0x3f2b851f    # 0.67f

    .line 343
    .line 344
    .line 345
    const v16, -0x425c28f6    # -0.08f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41980000    # 19.0f

    .line 358
    .line 359
    const v2, 0x41815c29    # 16.17f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x4028f5c3    # -1.68f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x41400000    # 12.0f

    .line 372
    .line 373
    const/high16 v18, 0x41900000    # 18.0f

    .line 374
    .line 375
    const v13, 0x415c28f6    # 13.76f

    .line 376
    .line 377
    .line 378
    const/high16 v14, 0x418e0000    # 17.75f

    .line 379
    .line 380
    const v15, 0x414e8f5c    # 12.91f

    .line 381
    .line 382
    .line 383
    const/high16 v16, 0x41900000    # 18.0f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, -0x3f600000    # -5.0f

    .line 389
    .line 390
    const/high16 v18, -0x3f600000    # -5.0f

    .line 391
    .line 392
    const v13, -0x3fcf5c29    # -2.76f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/high16 v15, -0x3f600000    # -5.0f

    .line 397
    .line 398
    const v16, -0x3ff0a3d7    # -2.24f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3f2e147b    # 0.68f

    .line 405
    .line 406
    .line 407
    const v18, -0x3fe0a3d7    # -2.49f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, -0x40970a3d    # -0.91f

    .line 412
    .line 413
    .line 414
    const/high16 v15, 0x3e800000    # 0.25f

    .line 415
    .line 416
    const v16, -0x401eb852    # -1.76f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x408570a4    # 4.17f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40e00000    # 7.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40800000    # 4.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41400000    # 12.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x41815c29    # 16.17f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x416cf5c3    # 14.81f

    .line 450
    .line 451
    .line 452
    const v2, 0x413fae14    # 11.98f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x40047ae1    # 2.07f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, 0x41880000    # 17.0f

    .line 465
    .line 466
    const/high16 v18, 0x41500000    # 13.0f

    .line 467
    .line 468
    const v13, 0x4187ae14    # 16.96f

    .line 469
    .line 470
    .line 471
    const v14, 0x415b5c29    # 13.71f

    .line 472
    .line 473
    .line 474
    const/high16 v15, 0x41880000    # 17.0f

    .line 475
    .line 476
    const v16, 0x4155c28f    # 13.36f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, -0x3f600000    # -5.0f

    .line 483
    .line 484
    const/high16 v18, -0x3f600000    # -5.0f

    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const v14, -0x3fcf5c29    # -2.76f

    .line 488
    .line 489
    .line 490
    const v15, -0x3ff0a3d7    # -2.24f

    .line 491
    .line 492
    .line 493
    const/high16 v16, -0x3f600000    # -5.0f

    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x407851ec    # -1.06f

    .line 499
    .line 500
    .line 501
    const v18, 0x3df5c28f    # 0.12f

    .line 502
    .line 503
    .line 504
    const v13, -0x4147ae14    # -0.36f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const v15, -0x40ca3d71    # -0.71f

    .line 509
    .line 510
    .line 511
    const v16, 0x3d23d70a    # 0.04f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x416cf5c3    # 14.81f

    .line 521
    .line 522
    .line 523
    const v18, 0x413fae14    # 11.98f

    .line 524
    .line 525
    .line 526
    const v13, 0x415d999a    # 13.85f

    .line 527
    .line 528
    .line 529
    const v14, 0x4127d70a    # 10.49f

    .line 530
    .line 531
    .line 532
    const v15, 0x416828f6    # 14.51f

    .line 533
    .line 534
    .line 535
    const v16, 0x41326666    # 11.15f

    .line 536
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
    sput-object v0, Landroidx/compose/material/icons/outlined/NoPhotographyKt;->_noPhotography:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0
.end method

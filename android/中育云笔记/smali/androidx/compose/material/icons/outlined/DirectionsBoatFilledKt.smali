.class public final Landroidx/compose/material/icons/outlined/DirectionsBoatFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBoatFilled(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DirectionsBoatFilledKt;->_directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DirectionsBoatFilled"

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
    const v0, 0x414a8f5c    # 12.66f

    .line 71
    .line 72
    .line 73
    const v2, 0x419e28f6    # 19.77f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4070a3d7    # -1.12f

    .line 80
    .line 81
    .line 82
    const v2, 0x407e147b    # 3.97f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x3fd66666    # -2.65f

    .line 89
    .line 90
    .line 91
    const v18, -0x3fd51eb8    # -2.67f

    .line 92
    .line 93
    .line 94
    const v13, -0x40b851ec    # -0.78f

    .line 95
    .line 96
    .line 97
    const v14, -0x4123d70a    # -0.43f

    .line 98
    .line 99
    .line 100
    const v15, -0x40770a3d    # -1.07f

    .line 101
    .line 102
    .line 103
    const v16, -0x40a3d70a    # -0.86f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x41400000    # 12.0f

    .line 110
    .line 111
    const/high16 v18, 0x41880000    # 17.0f

    .line 112
    .line 113
    const v13, 0x41666666    # 14.4f

    .line 114
    .line 115
    .line 116
    const v14, 0x417c7ae1    # 15.78f

    .line 117
    .line 118
    .line 119
    const v15, 0x41591eb8    # 13.57f

    .line 120
    .line 121
    .line 122
    const/high16 v16, 0x41880000    # 17.0f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, -0x3f800000    # -4.0f

    .line 128
    .line 129
    const v18, -0x3fbd70a4    # -3.04f

    .line 130
    .line 131
    .line 132
    const v13, -0x403c28f6    # -1.53f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const v15, -0x3fea3d71    # -2.34f

    .line 137
    .line 138
    .line 139
    const v16, -0x406ccccd    # -1.15f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x3fd66666    # -2.65f

    .line 146
    .line 147
    .line 148
    const v18, 0x4029999a    # 2.65f

    .line 149
    .line 150
    .line 151
    const v13, -0x40333333    # -1.6f

    .line 152
    .line 153
    .line 154
    const v14, 0x3fe8f5c3    # 1.82f

    .line 155
    .line 156
    .line 157
    const v15, -0x4010a3d7    # -1.87f

    .line 158
    .line 159
    .line 160
    const v16, 0x400d70a4    # 2.21f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x406f5c29    # -1.13f

    .line 167
    .line 168
    .line 169
    const v2, -0x3f828f5c    # -3.96f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4121c28f    # 10.11f

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x41400000    # 12.0f

    .line 179
    .line 180
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x414a8f5c    # 12.66f

    .line 184
    .line 185
    .line 186
    const v2, 0x419e28f6    # 19.77f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41700000    # 15.0f

    .line 196
    .line 197
    const/high16 v2, 0x3f800000    # 1.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41100000    # 9.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x40400000    # 3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40c00000    # 6.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x40800000    # 4.0f

    .line 218
    .line 219
    const/high16 v18, 0x40c00000    # 6.0f

    .line 220
    .line 221
    const v13, 0x409ccccd    # 4.9f

    .line 222
    .line 223
    .line 224
    const/high16 v14, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v15, 0x40800000    # 4.0f

    .line 227
    .line 228
    const v16, 0x409ccccd    # 4.9f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x4093d70a    # 4.62f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, -0x405ae148    # -1.29f

    .line 241
    .line 242
    .line 243
    const v2, 0x3ed70a3d    # 0.42f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x40d70a3d    # -0.66f

    .line 250
    .line 251
    .line 252
    const v18, 0x3fa3d70a    # 1.28f

    .line 253
    .line 254
    .line 255
    const v13, -0x40deb852    # -0.63f

    .line 256
    .line 257
    .line 258
    const v14, 0x3e428f5c    # 0.19f

    .line 259
    .line 260
    .line 261
    const v15, -0x40b0a3d7    # -0.81f

    .line 262
    .line 263
    .line 264
    const v16, 0x3f570a3d    # 0.84f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x407ccccd    # 3.95f

    .line 271
    .line 272
    .line 273
    const/high16 v2, 0x41980000    # 19.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x40800000    # 4.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x40800000    # 4.0f

    .line 284
    .line 285
    const/high16 v18, -0x40000000    # -2.0f

    .line 286
    .line 287
    const v13, 0x3fcccccd    # 1.6f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, 0x404147ae    # 3.02f

    .line 292
    .line 293
    .line 294
    const v16, -0x409eb852    # -0.88f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v18, 0x40000000    # 2.0f

    .line 301
    .line 302
    const v13, 0x3f7ae148    # 0.98f

    .line 303
    .line 304
    .line 305
    const v14, 0x3f8f5c29    # 1.12f

    .line 306
    .line 307
    .line 308
    const v15, 0x4019999a    # 2.4f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x40000000    # 2.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x404147ae    # 3.02f

    .line 317
    .line 318
    .line 319
    const v2, -0x409eb852    # -0.88f

    .line 320
    .line 321
    .line 322
    const/high16 v4, -0x40000000    # -2.0f

    .line 323
    .line 324
    const/high16 v6, 0x40800000    # 4.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x3d4ccccd    # 0.05f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3ff47ae1    # 1.91f

    .line 339
    .line 340
    .line 341
    const v2, -0x3f2a3d71    # -6.68f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x40d70a3d    # -0.66f

    .line 348
    .line 349
    .line 350
    const v18, -0x405c28f6    # -1.28f

    .line 351
    .line 352
    .line 353
    const v13, 0x3de147ae    # 0.11f

    .line 354
    .line 355
    .line 356
    const v14, -0x41428f5c    # -0.37f

    .line 357
    .line 358
    .line 359
    const v15, 0x3d23d70a    # 0.04f

    .line 360
    .line 361
    .line 362
    const v16, -0x407851ec    # -1.06f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41a00000    # 20.0f

    .line 369
    .line 370
    const v2, 0x4129eb85    # 10.62f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40c00000    # 6.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, -0x40000000    # -2.0f

    .line 382
    .line 383
    const/high16 v18, -0x40000000    # -2.0f

    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const v14, -0x40733333    # -1.1f

    .line 387
    .line 388
    .line 389
    const v15, -0x4099999a    # -0.9f

    .line 390
    .line 391
    .line 392
    const/high16 v16, -0x40000000    # -2.0f

    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x3f800000    # 1.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41700000    # 15.0f

    .line 408
    .line 409
    const/high16 v2, 0x3f800000    # 1.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x411f851f    # 9.97f

    .line 418
    .line 419
    .line 420
    const/high16 v2, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40c00000    # 6.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41400000    # 12.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x407e147b    # 3.97f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41000000    # 8.0f

    .line 442
    .line 443
    const/high16 v2, 0x41400000    # 12.0f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x411f851f    # 9.97f

    .line 449
    .line 450
    .line 451
    const/high16 v2, 0x40c00000    # 6.0f

    .line 452
    .line 453
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x419d70a4    # 19.68f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x41800000    # 16.0f

    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, -0x3f800000    # -4.0f

    .line 471
    .line 472
    const v18, 0x3fa3d70a    # 1.28f

    .line 473
    .line 474
    .line 475
    const v13, -0x4063d70a    # -1.22f

    .line 476
    .line 477
    .line 478
    const v14, 0x3f59999a    # 0.85f

    .line 479
    .line 480
    .line 481
    const v15, -0x3fd8f5c3    # -2.61f

    .line 482
    .line 483
    .line 484
    const v16, 0x3fa3d70a    # 1.28f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, -0x3f800000    # -4.0f

    .line 491
    .line 492
    const v2, -0x405c28f6    # -1.28f

    .line 493
    .line 494
    .line 495
    const v4, -0x3fce147b    # -2.78f

    .line 496
    .line 497
    .line 498
    const v6, -0x4123d70a    # -0.43f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x40800000    # 4.0f

    .line 505
    .line 506
    const/high16 v18, 0x41a80000    # 21.0f

    .line 507
    .line 508
    const v13, 0x40d8f5c3    # 6.78f

    .line 509
    .line 510
    .line 511
    const v14, 0x41a43d71    # 20.53f

    .line 512
    .line 513
    .line 514
    const v15, 0x40ac7ae1    # 5.39f

    .line 515
    .line 516
    .line 517
    const/high16 v16, 0x41a80000    # 21.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40000000    # 2.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v18, -0x40828f5c    # -0.99f

    .line 534
    .line 535
    .line 536
    const v13, 0x3fb0a3d7    # 1.38f

    .line 537
    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const v15, 0x402f5c29    # 2.74f

    .line 541
    .line 542
    .line 543
    const v16, -0x414ccccd    # -0.35f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v18, 0x3f7851ec    # 0.97f

    .line 550
    .line 551
    .line 552
    const v13, 0x3fa147ae    # 1.26f

    .line 553
    .line 554
    .line 555
    const v14, 0x3f23d70a    # 0.64f

    .line 556
    .line 557
    .line 558
    const v15, 0x402851ec    # 2.63f

    .line 559
    .line 560
    .line 561
    const v16, 0x3f7851ec    # 0.97f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, -0x415c28f6    # -0.32f

    .line 568
    .line 569
    .line 570
    const v2, -0x4087ae14    # -0.97f

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x40800000    # 4.0f

    .line 574
    .line 575
    const v6, 0x402f5c29    # 2.74f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v18, 0x3f7d70a4    # 0.99f

    .line 582
    .line 583
    .line 584
    const v14, 0x3f266666    # 0.65f

    .line 585
    .line 586
    .line 587
    const v15, 0x4027ae14    # 2.62f

    .line 588
    .line 589
    .line 590
    const v16, 0x3f7d70a4    # 0.99f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x40000000    # 2.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, -0x40000000    # -2.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, 0x41800000    # 16.0f

    .line 610
    .line 611
    const v18, 0x419d70a4    # 19.68f

    .line 612
    .line 613
    .line 614
    const v13, 0x4194e148    # 18.61f

    .line 615
    .line 616
    .line 617
    const/high16 v14, 0x41a80000    # 21.0f

    .line 618
    .line 619
    const v15, 0x4189c28f    # 17.22f

    .line 620
    .line 621
    .line 622
    const v16, 0x41a43d71    # 20.53f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x419d70a4    # 19.68f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x41800000    # 16.0f

    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    const/16 v16, 0x3800

    .line 644
    .line 645
    const/16 v17, 0x0

    .line 646
    .line 647
    const/high16 v6, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/high16 v8, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v7, 0x0

    .line 652
    const/high16 v9, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/high16 v12, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/4 v13, 0x0

    .line 657
    const/4 v14, 0x0

    .line 658
    const/4 v15, 0x0

    .line 659
    const-string v4, ""

    .line 660
    .line 661
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    sput-object v0, Landroidx/compose/material/icons/outlined/DirectionsBoatFilledKt;->_directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 670
    .line 671
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    return-object v0
.end method

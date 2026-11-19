.class public final Landroidx/compose/material/icons/rounded/NoFlashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoFlash(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoFlash"

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
    const v0, 0x404a3d71    # 3.16f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v17, -0x404b851f    # -1.41f

    .line 77
    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    const v13, -0x413851ec    # -0.39f

    .line 82
    .line 83
    .line 84
    const v14, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v15, -0x407d70a4    # -1.02f

    .line 88
    .line 89
    .line 90
    const v16, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    const v18, 0x3fb47ae1    # 1.41f

    .line 103
    .line 104
    .line 105
    const v14, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v15, -0x413851ec    # -0.39f

    .line 109
    .line 110
    .line 111
    const v16, 0x3f828f5c    # 1.02f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x40933333    # 4.6f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x40c47ae1    # 6.14f

    .line 124
    .line 125
    .line 126
    const v2, 0x41166666    # 9.4f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40666666    # 3.6f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/high16 v18, 0x41300000    # 11.0f

    .line 141
    .line 142
    const v13, 0x402e147b    # 2.72f

    .line 143
    .line 144
    .line 145
    const v14, 0x41166666    # 9.4f

    .line 146
    .line 147
    .line 148
    const/high16 v15, 0x40000000    # 2.0f

    .line 149
    .line 150
    const v16, 0x4121eb85    # 10.12f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x41166666    # 9.4f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x40666666    # 3.6f

    .line 163
    .line 164
    .line 165
    const/high16 v18, 0x41b00000    # 22.0f

    .line 166
    .line 167
    const/high16 v13, 0x40000000    # 2.0f

    .line 168
    .line 169
    const v14, 0x41aa3d71    # 21.28f

    .line 170
    .line 171
    .line 172
    const v15, 0x402e147b    # 2.72f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x41b00000    # 22.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x414ccccd    # 12.8f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3fc66666    # 1.55f

    .line 187
    .line 188
    .line 189
    const v18, -0x4063d70a    # -1.22f

    .line 190
    .line 191
    .line 192
    const/high16 v13, 0x3f400000    # 0.75f

    .line 193
    .line 194
    const/4 v14, 0x0

    .line 195
    const v15, 0x3fb0a3d7    # 1.38f

    .line 196
    .line 197
    .line 198
    const v16, -0x40fae148    # -0.52f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x3fbc28f6    # 1.47f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x3fb47ae1    # 1.41f

    .line 211
    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const v13, 0x3ec7ae14    # 0.39f

    .line 216
    .line 217
    .line 218
    const v14, 0x3ec7ae14    # 0.39f

    .line 219
    .line 220
    .line 221
    const v15, 0x3f828f5c    # 1.02f

    .line 222
    .line 223
    .line 224
    const v16, 0x3ec7ae14    # 0.39f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    const v18, -0x404b851f    # -1.41f

    .line 237
    .line 238
    .line 239
    const v14, -0x413851ec    # -0.39f

    .line 240
    .line 241
    .line 242
    const v15, 0x3ec7ae14    # 0.39f

    .line 243
    .line 244
    .line 245
    const v16, -0x407d70a4    # -1.02f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x404a3d71    # 3.16f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41200000    # 10.0f

    .line 261
    .line 262
    const/high16 v2, 0x41a00000    # 20.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, -0x3f800000    # -4.0f

    .line 268
    .line 269
    const/high16 v18, -0x3f800000    # -4.0f

    .line 270
    .line 271
    const v13, -0x3ff28f5c    # -2.21f

    .line 272
    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    const/high16 v15, -0x3f800000    # -4.0f

    .line 276
    .line 277
    const v16, -0x401ae148    # -1.79f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x40500000    # 3.25f

    .line 284
    .line 285
    const v18, -0x3f851eb8    # -3.92f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, -0x40066666    # -1.95f

    .line 290
    .line 291
    .line 292
    const v15, 0x3fb33333    # 1.4f

    .line 293
    .line 294
    .line 295
    const v16, -0x3f9b851f    # -3.57f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x3fc8f5c3    # 1.57f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x40ae147b    # -0.82f

    .line 308
    .line 309
    .line 310
    const v18, -0x41e66666    # -0.15f

    .line 311
    .line 312
    .line 313
    const v13, -0x417ae148    # -0.26f

    .line 314
    .line 315
    .line 316
    const v14, -0x4247ae14    # -0.09f

    .line 317
    .line 318
    .line 319
    const v15, -0x40f851ec    # -0.53f

    .line 320
    .line 321
    .line 322
    const v16, -0x41e66666    # -0.15f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 329
    .line 330
    const/high16 v18, 0x40200000    # 2.5f

    .line 331
    .line 332
    const v13, -0x404f5c29    # -1.38f

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 337
    .line 338
    const v16, 0x3f8f5c29    # 1.12f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x40200000    # 2.5f

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, 0x3fb0a3d7    # 1.38f

    .line 348
    .line 349
    .line 350
    const v15, 0x3f8f5c29    # 1.12f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x40200000    # 2.5f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 359
    .line 360
    const v13, 0x3fb0a3d7    # 1.38f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/high16 v15, 0x40200000    # 2.5f

    .line 365
    .line 366
    const v16, -0x4070a3d7    # -1.12f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x41e66666    # -0.15f

    .line 373
    .line 374
    .line 375
    const v18, -0x40ae147b    # -0.82f

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, -0x416b851f    # -0.29f

    .line 380
    .line 381
    .line 382
    const v15, -0x428a3d71    # -0.06f

    .line 383
    .line 384
    .line 385
    const v16, -0x40f0a3d7    # -0.56f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41200000    # 10.0f

    .line 395
    .line 396
    const/high16 v18, 0x41a00000    # 20.0f

    .line 397
    .line 398
    const v13, 0x41591eb8    # 13.57f

    .line 399
    .line 400
    .line 401
    const v14, 0x4194cccd    # 18.6f

    .line 402
    .line 403
    .line 404
    const v15, 0x413f3333    # 11.95f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x41a00000    # 20.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41900000    # 18.0f

    .line 416
    .line 417
    const v2, 0x4172b852    # 15.17f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x412d47ae    # 10.83f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x41000000    # 8.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x3f5eb852    # 0.87f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x3fbd70a4    # 1.48f

    .line 438
    .line 439
    .line 440
    const v18, 0x3f266666    # 0.65f

    .line 441
    .line 442
    .line 443
    const v13, 0x3f0f5c29    # 0.56f

    .line 444
    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const v15, 0x3f8ccccd    # 1.1f

    .line 448
    .line 449
    .line 450
    const v16, 0x3e75c28f    # 0.24f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x3f30a3d7    # 0.69f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x3f400000    # 0.75f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x40228f5c    # 2.54f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3fcccccd    # 1.6f

    .line 471
    .line 472
    .line 473
    const v18, 0x3fcccccd    # 1.6f

    .line 474
    .line 475
    .line 476
    const v13, 0x3f6147ae    # 0.88f

    .line 477
    .line 478
    .line 479
    const v15, 0x3fcccccd    # 1.6f

    .line 480
    .line 481
    .line 482
    const v16, 0x3f3851ec    # 0.72f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x4172b852    # 15.17f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40b33333    # 5.6f

    .line 498
    .line 499
    .line 500
    const v2, 0x41a33333    # 20.4f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x3f400000    # 0.75f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x3ee147ae    # 0.44f

    .line 512
    .line 513
    .line 514
    const v18, 0x3f3d70a4    # 0.74f

    .line 515
    .line 516
    .line 517
    const v13, 0x3ec28f5c    # 0.38f

    .line 518
    .line 519
    .line 520
    const v15, 0x3f1eb852    # 0.62f

    .line 521
    .line 522
    .line 523
    const v16, 0x3ed1eb85    # 0.41f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41980000    # 19.0f

    .line 530
    .line 531
    const/high16 v2, 0x41300000    # 11.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x40e00000    # 7.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, -0x41000000    # -0.5f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x41900000    # 18.0f

    .line 547
    .line 548
    const/high16 v18, 0x40d00000    # 6.5f

    .line 549
    .line 550
    const v13, 0x4191c28f    # 18.22f

    .line 551
    .line 552
    .line 553
    const/high16 v14, 0x40e00000    # 7.0f

    .line 554
    .line 555
    const/high16 v15, 0x41900000    # 18.0f

    .line 556
    .line 557
    const v16, 0x40d8f5c3    # 6.78f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, -0x3f800000    # -4.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x41940000    # 18.5f

    .line 569
    .line 570
    const/high16 v18, 0x40000000    # 2.0f

    .line 571
    .line 572
    const/high16 v13, 0x41900000    # 18.0f

    .line 573
    .line 574
    const v14, 0x400e147b    # 2.22f

    .line 575
    .line 576
    .line 577
    const v15, 0x4191c28f    # 18.22f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x40000000    # 2.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x402eb852    # 2.73f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, 0x3eeb851f    # 0.46f

    .line 592
    .line 593
    .line 594
    const v18, 0x3f333333    # 0.7f

    .line 595
    .line 596
    .line 597
    const v13, 0x3eb851ec    # 0.36f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const v15, 0x3f19999a    # 0.6f

    .line 602
    .line 603
    .line 604
    const v16, 0x3ebd70a4    # 0.37f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x40b33333    # 5.6f

    .line 611
    .line 612
    .line 613
    const v2, 0x41a33333    # 20.4f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/16 v16, 0x3800

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const/high16 v9, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v12, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v13, 0x0

    .line 640
    const/4 v15, 0x0

    .line 641
    const-string v4, ""

    .line 642
    .line 643
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    sput-object v0, Landroidx/compose/material/icons/rounded/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 652
    .line 653
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    return-object v0
.end method

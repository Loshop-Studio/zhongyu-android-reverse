.class public final Landroidx/compose/material/icons/outlined/BackHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _backHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBackHand(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BackHand"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 78
    .line 79
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x404f5c29    # -1.38f

    .line 83
    .line 84
    .line 85
    const v15, -0x4070a3d7    # -1.12f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x41000000    # -0.5f

    .line 94
    .line 95
    const v18, 0x3d4ccccd    # 0.05f

    .line 96
    .line 97
    .line 98
    const v13, -0x41d1eb85    # -0.17f

    .line 99
    .line 100
    .line 101
    const/4 v14, 0x0

    .line 102
    const v15, -0x4151eb85    # -0.34f

    .line 103
    .line 104
    .line 105
    const v16, 0x3ca3d70a    # 0.02f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 117
    .line 118
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const v14, -0x404f5c29    # -1.38f

    .line 122
    .line 123
    .line 124
    const v15, -0x4070a3d7    # -1.12f

    .line 125
    .line 126
    .line 127
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x40d47ae1    # -0.67f

    .line 133
    .line 134
    .line 135
    const v18, 0x3db851ec    # 0.09f

    .line 136
    .line 137
    .line 138
    const v13, -0x41947ae1    # -0.23f

    .line 139
    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const v15, -0x41147ae1    # -0.46f

    .line 143
    .line 144
    .line 145
    const v16, 0x3cf5c28f    # 0.03f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x41480000    # 12.5f

    .line 152
    .line 153
    const/16 v18, 0x0

    .line 154
    .line 155
    const v13, 0x41675c29    # 14.46f

    .line 156
    .line 157
    .line 158
    const v14, 0x3f28f5c3    # 0.66f

    .line 159
    .line 160
    .line 161
    const v15, 0x4158f5c3    # 13.56f

    .line 162
    .line 163
    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x3fe28f5c    # -2.46f

    .line 170
    .line 171
    .line 172
    const v18, 0x4003d70a    # 2.06f

    .line 173
    .line 174
    .line 175
    const v13, -0x40628f5c    # -1.23f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/high16 v15, -0x3ff00000    # -2.25f

    .line 180
    .line 181
    const v16, 0x3f63d70a    # 0.89f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41180000    # 9.5f

    .line 188
    .line 189
    const/high16 v18, 0x40000000    # 2.0f

    .line 190
    .line 191
    const v13, 0x411deb85    # 9.87f

    .line 192
    .line 193
    .line 194
    const v14, 0x400147ae    # 2.02f

    .line 195
    .line 196
    .line 197
    const v15, 0x411b0a3d    # 9.69f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x40e00000    # 7.0f

    .line 206
    .line 207
    const/high16 v18, 0x40900000    # 4.5f

    .line 208
    .line 209
    const v13, 0x4101eb85    # 8.12f

    .line 210
    .line 211
    .line 212
    const/high16 v14, 0x40000000    # 2.0f

    .line 213
    .line 214
    const/high16 v15, 0x40e00000    # 7.0f

    .line 215
    .line 216
    const v16, 0x4047ae14    # 3.12f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x40bc7ae1    # 5.89f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x4063d70a    # -1.22f

    .line 229
    .line 230
    .line 231
    const v18, -0x40d70a3d    # -0.66f

    .line 232
    .line 233
    .line 234
    const v13, -0x4151eb85    # -0.34f

    .line 235
    .line 236
    .line 237
    const v14, -0x416147ae    # -0.31f

    .line 238
    .line 239
    .line 240
    const v15, -0x40bd70a4    # -0.76f

    .line 241
    .line 242
    .line 243
    const v16, -0x40f5c28f    # -0.54f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x40a051ec    # 5.01f

    .line 250
    .line 251
    .line 252
    const v2, 0x411851ec    # 9.52f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x3ff3d70a    # -2.19f

    .line 259
    .line 260
    .line 261
    const v18, 0x3f547ae1    # 0.83f

    .line 262
    .line 263
    .line 264
    const v13, -0x40ab851f    # -0.83f

    .line 265
    .line 266
    .line 267
    const v14, -0x41947ae1    # -0.23f

    .line 268
    .line 269
    .line 270
    const v15, -0x40266666    # -1.7f

    .line 271
    .line 272
    .line 273
    const v16, 0x3db851ec    # 0.09f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x41e66666    # -0.15f

    .line 280
    .line 281
    .line 282
    const v18, 0x3ff9999a    # 1.95f

    .line 283
    .line 284
    .line 285
    const v13, -0x413d70a4    # -0.38f

    .line 286
    .line 287
    .line 288
    const v14, 0x3f11eb85    # 0.57f

    .line 289
    .line 290
    .line 291
    const v15, -0x41333333    # -0.4f

    .line 292
    .line 293
    .line 294
    const v16, 0x3fa7ae14    # 1.31f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x4023d70a    # 2.56f

    .line 301
    .line 302
    .line 303
    const v2, 0x40cdc28f    # 6.43f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x41500000    # 13.0f

    .line 310
    .line 311
    const/high16 v18, 0x41c00000    # 24.0f

    .line 312
    .line 313
    const v13, 0x40cfae14    # 6.49f

    .line 314
    .line 315
    .line 316
    const v14, 0x41af47ae    # 21.91f

    .line 317
    .line 318
    .line 319
    const v15, 0x41191eb8    # 9.57f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x41c00000    # 24.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41000000    # 8.0f

    .line 332
    .line 333
    const/high16 v18, -0x3f000000    # -8.0f

    .line 334
    .line 335
    const v13, 0x408d70a4    # 4.42f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const/high16 v15, 0x41000000    # 8.0f

    .line 340
    .line 341
    const v16, -0x3f9ae148    # -3.58f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40e00000    # 7.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41800000    # 16.0f

    .line 356
    .line 357
    const/high16 v2, 0x41980000    # 19.0f

    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, -0x3f400000    # -6.0f

    .line 363
    .line 364
    const/high16 v18, 0x40c00000    # 6.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, 0x4053d70a    # 3.31f

    .line 368
    .line 369
    .line 370
    const v15, -0x3fd3d70a    # -2.69f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x40c00000    # 6.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/4 v0, 0x0

    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x3f42e148    # -5.91f

    .line 383
    .line 384
    .line 385
    const v18, -0x3f7fae14    # -4.01f

    .line 386
    .line 387
    .line 388
    const v13, -0x3fd8f5c3    # -2.61f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const v15, -0x3f61999a    # -4.95f

    .line 393
    .line 394
    .line 395
    const v16, -0x40347ae1    # -1.59f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x3fd9999a    # -2.6f

    .line 402
    .line 403
    .line 404
    const v2, -0x3f2eb852    # -6.54f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x3f07ae14    # 0.53f

    .line 411
    .line 412
    .line 413
    const v2, 0x3e0f5c29    # 0.14f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const v18, 0x3f666666    # 0.9f

    .line 422
    .line 423
    .line 424
    const v13, 0x3eeb851f    # 0.46f

    .line 425
    .line 426
    .line 427
    const v14, 0x3df5c28f    # 0.12f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f547ae1    # 0.83f

    .line 431
    .line 432
    .line 433
    const v16, 0x3eeb851f    # 0.46f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x41700000    # 15.0f

    .line 440
    .line 441
    const/high16 v2, 0x40e00000    # 7.0f

    .line 442
    .line 443
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x40900000    # 4.5f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x41180000    # 9.5f

    .line 457
    .line 458
    const/high16 v18, 0x40800000    # 4.0f

    .line 459
    .line 460
    const/high16 v13, 0x41100000    # 9.0f

    .line 461
    .line 462
    const v14, 0x40870a3d    # 4.22f

    .line 463
    .line 464
    .line 465
    const v15, 0x4113851f    # 9.22f

    .line 466
    .line 467
    .line 468
    const/high16 v16, 0x40800000    # 4.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x40870a3d    # 4.22f

    .line 474
    .line 475
    .line 476
    const/high16 v2, 0x41200000    # 10.0f

    .line 477
    .line 478
    const/high16 v4, 0x40900000    # 4.5f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41400000    # 12.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40000000    # 2.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x40200000    # 2.5f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x41480000    # 12.5f

    .line 499
    .line 500
    const/high16 v18, 0x40000000    # 2.0f

    .line 501
    .line 502
    const/high16 v13, 0x41400000    # 12.0f

    .line 503
    .line 504
    const v14, 0x400e147b    # 2.22f

    .line 505
    .line 506
    .line 507
    const v15, 0x4143851f    # 12.22f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x40000000    # 2.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x400e147b    # 2.22f

    .line 516
    .line 517
    .line 518
    const/high16 v2, 0x41500000    # 13.0f

    .line 519
    .line 520
    const/high16 v4, 0x40200000    # 2.5f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x41400000    # 12.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x40000000    # 2.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40800000    # 4.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x3f000000    # 0.5f

    .line 541
    .line 542
    const/high16 v18, -0x41000000    # -0.5f

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const v14, -0x4170a3d7    # -0.28f

    .line 546
    .line 547
    .line 548
    const v15, 0x3e6147ae    # 0.22f

    .line 549
    .line 550
    .line 551
    const/high16 v16, -0x41000000    # -0.5f

    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x406e147b    # 3.72f

    .line 557
    .line 558
    .line 559
    const/high16 v2, 0x40800000    # 4.0f

    .line 560
    .line 561
    const/high16 v4, 0x41800000    # 16.0f

    .line 562
    .line 563
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x41000000    # 8.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x40000000    # 2.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x40e00000    # 7.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x40d70a3d    # 6.72f

    .line 585
    .line 586
    .line 587
    const/high16 v2, 0x41980000    # 19.0f

    .line 588
    .line 589
    const/high16 v4, 0x40e00000    # 7.0f

    .line 590
    .line 591
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x41800000    # 16.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    const/16 v16, 0x3800

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    const/high16 v6, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/high16 v8, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v7, 0x0

    .line 615
    const/high16 v9, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/high16 v12, 0x3f800000    # 1.0f

    .line 618
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
    move-result-object v0

    .line 627
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    sput-object v0, Landroidx/compose/material/icons/outlined/BackHandKt;->_backHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 632
    .line 633
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    return-object v0
.end method

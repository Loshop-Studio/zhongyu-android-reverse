.class public final Landroidx/compose/material/icons/rounded/NoTransferKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoTransfer(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoTransfer"

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
    const v0, 0x403ccccd    # 2.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b8f5c3    # 5.78f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v13, 0x40e7ae14    # 7.24f

    .line 84
    .line 85
    .line 86
    const v14, 0x400a3d71    # 2.16f

    .line 87
    .line 88
    .line 89
    const v15, 0x4117ae14    # 9.48f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40000000    # 2.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x41000000    # 8.0f

    .line 98
    .line 99
    const/high16 v18, 0x40800000    # 4.0f

    .line 100
    .line 101
    const v13, 0x408d70a4    # 4.42f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/high16 v15, 0x41000000    # 8.0f

    .line 106
    .line 107
    const/high16 v16, 0x3f000000    # 0.5f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x41200000    # 10.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x41bd70a4    # -0.19f

    .line 118
    .line 119
    .line 120
    const v18, 0x3f7ae148    # 0.98f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, 0x3eb33333    # 0.35f

    .line 125
    .line 126
    .line 127
    const v15, -0x425c28f6    # -0.08f

    .line 128
    .line 129
    .line 130
    const v16, 0x3f2b851f    # 0.67f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x415d47ae    # 13.83f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x41300000    # 11.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41900000    # 18.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40c00000    # 6.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x410d47ae    # 8.83f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x403ccccd    # 2.95f

    .line 161
    .line 162
    .line 163
    const v2, 0x40b8f5c3    # 5.78f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x41a3eb85    # 20.49f

    .line 173
    .line 174
    .line 175
    const v2, 0x41af3333    # 21.9f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x404b851f    # -1.41f

    .line 182
    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const v13, -0x413851ec    # -0.39f

    .line 187
    .line 188
    .line 189
    const v14, 0x3ec7ae14    # 0.39f

    .line 190
    .line 191
    .line 192
    const v15, -0x407d70a4    # -1.02f

    .line 193
    .line 194
    .line 195
    const v16, 0x3ec7ae14    # 0.39f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, -0x407eb852    # -1.01f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x418c0000    # 17.5f

    .line 208
    .line 209
    const/high16 v18, 0x41a80000    # 21.0f

    .line 210
    .line 211
    const v13, 0x418f1eb8    # 17.89f

    .line 212
    .line 213
    .line 214
    const v14, 0x41a7ae14    # 20.96f

    .line 215
    .line 216
    .line 217
    const v15, 0x418d999a    # 17.7f

    .line 218
    .line 219
    .line 220
    const/high16 v16, 0x41a80000    # 21.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, -0x40400000    # -1.5f

    .line 226
    .line 227
    const/high16 v18, -0x40400000    # -1.5f

    .line 228
    .line 229
    const v13, -0x40ab851f    # -0.83f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const/high16 v15, -0x40400000    # -1.5f

    .line 234
    .line 235
    const v16, -0x40d1eb85    # -0.68f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x41980000    # 19.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x3f000000    # 0.5f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x40d00000    # 6.5f

    .line 257
    .line 258
    const/high16 v18, 0x41a80000    # 21.0f

    .line 259
    .line 260
    const/high16 v13, 0x41000000    # 8.0f

    .line 261
    .line 262
    const v14, 0x41a2a3d7    # 20.33f

    .line 263
    .line 264
    .line 265
    const v15, 0x40ea8f5c    # 7.33f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x41a80000    # 21.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x41a2a3d7    # 20.33f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x419c0000    # 19.5f

    .line 277
    .line 278
    const/high16 v4, 0x40a00000    # 5.0f

    .line 279
    .line 280
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, -0x405c28f6    # -1.28f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x40800000    # 4.0f

    .line 290
    .line 291
    const/high16 v18, 0x41800000    # 16.0f

    .line 292
    .line 293
    const v13, 0x408c7ae1    # 4.39f

    .line 294
    .line 295
    .line 296
    const v14, 0x418d5c29    # 17.67f

    .line 297
    .line 298
    .line 299
    const/high16 v15, 0x40800000    # 4.0f

    .line 300
    .line 301
    const v16, 0x41870a3d    # 16.88f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x40da8f5c    # 6.83f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, -0x400ccccd    # -1.9f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const v18, -0x404b851f    # -1.41f

    .line 322
    .line 323
    .line 324
    const v13, -0x413851ec    # -0.39f

    .line 325
    .line 326
    .line 327
    const v14, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    const v15, -0x413851ec    # -0.39f

    .line 331
    .line 332
    .line 333
    const v16, -0x407d70a4    # -1.02f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3fb47ae1    # 1.41f

    .line 340
    .line 341
    .line 342
    const/16 v18, 0x0

    .line 343
    .line 344
    const v13, 0x3ec7ae14    # 0.39f

    .line 345
    .line 346
    .line 347
    const v15, 0x3f828f5c    # 1.02f

    .line 348
    .line 349
    .line 350
    const v16, -0x413851ec    # -0.39f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x4187c28f    # 16.97f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x41a3eb85    # 20.49f

    .line 363
    .line 364
    .line 365
    const v18, 0x41af3333    # 21.9f

    .line 366
    .line 367
    .line 368
    const v13, 0x41a70a3d    # 20.88f

    .line 369
    .line 370
    .line 371
    const v14, 0x41a70a3d    # 20.88f

    .line 372
    .line 373
    .line 374
    const v15, 0x41a70a3d    # 20.88f

    .line 375
    .line 376
    .line 377
    const v16, 0x41ac147b    # 21.51f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41780000    # 15.5f

    .line 387
    .line 388
    const/high16 v2, 0x41100000    # 9.0f

    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x40f00000    # 7.5f

    .line 394
    .line 395
    const/high16 v18, 0x41600000    # 14.0f

    .line 396
    .line 397
    const/high16 v13, 0x41100000    # 9.0f

    .line 398
    .line 399
    const v14, 0x416ab852    # 14.67f

    .line 400
    .line 401
    .line 402
    const v15, 0x410547ae    # 8.33f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x41600000    # 14.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x416ab852    # 14.67f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x41780000    # 15.5f

    .line 414
    .line 415
    const/high16 v4, 0x40c00000    # 6.0f

    .line 416
    .line 417
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v18, 0x41880000    # 17.0f

    .line 421
    .line 422
    const/high16 v13, 0x40c00000    # 6.0f

    .line 423
    .line 424
    const v14, 0x4182a3d7    # 16.33f

    .line 425
    .line 426
    .line 427
    const v15, 0x40d570a4    # 6.67f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x41880000    # 17.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x4182a3d7    # 16.33f

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x41100000    # 9.0f

    .line 439
    .line 440
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x4102b852    # 8.17f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x41300000    # 11.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x410d47ae    # 8.83f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x40c00000    # 6.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41300000    # 11.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x4102b852    # 8.17f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/16 v16, 0x3800

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    const/high16 v6, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v8, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/high16 v9, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const/4 v14, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Landroidx/compose/material/icons/rounded/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v0
.end method

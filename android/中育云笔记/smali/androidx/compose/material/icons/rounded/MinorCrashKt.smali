.class public final Landroidx/compose/material/icons/rounded/MinorCrashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _minorCrash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMinorCrash(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MinorCrashKt;->_minorCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MinorCrash"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 71
    .line 72
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    const/high16 v18, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v13, 0x3f51eb85    # 0.82f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 86
    .line 87
    const v16, -0x40d47ae1    # -0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x3f1ae148    # -7.16f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x421eb852    # -0.11f

    .line 100
    .line 101
    .line 102
    const v18, -0x40d70a3d    # -0.66f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, -0x419eb852    # -0.22f

    .line 107
    .line 108
    .line 109
    const v15, -0x42dc28f6    # -0.04f

    .line 110
    .line 111
    .line 112
    const v16, -0x4119999a    # -0.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x3f4a8f5c    # -5.67f

    .line 119
    .line 120
    .line 121
    const v2, -0x4003d70a    # -1.97f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x418c0000    # 17.5f

    .line 128
    .line 129
    const/high16 v18, 0x41000000    # 8.0f

    .line 130
    .line 131
    const v13, 0x4195c28f    # 18.72f

    .line 132
    .line 133
    .line 134
    const v14, 0x4106b852    # 8.42f

    .line 135
    .line 136
    .line 137
    const v15, 0x419147ae    # 18.16f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x41000000    # 8.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, 0x40a28f5c    # 5.08f

    .line 151
    .line 152
    .line 153
    const v18, 0x411028f6    # 9.01f

    .line 154
    .line 155
    .line 156
    const v13, 0x40bae148    # 5.84f

    .line 157
    .line 158
    .line 159
    const/high16 v14, 0x41000000    # 8.0f

    .line 160
    .line 161
    const v15, 0x40a947ae    # 5.29f

    .line 162
    .line 163
    .line 164
    const v16, 0x4106b852    # 8.42f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x40b570a4    # 5.67f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40400000    # 3.0f

    .line 177
    .line 178
    const v18, 0x417570a4    # 15.34f

    .line 179
    .line 180
    .line 181
    const v13, 0x40428f5c    # 3.04f

    .line 182
    .line 183
    .line 184
    const v14, 0x416e3d71    # 14.89f

    .line 185
    .line 186
    .line 187
    const/high16 v15, 0x40400000    # 3.0f

    .line 188
    .line 189
    const v16, 0x4171c28f    # 15.11f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x40e51eb8    # 7.16f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x40900000    # 4.5f

    .line 202
    .line 203
    const/high16 v18, 0x41c00000    # 24.0f

    .line 204
    .line 205
    const/high16 v13, 0x40400000    # 3.0f

    .line 206
    .line 207
    const v14, 0x41baa3d7    # 23.33f

    .line 208
    .line 209
    .line 210
    const v15, 0x406b851f    # 3.68f

    .line 211
    .line 212
    .line 213
    const/high16 v16, 0x41c00000    # 24.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x41baa3d7    # 23.33f

    .line 219
    .line 220
    .line 221
    const/high16 v2, 0x41b40000    # 22.5f

    .line 222
    .line 223
    const/high16 v4, 0x40c00000    # 6.0f

    .line 224
    .line 225
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41b00000    # 22.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41400000    # 12.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x3f000000    # 0.5f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x419c0000    # 19.5f

    .line 244
    .line 245
    const/high16 v13, 0x41900000    # 18.0f

    .line 246
    .line 247
    const v15, 0x41955c29    # 18.67f

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 257
    .line 258
    const v2, 0x40db3333    # 6.85f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x4124a3d7    # 10.29f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x3f851eb8    # 1.04f

    .line 271
    .line 272
    .line 273
    const/high16 v2, 0x40400000    # 3.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x40b9eb85    # 5.81f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41200000    # 10.0f

    .line 285
    .line 286
    const v2, 0x40db3333    # 6.85f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x418c0000    # 17.5f

    .line 296
    .line 297
    const/high16 v2, 0x40c00000    # 6.0f

    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x40f00000    # 7.5f

    .line 303
    .line 304
    const/high16 v18, 0x41800000    # 16.0f

    .line 305
    .line 306
    const/high16 v13, 0x40c00000    # 6.0f

    .line 307
    .line 308
    const v14, 0x41855c29    # 16.67f

    .line 309
    .line 310
    .line 311
    const v15, 0x40d570a4    # 6.67f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x41800000    # 16.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x41855c29    # 16.67f

    .line 320
    .line 321
    .line 322
    const/high16 v2, 0x41100000    # 9.0f

    .line 323
    .line 324
    const/high16 v4, 0x418c0000    # 17.5f

    .line 325
    .line 326
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x410547ae    # 8.33f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x40f00000    # 7.5f

    .line 333
    .line 334
    const/high16 v4, 0x41980000    # 19.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4192a3d7    # 18.33f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x418c0000    # 17.5f

    .line 343
    .line 344
    const/high16 v4, 0x40c00000    # 6.0f

    .line 345
    .line 346
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41700000    # 15.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 358
    .line 359
    const/high16 v18, -0x40400000    # -1.5f

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, -0x40ab851f    # -0.83f

    .line 363
    .line 364
    .line 365
    const v15, 0x3f2b851f    # 0.67f

    .line 366
    .line 367
    .line 368
    const/high16 v16, -0x40400000    # -1.5f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3f2b851f    # 0.67f

    .line 374
    .line 375
    .line 376
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 377
    .line 378
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x418aa3d7    # 17.33f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41840000    # 16.5f

    .line 385
    .line 386
    const/high16 v4, 0x41980000    # 19.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x4192a3d7    # 18.33f

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x41700000    # 15.0f

    .line 395
    .line 396
    const/high16 v4, 0x418c0000    # 17.5f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x410b5c29    # 8.71f

    .line 405
    .line 406
    .line 407
    const v2, 0x40b6b852    # 5.71f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x404b851f    # -1.41f

    .line 414
    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const v13, -0x413851ec    # -0.39f

    .line 419
    .line 420
    .line 421
    const v14, 0x3ec7ae14    # 0.39f

    .line 422
    .line 423
    .line 424
    const v15, -0x407d70a4    # -1.02f

    .line 425
    .line 426
    .line 427
    const v16, 0x3ec7ae14    # 0.39f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x4083d70a    # 4.12f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const v18, -0x404b851f    # -1.41f

    .line 442
    .line 443
    .line 444
    const v14, -0x413851ec    # -0.39f

    .line 445
    .line 446
    .line 447
    const v15, -0x413851ec    # -0.39f

    .line 448
    .line 449
    .line 450
    const v16, -0x407d70a4    # -1.02f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x3f828f5c    # 1.02f

    .line 457
    .line 458
    .line 459
    const v2, 0x3fb47ae1    # 1.41f

    .line 460
    .line 461
    .line 462
    const/4 v4, 0x0

    .line 463
    const v6, -0x413851ec    # -0.39f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3fcb851f    # 1.59f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x410b5c29    # 8.71f

    .line 476
    .line 477
    .line 478
    const v18, 0x40b6b852    # 5.71f

    .line 479
    .line 480
    .line 481
    const v13, 0x4111999a    # 9.1f

    .line 482
    .line 483
    .line 484
    const v14, 0x4095c28f    # 4.68f

    .line 485
    .line 486
    .line 487
    const v15, 0x4111999a    # 9.1f

    .line 488
    .line 489
    .line 490
    const v16, 0x40aa3d71    # 5.32f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x419251ec    # 18.29f

    .line 500
    .line 501
    .line 502
    const v2, 0x402d70a4    # 2.71f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const v18, 0x3fb47ae1    # 1.41f

    .line 511
    .line 512
    .line 513
    const v13, 0x3ec7ae14    # 0.39f

    .line 514
    .line 515
    .line 516
    const v14, 0x3ec7ae14    # 0.39f

    .line 517
    .line 518
    .line 519
    const v15, 0x3ec7ae14    # 0.39f

    .line 520
    .line 521
    .line 522
    const v16, 0x3f828f5c    # 1.02f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, -0x40347ae1    # -1.59f

    .line 529
    .line 530
    .line 531
    const v2, 0x3fcb851f    # 1.59f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x404b851f    # -1.41f

    .line 538
    .line 539
    .line 540
    const/16 v18, 0x0

    .line 541
    .line 542
    const v13, -0x413851ec    # -0.39f

    .line 543
    .line 544
    .line 545
    const v15, -0x407d70a4    # -1.02f

    .line 546
    .line 547
    .line 548
    const v16, 0x3ec7ae14    # 0.39f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x407d70a4    # -1.02f

    .line 555
    .line 556
    .line 557
    const v2, -0x404b851f    # -1.41f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, -0x40347ae1    # -1.59f

    .line 564
    .line 565
    .line 566
    const v2, 0x3fcb851f    # 1.59f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x419251ec    # 18.29f

    .line 573
    .line 574
    .line 575
    const v18, 0x402d70a4    # 2.71f

    .line 576
    .line 577
    .line 578
    const v13, 0x418a28f6    # 17.27f

    .line 579
    .line 580
    .line 581
    const v14, 0x40147ae1    # 2.32f

    .line 582
    .line 583
    .line 584
    const v15, 0x418f3333    # 17.9f

    .line 585
    .line 586
    .line 587
    const v16, 0x40147ae1    # 2.32f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x40a00000    # 5.0f

    .line 597
    .line 598
    const/high16 v2, 0x41400000    # 12.0f

    .line 599
    .line 600
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, -0x40800000    # -1.0f

    .line 604
    .line 605
    const/high16 v18, -0x40800000    # -1.0f

    .line 606
    .line 607
    const v13, -0x40f33333    # -0.55f

    .line 608
    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    const/high16 v15, -0x40800000    # -1.0f

    .line 612
    .line 613
    const v16, -0x4119999a    # -0.45f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x3f800000    # 1.0f

    .line 620
    .line 621
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const v14, -0x40f33333    # -0.55f

    .line 628
    .line 629
    .line 630
    const v15, 0x3ee66666    # 0.45f

    .line 631
    .line 632
    .line 633
    const/high16 v16, -0x40800000    # -1.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x3ee66666    # 0.45f

    .line 639
    .line 640
    .line 641
    const/high16 v2, 0x3f800000    # 1.0f

    .line 642
    .line 643
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x40400000    # 3.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x41400000    # 12.0f

    .line 652
    .line 653
    const/high16 v18, 0x40a00000    # 5.0f

    .line 654
    .line 655
    const/high16 v13, 0x41500000    # 13.0f

    .line 656
    .line 657
    const v14, 0x4091999a    # 4.55f

    .line 658
    .line 659
    .line 660
    const v15, 0x4148cccd    # 12.55f

    .line 661
    .line 662
    .line 663
    const/high16 v16, 0x40a00000    # 5.0f

    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const/16 v16, 0x3800

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const/high16 v6, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v8, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/4 v7, 0x0

    .line 684
    const/high16 v9, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/high16 v12, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v14, 0x0

    .line 690
    const/4 v15, 0x0

    .line 691
    const-string v4, ""

    .line 692
    .line 693
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sput-object v0, Landroidx/compose/material/icons/rounded/MinorCrashKt;->_minorCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 702
    .line 703
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/CarCrashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarCrash(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CarCrash"

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
    const/high16 v0, 0x3f800000    # 1.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f600000    # -5.0f

    .line 78
    .line 79
    const/high16 v18, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v13, -0x3fcf5c29    # -2.76f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3f600000    # -5.0f

    .line 86
    .line 87
    const v16, 0x400f5c29    # 2.24f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x400f5c29    # 2.24f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x3ff0a3d7    # -2.24f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x3f600000    # -5.0f

    .line 105
    .line 106
    const/high16 v4, 0x40a00000    # 5.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x41a6147b    # 20.76f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const/high16 v4, 0x41900000    # 18.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40e00000    # 7.0f

    .line 125
    .line 126
    const/high16 v2, 0x41900000    # 18.0f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, -0x41000000    # -0.5f

    .line 132
    .line 133
    const/high16 v18, -0x41000000    # -0.5f

    .line 134
    .line 135
    const v13, -0x4170a3d7    # -0.28f

    .line 136
    .line 137
    .line 138
    const/high16 v15, -0x41000000    # -0.5f

    .line 139
    .line 140
    const v16, -0x419eb852    # -0.22f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x41900000    # 18.0f

    .line 152
    .line 153
    const/high16 v18, 0x40400000    # 3.0f

    .line 154
    .line 155
    const/high16 v13, 0x418c0000    # 17.5f

    .line 156
    .line 157
    const v14, 0x404e147b    # 3.22f

    .line 158
    .line 159
    .line 160
    const v15, 0x418dc28f    # 17.72f

    .line 161
    .line 162
    .line 163
    const/high16 v16, 0x40400000    # 3.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x3e6147ae    # 0.22f

    .line 169
    .line 170
    .line 171
    const/high16 v2, 0x3f000000    # 0.5f

    .line 172
    .line 173
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40400000    # 3.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v18, 0x40e00000    # 7.0f

    .line 182
    .line 183
    const/high16 v13, 0x41940000    # 18.5f

    .line 184
    .line 185
    const v14, 0x40d8f5c3    # 6.78f

    .line 186
    .line 187
    .line 188
    const v15, 0x41923d71    # 18.28f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x40e00000    # 7.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41080000    # 8.5f

    .line 200
    .line 201
    const/high16 v2, 0x41940000    # 18.5f

    .line 202
    .line 203
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v18, 0x41100000    # 9.0f

    .line 207
    .line 208
    const v14, 0x410c7ae1    # 8.78f

    .line 209
    .line 210
    .line 211
    const/high16 v16, 0x41100000    # 9.0f

    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, -0x419eb852    # -0.22f

    .line 217
    .line 218
    .line 219
    const/high16 v2, -0x41000000    # -0.5f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x418dc28f    # 17.72f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x41000000    # 8.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x4103851f    # 8.22f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x41080000    # 8.5f

    .line 236
    .line 237
    const/high16 v4, 0x41940000    # 18.5f

    .line 238
    .line 239
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x419c0000    # 19.5f

    .line 246
    .line 247
    const/high16 v2, 0x41a00000    # 20.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 253
    .line 254
    const/high16 v18, -0x40400000    # -1.5f

    .line 255
    .line 256
    const v13, 0x3f51eb85    # 0.82f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 261
    .line 262
    const v16, -0x40d47ae1    # -0.67f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x3f3a3d71    # -6.18f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x3fba3d71    # -3.09f

    .line 275
    .line 276
    .line 277
    const v18, 0x3f2e147b    # 0.68f

    .line 278
    .line 279
    .line 280
    const v13, -0x4079999a    # -1.05f

    .line 281
    .line 282
    .line 283
    const v14, 0x3f028f5c    # 0.51f

    .line 284
    .line 285
    .line 286
    const v15, -0x3ff5c28f    # -2.16f

    .line 287
    .line 288
    .line 289
    const v16, 0x3f30a3d7    # 0.69f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x3db851ec    # 0.09f

    .line 296
    .line 297
    .line 298
    const/high16 v18, 0x3f000000    # 0.5f

    .line 299
    .line 300
    const v13, 0x3d75c28f    # 0.06f

    .line 301
    .line 302
    .line 303
    const v14, 0x3e23d70a    # 0.16f

    .line 304
    .line 305
    .line 306
    const v15, 0x3db851ec    # 0.09f

    .line 307
    .line 308
    .line 309
    const v16, 0x3ea8f5c3    # 0.33f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x40400000    # -1.5f

    .line 316
    .line 317
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const v14, 0x3f547ae1    # 0.83f

    .line 321
    .line 322
    .line 323
    const v15, -0x40d47ae1    # -0.67f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x416547ae    # 14.33f

    .line 332
    .line 333
    .line 334
    const/high16 v2, 0x41580000    # 13.5f

    .line 335
    .line 336
    const/high16 v4, 0x41700000    # 15.0f

    .line 337
    .line 338
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3ec7ae14    # 0.39f

    .line 342
    .line 343
    .line 344
    const v18, -0x407eb852    # -1.01f

    .line 345
    .line 346
    .line 347
    const v14, -0x413851ec    # -0.39f

    .line 348
    .line 349
    .line 350
    const v15, 0x3e19999a    # 0.15f

    .line 351
    .line 352
    .line 353
    const v16, -0x40c28f5c    # -0.74f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x3f928f5c    # -3.71f

    .line 360
    .line 361
    .line 362
    const v18, -0x3fa0a3d7    # -3.49f

    .line 363
    .line 364
    .line 365
    const v13, -0x402f5c29    # -1.63f

    .line 366
    .line 367
    .line 368
    const v14, -0x40d70a3d    # -0.66f

    .line 369
    .line 370
    .line 371
    const v15, -0x3fc28f5c    # -2.96f

    .line 372
    .line 373
    .line 374
    const v16, -0x400b851f    # -1.91f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40b9eb85    # 5.81f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3f851eb8    # 1.04f

    .line 387
    .line 388
    .line 389
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41300000    # 11.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x3e947ae1    # 0.29f

    .line 400
    .line 401
    .line 402
    const/high16 v18, -0x40000000    # -2.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x40cf5c29    # -0.69f

    .line 406
    .line 407
    .line 408
    const v15, 0x3dcccccd    # 0.1f

    .line 409
    .line 410
    .line 411
    const v16, -0x4050a3d7    # -1.37f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40d00000    # 6.5f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x40a28f5c    # 5.08f

    .line 423
    .line 424
    .line 425
    const v18, 0x40a051ec    # 5.01f

    .line 426
    .line 427
    .line 428
    const v13, 0x40bae148    # 5.84f

    .line 429
    .line 430
    .line 431
    const/high16 v14, 0x40800000    # 4.0f

    .line 432
    .line 433
    const v15, 0x40a947ae    # 5.29f

    .line 434
    .line 435
    .line 436
    const v16, 0x408d70a4    # 4.42f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, -0x4003d70a    # -1.97f

    .line 443
    .line 444
    .line 445
    const v2, 0x40b570a4    # 5.67f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, 0x40400000    # 3.0f

    .line 452
    .line 453
    const v18, 0x413570a4    # 11.34f

    .line 454
    .line 455
    .line 456
    const v13, 0x40428f5c    # 3.04f

    .line 457
    .line 458
    .line 459
    const v14, 0x412e3d71    # 10.89f

    .line 460
    .line 461
    .line 462
    const/high16 v15, 0x40400000    # 3.0f

    .line 463
    .line 464
    const v16, 0x4131c28f    # 11.11f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x40e51eb8    # 7.16f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x40900000    # 4.5f

    .line 477
    .line 478
    const/high16 v18, 0x41a00000    # 20.0f

    .line 479
    .line 480
    const/high16 v13, 0x40400000    # 3.0f

    .line 481
    .line 482
    const v14, 0x419aa3d7    # 19.33f

    .line 483
    .line 484
    .line 485
    const v15, 0x406ae148    # 3.67f

    .line 486
    .line 487
    .line 488
    const/high16 v16, 0x41a00000    # 20.0f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x419aa3d7    # 19.33f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x40c00000    # 6.0f

    .line 497
    .line 498
    const/high16 v4, 0x41940000    # 18.5f

    .line 499
    .line 500
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x41900000    # 18.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41400000    # 12.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x3f000000    # 0.5f

    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x419c0000    # 19.5f

    .line 519
    .line 520
    const/high16 v13, 0x41900000    # 18.0f

    .line 521
    .line 522
    const v15, 0x419570a4    # 18.68f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40f00000    # 7.5f

    .line 532
    .line 533
    const/high16 v2, 0x41700000    # 15.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x40c00000    # 6.0f

    .line 539
    .line 540
    const/high16 v18, 0x41580000    # 13.5f

    .line 541
    .line 542
    const v13, 0x40d570a4    # 6.67f

    .line 543
    .line 544
    .line 545
    const/high16 v14, 0x41700000    # 15.0f

    .line 546
    .line 547
    const/high16 v15, 0x40c00000    # 6.0f

    .line 548
    .line 549
    const v16, 0x416547ae    # 14.33f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x40d570a4    # 6.67f

    .line 556
    .line 557
    .line 558
    const/high16 v2, 0x40f00000    # 7.5f

    .line 559
    .line 560
    const/high16 v4, 0x41400000    # 12.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x414ab852    # 12.67f

    .line 566
    .line 567
    .line 568
    const/high16 v2, 0x41100000    # 9.0f

    .line 569
    .line 570
    const/high16 v4, 0x41580000    # 13.5f

    .line 571
    .line 572
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x410547ae    # 8.33f

    .line 576
    .line 577
    .line 578
    const/high16 v2, 0x40f00000    # 7.5f

    .line 579
    .line 580
    const/high16 v4, 0x41700000    # 15.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/16 v16, 0x3800

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/high16 v8, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    const/high16 v9, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/high16 v12, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/4 v14, 0x0

    .line 607
    const/4 v15, 0x0

    .line 608
    const-string v4, ""

    .line 609
    .line 610
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    sput-object v0, Landroidx/compose/material/icons/rounded/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-object v0
.end method

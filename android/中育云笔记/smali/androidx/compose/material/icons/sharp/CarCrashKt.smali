.class public final Landroidx/compose/material/icons/sharp/CarCrashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarCrash(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.CarCrash"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v2, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v2, 0x41900000    # 18.0f

    .line 115
    .line 116
    const/high16 v4, 0x3f800000    # 1.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v2, 0x41940000    # 18.5f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40400000    # 3.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x40e00000    # 7.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41000000    # 8.0f

    .line 155
    .line 156
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, -0x40800000    # -1.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41000000    # 8.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41940000    # 18.5f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x418f47ae    # 17.91f

    .line 183
    .line 184
    .line 185
    const/high16 v2, 0x41500000    # 13.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3db851ec    # 0.09f

    .line 191
    .line 192
    .line 193
    const/high16 v18, 0x3f000000    # 0.5f

    .line 194
    .line 195
    const v13, 0x3d75c28f    # 0.06f

    .line 196
    .line 197
    .line 198
    const v14, 0x3e23d70a    # 0.16f

    .line 199
    .line 200
    .line 201
    const v15, 0x3db851ec    # 0.09f

    .line 202
    .line 203
    .line 204
    const v16, 0x3ea8f5c3    # 0.33f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x40400000    # -1.5f

    .line 211
    .line 212
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const v14, 0x3f547ae1    # 0.83f

    .line 216
    .line 217
    .line 218
    const v15, -0x40d47ae1    # -0.67f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x416547ae    # 14.33f

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x41580000    # 13.5f

    .line 230
    .line 231
    const/high16 v4, 0x41700000    # 15.0f

    .line 232
    .line 233
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3ec7ae14    # 0.39f

    .line 237
    .line 238
    .line 239
    const v18, -0x407eb852    # -1.01f

    .line 240
    .line 241
    .line 242
    const v14, -0x413851ec    # -0.39f

    .line 243
    .line 244
    .line 245
    const v15, 0x3e19999a    # 0.15f

    .line 246
    .line 247
    .line 248
    const v16, -0x40c28f5c    # -0.74f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3f928f5c    # -3.71f

    .line 255
    .line 256
    .line 257
    const v18, -0x3fa0a3d7    # -3.49f

    .line 258
    .line 259
    .line 260
    const v13, -0x402f5c29    # -1.63f

    .line 261
    .line 262
    .line 263
    const v14, -0x40d70a3d    # -0.66f

    .line 264
    .line 265
    .line 266
    const v15, -0x3fc28f5c    # -2.96f

    .line 267
    .line 268
    .line 269
    const v16, -0x400b851f    # -1.91f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x40b9eb85    # 5.81f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3f851eb8    # 1.04f

    .line 282
    .line 283
    .line 284
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41300000    # 11.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x3e947ae1    # 0.29f

    .line 295
    .line 296
    .line 297
    const/high16 v18, -0x40000000    # -2.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const v14, -0x40cf5c29    # -0.69f

    .line 301
    .line 302
    .line 303
    const v15, 0x3dcccccd    # 0.1f

    .line 304
    .line 305
    .line 306
    const v16, -0x4050a3d7    # -1.37f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40ad1eb8    # 5.41f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41300000    # 11.0f

    .line 319
    .line 320
    const/high16 v2, 0x40400000    # 3.0f

    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x41100000    # 9.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40400000    # 3.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, -0x40000000    # -2.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41400000    # 12.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x40000000    # 2.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x40400000    # 3.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x3f0a3d71    # -7.68f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x418f47ae    # 17.91f

    .line 362
    .line 363
    .line 364
    const/high16 v18, 0x41500000    # 13.0f

    .line 365
    .line 366
    const v13, 0x419f999a    # 19.95f

    .line 367
    .line 368
    .line 369
    const v14, 0x414d47ae    # 12.83f

    .line 370
    .line 371
    .line 372
    const v15, 0x4196b852    # 18.84f

    .line 373
    .line 374
    .line 375
    const v16, 0x415028f6    # 13.01f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x40f00000    # 7.5f

    .line 385
    .line 386
    const/high16 v2, 0x41700000    # 15.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const/high16 v18, 0x41580000    # 13.5f

    .line 394
    .line 395
    const v13, 0x40d570a4    # 6.67f

    .line 396
    .line 397
    .line 398
    const/high16 v14, 0x41700000    # 15.0f

    .line 399
    .line 400
    const/high16 v15, 0x40c00000    # 6.0f

    .line 401
    .line 402
    const v16, 0x416547ae    # 14.33f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x40d570a4    # 6.67f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x40f00000    # 7.5f

    .line 412
    .line 413
    const/high16 v4, 0x41400000    # 12.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x414ab852    # 12.67f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x41580000    # 13.5f

    .line 422
    .line 423
    const/high16 v4, 0x41100000    # 9.0f

    .line 424
    .line 425
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x410547ae    # 8.33f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x40f00000    # 7.5f

    .line 432
    .line 433
    const/high16 v4, 0x41700000    # 15.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/16 v16, 0x3800

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/high16 v8, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const/high16 v9, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v12, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const-string v4, ""

    .line 462
    .line 463
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, Landroidx/compose/material/icons/sharp/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object v0
.end method

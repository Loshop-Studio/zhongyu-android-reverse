.class public final Landroidx/compose/material/icons/rounded/DepartureBoardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDepartureBoard(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DepartureBoard"

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
    const v0, 0x418ab852    # 17.34f

    .line 71
    .line 72
    .line 73
    const v2, 0x3f90a3d7    # 1.13f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f1c28f6    # -7.12f

    .line 80
    .line 81
    .line 82
    const v18, 0x403ae148    # 2.92f

    .line 83
    .line 84
    .line 85
    const v13, -0x3fc3d70a    # -2.94f

    .line 86
    .line 87
    .line 88
    const v14, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f4bd70a    # -5.63f

    .line 92
    .line 93
    .line 94
    const/high16 v16, 0x3f400000    # 0.75f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x3ca3d70a    # 0.02f

    .line 100
    .line 101
    .line 102
    const v18, -0x430a3d71    # -0.03f

    .line 103
    .line 104
    .line 105
    const v13, 0x3c23d70a    # 0.01f

    .line 106
    .line 107
    .line 108
    const v14, -0x43dc28f6    # -0.01f

    .line 109
    .line 110
    .line 111
    const v15, 0x3c23d70a    # 0.01f

    .line 112
    .line 113
    .line 114
    const v16, -0x435c28f6    # -0.02f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x41100000    # 9.0f

    .line 121
    .line 122
    const/high16 v18, 0x40800000    # 4.0f

    .line 123
    .line 124
    const v13, 0x411d70a4    # 9.84f

    .line 125
    .line 126
    .line 127
    const/high16 v14, 0x40800000    # 4.0f

    .line 128
    .line 129
    const v15, 0x4116b852    # 9.42f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, -0x3f000000    # -8.0f

    .line 138
    .line 139
    const v13, -0x3f728f5c    # -4.42f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const/high16 v15, -0x3f000000    # -8.0f

    .line 144
    .line 145
    const/high16 v16, 0x3f000000    # 0.5f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x41200000    # 10.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const v18, 0x400e147b    # 2.22f

    .line 158
    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const v14, 0x3f6147ae    # 0.88f

    .line 162
    .line 163
    .line 164
    const v15, 0x3ec7ae14    # 0.39f

    .line 165
    .line 166
    .line 167
    const v16, 0x3fd5c28f    # 1.67f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3fa3d70a    # 1.28f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 180
    .line 181
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 182
    .line 183
    const v14, 0x3f547ae1    # 0.83f

    .line 184
    .line 185
    .line 186
    const v15, 0x3f2b851f    # 0.67f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x41b2a3d7    # 22.33f

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 198
    .line 199
    const/high16 v4, 0x40a00000    # 5.0f

    .line 200
    .line 201
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41a80000    # 21.0f

    .line 205
    .line 206
    const/high16 v2, 0x40a00000    # 5.0f

    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41000000    # 8.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x3f000000    # 0.5f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v14, 0x3f51eb85    # 0.82f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v18, -0x40400000    # -1.5f

    .line 228
    .line 229
    const v13, 0x3f51eb85    # 0.82f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 234
    .line 235
    const v16, -0x40d47ae1    # -0.67f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x405c28f6    # -1.28f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const v18, -0x3ff1eb85    # -2.22f

    .line 250
    .line 251
    .line 252
    const v13, 0x3f1c28f6    # 0.61f

    .line 253
    .line 254
    .line 255
    const v14, -0x40f33333    # -0.55f

    .line 256
    .line 257
    .line 258
    const/high16 v15, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const v16, -0x40547ae1    # -1.34f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3fbae148    # -3.08f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x40bd70a4    # 5.92f

    .line 273
    .line 274
    .line 275
    const v18, -0x3f00f5c3    # -7.97f

    .line 276
    .line 277
    .line 278
    const v13, 0x406e147b    # 3.72f

    .line 279
    .line 280
    .line 281
    const v14, -0x40f5c28f    # -0.54f

    .line 282
    .line 283
    .line 284
    const/high16 v15, 0x40d00000    # 6.5f

    .line 285
    .line 286
    const v16, -0x3f8147ae    # -3.98f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x3f4d70a4    # -5.58f

    .line 293
    .line 294
    .line 295
    const v18, -0x3f45c28f    # -5.82f

    .line 296
    .line 297
    .line 298
    const v13, -0x4128f5c3    # -0.42f

    .line 299
    .line 300
    .line 301
    const v14, -0x3fc66666    # -2.9f

    .line 302
    .line 303
    .line 304
    const v15, -0x3fd33333    # -2.7f

    .line 305
    .line 306
    .line 307
    const v16, -0x3f56b852    # -5.29f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x40900000    # 4.5f

    .line 317
    .line 318
    const/high16 v2, 0x41980000    # 19.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, -0x40400000    # -1.5f

    .line 324
    .line 325
    const/high16 v18, -0x40400000    # -1.5f

    .line 326
    .line 327
    const v13, -0x40ab851f    # -0.83f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/high16 v15, -0x40400000    # -1.5f

    .line 332
    .line 333
    const v16, -0x40d47ae1    # -0.67f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x406ae148    # 3.67f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x41800000    # 16.0f

    .line 343
    .line 344
    const/high16 v4, 0x40900000    # 4.5f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x3f2b851f    # 0.67f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 353
    .line 354
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40aa8f5c    # 5.33f

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x40900000    # 4.5f

    .line 361
    .line 362
    const/high16 v4, 0x41980000    # 19.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41500000    # 13.0f

    .line 371
    .line 372
    const/high16 v2, 0x40400000    # 3.0f

    .line 373
    .line 374
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41000000    # 8.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x40c00000    # 6.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x40070a3d    # 2.11f

    .line 388
    .line 389
    .line 390
    const/high16 v18, 0x40a00000    # 5.0f

    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const v14, 0x3ffae148    # 1.96f

    .line 394
    .line 395
    .line 396
    const v15, 0x3f4f5c29    # 0.81f

    .line 397
    .line 398
    .line 399
    const v16, 0x406eb852    # 3.73f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41500000    # 13.0f

    .line 406
    .line 407
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41580000    # 13.5f

    .line 414
    .line 415
    const/high16 v2, 0x41980000    # 19.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, -0x40400000    # -1.5f

    .line 421
    .line 422
    const/high16 v18, -0x40400000    # -1.5f

    .line 423
    .line 424
    const v13, -0x40ab851f    # -0.83f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, -0x40400000    # -1.5f

    .line 429
    .line 430
    const v16, -0x40d47ae1    # -0.67f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, -0x40400000    # -1.5f

    .line 437
    .line 438
    const v2, 0x3f2b851f    # 0.67f

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 442
    .line 443
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3f2b851f    # 0.67f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x40d47ae1    # -0.67f

    .line 455
    .line 456
    .line 457
    const/high16 v2, -0x40400000    # -1.5f

    .line 458
    .line 459
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x41500000    # 13.0f

    .line 466
    .line 467
    const/high16 v2, 0x41800000    # 16.0f

    .line 468
    .line 469
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x3f600000    # -5.0f

    .line 473
    .line 474
    const/high16 v18, -0x3f600000    # -5.0f

    .line 475
    .line 476
    const v13, -0x3fcf5c29    # -2.76f

    .line 477
    .line 478
    .line 479
    const/high16 v15, -0x3f600000    # -5.0f

    .line 480
    .line 481
    const v16, -0x3ff0a3d7    # -2.24f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x400f5c29    # 2.24f

    .line 488
    .line 489
    .line 490
    const/high16 v2, -0x3f600000    # -5.0f

    .line 491
    .line 492
    const/high16 v4, 0x40a00000    # 5.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x40a00000    # 5.0f

    .line 498
    .line 499
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, -0x3ff0a3d7    # -2.24f

    .line 503
    .line 504
    .line 505
    const/high16 v2, -0x3f600000    # -5.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x417c0000    # 15.75f

    .line 514
    .line 515
    const/high16 v2, 0x40800000    # 4.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, -0x40c00000    # -0.75f

    .line 521
    .line 522
    const/high16 v18, 0x3f400000    # 0.75f

    .line 523
    .line 524
    const v13, -0x412e147b    # -0.41f

    .line 525
    .line 526
    .line 527
    const/high16 v15, -0x40c00000    # -0.75f

    .line 528
    .line 529
    const v16, 0x3eae147b    # 0.34f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x406b851f    # 3.68f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3efae148    # 0.49f

    .line 542
    .line 543
    .line 544
    const v18, 0x3f5c28f6    # 0.86f

    .line 545
    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, 0x3eb33333    # 0.35f

    .line 549
    .line 550
    .line 551
    const v15, 0x3e428f5c    # 0.19f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f2e147b    # 0.68f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x402147ae    # 2.52f

    .line 561
    .line 562
    .line 563
    const v2, 0x3fc147ae    # 1.51f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x3f7ae148    # 0.98f

    .line 570
    .line 571
    .line 572
    const v18, -0x418a3d71    # -0.24f

    .line 573
    .line 574
    .line 575
    const v13, 0x3eae147b    # 0.34f

    .line 576
    .line 577
    .line 578
    const v14, 0x3e4ccccd    # 0.2f

    .line 579
    .line 580
    .line 581
    const v15, 0x3f47ae14    # 0.78f

    .line 582
    .line 583
    .line 584
    const v16, 0x3db851ec    # 0.09f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, -0x41800000    # -0.25f

    .line 591
    .line 592
    const v18, -0x40828f5c    # -0.99f

    .line 593
    .line 594
    .line 595
    const v13, 0x3e570a3d    # 0.21f

    .line 596
    .line 597
    .line 598
    const v14, -0x4151eb85    # -0.34f

    .line 599
    .line 600
    .line 601
    const v15, 0x3dcccccd    # 0.1f

    .line 602
    .line 603
    .line 604
    const v16, -0x40b5c28f    # -0.79f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41840000    # 16.5f

    .line 611
    .line 612
    const/high16 v2, 0x41040000    # 8.25f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v17, -0x40c00000    # -0.75f

    .line 623
    .line 624
    const/high16 v18, -0x40c00000    # -0.75f

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const v14, -0x412e147b    # -0.41f

    .line 628
    .line 629
    .line 630
    const v15, -0x4151eb85    # -0.34f

    .line 631
    .line 632
    .line 633
    const/high16 v16, -0x40c00000    # -0.75f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/16 v16, 0x3800

    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    const/high16 v6, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/high16 v8, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v7, 0x0

    .line 654
    const/high16 v9, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v14, 0x0

    .line 659
    const/4 v15, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    sput-object v0, Landroidx/compose/material/icons/rounded/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    return-object v0
.end method

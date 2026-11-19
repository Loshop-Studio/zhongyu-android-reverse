.class public final Landroidx/compose/material/icons/outlined/PrecisionManufacturingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPrecisionManufacturing(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PrecisionManufacturing"

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
    const v0, 0x419f70a4    # 19.93f

    .line 71
    .line 72
    .line 73
    const v2, 0x4105999a    # 8.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f99999a    # -3.6f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fd70a3d    # 1.68f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v0, 0x41600000    # 14.0f

    .line 89
    .line 90
    const v2, 0x40f66666    # 7.7f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x40c9999a    # 6.3f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x40151eb8    # 2.33f

    .line 103
    .line 104
    .line 105
    const v2, -0x3feae148    # -2.33f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40666666    # 3.6f

    .line 112
    .line 113
    .line 114
    const v2, 0x3fd70a3d    # 1.68f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const v18, -0x4147ae14    # -0.36f

    .line 123
    .line 124
    .line 125
    const v13, 0x3ec28f5c    # 0.38f

    .line 126
    .line 127
    .line 128
    const v14, 0x3e3851ec    # 0.18f

    .line 129
    .line 130
    .line 131
    const v15, 0x3f51eb85    # 0.82f

    .line 132
    .line 133
    .line 134
    const v16, 0x3c23d70a    # 0.01f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x4147ae14    # -0.36f

    .line 141
    .line 142
    .line 143
    const/high16 v18, -0x40800000    # -1.0f

    .line 144
    .line 145
    const v13, 0x3e3851ec    # 0.18f

    .line 146
    .line 147
    .line 148
    const v14, -0x413d70a4    # -0.38f

    .line 149
    .line 150
    .line 151
    const v15, 0x3c23d70a    # 0.01f

    .line 152
    .line 153
    .line 154
    const v16, -0x40ae147b    # -0.82f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, -0x3f851eb8    # -3.92f

    .line 161
    .line 162
    .line 163
    const v2, -0x4015c28f    # -1.83f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x406f5c29    # -1.13f

    .line 170
    .line 171
    .line 172
    const v18, 0x3e4ccccd    # 0.2f

    .line 173
    .line 174
    .line 175
    const v13, -0x413d70a4    # -0.38f

    .line 176
    .line 177
    .line 178
    const v14, -0x41c7ae14    # -0.18f

    .line 179
    .line 180
    .line 181
    const v15, -0x40ab851f    # -0.83f

    .line 182
    .line 183
    .line 184
    const v16, -0x42333333    # -0.1f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x415c7ae1    # 13.78f

    .line 191
    .line 192
    .line 193
    const v2, 0x408ccccd    # 4.4f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x41500000    # 13.0f

    .line 200
    .line 201
    const/high16 v18, 0x40800000    # 4.0f

    .line 202
    .line 203
    const v13, 0x4159999a    # 13.6f

    .line 204
    .line 205
    .line 206
    const v14, 0x40851eb8    # 4.16f

    .line 207
    .line 208
    .line 209
    const v15, 0x41551eb8    # 13.32f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x40800000    # 4.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x40800000    # -1.0f

    .line 218
    .line 219
    const/high16 v18, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const v13, -0x40f33333    # -0.55f

    .line 222
    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    const/high16 v15, -0x40800000    # -1.0f

    .line 226
    .line 227
    const v16, 0x3ee66666    # 0.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x3f800000    # 1.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x410d1eb8    # 8.82f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40c00000    # 6.0f

    .line 245
    .line 246
    const/high16 v18, 0x40800000    # 4.0f

    .line 247
    .line 248
    const v13, 0x41066666    # 8.4f

    .line 249
    .line 250
    .line 251
    const v14, 0x409ae148    # 4.84f

    .line 252
    .line 253
    .line 254
    const v15, 0x40e9999a    # 7.3f

    .line 255
    .line 256
    .line 257
    const/high16 v16, 0x40800000    # 4.0f

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x40400000    # 3.0f

    .line 263
    .line 264
    const/high16 v18, 0x40e00000    # 7.0f

    .line 265
    .line 266
    const v13, 0x408ae148    # 4.34f

    .line 267
    .line 268
    .line 269
    const/high16 v14, 0x40800000    # 4.0f

    .line 270
    .line 271
    const/high16 v15, 0x40400000    # 3.0f

    .line 272
    .line 273
    const v16, 0x40aae148    # 5.34f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, 0x3fbd70a4    # 1.48f

    .line 280
    .line 281
    .line 282
    const v18, 0x40251eb8    # 2.58f

    .line 283
    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, 0x3f8ccccd    # 1.1f

    .line 287
    .line 288
    .line 289
    const v15, 0x3f19999a    # 0.6f

    .line 290
    .line 291
    .line 292
    const v16, 0x40033333    # 2.05f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x40e28f5c    # 7.08f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x41900000    # 18.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x40c00000    # 6.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, -0x40000000    # -2.0f

    .line 312
    .line 313
    const/high16 v18, 0x40000000    # 2.0f

    .line 314
    .line 315
    const v13, -0x40733333    # -1.1f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const/high16 v15, -0x40000000    # -2.0f

    .line 320
    .line 321
    const v16, 0x3f666666    # 0.9f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x3f800000    # 1.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41500000    # 13.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, -0x40800000    # -1.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v18, -0x40000000    # -2.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x40733333    # -1.1f

    .line 346
    .line 347
    .line 348
    const v15, -0x4099999a    # -0.9f

    .line 349
    .line 350
    .line 351
    const/high16 v16, -0x40000000    # -2.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, -0x4030a3d7    # -1.62f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x41068f5c    # 8.41f

    .line 363
    .line 364
    .line 365
    const v2, 0x410c51ec    # 8.77f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x410d1eb8    # 8.82f

    .line 372
    .line 373
    .line 374
    const/high16 v18, 0x41000000    # 8.0f

    .line 375
    .line 376
    const v13, 0x410947ae    # 8.58f

    .line 377
    .line 378
    .line 379
    const v14, 0x41087ae1    # 8.53f

    .line 380
    .line 381
    .line 382
    const v15, 0x410b851f    # 8.72f

    .line 383
    .line 384
    .line 385
    const v16, 0x41047ae1    # 8.28f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41400000    # 12.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x3f800000    # 1.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v18, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const v14, 0x3f0ccccd    # 0.55f

    .line 407
    .line 408
    .line 409
    const v15, 0x3ee66666    # 0.45f

    .line 410
    .line 411
    .line 412
    const/high16 v16, 0x3f800000    # 1.0f

    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x3f47ae14    # 0.78f

    .line 418
    .line 419
    .line 420
    const v18, -0x41333333    # -0.4f

    .line 421
    .line 422
    .line 423
    const v13, 0x3ea3d70a    # 0.32f

    .line 424
    .line 425
    .line 426
    const/4 v14, 0x0

    .line 427
    const v15, 0x3f19999a    # 0.6f

    .line 428
    .line 429
    .line 430
    const v16, -0x41dc28f6    # -0.16f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3fdeb852    # 1.74f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3f90a3d7    # 1.13f

    .line 443
    .line 444
    .line 445
    const v18, 0x3e4ccccd    # 0.2f

    .line 446
    .line 447
    .line 448
    const v13, 0x3e99999a    # 0.3f

    .line 449
    .line 450
    .line 451
    const v14, 0x3e99999a    # 0.3f

    .line 452
    .line 453
    .line 454
    const/high16 v15, 0x3f400000    # 0.75f

    .line 455
    .line 456
    const v16, 0x3ec28f5c    # 0.38f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x407ae148    # 3.92f

    .line 463
    .line 464
    .line 465
    const v2, -0x4015c28f    # -1.83f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3eb851ec    # 0.36f

    .line 472
    .line 473
    .line 474
    const/high16 v18, -0x40800000    # -1.0f

    .line 475
    .line 476
    const v13, 0x3ec28f5c    # 0.38f

    .line 477
    .line 478
    .line 479
    const v14, -0x41c7ae14    # -0.18f

    .line 480
    .line 481
    .line 482
    const v15, 0x3f0a3d71    # 0.54f

    .line 483
    .line 484
    .line 485
    const v16, -0x40e147ae    # -0.62f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x419f70a4    # 19.93f

    .line 492
    .line 493
    .line 494
    const v18, 0x4105999a    # 8.35f

    .line 495
    .line 496
    .line 497
    const/high16 v13, 0x41a60000    # 20.75f

    .line 498
    .line 499
    const v14, 0x410570a4    # 8.34f

    .line 500
    .line 501
    .line 502
    const v15, 0x41a27ae1    # 20.31f

    .line 503
    .line 504
    .line 505
    const v16, 0x4102b852    # 8.17f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41000000    # 8.0f

    .line 515
    .line 516
    const/high16 v2, 0x40c00000    # 6.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x40a00000    # 5.0f

    .line 522
    .line 523
    const/high16 v18, 0x40e00000    # 7.0f

    .line 524
    .line 525
    const v13, 0x40ae6666    # 5.45f

    .line 526
    .line 527
    .line 528
    const/high16 v14, 0x41000000    # 8.0f

    .line 529
    .line 530
    const/high16 v15, 0x40a00000    # 5.0f

    .line 531
    .line 532
    const v16, 0x40f1999a    # 7.55f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v18, -0x40800000    # -1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, -0x40f33333    # -0.55f

    .line 544
    .line 545
    .line 546
    const v15, 0x3ee66666    # 0.45f

    .line 547
    .line 548
    .line 549
    const/high16 v16, -0x40800000    # -1.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x3ee66666    # 0.45f

    .line 555
    .line 556
    .line 557
    const/high16 v2, 0x3f800000    # 1.0f

    .line 558
    .line 559
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x40c00000    # 6.0f

    .line 563
    .line 564
    const/high16 v18, 0x41000000    # 8.0f

    .line 565
    .line 566
    const/high16 v13, 0x40e00000    # 7.0f

    .line 567
    .line 568
    const v14, 0x40f1999a    # 7.55f

    .line 569
    .line 570
    .line 571
    const v15, 0x40d1999a    # 6.55f

    .line 572
    .line 573
    .line 574
    const/high16 v16, 0x41000000    # 8.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x4131c28f    # 11.11f

    .line 583
    .line 584
    .line 585
    const/high16 v2, 0x41900000    # 18.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x4112b852    # 9.17f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x3fe28f5c    # -2.46f

    .line 597
    .line 598
    .line 599
    const/high16 v2, -0x3f000000    # -8.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x3dcccccd    # 0.1f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x4131c28f    # 11.11f

    .line 611
    .line 612
    .line 613
    const/high16 v2, 0x41900000    # 18.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/16 v16, 0x3800

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/high16 v8, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    const/high16 v9, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/high16 v12, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const/4 v14, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 652
    .line 653
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    return-object v0
.end method

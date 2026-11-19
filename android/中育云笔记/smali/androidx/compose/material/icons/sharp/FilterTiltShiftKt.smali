.class public final Landroidx/compose/material/icons/sharp/FilterTiltShiftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterTiltShift(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.FilterTiltShift"

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
    const v0, 0x40823d71    # 4.07f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40033333    # 2.05f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, -0x3f55c28f    # -5.32f

    .line 85
    .line 86
    .line 87
    const v18, 0x400d70a4    # 2.21f

    .line 88
    .line 89
    .line 90
    const v13, -0x3fff5c29    # -2.01f

    .line 91
    .line 92
    .line 93
    const v14, 0x3e4ccccd    # 0.2f

    .line 94
    .line 95
    .line 96
    const v15, -0x3f8a3d71    # -3.84f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x40b6147b    # 5.69f

    .line 105
    .line 106
    .line 107
    const v2, 0x40e33333    # 7.1f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x4079999a    # 3.9f

    .line 114
    .line 115
    .line 116
    const v18, -0x4030a3d7    # -1.62f

    .line 117
    .line 118
    .line 119
    const v13, 0x3f8e147b    # 1.11f

    .line 120
    .line 121
    .line 122
    const v14, -0x40a3d70a    # -0.86f

    .line 123
    .line 124
    .line 125
    const v15, 0x401c28f6    # 2.44f

    .line 126
    .line 127
    .line 128
    const v16, -0x4047ae14    # -1.44f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x41928f5c    # 18.32f

    .line 138
    .line 139
    .line 140
    const v2, 0x408851ec    # 4.26f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x41500000    # 13.0f

    .line 147
    .line 148
    const v18, 0x40033333    # 2.05f

    .line 149
    .line 150
    .line 151
    const v13, 0x4186b852    # 16.84f

    .line 152
    .line 153
    .line 154
    const v14, 0x40433333    # 3.05f

    .line 155
    .line 156
    .line 157
    const v15, 0x417028f6    # 15.01f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x40100000    # 2.25f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x400147ae    # 2.02f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x4079999a    # 3.9f

    .line 172
    .line 173
    .line 174
    const v18, 0x3fcf5c29    # 1.62f

    .line 175
    .line 176
    .line 177
    const v13, 0x3fbae148    # 1.46f

    .line 178
    .line 179
    .line 180
    const v14, 0x3e3851ec    # 0.18f

    .line 181
    .line 182
    .line 183
    const v15, 0x40328f5c    # 2.79f

    .line 184
    .line 185
    .line 186
    const v16, 0x3f428f5c    # 0.76f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3fb5c28f    # 1.42f

    .line 193
    .line 194
    .line 195
    const v2, -0x4048f5c3    # -1.43f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x419f70a4    # 19.93f

    .line 205
    .line 206
    .line 207
    const/high16 v2, 0x41300000    # 11.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x400147ae    # 2.02f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x3ff28f5c    # -2.21f

    .line 219
    .line 220
    .line 221
    const v18, -0x3f55c28f    # -5.32f

    .line 222
    .line 223
    .line 224
    const v13, -0x41b33333    # -0.2f

    .line 225
    .line 226
    .line 227
    const v14, -0x3fff5c29    # -2.01f

    .line 228
    .line 229
    .line 230
    const/high16 v15, -0x40800000    # -1.0f

    .line 231
    .line 232
    const v16, -0x3f8a3d71    # -3.84f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x41927ae1    # 18.31f

    .line 239
    .line 240
    .line 241
    const v2, 0x40e33333    # 7.1f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x3fcf5c29    # 1.62f

    .line 248
    .line 249
    .line 250
    const v18, 0x4079999a    # 3.9f

    .line 251
    .line 252
    .line 253
    const v13, 0x3f5c28f6    # 0.86f

    .line 254
    .line 255
    .line 256
    const v14, 0x3f8e147b    # 1.11f

    .line 257
    .line 258
    .line 259
    const v15, 0x3fb851ec    # 1.44f

    .line 260
    .line 261
    .line 262
    const v16, 0x401c28f6    # 2.44f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40b6147b    # 5.69f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x40b5c28f    # 5.68f

    .line 278
    .line 279
    .line 280
    const v2, 0x408851ec    # 4.26f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x40033333    # 2.05f

    .line 287
    .line 288
    .line 289
    const/high16 v18, 0x41300000    # 11.0f

    .line 290
    .line 291
    const v13, 0x40433333    # 3.05f

    .line 292
    .line 293
    .line 294
    const v14, 0x40e51eb8    # 7.16f

    .line 295
    .line 296
    .line 297
    const/high16 v15, 0x40100000    # 2.25f

    .line 298
    .line 299
    const v16, 0x410fd70a    # 8.99f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x400147ae    # 2.02f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3fcf5c29    # 1.62f

    .line 312
    .line 313
    .line 314
    const v18, -0x3f866666    # -3.9f

    .line 315
    .line 316
    .line 317
    const v13, 0x3e3851ec    # 0.18f

    .line 318
    .line 319
    .line 320
    const v14, -0x40451eb8    # -1.46f

    .line 321
    .line 322
    .line 323
    const v15, 0x3f428f5c    # 0.76f

    .line 324
    .line 325
    .line 326
    const v16, -0x3fcd70a4    # -2.79f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x40823d71    # 4.07f

    .line 336
    .line 337
    .line 338
    const/high16 v2, 0x41500000    # 13.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x40033333    # 2.05f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x400d70a4    # 2.21f

    .line 350
    .line 351
    .line 352
    const v18, 0x40aa3d71    # 5.32f

    .line 353
    .line 354
    .line 355
    const v13, 0x3e4ccccd    # 0.2f

    .line 356
    .line 357
    .line 358
    const v14, 0x4000a3d7    # 2.01f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const v16, 0x4075c28f    # 3.84f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3fb70a3d    # 1.43f

    .line 370
    .line 371
    .line 372
    const v2, -0x4048f5c3    # -1.43f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x4030a3d7    # -1.62f

    .line 379
    .line 380
    .line 381
    const v18, -0x3f870a3d    # -3.89f

    .line 382
    .line 383
    .line 384
    const v13, -0x40a3d70a    # -0.86f

    .line 385
    .line 386
    .line 387
    const v14, -0x40733333    # -1.1f

    .line 388
    .line 389
    .line 390
    const v15, -0x4047ae14    # -1.44f

    .line 391
    .line 392
    .line 393
    const v16, -0x3fe47ae1    # -2.43f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41700000    # 15.0f

    .line 403
    .line 404
    const/high16 v2, 0x41400000    # 12.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 410
    .line 411
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, -0x402b851f    # -1.66f

    .line 415
    .line 416
    .line 417
    const v15, -0x40547ae1    # -1.34f

    .line 418
    .line 419
    .line 420
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3fab851f    # 1.34f

    .line 426
    .line 427
    .line 428
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 429
    .line 430
    const/high16 v4, 0x40400000    # 3.0f

    .line 431
    .line 432
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x40400000    # 3.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x40547ae1    # -1.34f

    .line 441
    .line 442
    .line 443
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 444
    .line 445
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x41873333    # 16.9f

    .line 452
    .line 453
    .line 454
    const v2, 0x41927ae1    # 18.31f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3fb70a3d    # 1.43f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x400d70a4    # 2.21f

    .line 467
    .line 468
    .line 469
    const v18, -0x3f55c28f    # -5.32f

    .line 470
    .line 471
    .line 472
    const v13, 0x3f9ae148    # 1.21f

    .line 473
    .line 474
    .line 475
    const v14, -0x40428f5c    # -1.48f

    .line 476
    .line 477
    .line 478
    const v15, 0x4000a3d7    # 2.01f

    .line 479
    .line 480
    .line 481
    const v16, -0x3fab851f    # -3.32f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x3ffeb852    # -2.02f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, -0x4030a3d7    # -1.62f

    .line 494
    .line 495
    .line 496
    const v18, 0x4078f5c3    # 3.89f

    .line 497
    .line 498
    .line 499
    const v13, -0x41c7ae14    # -0.18f

    .line 500
    .line 501
    .line 502
    const v14, 0x3fb9999a    # 1.45f

    .line 503
    .line 504
    .line 505
    const v15, -0x40bd70a4    # -0.76f

    .line 506
    .line 507
    .line 508
    const v16, 0x4031eb85    # 2.78f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x419f70a4    # 19.93f

    .line 518
    .line 519
    .line 520
    const/high16 v2, 0x41500000    # 13.0f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x400147ae    # 2.02f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x40aa3d71    # 5.32f

    .line 532
    .line 533
    .line 534
    const v18, -0x3ff28f5c    # -2.21f

    .line 535
    .line 536
    .line 537
    const v13, 0x4000a3d7    # 2.01f

    .line 538
    .line 539
    .line 540
    const v14, -0x41b33333    # -0.2f

    .line 541
    .line 542
    .line 543
    const v15, 0x4075c28f    # 3.84f

    .line 544
    .line 545
    .line 546
    const/high16 v16, -0x40800000    # -1.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x4048f5c3    # -1.43f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, -0x3f870a3d    # -3.89f

    .line 558
    .line 559
    .line 560
    const v18, 0x3fcf5c29    # 1.62f

    .line 561
    .line 562
    .line 563
    const v13, -0x40733333    # -1.1f

    .line 564
    .line 565
    .line 566
    const v14, 0x3f5c28f6    # 0.86f

    .line 567
    .line 568
    .line 569
    const v15, -0x3fe47ae1    # -2.43f

    .line 570
    .line 571
    .line 572
    const v16, 0x3fb851ec    # 1.44f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x419deb85    # 19.74f

    .line 582
    .line 583
    .line 584
    const v2, 0x40b5c28f    # 5.68f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x41300000    # 11.0f

    .line 591
    .line 592
    const v18, 0x41af999a    # 21.95f

    .line 593
    .line 594
    .line 595
    const v13, 0x40e51eb8    # 7.16f

    .line 596
    .line 597
    .line 598
    const v14, 0x41a7999a    # 20.95f

    .line 599
    .line 600
    .line 601
    const/high16 v15, 0x41100000    # 9.0f

    .line 602
    .line 603
    const/high16 v16, 0x41ae0000    # 21.75f

    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, -0x3ffeb852    # -2.02f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x3f866666    # -3.9f

    .line 615
    .line 616
    .line 617
    const v18, -0x4030a3d7    # -1.62f

    .line 618
    .line 619
    .line 620
    const v13, -0x40451eb8    # -1.46f

    .line 621
    .line 622
    .line 623
    const v14, -0x41c7ae14    # -0.18f

    .line 624
    .line 625
    .line 626
    const v15, -0x3fcd70a4    # -2.79f

    .line 627
    .line 628
    .line 629
    const v16, -0x40bd70a4    # -0.76f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, -0x404a3d71    # -1.42f

    .line 636
    .line 637
    .line 638
    const v2, 0x3fb70a3d    # 1.43f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/16 v16, 0x3800

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const/high16 v6, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/high16 v8, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    const/high16 v9, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/high16 v12, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    const/4 v14, 0x0

    .line 666
    const/4 v15, 0x0

    .line 667
    const-string v4, ""

    .line 668
    .line 669
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    sput-object v0, Landroidx/compose/material/icons/sharp/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 678
    .line 679
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-object v0
.end method

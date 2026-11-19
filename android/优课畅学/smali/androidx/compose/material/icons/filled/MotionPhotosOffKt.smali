.class public final Landroidx/compose/material/icons/filled/MotionPhotosOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.MotionPhotosOff"

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
    const v0, 0x41a6b852    # 20.84f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x404a3d71    # 3.16f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, 0x408dc28f    # 4.43f

    .line 83
    .line 84
    .line 85
    const v2, 0x3ff1eb85    # 1.89f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, 0x3ff1eb85    # 1.89f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40000000    # 2.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v13, 0x402a3d71    # 2.66f

    .line 102
    .line 103
    .line 104
    const v14, 0x40fdc28f    # 7.93f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v16, 0x411e3d71    # 9.89f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x41200000    # 10.0f

    .line 116
    .line 117
    const/high16 v18, 0x41200000    # 10.0f

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, 0x40b0a3d7    # 5.52f

    .line 121
    .line 122
    .line 123
    const v15, 0x408f5c29    # 4.48f

    .line 124
    .line 125
    .line 126
    const/high16 v16, 0x41200000    # 10.0f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x40b5c28f    # 5.68f

    .line 132
    .line 133
    .line 134
    const v18, -0x401d70a4    # -1.77f

    .line 135
    .line 136
    .line 137
    const v13, 0x40070a3d    # 2.11f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const v15, 0x40823d71    # 4.07f

    .line 142
    .line 143
    .line 144
    const v16, -0x40d70a3d    # -0.66f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x3fa28f5c    # 1.27f

    .line 154
    .line 155
    .line 156
    const v2, -0x405c28f6    # -1.28f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41a00000    # 20.0f

    .line 166
    .line 167
    const/high16 v2, 0x41400000    # 12.0f

    .line 168
    .line 169
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x3f000000    # -8.0f

    .line 173
    .line 174
    const/high16 v18, -0x3f000000    # -8.0f

    .line 175
    .line 176
    const v13, -0x3f72e148    # -4.41f

    .line 177
    .line 178
    .line 179
    const/high16 v15, -0x3f000000    # -8.0f

    .line 180
    .line 181
    const v16, -0x3f9a3d71    # -3.59f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x3f9c28f6    # 1.22f

    .line 188
    .line 189
    .line 190
    const v18, -0x3f78a3d7    # -4.23f

    .line 191
    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, -0x4039999a    # -1.55f

    .line 195
    .line 196
    .line 197
    const v15, 0x3ee66666    # 0.45f

    .line 198
    .line 199
    .line 200
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x3fbae148    # 1.46f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x40c00000    # 6.0f

    .line 212
    .line 213
    const/high16 v18, 0x41400000    # 12.0f

    .line 214
    .line 215
    const/high16 v13, 0x40c80000    # 6.25f

    .line 216
    .line 217
    const v14, 0x4120f5c3    # 10.06f

    .line 218
    .line 219
    .line 220
    const/high16 v15, 0x40c00000    # 6.0f

    .line 221
    .line 222
    const/high16 v16, 0x41300000    # 11.0f

    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v18, 0x40c00000    # 6.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const v14, 0x4053d70a    # 3.31f

    .line 231
    .line 232
    .line 233
    const v15, 0x402c28f6    # 2.69f

    .line 234
    .line 235
    .line 236
    const/high16 v16, 0x40c00000    # 6.0f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x403147ae    # 2.77f

    .line 242
    .line 243
    .line 244
    const v18, -0x40d1eb85    # -0.68f

    .line 245
    .line 246
    .line 247
    const/high16 v13, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const v15, 0x3ff851ec    # 1.94f

    .line 251
    .line 252
    .line 253
    const/high16 v16, -0x41800000    # -0.25f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x41400000    # 12.0f

    .line 262
    .line 263
    const/high16 v18, 0x41a00000    # 20.0f

    .line 264
    .line 265
    const/high16 v13, 0x41700000    # 15.0f

    .line 266
    .line 267
    const v14, 0x419c6666    # 19.55f

    .line 268
    .line 269
    .line 270
    const v15, 0x4158cccd    # 13.55f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x41a00000    # 20.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x407147ae    # 3.77f

    .line 282
    .line 283
    .line 284
    const v2, 0x40ca3d71    # 6.32f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v18, 0x40000000    # 2.0f

    .line 291
    .line 292
    const v13, 0x40fdc28f    # 7.93f

    .line 293
    .line 294
    .line 295
    const v14, 0x402a3d71    # 2.66f

    .line 296
    .line 297
    .line 298
    const v15, 0x411e3d71    # 9.89f

    .line 299
    .line 300
    .line 301
    const/high16 v16, 0x40000000    # 2.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x41200000    # 10.0f

    .line 307
    .line 308
    const/high16 v18, 0x41200000    # 10.0f

    .line 309
    .line 310
    const v13, 0x40b0a3d7    # 5.52f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const/high16 v15, 0x41200000    # 10.0f

    .line 315
    .line 316
    const v16, 0x408f5c29    # 4.48f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x401d70a4    # -1.77f

    .line 323
    .line 324
    .line 325
    const v18, 0x40b5c28f    # 5.68f

    .line 326
    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, 0x40070a3d    # 2.11f

    .line 330
    .line 331
    .line 332
    const v15, -0x40d70a3d    # -0.66f

    .line 333
    .line 334
    .line 335
    const v16, 0x40823d71    # 4.07f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x40466666    # -1.45f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41a00000    # 20.0f

    .line 348
    .line 349
    const/high16 v18, 0x41400000    # 12.0f

    .line 350
    .line 351
    const v13, 0x419c6666    # 19.55f

    .line 352
    .line 353
    .line 354
    const/high16 v14, 0x41700000    # 15.0f

    .line 355
    .line 356
    const/high16 v15, 0x41a00000    # 20.0f

    .line 357
    .line 358
    const v16, 0x4158cccd    # 13.55f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, -0x3f000000    # -8.0f

    .line 365
    .line 366
    const/high16 v18, -0x3f000000    # -8.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, -0x3f72e148    # -4.41f

    .line 370
    .line 371
    .line 372
    const v15, -0x3f9a3d71    # -3.59f

    .line 373
    .line 374
    .line 375
    const/high16 v16, -0x3f000000    # -8.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x3f78a3d7    # -4.23f

    .line 381
    .line 382
    .line 383
    const v18, 0x3f9c28f6    # 1.22f

    .line 384
    .line 385
    .line 386
    const v13, -0x4039999a    # -1.55f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 391
    .line 392
    const v16, 0x3ee66666    # 0.45f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x407147ae    # 3.77f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41900000    # 18.0f

    .line 408
    .line 409
    const/high16 v2, 0x41400000    # 12.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x40d1eb85    # -0.68f

    .line 415
    .line 416
    .line 417
    const v18, 0x403147ae    # 2.77f

    .line 418
    .line 419
    .line 420
    const/4 v13, 0x0

    .line 421
    const/high16 v14, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v15, -0x41800000    # -0.25f

    .line 424
    .line 425
    const v16, 0x3ff851ec    # 1.94f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x4113ae14    # 9.23f

    .line 432
    .line 433
    .line 434
    const v2, 0x40d5c28f    # 6.68f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, 0x41400000    # 12.0f

    .line 441
    .line 442
    const/high16 v18, 0x40c00000    # 6.0f

    .line 443
    .line 444
    const v13, 0x4120f5c3    # 10.06f

    .line 445
    .line 446
    .line 447
    const/high16 v14, 0x40c80000    # 6.25f

    .line 448
    .line 449
    const/high16 v15, 0x41300000    # 11.0f

    .line 450
    .line 451
    const/high16 v16, 0x40c00000    # 6.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x40c00000    # 6.0f

    .line 457
    .line 458
    const v13, 0x4053d70a    # 3.31f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const/high16 v15, 0x40c00000    # 6.0f

    .line 463
    .line 464
    const v16, 0x402c28f6    # 2.69f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/16 v16, 0x3800

    .line 478
    .line 479
    const/16 v17, 0x0

    .line 480
    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v8, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    const/high16 v9, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/high16 v12, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v13, 0x0

    .line 491
    const/4 v15, 0x0

    .line 492
    const-string v4, ""

    .line 493
    .line 494
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sput-object v0, Landroidx/compose/material/icons/filled/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-object v0
.end method

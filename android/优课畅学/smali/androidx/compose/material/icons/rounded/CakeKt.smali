.class public final Landroidx/compose/material/icons/rounded/CakeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cake:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCake(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CakeKt;->_cake:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cake"

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
    const v0, 0x414ae148    # 12.68f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bc28f6    # 5.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fa66666    # 1.3f

    .line 80
    .line 81
    .line 82
    const v18, -0x402e147b    # -1.64f

    .line 83
    .line 84
    .line 85
    const v13, 0x3f333333    # 0.7f

    .line 86
    .line 87
    .line 88
    const v14, -0x418a3d71    # -0.24f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f9c28f6    # 1.22f

    .line 92
    .line 93
    .line 94
    const v16, -0x4099999a    # -0.9f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x4170a3d7    # -0.28f

    .line 101
    .line 102
    .line 103
    const v18, -0x405d70a4    # -1.27f

    .line 104
    .line 105
    .line 106
    const v13, 0x3d4ccccd    # 0.05f

    .line 107
    .line 108
    .line 109
    const v14, -0x410f5c29    # -0.47f

    .line 110
    .line 111
    .line 112
    const v15, -0x42b33333    # -0.05f

    .line 113
    .line 114
    .line 115
    const v16, -0x40970a3d    # -0.91f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x4146b852    # 12.42f

    .line 122
    .line 123
    .line 124
    const/high16 v2, 0x3f400000    # 0.75f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, -0x40a147ae    # -0.87f

    .line 130
    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    const v13, -0x41bd70a4    # -0.19f

    .line 135
    .line 136
    .line 137
    const v14, -0x41570a3d    # -0.33f

    .line 138
    .line 139
    .line 140
    const v15, -0x40d47ae1    # -0.67f

    .line 141
    .line 142
    .line 143
    const v16, -0x41570a3d    # -0.33f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x405c28f6    # -1.28f

    .line 150
    .line 151
    .line 152
    const v2, 0x400e147b    # 2.22f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, -0x4175c28f    # -0.27f

    .line 159
    .line 160
    .line 161
    const v18, 0x3f83d70a    # 1.03f

    .line 162
    .line 163
    .line 164
    const v13, -0x41d1eb85    # -0.17f

    .line 165
    .line 166
    .line 167
    const v14, 0x3e99999a    # 0.3f

    .line 168
    .line 169
    .line 170
    const v15, -0x4175c28f    # -0.27f

    .line 171
    .line 172
    .line 173
    const v16, 0x3f266666    # 0.65f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x402b851f    # 2.68f

    .line 180
    .line 181
    .line 182
    const v18, 0x3ff0a3d7    # 1.88f

    .line 183
    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, 0x3fa8f5c3    # 1.32f

    .line 187
    .line 188
    .line 189
    const v15, 0x3fa66666    # 1.3f

    .line 190
    .line 191
    .line 192
    const v16, 0x40166666    # 2.35f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41843d71    # 16.53f

    .line 202
    .line 203
    .line 204
    const v2, 0x417eb852    # 15.92f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, -0x40800000    # -1.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, -0x4075c28f    # -1.08f

    .line 216
    .line 217
    .line 218
    const v2, 0x3f88f5c3    # 1.07f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, -0x3f63851f    # -4.89f

    .line 225
    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    const v13, -0x4059999a    # -1.3f

    .line 230
    .line 231
    .line 232
    const v14, 0x3fa66666    # 1.3f

    .line 233
    .line 234
    .line 235
    const v15, -0x3f9ae148    # -3.58f

    .line 236
    .line 237
    .line 238
    const v16, 0x3fa7ae14    # 1.31f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x40770a3d    # -1.07f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x40747ae1    # -1.09f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x409eb852    # 4.96f

    .line 257
    .line 258
    .line 259
    const/high16 v18, 0x41880000    # 17.0f

    .line 260
    .line 261
    const/high16 v13, 0x40d80000    # 6.75f

    .line 262
    .line 263
    const v14, 0x41851eb8    # 16.64f

    .line 264
    .line 265
    .line 266
    const v15, 0x40bc28f6    # 5.88f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x41880000    # 17.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x40051eb8    # -1.96f

    .line 275
    .line 276
    .line 277
    const v18, -0x40e3d70a    # -0.61f

    .line 278
    .line 279
    .line 280
    const v13, -0x40c51eb8    # -0.73f

    .line 281
    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const v15, -0x404ccccd    # -1.4f

    .line 285
    .line 286
    .line 287
    const v16, -0x41947ae1    # -0.23f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40400000    # 3.0f

    .line 294
    .line 295
    const/high16 v2, 0x41a00000    # 20.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x40000000    # 2.0f

    .line 301
    .line 302
    const/high16 v18, 0x40000000    # 2.0f

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const v14, 0x3f8ccccd    # 1.1f

    .line 306
    .line 307
    .line 308
    const v15, 0x3f666666    # 0.9f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x40000000    # 2.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41600000    # 14.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v18, -0x40000000    # -2.0f

    .line 322
    .line 323
    const v13, 0x3f8ccccd    # 1.1f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x40000000    # 2.0f

    .line 328
    .line 329
    const v16, -0x4099999a    # -0.9f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, -0x3f98f5c3    # -3.61f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x3fd0a3d7    # -2.74f

    .line 342
    .line 343
    .line 344
    const v18, 0x3f051eb8    # 0.52f

    .line 345
    .line 346
    .line 347
    const/high16 v13, -0x40c00000    # -0.75f

    .line 348
    .line 349
    const v14, 0x3f028f5c    # 0.51f

    .line 350
    .line 351
    .line 352
    const v15, -0x40251eb8    # -1.71f

    .line 353
    .line 354
    .line 355
    const/high16 v16, 0x3f400000    # 0.75f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, -0x40228f5c    # -1.73f

    .line 361
    .line 362
    .line 363
    const v18, -0x40828f5c    # -0.99f

    .line 364
    .line 365
    .line 366
    const v13, -0x40d70a3d    # -0.66f

    .line 367
    .line 368
    .line 369
    const v14, -0x41f0a3d7    # -0.14f

    .line 370
    .line 371
    .line 372
    const/high16 v15, -0x40600000    # -1.25f

    .line 373
    .line 374
    const v16, -0x40fd70a4    # -0.51f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41900000    # 18.0f

    .line 384
    .line 385
    const/high16 v2, 0x41100000    # 9.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, -0x3f600000    # -5.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41500000    # 13.0f

    .line 396
    .line 397
    const/high16 v2, 0x41000000    # 8.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, -0x40800000    # -1.0f

    .line 403
    .line 404
    const/high16 v18, -0x40800000    # -1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const v14, -0x40f33333    # -0.55f

    .line 408
    .line 409
    .line 410
    const v15, -0x4119999a    # -0.45f

    .line 411
    .line 412
    .line 413
    const/high16 v16, -0x40800000    # -1.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x3ee66666    # 0.45f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v4, -0x40800000    # -1.0f

    .line 424
    .line 425
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x3f800000    # 1.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40c00000    # 6.0f

    .line 434
    .line 435
    const/high16 v2, 0x41100000    # 9.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    const/high16 v18, 0x40400000    # 3.0f

    .line 443
    .line 444
    const v13, -0x402b851f    # -1.66f

    .line 445
    .line 446
    .line 447
    const/4 v14, 0x0

    .line 448
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 449
    .line 450
    const v16, 0x3fab851f    # 1.34f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x3fbae148    # 1.46f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3fa7ae14    # 1.31f

    .line 463
    .line 464
    .line 465
    const v18, 0x3ff851ec    # 1.94f

    .line 466
    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const v14, 0x3f59999a    # 0.85f

    .line 470
    .line 471
    .line 472
    const/high16 v15, 0x3f000000    # 0.5f

    .line 473
    .line 474
    const v16, 0x3fd5c28f    # 1.67f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x4001eb85    # 2.03f

    .line 481
    .line 482
    .line 483
    const v18, -0x41147ae1    # -0.46f

    .line 484
    .line 485
    .line 486
    const v13, 0x3f3ae148    # 0.73f

    .line 487
    .line 488
    .line 489
    const v14, 0x3e75c28f    # 0.24f

    .line 490
    .line 491
    .line 492
    const v15, 0x3fc28f5c    # 1.52f

    .line 493
    .line 494
    .line 495
    const v16, 0x3d75c28f    # 0.06f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, -0x3ff7ae14    # -2.13f

    .line 502
    .line 503
    .line 504
    const v2, 0x4008f5c3    # 2.14f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x400851ec    # 2.13f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x403147ae    # 2.77f

    .line 517
    .line 518
    .line 519
    const/16 v18, 0x0

    .line 520
    .line 521
    const v13, 0x3f428f5c    # 0.76f

    .line 522
    .line 523
    .line 524
    const v14, 0x3f428f5c    # 0.76f

    .line 525
    .line 526
    .line 527
    const v15, 0x4000a3d7    # 2.01f

    .line 528
    .line 529
    .line 530
    const v16, 0x3f428f5c    # 0.76f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, -0x3ff7ae14    # -2.13f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x400851ec    # 2.13f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, 0x3fd33333    # 1.65f

    .line 549
    .line 550
    .line 551
    const v18, 0x3f0ccccd    # 0.55f

    .line 552
    .line 553
    .line 554
    const v13, 0x3edc28f6    # 0.43f

    .line 555
    .line 556
    .line 557
    const v14, 0x3edc28f6    # 0.43f

    .line 558
    .line 559
    .line 560
    const v15, 0x3f83d70a    # 1.03f

    .line 561
    .line 562
    .line 563
    const v16, 0x3f2147ae    # 0.63f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x3fd851ec    # 1.69f

    .line 570
    .line 571
    .line 572
    const v18, -0x3ffc28f6    # -2.06f

    .line 573
    .line 574
    .line 575
    const v13, 0x3f7d70a4    # 0.99f

    .line 576
    .line 577
    .line 578
    const v14, -0x41fae148    # -0.13f

    .line 579
    .line 580
    .line 581
    const v15, 0x3fd851ec    # 1.69f

    .line 582
    .line 583
    .line 584
    const v16, -0x407851ec    # -1.06f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, -0x404a3d71    # -1.42f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x41900000    # 18.0f

    .line 597
    .line 598
    const/high16 v18, 0x41100000    # 9.0f

    .line 599
    .line 600
    const/high16 v13, 0x41a80000    # 21.0f

    .line 601
    .line 602
    const v14, 0x412570a4    # 10.34f

    .line 603
    .line 604
    .line 605
    const v15, 0x419d47ae    # 19.66f

    .line 606
    .line 607
    .line 608
    const/high16 v16, 0x41100000    # 9.0f

    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const/16 v16, 0x3800

    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/high16 v8, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    const/high16 v9, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/high16 v12, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v13, 0x0

    .line 634
    const/4 v14, 0x0

    .line 635
    const/4 v15, 0x0

    .line 636
    const-string v4, ""

    .line 637
    .line 638
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    sput-object v0, Landroidx/compose/material/icons/rounded/CakeKt;->_cake:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 647
    .line 648
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    return-object v0
.end method

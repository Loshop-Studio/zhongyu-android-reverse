.class public final Landroidx/compose/material/icons/filled/DownhillSkiingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDownhillSkiing(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DownhillSkiingKt;->_downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DownhillSkiing"

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
    const/high16 v0, 0x40900000    # 4.5f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4059999a    # 3.4f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40900000    # 4.5f

    .line 115
    .line 116
    const/high16 v4, 0x41940000    # 18.5f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x41a73333    # 20.9f

    .line 125
    .line 126
    .line 127
    const v2, 0x417c7ae1    # 15.78f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x3f428f5c    # 0.76f

    .line 134
    .line 135
    .line 136
    const v2, 0x3e8a3d71    # 0.27f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x3ffae148    # 1.96f

    .line 143
    .line 144
    .line 145
    const v18, 0x3ea8f5c3    # 0.33f

    .line 146
    .line 147
    .line 148
    const v13, 0x3f1eb852    # 0.62f

    .line 149
    .line 150
    .line 151
    const v14, 0x3e570a3d    # 0.21f

    .line 152
    .line 153
    .line 154
    const v15, 0x3fa28f5c    # 1.27f

    .line 155
    .line 156
    .line 157
    const v16, 0x3ea8f5c3    # 0.33f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x401851ec    # 2.38f

    .line 164
    .line 165
    .line 166
    const/high16 v18, -0x41000000    # -0.5f

    .line 167
    .line 168
    const v13, 0x3f570a3d    # 0.84f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, 0x3fd33333    # 1.65f

    .line 173
    .line 174
    .line 175
    const v16, -0x41c7ae14    # -0.18f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41b00000    # 22.0f

    .line 182
    .line 183
    const v2, 0x41b10a3d    # 22.13f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41940000    # 18.5f

    .line 190
    .line 191
    const/high16 v18, 0x41b80000    # 23.0f

    .line 192
    .line 193
    const v13, 0x41a7999a    # 20.95f

    .line 194
    .line 195
    .line 196
    const v14, 0x41b570a4    # 22.68f

    .line 197
    .line 198
    .line 199
    const v15, 0x419e147b    # 19.76f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x41b80000    # 23.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x3fe33333    # -2.45f

    .line 208
    .line 209
    .line 210
    const v18, -0x412e147b    # -0.41f

    .line 211
    .line 212
    .line 213
    const v13, -0x40a3d70a    # -0.86f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, -0x4028f5c3    # -1.68f

    .line 218
    .line 219
    .line 220
    const v16, -0x41f0a3d7    # -0.14f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x418bc28f    # 17.47f

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x40000000    # 2.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x3f000000    # 0.5f

    .line 235
    .line 236
    const v2, -0x404b851f    # -1.41f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x40dccccd    # 6.9f

    .line 243
    .line 244
    .line 245
    const v2, 0x4020a3d7    # 2.51f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x3fdc28f6    # 1.72f

    .line 252
    .line 253
    .line 254
    const v2, -0x3f71eb85    # -4.44f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x40f1999a    # 7.55f

    .line 261
    .line 262
    .line 263
    const v2, 0x41266666    # 10.4f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x41000000    # 8.0f

    .line 270
    .line 271
    const v18, 0x40e8f5c3    # 7.28f

    .line 272
    .line 273
    .line 274
    const v13, 0x40d51eb8    # 6.66f

    .line 275
    .line 276
    .line 277
    const v14, 0x41175c29    # 9.46f

    .line 278
    .line 279
    .line 280
    const v15, 0x40dc28f6    # 6.88f

    .line 281
    .line 282
    .line 283
    const v16, 0x40fdc28f    # 7.93f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x405eb852    # 3.48f

    .line 290
    .line 291
    .line 292
    const v2, -0x3fff5c29    # -2.01f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x403a3d71    # 2.91f

    .line 299
    .line 300
    .line 301
    const v18, 0x3f8e147b    # 1.11f

    .line 302
    .line 303
    .line 304
    const v13, 0x3f8ccccd    # 1.1f

    .line 305
    .line 306
    .line 307
    const v14, -0x40dc28f6    # -0.64f

    .line 308
    .line 309
    .line 310
    const v15, 0x402147ae    # 2.52f

    .line 311
    .line 312
    .line 313
    const v16, -0x42333333    # -0.1f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x3ea8f5c3    # 0.33f

    .line 320
    .line 321
    .line 322
    const v2, 0x3f8a3d71    # 1.08f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x40351eb8    # 2.83f

    .line 329
    .line 330
    .line 331
    const v18, 0x4048f5c3    # 3.14f

    .line 332
    .line 333
    .line 334
    const v13, 0x3ee147ae    # 0.44f

    .line 335
    .line 336
    .line 337
    const v14, 0x3fb5c28f    # 1.42f

    .line 338
    .line 339
    .line 340
    const v15, 0x3fbd70a4    # 1.48f

    .line 341
    .line 342
    .line 343
    const v16, 0x40247ae1    # 2.57f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x41908f5c    # 18.07f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x41100000    # 9.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3fb70a3d    # 1.43f

    .line 358
    .line 359
    .line 360
    const v2, 0x3eeb851f    # 0.46f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, -0x4070a3d7    # -1.12f

    .line 367
    .line 368
    .line 369
    const v2, 0x405ccccd    # 3.45f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x3f53d70a    # -5.38f

    .line 376
    .line 377
    .line 378
    const v18, -0x3f75c28f    # -4.32f

    .line 379
    .line 380
    .line 381
    const v13, -0x3fe33333    # -2.45f

    .line 382
    .line 383
    .line 384
    const v14, -0x41333333    # -0.4f

    .line 385
    .line 386
    .line 387
    const v15, -0x3f70a3d7    # -4.48f

    .line 388
    .line 389
    .line 390
    const v16, -0x3ffb851f    # -2.07f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x3fde147b    # -2.53f

    .line 397
    .line 398
    .line 399
    const v2, 0x3fb9999a    # 1.45f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x4041eb85    # 3.03f

    .line 406
    .line 407
    .line 408
    const v2, 0x405d70a4    # 3.46f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x3ff1eb85    # -2.22f

    .line 415
    .line 416
    .line 417
    const v2, 0x40b851ec    # 5.76f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4045c28f    # 3.09f

    .line 424
    .line 425
    .line 426
    const v2, 0x3f8f5c29    # 1.12f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x40066666    # 2.1f

    .line 433
    .line 434
    .line 435
    const v2, -0x3f31eb85    # -6.44f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/4 v0, 0x0

    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3fb851ec    # 1.44f

    .line 449
    .line 450
    .line 451
    const v18, 0x3ed1eb85    # 0.41f

    .line 452
    .line 453
    .line 454
    const v13, 0x3eeb851f    # 0.46f

    .line 455
    .line 456
    .line 457
    const v14, 0x3e3851ec    # 0.18f

    .line 458
    .line 459
    .line 460
    const v15, 0x3f70a3d7    # 0.94f

    .line 461
    .line 462
    .line 463
    const v16, 0x3e9eb852    # 0.31f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x41a73333    # 20.9f

    .line 470
    .line 471
    .line 472
    const v2, 0x417c7ae1    # 15.78f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/16 v16, 0x3800

    .line 486
    .line 487
    const/16 v17, 0x0

    .line 488
    .line 489
    const/high16 v6, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v8, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v7, 0x0

    .line 494
    const/high16 v9, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v12, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const/4 v14, 0x0

    .line 500
    const/4 v15, 0x0

    .line 501
    const-string v4, ""

    .line 502
    .line 503
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sput-object v0, Landroidx/compose/material/icons/filled/DownhillSkiingKt;->_downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 512
    .line 513
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    return-object v0
.end method

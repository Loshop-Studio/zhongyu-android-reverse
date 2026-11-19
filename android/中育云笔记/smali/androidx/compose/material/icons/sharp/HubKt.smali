.class public final Landroidx/compose/material/icons/sharp/HubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHub(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Hub"

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
    const v0, 0x4191999a    # 18.2f

    .line 71
    .line 72
    .line 73
    const v2, 0x41066666    # 8.4f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41100000    # 9.0f

    .line 80
    .line 81
    const/high16 v18, 0x41a00000    # 20.0f

    .line 82
    .line 83
    const v13, 0x410c7ae1    # 8.78f

    .line 84
    .line 85
    .line 86
    const v14, 0x4195999a    # 18.7f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x41100000    # 9.0f

    .line 90
    .line 91
    const v16, 0x419a8f5c    # 19.32f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 98
    .line 99
    const/high16 v18, 0x40400000    # 3.0f

    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const v14, 0x3fd47ae1    # 1.66f

    .line 103
    .line 104
    .line 105
    const v15, -0x40547ae1    # -1.34f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x40400000    # 3.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, -0x40547ae1    # -1.34f

    .line 114
    .line 115
    .line 116
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x3fab851f    # 1.34f

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40400000    # 3.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, 0x3f9d70a4    # 1.23f

    .line 130
    .line 131
    .line 132
    const v18, 0x3e851eb8    # 0.26f

    .line 133
    .line 134
    .line 135
    const v13, 0x3ee147ae    # 0.44f

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const v15, 0x3f59999a    # 0.85f

    .line 140
    .line 141
    .line 142
    const v16, 0x3db851ec    # 0.09f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x401d70a4    # -1.77f

    .line 149
    .line 150
    .line 151
    const v2, 0x3fb47ae1    # 1.41f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x40747ae1    # -1.09f

    .line 158
    .line 159
    .line 160
    const v18, -0x3f93d70a    # -3.69f

    .line 161
    .line 162
    .line 163
    const v13, -0x40947ae1    # -0.92f

    .line 164
    .line 165
    .line 166
    const v14, -0x407c28f6    # -1.03f

    .line 167
    .line 168
    .line 169
    const v15, -0x405ae148    # -1.29f

    .line 170
    .line 171
    .line 172
    const v16, -0x3fe70a3d    # -2.39f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x40d1eb85    # -0.68f

    .line 179
    .line 180
    .line 181
    const v2, -0x3ffe147b    # -2.03f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40400000    # 3.0f

    .line 188
    .line 189
    const/high16 v18, 0x41480000    # 12.5f

    .line 190
    .line 191
    const v13, 0x409f5c29    # 4.98f

    .line 192
    .line 193
    .line 194
    const v14, 0x413f3333    # 11.95f

    .line 195
    .line 196
    .line 197
    const v15, 0x4081eb85    # 4.06f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x41480000    # 12.5f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 206
    .line 207
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 208
    .line 209
    const v13, -0x402b851f    # -1.66f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 214
    .line 215
    const v16, -0x40547ae1    # -1.34f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x3fab851f    # 1.34f

    .line 222
    .line 223
    .line 224
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x43dc28f6    # -0.01f

    .line 235
    .line 236
    .line 237
    const v18, 0x3e570a3d    # 0.21f

    .line 238
    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3d8f5c29    # 0.07f

    .line 242
    .line 243
    .line 244
    const/4 v15, 0x0

    .line 245
    const v16, 0x3e0f5c29    # 0.14f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x3f2e147b    # 0.68f

    .line 252
    .line 253
    .line 254
    const v2, 0x4001eb85    # 2.03f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x404e147b    # 3.22f

    .line 261
    .line 262
    .line 263
    const v18, -0x3feb851f    # -2.32f

    .line 264
    .line 265
    .line 266
    const v13, 0x3f23d70a    # 0.64f

    .line 267
    .line 268
    .line 269
    const v14, -0x40651eb8    # -1.21f

    .line 270
    .line 271
    .line 272
    const v15, 0x3fe8f5c3    # 1.82f

    .line 273
    .line 274
    .line 275
    const v16, -0x3ffa3d71    # -2.09f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/4 v0, 0x0

    .line 282
    const v2, -0x3ff5c28f    # -2.16f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x41100000    # 9.0f

    .line 289
    .line 290
    const/high16 v18, 0x40400000    # 3.0f

    .line 291
    .line 292
    const v13, 0x411f5c29    # 9.96f

    .line 293
    .line 294
    .line 295
    const v14, 0x40b23d71    # 5.57f

    .line 296
    .line 297
    .line 298
    const/high16 v15, 0x41100000    # 9.0f

    .line 299
    .line 300
    const v16, 0x408ccccd    # 4.4f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x40400000    # 3.0f

    .line 307
    .line 308
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const v14, -0x402b851f    # -1.66f

    .line 312
    .line 313
    .line 314
    const v15, 0x3fab851f    # 1.34f

    .line 315
    .line 316
    .line 317
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3fab851f    # 1.34f

    .line 323
    .line 324
    .line 325
    const/high16 v2, 0x40400000    # 3.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 331
    .line 332
    const v18, 0x403a3d71    # 2.91f

    .line 333
    .line 334
    .line 335
    const v14, 0x3fb33333    # 1.4f

    .line 336
    .line 337
    .line 338
    const v15, -0x408a3d71    # -0.96f

    .line 339
    .line 340
    .line 341
    const v16, 0x40247ae1    # 2.57f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x400a3d71    # 2.16f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x404e147b    # 3.22f

    .line 354
    .line 355
    .line 356
    const v18, 0x40147ae1    # 2.32f

    .line 357
    .line 358
    .line 359
    const v13, 0x3fb33333    # 1.4f

    .line 360
    .line 361
    .line 362
    const v14, 0x3e6b851f    # 0.23f

    .line 363
    .line 364
    .line 365
    const v15, 0x40251eb8    # 2.58f

    .line 366
    .line 367
    .line 368
    const v16, 0x3f8e147b    # 1.11f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4001eb85    # 2.03f

    .line 375
    .line 376
    .line 377
    const v2, -0x40d1eb85    # -0.68f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v17, 0x41900000    # 18.0f

    .line 384
    .line 385
    const/high16 v18, 0x41180000    # 9.5f

    .line 386
    .line 387
    const/high16 v13, 0x41900000    # 18.0f

    .line 388
    .line 389
    const v14, 0x411a3d71    # 9.64f

    .line 390
    .line 391
    .line 392
    const/high16 v15, 0x41900000    # 18.0f

    .line 393
    .line 394
    const v16, 0x41191eb8    # 9.57f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x40400000    # 3.0f

    .line 401
    .line 402
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x402b851f    # -1.66f

    .line 406
    .line 407
    .line 408
    const v15, 0x3fab851f    # 1.34f

    .line 409
    .line 410
    .line 411
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x3fab851f    # 1.34f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x40400000    # 3.0f

    .line 420
    .line 421
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x40547ae1    # -1.34f

    .line 425
    .line 426
    .line 427
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, -0x3fdeb852    # -2.52f

    .line 433
    .line 434
    .line 435
    const v18, -0x4050a3d7    # -1.37f

    .line 436
    .line 437
    .line 438
    const v13, -0x407851ec    # -1.06f

    .line 439
    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    const v15, -0x40028f5c    # -1.98f

    .line 443
    .line 444
    .line 445
    const v16, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x3f2e147b    # 0.68f

    .line 452
    .line 453
    .line 454
    const v2, -0x3ffe147b    # -2.03f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x40747ae1    # -1.09f

    .line 461
    .line 462
    .line 463
    const v18, 0x406c28f6    # 3.69f

    .line 464
    .line 465
    .line 466
    const v13, 0x3e4ccccd    # 0.2f

    .line 467
    .line 468
    .line 469
    const v14, 0x3fa51eb8    # 1.29f

    .line 470
    .line 471
    .line 472
    const v15, -0x41dc28f6    # -0.16f

    .line 473
    .line 474
    .line 475
    const v16, 0x4029999a    # 2.65f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3fe28f5c    # 1.77f

    .line 482
    .line 483
    .line 484
    const v2, 0x3fb47ae1    # 1.41f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x41900000    # 18.0f

    .line 491
    .line 492
    const/high16 v18, 0x41880000    # 17.0f

    .line 493
    .line 494
    const v13, 0x41893333    # 17.15f

    .line 495
    .line 496
    .line 497
    const v14, 0x4188b852    # 17.09f

    .line 498
    .line 499
    .line 500
    const v15, 0x418c7ae1    # 17.56f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x41880000    # 17.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x40400000    # 3.0f

    .line 509
    .line 510
    const/high16 v18, 0x40400000    # 3.0f

    .line 511
    .line 512
    const v13, 0x3fd47ae1    # 1.66f

    .line 513
    .line 514
    .line 515
    const/4 v14, 0x0

    .line 516
    const/high16 v15, 0x40400000    # 3.0f

    .line 517
    .line 518
    const v16, 0x3fab851f    # 1.34f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, -0x40547ae1    # -1.34f

    .line 525
    .line 526
    .line 527
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x3f19999a    # 0.6f

    .line 536
    .line 537
    .line 538
    const v18, -0x4019999a    # -1.8f

    .line 539
    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const v14, -0x40d1eb85    # -0.68f

    .line 543
    .line 544
    .line 545
    const v15, 0x3e6147ae    # 0.22f

    .line 546
    .line 547
    .line 548
    const v16, -0x4059999a    # -1.3f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x404b851f    # -1.41f

    .line 555
    .line 556
    .line 557
    const v2, -0x401d70a4    # -1.77f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, -0x3f7428f6    # -4.37f

    .line 564
    .line 565
    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    const v13, -0x40533333    # -1.35f

    .line 569
    .line 570
    .line 571
    const/high16 v14, 0x3f400000    # 0.75f

    .line 572
    .line 573
    const v15, -0x3fbf5c29    # -3.01f

    .line 574
    .line 575
    .line 576
    const v16, 0x3f428f5c    # 0.76f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x4191999a    # 18.2f

    .line 583
    .line 584
    .line 585
    const v2, 0x41066666    # 8.4f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    const/16 v16, 0x3800

    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    const/high16 v6, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/high16 v8, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    const/high16 v9, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/high16 v12, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    const/4 v14, 0x0

    .line 613
    const/4 v15, 0x0

    .line 614
    const-string v4, ""

    .line 615
    .line 616
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    sput-object v0, Landroidx/compose/material/icons/sharp/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    return-object v0
.end method

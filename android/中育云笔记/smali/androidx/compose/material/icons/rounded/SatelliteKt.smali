.class public final Landroidx/compose/material/icons/rounded/SatelliteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _satellite:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatellite(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SatelliteKt;->_satellite:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Satellite"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v2, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v18, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v13, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    const/high16 v15, -0x40000000    # -2.0f

    .line 93
    .line 94
    const v16, 0x3f666666    # 0.9f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41600000    # 14.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40000000    # 2.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v15, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v18, -0x40000000    # -2.0f

    .line 123
    .line 124
    const v13, 0x3f8ccccd    # 1.1f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x40000000    # 2.0f

    .line 129
    .line 130
    const v16, -0x4099999a    # -0.9f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x41a80000    # 21.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40000000    # -2.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x40733333    # -1.1f

    .line 145
    .line 146
    .line 147
    const v15, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const/high16 v16, -0x40000000    # -2.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40a00000    # 5.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40400000    # 3.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 169
    .line 170
    const/high16 v18, 0x40400000    # 3.0f

    .line 171
    .line 172
    const v14, 0x3fd47ae1    # 1.66f

    .line 173
    .line 174
    .line 175
    const v15, -0x40547ae1    # -1.34f

    .line 176
    .line 177
    .line 178
    const/high16 v16, 0x40400000    # 3.0f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x40a00000    # 5.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x412e8f5c    # 10.91f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3f59999a    # 0.85f

    .line 198
    .line 199
    .line 200
    const v18, -0x40851eb8    # -0.98f

    .line 201
    .line 202
    .line 203
    const v14, -0x41051eb8    # -0.49f

    .line 204
    .line 205
    .line 206
    const v15, 0x3eb851ec    # 0.36f

    .line 207
    .line 208
    .line 209
    const v16, -0x4099999a    # -0.9f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x40828f5c    # 4.08f

    .line 216
    .line 217
    .line 218
    const v18, -0x3f7d70a4    # -4.08f

    .line 219
    .line 220
    .line 221
    const v13, 0x40051eb8    # 2.08f

    .line 222
    .line 223
    .line 224
    const v14, -0x4147ae14    # -0.36f

    .line 225
    .line 226
    .line 227
    const v15, 0x406e147b    # 3.72f

    .line 228
    .line 229
    .line 230
    const/high16 v16, -0x40000000    # -2.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3f7ae148    # 0.98f

    .line 236
    .line 237
    .line 238
    const v18, -0x40a66666    # -0.85f

    .line 239
    .line 240
    .line 241
    const v13, 0x3da3d70a    # 0.08f

    .line 242
    .line 243
    .line 244
    const v14, -0x41051eb8    # -0.49f

    .line 245
    .line 246
    .line 247
    const v15, 0x3efae148    # 0.49f

    .line 248
    .line 249
    .line 250
    const v16, -0x40a66666    # -0.85f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const v18, 0x3f90a3d7    # 1.13f

    .line 259
    .line 260
    .line 261
    const v13, 0x3f1c28f6    # 0.61f

    .line 262
    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const v15, 0x3f8b851f    # 1.09f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f07ae14    # 0.53f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x3f475c29    # -5.77f

    .line 275
    .line 276
    .line 277
    const v18, 0x40b8f5c3    # 5.78f

    .line 278
    .line 279
    .line 280
    const v13, -0x410a3d71    # -0.48f

    .line 281
    .line 282
    .line 283
    const v14, 0x403d70a4    # 2.96f

    .line 284
    .line 285
    .line 286
    const v15, -0x3fcc28f6    # -2.81f

    .line 287
    .line 288
    .line 289
    const v16, 0x40a9999a    # 5.3f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x406e147b    # -1.14f

    .line 296
    .line 297
    .line 298
    const/high16 v18, -0x40800000    # -1.0f

    .line 299
    .line 300
    const v13, -0x40e66666    # -0.6f

    .line 301
    .line 302
    .line 303
    const v14, 0x3dcccccd    # 0.1f

    .line 304
    .line 305
    .line 306
    const v15, -0x406e147b    # -1.14f

    .line 307
    .line 308
    .line 309
    const v16, -0x413851ec    # -0.39f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40b428f6    # 5.63f

    .line 319
    .line 320
    .line 321
    const v2, 0x4189851f    # 17.19f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x401f5c29    # 2.49f

    .line 328
    .line 329
    .line 330
    const v2, -0x3fb33333    # -3.2f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3f47ae14    # 0.78f

    .line 337
    .line 338
    .line 339
    const v18, -0x43dc28f6    # -0.01f

    .line 340
    .line 341
    .line 342
    const v13, 0x3e4ccccd    # 0.2f

    .line 343
    .line 344
    .line 345
    const/high16 v14, -0x41800000    # -0.25f

    .line 346
    .line 347
    const v15, 0x3f147ae1    # 0.58f

    .line 348
    .line 349
    .line 350
    const v16, -0x417ae148    # -0.26f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x40066666    # 2.1f

    .line 357
    .line 358
    .line 359
    const v2, 0x4021eb85    # 2.53f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x40466666    # 3.1f

    .line 366
    .line 367
    .line 368
    const v2, -0x3f80a3d7    # -3.99f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x3f4ccccd    # 0.8f

    .line 375
    .line 376
    .line 377
    const v18, 0x3c23d70a    # 0.01f

    .line 378
    .line 379
    .line 380
    const v14, -0x417ae148    # -0.26f

    .line 381
    .line 382
    .line 383
    const v15, 0x3f19999a    # 0.6f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4060a3d7    # 3.51f

    .line 390
    .line 391
    .line 392
    const v2, 0x4095c28f    # 4.68f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x41333333    # -0.4f

    .line 399
    .line 400
    .line 401
    const v18, 0x3f4ccccd    # 0.8f

    .line 402
    .line 403
    .line 404
    const/high16 v13, 0x3e800000    # 0.25f

    .line 405
    .line 406
    const v14, 0x3ea8f5c3    # 0.33f

    .line 407
    .line 408
    .line 409
    const v15, 0x3c23d70a    # 0.01f

    .line 410
    .line 411
    .line 412
    const v16, 0x3f4ccccd    # 0.8f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x40c0a3d7    # 6.02f

    .line 419
    .line 420
    .line 421
    const v2, 0x4190147b    # 18.01f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, -0x413851ec    # -0.39f

    .line 428
    .line 429
    .line 430
    const v18, -0x40ae147b    # -0.82f

    .line 431
    .line 432
    .line 433
    const v13, -0x412e147b    # -0.41f

    .line 434
    .line 435
    .line 436
    const v14, -0x43dc28f6    # -0.01f

    .line 437
    .line 438
    .line 439
    const v15, -0x40d9999a    # -0.65f

    .line 440
    .line 441
    .line 442
    const v16, -0x41051eb8    # -0.49f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/16 v16, 0x3800

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v8, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const/high16 v9, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v12, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const/4 v14, 0x0

    .line 470
    const/4 v15, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    sput-object v0, Landroidx/compose/material/icons/rounded/SatelliteKt;->_satellite:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-object v0
.end method

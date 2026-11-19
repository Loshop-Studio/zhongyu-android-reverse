.class public final Landroidx/compose/material/icons/sharp/PsychologyAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychologyAlt(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PsychologyAlt"

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
    const v0, 0x419f851f    # 19.94f

    .line 71
    .line 72
    .line 73
    const v2, 0x4110f5c3    # 9.06f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41500000    # 13.0f

    .line 80
    .line 81
    const/high16 v18, 0x40400000    # 3.0f

    .line 82
    .line 83
    const/high16 v13, 0x419c0000    # 19.5f

    .line 84
    .line 85
    const v14, 0x40b75c29    # 5.73f

    .line 86
    .line 87
    .line 88
    const v15, 0x41848f5c    # 16.57f

    .line 89
    .line 90
    .line 91
    const/high16 v16, 0x40400000    # 3.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x40c28f5c    # 6.08f

    .line 97
    .line 98
    .line 99
    const/high16 v18, 0x41100000    # 9.0f

    .line 100
    .line 101
    const v13, 0x4117851f    # 9.47f

    .line 102
    .line 103
    .line 104
    const/high16 v14, 0x40400000    # 3.0f

    .line 105
    .line 106
    const v15, 0x40d23d71    # 6.57f

    .line 107
    .line 108
    .line 109
    const v16, 0x40b3851f    # 5.61f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x4008f5c3    # -1.93f

    .line 116
    .line 117
    .line 118
    const v2, 0x405eb852    # 3.48f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const/high16 v18, 0x41600000    # 14.0f

    .line 127
    .line 128
    const v13, 0x406f5c29    # 3.74f

    .line 129
    .line 130
    .line 131
    const v14, 0x41523d71    # 13.14f

    .line 132
    .line 133
    .line 134
    const v15, 0x40870a3d    # 4.22f

    .line 135
    .line 136
    .line 137
    const/high16 v16, 0x41600000    # 14.0f

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x3f800000    # 1.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x40800000    # 4.0f

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40400000    # 3.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40e00000    # 7.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x3f6a3d71    # -4.68f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x419f851f    # 19.94f

    .line 173
    .line 174
    .line 175
    const v18, 0x4110f5c3    # 9.06f

    .line 176
    .line 177
    .line 178
    const v13, 0x4194f5c3    # 18.62f

    .line 179
    .line 180
    .line 181
    const v14, 0x41711eb8    # 15.07f

    .line 182
    .line 183
    .line 184
    const v15, 0x41a2cccd    # 20.35f

    .line 185
    .line 186
    .line 187
    const v16, 0x4143d70a    # 12.24f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x41480000    # 12.5f

    .line 197
    .line 198
    const/high16 v2, 0x41600000    # 14.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x40c28f5c    # -0.74f

    .line 204
    .line 205
    .line 206
    const v18, -0x40c28f5c    # -0.74f

    .line 207
    .line 208
    .line 209
    const v13, -0x412e147b    # -0.41f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const v15, -0x40c28f5c    # -0.74f

    .line 214
    .line 215
    .line 216
    const v16, -0x41570a3d    # -0.33f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x3f3d70a4    # 0.74f

    .line 223
    .line 224
    .line 225
    const v18, -0x40c51eb8    # -0.73f

    .line 226
    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, -0x412e147b    # -0.41f

    .line 230
    .line 231
    .line 232
    const v15, 0x3ea8f5c3    # 0.33f

    .line 233
    .line 234
    .line 235
    const v16, -0x40c51eb8    # -0.73f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3f3ae148    # 0.73f

    .line 242
    .line 243
    .line 244
    const v18, 0x3f3ae148    # 0.73f

    .line 245
    .line 246
    .line 247
    const v13, 0x3ed1eb85    # 0.41f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const v15, 0x3f3ae148    # 0.73f

    .line 252
    .line 253
    .line 254
    const v16, 0x3ea3d70a    # 0.32f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x41480000    # 12.5f

    .line 261
    .line 262
    const/high16 v18, 0x41600000    # 14.0f

    .line 263
    .line 264
    const v13, 0x4153ae14    # 13.23f

    .line 265
    .line 266
    .line 267
    const v14, 0x415ab852    # 13.67f

    .line 268
    .line 269
    .line 270
    const v15, 0x414eb852    # 12.92f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x41600000    # 14.0f

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
    const v0, 0x416428f6    # 14.26f

    .line 282
    .line 283
    .line 284
    const v2, 0x411ae148    # 9.68f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x40747ae1    # -1.09f

    .line 291
    .line 292
    .line 293
    const v18, 0x3fa28f5c    # 1.27f

    .line 294
    .line 295
    .line 296
    const v13, -0x411eb852    # -0.44f

    .line 297
    .line 298
    .line 299
    const v14, 0x3f266666    # 0.65f

    .line 300
    .line 301
    .line 302
    const v15, -0x40a3d70a    # -0.86f

    .line 303
    .line 304
    .line 305
    const v16, 0x3f59999a    # 0.85f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x41fae148    # -0.13f

    .line 312
    .line 313
    .line 314
    const v18, 0x3f51eb85    # 0.82f

    .line 315
    .line 316
    .line 317
    const v13, -0x4247ae14    # -0.09f

    .line 318
    .line 319
    .line 320
    const v14, 0x3e2e147b    # 0.17f

    .line 321
    .line 322
    .line 323
    const v15, -0x41fae148    # -0.13f

    .line 324
    .line 325
    .line 326
    const v16, 0x3e8f5c29    # 0.28f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x407851ec    # -1.06f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x3e3851ec    # 0.18f

    .line 339
    .line 340
    .line 341
    const v18, -0x406b851f    # -1.16f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x416b851f    # -0.29f

    .line 346
    .line 347
    .line 348
    const v15, -0x42dc28f6    # -0.04f

    .line 349
    .line 350
    .line 351
    const/high16 v16, -0x40c00000    # -0.75f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3f91eb85    # 1.14f

    .line 357
    .line 358
    .line 359
    const v18, -0x405eb852    # -1.26f

    .line 360
    .line 361
    .line 362
    const v13, 0x3e8f5c29    # 0.28f

    .line 363
    .line 364
    .line 365
    const v14, -0x40fd70a4    # -0.51f

    .line 366
    .line 367
    .line 368
    const v15, 0x3f547ae1    # 0.83f

    .line 369
    .line 370
    .line 371
    const v16, -0x40b0a3d7    # -0.81f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, -0x40b33333    # -0.8f

    .line 378
    .line 379
    .line 380
    const v18, -0x4051eb85    # -1.36f

    .line 381
    .line 382
    .line 383
    const v13, 0x3ea8f5c3    # 0.33f

    .line 384
    .line 385
    .line 386
    const v14, -0x410f5c29    # -0.47f

    .line 387
    .line 388
    .line 389
    const v15, 0x3e19999a    # 0.15f

    .line 390
    .line 391
    .line 392
    const v16, -0x4051eb85    # -1.36f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x4079999a    # -1.05f

    .line 399
    .line 400
    .line 401
    const v18, 0x3f5c28f6    # 0.86f

    .line 402
    .line 403
    .line 404
    const v13, -0x40e147ae    # -0.62f

    .line 405
    .line 406
    .line 407
    const/4 v14, 0x0

    .line 408
    const v15, -0x40947ae1    # -0.92f

    .line 409
    .line 410
    .line 411
    const v16, 0x3ef0a3d7    # 0.47f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x408a3d71    # -0.96f

    .line 418
    .line 419
    .line 420
    const v2, -0x41333333    # -0.4f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, 0x41480000    # 12.5f

    .line 427
    .line 428
    const/high16 v18, 0x40e00000    # 7.0f

    .line 429
    .line 430
    const v13, 0x412c28f6    # 10.76f

    .line 431
    .line 432
    .line 433
    const v14, 0x40f570a4    # 7.67f

    .line 434
    .line 435
    .line 436
    const v15, 0x41375c29    # 11.46f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x40e00000    # 7.0f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 445
    .line 446
    const v18, 0x3f6147ae    # 0.88f

    .line 447
    .line 448
    .line 449
    const v13, 0x3f5c28f6    # 0.86f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const v15, 0x3fb9999a    # 1.45f

    .line 454
    .line 455
    .line 456
    const v16, 0x3ec7ae14    # 0.39f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x416428f6    # 14.26f

    .line 463
    .line 464
    .line 465
    const v18, 0x411ae148    # 9.68f

    .line 466
    .line 467
    .line 468
    const v13, 0x416828f6    # 14.51f

    .line 469
    .line 470
    .line 471
    const v14, 0x4104f5c3    # 8.31f

    .line 472
    .line 473
    .line 474
    const v15, 0x416a8f5c    # 14.66f

    .line 475
    .line 476
    .line 477
    const v16, 0x4111999a    # 9.1f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/16 v16, 0x3800

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/high16 v6, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v8, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v7, 0x0

    .line 499
    const/high16 v9, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v12, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v13, 0x0

    .line 504
    const/4 v14, 0x0

    .line 505
    const/4 v15, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    sput-object v0, Landroidx/compose/material/icons/sharp/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 517
    .line 518
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    return-object v0
.end method

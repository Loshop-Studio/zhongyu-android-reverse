.class public final Landroidx/compose/material/icons/rounded/MicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _micOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MicOff"

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
    const v0, 0x4129999a    # 10.6f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41700000    # 15.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40a00000    # 5.0f

    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 84
    .line 85
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x402b851f    # -1.66f

    .line 89
    .line 90
    .line 91
    const v15, -0x40547ae1    # -1.34f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x3fc28f5c    # -2.96f

    .line 100
    .line 101
    .line 102
    const v18, 0x4029999a    # 2.65f

    .line 103
    .line 104
    .line 105
    const v13, -0x403ae148    # -1.54f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const v15, -0x3fcd70a4    # -2.79f

    .line 110
    .line 111
    .line 112
    const v16, 0x3f947ae1    # 1.16f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4129999a    # 10.6f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, 0x4190a3d7    # 18.08f

    .line 128
    .line 129
    .line 130
    const/high16 v2, 0x41300000    # 11.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40ab851f    # -0.83f

    .line 136
    .line 137
    .line 138
    const v18, 0x3f35c28f    # 0.71f

    .line 139
    .line 140
    .line 141
    const v13, -0x412e147b    # -0.41f

    .line 142
    .line 143
    .line 144
    const v15, -0x40bae148    # -0.77f

    .line 145
    .line 146
    .line 147
    const v16, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x419eb852    # -0.22f

    .line 154
    .line 155
    .line 156
    const v18, 0x3f6e147b    # 0.93f

    .line 157
    .line 158
    .line 159
    const v13, -0x42b33333    # -0.05f

    .line 160
    .line 161
    .line 162
    const v14, 0x3ea3d70a    # 0.32f

    .line 163
    .line 164
    .line 165
    const v15, -0x420a3d71    # -0.12f

    .line 166
    .line 167
    .line 168
    const v16, 0x3f23d70a    # 0.64f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3fa28f5c    # 1.27f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3f2147ae    # 0.63f

    .line 181
    .line 182
    .line 183
    const v18, -0x4007ae14    # -1.94f

    .line 184
    .line 185
    .line 186
    const v13, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const v14, -0x40e66666    # -0.6f

    .line 190
    .line 191
    .line 192
    const v15, 0x3f051eb8    # 0.52f

    .line 193
    .line 194
    .line 195
    const/high16 v16, -0x40600000    # -1.25f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, -0x40a66666    # -0.85f

    .line 201
    .line 202
    .line 203
    const v18, -0x4087ae14    # -0.97f

    .line 204
    .line 205
    .line 206
    const v13, 0x3d8f5c29    # 0.07f

    .line 207
    .line 208
    .line 209
    const v14, -0x40fd70a4    # -0.51f

    .line 210
    .line 211
    .line 212
    const v15, -0x41570a3d    # -0.33f

    .line 213
    .line 214
    .line 215
    const v16, -0x4087ae14    # -0.97f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x406d70a4    # 3.71f

    .line 225
    .line 226
    .line 227
    const v2, 0x4063d70a    # 3.56f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const v18, 0x3fb47ae1    # 1.41f

    .line 236
    .line 237
    .line 238
    const v13, -0x413851ec    # -0.39f

    .line 239
    .line 240
    .line 241
    const v14, 0x3ec7ae14    # 0.39f

    .line 242
    .line 243
    .line 244
    const v15, -0x413851ec    # -0.39f

    .line 245
    .line 246
    .line 247
    const v16, 0x3f828f5c    # 1.02f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x41100000    # 9.0f

    .line 254
    .line 255
    const v2, 0x412451ec    # 10.27f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x3edc28f6    # 0.43f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x3fd0a3d7    # 1.63f

    .line 268
    .line 269
    .line 270
    const v18, 0x403a3d71    # 2.91f

    .line 271
    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, 0x3f9851ec    # 1.19f

    .line 275
    .line 276
    .line 277
    const v15, 0x3f19999a    # 0.6f

    .line 278
    .line 279
    .line 280
    const v16, 0x40147ae1    # 2.32f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x400147ae    # 2.02f

    .line 287
    .line 288
    .line 289
    const v18, 0x3e9eb852    # 0.31f

    .line 290
    .line 291
    .line 292
    const/high16 v13, 0x3f400000    # 0.75f

    .line 293
    .line 294
    const v14, 0x3edc28f6    # 0.43f

    .line 295
    .line 296
    .line 297
    const v15, 0x3fb47ae1    # 1.41f

    .line 298
    .line 299
    .line 300
    const v16, 0x3ee147ae    # 0.44f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x3fd47ae1    # 1.66f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, -0x3fec28f6    # -2.31f

    .line 313
    .line 314
    .line 315
    const v18, 0x3f051eb8    # 0.52f

    .line 316
    .line 317
    .line 318
    const v13, -0x40ca3d71    # -0.71f

    .line 319
    .line 320
    .line 321
    const v14, 0x3ea8f5c3    # 0.33f

    .line 322
    .line 323
    .line 324
    const/high16 v15, -0x40400000    # -1.5f

    .line 325
    .line 326
    const v16, 0x3f051eb8    # 0.52f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x3f580000    # -5.25f

    .line 333
    .line 334
    const v18, -0x3f73851f    # -4.39f

    .line 335
    .line 336
    .line 337
    const v13, -0x3fdd70a4    # -2.54f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const v15, -0x3f63d70a    # -4.88f

    .line 342
    .line 343
    .line 344
    const v16, -0x401d70a4    # -1.77f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x40ab851f    # -0.83f

    .line 351
    .line 352
    .line 353
    const v18, -0x40ca3d71    # -0.71f

    .line 354
    .line 355
    .line 356
    const v13, -0x428a3d71    # -0.06f

    .line 357
    .line 358
    .line 359
    const v14, -0x412e147b    # -0.41f

    .line 360
    .line 361
    .line 362
    const v15, -0x4128f5c3    # -0.42f

    .line 363
    .line 364
    .line 365
    const v16, -0x40ca3d71    # -0.71f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x40a66666    # -0.85f

    .line 372
    .line 373
    .line 374
    const v18, 0x3f7851ec    # 0.97f

    .line 375
    .line 376
    .line 377
    const v13, -0x40fae148    # -0.52f

    .line 378
    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    const v15, -0x40947ae1    # -0.92f

    .line 382
    .line 383
    .line 384
    const v16, 0x3eeb851f    # 0.46f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x40bdc28f    # 5.93f

    .line 391
    .line 392
    .line 393
    const/high16 v18, 0x40b80000    # 5.75f

    .line 394
    .line 395
    const v13, 0x3eeb851f    # 0.46f

    .line 396
    .line 397
    .line 398
    const v14, 0x403d70a4    # 2.96f

    .line 399
    .line 400
    .line 401
    const v15, 0x403d70a4    # 2.96f

    .line 402
    .line 403
    .line 404
    const v16, 0x40a9999a    # 5.3f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41a00000    # 20.0f

    .line 411
    .line 412
    const/high16 v2, 0x41300000    # 11.0f

    .line 413
    .line 414
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/high16 v18, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const v14, 0x3f0ccccd    # 0.55f

    .line 423
    .line 424
    .line 425
    const v15, 0x3ee66666    # 0.45f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x3f800000    # 1.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v2, -0x40800000    # -1.0f

    .line 437
    .line 438
    const/high16 v4, 0x3f800000    # 1.0f

    .line 439
    .line 440
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x3fee147b    # -2.28f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x40233333    # 2.55f

    .line 450
    .line 451
    .line 452
    const v18, -0x4099999a    # -0.9f

    .line 453
    .line 454
    .line 455
    const v13, 0x3f68f5c3    # 0.91f

    .line 456
    .line 457
    .line 458
    const v14, -0x41fae148    # -0.13f

    .line 459
    .line 460
    .line 461
    const v15, 0x3fe28f5c    # 1.77f

    .line 462
    .line 463
    .line 464
    const v16, -0x4119999a    # -0.45f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x405f5c29    # 3.49f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x3fb47ae1    # 1.41f

    .line 477
    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    const v13, 0x3ec7ae14    # 0.39f

    .line 482
    .line 483
    .line 484
    const v14, 0x3ec7ae14    # 0.39f

    .line 485
    .line 486
    .line 487
    const v15, 0x3f828f5c    # 1.02f

    .line 488
    .line 489
    .line 490
    const v16, 0x3ec7ae14    # 0.39f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const v18, -0x404b851f    # -1.41f

    .line 499
    .line 500
    .line 501
    const v14, -0x413851ec    # -0.39f

    .line 502
    .line 503
    .line 504
    const v15, 0x3ec7ae14    # 0.39f

    .line 505
    .line 506
    .line 507
    const v16, -0x407d70a4    # -1.02f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x40a3d70a    # 5.12f

    .line 514
    .line 515
    .line 516
    const v2, 0x4063d70a    # 3.56f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, -0x404b851f    # -1.41f

    .line 523
    .line 524
    .line 525
    const/16 v18, 0x0

    .line 526
    .line 527
    const v13, -0x413851ec    # -0.39f

    .line 528
    .line 529
    .line 530
    const v15, -0x407d70a4    # -1.02f

    .line 531
    .line 532
    .line 533
    const v16, -0x413851ec    # -0.39f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    const/16 v16, 0x3800

    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const/high16 v6, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/high16 v8, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/4 v7, 0x0

    .line 555
    const/high16 v9, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/high16 v12, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const/4 v14, 0x0

    .line 561
    const/4 v15, 0x0

    .line 562
    const-string v4, ""

    .line 563
    .line 564
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sput-object v0, Landroidx/compose/material/icons/rounded/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 573
    .line 574
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    return-object v0
.end method

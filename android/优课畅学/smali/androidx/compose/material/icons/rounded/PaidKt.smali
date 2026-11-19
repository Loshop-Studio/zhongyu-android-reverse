.class public final Landroidx/compose/material/icons/rounded/PaidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _paid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPaid(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Paid"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x418c28f6    # 17.52f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x41400000    # 12.0f

    .line 116
    .line 117
    const/high16 v4, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x414e147b    # 12.88f

    .line 126
    .line 127
    .line 128
    const v2, 0x418e147b    # 17.76f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x3eb851ec    # 0.36f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x409eb852    # -0.88f

    .line 141
    .line 142
    .line 143
    const v18, 0x3f6147ae    # 0.88f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3ef5c28f    # 0.48f

    .line 148
    .line 149
    .line 150
    const v15, -0x413851ec    # -0.39f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f6147ae    # 0.88f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/4 v0, 0x0

    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v18, -0x409eb852    # -0.88f

    .line 164
    .line 165
    .line 166
    const v13, -0x410a3d71    # -0.48f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, -0x409eb852    # -0.88f

    .line 171
    .line 172
    .line 173
    const v16, -0x413851ec    # -0.39f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x4128f5c3    # -0.42f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, -0x3fd3d70a    # -2.69f

    .line 186
    .line 187
    .line 188
    const v18, -0x3ff9999a    # -2.1f

    .line 189
    .line 190
    .line 191
    const v13, -0x40deb852    # -0.63f

    .line 192
    .line 193
    .line 194
    const v14, -0x41e66666    # -0.15f

    .line 195
    .line 196
    .line 197
    const v15, -0x4008f5c3    # -1.93f

    .line 198
    .line 199
    .line 200
    const v16, -0x40e3d70a    # -0.61f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    const v18, -0x4068f5c3    # -1.18f

    .line 210
    .line 211
    .line 212
    const v13, -0x41947ae1    # -0.23f

    .line 213
    .line 214
    .line 215
    const v14, -0x411eb852    # -0.44f

    .line 216
    .line 217
    .line 218
    const v15, -0x43dc28f6    # -0.01f

    .line 219
    .line 220
    .line 221
    const v16, -0x40828f5c    # -0.99f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x3d8f5c29    # 0.07f

    .line 228
    .line 229
    .line 230
    const v2, -0x430a3d71    # -0.03f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3f8a3d71    # 1.08f

    .line 237
    .line 238
    .line 239
    const v18, 0x3ec7ae14    # 0.39f

    .line 240
    .line 241
    .line 242
    const v13, 0x3ed1eb85    # 0.41f

    .line 243
    .line 244
    .line 245
    const v14, -0x41d1eb85    # -0.17f

    .line 246
    .line 247
    .line 248
    const v15, 0x3f5eb852    # 0.87f

    .line 249
    .line 250
    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x4007ae14    # 2.12f

    .line 257
    .line 258
    .line 259
    const v18, 0x3faf5c29    # 1.37f

    .line 260
    .line 261
    .line 262
    const v13, 0x3ea3d70a    # 0.32f

    .line 263
    .line 264
    .line 265
    const v14, 0x3f1c28f6    # 0.61f

    .line 266
    .line 267
    .line 268
    const v15, 0x3f733333    # 0.95f

    .line 269
    .line 270
    .line 271
    const v16, 0x3faf5c29    # 1.37f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3ffd70a4    # 1.98f

    .line 278
    .line 279
    .line 280
    const v18, -0x4031eb85    # -1.61f

    .line 281
    .line 282
    .line 283
    const v13, 0x3f6e147b    # 0.93f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const v15, 0x3ffd70a4    # 1.98f

    .line 288
    .line 289
    .line 290
    const v16, -0x410a3d71    # -0.48f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x3fee147b    # -2.28f

    .line 297
    .line 298
    .line 299
    const v18, -0x3ffe147b    # -2.03f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, -0x408a3d71    # -0.96f

    .line 304
    .line 305
    .line 306
    const v15, -0x40cccccd    # -0.7f

    .line 307
    .line 308
    .line 309
    const v16, -0x40451eb8    # -1.46f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x3fa9999a    # -3.35f

    .line 316
    .line 317
    .line 318
    const v18, -0x3fac28f6    # -3.31f

    .line 319
    .line 320
    .line 321
    const v13, -0x40733333    # -1.1f

    .line 322
    .line 323
    .line 324
    const v14, -0x413851ec    # -0.39f

    .line 325
    .line 326
    .line 327
    const v15, -0x3fa9999a    # -3.35f

    .line 328
    .line 329
    .line 330
    const v16, -0x407c28f6    # -1.03f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x4027ae14    # 2.62f

    .line 337
    .line 338
    .line 339
    const v18, -0x3fc28f5c    # -2.96f

    .line 340
    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const v14, -0x42333333    # -0.1f

    .line 344
    .line 345
    .line 346
    const v15, 0x3c23d70a    # 0.01f

    .line 347
    .line 348
    .line 349
    const v16, -0x3fe66666    # -2.4f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x40bc28f6    # 5.88f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x41400000    # 12.0f

    .line 362
    .line 363
    const/high16 v18, 0x40a00000    # 5.0f

    .line 364
    .line 365
    const v13, 0x4131eb85    # 11.12f

    .line 366
    .line 367
    .line 368
    const v14, 0x40ac7ae1    # 5.39f

    .line 369
    .line 370
    .line 371
    const v15, 0x413851ec    # 11.52f

    .line 372
    .line 373
    .line 374
    const/high16 v16, 0x40a00000    # 5.0f

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/4 v0, 0x0

    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3f6147ae    # 0.88f

    .line 384
    .line 385
    .line 386
    const v18, 0x3f6147ae    # 0.88f

    .line 387
    .line 388
    .line 389
    const v13, 0x3ef5c28f    # 0.48f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const v15, 0x3f6147ae    # 0.88f

    .line 394
    .line 395
    .line 396
    const v16, 0x3ec7ae14    # 0.39f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3ebd70a4    # 0.37f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x400a3d71    # 2.16f

    .line 409
    .line 410
    .line 411
    const v18, 0x3fa66666    # 1.3f

    .line 412
    .line 413
    .line 414
    const v13, 0x3f88f5c3    # 1.07f

    .line 415
    .line 416
    .line 417
    const v14, 0x3e428f5c    # 0.19f

    .line 418
    .line 419
    .line 420
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 421
    .line 422
    const v16, 0x3f428f5c    # 0.76f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x4147ae14    # -0.36f

    .line 429
    .line 430
    .line 431
    const v13, 0x3eae147b    # 0.34f

    .line 432
    .line 433
    .line 434
    const v14, 0x3ee147ae    # 0.44f

    .line 435
    .line 436
    .line 437
    const v15, 0x3e23d70a    # 0.16f

    .line 438
    .line 439
    .line 440
    const v16, 0x3f8a3d71    # 1.08f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/4 v0, 0x0

    .line 447
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x415a8f5c    # 13.66f

    .line 451
    .line 452
    .line 453
    const v18, 0x41091eb8    # 8.57f

    .line 454
    .line 455
    .line 456
    const v13, 0x41651eb8    # 14.32f

    .line 457
    .line 458
    .line 459
    const/high16 v14, 0x41100000    # 9.0f

    .line 460
    .line 461
    const v15, 0x415e6666    # 13.9f

    .line 462
    .line 463
    .line 464
    const v16, 0x410e147b    # 8.88f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, -0x40333333    # -1.6f

    .line 471
    .line 472
    .line 473
    const v18, -0x40bae148    # -0.77f

    .line 474
    .line 475
    .line 476
    const v13, -0x4170a3d7    # -0.28f

    .line 477
    .line 478
    .line 479
    const v14, -0x413d70a4    # -0.38f

    .line 480
    .line 481
    .line 482
    const v15, -0x40b851ec    # -0.78f

    .line 483
    .line 484
    .line 485
    const v16, -0x40bae148    # -0.77f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, -0x401851ec    # -1.81f

    .line 492
    .line 493
    .line 494
    const v18, 0x3fb1eb85    # 1.39f

    .line 495
    .line 496
    .line 497
    const v13, -0x40cccccd    # -0.7f

    .line 498
    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const v15, -0x401851ec    # -1.81f

    .line 502
    .line 503
    .line 504
    const v16, 0x3ebd70a4    # 0.37f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x4028f5c3    # 2.64f

    .line 511
    .line 512
    .line 513
    const v18, 0x3ff33333    # 1.9f

    .line 514
    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const v14, 0x3f733333    # 0.95f

    .line 518
    .line 519
    .line 520
    const v15, 0x3f5c28f6    # 0.86f

    .line 521
    .line 522
    .line 523
    const v16, 0x3fa7ae14    # 1.31f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x4040a3d7    # 3.01f

    .line 530
    .line 531
    .line 532
    const v18, 0x405ccccd    # 3.45f

    .line 533
    .line 534
    .line 535
    const v13, 0x4019999a    # 2.4f

    .line 536
    .line 537
    .line 538
    const v14, 0x3f547ae1    # 0.83f

    .line 539
    .line 540
    .line 541
    const v15, 0x4040a3d7    # 3.01f

    .line 542
    .line 543
    .line 544
    const v16, 0x40033333    # 2.05f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, 0x414e147b    # 12.88f

    .line 551
    .line 552
    .line 553
    const v18, 0x418e147b    # 17.76f

    .line 554
    .line 555
    .line 556
    const v13, 0x417e6666    # 15.9f

    .line 557
    .line 558
    .line 559
    const v14, 0x41895c29    # 17.17f

    .line 560
    .line 561
    .line 562
    const v15, 0x41566666    # 13.4f

    .line 563
    .line 564
    .line 565
    const v16, 0x418d5c29    # 17.67f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/16 v16, 0x3800

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v8, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v7, 0x0

    .line 587
    const/high16 v9, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v12, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v14, 0x0

    .line 593
    const/4 v15, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    sput-object v0, Landroidx/compose/material/icons/rounded/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    return-object v0
.end method

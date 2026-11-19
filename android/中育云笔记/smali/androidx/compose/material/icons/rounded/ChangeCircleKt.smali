.class public final Landroidx/compose/material/icons/rounded/ChangeCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChangeCircle(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ChangeCircleKt;->_changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ChangeCircle"

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
    const/high16 v17, 0x41200000    # 10.0f

    .line 95
    .line 96
    const/high16 v18, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x40b0a3d7    # 5.52f

    .line 100
    .line 101
    .line 102
    const v15, 0x408f5c29    # 4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v16, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, -0x3f70a3d7    # -4.48f

    .line 111
    .line 112
    .line 113
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 114
    .line 115
    const/high16 v4, 0x41200000    # 10.0f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v18, 0x40000000    # 2.0f

    .line 123
    .line 124
    const/high16 v13, 0x41b00000    # 22.0f

    .line 125
    .line 126
    const v14, 0x40cf5c29    # 6.48f

    .line 127
    .line 128
    .line 129
    const v15, 0x418c28f6    # 17.52f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x41913333    # 18.15f

    .line 141
    .line 142
    .line 143
    const v2, 0x414e8f5c    # 12.91f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x40a66666    # -0.85f

    .line 150
    .line 151
    .line 152
    const v18, -0x414ccccd    # -0.35f

    .line 153
    .line 154
    .line 155
    const v13, -0x416147ae    # -0.31f

    .line 156
    .line 157
    .line 158
    const v14, 0x3e9eb852    # 0.31f

    .line 159
    .line 160
    .line 161
    const v15, -0x40a66666    # -0.85f

    .line 162
    .line 163
    .line 164
    const v16, 0x3db851ec    # 0.09f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x40b33333    # -0.8f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x428a3d71    # -0.06f

    .line 177
    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const v13, -0x435c28f6    # -0.02f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const v15, -0x42dc28f6    # -0.04f

    .line 186
    .line 187
    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x3f9d70a4    # -3.54f

    .line 194
    .line 195
    .line 196
    const v18, -0x40451eb8    # -1.46f

    .line 197
    .line 198
    .line 199
    const v13, -0x405c28f6    # -1.28f

    .line 200
    .line 201
    .line 202
    const v15, -0x3fdc28f6    # -2.56f

    .line 203
    .line 204
    .line 205
    const v16, -0x41051eb8    # -0.49f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x406e147b    # -1.14f

    .line 212
    .line 213
    .line 214
    const v18, -0x3f566666    # -5.3f

    .line 215
    .line 216
    .line 217
    const v13, -0x4048f5c3    # -1.43f

    .line 218
    .line 219
    .line 220
    const v14, -0x4048f5c3    # -1.43f

    .line 221
    .line 222
    .line 223
    const v15, -0x401851ec    # -1.81f

    .line 224
    .line 225
    .line 226
    const v16, -0x3f9eb852    # -3.52f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x3f9eb852    # 1.24f

    .line 233
    .line 234
    .line 235
    const/high16 v18, -0x41800000    # -0.25f

    .line 236
    .line 237
    const v13, 0x3e428f5c    # 0.19f

    .line 238
    .line 239
    .line 240
    const v14, -0x40fd70a4    # -0.51f

    .line 241
    .line 242
    .line 243
    const v15, 0x3f5c28f6    # 0.86f

    .line 244
    .line 245
    .line 246
    const v16, -0x40dc28f6    # -0.64f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3e2e147b    # 0.17f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f51eb85    # 0.82f

    .line 260
    .line 261
    .line 262
    const v13, 0x3e6147ae    # 0.22f

    .line 263
    .line 264
    .line 265
    const v14, 0x3e6147ae    # 0.22f

    .line 266
    .line 267
    .line 268
    const v15, 0x3e8a3d71    # 0.27f

    .line 269
    .line 270
    .line 271
    const v16, 0x3f0a3d71    # 0.54f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3f4ccccd    # 0.8f

    .line 278
    .line 279
    .line 280
    const v18, 0x406b851f    # 3.68f

    .line 281
    .line 282
    .line 283
    const v13, -0x41147ae1    # -0.46f

    .line 284
    .line 285
    .line 286
    const v14, 0x3f9eb852    # 1.24f

    .line 287
    .line 288
    .line 289
    const v15, -0x41b33333    # -0.2f

    .line 290
    .line 291
    .line 292
    const v16, 0x402b851f    # 2.68f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x40228f5c    # 2.54f

    .line 299
    .line 300
    .line 301
    const v18, 0x3f8147ae    # 1.01f

    .line 302
    .line 303
    .line 304
    const v13, 0x3f333333    # 0.7f

    .line 305
    .line 306
    .line 307
    const v14, 0x3f333333    # 0.7f

    .line 308
    .line 309
    .line 310
    const v15, 0x3fcf5c29    # 1.62f

    .line 311
    .line 312
    .line 313
    const v16, 0x3f83d70a    # 1.03f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x408f5c29    # -0.94f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3f59999a    # 0.85f

    .line 326
    .line 327
    .line 328
    const v18, -0x414ccccd    # -0.35f

    .line 329
    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, -0x4119999a    # -0.45f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f0a3d71    # 0.54f

    .line 336
    .line 337
    .line 338
    const v16, -0x40d47ae1    # -0.67f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3fcf5c29    # 1.62f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const v18, 0x3f35c28f    # 0.71f

    .line 353
    .line 354
    .line 355
    const v13, 0x3e4ccccd    # 0.2f

    .line 356
    .line 357
    .line 358
    const v14, 0x3e4ccccd    # 0.2f

    .line 359
    .line 360
    .line 361
    const v15, 0x3e4ccccd    # 0.2f

    .line 362
    .line 363
    .line 364
    const v16, 0x3f028f5c    # 0.51f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x41913333    # 18.15f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x416051ec    # 14.02f

    .line 380
    .line 381
    .line 382
    const v2, 0x41770a3d    # 15.44f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x41d1eb85    # -0.17f

    .line 392
    .line 393
    .line 394
    const v18, -0x40ae147b    # -0.82f

    .line 395
    .line 396
    .line 397
    const v13, -0x419eb852    # -0.22f

    .line 398
    .line 399
    .line 400
    const v14, -0x419eb852    # -0.22f

    .line 401
    .line 402
    .line 403
    const v15, -0x4175c28f    # -0.27f

    .line 404
    .line 405
    .line 406
    const v16, -0x40f5c28f    # -0.54f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x40b33333    # -0.8f

    .line 413
    .line 414
    .line 415
    const v18, -0x3f947ae1    # -3.68f

    .line 416
    .line 417
    .line 418
    const v13, 0x3eeb851f    # 0.46f

    .line 419
    .line 420
    .line 421
    const v14, -0x406147ae    # -1.24f

    .line 422
    .line 423
    .line 424
    const v15, 0x3e4ccccd    # 0.2f

    .line 425
    .line 426
    .line 427
    const v16, -0x3fd47ae1    # -2.68f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x3fde147b    # -2.53f

    .line 434
    .line 435
    .line 436
    const v18, -0x407d70a4    # -1.02f

    .line 437
    .line 438
    .line 439
    const v13, -0x40cccccd    # -0.7f

    .line 440
    .line 441
    .line 442
    const v14, -0x40cccccd    # -0.7f

    .line 443
    .line 444
    .line 445
    const v15, -0x4030a3d7    # -1.62f

    .line 446
    .line 447
    .line 448
    const v16, -0x407ae148    # -1.04f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/16 v17, 0x0

    .line 455
    .line 456
    const/16 v18, 0x0

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const/16 v16, 0x0

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3f70a3d7    # 0.94f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, -0x40a66666    # -0.85f

    .line 473
    .line 474
    .line 475
    const v18, 0x3eb33333    # 0.35f

    .line 476
    .line 477
    .line 478
    const v14, 0x3ee66666    # 0.45f

    .line 479
    .line 480
    .line 481
    const v15, -0x40f5c28f    # -0.54f

    .line 482
    .line 483
    .line 484
    const v16, 0x3f2b851f    # 0.67f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x41175c29    # 9.46f

    .line 491
    .line 492
    .line 493
    const v2, 0x4102e148    # 8.18f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/16 v17, 0x0

    .line 500
    .line 501
    const v18, -0x40ca3d71    # -0.71f

    .line 502
    .line 503
    .line 504
    const v13, -0x41b33333    # -0.2f

    .line 505
    .line 506
    .line 507
    const v14, -0x41b33333    # -0.2f

    .line 508
    .line 509
    .line 510
    const v15, -0x41b33333    # -0.2f

    .line 511
    .line 512
    .line 513
    const v16, -0x40fd70a4    # -0.51f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, -0x4030a3d7    # -1.62f

    .line 520
    .line 521
    .line 522
    const v2, 0x3fcf5c29    # 1.62f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3f59999a    # 0.85f

    .line 529
    .line 530
    .line 531
    const v18, 0x3eb33333    # 0.35f

    .line 532
    .line 533
    .line 534
    const v13, 0x3e9eb852    # 0.31f

    .line 535
    .line 536
    .line 537
    const v14, -0x416147ae    # -0.31f

    .line 538
    .line 539
    .line 540
    const v15, 0x3f59999a    # 0.85f

    .line 541
    .line 542
    .line 543
    const v16, -0x4247ae14    # -0.09f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x3f4f5c29    # 0.81f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, 0x40666666    # 3.6f

    .line 556
    .line 557
    .line 558
    const v18, 0x3fb9999a    # 1.45f

    .line 559
    .line 560
    .line 561
    const v13, 0x3fa66666    # 1.3f

    .line 562
    .line 563
    .line 564
    const v14, -0x435c28f6    # -0.02f

    .line 565
    .line 566
    .line 567
    const v15, 0x40270a3d    # 2.61f

    .line 568
    .line 569
    .line 570
    const v16, 0x3ee66666    # 0.45f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, 0x3f91eb85    # 1.14f

    .line 577
    .line 578
    .line 579
    const v18, 0x40a9999a    # 5.3f

    .line 580
    .line 581
    .line 582
    const v13, 0x3fb70a3d    # 1.43f

    .line 583
    .line 584
    .line 585
    const v14, 0x3fb70a3d    # 1.43f

    .line 586
    .line 587
    .line 588
    const v15, 0x3fe7ae14    # 1.81f

    .line 589
    .line 590
    .line 591
    const v16, 0x406147ae    # 3.52f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x41770a3d    # 15.44f

    .line 598
    .line 599
    .line 600
    const v18, 0x416051ec    # 14.02f

    .line 601
    .line 602
    .line 603
    const v13, 0x4183d70a    # 16.48f

    .line 604
    .line 605
    .line 606
    const v14, 0x41647ae1    # 14.28f

    .line 607
    .line 608
    .line 609
    const v15, 0x417d1eb8    # 15.82f

    .line 610
    .line 611
    .line 612
    const v16, 0x41668f5c    # 14.41f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/rounded/ChangeCircleKt;->_changeCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 652
    .line 653
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    return-object v0
.end method

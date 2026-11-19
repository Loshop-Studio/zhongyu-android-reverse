.class public final Landroidx/compose/material/icons/rounded/AttachMoneyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachMoney(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AttachMoney"

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
    const v0, 0x413ccccd    # 11.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x412e6666    # 10.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v18, -0x3ff66666    # -2.15f

    .line 82
    .line 83
    .line 84
    const v13, -0x3feeb852    # -2.27f

    .line 85
    .line 86
    .line 87
    const v14, -0x40e8f5c3    # -0.59f

    .line 88
    .line 89
    .line 90
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 91
    .line 92
    const v16, -0x40666666    # -1.2f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x402ccccd    # 2.7f

    .line 99
    .line 100
    .line 101
    const v18, -0x40133333    # -1.85f

    .line 102
    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, -0x40747ae1    # -1.09f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f8147ae    # 1.01f

    .line 109
    .line 110
    .line 111
    const v16, -0x40133333    # -1.85f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x4018f5c3    # 2.39f

    .line 118
    .line 119
    .line 120
    const v18, 0x3fb33333    # 1.4f

    .line 121
    .line 122
    .line 123
    const v13, 0x3fb5c28f    # 1.42f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, 0x400851ec    # 2.13f

    .line 128
    .line 129
    .line 130
    const v16, 0x3f0a3d71    # 0.54f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3f5eb852    # 0.87f

    .line 137
    .line 138
    .line 139
    const v18, 0x3f333333    # 0.7f

    .line 140
    .line 141
    .line 142
    const v13, 0x3df5c28f    # 0.12f

    .line 143
    .line 144
    .line 145
    const v14, 0x3ecccccd    # 0.4f

    .line 146
    .line 147
    .line 148
    const v15, 0x3ee66666    # 0.45f

    .line 149
    .line 150
    .line 151
    const v16, 0x3f333333    # 0.7f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3f666666    # 0.9f

    .line 164
    .line 165
    .line 166
    const v18, -0x405d70a4    # -1.27f

    .line 167
    .line 168
    .line 169
    const v13, 0x3f28f5c3    # 0.66f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x3f90a3d7    # 1.13f

    .line 174
    .line 175
    .line 176
    const v16, -0x40d9999a    # -0.65f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x3fc28f5c    # -2.96f

    .line 183
    .line 184
    .line 185
    const v18, -0x3fdd70a4    # -2.54f

    .line 186
    .line 187
    .line 188
    const v13, -0x4128f5c3    # -0.42f

    .line 189
    .line 190
    .line 191
    const v14, -0x4068f5c3    # -1.18f

    .line 192
    .line 193
    .line 194
    const v15, -0x404ccccd    # -1.4f

    .line 195
    .line 196
    .line 197
    const v16, -0x3ff5c28f    # -2.16f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x40900000    # 4.5f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40400000    # -1.5f

    .line 209
    .line 210
    const/high16 v18, -0x40400000    # -1.5f

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, -0x40ab851f    # -0.83f

    .line 214
    .line 215
    .line 216
    const v15, -0x40d47ae1    # -0.67f

    .line 217
    .line 218
    .line 219
    const/high16 v16, -0x40400000    # -1.5f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x406ae148    # 3.67f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x41200000    # 10.0f

    .line 228
    .line 229
    const/high16 v4, 0x40900000    # 4.5f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x3f28f5c3    # 0.66f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 241
    .line 242
    const v18, 0x40670a3d    # 3.61f

    .line 243
    .line 244
    .line 245
    const v13, -0x4007ae14    # -1.94f

    .line 246
    .line 247
    .line 248
    const v14, 0x3ed70a3d    # 0.42f

    .line 249
    .line 250
    .line 251
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 252
    .line 253
    const v16, 0x3fd70a3d    # 1.68f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x40966666    # 4.7f

    .line 260
    .line 261
    .line 262
    const v18, 0x408428f6    # 4.13f

    .line 263
    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const v14, 0x4013d70a    # 2.31f

    .line 267
    .line 268
    .line 269
    const v15, 0x3ff47ae1    # 1.91f

    .line 270
    .line 271
    .line 272
    const v16, 0x405d70a4    # 3.46f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x40400000    # 3.0f

    .line 279
    .line 280
    const v18, 0x401a3d71    # 2.41f

    .line 281
    .line 282
    .line 283
    const/high16 v13, 0x40200000    # 2.5f

    .line 284
    .line 285
    const v14, 0x3f19999a    # 0.6f

    .line 286
    .line 287
    .line 288
    const/high16 v15, 0x40400000    # 3.0f

    .line 289
    .line 290
    const v16, 0x3fbd70a4    # 1.48f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x3fd33333    # -2.7f

    .line 297
    .line 298
    .line 299
    const v18, 0x3fe51eb8    # 1.79f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, 0x3f30a3d7    # 0.69f

    .line 304
    .line 305
    .line 306
    const v15, -0x41051eb8    # -0.49f

    .line 307
    .line 308
    .line 309
    const v16, 0x3fe51eb8    # 1.79f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x3fcae148    # -2.83f

    .line 316
    .line 317
    .line 318
    const v18, -0x4048f5c3    # -1.43f

    .line 319
    .line 320
    .line 321
    const v13, -0x402ccccd    # -1.65f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 326
    .line 327
    const v16, -0x40e8f5c3    # -0.59f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x4099999a    # -0.9f

    .line 334
    .line 335
    .line 336
    const v18, -0x40d47ae1    # -0.67f

    .line 337
    .line 338
    .line 339
    const v13, -0x41e66666    # -0.15f

    .line 340
    .line 341
    .line 342
    const v14, -0x413851ec    # -0.39f

    .line 343
    .line 344
    .line 345
    const v15, -0x41051eb8    # -0.49f

    .line 346
    .line 347
    .line 348
    const v16, -0x40d47ae1    # -0.67f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, -0x4170a3d7    # -0.28f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, -0x409c28f6    # -0.89f

    .line 361
    .line 362
    .line 363
    const v18, 0x3fa66666    # 1.3f

    .line 364
    .line 365
    .line 366
    const v13, -0x40d47ae1    # -0.67f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, -0x406e147b    # -1.14f

    .line 371
    .line 372
    .line 373
    const v16, 0x3f2e147b    # 0.68f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x4059999a    # 3.4f

    .line 380
    .line 381
    .line 382
    const v18, 0x4021eb85    # 2.53f

    .line 383
    .line 384
    .line 385
    const v13, 0x3f11eb85    # 0.57f

    .line 386
    .line 387
    .line 388
    const v14, 0x3fb1eb85    # 1.39f

    .line 389
    .line 390
    .line 391
    const v15, 0x3ff33333    # 1.9f

    .line 392
    .line 393
    .line 394
    const v16, 0x400d70a4    # 2.21f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x3f2b851f    # 0.67f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 407
    .line 408
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, 0x3f547ae1    # 0.83f

    .line 412
    .line 413
    .line 414
    const v15, 0x3f2b851f    # 0.67f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, -0x40d47ae1    # -0.67f

    .line 423
    .line 424
    .line 425
    const/high16 v2, -0x40400000    # -1.5f

    .line 426
    .line 427
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 428
    .line 429
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x40d9999a    # -0.65f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x40600000    # 3.5f

    .line 439
    .line 440
    const v18, -0x3f9ccccd    # -3.55f

    .line 441
    .line 442
    .line 443
    const v13, 0x3ff9999a    # 1.95f

    .line 444
    .line 445
    .line 446
    const v14, -0x41428f5c    # -0.37f

    .line 447
    .line 448
    .line 449
    const/high16 v15, 0x40600000    # 3.5f

    .line 450
    .line 451
    const/high16 v16, -0x40400000    # -1.5f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, -0x3f69999a    # -4.7f

    .line 457
    .line 458
    .line 459
    const v18, -0x3f733333    # -4.4f

    .line 460
    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, -0x3fca3d71    # -2.84f

    .line 464
    .line 465
    .line 466
    const v15, -0x3fe47ae1    # -2.43f

    .line 467
    .line 468
    .line 469
    const v16, -0x3f8c28f6    # -3.81f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    const/16 v16, 0x3800

    .line 483
    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    const/high16 v6, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/high16 v8, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v7, 0x0

    .line 491
    const/high16 v9, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v12, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const/4 v15, 0x0

    .line 497
    const-string v4, ""

    .line 498
    .line 499
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    sput-object v0, Landroidx/compose/material/icons/rounded/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 508
    .line 509
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    return-object v0
.end method

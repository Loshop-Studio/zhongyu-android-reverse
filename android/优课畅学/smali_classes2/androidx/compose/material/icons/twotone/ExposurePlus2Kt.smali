.class public final Landroidx/compose/material/icons/twotone/ExposurePlus2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposurePlus2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExposurePlus2Kt;->_exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ExposurePlus2"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f800000    # -4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41300000    # 11.0f

    .line 93
    .line 94
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x40e00000    # 7.0f

    .line 98
    .line 99
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x40c00000    # 6.0f

    .line 103
    .line 104
    const/high16 v2, 0x40e00000    # 7.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40000000    # 2.0f

    .line 115
    .line 116
    const/high16 v2, 0x41300000    # 11.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40800000    # 4.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x419f999a    # 19.95f

    .line 136
    .line 137
    .line 138
    const v2, 0x4140a3d7    # 12.04f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x3f51eb85    # 0.82f

    .line 145
    .line 146
    .line 147
    const v18, -0x406a3d71    # -1.17f

    .line 148
    .line 149
    .line 150
    const v13, 0x3ea3d70a    # 0.32f

    .line 151
    .line 152
    .line 153
    const v14, -0x413851ec    # -0.39f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f170a3d    # 0.59f

    .line 157
    .line 158
    .line 159
    const v16, -0x40b851ec    # -0.78f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3f0a3d71    # 0.54f

    .line 166
    .line 167
    .line 168
    const v13, 0x3e6b851f    # 0.23f

    .line 169
    .line 170
    .line 171
    const v15, 0x3ed1eb85    # 0.41f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3e428f5c    # 0.19f

    .line 178
    .line 179
    .line 180
    const v18, -0x4068f5c3    # -1.18f

    .line 181
    .line 182
    .line 183
    const v13, 0x3e051eb8    # 0.13f

    .line 184
    .line 185
    .line 186
    const v15, 0x3e428f5c    # 0.19f

    .line 187
    .line 188
    .line 189
    const v16, -0x40b5c28f    # -0.79f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, -0x4175c28f    # -0.27f

    .line 196
    .line 197
    .line 198
    const v18, -0x40451eb8    # -1.46f

    .line 199
    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, -0x40f851ec    # -0.53f

    .line 203
    .line 204
    .line 205
    const v15, -0x4247ae14    # -0.09f

    .line 206
    .line 207
    .line 208
    const v16, -0x407d70a4    # -1.02f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, -0x40b851ec    # -0.78f

    .line 215
    .line 216
    .line 217
    const v2, -0x4071eb85    # -1.11f

    .line 218
    .line 219
    .line 220
    const v4, -0x411eb852    # -0.44f

    .line 221
    .line 222
    .line 223
    const v6, -0x40b0a3d7    # -0.81f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x405eb852    # -1.26f

    .line 230
    .line 231
    .line 232
    const v18, -0x40ca3d71    # -0.71f

    .line 233
    .line 234
    .line 235
    const v13, -0x4151eb85    # -0.34f

    .line 236
    .line 237
    .line 238
    const v14, -0x416147ae    # -0.31f

    .line 239
    .line 240
    .line 241
    const v15, -0x40bae148    # -0.77f

    .line 242
    .line 243
    .line 244
    const v16, -0x40f5c28f    # -0.54f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x4023d70a    # -1.72f

    .line 251
    .line 252
    .line 253
    const v18, -0x418a3d71    # -0.24f

    .line 254
    .line 255
    .line 256
    const v13, -0x40fd70a4    # -0.51f

    .line 257
    .line 258
    .line 259
    const v14, -0x41dc28f6    # -0.16f

    .line 260
    .line 261
    .line 262
    const v15, -0x4075c28f    # -1.08f

    .line 263
    .line 264
    .line 265
    const v16, -0x418a3d71    # -0.24f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, -0x40133333    # -1.85f

    .line 272
    .line 273
    .line 274
    const v18, 0x3ea3d70a    # 0.32f

    .line 275
    .line 276
    .line 277
    const v13, -0x40cf5c29    # -0.69f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const v15, -0x405851ec    # -1.31f

    .line 282
    .line 283
    .line 284
    const v16, 0x3de147ae    # 0.11f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x4051eb85    # -1.36f

    .line 291
    .line 292
    .line 293
    const v18, 0x3f6147ae    # 0.88f

    .line 294
    .line 295
    .line 296
    const v13, -0x40f5c28f    # -0.54f

    .line 297
    .line 298
    .line 299
    const v14, 0x3e570a3d    # 0.21f

    .line 300
    .line 301
    .line 302
    const/high16 v15, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v16, 0x3f028f5c    # 0.51f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x40a8f5c3    # -0.84f

    .line 311
    .line 312
    .line 313
    const v18, 0x3fa66666    # 1.3f

    .line 314
    .line 315
    .line 316
    const v13, -0x41428f5c    # -0.37f

    .line 317
    .line 318
    .line 319
    const v14, 0x3ebd70a4    # 0.37f

    .line 320
    .line 321
    .line 322
    const v15, -0x40d9999a    # -0.65f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f4ccccd    # 0.8f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, -0x4170a3d7    # -0.28f

    .line 332
    .line 333
    .line 334
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 335
    .line 336
    const v13, -0x41c7ae14    # -0.18f

    .line 337
    .line 338
    .line 339
    const v14, 0x3ef0a3d7    # 0.47f

    .line 340
    .line 341
    .line 342
    const v15, -0x4175c28f    # -0.27f

    .line 343
    .line 344
    .line 345
    const v16, 0x3f7851ec    # 0.97f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x4008f5c3    # 2.14f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3e051eb8    # 0.13f

    .line 358
    .line 359
    .line 360
    const v18, -0x40a147ae    # -0.87f

    .line 361
    .line 362
    .line 363
    const v13, 0x3c23d70a    # 0.01f

    .line 364
    .line 365
    .line 366
    const v14, -0x416147ae    # -0.31f

    .line 367
    .line 368
    .line 369
    const v15, 0x3d4ccccd    # 0.05f

    .line 370
    .line 371
    .line 372
    const v16, -0x40e66666    # -0.6f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x3ecccccd    # 0.4f

    .line 379
    .line 380
    .line 381
    const/high16 v18, -0x40c00000    # -0.75f

    .line 382
    .line 383
    const v13, 0x3db851ec    # 0.09f

    .line 384
    .line 385
    .line 386
    const v14, -0x416b851f    # -0.29f

    .line 387
    .line 388
    .line 389
    const v15, 0x3e6b851f    # 0.23f

    .line 390
    .line 391
    .line 392
    const v16, -0x40f5c28f    # -0.54f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3f2e147b    # 0.68f

    .line 399
    .line 400
    .line 401
    const v18, -0x41051eb8    # -0.49f

    .line 402
    .line 403
    .line 404
    const v13, 0x3e3851ec    # 0.18f

    .line 405
    .line 406
    .line 407
    const v14, -0x41a8f5c3    # -0.21f

    .line 408
    .line 409
    .line 410
    const v15, 0x3ed1eb85    # 0.41f

    .line 411
    .line 412
    .line 413
    const v16, -0x41428f5c    # -0.37f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3f75c28f    # 0.96f

    .line 420
    .line 421
    .line 422
    const v18, -0x41c7ae14    # -0.18f

    .line 423
    .line 424
    .line 425
    const v13, 0x3e8a3d71    # 0.27f

    .line 426
    .line 427
    .line 428
    const v14, -0x420a3d71    # -0.12f

    .line 429
    .line 430
    .line 431
    const v15, 0x3f19999a    # 0.6f

    .line 432
    .line 433
    .line 434
    const v16, -0x41c7ae14    # -0.18f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x3f4f5c29    # 0.81f

    .line 441
    .line 442
    .line 443
    const v18, 0x3e19999a    # 0.15f

    .line 444
    .line 445
    .line 446
    const v13, 0x3e9eb852    # 0.31f

    .line 447
    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const v15, 0x3f147ae1    # 0.58f

    .line 451
    .line 452
    .line 453
    const v16, 0x3d4ccccd    # 0.05f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x3e800000    # 0.25f

    .line 460
    .line 461
    const v2, 0x3f170a3d    # 0.59f

    .line 462
    .line 463
    .line 464
    const v4, 0x3edc28f6    # 0.43f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3ebd70a4    # 0.37f

    .line 471
    .line 472
    .line 473
    const v18, 0x3f266666    # 0.65f

    .line 474
    .line 475
    .line 476
    const v13, 0x3e23d70a    # 0.16f

    .line 477
    .line 478
    .line 479
    const v14, 0x3e3851ec    # 0.18f

    .line 480
    .line 481
    .line 482
    const v15, 0x3e8f5c29    # 0.28f

    .line 483
    .line 484
    .line 485
    const v16, 0x3ecccccd    # 0.4f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3e051eb8    # 0.13f

    .line 492
    .line 493
    .line 494
    const v18, 0x3f4f5c29    # 0.81f

    .line 495
    .line 496
    .line 497
    const v13, 0x3da3d70a    # 0.08f

    .line 498
    .line 499
    .line 500
    const/high16 v14, 0x3e800000    # 0.25f

    .line 501
    .line 502
    const v15, 0x3e051eb8    # 0.13f

    .line 503
    .line 504
    .line 505
    const v16, 0x3f051eb8    # 0.52f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x425c28f6    # -0.08f

    .line 512
    .line 513
    .line 514
    const v18, 0x3f266666    # 0.65f

    .line 515
    .line 516
    .line 517
    const/4 v13, 0x0

    .line 518
    const v14, 0x3e6147ae    # 0.22f

    .line 519
    .line 520
    .line 521
    const v15, -0x430a3d71    # -0.03f

    .line 522
    .line 523
    .line 524
    const v16, 0x3edc28f6    # 0.43f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x416b851f    # -0.29f

    .line 531
    .line 532
    .line 533
    const v18, 0x3f333333    # 0.7f

    .line 534
    .line 535
    .line 536
    const v13, -0x428a3d71    # -0.06f

    .line 537
    .line 538
    .line 539
    const v15, -0x41e66666    # -0.15f

    .line 540
    .line 541
    .line 542
    const v16, 0x3ee66666    # 0.45f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, -0x40f0a3d7    # -0.56f

    .line 549
    .line 550
    .line 551
    const v18, 0x3f547ae1    # 0.83f

    .line 552
    .line 553
    .line 554
    const v13, -0x41f0a3d7    # -0.14f

    .line 555
    .line 556
    .line 557
    const/high16 v14, 0x3e800000    # 0.25f

    .line 558
    .line 559
    const v15, -0x415c28f6    # -0.32f

    .line 560
    .line 561
    .line 562
    const v16, 0x3f07ae14    # 0.53f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x409eb852    # -0.88f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f83d70a    # 1.03f

    .line 572
    .line 573
    .line 574
    const v13, -0x41947ae1    # -0.23f

    .line 575
    .line 576
    .line 577
    const v14, 0x3e99999a    # 0.3f

    .line 578
    .line 579
    .line 580
    const v15, -0x40fae148    # -0.52f

    .line 581
    .line 582
    .line 583
    const v16, 0x3f266666    # 0.65f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, -0x3f7a8f5c    # -4.17f

    .line 590
    .line 591
    .line 592
    const v2, 0x4091999a    # 4.55f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x4155eb85    # 13.37f

    .line 599
    .line 600
    .line 601
    const/high16 v2, 0x41900000    # 18.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41b00000    # 22.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, -0x40251eb8    # -1.71f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, -0x3f41999a    # -5.95f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40370a3d    # 2.86f

    .line 624
    .line 625
    .line 626
    const v2, -0x3fbb851f    # -3.07f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x3f851eb8    # 1.04f

    .line 633
    .line 634
    .line 635
    const v18, -0x4068f5c3    # -1.18f

    .line 636
    .line 637
    .line 638
    const v13, 0x3ec28f5c    # 0.38f

    .line 639
    .line 640
    .line 641
    const v14, -0x413851ec    # -0.39f

    .line 642
    .line 643
    .line 644
    const v15, 0x3f3851ec    # 0.72f

    .line 645
    .line 646
    .line 647
    const v16, -0x40b5c28f    # -0.79f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const/16 v16, 0x3800

    .line 661
    .line 662
    const/16 v17, 0x0

    .line 663
    .line 664
    const/high16 v6, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/high16 v8, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v7, 0x0

    .line 669
    const/high16 v9, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/high16 v12, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v13, 0x0

    .line 674
    const/4 v14, 0x0

    .line 675
    const/4 v15, 0x0

    .line 676
    const-string v4, ""

    .line 677
    .line 678
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    sput-object v0, Landroidx/compose/material/icons/twotone/ExposurePlus2Kt;->_exposurePlus2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/FilterTiltShiftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterTiltShift(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FilterTiltShift"

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
    const v0, 0x404eb852    # 3.23f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40651eb8    # -1.21f

    .line 79
    .line 80
    .line 81
    const v18, -0x40828f5c    # -0.99f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x40dc28f6    # -0.64f

    .line 86
    .line 87
    .line 88
    const v15, -0x40e8f5c3    # -0.59f

    .line 89
    .line 90
    .line 91
    const v16, -0x406f5c29    # -1.13f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3fb851ec    # -3.12f

    .line 98
    .line 99
    .line 100
    const v18, 0x3fa66666    # 1.3f

    .line 101
    .line 102
    .line 103
    const v13, -0x4070a3d7    # -1.12f

    .line 104
    .line 105
    .line 106
    const v14, 0x3e851eb8    # 0.26f

    .line 107
    .line 108
    .line 109
    const v15, -0x3ff47ae1    # -2.18f

    .line 110
    .line 111
    .line 112
    const v16, 0x3f333333    # 0.7f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x41dc28f6    # -0.16f

    .line 119
    .line 120
    .line 121
    const v18, 0x3fc66666    # 1.55f

    .line 122
    .line 123
    .line 124
    const v13, -0x40f851ec    # -0.53f

    .line 125
    .line 126
    .line 127
    const v14, 0x3eae147b    # 0.34f

    .line 128
    .line 129
    .line 130
    const v15, -0x40e3d70a    # -0.61f

    .line 131
    .line 132
    .line 133
    const v16, 0x3f8ccccd    # 1.1f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3f9ae148    # 1.21f

    .line 140
    .line 141
    .line 142
    const v18, 0x3e23d70a    # 0.16f

    .line 143
    .line 144
    .line 145
    const v13, 0x3ea3d70a    # 0.32f

    .line 146
    .line 147
    .line 148
    const v14, 0x3ea3d70a    # 0.32f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f547ae1    # 0.83f

    .line 152
    .line 153
    .line 154
    const v16, 0x3ecccccd    # 0.4f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x40228f5c    # 2.54f

    .line 161
    .line 162
    .line 163
    const v18, -0x4079999a    # -1.05f

    .line 164
    .line 165
    .line 166
    const v13, 0x3f451eb8    # 0.77f

    .line 167
    .line 168
    .line 169
    const v14, -0x41051eb8    # -0.49f

    .line 170
    .line 171
    .line 172
    const v15, 0x3fcf5c29    # 1.62f

    .line 173
    .line 174
    .line 175
    const v16, -0x40a66666    # -0.85f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x3f3d70a4    # 0.74f

    .line 182
    .line 183
    .line 184
    const v18, -0x4087ae14    # -0.97f

    .line 185
    .line 186
    .line 187
    const v13, 0x3ee147ae    # 0.44f

    .line 188
    .line 189
    .line 190
    const v14, -0x42333333    # -0.1f

    .line 191
    .line 192
    .line 193
    const v15, 0x3f3d70a4    # 0.74f

    .line 194
    .line 195
    .line 196
    const v16, -0x40fd70a4    # -0.51f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x418aa3d7    # 17.33f

    .line 206
    .line 207
    .line 208
    const v2, 0x40633333    # 3.55f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x3fb851ec    # -3.12f

    .line 215
    .line 216
    .line 217
    const v18, -0x4059999a    # -1.3f

    .line 218
    .line 219
    .line 220
    const v13, -0x408f5c29    # -0.94f

    .line 221
    .line 222
    .line 223
    const v14, -0x40e66666    # -0.6f

    .line 224
    .line 225
    .line 226
    const/high16 v15, -0x40000000    # -2.0f

    .line 227
    .line 228
    const v16, -0x407ae148    # -1.04f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x40651eb8    # -1.21f

    .line 235
    .line 236
    .line 237
    const v18, 0x3f7ae148    # 0.98f

    .line 238
    .line 239
    .line 240
    const v13, -0x40e147ae    # -0.62f

    .line 241
    .line 242
    .line 243
    const v14, -0x41f0a3d7    # -0.14f

    .line 244
    .line 245
    .line 246
    const v15, -0x40651eb8    # -1.21f

    .line 247
    .line 248
    .line 249
    const v16, 0x3eae147b    # 0.34f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x3f3d70a4    # 0.74f

    .line 256
    .line 257
    .line 258
    const v18, 0x3f75c28f    # 0.96f

    .line 259
    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, 0x3ee66666    # 0.45f

    .line 263
    .line 264
    .line 265
    const v15, 0x3e99999a    # 0.3f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f5eb852    # 0.87f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, 0x4021eb85    # 2.53f

    .line 275
    .line 276
    .line 277
    const v18, 0x3f866666    # 1.05f

    .line 278
    .line 279
    .line 280
    const v13, 0x3f68f5c3    # 0.91f

    .line 281
    .line 282
    .line 283
    const v14, 0x3e4ccccd    # 0.2f

    .line 284
    .line 285
    .line 286
    const v15, 0x3fe28f5c    # 1.77f

    .line 287
    .line 288
    .line 289
    const v16, 0x3f11eb85    # 0.57f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x3f9ae148    # 1.21f

    .line 296
    .line 297
    .line 298
    const v18, -0x41dc28f6    # -0.16f

    .line 299
    .line 300
    .line 301
    const v13, 0x3ec7ae14    # 0.39f

    .line 302
    .line 303
    .line 304
    const v14, 0x3e75c28f    # 0.24f

    .line 305
    .line 306
    .line 307
    const v15, 0x3f63d70a    # 0.89f

    .line 308
    .line 309
    .line 310
    const v16, 0x3e2e147b    # 0.17f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x41e66666    # -0.15f

    .line 317
    .line 318
    .line 319
    const v18, -0x403c28f6    # -1.53f

    .line 320
    .line 321
    .line 322
    const v13, 0x3eeb851f    # 0.46f

    .line 323
    .line 324
    .line 325
    const v14, -0x411eb852    # -0.44f

    .line 326
    .line 327
    .line 328
    const v15, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v16, -0x4067ae14    # -1.19f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x41a628f6    # 20.77f

    .line 341
    .line 342
    .line 343
    const/high16 v2, 0x41300000    # 11.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f7d70a4    # 0.99f

    .line 349
    .line 350
    .line 351
    const v18, -0x40651eb8    # -1.21f

    .line 352
    .line 353
    .line 354
    const v13, 0x3f23d70a    # 0.64f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const v15, 0x3f90a3d7    # 1.13f

    .line 359
    .line 360
    .line 361
    const v16, -0x40e8f5c3    # -0.59f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, -0x4059999a    # -1.3f

    .line 368
    .line 369
    .line 370
    const v18, -0x3fb851ec    # -3.12f

    .line 371
    .line 372
    .line 373
    const v13, -0x417ae148    # -0.26f

    .line 374
    .line 375
    .line 376
    const v14, -0x4070a3d7    # -1.12f

    .line 377
    .line 378
    .line 379
    const v15, -0x40cccccd    # -0.7f

    .line 380
    .line 381
    .line 382
    const v16, -0x3ff47ae1    # -2.18f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, -0x4039999a    # -1.55f

    .line 389
    .line 390
    .line 391
    const v18, -0x41dc28f6    # -0.16f

    .line 392
    .line 393
    .line 394
    const v13, -0x4151eb85    # -0.34f

    .line 395
    .line 396
    .line 397
    const v14, -0x40f851ec    # -0.53f

    .line 398
    .line 399
    .line 400
    const v15, -0x40733333    # -1.1f

    .line 401
    .line 402
    .line 403
    const v16, -0x40e3d70a    # -0.61f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x41dc28f6    # -0.16f

    .line 410
    .line 411
    .line 412
    const v18, 0x3f9ae148    # 1.21f

    .line 413
    .line 414
    .line 415
    const v13, -0x415c28f6    # -0.32f

    .line 416
    .line 417
    .line 418
    const v14, 0x3ea3d70a    # 0.32f

    .line 419
    .line 420
    .line 421
    const v15, -0x41333333    # -0.4f

    .line 422
    .line 423
    .line 424
    const v16, 0x3f547ae1    # 0.83f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3f866666    # 1.05f

    .line 431
    .line 432
    .line 433
    const v18, 0x4021eb85    # 2.53f

    .line 434
    .line 435
    .line 436
    const v13, 0x3efae148    # 0.49f

    .line 437
    .line 438
    .line 439
    const v14, 0x3f451eb8    # 0.77f

    .line 440
    .line 441
    .line 442
    const v15, 0x3f59999a    # 0.85f

    .line 443
    .line 444
    .line 445
    const v16, 0x3fcf5c29    # 1.62f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3f7851ec    # 0.97f

    .line 452
    .line 453
    .line 454
    const/high16 v18, 0x3f400000    # 0.75f

    .line 455
    .line 456
    const v13, 0x3dcccccd    # 0.1f

    .line 457
    .line 458
    .line 459
    const v14, 0x3ee66666    # 0.45f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f028f5c    # 0.51f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x3f400000    # 0.75f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x40a33333    # 5.1f

    .line 474
    .line 475
    .line 476
    const v2, 0x40d051ec    # 6.51f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x4039999a    # -1.55f

    .line 483
    .line 484
    .line 485
    const v18, 0x3e23d70a    # 0.16f

    .line 486
    .line 487
    .line 488
    const v13, -0x41147ae1    # -0.46f

    .line 489
    .line 490
    .line 491
    const v14, -0x4119999a    # -0.45f

    .line 492
    .line 493
    .line 494
    const v15, -0x40651eb8    # -1.21f

    .line 495
    .line 496
    .line 497
    const v16, -0x413d70a4    # -0.38f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x4059999a    # -1.3f

    .line 504
    .line 505
    .line 506
    const v18, 0x4047ae14    # 3.12f

    .line 507
    .line 508
    .line 509
    const v13, -0x40e66666    # -0.6f

    .line 510
    .line 511
    .line 512
    const v14, 0x3f70a3d7    # 0.94f

    .line 513
    .line 514
    .line 515
    const v15, -0x407ae148    # -1.04f

    .line 516
    .line 517
    .line 518
    const/high16 v16, 0x40000000    # 2.0f

    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3f7ae148    # 0.98f

    .line 524
    .line 525
    .line 526
    const v18, 0x3f9ae148    # 1.21f

    .line 527
    .line 528
    .line 529
    const v13, -0x41f0a3d7    # -0.14f

    .line 530
    .line 531
    .line 532
    const v14, 0x3f1eb852    # 0.62f

    .line 533
    .line 534
    .line 535
    const v15, 0x3eae147b    # 0.34f

    .line 536
    .line 537
    .line 538
    const v16, 0x3f9ae148    # 1.21f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3f75c28f    # 0.96f

    .line 545
    .line 546
    .line 547
    const v18, -0x40c28f5c    # -0.74f

    .line 548
    .line 549
    .line 550
    const v13, 0x3ee66666    # 0.45f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const v15, 0x3f5eb852    # 0.87f

    .line 555
    .line 556
    .line 557
    const v16, -0x41666666    # -0.3f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x3f866666    # 1.05f

    .line 564
    .line 565
    .line 566
    const v18, -0x3fde147b    # -2.53f

    .line 567
    .line 568
    .line 569
    const v13, 0x3e4ccccd    # 0.2f

    .line 570
    .line 571
    .line 572
    const v14, -0x40970a3d    # -0.91f

    .line 573
    .line 574
    .line 575
    const v15, 0x3f11eb85    # 0.57f

    .line 576
    .line 577
    .line 578
    const v16, -0x401d70a4    # -1.77f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x41f0a3d7    # -0.14f

    .line 585
    .line 586
    .line 587
    const v18, -0x4063d70a    # -1.22f

    .line 588
    .line 589
    .line 590
    const v13, 0x3e851eb8    # 0.26f

    .line 591
    .line 592
    .line 593
    const v14, -0x413851ec    # -0.39f

    .line 594
    .line 595
    .line 596
    const v15, 0x3e3851ec    # 0.18f

    .line 597
    .line 598
    .line 599
    const v16, -0x4099999a    # -0.9f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41500000    # 13.0f

    .line 609
    .line 610
    const v2, 0x404eb852    # 3.23f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, -0x40828f5c    # -0.99f

    .line 617
    .line 618
    .line 619
    const v18, 0x3f9ae148    # 1.21f

    .line 620
    .line 621
    .line 622
    const v13, -0x40dc28f6    # -0.64f

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const v15, -0x406f5c29    # -1.13f

    .line 627
    .line 628
    .line 629
    const v16, 0x3f170a3d    # 0.59f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, 0x3fa66666    # 1.3f

    .line 636
    .line 637
    .line 638
    const v18, 0x4047ae14    # 3.12f

    .line 639
    .line 640
    .line 641
    const v13, 0x3e851eb8    # 0.26f

    .line 642
    .line 643
    .line 644
    const v14, 0x3f8f5c29    # 1.12f

    .line 645
    .line 646
    .line 647
    const v15, 0x3f333333    # 0.7f

    .line 648
    .line 649
    .line 650
    const v16, 0x400ae148    # 2.17f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x3fc66666    # 1.55f

    .line 657
    .line 658
    .line 659
    const v18, 0x3e23d70a    # 0.16f

    .line 660
    .line 661
    .line 662
    const v13, 0x3eae147b    # 0.34f

    .line 663
    .line 664
    .line 665
    const v14, 0x3f0a3d71    # 0.54f

    .line 666
    .line 667
    .line 668
    const v15, 0x3f8ccccd    # 1.1f

    .line 669
    .line 670
    .line 671
    const v16, 0x3f1c28f6    # 0.61f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, 0x3e19999a    # 0.15f

    .line 678
    .line 679
    .line 680
    const v18, -0x40651eb8    # -1.21f

    .line 681
    .line 682
    .line 683
    const v13, 0x3ea3d70a    # 0.32f

    .line 684
    .line 685
    .line 686
    const v14, -0x415c28f6    # -0.32f

    .line 687
    .line 688
    .line 689
    const v15, 0x3ecccccd    # 0.4f

    .line 690
    .line 691
    .line 692
    const v16, -0x40ab851f    # -0.83f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v17, -0x4079999a    # -1.05f

    .line 699
    .line 700
    .line 701
    const v18, -0x3fde147b    # -2.53f

    .line 702
    .line 703
    .line 704
    const v13, -0x41051eb8    # -0.49f

    .line 705
    .line 706
    .line 707
    const v14, -0x40bd70a4    # -0.76f

    .line 708
    .line 709
    .line 710
    const v15, -0x40a66666    # -0.85f

    .line 711
    .line 712
    .line 713
    const v16, -0x4031eb85    # -1.61f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, -0x408a3d71    # -0.96f

    .line 720
    .line 721
    .line 722
    const/high16 v18, -0x40c00000    # -0.75f

    .line 723
    .line 724
    const v13, -0x4247ae14    # -0.09f

    .line 725
    .line 726
    .line 727
    const v14, -0x4119999a    # -0.45f

    .line 728
    .line 729
    .line 730
    const/high16 v15, -0x41000000    # -0.5f

    .line 731
    .line 732
    const/high16 v16, -0x40c00000    # -0.75f

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41700000    # 15.0f

    .line 741
    .line 742
    const/high16 v2, 0x41400000    # 12.0f

    .line 743
    .line 744
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 748
    .line 749
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 750
    .line 751
    const/4 v13, 0x0

    .line 752
    const v14, -0x402b851f    # -1.66f

    .line 753
    .line 754
    .line 755
    const v15, -0x40547ae1    # -1.34f

    .line 756
    .line 757
    .line 758
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x3fab851f    # 1.34f

    .line 764
    .line 765
    .line 766
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 767
    .line 768
    const/high16 v4, 0x40400000    # 3.0f

    .line 769
    .line 770
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const/high16 v2, 0x40400000    # 3.0f

    .line 774
    .line 775
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, -0x40547ae1    # -1.34f

    .line 779
    .line 780
    .line 781
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 782
    .line 783
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x41973333    # 18.9f

    .line 790
    .line 791
    .line 792
    const v2, 0x418beb85    # 17.49f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v17, 0x3fc66666    # 1.55f

    .line 799
    .line 800
    .line 801
    const v18, -0x41e66666    # -0.15f

    .line 802
    .line 803
    .line 804
    const v13, 0x3ee66666    # 0.45f

    .line 805
    .line 806
    .line 807
    const v14, 0x3ee66666    # 0.45f

    .line 808
    .line 809
    .line 810
    const v15, 0x3f9ae148    # 1.21f

    .line 811
    .line 812
    .line 813
    const v16, 0x3ec28f5c    # 0.38f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v17, 0x3fa66666    # 1.3f

    .line 820
    .line 821
    .line 822
    const v18, -0x3fb8f5c3    # -3.11f

    .line 823
    .line 824
    .line 825
    const v13, 0x3f19999a    # 0.6f

    .line 826
    .line 827
    .line 828
    const v14, -0x408f5c29    # -0.94f

    .line 829
    .line 830
    .line 831
    const v15, 0x3f851eb8    # 1.04f

    .line 832
    .line 833
    .line 834
    const/high16 v16, -0x40000000    # -2.0f

    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v17, -0x40851eb8    # -0.98f

    .line 840
    .line 841
    .line 842
    const v18, -0x40651eb8    # -1.21f

    .line 843
    .line 844
    .line 845
    const v13, 0x3e0f5c29    # 0.14f

    .line 846
    .line 847
    .line 848
    const v14, -0x40e147ae    # -0.62f

    .line 849
    .line 850
    .line 851
    const v15, -0x414ccccd    # -0.35f

    .line 852
    .line 853
    .line 854
    const v16, -0x40651eb8    # -1.21f

    .line 855
    .line 856
    .line 857
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v17, -0x408a3d71    # -0.96f

    .line 861
    .line 862
    .line 863
    const v18, 0x3f3d70a4    # 0.74f

    .line 864
    .line 865
    .line 866
    const v13, -0x4119999a    # -0.45f

    .line 867
    .line 868
    .line 869
    const/4 v14, 0x0

    .line 870
    const v15, -0x40a147ae    # -0.87f

    .line 871
    .line 872
    .line 873
    const v16, 0x3e99999a    # 0.3f

    .line 874
    .line 875
    .line 876
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v17, -0x4079999a    # -1.05f

    .line 880
    .line 881
    .line 882
    const v18, 0x4021eb85    # 2.53f

    .line 883
    .line 884
    .line 885
    const v13, -0x41b33333    # -0.2f

    .line 886
    .line 887
    .line 888
    const v14, 0x3f68f5c3    # 0.91f

    .line 889
    .line 890
    .line 891
    const v15, -0x40ee147b    # -0.57f

    .line 892
    .line 893
    .line 894
    const v16, 0x3fe147ae    # 1.76f

    .line 895
    .line 896
    .line 897
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v17, 0x3e0f5c29    # 0.14f

    .line 901
    .line 902
    .line 903
    const v18, 0x3f99999a    # 1.2f

    .line 904
    .line 905
    .line 906
    const v13, -0x417ae148    # -0.26f

    .line 907
    .line 908
    .line 909
    const v14, 0x3ebd70a4    # 0.37f

    .line 910
    .line 911
    .line 912
    const v15, -0x41c7ae14    # -0.18f

    .line 913
    .line 914
    .line 915
    const v16, 0x3f6147ae    # 0.88f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v0, 0x41500000    # 13.0f

    .line 925
    .line 926
    const v2, 0x41a628f6    # 20.77f

    .line 927
    .line 928
    .line 929
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v17, 0x3f9ae148    # 1.21f

    .line 933
    .line 934
    .line 935
    const v18, 0x3f7d70a4    # 0.99f

    .line 936
    .line 937
    .line 938
    const/4 v13, 0x0

    .line 939
    const v14, 0x3f23d70a    # 0.64f

    .line 940
    .line 941
    .line 942
    const v15, 0x3f170a3d    # 0.59f

    .line 943
    .line 944
    .line 945
    const v16, 0x3f90a3d7    # 1.13f

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v17, 0x4047ae14    # 3.12f

    .line 952
    .line 953
    .line 954
    const v18, -0x4059999a    # -1.3f

    .line 955
    .line 956
    .line 957
    const v13, 0x3f8f5c29    # 1.12f

    .line 958
    .line 959
    .line 960
    const v14, -0x417ae148    # -0.26f

    .line 961
    .line 962
    .line 963
    const v15, 0x400ae148    # 2.17f

    .line 964
    .line 965
    .line 966
    const v16, -0x40cccccd    # -0.7f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v17, 0x3e23d70a    # 0.16f

    .line 973
    .line 974
    .line 975
    const v18, -0x4039999a    # -1.55f

    .line 976
    .line 977
    .line 978
    const v13, 0x3f0a3d71    # 0.54f

    .line 979
    .line 980
    .line 981
    const v14, -0x4151eb85    # -0.34f

    .line 982
    .line 983
    .line 984
    const v15, 0x3f1c28f6    # 0.61f

    .line 985
    .line 986
    .line 987
    const v16, -0x40733333    # -1.1f

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const v17, -0x40651eb8    # -1.21f

    .line 994
    .line 995
    .line 996
    const v18, -0x41e66666    # -0.15f

    .line 997
    .line 998
    .line 999
    const v13, -0x415c28f6    # -0.32f

    .line 1000
    .line 1001
    .line 1002
    const v14, -0x415c28f6    # -0.32f

    .line 1003
    .line 1004
    .line 1005
    const v15, -0x40ab851f    # -0.83f

    .line 1006
    .line 1007
    .line 1008
    const v16, -0x41333333    # -0.4f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v17, -0x3fde147b    # -2.53f

    .line 1015
    .line 1016
    .line 1017
    const v18, 0x3f866666    # 1.05f

    .line 1018
    .line 1019
    .line 1020
    const v13, -0x40bd70a4    # -0.76f

    .line 1021
    .line 1022
    .line 1023
    const v14, 0x3efae148    # 0.49f

    .line 1024
    .line 1025
    .line 1026
    const v15, -0x4031eb85    # -1.61f

    .line 1027
    .line 1028
    .line 1029
    const v16, 0x3f59999a    # 0.85f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1036
    .line 1037
    const v18, 0x3f75c28f    # 0.96f

    .line 1038
    .line 1039
    .line 1040
    const v13, -0x4119999a    # -0.45f

    .line 1041
    .line 1042
    .line 1043
    const v14, 0x3db851ec    # 0.09f

    .line 1044
    .line 1045
    .line 1046
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1047
    .line 1048
    const/high16 v16, 0x3f000000    # 0.5f

    .line 1049
    .line 1050
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v0, 0x40d570a4    # 6.67f

    .line 1057
    .line 1058
    .line 1059
    const v2, 0x41a3999a    # 20.45f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, 0x4047ae14    # 3.12f

    .line 1066
    .line 1067
    .line 1068
    const v18, 0x3fa66666    # 1.3f

    .line 1069
    .line 1070
    .line 1071
    const v13, 0x3f733333    # 0.95f

    .line 1072
    .line 1073
    .line 1074
    const v14, 0x3f19999a    # 0.6f

    .line 1075
    .line 1076
    .line 1077
    const/high16 v15, 0x40000000    # 2.0f

    .line 1078
    .line 1079
    const v16, 0x3f851eb8    # 1.04f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v17, 0x3f9ae148    # 1.21f

    .line 1086
    .line 1087
    .line 1088
    const v18, -0x40851eb8    # -0.98f

    .line 1089
    .line 1090
    .line 1091
    const v13, 0x3f1eb852    # 0.62f

    .line 1092
    .line 1093
    .line 1094
    const v14, 0x3e0f5c29    # 0.14f

    .line 1095
    .line 1096
    .line 1097
    const v15, 0x3f9ae148    # 1.21f

    .line 1098
    .line 1099
    .line 1100
    const v16, -0x414ccccd    # -0.35f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v17, -0x40c28f5c    # -0.74f

    .line 1107
    .line 1108
    .line 1109
    const v18, -0x408a3d71    # -0.96f

    .line 1110
    .line 1111
    .line 1112
    const/4 v13, 0x0

    .line 1113
    const v14, -0x4119999a    # -0.45f

    .line 1114
    .line 1115
    .line 1116
    const v15, -0x41666666    # -0.3f

    .line 1117
    .line 1118
    .line 1119
    const v16, -0x40a147ae    # -0.87f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v17, -0x3fde147b    # -2.53f

    .line 1126
    .line 1127
    .line 1128
    const v18, -0x4079999a    # -1.05f

    .line 1129
    .line 1130
    .line 1131
    const v13, -0x40970a3d    # -0.91f

    .line 1132
    .line 1133
    .line 1134
    const v14, -0x41b33333    # -0.2f

    .line 1135
    .line 1136
    .line 1137
    const v15, -0x401d70a4    # -1.77f

    .line 1138
    .line 1139
    .line 1140
    const v16, -0x40ee147b    # -0.57f

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const v17, -0x40651eb8    # -1.21f

    .line 1147
    .line 1148
    .line 1149
    const v18, 0x3e23d70a    # 0.16f

    .line 1150
    .line 1151
    .line 1152
    const v13, -0x413851ec    # -0.39f

    .line 1153
    .line 1154
    .line 1155
    const v14, -0x418a3d71    # -0.24f

    .line 1156
    .line 1157
    .line 1158
    const v15, -0x409c28f6    # -0.89f

    .line 1159
    .line 1160
    .line 1161
    const v16, -0x41d1eb85    # -0.17f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    const v17, 0x3e19999a    # 0.15f

    .line 1168
    .line 1169
    .line 1170
    const v18, 0x3fc3d70a    # 1.53f

    .line 1171
    .line 1172
    .line 1173
    const v13, -0x41147ae1    # -0.46f

    .line 1174
    .line 1175
    .line 1176
    const v14, 0x3ee147ae    # 0.44f

    .line 1177
    .line 1178
    .line 1179
    const v15, -0x413851ec    # -0.39f

    .line 1180
    .line 1181
    .line 1182
    const v16, 0x3f9851ec    # 1.19f

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    const/16 v16, 0x3800

    .line 1196
    .line 1197
    const/16 v17, 0x0

    .line 1198
    .line 1199
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1200
    .line 1201
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1202
    .line 1203
    const/4 v7, 0x0

    .line 1204
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1205
    .line 1206
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1207
    .line 1208
    const/4 v13, 0x0

    .line 1209
    const/4 v14, 0x0

    .line 1210
    const/4 v15, 0x0

    .line 1211
    const-string v4, ""

    .line 1212
    .line 1213
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    sput-object v0, Landroidx/compose/material/icons/rounded/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1222
    .line 1223
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1224
    .line 1225
    .line 1226
    return-object v0
.end method

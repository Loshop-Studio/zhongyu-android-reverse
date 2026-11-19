.class public final Landroidx/compose/material/icons/filled/Face2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _face2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace2(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Face2"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x41afc28f    # 21.97f

    .line 71
    .line 72
    .line 73
    const v6, 0x415851ec    # 13.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    const v26, -0x42dc28f6    # -0.04f

    .line 82
    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, -0x43dc28f6    # -0.01f

    .line 87
    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const v24, -0x435c28f6    # -0.02f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x41c00000    # 24.0f

    .line 100
    .line 101
    const/high16 v26, 0x41100000    # 9.0f

    .line 102
    .line 103
    const v21, 0x41b9ae14    # 23.21f

    .line 104
    .line 105
    .line 106
    const v22, 0x4146147b    # 12.38f

    .line 107
    .line 108
    .line 109
    const/high16 v23, 0x41c00000    # 24.0f

    .line 110
    .line 111
    const v24, 0x412c7ae1    # 10.78f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, -0x3f400000    # -6.0f

    .line 118
    .line 119
    const/high16 v26, -0x3f400000    # -6.0f

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    const v22, -0x3fac28f6    # -3.31f

    .line 124
    .line 125
    .line 126
    const v23, -0x3fd3d70a    # -2.69f

    .line 127
    .line 128
    .line 129
    const/high16 v24, -0x3f400000    # -6.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, -0x40b851ec    # -0.78f

    .line 135
    .line 136
    .line 137
    const v26, 0x3d75c28f    # 0.06f

    .line 138
    .line 139
    .line 140
    const v21, -0x417ae148    # -0.26f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const v23, -0x40fae148    # -0.52f

    .line 146
    .line 147
    .line 148
    const v24, 0x3ca3d70a    # 0.02f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41400000    # 12.0f

    .line 155
    .line 156
    const/16 v26, 0x0

    .line 157
    .line 158
    const v21, 0x4181851f    # 16.19f

    .line 159
    .line 160
    .line 161
    const v22, 0x3f9d70a4    # 1.23f

    .line 162
    .line 163
    .line 164
    const v23, 0x4163d70a    # 14.24f

    .line 165
    .line 166
    .line 167
    const/16 v24, 0x0

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x40d8f5c3    # 6.78f

    .line 173
    .line 174
    .line 175
    const v6, 0x4043d70a    # 3.06f

    .line 176
    .line 177
    .line 178
    const v7, 0x40f9eb85    # 7.81f

    .line 179
    .line 180
    .line 181
    const v8, 0x3f9d70a4    # 1.23f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, 0x40c00000    # 6.0f

    .line 188
    .line 189
    const/high16 v26, 0x40400000    # 3.0f

    .line 190
    .line 191
    const v21, 0x40d0a3d7    # 6.52f

    .line 192
    .line 193
    .line 194
    const v22, 0x404147ae    # 3.02f

    .line 195
    .line 196
    .line 197
    const v23, 0x40c851ec    # 6.26f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x40400000    # 3.0f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/16 v25, 0x0

    .line 206
    .line 207
    const/high16 v26, 0x41100000    # 9.0f

    .line 208
    .line 209
    const v21, 0x402c28f6    # 2.69f

    .line 210
    .line 211
    .line 212
    const/high16 v22, 0x40400000    # 3.0f

    .line 213
    .line 214
    const/16 v23, 0x0

    .line 215
    .line 216
    const v24, 0x40b6147b    # 5.69f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, 0x400147ae    # 2.02f

    .line 223
    .line 224
    .line 225
    const v26, 0x408f5c29    # 4.48f

    .line 226
    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x3fe3d70a    # 1.78f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f4a3d71    # 0.79f

    .line 234
    .line 235
    .line 236
    const v24, 0x405851ec    # 3.38f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/16 v25, 0x0

    .line 243
    .line 244
    const v26, 0x3d23d70a    # 0.04f

    .line 245
    .line 246
    .line 247
    const v22, 0x3c23d70a    # 0.01f

    .line 248
    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const v24, 0x3ca3d70a    # 0.02f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v26, 0x41900000    # 18.0f

    .line 259
    .line 260
    const v21, 0x3f4a3d71    # 0.79f

    .line 261
    .line 262
    .line 263
    const v22, 0x4169eb85    # 14.62f

    .line 264
    .line 265
    .line 266
    const v24, 0x4181c28f    # 16.22f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x40c00000    # 6.0f

    .line 273
    .line 274
    const/high16 v26, 0x40c00000    # 6.0f

    .line 275
    .line 276
    const/16 v21, 0x0

    .line 277
    .line 278
    const v22, 0x4053d70a    # 3.31f

    .line 279
    .line 280
    .line 281
    const v23, 0x402c28f6    # 2.69f

    .line 282
    .line 283
    .line 284
    const/high16 v24, 0x40c00000    # 6.0f

    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, 0x406c28f6    # 3.69f

    .line 290
    .line 291
    .line 292
    const v26, -0x405c28f6    # -1.28f

    .line 293
    .line 294
    .line 295
    const v21, 0x3fb1eb85    # 1.39f

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const v23, 0x402ae148    # 2.67f

    .line 301
    .line 302
    .line 303
    const v24, -0x410a3d71    # -0.48f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x41400000    # 12.0f

    .line 310
    .line 311
    const/high16 v26, 0x41b80000    # 23.0f

    .line 312
    .line 313
    const v21, 0x4126e148    # 10.43f

    .line 314
    .line 315
    .line 316
    const v22, 0x41b73333    # 22.9f

    .line 317
    .line 318
    .line 319
    const v23, 0x41333333    # 11.2f

    .line 320
    .line 321
    .line 322
    const/high16 v24, 0x41b80000    # 23.0f

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x4013d70a    # 2.31f

    .line 328
    .line 329
    .line 330
    const v6, -0x4170a3d7    # -0.28f

    .line 331
    .line 332
    .line 333
    const v7, 0x3fc8f5c3    # 1.57f

    .line 334
    .line 335
    .line 336
    const v8, -0x42333333    # -0.1f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, 0x41900000    # 18.0f

    .line 343
    .line 344
    const/high16 v26, 0x41c00000    # 24.0f

    .line 345
    .line 346
    const v21, 0x417547ae    # 15.33f

    .line 347
    .line 348
    .line 349
    const v22, 0x41bc28f6    # 23.52f

    .line 350
    .line 351
    .line 352
    const v23, 0x4184e148    # 16.61f

    .line 353
    .line 354
    .line 355
    const/high16 v24, 0x41c00000    # 24.0f

    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v25, 0x40c00000    # 6.0f

    .line 361
    .line 362
    const/high16 v26, -0x3f400000    # -6.0f

    .line 363
    .line 364
    const v21, 0x4053d70a    # 3.31f

    .line 365
    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const/high16 v23, 0x40c00000    # 6.0f

    .line 370
    .line 371
    const v24, -0x3fd3d70a    # -2.69f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v25, 0x41afc28f    # 21.97f

    .line 378
    .line 379
    .line 380
    const v26, 0x415851ec    # 13.52f

    .line 381
    .line 382
    .line 383
    const/high16 v21, 0x41c00000    # 24.0f

    .line 384
    .line 385
    const v22, 0x4181c28f    # 16.22f

    .line 386
    .line 387
    .line 388
    const v23, 0x41b9ae14    # 23.21f

    .line 389
    .line 390
    .line 391
    const v24, 0x4169eb85    # 14.62f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41400000    # 12.0f

    .line 401
    .line 402
    const/high16 v6, 0x41a80000    # 21.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v25, -0x3f000000    # -8.0f

    .line 408
    .line 409
    const/high16 v26, -0x3f000000    # -8.0f

    .line 410
    .line 411
    const v21, -0x3f72e148    # -4.41f

    .line 412
    .line 413
    .line 414
    const/16 v22, 0x0

    .line 415
    .line 416
    const/high16 v23, -0x3f000000    # -8.0f

    .line 417
    .line 418
    const v24, -0x3f9a3d71    # -3.59f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v25, 0x40c00000    # 6.0f

    .line 425
    .line 426
    const v26, -0x3f0851ec    # -7.74f

    .line 427
    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    const v22, -0x3f91eb85    # -3.72f

    .line 432
    .line 433
    .line 434
    const v23, 0x4023d70a    # 2.56f

    .line 435
    .line 436
    .line 437
    const v24, -0x3f24cccd    # -6.85f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/16 v25, 0x0

    .line 444
    .line 445
    const v26, 0x3d4ccccd    # 0.05f

    .line 446
    .line 447
    .line 448
    const v22, 0x3ca3d70a    # 0.02f

    .line 449
    .line 450
    .line 451
    const/16 v23, 0x0

    .line 452
    .line 453
    const v24, 0x3cf5c28f    # 0.03f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v25, 0x40c1eb85    # 6.06f

    .line 460
    .line 461
    .line 462
    const v26, 0x40c1eb85    # 6.06f

    .line 463
    .line 464
    .line 465
    const v22, 0x4055c28f    # 3.34f

    .line 466
    .line 467
    .line 468
    const v23, 0x402e147b    # 2.72f

    .line 469
    .line 470
    .line 471
    const v24, 0x40c1eb85    # 6.06f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v25, 0x405ccccd    # 3.45f

    .line 478
    .line 479
    .line 480
    const v26, -0x40747ae1    # -1.09f

    .line 481
    .line 482
    .line 483
    const v21, 0x3fa147ae    # 1.26f

    .line 484
    .line 485
    .line 486
    const/16 v22, 0x0

    .line 487
    .line 488
    const v23, 0x401ccccd    # 2.45f

    .line 489
    .line 490
    .line 491
    const v24, -0x413851ec    # -0.39f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v25, 0x41a00000    # 20.0f

    .line 498
    .line 499
    const/high16 v26, 0x41500000    # 13.0f

    .line 500
    .line 501
    const v21, 0x419e8f5c    # 19.82f

    .line 502
    .line 503
    .line 504
    const v22, 0x41323d71    # 11.14f

    .line 505
    .line 506
    .line 507
    const/high16 v23, 0x41a00000    # 20.0f

    .line 508
    .line 509
    const v24, 0x4140cccd    # 12.05f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v25, 0x41400000    # 12.0f

    .line 516
    .line 517
    const/high16 v26, 0x41a80000    # 21.0f

    .line 518
    .line 519
    const/high16 v21, 0x41a00000    # 20.0f

    .line 520
    .line 521
    const v22, 0x418b47ae    # 17.41f

    .line 522
    .line 523
    .line 524
    const v23, 0x418347ae    # 16.41f

    .line 525
    .line 526
    .line 527
    const/high16 v24, 0x41a80000    # 21.0f

    .line 528
    .line 529
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v16, 0x3800

    .line 540
    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v8, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v7, 0x0

    .line 548
    const/high16 v9, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v12, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const/4 v14, 0x0

    .line 554
    const/4 v15, 0x0

    .line 555
    const-string v4, ""

    .line 556
    .line 557
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 558
    .line 559
    .line 560
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 567
    .line 568
    .line 569
    move-result-wide v6

    .line 570
    const/4 v2, 0x0

    .line 571
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 575
    .line 576
    .line 577
    move-result v10

    .line 578
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 579
    .line 580
    .line 581
    move-result v11

    .line 582
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x41100000    # 9.0f

    .line 588
    .line 589
    const/high16 v6, 0x41600000    # 14.0f

    .line 590
    .line 591
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/4 v4, 0x0

    .line 595
    const/high16 v6, -0x40600000    # -1.25f

    .line 596
    .line 597
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v26, 0x40200000    # 2.5f

    .line 601
    .line 602
    const/16 v27, 0x0

    .line 603
    .line 604
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 605
    .line 606
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 607
    .line 608
    const/16 v23, 0x0

    .line 609
    .line 610
    const/16 v24, 0x1

    .line 611
    .line 612
    const/16 v25, 0x1

    .line 613
    .line 614
    move-object/from16 v20, v2

    .line 615
    .line 616
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 620
    .line 621
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const/high16 v6, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/4 v7, 0x0

    .line 631
    const-string v4, ""

    .line 632
    .line 633
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 634
    .line 635
    .line 636
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 641
    .line 642
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 643
    .line 644
    .line 645
    move-result-wide v6

    .line 646
    const/4 v0, 0x0

    .line 647
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 651
    .line 652
    .line 653
    move-result v10

    .line 654
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x41700000    # 15.0f

    .line 664
    .line 665
    const/high16 v2, 0x41600000    # 14.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/4 v0, 0x0

    .line 671
    const/high16 v2, -0x40600000    # -1.25f

    .line 672
    .line 673
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v18, 0x40200000    # 2.5f

    .line 677
    .line 678
    const/16 v19, 0x0

    .line 679
    .line 680
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 681
    .line 682
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 683
    .line 684
    const/16 v16, 0x1

    .line 685
    .line 686
    const/16 v17, 0x1

    .line 687
    .line 688
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 692
    .line 693
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const/high16 v12, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const/4 v14, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    sput-object v0, Landroidx/compose/material/icons/filled/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    return-object v0
.end method

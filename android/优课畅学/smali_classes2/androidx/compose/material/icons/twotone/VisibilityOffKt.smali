.class public final Landroidx/compose/material/icons/twotone/VisibilityOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibilityOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VisibilityOff"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x3df5c28f    # 0.12f

    .line 78
    .line 79
    .line 80
    const v26, -0x43dc28f6    # -0.01f

    .line 81
    .line 82
    .line 83
    const v21, 0x3d23d70a    # 0.04f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3da3d70a    # 0.08f

    .line 89
    .line 90
    .line 91
    const v24, -0x43dc28f6    # -0.01f

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
    const v4, -0x3fd8f5c3    # -2.61f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v25, -0x43dc28f6    # -0.01f

    .line 106
    .line 107
    .line 108
    const v26, 0x3df5c28f    # 0.12f

    .line 109
    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const v22, 0x3d23d70a    # 0.04f

    .line 114
    .line 115
    .line 116
    const v23, -0x43dc28f6    # -0.01f

    .line 117
    .line 118
    .line 119
    const v24, 0x3da3d70a    # 0.08f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x40200000    # 2.5f

    .line 126
    .line 127
    const/high16 v26, 0x40200000    # 2.5f

    .line 128
    .line 129
    const v22, 0x3fb0a3d7    # 1.38f

    .line 130
    .line 131
    .line 132
    const v23, 0x3f8f5c29    # 1.12f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x40200000    # 2.5f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x415028f6    # 13.01f

    .line 144
    .line 145
    .line 146
    const v6, 0x41135c29    # 9.21f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x3fa3d70a    # 1.28f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v25, -0x405c28f6    # -1.28f

    .line 159
    .line 160
    .line 161
    const v26, -0x405c28f6    # -1.28f

    .line 162
    .line 163
    .line 164
    const v21, -0x417ae148    # -0.26f

    .line 165
    .line 166
    .line 167
    const v22, -0x40ee147b    # -0.57f

    .line 168
    .line 169
    .line 170
    const v23, -0x40ca3d71    # -0.71f

    .line 171
    .line 172
    .line 173
    const v24, -0x407c28f6    # -1.03f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x41a68f5c    # 20.82f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x41380000    # 11.5f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x41400000    # 12.0f

    .line 191
    .line 192
    const/high16 v26, 0x40c00000    # 6.0f

    .line 193
    .line 194
    const v21, 0x41995c29    # 19.17f

    .line 195
    .line 196
    .line 197
    const v22, 0x4102147b    # 8.13f

    .line 198
    .line 199
    .line 200
    const v23, 0x417ca3d7    # 15.79f

    .line 201
    .line 202
    .line 203
    const/high16 v24, 0x40c00000    # 6.0f

    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, -0x400147ae    # -1.99f

    .line 209
    .line 210
    .line 211
    const v26, 0x3e6147ae    # 0.22f

    .line 212
    .line 213
    .line 214
    const v21, -0x40d1eb85    # -0.68f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const v23, -0x40547ae1    # -1.34f

    .line 220
    .line 221
    .line 222
    const v24, 0x3db851ec    # 0.09f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x3f6b851f    # 0.92f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x3f88f5c3    # 1.07f

    .line 235
    .line 236
    .line 237
    const v26, -0x41f0a3d7    # -0.14f

    .line 238
    .line 239
    .line 240
    const v21, 0x3eb33333    # 0.35f

    .line 241
    .line 242
    .line 243
    const v22, -0x4247ae14    # -0.09f

    .line 244
    .line 245
    .line 246
    const v23, 0x3f333333    # 0.7f

    .line 247
    .line 248
    .line 249
    const v24, -0x41f0a3d7    # -0.14f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x40900000    # 4.5f

    .line 256
    .line 257
    const/high16 v26, 0x40900000    # 4.5f

    .line 258
    .line 259
    const v21, 0x401eb852    # 2.48f

    .line 260
    .line 261
    .line 262
    const/16 v22, 0x0

    .line 263
    .line 264
    const/high16 v23, 0x40900000    # 4.5f

    .line 265
    .line 266
    const v24, 0x400147ae    # 2.02f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v25, -0x41f0a3d7    # -0.14f

    .line 273
    .line 274
    .line 275
    const v26, 0x3f88f5c3    # 1.07f

    .line 276
    .line 277
    .line 278
    const/16 v21, 0x0

    .line 279
    .line 280
    const v22, 0x3ebd70a4    # 0.37f

    .line 281
    .line 282
    .line 283
    const v23, -0x428a3d71    # -0.06f

    .line 284
    .line 285
    .line 286
    const v24, 0x3f3851ec    # 0.72f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x40033333    # 2.05f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, 0x401a3d71    # 2.41f

    .line 299
    .line 300
    .line 301
    const v26, -0x3fb851ec    # -3.12f

    .line 302
    .line 303
    .line 304
    const v21, 0x3f7ae148    # 0.98f

    .line 305
    .line 306
    .line 307
    const v22, -0x40a3d70a    # -0.86f

    .line 308
    .line 309
    .line 310
    const v23, 0x3fe7ae14    # 1.81f

    .line 311
    .line 312
    .line 313
    const v24, -0x400b851f    # -1.91f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x41880000    # 17.0f

    .line 323
    .line 324
    const/high16 v6, 0x41400000    # 12.0f

    .line 325
    .line 326
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v25, 0x40300000    # 2.75f

    .line 330
    .line 331
    const v26, -0x413851ec    # -0.39f

    .line 332
    .line 333
    .line 334
    const v21, 0x3f733333    # 0.95f

    .line 335
    .line 336
    .line 337
    const/16 v22, 0x0

    .line 338
    .line 339
    const v23, 0x3fef5c29    # 1.87f

    .line 340
    .line 341
    .line 342
    const v24, -0x41fae148    # -0.13f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v4, -0x40851eb8    # -0.98f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, -0x401d70a4    # -1.77f

    .line 355
    .line 356
    .line 357
    const v26, 0x3ebd70a4    # 0.37f

    .line 358
    .line 359
    .line 360
    const v21, -0x40f5c28f    # -0.54f

    .line 361
    .line 362
    .line 363
    const v22, 0x3e75c28f    # 0.24f

    .line 364
    .line 365
    .line 366
    const v23, -0x406e147b    # -1.14f

    .line 367
    .line 368
    .line 369
    const v24, 0x3ebd70a4    # 0.37f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v25, -0x3f700000    # -4.5f

    .line 376
    .line 377
    const/high16 v26, -0x3f700000    # -4.5f

    .line 378
    .line 379
    const v21, -0x3fe147ae    # -2.48f

    .line 380
    .line 381
    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    const/high16 v23, -0x3f700000    # -4.5f

    .line 385
    .line 386
    const v24, -0x3ffeb852    # -2.02f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v25, 0x3eb851ec    # 0.36f

    .line 393
    .line 394
    .line 395
    const v26, -0x401d70a4    # -1.77f

    .line 396
    .line 397
    .line 398
    const/16 v21, 0x0

    .line 399
    .line 400
    const v22, -0x40deb852    # -0.63f

    .line 401
    .line 402
    .line 403
    const v23, 0x3e051eb8    # 0.13f

    .line 404
    .line 405
    .line 406
    const v24, -0x40628f5c    # -1.23f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v4, 0x40ff0a3d    # 7.97f

    .line 413
    .line 414
    .line 415
    const v6, 0x40c3851f    # 6.11f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v25, -0x3fc47ae1    # -2.93f

    .line 422
    .line 423
    .line 424
    const v26, 0x406147ae    # 3.52f

    .line 425
    .line 426
    .line 427
    const v21, -0x4063d70a    # -1.22f

    .line 428
    .line 429
    .line 430
    const v22, 0x3f68f5c3    # 0.91f

    .line 431
    .line 432
    .line 433
    const v23, -0x3ff147ae    # -2.23f

    .line 434
    .line 435
    .line 436
    const v24, 0x40066666    # 2.1f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v25, 0x41400000    # 12.0f

    .line 443
    .line 444
    const/high16 v26, 0x41880000    # 17.0f

    .line 445
    .line 446
    const v21, 0x409a8f5c    # 4.83f

    .line 447
    .line 448
    .line 449
    const v22, 0x416dc28f    # 14.86f

    .line 450
    .line 451
    .line 452
    const v23, 0x41035c29    # 8.21f

    .line 453
    .line 454
    .line 455
    const/high16 v24, 0x41880000    # 17.0f

    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    const/16 v16, 0x3800

    .line 468
    .line 469
    const/16 v17, 0x0

    .line 470
    .line 471
    const v6, 0x3e99999a    # 0.3f

    .line 472
    .line 473
    .line 474
    const v8, 0x3e99999a    # 0.3f

    .line 475
    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const/high16 v9, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40c00000    # 6.0f

    .line 518
    .line 519
    const/high16 v2, 0x41400000    # 12.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, 0x410d1eb8    # 8.82f

    .line 525
    .line 526
    .line 527
    const/high16 v18, 0x40b00000    # 5.5f

    .line 528
    .line 529
    const v13, 0x40728f5c    # 3.79f

    .line 530
    .line 531
    .line 532
    const v15, 0x40e570a4    # 7.17f

    .line 533
    .line 534
    .line 535
    const v16, 0x400851ec    # 2.13f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, -0x3fe5c28f    # -2.41f

    .line 542
    .line 543
    .line 544
    const v18, 0x4047ae14    # 3.12f

    .line 545
    .line 546
    .line 547
    const v13, -0x40e8f5c3    # -0.59f

    .line 548
    .line 549
    .line 550
    const v14, 0x3f9c28f6    # 1.22f

    .line 551
    .line 552
    .line 553
    const v15, -0x404a3d71    # -1.42f

    .line 554
    .line 555
    .line 556
    const v16, 0x401147ae    # 2.27f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x3fb47ae1    # 1.41f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x404b851f    # 3.18f

    .line 569
    .line 570
    .line 571
    const v18, -0x3f6f0a3d    # -4.53f

    .line 572
    .line 573
    .line 574
    const v13, 0x3fb1eb85    # 1.39f

    .line 575
    .line 576
    .line 577
    const v14, -0x40628f5c    # -1.23f

    .line 578
    .line 579
    .line 580
    const v15, 0x401f5c29    # 2.49f

    .line 581
    .line 582
    .line 583
    const v16, -0x3fceb852    # -2.77f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x41400000    # 12.0f

    .line 590
    .line 591
    const/high16 v18, 0x40800000    # 4.0f

    .line 592
    .line 593
    const v13, 0x41aa28f6    # 21.27f

    .line 594
    .line 595
    .line 596
    const v14, 0x40e3851f    # 7.11f

    .line 597
    .line 598
    .line 599
    const/high16 v15, 0x41880000    # 17.0f

    .line 600
    .line 601
    const/high16 v16, 0x40800000    # 4.0f

    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, -0x3f970a3d    # -3.64f

    .line 607
    .line 608
    .line 609
    const v18, 0x3f11eb85    # 0.57f

    .line 610
    .line 611
    .line 612
    const v13, -0x405d70a4    # -1.27f

    .line 613
    .line 614
    .line 615
    const/4 v14, 0x0

    .line 616
    const v15, -0x3fe0a3d7    # -2.49f

    .line 617
    .line 618
    .line 619
    const v16, 0x3e4ccccd    # 0.2f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x3fd33333    # 1.65f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v17, 0x41400000    # 12.0f

    .line 632
    .line 633
    const/high16 v18, 0x40c00000    # 6.0f

    .line 634
    .line 635
    const v13, 0x412a8f5c    # 10.66f

    .line 636
    .line 637
    .line 638
    const v14, 0x40c2e148    # 6.09f

    .line 639
    .line 640
    .line 641
    const v15, 0x41351eb8    # 11.32f

    .line 642
    .line 643
    .line 644
    const/high16 v16, 0x40c00000    # 6.0f

    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x41647ae1    # 14.28f

    .line 653
    .line 654
    .line 655
    const v2, 0x4127d70a    # 10.49f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x40047ae1    # 2.07f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3e0f5c29    # 0.14f

    .line 668
    .line 669
    .line 670
    const v18, -0x40770a3d    # -1.07f

    .line 671
    .line 672
    .line 673
    const v13, 0x3da3d70a    # 0.08f

    .line 674
    .line 675
    .line 676
    const v14, -0x4151eb85    # -0.34f

    .line 677
    .line 678
    .line 679
    const v15, 0x3e0f5c29    # 0.14f

    .line 680
    .line 681
    .line 682
    const v16, -0x40cccccd    # -0.7f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x41400000    # 12.0f

    .line 689
    .line 690
    const/high16 v18, 0x40e00000    # 7.0f

    .line 691
    .line 692
    const/high16 v13, 0x41840000    # 16.5f

    .line 693
    .line 694
    const v14, 0x411028f6    # 9.01f

    .line 695
    .line 696
    .line 697
    const v15, 0x4167ae14    # 14.48f

    .line 698
    .line 699
    .line 700
    const/high16 v16, 0x40e00000    # 7.0f

    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, -0x40770a3d    # -1.07f

    .line 706
    .line 707
    .line 708
    const v18, 0x3e0f5c29    # 0.14f

    .line 709
    .line 710
    .line 711
    const v13, -0x41428f5c    # -0.37f

    .line 712
    .line 713
    .line 714
    const/4 v14, 0x0

    .line 715
    const v15, -0x40c7ae14    # -0.72f

    .line 716
    .line 717
    .line 718
    const v16, 0x3d75c28f    # 0.06f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v0, 0x41500000    # 13.0f

    .line 725
    .line 726
    const v2, 0x41135c29    # 9.21f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v17, 0x3fa3d70a    # 1.28f

    .line 733
    .line 734
    .line 735
    const v18, 0x3fa3d70a    # 1.28f

    .line 736
    .line 737
    .line 738
    const v13, 0x3f147ae1    # 0.58f

    .line 739
    .line 740
    .line 741
    const/high16 v14, 0x3e800000    # 0.25f

    .line 742
    .line 743
    const v15, 0x3f83d70a    # 1.03f

    .line 744
    .line 745
    .line 746
    const v16, 0x3f35c28f    # 0.71f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x4077ae14    # 3.87f

    .line 756
    .line 757
    .line 758
    const v2, 0x4000a3d7    # 2.01f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x402b851f    # 2.68f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v17, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/high16 v18, 0x41380000    # 11.5f

    .line 773
    .line 774
    const v13, 0x4043d70a    # 3.06f

    .line 775
    .line 776
    .line 777
    const v14, 0x40fa8f5c    # 7.83f

    .line 778
    .line 779
    .line 780
    const v15, 0x3fe28f5c    # 1.77f

    .line 781
    .line 782
    .line 783
    const v16, 0x41187ae1    # 9.53f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v17, 0x41400000    # 12.0f

    .line 790
    .line 791
    const/high16 v18, 0x41980000    # 19.0f

    .line 792
    .line 793
    const v13, 0x402eb852    # 2.73f

    .line 794
    .line 795
    .line 796
    const v14, 0x417e3d71    # 15.89f

    .line 797
    .line 798
    .line 799
    const/high16 v15, 0x40e00000    # 7.0f

    .line 800
    .line 801
    const/high16 v16, 0x41980000    # 19.0f

    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x408a3d71    # 4.32f

    .line 807
    .line 808
    .line 809
    const v18, -0x40ae147b    # -0.82f

    .line 810
    .line 811
    .line 812
    const v13, 0x3fc28f5c    # 1.52f

    .line 813
    .line 814
    .line 815
    const/4 v14, 0x0

    .line 816
    const v15, 0x403eb852    # 2.98f

    .line 817
    .line 818
    .line 819
    const v16, -0x416b851f    # -0.29f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v0, 0x405ae148    # 3.42f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v0, -0x404b851f    # -1.41f

    .line 832
    .line 833
    .line 834
    const v2, 0x3fb47ae1    # 1.41f

    .line 835
    .line 836
    .line 837
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v0, 0x401ccccd    # 2.45f

    .line 841
    .line 842
    .line 843
    const v2, 0x405ae148    # 3.42f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v0, 0x4077ae14    # 3.87f

    .line 850
    .line 851
    .line 852
    const v2, 0x4000a3d7    # 2.01f

    .line 853
    .line 854
    .line 855
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v0, 0x411828f6    # 9.51f

    .line 862
    .line 863
    .line 864
    const v2, 0x4135eb85    # 11.37f

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, 0x40270a3d    # 2.61f

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v17, -0x420a3d71    # -0.12f

    .line 877
    .line 878
    .line 879
    const v18, 0x3ca3d70a    # 0.02f

    .line 880
    .line 881
    .line 882
    const v13, -0x42dc28f6    # -0.04f

    .line 883
    .line 884
    .line 885
    const v14, 0x3c23d70a    # 0.01f

    .line 886
    .line 887
    .line 888
    const v15, -0x425c28f6    # -0.08f

    .line 889
    .line 890
    .line 891
    const v16, 0x3ca3d70a    # 0.02f

    .line 892
    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 898
    .line 899
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 900
    .line 901
    const v13, -0x404f5c29    # -1.38f

    .line 902
    .line 903
    .line 904
    const/4 v14, 0x0

    .line 905
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 906
    .line 907
    const v16, -0x4070a3d7    # -1.12f

    .line 908
    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v17, 0x3c23d70a    # 0.01f

    .line 914
    .line 915
    .line 916
    const v18, -0x41fae148    # -0.13f

    .line 917
    .line 918
    .line 919
    const/4 v13, 0x0

    .line 920
    const v14, -0x42b33333    # -0.05f

    .line 921
    .line 922
    .line 923
    const v15, 0x3c23d70a    # 0.01f

    .line 924
    .line 925
    .line 926
    const v16, -0x425c28f6    # -0.08f

    .line 927
    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, 0x40ff0a3d    # 7.97f

    .line 936
    .line 937
    .line 938
    const v2, 0x40c3851f    # 6.11f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 945
    .line 946
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v17, -0x4147ae14    # -0.36f

    .line 950
    .line 951
    .line 952
    const v18, 0x3fe3d70a    # 1.78f

    .line 953
    .line 954
    .line 955
    const v13, -0x41947ae1    # -0.23f

    .line 956
    .line 957
    .line 958
    const v14, 0x3f0ccccd    # 0.55f

    .line 959
    .line 960
    .line 961
    const v15, -0x4147ae14    # -0.36f

    .line 962
    .line 963
    .line 964
    const v16, 0x3f933333    # 1.15f

    .line 965
    .line 966
    .line 967
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const/high16 v17, 0x40900000    # 4.5f

    .line 971
    .line 972
    const/high16 v18, 0x40900000    # 4.5f

    .line 973
    .line 974
    const/4 v13, 0x0

    .line 975
    const v14, 0x401eb852    # 2.48f

    .line 976
    .line 977
    .line 978
    const v15, 0x400147ae    # 2.02f

    .line 979
    .line 980
    .line 981
    const/high16 v16, 0x40900000    # 4.5f

    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v17, 0x3fe28f5c    # 1.77f

    .line 987
    .line 988
    .line 989
    const v18, -0x4147ae14    # -0.36f

    .line 990
    .line 991
    .line 992
    const v13, 0x3f2147ae    # 0.63f

    .line 993
    .line 994
    .line 995
    const/4 v14, 0x0

    .line 996
    const v15, 0x3f9d70a4    # 1.23f

    .line 997
    .line 998
    .line 999
    const v16, -0x41fae148    # -0.13f

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v0, 0x3f7ae148    # 0.98f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const/high16 v17, -0x3fd00000    # -2.75f

    .line 1012
    .line 1013
    const v18, 0x3ec28f5c    # 0.38f

    .line 1014
    .line 1015
    .line 1016
    const v13, -0x409eb852    # -0.88f

    .line 1017
    .line 1018
    .line 1019
    const v14, 0x3e75c28f    # 0.24f

    .line 1020
    .line 1021
    .line 1022
    const v15, -0x4019999a    # -1.8f

    .line 1023
    .line 1024
    .line 1025
    const v16, 0x3ec28f5c    # 0.38f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, -0x3ef2e148    # -8.82f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v18, -0x3f500000    # -5.5f

    .line 1035
    .line 1036
    const v13, -0x3f8d70a4    # -3.79f

    .line 1037
    .line 1038
    .line 1039
    const/4 v14, 0x0

    .line 1040
    const v15, -0x3f1a8f5c    # -7.17f

    .line 1041
    .line 1042
    .line 1043
    const v16, -0x3ff7ae14    # -2.13f

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const v17, 0x403b851f    # 2.93f

    .line 1050
    .line 1051
    .line 1052
    const v18, -0x3f9e147b    # -3.53f

    .line 1053
    .line 1054
    .line 1055
    const v13, 0x3f333333    # 0.7f

    .line 1056
    .line 1057
    .line 1058
    const v14, -0x4048f5c3    # -1.43f

    .line 1059
    .line 1060
    .line 1061
    const v15, 0x3fdc28f6    # 1.72f

    .line 1062
    .line 1063
    .line 1064
    const v16, -0x3fd8f5c3    # -2.61f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    const/16 v16, 0x3800

    .line 1078
    .line 1079
    const/16 v17, 0x0

    .line 1080
    .line 1081
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1082
    .line 1083
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1084
    .line 1085
    const/4 v7, 0x0

    .line 1086
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1087
    .line 1088
    const/4 v13, 0x0

    .line 1089
    const/4 v14, 0x0

    .line 1090
    const/4 v15, 0x0

    .line 1091
    const-string v4, ""

    .line 1092
    .line 1093
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    sput-object v0, Landroidx/compose/material/icons/twotone/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1102
    .line 1103
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1104
    .line 1105
    .line 1106
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/AirKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _air:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAir(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AirKt;->_air:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Air"

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
    const v0, 0x4165999a    # 14.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x418f999a    # 17.95f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x400ccccd    # -1.9f

    .line 80
    .line 81
    .line 82
    const v18, 0x3ff33333    # 1.9f

    .line 83
    .line 84
    .line 85
    const v13, -0x4170a3d7    # -0.28f

    .line 86
    .line 87
    .line 88
    const v14, 0x3f63d70a    # 0.89f

    .line 89
    .line 90
    .line 91
    const v15, -0x407eb852    # -1.01f

    .line 92
    .line 93
    .line 94
    const v16, 0x3fcf5c29    # 1.62f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3f9a3d71    # -3.59f

    .line 101
    .line 102
    .line 103
    const v18, -0x404a3d71    # -1.42f

    .line 104
    .line 105
    .line 106
    const v13, -0x403eb852    # -1.51f

    .line 107
    .line 108
    .line 109
    const v14, 0x3ef5c28f    # 0.48f

    .line 110
    .line 111
    .line 112
    const v15, -0x3fc3d70a    # -2.94f

    .line 113
    .line 114
    .line 115
    const v16, -0x41947ae1    # -0.23f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x411c51ec    # 9.77f

    .line 122
    .line 123
    .line 124
    const/high16 v18, 0x41880000    # 17.0f

    .line 125
    .line 126
    const v13, 0x410828f6    # 8.51f

    .line 127
    .line 128
    .line 129
    const v14, 0x418e3d71    # 17.78f

    .line 130
    .line 131
    .line 132
    const v15, 0x41107ae1    # 9.03f

    .line 133
    .line 134
    .line 135
    const/high16 v16, 0x41880000    # 17.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x3c23d70a    # 0.01f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3f570a3d    # 0.84f

    .line 147
    .line 148
    .line 149
    const v18, 0x3eeb851f    # 0.46f

    .line 150
    .line 151
    .line 152
    const v13, 0x3eae147b    # 0.34f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x3f2e147b    # 0.68f

    .line 157
    .line 158
    .line 159
    const v16, 0x3e23d70a    # 0.16f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3f63d70a    # 0.89f

    .line 166
    .line 167
    .line 168
    const v18, 0x3f0a3d71    # 0.54f

    .line 169
    .line 170
    .line 171
    const v13, 0x3e2e147b    # 0.17f

    .line 172
    .line 173
    .line 174
    const v14, 0x3ea3d70a    # 0.32f

    .line 175
    .line 176
    .line 177
    const/high16 v15, 0x3f000000    # 0.5f

    .line 178
    .line 179
    const v16, 0x3f0a3d71    # 0.54f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/high16 v18, -0x40800000    # -1.0f

    .line 188
    .line 189
    const v13, 0x3f0ccccd    # 0.55f

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/high16 v15, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const v16, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    const/high16 v2, -0x40800000    # -1.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40400000    # 3.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v17, -0x40800000    # -1.0f

    .line 215
    .line 216
    const v13, -0x40f33333    # -0.55f

    .line 217
    .line 218
    .line 219
    const/high16 v15, -0x40800000    # -1.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const v15, 0x3ee66666    # 0.45f

    .line 235
    .line 236
    .line 237
    const/high16 v16, -0x40800000    # -1.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41080000    # 8.5f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x4165999a    # 14.35f

    .line 248
    .line 249
    .line 250
    const v18, 0x418f999a    # 17.95f

    .line 251
    .line 252
    .line 253
    const v13, 0x41575c29    # 13.46f

    .line 254
    .line 255
    .line 256
    const/high16 v14, 0x41600000    # 14.0f

    .line 257
    .line 258
    const/high16 v15, 0x41700000    # 15.0f

    .line 259
    .line 260
    const v16, 0x417e6666    # 15.9f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x419747ae    # 18.91f

    .line 270
    .line 271
    .line 272
    const v2, 0x40b570a4    # 5.67f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x3fdae148    # -2.58f

    .line 279
    .line 280
    .line 281
    const v18, -0x3fdae148    # -2.58f

    .line 282
    .line 283
    .line 284
    const v13, -0x416b851f    # -0.29f

    .line 285
    .line 286
    .line 287
    const v14, -0x405eb852    # -1.26f

    .line 288
    .line 289
    .line 290
    const v15, -0x40570a3d    # -1.32f

    .line 291
    .line 292
    .line 293
    const v16, -0x3fed70a4    # -2.29f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x3f7f5c29    # -4.02f

    .line 300
    .line 301
    .line 302
    const v18, 0x3ffd70a4    # 1.98f

    .line 303
    .line 304
    .line 305
    const v13, -0x401eb852    # -1.76f

    .line 306
    .line 307
    .line 308
    const v14, -0x41333333    # -0.4f

    .line 309
    .line 310
    .line 311
    const v15, -0x3fa851ec    # -3.37f

    .line 312
    .line 313
    .line 314
    const v16, 0x3f07ae14    # 0.53f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x41535c29    # 13.21f

    .line 321
    .line 322
    .line 323
    const/high16 v18, 0x40d00000    # 6.5f

    .line 324
    .line 325
    const/high16 v13, 0x41400000    # 12.0f

    .line 326
    .line 327
    const v14, 0x40b7ae14    # 5.74f

    .line 328
    .line 329
    .line 330
    const v15, 0x4147ae14    # 12.48f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x40d00000    # 6.5f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/4 v0, 0x0

    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x3f666666    # 0.9f

    .line 343
    .line 344
    .line 345
    const v18, -0x40ee147b    # -0.57f

    .line 346
    .line 347
    .line 348
    const v13, 0x3ec7ae14    # 0.39f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const/high16 v15, 0x3f400000    # 0.75f

    .line 353
    .line 354
    const v16, -0x419eb852    # -0.22f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41780000    # 15.5f

    .line 361
    .line 362
    const/high16 v18, 0x40a00000    # 5.0f

    .line 363
    .line 364
    const v13, 0x416570a4    # 14.34f

    .line 365
    .line 366
    .line 367
    const v14, 0x40ac28f6    # 5.38f

    .line 368
    .line 369
    .line 370
    const v15, 0x416deb85    # 14.87f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x40a00000    # 5.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41880000    # 17.0f

    .line 379
    .line 380
    const/high16 v18, 0x40d00000    # 6.5f

    .line 381
    .line 382
    const v13, 0x4182a3d7    # 16.33f

    .line 383
    .line 384
    .line 385
    const/high16 v14, 0x40a00000    # 5.0f

    .line 386
    .line 387
    const/high16 v15, 0x41880000    # 17.0f

    .line 388
    .line 389
    const v16, 0x40b570a4    # 5.67f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x4182a3d7    # 16.33f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x41780000    # 15.5f

    .line 399
    .line 400
    const/high16 v4, 0x41000000    # 8.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x40400000    # 3.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/high16 v18, 0x41100000    # 9.0f

    .line 413
    .line 414
    const v13, 0x401ccccd    # 2.45f

    .line 415
    .line 416
    .line 417
    const/high16 v14, 0x41000000    # 8.0f

    .line 418
    .line 419
    const/high16 v15, 0x40000000    # 2.0f

    .line 420
    .line 421
    const v16, 0x41073333    # 8.45f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/high16 v18, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const v14, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const v15, 0x3ee66666    # 0.45f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x3f800000    # 1.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x41480000    # 12.5f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x419747ae    # 18.91f

    .line 453
    .line 454
    .line 455
    const v18, 0x40b570a4    # 5.67f

    .line 456
    .line 457
    .line 458
    const v13, 0x418d999a    # 17.7f

    .line 459
    .line 460
    .line 461
    const/high16 v14, 0x41200000    # 10.0f

    .line 462
    .line 463
    const v15, 0x419b70a4    # 19.43f

    .line 464
    .line 465
    .line 466
    const v16, 0x40feb852    # 7.96f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x41933333    # 18.4f

    .line 476
    .line 477
    .line 478
    const/high16 v2, 0x41300000    # 11.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41300000    # 11.0f

    .line 484
    .line 485
    const/high16 v2, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40800000    # -1.0f

    .line 491
    .line 492
    const/high16 v18, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const v13, -0x40f33333    # -0.55f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v16, 0x3ee66666    # 0.45f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/4 v0, 0x0

    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    const v14, 0x3f0ccccd    # 0.55f

    .line 514
    .line 515
    .line 516
    const v15, 0x3ee66666    # 0.45f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41780000    # 15.5f

    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 530
    .line 531
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 532
    .line 533
    const v13, 0x3f547ae1    # 0.83f

    .line 534
    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 538
    .line 539
    const v16, 0x3f2b851f    # 0.67f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, -0x4091eb85    # -0.93f

    .line 546
    .line 547
    .line 548
    const v18, 0x3fb1eb85    # 1.39f

    .line 549
    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const v14, 0x3f2147ae    # 0.63f

    .line 553
    .line 554
    .line 555
    const v15, -0x413d70a4    # -0.38f

    .line 556
    .line 557
    .line 558
    const v16, 0x3f947ae1    # 1.16f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, -0x40ee147b    # -0.57f

    .line 565
    .line 566
    .line 567
    const v18, 0x3f666666    # 0.9f

    .line 568
    .line 569
    .line 570
    const v13, -0x4147ae14    # -0.36f

    .line 571
    .line 572
    .line 573
    const v14, 0x3e19999a    # 0.15f

    .line 574
    .line 575
    .line 576
    const v15, -0x40ee147b    # -0.57f

    .line 577
    .line 578
    .line 579
    const v16, 0x3f028f5c    # 0.51f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/4 v0, 0x0

    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x3fb70a3d    # 1.43f

    .line 590
    .line 591
    .line 592
    const v18, 0x3f68f5c3    # 0.91f

    .line 593
    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const v14, 0x3f3ae148    # 0.73f

    .line 597
    .line 598
    .line 599
    const v15, 0x3f428f5c    # 0.76f

    .line 600
    .line 601
    .line 602
    const v16, 0x3f9ae148    # 1.21f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x40000000    # 2.0f

    .line 609
    .line 610
    const v18, -0x3f847ae1    # -3.93f

    .line 611
    .line 612
    .line 613
    const v13, 0x3fb70a3d    # 1.43f

    .line 614
    .line 615
    .line 616
    const v14, -0x40dc28f6    # -0.64f

    .line 617
    .line 618
    .line 619
    const v15, 0x40166666    # 2.35f

    .line 620
    .line 621
    .line 622
    const v16, -0x3ff28f5c    # -2.21f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x41933333    # 18.4f

    .line 629
    .line 630
    .line 631
    const/high16 v18, 0x41300000    # 11.0f

    .line 632
    .line 633
    const v13, 0x41acb852    # 21.59f

    .line 634
    .line 635
    .line 636
    const v14, 0x4142147b    # 12.13f

    .line 637
    .line 638
    .line 639
    const v15, 0x41a08f5c    # 20.07f

    .line 640
    .line 641
    .line 642
    const/high16 v16, 0x41300000    # 11.0f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    const/16 v16, 0x3800

    .line 655
    .line 656
    const/16 v17, 0x0

    .line 657
    .line 658
    const/high16 v6, 0x3f800000    # 1.0f

    .line 659
    .line 660
    const/high16 v8, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/4 v7, 0x0

    .line 663
    const/high16 v9, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/high16 v12, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    const/4 v14, 0x0

    .line 669
    const/4 v15, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    sput-object v0, Landroidx/compose/material/icons/rounded/AirKt;->_air:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-object v0
.end method

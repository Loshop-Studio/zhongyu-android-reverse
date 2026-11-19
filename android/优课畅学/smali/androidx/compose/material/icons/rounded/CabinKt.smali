.class public final Landroidx/compose/material/icons/rounded/CabinKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cabin:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCabin(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CabinKt;->_cabin:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cabin"

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
    const v0, 0x408bd70a    # 4.37f

    .line 71
    .line 72
    .line 73
    const v2, 0x40633333    # 3.55f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const/high16 v18, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v13, 0x409c7ae1    # 4.89f

    .line 84
    .line 85
    .line 86
    const v14, 0x4027ae14    # 2.62f

    .line 87
    .line 88
    .line 89
    const v15, 0x40bbd70a    # 5.87f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40000000    # 2.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x3f63d70a    # 0.89f

    .line 98
    .line 99
    .line 100
    const v18, -0x40f851ec    # -0.53f

    .line 101
    .line 102
    .line 103
    const v13, 0x3ec28f5c    # 0.38f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, 0x3f3851ec    # 0.72f

    .line 108
    .line 109
    .line 110
    const v16, -0x419eb852    # -0.22f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x410bae14    # 8.73f

    .line 117
    .line 118
    .line 119
    const/high16 v18, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const v13, 0x4100a3d7    # 8.04f

    .line 122
    .line 123
    .line 124
    const v14, 0x3f947ae1    # 1.16f

    .line 125
    .line 126
    .line 127
    const v15, 0x41063d71    # 8.39f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3f666666    # 0.9f

    .line 136
    .line 137
    .line 138
    const v18, 0x3fb9999a    # 1.45f

    .line 139
    .line 140
    .line 141
    const v13, 0x3f3d70a4    # 0.74f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const v15, 0x3fa147ae    # 1.26f

    .line 146
    .line 147
    .line 148
    const v16, 0x3f4ccccd    # 0.8f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x40e00000    # 7.0f

    .line 155
    .line 156
    const/high16 v18, 0x40800000    # 4.0f

    .line 157
    .line 158
    const v13, 0x4111c28f    # 9.11f

    .line 159
    .line 160
    .line 161
    const v14, 0x405851ec    # 3.38f

    .line 162
    .line 163
    .line 164
    const v15, 0x4102147b    # 8.13f

    .line 165
    .line 166
    .line 167
    const/high16 v16, 0x40800000    # 4.0f

    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x40c3851f    # 6.11f

    .line 173
    .line 174
    .line 175
    const v18, 0x4090f5c3    # 4.53f

    .line 176
    .line 177
    .line 178
    const v13, 0x40d3d70a    # 6.62f

    .line 179
    .line 180
    .line 181
    const/high16 v14, 0x40800000    # 4.0f

    .line 182
    .line 183
    const v15, 0x40c8f5c3    # 6.28f

    .line 184
    .line 185
    .line 186
    const v16, 0x40870a3d    # 4.22f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x40a8a3d7    # 5.27f

    .line 193
    .line 194
    .line 195
    const/high16 v18, 0x40a00000    # 5.0f

    .line 196
    .line 197
    const v13, 0x40beb852    # 5.96f

    .line 198
    .line 199
    .line 200
    const v14, 0x409ae148    # 4.84f

    .line 201
    .line 202
    .line 203
    const v15, 0x40b3851f    # 5.61f

    .line 204
    .line 205
    .line 206
    const/high16 v16, 0x40a00000    # 5.0f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x408bd70a    # 4.37f

    .line 212
    .line 213
    .line 214
    const v18, 0x40633333    # 3.55f

    .line 215
    .line 216
    .line 217
    const v13, 0x4090f5c3    # 4.53f

    .line 218
    .line 219
    .line 220
    const/high16 v14, 0x40a00000    # 5.0f

    .line 221
    .line 222
    const v15, 0x408051ec    # 4.01f

    .line 223
    .line 224
    .line 225
    const v16, 0x40866666    # 4.2f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x41b31eb8    # 22.39f

    .line 235
    .line 236
    .line 237
    const v2, 0x41430a3d    # 12.19f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x404ccccd    # -1.4f

    .line 244
    .line 245
    .line 246
    const v18, 0x3e428f5c    # 0.19f

    .line 247
    .line 248
    .line 249
    const v13, -0x4151eb85    # -0.34f

    .line 250
    .line 251
    .line 252
    const v14, 0x3ee147ae    # 0.44f

    .line 253
    .line 254
    .line 255
    const v15, -0x408a3d71    # -0.96f

    .line 256
    .line 257
    .line 258
    const v16, 0x3f051eb8    # 0.52f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x4139eb85    # 11.62f

    .line 265
    .line 266
    .line 267
    const/high16 v2, 0x41a00000    # 20.0f

    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x41a00000    # 20.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, -0x40800000    # -1.0f

    .line 278
    .line 279
    const/high16 v18, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const v14, 0x3f0ccccd    # 0.55f

    .line 283
    .line 284
    .line 285
    const v15, -0x4119999a    # -0.45f

    .line 286
    .line 287
    .line 288
    const/high16 v16, 0x3f800000    # 1.0f

    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40a00000    # 5.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v18, -0x40800000    # -1.0f

    .line 299
    .line 300
    const v13, -0x40f33333    # -0.55f

    .line 301
    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    const/high16 v15, -0x40800000    # -1.0f

    .line 305
    .line 306
    const v16, -0x4119999a    # -0.45f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x3ef9eb85    # -8.38f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, -0x40828f5c    # -0.99f

    .line 319
    .line 320
    .line 321
    const v2, 0x3f428f5c    # 0.76f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x404ccccd    # -1.4f

    .line 328
    .line 329
    .line 330
    const v18, -0x41bd70a4    # -0.19f

    .line 331
    .line 332
    .line 333
    const v13, -0x411eb852    # -0.44f

    .line 334
    .line 335
    .line 336
    const v14, 0x3eae147b    # 0.34f

    .line 337
    .line 338
    .line 339
    const v15, -0x40770a3d    # -1.07f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x3e800000    # 0.25f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x3e428f5c    # 0.19f

    .line 348
    .line 349
    .line 350
    const v18, -0x404ccccd    # -1.4f

    .line 351
    .line 352
    .line 353
    const v13, -0x41570a3d    # -0.33f

    .line 354
    .line 355
    .line 356
    const v14, -0x411eb852    # -0.44f

    .line 357
    .line 358
    .line 359
    const/high16 v15, -0x41800000    # -0.25f

    .line 360
    .line 361
    const v16, -0x40770a3d    # -1.07f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40800000    # 4.0f

    .line 368
    .line 369
    const v2, 0x4111c28f    # 9.11f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40e00000    # 7.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/high16 v18, -0x40800000    # -1.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, -0x40f33333    # -0.55f

    .line 386
    .line 387
    .line 388
    const v15, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    const/high16 v16, -0x40800000    # -1.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3ee66666    # 0.45f

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x3f800000    # 1.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3f147ae1    # 0.58f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x40ac7ae1    # 5.39f

    .line 411
    .line 412
    .line 413
    const v2, -0x3f7c28f6    # -4.12f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3f9ae148    # 1.21f

    .line 420
    .line 421
    .line 422
    const/16 v18, 0x0

    .line 423
    .line 424
    const v13, 0x3eb851ec    # 0.36f

    .line 425
    .line 426
    .line 427
    const v14, -0x4175c28f    # -0.27f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f5c28f6    # 0.86f

    .line 431
    .line 432
    .line 433
    const v16, -0x4175c28f    # -0.27f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x4119999a    # 9.6f

    .line 440
    .line 441
    .line 442
    const v2, 0x40ea8f5c    # 7.33f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x41b31eb8    # 22.39f

    .line 449
    .line 450
    .line 451
    const v18, 0x41430a3d    # 12.19f

    .line 452
    .line 453
    .line 454
    const v13, 0x41b51eb8    # 22.64f

    .line 455
    .line 456
    .line 457
    const v14, 0x4132147b    # 11.13f

    .line 458
    .line 459
    .line 460
    const v15, 0x41b5d70a    # 22.73f

    .line 461
    .line 462
    .line 463
    const v16, 0x413c28f6    # 11.76f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x4120f5c3    # 10.06f

    .line 473
    .line 474
    .line 475
    const/high16 v2, 0x40e00000    # 7.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x4078f5c3    # 3.89f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x40b0a3d7    # 5.52f

    .line 487
    .line 488
    .line 489
    const/high16 v2, 0x41400000    # 12.0f

    .line 490
    .line 491
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x4120f5c3    # 10.06f

    .line 495
    .line 496
    .line 497
    const/high16 v2, 0x40e00000    # 7.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x4121999a    # 10.1f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40c00000    # 6.0f

    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x41300000    # 11.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41400000    # 12.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, -0x4099999a    # -0.9f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x41847ae1    # 16.56f

    .line 530
    .line 531
    .line 532
    const/high16 v2, 0x41100000    # 9.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x40ee147b    # 7.44f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x4121999a    # 10.1f

    .line 544
    .line 545
    .line 546
    const/high16 v2, 0x40c00000    # 6.0f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x41500000    # 13.0f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40000000    # 2.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41400000    # 12.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, -0x40000000    # -2.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x40c00000    # 6.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41980000    # 19.0f

    .line 583
    .line 584
    const/high16 v2, 0x41900000    # 18.0f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, -0x40000000    # -2.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x40c00000    # 6.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x40000000    # 2.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41900000    # 18.0f

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/16 v16, 0x3800

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const/high16 v6, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v8, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    const/high16 v9, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/high16 v12, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const/4 v14, 0x0

    .line 631
    const/4 v15, 0x0

    .line 632
    const-string v4, ""

    .line 633
    .line 634
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    sput-object v0, Landroidx/compose/material/icons/rounded/CabinKt;->_cabin:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 643
    .line 644
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-object v0
.end method

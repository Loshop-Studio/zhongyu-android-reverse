.class public final Landroidx/compose/material/icons/sharp/PodcastsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPodcasts(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PodcastsKt;->_podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Podcasts"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const v18, 0x3fdc28f6    # 1.72f

    .line 80
    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, 0x3f3d70a4    # 0.74f

    .line 84
    .line 85
    .line 86
    const v15, -0x41333333    # -0.4f

    .line 87
    .line 88
    .line 89
    const v16, 0x3fb0a3d7    # 1.38f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x41b00000    # 22.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x3efb851f    # -8.28f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v18, -0x4023d70a    # -1.72f

    .line 112
    .line 113
    .line 114
    const v13, -0x40e66666    # -0.6f

    .line 115
    .line 116
    .line 117
    const v14, -0x414ccccd    # -0.35f

    .line 118
    .line 119
    .line 120
    const/high16 v15, -0x40800000    # -1.0f

    .line 121
    .line 122
    const v16, -0x40851eb8    # -0.98f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v18, -0x40000000    # -2.0f

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const v14, -0x40733333    # -1.1f

    .line 134
    .line 135
    .line 136
    const v15, 0x3f666666    # 0.9f

    .line 137
    .line 138
    .line 139
    const/high16 v16, -0x40000000    # -2.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x412e6666    # 10.9f

    .line 145
    .line 146
    .line 147
    const/high16 v2, 0x41600000    # 14.0f

    .line 148
    .line 149
    const/high16 v4, 0x41400000    # 12.0f

    .line 150
    .line 151
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40c00000    # 6.0f

    .line 158
    .line 159
    const/high16 v2, 0x41400000    # 12.0f

    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, -0x3f400000    # -6.0f

    .line 165
    .line 166
    const/high16 v18, 0x40c00000    # 6.0f

    .line 167
    .line 168
    const v13, -0x3fac28f6    # -3.31f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const/high16 v15, -0x3f400000    # -6.0f

    .line 173
    .line 174
    const v16, 0x402c28f6    # 2.69f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3ff851ec    # 1.94f

    .line 181
    .line 182
    .line 183
    const v18, 0x408ccccd    # 4.4f

    .line 184
    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3fdeb852    # 1.74f

    .line 188
    .line 189
    .line 190
    const/high16 v15, 0x3f400000    # 0.75f

    .line 191
    .line 192
    const v16, 0x4053d70a    # 3.31f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x404a3d71    # -1.42f

    .line 199
    .line 200
    .line 201
    const v2, 0x3fb5c28f    # 1.42f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x41000000    # 8.0f

    .line 208
    .line 209
    const/high16 v18, 0x41400000    # 12.0f

    .line 210
    .line 211
    const v13, 0x41087ae1    # 8.53f

    .line 212
    .line 213
    .line 214
    const/high16 v14, 0x41640000    # 14.25f

    .line 215
    .line 216
    const/high16 v15, 0x41000000    # 8.0f

    .line 217
    .line 218
    const v16, 0x41530a3d    # 13.19f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v18, -0x3f800000    # -4.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, -0x3ff28f5c    # -2.21f

    .line 230
    .line 231
    .line 232
    const v15, 0x3fe51eb8    # 1.79f

    .line 233
    .line 234
    .line 235
    const/high16 v16, -0x3f800000    # -4.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x3fe51eb8    # 1.79f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x40800000    # 4.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x4051eb85    # -1.36f

    .line 249
    .line 250
    .line 251
    const v18, 0x403eb852    # 2.98f

    .line 252
    .line 253
    .line 254
    const v14, 0x3f9851ec    # 1.19f

    .line 255
    .line 256
    .line 257
    const v15, -0x40f851ec    # -0.53f

    .line 258
    .line 259
    .line 260
    const/high16 v16, 0x40100000    # 2.25f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x3fb5c28f    # 1.42f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x41900000    # 18.0f

    .line 272
    .line 273
    const/high16 v18, 0x41400000    # 12.0f

    .line 274
    .line 275
    const/high16 v13, 0x418a0000    # 17.25f

    .line 276
    .line 277
    const v14, 0x4174f5c3    # 15.31f

    .line 278
    .line 279
    .line 280
    const/high16 v15, 0x41900000    # 18.0f

    .line 281
    .line 282
    const v16, 0x415bd70a    # 13.74f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x41400000    # 12.0f

    .line 289
    .line 290
    const/high16 v18, 0x40c00000    # 6.0f

    .line 291
    .line 292
    const/high16 v13, 0x41900000    # 18.0f

    .line 293
    .line 294
    const v14, 0x410b0a3d    # 8.69f

    .line 295
    .line 296
    .line 297
    const v15, 0x4174f5c3    # 15.31f

    .line 298
    .line 299
    .line 300
    const/high16 v16, 0x40c00000    # 6.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40000000    # 2.0f

    .line 309
    .line 310
    const/high16 v2, 0x41400000    # 12.0f

    .line 311
    .line 312
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x40000000    # 2.0f

    .line 316
    .line 317
    const/high16 v18, 0x41400000    # 12.0f

    .line 318
    .line 319
    const v13, 0x40cf5c29    # 6.48f

    .line 320
    .line 321
    .line 322
    const/high16 v14, 0x40000000    # 2.0f

    .line 323
    .line 324
    const/high16 v15, 0x40000000    # 2.0f

    .line 325
    .line 326
    const v16, 0x40cf5c29    # 6.48f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x40470a3d    # 3.11f

    .line 333
    .line 334
    .line 335
    const v18, 0x40e7ae14    # 7.24f

    .line 336
    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, 0x40366666    # 2.85f

    .line 340
    .line 341
    .line 342
    const v15, 0x3f99999a    # 1.2f

    .line 343
    .line 344
    .line 345
    const v16, 0x40ad1eb8    # 5.41f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x404a3d71    # -1.42f

    .line 352
    .line 353
    .line 354
    const v2, 0x3fb5c28f    # 1.42f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x40800000    # 4.0f

    .line 361
    .line 362
    const/high16 v18, 0x41400000    # 12.0f

    .line 363
    .line 364
    const v13, 0x409f5c29    # 4.98f

    .line 365
    .line 366
    .line 367
    const v14, 0x4182e148    # 16.36f

    .line 368
    .line 369
    .line 370
    const/high16 v15, 0x40800000    # 4.0f

    .line 371
    .line 372
    const v16, 0x4164a3d7    # 14.29f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41000000    # 8.0f

    .line 379
    .line 380
    const/high16 v18, -0x3f000000    # -8.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const v14, -0x3f72e148    # -4.41f

    .line 384
    .line 385
    .line 386
    const v15, 0x4065c28f    # 3.59f

    .line 387
    .line 388
    .line 389
    const/high16 v16, -0x3f000000    # -8.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x4065c28f    # 3.59f

    .line 395
    .line 396
    .line 397
    const/high16 v2, 0x41000000    # 8.0f

    .line 398
    .line 399
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x3fde147b    # -2.53f

    .line 403
    .line 404
    .line 405
    const v18, 0x40ba3d71    # 5.82f

    .line 406
    .line 407
    .line 408
    const v14, 0x40128f5c    # 2.29f

    .line 409
    .line 410
    .line 411
    const v15, -0x40851eb8    # -0.98f

    .line 412
    .line 413
    .line 414
    const v16, 0x408b851f    # 4.36f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3fb5c28f    # 1.42f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, 0x41b00000    # 22.0f

    .line 427
    .line 428
    const/high16 v18, 0x41400000    # 12.0f

    .line 429
    .line 430
    const v13, 0x41a66666    # 20.8f

    .line 431
    .line 432
    .line 433
    const v14, 0x418b47ae    # 17.41f

    .line 434
    .line 435
    .line 436
    const/high16 v15, 0x41b00000    # 22.0f

    .line 437
    .line 438
    const v16, 0x416d999a    # 14.85f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x41400000    # 12.0f

    .line 445
    .line 446
    const/high16 v18, 0x40000000    # 2.0f

    .line 447
    .line 448
    const/high16 v13, 0x41b00000    # 22.0f

    .line 449
    .line 450
    const v14, 0x40cf5c29    # 6.48f

    .line 451
    .line 452
    .line 453
    const v15, 0x418c28f6    # 17.52f

    .line 454
    .line 455
    .line 456
    const/high16 v16, 0x40000000    # 2.0f

    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v16, 0x3800

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/high16 v8, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/4 v7, 0x0

    .line 477
    const/high16 v9, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v12, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v14, 0x0

    .line 483
    const/4 v15, 0x0

    .line 484
    const-string v4, ""

    .line 485
    .line 486
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    sput-object v0, Landroidx/compose/material/icons/sharp/PodcastsKt;->_podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/PhotoFilterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _photoFilter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhotoFilter(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhotoFilterKt;->_photoFilter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhotoFilter"

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
    const v0, 0x412fd70a    # 10.99f

    .line 71
    .line 72
    .line 73
    const v2, 0x419828f6    # 19.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41900000    # 18.0f

    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x40800000    # -1.0f

    .line 85
    .line 86
    const/high16 v18, 0x3f800000    # 1.0f

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, 0x3f0ccccd    # 0.55f

    .line 90
    .line 91
    .line 92
    const v15, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    const/high16 v16, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41980000    # 19.0f

    .line 101
    .line 102
    const/high16 v2, 0x40c00000    # 6.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v18, -0x40800000    # -1.0f

    .line 108
    .line 109
    const v13, -0x40f33333    # -0.55f

    .line 110
    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const/high16 v15, -0x40800000    # -1.0f

    .line 114
    .line 115
    const v16, -0x4119999a    # -0.45f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40a00000    # 5.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, -0x40f33333    # -0.55f

    .line 130
    .line 131
    .line 132
    const v15, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    const/high16 v16, -0x40800000    # -1.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x40e00000    # 7.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v13, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/high16 v15, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const v16, -0x4119999a    # -0.45f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x4119999a    # -0.45f

    .line 158
    .line 159
    .line 160
    const/high16 v2, -0x40800000    # -1.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x40a0a3d7    # 5.02f

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x40400000    # 3.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, -0x40000000    # -2.0f

    .line 174
    .line 175
    const/high16 v18, 0x40000000    # 2.0f

    .line 176
    .line 177
    const v13, -0x40733333    # -1.1f

    .line 178
    .line 179
    .line 180
    const/high16 v15, -0x40000000    # -2.0f

    .line 181
    .line 182
    const v16, 0x3f666666    # 0.9f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41600000    # 14.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40000000    # 2.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, 0x3f8ccccd    # 1.1f

    .line 197
    .line 198
    .line 199
    const v15, 0x3f666666    # 0.9f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41a80000    # 21.0f

    .line 208
    .line 209
    const/high16 v2, 0x41980000    # 19.0f

    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v18, -0x40000000    # -2.0f

    .line 215
    .line 216
    const v13, 0x3f8ccccd    # 1.1f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/high16 v15, 0x40000000    # 2.0f

    .line 221
    .line 222
    const v16, -0x409c28f6    # -0.89f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3effd70a    # -8.01f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x40828f5c    # -0.99f

    .line 235
    .line 236
    .line 237
    const v18, -0x40828f5c    # -0.99f

    .line 238
    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, -0x40f33333    # -0.55f

    .line 242
    .line 243
    .line 244
    const v15, -0x411eb852    # -0.44f

    .line 245
    .line 246
    .line 247
    const v16, -0x40828f5c    # -0.99f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3ee147ae    # 0.44f

    .line 254
    .line 255
    .line 256
    const v2, 0x3f7d70a4    # 0.99f

    .line 257
    .line 258
    .line 259
    const v4, -0x40828f5c    # -0.99f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41540000    # 13.25f

    .line 269
    .line 270
    const/high16 v2, 0x412c0000    # 10.75f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x41475c29    # 12.46f

    .line 276
    .line 277
    .line 278
    const/high16 v2, 0x41100000    # 9.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x40970a3d    # -0.91f

    .line 284
    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const v13, -0x41c7ae14    # -0.18f

    .line 289
    .line 290
    .line 291
    const v14, -0x413851ec    # -0.39f

    .line 292
    .line 293
    .line 294
    const v15, -0x40c51eb8    # -0.73f

    .line 295
    .line 296
    .line 297
    const v16, -0x413851ec    # -0.39f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 304
    .line 305
    const v2, -0x40b5c28f    # -0.79f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, -0x401eb852    # -1.76f

    .line 312
    .line 313
    .line 314
    const v2, 0x3f4a3d71    # 0.79f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const v18, 0x3f68f5c3    # 0.91f

    .line 323
    .line 324
    .line 325
    const v13, -0x413851ec    # -0.39f

    .line 326
    .line 327
    .line 328
    const v14, 0x3e3851ec    # 0.18f

    .line 329
    .line 330
    .line 331
    const v15, -0x413851ec    # -0.39f

    .line 332
    .line 333
    .line 334
    const v16, 0x3f3ae148    # 0.73f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3fe147ae    # 1.76f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3f68f5c3    # 0.91f

    .line 352
    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const v13, 0x3e3851ec    # 0.18f

    .line 357
    .line 358
    .line 359
    const v14, 0x3ec7ae14    # 0.39f

    .line 360
    .line 361
    .line 362
    const v15, 0x3f3ae148    # 0.73f

    .line 363
    .line 364
    .line 365
    const v16, 0x3ec7ae14    # 0.39f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x40200000    # -1.75f

    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3fe147ae    # 1.76f

    .line 377
    .line 378
    .line 379
    const v2, -0x40b5c28f    # -0.79f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const v18, -0x40970a3d    # -0.91f

    .line 388
    .line 389
    .line 390
    const v13, 0x3ec7ae14    # 0.39f

    .line 391
    .line 392
    .line 393
    const v14, -0x41c7ae14    # -0.18f

    .line 394
    .line 395
    .line 396
    const v15, 0x3ec7ae14    # 0.39f

    .line 397
    .line 398
    .line 399
    const v16, -0x40c51eb8    # -0.73f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, -0x40b33333    # -0.8f

    .line 406
    .line 407
    .line 408
    const/high16 v2, -0x40200000    # -1.75f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x418f851f    # 17.94f

    .line 417
    .line 418
    .line 419
    const v2, 0x40c1eb85    # 6.06f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x40570a3d    # -1.32f

    .line 426
    .line 427
    .line 428
    const v2, -0x40e66666    # -0.6f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, -0x40cf5c29    # -0.69f

    .line 435
    .line 436
    .line 437
    const/16 v18, 0x0

    .line 438
    .line 439
    const v13, -0x41fae148    # -0.13f

    .line 440
    .line 441
    .line 442
    const v14, -0x416b851f    # -0.29f

    .line 443
    .line 444
    .line 445
    const v15, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    const v16, -0x416b851f    # -0.29f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x3fa8f5c3    # 1.32f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f19999a    # 0.6f

    .line 461
    .line 462
    .line 463
    const v2, -0x40570a3d    # -1.32f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/16 v17, 0x0

    .line 470
    .line 471
    const v18, 0x3f30a3d7    # 0.69f

    .line 472
    .line 473
    .line 474
    const v13, -0x416b851f    # -0.29f

    .line 475
    .line 476
    .line 477
    const v14, 0x3e051eb8    # 0.13f

    .line 478
    .line 479
    .line 480
    const v15, -0x416b851f    # -0.29f

    .line 481
    .line 482
    .line 483
    const v16, 0x3f0ccccd    # 0.55f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v2, 0x3fa8f5c3    # 1.32f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, 0x3f30a3d7    # 0.69f

    .line 499
    .line 500
    .line 501
    const/16 v18, 0x0

    .line 502
    .line 503
    const v13, 0x3e051eb8    # 0.13f

    .line 504
    .line 505
    .line 506
    const v14, 0x3e947ae1    # 0.29f

    .line 507
    .line 508
    .line 509
    const v15, 0x3f0ccccd    # 0.55f

    .line 510
    .line 511
    .line 512
    const v16, 0x3e947ae1    # 0.29f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v2, -0x40570a3d    # -1.32f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3fa8f5c3    # 1.32f

    .line 525
    .line 526
    .line 527
    const v2, -0x40e66666    # -0.6f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const v18, -0x40cf5c29    # -0.69f

    .line 536
    .line 537
    .line 538
    const v13, 0x3e947ae1    # 0.29f

    .line 539
    .line 540
    .line 541
    const v14, -0x41fae148    # -0.13f

    .line 542
    .line 543
    .line 544
    const v15, 0x3e947ae1    # 0.29f

    .line 545
    .line 546
    .line 547
    const v16, -0x40f33333    # -0.55f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x40570a3d    # -1.32f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v16, 0x3800

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v8, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v7, 0x0

    .line 575
    const/high16 v9, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v12, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const/4 v14, 0x0

    .line 581
    const/4 v15, 0x0

    .line 582
    const-string v4, ""

    .line 583
    .line 584
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    sput-object v0, Landroidx/compose/material/icons/rounded/PhotoFilterKt;->_photoFilter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    return-object v0
.end method

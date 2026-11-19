.class public final Landroidx/compose/material/icons/sharp/PedalBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPedalBike(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PedalBike"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const v2, 0x419170a4    # 18.18f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40800000    # 4.0f

    .line 79
    .line 80
    const/high16 v2, 0x41800000    # 16.0f

    .line 81
    .line 82
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, -0x3f800000    # -4.0f

    .line 86
    .line 87
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x40000000    # 2.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x40266666    # 2.6f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3fbae148    # 1.46f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40800000    # 4.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x3f66147b    # -4.81f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x4147ae14    # -0.36f

    .line 116
    .line 117
    .line 118
    const/high16 v2, -0x40800000    # -1.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x41400000    # 12.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40e00000    # 7.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x3fe8f5c3    # 1.82f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x40a00000    # 5.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x411e6666    # 9.9f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x3f6b3333    # -4.65f

    .line 161
    .line 162
    .line 163
    const v18, -0x3f80a3d7    # -3.99f

    .line 164
    .line 165
    .line 166
    const v13, -0x411eb852    # -0.44f

    .line 167
    .line 168
    .line 169
    const v14, -0x3ff147ae    # -2.23f

    .line 170
    .line 171
    .line 172
    const v15, -0x3fec28f6    # -2.31f

    .line 173
    .line 174
    .line 175
    const v16, -0x3f87ae14    # -3.88f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/high16 v18, 0x41700000    # 15.0f

    .line 184
    .line 185
    const v13, 0x401ccccd    # 2.45f

    .line 186
    .line 187
    .line 188
    const v14, 0x411deb85    # 9.87f

    .line 189
    .line 190
    .line 191
    const/4 v15, 0x0

    .line 192
    const v16, 0x41433333    # 12.2f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x40a00000    # 5.0f

    .line 199
    .line 200
    const/high16 v18, 0x40a00000    # 5.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, 0x40333333    # 2.8f

    .line 204
    .line 205
    .line 206
    const v15, 0x400ccccd    # 2.2f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x40a00000    # 5.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x409ccccd    # 4.9f

    .line 215
    .line 216
    .line 217
    const/high16 v18, -0x3f800000    # -4.0f

    .line 218
    .line 219
    const v13, 0x401d70a4    # 2.46f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const v15, 0x408e6666    # 4.45f

    .line 224
    .line 225
    .line 226
    const v16, -0x4027ae14    # -1.69f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x40866666    # 4.2f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x4094cccd    # 4.65f

    .line 239
    .line 240
    .line 241
    const v18, 0x407f5c29    # 3.99f

    .line 242
    .line 243
    .line 244
    const v13, 0x3ee147ae    # 0.44f

    .line 245
    .line 246
    .line 247
    const v14, 0x400eb852    # 2.23f

    .line 248
    .line 249
    .line 250
    const v15, 0x4013d70a    # 2.31f

    .line 251
    .line 252
    .line 253
    const v16, 0x407851ec    # 3.88f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40a80000    # 5.25f

    .line 260
    .line 261
    const/high16 v18, -0x3f600000    # -5.0f

    .line 262
    .line 263
    const v13, 0x40333333    # 2.8f

    .line 264
    .line 265
    .line 266
    const v14, 0x3e051eb8    # 0.13f

    .line 267
    .line 268
    .line 269
    const/high16 v15, 0x40a80000    # 5.25f

    .line 270
    .line 271
    const v16, -0x3ff3d70a    # -2.19f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, -0x3f600000    # -5.0f

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, -0x3fcccccd    # -2.8f

    .line 281
    .line 282
    .line 283
    const v15, -0x3ff33333    # -2.2f

    .line 284
    .line 285
    .line 286
    const/high16 v16, -0x3f600000    # -5.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x419170a4    # 18.18f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40fa3d71    # 7.82f

    .line 301
    .line 302
    .line 303
    const/high16 v2, 0x41800000    # 16.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x3fcb851f    # -2.82f

    .line 309
    .line 310
    .line 311
    const/high16 v18, 0x40000000    # 2.0f

    .line 312
    .line 313
    const v13, -0x41333333    # -0.4f

    .line 314
    .line 315
    .line 316
    const v14, 0x3f95c28f    # 1.17f

    .line 317
    .line 318
    .line 319
    const v15, -0x404147ae    # -1.49f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x40000000    # 2.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 328
    .line 329
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 330
    .line 331
    const v13, -0x4028f5c3    # -1.68f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 336
    .line 337
    const v16, -0x40570a3d    # -1.32f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x3fa8f5c3    # 1.32f

    .line 344
    .line 345
    .line 346
    const/high16 v2, 0x40400000    # 3.0f

    .line 347
    .line 348
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x40347ae1    # 2.82f

    .line 354
    .line 355
    .line 356
    const/high16 v18, 0x40000000    # 2.0f

    .line 357
    .line 358
    const v13, 0x3faa3d71    # 1.33f

    .line 359
    .line 360
    .line 361
    const v15, 0x401ae148    # 2.42f

    .line 362
    .line 363
    .line 364
    const v16, 0x3f547ae1    # 0.83f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40a00000    # 5.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40fa3d71    # 7.82f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4161999a    # 14.1f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x41600000    # 14.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x404ccccd    # -1.4f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x40c51eb8    # -0.73f

    .line 404
    .line 405
    .line 406
    const/high16 v2, -0x40000000    # -2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x41700000    # 15.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x4161999a    # 14.1f

    .line 417
    .line 418
    .line 419
    const/high16 v18, 0x41600000    # 14.0f

    .line 420
    .line 421
    const v13, 0x4168f5c3    # 14.56f

    .line 422
    .line 423
    .line 424
    const v14, 0x414947ae    # 12.58f

    .line 425
    .line 426
    .line 427
    const v15, 0x4163d70a    # 14.24f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x41540000    # 13.25f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41980000    # 19.0f

    .line 439
    .line 440
    const/high16 v2, 0x41900000    # 18.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 446
    .line 447
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 448
    .line 449
    const v13, -0x4028f5c3    # -1.68f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 454
    .line 455
    const v16, -0x40570a3d    # -1.32f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, 0x3f866666    # 1.05f

    .line 462
    .line 463
    .line 464
    const v18, -0x3fee147b    # -2.28f

    .line 465
    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const v14, -0x4091eb85    # -0.93f

    .line 469
    .line 470
    .line 471
    const v15, 0x3ed1eb85    # 0.41f

    .line 472
    .line 473
    .line 474
    const v16, -0x40228f5c    # -1.73f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x3f75c28f    # 0.96f

    .line 481
    .line 482
    .line 483
    const v2, 0x4028f5c3    # 2.64f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x3ff0a3d7    # 1.88f

    .line 490
    .line 491
    .line 492
    const v2, -0x40d1eb85    # -0.68f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x4087ae14    # -0.97f

    .line 499
    .line 500
    .line 501
    const v2, -0x3fd51eb8    # -2.67f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x3db851ec    # 0.09f

    .line 508
    .line 509
    .line 510
    const v18, -0x43dc28f6    # -0.01f

    .line 511
    .line 512
    .line 513
    const v13, 0x3cf5c28f    # 0.03f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const v15, 0x3d75c28f    # 0.06f

    .line 518
    .line 519
    .line 520
    const v16, -0x43dc28f6    # -0.01f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x40400000    # 3.0f

    .line 527
    .line 528
    const/high16 v18, 0x40400000    # 3.0f

    .line 529
    .line 530
    const v13, 0x3fd70a3d    # 1.68f

    .line 531
    .line 532
    .line 533
    const/high16 v15, 0x40400000    # 3.0f

    .line 534
    .line 535
    const v16, 0x3fa8f5c3    # 1.32f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x41a570a4    # 20.68f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x41980000    # 19.0f

    .line 545
    .line 546
    const/high16 v4, 0x41900000    # 18.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    const/16 v16, 0x3800

    .line 559
    .line 560
    const/16 v17, 0x0

    .line 561
    .line 562
    const/high16 v6, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/high16 v8, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/4 v7, 0x0

    .line 567
    const/high16 v9, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/high16 v12, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v13, 0x0

    .line 572
    const/4 v15, 0x0

    .line 573
    const-string v4, ""

    .line 574
    .line 575
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    sput-object v0, Landroidx/compose/material/icons/sharp/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    return-object v0
.end method

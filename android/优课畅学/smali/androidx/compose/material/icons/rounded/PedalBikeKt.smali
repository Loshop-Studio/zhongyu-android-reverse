.class public final Landroidx/compose/material/icons/rounded/PedalBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPedalBike(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PedalBike"

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
    const v0, -0x40266666    # -1.7f

    .line 79
    .line 80
    .line 81
    const v2, -0x3f6a3d71    # -4.68f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x4169999a    # 14.6f

    .line 88
    .line 89
    .line 90
    const/high16 v18, 0x40800000    # 4.0f

    .line 91
    .line 92
    const v13, 0x4181851f    # 16.19f

    .line 93
    .line 94
    .line 95
    const v14, 0x4090f5c3    # 4.53f

    .line 96
    .line 97
    .line 98
    const v15, 0x41770a3d    # 15.44f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41500000    # 13.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x40800000    # -1.0f

    .line 112
    .line 113
    const/high16 v18, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v13, -0x40f33333    # -0.55f

    .line 116
    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    const/high16 v15, -0x40800000    # -1.0f

    .line 120
    .line 121
    const v16, 0x3ee66666    # 0.45f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3f0ccccd    # 0.55f

    .line 135
    .line 136
    .line 137
    const v15, 0x3ee66666    # 0.45f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x3fcccccd    # 1.6f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3fbae148    # 1.46f

    .line 152
    .line 153
    .line 154
    const/high16 v2, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, -0x3f66147b    # -4.81f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x4147ae14    # -0.36f

    .line 166
    .line 167
    .line 168
    const/high16 v2, -0x40800000    # -1.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3db851ec    # 0.09f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v18, -0x40800000    # -1.0f

    .line 180
    .line 181
    const v13, 0x3f0ccccd    # 0.55f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const/high16 v15, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const v16, -0x4119999a    # -0.45f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const v14, -0x40f33333    # -0.55f

    .line 201
    .line 202
    .line 203
    const v15, -0x4119999a    # -0.45f

    .line 204
    .line 205
    .line 206
    const/high16 v16, -0x40800000    # -1.0f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41000000    # 8.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x40e00000    # 7.0f

    .line 217
    .line 218
    const/high16 v18, 0x41000000    # 8.0f

    .line 219
    .line 220
    const v13, 0x40ee6666    # 7.45f

    .line 221
    .line 222
    .line 223
    const/high16 v14, 0x40e00000    # 7.0f

    .line 224
    .line 225
    const/high16 v15, 0x40e00000    # 7.0f

    .line 226
    .line 227
    const v16, 0x40ee6666    # 7.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/4 v0, 0x0

    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v18, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const v15, 0x3ee66666    # 0.45f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x3f400000    # 0.75f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x3fe8f5c3    # 1.82f

    .line 259
    .line 260
    .line 261
    const/high16 v2, 0x40a00000    # 5.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x411e6666    # 9.9f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x3f6b3333    # -4.65f

    .line 273
    .line 274
    .line 275
    const v18, -0x3f80a3d7    # -3.99f

    .line 276
    .line 277
    .line 278
    const v13, -0x411eb852    # -0.44f

    .line 279
    .line 280
    .line 281
    const v14, -0x3ff147ae    # -2.23f

    .line 282
    .line 283
    .line 284
    const v15, -0x3fec28f6    # -2.31f

    .line 285
    .line 286
    .line 287
    const v16, -0x3f87ae14    # -3.88f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const/high16 v18, 0x41700000    # 15.0f

    .line 296
    .line 297
    const v13, 0x401ccccd    # 2.45f

    .line 298
    .line 299
    .line 300
    const v14, 0x411deb85    # 9.87f

    .line 301
    .line 302
    .line 303
    const/4 v15, 0x0

    .line 304
    const v16, 0x41433333    # 12.2f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const/high16 v18, 0x40a00000    # 5.0f

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, 0x40333333    # 2.8f

    .line 316
    .line 317
    .line 318
    const v15, 0x400ccccd    # 2.2f

    .line 319
    .line 320
    .line 321
    const/high16 v16, 0x40a00000    # 5.0f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x409ccccd    # 4.9f

    .line 327
    .line 328
    .line 329
    const/high16 v18, -0x3f800000    # -4.0f

    .line 330
    .line 331
    const v13, 0x401d70a4    # 2.46f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const v15, 0x408e6666    # 4.45f

    .line 336
    .line 337
    .line 338
    const v16, -0x4027ae14    # -1.69f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x40866666    # 4.2f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x4094cccd    # 4.65f

    .line 351
    .line 352
    .line 353
    const v18, 0x407f5c29    # 3.99f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ee147ae    # 0.44f

    .line 357
    .line 358
    .line 359
    const v14, 0x400eb852    # 2.23f

    .line 360
    .line 361
    .line 362
    const v15, 0x4013d70a    # 2.31f

    .line 363
    .line 364
    .line 365
    const v16, 0x407851ec    # 3.88f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x40a80000    # 5.25f

    .line 372
    .line 373
    const/high16 v18, -0x3f600000    # -5.0f

    .line 374
    .line 375
    const v13, 0x40333333    # 2.8f

    .line 376
    .line 377
    .line 378
    const v14, 0x3e051eb8    # 0.13f

    .line 379
    .line 380
    .line 381
    const/high16 v15, 0x40a80000    # 5.25f

    .line 382
    .line 383
    const v16, -0x3ff3d70a    # -2.19f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x3f600000    # -5.0f

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, -0x3fcccccd    # -2.8f

    .line 393
    .line 394
    .line 395
    const v15, -0x3ff33333    # -2.2f

    .line 396
    .line 397
    .line 398
    const/high16 v16, -0x3f600000    # -5.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x419170a4    # 18.18f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x41800000    # 16.0f

    .line 413
    .line 414
    const v2, 0x40fa3d71    # 7.82f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x3fbeb852    # -3.02f

    .line 421
    .line 422
    .line 423
    const v18, 0x3ffeb852    # 1.99f

    .line 424
    .line 425
    .line 426
    const v13, -0x4128f5c3    # -0.42f

    .line 427
    .line 428
    .line 429
    const v14, 0x3f9d70a4    # 1.23f

    .line 430
    .line 431
    .line 432
    const v15, -0x40333333    # -1.6f

    .line 433
    .line 434
    .line 435
    const v16, 0x40051eb8    # 2.08f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x40000000    # 2.0f

    .line 442
    .line 443
    const v18, 0x41723d71    # 15.14f

    .line 444
    .line 445
    .line 446
    const v13, 0x4053d70a    # 3.31f

    .line 447
    .line 448
    .line 449
    const v14, 0x418f3333    # 17.9f

    .line 450
    .line 451
    .line 452
    const v15, 0x40047ae1    # 2.07f

    .line 453
    .line 454
    .line 455
    const v16, 0x41851eb8    # 16.64f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x40a00000    # 5.0f

    .line 462
    .line 463
    const/high16 v18, 0x41400000    # 12.0f

    .line 464
    .line 465
    const v13, 0x3ff70a3d    # 1.93f

    .line 466
    .line 467
    .line 468
    const v14, 0x41563d71    # 13.39f

    .line 469
    .line 470
    .line 471
    const v15, 0x405147ae    # 3.27f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x41400000    # 12.0f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, 0x40347ae1    # 2.82f

    .line 480
    .line 481
    .line 482
    const/high16 v18, 0x40000000    # 2.0f

    .line 483
    .line 484
    const v13, 0x3faa3d71    # 1.33f

    .line 485
    .line 486
    .line 487
    const/4 v14, 0x0

    .line 488
    const v15, 0x401ae148    # 2.42f

    .line 489
    .line 490
    .line 491
    const v16, 0x3f547ae1    # 0.83f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x40c00000    # 6.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, -0x40800000    # -1.0f

    .line 503
    .line 504
    const/high16 v18, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const v13, -0x40f33333    # -0.55f

    .line 507
    .line 508
    .line 509
    const/high16 v15, -0x40800000    # -1.0f

    .line 510
    .line 511
    const v16, 0x3ee66666    # 0.45f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/4 v0, 0x0

    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const v14, 0x3f0ccccd    # 0.55f

    .line 525
    .line 526
    .line 527
    const v15, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    const/high16 v16, 0x3f800000    # 1.0f

    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x40fa3d71    # 7.82f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x4161999a    # 14.1f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x41600000    # 14.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, -0x404ccccd    # -1.4f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, -0x40c51eb8    # -0.73f

    .line 559
    .line 560
    .line 561
    const/high16 v2, -0x40000000    # -2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x41700000    # 15.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, 0x4161999a    # 14.1f

    .line 572
    .line 573
    .line 574
    const/high16 v18, 0x41600000    # 14.0f

    .line 575
    .line 576
    const v13, 0x4168f5c3    # 14.56f

    .line 577
    .line 578
    .line 579
    const v14, 0x414947ae    # 12.58f

    .line 580
    .line 581
    .line 582
    const v15, 0x4163d70a    # 14.24f

    .line 583
    .line 584
    .line 585
    const/high16 v16, 0x41540000    # 13.25f

    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x41970a3d    # 18.88f

    .line 594
    .line 595
    .line 596
    const/high16 v2, 0x41900000    # 18.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, -0x3fc7ae14    # -2.88f

    .line 602
    .line 603
    .line 604
    const v18, -0x3fc51eb8    # -2.92f

    .line 605
    .line 606
    .line 607
    const v13, -0x403ae148    # -1.54f

    .line 608
    .line 609
    .line 610
    const v14, -0x428a3d71    # -0.06f

    .line 611
    .line 612
    .line 613
    const v15, -0x3fca3d71    # -2.84f

    .line 614
    .line 615
    .line 616
    const v16, -0x4050a3d7    # -1.37f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x3f866666    # 1.05f

    .line 623
    .line 624
    .line 625
    const v18, -0x3fe8f5c3    # -2.36f

    .line 626
    .line 627
    .line 628
    const v13, -0x435c28f6    # -0.02f

    .line 629
    .line 630
    .line 631
    const v14, -0x408a3d71    # -0.96f

    .line 632
    .line 633
    .line 634
    const v15, 0x3ec7ae14    # 0.39f

    .line 635
    .line 636
    .line 637
    const v16, -0x4019999a    # -1.8f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3f1eb852    # 0.62f

    .line 644
    .line 645
    .line 646
    const v2, 0x3fd9999a    # 1.7f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, 0x3fa3d70a    # 1.28f

    .line 653
    .line 654
    .line 655
    const v18, 0x3f19999a    # 0.6f

    .line 656
    .line 657
    .line 658
    const v13, 0x3e428f5c    # 0.19f

    .line 659
    .line 660
    .line 661
    const v14, 0x3f051eb8    # 0.52f

    .line 662
    .line 663
    .line 664
    const v15, 0x3f428f5c    # 0.76f

    .line 665
    .line 666
    .line 667
    const v16, 0x3f4a3d71    # 0.79f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/4 v0, 0x0

    .line 674
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, 0x3f19999a    # 0.6f

    .line 678
    .line 679
    .line 680
    const v18, -0x405c28f6    # -1.28f

    .line 681
    .line 682
    .line 683
    const v13, 0x3f051eb8    # 0.52f

    .line 684
    .line 685
    .line 686
    const v14, -0x41bd70a4    # -0.19f

    .line 687
    .line 688
    .line 689
    const v15, 0x3f4a3d71    # 0.79f

    .line 690
    .line 691
    .line 692
    const v16, -0x40bd70a4    # -0.76f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, -0x40deb852    # -0.63f

    .line 699
    .line 700
    .line 701
    const v2, -0x40228f5c    # -1.73f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v17, 0x3c23d70a    # 0.01f

    .line 708
    .line 709
    .line 710
    const v18, -0x43dc28f6    # -0.01f

    .line 711
    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    const/4 v14, 0x0

    .line 715
    const/4 v15, 0x0

    .line 716
    const/16 v16, 0x0

    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, 0x40451eb8    # 3.08f

    .line 722
    .line 723
    .line 724
    const/high16 v18, 0x40400000    # 3.0f

    .line 725
    .line 726
    const v13, 0x3fdc28f6    # 1.72f

    .line 727
    .line 728
    .line 729
    const v14, -0x42dc28f6    # -0.04f

    .line 730
    .line 731
    .line 732
    const v15, 0x40451eb8    # 3.08f

    .line 733
    .line 734
    .line 735
    const v16, 0x3fa51eb8    # 1.29f

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v17, 0x41970a3d    # 18.88f

    .line 742
    .line 743
    .line 744
    const/high16 v18, 0x41900000    # 18.0f

    .line 745
    .line 746
    const/high16 v13, 0x41b00000    # 22.0f

    .line 747
    .line 748
    const v14, 0x4185c28f    # 16.72f

    .line 749
    .line 750
    .line 751
    const v15, 0x41a4f5c3    # 20.62f

    .line 752
    .line 753
    .line 754
    const v16, 0x41907ae1    # 18.06f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    const/16 v16, 0x3800

    .line 768
    .line 769
    const/16 v17, 0x0

    .line 770
    .line 771
    const/high16 v6, 0x3f800000    # 1.0f

    .line 772
    .line 773
    const/high16 v8, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/4 v7, 0x0

    .line 776
    const/high16 v9, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/high16 v12, 0x3f800000    # 1.0f

    .line 779
    .line 780
    const/4 v13, 0x0

    .line 781
    const/4 v14, 0x0

    .line 782
    const/4 v15, 0x0

    .line 783
    const-string v4, ""

    .line 784
    .line 785
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    sput-object v0, Landroidx/compose/material/icons/rounded/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 794
    .line 795
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    return-object v0
.end method

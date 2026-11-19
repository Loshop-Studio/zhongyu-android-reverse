.class public final Landroidx/compose/material/icons/rounded/ElectricBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricBike(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ElectricBike"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x40ae147b    # -0.82f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x40266666    # -1.7f

    .line 84
    .line 85
    .line 86
    const v6, -0x3f6a3d71    # -4.68f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v25, 0x4169999a    # 14.6f

    .line 93
    .line 94
    .line 95
    const/high16 v26, 0x3f800000    # 1.0f

    .line 96
    .line 97
    const v21, 0x4181851f    # 16.19f

    .line 98
    .line 99
    .line 100
    const v22, 0x3fc3d70a    # 1.53f

    .line 101
    .line 102
    .line 103
    const v23, 0x41770a3d    # 15.44f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x3f800000    # 1.0f

    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41500000    # 13.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, -0x40800000    # -1.0f

    .line 119
    .line 120
    const v21, -0x40f33333    # -0.55f

    .line 121
    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/high16 v23, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v24, 0x3ee66666    # 0.45f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/16 v21, 0x0

    .line 136
    .line 137
    const v22, 0x3f0ccccd    # 0.55f

    .line 138
    .line 139
    .line 140
    const v23, 0x3ee66666    # 0.45f

    .line 141
    .line 142
    .line 143
    const/high16 v24, 0x3f800000    # 1.0f

    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x3fcccccd    # 1.6f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3fbae148    # 1.46f

    .line 155
    .line 156
    .line 157
    const/high16 v6, 0x40800000    # 4.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x3f66147b    # -4.81f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x4147ae14    # -0.36f

    .line 169
    .line 170
    .line 171
    const/high16 v6, -0x40800000    # -1.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x3db851ec    # 0.09f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v26, -0x40800000    # -1.0f

    .line 183
    .line 184
    const v21, 0x3f0ccccd    # 0.55f

    .line 185
    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/high16 v23, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v24, -0x4119999a    # -0.45f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const v22, -0x40f33333    # -0.55f

    .line 202
    .line 203
    .line 204
    const v23, -0x4119999a    # -0.45f

    .line 205
    .line 206
    .line 207
    const/high16 v24, -0x40800000    # -1.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x41000000    # 8.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x40e00000    # 7.0f

    .line 218
    .line 219
    const/high16 v26, 0x40a00000    # 5.0f

    .line 220
    .line 221
    const v21, 0x40ee6666    # 7.45f

    .line 222
    .line 223
    .line 224
    const/high16 v22, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v23, 0x40e00000    # 7.0f

    .line 227
    .line 228
    const v24, 0x408e6666    # 4.45f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v25, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v26, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const v22, 0x3f0ccccd    # 0.55f

    .line 241
    .line 242
    .line 243
    const v23, 0x3ee66666    # 0.45f

    .line 244
    .line 245
    .line 246
    const/high16 v24, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x3f400000    # 0.75f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x40a00000    # 5.0f

    .line 257
    .line 258
    const v6, 0x3fe8f5c3    # 1.82f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x411e6666    # 9.9f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, 0x40a80000    # 5.25f

    .line 271
    .line 272
    const v26, 0x40e051ec    # 7.01f

    .line 273
    .line 274
    .line 275
    const v21, 0x41175c29    # 9.46f

    .line 276
    .line 277
    .line 278
    const v22, 0x410c51ec    # 8.77f

    .line 279
    .line 280
    .line 281
    const v23, 0x40f2e148    # 7.59f

    .line 282
    .line 283
    .line 284
    const v24, 0x40e3d70a    # 7.12f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/16 v25, 0x0

    .line 291
    .line 292
    const/high16 v26, 0x41400000    # 12.0f

    .line 293
    .line 294
    const v21, 0x401ccccd    # 2.45f

    .line 295
    .line 296
    .line 297
    const v22, 0x40dbd70a    # 6.87f

    .line 298
    .line 299
    .line 300
    const/16 v23, 0x0

    .line 301
    .line 302
    const v24, 0x41133333    # 9.2f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x40a00000    # 5.0f

    .line 309
    .line 310
    const/high16 v26, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const/16 v21, 0x0

    .line 313
    .line 314
    const v22, 0x40333333    # 2.8f

    .line 315
    .line 316
    .line 317
    const v23, 0x400ccccd    # 2.2f

    .line 318
    .line 319
    .line 320
    const/high16 v24, 0x40a00000    # 5.0f

    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, 0x409ccccd    # 4.9f

    .line 326
    .line 327
    .line 328
    const/high16 v26, -0x3f800000    # -4.0f

    .line 329
    .line 330
    const v21, 0x401d70a4    # 2.46f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const v23, 0x408e6666    # 4.45f

    .line 336
    .line 337
    .line 338
    const v24, -0x4027ae14    # -1.69f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x40866666    # 4.2f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x4094cccd    # 4.65f

    .line 351
    .line 352
    .line 353
    const v26, 0x407f5c29    # 3.99f

    .line 354
    .line 355
    .line 356
    const v21, 0x3ee147ae    # 0.44f

    .line 357
    .line 358
    .line 359
    const v22, 0x400eb852    # 2.23f

    .line 360
    .line 361
    .line 362
    const v23, 0x4013d70a    # 2.31f

    .line 363
    .line 364
    .line 365
    const v24, 0x407851ec    # 3.88f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v25, 0x40a80000    # 5.25f

    .line 372
    .line 373
    const/high16 v26, -0x3f600000    # -5.0f

    .line 374
    .line 375
    const v21, 0x40333333    # 2.8f

    .line 376
    .line 377
    .line 378
    const v22, 0x3e051eb8    # 0.13f

    .line 379
    .line 380
    .line 381
    const/high16 v23, 0x40a80000    # 5.25f

    .line 382
    .line 383
    const v24, -0x3ff3d70a    # -2.19f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v25, 0x41980000    # 19.0f

    .line 390
    .line 391
    const/high16 v26, 0x40e00000    # 7.0f

    .line 392
    .line 393
    const/high16 v21, 0x41c00000    # 24.0f

    .line 394
    .line 395
    const v22, 0x41133333    # 9.2f

    .line 396
    .line 397
    .line 398
    const v23, 0x41ae6666    # 21.8f

    .line 399
    .line 400
    .line 401
    const/high16 v24, 0x40e00000    # 7.0f

    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v4, 0x41500000    # 13.0f

    .line 410
    .line 411
    const/high16 v6, 0x40c00000    # 6.0f

    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v4, 0x3fe8f5c3    # 1.82f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v25, -0x3fbeb852    # -3.02f

    .line 423
    .line 424
    .line 425
    const v26, 0x3ffeb852    # 1.99f

    .line 426
    .line 427
    .line 428
    const v21, -0x4128f5c3    # -0.42f

    .line 429
    .line 430
    .line 431
    const v22, 0x3f9d70a4    # 1.23f

    .line 432
    .line 433
    .line 434
    const v23, -0x40333333    # -1.6f

    .line 435
    .line 436
    .line 437
    const v24, 0x40051eb8    # 2.08f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v25, 0x40000000    # 2.0f

    .line 444
    .line 445
    const v26, 0x41423d71    # 12.14f

    .line 446
    .line 447
    .line 448
    const v21, 0x4053d70a    # 3.31f

    .line 449
    .line 450
    .line 451
    const v22, 0x416e6666    # 14.9f

    .line 452
    .line 453
    .line 454
    const v23, 0x40047ae1    # 2.07f

    .line 455
    .line 456
    .line 457
    const v24, 0x415a3d71    # 13.64f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v25, 0x40a00000    # 5.0f

    .line 464
    .line 465
    const/high16 v26, 0x41100000    # 9.0f

    .line 466
    .line 467
    const v21, 0x3ff70a3d    # 1.93f

    .line 468
    .line 469
    .line 470
    const v22, 0x41263d71    # 10.39f

    .line 471
    .line 472
    .line 473
    const v23, 0x405147ae    # 3.27f

    .line 474
    .line 475
    .line 476
    const/high16 v24, 0x41100000    # 9.0f

    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v25, 0x40347ae1    # 2.82f

    .line 482
    .line 483
    .line 484
    const/high16 v26, 0x40000000    # 2.0f

    .line 485
    .line 486
    const v21, 0x3faa3d71    # 1.33f

    .line 487
    .line 488
    .line 489
    const/16 v22, 0x0

    .line 490
    .line 491
    const v23, 0x401ae148    # 2.42f

    .line 492
    .line 493
    .line 494
    const v24, 0x3f547ae1    # 0.83f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x40c00000    # 6.0f

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v25, -0x40800000    # -1.0f

    .line 506
    .line 507
    const/high16 v26, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const v21, -0x40f33333    # -0.55f

    .line 510
    .line 511
    .line 512
    const/high16 v23, -0x40800000    # -1.0f

    .line 513
    .line 514
    const v24, 0x3ee66666    # 0.45f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v25, 0x40c00000    # 6.0f

    .line 521
    .line 522
    const/high16 v26, 0x41500000    # 13.0f

    .line 523
    .line 524
    const/high16 v21, 0x40a00000    # 5.0f

    .line 525
    .line 526
    const v22, 0x4148cccd    # 12.55f

    .line 527
    .line 528
    .line 529
    const v23, 0x40ae6666    # 5.45f

    .line 530
    .line 531
    .line 532
    const/high16 v24, 0x41500000    # 13.0f

    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x4161999a    # 14.1f

    .line 541
    .line 542
    .line 543
    const/high16 v6, 0x41300000    # 11.0f

    .line 544
    .line 545
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v4, -0x404ccccd    # -1.4f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v4, -0x40c51eb8    # -0.73f

    .line 555
    .line 556
    .line 557
    const/high16 v6, -0x40000000    # -2.0f

    .line 558
    .line 559
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x41700000    # 15.0f

    .line 563
    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v25, 0x4161999a    # 14.1f

    .line 568
    .line 569
    .line 570
    const/high16 v26, 0x41300000    # 11.0f

    .line 571
    .line 572
    const v21, 0x4168f5c3    # 14.56f

    .line 573
    .line 574
    .line 575
    const v22, 0x411947ae    # 9.58f

    .line 576
    .line 577
    .line 578
    const v23, 0x4163d70a    # 14.24f

    .line 579
    .line 580
    .line 581
    const/high16 v24, 0x41240000    # 10.25f

    .line 582
    .line 583
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v4, 0x41970a3d    # 18.88f

    .line 590
    .line 591
    .line 592
    const/high16 v6, 0x41700000    # 15.0f

    .line 593
    .line 594
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v25, -0x3fc7ae14    # -2.88f

    .line 598
    .line 599
    .line 600
    const v26, -0x3fc51eb8    # -2.92f

    .line 601
    .line 602
    .line 603
    const v21, -0x403ae148    # -1.54f

    .line 604
    .line 605
    .line 606
    const v22, -0x428a3d71    # -0.06f

    .line 607
    .line 608
    .line 609
    const v23, -0x3fca3d71    # -2.84f

    .line 610
    .line 611
    .line 612
    const v24, -0x4050a3d7    # -1.37f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v25, 0x3f866666    # 1.05f

    .line 619
    .line 620
    .line 621
    const v26, -0x3fe8f5c3    # -2.36f

    .line 622
    .line 623
    .line 624
    const v21, -0x435c28f6    # -0.02f

    .line 625
    .line 626
    .line 627
    const v22, -0x408a3d71    # -0.96f

    .line 628
    .line 629
    .line 630
    const v23, 0x3ec7ae14    # 0.39f

    .line 631
    .line 632
    .line 633
    const v24, -0x4019999a    # -1.8f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, 0x3f1eb852    # 0.62f

    .line 640
    .line 641
    .line 642
    const v6, 0x3fd9999a    # 1.7f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v25, 0x3fa3d70a    # 1.28f

    .line 649
    .line 650
    .line 651
    const v26, 0x3f19999a    # 0.6f

    .line 652
    .line 653
    .line 654
    const v21, 0x3e428f5c    # 0.19f

    .line 655
    .line 656
    .line 657
    const v22, 0x3f051eb8    # 0.52f

    .line 658
    .line 659
    .line 660
    const v23, 0x3f428f5c    # 0.76f

    .line 661
    .line 662
    .line 663
    const v24, 0x3f4a3d71    # 0.79f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v25, 0x3f19999a    # 0.6f

    .line 670
    .line 671
    .line 672
    const v26, -0x405c28f6    # -1.28f

    .line 673
    .line 674
    .line 675
    const v21, 0x3f051eb8    # 0.52f

    .line 676
    .line 677
    .line 678
    const v22, -0x41bd70a4    # -0.19f

    .line 679
    .line 680
    .line 681
    const v23, 0x3f4a3d71    # 0.79f

    .line 682
    .line 683
    .line 684
    const v24, -0x40bd70a4    # -0.76f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v4, -0x40deb852    # -0.63f

    .line 691
    .line 692
    .line 693
    const v6, -0x40228f5c    # -1.73f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v25, 0x3c23d70a    # 0.01f

    .line 700
    .line 701
    .line 702
    const v26, -0x43dc28f6    # -0.01f

    .line 703
    .line 704
    .line 705
    const/16 v21, 0x0

    .line 706
    .line 707
    const/16 v22, 0x0

    .line 708
    .line 709
    const/16 v23, 0x0

    .line 710
    .line 711
    const/16 v24, 0x0

    .line 712
    .line 713
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v25, 0x41b00000    # 22.0f

    .line 717
    .line 718
    const/high16 v26, 0x41400000    # 12.0f

    .line 719
    .line 720
    const v21, 0x41a51eb8    # 20.64f

    .line 721
    .line 722
    .line 723
    const v22, 0x410f5c29    # 8.96f

    .line 724
    .line 725
    .line 726
    const/high16 v23, 0x41b00000    # 22.0f

    .line 727
    .line 728
    const v24, 0x4124a3d7    # 10.29f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v25, 0x41970a3d    # 18.88f

    .line 735
    .line 736
    .line 737
    const/high16 v26, 0x41700000    # 15.0f

    .line 738
    .line 739
    const/high16 v21, 0x41b00000    # 22.0f

    .line 740
    .line 741
    const v22, 0x415b851f    # 13.72f

    .line 742
    .line 743
    .line 744
    const v23, 0x41a4f5c3    # 20.62f

    .line 745
    .line 746
    .line 747
    const v24, 0x4170f5c3    # 15.06f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    const/16 v16, 0x3800

    .line 761
    .line 762
    const/16 v17, 0x0

    .line 763
    .line 764
    const/high16 v6, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/high16 v8, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/4 v7, 0x0

    .line 769
    const/high16 v9, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/high16 v12, 0x3f800000    # 1.0f

    .line 772
    .line 773
    const/4 v13, 0x0

    .line 774
    const/4 v14, 0x0

    .line 775
    const/4 v15, 0x0

    .line 776
    const-string v4, ""

    .line 777
    .line 778
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 779
    .line 780
    .line 781
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 786
    .line 787
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 788
    .line 789
    .line 790
    move-result-wide v6

    .line 791
    const/4 v0, 0x0

    .line 792
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 796
    .line 797
    .line 798
    move-result v10

    .line 799
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 800
    .line 801
    .line 802
    move-result v11

    .line 803
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 806
    .line 807
    .line 808
    const/high16 v2, 0x41a00000    # 20.0f

    .line 809
    .line 810
    const/high16 v4, 0x41300000    # 11.0f

    .line 811
    .line 812
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v2, -0x3f800000    # -4.0f

    .line 816
    .line 817
    const/4 v4, 0x0

    .line 818
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v2, 0x40400000    # 3.0f

    .line 822
    .line 823
    const/high16 v4, 0x40c00000    # 6.0f

    .line 824
    .line 825
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v2, -0x40000000    # -2.0f

    .line 829
    .line 830
    const/4 v4, 0x0

    .line 831
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v2, 0x40800000    # 4.0f

    .line 835
    .line 836
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v2, -0x3f400000    # -6.0f

    .line 840
    .line 841
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 842
    .line 843
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v7, 0x0

    .line 856
    const-string v4, ""

    .line 857
    .line 858
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    sput-object v0, Landroidx/compose/material/icons/rounded/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 867
    .line 868
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/sharp/ElectricBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricBike(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ElectricBike"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 84
    .line 85
    const/high16 v6, 0x3f800000    # 1.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, -0x3f800000    # -4.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x40000000    # 2.0f

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x40266666    # 2.6f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x3fbae148    # 1.46f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, -0x3f66147b    # -4.81f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x4147ae14    # -0.36f

    .line 121
    .line 122
    .line 123
    const/high16 v6, -0x40800000    # -1.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41400000    # 12.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40e00000    # 7.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x3fe8f5c3    # 1.82f

    .line 154
    .line 155
    .line 156
    const/high16 v6, 0x40a00000    # 5.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x411e6666    # 9.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x40a80000    # 5.25f

    .line 168
    .line 169
    const v26, 0x40e051ec    # 7.01f

    .line 170
    .line 171
    .line 172
    const v21, 0x41175c29    # 9.46f

    .line 173
    .line 174
    .line 175
    const v22, 0x410c51ec    # 8.77f

    .line 176
    .line 177
    .line 178
    const v23, 0x40f2e148    # 7.59f

    .line 179
    .line 180
    .line 181
    const v24, 0x40e3d70a    # 7.12f

    .line 182
    .line 183
    .line 184
    move-object/from16 v20, v2

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v25, 0x0

    .line 190
    .line 191
    const/high16 v26, 0x41400000    # 12.0f

    .line 192
    .line 193
    const v21, 0x401ccccd    # 2.45f

    .line 194
    .line 195
    .line 196
    const v22, 0x40dbd70a    # 6.87f

    .line 197
    .line 198
    .line 199
    const/16 v23, 0x0

    .line 200
    .line 201
    const v24, 0x41133333    # 9.2f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v25, 0x40a00000    # 5.0f

    .line 208
    .line 209
    const/high16 v26, 0x40a00000    # 5.0f

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const v22, 0x40333333    # 2.8f

    .line 214
    .line 215
    .line 216
    const v23, 0x400ccccd    # 2.2f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x40a00000    # 5.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x409ccccd    # 4.9f

    .line 225
    .line 226
    .line 227
    const/high16 v26, -0x3f800000    # -4.0f

    .line 228
    .line 229
    const v21, 0x401d70a4    # 2.46f

    .line 230
    .line 231
    .line 232
    const/16 v22, 0x0

    .line 233
    .line 234
    const v23, 0x408e6666    # 4.45f

    .line 235
    .line 236
    .line 237
    const v24, -0x4027ae14    # -1.69f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x40866666    # 4.2f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v25, 0x4094cccd    # 4.65f

    .line 250
    .line 251
    .line 252
    const v26, 0x407f5c29    # 3.99f

    .line 253
    .line 254
    .line 255
    const v21, 0x3ee147ae    # 0.44f

    .line 256
    .line 257
    .line 258
    const v22, 0x400eb852    # 2.23f

    .line 259
    .line 260
    .line 261
    const v23, 0x4013d70a    # 2.31f

    .line 262
    .line 263
    .line 264
    const v24, 0x407851ec    # 3.88f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, 0x40a80000    # 5.25f

    .line 271
    .line 272
    const/high16 v26, -0x3f600000    # -5.0f

    .line 273
    .line 274
    const v21, 0x40333333    # 2.8f

    .line 275
    .line 276
    .line 277
    const v22, 0x3e051eb8    # 0.13f

    .line 278
    .line 279
    .line 280
    const/high16 v23, 0x40a80000    # 5.25f

    .line 281
    .line 282
    const v24, -0x3ff3d70a    # -2.19f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v25, 0x41980000    # 19.0f

    .line 289
    .line 290
    const/high16 v26, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/high16 v21, 0x41c00000    # 24.0f

    .line 293
    .line 294
    const v22, 0x41133333    # 9.2f

    .line 295
    .line 296
    .line 297
    const v23, 0x41ae6666    # 21.8f

    .line 298
    .line 299
    .line 300
    const/high16 v24, 0x40e00000    # 7.0f

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x41500000    # 13.0f

    .line 309
    .line 310
    const v6, 0x40fa3d71    # 7.82f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, -0x3fcb851f    # -2.82f

    .line 317
    .line 318
    .line 319
    const/high16 v26, 0x40000000    # 2.0f

    .line 320
    .line 321
    const v21, -0x41333333    # -0.4f

    .line 322
    .line 323
    .line 324
    const v22, 0x3f95c28f    # 1.17f

    .line 325
    .line 326
    .line 327
    const v23, -0x404147ae    # -1.49f

    .line 328
    .line 329
    .line 330
    const/high16 v24, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 336
    .line 337
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 338
    .line 339
    const v21, -0x4028f5c3    # -1.68f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 345
    .line 346
    const v24, -0x40570a3d    # -1.32f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x3fa8f5c3    # 1.32f

    .line 353
    .line 354
    .line 355
    const/high16 v6, 0x40400000    # 3.0f

    .line 356
    .line 357
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, 0x40347ae1    # 2.82f

    .line 363
    .line 364
    .line 365
    const/high16 v26, 0x40000000    # 2.0f

    .line 366
    .line 367
    const v21, 0x3faa3d71    # 1.33f

    .line 368
    .line 369
    .line 370
    const v23, 0x401ae148    # 2.42f

    .line 371
    .line 372
    .line 373
    const v24, 0x3f547ae1    # 0.83f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x40a00000    # 5.0f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x40000000    # 2.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, 0x40fa3d71    # 7.82f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x4161999a    # 14.1f

    .line 399
    .line 400
    .line 401
    const/high16 v6, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, -0x404ccccd    # -1.4f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v4, -0x40c51eb8    # -0.73f

    .line 413
    .line 414
    .line 415
    const/high16 v6, -0x40000000    # -2.0f

    .line 416
    .line 417
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v4, 0x41700000    # 15.0f

    .line 421
    .line 422
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v25, 0x4161999a    # 14.1f

    .line 426
    .line 427
    .line 428
    const/high16 v26, 0x41300000    # 11.0f

    .line 429
    .line 430
    const v21, 0x4168f5c3    # 14.56f

    .line 431
    .line 432
    .line 433
    const v22, 0x411947ae    # 9.58f

    .line 434
    .line 435
    .line 436
    const v23, 0x4163d70a    # 14.24f

    .line 437
    .line 438
    .line 439
    const/high16 v24, 0x41240000    # 10.25f

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x41980000    # 19.0f

    .line 448
    .line 449
    const/high16 v6, 0x41700000    # 15.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 455
    .line 456
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 457
    .line 458
    const v21, -0x4028f5c3    # -1.68f

    .line 459
    .line 460
    .line 461
    const/16 v22, 0x0

    .line 462
    .line 463
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 464
    .line 465
    const v24, -0x40570a3d    # -1.32f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v25, 0x3f866666    # 1.05f

    .line 472
    .line 473
    .line 474
    const v26, -0x3fee147b    # -2.28f

    .line 475
    .line 476
    .line 477
    const/16 v21, 0x0

    .line 478
    .line 479
    const v22, -0x4091eb85    # -0.93f

    .line 480
    .line 481
    .line 482
    const v23, 0x3ed1eb85    # 0.41f

    .line 483
    .line 484
    .line 485
    const v24, -0x40228f5c    # -1.73f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v4, 0x3f75c28f    # 0.96f

    .line 492
    .line 493
    .line 494
    const v6, 0x4028f5c3    # 2.64f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v4, 0x3ff0a3d7    # 1.88f

    .line 501
    .line 502
    .line 503
    const v6, -0x40d1eb85    # -0.68f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v4, -0x4087ae14    # -0.97f

    .line 510
    .line 511
    .line 512
    const v6, -0x3fd51eb8    # -2.67f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v25, 0x41980000    # 19.0f

    .line 519
    .line 520
    const/high16 v26, 0x41100000    # 9.0f

    .line 521
    .line 522
    const v21, 0x4197851f    # 18.94f

    .line 523
    .line 524
    .line 525
    const v22, 0x411028f6    # 9.01f

    .line 526
    .line 527
    .line 528
    const v23, 0x4197c28f    # 18.97f

    .line 529
    .line 530
    .line 531
    const/high16 v24, 0x41100000    # 9.0f

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v25, 0x40400000    # 3.0f

    .line 537
    .line 538
    const/high16 v26, 0x40400000    # 3.0f

    .line 539
    .line 540
    const v21, 0x3fd70a3d    # 1.68f

    .line 541
    .line 542
    .line 543
    const/16 v22, 0x0

    .line 544
    .line 545
    const/high16 v23, 0x40400000    # 3.0f

    .line 546
    .line 547
    const v24, 0x3fa8f5c3    # 1.32f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v4, 0x41a570a4    # 20.68f

    .line 554
    .line 555
    .line 556
    const/high16 v6, 0x41980000    # 19.0f

    .line 557
    .line 558
    const/high16 v7, 0x41700000    # 15.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/16 v16, 0x3800

    .line 571
    .line 572
    const/16 v17, 0x0

    .line 573
    .line 574
    const/high16 v6, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/high16 v8, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    const/high16 v9, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v12, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    const/4 v14, 0x0

    .line 585
    const/4 v15, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 596
    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 598
    .line 599
    .line 600
    move-result-wide v6

    .line 601
    const/4 v0, 0x0

    .line 602
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 610
    .line 611
    .line 612
    move-result v11

    .line 613
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    const/high16 v2, 0x41a00000    # 20.0f

    .line 619
    .line 620
    const/high16 v4, 0x41300000    # 11.0f

    .line 621
    .line 622
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v2, -0x3f800000    # -4.0f

    .line 626
    .line 627
    const/4 v4, 0x0

    .line 628
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x40c00000    # 6.0f

    .line 632
    .line 633
    const/high16 v4, 0x40400000    # 3.0f

    .line 634
    .line 635
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v2, -0x40000000    # -2.0f

    .line 639
    .line 640
    const/4 v4, 0x0

    .line 641
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/4 v2, 0x0

    .line 645
    const/high16 v4, 0x40800000    # 4.0f

    .line 646
    .line 647
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v2, -0x3f400000    # -6.0f

    .line 651
    .line 652
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 653
    .line 654
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/high16 v6, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const-string v4, ""

    .line 668
    .line 669
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    sput-object v0, Landroidx/compose/material/icons/sharp/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 678
    .line 679
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/CleanHandsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCleanHands(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CleanHands"

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
    const/high16 v4, 0x41180000    # 9.5f

    .line 71
    .line 72
    const v6, 0x4113d70a    # 9.24f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40ed70a4    # 7.42f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41200000    # 10.0f

    .line 85
    .line 86
    const/high16 v26, 0x41000000    # 8.0f

    .line 87
    .line 88
    const v21, 0x40fe147b    # 7.94f

    .line 89
    .line 90
    .line 91
    const v22, 0x4109c28f    # 8.61f

    .line 92
    .line 93
    .line 94
    const v23, 0x410e3d71    # 8.89f

    .line 95
    .line 96
    .line 97
    const/high16 v24, 0x41000000    # 8.0f

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, 0x403f5c29    # 2.99f

    .line 105
    .line 106
    .line 107
    const v26, 0x4039999a    # 2.9f

    .line 108
    .line 109
    .line 110
    const v21, 0x3fcf5c29    # 1.62f

    .line 111
    .line 112
    .line 113
    const/16 v22, 0x0

    .line 114
    .line 115
    const v23, 0x403c28f6    # 2.94f

    .line 116
    .line 117
    .line 118
    const v24, 0x3fa51eb8    # 1.29f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41180000    # 9.5f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41a00000    # 20.0f

    .line 133
    .line 134
    const/high16 v6, 0x40a00000    # 5.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, -0x3f200000    # -7.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40400000    # 3.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x40e00000    # 7.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40a00000    # 5.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x41948f5c    # 18.57f

    .line 163
    .line 164
    .line 165
    const v6, 0x419f3333    # 19.9f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, -0x4099999a    # -0.9f

    .line 172
    .line 173
    .line 174
    const v26, -0x40f0a3d7    # -0.56f

    .line 175
    .line 176
    .line 177
    const v21, -0x41dc28f6    # -0.16f

    .line 178
    .line 179
    .line 180
    const v22, -0x41570a3d    # -0.33f

    .line 181
    .line 182
    .line 183
    const v23, -0x40fd70a4    # -0.51f

    .line 184
    .line 185
    .line 186
    const v24, -0x40f0a3d7    # -0.56f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x3f54cccd    # -5.35f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v25, -0x4035c28f    # -1.58f

    .line 199
    .line 200
    .line 201
    const v26, -0x417ae148    # -0.26f

    .line 202
    .line 203
    .line 204
    const v21, -0x40f5c28f    # -0.54f

    .line 205
    .line 206
    .line 207
    const/16 v22, 0x0

    .line 208
    .line 209
    const v23, -0x40770a3d    # -1.07f

    .line 210
    .line 211
    .line 212
    const v24, -0x4247ae14    # -0.09f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, -0x40b5c28f    # -0.79f

    .line 219
    .line 220
    .line 221
    const v6, -0x3fe7ae14    # -2.38f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v4, -0x400ccccd    # -1.9f

    .line 228
    .line 229
    .line 230
    const v6, 0x3f2147ae    # 0.63f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x3f4a3d71    # 0.79f

    .line 237
    .line 238
    .line 239
    const v6, 0x401851ec    # 2.38f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x41700000    # 15.0f

    .line 246
    .line 247
    const/high16 v26, 0x41800000    # 16.0f

    .line 248
    .line 249
    const v21, 0x415028f6    # 13.01f

    .line 250
    .line 251
    .line 252
    const v22, 0x417f3333    # 15.95f

    .line 253
    .line 254
    .line 255
    const/high16 v23, 0x41700000    # 15.0f

    .line 256
    .line 257
    const/high16 v24, 0x41800000    # 16.0f

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v25, -0x40ee147b    # -0.57f

    .line 263
    .line 264
    .line 265
    const v26, -0x40ab851f    # -0.83f

    .line 266
    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    .line 270
    const v22, -0x41428f5c    # -0.37f

    .line 271
    .line 272
    .line 273
    const v23, -0x41947ae1    # -0.23f

    .line 274
    .line 275
    .line 276
    const v24, -0x40cccccd    # -0.7f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x41500000    # 13.0f

    .line 283
    .line 284
    const v6, 0x4109c28f    # 8.61f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x40e00000    # 7.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v4, 0x40af5c29    # 5.48f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x40df0a3d    # 6.97f

    .line 302
    .line 303
    .line 304
    const v6, 0x3ff70a3d    # 1.93f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, 0x41948f5c    # 18.57f

    .line 311
    .line 312
    .line 313
    const v6, 0x419f3333    # 19.9f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    const/16 v16, 0x3800

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const v6, 0x3e99999a    # 0.3f

    .line 331
    .line 332
    .line 333
    const v8, 0x3e99999a    # 0.3f

    .line 334
    .line 335
    .line 336
    const/4 v7, 0x0

    .line 337
    const/high16 v9, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/high16 v12, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const/4 v14, 0x0

    .line 343
    const/4 v15, 0x0

    .line 344
    const-string v4, ""

    .line 345
    .line 346
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 354
    .line 355
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 356
    .line 357
    .line 358
    move-result-wide v6

    .line 359
    const/4 v0, 0x0

    .line 360
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const v0, 0x4187eb85    # 16.99f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x40a00000    # 5.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x3faf5c29    # 1.37f

    .line 385
    .line 386
    .line 387
    const v2, 0x3f2147ae    # 0.63f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x4197eb85    # 18.99f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x40e00000    # 7.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x4050a3d7    # -1.37f

    .line 402
    .line 403
    .line 404
    const v2, 0x3f2147ae    # 0.63f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41100000    # 9.0f

    .line 411
    .line 412
    const v2, 0x4187eb85    # 16.99f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x40deb852    # -0.63f

    .line 419
    .line 420
    .line 421
    const v2, -0x4050a3d7    # -1.37f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x416fd70a    # 14.99f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x40e00000    # 7.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3faf5c29    # 1.37f

    .line 436
    .line 437
    .line 438
    const v2, -0x40deb852    # -0.63f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x4187eb85    # 16.99f

    .line 445
    .line 446
    .line 447
    const/high16 v2, 0x40a00000    # 5.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41600000    # 14.0f

    .line 453
    .line 454
    const/high16 v2, 0x41a00000    # 20.0f

    .line 455
    .line 456
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x40000000    # 2.0f

    .line 460
    .line 461
    const/high16 v18, -0x40000000    # -2.0f

    .line 462
    .line 463
    const v13, 0x3f8ccccd    # 1.1f

    .line 464
    .line 465
    .line 466
    const/high16 v15, 0x40000000    # 2.0f

    .line 467
    .line 468
    const v16, -0x4099999a    # -0.9f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x40000000    # -2.0f

    .line 475
    .line 476
    const/high16 v18, -0x3f800000    # -4.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, -0x40733333    # -1.1f

    .line 480
    .line 481
    .line 482
    const/high16 v15, -0x40000000    # -2.0f

    .line 483
    .line 484
    const/high16 v16, -0x3f800000    # -4.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, -0x40000000    # -2.0f

    .line 490
    .line 491
    const/high16 v2, 0x40800000    # 4.0f

    .line 492
    .line 493
    const/high16 v4, -0x40000000    # -2.0f

    .line 494
    .line 495
    const v6, 0x4039999a    # 2.9f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, 0x41a00000    # 20.0f

    .line 502
    .line 503
    const/high16 v18, 0x41600000    # 14.0f

    .line 504
    .line 505
    const/high16 v13, 0x41900000    # 18.0f

    .line 506
    .line 507
    const v14, 0x4151999a    # 13.1f

    .line 508
    .line 509
    .line 510
    const v15, 0x41973333    # 18.9f

    .line 511
    .line 512
    .line 513
    const/high16 v16, 0x41600000    # 14.0f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x40c33333    # 6.1f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x41300000    # 11.0f

    .line 525
    .line 526
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x40800000    # 4.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40000000    # 2.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x3fc66666    # 1.55f

    .line 540
    .line 541
    .line 542
    const v18, 0x3ee66666    # 0.45f

    .line 543
    .line 544
    .line 545
    const v13, 0x3f11eb85    # 0.57f

    .line 546
    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    const v15, 0x3f8ccccd    # 1.1f

    .line 550
    .line 551
    .line 552
    const v16, 0x3e2e147b    # 0.17f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x3fb70a3d    # 1.43f

    .line 559
    .line 560
    .line 561
    const v2, -0x4048f5c3    # -1.43f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x41500000    # 13.0f

    .line 568
    .line 569
    const/high16 v18, 0x40000000    # 2.0f

    .line 570
    .line 571
    const v13, 0x41726666    # 15.15f

    .line 572
    .line 573
    .line 574
    const v14, 0x4018f5c3    # 2.39f

    .line 575
    .line 576
    .line 577
    const v15, 0x4162147b    # 14.13f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x40000000    # 2.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, -0x3f500000    # -5.5f

    .line 586
    .line 587
    const/16 v18, 0x0

    .line 588
    .line 589
    const v13, -0x4043d70a    # -1.47f

    .line 590
    .line 591
    .line 592
    const/4 v14, 0x0

    .line 593
    const v15, -0x3f51eb85    # -5.44f

    .line 594
    .line 595
    .line 596
    const/16 v16, 0x0

    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, 0x40000000    # 2.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41100000    # 9.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x40070a3d    # 2.11f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x40a80000    # 5.25f

    .line 618
    .line 619
    const/high16 v18, 0x41180000    # 9.5f

    .line 620
    .line 621
    const v13, 0x40e70a3d    # 7.22f

    .line 622
    .line 623
    .line 624
    const v14, 0x40cf5c29    # 6.48f

    .line 625
    .line 626
    .line 627
    const v15, 0x40b9999a    # 5.8f

    .line 628
    .line 629
    .line 630
    const v16, 0x40f947ae    # 7.79f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x400a3d71    # 2.16f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, 0x41200000    # 10.0f

    .line 643
    .line 644
    const/high16 v18, 0x41000000    # 8.0f

    .line 645
    .line 646
    const v13, 0x40fe147b    # 7.94f

    .line 647
    .line 648
    .line 649
    const v14, 0x4109c28f    # 8.61f

    .line 650
    .line 651
    .line 652
    const v15, 0x410e3d71    # 8.89f

    .line 653
    .line 654
    .line 655
    const/high16 v16, 0x41000000    # 8.0f

    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, 0x403f5c29    # 2.99f

    .line 661
    .line 662
    .line 663
    const v18, 0x4039999a    # 2.9f

    .line 664
    .line 665
    .line 666
    const v13, 0x3fcf5c29    # 1.62f

    .line 667
    .line 668
    .line 669
    const/4 v14, 0x0

    .line 670
    const v15, 0x403c28f6    # 2.94f

    .line 671
    .line 672
    .line 673
    const v16, 0x3fa51eb8    # 1.29f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, 0x41700000    # 15.0f

    .line 680
    .line 681
    const v2, 0x413a6666    # 11.65f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x41300000    # 11.0f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x41300000    # 11.0f

    .line 693
    .line 694
    const v18, 0x40c33333    # 6.1f

    .line 695
    .line 696
    .line 697
    const/high16 v13, 0x41700000    # 15.0f

    .line 698
    .line 699
    const v14, 0x410947ae    # 8.58f

    .line 700
    .line 701
    .line 702
    const v15, 0x41547ae1    # 13.28f

    .line 703
    .line 704
    .line 705
    const v16, 0x40d1eb85    # 6.56f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41b00000    # 22.0f

    .line 715
    .line 716
    const/high16 v2, 0x41980000    # 19.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x3f800000    # 1.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, -0x3f000000    # -8.0f

    .line 727
    .line 728
    const/high16 v2, 0x40200000    # 2.5f

    .line 729
    .line 730
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, -0x4007ae14    # -1.94f

    .line 734
    .line 735
    .line 736
    const/high16 v2, -0x3f200000    # -7.0f

    .line 737
    .line 738
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x41b00000    # 22.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v0, 0x3f800000    # 1.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v0, 0x41300000    # 11.0f

    .line 752
    .line 753
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, 0x40ff0a3d    # 7.97f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x40c51eb8    # 6.16f

    .line 763
    .line 764
    .line 765
    const v2, 0x40133333    # 2.3f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v17, 0x41880000    # 17.0f

    .line 772
    .line 773
    const/high16 v18, 0x41800000    # 16.0f

    .line 774
    .line 775
    const/high16 v13, 0x41820000    # 16.25f

    .line 776
    .line 777
    const v14, 0x415b851f    # 13.72f

    .line 778
    .line 779
    .line 780
    const/high16 v15, 0x41880000    # 17.0f

    .line 781
    .line 782
    const v16, 0x416ccccd    # 14.8f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, 0x40000000    # 2.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v17, 0x41b00000    # 22.0f

    .line 794
    .line 795
    const/high16 v18, 0x41980000    # 19.0f

    .line 796
    .line 797
    const v13, 0x41a547ae    # 20.66f

    .line 798
    .line 799
    .line 800
    const/high16 v14, 0x41800000    # 16.0f

    .line 801
    .line 802
    const/high16 v15, 0x41b00000    # 22.0f

    .line 803
    .line 804
    const v16, 0x418ab852    # 17.34f

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v0, 0x41a00000    # 20.0f

    .line 814
    .line 815
    const/high16 v2, 0x40a00000    # 5.0f

    .line 816
    .line 817
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const/high16 v0, -0x3f200000    # -7.0f

    .line 821
    .line 822
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, 0x40400000    # 3.0f

    .line 826
    .line 827
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v0, 0x40e00000    # 7.0f

    .line 831
    .line 832
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v0, 0x40a00000    # 5.0f

    .line 836
    .line 837
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x41948f5c    # 18.57f

    .line 844
    .line 845
    .line 846
    const v2, 0x419f3333    # 19.9f

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v17, -0x4099999a    # -0.9f

    .line 853
    .line 854
    .line 855
    const v18, -0x40f0a3d7    # -0.56f

    .line 856
    .line 857
    .line 858
    const v13, -0x41dc28f6    # -0.16f

    .line 859
    .line 860
    .line 861
    const v14, -0x41570a3d    # -0.33f

    .line 862
    .line 863
    .line 864
    const v15, -0x40fd70a4    # -0.51f

    .line 865
    .line 866
    .line 867
    const v16, -0x40f0a3d7    # -0.56f

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, -0x3f54cccd    # -5.35f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v17, -0x4035c28f    # -1.58f

    .line 880
    .line 881
    .line 882
    const v18, -0x417ae148    # -0.26f

    .line 883
    .line 884
    .line 885
    const v13, -0x40f5c28f    # -0.54f

    .line 886
    .line 887
    .line 888
    const/4 v14, 0x0

    .line 889
    const v15, -0x40770a3d    # -1.07f

    .line 890
    .line 891
    .line 892
    const v16, -0x4247ae14    # -0.09f

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v0, -0x40b5c28f    # -0.79f

    .line 899
    .line 900
    .line 901
    const v2, -0x3fe7ae14    # -2.38f

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v0, -0x400ccccd    # -1.9f

    .line 908
    .line 909
    .line 910
    const v2, 0x3f2147ae    # 0.63f

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v0, 0x3f4a3d71    # 0.79f

    .line 917
    .line 918
    .line 919
    const v2, 0x401851ec    # 2.38f

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v17, 0x41700000    # 15.0f

    .line 926
    .line 927
    const/high16 v18, 0x41800000    # 16.0f

    .line 928
    .line 929
    const v13, 0x415028f6    # 13.01f

    .line 930
    .line 931
    .line 932
    const v14, 0x417f3333    # 15.95f

    .line 933
    .line 934
    .line 935
    const/high16 v15, 0x41700000    # 15.0f

    .line 936
    .line 937
    const/high16 v16, 0x41800000    # 16.0f

    .line 938
    .line 939
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const v17, -0x40ee147b    # -0.57f

    .line 943
    .line 944
    .line 945
    const v18, -0x40ab851f    # -0.83f

    .line 946
    .line 947
    .line 948
    const/4 v13, 0x0

    .line 949
    const v14, -0x41428f5c    # -0.37f

    .line 950
    .line 951
    .line 952
    const v15, -0x41947ae1    # -0.23f

    .line 953
    .line 954
    .line 955
    const v16, -0x40cccccd    # -0.7f

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v0, 0x41500000    # 13.0f

    .line 962
    .line 963
    const v2, 0x4109c28f    # 8.61f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const/high16 v0, 0x40e00000    # 7.0f

    .line 970
    .line 971
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const v0, 0x40af5c29    # 5.48f

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const v0, 0x40df0a3d    # 6.97f

    .line 981
    .line 982
    .line 983
    const v2, 0x3ff70a3d    # 1.93f

    .line 984
    .line 985
    .line 986
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v0, 0x41948f5c    # 18.57f

    .line 990
    .line 991
    .line 992
    const v2, 0x419f3333    # 19.9f

    .line 993
    .line 994
    .line 995
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    const/16 v16, 0x3800

    .line 1006
    .line 1007
    const/16 v17, 0x0

    .line 1008
    .line 1009
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1012
    .line 1013
    const/4 v7, 0x0

    .line 1014
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1015
    .line 1016
    const/4 v14, 0x0

    .line 1017
    const/4 v15, 0x0

    .line 1018
    const-string v4, ""

    .line 1019
    .line 1020
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    sput-object v0, Landroidx/compose/material/icons/twotone/CleanHandsKt;->_cleanHands:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1029
    .line 1030
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    return-object v0
.end method

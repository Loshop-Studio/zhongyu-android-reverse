.class public final Landroidx/compose/material/icons/twotone/VolunteerActivismKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVolunteerActivism(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VolunteerActivism"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const v6, 0x3e99999a    # 0.3f

    .line 104
    .line 105
    .line 106
    const v8, 0x3e99999a    # 0.3f

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    const/high16 v9, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/high16 v12, 0x3f800000    # 1.0f

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const-string v4, ""

    .line 118
    .line 119
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const v4, 0x4124a3d7    # 10.29f

    .line 150
    .line 151
    .line 152
    const/high16 v6, 0x41800000    # 16.0f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v25, 0x40800000    # 4.0f

    .line 158
    .line 159
    const v26, -0x3f6051ec    # -4.99f

    .line 160
    .line 161
    .line 162
    const v21, 0x3ffae148    # 1.96f

    .line 163
    .line 164
    .line 165
    const v22, -0x40170a3d    # -1.82f

    .line 166
    .line 167
    .line 168
    const/high16 v23, 0x40800000    # 4.0f

    .line 169
    .line 170
    const v24, -0x3f87ae14    # -3.88f

    .line 171
    .line 172
    .line 173
    move-object/from16 v20, v2

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x4195999a    # 18.7f

    .line 179
    .line 180
    .line 181
    const/high16 v26, 0x40800000    # 4.0f

    .line 182
    .line 183
    const/high16 v21, 0x41a00000    # 20.0f

    .line 184
    .line 185
    const v22, 0x4091eb85    # 4.56f

    .line 186
    .line 187
    .line 188
    const v23, 0x419b851f    # 19.44f

    .line 189
    .line 190
    .line 191
    const/high16 v24, 0x40800000    # 4.0f

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, -0x4068f5c3    # -1.18f

    .line 197
    .line 198
    .line 199
    const v26, 0x3f0ccccd    # 0.55f

    .line 200
    .line 201
    .line 202
    const v21, -0x411eb852    # -0.44f

    .line 203
    .line 204
    .line 205
    const/16 v22, 0x0

    .line 206
    .line 207
    const v23, -0x409c28f6    # -0.89f

    .line 208
    .line 209
    .line 210
    const v24, 0x3e570a3d    # 0.21f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, 0x40cae148    # 6.34f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, -0x403d70a4    # -1.52f

    .line 223
    .line 224
    .line 225
    const v6, -0x401ae148    # -1.79f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x4154cccd    # 13.3f

    .line 232
    .line 233
    .line 234
    const/high16 v26, 0x40800000    # 4.0f

    .line 235
    .line 236
    const v21, 0x41630a3d    # 14.19f

    .line 237
    .line 238
    .line 239
    const v22, 0x4086b852    # 4.21f

    .line 240
    .line 241
    .line 242
    const v23, 0x415bd70a    # 13.74f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x40800000    # 4.0f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x41400000    # 12.0f

    .line 251
    .line 252
    const v26, 0x40a9999a    # 5.3f

    .line 253
    .line 254
    .line 255
    const v21, 0x4148f5c3    # 12.56f

    .line 256
    .line 257
    .line 258
    const/high16 v22, 0x40800000    # 4.0f

    .line 259
    .line 260
    const/high16 v23, 0x41400000    # 12.0f

    .line 261
    .line 262
    const v24, 0x4091eb85    # 4.56f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x41800000    # 16.0f

    .line 269
    .line 270
    const v26, 0x4124a3d7    # 10.29f

    .line 271
    .line 272
    .line 273
    const/high16 v21, 0x41400000    # 12.0f

    .line 274
    .line 275
    const v22, 0x40cd1eb8    # 6.41f

    .line 276
    .line 277
    .line 278
    const v23, 0x4160a3d7    # 14.04f

    .line 279
    .line 280
    .line 281
    const v24, 0x4107851f    # 8.47f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const v6, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const-string v4, ""

    .line 299
    .line 300
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 310
    .line 311
    .line 312
    move-result-wide v6

    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x41900000    # 18.0f

    .line 331
    .line 332
    const/high16 v6, 0x41980000    # 19.0f

    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, -0x3f54cccd    # -5.35f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v25, -0x4035c28f    # -1.58f

    .line 344
    .line 345
    .line 346
    const v26, -0x417ae148    # -0.26f

    .line 347
    .line 348
    .line 349
    const v21, -0x40f5c28f    # -0.54f

    .line 350
    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const v23, -0x40770a3d    # -1.07f

    .line 355
    .line 356
    .line 357
    const v24, -0x4247ae14    # -0.09f

    .line 358
    .line 359
    .line 360
    move-object/from16 v20, v2

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, -0x40b5c28f    # -0.79f

    .line 366
    .line 367
    .line 368
    const v6, -0x3fe7ae14    # -2.38f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x3f2147ae    # 0.63f

    .line 375
    .line 376
    .line 377
    const v6, -0x400ccccd    # -1.9f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x3f4a3d71    # 0.79f

    .line 384
    .line 385
    .line 386
    const v6, 0x401851ec    # 2.38f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v25, 0x3f733333    # 0.95f

    .line 393
    .line 394
    .line 395
    const v26, 0x3e19999a    # 0.15f

    .line 396
    .line 397
    .line 398
    const v21, 0x3e9eb852    # 0.31f

    .line 399
    .line 400
    .line 401
    const v22, 0x3dcccccd    # 0.1f

    .line 402
    .line 403
    .line 404
    const v23, 0x3f2147ae    # 0.63f

    .line 405
    .line 406
    .line 407
    const v24, 0x3e19999a    # 0.15f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x41700000    # 15.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, -0x40ee147b    # -0.57f

    .line 419
    .line 420
    .line 421
    const v26, -0x40ab851f    # -0.83f

    .line 422
    .line 423
    .line 424
    const/16 v21, 0x0

    .line 425
    .line 426
    const v22, -0x41428f5c    # -0.37f

    .line 427
    .line 428
    .line 429
    const v23, -0x41947ae1    # -0.23f

    .line 430
    .line 431
    .line 432
    const v24, -0x40cccccd    # -0.7f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x4109c28f    # 8.61f

    .line 439
    .line 440
    .line 441
    const/high16 v6, 0x41500000    # 13.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x40e00000    # 7.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x40af5c29    # 5.48f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, 0x40df0a3d    # 6.97f

    .line 458
    .line 459
    .line 460
    const v6, 0x3ff851ec    # 1.94f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v4, 0x40bdc28f    # 5.93f

    .line 467
    .line 468
    .line 469
    const v6, -0x40133333    # -1.85f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x41980000    # 19.0f

    .line 476
    .line 477
    const/high16 v26, 0x41900000    # 18.0f

    .line 478
    .line 479
    const v21, 0x419deb85    # 19.74f

    .line 480
    .line 481
    .line 482
    const v22, 0x4191d70a    # 18.23f

    .line 483
    .line 484
    .line 485
    const v23, 0x419b1eb8    # 19.39f

    .line 486
    .line 487
    .line 488
    const/high16 v24, 0x41900000    # 18.0f

    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    const v6, 0x3e99999a    # 0.3f

    .line 501
    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 514
    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41500000    # 13.0f

    .line 537
    .line 538
    const/high16 v6, 0x41800000    # 16.0f

    .line 539
    .line 540
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v25, 0x40c00000    # 6.0f

    .line 544
    .line 545
    const v26, -0x3f09999a    # -7.7f

    .line 546
    .line 547
    .line 548
    const v21, 0x4045c28f    # 3.09f

    .line 549
    .line 550
    .line 551
    const v22, -0x3fcc28f6    # -2.81f

    .line 552
    .line 553
    .line 554
    const/high16 v23, 0x40c00000    # 6.0f

    .line 555
    .line 556
    const v24, -0x3f51eb85    # -5.44f

    .line 557
    .line 558
    .line 559
    move-object/from16 v20, v2

    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v25, 0x4195999a    # 18.7f

    .line 565
    .line 566
    .line 567
    const/high16 v26, 0x40000000    # 2.0f

    .line 568
    .line 569
    const/high16 v21, 0x41b00000    # 22.0f

    .line 570
    .line 571
    const v22, 0x405ccccd    # 3.45f

    .line 572
    .line 573
    .line 574
    const v23, 0x41a46666    # 20.55f

    .line 575
    .line 576
    .line 577
    const/high16 v24, 0x40000000    # 2.0f

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v25, -0x3fd33333    # -2.7f

    .line 583
    .line 584
    .line 585
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 586
    .line 587
    const v21, -0x407ae148    # -1.04f

    .line 588
    .line 589
    .line 590
    const/16 v22, 0x0

    .line 591
    .line 592
    const v23, -0x3ffccccd    # -2.05f

    .line 593
    .line 594
    .line 595
    const v24, 0x3efae148    # 0.49f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v25, 0x4154cccd    # 13.3f

    .line 602
    .line 603
    .line 604
    const/high16 v26, 0x40000000    # 2.0f

    .line 605
    .line 606
    const v21, 0x4175999a    # 15.35f

    .line 607
    .line 608
    .line 609
    const v22, 0x401f5c29    # 2.49f

    .line 610
    .line 611
    .line 612
    const v23, 0x416570a4    # 14.34f

    .line 613
    .line 614
    .line 615
    const/high16 v24, 0x40000000    # 2.0f

    .line 616
    .line 617
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v25, 0x41200000    # 10.0f

    .line 621
    .line 622
    const v26, 0x40a9999a    # 5.3f

    .line 623
    .line 624
    .line 625
    const v21, 0x41373333    # 11.45f

    .line 626
    .line 627
    .line 628
    const/high16 v22, 0x40000000    # 2.0f

    .line 629
    .line 630
    const/high16 v23, 0x41200000    # 10.0f

    .line 631
    .line 632
    const v24, 0x405ccccd    # 3.45f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v25, 0x41800000    # 16.0f

    .line 639
    .line 640
    const/high16 v26, 0x41500000    # 13.0f

    .line 641
    .line 642
    const/high16 v21, 0x41200000    # 10.0f

    .line 643
    .line 644
    const v22, 0x40f1eb85    # 7.56f

    .line 645
    .line 646
    .line 647
    const v23, 0x414e8f5c    # 12.91f

    .line 648
    .line 649
    .line 650
    const v24, 0x41230a3d    # 10.19f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v4, 0x4154cccd    # 13.3f

    .line 660
    .line 661
    .line 662
    const/high16 v6, 0x40800000    # 4.0f

    .line 663
    .line 664
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v25, 0x3f970a3d    # 1.18f

    .line 668
    .line 669
    .line 670
    const v26, 0x3f0ccccd    # 0.55f

    .line 671
    .line 672
    .line 673
    const v21, 0x3ee147ae    # 0.44f

    .line 674
    .line 675
    .line 676
    const/16 v22, 0x0

    .line 677
    .line 678
    const v23, 0x3f63d70a    # 0.89f

    .line 679
    .line 680
    .line 681
    const v24, 0x3e570a3d    # 0.21f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v4, 0x40cae148    # 6.34f

    .line 688
    .line 689
    .line 690
    const/high16 v6, 0x41800000    # 16.0f

    .line 691
    .line 692
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v4, 0x3fc28f5c    # 1.52f

    .line 696
    .line 697
    .line 698
    const v6, -0x401ae148    # -1.79f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v25, 0x4195999a    # 18.7f

    .line 705
    .line 706
    .line 707
    const/high16 v26, 0x40800000    # 4.0f

    .line 708
    .line 709
    const v21, 0x418e7ae1    # 17.81f

    .line 710
    .line 711
    .line 712
    const v22, 0x4086b852    # 4.21f

    .line 713
    .line 714
    .line 715
    const v23, 0x4192147b    # 18.26f

    .line 716
    .line 717
    .line 718
    const/high16 v24, 0x40800000    # 4.0f

    .line 719
    .line 720
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v25, 0x41a00000    # 20.0f

    .line 724
    .line 725
    const v26, 0x40a9999a    # 5.3f

    .line 726
    .line 727
    .line 728
    const v21, 0x419b851f    # 19.44f

    .line 729
    .line 730
    .line 731
    const/high16 v22, 0x40800000    # 4.0f

    .line 732
    .line 733
    const/high16 v23, 0x41a00000    # 20.0f

    .line 734
    .line 735
    const v24, 0x4091eb85    # 4.56f

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v25, -0x3f800000    # -4.0f

    .line 742
    .line 743
    const v26, 0x409fae14    # 4.99f

    .line 744
    .line 745
    .line 746
    const/16 v21, 0x0

    .line 747
    .line 748
    const v22, 0x3f8f5c29    # 1.12f

    .line 749
    .line 750
    .line 751
    const v23, -0x3ffd70a4    # -2.04f

    .line 752
    .line 753
    .line 754
    const v24, 0x404ae148    # 3.17f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v26, -0x3f6051ec    # -4.99f

    .line 761
    .line 762
    .line 763
    const v21, -0x40051eb8    # -1.96f

    .line 764
    .line 765
    .line 766
    const v22, -0x40170a3d    # -1.82f

    .line 767
    .line 768
    .line 769
    const/high16 v23, -0x3f800000    # -4.0f

    .line 770
    .line 771
    const v24, -0x3f87ae14    # -3.88f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v25, 0x4154cccd    # 13.3f

    .line 778
    .line 779
    .line 780
    const/high16 v26, 0x40800000    # 4.0f

    .line 781
    .line 782
    const/high16 v21, 0x41400000    # 12.0f

    .line 783
    .line 784
    const v22, 0x4091eb85    # 4.56f

    .line 785
    .line 786
    .line 787
    const v23, 0x4148f5c3    # 12.56f

    .line 788
    .line 789
    .line 790
    const/high16 v24, 0x40800000    # 4.0f

    .line 791
    .line 792
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    const/high16 v6, 0x3f800000    # 1.0f

    .line 803
    .line 804
    const/high16 v8, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 817
    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 819
    .line 820
    .line 821
    move-result-wide v6

    .line 822
    const/4 v0, 0x0

    .line 823
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 831
    .line 832
    .line 833
    move-result v11

    .line 834
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    const/high16 v0, 0x41980000    # 19.0f

    .line 840
    .line 841
    const/high16 v2, 0x41800000    # 16.0f

    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v0, -0x40000000    # -2.0f

    .line 847
    .line 848
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v17, -0x4010a3d7    # -1.87f

    .line 852
    .line 853
    .line 854
    const v18, -0x3fd33333    # -2.7f

    .line 855
    .line 856
    .line 857
    const v14, -0x40666666    # -1.2f

    .line 858
    .line 859
    .line 860
    const/high16 v15, -0x40c00000    # -0.75f

    .line 861
    .line 862
    const v16, -0x3fee147b    # -2.28f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const v0, 0x410f851f    # 8.97f

    .line 869
    .line 870
    .line 871
    const/high16 v2, 0x41300000    # 11.0f

    .line 872
    .line 873
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v0, 0x3f800000    # 1.0f

    .line 877
    .line 878
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v0, 0x41300000    # 11.0f

    .line 882
    .line 883
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v0, 0x40c00000    # 6.0f

    .line 887
    .line 888
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, -0x4047ae14    # -1.44f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, 0x3ff851ec    # 1.94f

    .line 898
    .line 899
    .line 900
    const/high16 v2, 0x40e00000    # 7.0f

    .line 901
    .line 902
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v0, 0x41000000    # 8.0f

    .line 906
    .line 907
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 908
    .line 909
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const/high16 v0, -0x40800000    # -1.0f

    .line 913
    .line 914
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const/high16 v17, 0x41980000    # 19.0f

    .line 918
    .line 919
    const/high16 v18, 0x41800000    # 16.0f

    .line 920
    .line 921
    const/high16 v13, 0x41b00000    # 22.0f

    .line 922
    .line 923
    const v14, 0x418ab852    # 17.34f

    .line 924
    .line 925
    .line 926
    const v15, 0x41a547ae    # 20.66f

    .line 927
    .line 928
    .line 929
    const/high16 v16, 0x41800000    # 16.0f

    .line 930
    .line 931
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x40a00000    # 5.0f

    .line 938
    .line 939
    const/high16 v2, 0x41a00000    # 20.0f

    .line 940
    .line 941
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v0, 0x40400000    # 3.0f

    .line 945
    .line 946
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v0, -0x3f200000    # -7.0f

    .line 950
    .line 951
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const/high16 v0, 0x40000000    # 2.0f

    .line 955
    .line 956
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v0, 0x41a00000    # 20.0f

    .line 960
    .line 961
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v0, 0x41a347ae    # 20.41f

    .line 968
    .line 969
    .line 970
    const v2, 0x415f851f    # 13.97f

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v0, 0x4193d70a    # 18.48f

    .line 977
    .line 978
    .line 979
    const/high16 v2, 0x40e00000    # 7.0f

    .line 980
    .line 981
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v0, 0x41500000    # 13.0f

    .line 985
    .line 986
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v0, 0x3fce147b    # 1.61f

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v0, 0x40ba3d71    # 5.82f

    .line 996
    .line 997
    .line 998
    const v2, 0x400ae148    # 2.17f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const/high16 v17, 0x41700000    # 15.0f

    .line 1005
    .line 1006
    const v13, 0x416c51ec    # 14.77f

    .line 1007
    .line 1008
    .line 1009
    const v14, 0x4174cccd    # 15.3f

    .line 1010
    .line 1011
    .line 1012
    const/high16 v15, 0x41700000    # 15.0f

    .line 1013
    .line 1014
    const v16, 0x417a147b    # 15.63f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v0, -0x40533333    # -1.35f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const v17, -0x408ccccd    # -0.95f

    .line 1027
    .line 1028
    .line 1029
    const v18, -0x41e66666    # -0.15f

    .line 1030
    .line 1031
    .line 1032
    const v13, -0x415c28f6    # -0.32f

    .line 1033
    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    const v15, -0x40dc28f6    # -0.64f

    .line 1037
    .line 1038
    .line 1039
    const v16, -0x42b33333    # -0.05f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v0, -0x40b5c28f    # -0.79f

    .line 1046
    .line 1047
    .line 1048
    const v2, -0x3fe7ae14    # -2.38f

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const v0, -0x40deb852    # -0.63f

    .line 1055
    .line 1056
    .line 1057
    const v2, 0x3ff33333    # 1.9f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const v0, 0x3f4a3d71    # 0.79f

    .line 1064
    .line 1065
    .line 1066
    const v2, 0x401851ec    # 2.38f

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const v17, 0x3fca3d71    # 1.58f

    .line 1073
    .line 1074
    .line 1075
    const v18, 0x3e851eb8    # 0.26f

    .line 1076
    .line 1077
    .line 1078
    const v13, 0x3f028f5c    # 0.51f

    .line 1079
    .line 1080
    .line 1081
    const v14, 0x3e2e147b    # 0.17f

    .line 1082
    .line 1083
    .line 1084
    const v15, 0x3f851eb8    # 1.04f

    .line 1085
    .line 1086
    .line 1087
    const v16, 0x3e851eb8    # 0.26f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const/high16 v0, 0x41980000    # 19.0f

    .line 1094
    .line 1095
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v17, 0x3f666666    # 0.9f

    .line 1099
    .line 1100
    .line 1101
    const v18, 0x3f0f5c29    # 0.56f

    .line 1102
    .line 1103
    .line 1104
    const v13, 0x3ec7ae14    # 0.39f

    .line 1105
    .line 1106
    .line 1107
    const/4 v14, 0x0

    .line 1108
    const v15, 0x3f3d70a4    # 0.74f

    .line 1109
    .line 1110
    .line 1111
    const v16, 0x3e6b851f    # 0.23f

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v0, 0x41a347ae    # 20.41f

    .line 1118
    .line 1119
    .line 1120
    const v2, 0x415f851f    # 13.97f

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    const/16 v16, 0x3800

    .line 1134
    .line 1135
    const/16 v17, 0x0

    .line 1136
    .line 1137
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1138
    .line 1139
    const/4 v7, 0x0

    .line 1140
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1141
    .line 1142
    const/4 v13, 0x0

    .line 1143
    const/4 v15, 0x0

    .line 1144
    const-string v4, ""

    .line 1145
    .line 1146
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    sput-object v0, Landroidx/compose/material/icons/twotone/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1155
    .line 1156
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1157
    .line 1158
    .line 1159
    return-object v0
.end method

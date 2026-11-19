.class public final Landroidx/compose/material/icons/rounded/PlagiarismKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlagiarism(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PlagiarismKt;->_plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Plagiarism"

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
    const v4, 0x419b47ae    # 19.41f

    .line 71
    .line 72
    .line 73
    const v6, 0x40ed1eb8    # 7.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f6570a4    # -4.83f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, 0x4152b852    # 13.17f

    .line 86
    .line 87
    .line 88
    const/high16 v26, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v21, 0x41635c29    # 14.21f

    .line 91
    .line 92
    .line 93
    const v22, 0x400d70a4    # 2.21f

    .line 94
    .line 95
    .line 96
    const v23, 0x415b3333    # 13.7f

    .line 97
    .line 98
    .line 99
    const/high16 v24, 0x40000000    # 2.0f

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40c00000    # 6.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40800000    # 4.0f

    .line 112
    .line 113
    const/high16 v26, 0x40800000    # 4.0f

    .line 114
    .line 115
    const v21, 0x409ccccd    # 4.9f

    .line 116
    .line 117
    .line 118
    const/high16 v22, 0x40000000    # 2.0f

    .line 119
    .line 120
    const/high16 v23, 0x40800000    # 4.0f

    .line 121
    .line 122
    const v24, 0x4039999a    # 2.9f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x40000000    # 2.0f

    .line 134
    .line 135
    const/high16 v26, 0x40000000    # 2.0f

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const v22, 0x3f8ccccd    # 1.1f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41400000    # 12.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v26, -0x40000000    # -2.0f

    .line 156
    .line 157
    const v21, 0x3f8ccccd    # 1.1f

    .line 158
    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/high16 v23, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v24, -0x4099999a    # -0.9f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x410d47ae    # 8.83f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x419b47ae    # 19.41f

    .line 177
    .line 178
    .line 179
    const v26, 0x40ed1eb8    # 7.41f

    .line 180
    .line 181
    .line 182
    const/high16 v21, 0x41a00000    # 20.0f

    .line 183
    .line 184
    const v22, 0x4104cccd    # 8.3f

    .line 185
    .line 186
    .line 187
    const v23, 0x419e51ec    # 19.79f

    .line 188
    .line 189
    .line 190
    const v24, 0x40f947ae    # 7.79f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x4195eb85    # 18.74f

    .line 200
    .line 201
    .line 202
    const v6, 0x417bd70a    # 15.74f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v25, -0x404b851f    # -1.41f

    .line 212
    .line 213
    .line 214
    const/16 v26, 0x0

    .line 215
    .line 216
    const v21, -0x413851ec    # -0.39f

    .line 217
    .line 218
    .line 219
    const v22, 0x3ec7ae14    # 0.39f

    .line 220
    .line 221
    .line 222
    const v23, -0x407d70a4    # -1.02f

    .line 223
    .line 224
    .line 225
    const v24, 0x3ec7ae14    # 0.39f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, -0x4068f5c3    # -1.18f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, -0x3f7bd70a    # -4.13f

    .line 238
    .line 239
    .line 240
    const v26, -0x40e8f5c3    # -0.59f

    .line 241
    .line 242
    .line 243
    const v21, -0x4055c28f    # -1.33f

    .line 244
    .line 245
    .line 246
    const v22, 0x3f35c28f    # 0.71f

    .line 247
    .line 248
    .line 249
    const v23, -0x3fbf5c29    # -3.01f

    .line 250
    .line 251
    .line 252
    const v24, 0x3f07ae14    # 0.53f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x3f000000    # 0.5f

    .line 259
    .line 260
    const v26, -0x3f5428f6    # -5.37f

    .line 261
    .line 262
    .line 263
    const v21, -0x403d70a4    # -1.52f

    .line 264
    .line 265
    .line 266
    const v22, -0x403d70a4    # -1.52f

    .line 267
    .line 268
    .line 269
    const v23, -0x40533333    # -1.35f

    .line 270
    .line 271
    .line 272
    const v24, -0x3f7d70a4    # -4.08f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, 0x407ccccd    # 3.95f

    .line 279
    .line 280
    .line 281
    const/16 v26, 0x0

    .line 282
    .line 283
    const v21, 0x3f947ae1    # 1.16f

    .line 284
    .line 285
    .line 286
    const v22, -0x40b0a3d7    # -0.81f

    .line 287
    .line 288
    .line 289
    const v23, 0x4031eb85    # 2.78f

    .line 290
    .line 291
    .line 292
    const v24, -0x40b0a3d7    # -0.81f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, 0x3f8b851f    # 1.09f

    .line 299
    .line 300
    .line 301
    const v26, 0x4091999a    # 4.55f

    .line 302
    .line 303
    .line 304
    const v21, 0x3fc66666    # 1.55f

    .line 305
    .line 306
    .line 307
    const v22, 0x3f8a3d71    # 1.08f

    .line 308
    .line 309
    .line 310
    const v23, 0x3ff33333    # 1.9f

    .line 311
    .line 312
    .line 313
    const v24, 0x40428f5c    # 3.04f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x3f970a3d    # 1.18f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, 0x417bd70a    # 15.74f

    .line 326
    .line 327
    .line 328
    const v26, 0x4195eb85    # 18.74f

    .line 329
    .line 330
    .line 331
    const v21, 0x41810a3d    # 16.13f

    .line 332
    .line 333
    .line 334
    const v22, 0x418dc28f    # 17.72f

    .line 335
    .line 336
    .line 337
    const v23, 0x41810a3d    # 16.13f

    .line 338
    .line 339
    .line 340
    const v24, 0x4192cccd    # 18.35f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x41100000    # 9.0f

    .line 350
    .line 351
    const/high16 v6, 0x41600000    # 14.0f

    .line 352
    .line 353
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v25, -0x40800000    # -1.0f

    .line 357
    .line 358
    const/high16 v26, -0x40800000    # -1.0f

    .line 359
    .line 360
    const v21, -0x40f33333    # -0.55f

    .line 361
    .line 362
    .line 363
    const/16 v22, 0x0

    .line 364
    .line 365
    const/high16 v23, -0x40800000    # -1.0f

    .line 366
    .line 367
    const v24, -0x4119999a    # -0.45f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x40600000    # 3.5f

    .line 374
    .line 375
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x41940000    # 18.5f

    .line 379
    .line 380
    const/high16 v6, 0x41100000    # 9.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x41600000    # 14.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/16 v16, 0x3800

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const/high16 v6, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v8, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v7, 0x0

    .line 406
    const/high16 v9, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v12, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const/4 v14, 0x0

    .line 412
    const/4 v15, 0x0

    .line 413
    const-string v4, ""

    .line 414
    .line 415
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 416
    .line 417
    .line 418
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 423
    .line 424
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 425
    .line 426
    .line 427
    move-result-wide v6

    .line 428
    const/4 v0, 0x0

    .line 429
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41380000    # 11.5f

    .line 446
    .line 447
    const/high16 v2, 0x41680000    # 14.5f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, -0x40400000    # -1.5f

    .line 453
    .line 454
    const/4 v2, 0x0

    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v18, 0x40400000    # 3.0f

    .line 459
    .line 460
    const/16 v19, 0x0

    .line 461
    .line 462
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 463
    .line 464
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 465
    .line 466
    const/16 v16, 0x1

    .line 467
    .line 468
    const/16 v17, 0x1

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    const/16 v16, 0x3800

    .line 483
    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    const/high16 v6, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/high16 v12, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v13, 0x0

    .line 492
    const/4 v14, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/rounded/PlagiarismKt;->_plagiarism:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method

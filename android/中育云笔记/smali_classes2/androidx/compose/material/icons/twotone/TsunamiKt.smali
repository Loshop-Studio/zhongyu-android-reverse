.class public final Landroidx/compose/material/icons/twotone/TsunamiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTsunami(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Tsunami"

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
    const v4, 0x408147ae    # 4.04f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x3fa66666    # 1.3f

    .line 79
    .line 80
    .line 81
    const v26, -0x40a147ae    # -0.87f

    .line 82
    .line 83
    .line 84
    const v21, 0x3ef0a3d7    # 0.47f

    .line 85
    .line 86
    .line 87
    const v22, -0x418a3d71    # -0.24f

    .line 88
    .line 89
    .line 90
    const v23, 0x3f2e147b    # 0.68f

    .line 91
    .line 92
    .line 93
    const v24, -0x412e147b    # -0.41f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x40728f5c    # 3.79f

    .line 102
    .line 103
    .line 104
    const v26, 0x3fa8f5c3    # 1.32f

    .line 105
    .line 106
    .line 107
    const/high16 v21, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v22, 0x3fbd70a4    # 1.48f

    .line 110
    .line 111
    .line 112
    const v23, 0x40447ae1    # 3.07f

    .line 113
    .line 114
    .line 115
    const v24, 0x3fb1eb85    # 1.39f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41000000    # 8.0f

    .line 122
    .line 123
    const/high16 v26, 0x41280000    # 10.5f

    .line 124
    .line 125
    const v21, 0x41066666    # 8.4f

    .line 126
    .line 127
    .line 128
    const v22, 0x415451ec    # 13.27f

    .line 129
    .line 130
    .line 131
    const/high16 v23, 0x41000000    # 8.0f

    .line 132
    .line 133
    const v24, 0x413eb852    # 11.92f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x3fbc28f6    # 1.47f

    .line 140
    .line 141
    .line 142
    const v26, -0x3f7147ae    # -4.46f

    .line 143
    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const v22, -0x402a3d71    # -1.67f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f0a3d71    # 0.54f

    .line 151
    .line 152
    .line 153
    const v24, -0x3fb28f5c    # -3.21f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x408147ae    # 4.04f

    .line 160
    .line 161
    .line 162
    const/high16 v26, 0x41600000    # 14.0f

    .line 163
    .line 164
    const v21, 0x40cd1eb8    # 6.41f

    .line 165
    .line 166
    .line 167
    const v22, 0x40f0a3d7    # 7.52f

    .line 168
    .line 169
    .line 170
    const v23, 0x4089999a    # 4.3f

    .line 171
    .line 172
    .line 173
    const v24, 0x41275c29    # 10.46f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/16 v16, 0x3800

    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const v6, 0x3e99999a    # 0.3f

    .line 191
    .line 192
    .line 193
    const v8, 0x3e99999a    # 0.3f

    .line 194
    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const/high16 v9, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/high16 v12, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const/4 v14, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    const-string v4, ""

    .line 205
    .line 206
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 214
    .line 215
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    const/4 v2, 0x0

    .line 220
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const v4, 0x418d0a3d    # 17.63f

    .line 237
    .line 238
    .line 239
    const/high16 v6, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, -0x3f2a8f5c    # -6.67f

    .line 245
    .line 246
    .line 247
    const/16 v26, 0x0

    .line 248
    .line 249
    const v21, -0x40d70a3d    # -0.66f

    .line 250
    .line 251
    .line 252
    const v22, 0x3efae148    # 0.49f

    .line 253
    .line 254
    .line 255
    const v23, -0x3fc51eb8    # -2.92f

    .line 256
    .line 257
    .line 258
    const v24, 0x4030a3d7    # 2.76f

    .line 259
    .line 260
    .line 261
    move-object/from16 v20, v2

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x40000000    # 2.0f

    .line 267
    .line 268
    const/high16 v26, 0x41980000    # 19.0f

    .line 269
    .line 270
    const v21, 0x405b851f    # 3.43f

    .line 271
    .line 272
    .line 273
    const v22, 0x41983d71    # 19.03f

    .line 274
    .line 275
    .line 276
    const v23, 0x4029999a    # 2.65f

    .line 277
    .line 278
    .line 279
    const/high16 v24, 0x41980000    # 19.0f

    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40000000    # 2.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, 0x40551eb8    # 3.33f

    .line 290
    .line 291
    .line 292
    const v26, -0x4091eb85    # -0.93f

    .line 293
    .line 294
    .line 295
    const v21, 0x3f947ae1    # 1.16f

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const v23, 0x40133333    # 2.3f

    .line 301
    .line 302
    .line 303
    const v24, -0x415c28f6    # -0.32f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x40d570a4    # 6.67f

    .line 310
    .line 311
    .line 312
    const/16 v26, 0x0

    .line 313
    .line 314
    const v21, 0x4003d70a    # 2.06f

    .line 315
    .line 316
    .line 317
    const v22, 0x3f9c28f6    # 1.22f

    .line 318
    .line 319
    .line 320
    const v23, 0x4093851f    # 4.61f

    .line 321
    .line 322
    .line 323
    const v24, 0x3f9c28f6    # 1.22f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, 0x41b00000    # 22.0f

    .line 333
    .line 334
    const/high16 v26, 0x41a80000    # 21.0f

    .line 335
    .line 336
    const v21, 0x419d999a    # 19.7f

    .line 337
    .line 338
    .line 339
    const v22, 0x41a570a4    # 20.68f

    .line 340
    .line 341
    .line 342
    const v23, 0x41a6b852    # 20.84f

    .line 343
    .line 344
    .line 345
    const/high16 v24, 0x41a80000    # 21.0f

    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, -0x40000000    # -2.0f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, -0x3faae148    # -3.33f

    .line 356
    .line 357
    .line 358
    const v26, -0x4050a3d7    # -1.37f

    .line 359
    .line 360
    .line 361
    const v21, -0x40d70a3d    # -0.66f

    .line 362
    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    const/high16 v23, -0x40400000    # -1.5f

    .line 367
    .line 368
    const v24, -0x435c28f6    # -0.02f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x41400000    # 12.0f

    .line 375
    .line 376
    const v26, 0x418d0a3d    # 17.63f

    .line 377
    .line 378
    .line 379
    const v21, 0x416deb85    # 14.87f

    .line 380
    .line 381
    .line 382
    const v22, 0x41a370a4    # 20.43f

    .line 383
    .line 384
    .line 385
    const v23, 0x4148a3d7    # 12.54f

    .line 386
    .line 387
    .line 388
    const v24, 0x41903d71    # 18.03f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const/high16 v6, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v8, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v7, 0x0

    .line 406
    const-string v4, ""

    .line 407
    .line 408
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 409
    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 416
    .line 417
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 418
    .line 419
    .line 420
    move-result-wide v6

    .line 421
    const/4 v0, 0x0

    .line 422
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    const v0, 0x419aa3d7    # 19.33f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x41400000    # 12.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41b00000    # 22.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, -0x40000000    # -2.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, -0x3fd51eb8    # -2.67f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x41800000    # 16.0f

    .line 463
    .line 464
    const v18, 0x40d570a4    # 6.67f

    .line 465
    .line 466
    .line 467
    const/high16 v13, 0x418c0000    # 17.5f

    .line 468
    .line 469
    const/high16 v14, 0x41200000    # 10.0f

    .line 470
    .line 471
    const/high16 v15, 0x41800000    # 16.0f

    .line 472
    .line 473
    const/high16 v16, 0x41080000    # 8.5f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, 0x3f8b851f    # 1.09f

    .line 479
    .line 480
    .line 481
    const v18, -0x3faa3d71    # -3.34f

    .line 482
    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, -0x407d70a4    # -1.02f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ec28f5c    # 0.38f

    .line 489
    .line 490
    .line 491
    const v16, -0x402147ae    # -1.74f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x41600000    # 14.0f

    .line 498
    .line 499
    const/high16 v18, 0x40400000    # 3.0f

    .line 500
    .line 501
    const v13, 0x417b851f    # 15.72f

    .line 502
    .line 503
    .line 504
    const v14, 0x4047ae14    # 3.12f

    .line 505
    .line 506
    .line 507
    const v15, 0x417170a4    # 15.09f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x40400000    # 3.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, 0x4000a3d7    # 2.01f

    .line 516
    .line 517
    .line 518
    const/high16 v18, 0x41680000    # 14.5f

    .line 519
    .line 520
    const v13, 0x40eb851f    # 7.36f

    .line 521
    .line 522
    .line 523
    const/high16 v14, 0x40400000    # 3.0f

    .line 524
    .line 525
    const v15, 0x4009999a    # 2.15f

    .line 526
    .line 527
    .line 528
    const v16, 0x41007ae1    # 8.03f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, -0x43dc28f6    # -0.01f

    .line 535
    .line 536
    .line 537
    const/high16 v18, 0x40000000    # 2.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/4 v14, 0x0

    .line 541
    const v15, -0x43dc28f6    # -0.01f

    .line 542
    .line 543
    .line 544
    const/high16 v16, 0x40000000    # 2.0f

    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x40551eb8    # 3.33f

    .line 550
    .line 551
    .line 552
    const v18, -0x4091eb85    # -0.93f

    .line 553
    .line 554
    .line 555
    const v13, 0x3f947ae1    # 1.16f

    .line 556
    .line 557
    .line 558
    const v15, 0x40133333    # 2.3f

    .line 559
    .line 560
    .line 561
    const v16, -0x415c28f6    # -0.32f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x40d570a4    # 6.67f

    .line 568
    .line 569
    .line 570
    const/16 v18, 0x0

    .line 571
    .line 572
    const v13, 0x4003d70a    # 2.06f

    .line 573
    .line 574
    .line 575
    const v14, 0x3f9c28f6    # 1.22f

    .line 576
    .line 577
    .line 578
    const v15, 0x4093851f    # 4.61f

    .line 579
    .line 580
    .line 581
    const v16, 0x3f9c28f6    # 1.22f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, 0x40551eb8    # 3.33f

    .line 591
    .line 592
    .line 593
    const v18, 0x3f6e147b    # 0.93f

    .line 594
    .line 595
    .line 596
    const v13, 0x3f83d70a    # 1.03f

    .line 597
    .line 598
    .line 599
    const v14, 0x3f1c28f6    # 0.61f

    .line 600
    .line 601
    .line 602
    const v15, 0x400ae148    # 2.17f

    .line 603
    .line 604
    .line 605
    const v16, 0x3f6e147b    # 0.93f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, -0x40000000    # -2.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, -0x3faae148    # -3.33f

    .line 617
    .line 618
    .line 619
    const v18, -0x4050a3d7    # -1.37f

    .line 620
    .line 621
    .line 622
    const v13, -0x40d70a3d    # -0.66f

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const/high16 v15, -0x40400000    # -1.5f

    .line 627
    .line 628
    const v16, -0x435c28f6    # -0.02f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, -0x3f2a8f5c    # -6.67f

    .line 635
    .line 636
    .line 637
    const/16 v18, 0x0

    .line 638
    .line 639
    const v13, -0x3f8ccccd    # -3.8f

    .line 640
    .line 641
    .line 642
    const v14, 0x40333333    # 2.8f

    .line 643
    .line 644
    .line 645
    const v15, -0x3f3c28f6    # -6.12f

    .line 646
    .line 647
    .line 648
    const v16, 0x3ecccccd    # 0.4f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x40970a3d    # -0.91f

    .line 655
    .line 656
    .line 657
    const v18, 0x3f2147ae    # 0.63f

    .line 658
    .line 659
    .line 660
    const v13, -0x4099999a    # -0.9f

    .line 661
    .line 662
    .line 663
    const v14, 0x3f2b851f    # 0.67f

    .line 664
    .line 665
    .line 666
    const v15, -0x40f5c28f    # -0.54f

    .line 667
    .line 668
    .line 669
    const v16, 0x3ed1eb85    # 0.41f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v17, 0x41200000    # 10.0f

    .line 676
    .line 677
    const/high16 v18, 0x41280000    # 10.5f

    .line 678
    .line 679
    const v13, 0x41263d71    # 10.39f

    .line 680
    .line 681
    .line 682
    const v14, 0x414d1eb8    # 12.82f

    .line 683
    .line 684
    .line 685
    const/high16 v15, 0x41200000    # 10.0f

    .line 686
    .line 687
    const v16, 0x413b3333    # 11.7f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, 0x4086b852    # 4.21f

    .line 694
    .line 695
    .line 696
    const v18, -0x3f5570a4    # -5.33f

    .line 697
    .line 698
    .line 699
    const/4 v13, 0x0

    .line 700
    const v14, -0x3fdae148    # -2.58f

    .line 701
    .line 702
    .line 703
    const v15, 0x3fe28f5c    # 1.77f

    .line 704
    .line 705
    .line 706
    const v16, -0x3f6851ec    # -4.74f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v17, 0x41600000    # 14.0f

    .line 713
    .line 714
    const v18, 0x40d570a4    # 6.67f

    .line 715
    .line 716
    .line 717
    const v13, 0x416147ae    # 14.08f

    .line 718
    .line 719
    .line 720
    const v14, 0x40b5c28f    # 5.68f

    .line 721
    .line 722
    .line 723
    const/high16 v15, 0x41600000    # 14.0f

    .line 724
    .line 725
    const v16, 0x40c6147b    # 6.19f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v17, 0x419aa3d7    # 19.33f

    .line 732
    .line 733
    .line 734
    const/high16 v18, 0x41400000    # 12.0f

    .line 735
    .line 736
    const/high16 v13, 0x41600000    # 14.0f

    .line 737
    .line 738
    const v14, 0x4119c28f    # 9.61f

    .line 739
    .line 740
    .line 741
    const v15, 0x41831eb8    # 16.39f

    .line 742
    .line 743
    .line 744
    const/high16 v16, 0x41400000    # 12.0f

    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x4112147b    # 9.13f

    .line 753
    .line 754
    .line 755
    const v2, 0x41673333    # 14.45f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x3f8d70a4    # -3.79f

    .line 762
    .line 763
    .line 764
    const v18, -0x40570a3d    # -1.32f

    .line 765
    .line 766
    .line 767
    const v13, -0x40c7ae14    # -0.72f

    .line 768
    .line 769
    .line 770
    const v14, 0x3d8f5c29    # 0.07f

    .line 771
    .line 772
    .line 773
    const v15, -0x401ae148    # -1.79f

    .line 774
    .line 775
    .line 776
    const v16, 0x3e23d70a    # 0.16f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, -0x4059999a    # -1.3f

    .line 783
    .line 784
    .line 785
    const v18, 0x3f5eb852    # 0.87f

    .line 786
    .line 787
    .line 788
    const v13, -0x40e147ae    # -0.62f

    .line 789
    .line 790
    .line 791
    const v14, 0x3eeb851f    # 0.46f

    .line 792
    .line 793
    .line 794
    const v15, -0x40ae147b    # -0.82f

    .line 795
    .line 796
    .line 797
    const v16, 0x3f2147ae    # 0.63f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, 0x40adc28f    # 5.43f

    .line 804
    .line 805
    .line 806
    const v18, -0x3f0147ae    # -7.96f

    .line 807
    .line 808
    .line 809
    const v13, 0x3e8a3d71    # 0.27f

    .line 810
    .line 811
    .line 812
    const v14, -0x3f9e147b    # -3.53f

    .line 813
    .line 814
    .line 815
    const v15, 0x401851ec    # 2.38f

    .line 816
    .line 817
    .line 818
    const v16, -0x3f30a3d7    # -6.48f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v17, 0x41000000    # 8.0f

    .line 825
    .line 826
    const/high16 v18, 0x41280000    # 10.5f

    .line 827
    .line 828
    const v13, 0x4108a3d7    # 8.54f

    .line 829
    .line 830
    .line 831
    const v14, 0x40e947ae    # 7.29f

    .line 832
    .line 833
    .line 834
    const/high16 v15, 0x41000000    # 8.0f

    .line 835
    .line 836
    const v16, 0x410d47ae    # 8.83f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v17, 0x4112147b    # 9.13f

    .line 843
    .line 844
    .line 845
    const v18, 0x41673333    # 14.45f

    .line 846
    .line 847
    .line 848
    const/high16 v13, 0x41000000    # 8.0f

    .line 849
    .line 850
    const v14, 0x413eb852    # 11.92f

    .line 851
    .line 852
    .line 853
    const v15, 0x41066666    # 8.4f

    .line 854
    .line 855
    .line 856
    const v16, 0x415451ec    # 13.27f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const/16 v16, 0x3800

    .line 870
    .line 871
    const/16 v17, 0x0

    .line 872
    .line 873
    const/high16 v6, 0x3f800000    # 1.0f

    .line 874
    .line 875
    const/4 v7, 0x0

    .line 876
    const/high16 v12, 0x3f800000    # 1.0f

    .line 877
    .line 878
    const/4 v13, 0x0

    .line 879
    const/4 v14, 0x0

    .line 880
    const/4 v15, 0x0

    .line 881
    const-string v4, ""

    .line 882
    .line 883
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    sput-object v0, Landroidx/compose/material/icons/twotone/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    return-object v0
.end method

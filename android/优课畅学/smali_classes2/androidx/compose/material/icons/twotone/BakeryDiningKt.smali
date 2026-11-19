.class public final Landroidx/compose/material/icons/twotone/BakeryDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBakeryDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BakeryDining"

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
    const v4, 0x40f33333    # 7.6f

    .line 71
    .line 72
    .line 73
    const v6, 0x410ab852    # 8.67f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3f4ccccd    # 0.8f

    .line 80
    .line 81
    .line 82
    const v6, -0x3fff5c29    # -2.01f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x416147ae    # -0.31f

    .line 89
    .line 90
    .line 91
    const v26, 0x3f0a3d71    # 0.54f

    .line 92
    .line 93
    .line 94
    const v21, -0x419eb852    # -0.22f

    .line 95
    .line 96
    .line 97
    const v22, 0x3db851ec    # 0.09f

    .line 98
    .line 99
    .line 100
    const v23, -0x4151eb85    # -0.34f

    .line 101
    .line 102
    .line 103
    const v24, 0x3e9eb852    # 0.31f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x40bf5c29    # 5.98f

    .line 112
    .line 113
    .line 114
    const v6, 0x4019999a    # 2.4f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x3f9d70a4    # 1.23f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, -0x3f233333    # -6.9f

    .line 127
    .line 128
    .line 129
    const v6, -0x40e147ae    # -0.62f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, 0x40f33333    # 7.6f

    .line 136
    .line 137
    .line 138
    const v26, 0x410ab852    # 8.67f

    .line 139
    .line 140
    .line 141
    const/high16 v21, 0x41040000    # 8.25f

    .line 142
    .line 143
    const/high16 v22, 0x410c0000    # 8.75f

    .line 144
    .line 145
    const v23, 0x40fd1eb8    # 7.91f

    .line 146
    .line 147
    .line 148
    const v24, 0x4108a3d7    # 8.54f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const v4, 0x4180cccd    # 16.1f

    .line 212
    .line 213
    .line 214
    const v6, 0x40447ae1    # 3.07f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x3f51eb85    # 0.82f

    .line 221
    .line 222
    .line 223
    const v26, 0x3f547ae1    # 0.83f

    .line 224
    .line 225
    .line 226
    const v21, -0x4175c28f    # -0.27f

    .line 227
    .line 228
    .line 229
    const v22, 0x3f07ae14    # 0.53f

    .line 230
    .line 231
    .line 232
    const v23, 0x3e947ae1    # 0.29f

    .line 233
    .line 234
    .line 235
    const v24, 0x3f8b851f    # 1.09f

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, -0x40a8f5c3    # -0.84f

    .line 244
    .line 245
    .line 246
    const v6, 0x3fd70a3d    # 1.68f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, -0x4075c28f    # -1.08f

    .line 253
    .line 254
    .line 255
    const v6, -0x3fd28f5c    # -2.71f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x4180cccd    # 16.1f

    .line 262
    .line 263
    .line 264
    const v6, 0x40447ae1    # 3.07f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const v6, 0x3e99999a    # 0.3f

    .line 278
    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const-string v4, ""

    .line 282
    .line 283
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    const/4 v2, 0x0

    .line 297
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const v4, 0x4155c28f    # 13.36f

    .line 314
    .line 315
    .line 316
    const v6, 0x40dfae14    # 6.99f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v4, -0x3fd28f5c    # -2.71f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v25, -0x41000000    # -0.5f

    .line 329
    .line 330
    const v26, 0x3f0a3d71    # 0.54f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const v23, -0x40f851ec    # -0.53f

    .line 336
    .line 337
    .line 338
    const v24, 0x3e6b851f    # 0.23f

    .line 339
    .line 340
    .line 341
    move-object/from16 v20, v2

    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x41073333    # 8.45f

    .line 347
    .line 348
    .line 349
    const v6, 0x3f451eb8    # 0.77f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v4, 0x400ae148    # 2.17f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, -0x3ef8cccd    # -8.45f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x4155c28f    # 13.36f

    .line 368
    .line 369
    .line 370
    const v26, 0x40dfae14    # 6.99f

    .line 371
    .line 372
    .line 373
    const v21, 0x415e147b    # 13.88f

    .line 374
    .line 375
    .line 376
    const v22, 0x40e70a3d    # 7.22f

    .line 377
    .line 378
    .line 379
    const v23, 0x415a147b    # 13.63f

    .line 380
    .line 381
    .line 382
    const v24, 0x40dfae14    # 6.99f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const v6, 0x3e99999a    # 0.3f

    .line 396
    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 409
    .line 410
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 411
    .line 412
    .line 413
    move-result-wide v6

    .line 414
    const/4 v2, 0x0

    .line 415
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 429
    .line 430
    .line 431
    const v4, 0x419347ae    # 18.41f

    .line 432
    .line 433
    .line 434
    const v6, 0x4117851f    # 9.47f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, -0x40b33333    # -0.8f

    .line 441
    .line 442
    .line 443
    const v6, -0x3fff5c29    # -2.01f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, -0x40d1eb85    # -0.68f

    .line 450
    .line 451
    .line 452
    const v26, 0x3ed70a3d    # 0.42f

    .line 453
    .line 454
    .line 455
    const v21, -0x416147ae    # -0.31f

    .line 456
    .line 457
    .line 458
    const v22, -0x420a3d71    # -0.12f

    .line 459
    .line 460
    .line 461
    const v23, -0x40d9999a    # -0.65f

    .line 462
    .line 463
    .line 464
    const v24, 0x3db851ec    # 0.09f

    .line 465
    .line 466
    .line 467
    move-object/from16 v20, v2

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, 0x40dccccd    # 6.9f

    .line 473
    .line 474
    .line 475
    const v6, -0x40e147ae    # -0.62f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x3f9d70a4    # 1.23f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v4, -0x3f40a3d7    # -5.98f

    .line 488
    .line 489
    .line 490
    const v6, 0x4019999a    # 2.4f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v25, 0x419347ae    # 18.41f

    .line 497
    .line 498
    .line 499
    const v26, 0x4117851f    # 9.47f

    .line 500
    .line 501
    .line 502
    const/high16 v21, 0x41960000    # 18.75f

    .line 503
    .line 504
    const v22, 0x411c7ae1    # 9.78f

    .line 505
    .line 506
    .line 507
    const v23, 0x41950a3d    # 18.63f

    .line 508
    .line 509
    .line 510
    const v24, 0x4118f5c3    # 9.56f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const v6, 0x3e99999a    # 0.3f

    .line 524
    .line 525
    .line 526
    const/4 v7, 0x0

    .line 527
    const-string v4, ""

    .line 528
    .line 529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 530
    .line 531
    .line 532
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 537
    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 539
    .line 540
    .line 541
    move-result-wide v6

    .line 542
    const/4 v2, 0x0

    .line 543
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 547
    .line 548
    .line 549
    move-result v10

    .line 550
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 557
    .line 558
    .line 559
    const v4, 0x419c28f6    # 19.52f

    .line 560
    .line 561
    .line 562
    const v6, 0x41563d71    # 13.39f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, 0x402ccccd    # 2.7f

    .line 569
    .line 570
    .line 571
    const v6, -0x4075c28f    # -1.08f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v4, 0x3f570a3d    # 0.84f

    .line 578
    .line 579
    .line 580
    const v6, 0x3fd70a3d    # 1.68f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v25, 0x3f51eb85    # 0.82f

    .line 587
    .line 588
    .line 589
    const v26, -0x40ab851f    # -0.83f

    .line 590
    .line 591
    .line 592
    const v21, 0x3f051eb8    # 0.52f

    .line 593
    .line 594
    .line 595
    const v22, 0x3e851eb8    # 0.26f

    .line 596
    .line 597
    .line 598
    const v23, 0x3f8b851f    # 1.09f

    .line 599
    .line 600
    .line 601
    const v24, -0x41666666    # -0.3f

    .line 602
    .line 603
    .line 604
    move-object/from16 v20, v2

    .line 605
    .line 606
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v4, 0x419c28f6    # 19.52f

    .line 610
    .line 611
    .line 612
    const v6, 0x41563d71    # 13.39f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const v6, 0x3e99999a    # 0.3f

    .line 626
    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    const-string v4, ""

    .line 630
    .line 631
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 632
    .line 633
    .line 634
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 639
    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 641
    .line 642
    .line 643
    move-result-wide v6

    .line 644
    const/4 v0, 0x0

    .line 645
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 649
    .line 650
    .line 651
    move-result v10

    .line 652
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 653
    .line 654
    .line 655
    move-result v11

    .line 656
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 659
    .line 660
    .line 661
    const/high16 v0, 0x41a40000    # 20.5f

    .line 662
    .line 663
    const v2, 0x412f0a3d    # 10.94f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v17, 0x3e19999a    # 0.15f

    .line 670
    .line 671
    .line 672
    const v18, -0x413851ec    # -0.39f

    .line 673
    .line 674
    .line 675
    const v13, 0x3e051eb8    # 0.13f

    .line 676
    .line 677
    .line 678
    const v14, -0x415c28f6    # -0.32f

    .line 679
    .line 680
    .line 681
    const v15, 0x3dcccccd    # 0.1f

    .line 682
    .line 683
    .line 684
    const v16, -0x41947ae1    # -0.23f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v17, -0x40400000    # -1.5f

    .line 691
    .line 692
    const v18, -0x3fc47ae1    # -2.93f

    .line 693
    .line 694
    .line 695
    const v13, 0x3e99999a    # 0.3f

    .line 696
    .line 697
    .line 698
    const v14, -0x40651eb8    # -1.21f

    .line 699
    .line 700
    .line 701
    const v15, -0x4151eb85    # -0.34f

    .line 702
    .line 703
    .line 704
    const v16, -0x3fe1eb85    # -2.47f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, -0x40b33333    # -0.8f

    .line 711
    .line 712
    .line 713
    const v2, -0x3fff5c29    # -2.01f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, -0x404b851f    # -1.41f

    .line 720
    .line 721
    .line 722
    const v18, -0x420a3d71    # -0.12f

    .line 723
    .line 724
    .line 725
    const v13, -0x41147ae1    # -0.46f

    .line 726
    .line 727
    .line 728
    const v14, -0x41c7ae14    # -0.18f

    .line 729
    .line 730
    .line 731
    const v15, -0x408ccccd    # -0.95f

    .line 732
    .line 733
    .line 734
    const v16, -0x41a8f5c3    # -0.21f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v17, -0x40fae148    # -0.52f

    .line 741
    .line 742
    .line 743
    const v18, -0x409c28f6    # -0.89f

    .line 744
    .line 745
    .line 746
    const v13, -0x421eb852    # -0.11f

    .line 747
    .line 748
    .line 749
    const v14, -0x41570a3d    # -0.33f

    .line 750
    .line 751
    .line 752
    const v15, -0x416b851f    # -0.29f

    .line 753
    .line 754
    .line 755
    const v16, -0x40deb852    # -0.63f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, 0x4155c28f    # 13.36f

    .line 762
    .line 763
    .line 764
    const/high16 v18, 0x40a00000    # 5.0f

    .line 765
    .line 766
    const v13, 0x416bae14    # 14.73f

    .line 767
    .line 768
    .line 769
    const v14, 0x40a947ae    # 5.29f

    .line 770
    .line 771
    .line 772
    const v15, 0x4160f5c3    # 14.06f

    .line 773
    .line 774
    .line 775
    const/high16 v16, 0x40a00000    # 5.0f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, -0x3fd28f5c    # -2.71f

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v17, 0x410ccccd    # 8.8f

    .line 787
    .line 788
    .line 789
    const v18, 0x40b9eb85    # 5.81f

    .line 790
    .line 791
    .line 792
    const v13, 0x411f0a3d    # 9.94f

    .line 793
    .line 794
    .line 795
    const/high16 v14, 0x40a00000    # 5.0f

    .line 796
    .line 797
    const v15, 0x411451ec    # 9.27f

    .line 798
    .line 799
    .line 800
    const v16, 0x40a947ae    # 5.29f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x410451ec    # 8.27f

    .line 807
    .line 808
    .line 809
    const v18, 0x40d6147b    # 6.69f

    .line 810
    .line 811
    .line 812
    const v13, 0x4108f5c3    # 8.56f

    .line 813
    .line 814
    .line 815
    const v14, 0x40c23d71    # 6.07f

    .line 816
    .line 817
    .line 818
    const v15, 0x4106147b    # 8.38f

    .line 819
    .line 820
    .line 821
    const v16, 0x40cbd70a    # 6.37f

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v17, 0x40db851f    # 6.86f

    .line 828
    .line 829
    .line 830
    const v18, 0x40d9eb85    # 6.81f

    .line 831
    .line 832
    .line 833
    const v13, 0x40f9eb85    # 7.81f

    .line 834
    .line 835
    .line 836
    const v14, 0x40d33333    # 6.6f

    .line 837
    .line 838
    .line 839
    const v15, 0x40ea3d71    # 7.32f

    .line 840
    .line 841
    .line 842
    const v16, 0x40d428f6    # 6.63f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, 0x3f4ccccd    # 0.8f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const/high16 v17, -0x40400000    # -1.5f

    .line 855
    .line 856
    const v18, 0x403b851f    # 2.93f

    .line 857
    .line 858
    .line 859
    const v13, -0x406b851f    # -1.16f

    .line 860
    .line 861
    .line 862
    const v14, 0x3eeb851f    # 0.46f

    .line 863
    .line 864
    .line 865
    const v15, -0x4019999a    # -1.8f

    .line 866
    .line 867
    .line 868
    const v16, 0x3fdc28f6    # 1.72f

    .line 869
    .line 870
    .line 871
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v0, 0x3e19999a    # 0.15f

    .line 875
    .line 876
    .line 877
    const v2, 0x3ec28f5c    # 0.38f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v17, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const v18, 0x41830a3d    # 16.38f

    .line 886
    .line 887
    .line 888
    const v13, 0x3f8ccccd    # 1.1f

    .line 889
    .line 890
    .line 891
    const v14, 0x4178cccd    # 15.55f

    .line 892
    .line 893
    .line 894
    const/high16 v15, 0x3f800000    # 1.0f

    .line 895
    .line 896
    const v16, 0x4178cccd    # 15.55f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, 0x3f9eb852    # 1.24f

    .line 903
    .line 904
    .line 905
    const v18, 0x400e147b    # 2.22f

    .line 906
    .line 907
    .line 908
    const/4 v13, 0x0

    .line 909
    const v14, 0x3f68f5c3    # 0.91f

    .line 910
    .line 911
    .line 912
    const v15, 0x3eeb851f    # 0.46f

    .line 913
    .line 914
    .line 915
    const v16, 0x3fdeb852    # 1.74f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v17, 0x40800000    # 4.0f

    .line 922
    .line 923
    const v18, -0x40e3d70a    # -0.61f

    .line 924
    .line 925
    .line 926
    const v13, 0x3fb5c28f    # 1.42f

    .line 927
    .line 928
    .line 929
    const v14, 0x3f6147ae    # 0.88f

    .line 930
    .line 931
    .line 932
    const v15, 0x401f5c29    # 2.49f

    .line 933
    .line 934
    .line 935
    const v16, 0x3e0f5c29    # 0.14f

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, 0x41387ae1    # 11.53f

    .line 942
    .line 943
    .line 944
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v17, 0x402851ec    # 2.63f

    .line 948
    .line 949
    .line 950
    const v18, 0x3f8147ae    # 1.01f

    .line 951
    .line 952
    .line 953
    const v13, 0x3fc28f5c    # 1.52f

    .line 954
    .line 955
    .line 956
    const v14, 0x3f428f5c    # 0.76f

    .line 957
    .line 958
    .line 959
    const v15, 0x3fee147b    # 1.86f

    .line 960
    .line 961
    .line 962
    const v16, 0x3f8147ae    # 1.01f

    .line 963
    .line 964
    .line 965
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const v17, 0x40270a3d    # 2.61f

    .line 969
    .line 970
    .line 971
    const v18, -0x3fd8f5c3    # -2.61f

    .line 972
    .line 973
    .line 974
    const/high16 v13, 0x3f800000    # 1.0f

    .line 975
    .line 976
    const/4 v14, 0x0

    .line 977
    const v15, 0x40270a3d    # 2.61f

    .line 978
    .line 979
    .line 980
    const v16, -0x40bae148    # -0.77f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v17, 0x41a40000    # 20.5f

    .line 987
    .line 988
    const v18, 0x412f0a3d    # 10.94f

    .line 989
    .line 990
    .line 991
    const/high16 v13, 0x41b80000    # 23.0f

    .line 992
    .line 993
    const v14, 0x4178a3d7    # 15.54f

    .line 994
    .line 995
    .line 996
    const v15, 0x41b70a3d    # 22.88f

    .line 997
    .line 998
    .line 999
    const v16, 0x417828f6    # 15.51f

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, 0x407851ec    # 3.88f

    .line 1009
    .line 1010
    .line 1011
    const v2, 0x418770a4    # 16.93f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v17, -0x40ae147b    # -0.82f

    .line 1018
    .line 1019
    .line 1020
    const v18, -0x40ab851f    # -0.83f

    .line 1021
    .line 1022
    .line 1023
    const v13, -0x40f851ec    # -0.53f

    .line 1024
    .line 1025
    .line 1026
    const v14, 0x3e851eb8    # 0.26f

    .line 1027
    .line 1028
    .line 1029
    const v15, -0x40747ae1    # -1.09f

    .line 1030
    .line 1031
    .line 1032
    const v16, -0x41666666    # -0.3f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const v0, 0x3fb47ae1    # 1.41f

    .line 1039
    .line 1040
    .line 1041
    const v2, -0x3fd1eb85    # -2.72f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const v0, 0x3f8a3d71    # 1.08f

    .line 1048
    .line 1049
    .line 1050
    const v2, 0x402d70a4    # 2.71f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v0, 0x407851ec    # 3.88f

    .line 1057
    .line 1058
    .line 1059
    const v2, 0x418770a4    # 16.93f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v0, 0x40f5c28f    # 7.68f

    .line 1069
    .line 1070
    .line 1071
    const v2, 0x417fd70a    # 15.99f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v0, -0x3fe66666    # -2.4f

    .line 1078
    .line 1079
    .line 1080
    const v2, -0x3f40a3d7    # -5.98f

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const v17, 0x40b2e148    # 5.59f

    .line 1087
    .line 1088
    .line 1089
    const v18, 0x4117851f    # 9.47f

    .line 1090
    .line 1091
    .line 1092
    const/high16 v13, 0x40a80000    # 5.25f

    .line 1093
    .line 1094
    const v14, 0x411c7ae1    # 9.78f

    .line 1095
    .line 1096
    .line 1097
    const v15, 0x40abd70a    # 5.37f

    .line 1098
    .line 1099
    .line 1100
    const v16, 0x4118f5c3    # 9.56f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v0, 0x4000a3d7    # 2.01f

    .line 1107
    .line 1108
    .line 1109
    const v2, -0x40b33333    # -0.8f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const v17, 0x3f2e147b    # 0.68f

    .line 1116
    .line 1117
    .line 1118
    const v18, 0x3ed70a3d    # 0.42f

    .line 1119
    .line 1120
    .line 1121
    const v13, 0x3e9eb852    # 0.31f

    .line 1122
    .line 1123
    .line 1124
    const v14, -0x420a3d71    # -0.12f

    .line 1125
    .line 1126
    .line 1127
    const v15, 0x3f266666    # 0.65f

    .line 1128
    .line 1129
    .line 1130
    const v16, 0x3da3d70a    # 0.08f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v0, 0x3f1eb852    # 0.62f

    .line 1137
    .line 1138
    .line 1139
    const v2, 0x40dccccd    # 6.9f

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1143
    .line 1144
    .line 1145
    const v0, 0x40f5c28f    # 7.68f

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v0, 0x415170a4    # 13.09f

    .line 1155
    .line 1156
    .line 1157
    const v2, 0x417fd70a    # 15.99f

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v0, -0x3ff51eb8    # -2.17f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const v0, -0x40bae148    # -0.77f

    .line 1170
    .line 1171
    .line 1172
    const v2, -0x3ef8cccd    # -8.45f

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const/high16 v17, 0x3f000000    # 0.5f

    .line 1179
    .line 1180
    const v18, -0x40f5c28f    # -0.54f

    .line 1181
    .line 1182
    .line 1183
    const v13, -0x430a3d71    # -0.03f

    .line 1184
    .line 1185
    .line 1186
    const v14, -0x416147ae    # -0.31f

    .line 1187
    .line 1188
    .line 1189
    const v15, 0x3e6b851f    # 0.23f

    .line 1190
    .line 1191
    .line 1192
    const v16, -0x40f5c28f    # -0.54f

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1196
    .line 1197
    .line 1198
    const v0, 0x402d70a4    # 2.71f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v18, 0x3f0a3d71    # 0.54f

    .line 1205
    .line 1206
    .line 1207
    const v13, 0x3e8a3d71    # 0.27f

    .line 1208
    .line 1209
    .line 1210
    const/4 v14, 0x0

    .line 1211
    const v15, 0x3f07ae14    # 0.53f

    .line 1212
    .line 1213
    .line 1214
    const v16, 0x3e6b851f    # 0.23f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v0, 0x415170a4    # 13.09f

    .line 1221
    .line 1222
    .line 1223
    const v2, 0x417fd70a    # 15.99f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    const v0, 0x41828f5c    # 16.32f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    const v0, -0x40628f5c    # -1.23f

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1242
    .line 1243
    .line 1244
    const v0, 0x3f1eb852    # 0.62f

    .line 1245
    .line 1246
    .line 1247
    const v2, -0x3f233333    # -6.9f

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1251
    .line 1252
    .line 1253
    const v17, 0x3f2e147b    # 0.68f

    .line 1254
    .line 1255
    .line 1256
    const v18, -0x4128f5c3    # -0.42f

    .line 1257
    .line 1258
    .line 1259
    const v13, 0x3cf5c28f    # 0.03f

    .line 1260
    .line 1261
    .line 1262
    const v14, -0x41570a3d    # -0.33f

    .line 1263
    .line 1264
    .line 1265
    const v15, 0x3ebd70a4    # 0.37f

    .line 1266
    .line 1267
    .line 1268
    const v16, -0x40f5c28f    # -0.54f

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1272
    .line 1273
    .line 1274
    const v0, 0x4000a3d7    # 2.01f

    .line 1275
    .line 1276
    .line 1277
    const v2, 0x3f4ccccd    # 0.8f

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1281
    .line 1282
    .line 1283
    const v17, 0x3e9eb852    # 0.31f

    .line 1284
    .line 1285
    .line 1286
    const v18, 0x3f0a3d71    # 0.54f

    .line 1287
    .line 1288
    .line 1289
    const v13, 0x3e6147ae    # 0.22f

    .line 1290
    .line 1291
    .line 1292
    const v14, 0x3db851ec    # 0.09f

    .line 1293
    .line 1294
    .line 1295
    const v15, 0x3eae147b    # 0.34f

    .line 1296
    .line 1297
    .line 1298
    const v16, 0x3e9eb852    # 0.31f

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1302
    .line 1303
    .line 1304
    const v0, 0x41828f5c    # 16.32f

    .line 1305
    .line 1306
    .line 1307
    const v2, 0x417fd70a    # 15.99f

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const v0, 0x41a0f5c3    # 20.12f

    .line 1317
    .line 1318
    .line 1319
    const v2, 0x418770a4    # 16.93f

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1323
    .line 1324
    .line 1325
    const v0, -0x4028f5c3    # -1.68f

    .line 1326
    .line 1327
    .line 1328
    const v2, -0x40a8f5c3    # -0.84f

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1332
    .line 1333
    .line 1334
    const v0, 0x3f8a3d71    # 1.08f

    .line 1335
    .line 1336
    .line 1337
    const v2, -0x3fd33333    # -2.7f

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    const v0, 0x3fb47ae1    # 1.41f

    .line 1344
    .line 1345
    .line 1346
    const v2, 0x402d70a4    # 2.71f

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1350
    .line 1351
    .line 1352
    const v17, 0x41a0f5c3    # 20.12f

    .line 1353
    .line 1354
    .line 1355
    const v18, 0x418770a4    # 16.93f

    .line 1356
    .line 1357
    .line 1358
    const v13, 0x41a9ae14    # 21.21f

    .line 1359
    .line 1360
    .line 1361
    const v14, 0x41850a3d    # 16.63f

    .line 1362
    .line 1363
    .line 1364
    const v15, 0x41a51eb8    # 20.64f

    .line 1365
    .line 1366
    .line 1367
    const v16, 0x4189851f    # 17.19f

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v2

    .line 1380
    const/16 v16, 0x3800

    .line 1381
    .line 1382
    const/16 v17, 0x0

    .line 1383
    .line 1384
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1385
    .line 1386
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1387
    .line 1388
    const/4 v7, 0x0

    .line 1389
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1390
    .line 1391
    const/4 v13, 0x0

    .line 1392
    const/4 v14, 0x0

    .line 1393
    const/4 v15, 0x0

    .line 1394
    const-string v4, ""

    .line 1395
    .line 1396
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    sput-object v0, Landroidx/compose/material/icons/twotone/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1405
    .line 1406
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1407
    .line 1408
    .line 1409
    return-object v0
.end method

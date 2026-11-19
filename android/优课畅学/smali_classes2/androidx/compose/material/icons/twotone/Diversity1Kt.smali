.class public final Landroidx/compose/material/icons/twotone/Diversity1Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiversity1(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Diversity1Kt;->_diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Diversity1"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v4, 0x3f9c28f6    # 1.22f

    .line 160
    .line 161
    .line 162
    const v6, 0x418ca3d7    # 17.58f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/16 v25, 0x0

    .line 169
    .line 170
    const v26, 0x419b70a4    # 19.43f

    .line 171
    .line 172
    .line 173
    const v21, 0x3ef5c28f    # 0.48f

    .line 174
    .line 175
    .line 176
    const v22, 0x418f3333    # 17.9f

    .line 177
    .line 178
    .line 179
    const v24, 0x4194f5c3    # 18.62f

    .line 180
    .line 181
    .line 182
    move-object/from16 v20, v2

    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x41a80000    # 21.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x40900000    # 4.5f

    .line 193
    .line 194
    const/4 v6, 0x0

    .line 195
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, -0x4031eb85    # -1.61f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v25, 0x3f2147ae    # 0.63f

    .line 205
    .line 206
    .line 207
    const v26, -0x3fed70a4    # -2.29f

    .line 208
    .line 209
    .line 210
    const/16 v21, 0x0

    .line 211
    .line 212
    const v22, -0x40ab851f    # -0.83f

    .line 213
    .line 214
    .line 215
    const v23, 0x3e6b851f    # 0.23f

    .line 216
    .line 217
    .line 218
    const v24, -0x4031eb85    # -1.61f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v26, 0x41880000    # 17.0f

    .line 227
    .line 228
    const v21, 0x409851ec    # 4.76f

    .line 229
    .line 230
    .line 231
    const v22, 0x418851ec    # 17.04f

    .line 232
    .line 233
    .line 234
    const v23, 0x408c7ae1    # 4.39f

    .line 235
    .line 236
    .line 237
    const/high16 v24, 0x41880000    # 17.0f

    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v25, 0x3f9c28f6    # 1.22f

    .line 243
    .line 244
    .line 245
    const v26, 0x418ca3d7    # 17.58f

    .line 246
    .line 247
    .line 248
    const v21, 0x4040a3d7    # 3.01f

    .line 249
    .line 250
    .line 251
    const/high16 v22, 0x41880000    # 17.0f

    .line 252
    .line 253
    const v23, 0x40047ae1    # 2.07f

    .line 254
    .line 255
    .line 256
    const v24, 0x4189ae14    # 17.21f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const/high16 v6, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const-string v4, ""

    .line 273
    .line 274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 282
    .line 283
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    const/4 v2, 0x0

    .line 288
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x41a00000    # 20.0f

    .line 305
    .line 306
    const/high16 v6, 0x41600000    # 14.0f

    .line 307
    .line 308
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v4, -0x40000000    # -2.0f

    .line 312
    .line 313
    const/4 v6, 0x0

    .line 314
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v26, 0x40800000    # 4.0f

    .line 318
    .line 319
    const/high16 v21, 0x40000000    # 2.0f

    .line 320
    .line 321
    const/high16 v22, 0x40000000    # 2.0f

    .line 322
    .line 323
    const/16 v23, 0x0

    .line 324
    .line 325
    const/16 v24, 0x1

    .line 326
    .line 327
    const/16 v25, 0x1

    .line 328
    .line 329
    move-object/from16 v20, v2

    .line 330
    .line 331
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v26, -0x3f800000    # -4.0f

    .line 335
    .line 336
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const/high16 v6, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    const-string v4, ""

    .line 347
    .line 348
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    const/4 v2, 0x0

    .line 362
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    const v4, 0x41b63d71    # 22.78f

    .line 379
    .line 380
    .line 381
    const v6, 0x418ca3d7    # 17.58f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v25, 0x41a00000    # 20.0f

    .line 388
    .line 389
    const/high16 v26, 0x41880000    # 17.0f

    .line 390
    .line 391
    const v21, 0x41af70a4    # 21.93f

    .line 392
    .line 393
    .line 394
    const v22, 0x4189ae14    # 17.21f

    .line 395
    .line 396
    .line 397
    const v23, 0x41a7eb85    # 20.99f

    .line 398
    .line 399
    .line 400
    const/high16 v24, 0x41880000    # 17.0f

    .line 401
    .line 402
    move-object/from16 v20, v2

    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v25, -0x406f5c29    # -1.13f

    .line 408
    .line 409
    .line 410
    const v26, 0x3dcccccd    # 0.1f

    .line 411
    .line 412
    .line 413
    const v21, -0x413851ec    # -0.39f

    .line 414
    .line 415
    .line 416
    const/16 v22, 0x0

    .line 417
    .line 418
    const v23, -0x40bd70a4    # -0.76f

    .line 419
    .line 420
    .line 421
    const v24, 0x3d23d70a    # 0.04f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v25, 0x3f2147ae    # 0.63f

    .line 428
    .line 429
    .line 430
    const v26, 0x40128f5c    # 2.29f

    .line 431
    .line 432
    .line 433
    const v21, 0x3ecccccd    # 0.4f

    .line 434
    .line 435
    .line 436
    const v22, 0x3f2e147b    # 0.68f

    .line 437
    .line 438
    .line 439
    const v23, 0x3f2147ae    # 0.63f

    .line 440
    .line 441
    .line 442
    const v24, 0x3fbae148    # 1.46f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v4, 0x41a80000    # 21.0f

    .line 449
    .line 450
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x40900000    # 4.5f

    .line 454
    .line 455
    const/4 v6, 0x0

    .line 456
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, -0x40370a3d    # -1.57f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v25, 0x41b63d71    # 22.78f

    .line 466
    .line 467
    .line 468
    const v26, 0x418ca3d7    # 17.58f

    .line 469
    .line 470
    .line 471
    const/high16 v21, 0x41c00000    # 24.0f

    .line 472
    .line 473
    const v22, 0x4194f5c3    # 18.62f

    .line 474
    .line 475
    .line 476
    const v23, 0x41bc28f6    # 23.52f

    .line 477
    .line 478
    .line 479
    const v24, 0x418f3333    # 17.9f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/high16 v6, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const-string v4, ""

    .line 496
    .line 497
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 498
    .line 499
    .line 500
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 505
    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 507
    .line 508
    .line 509
    move-result-wide v6

    .line 510
    const/4 v2, 0x0

    .line 511
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 515
    .line 516
    .line 517
    move-result v10

    .line 518
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 525
    .line 526
    .line 527
    const v4, 0x4181eb85    # 16.24f

    .line 528
    .line 529
    .line 530
    const v6, 0x41853333    # 16.65f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v25, -0x3f7851ec    # -4.24f

    .line 537
    .line 538
    .line 539
    const v26, -0x4099999a    # -0.9f

    .line 540
    .line 541
    .line 542
    const v21, -0x406a3d71    # -1.17f

    .line 543
    .line 544
    .line 545
    const v22, -0x40fae148    # -0.52f

    .line 546
    .line 547
    .line 548
    const v23, -0x3fd8f5c3    # -2.61f

    .line 549
    .line 550
    .line 551
    const v24, -0x4099999a    # -0.9f

    .line 552
    .line 553
    .line 554
    move-object/from16 v20, v2

    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v26, 0x3f666666    # 0.9f

    .line 560
    .line 561
    .line 562
    const v21, -0x402f5c29    # -1.63f

    .line 563
    .line 564
    .line 565
    const/16 v22, 0x0

    .line 566
    .line 567
    const v23, -0x3fbb851f    # -3.07f

    .line 568
    .line 569
    .line 570
    const v24, 0x3ec7ae14    # 0.39f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v25, 0x40c00000    # 6.0f

    .line 577
    .line 578
    const v26, 0x419b1eb8    # 19.39f

    .line 579
    .line 580
    .line 581
    const v21, 0x40d5c28f    # 6.68f

    .line 582
    .line 583
    .line 584
    const v22, 0x41890a3d    # 17.13f

    .line 585
    .line 586
    .line 587
    const/high16 v23, 0x40c00000    # 6.0f

    .line 588
    .line 589
    const v24, 0x4191ae14    # 18.21f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x41a80000    # 21.0f

    .line 596
    .line 597
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v4, 0x41400000    # 12.0f

    .line 601
    .line 602
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v4, -0x4031eb85    # -1.61f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v25, 0x4181eb85    # 16.24f

    .line 612
    .line 613
    .line 614
    const v26, 0x41853333    # 16.65f

    .line 615
    .line 616
    .line 617
    const/high16 v21, 0x41900000    # 18.0f

    .line 618
    .line 619
    const v22, 0x4191ae14    # 18.21f

    .line 620
    .line 621
    .line 622
    const v23, 0x418a8f5c    # 17.32f

    .line 623
    .line 624
    .line 625
    const v24, 0x41890a3d    # 17.13f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v4, 0x41980000    # 19.0f

    .line 635
    .line 636
    const v6, 0x41011eb8    # 8.07f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v25, 0x3efae148    # 0.49f

    .line 643
    .line 644
    .line 645
    const v26, -0x40fae148    # -0.52f

    .line 646
    .line 647
    .line 648
    const v21, 0x3db851ec    # 0.09f

    .line 649
    .line 650
    .line 651
    const v22, -0x41947ae1    # -0.23f

    .line 652
    .line 653
    .line 654
    const v23, 0x3e8a3d71    # 0.27f

    .line 655
    .line 656
    .line 657
    const v24, -0x4128f5c3    # -0.42f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v25, 0x405b851f    # 3.43f

    .line 664
    .line 665
    .line 666
    const v26, -0x40c51eb8    # -0.73f

    .line 667
    .line 668
    .line 669
    const v21, 0x3f8ccccd    # 1.1f

    .line 670
    .line 671
    .line 672
    const v22, -0x41051eb8    # -0.49f

    .line 673
    .line 674
    .line 675
    const v23, 0x4010a3d7    # 2.26f

    .line 676
    .line 677
    .line 678
    const v24, -0x40c51eb8    # -0.73f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v26, 0x3f3ae148    # 0.73f

    .line 685
    .line 686
    .line 687
    const v21, 0x3f970a3d    # 1.18f

    .line 688
    .line 689
    .line 690
    const/16 v22, 0x0

    .line 691
    .line 692
    const v23, 0x40151eb8    # 2.33f

    .line 693
    .line 694
    .line 695
    const/high16 v24, 0x3e800000    # 0.25f

    .line 696
    .line 697
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v25, 0x3efae148    # 0.49f

    .line 701
    .line 702
    .line 703
    const v26, 0x3f051eb8    # 0.52f

    .line 704
    .line 705
    .line 706
    const v21, 0x3e6b851f    # 0.23f

    .line 707
    .line 708
    .line 709
    const v22, 0x3dcccccd    # 0.1f

    .line 710
    .line 711
    .line 712
    const v23, 0x3ecccccd    # 0.4f

    .line 713
    .line 714
    .line 715
    const v24, 0x3e947ae1    # 0.29f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v4, 0x41011eb8    # 8.07f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    const/high16 v6, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    const-string v4, ""

    .line 738
    .line 739
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 740
    .line 741
    .line 742
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 747
    .line 748
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 749
    .line 750
    .line 751
    move-result-wide v6

    .line 752
    const/4 v2, 0x0

    .line 753
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 757
    .line 758
    .line 759
    move-result v10

    .line 760
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 761
    .line 762
    .line 763
    move-result v11

    .line 764
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 767
    .line 768
    .line 769
    const/high16 v4, 0x41100000    # 9.0f

    .line 770
    .line 771
    const/high16 v6, 0x41400000    # 12.0f

    .line 772
    .line 773
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v25, 0x40400000    # 3.0f

    .line 777
    .line 778
    const/high16 v26, 0x40400000    # 3.0f

    .line 779
    .line 780
    const/16 v21, 0x0

    .line 781
    .line 782
    const v22, 0x3fd47ae1    # 1.66f

    .line 783
    .line 784
    .line 785
    const v23, 0x3fab851f    # 1.34f

    .line 786
    .line 787
    .line 788
    const/high16 v24, 0x40400000    # 3.0f

    .line 789
    .line 790
    move-object/from16 v20, v2

    .line 791
    .line 792
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v4, -0x40547ae1    # -1.34f

    .line 796
    .line 797
    .line 798
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 799
    .line 800
    const/high16 v7, 0x40400000    # 3.0f

    .line 801
    .line 802
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 806
    .line 807
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 808
    .line 809
    const v22, -0x402b851f    # -1.66f

    .line 810
    .line 811
    .line 812
    const v23, -0x40547ae1    # -1.34f

    .line 813
    .line 814
    .line 815
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 816
    .line 817
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v4, 0x412570a4    # 10.34f

    .line 821
    .line 822
    .line 823
    const/high16 v6, 0x41100000    # 9.0f

    .line 824
    .line 825
    const/high16 v7, 0x41400000    # 12.0f

    .line 826
    .line 827
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v4, 0x41500000    # 13.0f

    .line 834
    .line 835
    const/high16 v6, 0x41400000    # 12.0f

    .line 836
    .line 837
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v25, -0x40800000    # -1.0f

    .line 841
    .line 842
    const/high16 v26, 0x3f800000    # 1.0f

    .line 843
    .line 844
    const v22, 0x3f0ccccd    # 0.55f

    .line 845
    .line 846
    .line 847
    const v23, -0x4119999a    # -0.45f

    .line 848
    .line 849
    .line 850
    const/high16 v24, 0x3f800000    # 1.0f

    .line 851
    .line 852
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v4, -0x4119999a    # -0.45f

    .line 856
    .line 857
    .line 858
    const/high16 v6, -0x40800000    # -1.0f

    .line 859
    .line 860
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v4, 0x3ee66666    # 0.45f

    .line 864
    .line 865
    .line 866
    const/high16 v6, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/high16 v7, -0x40800000    # -1.0f

    .line 869
    .line 870
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v4, 0x41373333    # 11.45f

    .line 874
    .line 875
    .line 876
    const/high16 v6, 0x41500000    # 13.0f

    .line 877
    .line 878
    const/high16 v7, 0x41400000    # 12.0f

    .line 879
    .line 880
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    const/high16 v6, 0x3f800000    # 1.0f

    .line 891
    .line 892
    const/4 v7, 0x0

    .line 893
    const-string v4, ""

    .line 894
    .line 895
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 896
    .line 897
    .line 898
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 903
    .line 904
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 905
    .line 906
    .line 907
    move-result-wide v6

    .line 908
    const/4 v2, 0x0

    .line 909
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 913
    .line 914
    .line 915
    move-result v10

    .line 916
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 917
    .line 918
    .line 919
    move-result v11

    .line 920
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 923
    .line 924
    .line 925
    const v4, 0x401eb852    # 2.48f

    .line 926
    .line 927
    .line 928
    const v6, 0x412dc28f    # 10.86f

    .line 929
    .line 930
    .line 931
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const/high16 v25, 0x40000000    # 2.0f

    .line 935
    .line 936
    const v26, 0x4109999a    # 8.6f

    .line 937
    .line 938
    .line 939
    const v21, 0x400ae148    # 2.17f

    .line 940
    .line 941
    .line 942
    const v22, 0x4121999a    # 10.1f

    .line 943
    .line 944
    .line 945
    const/high16 v23, 0x40000000    # 2.0f

    .line 946
    .line 947
    const v24, 0x4115c28f    # 9.36f

    .line 948
    .line 949
    .line 950
    move-object/from16 v20, v2

    .line 951
    .line 952
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v25, 0x40d33333    # 6.6f

    .line 956
    .line 957
    .line 958
    const/high16 v26, 0x40800000    # 4.0f

    .line 959
    .line 960
    const/high16 v21, 0x40000000    # 2.0f

    .line 961
    .line 962
    const v22, 0x40c0a3d7    # 6.02f

    .line 963
    .line 964
    .line 965
    const v23, 0x4080a3d7    # 4.02f

    .line 966
    .line 967
    .line 968
    const/high16 v24, 0x40800000    # 4.0f

    .line 969
    .line 970
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v25, 0x40accccd    # 5.4f

    .line 974
    .line 975
    .line 976
    const v26, 0x4065c28f    # 3.59f

    .line 977
    .line 978
    .line 979
    const v21, 0x402b851f    # 2.68f

    .line 980
    .line 981
    .line 982
    const/16 v22, 0x0

    .line 983
    .line 984
    const v23, 0x40747ae1    # 3.82f

    .line 985
    .line 986
    .line 987
    const v24, 0x3fdeb852    # 1.74f

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const v25, 0x418b3333    # 17.4f

    .line 994
    .line 995
    .line 996
    const/high16 v26, 0x40800000    # 4.0f

    .line 997
    .line 998
    const v21, 0x41591eb8    # 13.57f

    .line 999
    .line 1000
    .line 1001
    const v22, 0x40b851ec    # 5.76f

    .line 1002
    .line 1003
    .line 1004
    const v23, 0x416b3333    # 14.7f

    .line 1005
    .line 1006
    .line 1007
    const/high16 v24, 0x40800000    # 4.0f

    .line 1008
    .line 1009
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    const/high16 v25, 0x41b00000    # 22.0f

    .line 1013
    .line 1014
    const v26, 0x4109999a    # 8.6f

    .line 1015
    .line 1016
    .line 1017
    const v21, 0x419fd70a    # 19.98f

    .line 1018
    .line 1019
    .line 1020
    const/high16 v22, 0x40800000    # 4.0f

    .line 1021
    .line 1022
    const/high16 v23, 0x41b00000    # 22.0f

    .line 1023
    .line 1024
    const v24, 0x40c0a3d7    # 6.02f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v25, -0x410a3d71    # -0.48f

    .line 1031
    .line 1032
    .line 1033
    const v26, 0x4010a3d7    # 2.26f

    .line 1034
    .line 1035
    .line 1036
    const/16 v21, 0x0

    .line 1037
    .line 1038
    const v22, 0x3f428f5c    # 0.76f

    .line 1039
    .line 1040
    .line 1041
    const v23, -0x41d1eb85    # -0.17f

    .line 1042
    .line 1043
    .line 1044
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 1045
    .line 1046
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const v25, 0x3fc3d70a    # 1.53f

    .line 1050
    .line 1051
    .line 1052
    const v26, 0x3fb851ec    # 1.44f

    .line 1053
    .line 1054
    .line 1055
    const v21, 0x3f266666    # 0.65f

    .line 1056
    .line 1057
    .line 1058
    const v22, 0x3e9eb852    # 0.31f

    .line 1059
    .line 1060
    .line 1061
    const v23, 0x3f970a3d    # 1.18f

    .line 1062
    .line 1063
    .line 1064
    const v24, 0x3f51eb85    # 0.82f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const/high16 v25, 0x41c00000    # 24.0f

    .line 1071
    .line 1072
    const v26, 0x4109999a    # 8.6f

    .line 1073
    .line 1074
    .line 1075
    const v21, 0x41bd3333    # 23.65f

    .line 1076
    .line 1077
    .line 1078
    const v22, 0x4131999a    # 11.1f

    .line 1079
    .line 1080
    .line 1081
    const/high16 v23, 0x41c00000    # 24.0f

    .line 1082
    .line 1083
    const v24, 0x411e147b    # 9.88f

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const v25, 0x418b3333    # 17.4f

    .line 1090
    .line 1091
    .line 1092
    const/high16 v26, 0x40000000    # 2.0f

    .line 1093
    .line 1094
    const/high16 v21, 0x41c00000    # 24.0f

    .line 1095
    .line 1096
    const v22, 0x409ccccd    # 4.9f

    .line 1097
    .line 1098
    .line 1099
    const v23, 0x41a8cccd    # 21.1f

    .line 1100
    .line 1101
    .line 1102
    const/high16 v24, 0x40000000    # 2.0f

    .line 1103
    .line 1104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v25, -0x3f533333    # -5.4f

    .line 1108
    .line 1109
    .line 1110
    const v26, 0x4020a3d7    # 2.51f

    .line 1111
    .line 1112
    .line 1113
    const v21, -0x3ffa3d71    # -2.09f

    .line 1114
    .line 1115
    .line 1116
    const/16 v22, 0x0

    .line 1117
    .line 1118
    const v23, -0x3f7d1eb8    # -4.09f

    .line 1119
    .line 1120
    .line 1121
    const v24, 0x3f7851ec    # 0.97f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const v25, 0x40d33333    # 6.6f

    .line 1128
    .line 1129
    .line 1130
    const/high16 v26, 0x40000000    # 2.0f

    .line 1131
    .line 1132
    const v21, 0x412b0a3d    # 10.69f

    .line 1133
    .line 1134
    .line 1135
    const v22, 0x403e147b    # 2.97f

    .line 1136
    .line 1137
    .line 1138
    const v23, 0x410b0a3d    # 8.69f

    .line 1139
    .line 1140
    .line 1141
    const/high16 v24, 0x40000000    # 2.0f

    .line 1142
    .line 1143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const/16 v25, 0x0

    .line 1147
    .line 1148
    const v26, 0x4109999a    # 8.6f

    .line 1149
    .line 1150
    .line 1151
    const v21, 0x4039999a    # 2.9f

    .line 1152
    .line 1153
    .line 1154
    const/high16 v22, 0x40000000    # 2.0f

    .line 1155
    .line 1156
    const/16 v23, 0x0

    .line 1157
    .line 1158
    const v24, 0x409ccccd    # 4.9f

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const v25, 0x3f75c28f    # 0.96f

    .line 1165
    .line 1166
    .line 1167
    const v26, 0x406ccccd    # 3.7f

    .line 1168
    .line 1169
    .line 1170
    const/16 v21, 0x0

    .line 1171
    .line 1172
    const v22, 0x3fa3d70a    # 1.28f

    .line 1173
    .line 1174
    .line 1175
    const v23, 0x3eb33333    # 0.35f

    .line 1176
    .line 1177
    .line 1178
    const/high16 v24, 0x40200000    # 2.5f

    .line 1179
    .line 1180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v25, 0x401eb852    # 2.48f

    .line 1184
    .line 1185
    .line 1186
    const v26, 0x412dc28f    # 10.86f

    .line 1187
    .line 1188
    .line 1189
    const v21, 0x3fa7ae14    # 1.31f

    .line 1190
    .line 1191
    .line 1192
    const v22, 0x413ae148    # 11.68f

    .line 1193
    .line 1194
    .line 1195
    const v23, 0x3feb851f    # 1.84f

    .line 1196
    .line 1197
    .line 1198
    const v24, 0x4132b852    # 11.17f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1212
    .line 1213
    const/4 v7, 0x0

    .line 1214
    const-string v4, ""

    .line 1215
    .line 1216
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1217
    .line 1218
    .line 1219
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1220
    .line 1221
    .line 1222
    move-result v3

    .line 1223
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1226
    .line 1227
    .line 1228
    move-result-wide v6

    .line 1229
    const/4 v2, 0x0

    .line 1230
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1234
    .line 1235
    .line 1236
    move-result v10

    .line 1237
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1238
    .line 1239
    .line 1240
    move-result v11

    .line 1241
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1242
    .line 1243
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1244
    .line 1245
    .line 1246
    const v4, 0x418b3333    # 17.4f

    .line 1247
    .line 1248
    .line 1249
    const/high16 v6, 0x40800000    # 4.0f

    .line 1250
    .line 1251
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1252
    .line 1253
    .line 1254
    const v25, -0x3f533333    # -5.4f

    .line 1255
    .line 1256
    .line 1257
    const v26, 0x4065c28f    # 3.59f

    .line 1258
    .line 1259
    .line 1260
    const v21, -0x3fd47ae1    # -2.68f

    .line 1261
    .line 1262
    .line 1263
    const/16 v22, 0x0

    .line 1264
    .line 1265
    const v23, -0x3f8b851f    # -3.82f

    .line 1266
    .line 1267
    .line 1268
    const v24, 0x3fdeb852    # 1.74f

    .line 1269
    .line 1270
    .line 1271
    move-object/from16 v20, v2

    .line 1272
    .line 1273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const v25, 0x40d33333    # 6.6f

    .line 1277
    .line 1278
    .line 1279
    const/high16 v26, 0x40800000    # 4.0f

    .line 1280
    .line 1281
    const v21, 0x41270a3d    # 10.44f

    .line 1282
    .line 1283
    .line 1284
    const/high16 v22, 0x40b80000    # 5.75f

    .line 1285
    .line 1286
    const v23, 0x4114cccd    # 9.3f

    .line 1287
    .line 1288
    .line 1289
    const/high16 v24, 0x40800000    # 4.0f

    .line 1290
    .line 1291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    const/high16 v25, 0x40000000    # 2.0f

    .line 1295
    .line 1296
    const v26, 0x4109999a    # 8.6f

    .line 1297
    .line 1298
    .line 1299
    const v21, 0x4080a3d7    # 4.02f

    .line 1300
    .line 1301
    .line 1302
    const/high16 v22, 0x40800000    # 4.0f

    .line 1303
    .line 1304
    const/high16 v23, 0x40000000    # 2.0f

    .line 1305
    .line 1306
    const v24, 0x40c0a3d7    # 6.02f

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const v25, 0x3ef5c28f    # 0.48f

    .line 1313
    .line 1314
    .line 1315
    const v26, 0x4010a3d7    # 2.26f

    .line 1316
    .line 1317
    .line 1318
    const/16 v21, 0x0

    .line 1319
    .line 1320
    const v22, 0x3f428f5c    # 0.76f

    .line 1321
    .line 1322
    .line 1323
    const v23, 0x3e2e147b    # 0.17f

    .line 1324
    .line 1325
    .line 1326
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 1327
    .line 1328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1329
    .line 1330
    .line 1331
    const/high16 v25, 0x40800000    # 4.0f

    .line 1332
    .line 1333
    const/high16 v26, 0x41280000    # 10.5f

    .line 1334
    .line 1335
    const v21, 0x403c28f6    # 2.94f

    .line 1336
    .line 1337
    .line 1338
    const v22, 0x412a3d71    # 10.64f

    .line 1339
    .line 1340
    .line 1341
    const v23, 0x405ccccd    # 3.45f

    .line 1342
    .line 1343
    .line 1344
    const/high16 v24, 0x41280000    # 10.5f

    .line 1345
    .line 1346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1347
    .line 1348
    .line 1349
    const/high16 v25, 0x40600000    # 3.5f

    .line 1350
    .line 1351
    const/high16 v26, 0x40600000    # 3.5f

    .line 1352
    .line 1353
    const v21, 0x3ff70a3d    # 1.93f

    .line 1354
    .line 1355
    .line 1356
    const/16 v22, 0x0

    .line 1357
    .line 1358
    const/high16 v23, 0x40600000    # 3.5f

    .line 1359
    .line 1360
    const v24, 0x3fc8f5c3    # 1.57f

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1364
    .line 1365
    .line 1366
    const v25, -0x418a3d71    # -0.24f

    .line 1367
    .line 1368
    .line 1369
    const v26, 0x3fa147ae    # 1.26f

    .line 1370
    .line 1371
    .line 1372
    const/16 v21, 0x0

    .line 1373
    .line 1374
    const v22, 0x3ee66666    # 0.45f

    .line 1375
    .line 1376
    .line 1377
    const v23, -0x4247ae14    # -0.09f

    .line 1378
    .line 1379
    .line 1380
    const v24, 0x3f5eb852    # 0.87f

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1384
    .line 1385
    .line 1386
    const v25, 0x403eb852    # 2.98f

    .line 1387
    .line 1388
    .line 1389
    const v26, -0x40a8f5c3    # -0.84f

    .line 1390
    .line 1391
    .line 1392
    const v21, 0x3f7851ec    # 0.97f

    .line 1393
    .line 1394
    .line 1395
    const v22, -0x4128f5c3    # -0.42f

    .line 1396
    .line 1397
    .line 1398
    const v23, 0x3ffae148    # 1.96f

    .line 1399
    .line 1400
    .line 1401
    const v24, -0x40cf5c29    # -0.69f

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1405
    .line 1406
    .line 1407
    const/high16 v25, 0x41100000    # 9.0f

    .line 1408
    .line 1409
    const/high16 v26, 0x41400000    # 12.0f

    .line 1410
    .line 1411
    const v21, 0x4117d70a    # 9.49f

    .line 1412
    .line 1413
    .line 1414
    const v22, 0x415deb85    # 13.87f

    .line 1415
    .line 1416
    .line 1417
    const/high16 v23, 0x41100000    # 9.0f

    .line 1418
    .line 1419
    const/high16 v24, 0x41500000    # 13.0f

    .line 1420
    .line 1421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1422
    .line 1423
    .line 1424
    const/high16 v25, 0x40400000    # 3.0f

    .line 1425
    .line 1426
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 1427
    .line 1428
    const/16 v21, 0x0

    .line 1429
    .line 1430
    const v22, -0x402b851f    # -1.66f

    .line 1431
    .line 1432
    .line 1433
    const v23, 0x3fab851f    # 1.34f

    .line 1434
    .line 1435
    .line 1436
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 1437
    .line 1438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1439
    .line 1440
    .line 1441
    const/high16 v26, 0x40400000    # 3.0f

    .line 1442
    .line 1443
    const v21, 0x3fd47ae1    # 1.66f

    .line 1444
    .line 1445
    .line 1446
    const/16 v22, 0x0

    .line 1447
    .line 1448
    const/high16 v23, 0x40400000    # 3.0f

    .line 1449
    .line 1450
    const v24, 0x3fab851f    # 1.34f

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1454
    .line 1455
    .line 1456
    const v25, -0x406147ae    # -1.24f

    .line 1457
    .line 1458
    .line 1459
    const v26, 0x401ae148    # 2.42f

    .line 1460
    .line 1461
    .line 1462
    const/16 v21, 0x0

    .line 1463
    .line 1464
    const/high16 v22, 0x3f800000    # 1.0f

    .line 1465
    .line 1466
    const v23, -0x41051eb8    # -0.49f

    .line 1467
    .line 1468
    .line 1469
    const v24, 0x3fef5c29    # 1.87f

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1473
    .line 1474
    .line 1475
    const v25, 0x403eb852    # 2.98f

    .line 1476
    .line 1477
    .line 1478
    const v26, 0x3f59999a    # 0.85f

    .line 1479
    .line 1480
    .line 1481
    const v21, 0x3f828f5c    # 1.02f

    .line 1482
    .line 1483
    .line 1484
    const v22, 0x3e19999a    # 0.15f

    .line 1485
    .line 1486
    .line 1487
    const v23, 0x400147ae    # 2.02f

    .line 1488
    .line 1489
    .line 1490
    const v24, 0x3edc28f6    # 0.43f

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1494
    .line 1495
    .line 1496
    const v25, -0x418a3d71    # -0.24f

    .line 1497
    .line 1498
    .line 1499
    const v26, -0x405eb852    # -1.26f

    .line 1500
    .line 1501
    .line 1502
    const v21, -0x41e66666    # -0.15f

    .line 1503
    .line 1504
    .line 1505
    const v22, -0x413851ec    # -0.39f

    .line 1506
    .line 1507
    .line 1508
    const v23, -0x418a3d71    # -0.24f

    .line 1509
    .line 1510
    .line 1511
    const v24, -0x40ae147b    # -0.82f

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1515
    .line 1516
    .line 1517
    const/high16 v25, 0x40600000    # 3.5f

    .line 1518
    .line 1519
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 1520
    .line 1521
    const/16 v21, 0x0

    .line 1522
    .line 1523
    const v22, -0x4008f5c3    # -1.93f

    .line 1524
    .line 1525
    .line 1526
    const v23, 0x3fc8f5c3    # 1.57f

    .line 1527
    .line 1528
    .line 1529
    const/high16 v24, -0x3fa00000    # -3.5f

    .line 1530
    .line 1531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const v25, 0x3fc28f5c    # 1.52f

    .line 1535
    .line 1536
    .line 1537
    const v26, 0x3eb851ec    # 0.36f

    .line 1538
    .line 1539
    .line 1540
    const v21, 0x3f0ccccd    # 0.55f

    .line 1541
    .line 1542
    .line 1543
    const/16 v22, 0x0

    .line 1544
    .line 1545
    const v23, 0x3f87ae14    # 1.06f

    .line 1546
    .line 1547
    .line 1548
    const v24, 0x3e0f5c29    # 0.14f

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1552
    .line 1553
    .line 1554
    const/high16 v25, 0x41b00000    # 22.0f

    .line 1555
    .line 1556
    const v26, 0x4109999a    # 8.6f

    .line 1557
    .line 1558
    .line 1559
    const v21, 0x41aea3d7    # 21.83f

    .line 1560
    .line 1561
    .line 1562
    const v22, 0x4121999a    # 10.1f

    .line 1563
    .line 1564
    .line 1565
    const/high16 v23, 0x41b00000    # 22.0f

    .line 1566
    .line 1567
    const v24, 0x4115c28f    # 9.36f

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1571
    .line 1572
    .line 1573
    const v25, 0x418b3333    # 17.4f

    .line 1574
    .line 1575
    .line 1576
    const/high16 v26, 0x40800000    # 4.0f

    .line 1577
    .line 1578
    const/high16 v21, 0x41b00000    # 22.0f

    .line 1579
    .line 1580
    const v22, 0x40c0a3d7    # 6.02f

    .line 1581
    .line 1582
    .line 1583
    const v23, 0x419fd70a    # 19.98f

    .line 1584
    .line 1585
    .line 1586
    const/high16 v24, 0x40800000    # 4.0f

    .line 1587
    .line 1588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v2

    .line 1598
    const v6, 0x3e99999a    # 0.3f

    .line 1599
    .line 1600
    .line 1601
    const v8, 0x3e99999a    # 0.3f

    .line 1602
    .line 1603
    .line 1604
    const/4 v7, 0x0

    .line 1605
    const-string v4, ""

    .line 1606
    .line 1607
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1608
    .line 1609
    .line 1610
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1611
    .line 1612
    .line 1613
    move-result v3

    .line 1614
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1615
    .line 1616
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1617
    .line 1618
    .line 1619
    move-result-wide v6

    .line 1620
    const/4 v2, 0x0

    .line 1621
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1625
    .line 1626
    .line 1627
    move-result v10

    .line 1628
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1629
    .line 1630
    .line 1631
    move-result v11

    .line 1632
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1633
    .line 1634
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1635
    .line 1636
    .line 1637
    const v4, 0x419828f6    # 19.02f

    .line 1638
    .line 1639
    .line 1640
    const v6, 0x41011eb8    # 8.07f

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1644
    .line 1645
    .line 1646
    const v4, 0x40fb3333    # 7.85f

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1650
    .line 1651
    .line 1652
    const v25, -0x41051eb8    # -0.49f

    .line 1653
    .line 1654
    .line 1655
    const v26, -0x40fae148    # -0.52f

    .line 1656
    .line 1657
    .line 1658
    const v21, -0x4247ae14    # -0.09f

    .line 1659
    .line 1660
    .line 1661
    const v22, -0x41947ae1    # -0.23f

    .line 1662
    .line 1663
    .line 1664
    const v23, -0x4175c28f    # -0.27f

    .line 1665
    .line 1666
    .line 1667
    const v24, -0x4128f5c3    # -0.42f

    .line 1668
    .line 1669
    .line 1670
    move-object/from16 v20, v2

    .line 1671
    .line 1672
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1673
    .line 1674
    .line 1675
    const v25, -0x3fa47ae1    # -3.43f

    .line 1676
    .line 1677
    .line 1678
    const v26, -0x40c51eb8    # -0.73f

    .line 1679
    .line 1680
    .line 1681
    const v21, -0x40733333    # -1.1f

    .line 1682
    .line 1683
    .line 1684
    const v22, -0x41051eb8    # -0.49f

    .line 1685
    .line 1686
    .line 1687
    const v23, -0x3fef5c29    # -2.26f

    .line 1688
    .line 1689
    .line 1690
    const v24, -0x40c51eb8    # -0.73f

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1694
    .line 1695
    .line 1696
    const v26, 0x3f3ae148    # 0.73f

    .line 1697
    .line 1698
    .line 1699
    const v21, -0x4068f5c3    # -1.18f

    .line 1700
    .line 1701
    .line 1702
    const/16 v22, 0x0

    .line 1703
    .line 1704
    const v23, -0x3feae148    # -2.33f

    .line 1705
    .line 1706
    .line 1707
    const/high16 v24, 0x3e800000    # 0.25f

    .line 1708
    .line 1709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1710
    .line 1711
    .line 1712
    const v25, 0x41011eb8    # 8.07f

    .line 1713
    .line 1714
    .line 1715
    const v26, 0x419828f6    # 19.02f

    .line 1716
    .line 1717
    .line 1718
    const v21, 0x410570a4    # 8.34f

    .line 1719
    .line 1720
    .line 1721
    const v22, 0x4194cccd    # 18.6f

    .line 1722
    .line 1723
    .line 1724
    const v23, 0x4102b852    # 8.17f

    .line 1725
    .line 1726
    .line 1727
    const v24, 0x419651ec    # 18.79f

    .line 1728
    .line 1729
    .line 1730
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v2

    .line 1740
    const v6, 0x3e99999a    # 0.3f

    .line 1741
    .line 1742
    .line 1743
    const/4 v7, 0x0

    .line 1744
    const-string v4, ""

    .line 1745
    .line 1746
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1747
    .line 1748
    .line 1749
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1750
    .line 1751
    .line 1752
    move-result v3

    .line 1753
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1754
    .line 1755
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1756
    .line 1757
    .line 1758
    move-result-wide v6

    .line 1759
    const/4 v0, 0x0

    .line 1760
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1764
    .line 1765
    .line 1766
    move-result v10

    .line 1767
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1768
    .line 1769
    .line 1770
    move-result v11

    .line 1771
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1772
    .line 1773
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1774
    .line 1775
    .line 1776
    const/high16 v0, 0x41400000    # 12.0f

    .line 1777
    .line 1778
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1779
    .line 1780
    .line 1781
    const/4 v0, 0x0

    .line 1782
    const/high16 v2, -0x40800000    # -1.0f

    .line 1783
    .line 1784
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1785
    .line 1786
    .line 1787
    const/high16 v18, 0x40000000    # 2.0f

    .line 1788
    .line 1789
    const/16 v19, 0x0

    .line 1790
    .line 1791
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1792
    .line 1793
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1794
    .line 1795
    const/16 v16, 0x1

    .line 1796
    .line 1797
    const/16 v17, 0x1

    .line 1798
    .line 1799
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1800
    .line 1801
    .line 1802
    const/high16 v18, -0x40000000    # -2.0f

    .line 1803
    .line 1804
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v2

    .line 1811
    const/16 v16, 0x3800

    .line 1812
    .line 1813
    const/16 v17, 0x0

    .line 1814
    .line 1815
    const v6, 0x3e99999a    # 0.3f

    .line 1816
    .line 1817
    .line 1818
    const/4 v7, 0x0

    .line 1819
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1820
    .line 1821
    const/4 v13, 0x0

    .line 1822
    const/4 v14, 0x0

    .line 1823
    const-string v4, ""

    .line 1824
    .line 1825
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v0

    .line 1833
    sput-object v0, Landroidx/compose/material/icons/twotone/Diversity1Kt;->_diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1834
    .line 1835
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1836
    .line 1837
    .line 1838
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/Diversity1Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiversity1(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Diversity1Kt;->_diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Diversity1"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 188
    .line 189
    const/4 v6, 0x0

    .line 190
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v26, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const v22, 0x3f0ccccd    # 0.55f

    .line 200
    .line 201
    .line 202
    const v23, 0x3ee66666    # 0.45f

    .line 203
    .line 204
    .line 205
    const/high16 v24, 0x3f800000    # 1.0f

    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x40600000    # 3.5f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, -0x4031eb85    # -1.61f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, 0x3f2147ae    # 0.63f

    .line 222
    .line 223
    .line 224
    const v26, -0x3fed70a4    # -2.29f

    .line 225
    .line 226
    .line 227
    const v22, -0x40ab851f    # -0.83f

    .line 228
    .line 229
    .line 230
    const v23, 0x3e6b851f    # 0.23f

    .line 231
    .line 232
    .line 233
    const v24, -0x4031eb85    # -1.61f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v25, 0x40800000    # 4.0f

    .line 240
    .line 241
    const/high16 v26, 0x41880000    # 17.0f

    .line 242
    .line 243
    const v21, 0x409851ec    # 4.76f

    .line 244
    .line 245
    .line 246
    const v22, 0x418851ec    # 17.04f

    .line 247
    .line 248
    .line 249
    const v23, 0x408c7ae1    # 4.39f

    .line 250
    .line 251
    .line 252
    const/high16 v24, 0x41880000    # 17.0f

    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, 0x3f9c28f6    # 1.22f

    .line 258
    .line 259
    .line 260
    const v26, 0x418ca3d7    # 17.58f

    .line 261
    .line 262
    .line 263
    const v21, 0x4040a3d7    # 3.01f

    .line 264
    .line 265
    .line 266
    const/high16 v22, 0x41880000    # 17.0f

    .line 267
    .line 268
    const v23, 0x40047ae1    # 2.07f

    .line 269
    .line 270
    .line 271
    const v24, 0x4189ae14    # 17.21f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/high16 v6, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/4 v7, 0x0

    .line 287
    const-string v4, ""

    .line 288
    .line 289
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 299
    .line 300
    .line 301
    move-result-wide v6

    .line 302
    const/4 v2, 0x0

    .line 303
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41600000    # 14.0f

    .line 320
    .line 321
    const/high16 v6, 0x41a00000    # 20.0f

    .line 322
    .line 323
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, -0x40000000    # -2.0f

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v26, 0x40800000    # 4.0f

    .line 333
    .line 334
    const/high16 v21, 0x40000000    # 2.0f

    .line 335
    .line 336
    const/high16 v22, 0x40000000    # 2.0f

    .line 337
    .line 338
    const/16 v23, 0x0

    .line 339
    .line 340
    const/16 v24, 0x1

    .line 341
    .line 342
    const/16 v25, 0x1

    .line 343
    .line 344
    move-object/from16 v20, v2

    .line 345
    .line 346
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v26, -0x3f800000    # -4.0f

    .line 350
    .line 351
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    const-string v4, ""

    .line 362
    .line 363
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 371
    .line 372
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 373
    .line 374
    .line 375
    move-result-wide v6

    .line 376
    const/4 v2, 0x0

    .line 377
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    const v4, 0x41b63d71    # 22.78f

    .line 394
    .line 395
    .line 396
    const v6, 0x418ca3d7    # 17.58f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, 0x41a00000    # 20.0f

    .line 403
    .line 404
    const/high16 v26, 0x41880000    # 17.0f

    .line 405
    .line 406
    const v21, 0x41af70a4    # 21.93f

    .line 407
    .line 408
    .line 409
    const v22, 0x4189ae14    # 17.21f

    .line 410
    .line 411
    .line 412
    const v23, 0x41a7eb85    # 20.99f

    .line 413
    .line 414
    .line 415
    const/high16 v24, 0x41880000    # 17.0f

    .line 416
    .line 417
    move-object/from16 v20, v2

    .line 418
    .line 419
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v25, -0x406f5c29    # -1.13f

    .line 423
    .line 424
    .line 425
    const v26, 0x3dcccccd    # 0.1f

    .line 426
    .line 427
    .line 428
    const v21, -0x413851ec    # -0.39f

    .line 429
    .line 430
    .line 431
    const/16 v22, 0x0

    .line 432
    .line 433
    const v23, -0x40bd70a4    # -0.76f

    .line 434
    .line 435
    .line 436
    const v24, 0x3d23d70a    # 0.04f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v25, 0x3f2147ae    # 0.63f

    .line 443
    .line 444
    .line 445
    const v26, 0x40128f5c    # 2.29f

    .line 446
    .line 447
    .line 448
    const v21, 0x3ecccccd    # 0.4f

    .line 449
    .line 450
    .line 451
    const v22, 0x3f2e147b    # 0.68f

    .line 452
    .line 453
    .line 454
    const v23, 0x3f2147ae    # 0.63f

    .line 455
    .line 456
    .line 457
    const v24, 0x3fbae148    # 1.46f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x41a80000    # 21.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40600000    # 3.5f

    .line 469
    .line 470
    const/4 v6, 0x0

    .line 471
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v25, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v26, -0x40800000    # -1.0f

    .line 477
    .line 478
    const v21, 0x3f0ccccd    # 0.55f

    .line 479
    .line 480
    .line 481
    const/16 v22, 0x0

    .line 482
    .line 483
    const/high16 v23, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const v24, -0x4119999a    # -0.45f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v4, -0x40ee147b    # -0.57f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v25, 0x41b63d71    # 22.78f

    .line 498
    .line 499
    .line 500
    const v26, 0x418ca3d7    # 17.58f

    .line 501
    .line 502
    .line 503
    const/high16 v21, 0x41c00000    # 24.0f

    .line 504
    .line 505
    const v22, 0x4194f5c3    # 18.62f

    .line 506
    .line 507
    .line 508
    const v23, 0x41bc28f6    # 23.52f

    .line 509
    .line 510
    .line 511
    const v24, 0x418f3333    # 17.9f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const/high16 v6, 0x3f800000    # 1.0f

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
    const v4, 0x4181eb85    # 16.24f

    .line 560
    .line 561
    .line 562
    const v6, 0x41853333    # 16.65f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v25, -0x3f7851ec    # -4.24f

    .line 569
    .line 570
    .line 571
    const v26, -0x4099999a    # -0.9f

    .line 572
    .line 573
    .line 574
    const v21, -0x406a3d71    # -1.17f

    .line 575
    .line 576
    .line 577
    const v22, -0x40fae148    # -0.52f

    .line 578
    .line 579
    .line 580
    const v23, -0x3fd8f5c3    # -2.61f

    .line 581
    .line 582
    .line 583
    const v24, -0x4099999a    # -0.9f

    .line 584
    .line 585
    .line 586
    move-object/from16 v20, v2

    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v26, 0x3f666666    # 0.9f

    .line 592
    .line 593
    .line 594
    const v21, -0x402f5c29    # -1.63f

    .line 595
    .line 596
    .line 597
    const/16 v22, 0x0

    .line 598
    .line 599
    const v23, -0x3fbb851f    # -3.07f

    .line 600
    .line 601
    .line 602
    const v24, 0x3ec7ae14    # 0.39f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v25, 0x40c00000    # 6.0f

    .line 609
    .line 610
    const v26, 0x419b1eb8    # 19.39f

    .line 611
    .line 612
    .line 613
    const v21, 0x40d5c28f    # 6.68f

    .line 614
    .line 615
    .line 616
    const v22, 0x41890a3d    # 17.13f

    .line 617
    .line 618
    .line 619
    const/high16 v23, 0x40c00000    # 6.0f

    .line 620
    .line 621
    const v24, 0x4191ae14    # 18.21f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v4, 0x40c00000    # 6.0f

    .line 628
    .line 629
    const/high16 v6, 0x41a00000    # 20.0f

    .line 630
    .line 631
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v25, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/high16 v26, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/16 v21, 0x0

    .line 639
    .line 640
    const v22, 0x3f0ccccd    # 0.55f

    .line 641
    .line 642
    .line 643
    const v23, 0x3ee66666    # 0.45f

    .line 644
    .line 645
    .line 646
    const/high16 v24, 0x3f800000    # 1.0f

    .line 647
    .line 648
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v4, 0x41200000    # 10.0f

    .line 652
    .line 653
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v26, -0x40800000    # -1.0f

    .line 657
    .line 658
    const v21, 0x3f0ccccd    # 0.55f

    .line 659
    .line 660
    .line 661
    const/16 v22, 0x0

    .line 662
    .line 663
    const/high16 v23, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const v24, -0x4119999a    # -0.45f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v4, -0x40e3d70a    # -0.61f

    .line 672
    .line 673
    .line 674
    const/4 v6, 0x0

    .line 675
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v25, 0x4181eb85    # 16.24f

    .line 679
    .line 680
    .line 681
    const v26, 0x41853333    # 16.65f

    .line 682
    .line 683
    .line 684
    const/high16 v21, 0x41900000    # 18.0f

    .line 685
    .line 686
    const v22, 0x4191ae14    # 18.21f

    .line 687
    .line 688
    .line 689
    const v23, 0x418a8f5c    # 17.32f

    .line 690
    .line 691
    .line 692
    const v24, 0x41890a3d    # 17.13f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const/high16 v6, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/4 v7, 0x0

    .line 708
    const-string v4, ""

    .line 709
    .line 710
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 711
    .line 712
    .line 713
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 718
    .line 719
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 720
    .line 721
    .line 722
    move-result-wide v6

    .line 723
    const/4 v2, 0x0

    .line 724
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 728
    .line 729
    .line 730
    move-result v10

    .line 731
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 732
    .line 733
    .line 734
    move-result v11

    .line 735
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 738
    .line 739
    .line 740
    const/high16 v4, 0x41400000    # 12.0f

    .line 741
    .line 742
    const/high16 v6, 0x41100000    # 9.0f

    .line 743
    .line 744
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v25, 0x40400000    # 3.0f

    .line 748
    .line 749
    const/high16 v26, 0x40400000    # 3.0f

    .line 750
    .line 751
    const/16 v21, 0x0

    .line 752
    .line 753
    const v22, 0x3fd47ae1    # 1.66f

    .line 754
    .line 755
    .line 756
    const v23, 0x3fab851f    # 1.34f

    .line 757
    .line 758
    .line 759
    const/high16 v24, 0x40400000    # 3.0f

    .line 760
    .line 761
    move-object/from16 v20, v2

    .line 762
    .line 763
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v4, -0x40547ae1    # -1.34f

    .line 767
    .line 768
    .line 769
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 770
    .line 771
    const/high16 v7, 0x40400000    # 3.0f

    .line 772
    .line 773
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 777
    .line 778
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 779
    .line 780
    const v22, -0x402b851f    # -1.66f

    .line 781
    .line 782
    .line 783
    const v23, -0x40547ae1    # -1.34f

    .line 784
    .line 785
    .line 786
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 787
    .line 788
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v4, 0x412570a4    # 10.34f

    .line 792
    .line 793
    .line 794
    const/high16 v6, 0x41400000    # 12.0f

    .line 795
    .line 796
    const/high16 v7, 0x41100000    # 9.0f

    .line 797
    .line 798
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const/high16 v6, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v7, 0x0

    .line 811
    const-string v4, ""

    .line 812
    .line 813
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 814
    .line 815
    .line 816
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 821
    .line 822
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 823
    .line 824
    .line 825
    move-result-wide v6

    .line 826
    const/4 v0, 0x0

    .line 827
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 831
    .line 832
    .line 833
    move-result v10

    .line 834
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 841
    .line 842
    .line 843
    const v0, 0x401eb852    # 2.48f

    .line 844
    .line 845
    .line 846
    const v2, 0x412dc28f    # 10.86f

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v17, 0x40000000    # 2.0f

    .line 853
    .line 854
    const v18, 0x4109999a    # 8.6f

    .line 855
    .line 856
    .line 857
    const v13, 0x400ae148    # 2.17f

    .line 858
    .line 859
    .line 860
    const v14, 0x4121999a    # 10.1f

    .line 861
    .line 862
    .line 863
    const/high16 v15, 0x40000000    # 2.0f

    .line 864
    .line 865
    const v16, 0x4115c28f    # 9.36f

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v17, 0x40d33333    # 6.6f

    .line 872
    .line 873
    .line 874
    const/high16 v18, 0x40800000    # 4.0f

    .line 875
    .line 876
    const/high16 v13, 0x40000000    # 2.0f

    .line 877
    .line 878
    const v14, 0x40c0a3d7    # 6.02f

    .line 879
    .line 880
    .line 881
    const v15, 0x4080a3d7    # 4.02f

    .line 882
    .line 883
    .line 884
    const/high16 v16, 0x40800000    # 4.0f

    .line 885
    .line 886
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v17, 0x40accccd    # 5.4f

    .line 890
    .line 891
    .line 892
    const v18, 0x4065c28f    # 3.59f

    .line 893
    .line 894
    .line 895
    const v13, 0x402b851f    # 2.68f

    .line 896
    .line 897
    .line 898
    const/4 v14, 0x0

    .line 899
    const v15, 0x40747ae1    # 3.82f

    .line 900
    .line 901
    .line 902
    const v16, 0x3fdeb852    # 1.74f

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v17, 0x418b3333    # 17.4f

    .line 909
    .line 910
    .line 911
    const/high16 v18, 0x40800000    # 4.0f

    .line 912
    .line 913
    const v13, 0x41591eb8    # 13.57f

    .line 914
    .line 915
    .line 916
    const v14, 0x40b851ec    # 5.76f

    .line 917
    .line 918
    .line 919
    const v15, 0x416b3333    # 14.7f

    .line 920
    .line 921
    .line 922
    const/high16 v16, 0x40800000    # 4.0f

    .line 923
    .line 924
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v17, 0x41b00000    # 22.0f

    .line 928
    .line 929
    const v18, 0x4109999a    # 8.6f

    .line 930
    .line 931
    .line 932
    const v13, 0x419fd70a    # 19.98f

    .line 933
    .line 934
    .line 935
    const/high16 v14, 0x40800000    # 4.0f

    .line 936
    .line 937
    const/high16 v15, 0x41b00000    # 22.0f

    .line 938
    .line 939
    const v16, 0x40c0a3d7    # 6.02f

    .line 940
    .line 941
    .line 942
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v17, -0x410a3d71    # -0.48f

    .line 946
    .line 947
    .line 948
    const v18, 0x4010a3d7    # 2.26f

    .line 949
    .line 950
    .line 951
    const/4 v13, 0x0

    .line 952
    const v14, 0x3f428f5c    # 0.76f

    .line 953
    .line 954
    .line 955
    const v15, -0x41d1eb85    # -0.17f

    .line 956
    .line 957
    .line 958
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 959
    .line 960
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v17, 0x3fc3d70a    # 1.53f

    .line 964
    .line 965
    .line 966
    const v18, 0x3fb851ec    # 1.44f

    .line 967
    .line 968
    .line 969
    const v13, 0x3f266666    # 0.65f

    .line 970
    .line 971
    .line 972
    const v14, 0x3e9eb852    # 0.31f

    .line 973
    .line 974
    .line 975
    const v15, 0x3f970a3d    # 1.18f

    .line 976
    .line 977
    .line 978
    const v16, 0x3f51eb85    # 0.82f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v17, 0x41c00000    # 24.0f

    .line 985
    .line 986
    const v18, 0x4109999a    # 8.6f

    .line 987
    .line 988
    .line 989
    const v13, 0x41bd3333    # 23.65f

    .line 990
    .line 991
    .line 992
    const v14, 0x4131999a    # 11.1f

    .line 993
    .line 994
    .line 995
    const/high16 v15, 0x41c00000    # 24.0f

    .line 996
    .line 997
    const v16, 0x411e147b    # 9.88f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v17, 0x418b3333    # 17.4f

    .line 1004
    .line 1005
    .line 1006
    const/high16 v18, 0x40000000    # 2.0f

    .line 1007
    .line 1008
    const/high16 v13, 0x41c00000    # 24.0f

    .line 1009
    .line 1010
    const v14, 0x409ccccd    # 4.9f

    .line 1011
    .line 1012
    .line 1013
    const v15, 0x41a8cccd    # 21.1f

    .line 1014
    .line 1015
    .line 1016
    const/high16 v16, 0x40000000    # 2.0f

    .line 1017
    .line 1018
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v17, -0x3f533333    # -5.4f

    .line 1022
    .line 1023
    .line 1024
    const v18, 0x4020a3d7    # 2.51f

    .line 1025
    .line 1026
    .line 1027
    const v13, -0x3ffa3d71    # -2.09f

    .line 1028
    .line 1029
    .line 1030
    const/4 v14, 0x0

    .line 1031
    const v15, -0x3f7d1eb8    # -4.09f

    .line 1032
    .line 1033
    .line 1034
    const v16, 0x3f7851ec    # 0.97f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const v17, 0x40d33333    # 6.6f

    .line 1041
    .line 1042
    .line 1043
    const/high16 v18, 0x40000000    # 2.0f

    .line 1044
    .line 1045
    const v13, 0x412b0a3d    # 10.69f

    .line 1046
    .line 1047
    .line 1048
    const v14, 0x403e147b    # 2.97f

    .line 1049
    .line 1050
    .line 1051
    const v15, 0x410b0a3d    # 8.69f

    .line 1052
    .line 1053
    .line 1054
    const/high16 v16, 0x40000000    # 2.0f

    .line 1055
    .line 1056
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const/16 v17, 0x0

    .line 1060
    .line 1061
    const v18, 0x4109999a    # 8.6f

    .line 1062
    .line 1063
    .line 1064
    const v13, 0x4039999a    # 2.9f

    .line 1065
    .line 1066
    .line 1067
    const/high16 v14, 0x40000000    # 2.0f

    .line 1068
    .line 1069
    const/4 v15, 0x0

    .line 1070
    const v16, 0x409ccccd    # 4.9f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v17, 0x3f75c28f    # 0.96f

    .line 1077
    .line 1078
    .line 1079
    const v18, 0x406ccccd    # 3.7f

    .line 1080
    .line 1081
    .line 1082
    const/4 v13, 0x0

    .line 1083
    const v14, 0x3fa3d70a    # 1.28f

    .line 1084
    .line 1085
    .line 1086
    const v15, 0x3eb33333    # 0.35f

    .line 1087
    .line 1088
    .line 1089
    const/high16 v16, 0x40200000    # 2.5f

    .line 1090
    .line 1091
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const v17, 0x401eb852    # 2.48f

    .line 1095
    .line 1096
    .line 1097
    const v18, 0x412dc28f    # 10.86f

    .line 1098
    .line 1099
    .line 1100
    const v13, 0x3fa7ae14    # 1.31f

    .line 1101
    .line 1102
    .line 1103
    const v14, 0x413ae148    # 11.68f

    .line 1104
    .line 1105
    .line 1106
    const v15, 0x3feb851f    # 1.84f

    .line 1107
    .line 1108
    .line 1109
    const v16, 0x4132b852    # 11.17f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    const/16 v16, 0x3800

    .line 1123
    .line 1124
    const/16 v17, 0x0

    .line 1125
    .line 1126
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1127
    .line 1128
    const/4 v7, 0x0

    .line 1129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1130
    .line 1131
    const/4 v13, 0x0

    .line 1132
    const/4 v14, 0x0

    .line 1133
    const/4 v15, 0x0

    .line 1134
    const-string v4, ""

    .line 1135
    .line 1136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    sput-object v0, Landroidx/compose/material/icons/rounded/Diversity1Kt;->_diversity1:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1145
    .line 1146
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1147
    .line 1148
    .line 1149
    return-object v0
.end method

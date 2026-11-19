.class public final Landroidx/compose/material/icons/rounded/FaceRetouchingOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFaceRetouchingOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FaceRetouchingOffKt;->_faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FaceRetouchingOff"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40600000    # -1.25f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40200000    # 2.5f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 88
    .line 89
    const/high16 v22, 0x3fa00000    # 1.25f

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
    const/high16 v26, -0x3fe00000    # -2.5f

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
    const/high16 v4, 0x418c0000    # 17.5f

    .line 160
    .line 161
    const/high16 v6, 0x41200000    # 10.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, 0x400ae148    # 2.17f

    .line 167
    .line 168
    .line 169
    const v26, -0x418a3d71    # -0.24f

    .line 170
    .line 171
    .line 172
    const/high16 v21, 0x3f400000    # 0.75f

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const v23, 0x3fbc28f6    # 1.47f

    .line 177
    .line 178
    .line 179
    const v24, -0x4247ae14    # -0.09f

    .line 180
    .line 181
    .line 182
    move-object/from16 v20, v2

    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, 0x41a00000    # 20.0f

    .line 188
    .line 189
    const/high16 v26, 0x41400000    # 12.0f

    .line 190
    .line 191
    const v21, 0x419f0a3d    # 19.88f

    .line 192
    .line 193
    .line 194
    const v22, 0x4127851f    # 10.47f

    .line 195
    .line 196
    .line 197
    const/high16 v23, 0x41a00000    # 20.0f

    .line 198
    .line 199
    const v24, 0x4133851f    # 11.22f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, -0x40bae148    # -0.77f

    .line 206
    .line 207
    .line 208
    const v26, 0x4059999a    # 3.4f

    .line 209
    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const v22, 0x3f9c28f6    # 1.22f

    .line 214
    .line 215
    .line 216
    const v23, -0x4170a3d7    # -0.28f

    .line 217
    .line 218
    .line 219
    const v24, 0x4017ae14    # 2.37f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x3fbeb852    # 1.49f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x41b00000    # 22.0f

    .line 232
    .line 233
    const/high16 v26, 0x41400000    # 12.0f

    .line 234
    .line 235
    const v21, 0x41ac3d71    # 21.53f

    .line 236
    .line 237
    .line 238
    const v22, 0x41770a3d    # 15.44f

    .line 239
    .line 240
    .line 241
    const/high16 v23, 0x41b00000    # 22.0f

    .line 242
    .line 243
    const v24, 0x415c7ae1    # 13.78f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, -0x3ee00000    # -10.0f

    .line 250
    .line 251
    const/high16 v26, -0x3ee00000    # -10.0f

    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const v22, -0x3f4f5c29    # -5.52f

    .line 256
    .line 257
    .line 258
    const v23, -0x3f70a3d7    # -4.48f

    .line 259
    .line 260
    .line 261
    const/high16 v24, -0x3ee00000    # -10.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, -0x3f63851f    # -4.89f

    .line 267
    .line 268
    .line 269
    const v26, 0x3fa3d70a    # 1.28f

    .line 270
    .line 271
    .line 272
    const v21, -0x401c28f6    # -1.78f

    .line 273
    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    const v23, -0x3fa3d70a    # -3.44f

    .line 278
    .line 279
    .line 280
    const v24, 0x3ef0a3d7    # 0.47f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x40aa8f5c    # 5.33f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x418c0000    # 17.5f

    .line 293
    .line 294
    const/high16 v26, 0x41200000    # 10.0f

    .line 295
    .line 296
    const v21, 0x415ee148    # 13.93f

    .line 297
    .line 298
    .line 299
    const v22, 0x4117d70a    # 9.49f

    .line 300
    .line 301
    .line 302
    const v23, 0x417a6666    # 15.65f

    .line 303
    .line 304
    .line 305
    const/high16 v24, 0x41200000    # 10.0f

    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const-string v4, ""

    .line 321
    .line 322
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 332
    .line 333
    .line 334
    move-result-wide v6

    .line 335
    const/4 v0, 0x0

    .line 336
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const v0, 0x40266666    # 2.6f

    .line 353
    .line 354
    .line 355
    const v2, 0x408dc28f    # 4.43f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x3fbd70a4    # 1.48f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x40066666    # 2.1f

    .line 368
    .line 369
    .line 370
    const v18, 0x41575c29    # 13.46f

    .line 371
    .line 372
    .line 373
    const v13, 0x4020a3d7    # 2.51f

    .line 374
    .line 375
    .line 376
    const v14, 0x40fe6666    # 7.95f

    .line 377
    .line 378
    .line 379
    const v15, 0x3fd9999a    # 1.7f

    .line 380
    .line 381
    .line 382
    const v16, 0x4129999a    # 10.6f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, 0x41070a3d    # 8.44f

    .line 389
    .line 390
    .line 391
    const v18, 0x41070a3d    # 8.44f

    .line 392
    .line 393
    .line 394
    const v13, 0x3f1eb852    # 0.62f

    .line 395
    .line 396
    .line 397
    const v14, 0x408a8f5c    # 4.33f

    .line 398
    .line 399
    .line 400
    const v15, 0x4083851f    # 4.11f

    .line 401
    .line 402
    .line 403
    const v16, 0x40fa3d71    # 7.82f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x40f1999a    # 7.55f

    .line 410
    .line 411
    .line 412
    const v18, -0x40028f5c    # -1.98f

    .line 413
    .line 414
    .line 415
    const v13, 0x40366666    # 2.85f

    .line 416
    .line 417
    .line 418
    const v14, 0x3ed1eb85    # 0.41f

    .line 419
    .line 420
    .line 421
    const v15, 0x40b051ec    # 5.51f

    .line 422
    .line 423
    .line 424
    const v16, -0x412e147b    # -0.41f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3fb47ae1    # 1.41f

    .line 434
    .line 435
    .line 436
    const/16 v18, 0x0

    .line 437
    .line 438
    const v13, 0x3ec7ae14    # 0.39f

    .line 439
    .line 440
    .line 441
    const v14, 0x3ec7ae14    # 0.39f

    .line 442
    .line 443
    .line 444
    const v15, 0x3f828f5c    # 1.02f

    .line 445
    .line 446
    .line 447
    const v16, 0x3ec7ae14    # 0.39f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/4 v0, 0x0

    .line 454
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const v18, -0x404b851f    # -1.41f

    .line 460
    .line 461
    .line 462
    const v14, -0x413851ec    # -0.39f

    .line 463
    .line 464
    .line 465
    const v15, 0x3ec7ae14    # 0.39f

    .line 466
    .line 467
    .line 468
    const v16, -0x407d70a4    # -1.02f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x408051ec    # 4.01f

    .line 475
    .line 476
    .line 477
    const v2, 0x4040a3d7    # 3.01f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, -0x404b851f    # -1.41f

    .line 484
    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const v13, -0x413851ec    # -0.39f

    .line 489
    .line 490
    .line 491
    const v15, -0x407d70a4    # -1.02f

    .line 492
    .line 493
    .line 494
    const v16, -0x413851ec    # -0.39f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40266666    # 2.6f

    .line 505
    .line 506
    .line 507
    const v18, 0x408dc28f    # 4.43f

    .line 508
    .line 509
    .line 510
    const v13, 0x400d70a4    # 2.21f

    .line 511
    .line 512
    .line 513
    const v14, 0x405a3d71    # 3.41f

    .line 514
    .line 515
    .line 516
    const v15, 0x400d70a4    # 2.21f

    .line 517
    .line 518
    .line 519
    const v16, 0x408147ae    # 4.04f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x4193eb85    # 18.49f

    .line 529
    .line 530
    .line 531
    const v2, 0x418547ae    # 16.66f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x41400000    # 12.0f

    .line 538
    .line 539
    const/high16 v18, 0x41a00000    # 20.0f

    .line 540
    .line 541
    const v13, 0x4175999a    # 15.35f

    .line 542
    .line 543
    .line 544
    const v14, 0x419b851f    # 19.44f

    .line 545
    .line 546
    .line 547
    const v15, 0x415bd70a    # 13.74f

    .line 548
    .line 549
    .line 550
    const/high16 v16, 0x41a00000    # 20.0f

    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, -0x3f000000    # -8.0f

    .line 556
    .line 557
    const/high16 v18, -0x3f000000    # -8.0f

    .line 558
    .line 559
    const v13, -0x3f72e148    # -4.41f

    .line 560
    .line 561
    .line 562
    const/4 v14, 0x0

    .line 563
    const/high16 v15, -0x3f000000    # -8.0f

    .line 564
    .line 565
    const v16, -0x3f9a3d71    # -3.59f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const v18, -0x41f0a3d7    # -0.14f

    .line 574
    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const v14, -0x42b33333    # -0.05f

    .line 578
    .line 579
    .line 580
    const v15, 0x3c23d70a    # 0.01f

    .line 581
    .line 582
    .line 583
    const v16, -0x42333333    # -0.1f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x4068f5c3    # 3.64f

    .line 590
    .line 591
    .line 592
    const v18, -0x3fe70a3d    # -2.39f

    .line 593
    .line 594
    .line 595
    const v13, 0x3fb1eb85    # 1.39f

    .line 596
    .line 597
    .line 598
    const v14, -0x40fae148    # -0.52f

    .line 599
    .line 600
    .line 601
    const v15, 0x402851ec    # 2.63f

    .line 602
    .line 603
    .line 604
    const v16, -0x40533333    # -1.35f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const/16 v16, 0x3800

    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    const/high16 v12, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const/4 v14, 0x0

    .line 631
    const/4 v15, 0x0

    .line 632
    const-string v4, ""

    .line 633
    .line 634
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    sput-object v0, Landroidx/compose/material/icons/rounded/FaceRetouchingOffKt;->_faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 643
    .line 644
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-object v0
.end method

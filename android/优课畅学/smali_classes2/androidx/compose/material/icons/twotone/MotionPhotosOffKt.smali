.class public final Landroidx/compose/material/icons/twotone/MotionPhotosOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MotionPhotosOff"

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
    const v4, 0x4033d70a    # 2.81f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v4, 0x3fb1eb85    # 1.39f

    .line 77
    .line 78
    .line 79
    const v6, 0x40870a3d    # 4.22f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v4, 0x401147ae    # 2.27f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v25, 0x40000000    # 2.0f

    .line 92
    .line 93
    const/high16 v26, 0x41400000    # 12.0f

    .line 94
    .line 95
    const v21, 0x40270a3d    # 2.61f

    .line 96
    .line 97
    .line 98
    const v22, 0x41011eb8    # 8.07f

    .line 99
    .line 100
    .line 101
    const/high16 v23, 0x40000000    # 2.0f

    .line 102
    .line 103
    const v24, 0x411f5c29    # 9.96f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41200000    # 10.0f

    .line 112
    .line 113
    const/high16 v26, 0x41200000    # 10.0f

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const v22, 0x40b0a3d7    # 5.52f

    .line 118
    .line 119
    .line 120
    const v23, 0x408f5c29    # 4.48f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41200000    # 10.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, 0x40b051ec    # 5.51f

    .line 129
    .line 130
    .line 131
    const v26, -0x402b851f    # -1.66f

    .line 132
    .line 133
    .line 134
    const v21, 0x40028f5c    # 2.04f

    .line 135
    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    const v23, 0x407b851f    # 3.93f

    .line 140
    .line 141
    .line 142
    const v24, -0x40e3d70a    # -0.61f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x3fb47ae1    # 1.41f

    .line 152
    .line 153
    .line 154
    const v6, -0x404a3d71    # -1.42f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x4033d70a    # 2.81f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v4, 0x41a00000    # 20.0f

    .line 170
    .line 171
    const/high16 v6, 0x41400000    # 12.0f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, -0x3f000000    # -8.0f

    .line 177
    .line 178
    const/high16 v26, -0x3f000000    # -8.0f

    .line 179
    .line 180
    const v21, -0x3f72e148    # -4.41f

    .line 181
    .line 182
    .line 183
    const/high16 v23, -0x3f000000    # -8.0f

    .line 184
    .line 185
    const v24, -0x3f9a3d71    # -3.59f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x3f8f5c29    # 1.12f

    .line 192
    .line 193
    .line 194
    const v26, -0x3f7e147b    # -4.06f

    .line 195
    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const v22, -0x40428f5c    # -1.48f

    .line 200
    .line 201
    .line 202
    const v23, 0x3ed1eb85    # 0.41f

    .line 203
    .line 204
    .line 205
    const v24, -0x3fc8f5c3    # -2.86f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x412ee148    # 10.93f

    .line 212
    .line 213
    .line 214
    const v6, 0x412f0a3d    # 10.94f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v26, 0x41a00000    # 20.0f

    .line 223
    .line 224
    const v21, 0x416dc28f    # 14.86f

    .line 225
    .line 226
    .line 227
    const v22, 0x419cb852    # 19.59f

    .line 228
    .line 229
    .line 230
    const v23, 0x4157ae14    # 13.48f

    .line 231
    .line 232
    .line 233
    const/high16 v24, 0x41a00000    # 20.0f

    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const/16 v16, 0x3800

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v8, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    const/high16 v9, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/high16 v12, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    const/4 v14, 0x0

    .line 260
    const/4 v15, 0x0

    .line 261
    const-string v4, ""

    .line 262
    .line 263
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40800000    # 4.0f

    .line 294
    .line 295
    const/high16 v2, 0x41400000    # 12.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x41000000    # 8.0f

    .line 301
    .line 302
    const/high16 v18, 0x41000000    # 8.0f

    .line 303
    .line 304
    const v13, 0x408d1eb8    # 4.41f

    .line 305
    .line 306
    .line 307
    const/high16 v15, 0x41000000    # 8.0f

    .line 308
    .line 309
    const v16, 0x4065c28f    # 3.59f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x4070a3d7    # -1.12f

    .line 316
    .line 317
    .line 318
    const v18, 0x4081999a    # 4.05f

    .line 319
    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const v14, 0x3fbd70a4    # 1.48f

    .line 323
    .line 324
    .line 325
    const v15, -0x412e147b    # -0.41f

    .line 326
    .line 327
    .line 328
    const v16, 0x40370a3d    # 2.86f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x3fb9999a    # 1.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x41b00000    # 22.0f

    .line 341
    .line 342
    const/high16 v18, 0x41400000    # 12.0f

    .line 343
    .line 344
    const v13, 0x41ab1eb8    # 21.39f

    .line 345
    .line 346
    .line 347
    const v14, 0x417ee148    # 15.93f

    .line 348
    .line 349
    .line 350
    const/high16 v15, 0x41b00000    # 22.0f

    .line 351
    .line 352
    const v16, 0x4160a3d7    # 14.04f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 359
    .line 360
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x3f4f5c29    # -5.52f

    .line 364
    .line 365
    .line 366
    const v15, -0x3f70a3d7    # -4.48f

    .line 367
    .line 368
    .line 369
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x40cfae14    # 6.49f

    .line 375
    .line 376
    .line 377
    const v18, 0x406a3d71    # 3.66f

    .line 378
    .line 379
    .line 380
    const v13, 0x411f5c29    # 9.96f

    .line 381
    .line 382
    .line 383
    const/high16 v14, 0x40000000    # 2.0f

    .line 384
    .line 385
    const v15, 0x41011eb8    # 8.07f

    .line 386
    .line 387
    .line 388
    const v16, 0x40270a3d    # 2.61f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, 0x41400000    # 12.0f

    .line 398
    .line 399
    const/high16 v18, 0x40800000    # 4.0f

    .line 400
    .line 401
    const v13, 0x41123d71    # 9.14f

    .line 402
    .line 403
    .line 404
    const v14, 0x408d1eb8    # 4.41f

    .line 405
    .line 406
    .line 407
    const v15, 0x412851ec    # 10.52f

    .line 408
    .line 409
    .line 410
    const/high16 v16, 0x40800000    # 4.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const/16 v16, 0x3800

    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    const/high16 v6, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const/high16 v12, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const/4 v14, 0x0

    .line 433
    const/4 v15, 0x0

    .line 434
    const-string v4, ""

    .line 435
    .line 436
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    sput-object v0, Landroidx/compose/material/icons/twotone/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 445
    .line 446
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    return-object v0
.end method

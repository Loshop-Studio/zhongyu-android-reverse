.class public final Landroidx/compose/material/icons/sharp/MotionPhotosOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.MotionPhotosOff"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3fdae148    # -2.58f

    .line 78
    .line 79
    .line 80
    const v26, 0x3f170a3d    # 0.59f

    .line 81
    .line 82
    .line 83
    const v21, -0x40947ae1    # -0.92f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x4019999a    # -1.8f

    .line 89
    .line 90
    .line 91
    const v24, 0x3e6147ae    # 0.22f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40ffae14    # 7.99f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x41900000    # 18.0f

    .line 106
    .line 107
    const/high16 v26, 0x41400000    # 12.0f

    .line 108
    .line 109
    const v21, 0x418e3d71    # 17.78f

    .line 110
    .line 111
    .line 112
    const v22, 0x415ccccd    # 13.8f

    .line 113
    .line 114
    .line 115
    const/high16 v23, 0x41900000    # 18.0f

    .line 116
    .line 117
    const v24, 0x414eb852    # 12.92f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v26, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const/high16 v21, 0x41900000    # 18.0f

    .line 128
    .line 129
    const v22, 0x410b0a3d    # 8.69f

    .line 130
    .line 131
    .line 132
    const v23, 0x4174f5c3    # 15.31f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x40c00000    # 6.0f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v16, 0x3800

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/high16 v6, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const v4, 0x4033d70a    # 2.81f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x3fb1eb85    # 1.39f

    .line 202
    .line 203
    .line 204
    const v6, 0x40870a3d    # 4.22f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, 0x401147ae    # 2.27f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x40000000    # 2.0f

    .line 217
    .line 218
    const/high16 v26, 0x41400000    # 12.0f

    .line 219
    .line 220
    const v21, 0x40270a3d    # 2.61f

    .line 221
    .line 222
    .line 223
    const v22, 0x41011eb8    # 8.07f

    .line 224
    .line 225
    .line 226
    const/high16 v23, 0x40000000    # 2.0f

    .line 227
    .line 228
    const v24, 0x411f5c29    # 9.96f

    .line 229
    .line 230
    .line 231
    move-object/from16 v20, v2

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, 0x41200000    # 10.0f

    .line 237
    .line 238
    const/high16 v26, 0x41200000    # 10.0f

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const v22, 0x40b0a3d7    # 5.52f

    .line 243
    .line 244
    .line 245
    const v23, 0x408f5c29    # 4.48f

    .line 246
    .line 247
    .line 248
    const/high16 v24, 0x41200000    # 10.0f

    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, 0x40b051ec    # 5.51f

    .line 254
    .line 255
    .line 256
    const v26, -0x402b851f    # -1.66f

    .line 257
    .line 258
    .line 259
    const v21, 0x40028f5c    # 2.04f

    .line 260
    .line 261
    .line 262
    const/16 v22, 0x0

    .line 263
    .line 264
    const v23, 0x407b851f    # 3.93f

    .line 265
    .line 266
    .line 267
    const v24, -0x40e3d70a    # -0.61f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3fb47ae1    # 1.41f

    .line 277
    .line 278
    .line 279
    const v6, -0x404a3d71    # -1.42f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x4033d70a    # 2.81f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v4, 0x41a00000    # 20.0f

    .line 295
    .line 296
    const/high16 v6, 0x41400000    # 12.0f

    .line 297
    .line 298
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v25, -0x3f000000    # -8.0f

    .line 302
    .line 303
    const/high16 v26, -0x3f000000    # -8.0f

    .line 304
    .line 305
    const v21, -0x3f72e148    # -4.41f

    .line 306
    .line 307
    .line 308
    const/high16 v23, -0x3f000000    # -8.0f

    .line 309
    .line 310
    const v24, -0x3f9a3d71    # -3.59f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, 0x3f8f5c29    # 1.12f

    .line 317
    .line 318
    .line 319
    const v26, -0x3f7e147b    # -4.06f

    .line 320
    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    const v22, -0x40428f5c    # -1.48f

    .line 325
    .line 326
    .line 327
    const v23, 0x3ed1eb85    # 0.41f

    .line 328
    .line 329
    .line 330
    const v24, -0x3fc8f5c3    # -2.86f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x3fbc28f6    # 1.47f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, 0x40c00000    # 6.0f

    .line 343
    .line 344
    const/high16 v26, 0x41400000    # 12.0f

    .line 345
    .line 346
    const v21, 0x40c70a3d    # 6.22f

    .line 347
    .line 348
    .line 349
    const v22, 0x41233333    # 10.2f

    .line 350
    .line 351
    .line 352
    const/high16 v23, 0x40c00000    # 6.0f

    .line 353
    .line 354
    const v24, 0x413147ae    # 11.08f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v26, 0x40c00000    # 6.0f

    .line 361
    .line 362
    const/16 v21, 0x0

    .line 363
    .line 364
    const v22, 0x4053d70a    # 3.31f

    .line 365
    .line 366
    .line 367
    const v23, 0x402c28f6    # 2.69f

    .line 368
    .line 369
    .line 370
    const/high16 v24, 0x40c00000    # 6.0f

    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v25, 0x40251eb8    # 2.58f

    .line 376
    .line 377
    .line 378
    const v26, -0x40e8f5c3    # -0.59f

    .line 379
    .line 380
    .line 381
    const v21, 0x3f6b851f    # 0.92f

    .line 382
    .line 383
    .line 384
    const/16 v22, 0x0

    .line 385
    .line 386
    const v23, 0x3fe66666    # 1.8f

    .line 387
    .line 388
    .line 389
    const v24, -0x419eb852    # -0.22f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, 0x41400000    # 12.0f

    .line 399
    .line 400
    const/high16 v26, 0x41a00000    # 20.0f

    .line 401
    .line 402
    const v21, 0x416dc28f    # 14.86f

    .line 403
    .line 404
    .line 405
    const v22, 0x419cb852    # 19.59f

    .line 406
    .line 407
    .line 408
    const v23, 0x4157ae14    # 13.48f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x41a00000    # 20.0f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/high16 v6, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const-string v4, ""

    .line 427
    .line 428
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 429
    .line 430
    .line 431
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 436
    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 438
    .line 439
    .line 440
    move-result-wide v6

    .line 441
    const/4 v0, 0x0

    .line 442
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x40800000    # 4.0f

    .line 459
    .line 460
    const/high16 v2, 0x41400000    # 12.0f

    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41000000    # 8.0f

    .line 466
    .line 467
    const/high16 v18, 0x41000000    # 8.0f

    .line 468
    .line 469
    const v13, 0x408d1eb8    # 4.41f

    .line 470
    .line 471
    .line 472
    const/high16 v15, 0x41000000    # 8.0f

    .line 473
    .line 474
    const v16, 0x4065c28f    # 3.59f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, -0x4070a3d7    # -1.12f

    .line 481
    .line 482
    .line 483
    const v18, 0x4081999a    # 4.05f

    .line 484
    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const v14, 0x3fbd70a4    # 1.48f

    .line 488
    .line 489
    .line 490
    const v15, -0x412e147b    # -0.41f

    .line 491
    .line 492
    .line 493
    const v16, 0x40370a3d    # 2.86f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x3fb9999a    # 1.45f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x41b00000    # 22.0f

    .line 506
    .line 507
    const/high16 v18, 0x41400000    # 12.0f

    .line 508
    .line 509
    const v13, 0x41ab1eb8    # 21.39f

    .line 510
    .line 511
    .line 512
    const v14, 0x417ee148    # 15.93f

    .line 513
    .line 514
    .line 515
    const/high16 v15, 0x41b00000    # 22.0f

    .line 516
    .line 517
    const v16, 0x4160a3d7    # 14.04f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 524
    .line 525
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const v14, -0x3f4f5c29    # -5.52f

    .line 529
    .line 530
    .line 531
    const v15, -0x3f70a3d7    # -4.48f

    .line 532
    .line 533
    .line 534
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x40cfae14    # 6.49f

    .line 540
    .line 541
    .line 542
    const v18, 0x406a3d71    # 3.66f

    .line 543
    .line 544
    .line 545
    const v13, 0x411f5c29    # 9.96f

    .line 546
    .line 547
    .line 548
    const/high16 v14, 0x40000000    # 2.0f

    .line 549
    .line 550
    const v15, 0x41011eb8    # 8.07f

    .line 551
    .line 552
    .line 553
    const v16, 0x40270a3d    # 2.61f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x41400000    # 12.0f

    .line 563
    .line 564
    const/high16 v18, 0x40800000    # 4.0f

    .line 565
    .line 566
    const v13, 0x41123d71    # 9.14f

    .line 567
    .line 568
    .line 569
    const v14, 0x408d1eb8    # 4.41f

    .line 570
    .line 571
    .line 572
    const v15, 0x412851ec    # 10.52f

    .line 573
    .line 574
    .line 575
    const/high16 v16, 0x40800000    # 4.0f

    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/16 v16, 0x3800

    .line 588
    .line 589
    const/16 v17, 0x0

    .line 590
    .line 591
    const/high16 v6, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v12, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v13, 0x0

    .line 597
    const/4 v14, 0x0

    .line 598
    const/4 v15, 0x0

    .line 599
    const-string v4, ""

    .line 600
    .line 601
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    sput-object v0, Landroidx/compose/material/icons/sharp/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 610
    .line 611
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    return-object v0
.end method

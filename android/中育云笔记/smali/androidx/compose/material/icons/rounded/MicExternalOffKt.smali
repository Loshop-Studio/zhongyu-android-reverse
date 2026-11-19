.class public final Landroidx/compose/material/icons/rounded/MicExternalOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicExternalOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MicExternalOffKt;->_micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MicExternalOff"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x401ae148    # 2.42f

    .line 78
    .line 79
    .line 80
    const v26, -0x40051eb8    # -1.96f

    .line 81
    .line 82
    .line 83
    const/16 v21, 0x0

    .line 84
    .line 85
    const v22, -0x406147ae    # -1.24f

    .line 86
    .line 87
    .line 88
    const v23, 0x3f91eb85    # 1.14f

    .line 89
    .line 90
    .line 91
    const v24, -0x3ff1eb85    # -2.22f

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
    const/high16 v25, 0x41900000    # 18.0f

    .line 100
    .line 101
    const v26, 0x40c2e148    # 6.09f

    .line 102
    .line 103
    .line 104
    const v21, 0x418ae148    # 17.36f

    .line 105
    .line 106
    .line 107
    const v22, 0x4087ae14    # 4.24f

    .line 108
    .line 109
    .line 110
    const/high16 v23, 0x41900000    # 18.0f

    .line 111
    .line 112
    const v24, 0x40a428f6    # 5.13f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x411147ae    # 9.08f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40000000    # 2.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, 0x40c51eb8    # 6.16f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, -0x3f8f5c29    # -3.76f

    .line 136
    .line 137
    .line 138
    const v26, -0x3f7b3333    # -4.15f

    .line 139
    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const v22, -0x3ffae148    # -2.08f

    .line 144
    .line 145
    .line 146
    const v23, -0x4028f5c3    # -1.68f

    .line 147
    .line 148
    .line 149
    const v24, -0x3f7f0a3d    # -4.03f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v25, 0x41400000    # 12.0f

    .line 156
    .line 157
    const/high16 v26, 0x40c00000    # 6.0f

    .line 158
    .line 159
    const v21, 0x415eb852    # 13.92f

    .line 160
    .line 161
    .line 162
    const v22, 0x3fef5c29    # 1.87f

    .line 163
    .line 164
    .line 165
    const/high16 v23, 0x41400000    # 12.0f

    .line 166
    .line 167
    const v24, 0x406d70a4    # 3.71f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x404ae148    # 3.17f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x40000000    # 2.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40c00000    # 6.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v16, 0x3800

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/high16 v6, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/high16 v8, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/high16 v9, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/high16 v12, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const-string v4, ""

    .line 213
    .line 214
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 224
    .line 225
    .line 226
    move-result-wide v6

    .line 227
    const/4 v2, 0x0

    .line 228
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41200000    # 10.0f

    .line 245
    .line 246
    const/high16 v6, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 252
    .line 253
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const v22, -0x402b851f    # -1.66f

    .line 258
    .line 259
    .line 260
    const v23, -0x40547ae1    # -1.34f

    .line 261
    .line 262
    .line 263
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 264
    .line 265
    move-object/from16 v20, v2

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v25, 0x40aa8f5c    # 5.33f

    .line 271
    .line 272
    .line 273
    const/high16 v26, 0x40200000    # 2.5f

    .line 274
    .line 275
    const v21, 0x40cc28f6    # 6.38f

    .line 276
    .line 277
    .line 278
    const/high16 v22, 0x40000000    # 2.0f

    .line 279
    .line 280
    const v23, 0x40b9eb85    # 5.81f

    .line 281
    .line 282
    .line 283
    const v24, 0x400c28f6    # 2.19f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x4084cccd    # 4.15f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x41200000    # 10.0f

    .line 296
    .line 297
    const/high16 v26, 0x40a00000    # 5.0f

    .line 298
    .line 299
    const v21, 0x411ccccd    # 9.8f

    .line 300
    .line 301
    .line 302
    const v22, 0x40c5c28f    # 6.18f

    .line 303
    .line 304
    .line 305
    const/high16 v23, 0x41200000    # 10.0f

    .line 306
    .line 307
    const v24, 0x40b3851f    # 5.61f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    const/high16 v6, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    const-string v4, ""

    .line 324
    .line 325
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 333
    .line 334
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 335
    .line 336
    .line 337
    move-result-wide v6

    .line 338
    const/4 v0, 0x0

    .line 339
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const v0, 0x3fb1eb85    # 1.39f

    .line 356
    .line 357
    .line 358
    const v2, 0x4033d70a    # 2.81f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x3fb1eb85    # 1.39f

    .line 368
    .line 369
    .line 370
    const v18, 0x40870a3d    # 4.22f

    .line 371
    .line 372
    .line 373
    const/high16 v13, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const v14, 0x404ccccd    # 3.2f

    .line 376
    .line 377
    .line 378
    const/high16 v15, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const v16, 0x40751eb8    # 3.83f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x40a570a4    # 5.17f

    .line 387
    .line 388
    .line 389
    const/high16 v2, 0x41000000    # 8.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x40a33333    # 5.1f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, -0x40800000    # -1.0f

    .line 401
    .line 402
    const v18, 0x3f8ccccd    # 1.1f

    .line 403
    .line 404
    .line 405
    const v13, -0x40e8f5c3    # -0.59f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, -0x4079999a    # -1.05f

    .line 410
    .line 411
    .line 412
    const v16, 0x3f028f5c    # 0.51f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x3f59999a    # 0.85f

    .line 419
    .line 420
    .line 421
    const v2, 0x41073333    # 8.45f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x40ae6666    # 5.45f

    .line 428
    .line 429
    .line 430
    const/high16 v18, 0x41900000    # 18.0f

    .line 431
    .line 432
    const v13, 0x409f5c29    # 4.98f

    .line 433
    .line 434
    .line 435
    const v14, 0x418e7ae1    # 17.81f

    .line 436
    .line 437
    .line 438
    const v15, 0x40a66666    # 5.2f

    .line 439
    .line 440
    .line 441
    const/high16 v16, 0x41900000    # 18.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40c00000    # 6.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x408c7ae1    # 4.39f

    .line 452
    .line 453
    .line 454
    const v18, 0x407eb852    # 3.98f

    .line 455
    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const v14, 0x4015c28f    # 2.34f

    .line 459
    .line 460
    .line 461
    const v15, 0x4000a3d7    # 2.01f

    .line 462
    .line 463
    .line 464
    const v16, 0x4086b852    # 4.21f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x40670a3d    # 3.61f

    .line 471
    .line 472
    .line 473
    const v18, -0x3f7b3333    # -4.15f

    .line 474
    .line 475
    .line 476
    const v13, 0x40051eb8    # 2.08f

    .line 477
    .line 478
    .line 479
    const v14, -0x41b33333    # -0.2f

    .line 480
    .line 481
    .line 482
    const v15, 0x40670a3d    # 3.61f

    .line 483
    .line 484
    .line 485
    const v16, -0x3ffc28f6    # -2.06f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, -0x40800000    # -1.0f

    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40b8f5c3    # 5.78f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x3fb47ae1    # 1.41f

    .line 504
    .line 505
    .line 506
    const/16 v18, 0x0

    .line 507
    .line 508
    const v13, 0x3ec7ae14    # 0.39f

    .line 509
    .line 510
    .line 511
    const v14, 0x3ec7ae14    # 0.39f

    .line 512
    .line 513
    .line 514
    const v15, 0x3f828f5c    # 1.02f

    .line 515
    .line 516
    .line 517
    const v16, 0x3ec7ae14    # 0.39f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/4 v0, 0x0

    .line 524
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const v18, -0x404b851f    # -1.41f

    .line 530
    .line 531
    .line 532
    const v14, -0x413851ec    # -0.39f

    .line 533
    .line 534
    .line 535
    const v15, 0x3ec7ae14    # 0.39f

    .line 536
    .line 537
    .line 538
    const v16, -0x407d70a4    # -1.02f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x4033d70a    # 2.81f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, 0x3fb1eb85    # 1.39f

    .line 551
    .line 552
    .line 553
    const v18, 0x4033d70a    # 2.81f

    .line 554
    .line 555
    .line 556
    const v13, 0x401ae148    # 2.42f

    .line 557
    .line 558
    .line 559
    const v14, 0x401ae148    # 2.42f

    .line 560
    .line 561
    .line 562
    const v15, 0x3fe3d70a    # 1.78f

    .line 563
    .line 564
    .line 565
    const v16, 0x401ae148    # 2.42f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x418f47ae    # 17.91f

    .line 575
    .line 576
    .line 577
    const/high16 v2, 0x41400000    # 12.0f

    .line 578
    .line 579
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, -0x4035c28f    # -1.58f

    .line 583
    .line 584
    .line 585
    const v18, 0x40033333    # 2.05f

    .line 586
    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const v14, 0x3f75c28f    # 0.96f

    .line 590
    .line 591
    .line 592
    const v15, -0x40dc28f6    # -0.64f

    .line 593
    .line 594
    .line 595
    const v16, 0x3fee147b    # 1.86f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x41000000    # 8.0f

    .line 602
    .line 603
    const/high16 v18, 0x41900000    # 18.0f

    .line 604
    .line 605
    const v13, 0x41123d71    # 9.14f

    .line 606
    .line 607
    .line 608
    const v14, 0x41a1c28f    # 20.22f

    .line 609
    .line 610
    .line 611
    const/high16 v15, 0x41000000    # 8.0f

    .line 612
    .line 613
    const v16, 0x4199eb85    # 19.24f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x3f0ccccd    # 0.55f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x3f000000    # 0.5f

    .line 626
    .line 627
    const v18, -0x4119999a    # -0.45f

    .line 628
    .line 629
    .line 630
    const v13, 0x3e851eb8    # 0.26f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const v15, 0x3ef0a3d7    # 0.47f

    .line 635
    .line 636
    .line 637
    const v16, -0x41bd70a4    # -0.19f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3f051eb8    # 0.52f

    .line 644
    .line 645
    .line 646
    const v2, -0x3f5ae148    # -5.16f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x416d47ae    # 14.83f

    .line 653
    .line 654
    .line 655
    const/high16 v2, 0x41400000    # 12.0f

    .line 656
    .line 657
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x418f47ae    # 17.91f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    const/16 v16, 0x3800

    .line 674
    .line 675
    const/16 v17, 0x0

    .line 676
    .line 677
    const/high16 v6, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/4 v7, 0x0

    .line 680
    const/high16 v12, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const/4 v15, 0x0

    .line 684
    const-string v4, ""

    .line 685
    .line 686
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    sput-object v0, Landroidx/compose/material/icons/rounded/MicExternalOffKt;->_micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/filled/EditLocationAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEditLocationAlt(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/EditLocationAltKt;->_editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.EditLocationAlt"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v6, 0x415f3333    # 13.95f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41100000    # 9.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x4100cccd    # 8.05f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x40b3851f    # 5.61f

    .line 90
    .line 91
    .line 92
    const v6, -0x3f4c7ae1    # -5.61f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/high16 v26, 0x40000000    # 2.0f

    .line 101
    .line 102
    const v21, 0x415c7ae1    # 13.78f

    .line 103
    .line 104
    .line 105
    const v22, 0x400a3d71    # 2.16f

    .line 106
    .line 107
    .line 108
    const v23, 0x414e6666    # 12.9f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x40000000    # 2.0f

    .line 112
    .line 113
    move-object/from16 v20, v2

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, -0x3f000000    # -8.0f

    .line 119
    .line 120
    const v26, 0x41033333    # 8.2f

    .line 121
    .line 122
    .line 123
    const v21, -0x3f79999a    # -4.2f

    .line 124
    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/high16 v23, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const v24, 0x404e147b    # 3.22f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41000000    # 8.0f

    .line 137
    .line 138
    const v26, 0x413ccccd    # 11.8f

    .line 139
    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const v22, 0x40547ae1    # 3.32f

    .line 144
    .line 145
    .line 146
    const v23, 0x402ae148    # 2.67f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x40e80000    # 7.25f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v26, -0x3ec33333    # -11.8f

    .line 155
    .line 156
    .line 157
    const v21, 0x40aa8f5c    # 5.33f

    .line 158
    .line 159
    .line 160
    const v22, -0x3f6e6666    # -4.55f

    .line 161
    .line 162
    .line 163
    const/high16 v23, 0x41000000    # 8.0f

    .line 164
    .line 165
    const v24, -0x3ef851ec    # -8.48f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, -0x4119999a    # -0.45f

    .line 172
    .line 173
    .line 174
    const v26, -0x3fcccccd    # -2.8f

    .line 175
    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, -0x407eb852    # -1.01f

    .line 180
    .line 181
    .line 182
    const v23, -0x41dc28f6    # -0.16f

    .line 183
    .line 184
    .line 185
    const v24, -0x4007ae14    # -1.94f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x41500000    # 13.0f

    .line 192
    .line 193
    const v6, 0x415f3333    # 13.95f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const/16 v16, 0x3800

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/high16 v6, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v8, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    const/high16 v9, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/high16 v12, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    const-string v4, ""

    .line 223
    .line 224
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    const/4 v2, 0x0

    .line 238
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41300000    # 11.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    const v6, 0x4007ae14    # 2.12f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, -0x3f3ae148    # -6.16f

    .line 267
    .line 268
    .line 269
    const v6, 0x40c51eb8    # 6.16f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, -0x3ff851ec    # -2.12f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, -0x3f3ae148    # -6.16f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/high16 v6, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const-string v4, ""

    .line 298
    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    const/4 v0, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const v0, 0x41a5ae14    # 20.71f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41a00000    # 20.0f

    .line 338
    .line 339
    const v2, 0x3fa51eb8    # 1.29f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, 0x419a51ec    # 19.29f

    .line 346
    .line 347
    .line 348
    const/high16 v18, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const v13, 0x419e6666    # 19.8f

    .line 351
    .line 352
    .line 353
    const v14, 0x3f8ccccd    # 1.1f

    .line 354
    .line 355
    .line 356
    const v15, 0x419c6666    # 19.55f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x3f800000    # 1.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x40ca3d71    # -0.71f

    .line 365
    .line 366
    .line 367
    const v18, 0x3e947ae1    # 0.29f

    .line 368
    .line 369
    .line 370
    const v13, -0x41fae148    # -0.13f

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const v15, -0x410a3d71    # -0.48f

    .line 375
    .line 376
    .line 377
    const v16, 0x3d8f5c29    # 0.07f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3f3851ec    # 0.72f

    .line 384
    .line 385
    .line 386
    const v2, -0x40c7ae14    # -0.72f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x4007ae14    # 2.12f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x3f3851ec    # 0.72f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x41a5ae14    # 20.71f

    .line 405
    .line 406
    .line 407
    const/high16 v18, 0x40000000    # 2.0f

    .line 408
    .line 409
    const v13, 0x41a8cccd    # 21.1f

    .line 410
    .line 411
    .line 412
    const v14, 0x404147ae    # 3.02f

    .line 413
    .line 414
    .line 415
    const v15, 0x41a8cccd    # 21.1f

    .line 416
    .line 417
    .line 418
    const v16, 0x4018f5c3    # 2.39f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/16 v16, 0x3800

    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v7, 0x0

    .line 438
    const/high16 v12, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const/4 v14, 0x0

    .line 442
    const/4 v15, 0x0

    .line 443
    const-string v4, ""

    .line 444
    .line 445
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sput-object v0, Landroidx/compose/material/icons/filled/EditLocationAltKt;->_editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 454
    .line 455
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    return-object v0
.end method

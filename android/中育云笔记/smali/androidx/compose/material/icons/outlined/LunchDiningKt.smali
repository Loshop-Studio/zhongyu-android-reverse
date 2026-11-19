.class public final Landroidx/compose/material/icons/outlined/LunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLunchDining(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LunchDining"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f8ccccd    # 1.1f

    .line 84
    .line 85
    .line 86
    const v23, 0x3f666666    # 0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40000000    # 2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41800000    # 16.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v26, -0x40000000    # -2.0f

    .line 102
    .line 103
    const v21, 0x3f8ccccd    # 1.1f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x40000000    # 2.0f

    .line 109
    .line 110
    const v24, -0x4099999a    # -0.9f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40000000    # 2.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41980000    # 19.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41900000    # 18.0f

    .line 135
    .line 136
    const/high16 v6, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41800000    # 16.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x3f800000    # 1.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x40800000    # 4.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41900000    # 18.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const/16 v16, 0x3800

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v8, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v12, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const-string v4, ""

    .line 185
    .line 186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const/4 v2, 0x0

    .line 200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const v4, 0x419547ae    # 18.66f

    .line 217
    .line 218
    .line 219
    const/high16 v6, 0x41380000    # 11.5f

    .line 220
    .line 221
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, -0x3faae148    # -3.33f

    .line 225
    .line 226
    .line 227
    const/high16 v26, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const v21, -0x40066666    # -1.95f

    .line 230
    .line 231
    .line 232
    const v23, -0x3ffa3d71    # -2.09f

    .line 233
    .line 234
    .line 235
    const/high16 v24, 0x3f800000    # 1.0f

    .line 236
    .line 237
    move-object/from16 v20, v2

    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v26, -0x40800000    # -1.0f

    .line 243
    .line 244
    const v21, -0x4067ae14    # -1.19f

    .line 245
    .line 246
    .line 247
    const v23, -0x404a3d71    # -1.42f

    .line 248
    .line 249
    .line 250
    const/high16 v24, -0x40800000    # -1.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v26, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const v21, -0x40066666    # -1.95f

    .line 258
    .line 259
    .line 260
    const v23, -0x3ffa3d71    # -2.09f

    .line 261
    .line 262
    .line 263
    const/high16 v24, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v26, -0x40800000    # -1.0f

    .line 269
    .line 270
    const v21, -0x4067ae14    # -1.19f

    .line 271
    .line 272
    .line 273
    const v23, -0x404a3d71    # -1.42f

    .line 274
    .line 275
    .line 276
    const/high16 v24, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v26, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const v21, -0x40066666    # -1.95f

    .line 284
    .line 285
    .line 286
    const v23, -0x3ffa3d71    # -2.09f

    .line 287
    .line 288
    .line 289
    const/high16 v24, 0x3f800000    # 1.0f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v4, 0x40000000    # 2.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, 0x40566666    # 3.35f

    .line 300
    .line 301
    .line 302
    const/high16 v26, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v21, 0x3ff33333    # 1.9f

    .line 305
    .line 306
    .line 307
    const v23, 0x400ae148    # 2.17f

    .line 308
    .line 309
    .line 310
    const/high16 v24, -0x40800000    # -1.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, 0x40551eb8    # 3.33f

    .line 316
    .line 317
    .line 318
    const/high16 v26, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v21, 0x3f9851ec    # 1.19f

    .line 321
    .line 322
    .line 323
    const v23, 0x3fb5c28f    # 1.42f

    .line 324
    .line 325
    .line 326
    const/high16 v24, 0x3f800000    # 1.0f

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v26, -0x40800000    # -1.0f

    .line 332
    .line 333
    const v21, 0x3ff9999a    # 1.95f

    .line 334
    .line 335
    .line 336
    const v23, 0x4005c28f    # 2.09f

    .line 337
    .line 338
    .line 339
    const/high16 v24, -0x40800000    # -1.0f

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v26, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const v21, 0x3f9851ec    # 1.19f

    .line 347
    .line 348
    .line 349
    const v23, 0x3fb5c28f    # 1.42f

    .line 350
    .line 351
    .line 352
    const/high16 v24, 0x3f800000    # 1.0f

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v26, -0x40800000    # -1.0f

    .line 358
    .line 359
    const v21, 0x3ff9999a    # 1.95f

    .line 360
    .line 361
    .line 362
    const v23, 0x4005c28f    # 2.09f

    .line 363
    .line 364
    .line 365
    const/high16 v24, -0x40800000    # -1.0f

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, 0x40547ae1    # 3.32f

    .line 371
    .line 372
    .line 373
    const/high16 v26, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const v21, 0x3f9851ec    # 1.19f

    .line 376
    .line 377
    .line 378
    const v23, 0x3fb33333    # 1.4f

    .line 379
    .line 380
    .line 381
    const v24, 0x3f7ae148    # 0.98f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, -0x43dc28f6    # -0.01f

    .line 388
    .line 389
    .line 390
    const v6, -0x40028f5c    # -1.98f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v25, 0x419547ae    # 18.66f

    .line 397
    .line 398
    .line 399
    const/high16 v26, 0x41380000    # 11.5f

    .line 400
    .line 401
    const v21, 0x41a30a3d    # 20.38f

    .line 402
    .line 403
    .line 404
    const v22, 0x41430a3d    # 12.19f

    .line 405
    .line 406
    .line 407
    const v23, 0x41a2f5c3    # 20.37f

    .line 408
    .line 409
    .line 410
    const/high16 v24, 0x41380000    # 11.5f

    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const/high16 v6, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    const-string v4, ""

    .line 426
    .line 427
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 428
    .line 429
    .line 430
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 435
    .line 436
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v6

    .line 440
    const/4 v0, 0x0

    .line 441
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41100000    # 9.0f

    .line 458
    .line 459
    const/high16 v2, 0x41b00000    # 22.0f

    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 465
    .line 466
    const/high16 v18, -0x3f400000    # -6.0f

    .line 467
    .line 468
    const v13, 0x3ca3d70a    # 0.02f

    .line 469
    .line 470
    .line 471
    const/high16 v14, -0x3f800000    # -4.0f

    .line 472
    .line 473
    const v15, -0x3f770a3d    # -4.28f

    .line 474
    .line 475
    .line 476
    const/high16 v16, -0x3f400000    # -6.0f

    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x40000000    # 2.0f

    .line 482
    .line 483
    const/high16 v18, 0x41100000    # 9.0f

    .line 484
    .line 485
    const v13, 0x40c947ae    # 6.29f

    .line 486
    .line 487
    .line 488
    const/high16 v14, 0x40400000    # 3.0f

    .line 489
    .line 490
    const/high16 v15, 0x40000000    # 2.0f

    .line 491
    .line 492
    const/high16 v16, 0x40a00000    # 5.0f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x3f800000    # 1.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x41a00000    # 20.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41100000    # 9.0f

    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41000000    # 8.0f

    .line 519
    .line 520
    const v2, 0x4085c28f    # 4.18f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x41400000    # 12.0f

    .line 527
    .line 528
    const/high16 v18, 0x40a00000    # 5.0f

    .line 529
    .line 530
    const v13, 0x40a051ec    # 5.01f

    .line 531
    .line 532
    .line 533
    const v14, 0x40b9eb85    # 5.81f

    .line 534
    .line 535
    .line 536
    const v15, 0x4109c28f    # 8.61f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x40e6147b    # 7.19f

    .line 543
    .line 544
    .line 545
    const v18, 0x3ffeb852    # 1.99f

    .line 546
    .line 547
    .line 548
    const v13, 0x4053d70a    # 3.31f

    .line 549
    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    const v15, 0x40bdc28f    # 5.93f

    .line 553
    .line 554
    .line 555
    const v16, 0x3f3ae148    # 0.73f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, 0x419eb852    # 19.84f

    .line 562
    .line 563
    .line 564
    const/high16 v18, 0x41000000    # 8.0f

    .line 565
    .line 566
    const v13, 0x419beb85    # 19.49f

    .line 567
    .line 568
    .line 569
    const v14, 0x40e9999a    # 7.3f

    .line 570
    .line 571
    .line 572
    const v15, 0x419dae14    # 19.71f

    .line 573
    .line 574
    .line 575
    const v16, 0x40f428f6    # 7.63f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x4085c28f    # 4.18f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    const/16 v16, 0x3800

    .line 595
    .line 596
    const/16 v17, 0x0

    .line 597
    .line 598
    const/high16 v6, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    const/high16 v12, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const/4 v14, 0x0

    .line 605
    const/4 v15, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    sput-object v0, Landroidx/compose/material/icons/outlined/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    return-object v0
.end method

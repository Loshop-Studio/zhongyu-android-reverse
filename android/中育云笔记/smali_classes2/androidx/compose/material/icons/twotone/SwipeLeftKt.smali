.class public final Landroidx/compose/material/icons/twotone/SwipeLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeLeft(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SwipeLeftKt;->_swipeLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SwipeLeft"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v6, 0x4188a3d7    # 17.08f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3f2e6666    # -6.55f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v4, -0x3f8e147b    # -3.78f

    .line 85
    .line 86
    .line 87
    const v6, -0x3f933333    # -3.7f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x4190e148    # 18.11f

    .line 94
    .line 95
    .line 96
    const/high16 v6, 0x41300000    # 11.0f

    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40f00000    # 7.5f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x41380000    # 11.5f

    .line 107
    .line 108
    const/high16 v26, 0x40e00000    # 7.0f

    .line 109
    .line 110
    const/high16 v21, 0x41300000    # 11.0f

    .line 111
    .line 112
    const v22, 0x40e70a3d    # 7.22f

    .line 113
    .line 114
    .line 115
    const v23, 0x4133851f    # 11.22f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40e00000    # 7.0f

    .line 119
    .line 120
    move-object/from16 v20, v2

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x40e70a3d    # 7.22f

    .line 126
    .line 127
    .line 128
    const/high16 v6, 0x41400000    # 12.0f

    .line 129
    .line 130
    const/high16 v7, 0x40f00000    # 7.5f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x40c5c28f    # 6.18f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x3fe147ae    # 1.76f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x4178f5c3    # 15.56f

    .line 148
    .line 149
    .line 150
    const/high16 v6, 0x41900000    # 18.0f

    .line 151
    .line 152
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x41a80000    # 21.0f

    .line 156
    .line 157
    const v6, 0x4188a3d7    # 17.08f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const v6, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const v8, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const v0, 0x41971eb8    # 18.89f

    .line 221
    .line 222
    .line 223
    const v2, 0x415c51ec    # 13.77f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x3f8ccccd    # -3.8f

    .line 230
    .line 231
    .line 232
    const v2, -0x402a3d71    # -1.67f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x416a6666    # 14.65f

    .line 239
    .line 240
    .line 241
    const/high16 v18, 0x41400000    # 12.0f

    .line 242
    .line 243
    const v13, 0x416f5c29    # 14.96f

    .line 244
    .line 245
    .line 246
    const v14, 0x4140a3d7    # 12.04f

    .line 247
    .line 248
    .line 249
    const v15, 0x416cf5c3    # 14.81f

    .line 250
    .line 251
    .line 252
    const/high16 v16, 0x41400000    # 12.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41600000    # 14.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x40f00000    # 7.5f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, 0x41380000    # 11.5f

    .line 268
    .line 269
    const/high16 v18, 0x40a00000    # 5.0f

    .line 270
    .line 271
    const/high16 v13, 0x41600000    # 14.0f

    .line 272
    .line 273
    const v14, 0x40c3d70a    # 6.12f

    .line 274
    .line 275
    .line 276
    const v15, 0x414e147b    # 12.88f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x40a00000    # 5.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x40c3d70a    # 6.12f

    .line 285
    .line 286
    .line 287
    const/high16 v2, 0x41100000    # 9.0f

    .line 288
    .line 289
    const/high16 v4, 0x40f00000    # 7.5f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x41026666    # 8.15f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x4010a3d7    # -1.87f

    .line 301
    .line 302
    .line 303
    const v2, -0x41333333    # -0.4f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x40228f5c    # -1.73f

    .line 310
    .line 311
    .line 312
    const v18, 0x3f0f5c29    # 0.56f

    .line 313
    .line 314
    .line 315
    const v13, -0x41bd70a4    # -0.19f

    .line 316
    .line 317
    .line 318
    const v14, -0x430a3d71    # -0.03f

    .line 319
    .line 320
    .line 321
    const v15, -0x407d70a4    # -1.02f

    .line 322
    .line 323
    .line 324
    const v16, -0x41e66666    # -0.15f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40800000    # 4.0f

    .line 331
    .line 332
    const v2, 0x4189c28f    # 17.22f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x40a3d70a    # 5.12f

    .line 339
    .line 340
    .line 341
    const v2, 0x40a6147b    # 5.19f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x41287ae1    # 10.53f

    .line 348
    .line 349
    .line 350
    const/high16 v18, 0x41b80000    # 23.0f

    .line 351
    .line 352
    const v13, 0x4117d70a    # 9.49f

    .line 353
    .line 354
    .line 355
    const v14, 0x41b651ec    # 22.79f

    .line 356
    .line 357
    .line 358
    const/high16 v15, 0x41200000    # 10.0f

    .line 359
    .line 360
    const/high16 v16, 0x41b80000    # 23.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x40d1999a    # 6.55f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x3ffc28f6    # 1.97f

    .line 372
    .line 373
    .line 374
    const v18, -0x402a3d71    # -1.67f

    .line 375
    .line 376
    .line 377
    const v13, 0x3f7ae148    # 0.98f

    .line 378
    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    const v15, 0x3fe7ae14    # 1.81f

    .line 382
    .line 383
    .line 384
    const v16, -0x40cccccd    # -0.7f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x3f6b851f    # 0.92f

    .line 391
    .line 392
    .line 393
    const v2, -0x3f51eb85    # -5.44f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x41971eb8    # 18.89f

    .line 400
    .line 401
    .line 402
    const v18, 0x415c51ec    # 13.77f

    .line 403
    .line 404
    .line 405
    const v13, 0x41a0f5c3    # 20.12f

    .line 406
    .line 407
    .line 408
    const v14, 0x41707ae1    # 15.03f

    .line 409
    .line 410
    .line 411
    const v15, 0x419d70a4    # 19.68f

    .line 412
    .line 413
    .line 414
    const v16, 0x4162b852    # 14.17f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41a80000    # 21.0f

    .line 424
    .line 425
    const v2, 0x4188a3d7    # 17.08f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, -0x3f2e6666    # -6.55f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3f8e147b    # -3.78f

    .line 438
    .line 439
    .line 440
    const v2, -0x3f933333    # -3.7f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x4190e148    # 18.11f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x41300000    # 11.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x40f00000    # 7.5f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x41380000    # 11.5f

    .line 460
    .line 461
    const/high16 v18, 0x40e00000    # 7.0f

    .line 462
    .line 463
    const/high16 v13, 0x41300000    # 11.0f

    .line 464
    .line 465
    const v14, 0x40e70a3d    # 7.22f

    .line 466
    .line 467
    .line 468
    const v15, 0x4133851f    # 11.22f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x40e00000    # 7.0f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x40e70a3d    # 7.22f

    .line 477
    .line 478
    .line 479
    const/high16 v2, 0x41400000    # 12.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x40c5c28f    # 6.18f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3fe147ae    # 1.76f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x4178f5c3    # 15.56f

    .line 497
    .line 498
    .line 499
    const/high16 v2, 0x41900000    # 18.0f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41a80000    # 21.0f

    .line 505
    .line 506
    const v2, 0x4188a3d7    # 17.08f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x4082e148    # 4.09f

    .line 516
    .line 517
    .line 518
    const/high16 v2, 0x40b00000    # 5.5f

    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x40e00000    # 7.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40000000    # 2.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x400147ae    # 2.02f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, 0x41400000    # 12.0f

    .line 551
    .line 552
    const/high16 v18, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const v13, 0x40ba3d71    # 5.82f

    .line 555
    .line 556
    .line 557
    const v14, 0x400851ec    # 2.13f

    .line 558
    .line 559
    .line 560
    const v15, 0x410c7ae1    # 8.78f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x3f800000    # 1.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x41200000    # 10.0f

    .line 569
    .line 570
    const/high16 v18, 0x40c00000    # 6.0f

    .line 571
    .line 572
    const v13, 0x40afae14    # 5.49f

    .line 573
    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const v15, 0x411451ec    # 9.27f

    .line 577
    .line 578
    .line 579
    const v16, 0x4047ae14    # 3.12f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x40370a3d    # -1.57f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v17, 0x41400000    # 12.0f

    .line 592
    .line 593
    const/high16 v18, 0x40200000    # 2.5f

    .line 594
    .line 595
    const v13, 0x419d5c29    # 19.67f

    .line 596
    .line 597
    .line 598
    const v14, 0x40a0a3d7    # 5.02f

    .line 599
    .line 600
    .line 601
    const v15, 0x4185eb85    # 16.74f

    .line 602
    .line 603
    .line 604
    const/high16 v16, 0x40200000    # 2.5f

    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, 0x4082e148    # 4.09f

    .line 610
    .line 611
    .line 612
    const/high16 v18, 0x40b00000    # 5.5f

    .line 613
    .line 614
    const v13, 0x410f851f    # 8.97f

    .line 615
    .line 616
    .line 617
    const/high16 v14, 0x40200000    # 2.5f

    .line 618
    .line 619
    const v15, 0x40c6b852    # 6.21f

    .line 620
    .line 621
    .line 622
    const v16, 0x4068f5c3    # 3.64f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    const/16 v16, 0x3800

    .line 636
    .line 637
    const/16 v17, 0x0

    .line 638
    .line 639
    const/high16 v6, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/high16 v8, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v7, 0x0

    .line 644
    const/high16 v12, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v13, 0x0

    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const-string v4, ""

    .line 650
    .line 651
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sput-object v0, Landroidx/compose/material/icons/twotone/SwipeLeftKt;->_swipeLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    return-object v0
.end method

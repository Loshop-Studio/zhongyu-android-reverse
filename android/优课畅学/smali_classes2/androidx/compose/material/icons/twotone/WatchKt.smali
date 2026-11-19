.class public final Landroidx/compose/material/icons/twotone/WatchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _watch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWatch(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Watch"

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
    const v4, 0x416b851f    # 14.72f

    .line 71
    .line 72
    .line 73
    const v6, 0x408f5c29    # 4.48f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v6, 0x4164f5c3    # 14.31f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x411b3333    # 9.7f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x401e147b    # 2.47f

    .line 94
    .line 95
    .line 96
    const v6, -0x412e147b    # -0.41f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41400000    # 12.0f

    .line 103
    .line 104
    const/high16 v26, 0x40800000    # 4.0f

    .line 105
    .line 106
    const v21, 0x4122147b    # 10.13f

    .line 107
    .line 108
    .line 109
    const v22, 0x408570a4    # 4.17f

    .line 110
    .line 111
    .line 112
    const v23, 0x4130cccd    # 11.05f

    .line 113
    .line 114
    .line 115
    const/high16 v24, 0x40800000    # 4.0f

    .line 116
    .line 117
    move-object/from16 v20, v2

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x402e147b    # 2.72f

    .line 123
    .line 124
    .line 125
    const v26, 0x3ef5c28f    # 0.48f

    .line 126
    .line 127
    .line 128
    const v21, 0x3f75c28f    # 0.96f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const v23, 0x3fef5c29    # 1.87f

    .line 134
    .line 135
    .line 136
    const v24, 0x3e2e147b    # 0.17f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x4114a3d7    # 9.29f

    .line 146
    .line 147
    .line 148
    const v6, 0x419c3d71    # 19.53f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41b00000    # 22.0f

    .line 155
    .line 156
    const v6, 0x411b3333    # 9.7f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x4093851f    # 4.61f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3fe147ae    # -2.48f

    .line 169
    .line 170
    .line 171
    const v6, 0x3ed1eb85    # 0.41f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, -0x3fd1eb85    # -2.72f

    .line 178
    .line 179
    .line 180
    const v21, -0x40a66666    # -0.85f

    .line 181
    .line 182
    .line 183
    const v22, 0x3e9eb852    # 0.31f

    .line 184
    .line 185
    .line 186
    const v23, -0x401eb852    # -1.76f

    .line 187
    .line 188
    .line 189
    const v24, 0x3ef5c28f    # 0.48f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, -0x3fd28f5c    # -2.71f

    .line 196
    .line 197
    .line 198
    const v26, -0x410f5c29    # -0.47f

    .line 199
    .line 200
    .line 201
    const v21, -0x408ccccd    # -0.95f

    .line 202
    .line 203
    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const v23, -0x4010a3d7    # -1.87f

    .line 207
    .line 208
    .line 209
    const v24, -0x41d1eb85    # -0.17f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/16 v16, 0x3800

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v6, 0x3e99999a    # 0.3f

    .line 227
    .line 228
    .line 229
    const v8, 0x3e99999a    # 0.3f

    .line 230
    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const/high16 v9, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v12, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    const/4 v15, 0x0

    .line 240
    const-string v4, ""

    .line 241
    .line 242
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 243
    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v6

    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const v0, 0x4187ae14    # 16.96f

    .line 273
    .line 274
    .line 275
    const v2, 0x40b75c29    # 5.73f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41800000    # 16.0f

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    const/high16 v2, 0x41000000    # 8.0f

    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x408ccccd    # -0.95f

    .line 294
    .line 295
    .line 296
    const v2, 0x40b75c29    # 5.73f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x40800000    # 4.0f

    .line 303
    .line 304
    const/high16 v18, 0x41400000    # 12.0f

    .line 305
    .line 306
    const v13, 0x40a6147b    # 5.19f

    .line 307
    .line 308
    .line 309
    const v14, 0x40e6147b    # 7.19f

    .line 310
    .line 311
    .line 312
    const/high16 v15, 0x40800000    # 4.0f

    .line 313
    .line 314
    const v16, 0x41173333    # 9.45f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x40433333    # 3.05f

    .line 321
    .line 322
    .line 323
    const v2, 0x40c8a3d7    # 6.27f

    .line 324
    .line 325
    .line 326
    const v4, 0x3f9851ec    # 1.19f

    .line 327
    .line 328
    .line 329
    const v6, 0x4099eb85    # 4.81f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41000000    # 8.0f

    .line 336
    .line 337
    const/high16 v2, 0x41c00000    # 24.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3f75c28f    # 0.96f

    .line 346
    .line 347
    .line 348
    const v2, -0x3f48a3d7    # -5.73f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x41a00000    # 20.0f

    .line 355
    .line 356
    const v13, 0x41967ae1    # 18.81f

    .line 357
    .line 358
    .line 359
    const v14, 0x41867ae1    # 16.81f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x41a00000    # 20.0f

    .line 363
    .line 364
    const v16, 0x4168a3d7    # 14.54f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x3fbd70a4    # -3.04f

    .line 371
    .line 372
    .line 373
    const v2, -0x3f375c29    # -6.27f

    .line 374
    .line 375
    .line 376
    const v4, -0x4067ae14    # -1.19f

    .line 377
    .line 378
    .line 379
    const v6, -0x3f66147b    # -4.81f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x40000000    # 2.0f

    .line 389
    .line 390
    const v2, 0x411b3333    # 9.7f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x4093851f    # 4.61f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x401eb852    # 2.48f

    .line 403
    .line 404
    .line 405
    const v2, 0x3ed1eb85    # 0.41f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, 0x41400000    # 12.0f

    .line 412
    .line 413
    const/high16 v18, 0x40800000    # 4.0f

    .line 414
    .line 415
    const v13, 0x415deb85    # 13.87f

    .line 416
    .line 417
    .line 418
    const v14, 0x408570a4    # 4.17f

    .line 419
    .line 420
    .line 421
    const v15, 0x414f5c29    # 12.96f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x40800000    # 4.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x3fd28f5c    # -2.71f

    .line 430
    .line 431
    .line 432
    const v18, 0x3ef0a3d7    # 0.47f

    .line 433
    .line 434
    .line 435
    const v13, -0x408ccccd    # -0.95f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const v15, -0x4010a3d7    # -1.87f

    .line 440
    .line 441
    .line 442
    const v16, 0x3e2e147b    # 0.17f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40000000    # 2.0f

    .line 449
    .line 450
    const v2, 0x411b3333    # 9.7f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x4164f5c3    # 14.31f

    .line 460
    .line 461
    .line 462
    const/high16 v2, 0x41b00000    # 22.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41b00000    # 22.0f

    .line 468
    .line 469
    const v2, 0x411b3333    # 9.7f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, -0x3fe1eb85    # -2.47f

    .line 476
    .line 477
    .line 478
    const v2, -0x412e147b    # -0.41f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, 0x402d70a4    # 2.71f

    .line 485
    .line 486
    .line 487
    const v13, 0x3f570a3d    # 0.84f

    .line 488
    .line 489
    .line 490
    const v14, 0x3e99999a    # 0.3f

    .line 491
    .line 492
    .line 493
    const v15, 0x3fe147ae    # 1.76f

    .line 494
    .line 495
    .line 496
    const v16, 0x3ef0a3d7    # 0.47f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x402e147b    # 2.72f

    .line 503
    .line 504
    .line 505
    const v18, -0x410a3d71    # -0.48f

    .line 506
    .line 507
    .line 508
    const v13, 0x3f75c28f    # 0.96f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const v15, 0x3fef5c29    # 1.87f

    .line 513
    .line 514
    .line 515
    const v16, -0x41d1eb85    # -0.17f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x4164f5c3    # 14.31f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x41b00000    # 22.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x41400000    # 12.0f

    .line 533
    .line 534
    const/high16 v2, 0x41900000    # 18.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v17, -0x3f400000    # -6.0f

    .line 540
    .line 541
    const/high16 v18, -0x3f400000    # -6.0f

    .line 542
    .line 543
    const v13, -0x3fac28f6    # -3.31f

    .line 544
    .line 545
    .line 546
    const/high16 v15, -0x3f400000    # -6.0f

    .line 547
    .line 548
    const v16, -0x3fd3d70a    # -2.69f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x402c28f6    # 2.69f

    .line 555
    .line 556
    .line 557
    const/high16 v2, -0x3f400000    # -6.0f

    .line 558
    .line 559
    const/high16 v4, 0x40c00000    # 6.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x40c00000    # 6.0f

    .line 565
    .line 566
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, -0x3fd3d70a    # -2.69f

    .line 570
    .line 571
    .line 572
    const/high16 v2, -0x3f400000    # -6.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const/16 v16, 0x3800

    .line 585
    .line 586
    const/16 v17, 0x0

    .line 587
    .line 588
    const/high16 v6, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v8, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v7, 0x0

    .line 593
    const/high16 v12, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const/4 v15, 0x0

    .line 597
    const-string v4, ""

    .line 598
    .line 599
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    sput-object v0, Landroidx/compose/material/icons/twotone/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    return-object v0
.end method

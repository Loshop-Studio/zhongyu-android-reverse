.class public final Landroidx/compose/material/icons/twotone/AnimationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _animation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAnimation(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AnimationKt;->_animation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Animation"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v21, -0x40deb852    # -0.63f

    .line 82
    .line 83
    .line 84
    const v22, 0x3f570a3d    # 0.84f

    .line 85
    .line 86
    .line 87
    const/high16 v23, -0x40800000    # -1.0f

    .line 88
    .line 89
    const v24, 0x3ff0a3d7    # 1.88f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, 0x40a00000    # 5.0f

    .line 98
    .line 99
    const/high16 v26, 0x40a00000    # 5.0f

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, 0x4030a3d7    # 2.76f

    .line 104
    .line 105
    .line 106
    const v23, 0x400f5c29    # 2.24f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40a00000    # 5.0f

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x40400000    # 3.0f

    .line 115
    .line 116
    const/high16 v26, -0x40800000    # -1.0f

    .line 117
    .line 118
    const v21, 0x3f8f5c29    # 1.12f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const v23, 0x400a3d71    # 2.16f

    .line 124
    .line 125
    .line 126
    const v24, -0x41428f5c    # -0.37f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x40a00000    # 5.0f

    .line 133
    .line 134
    const/high16 v26, 0x41400000    # 12.0f

    .line 135
    .line 136
    const v21, 0x4102147b    # 8.13f

    .line 137
    .line 138
    .line 139
    const/high16 v22, 0x41980000    # 19.0f

    .line 140
    .line 141
    const/high16 v23, 0x40a00000    # 5.0f

    .line 142
    .line 143
    const v24, 0x417deb85    # 15.87f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const/16 v16, 0x3800

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v6, 0x3e99999a    # 0.3f

    .line 161
    .line 162
    .line 163
    const v8, 0x3e99999a    # 0.3f

    .line 164
    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/high16 v9, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const/high16 v12, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    const-string v4, ""

    .line 175
    .line 176
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x40800000    # 4.0f

    .line 207
    .line 208
    const/high16 v6, 0x41700000    # 15.0f

    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 214
    .line 215
    const/high16 v26, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const v21, -0x406f5c29    # -1.13f

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const v23, -0x3ff5c28f    # -2.16f

    .line 223
    .line 224
    .line 225
    const v24, 0x3ebd70a4    # 0.37f

    .line 226
    .line 227
    .line 228
    move-object/from16 v20, v2

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, 0x40e00000    # 7.0f

    .line 234
    .line 235
    const/high16 v26, 0x40e00000    # 7.0f

    .line 236
    .line 237
    const v21, 0x4077ae14    # 3.87f

    .line 238
    .line 239
    .line 240
    const v22, 0x3c23d70a    # 0.01f

    .line 241
    .line 242
    .line 243
    const/high16 v23, 0x40e00000    # 7.0f

    .line 244
    .line 245
    const v24, 0x4048f5c3    # 3.14f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 254
    .line 255
    const v21, 0x3f2147ae    # 0.63f

    .line 256
    .line 257
    .line 258
    const v22, -0x40a8f5c3    # -0.84f

    .line 259
    .line 260
    .line 261
    const/high16 v23, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const v24, -0x400f5c29    # -1.88f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v25, 0x41700000    # 15.0f

    .line 270
    .line 271
    const/high16 v26, 0x40800000    # 4.0f

    .line 272
    .line 273
    const/high16 v21, 0x41a00000    # 20.0f

    .line 274
    .line 275
    const v22, 0x40c7ae14    # 6.24f

    .line 276
    .line 277
    .line 278
    const v23, 0x418e147b    # 17.76f

    .line 279
    .line 280
    .line 281
    const/high16 v24, 0x40800000    # 4.0f

    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const v6, 0x3e99999a    # 0.3f

    .line 294
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
    const/4 v2, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x40e00000    # 7.0f

    .line 330
    .line 331
    const/high16 v6, 0x41400000    # 12.0f

    .line 332
    .line 333
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x40266666    # -1.7f

    .line 337
    .line 338
    .line 339
    const v26, 0x3e99999a    # 0.3f

    .line 340
    .line 341
    .line 342
    const v21, -0x40e66666    # -0.6f

    .line 343
    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const v23, -0x406a3d71    # -1.17f

    .line 348
    .line 349
    .line 350
    const v24, 0x3de147ae    # 0.11f

    .line 351
    .line 352
    .line 353
    move-object/from16 v20, v2

    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, 0x41200000    # 10.0f

    .line 359
    .line 360
    const/high16 v26, 0x41100000    # 9.0f

    .line 361
    .line 362
    const v21, 0x4121c28f    # 10.11f

    .line 363
    .line 364
    .line 365
    const v22, 0x40fa8f5c    # 7.83f

    .line 366
    .line 367
    .line 368
    const/high16 v23, 0x41200000    # 10.0f

    .line 369
    .line 370
    const v24, 0x41066666    # 8.4f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v25, 0x40a00000    # 5.0f

    .line 377
    .line 378
    const/high16 v26, 0x40a00000    # 5.0f

    .line 379
    .line 380
    const/16 v21, 0x0

    .line 381
    .line 382
    const v22, 0x4030a3d7    # 2.76f

    .line 383
    .line 384
    .line 385
    const v23, 0x400f5c29    # 2.24f

    .line 386
    .line 387
    .line 388
    const/high16 v24, 0x40a00000    # 5.0f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, 0x3fd9999a    # 1.7f

    .line 394
    .line 395
    .line 396
    const v26, -0x41666666    # -0.3f

    .line 397
    .line 398
    .line 399
    const v21, 0x3f19999a    # 0.6f

    .line 400
    .line 401
    .line 402
    const/16 v22, 0x0

    .line 403
    .line 404
    const v23, 0x3f95c28f    # 1.17f

    .line 405
    .line 406
    .line 407
    const v24, -0x421eb852    # -0.11f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v25, 0x3e99999a    # 0.3f

    .line 414
    .line 415
    .line 416
    const v26, -0x40266666    # -1.7f

    .line 417
    .line 418
    .line 419
    const v21, 0x3e428f5c    # 0.19f

    .line 420
    .line 421
    .line 422
    const v22, -0x40f851ec    # -0.53f

    .line 423
    .line 424
    .line 425
    const v23, 0x3e99999a    # 0.3f

    .line 426
    .line 427
    .line 428
    const v24, -0x40733333    # -1.1f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v25, 0x41400000    # 12.0f

    .line 435
    .line 436
    const/high16 v26, 0x40e00000    # 7.0f

    .line 437
    .line 438
    const/high16 v21, 0x41880000    # 17.0f

    .line 439
    .line 440
    const v22, 0x4113d70a    # 9.24f

    .line 441
    .line 442
    .line 443
    const v23, 0x416c28f6    # 14.76f

    .line 444
    .line 445
    .line 446
    const/high16 v24, 0x40e00000    # 7.0f

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    const v6, 0x3e99999a    # 0.3f

    .line 459
    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const-string v4, ""

    .line 463
    .line 464
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 465
    .line 466
    .line 467
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 474
    .line 475
    .line 476
    move-result-wide v6

    .line 477
    const/4 v2, 0x0

    .line 478
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 482
    .line 483
    .line 484
    move-result v10

    .line 485
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    const/high16 v4, 0x41000000    # 8.0f

    .line 495
    .line 496
    const/high16 v6, 0x41100000    # 9.0f

    .line 497
    .line 498
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v25, -0x40800000    # -1.0f

    .line 502
    .line 503
    const/high16 v26, 0x40400000    # 3.0f

    .line 504
    .line 505
    const v21, -0x40deb852    # -0.63f

    .line 506
    .line 507
    .line 508
    const v22, 0x3f570a3d    # 0.84f

    .line 509
    .line 510
    .line 511
    const/high16 v23, -0x40800000    # -1.0f

    .line 512
    .line 513
    const v24, 0x3ff0a3d7    # 1.88f

    .line 514
    .line 515
    .line 516
    move-object/from16 v20, v2

    .line 517
    .line 518
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v25, 0x40a00000    # 5.0f

    .line 522
    .line 523
    const/high16 v26, 0x40a00000    # 5.0f

    .line 524
    .line 525
    const/16 v21, 0x0

    .line 526
    .line 527
    const v22, 0x4030a3d7    # 2.76f

    .line 528
    .line 529
    .line 530
    const v23, 0x400f5c29    # 2.24f

    .line 531
    .line 532
    .line 533
    const/high16 v24, 0x40a00000    # 5.0f

    .line 534
    .line 535
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v25, 0x40400000    # 3.0f

    .line 539
    .line 540
    const/high16 v26, -0x40800000    # -1.0f

    .line 541
    .line 542
    const v21, 0x3f8f5c29    # 1.12f

    .line 543
    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const v23, 0x400a3d71    # 2.16f

    .line 548
    .line 549
    .line 550
    const v24, -0x41428f5c    # -0.37f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v25, 0x41000000    # 8.0f

    .line 557
    .line 558
    const/high16 v26, 0x41100000    # 9.0f

    .line 559
    .line 560
    const v21, 0x4132147b    # 11.13f

    .line 561
    .line 562
    .line 563
    const v22, 0x417fd70a    # 15.99f

    .line 564
    .line 565
    .line 566
    const/high16 v23, 0x41000000    # 8.0f

    .line 567
    .line 568
    const v24, 0x414dc28f    # 12.86f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const v6, 0x3e99999a    # 0.3f

    .line 582
    .line 583
    .line 584
    const/4 v7, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 595
    .line 596
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    const/4 v0, 0x0

    .line 601
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x40000000    # 2.0f

    .line 618
    .line 619
    const/high16 v2, 0x41700000    # 15.0f

    .line 620
    .line 621
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, -0x3f38f5c3    # -6.22f

    .line 625
    .line 626
    .line 627
    const v18, 0x4071eb85    # 3.78f

    .line 628
    .line 629
    .line 630
    const v13, -0x3fd28f5c    # -2.71f

    .line 631
    .line 632
    .line 633
    const v15, -0x3f5e6666    # -5.05f

    .line 634
    .line 635
    .line 636
    const v16, 0x3fc51eb8    # 1.54f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 643
    .line 644
    const/high16 v18, 0x40400000    # 3.0f

    .line 645
    .line 646
    const v13, -0x405c28f6    # -1.28f

    .line 647
    .line 648
    .line 649
    const v14, 0x3f2b851f    # 0.67f

    .line 650
    .line 651
    .line 652
    const v15, -0x3fea3d71    # -2.34f

    .line 653
    .line 654
    .line 655
    const v16, 0x3fdc28f6    # 1.72f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x40000000    # 2.0f

    .line 662
    .line 663
    const/high16 v18, 0x41700000    # 15.0f

    .line 664
    .line 665
    const v13, 0x40628f5c    # 3.54f

    .line 666
    .line 667
    .line 668
    const v14, 0x411f3333    # 9.95f

    .line 669
    .line 670
    .line 671
    const/high16 v15, 0x40000000    # 2.0f

    .line 672
    .line 673
    const v16, 0x4144a3d7    # 12.29f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v17, 0x40e00000    # 7.0f

    .line 680
    .line 681
    const/high16 v18, 0x40e00000    # 7.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const v14, 0x4077ae14    # 3.87f

    .line 685
    .line 686
    .line 687
    const v15, 0x404851ec    # 3.13f

    .line 688
    .line 689
    .line 690
    const/high16 v16, 0x40e00000    # 7.0f

    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x40c70a3d    # 6.22f

    .line 696
    .line 697
    .line 698
    const v18, -0x3f8e147b    # -3.78f

    .line 699
    .line 700
    .line 701
    const v13, 0x402d70a4    # 2.71f

    .line 702
    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    const v15, 0x40a1999a    # 5.05f

    .line 706
    .line 707
    .line 708
    const v16, -0x403ae148    # -1.54f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v17, 0x40400000    # 3.0f

    .line 715
    .line 716
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 717
    .line 718
    const v13, 0x3fa3d70a    # 1.28f

    .line 719
    .line 720
    .line 721
    const v14, -0x40d47ae1    # -0.67f

    .line 722
    .line 723
    .line 724
    const v15, 0x4015c28f    # 2.34f

    .line 725
    .line 726
    .line 727
    const v16, -0x4023d70a    # -1.72f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v17, 0x41b00000    # 22.0f

    .line 734
    .line 735
    const/high16 v18, 0x41100000    # 9.0f

    .line 736
    .line 737
    const v13, 0x41a3ae14    # 20.46f

    .line 738
    .line 739
    .line 740
    const v14, 0x4160cccd    # 14.05f

    .line 741
    .line 742
    .line 743
    const/high16 v15, 0x41b00000    # 22.0f

    .line 744
    .line 745
    const v16, 0x413b5c29    # 11.71f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, 0x41700000    # 15.0f

    .line 752
    .line 753
    const/high16 v18, 0x40000000    # 2.0f

    .line 754
    .line 755
    const/high16 v13, 0x41b00000    # 22.0f

    .line 756
    .line 757
    const v14, 0x40a428f6    # 5.13f

    .line 758
    .line 759
    .line 760
    const v15, 0x4196f5c3    # 18.87f

    .line 761
    .line 762
    .line 763
    const/high16 v16, 0x40000000    # 2.0f

    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v0, 0x41a00000    # 20.0f

    .line 772
    .line 773
    const/high16 v2, 0x41100000    # 9.0f

    .line 774
    .line 775
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v17, -0x3f600000    # -5.0f

    .line 779
    .line 780
    const/high16 v18, -0x3f600000    # -5.0f

    .line 781
    .line 782
    const v13, -0x3fcf5c29    # -2.76f

    .line 783
    .line 784
    .line 785
    const/4 v14, 0x0

    .line 786
    const/high16 v15, -0x3f600000    # -5.0f

    .line 787
    .line 788
    const v16, -0x3ff0a3d7    # -2.24f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v17, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 797
    .line 798
    const/4 v13, 0x0

    .line 799
    const v14, -0x4070a3d7    # -1.12f

    .line 800
    .line 801
    .line 802
    const v15, 0x3ebd70a4    # 0.37f

    .line 803
    .line 804
    .line 805
    const v16, -0x3ff5c28f    # -2.16f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v17, 0x40e00000    # 7.0f

    .line 812
    .line 813
    const/high16 v18, 0x40e00000    # 7.0f

    .line 814
    .line 815
    const v14, 0x4077ae14    # 3.87f

    .line 816
    .line 817
    .line 818
    const v15, 0x404851ec    # 3.13f

    .line 819
    .line 820
    .line 821
    const/high16 v16, 0x40e00000    # 7.0f

    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v17, 0x41100000    # 9.0f

    .line 827
    .line 828
    const/high16 v18, 0x41a00000    # 20.0f

    .line 829
    .line 830
    const v13, 0x41328f5c    # 11.16f

    .line 831
    .line 832
    .line 833
    const v14, 0x419d0a3d    # 19.63f

    .line 834
    .line 835
    .line 836
    const v15, 0x4121eb85    # 10.12f

    .line 837
    .line 838
    .line 839
    const/high16 v16, 0x41a00000    # 20.0f

    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v0, 0x41880000    # 17.0f

    .line 848
    .line 849
    const/high16 v2, 0x41400000    # 12.0f

    .line 850
    .line 851
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const/high16 v17, -0x3f600000    # -5.0f

    .line 855
    .line 856
    const/high16 v18, -0x3f600000    # -5.0f

    .line 857
    .line 858
    const v13, -0x3fcf5c29    # -2.76f

    .line 859
    .line 860
    .line 861
    const/4 v14, 0x0

    .line 862
    const/high16 v15, -0x3f600000    # -5.0f

    .line 863
    .line 864
    const v16, -0x3ff0a3d7    # -2.24f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v17, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    const v14, -0x4070a3d7    # -1.12f

    .line 876
    .line 877
    .line 878
    const v15, 0x3ebd70a4    # 0.37f

    .line 879
    .line 880
    .line 881
    const v16, -0x3ff5c28f    # -2.16f

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v17, 0x40e00000    # 7.0f

    .line 888
    .line 889
    const/high16 v18, 0x40e00000    # 7.0f

    .line 890
    .line 891
    const v14, 0x40770a3d    # 3.86f

    .line 892
    .line 893
    .line 894
    const v15, 0x404851ec    # 3.13f

    .line 895
    .line 896
    .line 897
    const v16, 0x40dfae14    # 6.99f

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v17, 0x41400000    # 12.0f

    .line 904
    .line 905
    const/high16 v18, 0x41880000    # 17.0f

    .line 906
    .line 907
    const v13, 0x41628f5c    # 14.16f

    .line 908
    .line 909
    .line 910
    const v14, 0x41850a3d    # 16.63f

    .line 911
    .line 912
    .line 913
    const v15, 0x4151eb85    # 13.12f

    .line 914
    .line 915
    .line 916
    const/high16 v16, 0x41880000    # 17.0f

    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, 0x4185999a    # 16.7f

    .line 925
    .line 926
    .line 927
    const v2, 0x415b3333    # 13.7f

    .line 928
    .line 929
    .line 930
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const/high16 v17, 0x41700000    # 15.0f

    .line 934
    .line 935
    const/high16 v18, 0x41600000    # 14.0f

    .line 936
    .line 937
    const v13, 0x41815c29    # 16.17f

    .line 938
    .line 939
    .line 940
    const v14, 0x415e3d71    # 13.89f

    .line 941
    .line 942
    .line 943
    const v15, 0x4179999a    # 15.6f

    .line 944
    .line 945
    .line 946
    const/high16 v16, 0x41600000    # 14.0f

    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v17, -0x3f600000    # -5.0f

    .line 952
    .line 953
    const/high16 v18, -0x3f600000    # -5.0f

    .line 954
    .line 955
    const v13, -0x3fcf5c29    # -2.76f

    .line 956
    .line 957
    .line 958
    const/4 v14, 0x0

    .line 959
    const/high16 v15, -0x3f600000    # -5.0f

    .line 960
    .line 961
    const v16, -0x3ff0a3d7    # -2.24f

    .line 962
    .line 963
    .line 964
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v17, 0x3e99999a    # 0.3f

    .line 968
    .line 969
    .line 970
    const v18, -0x40266666    # -1.7f

    .line 971
    .line 972
    .line 973
    const/4 v13, 0x0

    .line 974
    const v14, -0x40e66666    # -0.6f

    .line 975
    .line 976
    .line 977
    const v15, 0x3de147ae    # 0.11f

    .line 978
    .line 979
    .line 980
    const v16, -0x406a3d71    # -1.17f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v17, 0x41400000    # 12.0f

    .line 987
    .line 988
    const/high16 v18, 0x40e00000    # 7.0f

    .line 989
    .line 990
    const v13, 0x412d47ae    # 10.83f

    .line 991
    .line 992
    .line 993
    const v14, 0x40e3851f    # 7.11f

    .line 994
    .line 995
    .line 996
    const v15, 0x41366666    # 11.4f

    .line 997
    .line 998
    .line 999
    const/high16 v16, 0x40e00000    # 7.0f

    .line 1000
    .line 1001
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1005
    .line 1006
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1007
    .line 1008
    const v13, 0x4030a3d7    # 2.76f

    .line 1009
    .line 1010
    .line 1011
    const/4 v14, 0x0

    .line 1012
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1013
    .line 1014
    const v16, 0x400f5c29    # 2.24f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v17, 0x4185999a    # 16.7f

    .line 1021
    .line 1022
    .line 1023
    const v18, 0x415b3333    # 13.7f

    .line 1024
    .line 1025
    .line 1026
    const/high16 v13, 0x41880000    # 17.0f

    .line 1027
    .line 1028
    const v14, 0x4149999a    # 12.6f

    .line 1029
    .line 1030
    .line 1031
    const v15, 0x41871eb8    # 16.89f

    .line 1032
    .line 1033
    .line 1034
    const v16, 0x4152b852    # 13.17f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const/high16 v0, 0x41980000    # 19.0f

    .line 1044
    .line 1045
    const/high16 v2, 0x41400000    # 12.0f

    .line 1046
    .line 1047
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const/high16 v17, -0x3f200000    # -7.0f

    .line 1051
    .line 1052
    const/high16 v18, -0x3f200000    # -7.0f

    .line 1053
    .line 1054
    const/4 v13, 0x0

    .line 1055
    const v14, -0x3f88f5c3    # -3.86f

    .line 1056
    .line 1057
    .line 1058
    const v15, -0x3fb7ae14    # -3.13f

    .line 1059
    .line 1060
    .line 1061
    const v16, -0x3f2051ec    # -6.99f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const/high16 v17, 0x40400000    # 3.0f

    .line 1068
    .line 1069
    const/high16 v18, -0x40800000    # -1.0f

    .line 1070
    .line 1071
    const v13, 0x3f570a3d    # 0.84f

    .line 1072
    .line 1073
    .line 1074
    const v14, -0x40deb852    # -0.63f

    .line 1075
    .line 1076
    .line 1077
    const v15, 0x3fef5c29    # 1.87f

    .line 1078
    .line 1079
    .line 1080
    const/high16 v16, -0x40800000    # -1.0f

    .line 1081
    .line 1082
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1086
    .line 1087
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1088
    .line 1089
    const v13, 0x4030a3d7    # 2.76f

    .line 1090
    .line 1091
    .line 1092
    const/4 v14, 0x0

    .line 1093
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1094
    .line 1095
    const v16, 0x400f5c29    # 2.24f

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const/high16 v17, 0x41980000    # 19.0f

    .line 1102
    .line 1103
    const/high16 v18, 0x41400000    # 12.0f

    .line 1104
    .line 1105
    const/high16 v13, 0x41a00000    # 20.0f

    .line 1106
    .line 1107
    const v14, 0x4121eb85    # 10.12f

    .line 1108
    .line 1109
    .line 1110
    const v15, 0x419d0a3d    # 19.63f

    .line 1111
    .line 1112
    .line 1113
    const v16, 0x41328f5c    # 11.16f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v2

    .line 1126
    const/16 v16, 0x3800

    .line 1127
    .line 1128
    const/16 v17, 0x0

    .line 1129
    .line 1130
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1131
    .line 1132
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1133
    .line 1134
    const/4 v7, 0x0

    .line 1135
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1136
    .line 1137
    const/4 v13, 0x0

    .line 1138
    const/4 v14, 0x0

    .line 1139
    const/4 v15, 0x0

    .line 1140
    const-string v4, ""

    .line 1141
    .line 1142
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    sput-object v0, Landroidx/compose/material/icons/twotone/AnimationKt;->_animation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1151
    .line 1152
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1153
    .line 1154
    .line 1155
    return-object v0
.end method

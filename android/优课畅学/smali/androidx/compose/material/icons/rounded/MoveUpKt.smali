.class public final Landroidx/compose/material/icons/rounded/MoveUpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _moveUp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoveUp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MoveUpKt;->_moveUp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MoveUp"

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
    const v4, 0x4040a3d7    # 3.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x41547ae1    # 13.28f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40823d71    # 4.07f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f5a3d71    # -5.18f

    .line 83
    .line 84
    .line 85
    const v21, -0x41f0a3d7    # -0.14f

    .line 86
    .line 87
    .line 88
    const v22, -0x3fdb851f    # -2.57f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fd47ae1    # 1.66f

    .line 92
    .line 93
    .line 94
    const v24, -0x3f68a3d7    # -4.73f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x40c947ae    # 6.29f

    .line 103
    .line 104
    .line 105
    const v6, 0x410e147b    # 8.88f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v25, 0x0

    .line 112
    .line 113
    const v26, 0x3fb47ae1    # 1.41f

    .line 114
    .line 115
    .line 116
    const v21, -0x413851ec    # -0.39f

    .line 117
    .line 118
    .line 119
    const v22, 0x3ec7ae14    # 0.39f

    .line 120
    .line 121
    .line 122
    const v23, -0x413851ec    # -0.39f

    .line 123
    .line 124
    .line 125
    const v24, 0x3f828f5c    # 1.02f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, 0x3fb47ae1    # 1.41f

    .line 136
    .line 137
    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    const v21, 0x3ec7ae14    # 0.39f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f828f5c    # 1.02f

    .line 144
    .line 145
    .line 146
    const v24, 0x3ec7ae14    # 0.39f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x4025c28f    # 2.59f

    .line 153
    .line 154
    .line 155
    const v6, -0x3fda3d71    # -2.59f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/16 v25, 0x0

    .line 162
    .line 163
    const v26, -0x404b851f    # -1.41f

    .line 164
    .line 165
    .line 166
    const v22, -0x413851ec    # -0.39f

    .line 167
    .line 168
    .line 169
    const v23, 0x3ec7ae14    # 0.39f

    .line 170
    .line 171
    .line 172
    const v24, -0x407d70a4    # -1.02f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x40f6b852    # 7.71f

    .line 179
    .line 180
    .line 181
    const v6, 0x406ccccd    # 3.7f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, -0x404b851f    # -1.41f

    .line 188
    .line 189
    .line 190
    const/16 v26, 0x0

    .line 191
    .line 192
    const v21, -0x413851ec    # -0.39f

    .line 193
    .line 194
    .line 195
    const v23, -0x407d70a4    # -1.02f

    .line 196
    .line 197
    .line 198
    const v24, -0x413851ec    # -0.39f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/16 v25, 0x0

    .line 209
    .line 210
    const v26, 0x3fb47ae1    # 1.41f

    .line 211
    .line 212
    .line 213
    const v22, 0x3ec7ae14    # 0.39f

    .line 214
    .line 215
    .line 216
    const v23, -0x413851ec    # -0.39f

    .line 217
    .line 218
    .line 219
    const v24, 0x3f828f5c    # 1.02f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x3f6147ae    # 0.88f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, 0x3d75c28f    # 0.06f

    .line 232
    .line 233
    .line 234
    const/4 v6, 0x0

    .line 235
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, -0x3f3b3333    # -6.15f

    .line 239
    .line 240
    .line 241
    const v26, 0x40ef0a3d    # 7.47f

    .line 242
    .line 243
    .line 244
    const v21, -0x3f970a3d    # -3.64f

    .line 245
    .line 246
    .line 247
    const v22, 0x3edc28f6    # 0.43f

    .line 248
    .line 249
    .line 250
    const v23, -0x3f323d71    # -6.43f

    .line 251
    .line 252
    .line 253
    const v24, 0x4069999a    # 3.65f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x410428f6    # 8.26f

    .line 260
    .line 261
    .line 262
    const/high16 v26, 0x41a00000    # 20.0f

    .line 263
    .line 264
    const v21, 0x3fa51eb8    # 1.29f

    .line 265
    .line 266
    .line 267
    const v22, 0x4189c28f    # 17.22f

    .line 268
    .line 269
    .line 270
    const v23, 0x4091999a    # 4.55f

    .line 271
    .line 272
    .line 273
    const/high16 v24, 0x41a00000    # 20.0f

    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41200000    # 10.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/high16 v26, -0x40800000    # -1.0f

    .line 286
    .line 287
    const v21, 0x3f0ccccd    # 0.55f

    .line 288
    .line 289
    .line 290
    const/16 v22, 0x0

    .line 291
    .line 292
    const/high16 v23, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const v24, -0x4119999a    # -0.45f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/4 v4, 0x0

    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v25, -0x40800000    # -1.0f

    .line 305
    .line 306
    const/16 v21, 0x0

    .line 307
    .line 308
    const v22, -0x40f33333    # -0.55f

    .line 309
    .line 310
    .line 311
    const v23, -0x4119999a    # -0.45f

    .line 312
    .line 313
    .line 314
    const/high16 v24, -0x40800000    # -1.0f

    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x4103851f    # 8.22f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, 0x4040a3d7    # 3.01f

    .line 326
    .line 327
    .line 328
    const v26, 0x41547ae1    # 13.28f

    .line 329
    .line 330
    .line 331
    const v21, 0x40b0a3d7    # 5.52f

    .line 332
    .line 333
    .line 334
    const/high16 v22, 0x41900000    # 18.0f

    .line 335
    .line 336
    const v23, 0x4049999a    # 3.15f

    .line 337
    .line 338
    .line 339
    const v24, 0x417f5c29    # 15.96f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/16 v16, 0x3800

    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/high16 v6, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v8, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    const/high16 v9, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v12, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const-string v4, ""

    .line 369
    .line 370
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v6

    .line 383
    const/4 v2, 0x0

    .line 384
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41500000    # 13.0f

    .line 401
    .line 402
    const/high16 v6, 0x41700000    # 15.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x40400000    # 3.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v25, 0x40000000    # 2.0f

    .line 413
    .line 414
    const/high16 v26, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/16 v21, 0x0

    .line 417
    .line 418
    const v22, 0x3f8ccccd    # 1.1f

    .line 419
    .line 420
    .line 421
    const v23, 0x3f666666    # 0.9f

    .line 422
    .line 423
    .line 424
    const/high16 v24, 0x40000000    # 2.0f

    .line 425
    .line 426
    move-object/from16 v20, v2

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, 0x40a00000    # 5.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v26, -0x40000000    # -2.0f

    .line 437
    .line 438
    const v21, 0x3f8ccccd    # 1.1f

    .line 439
    .line 440
    .line 441
    const/16 v22, 0x0

    .line 442
    .line 443
    const/high16 v23, 0x40000000    # 2.0f

    .line 444
    .line 445
    const v24, -0x4099999a    # -0.9f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, -0x40000000    # -2.0f

    .line 457
    .line 458
    const/16 v21, 0x0

    .line 459
    .line 460
    const v22, -0x40733333    # -1.1f

    .line 461
    .line 462
    .line 463
    const v23, -0x4099999a    # -0.9f

    .line 464
    .line 465
    .line 466
    const/high16 v24, -0x40000000    # -2.0f

    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v4, -0x3f600000    # -5.0f

    .line 472
    .line 473
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, 0x41500000    # 13.0f

    .line 477
    .line 478
    const/high16 v26, 0x41700000    # 15.0f

    .line 479
    .line 480
    const v21, 0x415e6666    # 13.9f

    .line 481
    .line 482
    .line 483
    const/high16 v22, 0x41500000    # 13.0f

    .line 484
    .line 485
    const/high16 v23, 0x41500000    # 13.0f

    .line 486
    .line 487
    const v24, 0x415e6666    # 13.9f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v4, 0x41900000    # 18.0f

    .line 497
    .line 498
    const/high16 v6, 0x41a00000    # 20.0f

    .line 499
    .line 500
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, -0x3f600000    # -5.0f

    .line 504
    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 509
    .line 510
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x40a00000    # 5.0f

    .line 514
    .line 515
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x41900000    # 18.0f

    .line 519
    .line 520
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/high16 v6, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    const-string v4, ""

    .line 534
    .line 535
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 536
    .line 537
    .line 538
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 543
    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 545
    .line 546
    .line 547
    move-result-wide v6

    .line 548
    const/4 v0, 0x0

    .line 549
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 553
    .line 554
    .line 555
    move-result v10

    .line 556
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x40800000    # 4.0f

    .line 566
    .line 567
    const/high16 v2, 0x41a00000    # 20.0f

    .line 568
    .line 569
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, -0x3f600000    # -5.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v17, -0x40000000    # -2.0f

    .line 578
    .line 579
    const/high16 v18, 0x40000000    # 2.0f

    .line 580
    .line 581
    const v13, -0x40733333    # -1.1f

    .line 582
    .line 583
    .line 584
    const/high16 v15, -0x40000000    # -2.0f

    .line 585
    .line 586
    const v16, 0x3f666666    # 0.9f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40400000    # 3.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x40000000    # 2.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const v14, 0x3f8ccccd    # 1.1f

    .line 601
    .line 602
    .line 603
    const v15, 0x3f666666    # 0.9f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x40000000    # 2.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x40a00000    # 5.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v18, -0x40000000    # -2.0f

    .line 617
    .line 618
    const v13, 0x3f8ccccd    # 1.1f

    .line 619
    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const/high16 v15, 0x40000000    # 2.0f

    .line 623
    .line 624
    const v16, -0x4099999a    # -0.9f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x40c00000    # 6.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v17, 0x41a00000    # 20.0f

    .line 636
    .line 637
    const/high16 v18, 0x40800000    # 4.0f

    .line 638
    .line 639
    const/high16 v13, 0x41b00000    # 22.0f

    .line 640
    .line 641
    const v14, 0x409ccccd    # 4.9f

    .line 642
    .line 643
    .line 644
    const v15, 0x41a8cccd    # 21.1f

    .line 645
    .line 646
    .line 647
    const/high16 v16, 0x40800000    # 4.0f

    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const/16 v16, 0x3800

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/high16 v6, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const/high16 v12, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const/4 v14, 0x0

    .line 670
    const/4 v15, 0x0

    .line 671
    const-string v4, ""

    .line 672
    .line 673
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    sput-object v0, Landroidx/compose/material/icons/rounded/MoveUpKt;->_moveUp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 682
    .line 683
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    return-object v0
.end method

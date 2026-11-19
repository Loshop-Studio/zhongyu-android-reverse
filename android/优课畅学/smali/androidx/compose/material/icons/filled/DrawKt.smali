.class public final Landroidx/compose/material/icons/filled/DrawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _draw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDraw(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Draw"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x41263d71    # 10.39f

    .line 71
    .line 72
    .line 73
    const v2, 0x4196cccd    # 18.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x407851ec    # -1.06f

    .line 80
    .line 81
    .line 82
    const v2, 0x3f87ae14    # 1.06f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, -0x3fcae148    # -2.83f

    .line 91
    .line 92
    .line 93
    const v13, 0x3f47ae14    # 0.78f

    .line 94
    .line 95
    .line 96
    const v14, -0x40b851ec    # -0.78f

    .line 97
    .line 98
    .line 99
    const v15, 0x3f47ae14    # 0.78f

    .line 100
    .line 101
    .line 102
    const v16, -0x3ffccccd    # -2.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41940000    # 18.5f

    .line 109
    .line 110
    const v2, 0x40a2e148    # 5.09f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3fcae148    # -2.83f

    .line 117
    .line 118
    .line 119
    const/16 v18, 0x0

    .line 120
    .line 121
    const v13, -0x40b851ec    # -0.78f

    .line 122
    .line 123
    .line 124
    const v15, -0x3ffccccd    # -2.05f

    .line 125
    .line 126
    .line 127
    const v16, -0x40b851ec    # -0.78f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x407851ec    # -1.06f

    .line 134
    .line 135
    .line 136
    const v2, 0x3f87ae14    # 1.06f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x41263d71    # 10.39f

    .line 143
    .line 144
    .line 145
    const v2, 0x4196cccd    # 18.85f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x40f1eb85    # 7.56f

    .line 155
    .line 156
    .line 157
    const v2, 0x41530a3d    # 13.19f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40800000    # 4.0f

    .line 164
    .line 165
    const v2, 0x4186147b    # 16.76f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41a80000    # 21.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x4087ae14    # 4.24f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x41130a3d    # 9.19f

    .line 183
    .line 184
    .line 185
    const v2, -0x3eecf5c3    # -9.19f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x40f1eb85    # 7.56f

    .line 192
    .line 193
    .line 194
    const v2, 0x41530a3d    # 13.19f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41980000    # 19.0f

    .line 204
    .line 205
    const/high16 v2, 0x418c0000    # 17.5f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x3f600000    # -5.0f

    .line 211
    .line 212
    const/high16 v18, 0x40600000    # 3.5f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const v14, 0x400c28f6    # 2.19f

    .line 216
    .line 217
    .line 218
    const v15, -0x3fdd70a4    # -2.54f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x40600000    # 3.5f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, -0x40800000    # -1.0f

    .line 227
    .line 228
    const/high16 v18, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v13, -0x40f33333    # -0.55f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, -0x40800000    # -1.0f

    .line 235
    .line 236
    const v16, -0x4119999a    # -0.45f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x3ee66666    # 0.45f

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v4, -0x40800000    # -1.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x40400000    # 3.0f

    .line 253
    .line 254
    const/high16 v18, -0x40400000    # -1.5f

    .line 255
    .line 256
    const v13, 0x3fc51eb8    # 1.54f

    .line 257
    .line 258
    .line 259
    const/high16 v15, 0x40400000    # 3.0f

    .line 260
    .line 261
    const v16, -0x40c51eb8    # -0.73f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x40628f5c    # -1.23f

    .line 268
    .line 269
    .line 270
    const v18, -0x40666666    # -1.2f

    .line 271
    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, -0x410f5c29    # -0.47f

    .line 275
    .line 276
    .line 277
    const v15, -0x410a3d71    # -0.48f

    .line 278
    .line 279
    .line 280
    const v16, -0x40a147ae    # -0.87f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x3fbd70a4    # 1.48f

    .line 287
    .line 288
    .line 289
    const v2, -0x40428f5c    # -1.48f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, 0x41980000    # 19.0f

    .line 296
    .line 297
    const/high16 v18, 0x418c0000    # 17.5f

    .line 298
    .line 299
    const v13, 0x41928f5c    # 18.32f

    .line 300
    .line 301
    .line 302
    const v14, 0x41773333    # 15.45f

    .line 303
    .line 304
    .line 305
    const/high16 v15, 0x41980000    # 19.0f

    .line 306
    .line 307
    const v16, 0x418251ec    # 16.29f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4155999a    # 13.35f

    .line 317
    .line 318
    .line 319
    const v2, 0x40928f5c    # 4.58f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40400000    # 3.0f

    .line 326
    .line 327
    const/high16 v18, 0x41300000    # 11.0f

    .line 328
    .line 329
    const v13, 0x40670a3d    # 3.61f

    .line 330
    .line 331
    .line 332
    const v14, 0x414ca3d7    # 12.79f

    .line 333
    .line 334
    .line 335
    const/high16 v15, 0x40400000    # 3.0f

    .line 336
    .line 337
    const v16, 0x4140f5c3    # 12.06f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x4063d70a    # 3.56f

    .line 344
    .line 345
    .line 346
    const v18, -0x3fa8f5c3    # -3.36f

    .line 347
    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, -0x4019999a    # -1.8f

    .line 351
    .line 352
    .line 353
    const v15, 0x3ff1eb85    # 1.89f

    .line 354
    .line 355
    .line 356
    const v16, -0x3fd7ae14    # -2.63f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x41100000    # 9.0f

    .line 363
    .line 364
    const/high16 v18, 0x40c00000    # 6.0f

    .line 365
    .line 366
    const v13, 0x40f2e148    # 7.59f

    .line 367
    .line 368
    .line 369
    const v14, 0x40e5c28f    # 7.18f

    .line 370
    .line 371
    .line 372
    const/high16 v15, 0x41100000    # 9.0f

    .line 373
    .line 374
    const v16, 0x40d1eb85    # 6.56f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40000000    # -2.0f

    .line 381
    .line 382
    const/high16 v18, -0x40800000    # -1.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, -0x412e147b    # -0.41f

    .line 386
    .line 387
    .line 388
    const v15, -0x40b851ec    # -0.78f

    .line 389
    .line 390
    .line 391
    const/high16 v16, -0x40800000    # -1.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x40a570a4    # 5.17f

    .line 397
    .line 398
    .line 399
    const v18, 0x40b47ae1    # 5.64f

    .line 400
    .line 401
    .line 402
    const v13, 0x40b7ae14    # 5.74f

    .line 403
    .line 404
    .line 405
    const/high16 v14, 0x40a00000    # 5.0f

    .line 406
    .line 407
    const v15, 0x40a66666    # 5.2f

    .line 408
    .line 409
    .line 410
    const v16, 0x40b3851f    # 5.61f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x407147ae    # 3.77f

    .line 417
    .line 418
    .line 419
    const v18, 0x40b851ec    # 5.76f

    .line 420
    .line 421
    .line 422
    const v13, 0x409a3d71    # 4.82f

    .line 423
    .line 424
    .line 425
    const v14, 0x40c1999a    # 6.05f

    .line 426
    .line 427
    .line 428
    const v15, 0x4086147b    # 4.19f

    .line 429
    .line 430
    .line 431
    const v16, 0x40c33333    # 6.1f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x4067ae14    # 3.62f

    .line 438
    .line 439
    .line 440
    const v18, 0x408c28f6    # 4.38f

    .line 441
    .line 442
    .line 443
    const v13, 0x40570a3d    # 3.36f

    .line 444
    .line 445
    .line 446
    const v14, 0x40ad70a4    # 5.42f

    .line 447
    .line 448
    .line 449
    const v15, 0x4051eb85    # 3.28f

    .line 450
    .line 451
    .line 452
    const v16, 0x4099eb85    # 4.81f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x40e00000    # 7.0f

    .line 459
    .line 460
    const/high16 v18, 0x40400000    # 3.0f

    .line 461
    .line 462
    const v13, 0x406eb852    # 3.73f

    .line 463
    .line 464
    .line 465
    const v14, 0x4087ae14    # 4.24f

    .line 466
    .line 467
    .line 468
    const v15, 0x409851ec    # 4.76f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x40400000    # 3.0f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x40800000    # 4.0f

    .line 477
    .line 478
    const v13, 0x400f5c29    # 2.24f

    .line 479
    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/high16 v15, 0x40800000    # 4.0f

    .line 483
    .line 484
    const v16, 0x3fa8f5c3    # 1.32f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x3f970a3d    # -3.64f

    .line 491
    .line 492
    .line 493
    const v18, 0x405e147b    # 3.47f

    .line 494
    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const v14, 0x3fef5c29    # 1.87f

    .line 498
    .line 499
    .line 500
    const v15, -0x4008f5c3    # -1.93f

    .line 501
    .line 502
    .line 503
    const v16, 0x402e147b    # 2.72f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, 0x40a00000    # 5.0f

    .line 510
    .line 511
    const/high16 v18, 0x41300000    # 11.0f

    .line 512
    .line 513
    const v13, 0x40cd70a4    # 6.42f

    .line 514
    .line 515
    .line 516
    const v14, 0x411e147b    # 9.88f

    .line 517
    .line 518
    .line 519
    const/high16 v15, 0x40a00000    # 5.0f

    .line 520
    .line 521
    const/high16 v16, 0x41280000    # 10.5f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3f88f5c3    # 1.07f

    .line 527
    .line 528
    .line 529
    const v18, 0x3f5c28f6    # 0.86f

    .line 530
    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const v14, 0x3e9eb852    # 0.31f

    .line 534
    .line 535
    .line 536
    const v15, 0x3edc28f6    # 0.43f

    .line 537
    .line 538
    .line 539
    const v16, 0x3f19999a    # 0.6f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/filled/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method

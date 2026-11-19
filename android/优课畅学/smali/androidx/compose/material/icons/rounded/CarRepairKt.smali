.class public final Landroidx/compose/material/icons/rounded/CarRepairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarRepair(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CarRepairKt;->_carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CarRepair"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41200000    # 10.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x3f800000    # 1.0f

    .line 93
    .line 94
    const/high16 v26, 0x3f800000    # 1.0f

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const v22, 0x3f0ccccd    # 0.55f

    .line 99
    .line 100
    .line 101
    const v23, 0x3ee66666    # 0.45f

    .line 102
    .line 103
    .line 104
    const/high16 v24, 0x3f800000    # 1.0f

    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v26, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v21, 0x3f0ccccd    # 0.55f

    .line 118
    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const/high16 v23, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const v24, -0x4119999a    # -0.45f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x410b0a3d    # 8.69f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, -0x403851ec    # -1.56f

    .line 137
    .line 138
    .line 139
    const v26, -0x3f69eb85    # -4.69f

    .line 140
    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const v23, -0x40547ae1    # -1.34f

    .line 145
    .line 146
    .line 147
    const v24, -0x3f7f0a3d    # -4.03f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, -0x41bd70a4    # -0.19f

    .line 154
    .line 155
    .line 156
    const v26, -0x41333333    # -0.4f

    .line 157
    .line 158
    .line 159
    const v21, -0x42b33333    # -0.05f

    .line 160
    .line 161
    .line 162
    const v22, -0x41dc28f6    # -0.16f

    .line 163
    .line 164
    .line 165
    const v23, -0x420a3d71    # -0.12f

    .line 166
    .line 167
    .line 168
    const v24, -0x416b851f    # -0.29f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, -0x42b33333    # -0.05f

    .line 175
    .line 176
    .line 177
    const v26, -0x4270a3d7    # -0.07f

    .line 178
    .line 179
    .line 180
    const v21, -0x435c28f6    # -0.02f

    .line 181
    .line 182
    .line 183
    const v22, -0x435c28f6    # -0.02f

    .line 184
    .line 185
    .line 186
    const v23, -0x430a3d71    # -0.03f

    .line 187
    .line 188
    .line 189
    const v24, -0x42dc28f6    # -0.04f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, 0x41823d71    # 16.28f

    .line 196
    .line 197
    .line 198
    const/high16 v26, 0x40400000    # 3.0f

    .line 199
    .line 200
    const v21, 0x41868f5c    # 16.82f

    .line 201
    .line 202
    .line 203
    const v22, 0x4040a3d7    # 3.01f

    .line 204
    .line 205
    .line 206
    const v23, 0x41823d71    # 16.28f

    .line 207
    .line 208
    .line 209
    const/high16 v24, 0x40400000    # 3.0f

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x40f70a3d    # 7.72f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, -0x40947ae1    # -0.92f

    .line 221
    .line 222
    .line 223
    const v26, 0x3f0a3d71    # 0.54f

    .line 224
    .line 225
    .line 226
    const/16 v21, 0x0

    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const v23, -0x40f5c28f    # -0.54f

    .line 231
    .line 232
    .line 233
    const v24, 0x3c23d70a    # 0.01f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v25, 0x40d80000    # 6.75f

    .line 240
    .line 241
    const v26, 0x40666666    # 3.6f

    .line 242
    .line 243
    .line 244
    const v21, 0x40d8f5c3    # 6.78f

    .line 245
    .line 246
    .line 247
    const v22, 0x4063d70a    # 3.56f

    .line 248
    .line 249
    .line 250
    const v23, 0x40d8a3d7    # 6.77f

    .line 251
    .line 252
    .line 253
    const v24, 0x40651eb8    # 3.58f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x40d1eb85    # 6.56f

    .line 260
    .line 261
    .line 262
    const/high16 v26, 0x40800000    # 4.0f

    .line 263
    .line 264
    const v21, 0x40d5c28f    # 6.68f

    .line 265
    .line 266
    .line 267
    const v22, 0x406d70a4    # 3.71f

    .line 268
    .line 269
    .line 270
    const v23, 0x40d3851f    # 6.61f

    .line 271
    .line 272
    .line 273
    const v24, 0x4075c28f    # 3.84f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v25, 0x40a00000    # 5.0f

    .line 280
    .line 281
    const v26, 0x410b0a3d    # 8.69f

    .line 282
    .line 283
    .line 284
    const v21, 0x40cae148    # 6.34f

    .line 285
    .line 286
    .line 287
    const v22, 0x40951eb8    # 4.66f

    .line 288
    .line 289
    .line 290
    const/high16 v23, 0x40a00000    # 5.0f

    .line 291
    .line 292
    const v24, 0x410b0a3d    # 8.69f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x41700000    # 15.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v25, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v26, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/16 v21, 0x0

    .line 308
    .line 309
    const v22, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const v23, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v24, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/4 v4, 0x0

    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, 0x40e00000    # 7.0f

    .line 325
    .line 326
    const/high16 v26, 0x41700000    # 15.0f

    .line 327
    .line 328
    const v21, 0x40d1999a    # 6.55f

    .line 329
    .line 330
    .line 331
    const/high16 v22, 0x41800000    # 16.0f

    .line 332
    .line 333
    const/high16 v23, 0x40e00000    # 7.0f

    .line 334
    .line 335
    const v24, 0x4178cccd    # 15.55f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x41100000    # 9.0f

    .line 345
    .line 346
    const/high16 v6, 0x41380000    # 11.5f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v25, -0x40800000    # -1.0f

    .line 352
    .line 353
    const/high16 v26, -0x40800000    # -1.0f

    .line 354
    .line 355
    const v21, -0x40f33333    # -0.55f

    .line 356
    .line 357
    .line 358
    const/16 v22, 0x0

    .line 359
    .line 360
    const/high16 v23, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v24, -0x4119999a    # -0.45f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x3ee66666    # 0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v6, -0x40800000    # -1.0f

    .line 372
    .line 373
    const/high16 v7, 0x3f800000    # 1.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v6, 0x3f800000    # 1.0f

    .line 379
    .line 380
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x4118cccd    # 9.55f

    .line 384
    .line 385
    .line 386
    const/high16 v6, 0x41100000    # 9.0f

    .line 387
    .line 388
    const/high16 v7, 0x41380000    # 11.5f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x41700000    # 15.0f

    .line 397
    .line 398
    const/high16 v6, 0x41380000    # 11.5f

    .line 399
    .line 400
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x3ee66666    # 0.45f

    .line 407
    .line 408
    .line 409
    const/high16 v6, -0x40800000    # -1.0f

    .line 410
    .line 411
    const/high16 v7, 0x3f800000    # 1.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v6, 0x3f800000    # 1.0f

    .line 417
    .line 418
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v4, 0x4178cccd    # 15.55f

    .line 422
    .line 423
    .line 424
    const/high16 v6, 0x41700000    # 15.0f

    .line 425
    .line 426
    const/high16 v7, 0x41380000    # 11.5f

    .line 427
    .line 428
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x40a00000    # 5.0f

    .line 435
    .line 436
    const v6, 0x410547ae    # 8.33f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v4, 0x40eae148    # 7.34f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v4, 0x3e6b851f    # 0.23f

    .line 449
    .line 450
    .line 451
    const v6, 0x3f30a3d7    # 0.69f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, 0x4182a3d7    # 16.33f

    .line 458
    .line 459
    .line 460
    const/high16 v6, 0x40e00000    # 7.0f

    .line 461
    .line 462
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v4, 0x40f570a4    # 7.67f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v4, 0x40a00000    # 5.0f

    .line 472
    .line 473
    const v6, 0x410547ae    # 8.33f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const/16 v16, 0x3800

    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v8, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const/high16 v9, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/high16 v12, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 512
    .line 513
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 514
    .line 515
    .line 516
    move-result-wide v6

    .line 517
    const/4 v0, 0x0

    .line 518
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 526
    .line 527
    .line 528
    move-result v11

    .line 529
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 532
    .line 533
    .line 534
    const v0, 0x4190147b    # 18.01f

    .line 535
    .line 536
    .line 537
    const/high16 v2, 0x40800000    # 4.0f

    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x409fae14    # 4.99f

    .line 546
    .line 547
    .line 548
    const/high16 v18, 0x41980000    # 19.0f

    .line 549
    .line 550
    const/high16 v13, 0x40800000    # 4.0f

    .line 551
    .line 552
    const v14, 0x41946666    # 18.55f

    .line 553
    .line 554
    .line 555
    const v15, 0x408e6666    # 4.45f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x41980000    # 19.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41300000    # 11.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x4000a3d7    # 2.01f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x3f7d70a4    # 0.99f

    .line 575
    .line 576
    .line 577
    const v18, 0x3f7d70a4    # 0.99f

    .line 578
    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, 0x3f0ccccd    # 0.55f

    .line 582
    .line 583
    .line 584
    const v15, 0x3ee66666    # 0.45f

    .line 585
    .line 586
    .line 587
    const v16, 0x3f7d70a4    # 0.99f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x3c23d70a    # 0.01f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v18, -0x40828f5c    # -0.99f

    .line 600
    .line 601
    .line 602
    const v13, 0x3f0ccccd    # 0.55f

    .line 603
    .line 604
    .line 605
    const/4 v14, 0x0

    .line 606
    const v15, 0x3f7d70a4    # 0.99f

    .line 607
    .line 608
    .line 609
    const v16, -0x4119999a    # -0.45f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41980000    # 19.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x40c051ec    # 6.01f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v17, -0x40828f5c    # -0.99f

    .line 634
    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const v14, -0x40f33333    # -0.55f

    .line 638
    .line 639
    .line 640
    const v15, -0x4119999a    # -0.45f

    .line 641
    .line 642
    .line 643
    const v16, -0x40828f5c    # -0.99f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x409fae14    # 4.99f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x40800000    # 4.0f

    .line 656
    .line 657
    const v18, 0x4190147b    # 18.01f

    .line 658
    .line 659
    .line 660
    const v13, 0x408e6666    # 4.45f

    .line 661
    .line 662
    .line 663
    const v14, 0x4188147b    # 17.01f

    .line 664
    .line 665
    .line 666
    const/high16 v15, 0x40800000    # 4.0f

    .line 667
    .line 668
    const v16, 0x418bae14    # 17.46f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const/16 v16, 0x3800

    .line 682
    .line 683
    const/16 v17, 0x0

    .line 684
    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    const/high16 v12, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/4 v13, 0x0

    .line 691
    const/4 v14, 0x0

    .line 692
    const/4 v15, 0x0

    .line 693
    const-string v4, ""

    .line 694
    .line 695
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    sput-object v0, Landroidx/compose/material/icons/rounded/CarRepairKt;->_carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    return-object v0
.end method

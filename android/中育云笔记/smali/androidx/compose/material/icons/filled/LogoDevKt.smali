.class public final Landroidx/compose/material/icons/filled/LogoDevKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _logoDev:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLogoDev(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LogoDevKt;->_logoDev:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LogoDev"

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
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v26, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, 0x3f8ccccd    # 1.1f

    .line 113
    .line 114
    .line 115
    const v23, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41980000    # 19.0f

    .line 147
    .line 148
    const/high16 v26, 0x40400000    # 3.0f

    .line 149
    .line 150
    const/high16 v21, 0x41a80000    # 21.0f

    .line 151
    .line 152
    const v22, 0x4079999a    # 3.9f

    .line 153
    .line 154
    .line 155
    const v23, 0x41a0cccd    # 20.1f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x40f5c28f    # 7.68f

    .line 167
    .line 168
    .line 169
    const v6, 0x416fae14    # 14.98f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40c00000    # 6.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x41100000    # 9.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x3fdae148    # 1.71f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x3fdae148    # 1.71f

    .line 192
    .line 193
    .line 194
    const v26, 0x3fdae148    # 1.71f

    .line 195
    .line 196
    .line 197
    const v21, 0x3fa3d70a    # 1.28f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const v23, 0x3fdae148    # 1.71f

    .line 203
    .line 204
    .line 205
    const v24, 0x3f83d70a    # 1.03f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x4023d70a    # 2.56f

    .line 212
    .line 213
    .line 214
    const/4 v6, 0x0

    .line 215
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x40f5c28f    # 7.68f

    .line 219
    .line 220
    .line 221
    const v26, 0x416fae14    # 14.98f

    .line 222
    .line 223
    .line 224
    const v21, 0x4116b852    # 9.42f

    .line 225
    .line 226
    .line 227
    const v22, 0x415f3333    # 13.95f

    .line 228
    .line 229
    .line 230
    const/high16 v23, 0x41100000    # 9.0f

    .line 231
    .line 232
    const v24, 0x416fae14    # 14.98f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x41375c29    # 11.46f

    .line 242
    .line 243
    .line 244
    const v6, 0x4146147b    # 12.38f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v4, 0x3f88f5c3    # 1.07f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, -0x4068f5c3    # -1.18f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, 0x3fb1eb85    # 1.39f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x3ff70a3d    # 1.93f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, 0x3f88f5c3    # 1.07f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, -0x3ff00000    # -2.25f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, -0x40c00000    # -0.75f

    .line 286
    .line 287
    const v26, -0x40ca3d71    # -0.71f

    .line 288
    .line 289
    .line 290
    const v21, -0x41333333    # -0.4f

    .line 291
    .line 292
    .line 293
    const v22, 0x3c23d70a    # 0.01f

    .line 294
    .line 295
    .line 296
    const v23, -0x40c28f5c    # -0.74f

    .line 297
    .line 298
    .line 299
    const v24, -0x416147ae    # -0.31f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x411c0000    # 9.75f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, 0x3f35c28f    # 0.71f

    .line 311
    .line 312
    .line 313
    const/high16 v26, -0x40c00000    # -0.75f

    .line 314
    .line 315
    const v21, -0x43dc28f6    # -0.01f

    .line 316
    .line 317
    .line 318
    const v22, -0x41333333    # -0.4f

    .line 319
    .line 320
    .line 321
    const v23, 0x3e9eb852    # 0.31f

    .line 322
    .line 323
    .line 324
    const v24, -0x40c28f5c    # -0.74f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x4011eb85    # 2.28f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    const v6, 0x3f88f5c3    # 1.07f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v4, -0x400a3d71    # -1.92f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x3fb1eb85    # 1.39f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v4, 0x4146147b    # 12.38f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v4, 0x4163ae14    # 14.23f

    .line 365
    .line 366
    .line 367
    const v6, 0x41870a3d    # 16.88f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, -0x40251eb8    # -1.71f

    .line 374
    .line 375
    .line 376
    const/16 v26, 0x0

    .line 377
    .line 378
    const v21, -0x410a3d71    # -0.48f

    .line 379
    .line 380
    .line 381
    const v22, 0x3f8e147b    # 1.11f

    .line 382
    .line 383
    .line 384
    const v23, -0x4055c28f    # -1.33f

    .line 385
    .line 386
    .line 387
    const v24, 0x3f63d70a    # 0.89f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v4, 0x415c51ec    # 13.77f

    .line 394
    .line 395
    .line 396
    const/high16 v6, 0x41100000    # 9.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x3f970a3d    # 1.18f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x4083851f    # 4.11f

    .line 408
    .line 409
    .line 410
    const v6, 0x3f88f5c3    # 1.07f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v4, 0x4188b852    # 17.09f

    .line 417
    .line 418
    .line 419
    const/high16 v6, 0x41100000    # 9.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v4, 0x3f970a3d    # 1.18f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x4163ae14    # 14.23f

    .line 431
    .line 432
    .line 433
    const v6, 0x41870a3d    # 16.88f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    const/16 v16, 0x3800

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/high16 v6, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/high16 v8, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    const/high16 v9, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/high16 v12, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const/4 v14, 0x0

    .line 461
    const/4 v15, 0x0

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
    const/4 v0, 0x0

    .line 478
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    const v0, 0x40f8a3d7    # 7.77f

    .line 495
    .line 496
    .line 497
    const v2, 0x4121eb85    # 10.12f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x40e47ae1    # 7.14f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x407147ae    # 3.77f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x3f2147ae    # 0.63f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3ed70a3d    # 0.42f

    .line 522
    .line 523
    .line 524
    const v18, -0x41dc28f6    # -0.16f

    .line 525
    .line 526
    .line 527
    const v13, 0x3e0f5c29    # 0.14f

    .line 528
    .line 529
    .line 530
    const v15, 0x3e8f5c29    # 0.28f

    .line 531
    .line 532
    .line 533
    const v16, -0x42b33333    # -0.05f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x3e570a3d    # 0.21f

    .line 540
    .line 541
    .line 542
    const v18, -0x410f5c29    # -0.47f

    .line 543
    .line 544
    .line 545
    const v14, -0x42333333    # -0.1f

    .line 546
    .line 547
    .line 548
    const v15, 0x3e570a3d    # 0.21f

    .line 549
    .line 550
    .line 551
    const v16, -0x417ae148    # -0.26f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x3fdeb852    # -2.52f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, -0x41a8f5c3    # -0.21f

    .line 564
    .line 565
    .line 566
    const/4 v13, 0x0

    .line 567
    const v14, -0x41a8f5c3    # -0.21f

    .line 568
    .line 569
    .line 570
    const v15, -0x4270a3d7    # -0.07f

    .line 571
    .line 572
    .line 573
    const v16, -0x41428f5c    # -0.37f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, 0x40f8a3d7    # 7.77f

    .line 580
    .line 581
    .line 582
    const v18, 0x4121eb85    # 10.12f

    .line 583
    .line 584
    .line 585
    const v13, 0x4100cccd    # 8.05f

    .line 586
    .line 587
    .line 588
    const v14, 0x4122b852    # 10.17f

    .line 589
    .line 590
    .line 591
    const v15, 0x40fd1eb8    # 7.91f

    .line 592
    .line 593
    .line 594
    const v16, 0x4121eb85    # 10.12f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/16 v16, 0x3800

    .line 608
    .line 609
    const/16 v17, 0x0

    .line 610
    .line 611
    const/high16 v6, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/4 v7, 0x0

    .line 614
    const/high16 v12, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v13, 0x0

    .line 617
    const/4 v14, 0x0

    .line 618
    const/4 v15, 0x0

    .line 619
    const-string v4, ""

    .line 620
    .line 621
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    sput-object v0, Landroidx/compose/material/icons/filled/LogoDevKt;->_logoDev:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    return-object v0
.end method

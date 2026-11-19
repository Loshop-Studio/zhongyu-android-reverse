.class public final Landroidx/compose/material/icons/rounded/SetMealKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSetMeal(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SetMealKt;->_setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SetMeal"

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
    const v0, 0x41a26666    # 20.3f

    .line 71
    .line 72
    .line 73
    const v2, 0x418ccccd    # 17.6f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40751eb8    # 3.83f

    .line 80
    .line 81
    .line 82
    const v2, 0x4193ae14    # 18.46f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x40b5c28f    # -0.79f

    .line 89
    .line 90
    .line 91
    const v18, -0x40ca3d71    # -0.71f

    .line 92
    .line 93
    .line 94
    const v13, -0x412e147b    # -0.41f

    .line 95
    .line 96
    .line 97
    const v14, 0x3ca3d70a    # 0.02f

    .line 98
    .line 99
    .line 100
    const v15, -0x40bae148    # -0.77f

    .line 101
    .line 102
    .line 103
    const v16, -0x41666666    # -0.3f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x3f35c28f    # 0.71f

    .line 114
    .line 115
    .line 116
    const v18, -0x40b5c28f    # -0.79f

    .line 117
    .line 118
    .line 119
    const v13, -0x435c28f6    # -0.02f

    .line 120
    .line 121
    .line 122
    const v14, -0x412e147b    # -0.41f

    .line 123
    .line 124
    .line 125
    const v15, 0x3e99999a    # 0.3f

    .line 126
    .line 127
    .line 128
    const v16, -0x40bae148    # -0.77f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x4183d70a    # 16.48f

    .line 135
    .line 136
    .line 137
    const v2, -0x40a3d70a    # -0.86f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f4a3d71    # 0.79f

    .line 144
    .line 145
    .line 146
    const v18, 0x3f35c28f    # 0.71f

    .line 147
    .line 148
    .line 149
    const v13, 0x3ed1eb85    # 0.41f

    .line 150
    .line 151
    .line 152
    const v14, -0x435c28f6    # -0.02f

    .line 153
    .line 154
    .line 155
    const v15, 0x3f451eb8    # 0.77f

    .line 156
    .line 157
    .line 158
    const v16, 0x3e99999a    # 0.3f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x41a26666    # 20.3f

    .line 169
    .line 170
    .line 171
    const v18, 0x418ccccd    # 17.6f

    .line 172
    .line 173
    .line 174
    const v13, 0x41a851ec    # 21.04f

    .line 175
    .line 176
    .line 177
    const v14, 0x4189c28f    # 17.22f

    .line 178
    .line 179
    .line 180
    const v15, 0x41a5c28f    # 20.72f

    .line 181
    .line 182
    .line 183
    const v16, 0x418ca3d7    # 17.58f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41a20000    # 20.25f

    .line 193
    .line 194
    const v2, 0x419bd70a    # 19.48f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40700000    # 3.75f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x40400000    # 3.0f

    .line 206
    .line 207
    const v18, 0x41a1d70a    # 20.23f

    .line 208
    .line 209
    .line 210
    const v13, 0x4055c28f    # 3.34f

    .line 211
    .line 212
    .line 213
    const v14, 0x419bd70a    # 19.48f

    .line 214
    .line 215
    .line 216
    const/high16 v15, 0x40400000    # 3.0f

    .line 217
    .line 218
    const v16, 0x419e8f5c    # 19.82f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x3f400000    # 0.75f

    .line 229
    .line 230
    const/high16 v18, 0x3f400000    # 0.75f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, 0x3ed1eb85    # 0.41f

    .line 234
    .line 235
    .line 236
    const v15, 0x3eae147b    # 0.34f

    .line 237
    .line 238
    .line 239
    const/high16 v16, 0x3f400000    # 0.75f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41840000    # 16.5f

    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v18, -0x40c00000    # -0.75f

    .line 250
    .line 251
    const v13, 0x3ed1eb85    # 0.41f

    .line 252
    .line 253
    .line 254
    const/4 v14, 0x0

    .line 255
    const/high16 v15, 0x3f400000    # 0.75f

    .line 256
    .line 257
    const v16, -0x4151eb85    # -0.34f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, 0x41a20000    # 20.25f

    .line 268
    .line 269
    const v18, 0x419bd70a    # 19.48f

    .line 270
    .line 271
    .line 272
    const/high16 v13, 0x41a80000    # 21.0f

    .line 273
    .line 274
    const v14, 0x419e8f5c    # 19.82f

    .line 275
    .line 276
    .line 277
    const v15, 0x41a547ae    # 20.66f

    .line 278
    .line 279
    .line 280
    const v16, 0x419bd70a    # 19.48f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41b00000    # 22.0f

    .line 290
    .line 291
    const/high16 v2, 0x40a00000    # 5.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40e00000    # 7.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, -0x40000000    # -2.0f

    .line 302
    .line 303
    const/high16 v18, 0x40000000    # 2.0f

    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const v14, 0x3f8ccccd    # 1.1f

    .line 307
    .line 308
    .line 309
    const v15, -0x4099999a    # -0.9f

    .line 310
    .line 311
    .line 312
    const/high16 v16, 0x40000000    # 2.0f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x40800000    # 4.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v18, -0x40000000    # -2.0f

    .line 323
    .line 324
    const v13, -0x40733333    # -1.1f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const/high16 v15, -0x40000000    # -2.0f

    .line 329
    .line 330
    const v16, -0x4099999a    # -0.9f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x40a00000    # 5.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x40000000    # 2.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const v14, -0x40733333    # -1.1f

    .line 345
    .line 346
    .line 347
    const v15, 0x3f666666    # 0.9f

    .line 348
    .line 349
    .line 350
    const/high16 v16, -0x40000000    # -2.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41800000    # 16.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41b00000    # 22.0f

    .line 361
    .line 362
    const/high16 v18, 0x40a00000    # 5.0f

    .line 363
    .line 364
    const v13, 0x41a8cccd    # 21.1f

    .line 365
    .line 366
    .line 367
    const/high16 v14, 0x40400000    # 3.0f

    .line 368
    .line 369
    const/high16 v15, 0x41b00000    # 22.0f

    .line 370
    .line 371
    const v16, 0x4079999a    # 3.9f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x4198f5c3    # 19.12f

    .line 381
    .line 382
    .line 383
    const v2, 0x40c2e148    # 6.09f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x3feae148    # -2.33f

    .line 390
    .line 391
    .line 392
    const v18, 0x4008f5c3    # 2.14f

    .line 393
    .line 394
    .line 395
    const/high16 v13, -0x40600000    # -1.25f

    .line 396
    .line 397
    const v14, 0x3e8a3d71    # 0.27f

    .line 398
    .line 399
    .line 400
    const v15, -0x3ff3d70a    # -2.19f

    .line 401
    .line 402
    .line 403
    const v16, 0x3f8e147b    # 1.11f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x41240000    # 10.25f

    .line 410
    .line 411
    const/high16 v18, 0x40b00000    # 5.5f

    .line 412
    .line 413
    const v13, 0x41813333    # 16.15f

    .line 414
    .line 415
    .line 416
    const/high16 v14, 0x40f00000    # 7.5f

    .line 417
    .line 418
    const v15, 0x4160f5c3    # 14.06f

    .line 419
    .line 420
    .line 421
    const/high16 v16, 0x40b00000    # 5.5f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, -0x3f36147b    # -6.31f

    .line 427
    .line 428
    .line 429
    const v18, 0x401f5c29    # 2.49f

    .line 430
    .line 431
    .line 432
    const v13, -0x3fa3d70a    # -3.44f

    .line 433
    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const v15, -0x3f50a3d7    # -5.48f

    .line 437
    .line 438
    .line 439
    const v16, 0x3fd0a3d7    # 1.63f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    const v18, 0x3f83d70a    # 1.03f

    .line 448
    .line 449
    .line 450
    const v13, -0x4170a3d7    # -0.28f

    .line 451
    .line 452
    .line 453
    const v14, 0x3e947ae1    # 0.29f

    .line 454
    .line 455
    .line 456
    const v15, -0x4170a3d7    # -0.28f

    .line 457
    .line 458
    .line 459
    const v16, 0x3f3d70a4    # 0.74f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, 0x40c9eb85    # 6.31f

    .line 466
    .line 467
    .line 468
    const v18, 0x401f5c29    # 2.49f

    .line 469
    .line 470
    .line 471
    const v13, 0x3f547ae1    # 0.83f

    .line 472
    .line 473
    .line 474
    const v14, 0x3f5c28f6    # 0.86f

    .line 475
    .line 476
    .line 477
    const v15, 0x4037ae14    # 2.87f

    .line 478
    .line 479
    .line 480
    const v16, 0x401f5c29    # 2.49f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x40d147ae    # 6.54f

    .line 487
    .line 488
    .line 489
    const v18, -0x3fd147ae    # -2.73f

    .line 490
    .line 491
    .line 492
    const v13, 0x4073d70a    # 3.81f

    .line 493
    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const v15, 0x40bccccd    # 5.9f

    .line 497
    .line 498
    .line 499
    const/high16 v16, -0x40000000    # -2.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40151eb8    # 2.33f

    .line 505
    .line 506
    .line 507
    const v18, 0x4008f5c3    # 2.14f

    .line 508
    .line 509
    .line 510
    const v13, 0x3e0f5c29    # 0.14f

    .line 511
    .line 512
    .line 513
    const v14, 0x3f828f5c    # 1.02f

    .line 514
    .line 515
    .line 516
    const v15, 0x3f8a3d71    # 1.08f

    .line 517
    .line 518
    .line 519
    const v16, 0x3fee147b    # 1.86f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3f6147ae    # 0.88f

    .line 526
    .line 527
    .line 528
    const v18, -0x40c28f5c    # -0.74f

    .line 529
    .line 530
    .line 531
    const v13, 0x3eeb851f    # 0.46f

    .line 532
    .line 533
    .line 534
    const v14, 0x3dcccccd    # 0.1f

    .line 535
    .line 536
    .line 537
    const v15, 0x3f6147ae    # 0.88f

    .line 538
    .line 539
    .line 540
    const v16, -0x4170a3d7    # -0.28f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x40dae148    # 6.84f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x4198f5c3    # 19.12f

    .line 553
    .line 554
    .line 555
    const v18, 0x40c2e148    # 6.09f

    .line 556
    .line 557
    .line 558
    const/high16 v13, 0x41a00000    # 20.0f

    .line 559
    .line 560
    const v14, 0x40cbd70a    # 6.37f

    .line 561
    .line 562
    .line 563
    const v15, 0x419c8f5c    # 19.57f

    .line 564
    .line 565
    .line 566
    const v16, 0x40bfae14    # 5.99f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/16 v16, 0x3800

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/high16 v8, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/high16 v9, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v12, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const/4 v14, 0x0

    .line 594
    const/4 v15, 0x0

    .line 595
    const-string v4, ""

    .line 596
    .line 597
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    sput-object v0, Landroidx/compose/material/icons/rounded/SetMealKt;->_setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    return-object v0
.end method

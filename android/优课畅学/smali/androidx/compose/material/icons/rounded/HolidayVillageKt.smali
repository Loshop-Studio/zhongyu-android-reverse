.class public final Landroidx/compose/material/icons/rounded/HolidayVillageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _holidayVillage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHolidayVillage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HolidayVillageKt;->_holidayVillage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HolidayVillage"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v13, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x410c28f6    # 8.76f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x416b851f    # -0.29f

    .line 100
    .line 101
    .line 102
    const v18, -0x40ca3d71    # -0.71f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, -0x4175c28f    # -0.27f

    .line 107
    .line 108
    .line 109
    const v15, -0x421eb852    # -0.11f

    .line 110
    .line 111
    .line 112
    const v16, -0x40fae148    # -0.52f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x3f8f5c29    # -3.76f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, 0x4153d70a    # 13.24f

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x40800000    # 4.0f

    .line 128
    .line 129
    const v13, 0x415c28f6    # 13.76f

    .line 130
    .line 131
    .line 132
    const v14, 0x4083851f    # 4.11f

    .line 133
    .line 134
    .line 135
    const v15, 0x415828f6    # 13.51f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x40800000    # 4.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x40ca3d71    # -0.71f

    .line 144
    .line 145
    .line 146
    const v18, 0x3fdae148    # 1.71f

    .line 147
    .line 148
    .line 149
    const v13, -0x409c28f6    # -0.89f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const v15, -0x40547ae1    # -1.34f

    .line 154
    .line 155
    .line 156
    const v16, 0x3f8a3d71    # 1.08f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x40547ae1    # 3.32f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x41800000    # 16.0f

    .line 169
    .line 170
    const v18, 0x4116147b    # 9.38f

    .line 171
    .line 172
    .line 173
    const v13, 0x417f3333    # 15.95f

    .line 174
    .line 175
    .line 176
    const v14, 0x4111eb85    # 9.12f

    .line 177
    .line 178
    .line 179
    const/high16 v15, 0x41800000    # 16.0f

    .line 180
    .line 181
    const/high16 v16, 0x41140000    # 9.25f

    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41980000    # 19.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x41880000    # 17.0f

    .line 192
    .line 193
    const/high16 v18, 0x41a00000    # 20.0f

    .line 194
    .line 195
    const/high16 v13, 0x41800000    # 16.0f

    .line 196
    .line 197
    const v14, 0x419c6666    # 19.55f

    .line 198
    .line 199
    .line 200
    const v15, 0x4183999a    # 16.45f

    .line 201
    .line 202
    .line 203
    const/high16 v16, 0x41a00000    # 20.0f

    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41a80000    # 21.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/high16 v18, -0x40800000    # -1.0f

    .line 219
    .line 220
    const v13, 0x3f0ccccd    # 0.55f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const/high16 v15, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const v16, -0x4119999a    # -0.45f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x40e3851f    # 7.11f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x416b851f    # -0.29f

    .line 239
    .line 240
    .line 241
    const v18, -0x40ca3d71    # -0.71f

    .line 242
    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const v14, -0x417ae148    # -0.26f

    .line 246
    .line 247
    .line 248
    const v15, -0x421eb852    # -0.11f

    .line 249
    .line 250
    .line 251
    const v16, -0x40fae148    # -0.52f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x3ff9999a    # -2.1f

    .line 258
    .line 259
    .line 260
    const v2, -0x3ff8f5c3    # -2.11f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x41973333    # 18.9f

    .line 267
    .line 268
    .line 269
    const/high16 v18, 0x40800000    # 4.0f

    .line 270
    .line 271
    const v13, 0x419b5c29    # 19.42f

    .line 272
    .line 273
    .line 274
    const v14, 0x4083851f    # 4.11f

    .line 275
    .line 276
    .line 277
    const v15, 0x419947ae    # 19.16f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x40800000    # 4.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x4191851f    # 18.19f

    .line 286
    .line 287
    .line 288
    const v18, 0x40b6b852    # 5.71f

    .line 289
    .line 290
    .line 291
    const/high16 v13, 0x41900000    # 18.0f

    .line 292
    .line 293
    const/high16 v14, 0x40800000    # 4.0f

    .line 294
    .line 295
    const v15, 0x418c7ae1    # 17.56f

    .line 296
    .line 297
    .line 298
    const v16, 0x40a28f5c    # 5.08f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x3fd5c28f    # 1.67f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x41a00000    # 20.0f

    .line 311
    .line 312
    const v18, 0x40f75c29    # 7.73f

    .line 313
    .line 314
    .line 315
    const v13, 0x419f999a    # 19.95f

    .line 316
    .line 317
    .line 318
    const v14, 0x40ef0a3d    # 7.47f

    .line 319
    .line 320
    .line 321
    const/high16 v15, 0x41a00000    # 20.0f

    .line 322
    .line 323
    const v16, 0x40f33333    # 7.6f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41980000    # 19.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, 0x41a80000    # 21.0f

    .line 335
    .line 336
    const/high16 v18, 0x41a00000    # 20.0f

    .line 337
    .line 338
    const/high16 v13, 0x41a00000    # 20.0f

    .line 339
    .line 340
    const v14, 0x419c6666    # 19.55f

    .line 341
    .line 342
    .line 343
    const v15, 0x41a3999a    # 20.45f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x41a00000    # 20.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41700000    # 15.0f

    .line 355
    .line 356
    const/high16 v2, 0x41000000    # 8.0f

    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v18, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v13, 0x3f0ccccd    # 0.55f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const/high16 v15, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const v16, 0x3ee66666    # 0.45f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40800000    # 4.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v18, -0x40800000    # -1.0f

    .line 386
    .line 387
    const v16, -0x4119999a    # -0.45f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x3ef68f5c    # -8.59f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, -0x416b851f    # -0.29f

    .line 400
    .line 401
    .line 402
    const v18, -0x40ca3d71    # -0.71f

    .line 403
    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const v14, -0x4175c28f    # -0.27f

    .line 407
    .line 408
    .line 409
    const v15, -0x421eb852    # -0.11f

    .line 410
    .line 411
    .line 412
    const v16, -0x40fae148    # -0.52f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, -0x3f600000    # -5.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x404b851f    # -1.41f

    .line 424
    .line 425
    .line 426
    const/16 v18, 0x0

    .line 427
    .line 428
    const v13, -0x413851ec    # -0.39f

    .line 429
    .line 430
    .line 431
    const v14, -0x413851ec    # -0.39f

    .line 432
    .line 433
    .line 434
    const v15, -0x407d70a4    # -1.02f

    .line 435
    .line 436
    .line 437
    const v16, -0x413851ec    # -0.39f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40a00000    # 5.0f

    .line 444
    .line 445
    const/high16 v2, -0x3f600000    # -5.0f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x40000000    # 2.0f

    .line 451
    .line 452
    const v18, 0x41268f5c    # 10.41f

    .line 453
    .line 454
    .line 455
    const v13, 0x40070a3d    # 2.11f

    .line 456
    .line 457
    .line 458
    const v14, 0x411e3d71    # 9.89f

    .line 459
    .line 460
    .line 461
    const/high16 v15, 0x40000000    # 2.0f

    .line 462
    .line 463
    const v16, 0x41226666    # 10.15f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x41980000    # 19.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v18, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, 0x3f0ccccd    # 0.55f

    .line 480
    .line 481
    .line 482
    const v15, 0x3ee66666    # 0.45f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x3f800000    # 1.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x40800000    # 4.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x3f800000    # -4.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x41000000    # 8.0f

    .line 501
    .line 502
    const/high16 v18, 0x41700000    # 15.0f

    .line 503
    .line 504
    const/high16 v13, 0x40e00000    # 7.0f

    .line 505
    .line 506
    const v14, 0x41773333    # 15.45f

    .line 507
    .line 508
    .line 509
    const v15, 0x40ee6666    # 7.45f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x41700000    # 15.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x41500000    # 13.0f

    .line 521
    .line 522
    const/high16 v2, 0x41000000    # 8.0f

    .line 523
    .line 524
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, -0x40800000    # -1.0f

    .line 528
    .line 529
    const/high16 v18, -0x40800000    # -1.0f

    .line 530
    .line 531
    const v13, -0x40f33333    # -0.55f

    .line 532
    .line 533
    .line 534
    const/4 v14, 0x0

    .line 535
    const/high16 v15, -0x40800000    # -1.0f

    .line 536
    .line 537
    const v16, -0x4119999a    # -0.45f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, -0x40800000    # -1.0f

    .line 544
    .line 545
    const v2, 0x3ee66666    # 0.45f

    .line 546
    .line 547
    .line 548
    const/high16 v4, 0x3f800000    # 1.0f

    .line 549
    .line 550
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x3f800000    # 1.0f

    .line 557
    .line 558
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x4108cccd    # 8.55f

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x41500000    # 13.0f

    .line 565
    .line 566
    const/high16 v4, 0x41000000    # 8.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/16 v16, 0x3800

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v8, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v7, 0x0

    .line 587
    const/high16 v9, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v12, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v15, 0x0

    .line 593
    const-string v4, ""

    .line 594
    .line 595
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    sput-object v0, Landroidx/compose/material/icons/rounded/HolidayVillageKt;->_holidayVillage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 604
    .line 605
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    return-object v0
.end method

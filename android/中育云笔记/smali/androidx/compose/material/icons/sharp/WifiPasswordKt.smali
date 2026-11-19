.class public final Landroidx/compose/material/icons/sharp/WifiPasswordKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiPassword(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WifiPasswordKt;->_wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.WifiPassword"

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
    const v0, 0x410fae14    # 8.98f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41c00000    # 24.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x400851ec    # 2.13f

    .line 79
    .line 80
    .line 81
    const v2, -0x3ff851ec    # -2.12f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v18, 0x40e00000    # 7.0f

    .line 90
    .line 91
    const v13, 0x419acccd    # 19.35f

    .line 92
    .line 93
    .line 94
    const v14, 0x41091eb8    # 8.57f

    .line 95
    .line 96
    .line 97
    const v15, 0x417d999a    # 15.85f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40e00000    # 7.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x3ee1eb85    # -9.88f

    .line 106
    .line 107
    .line 108
    const v2, 0x4083851f    # 4.11f

    .line 109
    .line 110
    .line 111
    const v4, -0x3f14cccd    # -7.35f

    .line 112
    .line 113
    .line 114
    const v6, 0x3fc8f5c3    # 1.57f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    const v2, 0x410fae14    # 8.98f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x40800000    # 4.0f

    .line 128
    .line 129
    const v13, 0x40447ae1    # 3.07f

    .line 130
    .line 131
    .line 132
    const v14, 0x40bccccd    # 5.9f

    .line 133
    .line 134
    .line 135
    const v15, 0x40e9eb85    # 7.31f

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
    const v0, 0x41a770a4    # 20.93f

    .line 144
    .line 145
    .line 146
    const v2, 0x40bccccd    # 5.9f

    .line 147
    .line 148
    .line 149
    const v4, 0x410fae14    # 8.98f

    .line 150
    .line 151
    .line 152
    const/high16 v6, 0x41c00000    # 24.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x4087ae14    # 4.24f

    .line 161
    .line 162
    .line 163
    const v2, 0x4153851f    # 13.22f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x4007ae14    # 2.12f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v18, 0x41500000    # 13.0f

    .line 176
    .line 177
    const v13, 0x40f9999a    # 7.8f

    .line 178
    .line 179
    .line 180
    const v14, 0x415e6666    # 13.9f

    .line 181
    .line 182
    .line 183
    const v15, 0x411ccccd    # 9.8f

    .line 184
    .line 185
    .line 186
    const/high16 v16, 0x41500000    # 13.0f

    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x40b47ae1    # 5.64f

    .line 192
    .line 193
    .line 194
    const v18, 0x40166666    # 2.35f

    .line 195
    .line 196
    .line 197
    const v13, 0x400ccccd    # 2.2f

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    const v15, 0x40866666    # 4.2f

    .line 202
    .line 203
    .line 204
    const v16, 0x3f666666    # 0.9f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, -0x3ff851ec    # -2.12f

    .line 211
    .line 212
    .line 213
    const v2, 0x4007ae14    # 2.12f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x41400000    # 12.0f

    .line 220
    .line 221
    const/high16 v18, 0x41200000    # 10.0f

    .line 222
    .line 223
    const v13, 0x418e3d71    # 17.78f

    .line 224
    .line 225
    .line 226
    const v14, 0x4133ae14    # 11.23f

    .line 227
    .line 228
    .line 229
    const v15, 0x41707ae1    # 15.03f

    .line 230
    .line 231
    .line 232
    const/high16 v16, 0x41200000    # 10.0f

    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x4087ae14    # 4.24f

    .line 238
    .line 239
    .line 240
    const v18, 0x4153851f    # 13.22f

    .line 241
    .line 242
    .line 243
    const v13, 0x410f851f    # 8.97f

    .line 244
    .line 245
    .line 246
    const/high16 v14, 0x41200000    # 10.0f

    .line 247
    .line 248
    const v15, 0x40c70a3d    # 6.22f

    .line 249
    .line 250
    .line 251
    const v16, 0x4133ae14    # 11.23f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41980000    # 19.0f

    .line 261
    .line 262
    const/high16 v2, 0x41c00000    # 24.0f

    .line 263
    .line 264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x40a00000    # 5.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, -0x3f400000    # -6.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, -0x3f600000    # -5.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x3f800000    # 1.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x40000000    # 2.0f

    .line 293
    .line 294
    const/high16 v18, -0x40000000    # -2.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, -0x40733333    # -1.1f

    .line 298
    .line 299
    .line 300
    const v15, 0x3f666666    # 0.9f

    .line 301
    .line 302
    .line 303
    const/high16 v16, -0x40000000    # -2.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x3f666666    # 0.9f

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x40000000    # 2.0f

    .line 312
    .line 313
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x3f800000    # 1.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41c00000    # 24.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41b00000    # 22.0f

    .line 330
    .line 331
    const/high16 v2, 0x41900000    # 18.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, -0x40800000    # -1.0f

    .line 337
    .line 338
    const/high16 v18, -0x40800000    # -1.0f

    .line 339
    .line 340
    const v14, -0x40f33333    # -0.55f

    .line 341
    .line 342
    .line 343
    const v15, -0x4119999a    # -0.45f

    .line 344
    .line 345
    .line 346
    const/high16 v16, -0x40800000    # -1.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x3ee66666    # 0.45f

    .line 352
    .line 353
    .line 354
    const/high16 v2, -0x40800000    # -1.0f

    .line 355
    .line 356
    const/high16 v4, 0x3f800000    # 1.0f

    .line 357
    .line 358
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x3f800000    # 1.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40000000    # 2.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41900000    # 18.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41800000    # 16.0f

    .line 380
    .line 381
    const/high16 v2, 0x41400000    # 12.0f

    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, -0x3f9e147b    # -3.53f

    .line 387
    .line 388
    .line 389
    const v18, 0x3fbae148    # 1.46f

    .line 390
    .line 391
    .line 392
    const v13, -0x404f5c29    # -1.38f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const v15, -0x3fd7ae14    # -2.63f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f0f5c29    # 0.56f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41a80000    # 21.0f

    .line 406
    .line 407
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x4061eb85    # 3.53f

    .line 411
    .line 412
    .line 413
    const v2, -0x3f9d70a4    # -3.54f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, 0x41400000    # 12.0f

    .line 420
    .line 421
    const/high16 v18, 0x41800000    # 16.0f

    .line 422
    .line 423
    const v13, 0x416a147b    # 14.63f

    .line 424
    .line 425
    .line 426
    const v14, 0x41847ae1    # 16.56f

    .line 427
    .line 428
    .line 429
    const v15, 0x4156147b    # 13.38f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x41800000    # 16.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    const/16 v16, 0x3800

    .line 445
    .line 446
    const/16 v17, 0x0

    .line 447
    .line 448
    const/high16 v6, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/high16 v8, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v7, 0x0

    .line 453
    const/high16 v9, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v12, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    sput-object v0, Landroidx/compose/material/icons/sharp/WifiPasswordKt;->_wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    return-object v0
.end method

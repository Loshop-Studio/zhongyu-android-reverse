.class public final Landroidx/compose/material/icons/rounded/GroupOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroupOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GroupOff"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x4055c28f    # -1.33f

    .line 78
    .line 79
    .line 80
    const v18, -0x3f8f5c29    # -3.76f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x404a3d71    # -1.42f

    .line 85
    .line 86
    .line 87
    const/high16 v15, -0x41000000    # -0.5f

    .line 88
    .line 89
    const v16, -0x3fd147ae    # -2.73f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, 0x41700000    # 15.0f

    .line 96
    .line 97
    const/high16 v18, 0x40800000    # 4.0f

    .line 98
    .line 99
    const v13, 0x416170a4    # 14.09f

    .line 100
    .line 101
    .line 102
    const v14, 0x40833333    # 4.1f

    .line 103
    .line 104
    .line 105
    const v15, 0x41687ae1    # 14.53f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x40800000    # 4.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x40800000    # 4.0f

    .line 114
    .line 115
    const v13, 0x400d70a4    # 2.21f

    .line 116
    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    const/high16 v15, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v16, 0x3fe51eb8    # 1.79f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, -0x401ae148    # -1.79f

    .line 128
    .line 129
    .line 130
    const/high16 v2, -0x3f800000    # -4.0f

    .line 131
    .line 132
    const/high16 v4, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x41c7ae14    # -0.18f

    .line 138
    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const v13, -0x428a3d71    # -0.06f

    .line 143
    .line 144
    .line 145
    const v15, -0x420a3d71    # -0.12f

    .line 146
    .line 147
    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x40bae148    # -0.77f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v18, 0x41000000    # 8.0f

    .line 162
    .line 163
    const v13, 0x416a6666    # 14.65f

    .line 164
    .line 165
    .line 166
    const v14, 0x4124a3d7    # 10.29f

    .line 167
    .line 168
    .line 169
    const/high16 v15, 0x41700000    # 15.0f

    .line 170
    .line 171
    const v16, 0x4112e148    # 9.18f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x408d1eb8    # 4.41f

    .line 181
    .line 182
    .line 183
    const v2, 0x40e7ae14    # 7.24f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41100000    # 9.0f

    .line 190
    .line 191
    const/high16 v18, 0x40800000    # 4.0f

    .line 192
    .line 193
    const v13, 0x40f8a3d7    # 7.77f

    .line 194
    .line 195
    .line 196
    const v14, 0x4084cccd    # 4.15f

    .line 197
    .line 198
    .line 199
    const v15, 0x4105eb85    # 8.37f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x40800000    # 4.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x40800000    # 4.0f

    .line 208
    .line 209
    const v13, 0x400d70a4    # 2.21f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/high16 v15, 0x40800000    # 4.0f

    .line 214
    .line 215
    const v16, 0x3fe51eb8    # 1.79f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, -0x412e147b    # -0.41f

    .line 222
    .line 223
    .line 224
    const v18, 0x3fe147ae    # 1.76f

    .line 225
    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const v14, 0x3f2147ae    # 0.63f

    .line 229
    .line 230
    .line 231
    const v15, -0x41e66666    # -0.15f

    .line 232
    .line 233
    .line 234
    const v16, 0x3f9d70a4    # 1.23f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x41a9851f    # 21.19f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const v18, 0x3fb47ae1    # 1.41f

    .line 255
    .line 256
    .line 257
    const v13, 0x3ec7ae14    # 0.39f

    .line 258
    .line 259
    .line 260
    const v14, 0x3ec7ae14    # 0.39f

    .line 261
    .line 262
    .line 263
    const v15, 0x3ec7ae14    # 0.39f

    .line 264
    .line 265
    .line 266
    const v16, 0x3f828f5c    # 1.02f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x3ec7ae14    # 0.39f

    .line 273
    .line 274
    .line 275
    const v2, -0x404b851f    # -1.41f

    .line 276
    .line 277
    .line 278
    const/4 v4, 0x0

    .line 279
    const v6, -0x407d70a4    # -1.02f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, -0x3fc0a3d7    # -2.99f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x41800000    # 16.0f

    .line 292
    .line 293
    const/high16 v18, 0x41a00000    # 20.0f

    .line 294
    .line 295
    const v13, 0x4184cccd    # 16.6f

    .line 296
    .line 297
    .line 298
    const v14, 0x419ecccd    # 19.85f

    .line 299
    .line 300
    .line 301
    const v15, 0x41828f5c    # 16.32f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x41a00000    # 20.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40000000    # 2.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, -0x40800000    # -1.0f

    .line 315
    .line 316
    const/high16 v18, -0x40800000    # -1.0f

    .line 317
    .line 318
    const v13, -0x40f33333    # -0.55f

    .line 319
    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const/high16 v15, -0x40800000    # -1.0f

    .line 323
    .line 324
    const v16, -0x4119999a    # -0.45f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, -0x40000000    # -2.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41000000    # 8.0f

    .line 336
    .line 337
    const/high16 v18, -0x3f800000    # -4.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, -0x3fd5c28f    # -2.66f

    .line 341
    .line 342
    .line 343
    const v15, 0x40aa8f5c    # 5.33f

    .line 344
    .line 345
    .line 346
    const/high16 v16, -0x3f800000    # -4.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 352
    .line 353
    const v18, 0x3da3d70a    # 0.08f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ebd70a4    # 0.37f

    .line 357
    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    const v15, 0x3f4ccccd    # 0.8f

    .line 361
    .line 362
    .line 363
    const v16, 0x3cf5c28f    # 0.03f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x4112b852    # 9.17f

    .line 370
    .line 371
    .line 372
    const/high16 v2, 0x41400000    # 12.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x41100000    # 9.0f

    .line 378
    .line 379
    const/high16 v18, 0x41400000    # 12.0f

    .line 380
    .line 381
    const v13, 0x4111c28f    # 9.11f

    .line 382
    .line 383
    .line 384
    const/high16 v14, 0x41400000    # 12.0f

    .line 385
    .line 386
    const v15, 0x4110f5c3    # 9.06f

    .line 387
    .line 388
    .line 389
    const/high16 v16, 0x41400000    # 12.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, -0x3f800000    # -4.0f

    .line 395
    .line 396
    const/high16 v18, -0x3f800000    # -4.0f

    .line 397
    .line 398
    const v13, -0x3ff28f5c    # -2.21f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, -0x3f800000    # -4.0f

    .line 403
    .line 404
    const v16, -0x401ae148    # -1.79f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const v18, -0x41d1eb85    # -0.17f

    .line 413
    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    const v14, -0x428a3d71    # -0.06f

    .line 417
    .line 418
    .line 419
    const/4 v15, 0x0

    .line 420
    const v16, -0x421eb852    # -0.11f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3fb1eb85    # 1.39f

    .line 427
    .line 428
    .line 429
    const v2, 0x40870a3d    # 4.22f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3fb1eb85    # 1.39f

    .line 436
    .line 437
    .line 438
    const v18, 0x4033d70a    # 2.81f

    .line 439
    .line 440
    .line 441
    const/high16 v13, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const v14, 0x40751eb8    # 3.83f

    .line 444
    .line 445
    .line 446
    const/high16 v15, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const v16, 0x404ccccd    # 3.2f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x413851ec    # -0.39f

    .line 455
    .line 456
    .line 457
    const v2, 0x3fb47ae1    # 1.41f

    .line 458
    .line 459
    .line 460
    const v6, 0x3f828f5c    # 1.02f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x41a9851f    # 21.19f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x41808f5c    # 16.07f

    .line 476
    .line 477
    .line 478
    const v2, 0x41971eb8    # 18.89f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, -0x3ff147ae    # -2.23f

    .line 485
    .line 486
    .line 487
    const v18, -0x3fc3d70a    # -2.94f

    .line 488
    .line 489
    .line 490
    const v13, -0x416b851f    # -0.29f

    .line 491
    .line 492
    .line 493
    const v14, -0x4063d70a    # -1.22f

    .line 494
    .line 495
    .line 496
    const v15, -0x406f5c29    # -1.13f

    .line 497
    .line 498
    .line 499
    const v16, -0x3ff3d70a    # -2.19f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x41b80000    # 23.0f

    .line 506
    .line 507
    const/high16 v18, 0x41880000    # 17.0f

    .line 508
    .line 509
    const v13, 0x419b5c29    # 19.42f

    .line 510
    .line 511
    .line 512
    const v14, 0x41587ae1    # 13.53f

    .line 513
    .line 514
    .line 515
    const/high16 v15, 0x41b80000    # 23.0f

    .line 516
    .line 517
    const v16, 0x416d1eb8    # 14.82f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, -0x413d70a4    # -0.38f

    .line 529
    .line 530
    .line 531
    const v18, 0x3f4a3d71    # 0.79f

    .line 532
    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, 0x3ea3d70a    # 0.32f

    .line 536
    .line 537
    .line 538
    const v15, -0x41e66666    # -0.15f

    .line 539
    .line 540
    .line 541
    const v16, 0x3f19999a    # 0.6f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x41808f5c    # 16.07f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/16 v16, 0x3800

    .line 561
    .line 562
    const/16 v17, 0x0

    .line 563
    .line 564
    const/high16 v6, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v8, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v7, 0x0

    .line 569
    const/high16 v9, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v12, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    const/4 v15, 0x0

    .line 575
    const-string v4, ""

    .line 576
    .line 577
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sput-object v0, Landroidx/compose/material/icons/rounded/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 586
    .line 587
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/sharp/Replay5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _replay5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay5(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Replay5"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const/high16 v2, 0x40c00000    # 6.0f

    .line 85
    .line 86
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v0, 0x40a00000    # 5.0f

    .line 90
    .line 91
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x40e00000    # 7.0f

    .line 95
    .line 96
    const/high16 v2, 0x41400000    # 12.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, 0x40c00000    # 6.0f

    .line 102
    .line 103
    const/high16 v18, 0x40c00000    # 6.0f

    .line 104
    .line 105
    const v13, 0x4053d70a    # 3.31f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const/high16 v15, 0x40c00000    # 6.0f

    .line 110
    .line 111
    const v16, 0x402c28f6    # 2.69f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x3fd3d70a    # -2.69f

    .line 118
    .line 119
    .line 120
    const/high16 v2, 0x40c00000    # 6.0f

    .line 121
    .line 122
    const/high16 v4, -0x3f400000    # -6.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v2, -0x3f400000    # -6.0f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x40800000    # 4.0f

    .line 133
    .line 134
    const/high16 v2, 0x41500000    # 13.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x41000000    # 8.0f

    .line 140
    .line 141
    const/high16 v18, 0x41000000    # 8.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x408d70a4    # 4.42f

    .line 145
    .line 146
    .line 147
    const v15, 0x40651eb8    # 3.58f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x41000000    # 8.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, -0x3f9ae148    # -3.58f

    .line 156
    .line 157
    .line 158
    const/high16 v2, 0x41000000    # 8.0f

    .line 159
    .line 160
    const/high16 v4, -0x3f000000    # -8.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v2, -0x3f000000    # -8.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x412b0a3d    # 10.69f

    .line 174
    .line 175
    .line 176
    const v2, 0x415e6666    # 13.9f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x3ff51eb8    # -2.17f

    .line 183
    .line 184
    .line 185
    const/high16 v2, 0x3e800000    # 0.25f

    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x4018f5c3    # 2.39f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x3f35c28f    # 0.71f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x40266666    # -1.7f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3f6b851f    # 0.92f

    .line 209
    .line 210
    .line 211
    const v2, -0x421eb852    # -0.11f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x3de147ae    # 0.11f

    .line 218
    .line 219
    .line 220
    const v18, -0x42b33333    # -0.05f

    .line 221
    .line 222
    .line 223
    const v13, 0x3cf5c28f    # 0.03f

    .line 224
    .line 225
    .line 226
    const v14, -0x435c28f6    # -0.02f

    .line 227
    .line 228
    .line 229
    const v15, 0x3d8f5c29    # 0.07f

    .line 230
    .line 231
    .line 232
    const v16, -0x430a3d71    # -0.03f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, -0x42b33333    # -0.05f

    .line 239
    .line 240
    .line 241
    const v2, 0x3e19999a    # 0.15f

    .line 242
    .line 243
    .line 244
    const v4, -0x42dc28f6    # -0.04f

    .line 245
    .line 246
    .line 247
    const v6, 0x3db851ec    # 0.09f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x430a3d71    # -0.03f

    .line 254
    .line 255
    .line 256
    const v2, 0x3e3851ec    # 0.18f

    .line 257
    .line 258
    .line 259
    const v4, 0x3df5c28f    # 0.12f

    .line 260
    .line 261
    .line 262
    const v6, -0x42dc28f6    # -0.04f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x3e4ccccd    # 0.2f

    .line 269
    .line 270
    .line 271
    const v2, -0x435c28f6    # -0.02f

    .line 272
    .line 273
    .line 274
    const v4, 0x3e051eb8    # 0.13f

    .line 275
    .line 276
    .line 277
    const v6, -0x435c28f6    # -0.02f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3f0ccccd    # 0.55f

    .line 284
    .line 285
    .line 286
    const v18, 0x3dcccccd    # 0.1f

    .line 287
    .line 288
    .line 289
    const v13, 0x3e570a3d    # 0.21f

    .line 290
    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const v15, 0x3ec7ae14    # 0.39f

    .line 294
    .line 295
    .line 296
    const v16, 0x3cf5c28f    # 0.03f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3ed1eb85    # 0.41f

    .line 303
    .line 304
    .line 305
    const v2, 0x3e8f5c29    # 0.28f

    .line 306
    .line 307
    .line 308
    const v4, 0x3e99999a    # 0.3f

    .line 309
    .line 310
    .line 311
    const v6, 0x3e23d70a    # 0.16f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x3e8a3d71    # 0.27f

    .line 318
    .line 319
    .line 320
    const v2, 0x3ee66666    # 0.45f

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x3e800000    # 0.25f

    .line 324
    .line 325
    const v6, 0x3e4ccccd    # 0.2f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x3ec28f5c    # 0.38f

    .line 332
    .line 333
    .line 334
    const v2, 0x3f19999a    # 0.6f

    .line 335
    .line 336
    .line 337
    const v4, 0x3db851ec    # 0.09f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x4247ae14    # -0.09f

    .line 344
    .line 345
    .line 346
    const v18, 0x3f0a3d71    # 0.54f

    .line 347
    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, 0x3e428f5c    # 0.19f

    .line 351
    .line 352
    .line 353
    const v15, -0x430a3d71    # -0.03f

    .line 354
    .line 355
    .line 356
    const v16, 0x3ebd70a4    # 0.37f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x4175c28f    # -0.27f

    .line 363
    .line 364
    .line 365
    const v2, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    const v4, -0x41e66666    # -0.15f

    .line 369
    .line 370
    .line 371
    const v6, 0x3ea3d70a    # 0.32f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, -0x4119999a    # -0.45f

    .line 378
    .line 379
    .line 380
    const v2, 0x3e9eb852    # 0.31f

    .line 381
    .line 382
    .line 383
    const v4, -0x4175c28f    # -0.27f

    .line 384
    .line 385
    .line 386
    const v6, 0x3e75c28f    # 0.24f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x413851ec    # -0.39f

    .line 393
    .line 394
    .line 395
    const v2, -0x40dc28f6    # -0.64f

    .line 396
    .line 397
    .line 398
    const v4, 0x3df5c28f    # 0.12f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x40f851ec    # -0.53f

    .line 405
    .line 406
    .line 407
    const v18, -0x425c28f6    # -0.08f

    .line 408
    .line 409
    .line 410
    const v13, -0x41c7ae14    # -0.18f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, -0x4147ae14    # -0.36f

    .line 415
    .line 416
    .line 417
    const v16, -0x430a3d71    # -0.03f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, -0x41f0a3d7    # -0.14f

    .line 424
    .line 425
    .line 426
    const v2, -0x41147ae1    # -0.46f

    .line 427
    .line 428
    .line 429
    const v4, -0x418a3d71    # -0.24f

    .line 430
    .line 431
    .line 432
    const v6, -0x415c28f6    # -0.32f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x415c28f6    # -0.32f

    .line 439
    .line 440
    .line 441
    const v2, -0x413851ec    # -0.39f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x41570a3d    # -0.33f

    .line 448
    .line 449
    .line 450
    const v2, -0x40f851ec    # -0.53f

    .line 451
    .line 452
    .line 453
    const v4, -0x41fae148    # -0.13f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x3f570a3d    # 0.84f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, 0x3e428f5c    # 0.19f

    .line 466
    .line 467
    .line 468
    const v18, 0x3ed1eb85    # 0.41f

    .line 469
    .line 470
    .line 471
    const v13, 0x3ca3d70a    # 0.02f

    .line 472
    .line 473
    .line 474
    const v14, 0x3e3851ec    # 0.18f

    .line 475
    .line 476
    .line 477
    const v15, 0x3da3d70a    # 0.08f

    .line 478
    .line 479
    .line 480
    const v16, 0x3ea3d70a    # 0.32f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x3ed70a3d    # 0.42f

    .line 487
    .line 488
    .line 489
    const v2, 0x3e19999a    # 0.15f

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x3e800000    # 0.25f

    .line 493
    .line 494
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, 0x3e8a3d71    # 0.27f

    .line 498
    .line 499
    .line 500
    const v18, -0x428a3d71    # -0.06f

    .line 501
    .line 502
    .line 503
    const v13, 0x3de147ae    # 0.11f

    .line 504
    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    const v15, 0x3e4ccccd    # 0.2f

    .line 508
    .line 509
    .line 510
    const v16, -0x435c28f6    # -0.02f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x42333333    # -0.1f

    .line 517
    .line 518
    .line 519
    const v2, -0x41d1eb85    # -0.17f

    .line 520
    .line 521
    .line 522
    const v4, 0x3e3851ec    # 0.18f

    .line 523
    .line 524
    .line 525
    const v6, 0x3e0f5c29    # 0.14f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3de147ae    # 0.11f

    .line 532
    .line 533
    .line 534
    const/high16 v2, -0x41800000    # -0.25f

    .line 535
    .line 536
    const v4, -0x41e66666    # -0.15f

    .line 537
    .line 538
    .line 539
    const v6, 0x3da3d70a    # 0.08f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, -0x41b33333    # -0.2f

    .line 546
    .line 547
    .line 548
    const v2, -0x416147ae    # -0.31f

    .line 549
    .line 550
    .line 551
    const v4, 0x3cf5c28f    # 0.03f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x41a8f5c3    # -0.21f

    .line 558
    .line 559
    .line 560
    const v4, -0x42dc28f6    # -0.04f

    .line 561
    .line 562
    .line 563
    const v6, -0x43dc28f6    # -0.01f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, -0x4270a3d7    # -0.07f

    .line 570
    .line 571
    .line 572
    const v2, -0x41d1eb85    # -0.17f

    .line 573
    .line 574
    .line 575
    const v4, -0x41fae148    # -0.13f

    .line 576
    .line 577
    .line 578
    const v6, -0x418a3d71    # -0.24f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x420a3d71    # -0.12f

    .line 585
    .line 586
    .line 587
    const v2, -0x41a8f5c3    # -0.21f

    .line 588
    .line 589
    .line 590
    const v6, -0x41e66666    # -0.15f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x41bd70a4    # -0.19f

    .line 597
    .line 598
    .line 599
    const v2, -0x41666666    # -0.3f

    .line 600
    .line 601
    .line 602
    const v4, -0x42b33333    # -0.05f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, -0x41b33333    # -0.2f

    .line 609
    .line 610
    .line 611
    const v18, 0x3ca3d70a    # 0.02f

    .line 612
    .line 613
    .line 614
    const v13, -0x425c28f6    # -0.08f

    .line 615
    .line 616
    .line 617
    const v15, -0x41e66666    # -0.15f

    .line 618
    .line 619
    .line 620
    const v16, 0x3c23d70a    # 0.01f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x3d4ccccd    # 0.05f

    .line 627
    .line 628
    .line 629
    const v2, -0x421eb852    # -0.11f

    .line 630
    .line 631
    .line 632
    const v4, 0x3cf5c28f    # 0.03f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, -0x420a3d71    # -0.12f

    .line 639
    .line 640
    .line 641
    const v2, 0x3d8f5c29    # 0.07f

    .line 642
    .line 643
    .line 644
    const v4, -0x425c28f6    # -0.08f

    .line 645
    .line 646
    .line 647
    const v6, 0x3d4ccccd    # 0.05f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x3d75c28f    # 0.06f

    .line 654
    .line 655
    .line 656
    const v2, -0x42333333    # -0.1f

    .line 657
    .line 658
    .line 659
    const v4, 0x3db851ec    # 0.09f

    .line 660
    .line 661
    .line 662
    const v6, -0x4270a3d7    # -0.07f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, -0x40d47ae1    # -0.67f

    .line 669
    .line 670
    .line 671
    const v2, -0x41dc28f6    # -0.16f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/16 v16, 0x3800

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const/high16 v6, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/high16 v8, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    const/high16 v9, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/high16 v12, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v15, 0x0

    .line 699
    const-string v4, ""

    .line 700
    .line 701
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sput-object v0, Landroidx/compose/material/icons/sharp/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 710
    .line 711
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    return-object v0
.end method

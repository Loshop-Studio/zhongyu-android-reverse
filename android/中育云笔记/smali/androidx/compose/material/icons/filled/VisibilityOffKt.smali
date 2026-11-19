.class public final Landroidx/compose/material/icons/filled/VisibilityOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibilityOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.VisibilityOff"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v18, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v13, 0x4030a3d7    # 2.76f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40a00000    # 5.0f

    .line 86
    .line 87
    const v16, 0x400f5c29    # 2.24f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x4147ae14    # -0.36f

    .line 94
    .line 95
    .line 96
    const v18, 0x3fea3d71    # 1.83f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3f266666    # 0.65f

    .line 101
    .line 102
    .line 103
    const v15, -0x41fae148    # -0.13f

    .line 104
    .line 105
    .line 106
    const v16, 0x3fa147ae    # 1.26f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x403ae148    # 2.92f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x405b851f    # 3.43f

    .line 119
    .line 120
    .line 121
    const/high16 v18, -0x3f680000    # -4.75f

    .line 122
    .line 123
    const v13, 0x3fc147ae    # 1.51f

    .line 124
    .line 125
    .line 126
    const v14, -0x405eb852    # -1.26f

    .line 127
    .line 128
    .line 129
    const v15, 0x402ccccd    # 2.7f

    .line 130
    .line 131
    .line 132
    const v16, -0x3fc70a3d    # -2.89f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 139
    .line 140
    const/high16 v18, -0x3f100000    # -7.5f

    .line 141
    .line 142
    const v13, -0x40228f5c    # -1.73f

    .line 143
    .line 144
    .line 145
    const v14, -0x3f73851f    # -4.39f

    .line 146
    .line 147
    .line 148
    const/high16 v15, -0x3f400000    # -6.0f

    .line 149
    .line 150
    const/high16 v16, -0x3f100000    # -7.5f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x3f8147ae    # -3.98f

    .line 156
    .line 157
    .line 158
    const v18, 0x3f333333    # 0.7f

    .line 159
    .line 160
    .line 161
    const v13, -0x404ccccd    # -1.4f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, -0x3fd0a3d7    # -2.74f

    .line 166
    .line 167
    .line 168
    const/high16 v16, 0x3e800000    # 0.25f

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x400a3d71    # 2.16f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x41400000    # 12.0f

    .line 180
    .line 181
    const/high16 v18, 0x40e00000    # 7.0f

    .line 182
    .line 183
    const v13, 0x412bd70a    # 10.74f

    .line 184
    .line 185
    .line 186
    const v14, 0x40e428f6    # 7.13f

    .line 187
    .line 188
    .line 189
    const v15, 0x4135999a    # 11.35f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x40e00000    # 7.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x4088a3d7    # 4.27f

    .line 201
    .line 202
    .line 203
    const/high16 v2, 0x40000000    # 2.0f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x4011eb85    # 2.28f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x3eeb851f    # 0.46f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v18, 0x41400000    # 12.0f

    .line 223
    .line 224
    const v13, 0x40451eb8    # 3.08f

    .line 225
    .line 226
    .line 227
    const v14, 0x4104cccd    # 8.3f

    .line 228
    .line 229
    .line 230
    const v15, 0x3fe3d70a    # 1.78f

    .line 231
    .line 232
    .line 233
    const v16, 0x412051ec    # 10.02f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x41300000    # 11.0f

    .line 240
    .line 241
    const/high16 v18, 0x40f00000    # 7.5f

    .line 242
    .line 243
    const v13, 0x3fdd70a4    # 1.73f

    .line 244
    .line 245
    .line 246
    const v14, 0x408c7ae1    # 4.39f

    .line 247
    .line 248
    .line 249
    const/high16 v15, 0x40c00000    # 6.0f

    .line 250
    .line 251
    const/high16 v16, 0x40f00000    # 7.5f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x408c28f6    # 4.38f

    .line 257
    .line 258
    .line 259
    const v18, -0x40a8f5c3    # -0.84f

    .line 260
    .line 261
    .line 262
    const v13, 0x3fc66666    # 1.55f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const v15, 0x4041eb85    # 3.03f

    .line 267
    .line 268
    .line 269
    const v16, -0x41666666    # -0.3f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3ed70a3d    # 0.42f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x419dd70a    # 19.73f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x41b00000    # 22.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41a80000    # 21.0f

    .line 290
    .line 291
    const v2, 0x41a5d70a    # 20.73f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x405147ae    # 3.27f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x40400000    # 3.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x4088a3d7    # 4.27f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x40000000    # 2.0f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x40f0f5c3    # 7.53f

    .line 317
    .line 318
    .line 319
    const v2, 0x411ccccd    # 9.8f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x3fc66666    # 1.55f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, -0x425c28f6    # -0.08f

    .line 332
    .line 333
    .line 334
    const v18, 0x3f266666    # 0.65f

    .line 335
    .line 336
    .line 337
    const v13, -0x42b33333    # -0.05f

    .line 338
    .line 339
    .line 340
    const v14, 0x3e570a3d    # 0.21f

    .line 341
    .line 342
    .line 343
    const v15, -0x425c28f6    # -0.08f

    .line 344
    .line 345
    .line 346
    const v16, 0x3edc28f6    # 0.43f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x40400000    # 3.0f

    .line 353
    .line 354
    const/high16 v18, 0x40400000    # 3.0f

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, 0x3fd47ae1    # 1.66f

    .line 358
    .line 359
    .line 360
    const v15, 0x3fab851f    # 1.34f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x40400000    # 3.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3f266666    # 0.65f

    .line 369
    .line 370
    .line 371
    const v18, -0x425c28f6    # -0.08f

    .line 372
    .line 373
    .line 374
    const v13, 0x3e6147ae    # 0.22f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const v15, 0x3ee147ae    # 0.44f

    .line 379
    .line 380
    .line 381
    const v16, -0x430a3d71    # -0.03f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x3ff33333    # -2.2f

    .line 391
    .line 392
    .line 393
    const v18, 0x3f07ae14    # 0.53f

    .line 394
    .line 395
    .line 396
    const v13, -0x40d47ae1    # -0.67f

    .line 397
    .line 398
    .line 399
    const v14, 0x3ea8f5c3    # 0.33f

    .line 400
    .line 401
    .line 402
    const v15, -0x404b851f    # -1.41f

    .line 403
    .line 404
    .line 405
    const v16, 0x3f07ae14    # 0.53f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, -0x3f600000    # -5.0f

    .line 412
    .line 413
    const/high16 v18, -0x3f600000    # -5.0f

    .line 414
    .line 415
    const v13, -0x3fcf5c29    # -2.76f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const/high16 v15, -0x3f600000    # -5.0f

    .line 420
    .line 421
    const v16, -0x3ff0a3d7    # -2.24f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x3f07ae14    # 0.53f

    .line 428
    .line 429
    .line 430
    const v18, -0x3ff33333    # -2.2f

    .line 431
    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const v14, -0x40b5c28f    # -0.79f

    .line 435
    .line 436
    .line 437
    const v15, 0x3e4ccccd    # 0.2f

    .line 438
    .line 439
    .line 440
    const v16, -0x403c28f6    # -1.53f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x413d70a4    # 11.84f

    .line 450
    .line 451
    .line 452
    const v2, 0x411051ec    # 9.02f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x4049999a    # 3.15f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3ca3d70a    # 0.02f

    .line 465
    .line 466
    .line 467
    const v2, -0x41dc28f6    # -0.16f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 474
    .line 475
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 476
    .line 477
    const v14, -0x402b851f    # -1.66f

    .line 478
    .line 479
    .line 480
    const v15, -0x40547ae1    # -1.34f

    .line 481
    .line 482
    .line 483
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x41d1eb85    # -0.17f

    .line 489
    .line 490
    .line 491
    const v2, 0x3c23d70a    # 0.01f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const/16 v16, 0x3800

    .line 505
    .line 506
    const/16 v17, 0x0

    .line 507
    .line 508
    const/high16 v6, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/high16 v8, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/4 v7, 0x0

    .line 513
    const/high16 v9, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/high16 v12, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/4 v14, 0x0

    .line 518
    const/4 v15, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sput-object v0, Landroidx/compose/material/icons/filled/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object v0
.end method

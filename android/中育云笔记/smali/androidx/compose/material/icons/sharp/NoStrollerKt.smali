.class public final Landroidx/compose/material/icons/sharp/NoStrollerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoStroller(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.NoStroller"

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
    const v0, 0x410147ae    # 8.08f

    .line 71
    .line 72
    .line 73
    const v2, 0x412e8f5c    # 10.91f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40d0f5c3    # 6.53f

    .line 80
    .line 81
    .line 82
    const v2, 0x406ccccd    # 3.7f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41200000    # 10.0f

    .line 89
    .line 90
    const/high16 v18, 0x40400000    # 3.0f

    .line 91
    .line 92
    const v13, 0x40f33333    # 7.6f

    .line 93
    .line 94
    .line 95
    const/high16 v14, 0x40500000    # 3.25f

    .line 96
    .line 97
    const v15, 0x410c51ec    # 8.77f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40400000    # 3.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x4089999a    # 4.3f

    .line 106
    .line 107
    .line 108
    const v18, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v13, 0x3fc7ae14    # 1.56f

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const v15, 0x4041eb85    # 3.03f

    .line 116
    .line 117
    .line 118
    const v16, 0x3ecccccd    # 0.4f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x410147ae    # 8.08f

    .line 125
    .line 126
    .line 127
    const v2, 0x412e8f5c    # 10.91f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x41a9851f    # 21.19f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, -0x3f670a3d    # -4.78f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, -0x3f480000    # -5.75f

    .line 149
    .line 150
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x4033d70a    # 2.81f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3fb1eb85    # 1.39f

    .line 160
    .line 161
    .line 162
    const v2, 0x40870a3d    # 4.22f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x40ff0a3d    # 7.97f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x40a8a3d7    # 5.27f

    .line 175
    .line 176
    .line 177
    const/high16 v2, 0x41880000    # 17.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x410e6666    # 8.9f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x3f90a3d7    # 1.13f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x405eb852    # -1.26f

    .line 195
    .line 196
    .line 197
    const v18, 0x4011eb85    # 2.28f

    .line 198
    .line 199
    .line 200
    const v13, -0x409eb852    # -0.88f

    .line 201
    .line 202
    .line 203
    const v14, 0x3ea8f5c3    # 0.33f

    .line 204
    .line 205
    .line 206
    const v15, -0x4043d70a    # -1.47f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x3fc51eb8    # 1.54f

    .line 215
    .line 216
    .line 217
    const v18, 0x3fc51eb8    # 1.54f

    .line 218
    .line 219
    .line 220
    const v13, 0x3e19999a    # 0.15f

    .line 221
    .line 222
    .line 223
    const v14, 0x3f428f5c    # 0.76f

    .line 224
    .line 225
    .line 226
    const v15, 0x3f47ae14    # 0.78f

    .line 227
    .line 228
    .line 229
    const v16, 0x3fb1eb85    # 1.39f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x4011eb85    # 2.28f

    .line 236
    .line 237
    .line 238
    const v18, -0x405eb852    # -1.26f

    .line 239
    .line 240
    .line 241
    const v13, 0x3f83d70a    # 1.03f

    .line 242
    .line 243
    .line 244
    const v14, 0x3e570a3d    # 0.21f

    .line 245
    .line 246
    .line 247
    const v15, 0x3ff9999a    # 1.95f

    .line 248
    .line 249
    .line 250
    const v16, -0x413d70a4    # -0.38f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x3ff47ae1    # 1.91f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x41a9851f    # 21.19f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x40c00000    # 6.0f

    .line 272
    .line 273
    const/high16 v2, 0x41900000    # 18.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40000000    # -2.0f

    .line 279
    .line 280
    const/high16 v18, 0x40000000    # 2.0f

    .line 281
    .line 282
    const v13, -0x40733333    # -1.1f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40000000    # -2.0f

    .line 287
    .line 288
    const v16, 0x3f666666    # 0.9f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3f666666    # 0.9f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x4099999a    # -0.9f

    .line 303
    .line 304
    .line 305
    const/high16 v2, -0x40000000    # -2.0f

    .line 306
    .line 307
    const/high16 v4, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40e33333    # 7.1f

    .line 313
    .line 314
    .line 315
    const/high16 v2, 0x40c00000    # 6.0f

    .line 316
    .line 317
    const/high16 v4, 0x41900000    # 18.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x40c8a3d7    # 6.27f

    .line 326
    .line 327
    .line 328
    const/high16 v2, 0x41880000    # 17.0f

    .line 329
    .line 330
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x41953333    # 18.65f

    .line 334
    .line 335
    .line 336
    const/high16 v18, 0x40a00000    # 5.0f

    .line 337
    .line 338
    const v13, 0x418ca3d7    # 17.58f

    .line 339
    .line 340
    .line 341
    const v14, 0x40b2e148    # 5.59f

    .line 342
    .line 343
    .line 344
    const v15, 0x418fc28f    # 17.97f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x40a00000    # 5.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x41a00000    # 20.0f

    .line 353
    .line 354
    const v18, 0x40cf5c29    # 6.48f

    .line 355
    .line 356
    .line 357
    const v13, 0x419b5c29    # 19.42f

    .line 358
    .line 359
    .line 360
    const/high16 v14, 0x40a00000    # 5.0f

    .line 361
    .line 362
    const/high16 v15, 0x41a00000    # 20.0f

    .line 363
    .line 364
    const v16, 0x40b51eb8    # 5.66f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40e00000    # 7.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40cf5c29    # 6.48f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x41953333    # 18.65f

    .line 387
    .line 388
    .line 389
    const/high16 v18, 0x40400000    # 3.0f

    .line 390
    .line 391
    const/high16 v13, 0x41b00000    # 22.0f

    .line 392
    .line 393
    const v14, 0x4091eb85    # 4.56f

    .line 394
    .line 395
    .line 396
    const v15, 0x41a428f6    # 20.52f

    .line 397
    .line 398
    .line 399
    const/high16 v16, 0x40400000    # 3.0f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x3fb47ae1    # -3.18f

    .line 405
    .line 406
    .line 407
    const v18, 0x4001eb85    # 2.03f

    .line 408
    .line 409
    .line 410
    const v13, -0x402b851f    # -1.66f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, -0x3fdd70a4    # -2.54f

    .line 415
    .line 416
    .line 417
    const v16, 0x3fa28f5c    # 1.27f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 424
    .line 425
    const v2, 0x4083851f    # 4.11f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x4162b852    # 14.17f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x41880000    # 17.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40c8a3d7    # 6.27f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const/16 v16, 0x3800

    .line 453
    .line 454
    const/16 v17, 0x0

    .line 455
    .line 456
    const/high16 v6, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/high16 v8, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v7, 0x0

    .line 461
    const/high16 v9, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v12, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v15, 0x0

    .line 467
    const-string v4, ""

    .line 468
    .line 469
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    sput-object v0, Landroidx/compose/material/icons/sharp/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-object v0
.end method

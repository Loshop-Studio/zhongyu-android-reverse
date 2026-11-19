.class public final Landroidx/compose/material/icons/rounded/TransgenderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _transgender:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTransgender(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TransgenderKt;->_transgender:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Transgender"

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
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 71
    .line 72
    const/high16 v2, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f800000    # -4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40800000    # -1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x3f800000    # 1.0f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x3f0ccccd    # 0.55f

    .line 102
    .line 103
    .line 104
    const v15, 0x3ee66666    # 0.45f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x3f800000    # 1.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3fca3d71    # 1.58f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x3f81eb85    # -3.97f

    .line 119
    .line 120
    .line 121
    const v2, 0x407e147b    # 3.97f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x41400000    # 12.0f

    .line 128
    .line 129
    const/high16 v18, 0x40c00000    # 6.0f

    .line 130
    .line 131
    const v13, 0x4163ae14    # 14.23f

    .line 132
    .line 133
    .line 134
    const v14, 0x40cb851f    # 6.36f

    .line 135
    .line 136
    .line 137
    const v15, 0x41528f5c    # 13.16f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x40c00000    # 6.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x410e3d71    # 8.89f

    .line 146
    .line 147
    .line 148
    const v2, 0x40df0a3d    # 6.97f

    .line 149
    .line 150
    .line 151
    const v4, 0x411c51ec    # 9.77f

    .line 152
    .line 153
    .line 154
    const v6, 0x40cb851f    # 6.36f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x4103d70a    # 8.24f

    .line 161
    .line 162
    .line 163
    const v2, 0x40ca3d71    # 6.32f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, -0x40cccccd    # -0.7f

    .line 170
    .line 171
    .line 172
    const v2, 0x3f333333    # 0.7f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    const v18, -0x404b851f    # -1.41f

    .line 181
    .line 182
    .line 183
    const v13, 0x3ec7ae14    # 0.39f

    .line 184
    .line 185
    .line 186
    const v14, -0x413851ec    # -0.39f

    .line 187
    .line 188
    .line 189
    const v15, 0x3ec7ae14    # 0.39f

    .line 190
    .line 191
    .line 192
    const v16, -0x407d70a4    # -1.02f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x404b851f    # -1.41f

    .line 199
    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    const v13, -0x413851ec    # -0.39f

    .line 204
    .line 205
    .line 206
    const v15, -0x407d70a4    # -1.02f

    .line 207
    .line 208
    .line 209
    const v16, -0x413851ec    # -0.39f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x409d70a4    # 4.92f

    .line 219
    .line 220
    .line 221
    const/high16 v2, 0x40400000    # 3.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40d00000    # 6.5f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/high16 v18, -0x40800000    # -1.0f

    .line 234
    .line 235
    const v13, 0x3f0ccccd    # 0.55f

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    const/high16 v15, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const v16, -0x4119999a    # -0.45f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40800000    # -1.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, -0x40f33333    # -0.55f

    .line 251
    .line 252
    .line 253
    const v15, -0x4119999a    # -0.45f

    .line 254
    .line 255
    .line 256
    const/high16 v16, -0x40800000    # -1.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, -0x3f800000    # -4.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v18, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const v13, -0x40f33333    # -0.55f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const/high16 v15, -0x40800000    # -1.0f

    .line 273
    .line 274
    const v16, 0x3ee66666    # 0.45f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x40800000    # 4.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, 0x3f0ccccd    # 0.55f

    .line 289
    .line 290
    .line 291
    const v15, 0x3ee66666    # 0.45f

    .line 292
    .line 293
    .line 294
    const/high16 v16, 0x3f800000    # 1.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, -0x4119999a    # -0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v2, -0x40800000    # -1.0f

    .line 303
    .line 304
    const/high16 v4, 0x3f800000    # 1.0f

    .line 305
    .line 306
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x408d70a4    # 4.42f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x3ff47ae1    # 1.91f

    .line 316
    .line 317
    .line 318
    const v2, 0x3ff33333    # 1.9f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x40966666    # 4.7f

    .line 325
    .line 326
    .line 327
    const v2, 0x40e0f5c3    # 7.03f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/16 v17, 0x0

    .line 334
    .line 335
    const v18, 0x3fb47ae1    # 1.41f

    .line 336
    .line 337
    .line 338
    const v13, -0x413851ec    # -0.39f

    .line 339
    .line 340
    .line 341
    const v14, 0x3ec7ae14    # 0.39f

    .line 342
    .line 343
    .line 344
    const v15, -0x413851ec    # -0.39f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f828f5c    # 1.02f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3fb47ae1    # 1.41f

    .line 354
    .line 355
    .line 356
    const/4 v2, 0x0

    .line 357
    const v4, 0x3f828f5c    # 1.02f

    .line 358
    .line 359
    .line 360
    const v6, 0x3ec7ae14    # 0.39f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x3f35c28f    # 0.71f

    .line 367
    .line 368
    .line 369
    const v2, -0x40ca3d71    # -0.71f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3f266666    # 0.65f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x40d00000    # 6.5f

    .line 382
    .line 383
    const/high16 v18, 0x41380000    # 11.5f

    .line 384
    .line 385
    const v13, 0x40db851f    # 6.86f

    .line 386
    .line 387
    .line 388
    const v14, 0x411451ec    # 9.27f

    .line 389
    .line 390
    .line 391
    const/high16 v15, 0x40d00000    # 6.5f

    .line 392
    .line 393
    const v16, 0x412570a4    # 10.34f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40900000    # 4.5f

    .line 400
    .line 401
    const v18, 0x40ad1eb8    # 5.41f

    .line 402
    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, 0x402ccccd    # 2.7f

    .line 406
    .line 407
    .line 408
    const v15, 0x3ff851ec    # 1.94f

    .line 409
    .line 410
    .line 411
    const v16, 0x409e147b    # 4.94f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x41980000    # 19.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, -0x40800000    # -1.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, -0x40800000    # -1.0f

    .line 428
    .line 429
    const/high16 v18, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const v13, -0x40f33333    # -0.55f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const/high16 v15, -0x40800000    # -1.0f

    .line 436
    .line 437
    const v16, 0x3ee66666    # 0.45f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v13, 0x0

    .line 446
    const v14, 0x3f0ccccd    # 0.55f

    .line 447
    .line 448
    .line 449
    const v15, 0x3ee66666    # 0.45f

    .line 450
    .line 451
    .line 452
    const/high16 v16, 0x3f800000    # 1.0f

    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x3f800000    # 1.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x4119999a    # -0.45f

    .line 469
    .line 470
    .line 471
    const/high16 v2, -0x40800000    # -1.0f

    .line 472
    .line 473
    const/high16 v4, 0x3f800000    # 1.0f

    .line 474
    .line 475
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, -0x40800000    # -1.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x3f800000    # 1.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v18, -0x40800000    # -1.0f

    .line 489
    .line 490
    const v13, 0x3f0ccccd    # 0.55f

    .line 491
    .line 492
    .line 493
    const/4 v14, 0x0

    .line 494
    const/high16 v15, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const v16, -0x4119999a    # -0.45f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, -0x40800000    # -1.0f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, -0x40f33333    # -0.55f

    .line 506
    .line 507
    .line 508
    const v15, -0x4119999a    # -0.45f

    .line 509
    .line 510
    .line 511
    const/high16 v16, -0x40800000    # -1.0f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, -0x40800000    # -1.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x3ffa3d71    # -2.09f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, 0x40900000    # 4.5f

    .line 528
    .line 529
    const v18, -0x3f52e148    # -5.41f

    .line 530
    .line 531
    .line 532
    const v13, 0x4023d70a    # 2.56f

    .line 533
    .line 534
    .line 535
    const v14, -0x410f5c29    # -0.47f

    .line 536
    .line 537
    .line 538
    const/high16 v15, 0x40900000    # 4.5f

    .line 539
    .line 540
    const v16, -0x3fd28f5c    # -2.71f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, -0x4087ae14    # -0.97f

    .line 547
    .line 548
    .line 549
    const v18, -0x3fb851ec    # -3.12f

    .line 550
    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const v14, -0x406b851f    # -1.16f

    .line 554
    .line 555
    .line 556
    const v15, -0x4147ae14    # -0.36f

    .line 557
    .line 558
    .line 559
    const v16, -0x3ff147ae    # -2.23f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, -0x3f828f5c    # -3.96f

    .line 566
    .line 567
    .line 568
    const v2, 0x407e147b    # 3.97f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x40c00000    # 6.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v18, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const v14, 0x3f0ccccd    # 0.55f

    .line 584
    .line 585
    .line 586
    const v15, 0x3ee66666    # 0.45f

    .line 587
    .line 588
    .line 589
    const/high16 v16, 0x3f800000    # 1.0f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x4119999a    # -0.45f

    .line 595
    .line 596
    .line 597
    const/high16 v2, -0x40800000    # -1.0f

    .line 598
    .line 599
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x40000000    # 2.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, 0x41ac0000    # 21.5f

    .line 608
    .line 609
    const/high16 v13, 0x41b40000    # 22.5f

    .line 610
    .line 611
    const v14, 0x3fb9999a    # 1.45f

    .line 612
    .line 613
    .line 614
    const v15, 0x41b06666    # 22.05f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x41400000    # 12.0f

    .line 624
    .line 625
    const/high16 v2, 0x41700000    # 15.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 631
    .line 632
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 633
    .line 634
    const v13, -0x4008f5c3    # -1.93f

    .line 635
    .line 636
    .line 637
    const/4 v14, 0x0

    .line 638
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 639
    .line 640
    const v16, -0x40370a3d    # -1.57f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v17, 0x41400000    # 12.0f

    .line 647
    .line 648
    const/high16 v18, 0x41000000    # 8.0f

    .line 649
    .line 650
    const/high16 v13, 0x41080000    # 8.5f

    .line 651
    .line 652
    const v14, 0x41191eb8    # 9.57f

    .line 653
    .line 654
    .line 655
    const v15, 0x41211eb8    # 10.07f

    .line 656
    .line 657
    .line 658
    const/high16 v16, 0x41000000    # 8.0f

    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x3fc8f5c3    # 1.57f

    .line 664
    .line 665
    .line 666
    const/high16 v2, 0x40600000    # 3.5f

    .line 667
    .line 668
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v18, 0x41700000    # 15.0f

    .line 672
    .line 673
    const/high16 v13, 0x41780000    # 15.5f

    .line 674
    .line 675
    const v14, 0x4156e148    # 13.43f

    .line 676
    .line 677
    .line 678
    const v15, 0x415ee148    # 13.93f

    .line 679
    .line 680
    .line 681
    const/high16 v16, 0x41700000    # 15.0f

    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    const/16 v16, 0x3800

    .line 694
    .line 695
    const/16 v17, 0x0

    .line 696
    .line 697
    const/high16 v6, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const/high16 v8, 0x3f800000    # 1.0f

    .line 700
    .line 701
    const/4 v7, 0x0

    .line 702
    const/high16 v9, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/high16 v12, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v13, 0x0

    .line 707
    const/4 v14, 0x0

    .line 708
    const/4 v15, 0x0

    .line 709
    const-string v4, ""

    .line 710
    .line 711
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    sput-object v0, Landroidx/compose/material/icons/rounded/TransgenderKt;->_transgender:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 720
    .line 721
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    return-object v0
.end method

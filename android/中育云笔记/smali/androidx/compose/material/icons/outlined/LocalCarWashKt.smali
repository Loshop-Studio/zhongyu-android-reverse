.class public final Landroidx/compose/material/icons/outlined/LocalCarWashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalCarWash(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LocalCarWash"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    const/high16 v26, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v21, 0x3f547ae1    # 0.83f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 87
    .line 88
    const v24, -0x40d47ae1    # -0.67f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, -0x40400000    # -1.5f

    .line 97
    .line 98
    const v26, -0x3fd33333    # -2.7f

    .line 99
    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const/high16 v22, -0x40800000    # -1.0f

    .line 104
    .line 105
    const/high16 v23, -0x40400000    # -1.5f

    .line 106
    .line 107
    const v24, -0x3fd33333    # -2.7f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, 0x402ccccd    # 2.7f

    .line 114
    .line 115
    .line 116
    const v6, 0x3fd9999a    # 1.7f

    .line 117
    .line 118
    .line 119
    const/high16 v7, -0x40400000    # -1.5f

    .line 120
    .line 121
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 125
    .line 126
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 127
    .line 128
    const v22, 0x3f547ae1    # 0.83f

    .line 129
    .line 130
    .line 131
    const v23, 0x3f2b851f    # 0.67f

    .line 132
    .line 133
    .line 134
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x41400000    # 12.0f

    .line 143
    .line 144
    const/high16 v6, 0x40a00000    # 5.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v26, -0x40400000    # -1.5f

    .line 150
    .line 151
    const v21, 0x3f547ae1    # 0.83f

    .line 152
    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 157
    .line 158
    const v24, -0x40d47ae1    # -0.67f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, -0x40400000    # -1.5f

    .line 165
    .line 166
    const v26, -0x3fd33333    # -2.7f

    .line 167
    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    const/high16 v22, -0x40800000    # -1.0f

    .line 172
    .line 173
    const/high16 v23, -0x40400000    # -1.5f

    .line 174
    .line 175
    const v24, -0x3fd33333    # -2.7f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, 0x402ccccd    # 2.7f

    .line 182
    .line 183
    .line 184
    const v6, 0x3fd9999a    # 1.7f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 191
    .line 192
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 193
    .line 194
    const v22, 0x3f547ae1    # 0.83f

    .line 195
    .line 196
    .line 197
    const v23, 0x3f2b851f    # 0.67f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x40e00000    # 7.0f

    .line 209
    .line 210
    const/high16 v6, 0x40a00000    # 5.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v26, -0x40400000    # -1.5f

    .line 216
    .line 217
    const v21, 0x3f547ae1    # 0.83f

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 223
    .line 224
    const v24, -0x40d47ae1    # -0.67f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, 0x40e00000    # 7.0f

    .line 231
    .line 232
    const v26, 0x3f4ccccd    # 0.8f

    .line 233
    .line 234
    .line 235
    const/high16 v21, 0x41080000    # 8.5f

    .line 236
    .line 237
    const/high16 v22, 0x40200000    # 2.5f

    .line 238
    .line 239
    const/high16 v23, 0x40e00000    # 7.0f

    .line 240
    .line 241
    const v24, 0x3f4ccccd    # 0.8f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x40200000    # 2.5f

    .line 248
    .line 249
    const/high16 v6, 0x40600000    # 3.5f

    .line 250
    .line 251
    const/high16 v7, 0x40b00000    # 5.5f

    .line 252
    .line 253
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v26, 0x40a00000    # 5.0f

    .line 257
    .line 258
    const/high16 v21, 0x40b00000    # 5.5f

    .line 259
    .line 260
    const v22, 0x408a8f5c    # 4.33f

    .line 261
    .line 262
    .line 263
    const v23, 0x40c570a4    # 6.17f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x40a00000    # 5.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, 0x41975c29    # 18.92f

    .line 275
    .line 276
    .line 277
    const v6, 0x410028f6    # 8.01f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x418c0000    # 17.5f

    .line 284
    .line 285
    const/high16 v26, 0x40e00000    # 7.0f

    .line 286
    .line 287
    const v21, 0x4195c28f    # 18.72f

    .line 288
    .line 289
    .line 290
    const v22, 0x40ed70a4    # 7.42f

    .line 291
    .line 292
    .line 293
    const v23, 0x419147ae    # 18.16f

    .line 294
    .line 295
    .line 296
    const/high16 v24, 0x40e00000    # 7.0f

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v25, -0x404a3d71    # -1.42f

    .line 307
    .line 308
    .line 309
    const v26, 0x3f8147ae    # 1.01f

    .line 310
    .line 311
    .line 312
    const v21, -0x40d70a3d    # -0.66f

    .line 313
    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    const v23, -0x40651eb8    # -1.21f

    .line 318
    .line 319
    .line 320
    const v24, 0x3ed70a3d    # 0.42f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x41600000    # 14.0f

    .line 327
    .line 328
    const/high16 v6, 0x40400000    # 3.0f

    .line 329
    .line 330
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x41000000    # 8.0f

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v26, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/16 v21, 0x0

    .line 343
    .line 344
    const v22, 0x3f0ccccd    # 0.55f

    .line 345
    .line 346
    .line 347
    const v23, 0x3ee66666    # 0.45f

    .line 348
    .line 349
    .line 350
    const/high16 v24, 0x3f800000    # 1.0f

    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x3f800000    # 1.0f

    .line 356
    .line 357
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v26, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v21, 0x3f0ccccd    # 0.55f

    .line 363
    .line 364
    .line 365
    const/16 v22, 0x0

    .line 366
    .line 367
    const/high16 v23, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const v24, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, -0x40800000    # -1.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41400000    # 12.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x3f800000    # 1.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v26, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const v22, 0x3f0ccccd    # 0.55f

    .line 395
    .line 396
    .line 397
    const v23, 0x3ee66666    # 0.45f

    .line 398
    .line 399
    .line 400
    const/high16 v24, 0x3f800000    # 1.0f

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v26, -0x40800000    # -1.0f

    .line 409
    .line 410
    const v21, 0x3f0ccccd    # 0.55f

    .line 411
    .line 412
    .line 413
    const/16 v22, 0x0

    .line 414
    .line 415
    const/high16 v23, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const v24, -0x4119999a    # -0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, -0x3f000000    # -8.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v4, -0x3ffae148    # -2.08f

    .line 429
    .line 430
    .line 431
    const v6, -0x3f4051ec    # -5.99f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x40db3333    # 6.85f

    .line 441
    .line 442
    .line 443
    const/high16 v6, 0x41100000    # 9.0f

    .line 444
    .line 445
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v4, 0x4124a3d7    # 10.29f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, 0x3f851eb8    # 1.04f

    .line 455
    .line 456
    .line 457
    const/high16 v6, 0x40400000    # 3.0f

    .line 458
    .line 459
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v4, 0x40b9eb85    # 5.81f

    .line 463
    .line 464
    .line 465
    const/high16 v6, 0x41400000    # 12.0f

    .line 466
    .line 467
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 471
    .line 472
    const v6, 0x3f851eb8    # 1.04f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x41980000    # 19.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v4, 0x40a00000    # 5.0f

    .line 487
    .line 488
    const/high16 v6, 0x41980000    # 19.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v4, -0x3f6ae148    # -4.66f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v4, 0x3df5c28f    # 0.12f

    .line 500
    .line 501
    .line 502
    const v6, -0x4151eb85    # -0.34f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v4, 0x415c51ec    # 13.77f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x3de147ae    # 0.11f

    .line 515
    .line 516
    .line 517
    const v6, 0x3eae147b    # 0.34f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x41980000    # 19.0f

    .line 524
    .line 525
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/16 v16, 0x3800

    .line 536
    .line 537
    const/16 v17, 0x0

    .line 538
    .line 539
    const/high16 v6, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v8, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v7, 0x0

    .line 544
    const/high16 v9, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/high16 v12, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const/4 v14, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    const-string v4, ""

    .line 552
    .line 553
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 554
    .line 555
    .line 556
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 561
    .line 562
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 563
    .line 564
    .line 565
    move-result-wide v6

    .line 566
    const/4 v2, 0x0

    .line 567
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 575
    .line 576
    .line 577
    move-result v11

    .line 578
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x40f00000    # 7.5f

    .line 584
    .line 585
    const/high16 v6, 0x41840000    # 16.5f

    .line 586
    .line 587
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/4 v4, 0x0

    .line 591
    const/high16 v6, -0x40400000    # -1.5f

    .line 592
    .line 593
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v26, 0x40400000    # 3.0f

    .line 597
    .line 598
    const/16 v27, 0x0

    .line 599
    .line 600
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 603
    .line 604
    const/16 v23, 0x0

    .line 605
    .line 606
    const/16 v24, 0x1

    .line 607
    .line 608
    const/16 v25, 0x1

    .line 609
    .line 610
    move-object/from16 v20, v2

    .line 611
    .line 612
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 616
    .line 617
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    const/high16 v6, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    const-string v4, ""

    .line 628
    .line 629
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 630
    .line 631
    .line 632
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 637
    .line 638
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 639
    .line 640
    .line 641
    move-result-wide v6

    .line 642
    const/4 v0, 0x0

    .line 643
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 647
    .line 648
    .line 649
    move-result v10

    .line 650
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 651
    .line 652
    .line 653
    move-result v11

    .line 654
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41840000    # 16.5f

    .line 660
    .line 661
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/4 v0, 0x0

    .line 665
    const/high16 v2, -0x40400000    # -1.5f

    .line 666
    .line 667
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v18, 0x40400000    # 3.0f

    .line 671
    .line 672
    const/16 v19, 0x0

    .line 673
    .line 674
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 675
    .line 676
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 677
    .line 678
    const/16 v16, 0x1

    .line 679
    .line 680
    const/16 v17, 0x1

    .line 681
    .line 682
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 686
    .line 687
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/16 v16, 0x3800

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v12, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const/4 v14, 0x0

    .line 705
    const-string v4, ""

    .line 706
    .line 707
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    sput-object v0, Landroidx/compose/material/icons/outlined/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    return-object v0
.end method

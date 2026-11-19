.class public final Landroidx/compose/material/icons/filled/LocalCarWashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalCarWash(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LocalCarWash"

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
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    const/high16 v18, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v13, 0x3f547ae1    # 0.83f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 86
    .line 87
    const v16, -0x40d47ae1    # -0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x40400000    # -1.5f

    .line 94
    .line 95
    const v18, -0x3fd33333    # -2.7f

    .line 96
    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const/high16 v14, -0x40800000    # -1.0f

    .line 100
    .line 101
    const/high16 v15, -0x40400000    # -1.5f

    .line 102
    .line 103
    const v16, -0x3fd33333    # -2.7f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x402ccccd    # 2.7f

    .line 110
    .line 111
    .line 112
    const v2, 0x3fd9999a    # 1.7f

    .line 113
    .line 114
    .line 115
    const/high16 v4, -0x40400000    # -1.5f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 121
    .line 122
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 123
    .line 124
    const v14, 0x3f547ae1    # 0.83f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f2b851f    # 0.67f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41400000    # 12.0f

    .line 139
    .line 140
    const/high16 v2, 0x40a00000    # 5.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v18, -0x40400000    # -1.5f

    .line 146
    .line 147
    const v13, 0x3f547ae1    # 0.83f

    .line 148
    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 152
    .line 153
    const v16, -0x40d47ae1    # -0.67f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, -0x40400000    # -1.5f

    .line 160
    .line 161
    const v18, -0x3fd33333    # -2.7f

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/high16 v14, -0x40800000    # -1.0f

    .line 166
    .line 167
    const/high16 v15, -0x40400000    # -1.5f

    .line 168
    .line 169
    const v16, -0x3fd33333    # -2.7f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x402ccccd    # 2.7f

    .line 176
    .line 177
    .line 178
    const v2, 0x3fd9999a    # 1.7f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 185
    .line 186
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 187
    .line 188
    const v14, 0x3f547ae1    # 0.83f

    .line 189
    .line 190
    .line 191
    const v15, 0x3f2b851f    # 0.67f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x40e00000    # 7.0f

    .line 203
    .line 204
    const/high16 v2, 0x40a00000    # 5.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v18, -0x40400000    # -1.5f

    .line 210
    .line 211
    const v13, 0x3f547ae1    # 0.83f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 216
    .line 217
    const v16, -0x40d47ae1    # -0.67f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x40e00000    # 7.0f

    .line 224
    .line 225
    const v18, 0x3f4ccccd    # 0.8f

    .line 226
    .line 227
    .line 228
    const/high16 v13, 0x41080000    # 8.5f

    .line 229
    .line 230
    const/high16 v14, 0x40200000    # 2.5f

    .line 231
    .line 232
    const/high16 v15, 0x40e00000    # 7.0f

    .line 233
    .line 234
    const v16, 0x3f4ccccd    # 0.8f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40200000    # 2.5f

    .line 241
    .line 242
    const/high16 v2, 0x40600000    # 3.5f

    .line 243
    .line 244
    const/high16 v4, 0x40b00000    # 5.5f

    .line 245
    .line 246
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v18, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const/high16 v13, 0x40b00000    # 5.5f

    .line 252
    .line 253
    const v14, 0x408a8f5c    # 4.33f

    .line 254
    .line 255
    .line 256
    const v15, 0x40c570a4    # 6.17f

    .line 257
    .line 258
    .line 259
    const/high16 v16, 0x40a00000    # 5.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x41975c29    # 18.92f

    .line 268
    .line 269
    .line 270
    const v2, 0x410028f6    # 8.01f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x418c0000    # 17.5f

    .line 277
    .line 278
    const/high16 v18, 0x40e00000    # 7.0f

    .line 279
    .line 280
    const v13, 0x4195c28f    # 18.72f

    .line 281
    .line 282
    .line 283
    const v14, 0x40ed70a4    # 7.42f

    .line 284
    .line 285
    .line 286
    const v15, 0x419147ae    # 18.16f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x40e00000    # 7.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x404a3d71    # -1.42f

    .line 300
    .line 301
    .line 302
    const v18, 0x3f8147ae    # 1.01f

    .line 303
    .line 304
    .line 305
    const v13, -0x40d70a3d    # -0.66f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, -0x40651eb8    # -1.21f

    .line 310
    .line 311
    .line 312
    const v16, 0x3ed70a3d    # 0.42f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40400000    # 3.0f

    .line 319
    .line 320
    const/high16 v2, 0x41600000    # 14.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x41000000    # 8.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v18, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, 0x3f0ccccd    # 0.55f

    .line 336
    .line 337
    .line 338
    const v15, 0x3ee66666    # 0.45f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x3f800000    # 1.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x3f800000    # 1.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v18, -0x40800000    # -1.0f

    .line 352
    .line 353
    const v13, 0x3f0ccccd    # 0.55f

    .line 354
    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    const/high16 v15, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const v16, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, -0x40800000    # -1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v18, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const v14, 0x3f0ccccd    # 0.55f

    .line 384
    .line 385
    .line 386
    const v15, 0x3ee66666    # 0.45f

    .line 387
    .line 388
    .line 389
    const/high16 v16, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v18, -0x40800000    # -1.0f

    .line 398
    .line 399
    const v13, 0x3f0ccccd    # 0.55f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const/high16 v15, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const v16, -0x4119999a    # -0.45f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, -0x3f000000    # -8.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, -0x3ffae148    # -2.08f

    .line 417
    .line 418
    .line 419
    const v2, -0x3f4051ec    # -5.99f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x40d00000    # 6.5f

    .line 429
    .line 430
    const/high16 v2, 0x41900000    # 18.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, -0x40400000    # -1.5f

    .line 436
    .line 437
    const/high16 v18, -0x40400000    # -1.5f

    .line 438
    .line 439
    const v13, -0x40ab851f    # -0.83f

    .line 440
    .line 441
    .line 442
    const/high16 v15, -0x40400000    # -1.5f

    .line 443
    .line 444
    const v16, -0x40d47ae1    # -0.67f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x40b570a4    # 5.67f

    .line 451
    .line 452
    .line 453
    const/high16 v2, 0x41700000    # 15.0f

    .line 454
    .line 455
    const/high16 v4, 0x40d00000    # 6.5f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f2b851f    # 0.67f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40ea8f5c    # 7.33f

    .line 469
    .line 470
    .line 471
    const/high16 v2, 0x40d00000    # 6.5f

    .line 472
    .line 473
    const/high16 v4, 0x41900000    # 18.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x418c0000    # 17.5f

    .line 482
    .line 483
    const/high16 v2, 0x41900000    # 18.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x3f2b851f    # 0.67f

    .line 492
    .line 493
    .line 494
    const/high16 v2, -0x40400000    # -1.5f

    .line 495
    .line 496
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 502
    .line 503
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x40d47ae1    # -0.67f

    .line 507
    .line 508
    .line 509
    const/high16 v2, -0x40400000    # -1.5f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41500000    # 13.0f

    .line 518
    .line 519
    const/high16 v2, 0x40a00000    # 5.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, -0x3f700000    # -4.5f

    .line 525
    .line 526
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 527
    .line 528
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x41300000    # 11.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41980000    # 19.0f

    .line 537
    .line 538
    const/high16 v2, 0x41500000    # 13.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41500000    # 13.0f

    .line 544
    .line 545
    const/high16 v2, 0x40a00000    # 5.0f

    .line 546
    .line 547
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    const/16 v16, 0x3800

    .line 558
    .line 559
    const/16 v17, 0x0

    .line 560
    .line 561
    const/high16 v6, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/high16 v8, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v7, 0x0

    .line 566
    const/high16 v9, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v12, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const/4 v15, 0x0

    .line 572
    const-string v4, ""

    .line 573
    .line 574
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    sput-object v0, Landroidx/compose/material/icons/filled/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 583
    .line 584
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    return-object v0
.end method

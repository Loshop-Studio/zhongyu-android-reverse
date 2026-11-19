.class public final Landroidx/compose/material/icons/outlined/ExtensionOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExtensionOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ExtensionOff"

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
    const v0, 0x40870a3d    # 4.22f

    .line 71
    .line 72
    .line 73
    const v2, 0x3fb1eb85    # 1.39f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fcf5c29    # 1.62f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x43dc28f6    # -0.01f

    .line 86
    .line 87
    .line 88
    const v18, 0x3e23d70a    # 0.16f

    .line 89
    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const v14, 0x3d4ccccd    # 0.05f

    .line 93
    .line 94
    .line 95
    const v15, -0x43dc28f6    # -0.01f

    .line 96
    .line 97
    .line 98
    const v16, 0x3dcccccd    # 0.1f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x40733333    # 3.8f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, 0x40c00000    # 6.0f

    .line 111
    .line 112
    const/high16 v18, 0x41480000    # 12.5f

    .line 113
    .line 114
    const v13, 0x40b66666    # 5.7f

    .line 115
    .line 116
    .line 117
    const v14, 0x411ccccd    # 9.8f

    .line 118
    .line 119
    .line 120
    const/high16 v15, 0x40c00000    # 6.0f

    .line 121
    .line 122
    const v16, 0x413f5c29    # 11.96f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 129
    .line 130
    const v18, 0x402ccccd    # 2.7f

    .line 131
    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3f0a3d71    # 0.54f

    .line 135
    .line 136
    .line 137
    const v15, -0x416b851f    # -0.29f

    .line 138
    .line 139
    .line 140
    const v16, 0x402ccccd    # 2.7f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x41980000    # 19.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x40000000    # 2.0f

    .line 152
    .line 153
    const/high16 v18, 0x40000000    # 2.0f

    .line 154
    .line 155
    const v14, 0x3f8ccccd    # 1.1f

    .line 156
    .line 157
    .line 158
    const v15, 0x3f666666    # 0.9f

    .line 159
    .line 160
    .line 161
    const/high16 v16, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x40733333    # 3.8f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x402ccccd    # 2.7f

    .line 173
    .line 174
    .line 175
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 176
    .line 177
    const v14, -0x3fd28f5c    # -2.71f

    .line 178
    .line 179
    .line 180
    const v15, 0x400a3d71    # 2.16f

    .line 181
    .line 182
    .line 183
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v18, 0x40400000    # 3.0f

    .line 189
    .line 190
    const v13, 0x3f0a3d71    # 0.54f

    .line 191
    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    const v15, 0x402ccccd    # 2.7f

    .line 195
    .line 196
    .line 197
    const v16, 0x3e947ae1    # 0.29f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41900000    # 18.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x3e23d70a    # 0.16f

    .line 209
    .line 210
    .line 211
    const v18, -0x43dc28f6    # -0.01f

    .line 212
    .line 213
    .line 214
    const v13, 0x3d75c28f    # 0.06f

    .line 215
    .line 216
    .line 217
    const v15, 0x3de147ae    # 0.11f

    .line 218
    .line 219
    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3fce147b    # 1.61f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x3fb47ae1    # 1.41f

    .line 232
    .line 233
    .line 234
    const v2, -0x404b851f    # -1.41f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x4033d70a    # 2.81f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x40870a3d    # 4.22f

    .line 247
    .line 248
    .line 249
    const v2, 0x3fb1eb85    # 1.39f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x41380000    # 11.5f

    .line 259
    .line 260
    const/high16 v2, 0x41800000    # 16.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x3f7428f6    # -4.37f

    .line 266
    .line 267
    .line 268
    const/high16 v18, 0x40400000    # 3.0f

    .line 269
    .line 270
    const/high16 v13, -0x40400000    # -1.5f

    .line 271
    .line 272
    const v15, -0x3f9b851f    # -3.57f

    .line 273
    .line 274
    .line 275
    const v16, 0x3f547ae1    # 0.83f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40a00000    # 5.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3ff7ae14    # -2.13f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x40400000    # 3.0f

    .line 293
    .line 294
    const v18, -0x3f7428f6    # -4.37f

    .line 295
    .line 296
    .line 297
    const v13, 0x400ae148    # 2.17f

    .line 298
    .line 299
    .line 300
    const v14, -0x40b33333    # -0.8f

    .line 301
    .line 302
    .line 303
    const/high16 v15, 0x40400000    # 3.0f

    .line 304
    .line 305
    const v16, -0x3fc851ec    # -2.87f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x40eb851f    # -0.58f

    .line 312
    .line 313
    .line 314
    const/high16 v18, -0x3ff00000    # -2.25f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, -0x40cf5c29    # -0.69f

    .line 318
    .line 319
    .line 320
    const v15, -0x41c7ae14    # -0.18f

    .line 321
    .line 322
    .line 323
    const/high16 v16, -0x40400000    # -1.5f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x40ca8f5c    # 6.33f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, 0x41380000    # 11.5f

    .line 335
    .line 336
    const/high16 v18, 0x41800000    # 16.0f

    .line 337
    .line 338
    const/high16 v13, 0x41500000    # 13.0f

    .line 339
    .line 340
    const v14, 0x418170a4    # 16.18f

    .line 341
    .line 342
    .line 343
    const v15, 0x41430a3d    # 12.19f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x41800000    # 16.0f

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 355
    .line 356
    const v2, 0x410d47ae    # 8.83f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, -0x40000000    # -2.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41100000    # 9.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x40200000    # 2.5f

    .line 373
    .line 374
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, -0x404f5c29    # -1.38f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f8f5c29    # 1.12f

    .line 381
    .line 382
    .line 383
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4027ae14    # 2.62f

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x41600000    # 14.0f

    .line 392
    .line 393
    const/high16 v4, 0x40800000    # 4.0f

    .line 394
    .line 395
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40800000    # 4.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x40000000    # 2.0f

    .line 404
    .line 405
    const/high16 v18, 0x40000000    # 2.0f

    .line 406
    .line 407
    const v13, 0x3f8ccccd    # 1.1f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const/high16 v15, 0x40000000    # 2.0f

    .line 412
    .line 413
    const v16, 0x3f666666    # 0.9f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, 0x40200000    # 2.5f

    .line 423
    .line 424
    const/high16 v18, 0x40200000    # 2.5f

    .line 425
    .line 426
    const v13, 0x3fb0a3d7    # 1.38f

    .line 427
    .line 428
    .line 429
    const/high16 v15, 0x40200000    # 2.5f

    .line 430
    .line 431
    const v16, 0x3f8f5c29    # 1.12f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x41ab0a3d    # 21.38f

    .line 438
    .line 439
    .line 440
    const/high16 v2, 0x41a00000    # 20.0f

    .line 441
    .line 442
    const/high16 v4, 0x41700000    # 15.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x400ae148    # 2.17f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, -0x40000000    # -2.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41500000    # 13.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x40000000    # 2.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x3f000000    # 0.5f

    .line 469
    .line 470
    const/high16 v18, -0x41000000    # -0.5f

    .line 471
    .line 472
    const v13, 0x3e8f5c29    # 0.28f

    .line 473
    .line 474
    .line 475
    const/high16 v15, 0x3f000000    # 0.5f

    .line 476
    .line 477
    const v16, -0x419eb852    # -0.22f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x41a23d71    # 20.28f

    .line 484
    .line 485
    .line 486
    const/high16 v2, 0x41400000    # 12.0f

    .line 487
    .line 488
    const/high16 v4, 0x41a00000    # 20.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x40000000    # -2.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40c00000    # 6.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, -0x3f400000    # -6.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x40800000    # 4.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, -0x41000000    # -0.5f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    const v14, -0x4170a3d7    # -0.28f

    .line 517
    .line 518
    .line 519
    const v15, -0x419eb852    # -0.22f

    .line 520
    .line 521
    .line 522
    const/high16 v16, -0x41000000    # -0.5f

    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x406e147b    # 3.72f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x41300000    # 11.0f

    .line 531
    .line 532
    const/high16 v4, 0x40800000    # 4.0f

    .line 533
    .line 534
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x410d47ae    # 8.83f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/outlined/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/SubscriptKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _subscript:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSubscript(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SubscriptKt;->_subscript:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Subscript"

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
    const v0, 0x412bae14    # 10.73f

    .line 71
    .line 72
    .line 73
    const v2, 0x412851ec    # 10.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40e9999a    # 7.3f

    .line 80
    .line 81
    .line 82
    const v2, 0x40b70a3d    # 5.72f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x4103ae14    # 8.23f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v13, 0x40da3d71    # 6.82f

    .line 94
    .line 95
    .line 96
    const v14, 0x409f0a3d    # 4.97f

    .line 97
    .line 98
    .line 99
    const v15, 0x40eb3333    # 7.35f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f733333    # 0.95f

    .line 112
    .line 113
    .line 114
    const v18, 0x3f07ae14    # 0.53f

    .line 115
    .line 116
    .line 117
    const v13, 0x3ec7ae14    # 0.39f

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const v15, 0x3f3d70a4    # 0.74f

    .line 122
    .line 123
    .line 124
    const v16, 0x3e4ccccd    # 0.2f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x4030a3d7    # 2.76f

    .line 131
    .line 132
    .line 133
    const v2, 0x408eb852    # 4.46f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x3df5c28f    # 0.12f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x402f5c29    # 2.74f

    .line 146
    .line 147
    .line 148
    const v2, -0x3f71999a    # -4.45f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x417c28f6    # 15.76f

    .line 155
    .line 156
    .line 157
    const/high16 v18, 0x40800000    # 4.0f

    .line 158
    .line 159
    const v13, 0x417028f6    # 15.01f

    .line 160
    .line 161
    .line 162
    const v14, 0x40866666    # 4.2f

    .line 163
    .line 164
    .line 165
    const v15, 0x4175eb85    # 15.37f

    .line 166
    .line 167
    .line 168
    const/high16 v16, 0x40800000    # 4.0f

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/4 v0, 0x0

    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f70a3d7    # 0.94f

    .line 178
    .line 179
    .line 180
    const v18, 0x3fdc28f6    # 1.72f

    .line 181
    .line 182
    .line 183
    const v13, 0x3f6147ae    # 0.88f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const v15, 0x3fb5c28f    # 1.42f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f7ae148    # 0.98f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, -0x3fb147ae    # -3.23f

    .line 197
    .line 198
    .line 199
    const/high16 v2, 0x40a00000    # 5.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x40633333    # 3.55f

    .line 205
    .line 206
    .line 207
    const v2, 0x40b1999a    # 5.55f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x4180a3d7    # 16.08f

    .line 214
    .line 215
    .line 216
    const/high16 v18, 0x41900000    # 18.0f

    .line 217
    .line 218
    const/high16 v13, 0x418c0000    # 17.5f

    .line 219
    .line 220
    const v14, 0x418828f6    # 17.02f

    .line 221
    .line 222
    .line 223
    const v15, 0x4187ae14    # 16.96f

    .line 224
    .line 225
    .line 226
    const/high16 v16, 0x41900000    # 18.0f

    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x408ccccd    # -0.95f

    .line 236
    .line 237
    .line 238
    const v18, -0x40fae148    # -0.52f

    .line 239
    .line 240
    .line 241
    const v13, -0x413d70a4    # -0.38f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, -0x40c28f5c    # -0.74f

    .line 246
    .line 247
    .line 248
    const v16, -0x41b33333    # -0.2f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x3f63851f    # -4.89f

    .line 255
    .line 256
    .line 257
    const v2, -0x3fbb851f    # -3.07f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x420a3d71    # -0.12f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x409c7ae1    # 4.89f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x40fd70a4    # 7.92f

    .line 276
    .line 277
    .line 278
    const/high16 v18, 0x41900000    # 18.0f

    .line 279
    .line 280
    const v13, 0x410ab852    # 8.67f

    .line 281
    .line 282
    .line 283
    const v14, 0x418e6666    # 17.8f

    .line 284
    .line 285
    .line 286
    const v15, 0x4104f5c3    # 8.31f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x41900000    # 18.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x408f5c29    # -0.94f

    .line 299
    .line 300
    .line 301
    const v18, -0x4023d70a    # -1.72f

    .line 302
    .line 303
    .line 304
    const v13, -0x409eb852    # -0.88f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const v15, -0x404a3d71    # -1.42f

    .line 309
    .line 310
    .line 311
    const v16, -0x4087ae14    # -0.97f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x412bae14    # 10.73f

    .line 318
    .line 319
    .line 320
    const v2, 0x412851ec    # 10.52f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x419c0000    # 19.5f

    .line 330
    .line 331
    const/high16 v2, 0x41b80000    # 23.0f

    .line 332
    .line 333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, -0x41000000    # -0.5f

    .line 340
    .line 341
    const/high16 v18, -0x41000000    # -0.5f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const v14, -0x4170a3d7    # -0.28f

    .line 345
    .line 346
    .line 347
    const v15, -0x419eb852    # -0.22f

    .line 348
    .line 349
    .line 350
    const/high16 v16, -0x41000000    # -0.5f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const/16 v18, 0x0

    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41a00000    # 20.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40000000    # 2.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v18, -0x40800000    # -1.0f

    .line 384
    .line 385
    const v13, 0x3f0ccccd    # 0.55f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const v16, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, -0x40800000    # -1.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, -0x40800000    # -1.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x40f33333    # -0.55f

    .line 405
    .line 406
    .line 407
    const v15, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v16, -0x40800000    # -1.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, -0x41000000    # -0.5f

    .line 421
    .line 422
    const/high16 v18, 0x3f000000    # 0.5f

    .line 423
    .line 424
    const v13, -0x4170a3d7    # -0.28f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, -0x41000000    # -0.5f

    .line 429
    .line 430
    const v16, 0x3e6147ae    # 0.22f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/4 v0, 0x0

    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, 0x3f000000    # 0.5f

    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, 0x3e8f5c29    # 0.28f

    .line 444
    .line 445
    .line 446
    const v15, 0x3e6147ae    # 0.22f

    .line 447
    .line 448
    .line 449
    const/high16 v16, 0x3f000000    # 0.5f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41b00000    # 22.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x3f800000    # 1.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, -0x40000000    # -2.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x40800000    # -1.0f

    .line 470
    .line 471
    const/high16 v18, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const v13, -0x40f33333    # -0.55f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const/high16 v15, -0x40800000    # -1.0f

    .line 478
    .line 479
    const v16, 0x3ee66666    # 0.45f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x3f800000    # 1.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, 0x3f0ccccd    # 0.55f

    .line 494
    .line 495
    .line 496
    const v15, 0x3ee66666    # 0.45f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x3f800000    # 1.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x40200000    # 2.5f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, 0x41b80000    # 23.0f

    .line 510
    .line 511
    const/high16 v18, 0x419c0000    # 19.5f

    .line 512
    .line 513
    const v13, 0x41b63d71    # 22.78f

    .line 514
    .line 515
    .line 516
    const/high16 v14, 0x41a00000    # 20.0f

    .line 517
    .line 518
    const/high16 v15, 0x41b80000    # 23.0f

    .line 519
    .line 520
    const v16, 0x419e3d71    # 19.78f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v9, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v14, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    const-string v4, ""

    .line 550
    .line 551
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, Landroidx/compose/material/icons/rounded/SubscriptKt;->_subscript:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-object v0
.end method

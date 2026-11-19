.class public final Landroidx/compose/material/icons/rounded/ChaletKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _chalet:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChalet(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ChaletKt;->_chalet:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Chalet"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40c00000    # 6.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v18, -0x40800000    # -1.0f

    .line 104
    .line 105
    const v16, -0x4119999a    # -0.45f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, -0x3f951eb8    # -3.67f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x413d70a4    # -0.38f

    .line 118
    .line 119
    .line 120
    const v2, 0x3ec28f5c    # 0.38f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, -0x404b851f    # -1.41f

    .line 127
    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const v13, -0x413851ec    # -0.39f

    .line 132
    .line 133
    .line 134
    const v14, 0x3ec7ae14    # 0.39f

    .line 135
    .line 136
    .line 137
    const v15, -0x407d70a4    # -1.02f

    .line 138
    .line 139
    .line 140
    const v16, 0x3ec7ae14    # 0.39f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const v18, -0x404b851f    # -1.41f

    .line 153
    .line 154
    .line 155
    const v14, -0x413851ec    # -0.39f

    .line 156
    .line 157
    .line 158
    const v15, -0x413851ec    # -0.39f

    .line 159
    .line 160
    .line 161
    const v16, -0x407d70a4    # -1.02f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x3f3d1eb8    # -6.09f

    .line 168
    .line 169
    .line 170
    const v2, 0x40c2e148    # 6.09f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3fb47ae1    # 1.41f

    .line 177
    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const v13, 0x3ec7ae14    # 0.39f

    .line 182
    .line 183
    .line 184
    const v15, 0x3f828f5c    # 1.02f

    .line 185
    .line 186
    .line 187
    const v16, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x40c2e148    # 6.09f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const v18, 0x3fb47ae1    # 1.41f

    .line 202
    .line 203
    .line 204
    const v14, 0x3ec7ae14    # 0.39f

    .line 205
    .line 206
    .line 207
    const v15, 0x3ec7ae14    # 0.39f

    .line 208
    .line 209
    .line 210
    const v16, 0x3f828f5c    # 1.02f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x404b851f    # -1.41f

    .line 221
    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const v13, -0x413851ec    # -0.39f

    .line 226
    .line 227
    .line 228
    const v15, -0x407d70a4    # -1.02f

    .line 229
    .line 230
    .line 231
    const v16, 0x3ec7ae14    # 0.39f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x417547ae    # 15.33f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x41700000    # 15.0f

    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41980000    # 19.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x40800000    # -1.0f

    .line 251
    .line 252
    const/high16 v18, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const v14, 0x3f0ccccd    # 0.55f

    .line 256
    .line 257
    .line 258
    const v15, -0x4119999a    # -0.45f

    .line 259
    .line 260
    .line 261
    const/high16 v16, 0x3f800000    # 1.0f

    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, -0x3f800000    # -4.0f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x41200000    # 10.0f

    .line 277
    .line 278
    const/high16 v18, 0x41700000    # 15.0f

    .line 279
    .line 280
    const/high16 v13, 0x41300000    # 11.0f

    .line 281
    .line 282
    const v14, 0x41773333    # 15.45f

    .line 283
    .line 284
    .line 285
    const v15, 0x4128cccd    # 10.55f

    .line 286
    .line 287
    .line 288
    const/high16 v16, 0x41700000    # 15.0f

    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x418c0000    # 17.5f

    .line 297
    .line 298
    const/high16 v2, 0x40f00000    # 7.5f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3f63d70a    # 0.89f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x4075c28f    # -1.08f

    .line 310
    .line 311
    .line 312
    const v2, 0x3f8a3d71    # 1.08f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x42b33333    # -0.05f

    .line 319
    .line 320
    .line 321
    const v18, 0x3f30a3d7    # 0.69f

    .line 322
    .line 323
    .line 324
    const v13, -0x41c7ae14    # -0.18f

    .line 325
    .line 326
    .line 327
    const v14, 0x3e3851ec    # 0.18f

    .line 328
    .line 329
    .line 330
    const v15, -0x41a8f5c3    # -0.21f

    .line 331
    .line 332
    .line 333
    const v16, 0x3ef5c28f    # 0.48f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f3d70a4    # 0.74f

    .line 340
    .line 341
    .line 342
    const v18, 0x3d23d70a    # 0.04f

    .line 343
    .line 344
    .line 345
    const v13, 0x3e428f5c    # 0.19f

    .line 346
    .line 347
    .line 348
    const v14, 0x3e6b851f    # 0.23f

    .line 349
    .line 350
    .line 351
    const v15, 0x3f07ae14    # 0.53f

    .line 352
    .line 353
    .line 354
    const v16, 0x3e75c28f    # 0.24f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x413851ec    # -0.39f

    .line 361
    .line 362
    .line 363
    const v2, 0x3ec7ae14    # 0.39f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3f30a3d7    # 0.69f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, 0x3f000000    # 0.5f

    .line 376
    .line 377
    const/high16 v18, 0x3f000000    # 0.5f

    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    const v14, 0x3e8f5c29    # 0.28f

    .line 381
    .line 382
    .line 383
    const v15, 0x3e6147ae    # 0.22f

    .line 384
    .line 385
    .line 386
    const/high16 v16, 0x3f000000    # 0.5f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v18, -0x41000000    # -0.5f

    .line 396
    .line 397
    const v13, 0x3e8f5c29    # 0.28f

    .line 398
    .line 399
    .line 400
    const/4 v14, 0x0

    .line 401
    const/high16 v15, 0x3f000000    # 0.5f

    .line 402
    .line 403
    const v16, -0x419eb852    # -0.22f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x411cf5c3    # 9.81f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x3ec7ae14    # 0.39f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3f3d70a4    # 0.74f

    .line 422
    .line 423
    .line 424
    const v18, -0x42dc28f6    # -0.04f

    .line 425
    .line 426
    .line 427
    const v13, 0x3e570a3d    # 0.21f

    .line 428
    .line 429
    .line 430
    const v14, 0x3e570a3d    # 0.21f

    .line 431
    .line 432
    .line 433
    const v15, 0x3f0ccccd    # 0.55f

    .line 434
    .line 435
    .line 436
    const v16, 0x3e428f5c    # 0.19f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x42b33333    # -0.05f

    .line 443
    .line 444
    .line 445
    const v18, -0x40cf5c29    # -0.69f

    .line 446
    .line 447
    .line 448
    const v13, 0x3e2e147b    # 0.17f

    .line 449
    .line 450
    .line 451
    const v14, -0x41b33333    # -0.2f

    .line 452
    .line 453
    .line 454
    const v15, 0x3e0f5c29    # 0.14f

    .line 455
    .line 456
    .line 457
    const/high16 v16, -0x41000000    # -0.5f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x41063d71    # 8.39f

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x41940000    # 18.5f

    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const v18, -0x409c28f6    # -0.89f

    .line 473
    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v15, 0x0

    .line 478
    const v16, -0x409c28f6    # -0.89f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x3f63d70a    # 0.89f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x3f8a3d71    # 1.08f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3f30a3d7    # 0.69f

    .line 497
    .line 498
    .line 499
    const v18, 0x3d4ccccd    # 0.05f

    .line 500
    .line 501
    .line 502
    const v13, 0x3e3851ec    # 0.18f

    .line 503
    .line 504
    .line 505
    const v14, 0x3e3851ec    # 0.18f

    .line 506
    .line 507
    .line 508
    const v15, 0x3ef5c28f    # 0.48f

    .line 509
    .line 510
    .line 511
    const v16, 0x3e570a3d    # 0.21f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x3d23d70a    # 0.04f

    .line 518
    .line 519
    .line 520
    const v18, -0x40c28f5c    # -0.74f

    .line 521
    .line 522
    .line 523
    const v13, 0x3e6b851f    # 0.23f

    .line 524
    .line 525
    .line 526
    const v14, -0x41bd70a4    # -0.19f

    .line 527
    .line 528
    .line 529
    const v15, 0x3e75c28f    # 0.24f

    .line 530
    .line 531
    .line 532
    const v16, -0x40f851ec    # -0.53f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x41a67ae1    # 20.81f

    .line 539
    .line 540
    .line 541
    const/high16 v2, 0x40f00000    # 7.5f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x3f30a3d7    # 0.69f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41b00000    # 22.0f

    .line 553
    .line 554
    const/high16 v18, 0x40e00000    # 7.0f

    .line 555
    .line 556
    const v13, 0x41ae3d71    # 21.78f

    .line 557
    .line 558
    .line 559
    const/high16 v14, 0x40f00000    # 7.5f

    .line 560
    .line 561
    const/high16 v15, 0x41b00000    # 22.0f

    .line 562
    .line 563
    const v16, 0x40e8f5c3    # 7.28f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/4 v0, 0x0

    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v17, -0x41000000    # -0.5f

    .line 574
    .line 575
    const/high16 v18, -0x41000000    # -0.5f

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    const v14, -0x4170a3d7    # -0.28f

    .line 579
    .line 580
    .line 581
    const v15, -0x419eb852    # -0.22f

    .line 582
    .line 583
    .line 584
    const/high16 v16, -0x41000000    # -0.5f

    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, -0x40cf5c29    # -0.69f

    .line 590
    .line 591
    .line 592
    const/4 v2, 0x0

    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x413851ec    # -0.39f

    .line 597
    .line 598
    .line 599
    const v2, 0x3ec7ae14    # 0.39f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x42dc28f6    # -0.04f

    .line 606
    .line 607
    .line 608
    const v18, -0x40c28f5c    # -0.74f

    .line 609
    .line 610
    .line 611
    const v13, 0x3e570a3d    # 0.21f

    .line 612
    .line 613
    .line 614
    const v14, -0x41a8f5c3    # -0.21f

    .line 615
    .line 616
    .line 617
    const v15, 0x3e428f5c    # 0.19f

    .line 618
    .line 619
    .line 620
    const v16, -0x40f33333    # -0.55f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, -0x40cf5c29    # -0.69f

    .line 627
    .line 628
    .line 629
    const v18, 0x3d4ccccd    # 0.05f

    .line 630
    .line 631
    .line 632
    const v13, -0x41b33333    # -0.2f

    .line 633
    .line 634
    .line 635
    const v14, -0x41d1eb85    # -0.17f

    .line 636
    .line 637
    .line 638
    const/high16 v15, -0x41000000    # -0.5f

    .line 639
    .line 640
    const v16, -0x41f0a3d7    # -0.14f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x419b1eb8    # 19.39f

    .line 647
    .line 648
    .line 649
    const/high16 v2, 0x40d00000    # 6.5f

    .line 650
    .line 651
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x409c28f6    # -0.89f

    .line 655
    .line 656
    .line 657
    const/16 v18, 0x0

    .line 658
    .line 659
    const/4 v13, 0x0

    .line 660
    const/4 v14, 0x0

    .line 661
    const v15, -0x409c28f6    # -0.89f

    .line 662
    .line 663
    .line 664
    const/16 v16, 0x0

    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x40b3851f    # 5.61f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, -0x4075c28f    # -1.08f

    .line 676
    .line 677
    .line 678
    const v2, 0x3f8a3d71    # 1.08f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, 0x3d4ccccd    # 0.05f

    .line 685
    .line 686
    .line 687
    const v18, -0x40cf5c29    # -0.69f

    .line 688
    .line 689
    .line 690
    const v13, 0x3e3851ec    # 0.18f

    .line 691
    .line 692
    .line 693
    const v14, -0x41c7ae14    # -0.18f

    .line 694
    .line 695
    .line 696
    const v15, 0x3e570a3d    # 0.21f

    .line 697
    .line 698
    .line 699
    const v16, -0x410a3d71    # -0.48f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, -0x40c28f5c    # -0.74f

    .line 706
    .line 707
    .line 708
    const v18, -0x42dc28f6    # -0.04f

    .line 709
    .line 710
    .line 711
    const v13, -0x41bd70a4    # -0.19f

    .line 712
    .line 713
    .line 714
    const v14, -0x41947ae1    # -0.23f

    .line 715
    .line 716
    .line 717
    const v15, -0x40f851ec    # -0.53f

    .line 718
    .line 719
    .line 720
    const v16, -0x418a3d71    # -0.24f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x4086147b    # 4.19f

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x41940000    # 18.5f

    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x40600000    # 3.5f

    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v17, 0x41900000    # 18.0f

    .line 740
    .line 741
    const/high16 v18, 0x40400000    # 3.0f

    .line 742
    .line 743
    const/high16 v13, 0x41940000    # 18.5f

    .line 744
    .line 745
    const v14, 0x404e147b    # 3.22f

    .line 746
    .line 747
    .line 748
    const v15, 0x41923d71    # 18.28f

    .line 749
    .line 750
    .line 751
    const/high16 v16, 0x40400000    # 3.0f

    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/4 v0, 0x0

    .line 757
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v17, -0x41000000    # -0.5f

    .line 761
    .line 762
    const/high16 v18, 0x3f000000    # 0.5f

    .line 763
    .line 764
    const v13, -0x4170a3d7    # -0.28f

    .line 765
    .line 766
    .line 767
    const/4 v14, 0x0

    .line 768
    const/high16 v15, -0x41000000    # -0.5f

    .line 769
    .line 770
    const v16, 0x3e6147ae    # 0.22f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x3f30a3d7    # 0.69f

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x4188e148    # 17.11f

    .line 783
    .line 784
    .line 785
    const v2, 0x40733333    # 3.8f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, -0x40c28f5c    # -0.74f

    .line 792
    .line 793
    .line 794
    const v18, 0x3d23d70a    # 0.04f

    .line 795
    .line 796
    .line 797
    const v13, -0x41a8f5c3    # -0.21f

    .line 798
    .line 799
    .line 800
    const v14, -0x41a8f5c3    # -0.21f

    .line 801
    .line 802
    .line 803
    const v15, -0x40f33333    # -0.55f

    .line 804
    .line 805
    .line 806
    const v16, -0x41bd70a4    # -0.19f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v17, 0x3d4ccccd    # 0.05f

    .line 813
    .line 814
    .line 815
    const v18, 0x3f30a3d7    # 0.69f

    .line 816
    .line 817
    .line 818
    const v13, -0x41d1eb85    # -0.17f

    .line 819
    .line 820
    .line 821
    const v14, 0x3e4ccccd    # 0.2f

    .line 822
    .line 823
    .line 824
    const v15, -0x41f0a3d7    # -0.14f

    .line 825
    .line 826
    .line 827
    const/high16 v16, 0x3f000000    # 0.5f

    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v0, 0x3f8a3d71    # 1.08f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/16 v17, 0x0

    .line 839
    .line 840
    const v18, 0x3f63d70a    # 0.89f

    .line 841
    .line 842
    .line 843
    const/4 v13, 0x0

    .line 844
    const/4 v14, 0x0

    .line 845
    const/4 v15, 0x0

    .line 846
    const v16, 0x3f63d70a    # 0.89f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v0, -0x409c28f6    # -0.89f

    .line 853
    .line 854
    .line 855
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, -0x4075c28f    # -1.08f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, -0x40cf5c29    # -0.69f

    .line 865
    .line 866
    .line 867
    const v18, -0x42b33333    # -0.05f

    .line 868
    .line 869
    .line 870
    const v13, -0x41c7ae14    # -0.18f

    .line 871
    .line 872
    .line 873
    const v14, -0x41c7ae14    # -0.18f

    .line 874
    .line 875
    .line 876
    const v15, -0x410a3d71    # -0.48f

    .line 877
    .line 878
    .line 879
    const v16, -0x41a8f5c3    # -0.21f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v17, -0x42dc28f6    # -0.04f

    .line 886
    .line 887
    .line 888
    const v18, 0x3f3d70a4    # 0.74f

    .line 889
    .line 890
    .line 891
    const v13, -0x41947ae1    # -0.23f

    .line 892
    .line 893
    .line 894
    const v14, 0x3e428f5c    # 0.19f

    .line 895
    .line 896
    .line 897
    const v15, -0x418a3d71    # -0.24f

    .line 898
    .line 899
    .line 900
    const v16, 0x3f07ae14    # 0.53f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, 0x3ec7ae14    # 0.39f

    .line 907
    .line 908
    .line 909
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const/high16 v0, 0x41680000    # 14.5f

    .line 913
    .line 914
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const/high16 v17, 0x41600000    # 14.0f

    .line 918
    .line 919
    const/high16 v18, 0x40e00000    # 7.0f

    .line 920
    .line 921
    const v13, 0x4163851f    # 14.22f

    .line 922
    .line 923
    .line 924
    const/high16 v14, 0x40d00000    # 6.5f

    .line 925
    .line 926
    const/high16 v15, 0x41600000    # 14.0f

    .line 927
    .line 928
    const v16, 0x40d70a3d    # 6.72f

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const/4 v0, 0x0

    .line 935
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const/high16 v17, 0x3f000000    # 0.5f

    .line 939
    .line 940
    const/high16 v18, 0x3f000000    # 0.5f

    .line 941
    .line 942
    const/4 v13, 0x0

    .line 943
    const v14, 0x3e8f5c29    # 0.28f

    .line 944
    .line 945
    .line 946
    const v15, 0x3e6147ae    # 0.22f

    .line 947
    .line 948
    .line 949
    const/high16 v16, 0x3f000000    # 0.5f

    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v0, 0x3f30a3d7    # 0.69f

    .line 955
    .line 956
    .line 957
    const/4 v2, 0x0

    .line 958
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const v0, 0x416ccccd    # 14.8f

    .line 962
    .line 963
    .line 964
    const v2, 0x40fc7ae1    # 7.89f

    .line 965
    .line 966
    .line 967
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v17, 0x3d23d70a    # 0.04f

    .line 971
    .line 972
    .line 973
    const v18, 0x3f3d70a4    # 0.74f

    .line 974
    .line 975
    .line 976
    const v13, -0x41a8f5c3    # -0.21f

    .line 977
    .line 978
    .line 979
    const v14, 0x3e570a3d    # 0.21f

    .line 980
    .line 981
    .line 982
    const v15, -0x41bd70a4    # -0.19f

    .line 983
    .line 984
    .line 985
    const v16, 0x3f0ccccd    # 0.55f

    .line 986
    .line 987
    .line 988
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    const v17, 0x3f30a3d7    # 0.69f

    .line 992
    .line 993
    .line 994
    const v18, -0x42b33333    # -0.05f

    .line 995
    .line 996
    .line 997
    const v13, 0x3e4ccccd    # 0.2f

    .line 998
    .line 999
    .line 1000
    const v14, 0x3e2e147b    # 0.17f

    .line 1001
    .line 1002
    .line 1003
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1004
    .line 1005
    const v16, 0x3e0f5c29    # 0.14f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const v0, -0x4075c28f    # -1.08f

    .line 1012
    .line 1013
    .line 1014
    const v2, 0x3f8a3d71    # 1.08f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const/high16 v17, 0x418c0000    # 17.5f

    .line 1021
    .line 1022
    const/high16 v18, 0x40f00000    # 7.5f

    .line 1023
    .line 1024
    const v13, 0x4184e148    # 16.61f

    .line 1025
    .line 1026
    .line 1027
    const/high16 v14, 0x40f00000    # 7.5f

    .line 1028
    .line 1029
    const/high16 v15, 0x418c0000    # 17.5f

    .line 1030
    .line 1031
    const/high16 v16, 0x40f00000    # 7.5f

    .line 1032
    .line 1033
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    const/16 v16, 0x3800

    .line 1044
    .line 1045
    const/16 v17, 0x0

    .line 1046
    .line 1047
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1048
    .line 1049
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1050
    .line 1051
    const/4 v7, 0x0

    .line 1052
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1053
    .line 1054
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1055
    .line 1056
    const/4 v13, 0x0

    .line 1057
    const/4 v14, 0x0

    .line 1058
    const/4 v15, 0x0

    .line 1059
    const-string v4, ""

    .line 1060
    .line 1061
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    sput-object v0, Landroidx/compose/material/icons/rounded/ChaletKt;->_chalet:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1070
    .line 1071
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1072
    .line 1073
    .line 1074
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/RemoveDoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _removeDone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRemoveDone(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RemoveDoneKt;->_removeDone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RemoveDone"

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
    const v0, 0x40847ae1    # 4.14f

    .line 71
    .line 72
    .line 73
    const v2, 0x402c28f6    # 2.69f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const v18, 0x3fb47ae1    # 1.41f

    .line 85
    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, 0x3ec7ae14    # 0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v16, 0x3f828f5c    # 1.02f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x411ab852    # 9.67f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x404b851f    # -1.41f

    .line 109
    .line 110
    .line 111
    const v2, 0x3fb47ae1    # 1.41f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x3f9d70a4    # -3.54f

    .line 118
    .line 119
    .line 120
    const v2, -0x3f9e147b    # -3.53f

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
    const v14, -0x413851ec    # -0.39f

    .line 132
    .line 133
    .line 134
    const v15, -0x407d70a4    # -1.02f

    .line 135
    .line 136
    .line 137
    const v16, -0x413851ec    # -0.39f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const v18, 0x3fb47ae1    # 1.41f

    .line 150
    .line 151
    .line 152
    const v14, 0x3ec7ae14    # 0.39f

    .line 153
    .line 154
    .line 155
    const v15, -0x413851ec    # -0.39f

    .line 156
    .line 157
    .line 158
    const v16, 0x3f828f5c    # 1.02f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x4087ae14    # 4.24f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x3fb47ae1    # 1.41f

    .line 171
    .line 172
    .line 173
    const/16 v18, 0x0

    .line 174
    .line 175
    const v13, 0x3ec7ae14    # 0.39f

    .line 176
    .line 177
    .line 178
    const v15, 0x3f828f5c    # 1.02f

    .line 179
    .line 180
    .line 181
    const v16, 0x3ec7ae14    # 0.39f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x4007ae14    # 2.12f

    .line 188
    .line 189
    .line 190
    const v2, -0x3ff851ec    # -2.12f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x40bc7ae1    # 5.89f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v18, -0x404b851f    # -1.41f

    .line 212
    .line 213
    .line 214
    const v14, -0x413851ec    # -0.39f

    .line 215
    .line 216
    .line 217
    const v15, 0x3ec7ae14    # 0.39f

    .line 218
    .line 219
    .line 220
    const v16, -0x407d70a4    # -1.02f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x40b1999a    # 5.55f

    .line 227
    .line 228
    .line 229
    const v2, 0x402c28f6    # 2.69f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x40847ae1    # 4.14f

    .line 236
    .line 237
    .line 238
    const v18, 0x402c28f6    # 2.69f

    .line 239
    .line 240
    .line 241
    const v13, 0x40a51eb8    # 5.16f

    .line 242
    .line 243
    .line 244
    const v14, 0x40133333    # 2.3f

    .line 245
    .line 246
    .line 247
    const v15, 0x4090f5c3    # 4.53f

    .line 248
    .line 249
    .line 250
    const v16, 0x40133333    # 2.3f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x4145c28f    # 12.36f

    .line 260
    .line 261
    .line 262
    const v2, 0x41906666    # 18.05f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x3f7851ec    # -4.24f

    .line 269
    .line 270
    .line 271
    const v2, 0x4087ae14    # 4.24f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x43dc28f6    # -0.01f

    .line 278
    .line 279
    .line 280
    const v18, -0x404a3d71    # -1.42f

    .line 281
    .line 282
    .line 283
    const v13, 0x3ec7ae14    # 0.39f

    .line 284
    .line 285
    .line 286
    const v14, -0x413851ec    # -0.39f

    .line 287
    .line 288
    .line 289
    const v15, 0x3ec7ae14    # 0.39f

    .line 290
    .line 291
    .line 292
    const v16, -0x407c28f6    # -1.03f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/4 v0, 0x0

    .line 299
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x404b851f    # -1.41f

    .line 303
    .line 304
    .line 305
    const v18, 0x3c23d70a    # 0.01f

    .line 306
    .line 307
    .line 308
    const v13, -0x413851ec    # -0.39f

    .line 309
    .line 310
    .line 311
    const v14, -0x413d70a4    # -0.38f

    .line 312
    .line 313
    .line 314
    const v15, -0x407d70a4    # -1.02f

    .line 315
    .line 316
    .line 317
    const v16, -0x413d70a4    # -0.38f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, -0x3f7851ec    # -4.24f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x4145c28f    # 12.36f

    .line 330
    .line 331
    .line 332
    const v2, 0x41906666    # 18.05f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x40d66666    # 6.7f

    .line 342
    .line 343
    .line 344
    const v2, 0x41851eb8    # 16.64f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    const v14, -0x413851ec    # -0.39f

    .line 356
    .line 357
    .line 358
    const v16, -0x413851ec    # -0.39f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fb5c28f    # 1.42f

    .line 365
    .line 366
    .line 367
    const v2, -0x404a3d71    # -1.42f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3fb47ae1    # 1.41f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3fb5c28f    # 1.42f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x41851eb8    # 16.64f

    .line 386
    .line 387
    .line 388
    const v18, 0x40d66666    # 6.7f

    .line 389
    .line 390
    .line 391
    const v13, 0x41883d71    # 17.03f

    .line 392
    .line 393
    .line 394
    const v14, 0x40f70a3d    # 7.72f

    .line 395
    .line 396
    .line 397
    const v15, 0x41883d71    # 17.03f

    .line 398
    .line 399
    .line 400
    const v16, 0x40e2e148    # 7.09f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x3fe51eb8    # 1.79f

    .line 410
    .line 411
    .line 412
    const v2, 0x4150f5c3    # 13.06f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x409e6666    # 4.95f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x404b851f    # -1.41f

    .line 425
    .line 426
    .line 427
    const v2, 0x3fb47ae1    # 1.41f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x404ccccd    # 3.2f

    .line 434
    .line 435
    .line 436
    const v2, 0x413a6666    # 11.65f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x404b851f    # -1.41f

    .line 443
    .line 444
    .line 445
    const/16 v18, 0x0

    .line 446
    .line 447
    const v13, -0x413851ec    # -0.39f

    .line 448
    .line 449
    .line 450
    const v14, -0x413851ec    # -0.39f

    .line 451
    .line 452
    .line 453
    const v15, -0x407d70a4    # -1.02f

    .line 454
    .line 455
    .line 456
    const v16, -0x413851ec    # -0.39f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x3fe51eb8    # 1.79f

    .line 467
    .line 468
    .line 469
    const v18, 0x4150f5c3    # 13.06f

    .line 470
    .line 471
    .line 472
    const v13, 0x3fb33333    # 1.4f

    .line 473
    .line 474
    .line 475
    const v14, 0x4140a3d7    # 12.04f

    .line 476
    .line 477
    .line 478
    const v15, 0x3fb33333    # 1.4f

    .line 479
    .line 480
    .line 481
    const v16, 0x414ab852    # 12.67f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    const/16 v16, 0x3800

    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const/high16 v6, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/high16 v8, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const/high16 v9, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/high16 v12, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const/4 v14, 0x0

    .line 509
    const/4 v15, 0x0

    .line 510
    const-string v4, ""

    .line 511
    .line 512
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    sput-object v0, Landroidx/compose/material/icons/rounded/RemoveDoneKt;->_removeDone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 521
    .line 522
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    return-object v0
.end method

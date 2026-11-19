.class public final Landroidx/compose/material/icons/rounded/VisibilityOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibilityOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VisibilityOff"

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
    const/high16 v0, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v17, -0x418a3d71    # -0.24f

    .line 94
    .line 95
    .line 96
    const v18, 0x3fbae148    # 1.46f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3f028f5c    # 0.51f

    .line 101
    .line 102
    .line 103
    const v15, -0x42333333    # -0.1f

    .line 104
    .line 105
    .line 106
    const/high16 v16, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4043d70a    # 3.06f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x404b851f    # 3.18f

    .line 118
    .line 119
    .line 120
    const v18, -0x3f6f0a3d    # -4.53f

    .line 121
    .line 122
    .line 123
    const v13, 0x3fb1eb85    # 1.39f

    .line 124
    .line 125
    .line 126
    const v14, -0x40628f5c    # -1.23f

    .line 127
    .line 128
    .line 129
    const v15, 0x401f5c29    # 2.49f

    .line 130
    .line 131
    .line 132
    const v16, -0x3fceb852    # -2.77f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x41400000    # 12.0f

    .line 139
    .line 140
    const/high16 v18, 0x40800000    # 4.0f

    .line 141
    .line 142
    const v13, 0x41aa28f6    # 21.27f

    .line 143
    .line 144
    .line 145
    const v14, 0x40e3851f    # 7.11f

    .line 146
    .line 147
    .line 148
    const/high16 v15, 0x41880000    # 17.0f

    .line 149
    .line 150
    const/high16 v16, 0x40800000    # 4.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x3f970a3d    # -3.64f

    .line 156
    .line 157
    .line 158
    const v18, 0x3f11eb85    # 0.57f

    .line 159
    .line 160
    .line 161
    const v13, -0x405d70a4    # -1.27f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, -0x3fe0a3d7    # -2.49f

    .line 166
    .line 167
    .line 168
    const v16, 0x3e4ccccd    # 0.2f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x400ae148    # 2.17f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3fbc28f6    # 1.47f

    .line 181
    .line 182
    .line 183
    const v18, -0x418a3d71    # -0.24f

    .line 184
    .line 185
    .line 186
    const v13, 0x3ef0a3d7    # 0.47f

    .line 187
    .line 188
    .line 189
    const v14, -0x41f0a3d7    # -0.14f

    .line 190
    .line 191
    .line 192
    const v15, 0x3f75c28f    # 0.96f

    .line 193
    .line 194
    .line 195
    const v16, -0x418a3d71    # -0.24f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x402d70a4    # 2.71f

    .line 205
    .line 206
    .line 207
    const v2, 0x404a3d71    # 3.16f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const v18, 0x3fb47ae1    # 1.41f

    .line 216
    .line 217
    .line 218
    const v13, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    const v14, 0x3ec7ae14    # 0.39f

    .line 222
    .line 223
    .line 224
    const v15, -0x413851ec    # -0.39f

    .line 225
    .line 226
    .line 227
    const v16, 0x3f828f5c    # 1.02f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x3ffc28f6    # 1.97f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v18, 0x41380000    # 11.5f

    .line 242
    .line 243
    const v13, 0x4043d70a    # 3.06f

    .line 244
    .line 245
    .line 246
    const v14, 0x40fa8f5c    # 7.83f

    .line 247
    .line 248
    .line 249
    const v15, 0x3fe28f5c    # 1.77f

    .line 250
    .line 251
    .line 252
    const v16, 0x41187ae1    # 9.53f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x41400000    # 12.0f

    .line 259
    .line 260
    const/high16 v18, 0x41980000    # 19.0f

    .line 261
    .line 262
    const v13, 0x402eb852    # 2.73f

    .line 263
    .line 264
    .line 265
    const v14, 0x417e3d71    # 15.89f

    .line 266
    .line 267
    .line 268
    const/high16 v15, 0x40e00000    # 7.0f

    .line 269
    .line 270
    const/high16 v16, 0x41980000    # 19.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x4089eb85    # 4.31f

    .line 276
    .line 277
    .line 278
    const v18, -0x40ae147b    # -0.82f

    .line 279
    .line 280
    .line 281
    const v13, 0x3fc28f5c    # 1.52f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x403e147b    # 2.97f

    .line 286
    .line 287
    .line 288
    const v16, -0x41666666    # -0.3f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x402e147b    # 2.72f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x3fb47ae1    # 1.41f

    .line 301
    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    const v13, 0x3ec7ae14    # 0.39f

    .line 306
    .line 307
    .line 308
    const v14, 0x3ec7ae14    # 0.39f

    .line 309
    .line 310
    .line 311
    const v15, 0x3f828f5c    # 1.02f

    .line 312
    .line 313
    .line 314
    const v16, 0x3ec7ae14    # 0.39f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const v18, -0x404b851f    # -1.41f

    .line 323
    .line 324
    .line 325
    const v14, -0x413851ec    # -0.39f

    .line 326
    .line 327
    .line 328
    const v15, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v16, -0x407d70a4    # -1.02f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x408428f6    # 4.13f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x404a3d71    # -1.42f

    .line 344
    .line 345
    .line 346
    const/16 v18, 0x0

    .line 347
    .line 348
    const v13, -0x413851ec    # -0.39f

    .line 349
    .line 350
    .line 351
    const v15, -0x407c28f6    # -1.03f

    .line 352
    .line 353
    .line 354
    const v16, -0x413851ec    # -0.39f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41840000    # 16.5f

    .line 364
    .line 365
    const/high16 v2, 0x41400000    # 12.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x3f600000    # -5.0f

    .line 371
    .line 372
    const/high16 v18, -0x3f600000    # -5.0f

    .line 373
    .line 374
    const v13, -0x3fcf5c29    # -2.76f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, -0x3f600000    # -5.0f

    .line 379
    .line 380
    const v16, -0x3ff0a3d7    # -2.24f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3efae148    # 0.49f

    .line 387
    .line 388
    .line 389
    const v18, -0x3ff70a3d    # -2.14f

    .line 390
    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const v14, -0x40bae148    # -0.77f

    .line 394
    .line 395
    .line 396
    const v15, 0x3e3851ec    # 0.18f

    .line 397
    .line 398
    .line 399
    const/high16 v16, -0x40400000    # -1.5f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3fc8f5c3    # 1.57f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x428a3d71    # -0.06f

    .line 411
    .line 412
    .line 413
    const v18, 0x3f11eb85    # 0.57f

    .line 414
    .line 415
    .line 416
    const v13, -0x430a3d71    # -0.03f

    .line 417
    .line 418
    .line 419
    const v14, 0x3e3851ec    # 0.18f

    .line 420
    .line 421
    .line 422
    const v15, -0x428a3d71    # -0.06f

    .line 423
    .line 424
    .line 425
    const v16, 0x3ebd70a4    # 0.37f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x40400000    # 3.0f

    .line 432
    .line 433
    const/high16 v18, 0x40400000    # 3.0f

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const v14, 0x3fd47ae1    # 1.66f

    .line 437
    .line 438
    .line 439
    const v15, 0x3fab851f    # 1.34f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x40400000    # 3.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x3f11eb85    # 0.57f

    .line 448
    .line 449
    .line 450
    const v18, -0x4270a3d7    # -0.07f

    .line 451
    .line 452
    .line 453
    const v13, 0x3e4ccccd    # 0.2f

    .line 454
    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const v15, 0x3ec28f5c    # 0.38f

    .line 458
    .line 459
    .line 460
    const v16, -0x430a3d71    # -0.03f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x41623d71    # 14.14f

    .line 467
    .line 468
    .line 469
    const/high16 v2, 0x41800000    # 16.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, -0x3ff70a3d    # -2.14f

    .line 475
    .line 476
    .line 477
    const/high16 v18, 0x3f000000    # 0.5f

    .line 478
    .line 479
    const v13, -0x40d9999a    # -0.65f

    .line 480
    .line 481
    .line 482
    const v14, 0x3ea3d70a    # 0.32f

    .line 483
    .line 484
    .line 485
    const v15, -0x4050a3d7    # -1.37f

    .line 486
    .line 487
    .line 488
    const/high16 v16, 0x3f000000    # 0.5f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x416f851f    # 14.97f

    .line 497
    .line 498
    .line 499
    const v2, 0x4132b852    # 11.17f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, -0x3fd70a3d    # -2.64f

    .line 506
    .line 507
    .line 508
    const v18, -0x3fd70a3d    # -2.64f

    .line 509
    .line 510
    .line 511
    const v13, -0x41e66666    # -0.15f

    .line 512
    .line 513
    .line 514
    const v14, -0x404ccccd    # -1.4f

    .line 515
    .line 516
    .line 517
    const/high16 v15, -0x40600000    # -1.25f

    .line 518
    .line 519
    const v16, -0x3fe0a3d7    # -2.49f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x4028f5c3    # 2.64f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v8, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/high16 v9, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v12, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x0

    .line 553
    const/4 v15, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    sput-object v0, Landroidx/compose/material/icons/rounded/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    return-object v0
.end method

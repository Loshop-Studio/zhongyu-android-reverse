.class public final Landroidx/compose/material/icons/rounded/AnimationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _animation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAnimation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AnimationKt;->_animation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Animation"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f38f5c3    # -6.22f

    .line 78
    .line 79
    .line 80
    const v18, 0x4071eb85    # 3.78f

    .line 81
    .line 82
    .line 83
    const v13, -0x3fd28f5c    # -2.71f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3f5e6666    # -5.05f

    .line 88
    .line 89
    .line 90
    const v16, 0x3fc51eb8    # 1.54f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 97
    .line 98
    const/high16 v18, 0x40400000    # 3.0f

    .line 99
    .line 100
    const v13, -0x405c28f6    # -1.28f

    .line 101
    .line 102
    .line 103
    const v14, 0x3f2b851f    # 0.67f

    .line 104
    .line 105
    .line 106
    const v15, -0x3fea3d71    # -2.34f

    .line 107
    .line 108
    .line 109
    const v16, 0x3fdc28f6    # 1.72f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v18, 0x41700000    # 15.0f

    .line 118
    .line 119
    const v13, 0x40628f5c    # 3.54f

    .line 120
    .line 121
    .line 122
    const v14, 0x411f3333    # 9.95f

    .line 123
    .line 124
    .line 125
    const/high16 v15, 0x40000000    # 2.0f

    .line 126
    .line 127
    const v16, 0x4144a3d7    # 12.29f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x40e00000    # 7.0f

    .line 134
    .line 135
    const/high16 v18, 0x40e00000    # 7.0f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, 0x4077ae14    # 3.87f

    .line 139
    .line 140
    .line 141
    const v15, 0x404851ec    # 3.13f

    .line 142
    .line 143
    .line 144
    const/high16 v16, 0x40e00000    # 7.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x40c70a3d    # 6.22f

    .line 150
    .line 151
    .line 152
    const v18, -0x3f8e147b    # -3.78f

    .line 153
    .line 154
    .line 155
    const v13, 0x402d70a4    # 2.71f

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const v15, 0x40a1999a    # 5.05f

    .line 160
    .line 161
    .line 162
    const v16, -0x403ae148    # -1.54f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x40400000    # 3.0f

    .line 169
    .line 170
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 171
    .line 172
    const v13, 0x3fa3d70a    # 1.28f

    .line 173
    .line 174
    .line 175
    const v14, -0x40d47ae1    # -0.67f

    .line 176
    .line 177
    .line 178
    const v15, 0x4015c28f    # 2.34f

    .line 179
    .line 180
    .line 181
    const v16, -0x4023d70a    # -1.72f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41b00000    # 22.0f

    .line 188
    .line 189
    const/high16 v18, 0x41100000    # 9.0f

    .line 190
    .line 191
    const v13, 0x41a3ae14    # 20.46f

    .line 192
    .line 193
    .line 194
    const v14, 0x4160cccd    # 14.05f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x41b00000    # 22.0f

    .line 198
    .line 199
    const v16, 0x413b5c29    # 11.71f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x41700000    # 15.0f

    .line 206
    .line 207
    const/high16 v18, 0x40000000    # 2.0f

    .line 208
    .line 209
    const/high16 v13, 0x41b00000    # 22.0f

    .line 210
    .line 211
    const v14, 0x40a428f6    # 5.13f

    .line 212
    .line 213
    .line 214
    const v15, 0x4196f5c3    # 18.87f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x40000000    # 2.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41100000    # 9.0f

    .line 226
    .line 227
    const/high16 v2, 0x41a00000    # 20.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, -0x3f600000    # -5.0f

    .line 233
    .line 234
    const/high16 v18, -0x3f600000    # -5.0f

    .line 235
    .line 236
    const v13, -0x3fcf5c29    # -2.76f

    .line 237
    .line 238
    .line 239
    const/4 v14, 0x0

    .line 240
    const/high16 v15, -0x3f600000    # -5.0f

    .line 241
    .line 242
    const v16, -0x3ff0a3d7    # -2.24f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const v14, -0x4070a3d7    # -1.12f

    .line 254
    .line 255
    .line 256
    const v15, 0x3ebd70a4    # 0.37f

    .line 257
    .line 258
    .line 259
    const v16, -0x3ff5c28f    # -2.16f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40e00000    # 7.0f

    .line 266
    .line 267
    const/high16 v18, 0x40e00000    # 7.0f

    .line 268
    .line 269
    const v14, 0x4077ae14    # 3.87f

    .line 270
    .line 271
    .line 272
    const v15, 0x404851ec    # 3.13f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x40e00000    # 7.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41100000    # 9.0f

    .line 281
    .line 282
    const/high16 v18, 0x41a00000    # 20.0f

    .line 283
    .line 284
    const v13, 0x41328f5c    # 11.16f

    .line 285
    .line 286
    .line 287
    const v14, 0x419d0a3d    # 19.63f

    .line 288
    .line 289
    .line 290
    const v15, 0x4121eb85    # 10.12f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x41a00000    # 20.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41880000    # 17.0f

    .line 302
    .line 303
    const/high16 v2, 0x41400000    # 12.0f

    .line 304
    .line 305
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, -0x3f600000    # -5.0f

    .line 309
    .line 310
    const/high16 v18, -0x3f600000    # -5.0f

    .line 311
    .line 312
    const v13, -0x3fcf5c29    # -2.76f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/high16 v15, -0x3f600000    # -5.0f

    .line 317
    .line 318
    const v16, -0x3ff0a3d7    # -2.24f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, -0x4070a3d7    # -1.12f

    .line 330
    .line 331
    .line 332
    const v15, 0x3ebd70a4    # 0.37f

    .line 333
    .line 334
    .line 335
    const v16, -0x3ff5c28f    # -2.16f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x40e00000    # 7.0f

    .line 342
    .line 343
    const/high16 v18, 0x40e00000    # 7.0f

    .line 344
    .line 345
    const v14, 0x40770a3d    # 3.86f

    .line 346
    .line 347
    .line 348
    const v15, 0x404851ec    # 3.13f

    .line 349
    .line 350
    .line 351
    const v16, 0x40dfae14    # 6.99f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41400000    # 12.0f

    .line 358
    .line 359
    const/high16 v18, 0x41880000    # 17.0f

    .line 360
    .line 361
    const v13, 0x41628f5c    # 14.16f

    .line 362
    .line 363
    .line 364
    const v14, 0x41850a3d    # 16.63f

    .line 365
    .line 366
    .line 367
    const v15, 0x4151eb85    # 13.12f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x41880000    # 17.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x4185999a    # 16.7f

    .line 379
    .line 380
    .line 381
    const v2, 0x415b3333    # 13.7f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x41700000    # 15.0f

    .line 388
    .line 389
    const/high16 v18, 0x41600000    # 14.0f

    .line 390
    .line 391
    const v13, 0x41815c29    # 16.17f

    .line 392
    .line 393
    .line 394
    const v14, 0x415e3d71    # 13.89f

    .line 395
    .line 396
    .line 397
    const v15, 0x4179999a    # 15.6f

    .line 398
    .line 399
    .line 400
    const/high16 v16, 0x41600000    # 14.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x3f600000    # -5.0f

    .line 406
    .line 407
    const/high16 v18, -0x3f600000    # -5.0f

    .line 408
    .line 409
    const v13, -0x3fcf5c29    # -2.76f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, -0x3f600000    # -5.0f

    .line 414
    .line 415
    const v16, -0x3ff0a3d7    # -2.24f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3e99999a    # 0.3f

    .line 422
    .line 423
    .line 424
    const v18, -0x40266666    # -1.7f

    .line 425
    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, -0x40e66666    # -0.6f

    .line 429
    .line 430
    .line 431
    const v15, 0x3de147ae    # 0.11f

    .line 432
    .line 433
    .line 434
    const v16, -0x406a3d71    # -1.17f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, 0x41400000    # 12.0f

    .line 441
    .line 442
    const/high16 v18, 0x40e00000    # 7.0f

    .line 443
    .line 444
    const v13, 0x412d47ae    # 10.83f

    .line 445
    .line 446
    .line 447
    const v14, 0x40e3851f    # 7.11f

    .line 448
    .line 449
    .line 450
    const v15, 0x41366666    # 11.4f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40e00000    # 7.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x40a00000    # 5.0f

    .line 459
    .line 460
    const/high16 v18, 0x40a00000    # 5.0f

    .line 461
    .line 462
    const v13, 0x4030a3d7    # 2.76f

    .line 463
    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    const/high16 v15, 0x40a00000    # 5.0f

    .line 467
    .line 468
    const v16, 0x400f5c29    # 2.24f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x4185999a    # 16.7f

    .line 475
    .line 476
    .line 477
    const v18, 0x415b3333    # 13.7f

    .line 478
    .line 479
    .line 480
    const/high16 v13, 0x41880000    # 17.0f

    .line 481
    .line 482
    const v14, 0x4149999a    # 12.6f

    .line 483
    .line 484
    .line 485
    const v15, 0x41871eb8    # 16.89f

    .line 486
    .line 487
    .line 488
    const v16, 0x4152b852    # 13.17f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41980000    # 19.0f

    .line 498
    .line 499
    const/high16 v2, 0x41400000    # 12.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, -0x3f200000    # -7.0f

    .line 505
    .line 506
    const/high16 v18, -0x3f200000    # -7.0f

    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const v14, -0x3f88f5c3    # -3.86f

    .line 510
    .line 511
    .line 512
    const v15, -0x3fb7ae14    # -3.13f

    .line 513
    .line 514
    .line 515
    const v16, -0x3f2051ec    # -6.99f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x40400000    # 3.0f

    .line 522
    .line 523
    const/high16 v18, -0x40800000    # -1.0f

    .line 524
    .line 525
    const v13, 0x3f570a3d    # 0.84f

    .line 526
    .line 527
    .line 528
    const v14, -0x40deb852    # -0.63f

    .line 529
    .line 530
    .line 531
    const v15, 0x3fef5c29    # 1.87f

    .line 532
    .line 533
    .line 534
    const/high16 v16, -0x40800000    # -1.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v17, 0x40a00000    # 5.0f

    .line 540
    .line 541
    const/high16 v18, 0x40a00000    # 5.0f

    .line 542
    .line 543
    const v13, 0x4030a3d7    # 2.76f

    .line 544
    .line 545
    .line 546
    const/4 v14, 0x0

    .line 547
    const/high16 v15, 0x40a00000    # 5.0f

    .line 548
    .line 549
    const v16, 0x400f5c29    # 2.24f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x41980000    # 19.0f

    .line 556
    .line 557
    const/high16 v18, 0x41400000    # 12.0f

    .line 558
    .line 559
    const/high16 v13, 0x41a00000    # 20.0f

    .line 560
    .line 561
    const v14, 0x4121eb85    # 10.12f

    .line 562
    .line 563
    .line 564
    const v15, 0x419d0a3d    # 19.63f

    .line 565
    .line 566
    .line 567
    const v16, 0x41328f5c    # 11.16f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    const/16 v16, 0x3800

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/high16 v6, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v8, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v7, 0x0

    .line 589
    const/high16 v9, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v12, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const/4 v14, 0x0

    .line 595
    const/4 v15, 0x0

    .line 596
    const-string v4, ""

    .line 597
    .line 598
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    sput-object v0, Landroidx/compose/material/icons/rounded/AnimationKt;->_animation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    return-object v0
.end method

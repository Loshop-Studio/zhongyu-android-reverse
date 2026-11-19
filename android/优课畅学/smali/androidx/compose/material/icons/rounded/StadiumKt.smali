.class public final Landroidx/compose/material/icons/rounded/StadiumKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stadium:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStadium(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/StadiumKt;->_stadium:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Stadium"

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
    const v0, 0x40c3851f    # 6.11f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ae6666    # 5.45f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x406e147b    # 3.72f

    .line 80
    .line 81
    .line 82
    const v2, 0x40d47ae1    # 6.64f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x40400000    # 3.0f

    .line 89
    .line 90
    const v18, 0x40c6147b    # 6.19f

    .line 91
    .line 92
    .line 93
    const v13, 0x4058f5c3    # 3.39f

    .line 94
    .line 95
    .line 96
    const v14, 0x40d9999a    # 6.8f

    .line 97
    .line 98
    .line 99
    const/high16 v15, 0x40400000    # 3.0f

    .line 100
    .line 101
    const v16, 0x40d1eb85    # 6.56f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x4073d70a    # 3.81f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x406e147b    # 3.72f

    .line 114
    .line 115
    .line 116
    const v18, 0x40570a3d    # 3.36f

    .line 117
    .line 118
    .line 119
    const/high16 v13, 0x40400000    # 3.0f

    .line 120
    .line 121
    const v14, 0x405c28f6    # 3.44f

    .line 122
    .line 123
    .line 124
    const v15, 0x4058f5c3    # 3.39f

    .line 125
    .line 126
    .line 127
    const v16, 0x404ccccd    # 3.2f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x3f9851ec    # 1.19f

    .line 134
    .line 135
    .line 136
    const v2, 0x401851ec    # 2.38f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x40c3851f    # 6.11f

    .line 143
    .line 144
    .line 145
    const v18, 0x40ae6666    # 5.45f

    .line 146
    .line 147
    .line 148
    const v13, 0x40cf0a3d    # 6.47f

    .line 149
    .line 150
    .line 151
    const v14, 0x4097ae14    # 4.74f

    .line 152
    .line 153
    .line 154
    const v15, 0x40cf0a3d    # 6.47f

    .line 155
    .line 156
    .line 157
    const v16, 0x40a851ec    # 5.26f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41900000    # 18.0f

    .line 167
    .line 168
    const v2, 0x4073d70a    # 3.81f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x401851ec    # 2.38f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3f3851ec    # 0.72f

    .line 181
    .line 182
    .line 183
    const v18, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3ebd70a4    # 0.37f

    .line 188
    .line 189
    .line 190
    const v15, 0x3ec7ae14    # 0.39f

    .line 191
    .line 192
    .line 193
    const v16, 0x3f1c28f6    # 0.61f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, -0x4067ae14    # -1.19f

    .line 200
    .line 201
    .line 202
    const v2, 0x401851ec    # 2.38f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const v18, -0x409c28f6    # -0.89f

    .line 211
    .line 212
    .line 213
    const v13, 0x3ebd70a4    # 0.37f

    .line 214
    .line 215
    .line 216
    const v14, -0x41c7ae14    # -0.18f

    .line 217
    .line 218
    .line 219
    const v15, 0x3ebd70a4    # 0.37f

    .line 220
    .line 221
    .line 222
    const v16, -0x40ca3d71    # -0.71f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3fe7ae14    # -2.38f

    .line 229
    .line 230
    .line 231
    const v2, -0x4067ae14    # -1.19f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41900000    # 18.0f

    .line 238
    .line 239
    const v18, 0x4073d70a    # 3.81f

    .line 240
    .line 241
    .line 242
    const v13, 0x41931eb8    # 18.39f

    .line 243
    .line 244
    .line 245
    const v14, 0x404ccccd    # 3.2f

    .line 246
    .line 247
    .line 248
    const/high16 v15, 0x41900000    # 18.0f

    .line 249
    .line 250
    const v16, 0x405c28f6    # 3.44f

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 260
    .line 261
    const v2, 0x4033d70a    # 2.81f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x401851ec    # 2.38f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3f3851ec    # 0.72f

    .line 274
    .line 275
    .line 276
    const v18, 0x3ee66666    # 0.45f

    .line 277
    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, 0x3ebd70a4    # 0.37f

    .line 281
    .line 282
    .line 283
    const v15, 0x3ec7ae14    # 0.39f

    .line 284
    .line 285
    .line 286
    const v16, 0x3f1c28f6    # 0.61f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, -0x4067ae14    # -1.19f

    .line 293
    .line 294
    .line 295
    const v2, 0x401851ec    # 2.38f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const v18, -0x409c28f6    # -0.89f

    .line 304
    .line 305
    .line 306
    const v13, 0x3ebd70a4    # 0.37f

    .line 307
    .line 308
    .line 309
    const v14, -0x41c7ae14    # -0.18f

    .line 310
    .line 311
    .line 312
    const v15, 0x3ebd70a4    # 0.37f

    .line 313
    .line 314
    .line 315
    const v16, -0x40ca3d71    # -0.71f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x3fe7ae14    # -2.38f

    .line 322
    .line 323
    .line 324
    const v2, -0x4067ae14    # -1.19f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x41300000    # 11.0f

    .line 331
    .line 332
    const v18, 0x4033d70a    # 2.81f

    .line 333
    .line 334
    .line 335
    const v13, 0x41363d71    # 11.39f

    .line 336
    .line 337
    .line 338
    const v14, 0x400ccccd    # 2.2f

    .line 339
    .line 340
    .line 341
    const/high16 v15, 0x41300000    # 11.0f

    .line 342
    .line 343
    const v16, 0x401c28f6    # 2.44f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x4120a3d7    # 10.04f

    .line 353
    .line 354
    .line 355
    const/high16 v2, 0x40a00000    # 5.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41400000    # 12.0f

    .line 361
    .line 362
    const/high16 v18, 0x41300000    # 11.0f

    .line 363
    .line 364
    const v13, 0x40cc28f6    # 6.38f

    .line 365
    .line 366
    .line 367
    const v14, 0x41287ae1    # 10.53f

    .line 368
    .line 369
    .line 370
    const v15, 0x410c51ec    # 8.77f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x41300000    # 11.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x40e00000    # 7.0f

    .line 379
    .line 380
    const v2, -0x408a3d71    # -0.96f

    .line 381
    .line 382
    .line 383
    const v4, 0x40b3d70a    # 5.62f

    .line 384
    .line 385
    .line 386
    const v6, -0x410f5c29    # -0.47f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v18, 0x41100000    # 9.0f

    .line 393
    .line 394
    const/high16 v13, 0x41980000    # 19.0f

    .line 395
    .line 396
    const v14, 0x411dc28f    # 9.86f

    .line 397
    .line 398
    .line 399
    const v15, 0x4181c28f    # 16.22f

    .line 400
    .line 401
    .line 402
    const/high16 v16, 0x41100000    # 9.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x411dc28f    # 9.86f

    .line 408
    .line 409
    .line 410
    const v2, 0x4120a3d7    # 10.04f

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x40a00000    # 5.0f

    .line 414
    .line 415
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41600000    # 14.0f

    .line 422
    .line 423
    const/high16 v2, 0x41880000    # 17.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, -0x3f800000    # -4.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, -0x40800000    # -1.0f

    .line 434
    .line 435
    const/high16 v18, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const v13, -0x40f33333    # -0.55f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const/high16 v15, -0x40800000    # -1.0f

    .line 442
    .line 443
    const v16, 0x3ee66666    # 0.45f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/4 v0, 0x0

    .line 450
    const v2, 0x407851ec    # 3.88f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x40000000    # 2.0f

    .line 457
    .line 458
    const/high16 v18, 0x41980000    # 19.0f

    .line 459
    .line 460
    const v13, 0x409e147b    # 4.94f

    .line 461
    .line 462
    .line 463
    const v14, 0x41abeb85    # 21.49f

    .line 464
    .line 465
    .line 466
    const/high16 v15, 0x40000000    # 2.0f

    .line 467
    .line 468
    const v16, 0x41a2b852    # 20.34f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x41200000    # 10.0f

    .line 480
    .line 481
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const v14, -0x402b851f    # -1.66f

    .line 485
    .line 486
    .line 487
    const v15, 0x408f5c29    # 4.48f

    .line 488
    .line 489
    .line 490
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x3fab851f    # 1.34f

    .line 496
    .line 497
    .line 498
    const/high16 v2, 0x40400000    # 3.0f

    .line 499
    .line 500
    const/high16 v4, 0x41200000    # 10.0f

    .line 501
    .line 502
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41100000    # 9.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, -0x3f200000    # -7.0f

    .line 511
    .line 512
    const v18, 0x4037ae14    # 2.87f

    .line 513
    .line 514
    .line 515
    const v14, 0x3fab851f    # 1.34f

    .line 516
    .line 517
    .line 518
    const v15, -0x3fc3d70a    # -2.94f

    .line 519
    .line 520
    .line 521
    const v16, 0x401eb852    # 2.48f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41700000    # 15.0f

    .line 528
    .line 529
    const/high16 v2, 0x41900000    # 18.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x41600000    # 14.0f

    .line 535
    .line 536
    const/high16 v18, 0x41880000    # 17.0f

    .line 537
    .line 538
    const/high16 v13, 0x41700000    # 15.0f

    .line 539
    .line 540
    const v14, 0x418b999a    # 17.45f

    .line 541
    .line 542
    .line 543
    const v15, 0x4168cccd    # 14.55f

    .line 544
    .line 545
    .line 546
    const/high16 v16, 0x41880000    # 17.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    const/16 v16, 0x3800

    .line 559
    .line 560
    const/16 v17, 0x0

    .line 561
    .line 562
    const/high16 v6, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/high16 v8, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/4 v7, 0x0

    .line 567
    const/high16 v9, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/high16 v12, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v13, 0x0

    .line 572
    const/4 v14, 0x0

    .line 573
    const/4 v15, 0x0

    .line 574
    const-string v4, ""

    .line 575
    .line 576
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    sput-object v0, Landroidx/compose/material/icons/rounded/StadiumKt;->_stadium:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-object v0
.end method

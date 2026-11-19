.class public final Landroidx/compose/material/icons/twotone/SyncDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSyncDisabled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SyncDisabledKt;->_syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SyncDisabled"

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
    const v2, 0x40cb3333    # 6.35f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x408851ec    # 4.26f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, -0x400f5c29    # -1.88f

    .line 85
    .line 86
    .line 87
    const/high16 v18, 0x3f400000    # 0.75f

    .line 88
    .line 89
    const v13, -0x40d70a3d    # -0.66f

    .line 90
    .line 91
    .line 92
    const v14, 0x3e2e147b    # 0.17f

    .line 93
    .line 94
    .line 95
    const v15, -0x405ae148    # -1.29f

    .line 96
    .line 97
    .line 98
    const v16, 0x3edc28f6    # 0.43f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3ec28f5c    # 0.38f

    .line 110
    .line 111
    .line 112
    const v18, -0x41dc28f6    # -0.16f

    .line 113
    .line 114
    .line 115
    const v13, 0x3e051eb8    # 0.13f

    .line 116
    .line 117
    .line 118
    const v14, -0x42b33333    # -0.05f

    .line 119
    .line 120
    .line 121
    const/high16 v15, 0x3e800000    # 0.25f

    .line 122
    .line 123
    const v16, -0x421eb852    # -0.11f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x41400000    # 12.0f

    .line 133
    .line 134
    const/high16 v2, 0x41a00000    # 20.0f

    .line 135
    .line 136
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x3fe8f5c3    # -2.36f

    .line 140
    .line 141
    .line 142
    const v18, -0x3f4b851f    # -5.64f

    .line 143
    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, -0x3ff28f5c    # -2.21f

    .line 147
    .line 148
    .line 149
    const v15, -0x40970a3d    # -0.91f

    .line 150
    .line 151
    .line 152
    const v16, -0x3f79999a    # -4.2f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x41a00000    # 20.0f

    .line 159
    .line 160
    const/high16 v2, 0x40800000    # 4.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, -0x3f400000    # -6.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x40c00000    # 6.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x3ff0a3d7    # -2.24f

    .line 176
    .line 177
    .line 178
    const v2, 0x400f5c29    # 2.24f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x41900000    # 18.0f

    .line 185
    .line 186
    const/high16 v18, 0x41400000    # 12.0f

    .line 187
    .line 188
    const v13, 0x418a8f5c    # 17.32f

    .line 189
    .line 190
    .line 191
    const v14, 0x410d999a    # 8.85f

    .line 192
    .line 193
    .line 194
    const/high16 v15, 0x41900000    # 18.0f

    .line 195
    .line 196
    const v16, 0x412570a4    # 10.34f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x40fd70a4    # -0.51f

    .line 203
    .line 204
    .line 205
    const v18, 0x401851ec    # 2.38f

    .line 206
    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    const v14, 0x3f59999a    # 0.85f

    .line 210
    .line 211
    .line 212
    const v15, -0x41bd70a4    # -0.19f

    .line 213
    .line 214
    .line 215
    const v16, 0x3fd33333    # 1.65f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x41a00000    # 20.0f

    .line 227
    .line 228
    const/high16 v18, 0x41400000    # 12.0f

    .line 229
    .line 230
    const v13, 0x419d0a3d    # 19.63f

    .line 231
    .line 232
    .line 233
    const v14, 0x416bd70a    # 14.74f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x41a00000    # 20.0f

    .line 237
    .line 238
    const v16, 0x41568f5c    # 13.41f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x4088a3d7    # 4.27f

    .line 248
    .line 249
    .line 250
    const/high16 v2, 0x40800000    # 4.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x40370a3d    # 2.86f

    .line 256
    .line 257
    .line 258
    const v2, 0x40ad1eb8    # 5.41f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x40170a3d    # 2.36f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x40800000    # 4.0f

    .line 271
    .line 272
    const v13, 0x408e6666    # 4.45f

    .line 273
    .line 274
    .line 275
    const v14, 0x410fd70a    # 8.99f

    .line 276
    .line 277
    .line 278
    const/high16 v15, 0x40800000    # 4.0f

    .line 279
    .line 280
    const v16, 0x41270a3d    # 10.44f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x40170a3d    # 2.36f

    .line 287
    .line 288
    .line 289
    const v18, 0x40b47ae1    # 5.64f

    .line 290
    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, 0x400d70a4    # 2.21f

    .line 294
    .line 295
    .line 296
    const v15, 0x3f68f5c3    # 0.91f

    .line 297
    .line 298
    .line 299
    const v16, 0x40866666    # 4.2f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41a00000    # 20.0f

    .line 306
    .line 307
    const/high16 v2, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40c00000    # 6.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, -0x3f400000    # -6.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x3ff0a3d7    # -2.24f

    .line 323
    .line 324
    .line 325
    const v2, 0x400f5c29    # 2.24f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x40c00000    # 6.0f

    .line 332
    .line 333
    const/high16 v18, 0x41400000    # 12.0f

    .line 334
    .line 335
    const v13, 0x40d5c28f    # 6.68f

    .line 336
    .line 337
    .line 338
    const v14, 0x41726666    # 15.15f

    .line 339
    .line 340
    .line 341
    const/high16 v15, 0x40c00000    # 6.0f

    .line 342
    .line 343
    const v16, 0x415a8f5c    # 13.66f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x3f2e147b    # 0.68f

    .line 350
    .line 351
    .line 352
    const v18, -0x3fceb852    # -2.77f

    .line 353
    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const/high16 v14, -0x40800000    # -1.0f

    .line 357
    .line 358
    const/high16 v15, 0x3e800000    # 0.25f

    .line 359
    .line 360
    const v16, -0x4007ae14    # -1.94f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x410147ae    # 8.08f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x40bd70a4    # -0.76f

    .line 373
    .line 374
    .line 375
    const v18, 0x3eae147b    # 0.34f

    .line 376
    .line 377
    .line 378
    const/high16 v13, -0x41800000    # -0.25f

    .line 379
    .line 380
    const v14, 0x3e051eb8    # 0.13f

    .line 381
    .line 382
    .line 383
    const/high16 v15, -0x41000000    # -0.5f

    .line 384
    .line 385
    const v16, 0x3e75c28f    # 0.24f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x4005c28f    # 2.09f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x400eb852    # 2.23f

    .line 398
    .line 399
    .line 400
    const v18, -0x408a3d71    # -0.96f

    .line 401
    .line 402
    .line 403
    const v13, 0x3f4ccccd    # 0.8f

    .line 404
    .line 405
    .line 406
    const v14, -0x41a8f5c3    # -0.21f

    .line 407
    .line 408
    .line 409
    const v15, 0x3fc66666    # 1.55f

    .line 410
    .line 411
    .line 412
    const v16, -0x40f5c28f    # -0.54f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x40251eb8    # 2.58f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x3fb47ae1    # 1.41f

    .line 425
    .line 426
    .line 427
    const v2, -0x404b851f    # -1.41f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x4088a3d7    # 4.27f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x40800000    # 4.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/16 v16, 0x3800

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/high16 v6, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/high16 v8, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const/high16 v9, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v12, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    const-string v4, ""

    .line 465
    .line 466
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    sput-object v0, Landroidx/compose/material/icons/twotone/SyncDisabledKt;->_syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 475
    .line 476
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    return-object v0
.end method

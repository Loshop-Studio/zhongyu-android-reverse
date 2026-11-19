.class public final Landroidx/compose/material/icons/filled/SyncDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSyncDisabled(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SyncDisabledKt;->_syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SyncDisabled"

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
    const v0, 0x40cb3333    # 6.35f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41200000    # 10.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x408851ec    # 4.26f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, -0x3ff147ae    # -2.23f

    .line 85
    .line 86
    .line 87
    const v18, 0x3f75c28f    # 0.96f

    .line 88
    .line 89
    .line 90
    const v13, -0x40b33333    # -0.8f

    .line 91
    .line 92
    .line 93
    const v14, 0x3e570a3d    # 0.21f

    .line 94
    .line 95
    .line 96
    const v15, -0x4039999a    # -1.55f

    .line 97
    .line 98
    .line 99
    const v16, 0x3f0a3d71    # 0.54f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x3fbae148    # 1.46f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f451eb8    # 0.77f

    .line 112
    .line 113
    .line 114
    const v18, -0x41570a3d    # -0.33f

    .line 115
    .line 116
    .line 117
    const/high16 v13, 0x3e800000    # 0.25f

    .line 118
    .line 119
    const v14, -0x420a3d71    # -0.12f

    .line 120
    .line 121
    .line 122
    const/high16 v15, 0x3f000000    # 0.5f

    .line 123
    .line 124
    const v16, -0x418a3d71    # -0.24f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x40ad1eb8    # 5.41f

    .line 134
    .line 135
    .line 136
    const v2, 0x40370a3d    # 2.86f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x40170a3d    # 2.36f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x40800000    # 4.0f

    .line 149
    .line 150
    const/high16 v18, 0x41400000    # 12.0f

    .line 151
    .line 152
    const v13, 0x408e6666    # 4.45f

    .line 153
    .line 154
    .line 155
    const v14, 0x410fd70a    # 8.99f

    .line 156
    .line 157
    .line 158
    const/high16 v15, 0x40800000    # 4.0f

    .line 159
    .line 160
    const v16, 0x41270a3d    # 10.44f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x40170a3d    # 2.36f

    .line 167
    .line 168
    .line 169
    const v18, 0x40b47ae1    # 5.64f

    .line 170
    .line 171
    .line 172
    const/4 v13, 0x0

    .line 173
    const v14, 0x400d70a4    # 2.21f

    .line 174
    .line 175
    .line 176
    const v15, 0x3f68f5c3    # 0.91f

    .line 177
    .line 178
    .line 179
    const v16, 0x40866666    # 4.2f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41a00000    # 20.0f

    .line 186
    .line 187
    const/high16 v2, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x40c00000    # 6.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, -0x3f400000    # -6.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x400f5c29    # 2.24f

    .line 203
    .line 204
    .line 205
    const v2, -0x3ff0a3d7    # -2.24f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x40c00000    # 6.0f

    .line 212
    .line 213
    const/high16 v18, 0x41400000    # 12.0f

    .line 214
    .line 215
    const v13, 0x40d5c28f    # 6.68f

    .line 216
    .line 217
    .line 218
    const v14, 0x41726666    # 15.15f

    .line 219
    .line 220
    .line 221
    const/high16 v15, 0x40c00000    # 6.0f

    .line 222
    .line 223
    const v16, 0x415a8f5c    # 13.66f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x3f2e147b    # 0.68f

    .line 230
    .line 231
    .line 232
    const v18, -0x3fceb852    # -2.77f

    .line 233
    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const/high16 v14, -0x40800000    # -1.0f

    .line 237
    .line 238
    const/high16 v15, 0x3e800000    # 0.25f

    .line 239
    .line 240
    const v16, -0x4007ae14    # -1.94f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x410147ae    # 8.08f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x40bae148    # -0.77f

    .line 253
    .line 254
    .line 255
    const v18, 0x3eae147b    # 0.34f

    .line 256
    .line 257
    .line 258
    const/high16 v13, -0x41800000    # -0.25f

    .line 259
    .line 260
    const v14, 0x3e051eb8    # 0.13f

    .line 261
    .line 262
    .line 263
    const/high16 v15, -0x41000000    # -0.5f

    .line 264
    .line 265
    const/high16 v16, 0x3e800000    # 0.25f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x4005c28f    # 2.09f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, 0x400eb852    # 2.23f

    .line 277
    .line 278
    .line 279
    const v18, -0x408a3d71    # -0.96f

    .line 280
    .line 281
    .line 282
    const v13, 0x3f4ccccd    # 0.8f

    .line 283
    .line 284
    .line 285
    const v14, -0x41a8f5c3    # -0.21f

    .line 286
    .line 287
    .line 288
    const v15, 0x3fc66666    # 1.55f

    .line 289
    .line 290
    .line 291
    const v16, -0x40f5c28f    # -0.54f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x40170a3d    # 2.36f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3fa28f5c    # 1.27f

    .line 304
    .line 305
    .line 306
    const v2, -0x405d70a4    # -1.27f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40847ae1    # 4.14f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40ad1eb8    # 5.41f

    .line 319
    .line 320
    .line 321
    const v2, 0x40370a3d    # 2.86f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41a00000    # 20.0f

    .line 331
    .line 332
    const/high16 v2, 0x40800000    # 4.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, -0x3f400000    # -6.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40c00000    # 6.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x400f5c29    # 2.24f

    .line 348
    .line 349
    .line 350
    const v2, -0x3ff0a3d7    # -2.24f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x41900000    # 18.0f

    .line 357
    .line 358
    const/high16 v18, 0x41400000    # 12.0f

    .line 359
    .line 360
    const v13, 0x418a8f5c    # 17.32f

    .line 361
    .line 362
    .line 363
    const v14, 0x410d999a    # 8.85f

    .line 364
    .line 365
    .line 366
    const/high16 v15, 0x41900000    # 18.0f

    .line 367
    .line 368
    const v16, 0x412570a4    # 10.34f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x40d1eb85    # -0.68f

    .line 375
    .line 376
    .line 377
    const v18, 0x403147ae    # 2.77f

    .line 378
    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const/high16 v14, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v15, -0x41800000    # -0.25f

    .line 384
    .line 385
    const v16, 0x3ff851ec    # 1.94f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3fbae148    # 1.46f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, 0x41a00000    # 20.0f

    .line 398
    .line 399
    const/high16 v18, 0x41400000    # 12.0f

    .line 400
    .line 401
    const v13, 0x419c6666    # 19.55f

    .line 402
    .line 403
    .line 404
    const v14, 0x417028f6    # 15.01f

    .line 405
    .line 406
    .line 407
    const/high16 v15, 0x41a00000    # 20.0f

    .line 408
    .line 409
    const v16, 0x4158f5c3    # 13.56f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x3fe8f5c3    # -2.36f

    .line 416
    .line 417
    .line 418
    const v18, -0x3f4b851f    # -5.64f

    .line 419
    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const v14, -0x3ff28f5c    # -2.21f

    .line 423
    .line 424
    .line 425
    const v15, -0x40970a3d    # -0.91f

    .line 426
    .line 427
    .line 428
    const v16, -0x3f79999a    # -4.2f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x41a00000    # 20.0f

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
    const/4 v14, 0x0

    .line 462
    const/4 v15, 0x0

    .line 463
    const-string v4, ""

    .line 464
    .line 465
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    sput-object v0, Landroidx/compose/material/icons/filled/SyncDisabledKt;->_syncDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-object v0
.end method

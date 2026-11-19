.class public final Landroidx/compose/material/icons/rounded/SyncProblemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _syncProblem:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSyncProblem(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SyncProblemKt;->_syncProblem:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SyncProblem"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x40170a3d    # 2.36f

    .line 78
    .line 79
    .line 80
    const v18, 0x40b47ae1    # 5.64f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, 0x400d70a4    # 2.21f

    .line 85
    .line 86
    .line 87
    const v15, 0x3f68f5c3    # 0.91f

    .line 88
    .line 89
    .line 90
    const v16, 0x40866666    # 4.2f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x3fc147ae    # 1.51f

    .line 97
    .line 98
    .line 99
    const v2, -0x403eb852    # -1.51f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x3eb851ec    # 0.36f

    .line 106
    .line 107
    .line 108
    const v18, 0x3f59999a    # 0.85f

    .line 109
    .line 110
    .line 111
    const v13, -0x416147ae    # -0.31f

    .line 112
    .line 113
    .line 114
    const v14, 0x3e9eb852    # 0.31f

    .line 115
    .line 116
    .line 117
    const v15, -0x4247ae14    # -0.09f

    .line 118
    .line 119
    .line 120
    const v16, 0x3f59999a    # 0.85f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x41080000    # 8.5f

    .line 127
    .line 128
    const/high16 v2, 0x41a00000    # 20.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x3f000000    # 0.5f

    .line 134
    .line 135
    const/high16 v18, -0x41000000    # -0.5f

    .line 136
    .line 137
    const v13, 0x3e8f5c29    # 0.28f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/high16 v15, 0x3f000000    # 0.5f

    .line 142
    .line 143
    const v16, -0x419eb852    # -0.22f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x3f76b852    # -4.29f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x40a66666    # -0.85f

    .line 156
    .line 157
    .line 158
    const v18, -0x414ccccd    # -0.35f

    .line 159
    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const v14, -0x4119999a    # -0.45f

    .line 163
    .line 164
    .line 165
    const v15, -0x40f5c28f    # -0.54f

    .line 166
    .line 167
    .line 168
    const v16, -0x40d47ae1    # -0.67f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3fb1eb85    # 1.39f

    .line 175
    .line 176
    .line 177
    const v2, -0x404e147b    # -1.39f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x40a00000    # 5.0f

    .line 184
    .line 185
    const/high16 v18, 0x41400000    # 12.0f

    .line 186
    .line 187
    const v13, 0x40b5c28f    # 5.68f

    .line 188
    .line 189
    .line 190
    const v14, 0x41726666    # 15.15f

    .line 191
    .line 192
    .line 193
    const/high16 v15, 0x40a00000    # 5.0f

    .line 194
    .line 195
    const v16, 0x415a8f5c    # 13.66f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x405b851f    # 3.43f

    .line 202
    .line 203
    .line 204
    const v18, -0x3f528f5c    # -5.42f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x3fe70a3d    # -2.39f

    .line 209
    .line 210
    .line 211
    const v15, 0x3fb33333    # 1.4f

    .line 212
    .line 213
    .line 214
    const v16, -0x3f7147ae    # -4.46f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3f11eb85    # 0.57f

    .line 221
    .line 222
    .line 223
    const v18, -0x40a8f5c3    # -0.84f

    .line 224
    .line 225
    .line 226
    const v13, 0x3eae147b    # 0.34f

    .line 227
    .line 228
    .line 229
    const v14, -0x41dc28f6    # -0.16f

    .line 230
    .line 231
    .line 232
    const v15, 0x3f11eb85    # 0.57f

    .line 233
    .line 234
    .line 235
    const v16, -0x410f5c29    # -0.47f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x41bd70a4    # -0.19f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x40570a3d    # -1.32f

    .line 248
    .line 249
    .line 250
    const v18, -0x40ae147b    # -0.82f

    .line 251
    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const v14, -0x40d1eb85    # -0.68f

    .line 255
    .line 256
    .line 257
    const v15, -0x40ca3d71    # -0.71f

    .line 258
    .line 259
    .line 260
    const v16, -0x4071eb85    # -1.11f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x40400000    # 3.0f

    .line 267
    .line 268
    const/high16 v18, 0x41400000    # 12.0f

    .line 269
    .line 270
    const v13, 0x409d70a4    # 4.92f

    .line 271
    .line 272
    .line 273
    const v14, 0x40bfae14    # 5.99f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x40400000    # 3.0f

    .line 277
    .line 278
    const v16, 0x410c51ec    # 8.77f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41300000    # 11.0f

    .line 288
    .line 289
    const/high16 v2, 0x41880000    # 17.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40000000    # 2.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, -0x40000000    # -2.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x419e51ec    # 19.79f

    .line 316
    .line 317
    .line 318
    const/high16 v2, 0x40800000    # 4.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41780000    # 15.5f

    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, -0x41000000    # -0.5f

    .line 329
    .line 330
    const/high16 v18, 0x3f000000    # 0.5f

    .line 331
    .line 332
    const v13, -0x4170a3d7    # -0.28f

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const/high16 v15, -0x41000000    # -0.5f

    .line 337
    .line 338
    const v16, 0x3e6147ae    # 0.22f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x408947ae    # 4.29f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3f59999a    # 0.85f

    .line 351
    .line 352
    .line 353
    const v18, 0x3eb33333    # 0.35f

    .line 354
    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, 0x3ee66666    # 0.45f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f0a3d71    # 0.54f

    .line 361
    .line 362
    .line 363
    const v16, 0x3f2b851f    # 0.67f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3fb1eb85    # 1.39f

    .line 370
    .line 371
    .line 372
    const v2, -0x404e147b    # -1.39f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41980000    # 19.0f

    .line 379
    .line 380
    const/high16 v18, 0x41400000    # 12.0f

    .line 381
    .line 382
    const v13, 0x41928f5c    # 18.32f

    .line 383
    .line 384
    .line 385
    const v14, 0x410d999a    # 8.85f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x41980000    # 19.0f

    .line 389
    .line 390
    const v16, 0x412570a4    # 10.34f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x3fa47ae1    # -3.43f

    .line 397
    .line 398
    .line 399
    const v18, 0x40ad70a4    # 5.42f

    .line 400
    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const v14, 0x4018f5c3    # 2.39f

    .line 404
    .line 405
    .line 406
    const v15, -0x404ccccd    # -1.4f

    .line 407
    .line 408
    .line 409
    const v16, 0x408eb852    # 4.46f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x40ee147b    # -0.57f

    .line 416
    .line 417
    .line 418
    const v18, 0x3f570a3d    # 0.84f

    .line 419
    .line 420
    .line 421
    const v13, -0x4151eb85    # -0.34f

    .line 422
    .line 423
    .line 424
    const v14, 0x3e23d70a    # 0.16f

    .line 425
    .line 426
    .line 427
    const v15, -0x40ee147b    # -0.57f

    .line 428
    .line 429
    .line 430
    const v16, 0x3ef0a3d7    # 0.47f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3e3851ec    # 0.18f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3fa8f5c3    # 1.32f

    .line 443
    .line 444
    .line 445
    const v18, 0x3f51eb85    # 0.82f

    .line 446
    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const v14, 0x3f2e147b    # 0.68f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f35c28f    # 0.71f

    .line 453
    .line 454
    .line 455
    const v16, 0x3f8e147b    # 1.11f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x41a80000    # 21.0f

    .line 462
    .line 463
    const/high16 v18, 0x41400000    # 12.0f

    .line 464
    .line 465
    const v13, 0x4198a3d7    # 19.08f

    .line 466
    .line 467
    .line 468
    const v14, 0x4190147b    # 18.01f

    .line 469
    .line 470
    .line 471
    const/high16 v15, 0x41a80000    # 21.0f

    .line 472
    .line 473
    const v16, 0x4173ae14    # 15.23f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, -0x3fe8f5c3    # -2.36f

    .line 480
    .line 481
    .line 482
    const v18, -0x3f4b851f    # -5.64f

    .line 483
    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    const v14, -0x3ff28f5c    # -2.21f

    .line 487
    .line 488
    .line 489
    const v15, -0x40970a3d    # -0.91f

    .line 490
    .line 491
    .line 492
    const v16, -0x3f79999a    # -4.2f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3fc147ae    # 1.51f

    .line 499
    .line 500
    .line 501
    const v2, -0x403eb852    # -1.51f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x4147ae14    # -0.36f

    .line 508
    .line 509
    .line 510
    const v18, -0x40a66666    # -0.85f

    .line 511
    .line 512
    .line 513
    const v13, 0x3e9eb852    # 0.31f

    .line 514
    .line 515
    .line 516
    const v14, -0x416147ae    # -0.31f

    .line 517
    .line 518
    .line 519
    const v15, 0x3db851ec    # 0.09f

    .line 520
    .line 521
    .line 522
    const v16, -0x40a66666    # -0.85f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x41500000    # 13.0f

    .line 532
    .line 533
    const/high16 v2, 0x41400000    # 12.0f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v18, -0x40800000    # -1.0f

    .line 541
    .line 542
    const v13, 0x3f0ccccd    # 0.55f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const/high16 v15, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const v16, -0x4119999a    # -0.45f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x41000000    # 8.0f

    .line 555
    .line 556
    const/high16 v2, 0x41500000    # 13.0f

    .line 557
    .line 558
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, -0x40800000    # -1.0f

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const v14, -0x40f33333    # -0.55f

    .line 565
    .line 566
    .line 567
    const v15, -0x4119999a    # -0.45f

    .line 568
    .line 569
    .line 570
    const/high16 v16, -0x40800000    # -1.0f

    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x3ee66666    # 0.45f

    .line 576
    .line 577
    .line 578
    const/high16 v2, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v4, -0x40800000    # -1.0f

    .line 581
    .line 582
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40800000    # 4.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/high16 v18, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const v14, 0x3f0ccccd    # 0.55f

    .line 595
    .line 596
    .line 597
    const v15, 0x3ee66666    # 0.45f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x3f800000    # 1.0f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/16 v16, 0x3800

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const/high16 v6, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v8, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const/high16 v9, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v12, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const/4 v15, 0x0

    .line 627
    const-string v4, ""

    .line 628
    .line 629
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    sput-object v0, Landroidx/compose/material/icons/rounded/SyncProblemKt;->_syncProblem:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 638
    .line 639
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/outlined/PermDataSettingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermDataSetting(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PermDataSetting"

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
    const v0, 0x41391eb8    # 11.57f

    .line 71
    .line 72
    .line 73
    const v2, 0x418feb85    # 17.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v2, 0x41a00000    # 20.0f

    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, 0x4138f5c3    # 11.56f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, -0x40000000    # -2.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x41900000    # 18.0f

    .line 103
    .line 104
    const v2, 0x409a8f5c    # 4.83f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, 0x409a8f5c    # 4.83f

    .line 111
    .line 112
    .line 113
    const v2, 0x418feb85    # 17.99f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x40d7ae14    # 6.74f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x41be28f6    # 23.77f

    .line 129
    .line 130
    .line 131
    const v2, 0x41a28f5c    # 20.32f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, -0x40770a3d    # -1.07f

    .line 138
    .line 139
    .line 140
    const v2, -0x40ab851f    # -0.83f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3d23d70a    # 0.04f

    .line 147
    .line 148
    .line 149
    const v18, -0x41051eb8    # -0.49f

    .line 150
    .line 151
    .line 152
    const v13, 0x3ca3d70a    # 0.02f

    .line 153
    .line 154
    .line 155
    const v14, -0x41dc28f6    # -0.16f

    .line 156
    .line 157
    .line 158
    const v15, 0x3d23d70a    # 0.04f

    .line 159
    .line 160
    .line 161
    const v16, -0x415c28f6    # -0.32f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, -0x42dc28f6    # -0.04f

    .line 168
    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x41d1eb85    # -0.17f

    .line 172
    .line 173
    .line 174
    const v15, -0x43dc28f6    # -0.01f

    .line 175
    .line 176
    .line 177
    const v16, -0x41570a3d    # -0.33f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x3f87ae14    # 1.06f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3d75c28f    # 0.06f

    .line 190
    .line 191
    .line 192
    const v18, -0x415c28f6    # -0.32f

    .line 193
    .line 194
    .line 195
    const v13, 0x3db851ec    # 0.09f

    .line 196
    .line 197
    .line 198
    const v14, -0x425c28f6    # -0.08f

    .line 199
    .line 200
    .line 201
    const v15, 0x3df5c28f    # 0.12f

    .line 202
    .line 203
    .line 204
    const v16, -0x41a8f5c3    # -0.21f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, -0x40228f5c    # -1.73f

    .line 211
    .line 212
    .line 213
    const/high16 v2, -0x40800000    # -1.0f

    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x416147ae    # -0.31f

    .line 219
    .line 220
    .line 221
    const v18, -0x421eb852    # -0.11f

    .line 222
    .line 223
    .line 224
    const v13, -0x428a3d71    # -0.06f

    .line 225
    .line 226
    .line 227
    const v14, -0x421eb852    # -0.11f

    .line 228
    .line 229
    .line 230
    const v15, -0x41bd70a4    # -0.19f

    .line 231
    .line 232
    .line 233
    const v16, -0x41e66666    # -0.15f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x3f000000    # 0.5f

    .line 240
    .line 241
    const v2, -0x406147ae    # -1.24f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x40a66666    # -0.85f

    .line 248
    .line 249
    .line 250
    const v18, -0x41051eb8    # -0.49f

    .line 251
    .line 252
    .line 253
    const v13, -0x417ae148    # -0.26f

    .line 254
    .line 255
    .line 256
    const v14, -0x41b33333    # -0.2f

    .line 257
    .line 258
    .line 259
    const v15, -0x40f5c28f    # -0.54f

    .line 260
    .line 261
    .line 262
    const v16, -0x41428f5c    # -0.37f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x40570a3d    # -1.32f

    .line 269
    .line 270
    .line 271
    const v2, -0x41bd70a4    # -0.19f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x418a3d71    # -0.24f

    .line 278
    .line 279
    .line 280
    const v18, -0x41a8f5c3    # -0.21f

    .line 281
    .line 282
    .line 283
    const v13, -0x43dc28f6    # -0.01f

    .line 284
    .line 285
    .line 286
    const v14, -0x420a3d71    # -0.12f

    .line 287
    .line 288
    .line 289
    const v15, -0x420a3d71    # -0.12f

    .line 290
    .line 291
    .line 292
    const v16, -0x41a8f5c3    # -0.21f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, -0x40000000    # -2.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x41800000    # -0.25f

    .line 304
    .line 305
    const v18, 0x3e570a3d    # 0.21f

    .line 306
    .line 307
    .line 308
    const v13, -0x420a3d71    # -0.12f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, -0x41947ae1    # -0.23f

    .line 313
    .line 314
    .line 315
    const v16, 0x3db851ec    # 0.09f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x3fa8f5c3    # 1.32f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x40a66666    # -0.85f

    .line 328
    .line 329
    .line 330
    const v18, 0x3efae148    # 0.49f

    .line 331
    .line 332
    .line 333
    const v13, -0x41666666    # -0.3f

    .line 334
    .line 335
    .line 336
    const v14, 0x3e051eb8    # 0.13f

    .line 337
    .line 338
    .line 339
    const v15, -0x40e8f5c3    # -0.59f

    .line 340
    .line 341
    .line 342
    const v16, 0x3e947ae1    # 0.29f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x41000000    # -0.5f

    .line 349
    .line 350
    const v2, -0x406147ae    # -1.24f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x416147ae    # -0.31f

    .line 357
    .line 358
    .line 359
    const v18, 0x3de147ae    # 0.11f

    .line 360
    .line 361
    .line 362
    const v13, -0x421eb852    # -0.11f

    .line 363
    .line 364
    .line 365
    const v14, -0x42dc28f6    # -0.04f

    .line 366
    .line 367
    .line 368
    const v15, -0x418a3d71    # -0.24f

    .line 369
    .line 370
    .line 371
    const/16 v16, 0x0

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3fdd70a4    # 1.73f

    .line 377
    .line 378
    .line 379
    const/high16 v2, -0x40800000    # -1.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x3d75c28f    # 0.06f

    .line 385
    .line 386
    .line 387
    const v18, 0x3ea3d70a    # 0.32f

    .line 388
    .line 389
    .line 390
    const v13, -0x428a3d71    # -0.06f

    .line 391
    .line 392
    .line 393
    const v14, 0x3de147ae    # 0.11f

    .line 394
    .line 395
    .line 396
    const v15, -0x42dc28f6    # -0.04f

    .line 397
    .line 398
    .line 399
    const v16, 0x3e75c28f    # 0.24f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3f547ae1    # 0.83f

    .line 406
    .line 407
    .line 408
    const v2, 0x3f87ae14    # 1.06f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x430a3d71    # -0.03f

    .line 415
    .line 416
    .line 417
    const v18, 0x3efae148    # 0.49f

    .line 418
    .line 419
    .line 420
    const v13, -0x435c28f6    # -0.02f

    .line 421
    .line 422
    .line 423
    const v14, 0x3e23d70a    # 0.16f

    .line 424
    .line 425
    .line 426
    const v15, -0x430a3d71    # -0.03f

    .line 427
    .line 428
    .line 429
    const v16, 0x3ea3d70a    # 0.32f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3cf5c28f    # 0.03f

    .line 436
    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const v14, 0x3e2e147b    # 0.17f

    .line 440
    .line 441
    .line 442
    const v15, 0x3c23d70a    # 0.01f

    .line 443
    .line 444
    .line 445
    const v16, 0x3ea8f5c3    # 0.33f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x407851ec    # -1.06f

    .line 452
    .line 453
    .line 454
    const v2, 0x3f547ae1    # 0.83f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x428a3d71    # -0.06f

    .line 461
    .line 462
    .line 463
    const v18, 0x3ea3d70a    # 0.32f

    .line 464
    .line 465
    .line 466
    const v13, -0x4247ae14    # -0.09f

    .line 467
    .line 468
    .line 469
    const v14, 0x3da3d70a    # 0.08f

    .line 470
    .line 471
    .line 472
    const v15, -0x420a3d71    # -0.12f

    .line 473
    .line 474
    .line 475
    const v16, 0x3e570a3d    # 0.21f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const v2, 0x3fdd70a4    # 1.73f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x3e9eb852    # 0.31f

    .line 490
    .line 491
    .line 492
    const v18, 0x3de147ae    # 0.11f

    .line 493
    .line 494
    .line 495
    const v13, 0x3d75c28f    # 0.06f

    .line 496
    .line 497
    .line 498
    const v14, 0x3de147ae    # 0.11f

    .line 499
    .line 500
    .line 501
    const v15, 0x3e428f5c    # 0.19f

    .line 502
    .line 503
    .line 504
    const v16, 0x3e19999a    # 0.15f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3f9eb852    # 1.24f

    .line 511
    .line 512
    .line 513
    const/high16 v2, -0x41000000    # -0.5f

    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x3f59999a    # 0.85f

    .line 519
    .line 520
    .line 521
    const v18, 0x3efae148    # 0.49f

    .line 522
    .line 523
    .line 524
    const v13, 0x3e851eb8    # 0.26f

    .line 525
    .line 526
    .line 527
    const v14, 0x3e4ccccd    # 0.2f

    .line 528
    .line 529
    .line 530
    const v15, 0x3f0a3d71    # 0.54f

    .line 531
    .line 532
    .line 533
    const v16, 0x3ebd70a4    # 0.37f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3e428f5c    # 0.19f

    .line 540
    .line 541
    .line 542
    const v2, 0x3fa8f5c3    # 1.32f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v17, 0x3e800000    # 0.25f

    .line 549
    .line 550
    const v18, 0x3e570a3d    # 0.21f

    .line 551
    .line 552
    .line 553
    const v13, 0x3ca3d70a    # 0.02f

    .line 554
    .line 555
    .line 556
    const v14, 0x3df5c28f    # 0.12f

    .line 557
    .line 558
    .line 559
    const v15, 0x3df5c28f    # 0.12f

    .line 560
    .line 561
    .line 562
    const v16, 0x3e570a3d    # 0.21f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x40000000    # 2.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v18, -0x41a8f5c3    # -0.21f

    .line 574
    .line 575
    .line 576
    const v13, 0x3df5c28f    # 0.12f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const v15, 0x3e6b851f    # 0.23f

    .line 581
    .line 582
    .line 583
    const v16, -0x4247ae14    # -0.09f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3e428f5c    # 0.19f

    .line 590
    .line 591
    .line 592
    const v2, -0x40570a3d    # -1.32f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x3f570a3d    # 0.84f

    .line 599
    .line 600
    .line 601
    const v18, -0x41051eb8    # -0.49f

    .line 602
    .line 603
    .line 604
    const v13, 0x3e99999a    # 0.3f

    .line 605
    .line 606
    .line 607
    const v14, -0x41fae148    # -0.13f

    .line 608
    .line 609
    .line 610
    const v15, 0x3f170a3d    # 0.59f

    .line 611
    .line 612
    .line 613
    const v16, -0x416b851f    # -0.29f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 620
    .line 621
    const/high16 v2, 0x3f000000    # 0.5f

    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x3e9eb852    # 0.31f

    .line 627
    .line 628
    .line 629
    const v18, -0x421eb852    # -0.11f

    .line 630
    .line 631
    .line 632
    const v13, 0x3de147ae    # 0.11f

    .line 633
    .line 634
    .line 635
    const v14, 0x3d23d70a    # 0.04f

    .line 636
    .line 637
    .line 638
    const v15, 0x3e75c28f    # 0.24f

    .line 639
    .line 640
    .line 641
    const/16 v16, 0x0

    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const v2, -0x40228f5c    # -1.73f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x428a3d71    # -0.06f

    .line 655
    .line 656
    .line 657
    const v18, -0x415c28f6    # -0.32f

    .line 658
    .line 659
    .line 660
    const v13, 0x3d75c28f    # 0.06f

    .line 661
    .line 662
    .line 663
    const v14, -0x421eb852    # -0.11f

    .line 664
    .line 665
    .line 666
    const v15, 0x3cf5c28f    # 0.03f

    .line 667
    .line 668
    .line 669
    const v16, -0x418a3d71    # -0.24f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x4197eb85    # 18.99f

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x41a40000    # 20.5f

    .line 682
    .line 683
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, -0x40400000    # -1.5f

    .line 687
    .line 688
    const/high16 v18, -0x40400000    # -1.5f

    .line 689
    .line 690
    const v13, -0x40ab851f    # -0.83f

    .line 691
    .line 692
    .line 693
    const/4 v14, 0x0

    .line 694
    const/high16 v15, -0x40400000    # -1.5f

    .line 695
    .line 696
    const v16, -0x40d47ae1    # -0.67f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, 0x3f2b851f    # 0.67f

    .line 703
    .line 704
    .line 705
    const/high16 v2, -0x40400000    # -1.5f

    .line 706
    .line 707
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 708
    .line 709
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 713
    .line 714
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, -0x40d47ae1    # -0.67f

    .line 718
    .line 719
    .line 720
    const/high16 v2, -0x40400000    # -1.5f

    .line 721
    .line 722
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    const/16 v16, 0x3800

    .line 733
    .line 734
    const/16 v17, 0x0

    .line 735
    .line 736
    const/high16 v6, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/high16 v8, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/4 v7, 0x0

    .line 741
    const/high16 v9, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/high16 v12, 0x3f800000    # 1.0f

    .line 744
    .line 745
    const/4 v13, 0x0

    .line 746
    const/4 v15, 0x0

    .line 747
    const-string v4, ""

    .line 748
    .line 749
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    sput-object v0, Landroidx/compose/material/icons/outlined/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 758
    .line 759
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    return-object v0
.end method

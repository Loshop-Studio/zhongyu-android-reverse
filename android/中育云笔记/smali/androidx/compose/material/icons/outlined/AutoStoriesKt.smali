.class public final Landroidx/compose/material/icons/outlined/AutoStoriesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoStories(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AutoStories"

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
    const v0, 0x41b3c28f    # 22.47f

    .line 71
    .line 72
    .line 73
    const v2, 0x40a66666    # 5.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41a80000    # 21.0f

    .line 80
    .line 81
    const v18, 0x4092e148    # 4.59f

    .line 82
    .line 83
    .line 84
    const/high16 v13, 0x41b00000    # 22.0f

    .line 85
    .line 86
    const v14, 0x409eb852    # 4.96f

    .line 87
    .line 88
    .line 89
    const v15, 0x41ac147b    # 21.51f

    .line 90
    .line 91
    .line 92
    const v16, 0x409851ec    # 4.76f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x41407ae1    # 12.03f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x418c0000    # 17.5f

    .line 105
    .line 106
    const/high16 v18, 0x41800000    # 16.0f

    .line 107
    .line 108
    const v13, 0x419ee148    # 19.86f

    .line 109
    .line 110
    .line 111
    const v14, 0x4181ae14    # 16.21f

    .line 112
    .line 113
    .line 114
    const v15, 0x4195851f    # 18.69f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x41800000    # 16.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, -0x3f500000    # -5.5f

    .line 123
    .line 124
    const v18, 0x3fca3d71    # 1.58f

    .line 125
    .line 126
    .line 127
    const v13, -0x400ccccd    # -1.9f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, -0x3f8e147b    # -3.78f

    .line 132
    .line 133
    .line 134
    const v16, 0x3f0a3d71    # 0.54f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x40af5c29    # 5.48f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40d00000    # 6.5f

    .line 147
    .line 148
    const/high16 v18, 0x40800000    # 4.0f

    .line 149
    .line 150
    const v13, 0x4126147b    # 10.38f

    .line 151
    .line 152
    .line 153
    const v14, 0x4091999a    # 4.55f

    .line 154
    .line 155
    .line 156
    const v15, 0x410828f6    # 8.51f

    .line 157
    .line 158
    .line 159
    const/high16 v16, 0x40800000    # 4.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x3fc3d70a    # 1.53f

    .line 165
    .line 166
    .line 167
    const v18, 0x40a66666    # 5.2f

    .line 168
    .line 169
    .line 170
    const v13, 0x4096b852    # 4.71f

    .line 171
    .line 172
    .line 173
    const/high16 v14, 0x40800000    # 4.0f

    .line 174
    .line 175
    const v15, 0x404147ae    # 3.02f

    .line 176
    .line 177
    .line 178
    const v16, 0x408e147b    # 4.44f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const v18, 0x40c28f5c    # 6.08f

    .line 187
    .line 188
    .line 189
    const v13, 0x3f99999a    # 1.2f

    .line 190
    .line 191
    .line 192
    const v14, 0x40ab851f    # 5.36f

    .line 193
    .line 194
    .line 195
    const/high16 v15, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const v16, 0x40b6b852    # 5.71f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x414147ae    # 12.08f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v18, 0x3f7d70a4    # 0.99f

    .line 210
    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, 0x3f147ae1    # 0.58f

    .line 214
    .line 215
    .line 216
    const v15, 0x3ef0a3d7    # 0.47f

    .line 217
    .line 218
    .line 219
    const v16, 0x3f7d70a4    # 0.99f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x3ef5c28f    # 0.48f

    .line 226
    .line 227
    .line 228
    const v18, -0x420a3d71    # -0.12f

    .line 229
    .line 230
    .line 231
    const v13, 0x3e23d70a    # 0.16f

    .line 232
    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const v15, 0x3ea3d70a    # 0.32f

    .line 236
    .line 237
    .line 238
    const v16, -0x42dc28f6    # -0.04f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40d00000    # 6.5f

    .line 245
    .line 246
    const/high16 v18, 0x41900000    # 18.0f

    .line 247
    .line 248
    const v13, 0x406c28f6    # 3.69f

    .line 249
    .line 250
    .line 251
    const v14, 0x41933333    # 18.4f

    .line 252
    .line 253
    .line 254
    const v15, 0x40a1999a    # 5.05f

    .line 255
    .line 256
    .line 257
    const/high16 v16, 0x41900000    # 18.0f

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x40b00000    # 5.5f

    .line 263
    .line 264
    const/high16 v18, 0x40000000    # 2.0f

    .line 265
    .line 266
    const v13, 0x40047ae1    # 2.07f

    .line 267
    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const v15, 0x407eb852    # 3.98f

    .line 271
    .line 272
    .line 273
    const v16, 0x3f51eb85    # 0.82f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v18, -0x40000000    # -2.0f

    .line 280
    .line 281
    const v13, 0x3fc28f5c    # 1.52f

    .line 282
    .line 283
    .line 284
    const v14, -0x4068f5c3    # -1.18f

    .line 285
    .line 286
    .line 287
    const v15, 0x405b851f    # 3.43f

    .line 288
    .line 289
    .line 290
    const/high16 v16, -0x40000000    # -2.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x4080a3d7    # 4.02f

    .line 296
    .line 297
    .line 298
    const v18, 0x3f851eb8    # 1.04f

    .line 299
    .line 300
    .line 301
    const v13, 0x3fb9999a    # 1.45f

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const v15, 0x4033d70a    # 2.81f

    .line 306
    .line 307
    .line 308
    const v16, 0x3ecccccd    # 0.4f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x3ef5c28f    # 0.48f

    .line 315
    .line 316
    .line 317
    const v18, 0x3df5c28f    # 0.12f

    .line 318
    .line 319
    .line 320
    const v13, 0x3e23d70a    # 0.16f

    .line 321
    .line 322
    .line 323
    const v14, 0x3da3d70a    # 0.08f

    .line 324
    .line 325
    .line 326
    const v15, 0x3ea3d70a    # 0.32f

    .line 327
    .line 328
    .line 329
    const v16, 0x3df5c28f    # 0.12f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const v18, -0x40828f5c    # -0.99f

    .line 338
    .line 339
    .line 340
    const v13, 0x3f051eb8    # 0.52f

    .line 341
    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const/high16 v15, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const v16, -0x412e147b    # -0.41f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x40c28f5c    # 6.08f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x41b3c28f    # 22.47f

    .line 359
    .line 360
    .line 361
    const v18, 0x40a66666    # 5.2f

    .line 362
    .line 363
    .line 364
    const/high16 v13, 0x41b80000    # 23.0f

    .line 365
    .line 366
    const v14, 0x40b6b852    # 5.71f

    .line 367
    .line 368
    .line 369
    const v15, 0x41b66666    # 22.8f

    .line 370
    .line 371
    .line 372
    const v16, 0x40ab851f    # 5.36f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41200000    # 10.0f

    .line 382
    .line 383
    const v2, 0x4184f5c3    # 16.62f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x40d00000    # 6.5f

    .line 390
    .line 391
    const/high16 v18, 0x41800000    # 16.0f

    .line 392
    .line 393
    const v13, 0x410dc28f    # 8.86f

    .line 394
    .line 395
    .line 396
    const v14, 0x4181ae14    # 16.21f

    .line 397
    .line 398
    .line 399
    const v15, 0x40f6147b    # 7.69f

    .line 400
    .line 401
    .line 402
    const/high16 v16, 0x41800000    # 16.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 408
    .line 409
    const v18, 0x3f1eb852    # 0.62f

    .line 410
    .line 411
    .line 412
    const v13, -0x4067ae14    # -1.19f

    .line 413
    .line 414
    .line 415
    const/4 v14, 0x0

    .line 416
    const v15, -0x3fe8f5c3    # -2.36f

    .line 417
    .line 418
    .line 419
    const v16, 0x3e570a3d    # 0.21f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x40d6b852    # 6.71f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x40d00000    # 6.5f

    .line 432
    .line 433
    const/high16 v18, 0x40c00000    # 6.0f

    .line 434
    .line 435
    const v13, 0x4083851f    # 4.11f

    .line 436
    .line 437
    .line 438
    const v14, 0x40c7ae14    # 6.24f

    .line 439
    .line 440
    .line 441
    const v15, 0x40a8f5c3    # 5.28f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x40c00000    # 6.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x41200000    # 10.0f

    .line 450
    .line 451
    const v18, 0x40d70a3d    # 6.72f

    .line 452
    .line 453
    .line 454
    const v13, 0x40f66666    # 7.7f

    .line 455
    .line 456
    .line 457
    const/high16 v14, 0x40c00000    # 6.0f

    .line 458
    .line 459
    const v15, 0x410e3d71    # 8.89f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x40c80000    # 6.25f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x4184f5c3    # 16.62f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41980000    # 19.0f

    .line 477
    .line 478
    const/high16 v2, 0x3f000000    # 0.5f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, -0x3f600000    # -5.0f

    .line 484
    .line 485
    const/high16 v2, 0x40a00000    # 5.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41700000    # 15.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x3f700000    # -4.5f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x3f000000    # 0.5f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    const/16 v16, 0x3800

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v8, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const/high16 v9, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v12, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const/4 v14, 0x0

    .line 527
    const/4 v15, 0x0

    .line 528
    const-string v4, ""

    .line 529
    .line 530
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    sput-object v0, Landroidx/compose/material/icons/outlined/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method

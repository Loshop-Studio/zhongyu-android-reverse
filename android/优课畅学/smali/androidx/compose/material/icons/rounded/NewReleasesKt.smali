.class public final Landroidx/compose/material/icons/rounded/NewReleasesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _newReleases:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNewReleases(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NewReleasesKt;->_newReleases:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NewReleases"

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
    const v0, 0x41b35c29    # 22.42f

    .line 71
    .line 72
    .line 73
    const v2, 0x413570a4    # 11.34f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3ff851ec    # -2.12f

    .line 80
    .line 81
    .line 82
    const v2, -0x4011eb85    # -1.86f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, -0x3fcc28f6    # -2.81f

    .line 89
    .line 90
    .line 91
    const v2, 0x3e851eb8    # 0.26f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x40bae148    # -0.77f

    .line 98
    .line 99
    .line 100
    const v18, -0x40770a3d    # -1.07f

    .line 101
    .line 102
    .line 103
    const v13, 0x3d4ccccd    # 0.05f

    .line 104
    .line 105
    .line 106
    const/high16 v14, -0x41000000    # -0.5f

    .line 107
    .line 108
    const v15, -0x416b851f    # -0.29f

    .line 109
    .line 110
    .line 111
    const v16, -0x408a3d71    # -0.96f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, -0x3fcf5c29    # -2.76f

    .line 118
    .line 119
    .line 120
    const v2, -0x40deb852    # -0.63f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x4047ae14    # -1.44f

    .line 127
    .line 128
    .line 129
    const v2, -0x3fe47ae1    # -2.43f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x40600000    # -1.25f

    .line 136
    .line 137
    const v18, -0x412e147b    # -0.41f

    .line 138
    .line 139
    .line 140
    const v13, -0x417ae148    # -0.26f

    .line 141
    .line 142
    .line 143
    const v14, -0x4123d70a    # -0.43f

    .line 144
    .line 145
    .line 146
    const v15, -0x40b5c28f    # -0.79f

    .line 147
    .line 148
    .line 149
    const v16, -0x40e3d70a    # -0.61f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x40400000    # 3.0f

    .line 156
    .line 157
    const/high16 v2, 0x41400000    # 12.0f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x41168f5c    # 9.41f

    .line 163
    .line 164
    .line 165
    const v2, 0x3ff1eb85    # 1.89f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v18, 0x3ed1eb85    # 0.41f

    .line 172
    .line 173
    .line 174
    const v13, -0x41147ae1    # -0.46f

    .line 175
    .line 176
    .line 177
    const v14, -0x41b33333    # -0.2f

    .line 178
    .line 179
    .line 180
    const/high16 v15, -0x40800000    # -1.0f

    .line 181
    .line 182
    const v16, -0x435c28f6    # -0.02f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x40d6b852    # 6.71f

    .line 189
    .line 190
    .line 191
    const v2, 0x40970a3d    # 4.72f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, -0x3fd00000    # -2.75f

    .line 198
    .line 199
    const v2, 0x3f1eb852    # 0.62f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x40b851ec    # -0.78f

    .line 206
    .line 207
    .line 208
    const v18, 0x3f88f5c3    # 1.07f

    .line 209
    .line 210
    .line 211
    const v13, -0x41051eb8    # -0.49f

    .line 212
    .line 213
    .line 214
    const v14, 0x3de147ae    # 0.11f

    .line 215
    .line 216
    .line 217
    const v15, -0x40ab851f    # -0.83f

    .line 218
    .line 219
    .line 220
    const v16, 0x3f0f5c29    # 0.56f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x40333333    # 2.8f

    .line 227
    .line 228
    .line 229
    const v2, 0x3e851eb8    # 0.26f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x400851ec    # 2.13f

    .line 236
    .line 237
    .line 238
    const v2, -0x4011eb85    # -1.86f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const v18, 0x3fa8f5c3    # 1.32f

    .line 247
    .line 248
    .line 249
    const v13, -0x41570a3d    # -0.33f

    .line 250
    .line 251
    .line 252
    const v14, 0x3ec28f5c    # 0.38f

    .line 253
    .line 254
    .line 255
    const v15, -0x41570a3d    # -0.33f

    .line 256
    .line 257
    .line 258
    const v16, 0x3f70a3d7    # 0.94f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x4007ae14    # 2.12f

    .line 265
    .line 266
    .line 267
    const v2, 0x3fee147b    # 1.86f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x40347ae1    # 2.82f

    .line 274
    .line 275
    .line 276
    const v2, -0x417ae148    # -0.26f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3f451eb8    # 0.77f

    .line 283
    .line 284
    .line 285
    const v18, 0x3f88f5c3    # 1.07f

    .line 286
    .line 287
    .line 288
    const v13, -0x42b33333    # -0.05f

    .line 289
    .line 290
    .line 291
    const/high16 v14, 0x3f000000    # 0.5f

    .line 292
    .line 293
    const v15, 0x3e947ae1    # 0.29f

    .line 294
    .line 295
    .line 296
    const v16, 0x3f75c28f    # 0.96f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3f2147ae    # 0.63f

    .line 303
    .line 304
    .line 305
    const v2, 0x4030a3d7    # 2.76f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x401ae148    # 2.42f

    .line 312
    .line 313
    .line 314
    const v2, 0x3fb851ec    # 1.44f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x3fa147ae    # 1.26f

    .line 321
    .line 322
    .line 323
    const v18, 0x3ed1eb85    # 0.41f

    .line 324
    .line 325
    .line 326
    const v13, 0x3e851eb8    # 0.26f

    .line 327
    .line 328
    .line 329
    const v14, 0x3edc28f6    # 0.43f

    .line 330
    .line 331
    .line 332
    const v15, 0x3f4a3d71    # 0.79f

    .line 333
    .line 334
    .line 335
    const v16, 0x3f1c28f6    # 0.61f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41a80000    # 21.0f

    .line 342
    .line 343
    const/high16 v2, 0x41400000    # 12.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x4025c28f    # 2.59f

    .line 349
    .line 350
    .line 351
    const v2, 0x3f8e147b    # 1.11f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 358
    .line 359
    const v18, -0x412e147b    # -0.41f

    .line 360
    .line 361
    .line 362
    const v13, 0x3eeb851f    # 0.46f

    .line 363
    .line 364
    .line 365
    const v14, 0x3e4ccccd    # 0.2f

    .line 366
    .line 367
    .line 368
    const/high16 v15, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const v16, 0x3ca3d70a    # 0.02f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3fb851ec    # 1.44f

    .line 377
    .line 378
    .line 379
    const v2, -0x3fe47ae1    # -2.43f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x4030a3d7    # 2.76f

    .line 386
    .line 387
    .line 388
    const v2, -0x40deb852    # -0.63f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x3f451eb8    # 0.77f

    .line 395
    .line 396
    .line 397
    const v18, -0x40770a3d    # -1.07f

    .line 398
    .line 399
    .line 400
    const v13, 0x3efae148    # 0.49f

    .line 401
    .line 402
    .line 403
    const v14, -0x421eb852    # -0.11f

    .line 404
    .line 405
    .line 406
    const v15, 0x3f51eb85    # 0.82f

    .line 407
    .line 408
    .line 409
    const v16, -0x40ee147b    # -0.57f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, -0x417ae148    # -0.26f

    .line 416
    .line 417
    .line 418
    const v2, -0x3fcc28f6    # -2.81f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x3fee147b    # 1.86f

    .line 425
    .line 426
    .line 427
    const v2, -0x3ff851ec    # -2.12f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3c23d70a    # 0.01f

    .line 434
    .line 435
    .line 436
    const v18, -0x4059999a    # -1.3f

    .line 437
    .line 438
    .line 439
    const v13, 0x3eae147b    # 0.34f

    .line 440
    .line 441
    .line 442
    const v14, -0x4147ae14    # -0.36f

    .line 443
    .line 444
    .line 445
    const v15, 0x3eae147b    # 0.34f

    .line 446
    .line 447
    .line 448
    const v16, -0x40947ae1    # -0.92f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41880000    # 17.0f

    .line 458
    .line 459
    const/high16 v2, 0x41500000    # 13.0f

    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, -0x40000000    # -2.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40000000    # 2.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41500000    # 13.0f

    .line 484
    .line 485
    const/high16 v2, 0x41400000    # 12.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40800000    # -1.0f

    .line 491
    .line 492
    const/high16 v18, -0x40800000    # -1.0f

    .line 493
    .line 494
    const v13, -0x40f33333    # -0.55f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v16, -0x4119999a    # -0.45f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41300000    # 11.0f

    .line 507
    .line 508
    const/high16 v2, 0x41000000    # 8.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    const v14, -0x40f33333    # -0.55f

    .line 517
    .line 518
    .line 519
    const v15, 0x3ee66666    # 0.45f

    .line 520
    .line 521
    .line 522
    const/high16 v16, -0x40800000    # -1.0f

    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x3f800000    # 1.0f

    .line 531
    .line 532
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40800000    # 4.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, -0x40800000    # -1.0f

    .line 541
    .line 542
    const/high16 v18, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const v14, 0x3f0ccccd    # 0.55f

    .line 545
    .line 546
    .line 547
    const v15, -0x4119999a    # -0.45f

    .line 548
    .line 549
    .line 550
    const/high16 v16, 0x3f800000    # 1.0f

    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/16 v16, 0x3800

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/high16 v6, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v8, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const/high16 v9, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v12, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    const-string v4, ""

    .line 578
    .line 579
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sput-object v0, Landroidx/compose/material/icons/rounded/NewReleasesKt;->_newReleases:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-object v0
.end method

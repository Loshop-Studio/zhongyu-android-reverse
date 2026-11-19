.class public final Landroidx/compose/material/icons/rounded/RttKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rtt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRtt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RttKt;->_rtt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Rtt"

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
    const v0, 0x410c28f6    # 8.76f

    .line 71
    .line 72
    .line 73
    const v2, 0x4096147b    # 4.69f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x41026666    # 8.15f

    .line 80
    .line 81
    .line 82
    const v2, 0x410947ae    # 8.58f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3fa3d70a    # 1.28f

    .line 89
    .line 90
    .line 91
    const v18, 0x3fbeb852    # 1.49f

    .line 92
    .line 93
    .line 94
    const v13, -0x420a3d71    # -0.12f

    .line 95
    .line 96
    .line 97
    const v14, 0x3f47ae14    # 0.78f

    .line 98
    .line 99
    .line 100
    const v15, 0x3ef5c28f    # 0.48f

    .line 101
    .line 102
    .line 103
    const v16, 0x3fbeb852    # 1.49f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v18, -0x40747ae1    # -1.09f

    .line 114
    .line 115
    .line 116
    const v13, 0x3f23d70a    # 0.64f

    .line 117
    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    const v15, 0x3f970a3d    # 1.18f

    .line 121
    .line 122
    .line 123
    const v16, -0x41147ae1    # -0.46f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x3f07ae14    # 0.53f

    .line 130
    .line 131
    .line 132
    const v2, -0x3fa5c28f    # -3.41f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40251eb8    # 2.58f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x413ccccd    # 11.8f

    .line 145
    .line 146
    .line 147
    const v2, 0x419370a4    # 18.43f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x406147ae    # -1.24f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, -0x405eb852    # -1.26f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f8a3d71    # 1.08f

    .line 163
    .line 164
    .line 165
    const v13, -0x40deb852    # -0.63f

    .line 166
    .line 167
    .line 168
    const v15, -0x406b851f    # -1.16f

    .line 169
    .line 170
    .line 171
    const v16, 0x3eeb851f    # 0.46f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x3c23d70a    # 0.01f

    .line 178
    .line 179
    .line 180
    const/4 v2, 0x0

    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x4128f5c3    # 10.56f

    .line 185
    .line 186
    .line 187
    const/high16 v18, 0x41a80000    # 21.0f

    .line 188
    .line 189
    const v13, 0x4112b852    # 9.17f

    .line 190
    .line 191
    .line 192
    const v14, 0x41a26666    # 20.3f

    .line 193
    .line 194
    .line 195
    const v15, 0x411c51ec    # 9.77f

    .line 196
    .line 197
    .line 198
    const/high16 v16, 0x41a80000    # 21.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x409570a4    # 4.67f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3fa147ae    # 1.26f

    .line 210
    .line 211
    .line 212
    const v18, -0x4075c28f    # -1.08f

    .line 213
    .line 214
    .line 215
    const v13, 0x3f2147ae    # 0.63f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const v15, 0x3f95c28f    # 1.17f

    .line 220
    .line 221
    .line 222
    const v16, -0x41147ae1    # -0.46f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x43dc28f6    # -0.01f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x405eb852    # -1.26f

    .line 235
    .line 236
    .line 237
    const v18, -0x40428f5c    # -1.48f

    .line 238
    .line 239
    .line 240
    const v13, 0x3df5c28f    # 0.12f

    .line 241
    .line 242
    .line 243
    const v14, -0x40b851ec    # -0.78f

    .line 244
    .line 245
    .line 246
    const v15, -0x410a3d71    # -0.48f

    .line 247
    .line 248
    .line 249
    const v16, -0x40428f5c    # -1.48f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x40a3d70a    # -0.86f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40000000    # 2.0f

    .line 262
    .line 263
    const v2, -0x3eb23d71    # -12.86f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x40251eb8    # 2.58f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x410f5c29    # -0.47f

    .line 276
    .line 277
    .line 278
    const v2, 0x4040a3d7    # 3.01f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3fa3d70a    # 1.28f

    .line 285
    .line 286
    .line 287
    const v18, 0x3fbeb852    # 1.49f

    .line 288
    .line 289
    .line 290
    const v13, -0x420a3d71    # -0.12f

    .line 291
    .line 292
    .line 293
    const v14, 0x3f47ae14    # 0.78f

    .line 294
    .line 295
    .line 296
    const v15, 0x3ef5c28f    # 0.48f

    .line 297
    .line 298
    .line 299
    const v16, 0x3fbeb852    # 1.49f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x3cf5c28f    # 0.03f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v18, -0x40747ae1    # -1.09f

    .line 312
    .line 313
    .line 314
    const v13, 0x3f23d70a    # 0.64f

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const v15, 0x3f970a3d    # 1.18f

    .line 319
    .line 320
    .line 321
    const v16, -0x41147ae1    # -0.46f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x3f11eb85    # 0.57f

    .line 328
    .line 329
    .line 330
    const v2, -0x3f951eb8    # -3.67f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x419d47ae    # 19.66f

    .line 337
    .line 338
    .line 339
    const/high16 v18, 0x40400000    # 3.0f

    .line 340
    .line 341
    const v13, 0x41aea3d7    # 21.83f

    .line 342
    .line 343
    .line 344
    const v14, 0x4082e148    # 4.09f

    .line 345
    .line 346
    .line 347
    const v15, 0x41a71eb8    # 20.89f

    .line 348
    .line 349
    .line 350
    const/high16 v16, 0x40400000    # 3.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x3ef147ae    # -8.92f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x410c28f6    # 8.76f

    .line 362
    .line 363
    .line 364
    const v18, 0x4096147b    # 4.69f

    .line 365
    .line 366
    .line 367
    const v13, 0x411c28f6    # 9.76f

    .line 368
    .line 369
    .line 370
    const/high16 v14, 0x40400000    # 3.0f

    .line 371
    .line 372
    const v15, 0x410eb852    # 8.92f

    .line 373
    .line 374
    .line 375
    const v16, 0x406e147b    # 3.72f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x40a00000    # 5.0f

    .line 385
    .line 386
    const/high16 v2, 0x41000000    # 8.0f

    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x409b851f    # 4.86f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x4077ae14    # 3.87f

    .line 398
    .line 399
    .line 400
    const v18, 0x40bb3333    # 5.85f

    .line 401
    .line 402
    .line 403
    const v13, 0x408b851f    # 4.36f

    .line 404
    .line 405
    .line 406
    const/high16 v14, 0x40a00000    # 5.0f

    .line 407
    .line 408
    const v15, 0x407c28f6    # 3.94f

    .line 409
    .line 410
    .line 411
    const v16, 0x40ab851f    # 5.36f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/4 v0, 0x0

    .line 418
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x409b851f    # 4.86f

    .line 422
    .line 423
    .line 424
    const/high16 v18, 0x40e00000    # 7.0f

    .line 425
    .line 426
    const v13, 0x407147ae    # 3.77f

    .line 427
    .line 428
    .line 429
    const v14, 0x40ce6666    # 6.45f

    .line 430
    .line 431
    .line 432
    const v15, 0x4087ae14    # 4.24f

    .line 433
    .line 434
    .line 435
    const/high16 v16, 0x40e00000    # 7.0f

    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x40351eb8    # 2.83f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40a00000    # 5.0f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41100000    # 9.0f

    .line 455
    .line 456
    const v2, 0x40ec7ae1    # 7.39f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40880000    # 4.25f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, 0x4050a3d7    # 3.26f

    .line 468
    .line 469
    .line 470
    const v18, 0x411d999a    # 9.85f

    .line 471
    .line 472
    .line 473
    const/high16 v13, 0x40700000    # 3.75f

    .line 474
    .line 475
    const/high16 v14, 0x41100000    # 9.0f

    .line 476
    .line 477
    const v15, 0x40551eb8    # 3.33f

    .line 478
    .line 479
    .line 480
    const v16, 0x4115c28f    # 9.36f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/4 v0, 0x0

    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x40880000    # 4.25f

    .line 491
    .line 492
    const/high16 v18, 0x41300000    # 11.0f

    .line 493
    .line 494
    const v13, 0x404a3d71    # 3.16f

    .line 495
    .line 496
    .line 497
    const v14, 0x41273333    # 10.45f

    .line 498
    .line 499
    .line 500
    const v15, 0x406851ec    # 3.63f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x41300000    # 11.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40351eb8    # 2.83f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41100000    # 9.0f

    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41880000    # 17.0f

    .line 523
    .line 524
    const v2, 0x4104f5c3    # 8.31f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x404ae148    # 3.17f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, -0x40828f5c    # -0.99f

    .line 537
    .line 538
    .line 539
    const v18, 0x3f59999a    # 0.85f

    .line 540
    .line 541
    .line 542
    const v13, -0x41051eb8    # -0.49f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const v15, -0x40970a3d    # -0.91f

    .line 547
    .line 548
    .line 549
    const v16, 0x3eb851ec    # 0.36f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/4 v0, 0x0

    .line 556
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x404ae148    # 3.17f

    .line 560
    .line 561
    .line 562
    const/high16 v18, 0x41980000    # 19.0f

    .line 563
    .line 564
    const v13, 0x40051eb8    # 2.08f

    .line 565
    .line 566
    .line 567
    const v14, 0x4193999a    # 18.45f

    .line 568
    .line 569
    .line 570
    const v15, 0x40233333    # 2.55f

    .line 571
    .line 572
    .line 573
    const/high16 v16, 0x41980000    # 19.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41000000    # 8.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x41880000    # 17.0f

    .line 584
    .line 585
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x41500000    # 13.0f

    .line 592
    .line 593
    const v2, 0x410ee148    # 8.93f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x40728f5c    # 3.79f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x40828f5c    # -0.99f

    .line 606
    .line 607
    .line 608
    const v18, 0x3f59999a    # 0.85f

    .line 609
    .line 610
    .line 611
    const v13, -0x41051eb8    # -0.49f

    .line 612
    .line 613
    .line 614
    const/4 v14, 0x0

    .line 615
    const v15, -0x40970a3d    # -0.91f

    .line 616
    .line 617
    .line 618
    const v16, 0x3eb851ec    # 0.36f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/4 v0, 0x0

    .line 625
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x40728f5c    # 3.79f

    .line 629
    .line 630
    .line 631
    const/high16 v18, 0x41700000    # 15.0f

    .line 632
    .line 633
    const v13, 0x402ccccd    # 2.7f

    .line 634
    .line 635
    .line 636
    const v14, 0x41673333    # 14.45f

    .line 637
    .line 638
    .line 639
    const v15, 0x404ae148    # 3.17f

    .line 640
    .line 641
    .line 642
    const/high16 v16, 0x41700000    # 15.0f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x409ae148    # 4.84f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41500000    # 13.0f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    const/16 v16, 0x3800

    .line 666
    .line 667
    const/16 v17, 0x0

    .line 668
    .line 669
    const/high16 v6, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/high16 v8, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    const/high16 v9, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/high16 v12, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v13, 0x0

    .line 679
    const/4 v14, 0x0

    .line 680
    const/4 v15, 0x0

    .line 681
    const-string v4, ""

    .line 682
    .line 683
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    sput-object v0, Landroidx/compose/material/icons/rounded/RttKt;->_rtt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 692
    .line 693
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    return-object v0
.end method

.method public static synthetic getRtt$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

.class public final Landroidx/compose/material/icons/rounded/PhoneBluetoothSpeakerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneBluetoothSpeaker(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhoneBluetoothSpeaker"

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
    const v0, 0x4199d70a    # 19.23f

    .line 71
    .line 72
    .line 73
    const v2, 0x417428f6    # 15.26f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fdd70a4    # -2.54f

    .line 80
    .line 81
    .line 82
    const v2, -0x416b851f    # -0.29f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x402e147b    # -1.64f

    .line 89
    .line 90
    .line 91
    const v18, 0x3f11eb85    # 0.57f

    .line 92
    .line 93
    .line 94
    const v13, -0x40e3d70a    # -0.61f

    .line 95
    .line 96
    .line 97
    const v14, -0x4270a3d7    # -0.07f

    .line 98
    .line 99
    .line 100
    const v15, -0x40651eb8    # -1.21f

    .line 101
    .line 102
    .line 103
    const v16, 0x3e0f5c29    # 0.14f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x40147ae1    # -1.84f

    .line 110
    .line 111
    .line 112
    const v2, 0x3feb851f    # 1.84f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3f2d1eb8    # -6.59f

    .line 119
    .line 120
    .line 121
    const v18, -0x3f2d1eb8    # -6.59f

    .line 122
    .line 123
    .line 124
    const v13, -0x3fcae148    # -2.83f

    .line 125
    .line 126
    .line 127
    const v14, -0x4047ae14    # -1.44f

    .line 128
    .line 129
    .line 130
    const v15, -0x3f5b3333    # -5.15f

    .line 131
    .line 132
    .line 133
    const/high16 v16, -0x3f900000    # -3.75f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3feccccd    # 1.85f

    .line 139
    .line 140
    .line 141
    const v2, -0x40133333    # -1.85f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x3f11eb85    # 0.57f

    .line 148
    .line 149
    .line 150
    const v18, -0x402e147b    # -1.64f

    .line 151
    .line 152
    .line 153
    const v13, 0x3edc28f6    # 0.43f

    .line 154
    .line 155
    .line 156
    const v14, -0x4123d70a    # -0.43f

    .line 157
    .line 158
    .line 159
    const v15, 0x3f23d70a    # 0.64f

    .line 160
    .line 161
    .line 162
    const v16, -0x407c28f6    # -1.03f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, -0x3fdeb852    # -2.52f

    .line 169
    .line 170
    .line 171
    const v2, -0x416b851f    # -0.29f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, -0x400147ae    # -1.99f

    .line 178
    .line 179
    .line 180
    const v18, -0x401d70a4    # -1.77f

    .line 181
    .line 182
    .line 183
    const v13, -0x420a3d71    # -0.12f

    .line 184
    .line 185
    .line 186
    const v14, -0x407eb852    # -1.01f

    .line 187
    .line 188
    .line 189
    const v15, -0x4087ae14    # -0.97f

    .line 190
    .line 191
    .line 192
    const v16, -0x401d70a4    # -1.77f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x40a0f5c3    # 5.03f

    .line 199
    .line 200
    .line 201
    const v2, 0x4040a3d7    # 3.01f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, -0x40000000    # -2.0f

    .line 208
    .line 209
    const v18, 0x40047ae1    # 2.07f

    .line 210
    .line 211
    .line 212
    const v13, -0x406f5c29    # -1.13f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const v15, -0x3ffb851f    # -2.07f

    .line 217
    .line 218
    .line 219
    const v16, 0x3f70a3d7    # 0.94f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x417e3d71    # 15.89f

    .line 226
    .line 227
    .line 228
    const v18, 0x417e3d71    # 15.89f

    .line 229
    .line 230
    .line 231
    const v13, 0x3f07ae14    # 0.53f

    .line 232
    .line 233
    .line 234
    const v14, 0x4108a3d7    # 8.54f

    .line 235
    .line 236
    .line 237
    const v15, 0x40eb851f    # 7.36f

    .line 238
    .line 239
    .line 240
    const v16, 0x4175c28f    # 15.36f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x40047ae1    # 2.07f

    .line 247
    .line 248
    .line 249
    const/high16 v18, -0x40000000    # -2.0f

    .line 250
    .line 251
    const v13, 0x3f90a3d7    # 1.13f

    .line 252
    .line 253
    .line 254
    const v14, 0x3d8f5c29    # 0.07f

    .line 255
    .line 256
    .line 257
    const v15, 0x40047ae1    # 2.07f

    .line 258
    .line 259
    .line 260
    const v16, -0x40a147ae    # -0.87f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x40228f5c    # -1.73f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x401eb852    # -1.76f

    .line 273
    .line 274
    .line 275
    const v18, -0x40028f5c    # -1.98f

    .line 276
    .line 277
    .line 278
    const v13, 0x3c23d70a    # 0.01f

    .line 279
    .line 280
    .line 281
    const v14, -0x407eb852    # -1.01f

    .line 282
    .line 283
    .line 284
    const/high16 v15, -0x40c00000    # -0.75f

    .line 285
    .line 286
    const v16, -0x4011eb85    # -1.86f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x418651ec    # 16.79f

    .line 296
    .line 297
    .line 298
    const v2, 0x40c051ec    # 6.01f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, -0x3fe33333    # -2.45f

    .line 305
    .line 306
    .line 307
    const v2, 0x401ccccd    # 2.45f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const v18, 0x3f35c28f    # 0.71f

    .line 316
    .line 317
    .line 318
    const v13, -0x41b33333    # -0.2f

    .line 319
    .line 320
    .line 321
    const v14, 0x3e4ccccd    # 0.2f

    .line 322
    .line 323
    .line 324
    const v15, -0x41b33333    # -0.2f

    .line 325
    .line 326
    .line 327
    const v16, 0x3f051eb8    # 0.52f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3f35c28f    # 0.71f

    .line 334
    .line 335
    .line 336
    const/16 v18, 0x0

    .line 337
    .line 338
    const v13, 0x3e4ccccd    # 0.2f

    .line 339
    .line 340
    .line 341
    const v15, 0x3f051eb8    # 0.52f

    .line 342
    .line 343
    .line 344
    const v16, 0x3e4ccccd    # 0.2f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41880000    # 17.0f

    .line 351
    .line 352
    const v2, 0x40e75c29    # 7.23f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x4049999a    # 3.15f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x3e9eb852    # 0.31f

    .line 365
    .line 366
    .line 367
    const v18, 0x3ef0a3d7    # 0.47f

    .line 368
    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    const v15, 0x3df5c28f    # 0.12f

    .line 372
    .line 373
    .line 374
    const v16, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3e428f5c    # 0.19f

    .line 381
    .line 382
    .line 383
    const v18, 0x3d23d70a    # 0.04f

    .line 384
    .line 385
    .line 386
    const v13, 0x3d75c28f    # 0.06f

    .line 387
    .line 388
    .line 389
    const v14, 0x3cf5c28f    # 0.03f

    .line 390
    .line 391
    .line 392
    const v15, 0x3e051eb8    # 0.13f

    .line 393
    .line 394
    .line 395
    const v16, 0x3d23d70a    # 0.04f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3eb851ec    # 0.36f

    .line 402
    .line 403
    .line 404
    const v18, -0x41e66666    # -0.15f

    .line 405
    .line 406
    .line 407
    const v13, 0x3e051eb8    # 0.13f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, 0x3e851eb8    # 0.26f

    .line 412
    .line 413
    .line 414
    const v16, -0x42b33333    # -0.05f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x400b851f    # 2.18f

    .line 421
    .line 422
    .line 423
    const v2, -0x3ff47ae1    # -2.18f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/16 v17, 0x0

    .line 430
    .line 431
    const v18, -0x40ca3d71    # -0.71f

    .line 432
    .line 433
    .line 434
    const v13, 0x3e4ccccd    # 0.2f

    .line 435
    .line 436
    .line 437
    const v14, -0x41b33333    # -0.2f

    .line 438
    .line 439
    .line 440
    const v15, 0x3e4ccccd    # 0.2f

    .line 441
    .line 442
    .line 443
    const v16, -0x40fae148    # -0.52f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x4015c28f    # -1.83f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x3fea3d71    # 1.83f

    .line 456
    .line 457
    .line 458
    const v2, -0x4015c28f    # -1.83f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x3e19999a    # 0.15f

    .line 465
    .line 466
    .line 467
    const v18, -0x4147ae14    # -0.36f

    .line 468
    .line 469
    .line 470
    const v13, 0x3db851ec    # 0.09f

    .line 471
    .line 472
    .line 473
    const v14, -0x4247ae14    # -0.09f

    .line 474
    .line 475
    .line 476
    const v15, 0x3e19999a    # 0.15f

    .line 477
    .line 478
    .line 479
    const v16, -0x419eb852    # -0.22f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x41e66666    # -0.15f

    .line 486
    .line 487
    .line 488
    const v2, -0x4147ae14    # -0.36f

    .line 489
    .line 490
    .line 491
    const v4, -0x42b33333    # -0.05f

    .line 492
    .line 493
    .line 494
    const v6, -0x417ae148    # -0.26f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, -0x3ff47ae1    # -2.18f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x40f33333    # -0.55f

    .line 507
    .line 508
    .line 509
    const v18, -0x421eb852    # -0.11f

    .line 510
    .line 511
    .line 512
    const v13, -0x41f0a3d7    # -0.14f

    .line 513
    .line 514
    .line 515
    const v14, -0x41f0a3d7    # -0.14f

    .line 516
    .line 517
    .line 518
    const v15, -0x4147ae14    # -0.36f

    .line 519
    .line 520
    .line 521
    const v16, -0x41bd70a4    # -0.19f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, -0x416147ae    # -0.31f

    .line 528
    .line 529
    .line 530
    const v18, 0x3eeb851f    # 0.46f

    .line 531
    .line 532
    .line 533
    const v13, -0x41bd70a4    # -0.19f

    .line 534
    .line 535
    .line 536
    const v14, 0x3da3d70a    # 0.08f

    .line 537
    .line 538
    .line 539
    const v15, -0x416147ae    # -0.31f

    .line 540
    .line 541
    .line 542
    const v16, 0x3e851eb8    # 0.26f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x4049999a    # 3.15f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x40066666    # -1.95f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x40ca3d71    # -0.71f

    .line 561
    .line 562
    .line 563
    const/16 v18, 0x0

    .line 564
    .line 565
    const v13, -0x41b33333    # -0.2f

    .line 566
    .line 567
    .line 568
    const v14, -0x41b33333    # -0.2f

    .line 569
    .line 570
    .line 571
    const v15, -0x40fae148    # -0.52f

    .line 572
    .line 573
    .line 574
    const v16, -0x41b33333    # -0.2f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const v18, 0x3f35c28f    # 0.71f

    .line 583
    .line 584
    .line 585
    const v14, 0x3e4ccccd    # 0.2f

    .line 586
    .line 587
    .line 588
    const v15, -0x41b33333    # -0.2f

    .line 589
    .line 590
    .line 591
    const v16, 0x3f051eb8    # 0.52f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, 0x401d70a4    # 2.46f

    .line 598
    .line 599
    .line 600
    const v2, 0x401ccccd    # 2.45f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x40370a3d    # 2.86f

    .line 610
    .line 611
    .line 612
    const v2, 0x4190147b    # 18.01f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, 0x3f75c28f    # 0.96f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, -0x408a3d71    # -0.96f

    .line 625
    .line 626
    .line 627
    const v2, 0x3f75c28f    # 0.96f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, 0x40370a3d    # 2.86f

    .line 634
    .line 635
    .line 636
    const v2, 0x4190147b    # 18.01f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x40e75c29    # 7.23f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, 0x3f75c28f    # 0.96f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x408a3d71    # -0.96f

    .line 658
    .line 659
    .line 660
    const v2, 0x3f75c28f    # 0.96f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v0, 0x40e75c29    # 7.23f

    .line 667
    .line 668
    .line 669
    const v2, 0x4190147b    # 18.01f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    const/16 v16, 0x3800

    .line 683
    .line 684
    const/16 v17, 0x0

    .line 685
    .line 686
    const/high16 v6, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/high16 v8, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/4 v7, 0x0

    .line 691
    const/high16 v9, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/high16 v12, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v13, 0x0

    .line 696
    const/4 v14, 0x0

    .line 697
    const/4 v15, 0x0

    .line 698
    const-string v4, ""

    .line 699
    .line 700
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-object v0
.end method

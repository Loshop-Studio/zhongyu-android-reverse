.class public final Landroidx/compose/material/icons/twotone/LanguageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _language:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLanguage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Language"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const v6, 0x40a28f5c    # 5.08f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x403ccccd    # 2.95f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x3fb0a3d7    # 1.38f

    .line 85
    .line 86
    .line 87
    const v26, -0x3f9c28f6    # -3.56f

    .line 88
    .line 89
    .line 90
    const v21, 0x3ea3d70a    # 0.32f

    .line 91
    .line 92
    .line 93
    const/high16 v22, -0x40600000    # -1.25f

    .line 94
    .line 95
    const v23, 0x3f47ae14    # 0.78f

    .line 96
    .line 97
    .line 98
    const v24, -0x3fe33333    # -2.45f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, -0x3f7570a4    # -4.33f

    .line 107
    .line 108
    .line 109
    const v26, 0x4063d70a    # 3.56f

    .line 110
    .line 111
    .line 112
    const v21, -0x40147ae1    # -1.84f

    .line 113
    .line 114
    .line 115
    const v22, 0x3f2147ae    # 0.63f

    .line 116
    .line 117
    .line 118
    const v23, -0x3fa851ec    # -3.37f

    .line 119
    .line 120
    .line 121
    const v24, 0x3ff33333    # 1.9f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40f00000    # 7.5f

    .line 131
    .line 132
    const/high16 v6, 0x41400000    # 12.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, 0x3e0f5c29    # 0.14f

    .line 138
    .line 139
    .line 140
    const/high16 v26, -0x40000000    # -2.0f

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const v22, -0x40d1eb85    # -0.68f

    .line 145
    .line 146
    .line 147
    const v23, 0x3d75c28f    # 0.06f

    .line 148
    .line 149
    .line 150
    const v24, -0x40547ae1    # -1.34f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x408851ec    # 4.26f

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41200000    # 10.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, -0x417ae148    # -0.26f

    .line 165
    .line 166
    .line 167
    const/high16 v26, 0x40000000    # 2.0f

    .line 168
    .line 169
    const v21, -0x41dc28f6    # -0.16f

    .line 170
    .line 171
    .line 172
    const v22, 0x3f23d70a    # 0.64f

    .line 173
    .line 174
    .line 175
    const v23, -0x417ae148    # -0.26f

    .line 176
    .line 177
    .line 178
    const v24, 0x3fa7ae14    # 1.31f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x3e851eb8    # 0.26f

    .line 185
    .line 186
    .line 187
    const v6, 0x3fae147b    # 1.36f

    .line 188
    .line 189
    .line 190
    const v7, 0x3dcccccd    # 0.1f

    .line 191
    .line 192
    .line 193
    const/high16 v8, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual {v2, v7, v6, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x405851ec    # 3.38f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v25, -0x41f0a3d7    # -0.14f

    .line 205
    .line 206
    .line 207
    const/high16 v26, -0x40000000    # -2.0f

    .line 208
    .line 209
    const v21, -0x425c28f6    # -0.08f

    .line 210
    .line 211
    .line 212
    const v22, -0x40d70a3d    # -0.66f

    .line 213
    .line 214
    .line 215
    const v23, -0x41f0a3d7    # -0.14f

    .line 216
    .line 217
    .line 218
    const v24, -0x40570a3d    # -1.32f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41800000    # 16.0f

    .line 228
    .line 229
    const v6, 0x40a28f5c    # 5.08f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, 0x408a8f5c    # 4.33f

    .line 236
    .line 237
    .line 238
    const v26, 0x4063d70a    # 3.56f

    .line 239
    .line 240
    .line 241
    const v21, 0x3f75c28f    # 0.96f

    .line 242
    .line 243
    .line 244
    const v22, 0x3fd47ae1    # 1.66f

    .line 245
    .line 246
    .line 247
    const v23, 0x401f5c29    # 2.49f

    .line 248
    .line 249
    .line 250
    const v24, 0x403b851f    # 2.93f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, -0x404f5c29    # -1.38f

    .line 257
    .line 258
    .line 259
    const v26, -0x3f9c28f6    # -3.56f

    .line 260
    .line 261
    .line 262
    const v21, -0x40e66666    # -0.6f

    .line 263
    .line 264
    .line 265
    const v22, -0x4071eb85    # -1.11f

    .line 266
    .line 267
    .line 268
    const v23, -0x407851ec    # -1.06f

    .line 269
    .line 270
    .line 271
    const v24, -0x3fec28f6    # -2.31f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, 0x408147ae    # 4.04f

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x41400000    # 12.0f

    .line 287
    .line 288
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, -0x400b851f    # -1.91f

    .line 292
    .line 293
    .line 294
    const v26, 0x407d70a4    # 3.96f

    .line 295
    .line 296
    .line 297
    const v21, -0x40ab851f    # -0.83f

    .line 298
    .line 299
    .line 300
    const v22, 0x3f99999a    # 1.2f

    .line 301
    .line 302
    .line 303
    const v23, -0x40428f5c    # -1.48f

    .line 304
    .line 305
    .line 306
    const v24, 0x4021eb85    # 2.53f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x40747ae1    # 3.82f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v26, -0x3f828f5c    # -3.96f

    .line 319
    .line 320
    .line 321
    const v21, -0x4123d70a    # -0.43f

    .line 322
    .line 323
    .line 324
    const v22, -0x4048f5c3    # -1.43f

    .line 325
    .line 326
    .line 327
    const v23, -0x4075c28f    # -1.08f

    .line 328
    .line 329
    .line 330
    const v24, -0x3fcf5c29    # -2.76f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x41975c29    # 18.92f

    .line 340
    .line 341
    .line 342
    const/high16 v6, 0x41000000    # 8.0f

    .line 343
    .line 344
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v25, -0x3f7570a4    # -4.33f

    .line 348
    .line 349
    .line 350
    const v26, -0x3f9c28f6    # -3.56f

    .line 351
    .line 352
    .line 353
    const v21, -0x408a3d71    # -0.96f

    .line 354
    .line 355
    .line 356
    const v22, -0x402ccccd    # -1.65f

    .line 357
    .line 358
    .line 359
    const v23, -0x3fe0a3d7    # -2.49f

    .line 360
    .line 361
    .line 362
    const v24, -0x3fc47ae1    # -2.93f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v25, 0x3fb0a3d7    # 1.38f

    .line 369
    .line 370
    .line 371
    const v26, 0x4063d70a    # 3.56f

    .line 372
    .line 373
    .line 374
    const v21, 0x3f19999a    # 0.6f

    .line 375
    .line 376
    .line 377
    const v22, 0x3f8e147b    # 1.11f

    .line 378
    .line 379
    .line 380
    const v23, 0x3f87ae14    # 1.06f

    .line 381
    .line 382
    .line 383
    const v24, 0x4013d70a    # 2.31f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, 0x403ccccd    # 2.95f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x419fae14    # 19.96f

    .line 399
    .line 400
    .line 401
    const/high16 v6, 0x41400000    # 12.0f

    .line 402
    .line 403
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v25, 0x3ff47ae1    # 1.91f

    .line 407
    .line 408
    .line 409
    const v26, -0x3f828f5c    # -3.96f

    .line 410
    .line 411
    .line 412
    const v21, 0x3f547ae1    # 0.83f

    .line 413
    .line 414
    .line 415
    const v22, -0x40666666    # -1.2f

    .line 416
    .line 417
    .line 418
    const v23, 0x3fbd70a4    # 1.48f

    .line 419
    .line 420
    .line 421
    const v24, -0x3fde147b    # -2.53f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, -0x3f8b851f    # -3.82f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v26, 0x407d70a4    # 3.96f

    .line 434
    .line 435
    .line 436
    const v21, 0x3edc28f6    # 0.43f

    .line 437
    .line 438
    .line 439
    const v22, 0x3fb70a3d    # 1.43f

    .line 440
    .line 441
    .line 442
    const v23, 0x3f8a3d71    # 1.08f

    .line 443
    .line 444
    .line 445
    const v24, 0x4030a3d7    # 2.76f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, 0x416970a4    # 14.59f

    .line 455
    .line 456
    .line 457
    const v6, 0x419c7ae1    # 19.56f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x408a8f5c    # 4.33f

    .line 464
    .line 465
    .line 466
    const v26, -0x3f9c28f6    # -3.56f

    .line 467
    .line 468
    .line 469
    const v21, 0x3feb851f    # 1.84f

    .line 470
    .line 471
    .line 472
    const v22, -0x40deb852    # -0.63f

    .line 473
    .line 474
    .line 475
    const v23, 0x4057ae14    # 3.37f

    .line 476
    .line 477
    .line 478
    const v24, -0x400b851f    # -1.91f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v4, -0x3fc33333    # -2.95f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, -0x404f5c29    # -1.38f

    .line 491
    .line 492
    .line 493
    const v26, 0x4063d70a    # 3.56f

    .line 494
    .line 495
    .line 496
    const v21, -0x415c28f6    # -0.32f

    .line 497
    .line 498
    .line 499
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 500
    .line 501
    const v23, -0x40b851ec    # -0.78f

    .line 502
    .line 503
    .line 504
    const v24, 0x401ccccd    # 2.45f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v4, 0x419deb85    # 19.74f

    .line 514
    .line 515
    .line 516
    const/high16 v6, 0x41200000    # 10.0f

    .line 517
    .line 518
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, -0x3fa7ae14    # -3.38f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v25, 0x3e0f5c29    # 0.14f

    .line 528
    .line 529
    .line 530
    const/high16 v26, 0x40000000    # 2.0f

    .line 531
    .line 532
    const v21, 0x3da3d70a    # 0.08f

    .line 533
    .line 534
    .line 535
    const v22, 0x3f28f5c3    # 0.66f

    .line 536
    .line 537
    .line 538
    const v23, 0x3e0f5c29    # 0.14f

    .line 539
    .line 540
    .line 541
    const v24, 0x3fa8f5c3    # 1.32f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v4, -0x428a3d71    # -0.06f

    .line 548
    .line 549
    .line 550
    const v6, -0x41f0a3d7    # -0.14f

    .line 551
    .line 552
    .line 553
    const v7, 0x3fab851f    # 1.34f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v4, 0x405851ec    # 3.38f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v25, 0x3e851eb8    # 0.26f

    .line 566
    .line 567
    .line 568
    const/high16 v26, -0x40000000    # -2.0f

    .line 569
    .line 570
    const v21, 0x3e23d70a    # 0.16f

    .line 571
    .line 572
    .line 573
    const v22, -0x40dc28f6    # -0.64f

    .line 574
    .line 575
    .line 576
    const v23, 0x3e851eb8    # 0.26f

    .line 577
    .line 578
    .line 579
    const v24, -0x405851ec    # -1.31f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v4, -0x4051eb85    # -1.36f

    .line 586
    .line 587
    .line 588
    const v6, -0x417ae148    # -0.26f

    .line 589
    .line 590
    .line 591
    const/high16 v7, -0x40000000    # -2.0f

    .line 592
    .line 593
    const v8, -0x42333333    # -0.1f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v4, 0x411a8f5c    # 9.66f

    .line 603
    .line 604
    .line 605
    const/high16 v6, 0x41200000    # 10.0f

    .line 606
    .line 607
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v25, -0x41dc28f6    # -0.16f

    .line 611
    .line 612
    .line 613
    const/high16 v26, 0x40000000    # 2.0f

    .line 614
    .line 615
    const v21, -0x4247ae14    # -0.09f

    .line 616
    .line 617
    .line 618
    const v22, 0x3f266666    # 0.65f

    .line 619
    .line 620
    .line 621
    const v23, -0x41dc28f6    # -0.16f

    .line 622
    .line 623
    .line 624
    const v24, 0x3fa8f5c3    # 1.32f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v4, 0x3d8f5c29    # 0.07f

    .line 631
    .line 632
    .line 633
    const v6, 0x3e23d70a    # 0.16f

    .line 634
    .line 635
    .line 636
    const v7, 0x3fab851f    # 1.34f

    .line 637
    .line 638
    .line 639
    const/high16 v8, 0x40000000    # 2.0f

    .line 640
    .line 641
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v4, 0x4095c28f    # 4.68f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v25, 0x3e23d70a    # 0.16f

    .line 651
    .line 652
    .line 653
    const/high16 v26, -0x40000000    # -2.0f

    .line 654
    .line 655
    const v21, 0x3db851ec    # 0.09f

    .line 656
    .line 657
    .line 658
    const v22, -0x40d70a3d    # -0.66f

    .line 659
    .line 660
    .line 661
    const v23, 0x3e23d70a    # 0.16f

    .line 662
    .line 663
    .line 664
    const v24, -0x40570a3d    # -1.32f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v4, -0x40533333    # -1.35f

    .line 671
    .line 672
    .line 673
    const v6, -0x41dc28f6    # -0.16f

    .line 674
    .line 675
    .line 676
    const/high16 v7, -0x40000000    # -2.0f

    .line 677
    .line 678
    const v8, -0x4270a3d7    # -0.07f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v4, 0x411a8f5c    # 9.66f

    .line 685
    .line 686
    .line 687
    const/high16 v6, 0x41200000    # 10.0f

    .line 688
    .line 689
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    const/16 v16, 0x3800

    .line 700
    .line 701
    const/16 v17, 0x0

    .line 702
    .line 703
    const v6, 0x3e99999a    # 0.3f

    .line 704
    .line 705
    .line 706
    const v8, 0x3e99999a    # 0.3f

    .line 707
    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const/high16 v9, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/high16 v12, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/4 v13, 0x0

    .line 715
    const/4 v14, 0x0

    .line 716
    const/4 v15, 0x0

    .line 717
    const-string v4, ""

    .line 718
    .line 719
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 720
    .line 721
    .line 722
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 727
    .line 728
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 729
    .line 730
    .line 731
    move-result-wide v6

    .line 732
    const/4 v0, 0x0

    .line 733
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 737
    .line 738
    .line 739
    move-result v10

    .line 740
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 741
    .line 742
    .line 743
    move-result v11

    .line 744
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    const v0, 0x413fd70a    # 11.99f

    .line 750
    .line 751
    .line 752
    const/high16 v2, 0x40000000    # 2.0f

    .line 753
    .line 754
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v17, 0x40000000    # 2.0f

    .line 758
    .line 759
    const/high16 v18, 0x41400000    # 12.0f

    .line 760
    .line 761
    const v13, 0x40cf0a3d    # 6.47f

    .line 762
    .line 763
    .line 764
    const/high16 v14, 0x40000000    # 2.0f

    .line 765
    .line 766
    const/high16 v15, 0x40000000    # 2.0f

    .line 767
    .line 768
    const v16, 0x40cf5c29    # 6.48f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x408f0a3d    # 4.47f

    .line 775
    .line 776
    .line 777
    const v2, 0x411fd70a    # 9.99f

    .line 778
    .line 779
    .line 780
    const/high16 v4, 0x41200000    # 10.0f

    .line 781
    .line 782
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v17, 0x41b00000    # 22.0f

    .line 786
    .line 787
    const v13, 0x418c28f6    # 17.52f

    .line 788
    .line 789
    .line 790
    const/high16 v14, 0x41b00000    # 22.0f

    .line 791
    .line 792
    const/high16 v15, 0x41b00000    # 22.0f

    .line 793
    .line 794
    const v16, 0x418c28f6    # 17.52f

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x418c28f6    # 17.52f

    .line 801
    .line 802
    .line 803
    const v2, 0x413fd70a    # 11.99f

    .line 804
    .line 805
    .line 806
    const/high16 v4, 0x40000000    # 2.0f

    .line 807
    .line 808
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, 0x41975c29    # 18.92f

    .line 815
    .line 816
    .line 817
    const/high16 v2, 0x41000000    # 8.0f

    .line 818
    .line 819
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, -0x3fc33333    # -2.95f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v17, -0x404f5c29    # -1.38f

    .line 829
    .line 830
    .line 831
    const v18, -0x3f9c28f6    # -3.56f

    .line 832
    .line 833
    .line 834
    const v13, -0x415c28f6    # -0.32f

    .line 835
    .line 836
    .line 837
    const/high16 v14, -0x40600000    # -1.25f

    .line 838
    .line 839
    const v15, -0x40b851ec    # -0.78f

    .line 840
    .line 841
    .line 842
    const v16, -0x3fe33333    # -2.45f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, 0x408a8f5c    # 4.33f

    .line 849
    .line 850
    .line 851
    const v18, 0x4063d70a    # 3.56f

    .line 852
    .line 853
    .line 854
    const v13, 0x3feb851f    # 1.84f

    .line 855
    .line 856
    .line 857
    const v14, 0x3f2147ae    # 0.63f

    .line 858
    .line 859
    .line 860
    const v15, 0x4057ae14    # 3.37f

    .line 861
    .line 862
    .line 863
    const v16, 0x3ff47ae1    # 1.91f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x408147ae    # 4.04f

    .line 873
    .line 874
    .line 875
    const/high16 v2, 0x41400000    # 12.0f

    .line 876
    .line 877
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x3ff47ae1    # 1.91f

    .line 881
    .line 882
    .line 883
    const v18, 0x407d70a4    # 3.96f

    .line 884
    .line 885
    .line 886
    const v13, 0x3f547ae1    # 0.83f

    .line 887
    .line 888
    .line 889
    const v14, 0x3f99999a    # 1.2f

    .line 890
    .line 891
    .line 892
    const v15, 0x3fbd70a4    # 1.48f

    .line 893
    .line 894
    .line 895
    const v16, 0x4021eb85    # 2.53f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const v0, -0x3f8b851f    # -3.82f

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v18, -0x3f828f5c    # -3.96f

    .line 908
    .line 909
    .line 910
    const v13, 0x3edc28f6    # 0.43f

    .line 911
    .line 912
    .line 913
    const v14, -0x4048f5c3    # -1.43f

    .line 914
    .line 915
    .line 916
    const v15, 0x3f8a3d71    # 1.08f

    .line 917
    .line 918
    .line 919
    const v16, -0x3fcf5c29    # -2.76f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, 0x408851ec    # 4.26f

    .line 929
    .line 930
    .line 931
    const/high16 v2, 0x41600000    # 14.0f

    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v17, 0x40800000    # 4.0f

    .line 937
    .line 938
    const/high16 v18, 0x41400000    # 12.0f

    .line 939
    .line 940
    const v13, 0x40833333    # 4.1f

    .line 941
    .line 942
    .line 943
    const v14, 0x4155c28f    # 13.36f

    .line 944
    .line 945
    .line 946
    const/high16 v15, 0x40800000    # 4.0f

    .line 947
    .line 948
    const v16, 0x414b0a3d    # 12.69f

    .line 949
    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v0, -0x4051eb85    # -1.36f

    .line 955
    .line 956
    .line 957
    const v2, 0x3e851eb8    # 0.26f

    .line 958
    .line 959
    .line 960
    const v4, 0x3dcccccd    # 0.1f

    .line 961
    .line 962
    .line 963
    const/high16 v6, -0x40000000    # -2.0f

    .line 964
    .line 965
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const v0, 0x405851ec    # 3.38f

    .line 969
    .line 970
    .line 971
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const v17, -0x41f0a3d7    # -0.14f

    .line 975
    .line 976
    .line 977
    const/high16 v18, 0x40000000    # 2.0f

    .line 978
    .line 979
    const v13, -0x425c28f6    # -0.08f

    .line 980
    .line 981
    .line 982
    const v14, 0x3f28f5c3    # 0.66f

    .line 983
    .line 984
    .line 985
    const v15, -0x41f0a3d7    # -0.14f

    .line 986
    .line 987
    .line 988
    const v16, 0x3fa8f5c3    # 1.32f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v0, 0x3d75c28f    # 0.06f

    .line 995
    .line 996
    .line 997
    const v2, 0x3e0f5c29    # 0.14f

    .line 998
    .line 999
    .line 1000
    const v4, 0x3fab851f    # 1.34f

    .line 1001
    .line 1002
    .line 1003
    const/high16 v6, 0x40000000    # 2.0f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, 0x408851ec    # 4.26f

    .line 1009
    .line 1010
    .line 1011
    const/high16 v2, 0x41600000    # 14.0f

    .line 1012
    .line 1013
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const/high16 v0, 0x41800000    # 16.0f

    .line 1020
    .line 1021
    const v2, 0x40a28f5c    # 5.08f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v0, 0x403ccccd    # 2.95f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const v17, 0x3fb0a3d7    # 1.38f

    .line 1034
    .line 1035
    .line 1036
    const v18, 0x4063d70a    # 3.56f

    .line 1037
    .line 1038
    .line 1039
    const v13, 0x3ea3d70a    # 0.32f

    .line 1040
    .line 1041
    .line 1042
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 1043
    .line 1044
    const v15, 0x3f47ae14    # 0.78f

    .line 1045
    .line 1046
    .line 1047
    const v16, 0x401ccccd    # 2.45f

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v17, -0x3f7570a4    # -4.33f

    .line 1054
    .line 1055
    .line 1056
    const v18, -0x3f9c28f6    # -3.56f

    .line 1057
    .line 1058
    .line 1059
    const v13, -0x40147ae1    # -1.84f

    .line 1060
    .line 1061
    .line 1062
    const v14, -0x40deb852    # -0.63f

    .line 1063
    .line 1064
    .line 1065
    const v15, -0x3fa851ec    # -3.37f

    .line 1066
    .line 1067
    .line 1068
    const v16, -0x400ccccd    # -1.9f

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v0, 0x41007ae1    # 8.03f

    .line 1078
    .line 1079
    .line 1080
    const/high16 v2, 0x41000000    # 8.0f

    .line 1081
    .line 1082
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v0, 0x41000000    # 8.0f

    .line 1086
    .line 1087
    const v2, 0x40a28f5c    # 5.08f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v17, 0x408a8f5c    # 4.33f

    .line 1094
    .line 1095
    .line 1096
    const v13, 0x3f75c28f    # 0.96f

    .line 1097
    .line 1098
    .line 1099
    const v14, -0x402b851f    # -1.66f

    .line 1100
    .line 1101
    .line 1102
    const v15, 0x401f5c29    # 2.49f

    .line 1103
    .line 1104
    .line 1105
    const v16, -0x3fc47ae1    # -2.93f

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const v17, 0x41007ae1    # 8.03f

    .line 1112
    .line 1113
    .line 1114
    const/high16 v18, 0x41000000    # 8.0f

    .line 1115
    .line 1116
    const v13, 0x410cf5c3    # 8.81f

    .line 1117
    .line 1118
    .line 1119
    const v14, 0x40b1999a    # 5.55f

    .line 1120
    .line 1121
    .line 1122
    const v15, 0x4105999a    # 8.35f

    .line 1123
    .line 1124
    .line 1125
    const/high16 v16, 0x40d80000    # 6.75f

    .line 1126
    .line 1127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const v0, 0x419fae14    # 19.96f

    .line 1134
    .line 1135
    .line 1136
    const/high16 v2, 0x41400000    # 12.0f

    .line 1137
    .line 1138
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v17, -0x400b851f    # -1.91f

    .line 1142
    .line 1143
    .line 1144
    const v18, -0x3f828f5c    # -3.96f

    .line 1145
    .line 1146
    .line 1147
    const v13, -0x40ab851f    # -0.83f

    .line 1148
    .line 1149
    .line 1150
    const v14, -0x40666666    # -1.2f

    .line 1151
    .line 1152
    .line 1153
    const v15, -0x40428f5c    # -1.48f

    .line 1154
    .line 1155
    .line 1156
    const v16, -0x3fde147b    # -2.53f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const v0, 0x40747ae1    # 3.82f

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    const v18, 0x407d70a4    # 3.96f

    .line 1169
    .line 1170
    .line 1171
    const v13, -0x4123d70a    # -0.43f

    .line 1172
    .line 1173
    .line 1174
    const v14, 0x3fb70a3d    # 1.43f

    .line 1175
    .line 1176
    .line 1177
    const v15, -0x4075c28f    # -1.08f

    .line 1178
    .line 1179
    .line 1180
    const v16, 0x4030a3d7    # 2.76f

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1187
    .line 1188
    .line 1189
    const v0, 0x416570a4    # 14.34f

    .line 1190
    .line 1191
    .line 1192
    const/high16 v2, 0x41600000    # 14.0f

    .line 1193
    .line 1194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1195
    .line 1196
    .line 1197
    const v0, 0x411a8f5c    # 9.66f

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1201
    .line 1202
    .line 1203
    const v17, -0x41dc28f6    # -0.16f

    .line 1204
    .line 1205
    .line 1206
    const/high16 v18, -0x40000000    # -2.0f

    .line 1207
    .line 1208
    const v13, -0x4247ae14    # -0.09f

    .line 1209
    .line 1210
    .line 1211
    const v14, -0x40d70a3d    # -0.66f

    .line 1212
    .line 1213
    .line 1214
    const v15, -0x41dc28f6    # -0.16f

    .line 1215
    .line 1216
    .line 1217
    const v16, -0x40570a3d    # -1.32f

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    const v0, -0x40533333    # -1.35f

    .line 1224
    .line 1225
    .line 1226
    const v2, 0x3e23d70a    # 0.16f

    .line 1227
    .line 1228
    .line 1229
    const/high16 v4, -0x40000000    # -2.0f

    .line 1230
    .line 1231
    const v6, 0x3d8f5c29    # 0.07f

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1235
    .line 1236
    .line 1237
    const v0, 0x4095c28f    # 4.68f

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1241
    .line 1242
    .line 1243
    const v17, 0x3e23d70a    # 0.16f

    .line 1244
    .line 1245
    .line 1246
    const/high16 v18, 0x40000000    # 2.0f

    .line 1247
    .line 1248
    const v13, 0x3db851ec    # 0.09f

    .line 1249
    .line 1250
    .line 1251
    const v14, 0x3f266666    # 0.65f

    .line 1252
    .line 1253
    .line 1254
    const v15, 0x3e23d70a    # 0.16f

    .line 1255
    .line 1256
    .line 1257
    const v16, 0x3fa8f5c3    # 1.32f

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1261
    .line 1262
    .line 1263
    const v0, -0x4270a3d7    # -0.07f

    .line 1264
    .line 1265
    .line 1266
    const v2, -0x41dc28f6    # -0.16f

    .line 1267
    .line 1268
    .line 1269
    const v4, 0x3fab851f    # 1.34f

    .line 1270
    .line 1271
    .line 1272
    const/high16 v6, 0x40000000    # 2.0f

    .line 1273
    .line 1274
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1278
    .line 1279
    .line 1280
    const v0, 0x416970a4    # 14.59f

    .line 1281
    .line 1282
    .line 1283
    const v2, 0x419c7ae1    # 19.56f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1287
    .line 1288
    .line 1289
    const v17, 0x3fb0a3d7    # 1.38f

    .line 1290
    .line 1291
    .line 1292
    const v18, -0x3f9c28f6    # -3.56f

    .line 1293
    .line 1294
    .line 1295
    const v13, 0x3f19999a    # 0.6f

    .line 1296
    .line 1297
    .line 1298
    const v14, -0x4071eb85    # -1.11f

    .line 1299
    .line 1300
    .line 1301
    const v15, 0x3f87ae14    # 1.06f

    .line 1302
    .line 1303
    .line 1304
    const v16, -0x3fec28f6    # -2.31f

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1308
    .line 1309
    .line 1310
    const v0, 0x403ccccd    # 2.95f

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const v17, -0x3f7570a4    # -4.33f

    .line 1317
    .line 1318
    .line 1319
    const v18, 0x4063d70a    # 3.56f

    .line 1320
    .line 1321
    .line 1322
    const v13, -0x408a3d71    # -0.96f

    .line 1323
    .line 1324
    .line 1325
    const v14, 0x3fd33333    # 1.65f

    .line 1326
    .line 1327
    .line 1328
    const v15, -0x3fe0a3d7    # -2.49f

    .line 1329
    .line 1330
    .line 1331
    const v16, 0x403b851f    # 2.93f

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1338
    .line 1339
    .line 1340
    const v0, 0x4182e148    # 16.36f

    .line 1341
    .line 1342
    .line 1343
    const/high16 v2, 0x41600000    # 14.0f

    .line 1344
    .line 1345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    const v17, 0x3e0f5c29    # 0.14f

    .line 1349
    .line 1350
    .line 1351
    const/high16 v18, -0x40000000    # -2.0f

    .line 1352
    .line 1353
    const v13, 0x3da3d70a    # 0.08f

    .line 1354
    .line 1355
    .line 1356
    const v14, -0x40d70a3d    # -0.66f

    .line 1357
    .line 1358
    .line 1359
    const v15, 0x3e0f5c29    # 0.14f

    .line 1360
    .line 1361
    .line 1362
    const v16, -0x40570a3d    # -1.32f

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1366
    .line 1367
    .line 1368
    const v0, -0x40547ae1    # -1.34f

    .line 1369
    .line 1370
    .line 1371
    const v2, -0x41f0a3d7    # -0.14f

    .line 1372
    .line 1373
    .line 1374
    const/high16 v4, -0x40000000    # -2.0f

    .line 1375
    .line 1376
    const v6, -0x428a3d71    # -0.06f

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1380
    .line 1381
    .line 1382
    const v0, 0x405851ec    # 3.38f

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1386
    .line 1387
    .line 1388
    const v17, 0x3e851eb8    # 0.26f

    .line 1389
    .line 1390
    .line 1391
    const/high16 v18, 0x40000000    # 2.0f

    .line 1392
    .line 1393
    const v13, 0x3e23d70a    # 0.16f

    .line 1394
    .line 1395
    .line 1396
    const v14, 0x3f23d70a    # 0.64f

    .line 1397
    .line 1398
    .line 1399
    const v15, 0x3e851eb8    # 0.26f

    .line 1400
    .line 1401
    .line 1402
    const v16, 0x3fa7ae14    # 1.31f

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1406
    .line 1407
    .line 1408
    const v0, -0x42333333    # -0.1f

    .line 1409
    .line 1410
    .line 1411
    const v2, -0x417ae148    # -0.26f

    .line 1412
    .line 1413
    .line 1414
    const v4, 0x3fae147b    # 1.36f

    .line 1415
    .line 1416
    .line 1417
    const/high16 v6, 0x40000000    # 2.0f

    .line 1418
    .line 1419
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1420
    .line 1421
    .line 1422
    const v0, -0x3fa7ae14    # -3.38f

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v2

    .line 1435
    const/16 v16, 0x3800

    .line 1436
    .line 1437
    const/16 v17, 0x0

    .line 1438
    .line 1439
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1440
    .line 1441
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1442
    .line 1443
    const/4 v7, 0x0

    .line 1444
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1445
    .line 1446
    const/4 v13, 0x0

    .line 1447
    const/4 v14, 0x0

    .line 1448
    const/4 v15, 0x0

    .line 1449
    const-string v4, ""

    .line 1450
    .line 1451
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    sput-object v0, Landroidx/compose/material/icons/twotone/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1460
    .line 1461
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1462
    .line 1463
    .line 1464
    return-object v0
.end method

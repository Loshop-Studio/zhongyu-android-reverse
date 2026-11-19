.class public final Landroidx/compose/material/icons/filled/LanguageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _language:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLanguage(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Language"

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
    const v0, 0x413fd70a    # 11.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40000000    # 2.0f

    .line 79
    .line 80
    const/high16 v18, 0x41400000    # 12.0f

    .line 81
    .line 82
    const v13, 0x40cf0a3d    # 6.47f

    .line 83
    .line 84
    .line 85
    const/high16 v14, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v15, 0x40000000    # 2.0f

    .line 88
    .line 89
    const v16, 0x40cf5c29    # 6.48f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x408f0a3d    # 4.47f

    .line 96
    .line 97
    .line 98
    const v2, 0x411fd70a    # 9.99f

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41200000    # 10.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x41b00000    # 22.0f

    .line 107
    .line 108
    const v13, 0x418c28f6    # 17.52f

    .line 109
    .line 110
    .line 111
    const/high16 v14, 0x41b00000    # 22.0f

    .line 112
    .line 113
    const/high16 v15, 0x41b00000    # 22.0f

    .line 114
    .line 115
    const v16, 0x418c28f6    # 17.52f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x418c28f6    # 17.52f

    .line 122
    .line 123
    .line 124
    const v2, 0x413fd70a    # 11.99f

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x41975c29    # 18.92f

    .line 136
    .line 137
    .line 138
    const/high16 v2, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, -0x3fc33333    # -2.95f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x404f5c29    # -1.38f

    .line 150
    .line 151
    .line 152
    const v18, -0x3f9c28f6    # -3.56f

    .line 153
    .line 154
    .line 155
    const v13, -0x415c28f6    # -0.32f

    .line 156
    .line 157
    .line 158
    const/high16 v14, -0x40600000    # -1.25f

    .line 159
    .line 160
    const v15, -0x40b851ec    # -0.78f

    .line 161
    .line 162
    .line 163
    const v16, -0x3fe33333    # -2.45f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x408a8f5c    # 4.33f

    .line 170
    .line 171
    .line 172
    const v18, 0x4063d70a    # 3.56f

    .line 173
    .line 174
    .line 175
    const v13, 0x3feb851f    # 1.84f

    .line 176
    .line 177
    .line 178
    const v14, 0x3f2147ae    # 0.63f

    .line 179
    .line 180
    .line 181
    const v15, 0x4057ae14    # 3.37f

    .line 182
    .line 183
    .line 184
    const v16, 0x3ff47ae1    # 1.91f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x408147ae    # 4.04f

    .line 194
    .line 195
    .line 196
    const/high16 v2, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x3ff47ae1    # 1.91f

    .line 202
    .line 203
    .line 204
    const v18, 0x407d70a4    # 3.96f

    .line 205
    .line 206
    .line 207
    const v13, 0x3f547ae1    # 0.83f

    .line 208
    .line 209
    .line 210
    const v14, 0x3f99999a    # 1.2f

    .line 211
    .line 212
    .line 213
    const v15, 0x3fbd70a4    # 1.48f

    .line 214
    .line 215
    .line 216
    const v16, 0x4021eb85    # 2.53f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x3f8b851f    # -3.82f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v18, -0x3f828f5c    # -3.96f

    .line 229
    .line 230
    .line 231
    const v13, 0x3edc28f6    # 0.43f

    .line 232
    .line 233
    .line 234
    const v14, -0x4048f5c3    # -1.43f

    .line 235
    .line 236
    .line 237
    const v15, 0x3f8a3d71    # 1.08f

    .line 238
    .line 239
    .line 240
    const v16, -0x3fcf5c29    # -2.76f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x408851ec    # 4.26f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x41600000    # 14.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x40800000    # 4.0f

    .line 258
    .line 259
    const/high16 v18, 0x41400000    # 12.0f

    .line 260
    .line 261
    const v13, 0x40833333    # 4.1f

    .line 262
    .line 263
    .line 264
    const v14, 0x4155c28f    # 13.36f

    .line 265
    .line 266
    .line 267
    const/high16 v15, 0x40800000    # 4.0f

    .line 268
    .line 269
    const v16, 0x414b0a3d    # 12.69f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3e851eb8    # 0.26f

    .line 276
    .line 277
    .line 278
    const/high16 v2, -0x40000000    # -2.0f

    .line 279
    .line 280
    const v4, 0x3dcccccd    # 0.1f

    .line 281
    .line 282
    .line 283
    const v6, -0x4051eb85    # -1.36f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x405851ec    # 3.38f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x41f0a3d7    # -0.14f

    .line 296
    .line 297
    .line 298
    const/high16 v18, 0x40000000    # 2.0f

    .line 299
    .line 300
    const v13, -0x425c28f6    # -0.08f

    .line 301
    .line 302
    .line 303
    const v14, 0x3f28f5c3    # 0.66f

    .line 304
    .line 305
    .line 306
    const v15, -0x41f0a3d7    # -0.14f

    .line 307
    .line 308
    .line 309
    const v16, 0x3fa8f5c3    # 1.32f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3e0f5c29    # 0.14f

    .line 316
    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const v14, 0x3f2e147b    # 0.68f

    .line 320
    .line 321
    .line 322
    const v15, 0x3d75c28f    # 0.06f

    .line 323
    .line 324
    .line 325
    const v16, 0x3fab851f    # 1.34f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x408851ec    # 4.26f

    .line 332
    .line 333
    .line 334
    const/high16 v2, 0x41600000    # 14.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41800000    # 16.0f

    .line 343
    .line 344
    const v2, 0x40a28f5c    # 5.08f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x403ccccd    # 2.95f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3fb0a3d7    # 1.38f

    .line 357
    .line 358
    .line 359
    const v18, 0x4063d70a    # 3.56f

    .line 360
    .line 361
    .line 362
    const v13, 0x3ea3d70a    # 0.32f

    .line 363
    .line 364
    .line 365
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 366
    .line 367
    const v15, 0x3f47ae14    # 0.78f

    .line 368
    .line 369
    .line 370
    const v16, 0x401ccccd    # 2.45f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x3f7570a4    # -4.33f

    .line 377
    .line 378
    .line 379
    const v18, -0x3f9c28f6    # -3.56f

    .line 380
    .line 381
    .line 382
    const v13, -0x40147ae1    # -1.84f

    .line 383
    .line 384
    .line 385
    const v14, -0x40deb852    # -0.63f

    .line 386
    .line 387
    .line 388
    const v15, -0x3fa851ec    # -3.37f

    .line 389
    .line 390
    .line 391
    const v16, -0x400ccccd    # -1.9f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x41007ae1    # 8.03f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41000000    # 8.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x40a28f5c    # 5.08f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, 0x408a8f5c    # 4.33f

    .line 415
    .line 416
    .line 417
    const v13, 0x3f75c28f    # 0.96f

    .line 418
    .line 419
    .line 420
    const v14, -0x402b851f    # -1.66f

    .line 421
    .line 422
    .line 423
    const v15, 0x401f5c29    # 2.49f

    .line 424
    .line 425
    .line 426
    const v16, -0x3fc47ae1    # -2.93f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x41007ae1    # 8.03f

    .line 433
    .line 434
    .line 435
    const/high16 v18, 0x41000000    # 8.0f

    .line 436
    .line 437
    const v13, 0x410cf5c3    # 8.81f

    .line 438
    .line 439
    .line 440
    const v14, 0x40b1999a    # 5.55f

    .line 441
    .line 442
    .line 443
    const v15, 0x4105999a    # 8.35f

    .line 444
    .line 445
    .line 446
    const/high16 v16, 0x40d80000    # 6.75f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x419fae14    # 19.96f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x41400000    # 12.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, -0x400b851f    # -1.91f

    .line 463
    .line 464
    .line 465
    const v18, -0x3f828f5c    # -3.96f

    .line 466
    .line 467
    .line 468
    const v13, -0x40ab851f    # -0.83f

    .line 469
    .line 470
    .line 471
    const v14, -0x40666666    # -1.2f

    .line 472
    .line 473
    .line 474
    const v15, -0x40428f5c    # -1.48f

    .line 475
    .line 476
    .line 477
    const v16, -0x3fde147b    # -2.53f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x40747ae1    # 3.82f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v18, 0x407d70a4    # 3.96f

    .line 490
    .line 491
    .line 492
    const v13, -0x4123d70a    # -0.43f

    .line 493
    .line 494
    .line 495
    const v14, 0x3fb70a3d    # 1.43f

    .line 496
    .line 497
    .line 498
    const v15, -0x4075c28f    # -1.08f

    .line 499
    .line 500
    .line 501
    const v16, 0x4030a3d7    # 2.76f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x416570a4    # 14.34f

    .line 511
    .line 512
    .line 513
    const/high16 v2, 0x41600000    # 14.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x411a8f5c    # 9.66f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, -0x41dc28f6    # -0.16f

    .line 525
    .line 526
    .line 527
    const/high16 v18, -0x40000000    # -2.0f

    .line 528
    .line 529
    const v13, -0x4247ae14    # -0.09f

    .line 530
    .line 531
    .line 532
    const v14, -0x40d70a3d    # -0.66f

    .line 533
    .line 534
    .line 535
    const v15, -0x41dc28f6    # -0.16f

    .line 536
    .line 537
    .line 538
    const v16, -0x40570a3d    # -1.32f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3e23d70a    # 0.16f

    .line 545
    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, -0x40d1eb85    # -0.68f

    .line 549
    .line 550
    .line 551
    const v15, 0x3d8f5c29    # 0.07f

    .line 552
    .line 553
    .line 554
    const v16, -0x40533333    # -1.35f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x4095c28f    # 4.68f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v18, 0x40000000    # 2.0f

    .line 567
    .line 568
    const v13, 0x3db851ec    # 0.09f

    .line 569
    .line 570
    .line 571
    const v14, 0x3f266666    # 0.65f

    .line 572
    .line 573
    .line 574
    const v15, 0x3e23d70a    # 0.16f

    .line 575
    .line 576
    .line 577
    const v16, 0x3fa8f5c3    # 1.32f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x41dc28f6    # -0.16f

    .line 584
    .line 585
    .line 586
    const/4 v13, 0x0

    .line 587
    const v14, 0x3f2e147b    # 0.68f

    .line 588
    .line 589
    .line 590
    const v15, -0x4270a3d7    # -0.07f

    .line 591
    .line 592
    .line 593
    const v16, 0x3fab851f    # 1.34f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x416970a4    # 14.59f

    .line 603
    .line 604
    .line 605
    const v2, 0x419c7ae1    # 19.56f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3fb0a3d7    # 1.38f

    .line 612
    .line 613
    .line 614
    const v18, -0x3f9c28f6    # -3.56f

    .line 615
    .line 616
    .line 617
    const v13, 0x3f19999a    # 0.6f

    .line 618
    .line 619
    .line 620
    const v14, -0x4071eb85    # -1.11f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f87ae14    # 1.06f

    .line 624
    .line 625
    .line 626
    const v16, -0x3fec28f6    # -2.31f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x403ccccd    # 2.95f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x3f7570a4    # -4.33f

    .line 639
    .line 640
    .line 641
    const v18, 0x4063d70a    # 3.56f

    .line 642
    .line 643
    .line 644
    const v13, -0x408a3d71    # -0.96f

    .line 645
    .line 646
    .line 647
    const v14, 0x3fd33333    # 1.65f

    .line 648
    .line 649
    .line 650
    const v15, -0x3fe0a3d7    # -2.49f

    .line 651
    .line 652
    .line 653
    const v16, 0x403b851f    # 2.93f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x4182e148    # 16.36f

    .line 663
    .line 664
    .line 665
    const/high16 v2, 0x41600000    # 14.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x3e0f5c29    # 0.14f

    .line 671
    .line 672
    .line 673
    const/high16 v18, -0x40000000    # -2.0f

    .line 674
    .line 675
    const v13, 0x3da3d70a    # 0.08f

    .line 676
    .line 677
    .line 678
    const v14, -0x40d70a3d    # -0.66f

    .line 679
    .line 680
    .line 681
    const v15, 0x3e0f5c29    # 0.14f

    .line 682
    .line 683
    .line 684
    const v16, -0x40570a3d    # -1.32f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, -0x41f0a3d7    # -0.14f

    .line 691
    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const v14, -0x40d1eb85    # -0.68f

    .line 695
    .line 696
    .line 697
    const v15, -0x428a3d71    # -0.06f

    .line 698
    .line 699
    .line 700
    const v16, -0x40547ae1    # -1.34f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x405851ec    # 3.38f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v17, 0x3e851eb8    # 0.26f

    .line 713
    .line 714
    .line 715
    const/high16 v18, 0x40000000    # 2.0f

    .line 716
    .line 717
    const v13, 0x3e23d70a    # 0.16f

    .line 718
    .line 719
    .line 720
    const v14, 0x3f23d70a    # 0.64f

    .line 721
    .line 722
    .line 723
    const v15, 0x3e851eb8    # 0.26f

    .line 724
    .line 725
    .line 726
    const v16, 0x3fa7ae14    # 1.31f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x3fae147b    # 1.36f

    .line 733
    .line 734
    .line 735
    const v2, -0x417ae148    # -0.26f

    .line 736
    .line 737
    .line 738
    const/high16 v4, 0x40000000    # 2.0f

    .line 739
    .line 740
    const v6, -0x42333333    # -0.1f

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, -0x3fa7ae14    # -3.38f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    const/16 v16, 0x3800

    .line 760
    .line 761
    const/16 v17, 0x0

    .line 762
    .line 763
    const/high16 v6, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v8, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v7, 0x0

    .line 768
    const/high16 v9, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/high16 v12, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const/4 v14, 0x0

    .line 774
    const/4 v15, 0x0

    .line 775
    const-string v4, ""

    .line 776
    .line 777
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    sput-object v0, Landroidx/compose/material/icons/filled/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 786
    .line 787
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/LanguageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _language:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLanguage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Language"

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
    const v0, -0x4051eb85    # -1.36f

    .line 276
    .line 277
    .line 278
    const v2, 0x3e851eb8    # 0.26f

    .line 279
    .line 280
    .line 281
    const/high16 v4, -0x40000000    # -2.0f

    .line 282
    .line 283
    const v6, 0x3dcccccd    # 0.1f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v0, 0x3d75c28f    # 0.06f

    .line 316
    .line 317
    .line 318
    const v2, 0x3e0f5c29    # 0.14f

    .line 319
    .line 320
    .line 321
    const v4, 0x3fab851f    # 1.34f

    .line 322
    .line 323
    .line 324
    const/high16 v6, 0x40000000    # 2.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x408851ec    # 4.26f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x41600000    # 14.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41800000    # 16.0f

    .line 341
    .line 342
    const v2, 0x40a28f5c    # 5.08f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x403ccccd    # 2.95f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x3fb0a3d7    # 1.38f

    .line 355
    .line 356
    .line 357
    const v18, 0x4063d70a    # 3.56f

    .line 358
    .line 359
    .line 360
    const v13, 0x3ea3d70a    # 0.32f

    .line 361
    .line 362
    .line 363
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 364
    .line 365
    const v15, 0x3f47ae14    # 0.78f

    .line 366
    .line 367
    .line 368
    const v16, 0x401ccccd    # 2.45f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x3f7570a4    # -4.33f

    .line 375
    .line 376
    .line 377
    const v18, -0x3f9c28f6    # -3.56f

    .line 378
    .line 379
    .line 380
    const v13, -0x40147ae1    # -1.84f

    .line 381
    .line 382
    .line 383
    const v14, -0x40deb852    # -0.63f

    .line 384
    .line 385
    .line 386
    const v15, -0x3fa851ec    # -3.37f

    .line 387
    .line 388
    .line 389
    const v16, -0x400ccccd    # -1.9f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x41007ae1    # 8.03f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41000000    # 8.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x40a28f5c    # 5.08f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x408a8f5c    # 4.33f

    .line 413
    .line 414
    .line 415
    const v13, 0x3f75c28f    # 0.96f

    .line 416
    .line 417
    .line 418
    const v14, -0x402b851f    # -1.66f

    .line 419
    .line 420
    .line 421
    const v15, 0x401f5c29    # 2.49f

    .line 422
    .line 423
    .line 424
    const v16, -0x3fc47ae1    # -2.93f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x41007ae1    # 8.03f

    .line 431
    .line 432
    .line 433
    const/high16 v18, 0x41000000    # 8.0f

    .line 434
    .line 435
    const v13, 0x410cf5c3    # 8.81f

    .line 436
    .line 437
    .line 438
    const v14, 0x40b1999a    # 5.55f

    .line 439
    .line 440
    .line 441
    const v15, 0x4105999a    # 8.35f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x40d80000    # 6.75f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x419fae14    # 19.96f

    .line 453
    .line 454
    .line 455
    const/high16 v2, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x400b851f    # -1.91f

    .line 461
    .line 462
    .line 463
    const v18, -0x3f828f5c    # -3.96f

    .line 464
    .line 465
    .line 466
    const v13, -0x40ab851f    # -0.83f

    .line 467
    .line 468
    .line 469
    const v14, -0x40666666    # -1.2f

    .line 470
    .line 471
    .line 472
    const v15, -0x40428f5c    # -1.48f

    .line 473
    .line 474
    .line 475
    const v16, -0x3fde147b    # -2.53f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40747ae1    # 3.82f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v18, 0x407d70a4    # 3.96f

    .line 488
    .line 489
    .line 490
    const v13, -0x4123d70a    # -0.43f

    .line 491
    .line 492
    .line 493
    const v14, 0x3fb70a3d    # 1.43f

    .line 494
    .line 495
    .line 496
    const v15, -0x4075c28f    # -1.08f

    .line 497
    .line 498
    .line 499
    const v16, 0x4030a3d7    # 2.76f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x416570a4    # 14.34f

    .line 509
    .line 510
    .line 511
    const/high16 v2, 0x41600000    # 14.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x411a8f5c    # 9.66f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, -0x41dc28f6    # -0.16f

    .line 523
    .line 524
    .line 525
    const/high16 v18, -0x40000000    # -2.0f

    .line 526
    .line 527
    const v13, -0x4247ae14    # -0.09f

    .line 528
    .line 529
    .line 530
    const v14, -0x40d70a3d    # -0.66f

    .line 531
    .line 532
    .line 533
    const v15, -0x41dc28f6    # -0.16f

    .line 534
    .line 535
    .line 536
    const v16, -0x40570a3d    # -1.32f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x40533333    # -1.35f

    .line 543
    .line 544
    .line 545
    const v2, 0x3e23d70a    # 0.16f

    .line 546
    .line 547
    .line 548
    const/high16 v4, -0x40000000    # -2.0f

    .line 549
    .line 550
    const v6, 0x3d8f5c29    # 0.07f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x4095c28f    # 4.68f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3e23d70a    # 0.16f

    .line 563
    .line 564
    .line 565
    const/high16 v18, 0x40000000    # 2.0f

    .line 566
    .line 567
    const v13, 0x3db851ec    # 0.09f

    .line 568
    .line 569
    .line 570
    const v14, 0x3f266666    # 0.65f

    .line 571
    .line 572
    .line 573
    const v15, 0x3e23d70a    # 0.16f

    .line 574
    .line 575
    .line 576
    const v16, 0x3fa8f5c3    # 1.32f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x4270a3d7    # -0.07f

    .line 583
    .line 584
    .line 585
    const v2, -0x41dc28f6    # -0.16f

    .line 586
    .line 587
    .line 588
    const v4, 0x3fab851f    # 1.34f

    .line 589
    .line 590
    .line 591
    const/high16 v6, 0x40000000    # 2.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x416970a4    # 14.59f

    .line 600
    .line 601
    .line 602
    const v2, 0x419c7ae1    # 19.56f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x3fb0a3d7    # 1.38f

    .line 609
    .line 610
    .line 611
    const v18, -0x3f9c28f6    # -3.56f

    .line 612
    .line 613
    .line 614
    const v13, 0x3f19999a    # 0.6f

    .line 615
    .line 616
    .line 617
    const v14, -0x4071eb85    # -1.11f

    .line 618
    .line 619
    .line 620
    const v15, 0x3f87ae14    # 1.06f

    .line 621
    .line 622
    .line 623
    const v16, -0x3fec28f6    # -2.31f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x403ccccd    # 2.95f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x3f7570a4    # -4.33f

    .line 636
    .line 637
    .line 638
    const v18, 0x4063d70a    # 3.56f

    .line 639
    .line 640
    .line 641
    const v13, -0x408a3d71    # -0.96f

    .line 642
    .line 643
    .line 644
    const v14, 0x3fd33333    # 1.65f

    .line 645
    .line 646
    .line 647
    const v15, -0x3fe0a3d7    # -2.49f

    .line 648
    .line 649
    .line 650
    const v16, 0x403b851f    # 2.93f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x4182e148    # 16.36f

    .line 660
    .line 661
    .line 662
    const/high16 v2, 0x41600000    # 14.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3e0f5c29    # 0.14f

    .line 668
    .line 669
    .line 670
    const/high16 v18, -0x40000000    # -2.0f

    .line 671
    .line 672
    const v13, 0x3da3d70a    # 0.08f

    .line 673
    .line 674
    .line 675
    const v14, -0x40d70a3d    # -0.66f

    .line 676
    .line 677
    .line 678
    const v15, 0x3e0f5c29    # 0.14f

    .line 679
    .line 680
    .line 681
    const v16, -0x40570a3d    # -1.32f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, -0x40547ae1    # -1.34f

    .line 688
    .line 689
    .line 690
    const v2, -0x41f0a3d7    # -0.14f

    .line 691
    .line 692
    .line 693
    const/high16 v4, -0x40000000    # -2.0f

    .line 694
    .line 695
    const v6, -0x428a3d71    # -0.06f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x405851ec    # 3.38f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v17, 0x3e851eb8    # 0.26f

    .line 708
    .line 709
    .line 710
    const/high16 v18, 0x40000000    # 2.0f

    .line 711
    .line 712
    const v13, 0x3e23d70a    # 0.16f

    .line 713
    .line 714
    .line 715
    const v14, 0x3f23d70a    # 0.64f

    .line 716
    .line 717
    .line 718
    const v15, 0x3e851eb8    # 0.26f

    .line 719
    .line 720
    .line 721
    const v16, 0x3fa7ae14    # 1.31f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x3fae147b    # 1.36f

    .line 728
    .line 729
    .line 730
    const v2, -0x417ae148    # -0.26f

    .line 731
    .line 732
    .line 733
    const/high16 v4, 0x40000000    # 2.0f

    .line 734
    .line 735
    const v6, -0x42333333    # -0.1f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v0, -0x3fa7ae14    # -3.38f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    const/16 v16, 0x3800

    .line 755
    .line 756
    const/16 v17, 0x0

    .line 757
    .line 758
    const/high16 v6, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/high16 v8, 0x3f800000    # 1.0f

    .line 761
    .line 762
    const/4 v7, 0x0

    .line 763
    const/high16 v9, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v12, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    const/4 v14, 0x0

    .line 769
    const/4 v15, 0x0

    .line 770
    const-string v4, ""

    .line 771
    .line 772
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    sput-object v0, Landroidx/compose/material/icons/rounded/LanguageKt;->_language:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 781
    .line 782
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    return-object v0
.end method

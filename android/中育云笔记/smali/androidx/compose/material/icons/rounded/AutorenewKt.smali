.class public final Landroidx/compose/material/icons/rounded/AutorenewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autorenew:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutorenew(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutorenewKt;->_autorenew:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Autorenew"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x3fe51eb8    # 1.79f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, 0x3f59999a    # 0.85f

    .line 84
    .line 85
    .line 86
    const v18, 0x3eb33333    # 0.35f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, 0x3ee66666    # 0.45f

    .line 91
    .line 92
    .line 93
    const v15, 0x3f0a3d71    # 0.54f

    .line 94
    .line 95
    .line 96
    const v16, 0x3f2b851f    # 0.67f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3fcd70a4    # -2.79f

    .line 103
    .line 104
    .line 105
    const v2, 0x40328f5c    # 2.79f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v18, -0x40ca3d71    # -0.71f

    .line 114
    .line 115
    .line 116
    const v13, 0x3e4ccccd    # 0.2f

    .line 117
    .line 118
    .line 119
    const v14, -0x41b33333    # -0.2f

    .line 120
    .line 121
    .line 122
    const v15, 0x3e4ccccd    # 0.2f

    .line 123
    .line 124
    .line 125
    const v16, -0x40fd70a4    # -0.51f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x40a66666    # -0.85f

    .line 135
    .line 136
    .line 137
    const v18, 0x3eb851ec    # 0.36f

    .line 138
    .line 139
    .line 140
    const v13, -0x416147ae    # -0.31f

    .line 141
    .line 142
    .line 143
    const v14, -0x416147ae    # -0.31f

    .line 144
    .line 145
    .line 146
    const v15, -0x40a66666    # -0.85f

    .line 147
    .line 148
    .line 149
    const v16, -0x4247ae14    # -0.09f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x40800000    # 4.0f

    .line 156
    .line 157
    const/high16 v2, 0x41400000    # 12.0f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, -0x3f000000    # -8.0f

    .line 163
    .line 164
    const/high16 v18, 0x41000000    # 8.0f

    .line 165
    .line 166
    const v13, -0x3f728f5c    # -4.42f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, -0x3f000000    # -8.0f

    .line 171
    .line 172
    const v16, 0x40651eb8    # 3.58f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x3f11eb85    # 0.57f

    .line 179
    .line 180
    .line 181
    const v18, 0x403ccccd    # 2.95f

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, 0x3f851eb8    # 1.04f

    .line 186
    .line 187
    .line 188
    const v15, 0x3e4ccccd    # 0.2f

    .line 189
    .line 190
    .line 191
    const v16, 0x40028f5c    # 2.04f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3fd1eb85    # 1.64f

    .line 198
    .line 199
    .line 200
    const v18, 0x3eae147b    # 0.34f

    .line 201
    .line 202
    .line 203
    const v13, 0x3e8a3d71    # 0.27f

    .line 204
    .line 205
    .line 206
    const v14, 0x3f2b851f    # 0.67f

    .line 207
    .line 208
    .line 209
    const v15, 0x3f90a3d7    # 1.13f

    .line 210
    .line 211
    .line 212
    const v16, 0x3f59999a    # 0.85f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3e6b851f    # 0.23f

    .line 219
    .line 220
    .line 221
    const v18, -0x407ae148    # -1.04f

    .line 222
    .line 223
    .line 224
    const v14, -0x4175c28f    # -0.27f

    .line 225
    .line 226
    .line 227
    const v15, 0x3ec28f5c    # 0.38f

    .line 228
    .line 229
    .line 230
    const v16, -0x40d1eb85    # -0.68f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x40c00000    # 6.0f

    .line 237
    .line 238
    const/high16 v18, 0x41400000    # 12.0f

    .line 239
    .line 240
    const v13, 0x40c4cccd    # 6.15f

    .line 241
    .line 242
    .line 243
    const v14, 0x4158f5c3    # 13.56f

    .line 244
    .line 245
    .line 246
    const/high16 v15, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const v16, 0x414ca3d7    # 12.79f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v18, -0x3f400000    # -6.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, -0x3fac28f6    # -3.31f

    .line 258
    .line 259
    .line 260
    const v15, 0x402c28f6    # 2.69f

    .line 261
    .line 262
    .line 263
    const/high16 v16, -0x3f400000    # -6.0f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x418e51ec    # 17.79f

    .line 272
    .line 273
    .line 274
    const v2, 0x410b5c29    # 8.71f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, -0x41947ae1    # -0.23f

    .line 281
    .line 282
    .line 283
    const v18, 0x3f851eb8    # 1.04f

    .line 284
    .line 285
    .line 286
    const v13, -0x4175c28f    # -0.27f

    .line 287
    .line 288
    .line 289
    const v14, 0x3e8a3d71    # 0.27f

    .line 290
    .line 291
    .line 292
    const v15, -0x413d70a4    # -0.38f

    .line 293
    .line 294
    .line 295
    const v16, 0x3f30a3d7    # 0.69f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x3ee147ae    # 0.44f

    .line 302
    .line 303
    .line 304
    const/high16 v18, 0x40100000    # 2.25f

    .line 305
    .line 306
    const v13, 0x3e8f5c29    # 0.28f

    .line 307
    .line 308
    .line 309
    const v14, 0x3f333333    # 0.7f

    .line 310
    .line 311
    .line 312
    const v15, 0x3ee147ae    # 0.44f

    .line 313
    .line 314
    .line 315
    const v16, 0x3fbae148    # 1.46f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, -0x3f400000    # -6.0f

    .line 322
    .line 323
    const/high16 v18, 0x40c00000    # 6.0f

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, 0x4053d70a    # 3.31f

    .line 327
    .line 328
    .line 329
    const v15, -0x3fd3d70a    # -2.69f

    .line 330
    .line 331
    .line 332
    const/high16 v16, 0x40c00000    # 6.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, -0x401ae148    # -1.79f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x40a66666    # -0.85f

    .line 344
    .line 345
    .line 346
    const v18, -0x414ccccd    # -0.35f

    .line 347
    .line 348
    .line 349
    const v14, -0x4119999a    # -0.45f

    .line 350
    .line 351
    .line 352
    const v15, -0x40f5c28f    # -0.54f

    .line 353
    .line 354
    .line 355
    const v16, -0x40d47ae1    # -0.67f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, -0x3fcd70a4    # -2.79f

    .line 362
    .line 363
    .line 364
    const v2, 0x40328f5c    # 2.79f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const v18, 0x3f35c28f    # 0.71f

    .line 373
    .line 374
    .line 375
    const v13, -0x41b33333    # -0.2f

    .line 376
    .line 377
    .line 378
    const v14, 0x3e4ccccd    # 0.2f

    .line 379
    .line 380
    .line 381
    const v15, -0x41b33333    # -0.2f

    .line 382
    .line 383
    .line 384
    const v16, 0x3f028f5c    # 0.51f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x40328f5c    # 2.79f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3f59999a    # 0.85f

    .line 397
    .line 398
    .line 399
    const v18, -0x414ccccd    # -0.35f

    .line 400
    .line 401
    .line 402
    const v13, 0x3e9eb852    # 0.31f

    .line 403
    .line 404
    .line 405
    const v14, 0x3e9eb852    # 0.31f

    .line 406
    .line 407
    .line 408
    const v15, 0x3f59999a    # 0.85f

    .line 409
    .line 410
    .line 411
    const v16, 0x3db851ec    # 0.09f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x41a00000    # 20.0f

    .line 418
    .line 419
    const/high16 v2, 0x41400000    # 12.0f

    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, 0x41000000    # 8.0f

    .line 425
    .line 426
    const/high16 v18, -0x3f000000    # -8.0f

    .line 427
    .line 428
    const v13, 0x408d70a4    # 4.42f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const/high16 v15, 0x41000000    # 8.0f

    .line 433
    .line 434
    const v16, -0x3f9ae148    # -3.58f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x40ee147b    # -0.57f

    .line 441
    .line 442
    .line 443
    const v18, -0x3fc33333    # -2.95f

    .line 444
    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const v14, -0x407ae148    # -1.04f

    .line 448
    .line 449
    .line 450
    const v15, -0x41b33333    # -0.2f

    .line 451
    .line 452
    .line 453
    const v16, -0x3ffd70a4    # -2.04f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x402e147b    # -1.64f

    .line 460
    .line 461
    .line 462
    const v18, -0x4151eb85    # -0.34f

    .line 463
    .line 464
    .line 465
    const v13, -0x4175c28f    # -0.27f

    .line 466
    .line 467
    .line 468
    const v14, -0x40d47ae1    # -0.67f

    .line 469
    .line 470
    .line 471
    const v15, -0x406f5c29    # -1.13f

    .line 472
    .line 473
    .line 474
    const v16, -0x40a66666    # -0.85f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/rounded/AutorenewKt;->_autorenew:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method

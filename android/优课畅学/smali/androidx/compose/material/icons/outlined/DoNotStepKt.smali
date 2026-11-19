.class public final Landroidx/compose/material/icons/outlined/DoNotStepKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotStep(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DoNotStep"

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
    const v0, 0x417ae148    # 15.68f

    .line 71
    .line 72
    .line 73
    const v2, 0x4194147b    # 18.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x404b851f    # -1.41f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v0, -0x3f70a3d7    # -4.48f

    .line 86
    .line 87
    .line 88
    const v2, 0x408f5c29    # 4.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x41b80000    # 23.0f

    .line 95
    .line 96
    const v2, 0x41333333    # 11.2f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x417ae148    # 15.68f

    .line 103
    .line 104
    .line 105
    const v2, 0x4194147b    # 18.51f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x41426666    # 12.15f

    .line 115
    .line 116
    .line 117
    const v2, 0x416fae14    # 14.98f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x3fbb851f    # -3.07f

    .line 127
    .line 128
    .line 129
    const v2, 0x40447ae1    # 3.07f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x409a3d71    # 4.82f

    .line 136
    .line 137
    .line 138
    const v2, 0x415ccccd    # 13.8f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, -0x3fbae148    # -3.08f

    .line 145
    .line 146
    .line 147
    const v2, 0x40447ae1    # 3.07f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x4114cccd    # 9.3f

    .line 154
    .line 155
    .line 156
    const v2, 0x40cf0a3d    # 6.47f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v2, 0x415ccccd    # 13.8f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x40e28f5c    # 7.08f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x3f70a3d7    # -4.48f

    .line 181
    .line 182
    .line 183
    const v2, 0x408f5c29    # 4.48f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x41426666    # 12.15f

    .line 190
    .line 191
    .line 192
    const v2, 0x416fae14    # 14.98f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41a9999a    # 21.2f

    .line 202
    .line 203
    .line 204
    const v2, 0x41a970a4    # 21.18f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x3fb47ae1    # 1.41f

    .line 211
    .line 212
    .line 213
    const v2, -0x404b851f    # -1.41f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, -0x3f41eb85    # -5.94f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41280000    # 10.5f

    .line 226
    .line 227
    const/high16 v2, 0x41a00000    # 20.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x3f800000    # 1.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x3fd7ae14    # -2.63f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x3fa66666    # 1.3f

    .line 244
    .line 245
    .line 246
    const v18, -0x400f5c29    # -1.88f

    .line 247
    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, -0x40a8f5c3    # -0.84f

    .line 251
    .line 252
    .line 253
    const v15, 0x3f051eb8    # 0.52f

    .line 254
    .line 255
    .line 256
    const v16, -0x40370a3d    # -1.57f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x3ffc28f6    # 1.97f

    .line 263
    .line 264
    .line 265
    const v18, -0x407d70a4    # -1.02f

    .line 266
    .line 267
    .line 268
    const v13, 0x3f147ae1    # 0.58f

    .line 269
    .line 270
    .line 271
    const v14, -0x41947ae1    # -0.23f

    .line 272
    .line 273
    .line 274
    const v15, 0x3fa3d70a    # 1.28f

    .line 275
    .line 276
    .line 277
    const v16, -0x40f0a3d7    # -0.56f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3fb0a3d7    # 1.38f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x40c00000    # 6.0f

    .line 290
    .line 291
    const/high16 v18, 0x41800000    # 16.0f

    .line 292
    .line 293
    const v13, 0x40b7ae14    # 5.74f

    .line 294
    .line 295
    .line 296
    const v14, 0x417f3333    # 15.95f

    .line 297
    .line 298
    .line 299
    const v15, 0x40bbd70a    # 5.87f

    .line 300
    .line 301
    .line 302
    const/high16 v16, 0x41800000    # 16.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x3e851eb8    # 0.26f

    .line 308
    .line 309
    .line 310
    const v2, 0x3eb851ec    # 0.36f

    .line 311
    .line 312
    .line 313
    const v4, -0x41e66666    # -0.15f

    .line 314
    .line 315
    .line 316
    const v6, -0x42b33333    # -0.05f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    const v18, -0x40ca3d71    # -0.71f

    .line 325
    .line 326
    .line 327
    const v13, 0x3e4ccccd    # 0.2f

    .line 328
    .line 329
    .line 330
    const v14, -0x41b33333    # -0.2f

    .line 331
    .line 332
    .line 333
    const v15, 0x3e4ccccd    # 0.2f

    .line 334
    .line 335
    .line 336
    const v16, -0x40fd70a4    # -0.51f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x405c28f6    # -1.28f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f451eb8    # 0.77f

    .line 349
    .line 350
    .line 351
    const v18, -0x40b33333    # -0.8f

    .line 352
    .line 353
    .line 354
    const v13, 0x3e8a3d71    # 0.27f

    .line 355
    .line 356
    .line 357
    const v14, -0x418a3d71    # -0.24f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f07ae14    # 0.53f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x3fa28f5c    # 1.27f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3eb33333    # 0.35f

    .line 373
    .line 374
    .line 375
    const v18, 0x3e19999a    # 0.15f

    .line 376
    .line 377
    .line 378
    const v13, 0x3db851ec    # 0.09f

    .line 379
    .line 380
    .line 381
    const v14, 0x3dcccccd    # 0.1f

    .line 382
    .line 383
    .line 384
    const v15, 0x3e6b851f    # 0.23f

    .line 385
    .line 386
    .line 387
    const v16, 0x3e19999a    # 0.15f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x3eb33333    # 0.35f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x3e800000    # 0.25f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const v18, -0x40ca3d71    # -0.71f

    .line 404
    .line 405
    .line 406
    const v13, 0x3e4ccccd    # 0.2f

    .line 407
    .line 408
    .line 409
    const v14, -0x41b33333    # -0.2f

    .line 410
    .line 411
    .line 412
    const v15, 0x3e4ccccd    # 0.2f

    .line 413
    .line 414
    .line 415
    const v16, -0x40fd70a4    # -0.51f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, -0x404ccccd    # -1.4f

    .line 422
    .line 423
    .line 424
    const v2, -0x404ccccd    # -1.4f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3ee66666    # 0.45f

    .line 431
    .line 432
    .line 433
    const v18, -0x4070a3d7    # -1.12f

    .line 434
    .line 435
    .line 436
    const v13, 0x3e428f5c    # 0.19f

    .line 437
    .line 438
    .line 439
    const v14, -0x4151eb85    # -0.34f

    .line 440
    .line 441
    .line 442
    const v15, 0x3eae147b    # 0.34f

    .line 443
    .line 444
    .line 445
    const v16, -0x40c7ae14    # -0.72f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x3fdae148    # 1.71f

    .line 452
    .line 453
    .line 454
    const v2, 0x3fdc28f6    # 1.72f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3eb33333    # 0.35f

    .line 461
    .line 462
    .line 463
    const v18, 0x3e19999a    # 0.15f

    .line 464
    .line 465
    .line 466
    const v13, 0x3db851ec    # 0.09f

    .line 467
    .line 468
    .line 469
    const v14, 0x3dcccccd    # 0.1f

    .line 470
    .line 471
    .line 472
    const v15, 0x3e6b851f    # 0.23f

    .line 473
    .line 474
    .line 475
    const v16, 0x3e19999a    # 0.15f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3eb33333    # 0.35f

    .line 482
    .line 483
    .line 484
    const/high16 v2, 0x3e800000    # 0.25f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x3c23d70a    # 0.01f

    .line 490
    .line 491
    .line 492
    const v18, -0x40cccccd    # -0.7f

    .line 493
    .line 494
    .line 495
    const v13, 0x3e428f5c    # 0.19f

    .line 496
    .line 497
    .line 498
    const v14, -0x41b33333    # -0.2f

    .line 499
    .line 500
    .line 501
    const v15, 0x3e428f5c    # 0.19f

    .line 502
    .line 503
    .line 504
    const/high16 v16, -0x41000000    # -0.5f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x3f033333    # -7.9f

    .line 510
    .line 511
    .line 512
    const v2, -0x3f033333    # -7.9f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x3fb5c28f    # 1.42f

    .line 519
    .line 520
    .line 521
    const v2, -0x404b851f    # -1.41f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x41a9999a    # 21.2f

    .line 528
    .line 529
    .line 530
    const v2, 0x41a970a4    # 21.18f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x4146b852    # 12.42f

    .line 540
    .line 541
    .line 542
    const v2, 0x417428f6    # 15.26f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, -0x402a3d71    # -1.67f

    .line 549
    .line 550
    .line 551
    const v2, -0x4028f5c3    # -1.68f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x40ed70a4    # 7.42f

    .line 558
    .line 559
    .line 560
    const v2, 0x41873333    # 16.9f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, -0x3fcae148    # -2.83f

    .line 567
    .line 568
    .line 569
    const v18, -0x43dc28f6    # -0.01f

    .line 570
    .line 571
    .line 572
    const v13, -0x40b851ec    # -0.78f

    .line 573
    .line 574
    .line 575
    const v14, 0x3f47ae14    # 0.78f

    .line 576
    .line 577
    .line 578
    const v15, -0x3ffccccd    # -2.05f

    .line 579
    .line 580
    .line 581
    const v16, 0x3f47ae14    # 0.78f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x408ccccd    # 4.4f

    .line 588
    .line 589
    .line 590
    const v2, 0x4185c28f    # 16.72f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x410f5c29    # -0.47f

    .line 597
    .line 598
    .line 599
    const v2, 0x3e75c28f    # 0.24f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x409c28f6    # -0.89f

    .line 606
    .line 607
    .line 608
    const v18, 0x3ec7ae14    # 0.39f

    .line 609
    .line 610
    .line 611
    const v13, -0x416b851f    # -0.29f

    .line 612
    .line 613
    .line 614
    const v14, 0x3e0f5c29    # 0.14f

    .line 615
    .line 616
    .line 617
    const v15, -0x40e8f5c3    # -0.59f

    .line 618
    .line 619
    .line 620
    const v16, 0x3e8a3d71    # 0.27f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x4041eb85    # 3.03f

    .line 627
    .line 628
    .line 629
    const/high16 v2, 0x41900000    # 18.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x40d47ae1    # 6.64f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x4146b852    # 12.42f

    .line 641
    .line 642
    .line 643
    const v2, 0x417428f6    # 15.26f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    const/16 v16, 0x3800

    .line 657
    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    const/high16 v6, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/high16 v8, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    const/high16 v9, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/high16 v12, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    const/4 v14, 0x0

    .line 671
    const/4 v15, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    sput-object v0, Landroidx/compose/material/icons/outlined/DoNotStepKt;->_doNotStep:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    return-object v0
.end method

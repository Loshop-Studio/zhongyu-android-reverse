.class public final Landroidx/compose/material/icons/filled/FitbitKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fitbit:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFitbit(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/FitbitKt;->_fitbit:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Fitbit"

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
    const v0, 0x419f1eb8    # 19.89f

    .line 71
    .line 72
    .line 73
    const v2, 0x415e3d71    # 13.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3ff1eb85    # 1.89f

    .line 80
    .line 81
    .line 82
    const v18, -0x400e147b    # -1.89f

    .line 83
    .line 84
    .line 85
    const v13, 0x3f851eb8    # 1.04f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, 0x3ff1eb85    # 1.89f

    .line 90
    .line 91
    .line 92
    const v16, -0x40a66666    # -0.85f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x40a66666    # -0.85f

    .line 99
    .line 100
    .line 101
    const v2, -0x400e147b    # -1.89f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x41900000    # 18.0f

    .line 108
    .line 109
    const/high16 v18, 0x41400000    # 12.0f

    .line 110
    .line 111
    const v13, 0x4196cccd    # 18.85f

    .line 112
    .line 113
    .line 114
    const v14, 0x4121c28f    # 10.11f

    .line 115
    .line 116
    .line 117
    const/high16 v15, 0x41900000    # 18.0f

    .line 118
    .line 119
    const v16, 0x412f5c29    # 10.96f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x4196cccd    # 18.85f

    .line 126
    .line 127
    .line 128
    const v2, 0x419f1eb8    # 19.89f

    .line 129
    .line 130
    .line 131
    const v4, 0x415e3d71    # 13.89f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x415ae148    # 13.68f

    .line 141
    .line 142
    .line 143
    const v2, 0x417a6666    # 15.65f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x3fd70a3d    # 1.68f

    .line 150
    .line 151
    .line 152
    const v18, -0x4028f5c3    # -1.68f

    .line 153
    .line 154
    .line 155
    const v13, 0x3f6e147b    # 0.93f

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const v15, 0x3fd70a3d    # 1.68f

    .line 160
    .line 161
    .line 162
    const/high16 v16, -0x40c00000    # -0.75f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x40c00000    # -0.75f

    .line 168
    .line 169
    const v2, -0x4028f5c3    # -1.68f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x4028f5c3    # -1.68f

    .line 176
    .line 177
    .line 178
    const v18, 0x3fd70a3d    # 1.68f

    .line 179
    .line 180
    .line 181
    const v13, -0x4091eb85    # -0.93f

    .line 182
    .line 183
    .line 184
    const v15, -0x4028f5c3    # -1.68f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x3f400000    # 0.75f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x416b851f    # 14.72f

    .line 193
    .line 194
    .line 195
    const v2, 0x415ae148    # 13.68f

    .line 196
    .line 197
    .line 198
    const v4, 0x417a6666    # 15.65f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x4116b852    # 9.42f

    .line 208
    .line 209
    .line 210
    const v2, 0x417a6666    # 15.65f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x3fd70a3d    # 1.68f

    .line 217
    .line 218
    .line 219
    const v18, -0x4028f5c3    # -1.68f

    .line 220
    .line 221
    .line 222
    const v13, 0x3f6e147b    # 0.93f

    .line 223
    .line 224
    .line 225
    const v15, 0x3fd70a3d    # 1.68f

    .line 226
    .line 227
    .line 228
    const/high16 v16, -0x40c00000    # -0.75f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x4028f5c3    # -1.68f

    .line 234
    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const v14, -0x4091eb85    # -0.93f

    .line 238
    .line 239
    .line 240
    const/high16 v15, -0x40c00000    # -0.75f

    .line 241
    .line 242
    const v16, -0x4028f5c3    # -1.68f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v18, 0x3fd70a3d    # 1.68f

    .line 249
    .line 250
    .line 251
    const v13, -0x4091eb85    # -0.93f

    .line 252
    .line 253
    .line 254
    const/4 v14, 0x0

    .line 255
    const v15, -0x4028f5c3    # -1.68f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x3f400000    # 0.75f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x417a6666    # 15.65f

    .line 264
    .line 265
    .line 266
    const v18, 0x4116b852    # 9.42f

    .line 267
    .line 268
    .line 269
    const v13, 0x415f851f    # 13.97f

    .line 270
    .line 271
    .line 272
    const v14, 0x410ab852    # 8.67f

    .line 273
    .line 274
    .line 275
    const v15, 0x416b851f    # 14.72f

    .line 276
    .line 277
    .line 278
    const v16, 0x4116b852    # 9.42f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x418f70a4    # 17.93f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x3fd70a3d    # 1.68f

    .line 294
    .line 295
    .line 296
    const v18, -0x4028f5c3    # -1.68f

    .line 297
    .line 298
    .line 299
    const v13, 0x3f6e147b    # 0.93f

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    const v15, 0x3fd70a3d    # 1.68f

    .line 304
    .line 305
    .line 306
    const/high16 v16, -0x40c00000    # -0.75f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x4028f5c3    # -1.68f

    .line 312
    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, -0x4091eb85    # -0.93f

    .line 316
    .line 317
    .line 318
    const/high16 v15, -0x40c00000    # -0.75f

    .line 319
    .line 320
    const v16, -0x4028f5c3    # -1.68f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v18, 0x3fd70a3d    # 1.68f

    .line 327
    .line 328
    .line 329
    const v13, -0x4091eb85    # -0.93f

    .line 330
    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const v15, -0x4028f5c3    # -1.68f

    .line 334
    .line 335
    .line 336
    const/high16 v16, 0x3f400000    # 0.75f

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x417a6666    # 15.65f

    .line 342
    .line 343
    .line 344
    const v18, 0x418f70a4    # 17.93f

    .line 345
    .line 346
    .line 347
    const v13, 0x415f851f    # 13.97f

    .line 348
    .line 349
    .line 350
    const v14, 0x41895c29    # 17.17f

    .line 351
    .line 352
    .line 353
    const v15, 0x416b851f    # 14.72f

    .line 354
    .line 355
    .line 356
    const v16, 0x418f70a4    # 17.93f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x4157851f    # 13.47f

    .line 366
    .line 367
    .line 368
    const v2, 0x41368f5c    # 11.41f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x3fbc28f6    # 1.47f

    .line 375
    .line 376
    .line 377
    const v18, -0x4043d70a    # -1.47f

    .line 378
    .line 379
    .line 380
    const v13, 0x3f4f5c29    # 0.81f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const v15, 0x3fbc28f6    # 1.47f

    .line 385
    .line 386
    .line 387
    const v16, -0x40d70a3d    # -0.66f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x40d70a3d    # -0.66f

    .line 394
    .line 395
    .line 396
    const v2, -0x4043d70a    # -1.47f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x4043d70a    # -1.47f

    .line 403
    .line 404
    .line 405
    const v18, 0x3fbc28f6    # 1.47f

    .line 406
    .line 407
    .line 408
    const v13, -0x40b0a3d7    # -0.81f

    .line 409
    .line 410
    .line 411
    const v15, -0x4043d70a    # -1.47f

    .line 412
    .line 413
    .line 414
    const v16, 0x3f28f5c3    # 0.66f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x412970a4    # 10.59f

    .line 421
    .line 422
    .line 423
    const v2, 0x4157851f    # 13.47f

    .line 424
    .line 425
    .line 426
    const v4, 0x41368f5c    # 11.41f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x41135c29    # 9.21f

    .line 436
    .line 437
    .line 438
    const v2, 0x41368f5c    # 11.41f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3fbc28f6    # 1.47f

    .line 445
    .line 446
    .line 447
    const v18, -0x4043d70a    # -1.47f

    .line 448
    .line 449
    .line 450
    const v13, 0x3f4f5c29    # 0.81f

    .line 451
    .line 452
    .line 453
    const v15, 0x3fbc28f6    # 1.47f

    .line 454
    .line 455
    .line 456
    const v16, -0x40d70a3d    # -0.66f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, -0x40d70a3d    # -0.66f

    .line 463
    .line 464
    .line 465
    const v2, -0x4043d70a    # -1.47f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, -0x4043d70a    # -1.47f

    .line 472
    .line 473
    .line 474
    const v18, 0x3fbc28f6    # 1.47f

    .line 475
    .line 476
    .line 477
    const v13, -0x40b0a3d7    # -0.81f

    .line 478
    .line 479
    .line 480
    const v15, -0x4043d70a    # -1.47f

    .line 481
    .line 482
    .line 483
    const v16, 0x3f28f5c3    # 0.66f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x41135c29    # 9.21f

    .line 490
    .line 491
    .line 492
    const v2, 0x412970a4    # 10.59f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x418dd70a    # 17.73f

    .line 502
    .line 503
    .line 504
    const v2, 0x41368f5c    # 11.41f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x3fbc28f6    # 1.47f

    .line 511
    .line 512
    .line 513
    const v18, -0x4043d70a    # -1.47f

    .line 514
    .line 515
    .line 516
    const v13, 0x3f4f5c29    # 0.81f

    .line 517
    .line 518
    .line 519
    const v15, 0x3fbc28f6    # 1.47f

    .line 520
    .line 521
    .line 522
    const v16, -0x40d70a3d    # -0.66f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, -0x4043d70a    # -1.47f

    .line 529
    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const v14, -0x40b0a3d7    # -0.81f

    .line 533
    .line 534
    .line 535
    const v15, -0x40d70a3d    # -0.66f

    .line 536
    .line 537
    .line 538
    const v16, -0x4043d70a    # -1.47f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v18, 0x3fbc28f6    # 1.47f

    .line 545
    .line 546
    .line 547
    const v13, -0x40b0a3d7    # -0.81f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, -0x4043d70a    # -1.47f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f28f5c3    # 0.66f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x41368f5c    # 11.41f

    .line 561
    .line 562
    .line 563
    const v18, 0x418dd70a    # 17.73f

    .line 564
    .line 565
    .line 566
    const v13, 0x411ee148    # 9.93f

    .line 567
    .line 568
    .line 569
    const v14, 0x41888f5c    # 17.07f

    .line 570
    .line 571
    .line 572
    const v15, 0x412970a4    # 10.59f

    .line 573
    .line 574
    .line 575
    const v16, 0x418dd70a    # 17.73f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x41b00000    # 22.0f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x3fbc28f6    # 1.47f

    .line 590
    .line 591
    .line 592
    const v18, -0x4043d70a    # -1.47f

    .line 593
    .line 594
    .line 595
    const v13, 0x3f4f5c29    # 0.81f

    .line 596
    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    const v15, 0x3fbc28f6    # 1.47f

    .line 600
    .line 601
    .line 602
    const v16, -0x40d70a3d    # -0.66f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, -0x4043d70a    # -1.47f

    .line 609
    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    const v14, -0x40b0a3d7    # -0.81f

    .line 613
    .line 614
    .line 615
    const v15, -0x40d70a3d    # -0.66f

    .line 616
    .line 617
    .line 618
    const v16, -0x4043d70a    # -1.47f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v18, 0x3fbc28f6    # 1.47f

    .line 625
    .line 626
    .line 627
    const v13, -0x40b0a3d7    # -0.81f

    .line 628
    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    const v15, -0x4043d70a    # -1.47f

    .line 632
    .line 633
    .line 634
    const v16, 0x3f28f5c3    # 0.66f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, 0x41368f5c    # 11.41f

    .line 641
    .line 642
    .line 643
    const/high16 v18, 0x41b00000    # 22.0f

    .line 644
    .line 645
    const v13, 0x411ee148    # 9.93f

    .line 646
    .line 647
    .line 648
    const v14, 0x41aab852    # 21.34f

    .line 649
    .line 650
    .line 651
    const v15, 0x412970a4    # 10.59f

    .line 652
    .line 653
    .line 654
    const/high16 v16, 0x41b00000    # 22.0f

    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x409e147b    # 4.94f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, 0x3fbc28f6    # 1.47f

    .line 669
    .line 670
    .line 671
    const v18, -0x4043d70a    # -1.47f

    .line 672
    .line 673
    .line 674
    const v13, 0x3f4f5c29    # 0.81f

    .line 675
    .line 676
    .line 677
    const/4 v14, 0x0

    .line 678
    const v15, 0x3fbc28f6    # 1.47f

    .line 679
    .line 680
    .line 681
    const v16, -0x40d70a3d    # -0.66f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x4143851f    # 12.22f

    .line 688
    .line 689
    .line 690
    const/high16 v2, 0x40000000    # 2.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, -0x4043d70a    # -1.47f

    .line 696
    .line 697
    .line 698
    const v18, 0x3fbc28f6    # 1.47f

    .line 699
    .line 700
    .line 701
    const v13, -0x40b0a3d7    # -0.81f

    .line 702
    .line 703
    .line 704
    const v15, -0x4043d70a    # -1.47f

    .line 705
    .line 706
    .line 707
    const v16, 0x3f28f5c3    # 0.66f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, 0x409e147b    # 4.94f

    .line 714
    .line 715
    .line 716
    const v2, 0x412970a4    # 10.59f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x415428f6    # 13.26f

    .line 726
    .line 727
    .line 728
    const v2, 0x40e51eb8    # 7.16f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v17, 0x3fa147ae    # 1.26f

    .line 735
    .line 736
    .line 737
    const v18, -0x405eb852    # -1.26f

    .line 738
    .line 739
    .line 740
    const v13, 0x3f333333    # 0.7f

    .line 741
    .line 742
    .line 743
    const v15, 0x3fa147ae    # 1.26f

    .line 744
    .line 745
    .line 746
    const v16, -0x40ee147b    # -0.57f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, -0x40ee147b    # -0.57f

    .line 753
    .line 754
    .line 755
    const v2, -0x405eb852    # -1.26f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x405eb852    # -1.26f

    .line 762
    .line 763
    .line 764
    const v18, 0x3fa147ae    # 1.26f

    .line 765
    .line 766
    .line 767
    const v13, -0x40cccccd    # -0.7f

    .line 768
    .line 769
    .line 770
    const v15, -0x405eb852    # -1.26f

    .line 771
    .line 772
    .line 773
    const v16, 0x3f11eb85    # 0.57f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x40ceb852    # 6.46f

    .line 780
    .line 781
    .line 782
    const v2, 0x415428f6    # 13.26f

    .line 783
    .line 784
    .line 785
    const v4, 0x40e51eb8    # 7.16f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, 0x418c147b    # 17.51f

    .line 795
    .line 796
    .line 797
    const v2, 0x40e51eb8    # 7.16f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, 0x3fa147ae    # 1.26f

    .line 804
    .line 805
    .line 806
    const v18, -0x405eb852    # -1.26f

    .line 807
    .line 808
    .line 809
    const v13, 0x3f333333    # 0.7f

    .line 810
    .line 811
    .line 812
    const v15, 0x3fa147ae    # 1.26f

    .line 813
    .line 814
    .line 815
    const v16, -0x40ee147b    # -0.57f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v17, -0x405eb852    # -1.26f

    .line 822
    .line 823
    .line 824
    const/4 v13, 0x0

    .line 825
    const v14, -0x40cccccd    # -0.7f

    .line 826
    .line 827
    .line 828
    const v15, -0x40ee147b    # -0.57f

    .line 829
    .line 830
    .line 831
    const v16, -0x405eb852    # -1.26f

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v18, 0x3fa147ae    # 1.26f

    .line 838
    .line 839
    .line 840
    const v13, -0x40cccccd    # -0.7f

    .line 841
    .line 842
    .line 843
    const/4 v14, 0x0

    .line 844
    const v15, -0x405eb852    # -1.26f

    .line 845
    .line 846
    .line 847
    const v16, 0x3f11eb85    # 0.57f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v17, 0x40e51eb8    # 7.16f

    .line 854
    .line 855
    .line 856
    const v18, 0x418c147b    # 17.51f

    .line 857
    .line 858
    .line 859
    const v13, 0x40bccccd    # 5.9f

    .line 860
    .line 861
    .line 862
    const v14, 0x4187851f    # 16.94f

    .line 863
    .line 864
    .line 865
    const v15, 0x40ceb852    # 6.46f

    .line 866
    .line 867
    .line 868
    const v16, 0x418c147b    # 17.51f

    .line 869
    .line 870
    .line 871
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const v0, 0x411051ec    # 9.02f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v17, 0x3fa147ae    # 1.26f

    .line 884
    .line 885
    .line 886
    const v18, -0x405eb852    # -1.26f

    .line 887
    .line 888
    .line 889
    const v13, 0x3f333333    # 0.7f

    .line 890
    .line 891
    .line 892
    const/4 v14, 0x0

    .line 893
    const v15, 0x3fa147ae    # 1.26f

    .line 894
    .line 895
    .line 896
    const v16, -0x40ee147b    # -0.57f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, -0x405eb852    # -1.26f

    .line 903
    .line 904
    .line 905
    const/4 v13, 0x0

    .line 906
    const v14, -0x40cccccd    # -0.7f

    .line 907
    .line 908
    .line 909
    const v15, -0x40ee147b    # -0.57f

    .line 910
    .line 911
    .line 912
    const v16, -0x405eb852    # -1.26f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const v18, 0x3fa147ae    # 1.26f

    .line 919
    .line 920
    .line 921
    const v13, -0x40cccccd    # -0.7f

    .line 922
    .line 923
    .line 924
    const/4 v14, 0x0

    .line 925
    const v15, -0x405eb852    # -1.26f

    .line 926
    .line 927
    .line 928
    const v16, 0x3f11eb85    # 0.57f

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const v17, 0x40e51eb8    # 7.16f

    .line 935
    .line 936
    .line 937
    const v18, 0x411051ec    # 9.02f

    .line 938
    .line 939
    .line 940
    const v13, 0x40bccccd    # 5.9f

    .line 941
    .line 942
    .line 943
    const v14, 0x41073333    # 8.45f

    .line 944
    .line 945
    .line 946
    const v15, 0x40ceb852    # 6.46f

    .line 947
    .line 948
    .line 949
    const v16, 0x411051ec    # 9.02f

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v0, 0x40528f5c    # 3.29f

    .line 959
    .line 960
    .line 961
    const v2, 0x4150cccd    # 13.05f

    .line 962
    .line 963
    .line 964
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v17, 0x3f866666    # 1.05f

    .line 968
    .line 969
    .line 970
    const v18, -0x4079999a    # -1.05f

    .line 971
    .line 972
    .line 973
    const v13, 0x3f147ae1    # 0.58f

    .line 974
    .line 975
    .line 976
    const/4 v14, 0x0

    .line 977
    const v15, 0x3f866666    # 1.05f

    .line 978
    .line 979
    .line 980
    const v16, -0x410f5c29    # -0.47f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v0, -0x410f5c29    # -0.47f

    .line 987
    .line 988
    .line 989
    const v2, -0x4079999a    # -1.05f

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, -0x4079999a    # -1.05f

    .line 996
    .line 997
    .line 998
    const v18, 0x3f866666    # 1.05f

    .line 999
    .line 1000
    .line 1001
    const v13, -0x40eb851f    # -0.58f

    .line 1002
    .line 1003
    .line 1004
    const v15, -0x4079999a    # -1.05f

    .line 1005
    .line 1006
    .line 1007
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, 0x402d70a4    # 2.71f

    .line 1014
    .line 1015
    .line 1016
    const v2, 0x40528f5c    # 3.29f

    .line 1017
    .line 1018
    .line 1019
    const v4, 0x4150cccd    # 13.05f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    const/16 v16, 0x3800

    .line 1033
    .line 1034
    const/16 v17, 0x0

    .line 1035
    .line 1036
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1037
    .line 1038
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1039
    .line 1040
    const/4 v7, 0x0

    .line 1041
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1042
    .line 1043
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1044
    .line 1045
    const/4 v13, 0x0

    .line 1046
    const/4 v15, 0x0

    .line 1047
    const-string v4, ""

    .line 1048
    .line 1049
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    sput-object v0, Landroidx/compose/material/icons/filled/FitbitKt;->_fitbit:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1058
    .line 1059
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    return-object v0
.end method

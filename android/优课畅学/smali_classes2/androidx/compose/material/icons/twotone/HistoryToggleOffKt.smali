.class public final Landroidx/compose/material/icons/twotone/HistoryToggleOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _historyToggleOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHistoryToggleOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HistoryToggleOffKt;->_historyToggleOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HistoryToggleOff"

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
    const v0, 0x419af5c3    # 19.37f

    .line 71
    .line 72
    .line 73
    const v2, 0x4171999a    # 15.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v2, 0x3fdeb852    # 1.74f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, -0x3fb9999a    # -3.1f

    .line 88
    .line 89
    .line 90
    const v18, 0x3f570a3d    # 0.84f

    .line 91
    .line 92
    .line 93
    const v13, -0x408a3d71    # -0.96f

    .line 94
    .line 95
    .line 96
    const v14, 0x3ee147ae    # 0.44f

    .line 97
    .line 98
    .line 99
    const v15, -0x3fff5c29    # -2.01f

    .line 100
    .line 101
    .line 102
    const v16, 0x3f3ae148    # 0.73f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x3ffeb852    # -2.02f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x4171999a    # 15.1f

    .line 115
    .line 116
    .line 117
    const v18, 0x419af5c3    # 19.37f

    .line 118
    .line 119
    .line 120
    const v13, 0x415bd70a    # 13.74f

    .line 121
    .line 122
    .line 123
    const v14, 0x419eb852    # 19.84f

    .line 124
    .line 125
    .line 126
    const v15, 0x41670a3d    # 14.44f

    .line 127
    .line 128
    .line 129
    const v16, 0x419d3333    # 19.65f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40823d71    # 4.07f

    .line 139
    .line 140
    .line 141
    const/high16 v2, 0x41500000    # 13.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40033333    # 2.05f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x3f570a3d    # 0.84f

    .line 153
    .line 154
    .line 155
    const v18, 0x40466666    # 3.1f

    .line 156
    .line 157
    .line 158
    const v13, 0x3de147ae    # 0.11f

    .line 159
    .line 160
    .line 161
    const v14, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const v15, 0x3ecccccd    # 0.4f

    .line 165
    .line 166
    .line 167
    const v16, 0x4008f5c3    # 2.14f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, -0x40800000    # -1.0f

    .line 174
    .line 175
    const v2, 0x3fdeb852    # 1.74f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x40823d71    # 4.07f

    .line 182
    .line 183
    .line 184
    const/high16 v18, 0x41500000    # 13.0f

    .line 185
    .line 186
    const v13, 0x408b3333    # 4.35f

    .line 187
    .line 188
    .line 189
    const v14, 0x41670a3d    # 14.44f

    .line 190
    .line 191
    .line 192
    const v15, 0x40851eb8    # 4.16f

    .line 193
    .line 194
    .line 195
    const v16, 0x415bd70a    # 13.74f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x409428f6    # 4.63f

    .line 205
    .line 206
    .line 207
    const v2, 0x4171999a    # 15.1f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x402147ae    # -1.74f

    .line 214
    .line 215
    .line 216
    const/high16 v2, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x41500000    # 13.0f

    .line 222
    .line 223
    const v18, 0x40033333    # 2.05f

    .line 224
    .line 225
    .line 226
    const v13, 0x41723d71    # 15.14f

    .line 227
    .line 228
    .line 229
    const v14, 0x401ccccd    # 2.45f

    .line 230
    .line 231
    .line 232
    const v15, 0x4161999a    # 14.1f

    .line 233
    .line 234
    .line 235
    const v16, 0x400a3d71    # 2.16f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x400147ae    # 2.02f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x4171999a    # 15.1f

    .line 248
    .line 249
    .line 250
    const v18, 0x409428f6    # 4.63f

    .line 251
    .line 252
    .line 253
    const v13, 0x415bd70a    # 13.74f

    .line 254
    .line 255
    .line 256
    const v14, 0x40851eb8    # 4.16f

    .line 257
    .line 258
    .line 259
    const v15, 0x41670a3d    # 14.44f

    .line 260
    .line 261
    .line 262
    const v16, 0x408b3333    # 4.35f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41300000    # 11.0f

    .line 272
    .line 273
    const v2, 0x419f70a4    # 19.93f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x400147ae    # 2.02f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, -0x40a8f5c3    # -0.84f

    .line 286
    .line 287
    .line 288
    const v18, -0x3fb9999a    # -3.1f

    .line 289
    .line 290
    .line 291
    const v13, -0x421eb852    # -0.11f

    .line 292
    .line 293
    .line 294
    const v14, -0x40733333    # -1.1f

    .line 295
    .line 296
    .line 297
    const v15, -0x41333333    # -0.4f

    .line 298
    .line 299
    .line 300
    const v16, -0x3ff70a3d    # -2.14f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, -0x402147ae    # -1.74f

    .line 307
    .line 308
    .line 309
    const/high16 v2, 0x3f800000    # 1.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x419f70a4    # 19.93f

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x41300000    # 11.0f

    .line 318
    .line 319
    const v13, 0x419d3333    # 19.65f

    .line 320
    .line 321
    .line 322
    const v14, 0x4118f5c3    # 9.56f

    .line 323
    .line 324
    .line 325
    const v15, 0x419eb852    # 19.84f

    .line 326
    .line 327
    .line 328
    const v16, 0x412428f6    # 10.26f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x410e6666    # 8.9f

    .line 338
    .line 339
    .line 340
    const v2, 0x419af5c3    # 19.37f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, -0x40800000    # -1.0f

    .line 347
    .line 348
    const v2, 0x3fdeb852    # 1.74f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x40466666    # 3.1f

    .line 355
    .line 356
    .line 357
    const v18, 0x3f570a3d    # 0.84f

    .line 358
    .line 359
    .line 360
    const v13, 0x3f75c28f    # 0.96f

    .line 361
    .line 362
    .line 363
    const v14, 0x3ee147ae    # 0.44f

    .line 364
    .line 365
    .line 366
    const v15, 0x4000a3d7    # 2.01f

    .line 367
    .line 368
    .line 369
    const v16, 0x3f3ae148    # 0.73f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x3ffeb852    # -2.02f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x410e6666    # 8.9f

    .line 382
    .line 383
    .line 384
    const v18, 0x419af5c3    # 19.37f

    .line 385
    .line 386
    .line 387
    const v13, 0x412428f6    # 10.26f

    .line 388
    .line 389
    .line 390
    const v14, 0x419eb852    # 19.84f

    .line 391
    .line 392
    .line 393
    const v15, 0x4118f5c3    # 9.56f

    .line 394
    .line 395
    .line 396
    const v16, 0x419d3333    # 19.65f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41300000    # 11.0f

    .line 406
    .line 407
    const v2, 0x40823d71    # 4.07f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x40033333    # 2.05f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, -0x3fb9999a    # -3.1f

    .line 420
    .line 421
    .line 422
    const v18, 0x3f570a3d    # 0.84f

    .line 423
    .line 424
    .line 425
    const v13, -0x40733333    # -1.1f

    .line 426
    .line 427
    .line 428
    const v14, 0x3de147ae    # 0.11f

    .line 429
    .line 430
    .line 431
    const v15, -0x3ff70a3d    # -2.14f

    .line 432
    .line 433
    .line 434
    const v16, 0x3ecccccd    # 0.4f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v2, 0x3fdeb852    # 1.74f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x41300000    # 11.0f

    .line 449
    .line 450
    const v18, 0x40823d71    # 4.07f

    .line 451
    .line 452
    .line 453
    const v13, 0x4118f5c3    # 9.56f

    .line 454
    .line 455
    .line 456
    const v14, 0x408b3333    # 4.35f

    .line 457
    .line 458
    .line 459
    const v15, 0x412428f6    # 10.26f

    .line 460
    .line 461
    .line 462
    const v16, 0x40851eb8    # 4.16f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x40e570a4    # 7.17f

    .line 472
    .line 473
    .line 474
    const v2, 0x4192e148    # 18.36f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, -0x407eb852    # -1.01f

    .line 481
    .line 482
    .line 483
    const v2, 0x3fdeb852    # 1.74f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x3feeb852    # -2.27f

    .line 490
    .line 491
    .line 492
    const v18, -0x3feeb852    # -2.27f

    .line 493
    .line 494
    .line 495
    const v13, -0x40deb852    # -0.63f

    .line 496
    .line 497
    .line 498
    const v14, -0x40a147ae    # -0.87f

    .line 499
    .line 500
    .line 501
    const v15, -0x404ccccd    # -1.4f

    .line 502
    .line 503
    .line 504
    const v16, -0x402e147b    # -1.64f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x4192e148    # 18.36f

    .line 514
    .line 515
    .line 516
    const v18, 0x40e570a4    # 7.17f

    .line 517
    .line 518
    .line 519
    const v13, 0x418b47ae    # 17.41f

    .line 520
    .line 521
    .line 522
    const v14, 0x40c28f5c    # 6.08f

    .line 523
    .line 524
    .line 525
    const v15, 0x418f5c29    # 17.92f

    .line 526
    .line 527
    .line 528
    const v16, 0x40d2e148    # 6.59f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x410e6666    # 8.9f

    .line 538
    .line 539
    .line 540
    const v2, 0x409428f6    # 4.63f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, -0x40800000    # -1.0f

    .line 547
    .line 548
    const v2, -0x402147ae    # -1.74f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x40033333    # 2.05f

    .line 555
    .line 556
    .line 557
    const/high16 v18, 0x41300000    # 11.0f

    .line 558
    .line 559
    const v13, 0x401ccccd    # 2.45f

    .line 560
    .line 561
    .line 562
    const v14, 0x410dc28f    # 8.86f

    .line 563
    .line 564
    .line 565
    const v15, 0x400a3d71    # 2.16f

    .line 566
    .line 567
    .line 568
    const v16, 0x411e6666    # 9.9f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x400147ae    # 2.02f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x409428f6    # 4.63f

    .line 581
    .line 582
    .line 583
    const v18, 0x410e6666    # 8.9f

    .line 584
    .line 585
    .line 586
    const v13, 0x40851eb8    # 4.16f

    .line 587
    .line 588
    .line 589
    const v14, 0x412428f6    # 10.26f

    .line 590
    .line 591
    .line 592
    const v15, 0x408b3333    # 4.35f

    .line 593
    .line 594
    .line 595
    const v16, 0x4118f5c3    # 9.56f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x419f70a4    # 19.93f

    .line 605
    .line 606
    .line 607
    const/high16 v2, 0x41500000    # 13.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x40f0a3d7    # -0.56f

    .line 613
    .line 614
    .line 615
    const v18, 0x40066666    # 2.1f

    .line 616
    .line 617
    .line 618
    const v13, -0x4247ae14    # -0.09f

    .line 619
    .line 620
    .line 621
    const v14, 0x3f3d70a4    # 0.74f

    .line 622
    .line 623
    .line 624
    const v15, -0x4170a3d7    # -0.28f

    .line 625
    .line 626
    .line 627
    const v16, 0x3fb851ec    # 1.44f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const v2, 0x3fdeb852    # 1.74f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x3f570a3d    # 0.84f

    .line 642
    .line 643
    .line 644
    const v18, -0x3fb9999a    # -3.1f

    .line 645
    .line 646
    .line 647
    const v13, 0x3ee147ae    # 0.44f

    .line 648
    .line 649
    .line 650
    const v14, -0x408a3d71    # -0.96f

    .line 651
    .line 652
    .line 653
    const v15, 0x3f3ae148    # 0.73f

    .line 654
    .line 655
    .line 656
    const v16, -0x3fff5c29    # -2.01f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x419f70a4    # 19.93f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x4186a3d7    # 16.83f

    .line 672
    .line 673
    .line 674
    const v2, 0x4192e148    # 18.36f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, 0x3f8147ae    # 1.01f

    .line 681
    .line 682
    .line 683
    const v2, 0x3fdeb852    # 1.74f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x401147ae    # 2.27f

    .line 690
    .line 691
    .line 692
    const v18, -0x3feeb852    # -2.27f

    .line 693
    .line 694
    .line 695
    const v13, 0x3f5eb852    # 0.87f

    .line 696
    .line 697
    .line 698
    const v14, -0x40deb852    # -0.63f

    .line 699
    .line 700
    .line 701
    const v15, 0x3fd1eb85    # 1.64f

    .line 702
    .line 703
    .line 704
    const v16, -0x404ccccd    # -1.4f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, -0x407eb852    # -1.01f

    .line 711
    .line 712
    .line 713
    const v2, -0x402147ae    # -1.74f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, 0x4186a3d7    # 16.83f

    .line 720
    .line 721
    .line 722
    const v18, 0x4192e148    # 18.36f

    .line 723
    .line 724
    .line 725
    const v13, 0x418f5c29    # 17.92f

    .line 726
    .line 727
    .line 728
    const v14, 0x418b47ae    # 17.41f

    .line 729
    .line 730
    .line 731
    const v15, 0x418b47ae    # 17.41f

    .line 732
    .line 733
    .line 734
    const v16, 0x418f5c29    # 17.92f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x40b47ae1    # 5.64f

    .line 744
    .line 745
    .line 746
    const v2, 0x40e570a4    # 7.17f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x40c570a4    # 6.17f

    .line 753
    .line 754
    .line 755
    const v2, 0x4078f5c3    # 3.89f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, 0x4079999a    # 3.9f

    .line 762
    .line 763
    .line 764
    const v18, 0x40c570a4    # 6.17f

    .line 765
    .line 766
    .line 767
    const v13, 0x40a947ae    # 5.29f

    .line 768
    .line 769
    .line 770
    const v14, 0x4090f5c3    # 4.53f

    .line 771
    .line 772
    .line 773
    const v15, 0x4090f5c3    # 4.53f

    .line 774
    .line 775
    .line 776
    const v16, 0x40a947ae    # 5.29f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x3f8147ae    # 1.01f

    .line 783
    .line 784
    .line 785
    const v2, 0x3fdeb852    # 1.74f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, 0x40e570a4    # 7.17f

    .line 792
    .line 793
    .line 794
    const v18, 0x40b47ae1    # 5.64f

    .line 795
    .line 796
    .line 797
    const v13, 0x40c28f5c    # 6.08f

    .line 798
    .line 799
    .line 800
    const v14, 0x40d2e148    # 6.59f

    .line 801
    .line 802
    .line 803
    const v15, 0x40d2e148    # 6.59f

    .line 804
    .line 805
    .line 806
    const v16, 0x40c28f5c    # 6.08f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x40b47ae1    # 5.64f

    .line 816
    .line 817
    .line 818
    const v2, 0x4186a3d7    # 16.83f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v0, 0x4079999a    # 3.9f

    .line 825
    .line 826
    .line 827
    const v2, 0x418ea3d7    # 17.83f

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v17, 0x401147ae    # 2.27f

    .line 834
    .line 835
    .line 836
    const v18, 0x401147ae    # 2.27f

    .line 837
    .line 838
    .line 839
    const v13, 0x3f2147ae    # 0.63f

    .line 840
    .line 841
    .line 842
    const v14, 0x3f5eb852    # 0.87f

    .line 843
    .line 844
    .line 845
    const v15, 0x3fb33333    # 1.4f

    .line 846
    .line 847
    .line 848
    const v16, 0x3fd1eb85    # 1.64f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, 0x3f8147ae    # 1.01f

    .line 855
    .line 856
    .line 857
    const v2, -0x402147ae    # -1.74f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v17, 0x40b47ae1    # 5.64f

    .line 864
    .line 865
    .line 866
    const v18, 0x4186a3d7    # 16.83f

    .line 867
    .line 868
    .line 869
    const v13, 0x40d2e148    # 6.59f

    .line 870
    .line 871
    .line 872
    const v14, 0x418f5c29    # 17.92f

    .line 873
    .line 874
    .line 875
    const v15, 0x40c28f5c    # 6.08f

    .line 876
    .line 877
    .line 878
    const v16, 0x418b47ae    # 17.41f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v0, 0x40e00000    # 7.0f

    .line 888
    .line 889
    const/high16 v2, 0x41500000    # 13.0f

    .line 890
    .line 891
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const/high16 v0, -0x40000000    # -2.0f

    .line 895
    .line 896
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v0, 0x40ad1eb8    # 5.41f

    .line 900
    .line 901
    .line 902
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v0, 0x408947ae    # 4.29f

    .line 906
    .line 907
    .line 908
    const v2, 0x408947ae    # 4.29f

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v0, 0x3fb47ae1    # 1.41f

    .line 915
    .line 916
    .line 917
    const v2, -0x404b851f    # -1.41f

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v0, 0x413970a4    # 11.59f

    .line 924
    .line 925
    .line 926
    const/high16 v2, 0x41500000    # 13.0f

    .line 927
    .line 928
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v0, 0x40e00000    # 7.0f

    .line 932
    .line 933
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    const/16 v16, 0x3800

    .line 944
    .line 945
    const/16 v17, 0x0

    .line 946
    .line 947
    const/high16 v6, 0x3f800000    # 1.0f

    .line 948
    .line 949
    const/high16 v8, 0x3f800000    # 1.0f

    .line 950
    .line 951
    const/4 v7, 0x0

    .line 952
    const/high16 v9, 0x3f800000    # 1.0f

    .line 953
    .line 954
    const/high16 v12, 0x3f800000    # 1.0f

    .line 955
    .line 956
    const/4 v13, 0x0

    .line 957
    const/4 v14, 0x0

    .line 958
    const/4 v15, 0x0

    .line 959
    const-string v4, ""

    .line 960
    .line 961
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    sput-object v0, Landroidx/compose/material/icons/twotone/HistoryToggleOffKt;->_historyToggleOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    return-object v0
.end method

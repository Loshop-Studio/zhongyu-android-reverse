.class public final Landroidx/compose/material/icons/rounded/SportsMartialArtsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsMartialArts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsMartialArts(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsMartialArtsKt;->_sportsMartialArts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsMartialArts"

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
    const v4, 0x41987ae1    # 19.06f

    .line 71
    .line 72
    .line 73
    const v6, 0x40266666    # 2.6f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4139999a    # 11.6f

    .line 80
    .line 81
    .line 82
    const v6, 0x410b3333    # 8.7f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x40651eb8    # -1.21f

    .line 89
    .line 90
    .line 91
    const v6, -0x407ae148    # -1.04f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x401eb852    # 2.48f

    .line 98
    .line 99
    .line 100
    const v6, -0x4048f5c3    # -1.43f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x3e570a3d    # 0.21f

    .line 107
    .line 108
    .line 109
    const v26, -0x40370a3d    # -1.57f

    .line 110
    .line 111
    .line 112
    const v21, 0x3f11eb85    # 0.57f

    .line 113
    .line 114
    .line 115
    const v22, -0x41570a3d    # -0.33f

    .line 116
    .line 117
    .line 118
    const v23, 0x3f2b851f    # 0.67f

    .line 119
    .line 120
    .line 121
    const v24, -0x4071eb85    # -1.11f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x3fc33333    # -2.95f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, -0x404b851f    # -1.41f

    .line 136
    .line 137
    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    const v21, -0x413851ec    # -0.39f

    .line 141
    .line 142
    .line 143
    const v22, -0x413851ec    # -0.39f

    .line 144
    .line 145
    .line 146
    const v23, -0x407d70a4    # -1.02f

    .line 147
    .line 148
    .line 149
    const v24, -0x413851ec    # -0.39f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/16 v25, 0x0

    .line 160
    .line 161
    const v26, 0x3fb47ae1    # 1.41f

    .line 162
    .line 163
    .line 164
    const v22, 0x3ec7ae14    # 0.39f

    .line 165
    .line 166
    .line 167
    const v23, -0x413851ec    # -0.39f

    .line 168
    .line 169
    .line 170
    const v24, 0x3f828f5c    # 1.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x4001eb85    # 2.03f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x40ab3333    # 5.35f

    .line 183
    .line 184
    .line 185
    const v6, 0x410428f6    # 8.26f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, -0x41147ae1    # -0.46f

    .line 192
    .line 193
    .line 194
    const v26, 0x3f19999a    # 0.6f

    .line 195
    .line 196
    .line 197
    const v21, -0x41947ae1    # -0.23f

    .line 198
    .line 199
    .line 200
    const v22, 0x3e051eb8    # 0.13f

    .line 201
    .line 202
    .line 203
    const v24, 0x3eb33333    # 0.35f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, -0x408a3d71    # -0.96f

    .line 210
    .line 211
    .line 212
    const v6, 0x405f5c29    # 3.49f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x3dcccccd    # 0.1f

    .line 219
    .line 220
    .line 221
    const v26, 0x3f451eb8    # 0.77f

    .line 222
    .line 223
    .line 224
    const v21, -0x4270a3d7    # -0.07f

    .line 225
    .line 226
    .line 227
    const v22, 0x3e851eb8    # 0.26f

    .line 228
    .line 229
    .line 230
    const v23, -0x42dc28f6    # -0.04f

    .line 231
    .line 232
    .line 233
    const v24, 0x3f07ae14    # 0.53f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x3fdeb852    # 1.74f

    .line 240
    .line 241
    .line 242
    const v6, 0x404147ae    # 3.02f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v25, 0x3faf5c29    # 1.37f

    .line 249
    .line 250
    .line 251
    const v26, 0x3ebd70a4    # 0.37f

    .line 252
    .line 253
    .line 254
    const v21, 0x3e8f5c29    # 0.28f

    .line 255
    .line 256
    .line 257
    const v22, 0x3ef5c28f    # 0.48f

    .line 258
    .line 259
    .line 260
    const v23, 0x3f63d70a    # 0.89f

    .line 261
    .line 262
    .line 263
    const v24, 0x3f23d70a    # 0.64f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/4 v4, 0x0

    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, 0x3ebd70a4    # 0.37f

    .line 274
    .line 275
    .line 276
    const v26, -0x4050a3d7    # -1.37f

    .line 277
    .line 278
    .line 279
    const v21, 0x3ef5c28f    # 0.48f

    .line 280
    .line 281
    .line 282
    const v22, -0x4170a3d7    # -0.28f

    .line 283
    .line 284
    .line 285
    const v23, 0x3f23d70a    # 0.64f

    .line 286
    .line 287
    .line 288
    const v24, -0x409c28f6    # -0.89f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, -0x403c28f6    # -1.53f

    .line 295
    .line 296
    .line 297
    const v6, -0x3fd5c28f    # -2.66f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, 0x3eb851ec    # 0.36f

    .line 304
    .line 305
    .line 306
    const v6, -0x405ae148    # -1.29f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x41180000    # 9.5f

    .line 313
    .line 314
    const/high16 v6, 0x41500000    # 13.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x3ee147ae    # 0.44f

    .line 320
    .line 321
    .line 322
    const/high16 v6, 0x41000000    # 8.0f

    .line 323
    .line 324
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v25, 0x3f866666    # 1.05f

    .line 328
    .line 329
    .line 330
    const/high16 v26, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const v21, 0x3cf5c28f    # 0.03f

    .line 333
    .line 334
    .line 335
    const v22, 0x3f0f5c29    # 0.56f

    .line 336
    .line 337
    .line 338
    const v23, 0x3efae148    # 0.49f

    .line 339
    .line 340
    .line 341
    const/high16 v24, 0x3f800000    # 1.0f

    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/4 v4, 0x0

    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v26, -0x40800000    # -1.0f

    .line 351
    .line 352
    const v21, 0x3f0f5c29    # 0.56f

    .line 353
    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const v23, 0x3f828f5c    # 1.02f

    .line 358
    .line 359
    .line 360
    const v24, -0x411eb852    # -0.44f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x3ee66666    # 0.45f

    .line 367
    .line 368
    .line 369
    const/high16 v6, -0x3ef00000    # -9.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x40fbd70a    # 7.87f

    .line 375
    .line 376
    .line 377
    const v6, -0x3f0147ae    # -7.96f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x3d4ccccd    # 0.05f

    .line 384
    .line 385
    .line 386
    const v26, -0x40570a3d    # -1.32f

    .line 387
    .line 388
    .line 389
    const v21, 0x3eb851ec    # 0.36f

    .line 390
    .line 391
    .line 392
    const v22, -0x4147ae14    # -0.36f

    .line 393
    .line 394
    .line 395
    const v23, 0x3ec28f5c    # 0.38f

    .line 396
    .line 397
    .line 398
    const v24, -0x4091eb85    # -0.93f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/4 v4, 0x0

    .line 405
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x41987ae1    # 19.06f

    .line 409
    .line 410
    .line 411
    const v26, 0x40266666    # 2.6f

    .line 412
    .line 413
    .line 414
    const v21, 0x41a08f5c    # 20.07f

    .line 415
    .line 416
    .line 417
    const v22, 0x40147ae1    # 2.32f

    .line 418
    .line 419
    .line 420
    const v23, 0x419bc28f    # 19.47f

    .line 421
    .line 422
    .line 423
    const v24, 0x401147ae    # 2.27f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/16 v16, 0x3800

    .line 437
    .line 438
    const/16 v17, 0x0

    .line 439
    .line 440
    const/high16 v6, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/high16 v8, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const/high16 v9, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v12, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 462
    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 464
    .line 465
    .line 466
    move-result-wide v6

    .line 467
    const/4 v0, 0x0

    .line 468
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40a00000    # 5.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, -0x40000000    # -2.0f

    .line 490
    .line 491
    const/4 v2, 0x0

    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v18, 0x40800000    # 4.0f

    .line 496
    .line 497
    const/16 v19, 0x0

    .line 498
    .line 499
    const/high16 v13, 0x40000000    # 2.0f

    .line 500
    .line 501
    const/high16 v14, 0x40000000    # 2.0f

    .line 502
    .line 503
    const/16 v16, 0x1

    .line 504
    .line 505
    const/16 v17, 0x1

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v18, -0x3f800000    # -4.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/16 v16, 0x3800

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v7, 0x0

    .line 526
    const/high16 v12, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const-string v4, ""

    .line 531
    .line 532
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsMartialArtsKt;->_sportsMartialArts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    return-object v0
.end method

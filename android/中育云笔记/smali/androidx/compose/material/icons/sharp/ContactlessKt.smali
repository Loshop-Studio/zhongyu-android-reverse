.class public final Landroidx/compose/material/icons/sharp/ContactlessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactless:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactless(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Contactless"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41200000    # 10.0f

    .line 95
    .line 96
    const/high16 v18, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x40b0a3d7    # 5.52f

    .line 100
    .line 101
    .line 102
    const v15, 0x408f5c29    # 4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v16, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, -0x3f70a3d7    # -4.48f

    .line 111
    .line 112
    .line 113
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 114
    .line 115
    const/high16 v4, 0x41200000    # 10.0f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v18, 0x40000000    # 2.0f

    .line 123
    .line 124
    const/high16 v13, 0x41b00000    # 22.0f

    .line 125
    .line 126
    const v14, 0x40cf5c29    # 6.48f

    .line 127
    .line 128
    .line 129
    const v15, 0x418c28f6    # 17.52f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x41075c29    # 8.46f

    .line 141
    .line 142
    .line 143
    const v2, 0x41673333    # 14.45f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x40e33333    # 7.1f

    .line 150
    .line 151
    .line 152
    const v2, 0x415d47ae    # 13.83f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3ecccccd    # 0.4f

    .line 159
    .line 160
    .line 161
    const v18, -0x4011eb85    # -1.86f

    .line 162
    .line 163
    .line 164
    const v13, 0x3e8f5c29    # 0.28f

    .line 165
    .line 166
    .line 167
    const v14, -0x40e3d70a    # -0.61f

    .line 168
    .line 169
    .line 170
    const v15, 0x3ed1eb85    # 0.41f

    .line 171
    .line 172
    .line 173
    const v16, -0x406147ae    # -1.24f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x41333333    # -0.4f

    .line 180
    .line 181
    .line 182
    const v18, -0x4019999a    # -1.8f

    .line 183
    .line 184
    .line 185
    const v13, -0x43dc28f6    # -0.01f

    .line 186
    .line 187
    .line 188
    const v14, -0x40deb852    # -0.63f

    .line 189
    .line 190
    .line 191
    const v15, -0x41f0a3d7    # -0.14f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x3fae147b    # 1.36f

    .line 198
    .line 199
    .line 200
    const v2, -0x40deb852    # -0.63f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x3f0a3d71    # 0.54f

    .line 207
    .line 208
    .line 209
    const v18, 0x4019999a    # 2.4f

    .line 210
    .line 211
    .line 212
    const v13, 0x3eb33333    # 0.35f

    .line 213
    .line 214
    .line 215
    const/high16 v14, 0x3f400000    # 0.75f

    .line 216
    .line 217
    const v15, 0x3f07ae14    # 0.53f

    .line 218
    .line 219
    .line 220
    const v16, 0x3fc7ae14    # 1.56f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x41075c29    # 8.46f

    .line 227
    .line 228
    .line 229
    const v18, 0x41673333    # 14.45f

    .line 230
    .line 231
    .line 232
    const v13, 0x411028f6    # 9.01f

    .line 233
    .line 234
    .line 235
    const v14, 0x414ccccd    # 12.8f

    .line 236
    .line 237
    .line 238
    const v15, 0x410d47ae    # 8.83f

    .line 239
    .line 240
    .line 241
    const v16, 0x415a3d71    # 13.64f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x41387ae1    # 11.53f

    .line 251
    .line 252
    .line 253
    const v2, 0x4180147b    # 16.01f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, -0x4059999a    # -1.3f

    .line 260
    .line 261
    .line 262
    const v2, -0x40c28f5c    # -0.74f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3f47ae14    # 0.78f

    .line 269
    .line 270
    .line 271
    const v18, -0x3fb66666    # -3.15f

    .line 272
    .line 273
    .line 274
    const v13, 0x3f051eb8    # 0.52f

    .line 275
    .line 276
    .line 277
    const v14, -0x40947ae1    # -0.92f

    .line 278
    .line 279
    .line 280
    const v15, 0x3f47ae14    # 0.78f

    .line 281
    .line 282
    .line 283
    const v16, -0x40028f5c    # -1.98f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x40b33333    # -0.8f

    .line 290
    .line 291
    .line 292
    const v18, -0x3fa66666    # -3.4f

    .line 293
    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, -0x4067ae14    # -1.19f

    .line 297
    .line 298
    .line 299
    const v15, -0x4175c28f    # -0.27f

    .line 300
    .line 301
    .line 302
    const v16, -0x3feae148    # -2.33f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x40d47ae1    # -0.67f

    .line 309
    .line 310
    .line 311
    const v2, 0x3fab851f    # 1.34f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3f75c28f    # 0.96f

    .line 318
    .line 319
    .line 320
    const v18, 0x40823d71    # 4.07f

    .line 321
    .line 322
    .line 323
    const v13, 0x3f23d70a    # 0.64f

    .line 324
    .line 325
    .line 326
    const v14, 0x3fa3d70a    # 1.28f

    .line 327
    .line 328
    .line 329
    const v15, 0x3f75c28f    # 0.96f

    .line 330
    .line 331
    .line 332
    const v16, 0x4029999a    # 2.65f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x41387ae1    # 11.53f

    .line 339
    .line 340
    .line 341
    const v18, 0x4180147b    # 16.01f

    .line 342
    .line 343
    .line 344
    const v13, 0x414828f6    # 12.51f

    .line 345
    .line 346
    .line 347
    const v14, 0x4158cccd    # 13.55f

    .line 348
    .line 349
    .line 350
    const v15, 0x4142e148    # 12.18f

    .line 351
    .line 352
    .line 353
    const v16, 0x416dc28f    # 14.86f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x416ab852    # 14.67f

    .line 363
    .line 364
    .line 365
    const v2, 0x418aa3d7    # 17.33f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x40533333    # -1.35f

    .line 372
    .line 373
    .line 374
    const v2, -0x40d70a3d    # -0.66f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3f970a3d    # 1.18f

    .line 381
    .line 382
    .line 383
    const v18, -0x3f69eb85    # -4.69f

    .line 384
    .line 385
    .line 386
    const v13, 0x3f47ae14    # 0.78f

    .line 387
    .line 388
    .line 389
    const v14, -0x40333333    # -1.6f

    .line 390
    .line 391
    .line 392
    const v15, 0x3f970a3d    # 1.18f

    .line 393
    .line 394
    .line 395
    const v16, -0x3fb47ae1    # -3.18f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x4068f5c3    # -1.18f

    .line 402
    .line 403
    .line 404
    const v18, -0x3f6b851f    # -4.64f

    .line 405
    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, -0x403eb852    # -1.51f

    .line 409
    .line 410
    .line 411
    const v15, -0x41333333    # -0.4f

    .line 412
    .line 413
    .line 414
    const v16, -0x3fbb851f    # -3.07f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x40d47ae1    # -0.67f

    .line 421
    .line 422
    .line 423
    const v2, 0x3fab851f    # 1.34f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41800000    # 16.0f

    .line 430
    .line 431
    const v18, 0x413fae14    # 11.98f

    .line 432
    .line 433
    .line 434
    const v13, 0x4178f5c3    # 15.56f

    .line 435
    .line 436
    .line 437
    const v14, 0x41073333    # 8.45f

    .line 438
    .line 439
    .line 440
    const/high16 v15, 0x41800000    # 16.0f

    .line 441
    .line 442
    const v16, 0x4123ae14    # 10.23f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x416ab852    # 14.67f

    .line 449
    .line 450
    .line 451
    const v18, 0x418aa3d7    # 17.33f

    .line 452
    .line 453
    .line 454
    const/high16 v13, 0x41800000    # 16.0f

    .line 455
    .line 456
    const v14, 0x415b851f    # 13.72f

    .line 457
    .line 458
    .line 459
    const v15, 0x4178f5c3    # 15.56f

    .line 460
    .line 461
    .line 462
    const v16, 0x417851ec    # 15.52f

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/16 v16, 0x3800

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/high16 v6, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v8, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v7, 0x0

    .line 484
    const/high16 v9, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v12, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const/4 v14, 0x0

    .line 490
    const/4 v15, 0x0

    .line 491
    const-string v4, ""

    .line 492
    .line 493
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    sput-object v0, Landroidx/compose/material/icons/sharp/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v0
.end method

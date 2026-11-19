.class public final Landroidx/compose/material/icons/rounded/ContactlessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactless:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactless(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Contactless"

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
    const/high16 v0, 0x410c0000    # 8.75f

    .line 141
    .line 142
    const v2, 0x415ae148    # 13.68f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x407d70a4    # -1.02f

    .line 149
    .line 150
    .line 151
    const v18, 0x3ee66666    # 0.45f

    .line 152
    .line 153
    .line 154
    const v13, -0x41fae148    # -0.13f

    .line 155
    .line 156
    .line 157
    const v14, 0x3edc28f6    # 0.43f

    .line 158
    .line 159
    .line 160
    const v15, -0x40e147ae    # -0.62f

    .line 161
    .line 162
    .line 163
    const v16, 0x3f2147ae    # 0.63f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, -0x41333333    # -0.4f

    .line 174
    .line 175
    .line 176
    const v18, -0x4099999a    # -0.9f

    .line 177
    .line 178
    .line 179
    const v13, -0x4151eb85    # -0.34f

    .line 180
    .line 181
    .line 182
    const v14, -0x41dc28f6    # -0.16f

    .line 183
    .line 184
    .line 185
    const v15, -0x40fd70a4    # -0.51f

    .line 186
    .line 187
    .line 188
    const v16, -0x40f5c28f    # -0.54f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x3e2e147b    # 0.17f

    .line 195
    .line 196
    .line 197
    const v18, -0x406147ae    # -1.24f

    .line 198
    .line 199
    .line 200
    const v13, 0x3df5c28f    # 0.12f

    .line 201
    .line 202
    .line 203
    const v14, -0x412e147b    # -0.41f

    .line 204
    .line 205
    .line 206
    const v15, 0x3e3851ec    # 0.18f

    .line 207
    .line 208
    .line 209
    const v16, -0x40ab851f    # -0.83f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x41d1eb85    # -0.17f

    .line 216
    .line 217
    .line 218
    const v18, -0x4068f5c3    # -1.18f

    .line 219
    .line 220
    .line 221
    const v13, -0x43dc28f6    # -0.01f

    .line 222
    .line 223
    .line 224
    const v15, -0x428a3d71    # -0.06f

    .line 225
    .line 226
    .line 227
    const v16, -0x40b33333    # -0.8f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x3ecccccd    # 0.4f

    .line 234
    .line 235
    .line 236
    const v18, -0x4099999a    # -0.9f

    .line 237
    .line 238
    .line 239
    const v13, -0x42333333    # -0.1f

    .line 240
    .line 241
    .line 242
    const v14, -0x4147ae14    # -0.36f

    .line 243
    .line 244
    .line 245
    const v15, 0x3d75c28f    # 0.06f

    .line 246
    .line 247
    .line 248
    const/high16 v16, -0x40c00000    # -0.75f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3f851eb8    # 1.04f

    .line 257
    .line 258
    .line 259
    const v18, 0x3efae148    # 0.49f

    .line 260
    .line 261
    .line 262
    const v13, 0x3ed70a3d    # 0.42f

    .line 263
    .line 264
    .line 265
    const v14, -0x41bd70a4    # -0.19f

    .line 266
    .line 267
    .line 268
    const v15, 0x3f68f5c3    # 0.91f

    .line 269
    .line 270
    .line 271
    const v16, 0x3d23d70a    # 0.04f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3e6b851f    # 0.23f

    .line 278
    .line 279
    .line 280
    const v18, 0x3fc8f5c3    # 1.57f

    .line 281
    .line 282
    .line 283
    const v13, 0x3e19999a    # 0.15f

    .line 284
    .line 285
    .line 286
    const v14, 0x3f028f5c    # 0.51f

    .line 287
    .line 288
    .line 289
    const v15, 0x3e6147ae    # 0.22f

    .line 290
    .line 291
    .line 292
    const v16, 0x3f83d70a    # 1.03f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x410c0000    # 8.75f

    .line 299
    .line 300
    const v18, 0x415ae148    # 13.68f

    .line 301
    .line 302
    .line 303
    const/high16 v13, 0x41100000    # 9.0f

    .line 304
    .line 305
    const v14, 0x41487ae1    # 12.53f

    .line 306
    .line 307
    .line 308
    const v15, 0x410eb852    # 8.92f

    .line 309
    .line 310
    .line 311
    const v16, 0x4151c28f    # 13.11f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x413e3d71    # 11.89f

    .line 321
    .line 322
    .line 323
    const v2, 0x417451ec    # 15.27f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x407851ec    # -1.06f

    .line 330
    .line 331
    .line 332
    const v18, 0x3eb33333    # 0.35f

    .line 333
    .line 334
    .line 335
    const v13, -0x41d1eb85    # -0.17f

    .line 336
    .line 337
    .line 338
    const v14, 0x3ed1eb85    # 0.41f

    .line 339
    .line 340
    .line 341
    const v15, -0x40d47ae1    # -0.67f

    .line 342
    .line 343
    .line 344
    const v16, 0x3f11eb85    # 0.57f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/4 v0, 0x0

    .line 351
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x415c28f6    # -0.32f

    .line 355
    .line 356
    .line 357
    const v18, -0x408f5c29    # -0.94f

    .line 358
    .line 359
    .line 360
    const v13, -0x41570a3d    # -0.33f

    .line 361
    .line 362
    .line 363
    const v14, -0x41bd70a4    # -0.19f

    .line 364
    .line 365
    .line 366
    const v15, -0x41147ae1    # -0.46f

    .line 367
    .line 368
    .line 369
    const v16, -0x40e8f5c3    # -0.59f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x3efae148    # 0.49f

    .line 376
    .line 377
    .line 378
    const v18, -0x3fdc28f6    # -2.56f

    .line 379
    .line 380
    .line 381
    const v13, 0x3ea8f5c3    # 0.33f

    .line 382
    .line 383
    .line 384
    const v14, -0x40bae148    # -0.77f

    .line 385
    .line 386
    .line 387
    const v15, 0x3efae148    # 0.49f

    .line 388
    .line 389
    .line 390
    const v16, -0x402f5c29    # -1.63f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x40f851ec    # -0.53f

    .line 397
    .line 398
    .line 399
    const v18, -0x3fce147b    # -2.78f

    .line 400
    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const v14, -0x408a3d71    # -0.96f

    .line 404
    .line 405
    .line 406
    const v15, -0x41c7ae14    # -0.18f

    .line 407
    .line 408
    .line 409
    const v16, -0x400e147b    # -1.89f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x3eb851ec    # 0.36f

    .line 416
    .line 417
    .line 418
    const v18, -0x408f5c29    # -0.94f

    .line 419
    .line 420
    .line 421
    const v13, -0x41f0a3d7    # -0.14f

    .line 422
    .line 423
    .line 424
    const v14, -0x4147ae14    # -0.36f

    .line 425
    .line 426
    .line 427
    const v15, 0x3ca3d70a    # 0.02f

    .line 428
    .line 429
    .line 430
    const v16, -0x40bd70a4    # -0.76f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x3f83d70a    # 1.03f

    .line 440
    .line 441
    .line 442
    const v18, 0x3ec7ae14    # 0.39f

    .line 443
    .line 444
    .line 445
    const v13, 0x3ec7ae14    # 0.39f

    .line 446
    .line 447
    .line 448
    const v14, -0x41b33333    # -0.2f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f5eb852    # 0.87f

    .line 452
    .line 453
    .line 454
    const v16, -0x435c28f6    # -0.02f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3f2147ae    # 0.63f

    .line 461
    .line 462
    .line 463
    const v18, 0x40551eb8    # 3.33f

    .line 464
    .line 465
    .line 466
    const v13, 0x3ed70a3d    # 0.42f

    .line 467
    .line 468
    .line 469
    const v14, 0x3f87ae14    # 1.06f

    .line 470
    .line 471
    .line 472
    const v15, 0x3f2147ae    # 0.63f

    .line 473
    .line 474
    .line 475
    const v16, 0x400b851f    # 2.18f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x413e3d71    # 11.89f

    .line 482
    .line 483
    .line 484
    const v18, 0x417451ec    # 15.27f

    .line 485
    .line 486
    .line 487
    const v13, 0x414828f6    # 12.51f

    .line 488
    .line 489
    .line 490
    const/high16 v14, 0x41540000    # 13.25f

    .line 491
    .line 492
    const v15, 0x4144cccd    # 12.3f

    .line 493
    .line 494
    .line 495
    const v16, 0x4164f5c3    # 14.31f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41700000    # 15.0f

    .line 505
    .line 506
    const v2, 0x4184cccd    # 16.6f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, -0x407d70a4    # -1.02f

    .line 513
    .line 514
    .line 515
    const v18, 0x3ec7ae14    # 0.39f

    .line 516
    .line 517
    .line 518
    const v13, -0x41d1eb85    # -0.17f

    .line 519
    .line 520
    .line 521
    const v14, 0x3ecccccd    # 0.4f

    .line 522
    .line 523
    .line 524
    const v15, -0x40dc28f6    # -0.64f

    .line 525
    .line 526
    .line 527
    const v16, 0x3f147ae1    # 0.58f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/4 v0, 0x0

    .line 534
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x41428f5c    # -0.37f

    .line 538
    .line 539
    .line 540
    const v18, -0x408ccccd    # -0.95f

    .line 541
    .line 542
    .line 543
    const v13, -0x414ccccd    # -0.35f

    .line 544
    .line 545
    .line 546
    const v14, -0x41d1eb85    # -0.17f

    .line 547
    .line 548
    .line 549
    const v15, -0x40fae148    # -0.52f

    .line 550
    .line 551
    .line 552
    const v16, -0x40e8f5c3    # -0.59f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, 0x3f63d70a    # 0.89f

    .line 559
    .line 560
    .line 561
    const v18, -0x3f7e147b    # -4.06f

    .line 562
    .line 563
    .line 564
    const v13, 0x3f170a3d    # 0.59f

    .line 565
    .line 566
    .line 567
    const v14, -0x404e147b    # -1.39f

    .line 568
    .line 569
    .line 570
    const v15, 0x3f63d70a    # 0.89f

    .line 571
    .line 572
    .line 573
    const/high16 v16, -0x3fd00000    # -2.75f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x409eb852    # -0.88f

    .line 579
    .line 580
    .line 581
    const v18, -0x3f7fae14    # -4.01f

    .line 582
    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    const v14, -0x405851ec    # -1.31f

    .line 586
    .line 587
    .line 588
    const v15, -0x41666666    # -0.3f

    .line 589
    .line 590
    .line 591
    const v16, -0x3fd66666    # -2.65f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x3eb851ec    # 0.36f

    .line 598
    .line 599
    .line 600
    const v18, -0x408ccccd    # -0.95f

    .line 601
    .line 602
    .line 603
    const v13, -0x41dc28f6    # -0.16f

    .line 604
    .line 605
    .line 606
    const v14, -0x4147ae14    # -0.36f

    .line 607
    .line 608
    .line 609
    const v15, 0x3c23d70a    # 0.01f

    .line 610
    .line 611
    .line 612
    const v16, -0x40b851ec    # -0.78f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x41700000    # 15.0f

    .line 619
    .line 620
    const v18, 0x40eccccd    # 7.4f

    .line 621
    .line 622
    .line 623
    const v13, 0x4165eb85    # 14.37f

    .line 624
    .line 625
    .line 626
    const v14, 0x40da3d71    # 6.82f

    .line 627
    .line 628
    .line 629
    const v15, 0x416d47ae    # 14.83f

    .line 630
    .line 631
    .line 632
    const/high16 v16, 0x40e00000    # 7.0f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v17, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const v18, 0x40928f5c    # 4.58f

    .line 640
    .line 641
    .line 642
    const v13, 0x3f28f5c3    # 0.66f

    .line 643
    .line 644
    .line 645
    const v14, 0x3fc51eb8    # 1.54f

    .line 646
    .line 647
    .line 648
    const/high16 v15, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const v16, 0x40451eb8    # 3.08f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, 0x41700000    # 15.0f

    .line 657
    .line 658
    const v18, 0x4184cccd    # 16.6f

    .line 659
    .line 660
    .line 661
    const/high16 v13, 0x41800000    # 16.0f

    .line 662
    .line 663
    const v14, 0x4157ae14    # 13.48f

    .line 664
    .line 665
    .line 666
    const v15, 0x417a8f5c    # 15.66f

    .line 667
    .line 668
    .line 669
    const v16, 0x4170a3d7    # 15.04f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/rounded/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-object v0
.end method

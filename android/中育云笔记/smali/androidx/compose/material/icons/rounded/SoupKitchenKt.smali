.class public final Landroidx/compose/material/icons/rounded/SoupKitchenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoupKitchen(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SoupKitchen"

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
    const v0, 0x40c4cccd    # 6.15f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41580000    # 13.5f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40ca3d71    # -0.71f

    .line 79
    .line 80
    .line 81
    const v18, -0x40a147ae    # -0.87f

    .line 82
    .line 83
    .line 84
    const v13, -0x41147ae1    # -0.46f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x40b33333    # -0.8f

    .line 89
    .line 90
    .line 91
    const v16, -0x4128f5c3    # -0.42f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40b00000    # 5.5f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v13, 0x40af5c29    # 5.48f

    .line 102
    .line 103
    .line 104
    const v14, 0x41473333    # 12.45f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x40b00000    # 5.5f

    .line 108
    .line 109
    const v16, 0x4143d70a    # 12.24f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v18, -0x3f9851ec    # -3.62f

    .line 118
    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const/high16 v14, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, -0x3fc9999a    # -2.85f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3e2e147b    # 0.17f

    .line 132
    .line 133
    .line 134
    const v18, -0x4091eb85    # -0.93f

    .line 135
    .line 136
    .line 137
    const v14, -0x416b851f    # -0.29f

    .line 138
    .line 139
    .line 140
    const v15, 0x3cf5c28f    # 0.03f

    .line 141
    .line 142
    .line 143
    const v16, -0x40e8f5c3    # -0.59f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x40aae148    # 5.34f

    .line 150
    .line 151
    .line 152
    const/high16 v18, 0x40e00000    # 7.0f

    .line 153
    .line 154
    const v13, 0x4098f5c3    # 4.78f

    .line 155
    .line 156
    .line 157
    const v14, 0x40e5c28f    # 7.18f

    .line 158
    .line 159
    .line 160
    const v15, 0x40a147ae    # 5.04f

    .line 161
    .line 162
    .line 163
    const/high16 v16, 0x40e00000    # 7.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3f35c28f    # 0.71f

    .line 169
    .line 170
    .line 171
    const v18, 0x3f5c28f6    # 0.86f

    .line 172
    .line 173
    .line 174
    const v13, 0x3ee66666    # 0.45f

    .line 175
    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const v15, 0x3f4ccccd    # 0.8f

    .line 179
    .line 180
    .line 181
    const v16, 0x3ed70a3d    # 0.42f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40c00000    # 6.0f

    .line 188
    .line 189
    const v18, 0x4106147b    # 8.38f

    .line 190
    .line 191
    .line 192
    const v13, 0x40c051ec    # 6.01f

    .line 193
    .line 194
    .line 195
    const v14, 0x4100a3d7    # 8.04f

    .line 196
    .line 197
    .line 198
    const/high16 v15, 0x40c00000    # 6.0f

    .line 199
    .line 200
    const v16, 0x41035c29    # 8.21f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40e00000    # 7.0f

    .line 207
    .line 208
    const/high16 v18, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v13, 0x40c00000    # 6.0f

    .line 211
    .line 212
    const v14, 0x41126666    # 9.15f

    .line 213
    .line 214
    .line 215
    const/high16 v15, 0x40e00000    # 7.0f

    .line 216
    .line 217
    const/high16 v16, 0x41300000    # 11.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x41d1eb85    # -0.17f

    .line 223
    .line 224
    .line 225
    const v18, 0x3f8147ae    # 1.01f

    .line 226
    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x3ed70a3d    # 0.42f

    .line 230
    .line 231
    .line 232
    const v15, -0x425c28f6    # -0.08f

    .line 233
    .line 234
    .line 235
    const v16, 0x3f428f5c    # 0.76f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x40c4cccd    # 6.15f

    .line 242
    .line 243
    .line 244
    const/high16 v18, 0x41580000    # 13.5f

    .line 245
    .line 246
    const v13, 0x40d75c29    # 6.73f

    .line 247
    .line 248
    .line 249
    const v14, 0x4154f5c3    # 13.31f

    .line 250
    .line 251
    .line 252
    const v15, 0x40ceb852    # 6.46f

    .line 253
    .line 254
    .line 255
    const/high16 v16, 0x41580000    # 13.5f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x414a6666    # 12.65f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3f2e147b    # 0.68f

    .line 270
    .line 271
    .line 272
    const v18, -0x41051eb8    # -0.49f

    .line 273
    .line 274
    .line 275
    const v13, 0x3e9eb852    # 0.31f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, 0x3f147ae1    # 0.58f

    .line 280
    .line 281
    .line 282
    const v16, -0x41bd70a4    # -0.19f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3e2e147b    # 0.17f

    .line 289
    .line 290
    .line 291
    const v18, -0x407eb852    # -1.01f

    .line 292
    .line 293
    .line 294
    const v13, 0x3db851ec    # 0.09f

    .line 295
    .line 296
    .line 297
    const/high16 v14, -0x41800000    # -0.25f

    .line 298
    .line 299
    const v15, 0x3e2e147b    # 0.17f

    .line 300
    .line 301
    .line 302
    const v16, -0x40e8f5c3    # -0.59f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, -0x40800000    # -1.0f

    .line 309
    .line 310
    const v18, -0x3f9851ec    # -3.62f

    .line 311
    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const/high16 v14, -0x40800000    # -1.0f

    .line 315
    .line 316
    const/high16 v15, -0x40800000    # -1.0f

    .line 317
    .line 318
    const v16, -0x3fc9999a    # -2.85f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3d23d70a    # 0.04f

    .line 325
    .line 326
    .line 327
    const v18, -0x40fd70a4    # -0.51f

    .line 328
    .line 329
    .line 330
    const v14, -0x41d1eb85    # -0.17f

    .line 331
    .line 332
    .line 333
    const v15, 0x3c23d70a    # 0.01f

    .line 334
    .line 335
    .line 336
    const v16, -0x4151eb85    # -0.34f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x413d70a4    # 11.84f

    .line 343
    .line 344
    .line 345
    const/high16 v18, 0x40e00000    # 7.0f

    .line 346
    .line 347
    const v13, 0x414a147b    # 12.63f

    .line 348
    .line 349
    .line 350
    const v14, 0x40ed70a4    # 7.42f

    .line 351
    .line 352
    .line 353
    const v15, 0x4144a3d7    # 12.29f

    .line 354
    .line 355
    .line 356
    const/high16 v16, 0x40e00000    # 7.0f

    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x40d47ae1    # -0.67f

    .line 362
    .line 363
    .line 364
    const v18, 0x3ee66666    # 0.45f

    .line 365
    .line 366
    .line 367
    const v13, -0x416b851f    # -0.29f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const v15, -0x40f0a3d7    # -0.56f

    .line 372
    .line 373
    .line 374
    const v16, 0x3e3851ec    # 0.18f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x41300000    # 11.0f

    .line 381
    .line 382
    const v18, 0x4106147b    # 8.38f

    .line 383
    .line 384
    .line 385
    const v13, 0x41307ae1    # 11.03f

    .line 386
    .line 387
    .line 388
    const v14, 0x40f947ae    # 7.79f

    .line 389
    .line 390
    .line 391
    const/high16 v15, 0x41300000    # 11.0f

    .line 392
    .line 393
    const v16, 0x410147ae    # 8.08f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41400000    # 12.0f

    .line 400
    .line 401
    const/high16 v18, 0x41400000    # 12.0f

    .line 402
    .line 403
    const/high16 v13, 0x41300000    # 11.0f

    .line 404
    .line 405
    const v14, 0x41126666    # 9.15f

    .line 406
    .line 407
    .line 408
    const/high16 v15, 0x41400000    # 12.0f

    .line 409
    .line 410
    const/high16 v16, 0x41300000    # 11.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x428a3d71    # -0.06f

    .line 416
    .line 417
    .line 418
    const v18, 0x3f2147ae    # 0.63f

    .line 419
    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const v14, 0x3e75c28f    # 0.24f

    .line 423
    .line 424
    .line 425
    const v15, -0x435c28f6    # -0.02f

    .line 426
    .line 427
    .line 428
    const v16, 0x3ee66666    # 0.45f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x414a6666    # 12.65f

    .line 435
    .line 436
    .line 437
    const/high16 v18, 0x41580000    # 13.5f

    .line 438
    .line 439
    const v13, 0x413d999a    # 11.85f

    .line 440
    .line 441
    .line 442
    const v14, 0x415147ae    # 13.08f

    .line 443
    .line 444
    .line 445
    const v15, 0x41430a3d    # 12.19f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x41580000    # 13.5f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x41166666    # 9.4f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3f2e147b    # 0.68f

    .line 463
    .line 464
    .line 465
    const v18, -0x41051eb8    # -0.49f

    .line 466
    .line 467
    .line 468
    const v13, 0x3e9eb852    # 0.31f

    .line 469
    .line 470
    .line 471
    const/4 v14, 0x0

    .line 472
    const v15, 0x3f147ae1    # 0.58f

    .line 473
    .line 474
    .line 475
    const v16, -0x41bd70a4    # -0.19f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x3e2e147b    # 0.17f

    .line 482
    .line 483
    .line 484
    const v18, -0x407eb852    # -1.01f

    .line 485
    .line 486
    .line 487
    const v13, 0x3db851ec    # 0.09f

    .line 488
    .line 489
    .line 490
    const/high16 v14, -0x41800000    # -0.25f

    .line 491
    .line 492
    const v15, 0x3e2e147b    # 0.17f

    .line 493
    .line 494
    .line 495
    const v16, -0x40e8f5c3    # -0.59f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, -0x40800000    # -1.0f

    .line 502
    .line 503
    const v18, -0x3f9851ec    # -3.62f

    .line 504
    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const/high16 v14, -0x40800000    # -1.0f

    .line 508
    .line 509
    const/high16 v15, -0x40800000    # -1.0f

    .line 510
    .line 511
    const v16, -0x3fc9999a    # -2.85f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x3d23d70a    # 0.04f

    .line 518
    .line 519
    .line 520
    const v18, -0x40fd70a4    # -0.51f

    .line 521
    .line 522
    .line 523
    const v14, -0x41d1eb85    # -0.17f

    .line 524
    .line 525
    .line 526
    const v15, 0x3c23d70a    # 0.01f

    .line 527
    .line 528
    .line 529
    const v16, -0x4151eb85    # -0.34f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x410970a4    # 8.59f

    .line 536
    .line 537
    .line 538
    const/high16 v18, 0x40e00000    # 7.0f

    .line 539
    .line 540
    const v13, 0x4116147b    # 9.38f

    .line 541
    .line 542
    .line 543
    const v14, 0x40ed70a4    # 7.42f

    .line 544
    .line 545
    .line 546
    const v15, 0x4110a3d7    # 9.04f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x40e00000    # 7.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x40fd70a4    # 7.92f

    .line 555
    .line 556
    .line 557
    const v18, 0x40ee6666    # 7.45f

    .line 558
    .line 559
    .line 560
    const v13, 0x4104a3d7    # 8.29f

    .line 561
    .line 562
    .line 563
    const/high16 v14, 0x40e00000    # 7.0f

    .line 564
    .line 565
    const v15, 0x41007ae1    # 8.03f

    .line 566
    .line 567
    .line 568
    const v16, 0x40e5c28f    # 7.18f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, 0x40f80000    # 7.75f

    .line 575
    .line 576
    const v18, 0x4106147b    # 8.38f

    .line 577
    .line 578
    .line 579
    const v13, 0x40f8f5c3    # 7.78f

    .line 580
    .line 581
    .line 582
    const v14, 0x40f947ae    # 7.79f

    .line 583
    .line 584
    .line 585
    const/high16 v15, 0x40f80000    # 7.75f

    .line 586
    .line 587
    const v16, 0x410147ae    # 8.08f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v17, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const v18, 0x4067ae14    # 3.62f

    .line 596
    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const v14, 0x3f451eb8    # 0.77f

    .line 600
    .line 601
    .line 602
    const/high16 v15, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const v16, 0x402851ec    # 2.63f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, -0x428a3d71    # -0.06f

    .line 611
    .line 612
    .line 613
    const v18, 0x3f2147ae    # 0.63f

    .line 614
    .line 615
    .line 616
    const v14, 0x3e75c28f    # 0.24f

    .line 617
    .line 618
    .line 619
    const v15, -0x435c28f6    # -0.02f

    .line 620
    .line 621
    .line 622
    const v16, 0x3ee66666    # 0.45f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x41166666    # 9.4f

    .line 629
    .line 630
    .line 631
    const/high16 v18, 0x41580000    # 13.5f

    .line 632
    .line 633
    const v13, 0x4109999a    # 8.6f

    .line 634
    .line 635
    .line 636
    const v14, 0x415147ae    # 13.08f

    .line 637
    .line 638
    .line 639
    const v15, 0x410f0a3d    # 8.94f

    .line 640
    .line 641
    .line 642
    const/high16 v16, 0x41580000    # 13.5f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x40cbd70a    # 6.37f

    .line 651
    .line 652
    .line 653
    const v2, 0x41a3ae14    # 20.46f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, 0x3f8f5c29    # 1.12f

    .line 660
    .line 661
    .line 662
    const v18, -0x40970a3d    # -0.91f

    .line 663
    .line 664
    .line 665
    const v13, 0x3f11eb85    # 0.57f

    .line 666
    .line 667
    .line 668
    const v14, 0x3d8f5c29    # 0.07f

    .line 669
    .line 670
    .line 671
    const v15, 0x3f8a3d71    # 1.08f

    .line 672
    .line 673
    .line 674
    const v16, -0x4151eb85    # -0.34f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v17, 0x41accccd    # 21.6f

    .line 681
    .line 682
    .line 683
    const/high16 v18, 0x40a00000    # 5.0f

    .line 684
    .line 685
    const v13, 0x41acb852    # 21.59f

    .line 686
    .line 687
    .line 688
    const v14, 0x40a8f5c3    # 5.28f

    .line 689
    .line 690
    .line 691
    const v15, 0x41accccd    # 21.6f

    .line 692
    .line 693
    .line 694
    const v16, 0x40a3d70a    # 5.12f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 701
    .line 702
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 703
    .line 704
    const/4 v13, 0x0

    .line 705
    const v14, -0x402ccccd    # -1.65f

    .line 706
    .line 707
    .line 708
    const v15, -0x40533333    # -1.35f

    .line 709
    .line 710
    .line 711
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, -0x3fc147ae    # -2.98f

    .line 717
    .line 718
    .line 719
    const v18, 0x4029999a    # 2.65f

    .line 720
    .line 721
    .line 722
    const v13, -0x403ae148    # -1.54f

    .line 723
    .line 724
    .line 725
    const/4 v14, 0x0

    .line 726
    const v15, -0x3fcc28f6    # -2.81f

    .line 727
    .line 728
    .line 729
    const v16, 0x3f947ae1    # 1.16f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, 0x41687ae1    # 14.53f

    .line 736
    .line 737
    .line 738
    const/high16 v2, 0x41700000    # 15.0f

    .line 739
    .line 740
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x407f5c29    # 3.99f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v17, -0x40851eb8    # -0.98f

    .line 750
    .line 751
    .line 752
    const v18, 0x3f91eb85    # 1.14f

    .line 753
    .line 754
    .line 755
    const v13, -0x40e66666    # -0.6f

    .line 756
    .line 757
    .line 758
    const v15, -0x40770a3d    # -1.07f

    .line 759
    .line 760
    .line 761
    const v16, 0x3f0a3d71    # 0.54f

    .line 762
    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v17, 0x411c0000    # 9.75f

    .line 768
    .line 769
    const/high16 v18, 0x41b00000    # 22.0f

    .line 770
    .line 771
    const v13, 0x40628f5c    # 3.54f

    .line 772
    .line 773
    .line 774
    const v14, 0x419bae14    # 19.46f

    .line 775
    .line 776
    .line 777
    const v15, 0x40cc7ae1    # 6.39f

    .line 778
    .line 779
    .line 780
    const/high16 v16, 0x41b00000    # 22.0f

    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v17, 0x40d6b852    # 6.71f

    .line 786
    .line 787
    .line 788
    const v18, -0x3f38a3d7    # -6.23f

    .line 789
    .line 790
    .line 791
    const v13, 0x405eb852    # 3.48f

    .line 792
    .line 793
    .line 794
    const/4 v14, 0x0

    .line 795
    const v15, 0x40cae148    # 6.34f

    .line 796
    .line 797
    .line 798
    const v16, -0x3fd147ae    # -2.73f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x3f933333    # 1.15f

    .line 805
    .line 806
    .line 807
    const v2, -0x3ed2147b    # -10.87f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v17, 0x4194cccd    # 18.6f

    .line 814
    .line 815
    .line 816
    const/high16 v18, 0x40800000    # 4.0f

    .line 817
    .line 818
    const v13, 0x418d47ae    # 17.66f

    .line 819
    .line 820
    .line 821
    const v14, 0x408c7ae1    # 4.39f

    .line 822
    .line 823
    .line 824
    const v15, 0x4190a3d7    # 18.08f

    .line 825
    .line 826
    .line 827
    const/high16 v16, 0x40800000    # 4.0f

    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v17, 0x3f800000    # 1.0f

    .line 833
    .line 834
    const/high16 v18, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const v13, 0x3f0ccccd    # 0.55f

    .line 837
    .line 838
    .line 839
    const/4 v14, 0x0

    .line 840
    const/high16 v15, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const v16, 0x3ee66666    # 0.45f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, -0x43dc28f6    # -0.01f

    .line 849
    .line 850
    .line 851
    const v18, 0x3e9eb852    # 0.31f

    .line 852
    .line 853
    .line 854
    const/4 v13, 0x0

    .line 855
    const v14, 0x3d8f5c29    # 0.07f

    .line 856
    .line 857
    .line 858
    const v15, -0x43dc28f6    # -0.01f

    .line 859
    .line 860
    .line 861
    const v16, 0x3e3851ec    # 0.18f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v17, 0x41a3ae14    # 20.46f

    .line 868
    .line 869
    .line 870
    const v18, 0x40cbd70a    # 6.37f

    .line 871
    .line 872
    .line 873
    const v13, 0x419c6666    # 19.55f

    .line 874
    .line 875
    .line 876
    const v14, 0x40bae148    # 5.84f

    .line 877
    .line 878
    .line 879
    const v15, 0x419f70a4    # 19.93f

    .line 880
    .line 881
    .line 882
    const v16, 0x40c9999a    # 6.3f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, 0x40cbd70a    # 6.37f

    .line 889
    .line 890
    .line 891
    const v2, 0x41a3ae14    # 20.46f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    const/16 v16, 0x3800

    .line 905
    .line 906
    const/16 v17, 0x0

    .line 907
    .line 908
    const/high16 v6, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/high16 v8, 0x3f800000    # 1.0f

    .line 911
    .line 912
    const/4 v7, 0x0

    .line 913
    const/high16 v9, 0x3f800000    # 1.0f

    .line 914
    .line 915
    const/high16 v12, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/4 v13, 0x0

    .line 918
    const/4 v14, 0x0

    .line 919
    const/4 v15, 0x0

    .line 920
    const-string v4, ""

    .line 921
    .line 922
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    sput-object v0, Landroidx/compose/material/icons/rounded/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 931
    .line 932
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    return-object v0
.end method

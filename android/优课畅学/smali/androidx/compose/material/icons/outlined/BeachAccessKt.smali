.class public final Landroidx/compose/material/icons/outlined/BeachAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBeachAccess(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BeachAccess"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v2, 0x419c8f5c    # 19.57f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40495810    # -1.427f

    .line 79
    .line 80
    .line 81
    const v2, 0x3fb6c8b4    # 1.428f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, -0x3f31db23    # -6.442f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3fb70a3d    # 1.43f

    .line 94
    .line 95
    .line 96
    const v2, -0x4049374c    # -1.428f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x4151eb85    # 13.12f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x40400000    # 3.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x3f1b851f    # -7.14f

    .line 114
    .line 115
    .line 116
    const v18, 0x403ccccd    # 2.95f

    .line 117
    .line 118
    .line 119
    const v13, -0x3fdae148    # -2.58f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const v15, -0x3f5ae148    # -5.16f

    .line 124
    .line 125
    .line 126
    const v16, 0x3f7ae148    # 0.98f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, -0x43dc28f6    # -0.01f

    .line 133
    .line 134
    .line 135
    const v2, 0x3c23d70a    # 0.01f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const v18, 0x4164f5c3    # 14.31f

    .line 144
    .line 145
    .line 146
    const v13, -0x3f833333    # -3.95f

    .line 147
    .line 148
    .line 149
    const v14, 0x407ccccd    # 3.95f

    .line 150
    .line 151
    .line 152
    const v15, -0x3f833333    # -3.95f

    .line 153
    .line 154
    .line 155
    const v16, 0x4125c28f    # 10.36f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x4164cccd    # 14.3f

    .line 162
    .line 163
    .line 164
    const v2, -0x3e9b0a3d    # -14.31f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x4151eb85    # 13.12f

    .line 171
    .line 172
    .line 173
    const/high16 v18, 0x40400000    # 3.0f

    .line 174
    .line 175
    const v13, 0x41926666    # 18.3f

    .line 176
    .line 177
    .line 178
    const v14, 0x407f5c29    # 3.99f

    .line 179
    .line 180
    .line 181
    const v15, 0x417b5c29    # 15.71f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x40400000    # 3.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x40c47ae1    # 6.14f

    .line 193
    .line 194
    .line 195
    const v2, 0x418a28f6    # 17.27f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x40a00000    # 5.0f

    .line 202
    .line 203
    const v18, 0x4151eb85    # 13.12f

    .line 204
    .line 205
    .line 206
    const v13, 0x40accccd    # 5.4f

    .line 207
    .line 208
    .line 209
    const v14, 0x41803d71    # 16.03f

    .line 210
    .line 211
    .line 212
    const/high16 v15, 0x40a00000    # 5.0f

    .line 213
    .line 214
    const v16, 0x4169c28f    # 14.61f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3eeb851f    # 0.46f

    .line 221
    .line 222
    .line 223
    const v18, -0x3fd51eb8    # -2.67f

    .line 224
    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, -0x4091eb85    # -0.93f

    .line 228
    .line 229
    .line 230
    const v15, 0x3e23d70a    # 0.16f

    .line 231
    .line 232
    .line 233
    const v16, -0x40170a3d    # -1.82f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x40047ae1    # 2.07f

    .line 240
    .line 241
    .line 242
    const v18, 0x40ae147b    # 5.44f

    .line 243
    .line 244
    .line 245
    const v13, 0x3e428f5c    # 0.19f

    .line 246
    .line 247
    .line 248
    const v14, 0x3ff47ae1    # 1.91f

    .line 249
    .line 250
    .line 251
    const v15, 0x3f63d70a    # 0.89f

    .line 252
    .line 253
    .line 254
    const v16, 0x40728f5c    # 3.79f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x3fb0a3d7    # 1.38f

    .line 261
    .line 262
    .line 263
    const v2, -0x404e147b    # -1.39f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x410fae14    # 8.98f

    .line 273
    .line 274
    .line 275
    const v2, 0x4166e148    # 14.43f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x40f33333    # 7.6f

    .line 282
    .line 283
    .line 284
    const v18, 0x40f33333    # 7.6f

    .line 285
    .line 286
    .line 287
    const v13, 0x40f428f6    # 7.63f

    .line 288
    .line 289
    .line 290
    const v14, 0x4146147b    # 12.38f

    .line 291
    .line 292
    .line 293
    const v15, 0x40e3d70a    # 7.12f

    .line 294
    .line 295
    .line 296
    const v16, 0x411ee148    # 9.93f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 303
    .line 304
    const v18, -0x41c7ae14    # -0.18f

    .line 305
    .line 306
    .line 307
    const v13, 0x3f147ae1    # 0.58f

    .line 308
    .line 309
    .line 310
    const v14, -0x420a3d71    # -0.12f

    .line 311
    .line 312
    .line 313
    const v15, 0x3f947ae1    # 1.16f

    .line 314
    .line 315
    .line 316
    const v16, -0x41c7ae14    # -0.18f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x40a28f5c    # 5.08f

    .line 323
    .line 324
    .line 325
    const v18, 0x3fc7ae14    # 1.56f

    .line 326
    .line 327
    .line 328
    const v13, 0x3fe66666    # 1.8f

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const v15, 0x40633333    # 3.55f

    .line 333
    .line 334
    .line 335
    const v16, 0x3f0ccccd    # 0.55f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x3f51999a    # -5.45f

    .line 342
    .line 343
    .line 344
    const v2, 0x40ae6666    # 5.45f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x41273333    # 10.45f

    .line 354
    .line 355
    .line 356
    const v2, 0x40aeb852    # 5.46f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x402ae148    # 2.67f

    .line 363
    .line 364
    .line 365
    const v18, -0x41147ae1    # -0.46f

    .line 366
    .line 367
    .line 368
    const v13, 0x3f59999a    # 0.85f

    .line 369
    .line 370
    .line 371
    const v14, -0x41666666    # -0.3f

    .line 372
    .line 373
    .line 374
    const v15, 0x3fdeb852    # 1.74f

    .line 375
    .line 376
    .line 377
    const v16, -0x41147ae1    # -0.46f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x4084cccd    # 4.15f

    .line 384
    .line 385
    .line 386
    const v18, 0x3f91eb85    # 1.14f

    .line 387
    .line 388
    .line 389
    const v13, 0x3fbeb852    # 1.49f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const v15, 0x403a3d71    # 2.91f

    .line 394
    .line 395
    .line 396
    const v16, 0x3ecccccd    # 0.4f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3fb1eb85    # 1.39f

    .line 403
    .line 404
    .line 405
    const v2, -0x404e147b    # -1.39f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x3f523d71    # -5.43f

    .line 412
    .line 413
    .line 414
    const v18, -0x3ffb851f    # -2.07f

    .line 415
    .line 416
    .line 417
    const v13, -0x402ccccd    # -1.65f

    .line 418
    .line 419
    .line 420
    const v14, -0x4068f5c3    # -1.18f

    .line 421
    .line 422
    .line 423
    const v15, -0x3f9eb852    # -3.52f

    .line 424
    .line 425
    .line 426
    const v16, -0x400f5c29    # -1.88f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const/16 v16, 0x3800

    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    const/high16 v6, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/high16 v8, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    const/high16 v9, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/high16 v12, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const/4 v14, 0x0

    .line 454
    const/4 v15, 0x0

    .line 455
    const-string v4, ""

    .line 456
    .line 457
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    sput-object v0, Landroidx/compose/material/icons/outlined/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 466
    .line 467
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    return-object v0
.end method

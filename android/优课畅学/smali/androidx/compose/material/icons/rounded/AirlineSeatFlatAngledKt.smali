.class public final Landroidx/compose/material/icons/rounded/AirlineSeatFlatAngledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatFlatAngled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AirlineSeatFlatAngled"

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
    const/high16 v0, 0x41b20000    # 22.25f

    .line 71
    .line 72
    const v2, 0x4164a3d7    # 14.29f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40cf5c29    # -0.69f

    .line 79
    .line 80
    .line 81
    const v2, 0x3ff1eb85    # 1.89f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, 0x41133333    # 9.2f

    .line 88
    .line 89
    .line 90
    const v2, 0x413b5c29    # 11.71f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x3fb1eb85    # 1.39f

    .line 97
    .line 98
    .line 99
    const v2, -0x3f8d70a4    # -3.79f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x4023d70a    # 2.56f

    .line 106
    .line 107
    .line 108
    const v18, -0x4067ae14    # -1.19f

    .line 109
    .line 110
    .line 111
    const v13, 0x3ec28f5c    # 0.38f

    .line 112
    .line 113
    .line 114
    const v14, -0x407c28f6    # -1.03f

    .line 115
    .line 116
    .line 117
    const v15, 0x3fc28f5c    # 1.52f

    .line 118
    .line 119
    .line 120
    const v16, -0x403851ec    # -1.56f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x40d6147b    # 6.69f

    .line 127
    .line 128
    .line 129
    const v2, 0x401a3d71    # 2.41f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x401a3d71    # 2.41f

    .line 136
    .line 137
    .line 138
    const v18, 0x40a4cccd    # 5.15f

    .line 139
    .line 140
    .line 141
    const v13, 0x40066666    # 2.1f

    .line 142
    .line 143
    .line 144
    const v14, 0x3f428f5c    # 0.76f

    .line 145
    .line 146
    .line 147
    const v15, 0x404b851f    # 3.18f

    .line 148
    .line 149
    .line 150
    const v16, 0x4043d70a    # 3.06f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x401ccccd    # 2.45f

    .line 160
    .line 161
    .line 162
    const v2, 0x4147ae14    # 12.48f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x40b1999a    # 5.55f

    .line 169
    .line 170
    .line 171
    const/high16 v2, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x41000000    # 8.0f

    .line 177
    .line 178
    const/high16 v2, 0x41900000    # 18.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/high16 v18, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const v14, 0x3f0ccccd    # 0.55f

    .line 189
    .line 190
    .line 191
    const v15, 0x3ee66666    # 0.45f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x3f800000    # 1.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v18, -0x40800000    # -1.0f

    .line 205
    .line 206
    const v13, 0x3f0ccccd    # 0.55f

    .line 207
    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    const/high16 v15, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const v16, -0x4119999a    # -0.45f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, -0x40deb852    # -0.63f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x40651eb8    # 3.58f

    .line 225
    .line 226
    .line 227
    const v2, 0x3fa51eb8    # 1.29f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x3fa51eb8    # 1.29f

    .line 234
    .line 235
    .line 236
    const v18, -0x40e66666    # -0.6f

    .line 237
    .line 238
    .line 239
    const v13, 0x3f051eb8    # 0.52f

    .line 240
    .line 241
    .line 242
    const v14, 0x3e428f5c    # 0.19f

    .line 243
    .line 244
    .line 245
    const v15, 0x3f8ccccd    # 1.1f

    .line 246
    .line 247
    .line 248
    const v16, -0x425c28f6    # -0.08f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x40e66666    # -0.6f

    .line 255
    .line 256
    .line 257
    const v18, -0x405ae148    # -1.29f

    .line 258
    .line 259
    .line 260
    const v13, 0x3e428f5c    # 0.19f

    .line 261
    .line 262
    .line 263
    const v14, -0x40fae148    # -0.52f

    .line 264
    .line 265
    .line 266
    const v15, -0x425c28f6    # -0.08f

    .line 267
    .line 268
    .line 269
    const v16, -0x40733333    # -1.1f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x404851ec    # 3.13f

    .line 276
    .line 277
    .line 278
    const v2, 0x412970a4    # 10.59f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x405ae148    # -1.29f

    .line 285
    .line 286
    .line 287
    const v18, 0x3f19999a    # 0.6f

    .line 288
    .line 289
    .line 290
    const v13, -0x40fae148    # -0.52f

    .line 291
    .line 292
    .line 293
    const v14, -0x41bd70a4    # -0.19f

    .line 294
    .line 295
    .line 296
    const v15, -0x40733333    # -1.1f

    .line 297
    .line 298
    .line 299
    const v16, 0x3da3d70a    # 0.08f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f1c28f6    # 0.61f

    .line 306
    .line 307
    .line 308
    const v18, 0x3fa51eb8    # 1.29f

    .line 309
    .line 310
    .line 311
    const v13, -0x41c7ae14    # -0.18f

    .line 312
    .line 313
    .line 314
    const v14, 0x3f051eb8    # 0.52f

    .line 315
    .line 316
    .line 317
    const v15, 0x3db851ec    # 0.09f

    .line 318
    .line 319
    .line 320
    const v16, 0x3f8ccccd    # 1.1f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x40e9999a    # 7.3f

    .line 330
    .line 331
    .line 332
    const v2, 0x41233333    # 10.2f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x3fb47ae1    # 1.41f

    .line 339
    .line 340
    .line 341
    const/high16 v18, -0x3f800000    # -4.0f

    .line 342
    .line 343
    const v13, 0x3fbeb852    # 1.49f

    .line 344
    .line 345
    .line 346
    const v14, -0x40c7ae14    # -0.72f

    .line 347
    .line 348
    .line 349
    const v15, 0x4007ae14    # 2.12f

    .line 350
    .line 351
    .line 352
    const v16, -0x3fdf5c29    # -2.51f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x40966666    # 4.7f

    .line 359
    .line 360
    .line 361
    const v18, 0x4099999a    # 4.8f

    .line 362
    .line 363
    .line 364
    const v13, 0x40ffae14    # 7.99f

    .line 365
    .line 366
    .line 367
    const v14, 0x4096b852    # 4.71f

    .line 368
    .line 369
    .line 370
    const v15, 0x40c66666    # 6.2f

    .line 371
    .line 372
    .line 373
    const v16, 0x40828f5c    # 4.08f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x404ccccd    # -1.4f

    .line 380
    .line 381
    .line 382
    const/high16 v18, 0x40800000    # 4.0f

    .line 383
    .line 384
    const v13, -0x404147ae    # -1.49f

    .line 385
    .line 386
    .line 387
    const v14, 0x3f35c28f    # 0.71f

    .line 388
    .line 389
    .line 390
    const v15, -0x3ff851ec    # -2.12f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x40200000    # 2.5f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x40800000    # 4.0f

    .line 399
    .line 400
    const v18, 0x3fb33333    # 1.4f

    .line 401
    .line 402
    .line 403
    const v13, 0x3f35c28f    # 0.71f

    .line 404
    .line 405
    .line 406
    const v14, 0x3fbeb852    # 1.49f

    .line 407
    .line 408
    .line 409
    const/high16 v15, 0x40200000    # 2.5f

    .line 410
    .line 411
    const v16, 0x4007ae14    # 2.12f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    const/16 v16, 0x3800

    .line 425
    .line 426
    const/16 v17, 0x0

    .line 427
    .line 428
    const/high16 v6, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/high16 v8, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v7, 0x0

    .line 433
    const/high16 v9, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/high16 v12, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const/4 v14, 0x0

    .line 439
    const/4 v15, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    sput-object v0, Landroidx/compose/material/icons/rounded/AirlineSeatFlatAngledKt;->_airlineSeatFlatAngled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 451
    .line 452
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-object v0
.end method

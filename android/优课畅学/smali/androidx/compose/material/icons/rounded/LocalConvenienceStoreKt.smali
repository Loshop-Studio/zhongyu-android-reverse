.class public final Landroidx/compose/material/icons/rounded/LocalConvenienceStoreKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localConvenienceStore:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalConvenienceStore(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalConvenienceStoreKt;->_localConvenienceStore:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalConvenienceStore"

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
    const v0, 0x41af3333    # 21.9f

    .line 71
    .line 72
    .line 73
    const v2, 0x40fc7ae1    # 7.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4079999a    # -1.05f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fa851ec    # -3.37f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x400b851f    # -1.91f

    .line 89
    .line 90
    .line 91
    const v18, -0x403d70a4    # -1.52f

    .line 92
    .line 93
    .line 94
    const v13, -0x419eb852    # -0.22f

    .line 95
    .line 96
    .line 97
    const v14, -0x4099999a    # -0.9f

    .line 98
    .line 99
    .line 100
    const/high16 v15, -0x40800000    # -1.0f

    .line 101
    .line 102
    const v16, -0x403d70a4    # -1.52f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x40a1999a    # 5.05f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x400ccccd    # -1.9f

    .line 115
    .line 116
    .line 117
    const v18, 0x3fc28f5c    # 1.52f

    .line 118
    .line 119
    .line 120
    const v13, -0x4099999a    # -0.9f

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const v15, -0x4027ae14    # -1.69f

    .line 125
    .line 126
    .line 127
    const v16, 0x3f2147ae    # 0.63f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x40066666    # 2.1f

    .line 134
    .line 135
    .line 136
    const v2, 0x40fc7ae1    # 7.89f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x40400000    # 3.0f

    .line 143
    .line 144
    const v18, 0x4130f5c3    # 11.06f

    .line 145
    .line 146
    .line 147
    const v13, 0x3fd1eb85    # 1.64f

    .line 148
    .line 149
    .line 150
    const v14, 0x411dc28f    # 9.86f

    .line 151
    .line 152
    .line 153
    const v15, 0x403ccccd    # 2.95f

    .line 154
    .line 155
    .line 156
    const/high16 v16, 0x41300000    # 11.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41980000    # 19.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x40000000    # 2.0f

    .line 167
    .line 168
    const/high16 v18, 0x40000000    # 2.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, 0x3f8ccccd    # 1.1f

    .line 172
    .line 173
    .line 174
    const v15, 0x3f666666    # 0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v16, 0x40000000    # 2.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x41600000    # 14.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v18, -0x40000000    # -2.0f

    .line 188
    .line 189
    const v13, 0x3f8ccccd    # 1.1f

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/high16 v15, 0x40000000    # 2.0f

    .line 194
    .line 195
    const v16, -0x4099999a    # -0.9f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, -0x3f01eb85    # -7.94f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x41af3333    # 21.9f

    .line 208
    .line 209
    .line 210
    const v18, 0x40fc7ae1    # 7.89f

    .line 211
    .line 212
    .line 213
    const v13, 0x41b0f5c3    # 22.12f

    .line 214
    .line 215
    .line 216
    const v14, 0x411f0a3d    # 9.94f

    .line 217
    .line 218
    .line 219
    const v15, 0x41b0b852    # 22.09f

    .line 220
    .line 221
    .line 222
    const v16, 0x410a6666    # 8.65f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41500000    # 13.0f

    .line 232
    .line 233
    const/high16 v2, 0x40a00000    # 5.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3ffae148    # 1.96f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3f0a3d71    # 0.54f

    .line 245
    .line 246
    .line 247
    const v2, 0x406147ae    # 3.52f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x4163851f    # 14.22f

    .line 254
    .line 255
    .line 256
    const/high16 v18, 0x41200000    # 10.0f

    .line 257
    .line 258
    const v13, 0x417970a4    # 15.59f

    .line 259
    .line 260
    .line 261
    const v14, 0x4113ae14    # 9.23f

    .line 262
    .line 263
    .line 264
    const v15, 0x4171c28f    # 15.11f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x41200000    # 10.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x41500000    # 13.0f

    .line 273
    .line 274
    const v18, 0x410b0a3d    # 8.69f

    .line 275
    .line 276
    .line 277
    const v13, 0x4158cccd    # 13.55f

    .line 278
    .line 279
    .line 280
    const/high16 v14, 0x41200000    # 10.0f

    .line 281
    .line 282
    const/high16 v15, 0x41500000    # 13.0f

    .line 283
    .line 284
    const v16, 0x41168f5c    # 9.41f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40a00000    # 5.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x410dc28f    # 8.86f

    .line 299
    .line 300
    .line 301
    const v2, 0x40ce147b    # 6.44f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x40a75c29    # 5.23f

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x41200000    # 10.0f

    .line 311
    .line 312
    const v13, 0x40cb851f    # 6.36f

    .line 313
    .line 314
    .line 315
    const v14, 0x411828f6    # 9.51f

    .line 316
    .line 317
    .line 318
    const v15, 0x40bae148    # 5.84f

    .line 319
    .line 320
    .line 321
    const/high16 v16, 0x41200000    # 10.0f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x408147ae    # 4.04f

    .line 327
    .line 328
    .line 329
    const v18, 0x4105c28f    # 8.36f

    .line 330
    .line 331
    .line 332
    const v13, 0x4089999a    # 4.3f

    .line 333
    .line 334
    .line 335
    const/high16 v14, 0x41200000    # 10.0f

    .line 336
    .line 337
    const v15, 0x407851ec    # 3.88f

    .line 338
    .line 339
    .line 340
    const v16, 0x41107ae1    # 9.03f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x40a1999a    # 5.05f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x40a00000    # 5.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3ffc28f6    # 1.97f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x410dc28f    # 8.86f

    .line 361
    .line 362
    .line 363
    const v2, 0x40ce147b    # 6.44f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41280000    # 10.5f

    .line 373
    .line 374
    const/high16 v2, 0x41800000    # 16.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41100000    # 9.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x3f800000    # 1.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x3f000000    # 0.5f

    .line 395
    .line 396
    const/high16 v18, 0x3f000000    # 0.5f

    .line 397
    .line 398
    const v13, 0x3e8f5c29    # 0.28f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, 0x3f000000    # 0.5f

    .line 403
    .line 404
    const v16, 0x3e6147ae    # 0.22f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/4 v0, 0x0

    .line 411
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, -0x41000000    # -0.5f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const v14, 0x3e8f5c29    # 0.28f

    .line 418
    .line 419
    .line 420
    const v15, -0x419eb852    # -0.22f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x3f000000    # 0.5f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, -0x40000000    # -2.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x41000000    # 8.0f

    .line 434
    .line 435
    const/high16 v18, 0x418c0000    # 17.5f

    .line 436
    .line 437
    const v13, 0x4103851f    # 8.22f

    .line 438
    .line 439
    .line 440
    const/high16 v14, 0x41900000    # 18.0f

    .line 441
    .line 442
    const/high16 v15, 0x41000000    # 8.0f

    .line 443
    .line 444
    const v16, 0x418e3d71    # 17.78f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x41080000    # 8.5f

    .line 454
    .line 455
    const/high16 v18, 0x41700000    # 15.0f

    .line 456
    .line 457
    const/high16 v13, 0x41000000    # 8.0f

    .line 458
    .line 459
    const v14, 0x4173851f    # 15.22f

    .line 460
    .line 461
    .line 462
    const v15, 0x4103851f    # 8.22f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x41700000    # 15.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x41200000    # 10.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, -0x40800000    # -1.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41080000    # 8.5f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x41000000    # 8.0f

    .line 486
    .line 487
    const/high16 v18, 0x41580000    # 13.5f

    .line 488
    .line 489
    const v13, 0x4103851f    # 8.22f

    .line 490
    .line 491
    .line 492
    const/high16 v14, 0x41600000    # 14.0f

    .line 493
    .line 494
    const/high16 v15, 0x41000000    # 8.0f

    .line 495
    .line 496
    const v16, 0x415c7ae1    # 13.78f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/4 v0, 0x0

    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x41080000    # 8.5f

    .line 507
    .line 508
    const/high16 v18, 0x41500000    # 13.0f

    .line 509
    .line 510
    const/high16 v13, 0x41000000    # 8.0f

    .line 511
    .line 512
    const v14, 0x4153851f    # 13.22f

    .line 513
    .line 514
    .line 515
    const v15, 0x4103851f    # 8.22f

    .line 516
    .line 517
    .line 518
    const/high16 v16, 0x41500000    # 13.0f

    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v17, 0x3f000000    # 0.5f

    .line 529
    .line 530
    const/high16 v18, 0x3f000000    # 0.5f

    .line 531
    .line 532
    const v13, 0x3e8f5c29    # 0.28f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const/high16 v15, 0x3f000000    # 0.5f

    .line 537
    .line 538
    const v16, 0x3e6147ae    # 0.22f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x41280000    # 10.5f

    .line 548
    .line 549
    const/high16 v18, 0x41800000    # 16.0f

    .line 550
    .line 551
    const/high16 v13, 0x41300000    # 11.0f

    .line 552
    .line 553
    const v14, 0x417c7ae1    # 15.78f

    .line 554
    .line 555
    .line 556
    const v15, 0x412c7ae1    # 10.78f

    .line 557
    .line 558
    .line 559
    const/high16 v16, 0x41800000    # 16.0f

    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x410b0a3d    # 8.69f

    .line 568
    .line 569
    .line 570
    const/high16 v2, 0x41300000    # 11.0f

    .line 571
    .line 572
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, 0x411b5c29    # 9.71f

    .line 576
    .line 577
    .line 578
    const/high16 v18, 0x41200000    # 10.0f

    .line 579
    .line 580
    const v14, 0x41168f5c    # 9.41f

    .line 581
    .line 582
    .line 583
    const v15, 0x41273333    # 10.45f

    .line 584
    .line 585
    .line 586
    const/high16 v16, 0x41200000    # 10.0f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x4063d70a    # -1.22f

    .line 592
    .line 593
    .line 594
    const v18, -0x40428f5c    # -1.48f

    .line 595
    .line 596
    .line 597
    const/high16 v13, -0x40c00000    # -0.75f

    .line 598
    .line 599
    const/4 v14, 0x0

    .line 600
    const v15, -0x4059999a    # -1.3f

    .line 601
    .line 602
    .line 603
    const v16, -0x40cccccd    # -0.7f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x4110a3d7    # 9.04f

    .line 610
    .line 611
    .line 612
    const/high16 v2, 0x40a00000    # 5.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41300000    # 11.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x410b0a3d    # 8.69f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x41900000    # 18.0f

    .line 632
    .line 633
    const/high16 v2, 0x41780000    # 15.5f

    .line 634
    .line 635
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, -0x41000000    # -0.5f

    .line 642
    .line 643
    const/high16 v18, -0x41000000    # -0.5f

    .line 644
    .line 645
    const v13, -0x4170a3d7    # -0.28f

    .line 646
    .line 647
    .line 648
    const/high16 v15, -0x41000000    # -0.5f

    .line 649
    .line 650
    const v16, -0x419eb852    # -0.22f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x41800000    # 16.0f

    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v0, -0x40400000    # -1.5f

    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, -0x40000000    # -2.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, 0x3f000000    # 0.5f

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const v14, -0x4170a3d7    # -0.28f

    .line 678
    .line 679
    .line 680
    const v15, 0x3e6147ae    # 0.22f

    .line 681
    .line 682
    .line 683
    const/high16 v16, -0x41000000    # -0.5f

    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/4 v0, 0x0

    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v18, 0x3f000000    # 0.5f

    .line 693
    .line 694
    const v13, 0x3e8f5c29    # 0.28f

    .line 695
    .line 696
    .line 697
    const/4 v14, 0x0

    .line 698
    const/high16 v15, 0x3f000000    # 0.5f

    .line 699
    .line 700
    const v16, 0x3e6147ae    # 0.22f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v0, 0x41700000    # 15.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, 0x3f800000    # 1.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, -0x40400000    # -1.5f

    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v18, -0x41000000    # -0.5f

    .line 722
    .line 723
    const/4 v13, 0x0

    .line 724
    const v14, -0x4170a3d7    # -0.28f

    .line 725
    .line 726
    .line 727
    const v15, 0x3e6147ae    # 0.22f

    .line 728
    .line 729
    .line 730
    const/high16 v16, -0x41000000    # -0.5f

    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/4 v0, 0x0

    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v18, 0x3f000000    # 0.5f

    .line 740
    .line 741
    const v13, 0x3e8f5c29    # 0.28f

    .line 742
    .line 743
    .line 744
    const/4 v14, 0x0

    .line 745
    const/high16 v15, 0x3f000000    # 0.5f

    .line 746
    .line 747
    const v16, 0x3e6147ae    # 0.22f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x40800000    # 4.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, 0x41780000    # 15.5f

    .line 759
    .line 760
    const/high16 v18, 0x41900000    # 18.0f

    .line 761
    .line 762
    const/high16 v13, 0x41800000    # 16.0f

    .line 763
    .line 764
    const v14, 0x418e3d71    # 17.78f

    .line 765
    .line 766
    .line 767
    const v15, 0x417c7ae1    # 15.78f

    .line 768
    .line 769
    .line 770
    const/high16 v16, 0x41900000    # 18.0f

    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, 0x419628f6    # 18.77f

    .line 779
    .line 780
    .line 781
    const/high16 v2, 0x41200000    # 10.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v17, -0x40651eb8    # -1.21f

    .line 787
    .line 788
    .line 789
    const v18, -0x406e147b    # -1.14f

    .line 790
    .line 791
    .line 792
    const v13, -0x40e3d70a    # -0.61f

    .line 793
    .line 794
    .line 795
    const/4 v14, 0x0

    .line 796
    const v15, -0x406e147b    # -1.14f

    .line 797
    .line 798
    .line 799
    const v16, -0x41051eb8    # -0.49f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, 0x4187d70a    # 16.98f

    .line 806
    .line 807
    .line 808
    const/high16 v2, 0x40a00000    # 5.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x3ff70a3d    # 1.93f

    .line 814
    .line 815
    .line 816
    const v2, -0x43dc28f6    # -0.01f

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x3f866666    # 1.05f

    .line 823
    .line 824
    .line 825
    const v2, 0x4057ae14    # 3.37f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v17, 0x419628f6    # 18.77f

    .line 832
    .line 833
    .line 834
    const/high16 v18, 0x41200000    # 10.0f

    .line 835
    .line 836
    const v13, 0x41a0f5c3    # 20.12f

    .line 837
    .line 838
    .line 839
    const v14, 0x41107ae1    # 9.03f

    .line 840
    .line 841
    .line 842
    const v15, 0x419dae14    # 19.71f

    .line 843
    .line 844
    .line 845
    const/high16 v16, 0x41200000    # 10.0f

    .line 846
    .line 847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    const/16 v16, 0x3800

    .line 858
    .line 859
    const/16 v17, 0x0

    .line 860
    .line 861
    const/high16 v6, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/high16 v8, 0x3f800000    # 1.0f

    .line 864
    .line 865
    const/4 v7, 0x0

    .line 866
    const/high16 v9, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/high16 v12, 0x3f800000    # 1.0f

    .line 869
    .line 870
    const/4 v13, 0x0

    .line 871
    const/4 v14, 0x0

    .line 872
    const/4 v15, 0x0

    .line 873
    const-string v4, ""

    .line 874
    .line 875
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalConvenienceStoreKt;->_localConvenienceStore:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    return-object v0
.end method

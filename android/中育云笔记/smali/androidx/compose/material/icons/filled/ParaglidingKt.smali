.class public final Landroidx/compose/material/icons/filled/ParaglidingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getParagliding(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Paragliding"

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
    const/high16 v2, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    const/high16 v4, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x4151999a    # 13.1f

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x41400000    # 12.0f

    .line 112
    .line 113
    const/high16 v4, 0x41880000    # 17.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x418f851f    # 17.94f

    .line 122
    .line 123
    .line 124
    const v2, 0x410851ec    # 8.52f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40e00000    # 7.0f

    .line 131
    .line 132
    const/high16 v18, 0x41600000    # 14.0f

    .line 133
    .line 134
    const v13, 0x4100a3d7    # 8.04f

    .line 135
    .line 136
    .line 137
    const v14, 0x418c6666    # 17.55f

    .line 138
    .line 139
    .line 140
    const/high16 v15, 0x40e00000    # 7.0f

    .line 141
    .line 142
    const v16, 0x4186147b    # 16.76f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40a00000    # 5.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, 0x40133333    # 2.3f

    .line 154
    .line 155
    .line 156
    const/high16 v18, 0x40b00000    # 5.5f

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const v14, 0x402ccccd    # 2.7f

    .line 160
    .line 161
    .line 162
    const v15, 0x3f6e147b    # 0.93f

    .line 163
    .line 164
    .line 165
    const v16, 0x408d1eb8    # 4.41f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x3fd9999a    # 1.7f

    .line 172
    .line 173
    .line 174
    const v18, 0x3f666666    # 0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v13, 0x3f000000    # 0.5f

    .line 178
    .line 179
    const v14, 0x3ecccccd    # 0.4f

    .line 180
    .line 181
    .line 182
    const v15, 0x3f8ccccd    # 1.1f

    .line 183
    .line 184
    .line 185
    const v16, 0x3f333333    # 0.7f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x41100000    # 9.0f

    .line 192
    .line 193
    const/high16 v2, 0x41c00000    # 24.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40c00000    # 6.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, -0x3f99999a    # -3.6f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v18, -0x4099999a    # -0.9f

    .line 210
    .line 211
    .line 212
    const v13, 0x3f19999a    # 0.6f

    .line 213
    .line 214
    .line 215
    const v14, -0x41b33333    # -0.2f

    .line 216
    .line 217
    .line 218
    const v15, 0x3f99999a    # 1.2f

    .line 219
    .line 220
    .line 221
    const/high16 v16, -0x41000000    # -0.5f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x40133333    # 2.3f

    .line 227
    .line 228
    .line 229
    const/high16 v18, -0x3f500000    # -5.5f

    .line 230
    .line 231
    const v13, 0x3faf5c29    # 1.37f

    .line 232
    .line 233
    .line 234
    const v14, -0x40747ae1    # -1.09f

    .line 235
    .line 236
    .line 237
    const v15, 0x40133333    # 2.3f

    .line 238
    .line 239
    .line 240
    const v16, -0x3fcccccd    # -2.8f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, -0x40000000    # -2.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, -0x403d70a4    # -1.52f

    .line 252
    .line 253
    .line 254
    const v18, 0x407c28f6    # 3.94f

    .line 255
    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, 0x4030a3d7    # 2.76f

    .line 259
    .line 260
    .line 261
    const v15, -0x407ae148    # -1.04f

    .line 262
    .line 263
    .line 264
    const v16, 0x40633333    # 3.55f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x41400000    # 12.0f

    .line 271
    .line 272
    const/high16 v18, 0x41980000    # 19.0f

    .line 273
    .line 274
    const v13, 0x416ae148    # 14.68f

    .line 275
    .line 276
    .line 277
    const v14, 0x419451ec    # 18.54f

    .line 278
    .line 279
    .line 280
    const/high16 v15, 0x41600000    # 14.0f

    .line 281
    .line 282
    const/high16 v16, 0x41980000    # 19.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x41151eb8    # 9.32f

    .line 288
    .line 289
    .line 290
    const v2, 0x419451ec    # 18.54f

    .line 291
    .line 292
    .line 293
    const v4, 0x418f851f    # 17.94f

    .line 294
    .line 295
    .line 296
    const v6, 0x410851ec    # 8.52f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/4 v0, 0x0

    .line 306
    const/high16 v2, 0x41400000    # 12.0f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v18, 0x40880000    # 4.25f

    .line 314
    .line 315
    const v13, 0x40bd70a4    # 5.92f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const/high16 v15, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const v16, 0x3ff33333    # 1.9f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x405f5c29    # 3.49f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x4023d70a    # 2.56f

    .line 334
    .line 335
    .line 336
    const v18, 0x41091eb8    # 8.57f

    .line 337
    .line 338
    .line 339
    const/high16 v13, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const v14, 0x4108cccd    # 8.55f

    .line 342
    .line 343
    .line 344
    const v15, 0x3ff0a3d7    # 1.88f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x41100000    # 9.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x40400000    # 3.0f

    .line 353
    .line 354
    const v18, 0x4104f5c3    # 8.31f

    .line 355
    .line 356
    .line 357
    const v13, 0x402ccccd    # 2.7f

    .line 358
    .line 359
    .line 360
    const v14, 0x4107ae14    # 8.48f

    .line 361
    .line 362
    .line 363
    const v15, 0x4035c28f    # 2.84f

    .line 364
    .line 365
    .line 366
    const v16, 0x41063d71    # 8.39f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41500000    # 13.0f

    .line 373
    .line 374
    const/high16 v2, 0x40a00000    # 5.0f

    .line 375
    .line 376
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40000000    # 2.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 385
    .line 386
    const v2, -0x3f370a3d    # -6.28f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x41400000    # 12.0f

    .line 393
    .line 394
    const/high16 v18, 0x40d00000    # 6.5f

    .line 395
    .line 396
    const v13, 0x4119999a    # 9.6f

    .line 397
    .line 398
    .line 399
    const v14, 0x40d28f5c    # 6.58f

    .line 400
    .line 401
    .line 402
    const v15, 0x412c7ae1    # 10.78f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x40d00000    # 6.5f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x40600000    # 3.5f

    .line 411
    .line 412
    const v2, 0x3e6147ae    # 0.22f

    .line 413
    .line 414
    .line 415
    const v4, 0x4019999a    # 2.4f

    .line 416
    .line 417
    .line 418
    const v6, 0x3da3d70a    # 0.08f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41500000    # 13.0f

    .line 425
    .line 426
    const/high16 v2, 0x41880000    # 17.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x40000000    # 2.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x3f69eb85    # -4.69f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x40000000    # 2.0f

    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3ee147ae    # 0.44f

    .line 445
    .line 446
    .line 447
    const v18, 0x3e851eb8    # 0.26f

    .line 448
    .line 449
    .line 450
    const v13, 0x3e23d70a    # 0.16f

    .line 451
    .line 452
    .line 453
    const v14, 0x3db851ec    # 0.09f

    .line 454
    .line 455
    .line 456
    const v15, 0x3e99999a    # 0.3f

    .line 457
    .line 458
    .line 459
    const v16, 0x3e2e147b    # 0.17f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41b80000    # 23.0f

    .line 466
    .line 467
    const v18, 0x40f7ae14    # 7.74f

    .line 468
    .line 469
    .line 470
    const v13, 0x41b0f5c3    # 22.12f

    .line 471
    .line 472
    .line 473
    const/high16 v14, 0x41100000    # 9.0f

    .line 474
    .line 475
    const/high16 v15, 0x41b80000    # 23.0f

    .line 476
    .line 477
    const v16, 0x4108cccd    # 8.55f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40880000    # 4.25f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x41400000    # 12.0f

    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const/high16 v13, 0x41b80000    # 23.0f

    .line 493
    .line 494
    const v14, 0x3ff33333    # 1.9f

    .line 495
    .line 496
    .line 497
    const v15, 0x4190a3d7    # 18.08f

    .line 498
    .line 499
    .line 500
    const/16 v16, 0x0

    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40bc28f6    # 5.88f

    .line 509
    .line 510
    .line 511
    const v2, 0x4133d70a    # 11.24f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x408bd70a    # 4.37f

    .line 518
    .line 519
    .line 520
    const v2, 0x40f6147b    # 7.69f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x4021eb85    # 2.53f

    .line 527
    .line 528
    .line 529
    const v18, -0x40ca3d71    # -0.71f

    .line 530
    .line 531
    .line 532
    const/high16 v13, 0x3f400000    # 0.75f

    .line 533
    .line 534
    const v14, -0x4170a3d7    # -0.28f

    .line 535
    .line 536
    .line 537
    const v15, 0x3fcccccd    # 1.6f

    .line 538
    .line 539
    .line 540
    const v16, -0x40fae148    # -0.52f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x40bc28f6    # 5.88f

    .line 547
    .line 548
    .line 549
    const v2, 0x4133d70a    # 11.24f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x4190f5c3    # 18.12f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x4188cccd    # 17.1f

    .line 565
    .line 566
    .line 567
    const v2, 0x40df5c29    # 6.98f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v18, 0x3f35c28f    # 0.71f

    .line 574
    .line 575
    .line 576
    const v13, 0x3f6e147b    # 0.93f

    .line 577
    .line 578
    .line 579
    const v14, 0x3e428f5c    # 0.19f

    .line 580
    .line 581
    .line 582
    const v15, 0x3fe3d70a    # 1.78f

    .line 583
    .line 584
    .line 585
    const v16, 0x3edc28f6    # 0.43f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x4190f5c3    # 18.12f

    .line 592
    .line 593
    .line 594
    const v2, 0x4133d70a    # 11.24f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/16 v16, 0x3800

    .line 608
    .line 609
    const/16 v17, 0x0

    .line 610
    .line 611
    const/high16 v6, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v8, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    const/high16 v9, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/high16 v12, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const/4 v14, 0x0

    .line 622
    const/4 v15, 0x0

    .line 623
    const-string v4, ""

    .line 624
    .line 625
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    sput-object v0, Landroidx/compose/material/icons/filled/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 634
    .line 635
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    return-object v0
.end method

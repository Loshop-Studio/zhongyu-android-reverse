.class public final Landroidx/compose/material/icons/outlined/ParaglidingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getParagliding(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Paragliding"

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
    const/high16 v17, 0x40000000    # 2.0f

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, -0x40733333    # -1.1f

    .line 97
    .line 98
    .line 99
    const v15, 0x3f666666    # 0.9f

    .line 100
    .line 101
    .line 102
    const/high16 v16, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x3f666666    # 0.9f

    .line 108
    .line 109
    .line 110
    const/high16 v2, 0x40000000    # 2.0f

    .line 111
    .line 112
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x41400000    # 12.0f

    .line 116
    .line 117
    const/high16 v18, 0x41880000    # 17.0f

    .line 118
    .line 119
    const/high16 v13, 0x41600000    # 14.0f

    .line 120
    .line 121
    const v14, 0x4180cccd    # 16.1f

    .line 122
    .line 123
    .line 124
    const v15, 0x4151999a    # 13.1f

    .line 125
    .line 126
    .line 127
    const/high16 v16, 0x41880000    # 17.0f

    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x4177ae14    # 15.48f

    .line 136
    .line 137
    .line 138
    const v2, 0x418f851f    # 17.94f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v18, 0x41980000    # 19.0f

    .line 145
    .line 146
    const v13, 0x416ae148    # 14.68f

    .line 147
    .line 148
    .line 149
    const v14, 0x419451ec    # 18.54f

    .line 150
    .line 151
    .line 152
    const/high16 v15, 0x41600000    # 14.0f

    .line 153
    .line 154
    const/high16 v16, 0x41980000    # 19.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, -0x3fa147ae    # -3.48f

    .line 160
    .line 161
    .line 162
    const v2, -0x407851ec    # -1.06f

    .line 163
    .line 164
    .line 165
    const v4, -0x3fd47ae1    # -2.68f

    .line 166
    .line 167
    .line 168
    const v6, -0x41147ae1    # -0.46f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x40e00000    # 7.0f

    .line 175
    .line 176
    const/high16 v18, 0x41600000    # 14.0f

    .line 177
    .line 178
    const v13, 0x4100a3d7    # 8.04f

    .line 179
    .line 180
    .line 181
    const v14, 0x418c6666    # 17.55f

    .line 182
    .line 183
    .line 184
    const/high16 v15, 0x40e00000    # 7.0f

    .line 185
    .line 186
    const v16, 0x4186147b    # 16.76f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x40a00000    # 5.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x40133333    # 2.3f

    .line 198
    .line 199
    .line 200
    const/high16 v18, 0x40b00000    # 5.5f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, 0x402ccccd    # 2.7f

    .line 204
    .line 205
    .line 206
    const v15, 0x3f6e147b    # 0.93f

    .line 207
    .line 208
    .line 209
    const v16, 0x408d1eb8    # 4.41f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x3fd9999a    # 1.7f

    .line 216
    .line 217
    .line 218
    const v18, 0x3f666666    # 0.9f

    .line 219
    .line 220
    .line 221
    const/high16 v13, 0x3f000000    # 0.5f

    .line 222
    .line 223
    const v14, 0x3ecccccd    # 0.4f

    .line 224
    .line 225
    .line 226
    const v15, 0x3f8ccccd    # 1.1f

    .line 227
    .line 228
    .line 229
    const v16, 0x3f333333    # 0.7f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x41c00000    # 24.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40c00000    # 6.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x3f99999a    # -3.6f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v18, -0x4099999a    # -0.9f

    .line 252
    .line 253
    .line 254
    const v13, 0x3f19999a    # 0.6f

    .line 255
    .line 256
    .line 257
    const v14, -0x41b33333    # -0.2f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f99999a    # 1.2f

    .line 261
    .line 262
    .line 263
    const/high16 v16, -0x41000000    # -0.5f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x40133333    # 2.3f

    .line 269
    .line 270
    .line 271
    const/high16 v18, -0x3f500000    # -5.5f

    .line 272
    .line 273
    const v13, 0x3faf5c29    # 1.37f

    .line 274
    .line 275
    .line 276
    const v14, -0x40747ae1    # -1.09f

    .line 277
    .line 278
    .line 279
    const v15, 0x40133333    # 2.3f

    .line 280
    .line 281
    .line 282
    const v16, -0x3fcccccd    # -2.8f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, -0x40000000    # -2.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x4177ae14    # 15.48f

    .line 294
    .line 295
    .line 296
    const v18, 0x418f851f    # 17.94f

    .line 297
    .line 298
    .line 299
    const/high16 v13, 0x41880000    # 17.0f

    .line 300
    .line 301
    const v14, 0x4186147b    # 16.76f

    .line 302
    .line 303
    .line 304
    const v15, 0x417f5c29    # 15.96f

    .line 305
    .line 306
    .line 307
    const v16, 0x418c6666    # 17.55f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41b80000    # 23.0f

    .line 317
    .line 318
    const/high16 v2, 0x40880000    # 4.25f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x405f5c29    # 3.49f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x403851ec    # -1.56f

    .line 330
    .line 331
    .line 332
    const v18, 0x3f547ae1    # 0.83f

    .line 333
    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, 0x3f4ccccd    # 0.8f

    .line 337
    .line 338
    .line 339
    const v15, -0x409eb852    # -0.88f

    .line 340
    .line 341
    .line 342
    const v16, 0x3fa147ae    # 1.26f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x41a80000    # 21.0f

    .line 349
    .line 350
    const v18, 0x4104f5c3    # 8.31f

    .line 351
    .line 352
    .line 353
    const v13, 0x41aa6666    # 21.3f

    .line 354
    .line 355
    .line 356
    const v14, 0x4107ae14    # 8.48f

    .line 357
    .line 358
    .line 359
    const v15, 0x41a947ae    # 21.16f

    .line 360
    .line 361
    .line 362
    const v16, 0x41063d71    # 8.39f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41980000    # 19.0f

    .line 369
    .line 370
    const/high16 v2, 0x41500000    # 13.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, -0x40000000    # -2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, -0x40400000    # -1.5f

    .line 381
    .line 382
    const v2, -0x3f370a3d    # -6.28f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x41400000    # 12.0f

    .line 389
    .line 390
    const/high16 v18, 0x40d00000    # 6.5f

    .line 391
    .line 392
    const v13, 0x41666666    # 14.4f

    .line 393
    .line 394
    .line 395
    const v14, 0x40d28f5c    # 6.58f

    .line 396
    .line 397
    .line 398
    const v15, 0x4153851f    # 13.22f

    .line 399
    .line 400
    .line 401
    const/high16 v16, 0x40d00000    # 6.5f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41080000    # 8.5f

    .line 407
    .line 408
    const v2, 0x40d70a3d    # 6.72f

    .line 409
    .line 410
    .line 411
    const v4, 0x4119999a    # 9.6f

    .line 412
    .line 413
    .line 414
    const v6, 0x40d28f5c    # 6.58f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40e00000    # 7.0f

    .line 421
    .line 422
    const/high16 v2, 0x41500000    # 13.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x40a00000    # 5.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x4104f5c3    # 8.31f

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x40400000    # 3.0f

    .line 436
    .line 437
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x4023d70a    # 2.56f

    .line 441
    .line 442
    .line 443
    const v18, 0x41091eb8    # 8.57f

    .line 444
    .line 445
    .line 446
    const v13, 0x4035c28f    # 2.84f

    .line 447
    .line 448
    .line 449
    const v14, 0x41063d71    # 8.39f

    .line 450
    .line 451
    .line 452
    const v15, 0x402ccccd    # 2.7f

    .line 453
    .line 454
    .line 455
    const v16, 0x4107ae14    # 8.48f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const v18, 0x40f7ae14    # 7.74f

    .line 464
    .line 465
    .line 466
    const v13, 0x3ff0a3d7    # 1.88f

    .line 467
    .line 468
    .line 469
    const/high16 v14, 0x41100000    # 9.0f

    .line 470
    .line 471
    const/high16 v15, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const v16, 0x4108cccd    # 8.55f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40880000    # 4.25f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x41400000    # 12.0f

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const/high16 v13, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const v14, 0x3ff33333    # 1.9f

    .line 491
    .line 492
    .line 493
    const v15, 0x40bd70a4    # 5.92f

    .line 494
    .line 495
    .line 496
    const/16 v16, 0x0

    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3ff33333    # 1.9f

    .line 502
    .line 503
    .line 504
    const/high16 v2, 0x41b80000    # 23.0f

    .line 505
    .line 506
    const/high16 v4, 0x40880000    # 4.25f

    .line 507
    .line 508
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x40df5c29    # 6.98f

    .line 515
    .line 516
    .line 517
    const v2, 0x40dccccd    # 6.9f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x408bd70a    # 4.37f

    .line 524
    .line 525
    .line 526
    const v18, 0x40f6147b    # 7.69f

    .line 527
    .line 528
    .line 529
    const v13, 0x40bf0a3d    # 5.97f

    .line 530
    .line 531
    .line 532
    const v14, 0x40e570a4    # 7.17f

    .line 533
    .line 534
    .line 535
    const v15, 0x40a3d70a    # 5.12f

    .line 536
    .line 537
    .line 538
    const v16, 0x40ed1eb8    # 7.41f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x3fc147ae    # 1.51f

    .line 545
    .line 546
    .line 547
    const v2, 0x40633333    # 3.55f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x40df5c29    # 6.98f

    .line 554
    .line 555
    .line 556
    const v2, 0x40dccccd    # 6.9f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40f6147b    # 7.69f

    .line 566
    .line 567
    .line 568
    const v2, 0x419d0a3d    # 19.63f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, -0x3fde147b    # -2.53f

    .line 575
    .line 576
    .line 577
    const v18, -0x40ca3d71    # -0.71f

    .line 578
    .line 579
    .line 580
    const/high16 v13, -0x40c00000    # -0.75f

    .line 581
    .line 582
    const v14, -0x4170a3d7    # -0.28f

    .line 583
    .line 584
    .line 585
    const v15, -0x40333333    # -1.6f

    .line 586
    .line 587
    .line 588
    const v16, -0x40fae148    # -0.52f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x3f828f5c    # 1.02f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x40880000    # 4.25f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x40f6147b    # 7.69f

    .line 603
    .line 604
    .line 605
    const v2, 0x419d0a3d    # 19.63f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41a80000    # 21.0f

    .line 615
    .line 616
    const v2, 0x4089eb85    # 4.31f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v17, 0x41400000    # 12.0f

    .line 623
    .line 624
    const/high16 v18, 0x40000000    # 2.0f

    .line 625
    .line 626
    const v13, 0x41a53333    # 20.65f

    .line 627
    .line 628
    .line 629
    const v14, 0x406851ec    # 3.63f

    .line 630
    .line 631
    .line 632
    const v15, 0x418c8f5c    # 17.57f

    .line 633
    .line 634
    .line 635
    const/high16 v16, 0x40000000    # 2.0f

    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x40566666    # 3.35f

    .line 641
    .line 642
    .line 643
    const v2, 0x406851ec    # 3.63f

    .line 644
    .line 645
    .line 646
    const/high16 v4, 0x40400000    # 3.0f

    .line 647
    .line 648
    const v6, 0x4089eb85    # 4.31f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x3fe28f5c    # 1.77f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v18, 0x40900000    # 4.5f

    .line 661
    .line 662
    const v13, 0x40aae148    # 5.34f

    .line 663
    .line 664
    .line 665
    const v14, 0x40a23d71    # 5.07f

    .line 666
    .line 667
    .line 668
    const v15, 0x4108f5c3    # 8.56f

    .line 669
    .line 670
    .line 671
    const/high16 v16, 0x40900000    # 4.5f

    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41100000    # 9.0f

    .line 677
    .line 678
    const v2, 0x3fca3d71    # 1.58f

    .line 679
    .line 680
    .line 681
    const v4, 0x40d51eb8    # 6.66f

    .line 682
    .line 683
    .line 684
    const v6, 0x3f11eb85    # 0.57f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x4089eb85    # 4.31f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    const/16 v16, 0x3800

    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    const/high16 v6, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/high16 v8, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v7, 0x0

    .line 712
    const/high16 v9, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/high16 v12, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const/4 v14, 0x0

    .line 718
    const/4 v15, 0x0

    .line 719
    const-string v4, ""

    .line 720
    .line 721
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    sput-object v0, Landroidx/compose/material/icons/outlined/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-object v0
.end method

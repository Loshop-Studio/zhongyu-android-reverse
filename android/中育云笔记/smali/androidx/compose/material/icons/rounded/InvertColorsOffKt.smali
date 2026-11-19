.class public final Landroidx/compose/material/icons/rounded/InvertColorsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInvertColorsOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/InvertColorsOffKt;->_invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.InvertColorsOff"

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
    const v0, 0x41a3eb85    # 20.49f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x4060a3d7    # 3.51f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x407d70a4    # -1.02f

    .line 94
    .line 95
    .line 96
    const v16, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    const v18, 0x3fb47ae1    # 1.41f

    .line 109
    .line 110
    .line 111
    const v14, 0x3ec7ae14    # 0.39f

    .line 112
    .line 113
    .line 114
    const v15, -0x413851ec    # -0.39f

    .line 115
    .line 116
    .line 117
    const v16, 0x3f828f5c    # 1.02f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40600000    # 3.5f

    .line 124
    .line 125
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x40333333    # -1.6f

    .line 129
    .line 130
    .line 131
    const v18, 0x40966666    # 4.7f

    .line 132
    .line 133
    .line 134
    const/high16 v13, -0x40800000    # -1.0f

    .line 135
    .line 136
    const v14, 0x3fa7ae14    # 1.31f

    .line 137
    .line 138
    .line 139
    const v15, -0x40333333    # -1.6f

    .line 140
    .line 141
    .line 142
    const v16, 0x403c28f6    # 2.94f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x41400000    # 12.0f

    .line 149
    .line 150
    const/high16 v18, 0x41a80000    # 21.0f

    .line 151
    .line 152
    const/high16 v13, 0x40800000    # 4.0f

    .line 153
    .line 154
    const v14, 0x418bd70a    # 17.48f

    .line 155
    .line 156
    .line 157
    const v15, 0x40f28f5c    # 7.58f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x41a80000    # 21.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x409570a4    # 4.67f

    .line 166
    .line 167
    .line 168
    const/high16 v18, -0x40400000    # -1.5f

    .line 169
    .line 170
    const/high16 v13, 0x3fe00000    # 1.75f

    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x40570a3d    # 3.36f

    .line 174
    .line 175
    .line 176
    const v16, -0x40f0a3d7    # -0.56f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x4019999a    # 2.4f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x3fb47ae1    # 1.41f

    .line 189
    .line 190
    .line 191
    const/16 v18, 0x0

    .line 192
    .line 193
    const v13, 0x3ec7ae14    # 0.39f

    .line 194
    .line 195
    .line 196
    const v14, 0x3ec7ae14    # 0.39f

    .line 197
    .line 198
    .line 199
    const v15, 0x3f828f5c    # 1.02f

    .line 200
    .line 201
    .line 202
    const v16, 0x3ec7ae14    # 0.39f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x41a3eb85    # 20.49f

    .line 213
    .line 214
    .line 215
    const v18, 0x41a3eb85    # 20.49f

    .line 216
    .line 217
    .line 218
    const v13, 0x41a70a3d    # 20.88f

    .line 219
    .line 220
    .line 221
    const v14, 0x41ac147b    # 21.51f

    .line 222
    .line 223
    .line 224
    const v15, 0x41a70a3d    # 20.88f

    .line 225
    .line 226
    .line 227
    const v16, 0x41a70a3d    # 20.88f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41980000    # 19.0f

    .line 237
    .line 238
    const/high16 v2, 0x41400000    # 12.0f

    .line 239
    .line 240
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, -0x3f400000    # -6.0f

    .line 244
    .line 245
    const v18, -0x3f4428f6    # -5.87f

    .line 246
    .line 247
    .line 248
    const v13, -0x3fac28f6    # -3.31f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, -0x3f400000    # -6.0f

    .line 253
    .line 254
    const v16, -0x3fd7ae14    # -2.63f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x3f828f5c    # 1.02f

    .line 261
    .line 262
    .line 263
    const v18, -0x3fae147b    # -3.28f

    .line 264
    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, -0x4067ae14    # -1.19f

    .line 268
    .line 269
    .line 270
    const v15, 0x3eb851ec    # 0.36f

    .line 271
    .line 272
    .line 273
    const v16, -0x3feb851f    # -2.32f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x416d47ae    # 14.83f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41980000    # 19.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x40b1eb85    # 5.56f

    .line 294
    .line 295
    .line 296
    const v2, 0x4106147b    # 8.38f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x403a3d71    # 2.91f

    .line 303
    .line 304
    .line 305
    const v2, -0x3fc851ec    # -2.87f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3fb33333    # 1.4f

    .line 312
    .line 313
    .line 314
    const/16 v18, 0x0

    .line 315
    .line 316
    const v13, 0x3ec7ae14    # 0.39f

    .line 317
    .line 318
    .line 319
    const v14, -0x413d70a4    # -0.38f

    .line 320
    .line 321
    .line 322
    const v15, 0x3f8147ae    # 1.01f

    .line 323
    .line 324
    .line 325
    const v16, -0x413d70a4    # -0.38f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x409e6666    # 4.95f

    .line 332
    .line 333
    .line 334
    const v2, 0x409bd70a    # 4.87f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x41a00000    # 20.0f

    .line 345
    .line 346
    const v18, 0x4152147b    # 13.13f

    .line 347
    .line 348
    .line 349
    const v13, 0x4198cccd    # 19.1f

    .line 350
    .line 351
    .line 352
    const v14, 0x410fd70a    # 8.99f

    .line 353
    .line 354
    .line 355
    const/high16 v15, 0x41a00000    # 20.0f

    .line 356
    .line 357
    const v16, 0x412f5c29    # 10.96f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x40c28f5c    # -0.74f

    .line 364
    .line 365
    .line 366
    const v18, 0x40533333    # 3.3f

    .line 367
    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, 0x3f970a3d    # 1.18f

    .line 371
    .line 372
    .line 373
    const v15, -0x4175c28f    # -0.27f

    .line 374
    .line 375
    .line 376
    const v16, 0x40128f5c    # 2.29f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x4112b852    # 9.17f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x41400000    # 12.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x4099eb85    # 4.81f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x411ccccd    # 9.8f

    .line 397
    .line 398
    .line 399
    const v2, 0x40df0a3d    # 6.97f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x40b1eb85    # 5.56f

    .line 406
    .line 407
    .line 408
    const v2, 0x4106147b    # 8.38f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/16 v16, 0x3800

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const/high16 v6, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v8, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v7, 0x0

    .line 430
    const/high16 v9, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v12, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sput-object v0, Landroidx/compose/material/icons/rounded/InvertColorsOffKt;->_invertColorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-object v0
.end method

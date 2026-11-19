.class public final Landroidx/compose/material/icons/rounded/SquareFootKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _squareFoot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSquareFoot(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SquareFootKt;->_squareFoot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SquareFoot"

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
    const v0, 0x418d47ae    # 17.66f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x3f35c28f    # 0.71f

    .line 77
    .line 78
    .line 79
    const v2, -0x40ca3d71    # -0.71f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x40ca3d71    # -0.71f

    .line 86
    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    const v13, -0x41b33333    # -0.2f

    .line 91
    .line 92
    .line 93
    const v14, 0x3e4ccccd    # 0.2f

    .line 94
    .line 95
    .line 96
    const v15, -0x40fd70a4    # -0.51f

    .line 97
    .line 98
    .line 99
    const v16, 0x3e4ccccd    # 0.2f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const v18, -0x40ca3d71    # -0.71f

    .line 112
    .line 113
    .line 114
    const v14, -0x41b33333    # -0.2f

    .line 115
    .line 116
    .line 117
    const v15, -0x41b33333    # -0.2f

    .line 118
    .line 119
    .line 120
    const v16, -0x40fd70a4    # -0.51f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3f35c28f    # 0.71f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, -0x4007ae14    # -1.94f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3f35c28f    # 0.71f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x40ca3d71    # -0.71f

    .line 145
    .line 146
    .line 147
    const/16 v18, 0x0

    .line 148
    .line 149
    const v14, 0x3e4ccccd    # 0.2f

    .line 150
    .line 151
    .line 152
    const v15, -0x40fd70a4    # -0.51f

    .line 153
    .line 154
    .line 155
    const v16, 0x3e4ccccd    # 0.2f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const v18, -0x40ca3d71    # -0.71f

    .line 168
    .line 169
    .line 170
    const v14, -0x41b33333    # -0.2f

    .line 171
    .line 172
    .line 173
    const v15, -0x41b33333    # -0.2f

    .line 174
    .line 175
    .line 176
    const v16, -0x40fd70a4    # -0.51f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x3f35c28f    # 0.71f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, -0x4007ae14    # -1.94f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x3f35c28f    # 0.71f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, -0x40ca3d71    # -0.71f

    .line 201
    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const v14, 0x3e4ccccd    # 0.2f

    .line 206
    .line 207
    .line 208
    const v15, -0x40fd70a4    # -0.51f

    .line 209
    .line 210
    .line 211
    const v16, 0x3e4ccccd    # 0.2f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/4 v0, 0x0

    .line 218
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const v18, -0x40ca3d71    # -0.71f

    .line 224
    .line 225
    .line 226
    const v14, -0x41b33333    # -0.2f

    .line 227
    .line 228
    .line 229
    const v15, -0x41b33333    # -0.2f

    .line 230
    .line 231
    .line 232
    const v16, -0x40fd70a4    # -0.51f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3f35c28f    # 0.71f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x411b3333    # 9.7f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x3f35c28f    # 0.71f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x40ca3d71    # -0.71f

    .line 257
    .line 258
    .line 259
    const/16 v18, 0x0

    .line 260
    .line 261
    const v14, 0x3e4ccccd    # 0.2f

    .line 262
    .line 263
    .line 264
    const v15, -0x40fd70a4    # -0.51f

    .line 265
    .line 266
    .line 267
    const v16, 0x3e4ccccd    # 0.2f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/4 v0, 0x0

    .line 274
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/16 v17, 0x0

    .line 278
    .line 279
    const v18, -0x40ca3d71    # -0.71f

    .line 280
    .line 281
    .line 282
    const v14, -0x41b33333    # -0.2f

    .line 283
    .line 284
    .line 285
    const v15, -0x41b33333    # -0.2f

    .line 286
    .line 287
    .line 288
    const v16, -0x40fd70a4    # -0.51f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3f35c28f    # 0.71f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40e1999a    # 7.05f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x40cae148    # 6.34f

    .line 307
    .line 308
    .line 309
    const v2, 0x40f851ec    # 7.76f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x40ca3d71    # -0.71f

    .line 316
    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const v14, 0x3e4ccccd    # 0.2f

    .line 321
    .line 322
    .line 323
    const v15, -0x40fd70a4    # -0.51f

    .line 324
    .line 325
    .line 326
    const v16, 0x3e4ccccd    # 0.2f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/4 v0, 0x0

    .line 333
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const v18, -0x40ca3d71    # -0.71f

    .line 339
    .line 340
    .line 341
    const v14, -0x41b33333    # -0.2f

    .line 342
    .line 343
    .line 344
    const v15, -0x41b33333    # -0.2f

    .line 345
    .line 346
    .line 347
    const v16, -0x40fd70a4    # -0.51f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3f35c28f    # 0.71f

    .line 354
    .line 355
    .line 356
    const v2, -0x40ca3d71    # -0.71f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x409b3333    # 4.85f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x40800000    # 4.0f

    .line 369
    .line 370
    const v18, 0x40a6b852    # 5.21f

    .line 371
    .line 372
    .line 373
    const v13, 0x409147ae    # 4.54f

    .line 374
    .line 375
    .line 376
    const v14, 0x409147ae    # 4.54f

    .line 377
    .line 378
    .line 379
    const/high16 v15, 0x40800000    # 4.0f

    .line 380
    .line 381
    const v16, 0x409851ec    # 4.76f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41900000    # 18.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v18, 0x40000000    # 2.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, 0x3f8ccccd    # 1.1f

    .line 398
    .line 399
    .line 400
    const v15, 0x3f666666    # 0.9f

    .line 401
    .line 402
    .line 403
    const/high16 v16, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x414ca3d7    # 12.79f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, 0x3eb33333    # 0.35f

    .line 415
    .line 416
    .line 417
    const v18, -0x40a66666    # -0.85f

    .line 418
    .line 419
    .line 420
    const v13, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const v15, 0x3f2b851f    # 0.67f

    .line 425
    .line 426
    .line 427
    const v16, -0x40f5c28f    # -0.54f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x418d47ae    # 17.66f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x40e00000    # 7.0f

    .line 443
    .line 444
    const/high16 v2, 0x41800000    # 16.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x3f67ae14    # -4.76f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x414c28f6    # 12.76f

    .line 456
    .line 457
    .line 458
    const/high16 v2, 0x41880000    # 17.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41000000    # 8.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x40e00000    # 7.0f

    .line 469
    .line 470
    const/high16 v18, 0x41800000    # 16.0f

    .line 471
    .line 472
    const v13, 0x40ee6666    # 7.45f

    .line 473
    .line 474
    .line 475
    const/high16 v14, 0x41880000    # 17.0f

    .line 476
    .line 477
    const/high16 v15, 0x40e00000    # 7.0f

    .line 478
    .line 479
    const v16, 0x41846666    # 16.55f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/16 v16, 0x3800

    .line 493
    .line 494
    const/16 v17, 0x0

    .line 495
    .line 496
    const/high16 v6, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v8, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const/high16 v9, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    const/4 v15, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/rounded/SquareFootKt;->_squareFoot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method

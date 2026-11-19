.class public final Landroidx/compose/material/icons/rounded/AcUnitKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _acUnit:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAcUnit(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AcUnitKt;->_acUnit:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AcUnit"

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
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x3fdd70a4    # -2.54f

    .line 84
    .line 85
    .line 86
    const v2, 0x40228f5c    # 2.54f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    const v18, -0x404b851f    # -1.41f

    .line 95
    .line 96
    .line 97
    const v13, 0x3ec7ae14    # 0.39f

    .line 98
    .line 99
    .line 100
    const v14, -0x413851ec    # -0.39f

    .line 101
    .line 102
    .line 103
    const v15, 0x3ec7ae14    # 0.39f

    .line 104
    .line 105
    .line 106
    const v16, -0x407d70a4    # -1.02f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, -0x404a3d71    # -1.42f

    .line 113
    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const v13, -0x413851ec    # -0.39f

    .line 118
    .line 119
    .line 120
    const v15, -0x407c28f6    # -1.03f

    .line 121
    .line 122
    .line 123
    const v16, -0x413851ec    # -0.39f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41700000    # 15.0f

    .line 130
    .line 131
    const/high16 v2, 0x41300000    # 11.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, -0x40000000    # -2.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41100000    # 9.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, -0x3f833333    # -3.95f

    .line 147
    .line 148
    .line 149
    const v2, 0x407ccccd    # 3.95f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v18, -0x404a3d71    # -1.42f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ec7ae14    # 0.39f

    .line 161
    .line 162
    .line 163
    const v15, 0x3ec7ae14    # 0.39f

    .line 164
    .line 165
    .line 166
    const v16, -0x407c28f6    # -1.03f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x404b851f    # -1.41f

    .line 173
    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    const v13, -0x413851ec    # -0.39f

    .line 178
    .line 179
    .line 180
    const v15, -0x407d70a4    # -1.02f

    .line 181
    .line 182
    .line 183
    const v16, -0x413851ec    # -0.39f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x40c570a4    # 6.17f

    .line 190
    .line 191
    .line 192
    const/high16 v2, 0x41500000    # 13.0f

    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40400000    # 3.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, -0x40800000    # -1.0f

    .line 203
    .line 204
    const/high16 v18, -0x40800000    # -1.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, -0x40f33333    # -0.55f

    .line 208
    .line 209
    .line 210
    const v15, -0x4119999a    # -0.45f

    .line 211
    .line 212
    .line 213
    const/high16 v16, -0x40800000    # -1.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x3ee66666    # 0.45f

    .line 219
    .line 220
    .line 221
    const/high16 v2, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v4, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x404ae148    # 3.17f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x41075c29    # 8.46f

    .line 235
    .line 236
    .line 237
    const v2, 0x406851ec    # 3.63f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x404b851f    # -1.41f

    .line 244
    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    const v13, -0x413851ec    # -0.39f

    .line 249
    .line 250
    .line 251
    const v14, -0x413851ec    # -0.39f

    .line 252
    .line 253
    .line 254
    const v15, -0x407d70a4    # -1.02f

    .line 255
    .line 256
    .line 257
    const v16, -0x413851ec    # -0.39f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/16 v17, 0x0

    .line 264
    .line 265
    const v18, 0x3fb5c28f    # 1.42f

    .line 266
    .line 267
    .line 268
    const v14, 0x3ec7ae14    # 0.39f

    .line 269
    .line 270
    .line 271
    const v15, -0x413851ec    # -0.39f

    .line 272
    .line 273
    .line 274
    const v16, 0x3f83d70a    # 1.03f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41100000    # 9.0f

    .line 281
    .line 282
    const/high16 v2, 0x41300000    # 11.0f

    .line 283
    .line 284
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x40000000    # 2.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41100000    # 9.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x40a1999a    # 5.05f

    .line 298
    .line 299
    .line 300
    const v2, 0x40e1999a    # 7.05f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, -0x404a3d71    # -1.42f

    .line 307
    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    const v14, -0x413851ec    # -0.39f

    .line 312
    .line 313
    .line 314
    const v15, -0x407c28f6    # -1.03f

    .line 315
    .line 316
    .line 317
    const v16, -0x413851ec    # -0.39f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    const v18, 0x3fb47ae1    # 1.41f

    .line 326
    .line 327
    .line 328
    const v14, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v15, -0x413851ec    # -0.39f

    .line 332
    .line 333
    .line 334
    const v16, 0x3f828f5c    # 1.02f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x40c570a4    # 6.17f

    .line 341
    .line 342
    .line 343
    const/high16 v2, 0x41300000    # 11.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x40400000    # 3.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, -0x40800000    # -1.0f

    .line 354
    .line 355
    const/high16 v18, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const v13, -0x40f33333    # -0.55f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/high16 v15, -0x40800000    # -1.0f

    .line 362
    .line 363
    const v16, 0x3ee66666    # 0.45f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    const/high16 v2, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x404ae148    # 3.17f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x3fdd70a4    # -2.54f

    .line 384
    .line 385
    .line 386
    const v2, 0x40228f5c    # 2.54f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const v18, 0x3fb47ae1    # 1.41f

    .line 395
    .line 396
    .line 397
    const v13, -0x413851ec    # -0.39f

    .line 398
    .line 399
    .line 400
    const v14, 0x3ec7ae14    # 0.39f

    .line 401
    .line 402
    .line 403
    const v15, -0x413851ec    # -0.39f

    .line 404
    .line 405
    .line 406
    const v16, 0x3f828f5c    # 1.02f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3fb5c28f    # 1.42f

    .line 413
    .line 414
    .line 415
    const/16 v18, 0x0

    .line 416
    .line 417
    const v13, 0x3ec7ae14    # 0.39f

    .line 418
    .line 419
    .line 420
    const v15, 0x3f83d70a    # 1.03f

    .line 421
    .line 422
    .line 423
    const v16, 0x3ec7ae14    # 0.39f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x41500000    # 13.0f

    .line 430
    .line 431
    const/high16 v2, 0x41100000    # 9.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x40000000    # 2.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x3f833333    # -3.95f

    .line 445
    .line 446
    .line 447
    const v2, 0x407ccccd    # 3.95f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/16 v17, 0x0

    .line 454
    .line 455
    const v18, 0x3fb5c28f    # 1.42f

    .line 456
    .line 457
    .line 458
    const v13, -0x413851ec    # -0.39f

    .line 459
    .line 460
    .line 461
    const v15, -0x413851ec    # -0.39f

    .line 462
    .line 463
    .line 464
    const v16, 0x3f83d70a    # 1.03f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3fb47ae1    # 1.41f

    .line 471
    .line 472
    .line 473
    const/16 v18, 0x0

    .line 474
    .line 475
    const v13, 0x3ec7ae14    # 0.39f

    .line 476
    .line 477
    .line 478
    const v15, 0x3f828f5c    # 1.02f

    .line 479
    .line 480
    .line 481
    const v16, 0x3ec7ae14    # 0.39f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x418ea3d7    # 17.83f

    .line 488
    .line 489
    .line 490
    const/high16 v2, 0x41300000    # 11.0f

    .line 491
    .line 492
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x41a80000    # 21.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/high16 v18, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, 0x3f0ccccd    # 0.55f

    .line 506
    .line 507
    .line 508
    const v15, 0x3ee66666    # 0.45f

    .line 509
    .line 510
    .line 511
    const/high16 v16, 0x3f800000    # 1.0f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x4119999a    # -0.45f

    .line 517
    .line 518
    .line 519
    const/high16 v2, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, -0x3fb51eb8    # -3.17f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x40228f5c    # 2.54f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x3fb47ae1    # 1.41f

    .line 537
    .line 538
    .line 539
    const/16 v18, 0x0

    .line 540
    .line 541
    const v13, 0x3ec7ae14    # 0.39f

    .line 542
    .line 543
    .line 544
    const v14, 0x3ec7ae14    # 0.39f

    .line 545
    .line 546
    .line 547
    const v15, 0x3f828f5c    # 1.02f

    .line 548
    .line 549
    .line 550
    const v16, 0x3ec7ae14    # 0.39f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const v18, -0x404a3d71    # -1.42f

    .line 559
    .line 560
    .line 561
    const v14, -0x413851ec    # -0.39f

    .line 562
    .line 563
    .line 564
    const v15, 0x3ec7ae14    # 0.39f

    .line 565
    .line 566
    .line 567
    const v16, -0x407c28f6    # -1.03f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, 0x41700000    # 15.0f

    .line 574
    .line 575
    const/high16 v2, 0x41500000    # 13.0f

    .line 576
    .line 577
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, -0x40000000    # -2.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40000000    # 2.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x407ccccd    # 3.95f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x3fb5c28f    # 1.42f

    .line 597
    .line 598
    .line 599
    const/16 v18, 0x0

    .line 600
    .line 601
    const v14, 0x3ec7ae14    # 0.39f

    .line 602
    .line 603
    .line 604
    const v15, 0x3f83d70a    # 1.03f

    .line 605
    .line 606
    .line 607
    const v16, 0x3ec7ae14    # 0.39f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/16 v17, 0x0

    .line 614
    .line 615
    const v18, -0x404b851f    # -1.41f

    .line 616
    .line 617
    .line 618
    const v14, -0x413851ec    # -0.39f

    .line 619
    .line 620
    .line 621
    const v15, 0x3ec7ae14    # 0.39f

    .line 622
    .line 623
    .line 624
    const v16, -0x407d70a4    # -1.02f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x418ea3d7    # 17.83f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41a80000    # 21.0f

    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/high16 v18, -0x40800000    # -1.0f

    .line 644
    .line 645
    const v13, 0x3f0ccccd    # 0.55f

    .line 646
    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    const/high16 v15, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const v16, -0x4119999a    # -0.45f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x4119999a    # -0.45f

    .line 658
    .line 659
    .line 660
    const/high16 v2, -0x40800000    # -1.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const/16 v16, 0x3800

    .line 673
    .line 674
    const/16 v17, 0x0

    .line 675
    .line 676
    const/high16 v6, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/high16 v8, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/4 v7, 0x0

    .line 681
    const/high16 v9, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/high16 v12, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    const/4 v15, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sput-object v0, Landroidx/compose/material/icons/rounded/AcUnitKt;->_acUnit:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    return-object v0
.end method

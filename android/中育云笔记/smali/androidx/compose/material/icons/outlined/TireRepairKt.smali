.class public final Landroidx/compose/material/icons/outlined/TireRepairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTireRepair(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.TireRepair"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, 0x3e947ae1    # 0.29f

    .line 94
    .line 95
    .line 96
    const v18, -0x40ca3d71    # -0.71f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, -0x4170a3d7    # -0.28f

    .line 101
    .line 102
    .line 103
    const v15, 0x3de147ae    # 0.11f

    .line 104
    .line 105
    .line 106
    const v16, -0x40f851ec    # -0.53f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x401d70a4    # 2.46f

    .line 113
    .line 114
    .line 115
    const v18, -0x407ae148    # -1.04f

    .line 116
    .line 117
    .line 118
    const v13, 0x3ecccccd    # 0.4f

    .line 119
    .line 120
    .line 121
    const v14, -0x41333333    # -0.4f

    .line 122
    .line 123
    .line 124
    const v15, 0x401d70a4    # 2.46f

    .line 125
    .line 126
    .line 127
    const v16, -0x407ae148    # -1.04f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x407ae148    # -1.04f

    .line 134
    .line 135
    .line 136
    const v2, 0x401d70a4    # 2.46f

    .line 137
    .line 138
    .line 139
    const v4, -0x40dc28f6    # -0.64f

    .line 140
    .line 141
    .line 142
    const v6, 0x4003d70a    # 2.06f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x41980000    # 19.0f

    .line 149
    .line 150
    const/high16 v18, 0x41000000    # 8.0f

    .line 151
    .line 152
    const v13, 0x419c3d71    # 19.53f

    .line 153
    .line 154
    .line 155
    const v14, 0x40fc7ae1    # 7.89f

    .line 156
    .line 157
    .line 158
    const v15, 0x419a3d71    # 19.28f

    .line 159
    .line 160
    .line 161
    const/high16 v16, 0x41000000    # 8.0f

    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41500000    # 13.0f

    .line 170
    .line 171
    const/high16 v2, 0x41a00000    # 20.0f

    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40a00000    # 5.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 182
    .line 183
    const/high16 v18, 0x40400000    # 3.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, 0x3fd33333    # 1.65f

    .line 187
    .line 188
    .line 189
    const v15, -0x40533333    # -1.35f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x40400000    # 3.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, -0x40533333    # -1.35f

    .line 198
    .line 199
    .line 200
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, -0x40000000    # -2.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x40800000    # -1.0f

    .line 211
    .line 212
    const/high16 v18, -0x40800000    # -1.0f

    .line 213
    .line 214
    const v14, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    const v15, -0x4119999a    # -0.45f

    .line 218
    .line 219
    .line 220
    const/high16 v16, -0x40800000    # -1.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3ee66666    # 0.45f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v4, -0x40800000    # -1.0f

    .line 231
    .line 232
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40400000    # 3.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/high16 v18, 0x40000000    # 2.0f

    .line 243
    .line 244
    const v14, 0x3f8ccccd    # 1.1f

    .line 245
    .line 246
    .line 247
    const v15, -0x4099999a    # -0.9f

    .line 248
    .line 249
    .line 250
    const/high16 v16, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x40800000    # 4.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v18, -0x40000000    # -2.0f

    .line 261
    .line 262
    const v13, -0x40733333    # -1.1f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, -0x40000000    # -2.0f

    .line 267
    .line 268
    const v16, -0x4099999a    # -0.9f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x40a00000    # 5.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x40000000    # 2.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const v14, -0x40733333    # -1.1f

    .line 283
    .line 284
    .line 285
    const v15, 0x3f666666    # 0.9f

    .line 286
    .line 287
    .line 288
    const/high16 v16, -0x40000000    # -2.0f

    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40c00000    # 6.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v18, 0x40000000    # 2.0f

    .line 299
    .line 300
    const v13, 0x3f8ccccd    # 1.1f

    .line 301
    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    const/high16 v15, 0x40000000    # 2.0f

    .line 305
    .line 306
    const v16, 0x3f666666    # 0.9f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x4102b852    # 8.17f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v18, -0x41d1eb85    # -0.17f

    .line 321
    .line 322
    .line 323
    const v13, 0x3e9eb852    # 0.31f

    .line 324
    .line 325
    .line 326
    const v14, -0x421eb852    # -0.11f

    .line 327
    .line 328
    .line 329
    const v15, 0x3f266666    # 0.65f

    .line 330
    .line 331
    .line 332
    const v16, -0x41d1eb85    # -0.17f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x40400000    # 3.0f

    .line 339
    .line 340
    const/high16 v18, 0x40400000    # 3.0f

    .line 341
    .line 342
    const v13, 0x3fd33333    # 1.65f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const/high16 v15, 0x40400000    # 3.0f

    .line 347
    .line 348
    const v16, 0x3faccccd    # 1.35f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40000000    # 2.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/high16 v18, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3f0ccccd    # 0.55f

    .line 365
    .line 366
    .line 367
    const v15, 0x3ee66666    # 0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x4119999a    # -0.45f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, -0x3f600000    # -5.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, -0x40800000    # -1.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    const v2, -0x404a3d71    # -1.42f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 399
    .line 400
    const v18, -0x3f6d70a4    # -4.58f

    .line 401
    .line 402
    .line 403
    const v13, -0x401d70a4    # -1.77f

    .line 404
    .line 405
    .line 406
    const v14, -0x40bae148    # -0.77f

    .line 407
    .line 408
    .line 409
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 410
    .line 411
    const v16, -0x3fde147b    # -2.53f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x40a00000    # 5.0f

    .line 418
    .line 419
    const/high16 v18, -0x3f600000    # -5.0f

    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const v14, -0x3fcf5c29    # -2.76f

    .line 423
    .line 424
    .line 425
    const v15, 0x400f5c29    # 2.24f

    .line 426
    .line 427
    .line 428
    const/high16 v16, -0x3f600000    # -5.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x400f5c29    # 2.24f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x40a00000    # 5.0f

    .line 437
    .line 438
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 442
    .line 443
    const v18, 0x40928f5c    # 4.58f

    .line 444
    .line 445
    .line 446
    const v14, 0x40033333    # 2.05f

    .line 447
    .line 448
    .line 449
    const v15, -0x40628f5c    # -1.23f

    .line 450
    .line 451
    .line 452
    const v16, 0x4073d70a    # 3.81f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41a80000    # 21.0f

    .line 459
    .line 460
    const/high16 v2, 0x41500000    # 13.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x41a00000    # 20.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41b00000    # 22.0f

    .line 474
    .line 475
    const/high16 v2, 0x40e00000    # 7.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 481
    .line 482
    const v14, -0x402b851f    # -1.66f

    .line 483
    .line 484
    .line 485
    const v15, -0x40547ae1    # -1.34f

    .line 486
    .line 487
    .line 488
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x3fab851f    # 1.34f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x40400000    # 3.0f

    .line 497
    .line 498
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 499
    .line 500
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x410a8f5c    # 8.66f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41b00000    # 22.0f

    .line 510
    .line 511
    const/high16 v4, 0x40e00000    # 7.0f

    .line 512
    .line 513
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41200000    # 10.0f

    .line 520
    .line 521
    const/high16 v2, 0x40e00000    # 7.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41100000    # 9.0f

    .line 527
    .line 528
    const/high16 v2, 0x41000000    # 8.0f

    .line 529
    .line 530
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x40c570a4    # 6.17f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x4112b852    # 9.17f

    .line 540
    .line 541
    .line 542
    const/high16 v2, 0x40a00000    # 5.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x409a8f5c    # 4.83f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x40c570a4    # 6.17f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x40c00000    # 6.0f

    .line 557
    .line 558
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41100000    # 9.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40800000    # 4.0f

    .line 567
    .line 568
    const/high16 v2, 0x40e00000    # 7.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x400ae148    # 2.17f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x40000000    # 2.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x41600000    # 14.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, -0x40000000    # -2.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x400ae148    # 2.17f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x40000000    # 2.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x41980000    # 19.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, -0x40000000    # -2.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x40000000    # 2.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x40c00000    # 6.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, -0x40000000    # -2.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x40000000    # 2.0f

    .line 631
    .line 632
    const/high16 v2, -0x40000000    # -2.0f

    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, -0x3fcae148    # -2.83f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x40000000    # 2.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, 0x41400000    # 12.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x40000000    # 2.0f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, -0x3fcae148    # -2.83f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x40000000    # 2.0f

    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x40e00000    # 7.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const/16 v16, 0x3800

    .line 682
    .line 683
    const/16 v17, 0x0

    .line 684
    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/high16 v8, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/4 v7, 0x0

    .line 690
    const/high16 v9, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v12, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    const/4 v15, 0x0

    .line 696
    const-string v4, ""

    .line 697
    .line 698
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    sput-object v0, Landroidx/compose/material/icons/outlined/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    return-object v0
.end method

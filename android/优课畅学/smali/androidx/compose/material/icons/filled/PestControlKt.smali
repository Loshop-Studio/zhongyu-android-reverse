.class public final Landroidx/compose/material/icons/filled/PestControlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControl(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PestControl"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, -0x3fbb851f    # -3.07f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x419eb852    # -0.22f

    .line 89
    .line 90
    .line 91
    const v18, -0x406e147b    # -1.14f

    .line 92
    .line 93
    .line 94
    const v13, -0x42b33333    # -0.05f

    .line 95
    .line 96
    .line 97
    const v14, -0x413851ec    # -0.39f

    .line 98
    .line 99
    .line 100
    const v15, -0x420a3d71    # -0.12f

    .line 101
    .line 102
    .line 103
    const v16, -0x40bae148    # -0.77f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x404147ae    # -1.49f

    .line 110
    .line 111
    .line 112
    const v2, 0x40251eb8    # 2.58f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x40228f5c    # -1.73f

    .line 119
    .line 120
    .line 121
    const/high16 v2, -0x40800000    # -1.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x41875c29    # 16.92f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x41200000    # 10.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x40828f5c    # -0.99f

    .line 135
    .line 136
    .line 137
    const v18, -0x405ae148    # -1.29f

    .line 138
    .line 139
    .line 140
    const v13, -0x4170a3d7    # -0.28f

    .line 141
    .line 142
    .line 143
    const v14, -0x410a3d71    # -0.48f

    .line 144
    .line 145
    .line 146
    const v15, -0x40e147ae    # -0.62f

    .line 147
    .line 148
    .line 149
    const v16, -0x40970a3d    # -0.91f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x41800000    # 16.0f

    .line 156
    .line 157
    const/high16 v18, 0x41000000    # 8.0f

    .line 158
    .line 159
    const v13, 0x417f851f    # 15.97f

    .line 160
    .line 161
    .line 162
    const v14, 0x4107ae14    # 8.48f

    .line 163
    .line 164
    .line 165
    const/high16 v15, 0x41800000    # 16.0f

    .line 166
    .line 167
    const/high16 v16, 0x41040000    # 8.25f

    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40d9999a    # -0.65f

    .line 173
    .line 174
    .line 175
    const v18, -0x3ff47ae1    # -2.18f

    .line 176
    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const v14, -0x40b33333    # -0.8f

    .line 180
    .line 181
    .line 182
    const v15, -0x418a3d71    # -0.24f

    .line 183
    .line 184
    .line 185
    const v16, -0x4039999a    # -1.55f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x408570a4    # 4.17f

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x41880000    # 17.0f

    .line 195
    .line 196
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, -0x404b851f    # -1.41f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x4023d70a    # -1.72f

    .line 206
    .line 207
    .line 208
    const v2, 0x3fdc28f6    # 1.72f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x3f9147ae    # -3.73f

    .line 215
    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    const v13, -0x4028f5c3    # -1.68f

    .line 220
    .line 221
    .line 222
    const v14, -0x409c28f6    # -0.89f

    .line 223
    .line 224
    .line 225
    const v15, -0x3fb9999a    # -3.1f

    .line 226
    .line 227
    .line 228
    const v16, -0x41570a3d    # -0.33f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x41068f5c    # 8.41f

    .line 235
    .line 236
    .line 237
    const v2, 0x4030a3d7    # 2.76f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40e00000    # 7.0f

    .line 244
    .line 245
    const v2, 0x408570a4    # 4.17f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x3fd33333    # 1.65f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41000000    # 8.0f

    .line 258
    .line 259
    const/high16 v18, 0x41000000    # 8.0f

    .line 260
    .line 261
    const v13, 0x4103d70a    # 8.24f

    .line 262
    .line 263
    .line 264
    const v14, 0x40ce6666    # 6.45f

    .line 265
    .line 266
    .line 267
    const/high16 v15, 0x41000000    # 8.0f

    .line 268
    .line 269
    const v16, 0x40e66666    # 7.2f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x3d8f5c29    # 0.07f

    .line 276
    .line 277
    .line 278
    const v18, 0x3f3851ec    # 0.72f

    .line 279
    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/high16 v14, 0x3e800000    # 0.25f

    .line 283
    .line 284
    const v15, 0x3cf5c28f    # 0.03f

    .line 285
    .line 286
    .line 287
    const v16, 0x3ef5c28f    # 0.48f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x40e28f5c    # 7.08f

    .line 294
    .line 295
    .line 296
    const/high16 v18, 0x41200000    # 10.0f

    .line 297
    .line 298
    const v13, 0x40f66666    # 7.7f

    .line 299
    .line 300
    .line 301
    const v14, 0x4111999a    # 9.1f

    .line 302
    .line 303
    .line 304
    const v15, 0x40eb851f    # 7.36f

    .line 305
    .line 306
    .line 307
    const v16, 0x41187ae1    # 9.53f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x4096b852    # 4.71f

    .line 314
    .line 315
    .line 316
    const v2, 0x410a147b    # 8.63f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3fdd70a4    # 1.73f

    .line 323
    .line 324
    .line 325
    const/high16 v2, -0x40800000    # -1.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x3fbeb852    # 1.49f

    .line 331
    .line 332
    .line 333
    const v2, 0x40251eb8    # 2.58f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x419eb852    # -0.22f

    .line 340
    .line 341
    .line 342
    const v18, 0x3f91eb85    # 1.14f

    .line 343
    .line 344
    .line 345
    const v13, -0x42333333    # -0.1f

    .line 346
    .line 347
    .line 348
    const v14, 0x3ebd70a4    # 0.37f

    .line 349
    .line 350
    .line 351
    const v15, -0x41d1eb85    # -0.17f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x3f400000    # 0.75f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x40400000    # 3.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40000000    # 2.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40447ae1    # 3.07f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x3e6147ae    # 0.22f

    .line 376
    .line 377
    .line 378
    const v13, 0x3d4ccccd    # 0.05f

    .line 379
    .line 380
    .line 381
    const v14, 0x3ec7ae14    # 0.39f

    .line 382
    .line 383
    .line 384
    const v15, 0x3df5c28f    # 0.12f

    .line 385
    .line 386
    .line 387
    const v16, 0x3f451eb8    # 0.77f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x3fdae148    # -2.58f

    .line 394
    .line 395
    .line 396
    const v2, 0x3fbeb852    # 1.49f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const v2, 0x3fdd70a4    # 1.73f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x40e28f5c    # 7.08f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x41900000    # 18.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x409d70a4    # 4.92f

    .line 419
    .line 420
    .line 421
    const/high16 v18, 0x40400000    # 3.0f

    .line 422
    .line 423
    const v13, 0x3f8a3d71    # 1.08f

    .line 424
    .line 425
    .line 426
    const v14, 0x3fe7ae14    # 1.81f

    .line 427
    .line 428
    .line 429
    const v15, 0x403851ec    # 2.88f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x40400000    # 3.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x409d70a4    # 4.92f

    .line 438
    .line 439
    .line 440
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    const v4, 0x4075c28f    # 3.84f

    .line 443
    .line 444
    .line 445
    const v6, -0x4067ae14    # -1.19f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x4017ae14    # 2.37f

    .line 452
    .line 453
    .line 454
    const v2, 0x3faf5c29    # 1.37f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const v2, -0x40228f5c    # -1.73f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x3fdae148    # -2.58f

    .line 469
    .line 470
    .line 471
    const v2, -0x404147ae    # -1.49f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3e6147ae    # 0.22f

    .line 478
    .line 479
    .line 480
    const v18, -0x406e147b    # -1.14f

    .line 481
    .line 482
    .line 483
    const v13, 0x3dcccccd    # 0.1f

    .line 484
    .line 485
    .line 486
    const v14, -0x41428f5c    # -0.37f

    .line 487
    .line 488
    .line 489
    const v15, 0x3e2e147b    # 0.17f

    .line 490
    .line 491
    .line 492
    const/high16 v16, -0x40c00000    # -0.75f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41a80000    # 21.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41500000    # 13.0f

    .line 506
    .line 507
    const/high16 v2, 0x41880000    # 17.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, -0x40000000    # -2.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, -0x3f400000    # -6.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40000000    # 2.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41880000    # 17.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v16, 0x3800

    .line 540
    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v8, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v7, 0x0

    .line 548
    const/high16 v9, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v12, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const/4 v14, 0x0

    .line 554
    const/4 v15, 0x0

    .line 555
    const-string v4, ""

    .line 556
    .line 557
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    sput-object v0, Landroidx/compose/material/icons/filled/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    return-object v0
.end method

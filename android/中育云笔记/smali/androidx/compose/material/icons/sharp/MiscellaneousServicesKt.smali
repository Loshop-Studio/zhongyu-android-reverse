.class public final Landroidx/compose/material/icons/sharp/MiscellaneousServicesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMiscellaneousServices(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MiscellaneousServicesKt;->_miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.MiscellaneousServices"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x415f851f    # 13.97f

    .line 71
    .line 72
    .line 73
    const v6, 0x416051ec    # 14.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fc3d70a    # -2.94f

    .line 80
    .line 81
    .line 82
    const v6, 0x3fd9999a    # 1.7f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x41947ae1    # -0.23f

    .line 89
    .line 90
    .line 91
    const v26, -0x41c7ae14    # -0.18f

    .line 92
    .line 93
    .line 94
    const/16 v21, 0x0

    .line 95
    .line 96
    const/16 v22, 0x0

    .line 97
    .line 98
    const v23, -0x4247ae14    # -0.09f

    .line 99
    .line 100
    .line 101
    const v24, -0x425c28f6    # -0.08f

    .line 102
    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, -0x406b851f    # -1.16f

    .line 110
    .line 111
    .line 112
    const v6, -0x4043d70a    # -1.47f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x3ca3d70a    # 0.02f

    .line 119
    .line 120
    .line 121
    const v6, -0x43dc28f6    # -0.01f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x3d4ccccd    # 0.05f

    .line 128
    .line 129
    .line 130
    const v26, -0x40ca3d71    # -0.71f

    .line 131
    .line 132
    .line 133
    const v21, 0x3cf5c28f    # 0.03f

    .line 134
    .line 135
    .line 136
    const v22, -0x418a3d71    # -0.24f

    .line 137
    .line 138
    .line 139
    const v23, 0x3d4ccccd    # 0.05f

    .line 140
    .line 141
    .line 142
    const v24, -0x410f5c29    # -0.47f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x41600000    # 14.0f

    .line 149
    .line 150
    const v6, 0x4104f5c3    # 8.31f

    .line 151
    .line 152
    .line 153
    const v7, 0x4160a3d7    # 14.04f

    .line 154
    .line 155
    .line 156
    const v8, 0x41087ae1    # 8.53f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x3c23d70a    # 0.01f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, 0x3fdae148    # 1.71f

    .line 169
    .line 170
    .line 171
    const v6, -0x40547ae1    # -1.34f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, -0x40266666    # -1.7f

    .line 178
    .line 179
    .line 180
    const v6, -0x3fc33333    # -2.95f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, -0x3fff5c29    # -2.01f

    .line 187
    .line 188
    .line 189
    const v6, 0x3f4f5c29    # 0.81f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x3c23d70a    # 0.01f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, -0x40666666    # -1.2f

    .line 202
    .line 203
    .line 204
    const v26, -0x40cccccd    # -0.7f

    .line 205
    .line 206
    .line 207
    const v21, -0x41428f5c    # -0.37f

    .line 208
    .line 209
    .line 210
    const v22, -0x4170a3d7    # -0.28f

    .line 211
    .line 212
    .line 213
    const v23, -0x40bae148    # -0.77f

    .line 214
    .line 215
    .line 216
    const v24, -0x40fae148    # -0.52f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x412851ec    # 10.52f

    .line 226
    .line 227
    .line 228
    const/high16 v6, 0x40000000    # 2.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x40e3851f    # 7.11f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x4084cccd    # 4.15f

    .line 240
    .line 241
    .line 242
    const v6, 0x40d9999a    # 6.8f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x3c23d70a    # 0.01f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v26, 0x3f333333    # 0.7f

    .line 255
    .line 256
    .line 257
    const v21, -0x4123d70a    # -0.43f

    .line 258
    .line 259
    .line 260
    const v22, 0x3e3851ec    # 0.18f

    .line 261
    .line 262
    .line 263
    const v23, -0x40ab851f    # -0.83f

    .line 264
    .line 265
    .line 266
    const v24, 0x3ed70a3d    # 0.42f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x409ae148    # 4.84f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x4080f5c3    # 4.03f

    .line 279
    .line 280
    .line 281
    const v6, 0x40666666    # 3.6f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v4, 0x40df5c29    # 6.98f

    .line 288
    .line 289
    .line 290
    const v6, 0x3ff33333    # 1.9f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, 0x3fab851f    # 1.34f

    .line 297
    .line 298
    .line 299
    const v6, 0x3fd9999a    # 1.7f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, -0x43dc28f6    # -0.01f

    .line 306
    .line 307
    .line 308
    const v6, 0x3c23d70a    # 0.01f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x4063d70a    # 3.56f

    .line 315
    .line 316
    .line 317
    const/high16 v26, 0x41100000    # 9.0f

    .line 318
    .line 319
    const v21, 0x40651eb8    # 3.58f

    .line 320
    .line 321
    .line 322
    const v22, 0x41087ae1    # 8.53f

    .line 323
    .line 324
    .line 325
    const v23, 0x4063d70a    # 3.56f

    .line 326
    .line 327
    .line 328
    const v24, 0x410c28f6    # 8.76f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v4, 0x3d4ccccd    # 0.05f

    .line 335
    .line 336
    .line 337
    const v6, 0x3f35c28f    # 0.71f

    .line 338
    .line 339
    .line 340
    const v7, 0x3ca3d70a    # 0.02f

    .line 341
    .line 342
    .line 343
    const v8, 0x3ef0a3d7    # 0.47f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x411b0a3d    # 9.69f

    .line 350
    .line 351
    .line 352
    const v6, 0x40666666    # 3.6f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, 0x3f947ae1    # 1.16f

    .line 359
    .line 360
    .line 361
    const v6, -0x4043d70a    # -1.47f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x3ff33333    # 1.9f

    .line 368
    .line 369
    .line 370
    const v26, 0x41307ae1    # 11.03f

    .line 371
    .line 372
    .line 373
    const/high16 v21, 0x40000000    # 2.0f

    .line 374
    .line 375
    const v22, 0x412f3333    # 10.95f

    .line 376
    .line 377
    .line 378
    const v23, 0x3ff33333    # 1.9f

    .line 379
    .line 380
    .line 381
    const v24, 0x41307ae1    # 11.03f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, 0x403c28f6    # 2.94f

    .line 388
    .line 389
    .line 390
    const v6, 0x3fd9999a    # 1.7f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x400147ae    # 2.02f

    .line 397
    .line 398
    .line 399
    const v6, -0x40b33333    # -0.8f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x40b33333    # 5.6f

    .line 406
    .line 407
    .line 408
    const v6, 0x41523d71    # 13.14f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v25, 0x3f9ae148    # 1.21f

    .line 415
    .line 416
    .line 417
    const v26, 0x3f35c28f    # 0.71f

    .line 418
    .line 419
    .line 420
    const v21, 0x3ebd70a4    # 0.37f

    .line 421
    .line 422
    .line 423
    const v22, 0x3e947ae1    # 0.29f

    .line 424
    .line 425
    .line 426
    const v23, 0x3f451eb8    # 0.77f

    .line 427
    .line 428
    .line 429
    const v24, 0x3f07ae14    # 0.53f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, 0x40d9999a    # 6.8f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41800000    # 16.0f

    .line 442
    .line 443
    const v6, 0x40e3851f    # 7.11f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, 0x4059999a    # 3.4f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v25, 0x3d23d70a    # 0.04f

    .line 456
    .line 457
    .line 458
    const v26, -0x41666666    # -0.3f

    .line 459
    .line 460
    .line 461
    const/16 v21, 0x0

    .line 462
    .line 463
    const/16 v22, 0x0

    .line 464
    .line 465
    const v23, 0x3ca3d70a    # 0.02f

    .line 466
    .line 467
    .line 468
    const v24, -0x41fae148    # -0.13f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v4, 0x3e8a3d71    # 0.27f

    .line 475
    .line 476
    .line 477
    const v6, -0x40133333    # -1.85f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, -0x43dc28f6    # -0.01f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, 0x3f9ae148    # 1.21f

    .line 490
    .line 491
    .line 492
    const v26, -0x40ca3d71    # -0.71f

    .line 493
    .line 494
    .line 495
    const v21, 0x3ee147ae    # 0.44f

    .line 496
    .line 497
    .line 498
    const v22, -0x41c7ae14    # -0.18f

    .line 499
    .line 500
    .line 501
    const v23, 0x3f570a3d    # 0.84f

    .line 502
    .line 503
    .line 504
    const v24, -0x4128f5c3    # -0.42f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x41400000    # 12.0f

    .line 511
    .line 512
    const v6, 0x4152b852    # 13.17f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v4, 0x415f851f    # 13.97f

    .line 519
    .line 520
    .line 521
    const v6, 0x416051ec    # 14.02f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, 0x410cf5c3    # 8.81f

    .line 531
    .line 532
    .line 533
    const/high16 v6, 0x41300000    # 11.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v25, -0x40000000    # -2.0f

    .line 539
    .line 540
    const/high16 v26, -0x40000000    # -2.0f

    .line 541
    .line 542
    const v21, -0x40733333    # -1.1f

    .line 543
    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const/high16 v23, -0x40000000    # -2.0f

    .line 548
    .line 549
    const v24, -0x4099999a    # -0.9f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v4, -0x40000000    # -2.0f

    .line 556
    .line 557
    const v6, 0x3f666666    # 0.9f

    .line 558
    .line 559
    .line 560
    const/high16 v7, 0x40000000    # 2.0f

    .line 561
    .line 562
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v4, 0x3f666666    # 0.9f

    .line 566
    .line 567
    .line 568
    const/high16 v6, 0x40000000    # 2.0f

    .line 569
    .line 570
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v4, 0x411e8f5c    # 9.91f

    .line 574
    .line 575
    .line 576
    const v6, 0x410cf5c3    # 8.81f

    .line 577
    .line 578
    .line 579
    const/high16 v7, 0x41300000    # 11.0f

    .line 580
    .line 581
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const/high16 v9, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 617
    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 619
    .line 620
    .line 621
    move-result-wide v6

    .line 622
    const/4 v0, 0x0

    .line 623
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 631
    .line 632
    .line 633
    move-result v11

    .line 634
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    const v0, 0x41a7d70a    # 20.98f

    .line 640
    .line 641
    .line 642
    const v2, 0x418f851f    # 17.94f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, -0x43dc28f6    # -0.01f

    .line 649
    .line 650
    .line 651
    const v2, 0x3c23d70a    # 0.01f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v17, 0x41a80000    # 21.0f

    .line 658
    .line 659
    const/high16 v18, 0x418c0000    # 17.5f

    .line 660
    .line 661
    const v13, 0x41a7eb85    # 20.99f

    .line 662
    .line 663
    .line 664
    const v14, 0x418e6666    # 17.8f

    .line 665
    .line 666
    .line 667
    const/high16 v15, 0x41a80000    # 21.0f

    .line 668
    .line 669
    const v16, 0x418d3333    # 17.65f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v17, -0x42dc28f6    # -0.04f

    .line 676
    .line 677
    .line 678
    const v18, -0x411eb852    # -0.44f

    .line 679
    .line 680
    .line 681
    const/4 v13, 0x0

    .line 682
    const v14, -0x41e66666    # -0.15f

    .line 683
    .line 684
    .line 685
    const v15, -0x43dc28f6    # -0.01f

    .line 686
    .line 687
    .line 688
    const v16, -0x41666666    # -0.3f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x3c23d70a    # 0.01f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3f8ccccd    # 1.1f

    .line 701
    .line 702
    .line 703
    const v2, -0x40a3d70a    # -0.86f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v0, -0x40747ae1    # -1.09f

    .line 710
    .line 711
    .line 712
    const v2, -0x400ccccd    # -1.9f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, 0x3f051eb8    # 0.52f

    .line 719
    .line 720
    .line 721
    const v2, -0x405ae148    # -1.29f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x3c23d70a    # 0.01f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, -0x40bae148    # -0.77f

    .line 734
    .line 735
    .line 736
    const v18, -0x4119999a    # -0.45f

    .line 737
    .line 738
    .line 739
    const v13, -0x418a3d71    # -0.24f

    .line 740
    .line 741
    .line 742
    const v14, -0x41c7ae14    # -0.18f

    .line 743
    .line 744
    .line 745
    const v15, -0x41051eb8    # -0.49f

    .line 746
    .line 747
    .line 748
    const v16, -0x41570a3d    # -0.33f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v0, 0x4195d70a    # 18.73f

    .line 758
    .line 759
    .line 760
    const/high16 v2, 0x41500000    # 13.0f

    .line 761
    .line 762
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, -0x3ff3d70a    # -2.19f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, -0x41b33333    # -0.2f

    .line 772
    .line 773
    .line 774
    const v2, 0x3fb0a3d7    # 1.38f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x3c23d70a    # 0.01f

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v18, 0x3ee66666    # 0.45f

    .line 787
    .line 788
    .line 789
    const v13, -0x4170a3d7    # -0.28f

    .line 790
    .line 791
    .line 792
    const v14, 0x3df5c28f    # 0.12f

    .line 793
    .line 794
    .line 795
    const v15, -0x40f851ec    # -0.53f

    .line 796
    .line 797
    .line 798
    const v16, 0x3e8a3d71    # 0.27f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, -0x43dc28f6    # -0.01f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v0, -0x40fae148    # -0.52f

    .line 811
    .line 812
    .line 813
    const v2, -0x405ae148    # -1.29f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, -0x40747ae1    # -1.09f

    .line 820
    .line 821
    .line 822
    const v2, 0x3ff33333    # 1.9f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, 0x3f5c28f6    # 0.86f

    .line 829
    .line 830
    .line 831
    const v2, 0x3f8b851f    # 1.09f

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v0, -0x43dc28f6    # -0.01f

    .line 838
    .line 839
    .line 840
    const v2, 0x3c23d70a    # 0.01f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v17, -0x430a3d71    # -0.03f

    .line 847
    .line 848
    .line 849
    const v18, 0x3ee147ae    # 0.44f

    .line 850
    .line 851
    .line 852
    const v13, -0x435c28f6    # -0.02f

    .line 853
    .line 854
    .line 855
    const v14, 0x3e0f5c29    # 0.14f

    .line 856
    .line 857
    .line 858
    const v15, -0x430a3d71    # -0.03f

    .line 859
    .line 860
    .line 861
    const v16, 0x3e947ae1    # 0.29f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v17, 0x3cf5c28f    # 0.03f

    .line 868
    .line 869
    .line 870
    const v18, 0x3eeb851f    # 0.46f

    .line 871
    .line 872
    .line 873
    const/4 v13, 0x0

    .line 874
    const v14, 0x3e19999a    # 0.15f

    .line 875
    .line 876
    .line 877
    const v15, 0x3c23d70a    # 0.01f

    .line 878
    .line 879
    .line 880
    const v16, 0x3e99999a    # 0.3f

    .line 881
    .line 882
    .line 883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v0, -0x408f5c29    # -0.94f

    .line 890
    .line 891
    .line 892
    const/high16 v2, 0x3f400000    # 0.75f

    .line 893
    .line 894
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v17, -0x41e66666    # -0.15f

    .line 898
    .line 899
    .line 900
    const v18, 0x3df5c28f    # 0.12f

    .line 901
    .line 902
    .line 903
    const v13, -0x425c28f6    # -0.08f

    .line 904
    .line 905
    .line 906
    const v14, 0x3d75c28f    # 0.06f

    .line 907
    .line 908
    .line 909
    const v15, -0x41e66666    # -0.15f

    .line 910
    .line 911
    .line 912
    const v16, 0x3df5c28f    # 0.12f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const v0, 0x3ff1eb85    # 1.89f

    .line 919
    .line 920
    .line 921
    const v2, 0x3f8b851f    # 1.09f

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v0, 0x3fa66666    # 1.3f

    .line 928
    .line 929
    .line 930
    const v2, -0x40fd70a4    # -0.51f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v0, -0x435c28f6    # -0.02f

    .line 937
    .line 938
    .line 939
    const v2, -0x43dc28f6    # -0.01f

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v17, 0x3f47ae14    # 0.78f

    .line 946
    .line 947
    .line 948
    const v18, 0x3eeb851f    # 0.46f

    .line 949
    .line 950
    .line 951
    const v13, 0x3e75c28f    # 0.24f

    .line 952
    .line 953
    .line 954
    const v14, 0x3e428f5c    # 0.19f

    .line 955
    .line 956
    .line 957
    const/high16 v15, 0x3f000000    # 0.5f

    .line 958
    .line 959
    const v16, 0x3eae147b    # 0.34f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v0, -0x43dc28f6    # -0.01f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v0, 0x3e4ccccd    # 0.2f

    .line 972
    .line 973
    .line 974
    const v2, 0x3fb0a3d7    # 1.38f

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const v0, 0x400c28f6    # 2.19f

    .line 981
    .line 982
    .line 983
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v17, 0x3cf5c28f    # 0.03f

    .line 987
    .line 988
    .line 989
    const v18, -0x41bd70a4    # -0.19f

    .line 990
    .line 991
    .line 992
    const/4 v13, 0x0

    .line 993
    const/4 v14, 0x0

    .line 994
    const v15, 0x3c23d70a    # 0.01f

    .line 995
    .line 996
    .line 997
    const v16, -0x425c28f6    # -0.08f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v0, 0x3e2e147b    # 0.17f

    .line 1004
    .line 1005
    .line 1006
    const v2, -0x4067ae14    # -1.19f

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    const v0, -0x43dc28f6    # -0.01f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const v17, 0x3f47ae14    # 0.78f

    .line 1019
    .line 1020
    .line 1021
    const v18, -0x41147ae1    # -0.46f

    .line 1022
    .line 1023
    .line 1024
    const v13, 0x3e8f5c29    # 0.28f

    .line 1025
    .line 1026
    .line 1027
    const v14, -0x420a3d71    # -0.12f

    .line 1028
    .line 1029
    .line 1030
    const v15, 0x3f0a3d71    # 0.54f

    .line 1031
    .line 1032
    .line 1033
    const v16, -0x4175c28f    # -0.27f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v0, 0x3ca3d70a    # 0.02f

    .line 1040
    .line 1041
    .line 1042
    const v2, -0x43dc28f6    # -0.01f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v0, 0x3fa66666    # 1.3f

    .line 1049
    .line 1050
    .line 1051
    const v2, 0x3f028f5c    # 0.51f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const v0, -0x400e147b    # -1.89f

    .line 1058
    .line 1059
    .line 1060
    const v2, 0x3f8b851f    # 1.09f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v17, -0x41e66666    # -0.15f

    .line 1067
    .line 1068
    .line 1069
    const v18, -0x420a3d71    # -0.12f

    .line 1070
    .line 1071
    .line 1072
    const/4 v13, 0x0

    .line 1073
    const/4 v14, 0x0

    .line 1074
    const v15, -0x428a3d71    # -0.06f

    .line 1075
    .line 1076
    .line 1077
    const v16, -0x42b33333    # -0.05f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const v0, 0x41a7d70a    # 20.98f

    .line 1084
    .line 1085
    .line 1086
    const v2, 0x418f851f    # 17.94f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v0, 0x418d0a3d    # 17.63f

    .line 1096
    .line 1097
    .line 1098
    const v2, 0x419651ec    # 18.79f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const v17, -0x405ae148    # -1.29f

    .line 1105
    .line 1106
    .line 1107
    const v18, -0x405ae148    # -1.29f

    .line 1108
    .line 1109
    .line 1110
    const v13, -0x40ca3d71    # -0.71f

    .line 1111
    .line 1112
    .line 1113
    const v15, -0x405ae148    # -1.29f

    .line 1114
    .line 1115
    .line 1116
    const v16, -0x40eb851f    # -0.58f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const v0, 0x3f147ae1    # 0.58f

    .line 1123
    .line 1124
    .line 1125
    const v2, 0x3fa51eb8    # 1.29f

    .line 1126
    .line 1127
    .line 1128
    const v4, -0x405ae148    # -1.29f

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const v0, 0x4192b852    # 18.34f

    .line 1138
    .line 1139
    .line 1140
    const v2, 0x418d0a3d    # 17.63f

    .line 1141
    .line 1142
    .line 1143
    const v4, 0x419651ec    # 18.79f

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    const/16 v16, 0x3800

    .line 1157
    .line 1158
    const/16 v17, 0x0

    .line 1159
    .line 1160
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1161
    .line 1162
    const/4 v7, 0x0

    .line 1163
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1164
    .line 1165
    const/4 v13, 0x0

    .line 1166
    const/4 v15, 0x0

    .line 1167
    const-string v4, ""

    .line 1168
    .line 1169
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    sput-object v0, Landroidx/compose/material/icons/sharp/MiscellaneousServicesKt;->_miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1178
    .line 1179
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1180
    .line 1181
    .line 1182
    return-object v0
.end method

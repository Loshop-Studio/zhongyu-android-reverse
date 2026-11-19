.class public final Landroidx/compose/material/icons/twotone/WaterDropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaterDrop(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WaterDrop"

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
    const v4, 0x409570a4    # 4.67f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, -0x3f400000    # -6.0f

    .line 79
    .line 80
    const v26, 0x41123d71    # 9.14f

    .line 81
    .line 82
    .line 83
    const v21, -0x3f7e6666    # -4.05f

    .line 84
    .line 85
    .line 86
    const v22, 0x406ccccd    # 3.7f

    .line 87
    .line 88
    .line 89
    const/high16 v23, -0x3f400000    # -6.0f

    .line 90
    .line 91
    const v24, 0x40d947ae    # 6.79f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const v26, 0x40c66666    # 6.2f

    .line 102
    .line 103
    .line 104
    const/16 v21, 0x0

    .line 105
    .line 106
    const v22, 0x406851ec    # 3.63f

    .line 107
    .line 108
    .line 109
    const v23, 0x4029999a    # 2.65f

    .line 110
    .line 111
    .line 112
    const v24, 0x40c66666    # 6.2f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, -0x3fdb851f    # -2.57f

    .line 119
    .line 120
    .line 121
    const v6, -0x3f39999a    # -6.2f

    .line 122
    .line 123
    .line 124
    const/high16 v7, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x41400000    # 12.0f

    .line 130
    .line 131
    const v26, 0x409570a4    # 4.67f

    .line 132
    .line 133
    .line 134
    const/high16 v21, 0x41900000    # 18.0f

    .line 135
    .line 136
    const v22, 0x41375c29    # 11.46f

    .line 137
    .line 138
    .line 139
    const v23, 0x41806666    # 16.05f

    .line 140
    .line 141
    .line 142
    const v24, 0x4105c28f    # 8.36f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x41447ae1    # 12.28f

    .line 152
    .line 153
    .line 154
    const v6, 0x4197eb85    # 18.99f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x3f59eb85    # -5.19f

    .line 161
    .line 162
    .line 163
    const v26, -0x3f7c28f6    # -4.12f

    .line 164
    .line 165
    .line 166
    const v21, -0x3ff7ae14    # -2.13f

    .line 167
    .line 168
    .line 169
    const v22, 0x3e051eb8    # 0.13f

    .line 170
    .line 171
    .line 172
    const v23, -0x3f6c28f6    # -4.62f

    .line 173
    .line 174
    .line 175
    const v24, -0x40747ae1    # -1.09f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, 0x40fa8f5c    # 7.83f

    .line 182
    .line 183
    .line 184
    const/high16 v26, 0x41600000    # 14.0f

    .line 185
    .line 186
    const v21, 0x40e051ec    # 7.01f

    .line 187
    .line 188
    .line 189
    const v22, 0x4166b852    # 14.42f

    .line 190
    .line 191
    .line 192
    const v23, 0x40ebd70a    # 7.37f

    .line 193
    .line 194
    .line 195
    const/high16 v24, 0x41600000    # 14.0f

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v25, 0x3f3d70a4    # 0.74f

    .line 201
    .line 202
    .line 203
    const v26, 0x3f1eb852    # 0.62f

    .line 204
    .line 205
    .line 206
    const v21, 0x3ebd70a4    # 0.37f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const v23, 0x3f2b851f    # 0.67f

    .line 212
    .line 213
    .line 214
    const v24, 0x3e851eb8    # 0.26f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x4068f5c3    # 3.64f

    .line 221
    .line 222
    .line 223
    const v26, 0x4037ae14    # 2.87f

    .line 224
    .line 225
    .line 226
    const v21, 0x3ed1eb85    # 0.41f

    .line 227
    .line 228
    .line 229
    const v22, 0x400eb852    # 2.23f

    .line 230
    .line 231
    .line 232
    const v23, 0x4011eb85    # 2.28f

    .line 233
    .line 234
    .line 235
    const v24, 0x403eb852    # 2.98f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x3f4a3d71    # 0.79f

    .line 242
    .line 243
    .line 244
    const/high16 v26, 0x3f400000    # 0.75f

    .line 245
    .line 246
    const v21, 0x3edc28f6    # 0.43f

    .line 247
    .line 248
    .line 249
    const v22, -0x435c28f6    # -0.02f

    .line 250
    .line 251
    .line 252
    const v23, 0x3f4a3d71    # 0.79f

    .line 253
    .line 254
    .line 255
    const v24, 0x3ea3d70a    # 0.32f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v25, 0x41447ae1    # 12.28f

    .line 262
    .line 263
    .line 264
    const v26, 0x4197eb85    # 18.99f

    .line 265
    .line 266
    .line 267
    const/high16 v21, 0x41500000    # 13.0f

    .line 268
    .line 269
    const v22, 0x41951eb8    # 18.64f

    .line 270
    .line 271
    .line 272
    const v23, 0x414ae148    # 12.68f

    .line 273
    .line 274
    .line 275
    const v24, 0x4197c28f    # 18.97f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/16 v16, 0x3800

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const v6, 0x3e99999a    # 0.3f

    .line 293
    .line 294
    .line 295
    const v8, 0x3e99999a    # 0.3f

    .line 296
    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    const/high16 v9, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/high16 v12, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x40000000    # 2.0f

    .line 339
    .line 340
    const/high16 v2, 0x41400000    # 12.0f

    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x3f000000    # -8.0f

    .line 346
    .line 347
    const v18, 0x413ccccd    # 11.8f

    .line 348
    .line 349
    .line 350
    const v13, -0x3f5570a4    # -5.33f

    .line 351
    .line 352
    .line 353
    const v14, 0x4091999a    # 4.55f

    .line 354
    .line 355
    .line 356
    const/high16 v15, -0x3f000000    # -8.0f

    .line 357
    .line 358
    const v16, 0x4107ae14    # 8.48f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41000000    # 8.0f

    .line 365
    .line 366
    const v18, 0x41033333    # 8.2f

    .line 367
    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const v14, 0x409f5c29    # 4.98f

    .line 371
    .line 372
    .line 373
    const v15, 0x40733333    # 3.8f

    .line 374
    .line 375
    .line 376
    const v16, 0x41033333    # 8.2f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x3fb1eb85    # -3.22f

    .line 383
    .line 384
    .line 385
    const v2, -0x3efccccd    # -8.2f

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x41000000    # 8.0f

    .line 389
    .line 390
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x41400000    # 12.0f

    .line 394
    .line 395
    const/high16 v18, 0x40000000    # 2.0f

    .line 396
    .line 397
    const/high16 v13, 0x41a00000    # 20.0f

    .line 398
    .line 399
    const v14, 0x4127ae14    # 10.48f

    .line 400
    .line 401
    .line 402
    const v15, 0x418aa3d7    # 17.33f

    .line 403
    .line 404
    .line 405
    const v16, 0x40d1999a    # 6.55f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41a00000    # 20.0f

    .line 415
    .line 416
    const/high16 v2, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x3f400000    # -6.0f

    .line 422
    .line 423
    const v18, -0x3f39999a    # -6.2f

    .line 424
    .line 425
    .line 426
    const v13, -0x3fa9999a    # -3.35f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, -0x3f400000    # -6.0f

    .line 431
    .line 432
    const v16, -0x3fdb851f    # -2.57f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x40c00000    # 6.0f

    .line 439
    .line 440
    const v18, -0x3eedc28f    # -9.14f

    .line 441
    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const v14, -0x3fea3d71    # -2.34f

    .line 445
    .line 446
    .line 447
    const v15, 0x3ff9999a    # 1.95f

    .line 448
    .line 449
    .line 450
    const v16, -0x3f51eb85    # -5.44f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v18, 0x41123d71    # 9.14f

    .line 457
    .line 458
    .line 459
    const v13, 0x4081999a    # 4.05f

    .line 460
    .line 461
    .line 462
    const v14, 0x406ccccd    # 3.7f

    .line 463
    .line 464
    .line 465
    const/high16 v15, 0x40c00000    # 6.0f

    .line 466
    .line 467
    const v16, 0x40d947ae    # 6.79f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x41400000    # 12.0f

    .line 474
    .line 475
    const/high16 v18, 0x41a00000    # 20.0f

    .line 476
    .line 477
    const/high16 v13, 0x41900000    # 18.0f

    .line 478
    .line 479
    const v14, 0x418b70a4    # 17.43f

    .line 480
    .line 481
    .line 482
    const v15, 0x4175999a    # 15.35f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x41a00000    # 20.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x40fa8f5c    # 7.83f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x41600000    # 14.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x3f3d70a4    # 0.74f

    .line 502
    .line 503
    .line 504
    const v18, 0x3f1eb852    # 0.62f

    .line 505
    .line 506
    .line 507
    const v13, 0x3ebd70a4    # 0.37f

    .line 508
    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    const v15, 0x3f2b851f    # 0.67f

    .line 512
    .line 513
    .line 514
    const v16, 0x3e851eb8    # 0.26f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x4068f5c3    # 3.64f

    .line 521
    .line 522
    .line 523
    const v18, 0x4037ae14    # 2.87f

    .line 524
    .line 525
    .line 526
    const v13, 0x3ed1eb85    # 0.41f

    .line 527
    .line 528
    .line 529
    const v14, 0x400e147b    # 2.22f

    .line 530
    .line 531
    .line 532
    const v15, 0x4011eb85    # 2.28f

    .line 533
    .line 534
    .line 535
    const v16, 0x403eb852    # 2.98f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3f4a3d71    # 0.79f

    .line 542
    .line 543
    .line 544
    const/high16 v18, 0x3f400000    # 0.75f

    .line 545
    .line 546
    const v13, 0x3edc28f6    # 0.43f

    .line 547
    .line 548
    .line 549
    const v14, -0x435c28f6    # -0.02f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f4a3d71    # 0.79f

    .line 553
    .line 554
    .line 555
    const v16, 0x3ea3d70a    # 0.32f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, -0x40c7ae14    # -0.72f

    .line 562
    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const v14, 0x3ecccccd    # 0.4f

    .line 566
    .line 567
    .line 568
    const v15, -0x415c28f6    # -0.32f

    .line 569
    .line 570
    .line 571
    const v16, 0x3f3ae148    # 0.73f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, -0x3f59eb85    # -5.19f

    .line 578
    .line 579
    .line 580
    const v18, -0x3f7c28f6    # -4.12f

    .line 581
    .line 582
    .line 583
    const v13, -0x3ff7ae14    # -2.13f

    .line 584
    .line 585
    .line 586
    const v14, 0x3e051eb8    # 0.13f

    .line 587
    .line 588
    .line 589
    const v15, -0x3f6c28f6    # -4.62f

    .line 590
    .line 591
    .line 592
    const v16, -0x40747ae1    # -1.09f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x40fa8f5c    # 7.83f

    .line 599
    .line 600
    .line 601
    const/high16 v18, 0x41600000    # 14.0f

    .line 602
    .line 603
    const v13, 0x40e051ec    # 7.01f

    .line 604
    .line 605
    .line 606
    const v14, 0x4166b852    # 14.42f

    .line 607
    .line 608
    .line 609
    const v15, 0x40ebd70a    # 7.37f

    .line 610
    .line 611
    .line 612
    const/high16 v16, 0x41600000    # 14.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    const/16 v16, 0x3800

    .line 625
    .line 626
    const/16 v17, 0x0

    .line 627
    .line 628
    const/high16 v6, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/high16 v8, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/4 v7, 0x0

    .line 633
    const/high16 v12, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const/4 v14, 0x0

    .line 637
    const/4 v15, 0x0

    .line 638
    const-string v4, ""

    .line 639
    .line 640
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    sput-object v0, Landroidx/compose/material/icons/twotone/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    return-object v0
.end method

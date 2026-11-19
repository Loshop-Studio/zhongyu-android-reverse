.class public final Landroidx/compose/material/icons/rounded/SettingsApplicationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsApplications(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsApplications"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, -0x40000000    # -2.0f

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40800000    # 4.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v22, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x3f800000    # -4.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v8, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x41980000    # 19.0f

    .line 158
    .line 159
    const/high16 v2, 0x40400000    # 3.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x40a00000    # 5.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40400000    # 3.0f

    .line 170
    .line 171
    const/high16 v18, 0x40a00000    # 5.0f

    .line 172
    .line 173
    const v13, 0x4078f5c3    # 3.89f

    .line 174
    .line 175
    .line 176
    const/high16 v14, 0x40400000    # 3.0f

    .line 177
    .line 178
    const/high16 v15, 0x40400000    # 3.0f

    .line 179
    .line 180
    const v16, 0x4079999a    # 3.9f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41600000    # 14.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x40000000    # 2.0f

    .line 192
    .line 193
    const/high16 v18, 0x40000000    # 2.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, 0x3f8ccccd    # 1.1f

    .line 197
    .line 198
    .line 199
    const v15, 0x3f63d70a    # 0.89f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v18, -0x40000000    # -2.0f

    .line 211
    .line 212
    const v13, 0x3f8e147b    # 1.11f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/high16 v15, 0x40000000    # 2.0f

    .line 217
    .line 218
    const v16, -0x4099999a    # -0.9f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x40a00000    # 5.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x41980000    # 19.0f

    .line 230
    .line 231
    const/high16 v18, 0x40400000    # 3.0f

    .line 232
    .line 233
    const/high16 v13, 0x41a80000    # 21.0f

    .line 234
    .line 235
    const v14, 0x4079999a    # 3.9f

    .line 236
    .line 237
    .line 238
    const v15, 0x41a0e148    # 20.11f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x40400000    # 3.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x417c0000    # 15.75f

    .line 250
    .line 251
    const/high16 v2, 0x41400000    # 12.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x428a3d71    # -0.06f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f2147ae    # 0.63f

    .line 260
    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, 0x3e6147ae    # 0.22f

    .line 264
    .line 265
    .line 266
    const v15, -0x430a3d71    # -0.03f

    .line 267
    .line 268
    .line 269
    const v16, 0x3ed70a3d    # 0.42f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3f3ae148    # 0.73f

    .line 276
    .line 277
    .line 278
    const v2, 0x3f570a3d    # 0.84f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3dcccccd    # 0.1f

    .line 285
    .line 286
    .line 287
    const v13, 0x3e3851ec    # 0.18f

    .line 288
    .line 289
    .line 290
    const v14, 0x3e23d70a    # 0.16f

    .line 291
    .line 292
    .line 293
    const v15, 0x3e6147ae    # 0.22f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3f828f5c    # 1.02f

    .line 300
    .line 301
    .line 302
    const v2, -0x40e8f5c3    # -0.59f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x40e8f5c3    # -0.59f

    .line 309
    .line 310
    .line 311
    const v18, 0x3e6147ae    # 0.22f

    .line 312
    .line 313
    .line 314
    const v13, -0x420a3d71    # -0.12f

    .line 315
    .line 316
    .line 317
    const v14, 0x3e570a3d    # 0.21f

    .line 318
    .line 319
    .line 320
    const v15, -0x41428f5c    # -0.37f

    .line 321
    .line 322
    .line 323
    const v16, 0x3e99999a    # 0.3f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, -0x4147ae14    # -0.36f

    .line 330
    .line 331
    .line 332
    const v2, -0x407851ec    # -1.06f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x4075c28f    # -1.08f

    .line 339
    .line 340
    .line 341
    const v18, 0x3f2147ae    # 0.63f

    .line 342
    .line 343
    .line 344
    const v13, -0x415c28f6    # -0.32f

    .line 345
    .line 346
    .line 347
    const v14, 0x3e8a3d71    # 0.27f

    .line 348
    .line 349
    .line 350
    const v15, -0x40d1eb85    # -0.68f

    .line 351
    .line 352
    .line 353
    const v16, 0x3ef5c28f    # 0.48f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x3f8b851f    # 1.09f

    .line 360
    .line 361
    .line 362
    const v2, -0x419eb852    # -0.22f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, -0x41051eb8    # -0.49f

    .line 369
    .line 370
    .line 371
    const v18, 0x3ecccccd    # 0.4f

    .line 372
    .line 373
    .line 374
    const v13, -0x42b33333    # -0.05f

    .line 375
    .line 376
    .line 377
    const v14, 0x3e6b851f    # 0.23f

    .line 378
    .line 379
    .line 380
    const/high16 v15, -0x41800000    # -0.25f

    .line 381
    .line 382
    const v16, 0x3ecccccd    # 0.4f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, -0x4068f5c3    # -1.18f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v18, -0x41333333    # -0.4f

    .line 395
    .line 396
    .line 397
    const v13, -0x418a3d71    # -0.24f

    .line 398
    .line 399
    .line 400
    const/4 v14, 0x0

    .line 401
    const v15, -0x411eb852    # -0.44f

    .line 402
    .line 403
    .line 404
    const v16, -0x41d1eb85    # -0.17f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x40747ae1    # -1.09f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, -0x4075c28f    # -1.08f

    .line 417
    .line 418
    .line 419
    const v18, -0x40deb852    # -0.63f

    .line 420
    .line 421
    .line 422
    const v13, -0x41333333    # -0.4f

    .line 423
    .line 424
    .line 425
    const v14, -0x41e66666    # -0.15f

    .line 426
    .line 427
    .line 428
    const v15, -0x40bd70a4    # -0.76f

    .line 429
    .line 430
    .line 431
    const v16, -0x4147ae14    # -0.36f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3eb851ec    # 0.36f

    .line 438
    .line 439
    .line 440
    const v2, -0x407851ec    # -1.06f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x40e8f5c3    # -0.59f

    .line 447
    .line 448
    .line 449
    const v18, -0x419eb852    # -0.22f

    .line 450
    .line 451
    .line 452
    const v13, -0x41947ae1    # -0.23f

    .line 453
    .line 454
    .line 455
    const v14, 0x3da3d70a    # 0.08f

    .line 456
    .line 457
    .line 458
    const v15, -0x410f5c29    # -0.47f

    .line 459
    .line 460
    .line 461
    const v16, -0x435c28f6    # -0.02f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, -0x407d70a4    # -1.02f

    .line 468
    .line 469
    .line 470
    const v2, -0x40e8f5c3    # -0.59f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x3dcccccd    # 0.1f

    .line 477
    .line 478
    .line 479
    const v18, -0x40deb852    # -0.63f

    .line 480
    .line 481
    .line 482
    const v13, -0x420a3d71    # -0.12f

    .line 483
    .line 484
    .line 485
    const v14, -0x41a8f5c3    # -0.21f

    .line 486
    .line 487
    .line 488
    const v15, -0x425c28f6    # -0.08f

    .line 489
    .line 490
    .line 491
    const v16, -0x410f5c29    # -0.47f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, -0x40c51eb8    # -0.73f

    .line 498
    .line 499
    .line 500
    const v2, 0x3f570a3d    # 0.84f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x41040000    # 8.25f

    .line 507
    .line 508
    const/high16 v18, 0x41400000    # 12.0f

    .line 509
    .line 510
    const v13, 0x41047ae1    # 8.28f

    .line 511
    .line 512
    .line 513
    const v14, 0x4146b852    # 12.42f

    .line 514
    .line 515
    .line 516
    const/high16 v15, 0x41040000    # 8.25f

    .line 517
    .line 518
    const v16, 0x4143851f    # 12.22f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3d75c28f    # 0.06f

    .line 525
    .line 526
    .line 527
    const v2, -0x40deb852    # -0.63f

    .line 528
    .line 529
    .line 530
    const v4, 0x3cf5c28f    # 0.03f

    .line 531
    .line 532
    .line 533
    const v6, -0x4128f5c3    # -0.42f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, -0x40a8f5c3    # -0.84f

    .line 540
    .line 541
    .line 542
    const v2, -0x40c51eb8    # -0.73f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, -0x42333333    # -0.1f

    .line 549
    .line 550
    .line 551
    const v18, -0x40deb852    # -0.63f

    .line 552
    .line 553
    .line 554
    const v13, -0x41c7ae14    # -0.18f

    .line 555
    .line 556
    .line 557
    const v14, -0x41dc28f6    # -0.16f

    .line 558
    .line 559
    .line 560
    const v15, -0x419eb852    # -0.22f

    .line 561
    .line 562
    .line 563
    const v16, -0x4128f5c3    # -0.42f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x3f170a3d    # 0.59f

    .line 570
    .line 571
    .line 572
    const v2, -0x407d70a4    # -1.02f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x3f170a3d    # 0.59f

    .line 579
    .line 580
    .line 581
    const v18, -0x419eb852    # -0.22f

    .line 582
    .line 583
    .line 584
    const v13, 0x3df5c28f    # 0.12f

    .line 585
    .line 586
    .line 587
    const v14, -0x41a8f5c3    # -0.21f

    .line 588
    .line 589
    .line 590
    const v15, 0x3ebd70a4    # 0.37f

    .line 591
    .line 592
    .line 593
    const v16, -0x41666666    # -0.3f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3f87ae14    # 1.06f

    .line 600
    .line 601
    .line 602
    const v2, 0x3eb851ec    # 0.36f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x3f8a3d71    # 1.08f

    .line 609
    .line 610
    .line 611
    const v18, -0x40deb852    # -0.63f

    .line 612
    .line 613
    .line 614
    const v13, 0x3ea3d70a    # 0.32f

    .line 615
    .line 616
    .line 617
    const v14, -0x4175c28f    # -0.27f

    .line 618
    .line 619
    .line 620
    const v15, 0x3f2e147b    # 0.68f

    .line 621
    .line 622
    .line 623
    const v16, -0x410a3d71    # -0.48f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x3e6147ae    # 0.22f

    .line 630
    .line 631
    .line 632
    const v2, -0x40747ae1    # -1.09f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x41368f5c    # 11.41f

    .line 639
    .line 640
    .line 641
    const/high16 v18, 0x40e00000    # 7.0f

    .line 642
    .line 643
    const v13, 0x412f851f    # 10.97f

    .line 644
    .line 645
    .line 646
    const v14, 0x40e570a4    # 7.17f

    .line 647
    .line 648
    .line 649
    const v15, 0x4132b852    # 11.17f

    .line 650
    .line 651
    .line 652
    const/high16 v16, 0x40e00000    # 7.0f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x3f970a3d    # 1.18f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x3efae148    # 0.49f

    .line 664
    .line 665
    .line 666
    const v18, 0x3ecccccd    # 0.4f

    .line 667
    .line 668
    .line 669
    const v13, 0x3e75c28f    # 0.24f

    .line 670
    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const v15, 0x3ee147ae    # 0.44f

    .line 674
    .line 675
    .line 676
    const v16, 0x3e2e147b    # 0.17f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x3e6147ae    # 0.22f

    .line 683
    .line 684
    .line 685
    const v2, 0x3f8b851f    # 1.09f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, 0x3f8a3d71    # 1.08f

    .line 692
    .line 693
    .line 694
    const v18, 0x3f2147ae    # 0.63f

    .line 695
    .line 696
    .line 697
    const v13, 0x3ecccccd    # 0.4f

    .line 698
    .line 699
    .line 700
    const v14, 0x3e19999a    # 0.15f

    .line 701
    .line 702
    .line 703
    const v15, 0x3f428f5c    # 0.76f

    .line 704
    .line 705
    .line 706
    const v16, 0x3eb851ec    # 0.36f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x3f87ae14    # 1.06f

    .line 713
    .line 714
    .line 715
    const v2, -0x4147ae14    # -0.36f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, 0x3f170a3d    # 0.59f

    .line 722
    .line 723
    .line 724
    const v18, 0x3e6147ae    # 0.22f

    .line 725
    .line 726
    .line 727
    const v13, 0x3e6b851f    # 0.23f

    .line 728
    .line 729
    .line 730
    const v14, -0x425c28f6    # -0.08f

    .line 731
    .line 732
    .line 733
    const v15, 0x3ef0a3d7    # 0.47f

    .line 734
    .line 735
    .line 736
    const v16, 0x3ca3d70a    # 0.02f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x3f170a3d    # 0.59f

    .line 743
    .line 744
    .line 745
    const v2, 0x3f828f5c    # 1.02f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v17, -0x42333333    # -0.1f

    .line 752
    .line 753
    .line 754
    const v18, 0x3f2147ae    # 0.63f

    .line 755
    .line 756
    .line 757
    const v13, 0x3df5c28f    # 0.12f

    .line 758
    .line 759
    .line 760
    const v14, 0x3e570a3d    # 0.21f

    .line 761
    .line 762
    .line 763
    const v15, 0x3da3d70a    # 0.08f

    .line 764
    .line 765
    .line 766
    const v16, 0x3ef0a3d7    # 0.47f

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, -0x40a8f5c3    # -0.84f

    .line 773
    .line 774
    .line 775
    const v2, 0x3f3ae148    # 0.73f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, 0x417c0000    # 15.75f

    .line 782
    .line 783
    const/high16 v18, 0x41400000    # 12.0f

    .line 784
    .line 785
    const v13, 0x417b851f    # 15.72f

    .line 786
    .line 787
    .line 788
    const v14, 0x413947ae    # 11.58f

    .line 789
    .line 790
    .line 791
    const/high16 v15, 0x417c0000    # 15.75f

    .line 792
    .line 793
    const v16, 0x413c7ae1    # 11.78f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    const/16 v16, 0x3800

    .line 807
    .line 808
    const/16 v17, 0x0

    .line 809
    .line 810
    const/high16 v6, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const/4 v7, 0x0

    .line 813
    const/high16 v12, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/4 v13, 0x0

    .line 816
    const/4 v14, 0x0

    .line 817
    const/4 v15, 0x0

    .line 818
    const-string v4, ""

    .line 819
    .line 820
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 829
    .line 830
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    return-object v0
.end method

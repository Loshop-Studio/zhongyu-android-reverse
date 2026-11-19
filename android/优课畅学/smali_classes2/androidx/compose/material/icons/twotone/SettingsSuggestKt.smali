.class public final Landroidx/compose/material/icons/twotone/SettingsSuggestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSuggest(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SettingsSuggest"

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
    const v4, 0x41611eb8    # 14.07f

    .line 71
    .line 72
    .line 73
    const v6, 0x4173ae14    # 15.23f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3e3851ec    # 0.18f

    .line 80
    .line 81
    .line 82
    const v26, -0x40628f5c    # -1.23f

    .line 83
    .line 84
    .line 85
    const v21, 0x3df5c28f    # 0.12f

    .line 86
    .line 87
    .line 88
    const v22, -0x413851ec    # -0.39f

    .line 89
    .line 90
    .line 91
    const v23, 0x3e3851ec    # 0.18f

    .line 92
    .line 93
    .line 94
    const v24, -0x40b33333    # -0.8f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x41c7ae14    # -0.18f

    .line 103
    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, -0x4123d70a    # -0.43f

    .line 108
    .line 109
    .line 110
    const v23, -0x428a3d71    # -0.06f

    .line 111
    .line 112
    .line 113
    const v24, -0x40a8f5c3    # -0.84f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, -0x406f5c29    # -1.13f

    .line 120
    .line 121
    .line 122
    const v6, 0x3fbeb852    # 1.49f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x405d70a4    # -1.27f

    .line 129
    .line 130
    .line 131
    const v6, -0x40c51eb8    # -0.73f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x40228f5c    # -1.73f

    .line 138
    .line 139
    .line 140
    const v6, 0x3f3ae148    # 0.73f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, -0x3ff7ae14    # -2.13f

    .line 147
    .line 148
    .line 149
    const v21, -0x40f0a3d7    # -0.56f

    .line 150
    .line 151
    .line 152
    const v22, -0x40e66666    # -0.6f

    .line 153
    .line 154
    .line 155
    const v23, -0x4059999a    # -1.3f

    .line 156
    .line 157
    .line 158
    const v24, -0x407ae148    # -1.04f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x412bae14    # 10.73f

    .line 165
    .line 166
    .line 167
    const/high16 v6, 0x41000000    # 8.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x411451ec    # 9.27f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x41107ae1    # 9.03f

    .line 179
    .line 180
    .line 181
    const v6, 0x411dc28f    # 9.86f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v26, 0x3f9d70a4    # 1.23f

    .line 188
    .line 189
    .line 190
    const v21, -0x40ab851f    # -0.83f

    .line 191
    .line 192
    .line 193
    const v22, 0x3e428f5c    # 0.19f

    .line 194
    .line 195
    .line 196
    const v23, -0x40370a3d    # -1.57f

    .line 197
    .line 198
    .line 199
    const v24, 0x3f2147ae    # 0.63f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, -0x40228f5c    # -1.73f

    .line 206
    .line 207
    .line 208
    const v6, -0x40c51eb8    # -0.73f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x3fa28f5c    # 1.27f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x3f90a3d7    # 1.13f

    .line 221
    .line 222
    .line 223
    const v6, 0x3fbeb852    # 1.49f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v25, -0x41c7ae14    # -0.18f

    .line 230
    .line 231
    .line 232
    const v21, -0x420a3d71    # -0.12f

    .line 233
    .line 234
    .line 235
    const v22, 0x3ec7ae14    # 0.39f

    .line 236
    .line 237
    .line 238
    const v23, -0x41c7ae14    # -0.18f

    .line 239
    .line 240
    .line 241
    const v24, 0x3f4ccccd    # 0.8f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, 0x3e3851ec    # 0.18f

    .line 248
    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const v22, 0x3edc28f6    # 0.43f

    .line 253
    .line 254
    .line 255
    const v23, 0x3d75c28f    # 0.06f

    .line 256
    .line 257
    .line 258
    const v24, 0x3f570a3d    # 0.84f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, -0x404147ae    # -1.49f

    .line 265
    .line 266
    .line 267
    const v6, 0x3f90a3d7    # 1.13f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x3fa28f5c    # 1.27f

    .line 274
    .line 275
    .line 276
    const v6, 0x3f3ae148    # 0.73f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, 0x3fdd70a4    # 1.73f

    .line 283
    .line 284
    .line 285
    const v6, -0x40c51eb8    # -0.73f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, 0x400851ec    # 2.13f

    .line 292
    .line 293
    .line 294
    const v21, 0x3f0f5c29    # 0.56f

    .line 295
    .line 296
    .line 297
    const v22, 0x3f19999a    # 0.6f

    .line 298
    .line 299
    .line 300
    const v23, 0x3fa66666    # 1.3f

    .line 301
    .line 302
    .line 303
    const v24, 0x3f851eb8    # 1.04f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x41a00000    # 20.0f

    .line 310
    .line 311
    const v6, 0x411451ec    # 9.27f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x3fbc28f6    # 1.47f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v4, 0x3e6b851f    # 0.23f

    .line 324
    .line 325
    .line 326
    const v6, -0x4011eb85    # -1.86f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v26, -0x40628f5c    # -1.23f

    .line 333
    .line 334
    .line 335
    const v21, 0x3f547ae1    # 0.83f

    .line 336
    .line 337
    .line 338
    const v22, -0x41bd70a4    # -0.19f

    .line 339
    .line 340
    .line 341
    const v23, 0x3fc8f5c3    # 1.57f

    .line 342
    .line 343
    .line 344
    const v24, -0x40deb852    # -0.63f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, 0x3fdd70a4    # 1.73f

    .line 351
    .line 352
    .line 353
    const v6, 0x3f3ae148    # 0.73f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, -0x405d70a4    # -1.27f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x41611eb8    # 14.07f

    .line 366
    .line 367
    .line 368
    const v6, 0x4173ae14    # 15.23f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v4, 0x41880000    # 17.0f

    .line 378
    .line 379
    const/high16 v6, 0x41200000    # 10.0f

    .line 380
    .line 381
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 385
    .line 386
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 387
    .line 388
    const v21, -0x402b851f    # -1.66f

    .line 389
    .line 390
    .line 391
    const/16 v22, 0x0

    .line 392
    .line 393
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 394
    .line 395
    const v24, -0x40547ae1    # -1.34f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 402
    .line 403
    const v6, 0x3fab851f    # 1.34f

    .line 404
    .line 405
    .line 406
    const/high16 v7, 0x40400000    # 3.0f

    .line 407
    .line 408
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, 0x3fab851f    # 1.34f

    .line 412
    .line 413
    .line 414
    const/high16 v6, 0x40400000    # 3.0f

    .line 415
    .line 416
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, 0x413a8f5c    # 11.66f

    .line 420
    .line 421
    .line 422
    const/high16 v6, 0x41880000    # 17.0f

    .line 423
    .line 424
    const/high16 v7, 0x41200000    # 10.0f

    .line 425
    .line 426
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/16 v16, 0x3800

    .line 437
    .line 438
    const/16 v17, 0x0

    .line 439
    .line 440
    const v6, 0x3e99999a    # 0.3f

    .line 441
    .line 442
    .line 443
    const v8, 0x3e99999a    # 0.3f

    .line 444
    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    const/high16 v9, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/high16 v12, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v13, 0x0

    .line 452
    const/4 v14, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    const-string v4, ""

    .line 455
    .line 456
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 464
    .line 465
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 466
    .line 467
    .line 468
    move-result-wide v6

    .line 469
    const/4 v0, 0x0

    .line 470
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41500000    # 13.0f

    .line 487
    .line 488
    const/high16 v2, 0x41200000    # 10.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v18, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const v13, 0x3f0ccccd    # 0.55f

    .line 498
    .line 499
    .line 500
    const/high16 v15, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const v16, 0x3ee66666    # 0.45f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/high16 v2, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v4, -0x40800000    # -1.0f

    .line 513
    .line 514
    const v6, -0x4119999a    # -0.45f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v0, -0x4119999a    # -0.45f

    .line 521
    .line 522
    .line 523
    const/high16 v2, -0x40800000    # -1.0f

    .line 524
    .line 525
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x41173333    # 9.45f

    .line 529
    .line 530
    .line 531
    const/high16 v2, 0x41500000    # 13.0f

    .line 532
    .line 533
    const/high16 v4, 0x41200000    # 10.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x41300000    # 11.0f

    .line 539
    .line 540
    const/high16 v2, 0x41200000    # 10.0f

    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 546
    .line 547
    const/high16 v18, 0x40400000    # 3.0f

    .line 548
    .line 549
    const v13, -0x402b851f    # -1.66f

    .line 550
    .line 551
    .line 552
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 553
    .line 554
    const v16, 0x3fab851f    # 1.34f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3fab851f    # 1.34f

    .line 561
    .line 562
    .line 563
    const/high16 v2, 0x40400000    # 3.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, -0x40547ae1    # -1.34f

    .line 569
    .line 570
    .line 571
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 572
    .line 573
    const/high16 v4, 0x40400000    # 3.0f

    .line 574
    .line 575
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x413a8f5c    # 11.66f

    .line 579
    .line 580
    .line 581
    const/high16 v2, 0x41300000    # 11.0f

    .line 582
    .line 583
    const/high16 v4, 0x41200000    # 10.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41300000    # 11.0f

    .line 589
    .line 590
    const/high16 v2, 0x41200000    # 10.0f

    .line 591
    .line 592
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x41100000    # 9.0f

    .line 599
    .line 600
    const/high16 v2, 0x41940000    # 18.5f

    .line 601
    .line 602
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3f8b851f    # 1.09f

    .line 606
    .line 607
    .line 608
    const v2, -0x3fe5c28f    # -2.41f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41b00000    # 22.0f

    .line 615
    .line 616
    const/high16 v2, 0x40b00000    # 5.5f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, -0x40747ae1    # -1.09f

    .line 622
    .line 623
    .line 624
    const v2, -0x3fe5c28f    # -2.41f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x40000000    # 2.0f

    .line 631
    .line 632
    const/high16 v2, 0x41940000    # 18.5f

    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, -0x40747ae1    # -1.09f

    .line 638
    .line 639
    .line 640
    const v2, 0x401a3d71    # 2.41f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x41700000    # 15.0f

    .line 647
    .line 648
    const/high16 v2, 0x40b00000    # 5.5f

    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x401a3d71    # 2.41f

    .line 654
    .line 655
    .line 656
    const v2, 0x3f8b851f    # 1.09f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x41100000    # 9.0f

    .line 663
    .line 664
    const/high16 v2, 0x41940000    # 18.5f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, 0x41aa3d71    # 21.28f

    .line 673
    .line 674
    .line 675
    const v2, 0x414b851f    # 12.72f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x41a40000    # 20.5f

    .line 682
    .line 683
    const/high16 v2, 0x41300000    # 11.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, -0x40b851ec    # -0.78f

    .line 689
    .line 690
    .line 691
    const v2, 0x3fdc28f6    # 1.72f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x41900000    # 18.0f

    .line 698
    .line 699
    const/high16 v2, 0x41580000    # 13.5f

    .line 700
    .line 701
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, 0x3fdc28f6    # 1.72f

    .line 705
    .line 706
    .line 707
    const v2, 0x3f47ae14    # 0.78f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x41a40000    # 20.5f

    .line 714
    .line 715
    const/high16 v2, 0x41800000    # 16.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, 0x3f47ae14    # 0.78f

    .line 721
    .line 722
    .line 723
    const v2, -0x4023d70a    # -1.72f

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, 0x41b80000    # 23.0f

    .line 730
    .line 731
    const/high16 v2, 0x41580000    # 13.5f

    .line 732
    .line 733
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x41aa3d71    # 21.28f

    .line 737
    .line 738
    .line 739
    const v2, 0x414b851f    # 12.72f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x41820000    # 16.25f

    .line 749
    .line 750
    const/high16 v2, 0x41600000    # 14.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v17, -0x43dc28f6    # -0.01f

    .line 756
    .line 757
    .line 758
    const v18, -0x41428f5c    # -0.37f

    .line 759
    .line 760
    .line 761
    const/4 v13, 0x0

    .line 762
    const v14, -0x420a3d71    # -0.12f

    .line 763
    .line 764
    .line 765
    const/4 v15, 0x0

    .line 766
    const/high16 v16, -0x41800000    # -0.25f

    .line 767
    .line 768
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, 0x3ff851ec    # 1.94f

    .line 772
    .line 773
    .line 774
    const v2, -0x4043d70a    # -1.47f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 781
    .line 782
    const v2, -0x3f7570a4    # -4.33f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, -0x3ff0a3d7    # -2.24f

    .line 789
    .line 790
    .line 791
    const v2, 0x3f70a3d7    # 0.94f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, -0x40dc28f6    # -0.64f

    .line 798
    .line 799
    .line 800
    const v13, -0x41b33333    # -0.2f

    .line 801
    .line 802
    .line 803
    const v14, -0x41fae148    # -0.13f

    .line 804
    .line 805
    .line 806
    const v15, -0x4128f5c3    # -0.42f

    .line 807
    .line 808
    .line 809
    const v16, -0x417ae148    # -0.26f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x41480000    # 12.5f

    .line 816
    .line 817
    const/high16 v2, 0x40c00000    # 6.0f

    .line 818
    .line 819
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v0, -0x3f600000    # -5.0f

    .line 823
    .line 824
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v0, 0x40e66666    # 7.2f

    .line 828
    .line 829
    .line 830
    const v2, 0x41068f5c    # 8.41f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v17, 0x40d1eb85    # 6.56f

    .line 837
    .line 838
    .line 839
    const v18, 0x410c7ae1    # 8.78f

    .line 840
    .line 841
    .line 842
    const v13, 0x40df5c29    # 6.98f

    .line 843
    .line 844
    .line 845
    const v14, 0x410851ec    # 8.52f

    .line 846
    .line 847
    .line 848
    const v15, 0x40d8a3d7    # 6.77f

    .line 849
    .line 850
    .line 851
    const v16, 0x410a6666    # 8.65f

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v0, 0x408a3d71    # 4.32f

    .line 858
    .line 859
    .line 860
    const v2, 0x40fa8f5c    # 7.83f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 867
    .line 868
    const v2, 0x408a8f5c    # 4.33f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v0, 0x3ff851ec    # 1.94f

    .line 875
    .line 876
    .line 877
    const v2, 0x3fbc28f6    # 1.47f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v17, 0x40700000    # 3.75f

    .line 884
    .line 885
    const/high16 v18, 0x41600000    # 14.0f

    .line 886
    .line 887
    const/high16 v13, 0x40700000    # 3.75f

    .line 888
    .line 889
    const/high16 v14, 0x415c0000    # 13.75f

    .line 890
    .line 891
    const/high16 v15, 0x40700000    # 3.75f

    .line 892
    .line 893
    const v16, 0x415e147b    # 13.88f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v0, 0x3c23d70a    # 0.01f

    .line 900
    .line 901
    .line 902
    const v2, 0x3ebd70a4    # 0.37f

    .line 903
    .line 904
    .line 905
    const/4 v4, 0x0

    .line 906
    const/high16 v6, 0x3e800000    # 0.25f

    .line 907
    .line 908
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v0, -0x4007ae14    # -1.94f

    .line 912
    .line 913
    .line 914
    const v2, 0x3fbc28f6    # 1.47f

    .line 915
    .line 916
    .line 917
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/high16 v0, 0x40200000    # 2.5f

    .line 921
    .line 922
    const v2, 0x408a8f5c    # 4.33f

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, 0x400f5c29    # 2.24f

    .line 929
    .line 930
    .line 931
    const v2, -0x408f5c29    # -0.94f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, 0x3f23d70a    # 0.64f

    .line 938
    .line 939
    .line 940
    const v18, 0x3ebd70a4    # 0.37f

    .line 941
    .line 942
    .line 943
    const v13, 0x3e4ccccd    # 0.2f

    .line 944
    .line 945
    .line 946
    const v14, 0x3e051eb8    # 0.13f

    .line 947
    .line 948
    .line 949
    const v15, 0x3ed70a3d    # 0.42f

    .line 950
    .line 951
    .line 952
    const v16, 0x3e851eb8    # 0.26f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const/high16 v0, 0x40f00000    # 7.5f

    .line 959
    .line 960
    const/high16 v2, 0x41b00000    # 22.0f

    .line 961
    .line 962
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/high16 v0, 0x40a00000    # 5.0f

    .line 966
    .line 967
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v0, 0x3e99999a    # 0.3f

    .line 971
    .line 972
    .line 973
    const v2, -0x3fe5c28f    # -2.41f

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const v18, -0x41428f5c    # -0.37f

    .line 980
    .line 981
    .line 982
    const v13, 0x3e6147ae    # 0.22f

    .line 983
    .line 984
    .line 985
    const v14, -0x421eb852    # -0.11f

    .line 986
    .line 987
    .line 988
    const v15, 0x3edc28f6    # 0.43f

    .line 989
    .line 990
    .line 991
    const v16, -0x41947ae1    # -0.23f

    .line 992
    .line 993
    .line 994
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v0, 0x400f5c29    # 2.24f

    .line 998
    .line 999
    .line 1000
    const v2, 0x3f70a3d7    # 0.94f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const/high16 v0, 0x40200000    # 2.5f

    .line 1007
    .line 1008
    const v2, -0x3f7570a4    # -4.33f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v0, -0x4007ae14    # -1.94f

    .line 1015
    .line 1016
    .line 1017
    const v2, -0x4043d70a    # -1.47f

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const/high16 v17, 0x41820000    # 16.25f

    .line 1024
    .line 1025
    const/high16 v18, 0x41600000    # 14.0f

    .line 1026
    .line 1027
    const/high16 v13, 0x41820000    # 16.25f

    .line 1028
    .line 1029
    const/high16 v14, 0x41640000    # 14.25f

    .line 1030
    .line 1031
    const/high16 v15, 0x41820000    # 16.25f

    .line 1032
    .line 1033
    const v16, 0x4161eb85    # 14.12f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const v0, 0x416d47ae    # 14.83f

    .line 1043
    .line 1044
    .line 1045
    const v2, 0x418d1eb8    # 17.64f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v0, -0x40228f5c    # -1.73f

    .line 1052
    .line 1053
    .line 1054
    const v2, -0x40c51eb8    # -0.73f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v17, -0x3ff7ae14    # -2.13f

    .line 1061
    .line 1062
    .line 1063
    const v18, 0x3f9d70a4    # 1.23f

    .line 1064
    .line 1065
    .line 1066
    const v13, -0x40f0a3d7    # -0.56f

    .line 1067
    .line 1068
    .line 1069
    const v14, 0x3f19999a    # 0.6f

    .line 1070
    .line 1071
    .line 1072
    const v15, -0x4059999a    # -1.3f

    .line 1073
    .line 1074
    .line 1075
    const v16, 0x3f851eb8    # 1.04f

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v0, 0x412bae14    # 10.73f

    .line 1082
    .line 1083
    .line 1084
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1085
    .line 1086
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const v0, 0x411451ec    # 9.27f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v0, -0x41947ae1    # -0.23f

    .line 1096
    .line 1097
    .line 1098
    const v2, -0x4011eb85    # -1.86f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const v18, -0x40628f5c    # -1.23f

    .line 1105
    .line 1106
    .line 1107
    const v13, -0x40ab851f    # -0.83f

    .line 1108
    .line 1109
    .line 1110
    const v14, -0x41bd70a4    # -0.19f

    .line 1111
    .line 1112
    .line 1113
    const v15, -0x40370a3d    # -1.57f

    .line 1114
    .line 1115
    .line 1116
    const v16, -0x40deb852    # -0.63f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const v0, -0x40228f5c    # -1.73f

    .line 1123
    .line 1124
    .line 1125
    const v2, 0x3f3ae148    # 0.73f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v0, -0x405d70a4    # -1.27f

    .line 1132
    .line 1133
    .line 1134
    const v2, -0x40c51eb8    # -0.73f

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    .line 1140
    const v0, -0x406f5c29    # -1.13f

    .line 1141
    .line 1142
    .line 1143
    const v2, 0x3fbeb852    # 1.49f

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const v17, -0x41c7ae14    # -0.18f

    .line 1150
    .line 1151
    .line 1152
    const v13, -0x420a3d71    # -0.12f

    .line 1153
    .line 1154
    .line 1155
    const v14, -0x413851ec    # -0.39f

    .line 1156
    .line 1157
    .line 1158
    const v15, -0x41c7ae14    # -0.18f

    .line 1159
    .line 1160
    .line 1161
    const v16, -0x40b33333    # -0.8f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    const v17, 0x3e3851ec    # 0.18f

    .line 1168
    .line 1169
    .line 1170
    const/4 v13, 0x0

    .line 1171
    const v14, -0x4123d70a    # -0.43f

    .line 1172
    .line 1173
    .line 1174
    const v15, 0x3d75c28f    # 0.06f

    .line 1175
    .line 1176
    .line 1177
    const v16, -0x40a8f5c3    # -0.84f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v0, -0x404147ae    # -1.49f

    .line 1184
    .line 1185
    .line 1186
    const v2, -0x406f5c29    # -1.13f

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1190
    .line 1191
    .line 1192
    const v0, -0x405d70a4    # -1.27f

    .line 1193
    .line 1194
    .line 1195
    const v2, 0x3f3ae148    # 0.73f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    const v0, 0x3fdd70a4    # 1.73f

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    const v17, 0x400851ec    # 2.13f

    .line 1208
    .line 1209
    .line 1210
    const v13, 0x3f0f5c29    # 0.56f

    .line 1211
    .line 1212
    .line 1213
    const v14, -0x40e66666    # -0.6f

    .line 1214
    .line 1215
    .line 1216
    const v15, 0x3fa66666    # 1.3f

    .line 1217
    .line 1218
    .line 1219
    const v16, -0x407ae148    # -1.04f

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1223
    .line 1224
    .line 1225
    const/high16 v0, 0x41000000    # 8.0f

    .line 1226
    .line 1227
    const v2, 0x411451ec    # 9.27f

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    const v0, 0x3fbc28f6    # 1.47f

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    const v0, 0x3e6b851f    # 0.23f

    .line 1240
    .line 1241
    .line 1242
    const v2, 0x3fee147b    # 1.86f

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v18, 0x3f9d70a4    # 1.23f

    .line 1249
    .line 1250
    .line 1251
    const v13, 0x3f547ae1    # 0.83f

    .line 1252
    .line 1253
    .line 1254
    const v14, 0x3e428f5c    # 0.19f

    .line 1255
    .line 1256
    .line 1257
    const v15, 0x3fc8f5c3    # 1.57f

    .line 1258
    .line 1259
    .line 1260
    const v16, 0x3f2147ae    # 0.63f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const v0, 0x3fdd70a4    # 1.73f

    .line 1267
    .line 1268
    .line 1269
    const v2, -0x40c51eb8    # -0.73f

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1273
    .line 1274
    .line 1275
    const v0, 0x3fa28f5c    # 1.27f

    .line 1276
    .line 1277
    .line 1278
    const v2, 0x3f3ae148    # 0.73f

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1282
    .line 1283
    .line 1284
    const v0, -0x404147ae    # -1.49f

    .line 1285
    .line 1286
    .line 1287
    const v2, 0x3f90a3d7    # 1.13f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, 0x3e3851ec    # 0.18f

    .line 1294
    .line 1295
    .line 1296
    const v13, 0x3df5c28f    # 0.12f

    .line 1297
    .line 1298
    .line 1299
    const v14, 0x3ec7ae14    # 0.39f

    .line 1300
    .line 1301
    .line 1302
    const v15, 0x3e3851ec    # 0.18f

    .line 1303
    .line 1304
    .line 1305
    const v16, 0x3f4ccccd    # 0.8f

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1309
    .line 1310
    .line 1311
    const v17, -0x41c7ae14    # -0.18f

    .line 1312
    .line 1313
    .line 1314
    const/4 v13, 0x0

    .line 1315
    const v14, 0x3edc28f6    # 0.43f

    .line 1316
    .line 1317
    .line 1318
    const v15, -0x428a3d71    # -0.06f

    .line 1319
    .line 1320
    .line 1321
    const v16, 0x3f570a3d    # 0.84f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v0, 0x3f90a3d7    # 1.13f

    .line 1328
    .line 1329
    .line 1330
    const v2, 0x3fbeb852    # 1.49f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1334
    .line 1335
    .line 1336
    const v0, 0x416d47ae    # 14.83f

    .line 1337
    .line 1338
    .line 1339
    const v2, 0x418d1eb8    # 17.64f

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v2

    .line 1352
    const/16 v16, 0x3800

    .line 1353
    .line 1354
    const/16 v17, 0x0

    .line 1355
    .line 1356
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1357
    .line 1358
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1359
    .line 1360
    const/4 v7, 0x0

    .line 1361
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1362
    .line 1363
    const/4 v14, 0x0

    .line 1364
    const/4 v15, 0x0

    .line 1365
    const-string v4, ""

    .line 1366
    .line 1367
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    sput-object v0, Landroidx/compose/material/icons/twotone/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1376
    .line 1377
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1378
    .line 1379
    .line 1380
    return-object v0
.end method

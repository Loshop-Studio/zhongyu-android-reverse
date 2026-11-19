.class public final Landroidx/compose/material/icons/outlined/ManageAccountsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getManageAccounts(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ManageAccounts"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x40d9999a    # -0.65f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x3ed1eb85    # 0.41f

    .line 84
    .line 85
    .line 86
    const v26, -0x40b0a3d7    # -0.81f

    .line 87
    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const v22, -0x4151eb85    # -0.34f

    .line 92
    .line 93
    .line 94
    const v23, 0x3e23d70a    # 0.16f

    .line 95
    .line 96
    .line 97
    const v24, -0x40d70a3d    # -0.66f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x41200000    # 10.0f

    .line 106
    .line 107
    const/high16 v26, 0x41700000    # 15.0f

    .line 108
    .line 109
    const v21, 0x40c33333    # 6.1f

    .line 110
    .line 111
    .line 112
    const v22, 0x41787ae1    # 15.53f

    .line 113
    .line 114
    .line 115
    const v23, 0x41007ae1    # 8.03f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x41700000    # 15.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, 0x3da3d70a    # 0.08f

    .line 124
    .line 125
    .line 126
    const v26, 0x3c23d70a    # 0.01f

    .line 127
    .line 128
    .line 129
    const v21, 0x3cf5c28f    # 0.03f

    .line 130
    .line 131
    .line 132
    const/16 v22, 0x0

    .line 133
    .line 134
    const v23, 0x3d4ccccd    # 0.05f

    .line 135
    .line 136
    .line 137
    const/16 v24, 0x0

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, 0x3f170a3d    # 0.59f

    .line 143
    .line 144
    .line 145
    const v26, -0x40028f5c    # -1.98f

    .line 146
    .line 147
    .line 148
    const v21, 0x3dcccccd    # 0.1f

    .line 149
    .line 150
    .line 151
    const v22, -0x40cccccd    # -0.7f

    .line 152
    .line 153
    .line 154
    const v23, 0x3e99999a    # 0.3f

    .line 155
    .line 156
    .line 157
    const v24, -0x4050a3d7    # -1.37f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, 0x41200000    # 10.0f

    .line 164
    .line 165
    const/high16 v26, 0x41500000    # 13.0f

    .line 166
    .line 167
    const v21, 0x41273333    # 10.45f

    .line 168
    .line 169
    .line 170
    const v22, 0x415028f6    # 13.01f

    .line 171
    .line 172
    .line 173
    const v23, 0x4123ae14    # 10.23f

    .line 174
    .line 175
    .line 176
    const/high16 v24, 0x41500000    # 13.0f

    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x3f2c7ae1    # -6.61f

    .line 182
    .line 183
    .line 184
    const v26, 0x3fe8f5c3    # 1.82f

    .line 185
    .line 186
    .line 187
    const v21, -0x3fe51eb8    # -2.42f

    .line 188
    .line 189
    .line 190
    const/16 v22, 0x0

    .line 191
    .line 192
    const v23, -0x3f6a3d71    # -4.68f

    .line 193
    .line 194
    .line 195
    const v24, 0x3f2b851f    # 0.67f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, 0x40000000    # 2.0f

    .line 202
    .line 203
    const v26, 0x418acccd    # 17.35f

    .line 204
    .line 205
    .line 206
    const v21, 0x4020a3d7    # 2.51f

    .line 207
    .line 208
    .line 209
    const v22, 0x417570a4    # 15.34f

    .line 210
    .line 211
    .line 212
    const/high16 v23, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v24, 0x41828f5c    # 16.32f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41a00000    # 20.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x411428f6    # 9.26f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, -0x4087ae14    # -0.97f

    .line 232
    .line 233
    .line 234
    const/high16 v26, -0x40000000    # -2.0f

    .line 235
    .line 236
    const v21, -0x4128f5c3    # -0.42f

    .line 237
    .line 238
    .line 239
    const v22, -0x40e66666    # -0.6f

    .line 240
    .line 241
    .line 242
    const/high16 v23, -0x40c00000    # -0.75f

    .line 243
    .line 244
    const v24, -0x405c28f6    # -1.28f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x40800000    # 4.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const/16 v16, 0x3800

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/high16 v6, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/high16 v8, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const/high16 v9, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/high16 v12, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const/4 v14, 0x0

    .line 277
    const/4 v15, 0x0

    .line 278
    const-string v4, ""

    .line 279
    .line 280
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 281
    .line 282
    .line 283
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 288
    .line 289
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 290
    .line 291
    .line 292
    move-result-wide v6

    .line 293
    const/4 v2, 0x0

    .line 294
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41400000    # 12.0f

    .line 311
    .line 312
    const/high16 v6, 0x41200000    # 10.0f

    .line 313
    .line 314
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v25, 0x40800000    # 4.0f

    .line 318
    .line 319
    const/high16 v26, -0x3f800000    # -4.0f

    .line 320
    .line 321
    const v21, 0x400d70a4    # 2.21f

    .line 322
    .line 323
    .line 324
    const/16 v22, 0x0

    .line 325
    .line 326
    const/high16 v23, 0x40800000    # 4.0f

    .line 327
    .line 328
    const v24, -0x401ae148    # -1.79f

    .line 329
    .line 330
    .line 331
    move-object/from16 v20, v2

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, -0x401ae148    # -1.79f

    .line 337
    .line 338
    .line 339
    const/high16 v6, -0x3f800000    # -4.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v25, 0x40c00000    # 6.0f

    .line 345
    .line 346
    const/high16 v26, 0x41000000    # 8.0f

    .line 347
    .line 348
    const v21, 0x40f947ae    # 7.79f

    .line 349
    .line 350
    .line 351
    const/high16 v22, 0x40800000    # 4.0f

    .line 352
    .line 353
    const/high16 v23, 0x40c00000    # 6.0f

    .line 354
    .line 355
    const v24, 0x40b947ae    # 5.79f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, 0x40f947ae    # 7.79f

    .line 362
    .line 363
    .line 364
    const/high16 v6, 0x41400000    # 12.0f

    .line 365
    .line 366
    const/high16 v7, 0x41200000    # 10.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x40c00000    # 6.0f

    .line 375
    .line 376
    const/high16 v6, 0x41200000    # 10.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/high16 v26, 0x40000000    # 2.0f

    .line 384
    .line 385
    const v21, 0x3f8ccccd    # 1.1f

    .line 386
    .line 387
    .line 388
    const/16 v22, 0x0

    .line 389
    .line 390
    const/high16 v23, 0x40000000    # 2.0f

    .line 391
    .line 392
    const v24, 0x3f666666    # 0.9f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, -0x4099999a    # -0.9f

    .line 399
    .line 400
    .line 401
    const/high16 v6, -0x40000000    # -2.0f

    .line 402
    .line 403
    const/high16 v7, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v25, -0x40000000    # -2.0f

    .line 409
    .line 410
    const/high16 v26, -0x40000000    # -2.0f

    .line 411
    .line 412
    const v21, -0x40733333    # -1.1f

    .line 413
    .line 414
    .line 415
    const/high16 v23, -0x40000000    # -2.0f

    .line 416
    .line 417
    const v24, -0x4099999a    # -0.9f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, 0x410e6666    # 8.9f

    .line 424
    .line 425
    .line 426
    const/high16 v6, 0x40c00000    # 6.0f

    .line 427
    .line 428
    const/high16 v7, 0x41200000    # 10.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    const/high16 v6, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/4 v7, 0x0

    .line 443
    const-string v4, ""

    .line 444
    .line 445
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 446
    .line 447
    .line 448
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 453
    .line 454
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 455
    .line 456
    .line 457
    move-result-wide v6

    .line 458
    const/4 v0, 0x0

    .line 459
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41a60000    # 20.75f

    .line 476
    .line 477
    const/high16 v2, 0x41800000    # 16.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x428a3d71    # -0.06f

    .line 483
    .line 484
    .line 485
    const v18, -0x40deb852    # -0.63f

    .line 486
    .line 487
    .line 488
    const v14, -0x419eb852    # -0.22f

    .line 489
    .line 490
    .line 491
    const v15, -0x430a3d71    # -0.03f

    .line 492
    .line 493
    .line 494
    const v16, -0x4128f5c3    # -0.42f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, -0x407eb852    # -1.01f

    .line 501
    .line 502
    .line 503
    const v2, 0x3f91eb85    # 1.14f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x40228f5c    # -1.73f

    .line 510
    .line 511
    .line 512
    const/high16 v2, -0x40800000    # -1.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3efae148    # 0.49f

    .line 518
    .line 519
    .line 520
    const v2, -0x40466666    # -1.45f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, -0x4075c28f    # -1.08f

    .line 527
    .line 528
    .line 529
    const v13, -0x415c28f6    # -0.32f

    .line 530
    .line 531
    .line 532
    const v14, -0x4175c28f    # -0.27f

    .line 533
    .line 534
    .line 535
    const v15, -0x40d1eb85    # -0.68f

    .line 536
    .line 537
    .line 538
    const v16, -0x410a3d71    # -0.48f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, 0x41300000    # 11.0f

    .line 545
    .line 546
    const/high16 v2, 0x41900000    # 18.0f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, -0x40000000    # -2.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, -0x41666666    # -0.3f

    .line 557
    .line 558
    .line 559
    const v2, 0x3fbeb852    # 1.49f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v18, 0x3f2147ae    # 0.63f

    .line 566
    .line 567
    .line 568
    const v13, -0x41333333    # -0.4f

    .line 569
    .line 570
    .line 571
    const v14, 0x3e19999a    # 0.15f

    .line 572
    .line 573
    .line 574
    const v15, -0x40bd70a4    # -0.76f

    .line 575
    .line 576
    .line 577
    const v16, 0x3eb851ec    # 0.36f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, -0x41051eb8    # -0.49f

    .line 584
    .line 585
    .line 586
    const v2, -0x40466666    # -1.45f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x3fdd70a4    # 1.73f

    .line 593
    .line 594
    .line 595
    const/high16 v2, -0x40800000    # -1.0f

    .line 596
    .line 597
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x3f8147ae    # 1.01f

    .line 601
    .line 602
    .line 603
    const v2, 0x3f91eb85    # 1.14f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, -0x428a3d71    # -0.06f

    .line 610
    .line 611
    .line 612
    const v13, -0x430a3d71    # -0.03f

    .line 613
    .line 614
    .line 615
    const v14, 0x3e570a3d    # 0.21f

    .line 616
    .line 617
    .line 618
    const v15, -0x428a3d71    # -0.06f

    .line 619
    .line 620
    .line 621
    const v16, 0x3ed1eb85    # 0.41f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x3d75c28f    # 0.06f

    .line 628
    .line 629
    .line 630
    const v2, 0x3f2147ae    # 0.63f

    .line 631
    .line 632
    .line 633
    const v4, 0x3cf5c28f    # 0.03f

    .line 634
    .line 635
    .line 636
    const v6, 0x3ed70a3d    # 0.42f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, -0x406e147b    # -1.14f

    .line 643
    .line 644
    .line 645
    const v2, 0x3f8147ae    # 1.01f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const v2, 0x3fdd70a4    # 1.73f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x3fb9999a    # 1.45f

    .line 660
    .line 661
    .line 662
    const v2, -0x41051eb8    # -0.49f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, 0x3f8a3d71    # 1.08f

    .line 669
    .line 670
    .line 671
    const v13, 0x3ea3d70a    # 0.32f

    .line 672
    .line 673
    .line 674
    const v14, 0x3e8a3d71    # 0.27f

    .line 675
    .line 676
    .line 677
    const v15, 0x3f2e147b    # 0.68f

    .line 678
    .line 679
    .line 680
    const v16, 0x3ef5c28f    # 0.48f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x41a80000    # 21.0f

    .line 687
    .line 688
    const/high16 v2, 0x41800000    # 16.0f

    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v0, 0x40000000    # 2.0f

    .line 694
    .line 695
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x3e99999a    # 0.3f

    .line 699
    .line 700
    .line 701
    const v2, -0x404147ae    # -1.49f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v18, -0x40deb852    # -0.63f

    .line 708
    .line 709
    .line 710
    const v13, 0x3ecccccd    # 0.4f

    .line 711
    .line 712
    .line 713
    const v14, -0x41e66666    # -0.15f

    .line 714
    .line 715
    .line 716
    const v15, 0x3f428f5c    # 0.76f

    .line 717
    .line 718
    .line 719
    const v16, -0x4147ae14    # -0.36f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x3fb9999a    # 1.45f

    .line 726
    .line 727
    .line 728
    const v2, 0x3efae148    # 0.49f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const v2, -0x40228f5c    # -1.73f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, -0x406e147b    # -1.14f

    .line 743
    .line 744
    .line 745
    const v2, -0x407eb852    # -1.01f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, 0x41a60000    # 20.75f

    .line 752
    .line 753
    const/high16 v18, 0x41800000    # 16.0f

    .line 754
    .line 755
    const v13, 0x41a5c28f    # 20.72f

    .line 756
    .line 757
    .line 758
    const v14, 0x41835c29    # 16.42f

    .line 759
    .line 760
    .line 761
    const/high16 v15, 0x41a60000    # 20.75f

    .line 762
    .line 763
    const v16, 0x4181c28f    # 16.22f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v0, 0x41880000    # 17.0f

    .line 773
    .line 774
    const/high16 v2, 0x41900000    # 18.0f

    .line 775
    .line 776
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v17, -0x40000000    # -2.0f

    .line 780
    .line 781
    const/high16 v18, -0x40000000    # -2.0f

    .line 782
    .line 783
    const v13, -0x40733333    # -1.1f

    .line 784
    .line 785
    .line 786
    const/4 v14, 0x0

    .line 787
    const/high16 v15, -0x40000000    # -2.0f

    .line 788
    .line 789
    const v16, -0x4099999a    # -0.9f

    .line 790
    .line 791
    .line 792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v0, 0x3f666666    # 0.9f

    .line 796
    .line 797
    .line 798
    const/high16 v2, -0x40000000    # -2.0f

    .line 799
    .line 800
    const/high16 v4, 0x40000000    # 2.0f

    .line 801
    .line 802
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v2, 0x40000000    # 2.0f

    .line 806
    .line 807
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v0, 0x4190cccd    # 18.1f

    .line 811
    .line 812
    .line 813
    const/high16 v2, 0x41880000    # 17.0f

    .line 814
    .line 815
    const/high16 v4, 0x41900000    # 18.0f

    .line 816
    .line 817
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const/16 v16, 0x3800

    .line 828
    .line 829
    const/16 v17, 0x0

    .line 830
    .line 831
    const/high16 v6, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/4 v7, 0x0

    .line 834
    const/high16 v12, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v13, 0x0

    .line 837
    const/4 v15, 0x0

    .line 838
    const-string v4, ""

    .line 839
    .line 840
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    sput-object v0, Landroidx/compose/material/icons/outlined/ManageAccountsKt;->_manageAccounts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 849
    .line 850
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    return-object v0
.end method

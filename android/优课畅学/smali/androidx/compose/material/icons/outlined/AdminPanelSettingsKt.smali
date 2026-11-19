.class public final Landroidx/compose/material/icons/outlined/AdminPanelSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdminPanelSettings(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 29

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AdminPanelSettings"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 53
    .line 54
    .line 55
    sget-object v19, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v20, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v4, 0x41780000    # 15.5f

    .line 73
    .line 74
    const/high16 v6, 0x41880000    # 17.0f

    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x4070a3d7    # -1.12f

    .line 80
    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v27, 0x400f5c29    # 2.24f

    .line 87
    .line 88
    .line 89
    const/16 v28, 0x0

    .line 90
    .line 91
    const v22, 0x3f8f5c29    # 1.12f

    .line 92
    .line 93
    .line 94
    const v23, 0x3f8f5c29    # 1.12f

    .line 95
    .line 96
    .line 97
    const/16 v24, 0x0

    .line 98
    .line 99
    const/16 v25, 0x1

    .line 100
    .line 101
    const/16 v26, 0x1

    .line 102
    .line 103
    move-object/from16 v21, v2

    .line 104
    .line 105
    invoke-virtual/range {v21 .. v28}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v27, -0x3ff0a3d7    # -2.24f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v21 .. v28}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/16 v16, 0x3800

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/high16 v6, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v8, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/high16 v9, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const-string v4, ""

    .line 135
    .line 136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x418c0000    # 17.5f

    .line 167
    .line 168
    const/high16 v6, 0x41880000    # 17.0f

    .line 169
    .line 170
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v26, -0x3ff0a3d7    # -2.24f

    .line 174
    .line 175
    .line 176
    const v27, 0x3f8a3d71    # 1.08f

    .line 177
    .line 178
    .line 179
    const v22, -0x40c51eb8    # -0.73f

    .line 180
    .line 181
    .line 182
    const/16 v23, 0x0

    .line 183
    .line 184
    const v24, -0x3ff3d70a    # -2.19f

    .line 185
    .line 186
    .line 187
    const v25, 0x3eb851ec    # 0.36f

    .line 188
    .line 189
    .line 190
    move-object/from16 v21, v2

    .line 191
    .line 192
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v26, 0x400f5c29    # 2.24f

    .line 196
    .line 197
    .line 198
    const v27, 0x3f95c28f    # 1.17f

    .line 199
    .line 200
    .line 201
    const/high16 v22, 0x3f000000    # 0.5f

    .line 202
    .line 203
    const v23, 0x3f35c28f    # 0.71f

    .line 204
    .line 205
    .line 206
    const v24, 0x3fa8f5c3    # 1.32f

    .line 207
    .line 208
    .line 209
    const v25, 0x3f95c28f    # 1.17f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x400f5c29    # 2.24f

    .line 216
    .line 217
    .line 218
    const v6, -0x406a3d71    # -1.17f

    .line 219
    .line 220
    .line 221
    const v7, 0x3fdeb852    # 1.74f

    .line 222
    .line 223
    .line 224
    const v8, -0x41147ae1    # -0.46f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v26, 0x41880000    # 17.0f

    .line 231
    .line 232
    const/high16 v27, 0x418c0000    # 17.5f

    .line 233
    .line 234
    const v22, 0x4199851f    # 19.19f

    .line 235
    .line 236
    .line 237
    const v23, 0x418ee148    # 17.86f

    .line 238
    .line 239
    .line 240
    const v24, 0x418dd70a    # 17.73f

    .line 241
    .line 242
    .line 243
    const/high16 v25, 0x418c0000    # 17.5f

    .line 244
    .line 245
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    const/high16 v6, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/high16 v8, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v0, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41900000    # 18.0f

    .line 293
    .line 294
    const v2, 0x413170a4    # 11.09f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40c8a3d7    # 6.27f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41280000    # 10.5f

    .line 307
    .line 308
    const/high16 v2, 0x40400000    # 3.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x40400000    # 3.0f

    .line 314
    .line 315
    const v2, 0x40c8a3d7    # 6.27f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x409d1eb8    # 4.91f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x40f00000    # 7.5f

    .line 328
    .line 329
    const v18, 0x411d1eb8    # 9.82f

    .line 330
    .line 331
    .line 332
    const v14, 0x409147ae    # 4.54f

    .line 333
    .line 334
    .line 335
    const v15, 0x404ccccd    # 3.2f

    .line 336
    .line 337
    .line 338
    const v16, 0x410ca3d7    # 8.79f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3fcccccd    # 1.6f

    .line 345
    .line 346
    .line 347
    const v18, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v13, 0x3f0ccccd    # 0.55f

    .line 351
    .line 352
    .line 353
    const v14, -0x41fae148    # -0.13f

    .line 354
    .line 355
    .line 356
    const v15, 0x3f8a3d71    # 1.08f

    .line 357
    .line 358
    .line 359
    const v16, -0x415c28f6    # -0.32f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x41880000    # 17.0f

    .line 366
    .line 367
    const/high16 v18, 0x41b80000    # 23.0f

    .line 368
    .line 369
    const v13, 0x4152e148    # 13.18f

    .line 370
    .line 371
    .line 372
    const v14, 0x41afeb85    # 21.99f

    .line 373
    .line 374
    .line 375
    const v15, 0x416f851f    # 14.97f

    .line 376
    .line 377
    .line 378
    const/high16 v16, 0x41b80000    # 23.0f

    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v17, 0x40c00000    # 6.0f

    .line 384
    .line 385
    const/high16 v18, -0x3f400000    # -6.0f

    .line 386
    .line 387
    const v13, 0x4053d70a    # 3.31f

    .line 388
    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    const/high16 v15, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const v16, -0x3fd3d70a    # -2.69f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41900000    # 18.0f

    .line 400
    .line 401
    const v18, 0x413170a4    # 11.09f

    .line 402
    .line 403
    .line 404
    const/high16 v13, 0x41b80000    # 23.0f

    .line 405
    .line 406
    const v14, 0x41607ae1    # 14.03f

    .line 407
    .line 408
    .line 409
    const v15, 0x41a6b852    # 20.84f

    .line 410
    .line 411
    .line 412
    const v16, 0x41391eb8    # 11.57f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41300000    # 11.0f

    .line 422
    .line 423
    const/high16 v2, 0x41880000    # 17.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x3e6b851f    # 0.23f

    .line 429
    .line 430
    .line 431
    const v18, 0x3fcf5c29    # 1.62f

    .line 432
    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, 0x3f0f5c29    # 0.56f

    .line 436
    .line 437
    .line 438
    const v15, 0x3da3d70a    # 0.08f

    .line 439
    .line 440
    .line 441
    const v16, 0x3f8e147b    # 1.11f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x40c51eb8    # -0.73f

    .line 448
    .line 449
    .line 450
    const v18, 0x3e99999a    # 0.3f

    .line 451
    .line 452
    .line 453
    const v13, -0x418a3d71    # -0.24f

    .line 454
    .line 455
    .line 456
    const v14, 0x3de147ae    # 0.11f

    .line 457
    .line 458
    .line 459
    const v15, -0x410a3d71    # -0.48f

    .line 460
    .line 461
    .line 462
    const v16, 0x3e6147ae    # 0.22f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, -0x3f500000    # -5.5f

    .line 469
    .line 470
    const v18, -0x3f0851ec    # -7.74f

    .line 471
    .line 472
    .line 473
    const v13, -0x3fb51eb8    # -3.17f

    .line 474
    .line 475
    .line 476
    const/high16 v14, -0x40800000    # -1.0f

    .line 477
    .line 478
    const/high16 v15, -0x3f500000    # -5.5f

    .line 479
    .line 480
    const v16, -0x3f7851ec    # -4.24f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x3f99999a    # -3.6f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x3fe66666    # -2.4f

    .line 493
    .line 494
    .line 495
    const/high16 v2, 0x40b00000    # 5.5f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x4019999a    # 2.4f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4060a3d7    # 3.51f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x41300000    # 11.0f

    .line 513
    .line 514
    const/high16 v18, 0x41880000    # 17.0f

    .line 515
    .line 516
    const v13, 0x41528f5c    # 13.16f

    .line 517
    .line 518
    .line 519
    const v14, 0x41391eb8    # 11.57f

    .line 520
    .line 521
    .line 522
    const/high16 v15, 0x41300000    # 11.0f

    .line 523
    .line 524
    const v16, 0x41607ae1    # 14.03f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x41a80000    # 21.0f

    .line 534
    .line 535
    const/high16 v2, 0x41880000    # 17.0f

    .line 536
    .line 537
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, -0x3f800000    # -4.0f

    .line 541
    .line 542
    const/high16 v18, -0x3f800000    # -4.0f

    .line 543
    .line 544
    const v13, -0x3ff28f5c    # -2.21f

    .line 545
    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    const/high16 v15, -0x3f800000    # -4.0f

    .line 549
    .line 550
    const v16, -0x401ae148    # -1.79f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, 0x40800000    # 4.0f

    .line 557
    .line 558
    const/4 v13, 0x0

    .line 559
    const v14, -0x3ff28f5c    # -2.21f

    .line 560
    .line 561
    .line 562
    const v15, 0x3fe51eb8    # 1.79f

    .line 563
    .line 564
    .line 565
    const/high16 v16, -0x3f800000    # -4.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x3fe51eb8    # 1.79f

    .line 571
    .line 572
    .line 573
    const/high16 v2, 0x40800000    # 4.0f

    .line 574
    .line 575
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x41880000    # 17.0f

    .line 579
    .line 580
    const/high16 v18, 0x41a80000    # 21.0f

    .line 581
    .line 582
    const/high16 v13, 0x41a80000    # 21.0f

    .line 583
    .line 584
    const v14, 0x4199ae14    # 19.21f

    .line 585
    .line 586
    .line 587
    const v15, 0x4199ae14    # 19.21f

    .line 588
    .line 589
    .line 590
    const/high16 v16, 0x41a80000    # 21.0f

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/16 v16, 0x3800

    .line 603
    .line 604
    const/16 v17, 0x0

    .line 605
    .line 606
    const/high16 v6, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    const/high16 v12, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    const/4 v14, 0x0

    .line 613
    const/4 v15, 0x0

    .line 614
    const-string v4, ""

    .line 615
    .line 616
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    sput-object v0, Landroidx/compose/material/icons/outlined/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    return-object v0
.end method

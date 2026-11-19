.class public final Landroidx/compose/material/icons/twotone/ExtensionOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExtensionOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ExtensionOff"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x400ae148    # 2.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x410d47ae    # 8.83f

    .line 84
    .line 85
    .line 86
    const/high16 v6, 0x40c00000    # 6.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x41300000    # 11.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3f000000    # 0.5f

    .line 102
    .line 103
    const/high16 v26, -0x41000000    # -0.5f

    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, -0x4170a3d7    # -0.28f

    .line 108
    .line 109
    .line 110
    const v23, 0x3e6147ae    # 0.22f

    .line 111
    .line 112
    .line 113
    const/high16 v24, -0x41000000    # -0.5f

    .line 114
    .line 115
    move-object/from16 v20, v2

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x406e147b    # 3.72f

    .line 121
    .line 122
    .line 123
    const/high16 v6, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v7, 0x40800000    # 4.0f

    .line 126
    .line 127
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x40c00000    # 6.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v26, 0x3f000000    # 0.5f

    .line 149
    .line 150
    const v21, 0x3e8f5c29    # 0.28f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/high16 v23, 0x3f000000    # 0.5f

    .line 156
    .line 157
    const v24, 0x3e6147ae    # 0.22f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x41a23d71    # 20.28f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41a00000    # 20.0f

    .line 167
    .line 168
    const/high16 v7, 0x41500000    # 13.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41900000    # 18.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41000000    # 8.0f

    .line 182
    .line 183
    const/high16 v6, 0x41480000    # 12.5f

    .line 184
    .line 185
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 189
    .line 190
    const v26, 0x408bd70a    # 4.37f

    .line 191
    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 196
    .line 197
    const v23, -0x40ab851f    # -0.83f

    .line 198
    .line 199
    .line 200
    const v24, 0x40647ae1    # 3.57f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41980000    # 19.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x400851ec    # 2.13f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x408bd70a    # 4.37f

    .line 218
    .line 219
    .line 220
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 221
    .line 222
    const v21, 0x3f4ccccd    # 0.8f

    .line 223
    .line 224
    .line 225
    const v22, -0x3ff51eb8    # -2.17f

    .line 226
    .line 227
    .line 228
    const v23, 0x4037ae14    # 2.87f

    .line 229
    .line 230
    .line 231
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, 0x40100000    # 2.25f

    .line 237
    .line 238
    const v26, 0x3f147ae1    # 0.58f

    .line 239
    .line 240
    .line 241
    const v21, 0x3f30a3d7    # 0.69f

    .line 242
    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 247
    .line 248
    const v24, 0x3e3851ec    # 0.18f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, -0x3f3570a4    # -6.33f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41000000    # 8.0f

    .line 261
    .line 262
    const/high16 v26, 0x41480000    # 12.5f

    .line 263
    .line 264
    const v21, 0x40fa3d71    # 7.82f

    .line 265
    .line 266
    .line 267
    const/high16 v22, 0x41300000    # 11.0f

    .line 268
    .line 269
    const/high16 v23, 0x41000000    # 8.0f

    .line 270
    .line 271
    const v24, 0x413cf5c3    # 11.81f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/16 v16, 0x3800

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const v6, 0x3e99999a    # 0.3f

    .line 289
    .line 290
    .line 291
    const v8, 0x3e99999a    # 0.3f

    .line 292
    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/high16 v9, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v12, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    const-string v4, ""

    .line 303
    .line 304
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 312
    .line 313
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    const/4 v0, 0x0

    .line 318
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    const v0, 0x40870a3d    # 4.22f

    .line 335
    .line 336
    .line 337
    const v2, 0x3fb1eb85    # 1.39f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x3fcf5c29    # 1.62f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x43dc28f6    # -0.01f

    .line 350
    .line 351
    .line 352
    const v18, 0x3e23d70a    # 0.16f

    .line 353
    .line 354
    .line 355
    const v14, 0x3d4ccccd    # 0.05f

    .line 356
    .line 357
    .line 358
    const v15, -0x43dc28f6    # -0.01f

    .line 359
    .line 360
    .line 361
    const v16, 0x3dcccccd    # 0.1f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x40733333    # 3.8f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x40c00000    # 6.0f

    .line 374
    .line 375
    const/high16 v18, 0x41480000    # 12.5f

    .line 376
    .line 377
    const v13, 0x40b66666    # 5.7f

    .line 378
    .line 379
    .line 380
    const v14, 0x411ccccd    # 9.8f

    .line 381
    .line 382
    .line 383
    const/high16 v15, 0x40c00000    # 6.0f

    .line 384
    .line 385
    const v16, 0x413f5c29    # 11.96f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 392
    .line 393
    const v18, 0x402ccccd    # 2.7f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, 0x3f0a3d71    # 0.54f

    .line 398
    .line 399
    .line 400
    const v15, -0x416b851f    # -0.29f

    .line 401
    .line 402
    .line 403
    const v16, 0x402ccccd    # 2.7f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41980000    # 19.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/high16 v18, 0x40000000    # 2.0f

    .line 417
    .line 418
    const v14, 0x3f8ccccd    # 1.1f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f666666    # 0.9f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x40000000    # 2.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x40733333    # 3.8f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x402ccccd    # 2.7f

    .line 436
    .line 437
    .line 438
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 439
    .line 440
    const v14, -0x3fd28f5c    # -2.71f

    .line 441
    .line 442
    .line 443
    const v15, 0x400a3d71    # 2.16f

    .line 444
    .line 445
    .line 446
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v18, 0x40400000    # 3.0f

    .line 452
    .line 453
    const v13, 0x3f0a3d71    # 0.54f

    .line 454
    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const v15, 0x402ccccd    # 2.7f

    .line 458
    .line 459
    .line 460
    const v16, 0x3e947ae1    # 0.29f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41900000    # 18.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3e23d70a    # 0.16f

    .line 472
    .line 473
    .line 474
    const v18, -0x43dc28f6    # -0.01f

    .line 475
    .line 476
    .line 477
    const v13, 0x3d75c28f    # 0.06f

    .line 478
    .line 479
    .line 480
    const v15, 0x3de147ae    # 0.11f

    .line 481
    .line 482
    .line 483
    const/16 v16, 0x0

    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x3fce147b    # 1.61f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x3fb47ae1    # 1.41f

    .line 495
    .line 496
    .line 497
    const v2, -0x404b851f    # -1.41f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x4033d70a    # 2.81f

    .line 504
    .line 505
    .line 506
    const v2, 0x4033d70a    # 2.81f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x40870a3d    # 4.22f

    .line 513
    .line 514
    .line 515
    const v2, 0x3fb1eb85    # 1.39f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41380000    # 11.5f

    .line 525
    .line 526
    const/high16 v2, 0x41800000    # 16.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, -0x3f7428f6    # -4.37f

    .line 532
    .line 533
    .line 534
    const/high16 v18, 0x40400000    # 3.0f

    .line 535
    .line 536
    const/high16 v13, -0x40400000    # -1.5f

    .line 537
    .line 538
    const v15, -0x3f9b851f    # -3.57f

    .line 539
    .line 540
    .line 541
    const v16, 0x3f547ae1    # 0.83f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x40a00000    # 5.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, -0x3ff7ae14    # -2.13f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x40400000    # 3.0f

    .line 559
    .line 560
    const v18, -0x3f7428f6    # -4.37f

    .line 561
    .line 562
    .line 563
    const v13, 0x400ae148    # 2.17f

    .line 564
    .line 565
    .line 566
    const v14, -0x40b33333    # -0.8f

    .line 567
    .line 568
    .line 569
    const/high16 v15, 0x40400000    # 3.0f

    .line 570
    .line 571
    const v16, -0x3fc851ec    # -2.87f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, -0x40eb851f    # -0.58f

    .line 578
    .line 579
    .line 580
    const/high16 v18, -0x3ff00000    # -2.25f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const v14, -0x40cf5c29    # -0.69f

    .line 584
    .line 585
    .line 586
    const v15, -0x41c7ae14    # -0.18f

    .line 587
    .line 588
    .line 589
    const/high16 v16, -0x40400000    # -1.5f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x40ca8f5c    # 6.33f

    .line 595
    .line 596
    .line 597
    const v2, 0x40ca8f5c    # 6.33f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x41380000    # 11.5f

    .line 604
    .line 605
    const/high16 v18, 0x41800000    # 16.0f

    .line 606
    .line 607
    const/high16 v13, 0x41500000    # 13.0f

    .line 608
    .line 609
    const v14, 0x418170a4    # 16.18f

    .line 610
    .line 611
    .line 612
    const v15, 0x41430a3d    # 12.19f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x41800000    # 16.0f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x410d47ae    # 8.83f

    .line 624
    .line 625
    .line 626
    const/high16 v2, 0x40c00000    # 6.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, -0x40000000    # -2.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41100000    # 9.0f

    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, 0x40200000    # 2.5f

    .line 642
    .line 643
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, -0x404f5c29    # -1.38f

    .line 647
    .line 648
    .line 649
    const v15, 0x3f8f5c29    # 1.12f

    .line 650
    .line 651
    .line 652
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x4027ae14    # 2.62f

    .line 658
    .line 659
    .line 660
    const/high16 v2, 0x41600000    # 14.0f

    .line 661
    .line 662
    const/high16 v4, 0x40800000    # 4.0f

    .line 663
    .line 664
    const/high16 v6, 0x41600000    # 14.0f

    .line 665
    .line 666
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x40800000    # 4.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, 0x40000000    # 2.0f

    .line 675
    .line 676
    const/high16 v18, 0x40000000    # 2.0f

    .line 677
    .line 678
    const v13, 0x3f8ccccd    # 1.1f

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x0

    .line 682
    const/high16 v15, 0x40000000    # 2.0f

    .line 683
    .line 684
    const v16, 0x3f666666    # 0.9f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x40200000    # 2.5f

    .line 694
    .line 695
    const/high16 v18, 0x40200000    # 2.5f

    .line 696
    .line 697
    const v13, 0x3fb0a3d7    # 1.38f

    .line 698
    .line 699
    .line 700
    const/high16 v15, 0x40200000    # 2.5f

    .line 701
    .line 702
    const v16, 0x3f8f5c29    # 1.12f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, 0x41700000    # 15.0f

    .line 709
    .line 710
    const/high16 v2, 0x41700000    # 15.0f

    .line 711
    .line 712
    const/high16 v4, 0x41a00000    # 20.0f

    .line 713
    .line 714
    const v6, 0x41ab0a3d    # 21.38f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, 0x400ae148    # 2.17f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, -0x40000000    # -2.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x41500000    # 13.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, 0x40000000    # 2.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, 0x3f000000    # 0.5f

    .line 742
    .line 743
    const/high16 v18, -0x41000000    # -0.5f

    .line 744
    .line 745
    const v13, 0x3e8f5c29    # 0.28f

    .line 746
    .line 747
    .line 748
    const/high16 v15, 0x3f000000    # 0.5f

    .line 749
    .line 750
    const v16, -0x419eb852    # -0.22f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, 0x41a23d71    # 20.28f

    .line 757
    .line 758
    .line 759
    const/high16 v2, 0x41a00000    # 20.0f

    .line 760
    .line 761
    const/high16 v4, 0x41400000    # 12.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v0, -0x40000000    # -2.0f

    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v0, 0x40c00000    # 6.0f

    .line 772
    .line 773
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v0, -0x3f400000    # -6.0f

    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v0, 0x40800000    # 4.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v17, -0x41000000    # -0.5f

    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const v14, -0x4170a3d7    # -0.28f

    .line 790
    .line 791
    .line 792
    const v15, -0x419eb852    # -0.22f

    .line 793
    .line 794
    .line 795
    const/high16 v16, -0x41000000    # -0.5f

    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x406e147b    # 3.72f

    .line 801
    .line 802
    .line 803
    const/high16 v2, 0x41300000    # 11.0f

    .line 804
    .line 805
    const/high16 v4, 0x40800000    # 4.0f

    .line 806
    .line 807
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v0, 0x40000000    # 2.0f

    .line 811
    .line 812
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x410d47ae    # 8.83f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    const/16 v16, 0x3800

    .line 829
    .line 830
    const/16 v17, 0x0

    .line 831
    .line 832
    const/high16 v6, 0x3f800000    # 1.0f

    .line 833
    .line 834
    const/high16 v8, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    const/high16 v12, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v14, 0x0

    .line 840
    const/4 v15, 0x0

    .line 841
    const-string v4, ""

    .line 842
    .line 843
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    sput-object v0, Landroidx/compose/material/icons/twotone/ExtensionOffKt;->_extensionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0
.end method

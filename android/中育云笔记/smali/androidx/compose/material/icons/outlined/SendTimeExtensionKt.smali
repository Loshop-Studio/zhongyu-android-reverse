.class public final Landroidx/compose/material/icons/outlined/SendTimeExtensionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSendTimeExtension(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SendTimeExtensionKt;->_sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SendTimeExtension"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x40c851ec    # 6.26f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v6, 0x3f800000    # 1.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x40c00000    # 6.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v25, -0x40000000    # -2.0f

    .line 96
    .line 97
    const/high16 v26, -0x40000000    # -2.0f

    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const v22, -0x40733333    # -1.1f

    .line 102
    .line 103
    .line 104
    const v23, -0x4099999a    # -0.9f

    .line 105
    .line 106
    .line 107
    const/high16 v24, -0x40000000    # -2.0f

    .line 108
    .line 109
    move-object/from16 v20, v2

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, -0x3f800000    # -4.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 120
    .line 121
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 122
    .line 123
    const v22, -0x404f5c29    # -1.38f

    .line 124
    .line 125
    .line 126
    const v23, -0x4070a3d7    # -1.12f

    .line 127
    .line 128
    .line 129
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x4027ae14    # 2.62f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x41100000    # 9.0f

    .line 138
    .line 139
    const/high16 v7, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x40a051ec    # 5.01f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, -0x40000000    # -2.0f

    .line 151
    .line 152
    const/high16 v26, 0x40000000    # 2.0f

    .line 153
    .line 154
    const v21, -0x40733333    # -1.1f

    .line 155
    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/high16 v23, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v24, 0x3f666666    # 0.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x40733333    # 3.8f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const/high16 v26, 0x41480000    # 12.5f

    .line 176
    .line 177
    const v21, 0x40b66666    # 5.7f

    .line 178
    .line 179
    .line 180
    const v22, 0x411ccccd    # 9.8f

    .line 181
    .line 182
    .line 183
    const/high16 v23, 0x40c00000    # 6.0f

    .line 184
    .line 185
    const v24, 0x413f5c29    # 11.96f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 192
    .line 193
    const v26, 0x402ccccd    # 2.7f

    .line 194
    .line 195
    .line 196
    const/16 v21, 0x0

    .line 197
    .line 198
    const v22, 0x3f0a3d71    # 0.54f

    .line 199
    .line 200
    .line 201
    const v23, -0x416b851f    # -0.29f

    .line 202
    .line 203
    .line 204
    const v24, 0x402ccccd    # 2.7f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41980000    # 19.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/high16 v26, 0x40000000    # 2.0f

    .line 218
    .line 219
    const v22, 0x3f8ccccd    # 1.1f

    .line 220
    .line 221
    .line 222
    const v23, 0x3f666666    # 0.9f

    .line 223
    .line 224
    .line 225
    const/high16 v24, 0x40000000    # 2.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x40733333    # 3.8f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v25, 0x400ccccd    # 2.2f

    .line 237
    .line 238
    .line 239
    const v26, -0x3fc3d70a    # -2.94f

    .line 240
    .line 241
    .line 242
    const v22, -0x3ff5c28f    # -2.16f

    .line 243
    .line 244
    .line 245
    const v23, 0x3faf5c29    # 1.37f

    .line 246
    .line 247
    .line 248
    const v24, -0x3fce147b    # -2.78f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, -0x3ffe147b    # -2.03f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v25, 0x40e428f6    # 7.13f

    .line 261
    .line 262
    .line 263
    const/high16 v26, 0x41980000    # 19.0f

    .line 264
    .line 265
    const v21, 0x41191eb8    # 9.57f

    .line 266
    .line 267
    .line 268
    const v22, 0x4181999a    # 16.2f

    .line 269
    .line 270
    .line 271
    const v23, 0x40fb3333    # 7.85f

    .line 272
    .line 273
    .line 274
    const v24, 0x41888f5c    # 17.07f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40a00000    # 5.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, -0x3ff7ae14    # -2.13f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x40400000    # 3.0f

    .line 292
    .line 293
    const v26, -0x3f7428f6    # -4.37f

    .line 294
    .line 295
    .line 296
    const v21, 0x400ae148    # 2.17f

    .line 297
    .line 298
    .line 299
    const v22, -0x40b33333    # -0.8f

    .line 300
    .line 301
    .line 302
    const/high16 v23, 0x40400000    # 3.0f

    .line 303
    .line 304
    const v24, -0x3fc851ec    # -2.87f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, -0x3fc0a3d7    # -2.99f

    .line 311
    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const v22, -0x404147ae    # -1.49f

    .line 316
    .line 317
    .line 318
    const v23, -0x40ab851f    # -0.83f

    .line 319
    .line 320
    .line 321
    const v24, -0x3f9c28f6    # -3.56f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v4, 0x40c00000    # 6.0f

    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41300000    # 11.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x40800000    # 4.0f

    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, 0x3f000000    # 0.5f

    .line 343
    .line 344
    const/high16 v26, -0x41000000    # -0.5f

    .line 345
    .line 346
    const v22, -0x4170a3d7    # -0.28f

    .line 347
    .line 348
    .line 349
    const v23, 0x3e6147ae    # 0.22f

    .line 350
    .line 351
    .line 352
    const/high16 v24, -0x41000000    # -0.5f

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v4, 0x406e147b    # 3.72f

    .line 358
    .line 359
    .line 360
    const/high16 v6, 0x41400000    # 12.0f

    .line 361
    .line 362
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x40000000    # 2.0f

    .line 366
    .line 367
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x41900000    # 18.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const/16 v16, 0x3800

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const/high16 v6, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/high16 v8, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/4 v7, 0x0

    .line 391
    const/high16 v9, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v12, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const/4 v14, 0x0

    .line 397
    const/4 v15, 0x0

    .line 398
    const-string v4, ""

    .line 399
    .line 400
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 401
    .line 402
    .line 403
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 408
    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v6

    .line 413
    const/4 v0, 0x0

    .line 414
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 422
    .line 423
    .line 424
    move-result v11

    .line 425
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x41500000    # 13.0f

    .line 431
    .line 432
    const/high16 v4, 0x41400000    # 12.0f

    .line 433
    .line 434
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/4 v2, 0x0

    .line 438
    const/high16 v4, 0x40800000    # 4.0f

    .line 439
    .line 440
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v2, 0x3f800000    # 1.0f

    .line 444
    .line 445
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v2, -0x3f800000    # -4.0f

    .line 449
    .line 450
    const/high16 v4, 0x3f800000    # 1.0f

    .line 451
    .line 452
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    const/high16 v4, 0x40800000    # 4.0f

    .line 457
    .line 458
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x41200000    # 10.0f

    .line 462
    .line 463
    const/high16 v4, -0x3f600000    # -5.0f

    .line 464
    .line 465
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/high16 v6, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sput-object v0, Landroidx/compose/material/icons/outlined/SendTimeExtensionKt;->_sendTimeExtension:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 489
    .line 490
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    return-object v0
.end method

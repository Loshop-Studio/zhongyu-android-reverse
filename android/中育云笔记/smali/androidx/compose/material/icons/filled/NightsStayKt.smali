.class public final Landroidx/compose/material/icons/filled/NightsStayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightsStay(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.NightsStay"

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
    const v4, 0x4131999a    # 11.1f

    .line 71
    .line 72
    .line 73
    const v6, 0x414147ae    # 12.08f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x413a147b    # 11.63f

    .line 80
    .line 81
    .line 82
    const v26, 0x4000a3d7    # 2.01f

    .line 83
    .line 84
    .line 85
    const v21, 0x410c51ec    # 8.77f

    .line 86
    .line 87
    .line 88
    const v22, 0x40f23d71    # 7.57f

    .line 89
    .line 90
    .line 91
    const v23, 0x4129999a    # 10.6f

    .line 92
    .line 93
    .line 94
    const v24, 0x40666666    # 3.6f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x3ffd70a4    # 1.98f

    .line 103
    .line 104
    .line 105
    const/high16 v26, 0x41400000    # 12.0f

    .line 106
    .line 107
    const v21, 0x40c8a3d7    # 6.27f

    .line 108
    .line 109
    .line 110
    const v22, 0x400ccccd    # 2.2f

    .line 111
    .line 112
    .line 113
    const v23, 0x3ffd70a4    # 1.98f

    .line 114
    .line 115
    .line 116
    const v24, 0x40d2e148    # 6.59f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x3ca3d70a    # 0.02f

    .line 123
    .line 124
    .line 125
    const v26, 0x3ed70a3d    # 0.42f

    .line 126
    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, 0x3e0f5c29    # 0.14f

    .line 131
    .line 132
    .line 133
    const v23, 0x3ca3d70a    # 0.02f

    .line 134
    .line 135
    .line 136
    const v24, 0x3e8f5c29    # 0.28f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, 0x40800000    # 4.0f

    .line 143
    .line 144
    const/high16 v26, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v21, 0x4027ae14    # 2.62f

    .line 147
    .line 148
    .line 149
    const v22, 0x41426666    # 12.15f

    .line 150
    .line 151
    .line 152
    const v23, 0x40528f5c    # 3.29f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x41400000    # 12.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, 0x40833333    # 4.1f

    .line 161
    .line 162
    .line 163
    const v26, 0x4009999a    # 2.15f

    .line 164
    .line 165
    .line 166
    const v21, 0x3fd47ae1    # 1.66f

    .line 167
    .line 168
    .line 169
    const/16 v22, 0x0

    .line 170
    .line 171
    const v23, 0x404b851f    # 3.18f

    .line 172
    .line 173
    .line 174
    const v24, 0x3f547ae1    # 0.83f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, 0x41300000    # 11.0f

    .line 181
    .line 182
    const/high16 v26, 0x41900000    # 18.0f

    .line 183
    .line 184
    const v21, 0x411c51ec    # 9.77f

    .line 185
    .line 186
    .line 187
    const v22, 0x416a147b    # 14.63f

    .line 188
    .line 189
    .line 190
    const/high16 v23, 0x41300000    # 11.0f

    .line 191
    .line 192
    const v24, 0x41815c29    # 16.17f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v25, -0x3ff851ec    # -2.12f

    .line 199
    .line 200
    .line 201
    const v26, 0x4060a3d7    # 3.51f

    .line 202
    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const v22, 0x3fc28f5c    # 1.52f

    .line 207
    .line 208
    .line 209
    const v23, -0x40a147ae    # -0.87f

    .line 210
    .line 211
    .line 212
    const v24, 0x40351eb8    # 2.83f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x40470a3d    # 3.11f

    .line 219
    .line 220
    .line 221
    const/high16 v26, 0x3f000000    # 0.5f

    .line 222
    .line 223
    const v21, 0x3f7ae148    # 0.98f

    .line 224
    .line 225
    .line 226
    const v22, 0x3ea3d70a    # 0.32f

    .line 227
    .line 228
    .line 229
    const v23, 0x4001eb85    # 2.03f

    .line 230
    .line 231
    .line 232
    const/high16 v24, 0x3f000000    # 0.5f

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, 0x4105eb85    # 8.37f

    .line 238
    .line 239
    .line 240
    const v26, -0x3f6f5c29    # -4.52f

    .line 241
    .line 242
    .line 243
    const/high16 v21, 0x40600000    # 3.5f

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    const v23, 0x40d28f5c    # 6.58f

    .line 248
    .line 249
    .line 250
    const v24, -0x4019999a    # -1.8f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x4131999a    # 11.1f

    .line 257
    .line 258
    .line 259
    const v26, 0x414147ae    # 12.08f

    .line 260
    .line 261
    .line 262
    const/high16 v21, 0x41900000    # 18.0f

    .line 263
    .line 264
    const v22, 0x418dc28f    # 17.72f

    .line 265
    .line 266
    .line 267
    const v23, 0x4156147b    # 13.38f

    .line 268
    .line 269
    .line 270
    const v24, 0x418428f6    # 16.52f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const/16 v16, 0x3800

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const/high16 v6, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/high16 v8, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const/high16 v9, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/high16 v12, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const-string v4, ""

    .line 300
    .line 301
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 309
    .line 310
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 311
    .line 312
    .line 313
    move-result-wide v6

    .line 314
    const/4 v0, 0x0

    .line 315
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40e00000    # 7.0f

    .line 332
    .line 333
    const/high16 v2, 0x41800000    # 16.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x41c7ae14    # -0.18f

    .line 339
    .line 340
    .line 341
    const/4 v2, 0x0

    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40800000    # 4.0f

    .line 346
    .line 347
    const/high16 v18, 0x41600000    # 14.0f

    .line 348
    .line 349
    const v13, 0x40cccccd    # 6.4f

    .line 350
    .line 351
    .line 352
    const v14, 0x416d70a4    # 14.84f

    .line 353
    .line 354
    .line 355
    const v15, 0x40a9999a    # 5.3f

    .line 356
    .line 357
    .line 358
    const/high16 v16, 0x41600000    # 14.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 364
    .line 365
    const/high16 v18, 0x40400000    # 3.0f

    .line 366
    .line 367
    const v13, -0x402b851f    # -1.66f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 372
    .line 373
    const v16, 0x3fab851f    # 1.34f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3fab851f    # 1.34f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x40400000    # 3.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x40400000    # 3.0f

    .line 388
    .line 389
    const/16 v18, 0x0

    .line 390
    .line 391
    const v13, 0x3f1eb852    # 0.62f

    .line 392
    .line 393
    .line 394
    const v15, 0x401f5c29    # 2.49f

    .line 395
    .line 396
    .line 397
    const/16 v16, 0x0

    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x40000000    # 2.0f

    .line 403
    .line 404
    const/high16 v18, -0x40000000    # -2.0f

    .line 405
    .line 406
    const v13, 0x3f8ccccd    # 1.1f

    .line 407
    .line 408
    .line 409
    const/high16 v15, 0x40000000    # 2.0f

    .line 410
    .line 411
    const v16, -0x4099999a    # -0.9f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x40e00000    # 7.0f

    .line 418
    .line 419
    const/high16 v18, 0x41800000    # 16.0f

    .line 420
    .line 421
    const/high16 v13, 0x41100000    # 9.0f

    .line 422
    .line 423
    const v14, 0x41873333    # 16.9f

    .line 424
    .line 425
    .line 426
    const v15, 0x4101999a    # 8.1f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x41800000    # 16.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const/16 v16, 0x3800

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/high16 v6, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    const/high16 v12, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Landroidx/compose/material/icons/filled/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v0
.end method

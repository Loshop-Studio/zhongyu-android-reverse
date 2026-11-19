.class public final Landroidx/compose/material/icons/twotone/IcecreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _icecream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIcecream(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Icecream"

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
    const v4, 0x41151eb8    # 9.32f

    .line 71
    .line 72
    .line 73
    const v6, 0x4156b852    # 13.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x402eb852    # 2.73f

    .line 80
    .line 81
    .line 82
    const v6, 0x40a6b852    # 5.21f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x402ae148    # 2.67f

    .line 89
    .line 90
    .line 91
    const v6, -0x3f58a3d7    # -5.23f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, 0x41400000    # 12.0f

    .line 98
    .line 99
    const/high16 v26, 0x41600000    # 14.0f

    .line 100
    .line 101
    const v21, 0x415e147b    # 13.88f

    .line 102
    .line 103
    .line 104
    const v22, 0x415ca3d7    # 13.79f

    .line 105
    .line 106
    .line 107
    const v23, 0x414f3333    # 12.95f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x41600000    # 14.0f

    .line 111
    .line 112
    move-object/from16 v20, v2

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x41151eb8    # 9.32f

    .line 118
    .line 119
    .line 120
    const v26, 0x4156b852    # 13.42f

    .line 121
    .line 122
    .line 123
    const v21, 0x4130f5c3    # 11.06f

    .line 124
    .line 125
    .line 126
    const/high16 v22, 0x41600000    # 14.0f

    .line 127
    .line 128
    const v23, 0x41226666    # 10.15f

    .line 129
    .line 130
    .line 131
    const v24, 0x415ca3d7    # 13.79f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/16 v16, 0x3800

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const v6, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const v8, 0x3e99999a    # 0.3f

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const v4, 0x418a7ae1    # 17.31f

    .line 195
    .line 196
    .line 197
    const v6, 0x410051ec    # 8.02f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x418451ec    # 16.54f

    .line 204
    .line 205
    .line 206
    const v6, 0x40fccccd    # 7.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, -0x428a3d71    # -0.06f

    .line 213
    .line 214
    .line 215
    const v6, -0x40b851ec    # -0.78f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v25, 0x41400000    # 12.0f

    .line 222
    .line 223
    const/high16 v26, 0x40400000    # 3.0f

    .line 224
    .line 225
    const v21, 0x418251ec    # 16.29f

    .line 226
    .line 227
    .line 228
    const v22, 0x4099999a    # 4.8f

    .line 229
    .line 230
    .line 231
    const v23, 0x416570a4    # 14.34f

    .line 232
    .line 233
    .line 234
    const/high16 v24, 0x40400000    # 3.0f

    .line 235
    .line 236
    move-object/from16 v20, v2

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x40f051ec    # 7.51f

    .line 242
    .line 243
    .line 244
    const v6, 0x40e3d70a    # 7.12f

    .line 245
    .line 246
    .line 247
    const v7, 0x40f6b852    # 7.71f

    .line 248
    .line 249
    .line 250
    const v8, 0x4099999a    # 4.8f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x40ee6666    # 7.45f

    .line 257
    .line 258
    .line 259
    const v6, 0x40fccccd    # 7.9f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, 0x40d5c28f    # 6.68f

    .line 266
    .line 267
    .line 268
    const v6, 0x41007ae1    # 8.03f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v25, 0x40a00000    # 5.0f

    .line 275
    .line 276
    const/high16 v26, 0x41200000    # 10.0f

    .line 277
    .line 278
    const v21, 0x40b70a3d    # 5.72f

    .line 279
    .line 280
    .line 281
    const v22, 0x4102e148    # 8.18f

    .line 282
    .line 283
    .line 284
    const/high16 v23, 0x40a00000    # 5.0f

    .line 285
    .line 286
    const v24, 0x411051ec    # 9.02f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x40000000    # 2.0f

    .line 293
    .line 294
    const/high16 v26, 0x40000000    # 2.0f

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const v22, 0x3f8e147b    # 1.11f

    .line 299
    .line 300
    .line 301
    const v23, 0x3f666666    # 0.9f

    .line 302
    .line 303
    .line 304
    const/high16 v24, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x3fb1eb85    # 1.39f

    .line 310
    .line 311
    .line 312
    const v26, -0x40f0a3d7    # -0.56f

    .line 313
    .line 314
    .line 315
    const v21, 0x3f051eb8    # 0.52f

    .line 316
    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const v23, 0x3f8147ae    # 1.01f

    .line 321
    .line 322
    .line 323
    const v24, -0x41a8f5c3    # -0.21f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, -0x40f5c28f    # -0.54f

    .line 330
    .line 331
    .line 332
    const v6, 0x3f0f5c29    # 0.56f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x3ed1eb85    # 0.41f

    .line 339
    .line 340
    .line 341
    const v6, 0x3f28f5c3    # 0.66f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v25, 0x41400000    # 12.0f

    .line 348
    .line 349
    const/high16 v26, 0x41400000    # 12.0f

    .line 350
    .line 351
    const v21, 0x41251eb8    # 10.32f

    .line 352
    .line 353
    .line 354
    const v22, 0x413c28f6    # 11.76f

    .line 355
    .line 356
    .line 357
    const v23, 0x41323d71    # 11.14f

    .line 358
    .line 359
    .line 360
    const/high16 v24, 0x41400000    # 12.0f

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x4018f5c3    # 2.39f

    .line 366
    .line 367
    .line 368
    const v6, -0x40d1eb85    # -0.68f

    .line 369
    .line 370
    .line 371
    const v7, -0x418a3d71    # -0.24f

    .line 372
    .line 373
    .line 374
    const v8, 0x3fd70a3d    # 1.68f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, -0x4128f5c3    # -0.42f

    .line 381
    .line 382
    .line 383
    const v6, 0x3f28f5c3    # 0.66f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, 0x3f0a3d71    # 0.54f

    .line 390
    .line 391
    .line 392
    const v6, 0x3f0f5c29    # 0.56f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, 0x41880000    # 17.0f

    .line 399
    .line 400
    const v21, 0x417fd70a    # 15.99f

    .line 401
    .line 402
    .line 403
    const v22, 0x413ccccd    # 11.8f

    .line 404
    .line 405
    .line 406
    const v23, 0x4183d70a    # 16.48f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v25, 0x40000000    # 2.0f

    .line 413
    .line 414
    const/high16 v26, -0x40000000    # -2.0f

    .line 415
    .line 416
    const v21, 0x3f8ccccd    # 1.1f

    .line 417
    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const/high16 v23, 0x40000000    # 2.0f

    .line 422
    .line 423
    const v24, -0x4099999a    # -0.9f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, 0x418a7ae1    # 17.31f

    .line 430
    .line 431
    .line 432
    const v26, 0x410051ec    # 8.02f

    .line 433
    .line 434
    .line 435
    const/high16 v21, 0x41980000    # 19.0f

    .line 436
    .line 437
    const v22, 0x411028f6    # 9.01f

    .line 438
    .line 439
    .line 440
    const v23, 0x41923d71    # 18.28f

    .line 441
    .line 442
    .line 443
    const v24, 0x4102e148    # 8.18f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    const v6, 0x3e99999a    # 0.3f

    .line 457
    .line 458
    .line 459
    const v8, 0x3e99999a    # 0.3f

    .line 460
    .line 461
    .line 462
    const/4 v7, 0x0

    .line 463
    const-string v4, ""

    .line 464
    .line 465
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 466
    .line 467
    .line 468
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 473
    .line 474
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 475
    .line 476
    .line 477
    move-result-wide v6

    .line 478
    const/4 v0, 0x0

    .line 479
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 493
    .line 494
    .line 495
    const v0, 0x41930a3d    # 18.38f

    .line 496
    .line 497
    .line 498
    const v2, 0x40c7ae14    # 6.24f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x41400000    # 12.0f

    .line 505
    .line 506
    const/high16 v18, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const v13, 0x418e51ec    # 17.79f

    .line 509
    .line 510
    .line 511
    const v14, 0x404f5c29    # 3.24f

    .line 512
    .line 513
    .line 514
    const v15, 0x41723d71    # 15.14f

    .line 515
    .line 516
    .line 517
    const/high16 v16, 0x3f800000    # 1.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x404f5c29    # 3.24f

    .line 523
    .line 524
    .line 525
    const v2, 0x40b3d70a    # 5.62f

    .line 526
    .line 527
    .line 528
    const v4, 0x40c7ae14    # 6.24f

    .line 529
    .line 530
    .line 531
    const v6, 0x40c6b852    # 6.21f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x40400000    # 3.0f

    .line 538
    .line 539
    const/high16 v18, 0x41200000    # 10.0f

    .line 540
    .line 541
    const v13, 0x40828f5c    # 4.08f

    .line 542
    .line 543
    .line 544
    const v14, 0x40d9eb85    # 6.81f

    .line 545
    .line 546
    .line 547
    const/high16 v15, 0x40400000    # 3.0f

    .line 548
    .line 549
    const v16, 0x4104a3d7    # 8.29f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x40800000    # 4.0f

    .line 556
    .line 557
    const/high16 v18, 0x40800000    # 4.0f

    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const v14, 0x400d70a4    # 2.21f

    .line 561
    .line 562
    .line 563
    const v15, 0x3fe51eb8    # 1.79f

    .line 564
    .line 565
    .line 566
    const/high16 v16, 0x40800000    # 4.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, 0x3eae147b    # 0.34f

    .line 572
    .line 573
    .line 574
    const v18, -0x435c28f6    # -0.02f

    .line 575
    .line 576
    .line 577
    const v13, 0x3df5c28f    # 0.12f

    .line 578
    .line 579
    .line 580
    const/4 v14, 0x0

    .line 581
    const v15, 0x3e6b851f    # 0.23f

    .line 582
    .line 583
    .line 584
    const v16, -0x435c28f6    # -0.02f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x41411eb8    # 12.07f

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x41b80000    # 23.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x4093851f    # 4.61f

    .line 599
    .line 600
    .line 601
    const v2, -0x3eef851f    # -9.03f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, 0x41880000    # 17.0f

    .line 608
    .line 609
    const/high16 v18, 0x41600000    # 14.0f

    .line 610
    .line 611
    const v13, 0x418651ec    # 16.79f

    .line 612
    .line 613
    .line 614
    const v14, 0x415fae14    # 13.98f

    .line 615
    .line 616
    .line 617
    const v15, 0x41871eb8    # 16.89f

    .line 618
    .line 619
    .line 620
    const/high16 v16, 0x41600000    # 14.0f

    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x40800000    # 4.0f

    .line 626
    .line 627
    const/high16 v18, -0x3f800000    # -4.0f

    .line 628
    .line 629
    const v13, 0x400d70a4    # 2.21f

    .line 630
    .line 631
    .line 632
    const/4 v14, 0x0

    .line 633
    const/high16 v15, 0x40800000    # 4.0f

    .line 634
    .line 635
    const v16, -0x401ae148    # -1.79f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x41930a3d    # 18.38f

    .line 642
    .line 643
    .line 644
    const v18, 0x40c7ae14    # 6.24f

    .line 645
    .line 646
    .line 647
    const/high16 v13, 0x41a80000    # 21.0f

    .line 648
    .line 649
    const v14, 0x4104a3d7    # 8.29f

    .line 650
    .line 651
    .line 652
    const v15, 0x419f5c29    # 19.92f

    .line 653
    .line 654
    .line 655
    const v16, 0x40d9eb85    # 6.81f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, 0x41950a3d    # 18.63f

    .line 665
    .line 666
    .line 667
    const v2, 0x4140cccd    # 12.05f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, -0x3fd147ae    # -2.73f

    .line 674
    .line 675
    .line 676
    const v2, -0x3f5947ae    # -5.21f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v17, 0x41400000    # 12.0f

    .line 683
    .line 684
    const/high16 v18, 0x41600000    # 14.0f

    .line 685
    .line 686
    const v13, 0x41226666    # 10.15f

    .line 687
    .line 688
    .line 689
    const v14, 0x415ca3d7    # 13.79f

    .line 690
    .line 691
    .line 692
    const v15, 0x4130f5c3    # 11.06f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x41600000    # 14.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, 0x402e147b    # 2.72f

    .line 701
    .line 702
    .line 703
    const v18, -0x40e66666    # -0.6f

    .line 704
    .line 705
    .line 706
    const v13, 0x3f733333    # 0.95f

    .line 707
    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    const v15, 0x3ff0a3d7    # 1.88f

    .line 711
    .line 712
    .line 713
    const v16, -0x41a8f5c3    # -0.21f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x41950a3d    # 18.63f

    .line 720
    .line 721
    .line 722
    const v2, 0x4140cccd    # 12.05f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x41880000    # 17.0f

    .line 732
    .line 733
    const/high16 v2, 0x41400000    # 12.0f

    .line 734
    .line 735
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v17, -0x404e147b    # -1.39f

    .line 739
    .line 740
    .line 741
    const v18, -0x40f0a3d7    # -0.56f

    .line 742
    .line 743
    .line 744
    const v13, -0x40fae148    # -0.52f

    .line 745
    .line 746
    .line 747
    const v15, -0x407eb852    # -1.01f

    .line 748
    .line 749
    .line 750
    const v16, -0x41b33333    # -0.2f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, -0x40f0a3d7    # -0.56f

    .line 757
    .line 758
    .line 759
    const v2, -0x40f5c28f    # -0.54f

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, -0x40d70a3d    # -0.66f

    .line 766
    .line 767
    .line 768
    const v2, 0x3ed70a3d    # 0.42f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v17, 0x41400000    # 12.0f

    .line 775
    .line 776
    const/high16 v18, 0x41400000    # 12.0f

    .line 777
    .line 778
    const v13, 0x415ae148    # 13.68f

    .line 779
    .line 780
    .line 781
    const v14, 0x413c28f6    # 11.76f

    .line 782
    .line 783
    .line 784
    const v15, 0x414dc28f    # 12.86f

    .line 785
    .line 786
    .line 787
    const/high16 v16, 0x41400000    # 12.0f

    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v0, -0x3fe70a3d    # -2.39f

    .line 793
    .line 794
    .line 795
    const v2, -0x40cf5c29    # -0.69f

    .line 796
    .line 797
    .line 798
    const v4, -0x418a3d71    # -0.24f

    .line 799
    .line 800
    .line 801
    const v6, -0x4028f5c3    # -1.68f

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v0, 0x410f3333    # 8.95f

    .line 808
    .line 809
    .line 810
    const v2, 0x412e6666    # 10.9f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v0, -0x40f0a3d7    # -0.56f

    .line 817
    .line 818
    .line 819
    const v2, 0x3f0a3d71    # 0.54f

    .line 820
    .line 821
    .line 822
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v17, 0x40e00000    # 7.0f

    .line 826
    .line 827
    const v13, 0x410028f6    # 8.01f

    .line 828
    .line 829
    .line 830
    const v14, 0x413ca3d7    # 11.79f

    .line 831
    .line 832
    .line 833
    const v15, 0x40f0a3d7    # 7.52f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v17, -0x40000000    # -2.0f

    .line 840
    .line 841
    const/high16 v18, -0x40000000    # -2.0f

    .line 842
    .line 843
    const v13, -0x40733333    # -1.1f

    .line 844
    .line 845
    .line 846
    const/4 v14, 0x0

    .line 847
    const/high16 v15, -0x40000000    # -2.0f

    .line 848
    .line 849
    const v16, -0x409c28f6    # -0.89f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v17, 0x3fd70a3d    # 1.68f

    .line 856
    .line 857
    .line 858
    const v18, -0x4003d70a    # -1.97f

    .line 859
    .line 860
    .line 861
    const/4 v13, 0x0

    .line 862
    const v14, -0x40851eb8    # -0.98f

    .line 863
    .line 864
    .line 865
    const v15, 0x3f3851ec    # 0.72f

    .line 866
    .line 867
    .line 868
    const v16, -0x40170a3d    # -1.82f

    .line 869
    .line 870
    .line 871
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v0, 0x40ee6666    # 7.45f

    .line 875
    .line 876
    .line 877
    const v2, 0x40fccccd    # 7.9f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, 0x3d75c28f    # 0.06f

    .line 884
    .line 885
    .line 886
    const v2, -0x40b851ec    # -0.78f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v17, 0x41400000    # 12.0f

    .line 893
    .line 894
    const/high16 v18, 0x40400000    # 3.0f

    .line 895
    .line 896
    const v13, 0x40f6b852    # 7.71f

    .line 897
    .line 898
    .line 899
    const v14, 0x4099999a    # 4.8f

    .line 900
    .line 901
    .line 902
    const v15, 0x411a8f5c    # 9.66f

    .line 903
    .line 904
    .line 905
    const/high16 v16, 0x40400000    # 3.0f

    .line 906
    .line 907
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v0, 0x408f5c29    # 4.48f

    .line 911
    .line 912
    .line 913
    const v2, 0x4083d70a    # 4.12f

    .line 914
    .line 915
    .line 916
    const v4, 0x408947ae    # 4.29f

    .line 917
    .line 918
    .line 919
    const v6, 0x3fe66666    # 1.8f

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, 0x3f47ae14    # 0.78f

    .line 926
    .line 927
    .line 928
    const v2, 0x3d75c28f    # 0.06f

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const v0, 0x3f451eb8    # 0.77f

    .line 935
    .line 936
    .line 937
    const v2, 0x3df5c28f    # 0.12f

    .line 938
    .line 939
    .line 940
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/high16 v17, 0x41980000    # 19.0f

    .line 944
    .line 945
    const/high16 v18, 0x41200000    # 10.0f

    .line 946
    .line 947
    const v13, 0x41923d71    # 18.28f

    .line 948
    .line 949
    .line 950
    const v14, 0x4102e148    # 8.18f

    .line 951
    .line 952
    .line 953
    const/high16 v15, 0x41980000    # 19.0f

    .line 954
    .line 955
    const v16, 0x411028f6    # 9.01f

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v17, 0x41880000    # 17.0f

    .line 962
    .line 963
    const/high16 v18, 0x41400000    # 12.0f

    .line 964
    .line 965
    const/high16 v13, 0x41980000    # 19.0f

    .line 966
    .line 967
    const v14, 0x4131999a    # 11.1f

    .line 968
    .line 969
    .line 970
    const v15, 0x4190cccd    # 18.1f

    .line 971
    .line 972
    .line 973
    const/high16 v16, 0x41400000    # 12.0f

    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    const/16 v16, 0x3800

    .line 986
    .line 987
    const/16 v17, 0x0

    .line 988
    .line 989
    const/high16 v6, 0x3f800000    # 1.0f

    .line 990
    .line 991
    const/high16 v8, 0x3f800000    # 1.0f

    .line 992
    .line 993
    const/4 v7, 0x0

    .line 994
    const/high16 v12, 0x3f800000    # 1.0f

    .line 995
    .line 996
    const/4 v13, 0x0

    .line 997
    const/4 v14, 0x0

    .line 998
    const/4 v15, 0x0

    .line 999
    const-string v4, ""

    .line 1000
    .line 1001
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    sput-object v0, Landroidx/compose/material/icons/twotone/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1010
    .line 1011
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/CloudKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cloud:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloud(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CloudKt;->_cloud:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Cloud"

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
    const v4, 0x4199ae14    # 19.21f

    .line 71
    .line 72
    .line 73
    const v6, 0x4140a3d7    # 12.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x403c28f6    # -1.53f

    .line 80
    .line 81
    .line 82
    const v6, -0x421eb852    # -0.11f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x41666666    # -0.3f

    .line 89
    .line 90
    .line 91
    const/high16 v6, -0x40400000    # -1.5f

    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v26, 0x40c00000    # 6.0f

    .line 99
    .line 100
    const v21, 0x41870a3d    # 16.88f

    .line 101
    .line 102
    .line 103
    const v22, 0x40fb851f    # 7.86f

    .line 104
    .line 105
    .line 106
    const v23, 0x4169eb85    # 14.62f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40c00000    # 6.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x40e3d70a    # 7.12f

    .line 117
    .line 118
    .line 119
    const v26, 0x410f5c29    # 8.96f

    .line 120
    .line 121
    .line 122
    const v21, 0x411f0a3d    # 9.94f

    .line 123
    .line 124
    .line 125
    const/high16 v22, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const v23, 0x410147ae    # 8.08f

    .line 128
    .line 129
    .line 130
    const v24, 0x40e47ae1    # 7.14f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, -0x41000000    # -0.5f

    .line 137
    .line 138
    const v6, 0x3f733333    # 0.95f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, -0x40770a3d    # -1.07f

    .line 145
    .line 146
    .line 147
    const v6, 0x3de147ae    # 0.11f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x40000000    # 2.0f

    .line 154
    .line 155
    const/high16 v26, 0x41600000    # 14.0f

    .line 156
    .line 157
    const v21, 0x4061eb85    # 3.53f

    .line 158
    .line 159
    .line 160
    const v22, 0x4123d70a    # 10.24f

    .line 161
    .line 162
    .line 163
    const/high16 v23, 0x40000000    # 2.0f

    .line 164
    .line 165
    const v24, 0x413f3333    # 11.95f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x40800000    # 4.0f

    .line 172
    .line 173
    const/high16 v26, 0x40800000    # 4.0f

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    const v22, 0x400d70a4    # 2.21f

    .line 178
    .line 179
    .line 180
    const v23, 0x3fe51eb8    # 1.79f

    .line 181
    .line 182
    .line 183
    const/high16 v24, 0x40800000    # 4.0f

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41500000    # 13.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x40400000    # 3.0f

    .line 194
    .line 195
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    const v21, 0x3fd33333    # 1.65f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const/high16 v23, 0x40400000    # 3.0f

    .line 203
    .line 204
    const v24, -0x40533333    # -1.35f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, -0x3fcd70a4    # -2.79f

    .line 211
    .line 212
    .line 213
    const v26, -0x3fc28f5c    # -2.96f

    .line 214
    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const v22, -0x4039999a    # -1.55f

    .line 219
    .line 220
    .line 221
    const v23, -0x4063d70a    # -1.22f

    .line 222
    .line 223
    .line 224
    const v24, -0x3fc8f5c3    # -2.86f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const/16 v16, 0x3800

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const v6, 0x3e99999a    # 0.3f

    .line 242
    .line 243
    .line 244
    const v8, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const/high16 v9, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v12, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const/4 v14, 0x0

    .line 254
    const/4 v15, 0x0

    .line 255
    const-string v4, ""

    .line 256
    .line 257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    const/4 v0, 0x0

    .line 271
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const v0, 0x419acccd    # 19.35f

    .line 288
    .line 289
    .line 290
    const v2, 0x4120a3d7    # 10.04f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x41400000    # 12.0f

    .line 297
    .line 298
    const/high16 v18, 0x40800000    # 4.0f

    .line 299
    .line 300
    const v13, 0x41955c29    # 18.67f

    .line 301
    .line 302
    .line 303
    const v14, 0x40d2e148    # 6.59f

    .line 304
    .line 305
    .line 306
    const v15, 0x417a3d71    # 15.64f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x40800000    # 4.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x40ab3333    # 5.35f

    .line 315
    .line 316
    .line 317
    const v18, 0x4100a3d7    # 8.04f

    .line 318
    .line 319
    .line 320
    const v13, 0x4111c28f    # 9.11f

    .line 321
    .line 322
    .line 323
    const/high16 v14, 0x40800000    # 4.0f

    .line 324
    .line 325
    const v15, 0x40d33333    # 6.6f

    .line 326
    .line 327
    .line 328
    const v16, 0x40b47ae1    # 5.64f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const/high16 v18, 0x41600000    # 14.0f

    .line 337
    .line 338
    const v13, 0x4015c28f    # 2.34f

    .line 339
    .line 340
    .line 341
    const v14, 0x4105c28f    # 8.36f

    .line 342
    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    const v16, 0x412e8f5c    # 10.91f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x40c00000    # 6.0f

    .line 352
    .line 353
    const/high16 v18, 0x40c00000    # 6.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const v14, 0x4053d70a    # 3.31f

    .line 357
    .line 358
    .line 359
    const v15, 0x402c28f6    # 2.69f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x40c00000    # 6.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41500000    # 13.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x40a00000    # 5.0f

    .line 373
    .line 374
    const/high16 v18, -0x3f600000    # -5.0f

    .line 375
    .line 376
    const v13, 0x4030a3d7    # 2.76f

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/high16 v15, 0x40a00000    # 5.0f

    .line 381
    .line 382
    const v16, -0x3ff0a3d7    # -2.24f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, -0x3f6b3333    # -4.65f

    .line 389
    .line 390
    .line 391
    const v18, -0x3f6147ae    # -4.96f

    .line 392
    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const v14, -0x3fd70a3d    # -2.64f

    .line 396
    .line 397
    .line 398
    const v15, -0x3ffccccd    # -2.05f

    .line 399
    .line 400
    .line 401
    const v16, -0x3f670a3d    # -4.78f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41980000    # 19.0f

    .line 411
    .line 412
    const/high16 v2, 0x41900000    # 18.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40c00000    # 6.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x3f800000    # -4.0f

    .line 423
    .line 424
    const/high16 v18, -0x3f800000    # -4.0f

    .line 425
    .line 426
    const v13, -0x3ff28f5c    # -2.21f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, -0x3f800000    # -4.0f

    .line 431
    .line 432
    const v16, -0x401ae148    # -1.79f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x4063d70a    # 3.56f

    .line 439
    .line 440
    .line 441
    const v18, -0x3f81eb85    # -3.97f

    .line 442
    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const v14, -0x3ffccccd    # -2.05f

    .line 446
    .line 447
    .line 448
    const v15, 0x3fc3d70a    # 1.53f

    .line 449
    .line 450
    .line 451
    const v16, -0x3f8f5c29    # -3.76f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3f88f5c3    # 1.07f

    .line 458
    .line 459
    .line 460
    const v2, -0x421eb852    # -0.11f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x3f000000    # 0.5f

    .line 467
    .line 468
    const v2, -0x408ccccd    # -0.95f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41400000    # 12.0f

    .line 475
    .line 476
    const/high16 v18, 0x40c00000    # 6.0f

    .line 477
    .line 478
    const v13, 0x410147ae    # 8.08f

    .line 479
    .line 480
    .line 481
    const v14, 0x40e47ae1    # 7.14f

    .line 482
    .line 483
    .line 484
    const v15, 0x411f0a3d    # 9.94f

    .line 485
    .line 486
    .line 487
    const/high16 v16, 0x40c00000    # 6.0f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x40ac7ae1    # 5.39f

    .line 493
    .line 494
    .line 495
    const v18, 0x408dc28f    # 4.43f

    .line 496
    .line 497
    .line 498
    const v13, 0x4027ae14    # 2.62f

    .line 499
    .line 500
    .line 501
    const/4 v14, 0x0

    .line 502
    const v15, 0x409c28f6    # 4.88f

    .line 503
    .line 504
    .line 505
    const v16, 0x3fee147b    # 1.86f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x3e99999a    # 0.3f

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x3fc3d70a    # 1.53f

    .line 520
    .line 521
    .line 522
    const v2, 0x3de147ae    # 0.11f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x4031eb85    # 2.78f

    .line 529
    .line 530
    .line 531
    const v18, 0x403d70a4    # 2.96f

    .line 532
    .line 533
    .line 534
    const v13, 0x3fc7ae14    # 1.56f

    .line 535
    .line 536
    .line 537
    const v14, 0x3dcccccd    # 0.1f

    .line 538
    .line 539
    .line 540
    const v15, 0x4031eb85    # 2.78f

    .line 541
    .line 542
    .line 543
    const v16, 0x3fb47ae1    # 1.41f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 550
    .line 551
    const/high16 v18, 0x40400000    # 3.0f

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    const v14, 0x3fd33333    # 1.65f

    .line 555
    .line 556
    .line 557
    const v15, -0x40533333    # -1.35f

    .line 558
    .line 559
    .line 560
    const/high16 v16, 0x40400000    # 3.0f

    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    const/16 v16, 0x3800

    .line 573
    .line 574
    const/16 v17, 0x0

    .line 575
    .line 576
    const/high16 v6, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/high16 v8, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/4 v7, 0x0

    .line 581
    const/high16 v12, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v14, 0x0

    .line 584
    const/4 v15, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    sput-object v0, Landroidx/compose/material/icons/twotone/CloudKt;->_cloud:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 596
    .line 597
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    return-object v0
.end method

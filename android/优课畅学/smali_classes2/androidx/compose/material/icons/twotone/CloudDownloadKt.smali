.class public final Landroidx/compose/material/icons/twotone/CloudDownloadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cloudDownload:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudDownload(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CloudDownloadKt;->_cloudDownload:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CloudDownload"

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
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41400000    # 12.0f

    .line 234
    .line 235
    const/high16 v6, 0x41880000    # 17.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, -0x3f800000    # -4.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x40233333    # 2.55f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x403a3d71    # 2.91f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x40400000    # 3.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41800000    # 16.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x40800000    # 4.0f

    .line 273
    .line 274
    const/high16 v6, -0x3f800000    # -4.0f

    .line 275
    .line 276
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/16 v16, 0x3800

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const v6, 0x3e99999a    # 0.3f

    .line 291
    .line 292
    .line 293
    const v8, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const/high16 v9, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v12, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const/4 v14, 0x0

    .line 303
    const/4 v15, 0x0

    .line 304
    const-string v4, ""

    .line 305
    .line 306
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 307
    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 316
    .line 317
    .line 318
    move-result-wide v6

    .line 319
    const/4 v0, 0x0

    .line 320
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const v0, 0x419acccd    # 19.35f

    .line 337
    .line 338
    .line 339
    const v2, 0x4120a3d7    # 10.04f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x41400000    # 12.0f

    .line 346
    .line 347
    const/high16 v18, 0x40800000    # 4.0f

    .line 348
    .line 349
    const v13, 0x41955c29    # 18.67f

    .line 350
    .line 351
    .line 352
    const v14, 0x40d2e148    # 6.59f

    .line 353
    .line 354
    .line 355
    const v15, 0x417a3d71    # 15.64f

    .line 356
    .line 357
    .line 358
    const/high16 v16, 0x40800000    # 4.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x40ab3333    # 5.35f

    .line 364
    .line 365
    .line 366
    const v18, 0x4100a3d7    # 8.04f

    .line 367
    .line 368
    .line 369
    const v13, 0x4111c28f    # 9.11f

    .line 370
    .line 371
    .line 372
    const/high16 v14, 0x40800000    # 4.0f

    .line 373
    .line 374
    const v15, 0x40d33333    # 6.6f

    .line 375
    .line 376
    .line 377
    const v16, 0x40b47ae1    # 5.64f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const/high16 v18, 0x41600000    # 14.0f

    .line 386
    .line 387
    const v13, 0x4015c28f    # 2.34f

    .line 388
    .line 389
    .line 390
    const v14, 0x4105c28f    # 8.36f

    .line 391
    .line 392
    .line 393
    const/4 v15, 0x0

    .line 394
    const v16, 0x412e8f5c    # 10.91f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x40c00000    # 6.0f

    .line 401
    .line 402
    const/high16 v18, 0x40c00000    # 6.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, 0x4053d70a    # 3.31f

    .line 406
    .line 407
    .line 408
    const v15, 0x402c28f6    # 2.69f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x40c00000    # 6.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41500000    # 13.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40a00000    # 5.0f

    .line 422
    .line 423
    const/high16 v18, -0x3f600000    # -5.0f

    .line 424
    .line 425
    const v13, 0x4030a3d7    # 2.76f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/high16 v15, 0x40a00000    # 5.0f

    .line 430
    .line 431
    const v16, -0x3ff0a3d7    # -2.24f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x3f6b3333    # -4.65f

    .line 438
    .line 439
    .line 440
    const v18, -0x3f6147ae    # -4.96f

    .line 441
    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const v14, -0x3fd70a3d    # -2.64f

    .line 445
    .line 446
    .line 447
    const v15, -0x3ffccccd    # -2.05f

    .line 448
    .line 449
    .line 450
    const v16, -0x3f670a3d    # -4.78f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41980000    # 19.0f

    .line 460
    .line 461
    const/high16 v2, 0x41900000    # 18.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40c00000    # 6.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, -0x3f800000    # -4.0f

    .line 472
    .line 473
    const/high16 v18, -0x3f800000    # -4.0f

    .line 474
    .line 475
    const v13, -0x3ff28f5c    # -2.21f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/high16 v15, -0x3f800000    # -4.0f

    .line 480
    .line 481
    const v16, -0x401ae148    # -1.79f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x4063d70a    # 3.56f

    .line 488
    .line 489
    .line 490
    const v18, -0x3f81eb85    # -3.97f

    .line 491
    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const v14, -0x3ffccccd    # -2.05f

    .line 495
    .line 496
    .line 497
    const v15, 0x3fc3d70a    # 1.53f

    .line 498
    .line 499
    .line 500
    const v16, -0x3f8f5c29    # -3.76f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x3f88f5c3    # 1.07f

    .line 507
    .line 508
    .line 509
    const v2, -0x421eb852    # -0.11f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x3f000000    # 0.5f

    .line 516
    .line 517
    const v2, -0x408ccccd    # -0.95f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x41400000    # 12.0f

    .line 524
    .line 525
    const/high16 v18, 0x40c00000    # 6.0f

    .line 526
    .line 527
    const v13, 0x410147ae    # 8.08f

    .line 528
    .line 529
    .line 530
    const v14, 0x40e47ae1    # 7.14f

    .line 531
    .line 532
    .line 533
    const v15, 0x411f0a3d    # 9.94f

    .line 534
    .line 535
    .line 536
    const/high16 v16, 0x40c00000    # 6.0f

    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x40ac7ae1    # 5.39f

    .line 542
    .line 543
    .line 544
    const v18, 0x408dc28f    # 4.43f

    .line 545
    .line 546
    .line 547
    const v13, 0x4027ae14    # 2.62f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, 0x409c28f6    # 4.88f

    .line 552
    .line 553
    .line 554
    const v16, 0x3fee147b    # 1.86f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3e99999a    # 0.3f

    .line 561
    .line 562
    .line 563
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x3fc3d70a    # 1.53f

    .line 569
    .line 570
    .line 571
    const v2, 0x3de147ae    # 0.11f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x4031eb85    # 2.78f

    .line 578
    .line 579
    .line 580
    const v18, 0x403d70a4    # 2.96f

    .line 581
    .line 582
    .line 583
    const v13, 0x3fc7ae14    # 1.56f

    .line 584
    .line 585
    .line 586
    const v14, 0x3dcccccd    # 0.1f

    .line 587
    .line 588
    .line 589
    const v15, 0x4031eb85    # 2.78f

    .line 590
    .line 591
    .line 592
    const v16, 0x3fb47ae1    # 1.41f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 599
    .line 600
    const/high16 v18, 0x40400000    # 3.0f

    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    const v14, 0x3fd33333    # 1.65f

    .line 604
    .line 605
    .line 606
    const v15, -0x40533333    # -1.35f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x40400000    # 3.0f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, 0x41573333    # 13.45f

    .line 618
    .line 619
    .line 620
    const/high16 v2, 0x41200000    # 10.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, -0x3fc66666    # -2.9f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x40400000    # 3.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41000000    # 8.0f

    .line 637
    .line 638
    const/high16 v2, 0x41500000    # 13.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x40800000    # 4.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v2, -0x3f800000    # -4.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x3fdccccd    # -2.55f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    const/16 v16, 0x3800

    .line 667
    .line 668
    const/16 v17, 0x0

    .line 669
    .line 670
    const/high16 v6, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/high16 v8, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    const/high16 v12, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v14, 0x0

    .line 678
    const/4 v15, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, Landroidx/compose/material/icons/twotone/CloudDownloadKt;->_cloudDownload:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/EggKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _egg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEgg(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EggKt;->_egg:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Egg"

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f600000    # -5.0f

    .line 78
    .line 79
    const/high16 v26, 0x41100000    # 9.0f

    .line 80
    .line 81
    const v21, -0x4008f5c3    # -1.93f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f600000    # -5.0f

    .line 87
    .line 88
    const v24, 0x409d1eb8    # 4.91f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x40a00000    # 5.0f

    .line 97
    .line 98
    const/high16 v26, 0x40a00000    # 5.0f

    .line 99
    .line 100
    const/16 v21, 0x0

    .line 101
    .line 102
    const v22, 0x4030a3d7    # 2.76f

    .line 103
    .line 104
    .line 105
    const v23, 0x400f5c29    # 2.24f

    .line 106
    .line 107
    .line 108
    const/high16 v24, 0x40a00000    # 5.0f

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, -0x3ff0a3d7    # -2.24f

    .line 114
    .line 115
    .line 116
    const/high16 v6, -0x3f600000    # -5.0f

    .line 117
    .line 118
    const/high16 v7, 0x40a00000    # 5.0f

    .line 119
    .line 120
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v21, 0x41880000    # 17.0f

    .line 126
    .line 127
    const v22, 0x411e8f5c    # 9.91f

    .line 128
    .line 129
    .line 130
    const v23, 0x415ee148    # 13.93f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41900000    # 18.0f

    .line 140
    .line 141
    const/high16 v6, 0x41500000    # 13.0f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x3f600000    # -5.0f

    .line 147
    .line 148
    const/high16 v26, -0x3f600000    # -5.0f

    .line 149
    .line 150
    const v21, -0x3fbf5c29    # -3.01f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/high16 v23, -0x3f600000    # -5.0f

    .line 156
    .line 157
    const/high16 v24, -0x40000000    # -2.0f

    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v25, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v26, -0x40800000    # -1.0f

    .line 165
    .line 166
    const/16 v21, 0x0

    .line 167
    .line 168
    const v22, -0x40f33333    # -0.55f

    .line 169
    .line 170
    .line 171
    const v23, 0x3ee66666    # 0.45f

    .line 172
    .line 173
    .line 174
    const/high16 v24, -0x40800000    # -1.0f

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v4, 0x3ee66666    # 0.45f

    .line 180
    .line 181
    .line 182
    const/high16 v6, 0x3f800000    # 1.0f

    .line 183
    .line 184
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, 0x40400000    # 3.0f

    .line 188
    .line 189
    const/high16 v26, 0x40400000    # 3.0f

    .line 190
    .line 191
    const v22, 0x403ae148    # 2.92f

    .line 192
    .line 193
    .line 194
    const v23, 0x401ae148    # 2.42f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x40400000    # 3.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/high16 v26, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const v21, 0x3f0ccccd    # 0.55f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/high16 v23, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const v24, 0x3ee66666    # 0.45f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x4158cccd    # 13.55f

    .line 220
    .line 221
    .line 222
    const/high16 v6, 0x41900000    # 18.0f

    .line 223
    .line 224
    const/high16 v7, 0x41500000    # 13.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const/16 v16, 0x3800

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const v6, 0x3e99999a    # 0.3f

    .line 241
    .line 242
    .line 243
    const v8, 0x3e99999a    # 0.3f

    .line 244
    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const-string v4, ""

    .line 255
    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x40400000    # 3.0f

    .line 287
    .line 288
    const/high16 v6, 0x41400000    # 12.0f

    .line 289
    .line 290
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v25, 0x40a00000    # 5.0f

    .line 294
    .line 295
    const/high16 v26, 0x41600000    # 14.0f

    .line 296
    .line 297
    const/high16 v21, 0x41080000    # 8.5f

    .line 298
    .line 299
    const/high16 v22, 0x40400000    # 3.0f

    .line 300
    .line 301
    const/high16 v23, 0x40a00000    # 5.0f

    .line 302
    .line 303
    const v24, 0x411547ae    # 9.33f

    .line 304
    .line 305
    .line 306
    move-object/from16 v20, v2

    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v25, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v26, 0x40e00000    # 7.0f

    .line 314
    .line 315
    const/16 v21, 0x0

    .line 316
    .line 317
    const v22, 0x4077ae14    # 3.87f

    .line 318
    .line 319
    .line 320
    const v23, 0x404851ec    # 3.13f

    .line 321
    .line 322
    .line 323
    const/high16 v24, 0x40e00000    # 7.0f

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v26, -0x3f200000    # -7.0f

    .line 329
    .line 330
    const v21, 0x4077ae14    # 3.87f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const/high16 v23, 0x40e00000    # 7.0f

    .line 336
    .line 337
    const v24, -0x3fb7ae14    # -3.13f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v25, 0x41400000    # 12.0f

    .line 344
    .line 345
    const/high16 v26, 0x40400000    # 3.0f

    .line 346
    .line 347
    const/high16 v21, 0x41980000    # 19.0f

    .line 348
    .line 349
    const v22, 0x411547ae    # 9.33f

    .line 350
    .line 351
    .line 352
    const/high16 v23, 0x41780000    # 15.5f

    .line 353
    .line 354
    const/high16 v24, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x41980000    # 19.0f

    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v25, -0x3f600000    # -5.0f

    .line 368
    .line 369
    const/high16 v26, -0x3f600000    # -5.0f

    .line 370
    .line 371
    const v21, -0x3fcf5c29    # -2.76f

    .line 372
    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const/high16 v23, -0x3f600000    # -5.0f

    .line 377
    .line 378
    const v24, -0x3ff0a3d7    # -2.24f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v25, 0x40a00000    # 5.0f

    .line 385
    .line 386
    const/high16 v26, -0x3ef00000    # -9.0f

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const v22, -0x3f7d1eb8    # -4.09f

    .line 391
    .line 392
    .line 393
    const v23, 0x40447ae1    # 3.07f

    .line 394
    .line 395
    .line 396
    const/high16 v24, -0x3ef00000    # -9.0f

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x409d1eb8    # 4.91f

    .line 402
    .line 403
    .line 404
    const/high16 v6, 0x41100000    # 9.0f

    .line 405
    .line 406
    const/high16 v7, 0x40a00000    # 5.0f

    .line 407
    .line 408
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v25, 0x41400000    # 12.0f

    .line 412
    .line 413
    const/high16 v26, 0x41980000    # 19.0f

    .line 414
    .line 415
    const/high16 v21, 0x41880000    # 17.0f

    .line 416
    .line 417
    const v22, 0x4186147b    # 16.76f

    .line 418
    .line 419
    .line 420
    const v23, 0x416c28f6    # 14.76f

    .line 421
    .line 422
    .line 423
    const/high16 v24, 0x41980000    # 19.0f

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/high16 v8, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 450
    .line 451
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 452
    .line 453
    .line 454
    move-result-wide v6

    .line 455
    const/4 v0, 0x0

    .line 456
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x41800000    # 16.0f

    .line 473
    .line 474
    const/high16 v2, 0x41500000    # 13.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 480
    .line 481
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 482
    .line 483
    const v13, -0x40eb851f    # -0.58f

    .line 484
    .line 485
    .line 486
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 487
    .line 488
    const v16, -0x425c28f6    # -0.08f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, -0x40800000    # -1.0f

    .line 495
    .line 496
    const/high16 v18, -0x40800000    # -1.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, -0x40f33333    # -0.55f

    .line 500
    .line 501
    .line 502
    const v15, -0x4119999a    # -0.45f

    .line 503
    .line 504
    .line 505
    const/high16 v16, -0x40800000    # -1.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, -0x40800000    # -1.0f

    .line 511
    .line 512
    const v2, 0x3ee66666    # 0.45f

    .line 513
    .line 514
    .line 515
    const/high16 v4, 0x3f800000    # 1.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40a00000    # 5.0f

    .line 521
    .line 522
    const/high16 v18, 0x40a00000    # 5.0f

    .line 523
    .line 524
    const/high16 v14, 0x40400000    # 3.0f

    .line 525
    .line 526
    const v15, 0x3ffeb852    # 1.99f

    .line 527
    .line 528
    .line 529
    const/high16 v16, 0x40a00000    # 5.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/high16 v18, -0x40800000    # -1.0f

    .line 537
    .line 538
    const v13, 0x3f0ccccd    # 0.55f

    .line 539
    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const/high16 v15, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const v16, -0x4119999a    # -0.45f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x4158cccd    # 13.55f

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x41800000    # 16.0f

    .line 554
    .line 555
    const/high16 v4, 0x41500000    # 13.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v16, 0x3800

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const/high16 v12, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const/4 v15, 0x0

    .line 578
    const-string v4, ""

    .line 579
    .line 580
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    sput-object v0, Landroidx/compose/material/icons/twotone/EggKt;->_egg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    return-object v0
.end method

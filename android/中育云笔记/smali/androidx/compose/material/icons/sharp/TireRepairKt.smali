.class public final Landroidx/compose/material/icons/sharp/TireRepairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTireRepair(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.TireRepair"

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
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v26, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f0ccccd    # 0.55f

    .line 84
    .line 85
    .line 86
    const v23, 0x3ee66666    # 0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x3f800000    # 1.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x3f35c28f    # 0.71f

    .line 97
    .line 98
    .line 99
    const v26, -0x416b851f    # -0.29f

    .line 100
    .line 101
    .line 102
    const v21, 0x3e8f5c29    # 0.28f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const v23, 0x3f07ae14    # 0.53f

    .line 108
    .line 109
    .line 110
    const v24, -0x421eb852    # -0.11f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x3f851eb8    # 1.04f

    .line 117
    .line 118
    .line 119
    const v26, -0x3fe28f5c    # -2.46f

    .line 120
    .line 121
    .line 122
    const v21, 0x3ecccccd    # 0.4f

    .line 123
    .line 124
    .line 125
    const v22, -0x41333333    # -0.4f

    .line 126
    .line 127
    .line 128
    const v23, 0x3f851eb8    # 1.04f

    .line 129
    .line 130
    .line 131
    const v24, -0x3fe28f5c    # -2.46f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x3fe28f5c    # -2.46f

    .line 138
    .line 139
    .line 140
    const v6, 0x3f851eb8    # 1.04f

    .line 141
    .line 142
    .line 143
    const v7, -0x3ffc28f6    # -2.06f

    .line 144
    .line 145
    .line 146
    const v8, 0x3f23d70a    # 0.64f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x41900000    # 18.0f

    .line 153
    .line 154
    const/high16 v26, 0x40e00000    # 7.0f

    .line 155
    .line 156
    const v21, 0x4190e148    # 18.11f

    .line 157
    .line 158
    .line 159
    const v22, 0x40cf0a3d    # 6.47f

    .line 160
    .line 161
    .line 162
    const/high16 v23, 0x41900000    # 18.0f

    .line 163
    .line 164
    const v24, 0x40d70a3d    # 6.72f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v16, 0x3800

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/high16 v6, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v8, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/high16 v9, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v12, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    const/4 v15, 0x0

    .line 193
    const-string v4, ""

    .line 194
    .line 195
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const/4 v0, 0x0

    .line 209
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41980000    # 19.0f

    .line 226
    .line 227
    const/high16 v2, 0x40000000    # 2.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, -0x3f600000    # -5.0f

    .line 233
    .line 234
    const/high16 v18, 0x40a00000    # 5.0f

    .line 235
    .line 236
    const v13, -0x3fcf5c29    # -2.76f

    .line 237
    .line 238
    .line 239
    const/high16 v15, -0x3f600000    # -5.0f

    .line 240
    .line 241
    const v16, 0x400f5c29    # 2.24f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x40400000    # 3.0f

    .line 248
    .line 249
    const v18, 0x40928f5c    # 4.58f

    .line 250
    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const v14, 0x40033333    # 2.05f

    .line 254
    .line 255
    .line 256
    const v15, 0x3f9d70a4    # 1.23f

    .line 257
    .line 258
    .line 259
    const v16, 0x4073d70a    # 3.81f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41500000    # 13.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x3f800000    # 1.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40c00000    # 6.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, -0x40000000    # -2.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x3f400000    # -6.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, -0x3f800000    # -4.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40a00000    # 5.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, -0x40000000    # -2.0f

    .line 301
    .line 302
    const/high16 v18, -0x40000000    # -2.0f

    .line 303
    .line 304
    const v14, -0x40733333    # -1.1f

    .line 305
    .line 306
    .line 307
    const v15, -0x4099999a    # -0.9f

    .line 308
    .line 309
    .line 310
    const/high16 v16, -0x40000000    # -2.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40800000    # 4.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x40000000    # 2.0f

    .line 321
    .line 322
    const/high16 v18, 0x40a00000    # 5.0f

    .line 323
    .line 324
    const v13, 0x4039999a    # 2.9f

    .line 325
    .line 326
    .line 327
    const/high16 v14, 0x40400000    # 3.0f

    .line 328
    .line 329
    const/high16 v15, 0x40000000    # 2.0f

    .line 330
    .line 331
    const v16, 0x4079999a    # 3.9f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41600000    # 14.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x40000000    # 2.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, 0x3f8ccccd    # 1.1f

    .line 346
    .line 347
    .line 348
    const v15, 0x3f666666    # 0.9f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x40000000    # 2.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x40c00000    # 6.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v18, -0x40000000    # -2.0f

    .line 362
    .line 363
    const v13, 0x3f8ccccd    # 1.1f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const/high16 v15, 0x40000000    # 2.0f

    .line 368
    .line 369
    const v16, -0x4099999a    # -0.9f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, -0x3f800000    # -4.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40000000    # 2.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40c00000    # 6.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, -0x3f000000    # -8.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x3f800000    # 1.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x404a3d71    # -1.42f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x40400000    # 3.0f

    .line 410
    .line 411
    const v18, -0x3f6d70a4    # -4.58f

    .line 412
    .line 413
    .line 414
    const v13, 0x3fe28f5c    # 1.77f

    .line 415
    .line 416
    .line 417
    const v14, -0x40bae148    # -0.77f

    .line 418
    .line 419
    .line 420
    const/high16 v15, 0x40400000    # 3.0f

    .line 421
    .line 422
    const v16, -0x3fde147b    # -2.53f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x41980000    # 19.0f

    .line 429
    .line 430
    const/high16 v18, 0x40000000    # 2.0f

    .line 431
    .line 432
    const/high16 v13, 0x41c00000    # 24.0f

    .line 433
    .line 434
    const v14, 0x4087ae14    # 4.24f

    .line 435
    .line 436
    .line 437
    const v15, 0x41ae147b    # 21.76f

    .line 438
    .line 439
    .line 440
    const/high16 v16, 0x40000000    # 2.0f

    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x419c0000    # 19.5f

    .line 449
    .line 450
    const/high16 v2, 0x40c00000    # 6.0f

    .line 451
    .line 452
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, -0x40000000    # -2.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, -0x3fcae148    # -2.83f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40000000    # 2.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x419c0000    # 19.5f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41680000    # 14.5f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x411ab852    # 9.67f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40000000    # 2.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41680000    # 14.5f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41180000    # 9.5f

    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, -0x40000000    # -2.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x409570a4    # 4.67f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x40000000    # 2.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41180000    # 9.5f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x418c0000    # 17.5f

    .line 538
    .line 539
    const/high16 v2, 0x41200000    # 10.0f

    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, -0x40000000    # -2.0f

    .line 545
    .line 546
    const/high16 v2, 0x40000000    # 2.0f

    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x3fcae148    # -2.83f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x40000000    # -2.0f

    .line 558
    .line 559
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x418c0000    # 17.5f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x41480000    # 12.5f

    .line 571
    .line 572
    const/high16 v2, 0x41200000    # 10.0f

    .line 573
    .line 574
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, -0x40000000    # -2.0f

    .line 578
    .line 579
    const/high16 v2, 0x40000000    # 2.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x3fcae148    # -2.83f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, -0x40000000    # -2.0f

    .line 591
    .line 592
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x41480000    # 12.5f

    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x40f00000    # 7.5f

    .line 604
    .line 605
    const/high16 v2, 0x41200000    # 10.0f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, -0x40000000    # -2.0f

    .line 611
    .line 612
    const/high16 v2, 0x40000000    # 2.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, 0x40d570a4    # 6.67f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, -0x40000000    # -2.0f

    .line 624
    .line 625
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40f00000    # 7.5f

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41980000    # 19.0f

    .line 637
    .line 638
    const/high16 v2, 0x41200000    # 10.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 644
    .line 645
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 646
    .line 647
    const v13, -0x402b851f    # -1.66f

    .line 648
    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 652
    .line 653
    const v16, -0x40547ae1    # -1.34f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 660
    .line 661
    const v2, 0x3fab851f    # 1.34f

    .line 662
    .line 663
    .line 664
    const/high16 v4, 0x40400000    # 3.0f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x3fab851f    # 1.34f

    .line 670
    .line 671
    .line 672
    const/high16 v2, 0x40400000    # 3.0f

    .line 673
    .line 674
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x41a547ae    # 20.66f

    .line 678
    .line 679
    .line 680
    const/high16 v2, 0x41980000    # 19.0f

    .line 681
    .line 682
    const/high16 v4, 0x41200000    # 10.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/16 v16, 0x3800

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v12, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const/4 v15, 0x0

    .line 705
    const-string v4, ""

    .line 706
    .line 707
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    sput-object v0, Landroidx/compose/material/icons/sharp/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    return-object v0
.end method

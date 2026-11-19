.class public final Landroidx/compose/material/icons/rounded/ScreenRotationAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _screenRotationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenRotationAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScreenRotationAltKt;->_screenRotationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScreenRotationAlt"

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
    const v4, 0x4114a3d7    # 9.29f

    .line 71
    .line 72
    .line 73
    const v6, 0x41943d71    # 18.53f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x418e8f5c    # 17.82f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x41300000    # 11.0f

    .line 83
    .line 84
    const v21, 0x419947ae    # 19.16f

    .line 85
    .line 86
    .line 87
    const v22, 0x411eb852    # 9.92f

    .line 88
    .line 89
    .line 90
    const v23, 0x4195ae14    # 18.71f

    .line 91
    .line 92
    .line 93
    const/high16 v24, 0x41300000    # 11.0f

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x40ca3d71    # -0.71f

    .line 101
    .line 102
    .line 103
    const v26, -0x416b851f    # -0.29f

    .line 104
    .line 105
    .line 106
    const v21, -0x4175c28f    # -0.27f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const v23, -0x40fae148    # -0.52f

    .line 112
    .line 113
    .line 114
    const v24, -0x421eb852    # -0.11f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x41266666    # 10.4f

    .line 121
    .line 122
    .line 123
    const/high16 v6, 0x40800000    # 4.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x40ad1eb8    # 5.41f

    .line 129
    .line 130
    .line 131
    const/high16 v6, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x40e00000    # 7.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/high16 v26, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const v21, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const/high16 v23, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const v24, 0x3ee66666    # 0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, -0x4119999a    # -0.45f

    .line 157
    .line 158
    .line 159
    const/high16 v6, -0x40800000    # -1.0f

    .line 160
    .line 161
    const/high16 v7, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40400000    # 3.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, -0x40800000    # -1.0f

    .line 172
    .line 173
    const/high16 v26, -0x40800000    # -1.0f

    .line 174
    .line 175
    const v21, -0x40f33333    # -0.55f

    .line 176
    .line 177
    .line 178
    const/high16 v23, -0x40800000    # -1.0f

    .line 179
    .line 180
    const v24, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40c00000    # 6.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, -0x40f33333    # -0.55f

    .line 196
    .line 197
    .line 198
    const v23, 0x3ee66666    # 0.45f

    .line 199
    .line 200
    .line 201
    const/high16 v24, -0x40800000    # -1.0f

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    const/high16 v6, 0x3f800000    # 1.0f

    .line 210
    .line 211
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x3fcb851f    # 1.59f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x40a00000    # 5.0f

    .line 221
    .line 222
    const/high16 v6, -0x3f600000    # -5.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x40351eb8    # 2.83f

    .line 228
    .line 229
    .line 230
    const/16 v26, 0x0

    .line 231
    .line 232
    const v21, 0x3f47ae14    # 0.78f

    .line 233
    .line 234
    .line 235
    const v22, -0x40b851ec    # -0.78f

    .line 236
    .line 237
    .line 238
    const v23, 0x40033333    # 2.05f

    .line 239
    .line 240
    .line 241
    const v24, -0x40b851ec    # -0.78f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x4114a3d7    # 9.29f

    .line 248
    .line 249
    .line 250
    const v6, 0x41943d71    # 18.53f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const/16 v16, 0x3800

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const/high16 v6, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v8, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const/high16 v9, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/high16 v12, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const/4 v14, 0x0

    .line 278
    const/4 v15, 0x0

    .line 279
    const-string v4, ""

    .line 280
    .line 281
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 282
    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 289
    .line 290
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 291
    .line 292
    .line 293
    move-result-wide v6

    .line 294
    const/4 v0, 0x0

    .line 295
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 303
    .line 304
    .line 305
    move-result v11

    .line 306
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    const v0, 0x416b5c29    # 14.71f

    .line 312
    .line 313
    .line 314
    const v2, 0x40af0a3d    # 5.47f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x40c5c28f    # 6.18f

    .line 321
    .line 322
    .line 323
    const/high16 v18, 0x41500000    # 13.0f

    .line 324
    .line 325
    const v13, 0x409ae148    # 4.84f

    .line 326
    .line 327
    .line 328
    const v14, 0x416147ae    # 14.08f

    .line 329
    .line 330
    .line 331
    const v15, 0x40a947ae    # 5.29f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x41500000    # 13.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f35c28f    # 0.71f

    .line 340
    .line 341
    .line 342
    const v18, 0x3e947ae1    # 0.29f

    .line 343
    .line 344
    .line 345
    const v13, 0x3e8a3d71    # 0.27f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const v15, 0x3f051eb8    # 0.52f

    .line 350
    .line 351
    .line 352
    const v16, 0x3de147ae    # 0.11f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x4159999a    # 13.6f

    .line 359
    .line 360
    .line 361
    const/high16 v2, 0x41a00000    # 20.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x409fae14    # 4.99f

    .line 367
    .line 368
    .line 369
    const/high16 v2, -0x3f600000    # -5.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41880000    # 17.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, -0x40800000    # -1.0f

    .line 380
    .line 381
    const/high16 v18, -0x40800000    # -1.0f

    .line 382
    .line 383
    const v13, -0x40f33333    # -0.55f

    .line 384
    .line 385
    .line 386
    const/high16 v15, -0x40800000    # -1.0f

    .line 387
    .line 388
    const v16, -0x4119999a    # -0.45f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x3ee66666    # 0.45f

    .line 395
    .line 396
    .line 397
    const/high16 v2, -0x40800000    # -1.0f

    .line 398
    .line 399
    const/high16 v4, 0x3f800000    # 1.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x40800000    # 4.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v18, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const v13, 0x3f0ccccd    # 0.55f

    .line 414
    .line 415
    .line 416
    const/high16 v15, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const v16, 0x3ee66666    # 0.45f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, -0x40800000    # -1.0f

    .line 428
    .line 429
    const/4 v13, 0x0

    .line 430
    const v14, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const v15, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x3f800000    # 1.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x4119999a    # -0.45f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x40347ae1    # -1.59f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40a00000    # 5.0f

    .line 454
    .line 455
    const/high16 v2, -0x3f600000    # -5.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x3fcae148    # -2.83f

    .line 461
    .line 462
    .line 463
    const/16 v18, 0x0

    .line 464
    .line 465
    const v13, -0x40b851ec    # -0.78f

    .line 466
    .line 467
    .line 468
    const v14, 0x3f47ae14    # 0.78f

    .line 469
    .line 470
    .line 471
    const v15, -0x3ffccccd    # -2.05f

    .line 472
    .line 473
    .line 474
    const v16, 0x3f47ae14    # 0.78f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x416b5c29    # 14.71f

    .line 481
    .line 482
    .line 483
    const v2, 0x40af0a3d    # 5.47f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    const/16 v16, 0x3800

    .line 497
    .line 498
    const/16 v17, 0x0

    .line 499
    .line 500
    const/high16 v6, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    const/4 v15, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/rounded/ScreenRotationAltKt;->_screenRotationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method

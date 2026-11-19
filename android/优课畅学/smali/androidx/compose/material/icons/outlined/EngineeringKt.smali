.class public final Landroidx/compose/material/icons/outlined/EngineeringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _engineering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEngineering(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Engineering"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3fd51eb8    # -2.67f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x3fab851f    # 1.34f

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41800000    # 16.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41100000    # 9.0f

    .line 112
    .line 113
    const/high16 v26, 0x41700000    # 15.0f

    .line 114
    .line 115
    const/high16 v21, 0x41880000    # 17.0f

    .line 116
    .line 117
    const v22, 0x4182b852    # 16.34f

    .line 118
    .line 119
    .line 120
    const v23, 0x413ab852    # 11.67f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x41700000    # 15.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41980000    # 19.0f

    .line 132
    .line 133
    const/high16 v6, 0x40400000    # 3.0f

    .line 134
    .line 135
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x40c00000    # 6.0f

    .line 139
    .line 140
    const/high16 v26, -0x40000000    # -2.0f

    .line 141
    .line 142
    const v21, 0x3e6147ae    # 0.22f

    .line 143
    .line 144
    .line 145
    const v22, -0x40c7ae14    # -0.72f

    .line 146
    .line 147
    .line 148
    const v23, 0x4053d70a    # 3.31f

    .line 149
    .line 150
    .line 151
    const/high16 v24, -0x40000000    # -2.0f

    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v26, 0x40000000    # 2.0f

    .line 157
    .line 158
    const v21, 0x402ccccd    # 2.7f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const v23, 0x40b9999a    # 5.8f

    .line 164
    .line 165
    .line 166
    const v24, 0x3fa51eb8    # 1.29f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x40400000    # 3.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const/16 v16, 0x3800

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v8, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const/high16 v9, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v12, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    const-string v4, ""

    .line 201
    .line 202
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    const/4 v2, 0x0

    .line 216
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const v4, 0x4097ae14    # 4.74f

    .line 233
    .line 234
    .line 235
    const/high16 v6, 0x41100000    # 9.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x40a00000    # 5.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, 0x40800000    # 4.0f

    .line 246
    .line 247
    const/high16 v26, 0x40800000    # 4.0f

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const v22, 0x400d70a4    # 2.21f

    .line 252
    .line 253
    .line 254
    const v23, 0x3fe51eb8    # 1.79f

    .line 255
    .line 256
    .line 257
    const/high16 v24, 0x40800000    # 4.0f

    .line 258
    .line 259
    move-object/from16 v20, v2

    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, -0x401ae148    # -1.79f

    .line 265
    .line 266
    .line 267
    const/high16 v6, -0x3f800000    # -4.0f

    .line 268
    .line 269
    const/high16 v7, 0x40800000    # 4.0f

    .line 270
    .line 271
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, 0x3e851eb8    # 0.26f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, 0x3efae148    # 0.49f

    .line 281
    .line 282
    .line 283
    const v26, -0x41051eb8    # -0.49f

    .line 284
    .line 285
    .line 286
    const v21, 0x3e8a3d71    # 0.27f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const v23, 0x3efae148    # 0.49f

    .line 292
    .line 293
    .line 294
    const v24, -0x419eb852    # -0.22f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x4107d70a    # 8.49f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v25, -0x41051eb8    # -0.49f

    .line 307
    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const v22, -0x4175c28f    # -0.27f

    .line 312
    .line 313
    .line 314
    const v23, -0x419eb852    # -0.22f

    .line 315
    .line 316
    .line 317
    const v24, -0x41051eb8    # -0.49f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x41500000    # 13.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v25, -0x40000000    # -2.0f

    .line 329
    .line 330
    const v26, -0x3fa33333    # -3.45f

    .line 331
    .line 332
    .line 333
    const v22, -0x40428f5c    # -1.48f

    .line 334
    .line 335
    .line 336
    const v23, -0x40b0a3d7    # -0.81f

    .line 337
    .line 338
    .line 339
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x40b00000    # 5.5f

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, 0x41280000    # 10.5f

    .line 350
    .line 351
    const/high16 v26, 0x40c00000    # 6.0f

    .line 352
    .line 353
    const/high16 v21, 0x41300000    # 11.0f

    .line 354
    .line 355
    const v22, 0x40b8f5c3    # 5.78f

    .line 356
    .line 357
    .line 358
    const v23, 0x412c7ae1    # 10.78f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x40c00000    # 6.0f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x40b8f5c3    # 5.78f

    .line 367
    .line 368
    .line 369
    const/high16 v6, 0x41200000    # 10.0f

    .line 370
    .line 371
    const/high16 v7, 0x40b00000    # 5.5f

    .line 372
    .line 373
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v4, 0x40847ae1    # 4.14f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, 0x41100000    # 9.0f

    .line 383
    .line 384
    const/high16 v26, 0x40800000    # 4.0f

    .line 385
    .line 386
    const v21, 0x411ae148    # 9.68f

    .line 387
    .line 388
    .line 389
    const v22, 0x4081eb85    # 4.06f

    .line 390
    .line 391
    .line 392
    const v23, 0x4115999a    # 9.35f

    .line 393
    .line 394
    .line 395
    const/high16 v24, 0x40800000    # 4.0f

    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, 0x4081eb85    # 4.06f

    .line 401
    .line 402
    .line 403
    const/high16 v6, 0x41000000    # 8.0f

    .line 404
    .line 405
    const v7, 0x40847ae1    # 4.14f

    .line 406
    .line 407
    .line 408
    const v8, 0x41051eb8    # 8.32f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x40b00000    # 5.5f

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x40f00000    # 7.5f

    .line 420
    .line 421
    const/high16 v26, 0x40c00000    # 6.0f

    .line 422
    .line 423
    const/high16 v21, 0x41000000    # 8.0f

    .line 424
    .line 425
    const v22, 0x40b8f5c3    # 5.78f

    .line 426
    .line 427
    .line 428
    const v23, 0x40f8f5c3    # 7.78f

    .line 429
    .line 430
    .line 431
    const/high16 v24, 0x40c00000    # 6.0f

    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x40e00000    # 7.0f

    .line 437
    .line 438
    const v6, 0x40b8f5c3    # 5.78f

    .line 439
    .line 440
    .line 441
    const/high16 v7, 0x40b00000    # 5.5f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v4, 0x4091999a    # 4.55f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v25, 0x40a00000    # 5.0f

    .line 453
    .line 454
    const/high16 v26, 0x41000000    # 8.0f

    .line 455
    .line 456
    const v21, 0x40b9eb85    # 5.81f

    .line 457
    .line 458
    .line 459
    const/high16 v22, 0x40a80000    # 5.25f

    .line 460
    .line 461
    const/high16 v23, 0x40a00000    # 5.0f

    .line 462
    .line 463
    const v24, 0x40d0a3d7    # 6.52f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v4, 0x4097ae14    # 4.74f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x40880000    # 4.25f

    .line 476
    .line 477
    const v26, 0x4107d70a    # 8.49f

    .line 478
    .line 479
    .line 480
    const v21, 0x408f0a3d    # 4.47f

    .line 481
    .line 482
    .line 483
    const/high16 v22, 0x41000000    # 8.0f

    .line 484
    .line 485
    const/high16 v23, 0x40880000    # 4.25f

    .line 486
    .line 487
    const v24, 0x4103851f    # 8.22f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v4, 0x3cf5c28f    # 0.03f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v25, 0x4097ae14    # 4.74f

    .line 500
    .line 501
    .line 502
    const/high16 v26, 0x41100000    # 9.0f

    .line 503
    .line 504
    const/high16 v21, 0x40880000    # 4.25f

    .line 505
    .line 506
    const v22, 0x410c7ae1    # 8.78f

    .line 507
    .line 508
    .line 509
    const v23, 0x408f0a3d    # 4.47f

    .line 510
    .line 511
    .line 512
    const/high16 v24, 0x41100000    # 9.0f

    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x41300000    # 11.0f

    .line 521
    .line 522
    const/high16 v6, 0x41100000    # 9.0f

    .line 523
    .line 524
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v25, -0x40000000    # -2.0f

    .line 528
    .line 529
    const/high16 v26, 0x40000000    # 2.0f

    .line 530
    .line 531
    const/16 v21, 0x0

    .line 532
    .line 533
    const v22, 0x3f8ccccd    # 1.1f

    .line 534
    .line 535
    .line 536
    const v23, -0x4099999a    # -0.9f

    .line 537
    .line 538
    .line 539
    const/high16 v24, 0x40000000    # 2.0f

    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v4, -0x4099999a    # -0.9f

    .line 545
    .line 546
    .line 547
    const/high16 v6, -0x40000000    # -2.0f

    .line 548
    .line 549
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v4, 0x41300000    # 11.0f

    .line 553
    .line 554
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    const/high16 v6, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v8, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v7, 0x0

    .line 569
    const-string v4, ""

    .line 570
    .line 571
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 572
    .line 573
    .line 574
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 579
    .line 580
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 581
    .line 582
    .line 583
    move-result-wide v6

    .line 584
    const/4 v2, 0x0

    .line 585
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 589
    .line 590
    .line 591
    move-result v10

    .line 592
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 593
    .line 594
    .line 595
    move-result v11

    .line 596
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 599
    .line 600
    .line 601
    const v4, 0x41afd70a    # 21.98f

    .line 602
    .line 603
    .line 604
    const v6, 0x40c75c29    # 6.23f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v4, -0x40ab851f    # -0.83f

    .line 611
    .line 612
    .line 613
    const v6, 0x3f6e147b    # 0.93f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v4, -0x4059999a    # -1.3f

    .line 620
    .line 621
    .line 622
    const/high16 v6, -0x40c00000    # -0.75f

    .line 623
    .line 624
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v4, -0x4067ae14    # -1.19f

    .line 628
    .line 629
    .line 630
    const v6, 0x3ec7ae14    # 0.39f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v25, -0x410f5c29    # -0.47f

    .line 637
    .line 638
    .line 639
    const v26, -0x4175c28f    # -0.27f

    .line 640
    .line 641
    .line 642
    const v21, -0x41f0a3d7    # -0.14f

    .line 643
    .line 644
    .line 645
    const v22, -0x421eb852    # -0.11f

    .line 646
    .line 647
    .line 648
    const v23, -0x41666666    # -0.3f

    .line 649
    .line 650
    .line 651
    const v24, -0x41b33333    # -0.2f

    .line 652
    .line 653
    .line 654
    move-object/from16 v20, v2

    .line 655
    .line 656
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v4, 0x41a20000    # 20.25f

    .line 660
    .line 661
    const/high16 v6, 0x40400000    # 3.0f

    .line 662
    .line 663
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v4, -0x40400000    # -1.5f

    .line 667
    .line 668
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v4, 0x41940000    # 18.5f

    .line 672
    .line 673
    const v6, 0x40870a3d    # 4.22f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v25, -0x410a3d71    # -0.48f

    .line 680
    .line 681
    .line 682
    const v26, 0x3e8a3d71    # 0.27f

    .line 683
    .line 684
    .line 685
    const v21, -0x41d1eb85    # -0.17f

    .line 686
    .line 687
    .line 688
    const v22, 0x3d8f5c29    # 0.07f

    .line 689
    .line 690
    .line 691
    const v23, -0x41570a3d    # -0.33f

    .line 692
    .line 693
    .line 694
    const v24, 0x3e23d70a    # 0.16f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x4186b852    # 16.84f

    .line 701
    .line 702
    .line 703
    const v6, 0x40833333    # 4.1f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v4, 0x3fa66666    # 1.3f

    .line 710
    .line 711
    .line 712
    const/high16 v6, -0x40c00000    # -0.75f

    .line 713
    .line 714
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v4, 0x3f547ae1    # 0.83f

    .line 718
    .line 719
    .line 720
    const v6, 0x3f6e147b    # 0.93f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v25, 0x418828f6    # 17.02f

    .line 727
    .line 728
    .line 729
    const/high16 v26, 0x40d80000    # 6.75f

    .line 730
    .line 731
    const/high16 v21, 0x41880000    # 17.0f

    .line 732
    .line 733
    const v22, 0x40cccccd    # 6.4f

    .line 734
    .line 735
    .line 736
    const/high16 v23, 0x41880000    # 17.0f

    .line 737
    .line 738
    const v24, 0x40d28f5c    # 6.58f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v4, 0x4180b852    # 16.09f

    .line 745
    .line 746
    .line 747
    const v6, 0x40f33333    # 7.6f

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v4, 0x3f400000    # 0.75f

    .line 754
    .line 755
    const v6, 0x3fa66666    # 1.3f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v4, 0x3f99999a    # 1.2f

    .line 762
    .line 763
    .line 764
    const v6, -0x413d70a4    # -0.38f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v25, 0x3edc28f6    # 0.43f

    .line 771
    .line 772
    .line 773
    const/high16 v26, 0x3e800000    # 0.25f

    .line 774
    .line 775
    const v21, 0x3e051eb8    # 0.13f

    .line 776
    .line 777
    .line 778
    const v22, 0x3dcccccd    # 0.1f

    .line 779
    .line 780
    .line 781
    const v23, 0x3e8f5c29    # 0.28f

    .line 782
    .line 783
    .line 784
    const v24, 0x3e3851ec    # 0.18f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v4, 0x41960000    # 18.75f

    .line 791
    .line 792
    const/high16 v6, 0x41200000    # 10.0f

    .line 793
    .line 794
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 798
    .line 799
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v4, 0x3e8a3d71    # 0.27f

    .line 803
    .line 804
    .line 805
    const v6, -0x4063d70a    # -1.22f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v25, 0x3ee147ae    # 0.44f

    .line 812
    .line 813
    .line 814
    const/high16 v26, -0x41800000    # -0.25f

    .line 815
    .line 816
    const v21, 0x3e23d70a    # 0.16f

    .line 817
    .line 818
    .line 819
    const v22, -0x4270a3d7    # -0.07f

    .line 820
    .line 821
    .line 822
    const v23, 0x3e99999a    # 0.3f

    .line 823
    .line 824
    .line 825
    const v24, -0x41e66666    # -0.15f

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v4, 0x3f9851ec    # 1.19f

    .line 832
    .line 833
    .line 834
    const v6, 0x3ec28f5c    # 0.38f

    .line 835
    .line 836
    .line 837
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v4, 0x3f400000    # 0.75f

    .line 841
    .line 842
    const v6, -0x4059999a    # -1.3f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v4, -0x4091eb85    # -0.93f

    .line 849
    .line 850
    .line 851
    const v6, -0x40a66666    # -0.85f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v25, 0x41afd70a    # 21.98f

    .line 858
    .line 859
    .line 860
    const v26, 0x40c75c29    # 6.23f

    .line 861
    .line 862
    .line 863
    const/high16 v21, 0x41b00000    # 22.0f

    .line 864
    .line 865
    const v22, 0x40d23d71    # 6.57f

    .line 866
    .line 867
    .line 868
    const v23, 0x41afeb85    # 21.99f

    .line 869
    .line 870
    .line 871
    const v24, 0x40cccccd    # 6.4f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v4, 0x419c0000    # 19.5f

    .line 881
    .line 882
    const/high16 v6, 0x40f80000    # 7.75f

    .line 883
    .line 884
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v25, -0x40600000    # -1.25f

    .line 888
    .line 889
    const/high16 v26, -0x40600000    # -1.25f

    .line 890
    .line 891
    const v21, -0x40cf5c29    # -0.69f

    .line 892
    .line 893
    .line 894
    const/16 v22, 0x0

    .line 895
    .line 896
    const/high16 v23, -0x40600000    # -1.25f

    .line 897
    .line 898
    const v24, -0x40f0a3d7    # -0.56f

    .line 899
    .line 900
    .line 901
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/high16 v4, -0x40600000    # -1.25f

    .line 905
    .line 906
    const/high16 v6, -0x40600000    # -1.25f

    .line 907
    .line 908
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 909
    .line 910
    const v8, 0x3f0f5c29    # 0.56f

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v4, 0x3f0f5c29    # 0.56f

    .line 917
    .line 918
    .line 919
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 920
    .line 921
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v4, 0x41a1851f    # 20.19f

    .line 925
    .line 926
    .line 927
    const/high16 v6, 0x419c0000    # 19.5f

    .line 928
    .line 929
    const/high16 v7, 0x40f80000    # 7.75f

    .line 930
    .line 931
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    const/high16 v6, 0x3f800000    # 1.0f

    .line 942
    .line 943
    const/high16 v8, 0x3f800000    # 1.0f

    .line 944
    .line 945
    const/4 v7, 0x0

    .line 946
    const-string v4, ""

    .line 947
    .line 948
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 949
    .line 950
    .line 951
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 952
    .line 953
    .line 954
    move-result v3

    .line 955
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 956
    .line 957
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 958
    .line 959
    .line 960
    move-result-wide v6

    .line 961
    const/4 v0, 0x0

    .line 962
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 966
    .line 967
    .line 968
    move-result v10

    .line 969
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 970
    .line 971
    .line 972
    move-result v11

    .line 973
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 976
    .line 977
    .line 978
    const v0, 0x419b3333    # 19.4f

    .line 979
    .line 980
    .line 981
    const v2, 0x412ca3d7    # 10.79f

    .line 982
    .line 983
    .line 984
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const v0, -0x40a66666    # -0.85f

    .line 988
    .line 989
    .line 990
    const v2, 0x3e8f5c29    # 0.28f

    .line 991
    .line 992
    .line 993
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, -0x41570a3d    # -0.33f

    .line 997
    .line 998
    .line 999
    const v18, -0x41bd70a4    # -0.19f

    .line 1000
    .line 1001
    .line 1002
    const v13, -0x42333333    # -0.1f

    .line 1003
    .line 1004
    .line 1005
    const v14, -0x425c28f6    # -0.08f

    .line 1006
    .line 1007
    .line 1008
    const v15, -0x41a8f5c3    # -0.21f

    .line 1009
    .line 1010
    .line 1011
    const v16, -0x41f0a3d7    # -0.14f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v0, 0x419051ec    # 18.04f

    .line 1018
    .line 1019
    .line 1020
    const/high16 v2, 0x41200000    # 10.0f

    .line 1021
    .line 1022
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v0, -0x40770a3d    # -1.07f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, -0x41c7ae14    # -0.18f

    .line 1032
    .line 1033
    .line 1034
    const v2, 0x3f5eb852    # 0.87f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const v17, -0x4151eb85    # -0.34f

    .line 1041
    .line 1042
    .line 1043
    const v18, 0x3e428f5c    # 0.19f

    .line 1044
    .line 1045
    .line 1046
    const v13, -0x420a3d71    # -0.12f

    .line 1047
    .line 1048
    .line 1049
    const v14, 0x3d4ccccd    # 0.05f

    .line 1050
    .line 1051
    .line 1052
    const v15, -0x418a3d71    # -0.24f

    .line 1053
    .line 1054
    .line 1055
    const v16, 0x3df5c28f    # 0.12f

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    const v0, -0x40a8f5c3    # -0.84f

    .line 1062
    .line 1063
    .line 1064
    const v2, -0x4170a3d7    # -0.28f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v0, -0x40f5c28f    # -0.54f

    .line 1071
    .line 1072
    .line 1073
    const v2, 0x3f6e147b    # 0.93f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v0, 0x3f28f5c3    # 0.66f

    .line 1080
    .line 1081
    .line 1082
    const v2, 0x3f170a3d    # 0.59f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const/16 v17, 0x0

    .line 1089
    .line 1090
    const v18, 0x3ebd70a4    # 0.37f

    .line 1091
    .line 1092
    .line 1093
    const v13, -0x43dc28f6    # -0.01f

    .line 1094
    .line 1095
    .line 1096
    const v14, 0x3e051eb8    # 0.13f

    .line 1097
    .line 1098
    .line 1099
    const v15, -0x43dc28f6    # -0.01f

    .line 1100
    .line 1101
    .line 1102
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1103
    .line 1104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v0, -0x40d70a3d    # -0.66f

    .line 1108
    .line 1109
    .line 1110
    const v2, 0x3f1c28f6    # 0.61f

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    const v0, 0x3f0a3d71    # 0.54f

    .line 1117
    .line 1118
    .line 1119
    const v2, 0x3f6e147b    # 0.93f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v0, 0x3f5c28f6    # 0.86f

    .line 1126
    .line 1127
    .line 1128
    const v2, -0x4175c28f    # -0.27f

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const v17, 0x3e9eb852    # 0.31f

    .line 1135
    .line 1136
    .line 1137
    const v18, 0x3e3851ec    # 0.18f

    .line 1138
    .line 1139
    .line 1140
    const v13, 0x3dcccccd    # 0.1f

    .line 1141
    .line 1142
    .line 1143
    const v14, 0x3d8f5c29    # 0.07f

    .line 1144
    .line 1145
    .line 1146
    const v15, 0x3e4ccccd    # 0.2f

    .line 1147
    .line 1148
    .line 1149
    const v16, 0x3e051eb8    # 0.13f

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const v0, 0x4187ae14    # 16.96f

    .line 1156
    .line 1157
    .line 1158
    const/high16 v2, 0x41700000    # 15.0f

    .line 1159
    .line 1160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v0, 0x3f88f5c3    # 1.07f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const v0, 0x3e428f5c    # 0.19f

    .line 1170
    .line 1171
    .line 1172
    const v2, -0x40a147ae    # -0.87f

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v17, 0x3ea3d70a    # 0.32f

    .line 1179
    .line 1180
    .line 1181
    const v18, -0x41c7ae14    # -0.18f

    .line 1182
    .line 1183
    .line 1184
    const v13, 0x3de147ae    # 0.11f

    .line 1185
    .line 1186
    .line 1187
    const v14, -0x42b33333    # -0.05f

    .line 1188
    .line 1189
    .line 1190
    const v15, 0x3e6147ae    # 0.22f

    .line 1191
    .line 1192
    .line 1193
    const v16, -0x421eb852    # -0.11f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v0, 0x3f59999a    # 0.85f

    .line 1200
    .line 1201
    .line 1202
    const v2, 0x3e8a3d71    # 0.27f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v0, 0x3f0a3d71    # 0.54f

    .line 1209
    .line 1210
    .line 1211
    const v2, -0x4091eb85    # -0.93f

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    .line 1217
    const v0, -0x40d70a3d    # -0.66f

    .line 1218
    .line 1219
    .line 1220
    const v2, -0x40e3d70a    # -0.61f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const/16 v17, 0x0

    .line 1227
    .line 1228
    const v18, -0x41428f5c    # -0.37f

    .line 1229
    .line 1230
    .line 1231
    const v13, 0x3c23d70a    # 0.01f

    .line 1232
    .line 1233
    .line 1234
    const v14, -0x41fae148    # -0.13f

    .line 1235
    .line 1236
    .line 1237
    const v15, 0x3c23d70a    # 0.01f

    .line 1238
    .line 1239
    .line 1240
    const/high16 v16, -0x41800000    # -0.25f

    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const v0, 0x3f28f5c3    # 0.66f

    .line 1246
    .line 1247
    .line 1248
    const v2, -0x40e8f5c3    # -0.59f

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1252
    .line 1253
    .line 1254
    const v0, 0x419b3333    # 19.4f

    .line 1255
    .line 1256
    .line 1257
    const v2, 0x412ca3d7    # 10.79f

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1267
    .line 1268
    const v2, 0x41563d71    # 13.39f

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1272
    .line 1273
    .line 1274
    const v17, -0x409c28f6    # -0.89f

    .line 1275
    .line 1276
    .line 1277
    const v18, -0x409c28f6    # -0.89f

    .line 1278
    .line 1279
    .line 1280
    const v13, -0x41051eb8    # -0.49f

    .line 1281
    .line 1282
    .line 1283
    const/4 v14, 0x0

    .line 1284
    const v15, -0x409c28f6    # -0.89f

    .line 1285
    .line 1286
    .line 1287
    const v16, -0x41333333    # -0.4f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, 0x3f63d70a    # 0.89f

    .line 1294
    .line 1295
    .line 1296
    const/4 v13, 0x0

    .line 1297
    const v14, -0x41051eb8    # -0.49f

    .line 1298
    .line 1299
    .line 1300
    const v15, 0x3ecccccd    # 0.4f

    .line 1301
    .line 1302
    .line 1303
    const v16, -0x409c28f6    # -0.89f

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const v0, 0x3ecccccd    # 0.4f

    .line 1310
    .line 1311
    .line 1312
    const v2, 0x3f63d70a    # 0.89f

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1316
    .line 1317
    .line 1318
    const/high16 v17, 0x418c0000    # 17.5f

    .line 1319
    .line 1320
    const v18, 0x41563d71    # 13.39f

    .line 1321
    .line 1322
    .line 1323
    const v13, 0x41931eb8    # 18.39f

    .line 1324
    .line 1325
    .line 1326
    const v14, 0x414fd70a    # 12.99f

    .line 1327
    .line 1328
    .line 1329
    const v15, 0x418feb85    # 17.99f

    .line 1330
    .line 1331
    .line 1332
    const v16, 0x41563d71    # 13.39f

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    const/16 v16, 0x3800

    .line 1346
    .line 1347
    const/16 v17, 0x0

    .line 1348
    .line 1349
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1350
    .line 1351
    const/4 v7, 0x0

    .line 1352
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1353
    .line 1354
    const/4 v13, 0x0

    .line 1355
    const/4 v14, 0x0

    .line 1356
    const/4 v15, 0x0

    .line 1357
    const-string v4, ""

    .line 1358
    .line 1359
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    sput-object v0, Landroidx/compose/material/icons/outlined/EngineeringKt;->_engineering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1368
    .line 1369
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1370
    .line 1371
    .line 1372
    return-object v0
.end method

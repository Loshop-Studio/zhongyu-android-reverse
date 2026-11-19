.class public final Landroidx/compose/material/icons/twotone/WifiFindKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiFind:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiFind(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WifiFindKt;->_wifiFind:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WifiFind"

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
    const v4, 0x41263d71    # 10.39f

    .line 71
    .line 72
    .line 73
    const v6, 0x41b4b852    # 22.59f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x410fae14    # 8.98f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41c00000    # 24.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v26, 0x40800000    # 4.0f

    .line 90
    .line 91
    const v21, 0x41a770a4    # 20.93f

    .line 92
    .line 93
    .line 94
    const v22, 0x40bccccd    # 5.9f

    .line 95
    .line 96
    .line 97
    const v23, 0x4185851f    # 16.69f

    .line 98
    .line 99
    .line 100
    const/high16 v24, 0x40800000    # 4.0f

    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/16 v25, 0x0

    .line 108
    .line 109
    const v26, 0x410fae14    # 8.98f

    .line 110
    .line 111
    .line 112
    const v21, 0x40e9eb85    # 7.31f

    .line 113
    .line 114
    .line 115
    const/high16 v22, 0x40800000    # 4.0f

    .line 116
    .line 117
    const v23, 0x40447ae1    # 3.07f

    .line 118
    .line 119
    .line 120
    const v24, 0x40bccccd    # 5.9f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41400000    # 12.0f

    .line 127
    .line 128
    const/high16 v6, 0x41a80000    # 21.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x3fb47ae1    # 1.41f

    .line 134
    .line 135
    .line 136
    const v6, -0x404a3d71    # -1.42f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x403b851f    # 2.93f

    .line 143
    .line 144
    .line 145
    const v6, 0x411147ae    # 9.08f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, 0x41400000    # 12.0f

    .line 152
    .line 153
    const/high16 v26, 0x40c00000    # 6.0f

    .line 154
    .line 155
    const v21, 0x40ae6666    # 5.45f

    .line 156
    .line 157
    .line 158
    const v22, 0x40e51eb8    # 7.16f

    .line 159
    .line 160
    .line 161
    const v23, 0x410970a4    # 8.59f

    .line 162
    .line 163
    .line 164
    const/high16 v24, 0x40c00000    # 6.0f

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v25, 0x41b4b852    # 22.59f

    .line 170
    .line 171
    .line 172
    const v26, 0x41263d71    # 10.39f

    .line 173
    .line 174
    .line 175
    const v21, 0x41810a3d    # 16.13f

    .line 176
    .line 177
    .line 178
    const/high16 v22, 0x40c00000    # 6.0f

    .line 179
    .line 180
    const v23, 0x419f0a3d    # 19.88f

    .line 181
    .line 182
    .line 183
    const v24, 0x40f5c28f    # 7.68f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v16, 0x3800

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/high16 v6, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/high16 v8, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/high16 v9, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/high16 v12, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const-string v4, ""

    .line 213
    .line 214
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 224
    .line 225
    .line 226
    move-result-wide v6

    .line 227
    const/4 v2, 0x0

    .line 228
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const v4, 0x4194b852    # 18.59f

    .line 245
    .line 246
    .line 247
    const/high16 v6, 0x41b80000    # 23.0f

    .line 248
    .line 249
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, -0x3fdc28f6    # -2.56f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41a80000    # 21.0f

    .line 259
    .line 260
    const/high16 v26, 0x41600000    # 14.0f

    .line 261
    .line 262
    const v21, 0x41a651ec    # 20.79f

    .line 263
    .line 264
    .line 265
    const v22, 0x41770a3d    # 15.44f

    .line 266
    .line 267
    .line 268
    const/high16 v23, 0x41a80000    # 21.0f

    .line 269
    .line 270
    const/high16 v24, 0x416c0000    # 14.75f

    .line 271
    .line 272
    move-object/from16 v20, v2

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, -0x3f800000    # -4.0f

    .line 278
    .line 279
    const/high16 v26, -0x3f800000    # -4.0f

    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const v22, -0x3ff0a3d7    # -2.24f

    .line 284
    .line 285
    .line 286
    const v23, -0x401eb852    # -1.76f

    .line 287
    .line 288
    .line 289
    const/high16 v24, -0x3f800000    # -4.0f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x3fe147ae    # 1.76f

    .line 295
    .line 296
    .line 297
    const/high16 v6, 0x40800000    # 4.0f

    .line 298
    .line 299
    const/high16 v7, -0x3f800000    # -4.0f

    .line 300
    .line 301
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v25, 0x40800000    # 4.0f

    .line 305
    .line 306
    const/high16 v26, 0x40800000    # 4.0f

    .line 307
    .line 308
    const v22, 0x400f5c29    # 2.24f

    .line 309
    .line 310
    .line 311
    const v23, 0x3fe147ae    # 1.76f

    .line 312
    .line 313
    .line 314
    const/high16 v24, 0x40800000    # 4.0f

    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x4001eb85    # 2.03f

    .line 320
    .line 321
    .line 322
    const v26, -0x40f0a3d7    # -0.56f

    .line 323
    .line 324
    .line 325
    const/high16 v21, 0x3f400000    # 0.75f

    .line 326
    .line 327
    const/16 v22, 0x0

    .line 328
    .line 329
    const v23, 0x3fb851ec    # 1.44f

    .line 330
    .line 331
    .line 332
    const v24, -0x41a8f5c3    # -0.21f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x41acb852    # 21.59f

    .line 339
    .line 340
    .line 341
    const/high16 v6, 0x41a00000    # 20.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x4194b852    # 18.59f

    .line 347
    .line 348
    .line 349
    const/high16 v6, 0x41b80000    # 23.0f

    .line 350
    .line 351
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, 0x41600000    # 14.0f

    .line 358
    .line 359
    const/high16 v6, 0x41700000    # 15.0f

    .line 360
    .line 361
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v25, 0x40000000    # 2.0f

    .line 365
    .line 366
    const/high16 v26, -0x40000000    # -2.0f

    .line 367
    .line 368
    const/16 v21, 0x0

    .line 369
    .line 370
    const v22, -0x4070a3d7    # -1.12f

    .line 371
    .line 372
    .line 373
    const v23, 0x3f6147ae    # 0.88f

    .line 374
    .line 375
    .line 376
    const/high16 v24, -0x40000000    # -2.0f

    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x3f6147ae    # 0.88f

    .line 382
    .line 383
    .line 384
    const/high16 v6, 0x40000000    # 2.0f

    .line 385
    .line 386
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v25, -0x40000000    # -2.0f

    .line 390
    .line 391
    const/high16 v26, 0x40000000    # 2.0f

    .line 392
    .line 393
    const v22, 0x3f8f5c29    # 1.12f

    .line 394
    .line 395
    .line 396
    const v23, -0x409eb852    # -0.88f

    .line 397
    .line 398
    .line 399
    const/high16 v24, 0x40000000    # 2.0f

    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, 0x4171eb85    # 15.12f

    .line 405
    .line 406
    .line 407
    const/high16 v6, 0x41600000    # 14.0f

    .line 408
    .line 409
    const/high16 v7, 0x41700000    # 15.0f

    .line 410
    .line 411
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/high16 v6, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/4 v7, 0x0

    .line 424
    const-string v4, ""

    .line 425
    .line 426
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 427
    .line 428
    .line 429
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 434
    .line 435
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 436
    .line 437
    .line 438
    move-result-wide v6

    .line 439
    const/4 v0, 0x0

    .line 440
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    const v0, 0x41263d71    # 10.39f

    .line 457
    .line 458
    .line 459
    const v2, 0x41b4b852    # 22.59f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41400000    # 12.0f

    .line 466
    .line 467
    const/high16 v18, 0x40c00000    # 6.0f

    .line 468
    .line 469
    const v13, 0x419f0a3d    # 19.88f

    .line 470
    .line 471
    .line 472
    const v14, 0x40f5c28f    # 7.68f

    .line 473
    .line 474
    .line 475
    const v15, 0x41810a3d    # 16.13f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x40c00000    # 6.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x403b851f    # 2.93f

    .line 484
    .line 485
    .line 486
    const v18, 0x411147ae    # 9.08f

    .line 487
    .line 488
    .line 489
    const v13, 0x410970a4    # 8.59f

    .line 490
    .line 491
    .line 492
    const/high16 v14, 0x40c00000    # 6.0f

    .line 493
    .line 494
    const v15, 0x40ae6666    # 5.45f

    .line 495
    .line 496
    .line 497
    const v16, 0x40e51eb8    # 7.16f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x4010a3d7    # 2.26f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x4103d70a    # 8.24f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x3eeb851f    # 0.46f

    .line 516
    .line 517
    .line 518
    const v2, -0x41147ae1    # -0.46f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x41300000    # 11.0f

    .line 525
    .line 526
    const/high16 v18, 0x41600000    # 14.0f

    .line 527
    .line 528
    const v13, 0x41426666    # 12.15f

    .line 529
    .line 530
    .line 531
    const v14, 0x4190b852    # 18.09f

    .line 532
    .line 533
    .line 534
    const/high16 v15, 0x41300000    # 11.0f

    .line 535
    .line 536
    const v16, 0x4181ae14    # 16.21f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 543
    .line 544
    const/high16 v18, -0x3f780000    # -4.25f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const v14, -0x4030a3d7    # -1.62f

    .line 548
    .line 549
    .line 550
    const v15, 0x3f1eb852    # 0.62f

    .line 551
    .line 552
    .line 553
    const v16, -0x3fb7ae14    # -3.13f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x4176147b    # 15.38f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x41880000    # 17.0f

    .line 563
    .line 564
    const/high16 v4, 0x41000000    # 8.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x40a428f6    # 5.13f

    .line 570
    .line 571
    .line 572
    const v18, 0x4038f5c3    # 2.89f

    .line 573
    .line 574
    .line 575
    const v13, 0x400d70a4    # 2.21f

    .line 576
    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const v15, 0x4082e148    # 4.09f

    .line 580
    .line 581
    .line 582
    const v16, 0x3f933333    # 1.15f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x3efae148    # 0.49f

    .line 589
    .line 590
    .line 591
    const v2, -0x41051eb8    # -0.49f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, -0x435c28f6    # -0.02f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x41263d71    # 10.39f

    .line 604
    .line 605
    .line 606
    const v2, 0x41b4b852    # 22.59f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    const/16 v16, 0x3800

    .line 620
    .line 621
    const/16 v17, 0x0

    .line 622
    .line 623
    const v6, 0x3e99999a    # 0.3f

    .line 624
    .line 625
    .line 626
    const v8, 0x3e99999a    # 0.3f

    .line 627
    .line 628
    .line 629
    const/4 v7, 0x0

    .line 630
    const/high16 v12, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const/4 v15, 0x0

    .line 634
    const-string v4, ""

    .line 635
    .line 636
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    sput-object v0, Landroidx/compose/material/icons/twotone/WifiFindKt;->_wifiFind:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    return-object v0
.end method

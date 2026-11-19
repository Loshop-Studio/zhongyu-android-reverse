.class public final Landroidx/compose/material/icons/rounded/BarChartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _barChart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBarChart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BarChartKt;->_barChart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BarChart"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, 0x40000000    # 2.0f

    .line 81
    .line 82
    const/high16 v26, -0x40000000    # -2.0f

    .line 83
    .line 84
    const v21, 0x3f8ccccd    # 1.1f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/high16 v23, 0x40000000    # 2.0f

    .line 90
    .line 91
    const v24, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, -0x3f200000    # -7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const v22, -0x40733333    # -1.1f

    .line 109
    .line 110
    .line 111
    const v23, -0x4099999a    # -0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v24, -0x40000000    # -2.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v26, 0x40000000    # 2.0f

    .line 124
    .line 125
    const v21, -0x40733333    # -1.1f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, -0x40000000    # -2.0f

    .line 131
    .line 132
    const v24, 0x3f666666    # 0.9f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40e00000    # 7.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x40c00000    # 6.0f

    .line 144
    .line 145
    const/high16 v26, 0x41a00000    # 20.0f

    .line 146
    .line 147
    const/high16 v21, 0x40800000    # 4.0f

    .line 148
    .line 149
    const v22, 0x4198cccd    # 19.1f

    .line 150
    .line 151
    .line 152
    const v23, 0x409ccccd    # 4.9f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x41a00000    # 20.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41800000    # 16.0f

    .line 216
    .line 217
    const/high16 v6, 0x41700000    # 15.0f

    .line 218
    .line 219
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v4, 0x40400000    # 3.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, 0x40000000    # 2.0f

    .line 228
    .line 229
    const/high16 v26, 0x40000000    # 2.0f

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const v22, 0x3f8ccccd    # 1.1f

    .line 234
    .line 235
    .line 236
    const v23, 0x3f666666    # 0.9f

    .line 237
    .line 238
    .line 239
    const/high16 v24, 0x40000000    # 2.0f

    .line 240
    .line 241
    move-object/from16 v20, v2

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/4 v4, 0x0

    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v26, -0x40000000    # -2.0f

    .line 251
    .line 252
    const v21, 0x3f8ccccd    # 1.1f

    .line 253
    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    const/high16 v23, 0x40000000    # 2.0f

    .line 258
    .line 259
    const v24, -0x4099999a    # -0.9f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, -0x40000000    # -2.0f

    .line 271
    .line 272
    const/16 v21, 0x0

    .line 273
    .line 274
    const v22, -0x40733333    # -1.1f

    .line 275
    .line 276
    .line 277
    const v23, -0x4099999a    # -0.9f

    .line 278
    .line 279
    .line 280
    const/high16 v24, -0x40000000    # -2.0f

    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/4 v4, 0x0

    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x41800000    # 16.0f

    .line 290
    .line 291
    const/high16 v26, 0x41700000    # 15.0f

    .line 292
    .line 293
    const v21, 0x41873333    # 16.9f

    .line 294
    .line 295
    .line 296
    const/high16 v22, 0x41500000    # 13.0f

    .line 297
    .line 298
    const/high16 v23, 0x41800000    # 16.0f

    .line 299
    .line 300
    const v24, 0x415e6666    # 13.9f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/high16 v6, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v7, 0x0

    .line 316
    const-string v4, ""

    .line 317
    .line 318
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 319
    .line 320
    .line 321
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 326
    .line 327
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 328
    .line 329
    .line 330
    move-result-wide v6

    .line 331
    const/4 v0, 0x0

    .line 332
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 340
    .line 341
    .line 342
    move-result v11

    .line 343
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41400000    # 12.0f

    .line 349
    .line 350
    const/high16 v2, 0x41a00000    # 20.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x40000000    # 2.0f

    .line 359
    .line 360
    const/high16 v18, -0x40000000    # -2.0f

    .line 361
    .line 362
    const v13, 0x3f8ccccd    # 1.1f

    .line 363
    .line 364
    .line 365
    const/high16 v15, 0x40000000    # 2.0f

    .line 366
    .line 367
    const v16, -0x4099999a    # -0.9f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40c00000    # 6.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x40000000    # -2.0f

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const v14, -0x40733333    # -1.1f

    .line 382
    .line 383
    .line 384
    const v15, -0x4099999a    # -0.9f

    .line 385
    .line 386
    .line 387
    const/high16 v16, -0x40000000    # -2.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v18, 0x40000000    # 2.0f

    .line 397
    .line 398
    const v13, -0x40733333    # -1.1f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, -0x40000000    # -2.0f

    .line 403
    .line 404
    const v16, 0x3f666666    # 0.9f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41400000    # 12.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x41400000    # 12.0f

    .line 416
    .line 417
    const/high16 v18, 0x41a00000    # 20.0f

    .line 418
    .line 419
    const/high16 v13, 0x41200000    # 10.0f

    .line 420
    .line 421
    const v14, 0x4198cccd    # 19.1f

    .line 422
    .line 423
    .line 424
    const v15, 0x412e6666    # 10.9f

    .line 425
    .line 426
    .line 427
    const/high16 v16, 0x41a00000    # 20.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const/16 v16, 0x3800

    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    const/high16 v6, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const/high16 v12, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sput-object v0, Landroidx/compose/material/icons/rounded/BarChartKt;->_barChart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-object v0
.end method
